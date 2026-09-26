#!/usr/bin/env python3
"""Generate independently reachable Compose ImageVectors from a pinned Iconoir checkout."""

import argparse
import json
import re
import subprocess
import sys
import xml.etree.ElementTree as ET
from pathlib import Path

TAG = "v7.12.1"
COMMIT = "d7dfa4d0341df0670bfed9fc24221c9d7ef2112e"
BASE = Path(__file__).resolve().parents[1]
OUTPUT = BASE / "iconoir-compose/src/commonMain/kotlin/io/github/alvarordev/iconoir/compose"
NUMBER = r"[+-]?(?:\d*\.\d+|\d+\.?\d*)(?:[eE][+-]?\d+)?"
TOKENS = re.compile(rf"[AaCcHhLlMmQqSsTtVvZz]|{NUMBER}")
NUMBERS = re.compile(NUMBER)
ARITY = dict(M=2, L=2, H=1, V=1, C=6, S=4, Q=4, T=2, A=7)
NODES = dict(M="MoveTo", L="LineTo", H="HorizontalTo", V="VerticalTo",
             C="CurveTo", S="ReflectiveCurveTo", Q="QuadTo", T="ReflectiveQuadTo",
             A="ArcTo")
RELATIVE = dict(M="RelativeMoveTo", L="RelativeLineTo", H="RelativeHorizontalTo",
                V="RelativeVerticalTo", C="RelativeCurveTo", S="RelativeReflectiveCurveTo",
                Q="RelativeQuadTo", T="RelativeReflectiveQuadTo", A="RelativeArcTo")
KOTLIN_KEYWORDS = {"as", "break", "class", "continue", "do", "else", "false", "for", "fun",
                   "if", "in", "interface", "is", "null", "object", "package", "return", "super",
                   "this", "throw", "true", "try", "typealias", "typeof", "val", "var", "when", "while"}
ALLOWED = {
    "svg": {"width", "height", "viewBox", "fill", "stroke", "stroke-width", "xmlns"},
    "path": {"d", "fill", "stroke", "stroke-width", "stroke-linecap", "stroke-linejoin",
             "stroke-miterlimit", "fill-rule", "clip-rule", "stroke-dasharray"},
    "rect": {"x", "y", "width", "height", "rx", "fill", "stroke", "stroke-width", "transform"},
    "circle": {"cx", "cy", "r", "fill", "stroke", "stroke-width"},
    "g": {"clip-path"}, "defs": set(), "clipPath": {"id"},
}


def fail(message):
    raise ValueError(message)


def f(value):
    result = float(value)
    if not (-1e15 < result < 1e15):
        fail(f"non-finite/out-of-range number: {value}")
    return f"{result:.9g}f"


def numbers(text):
    parts = NUMBERS.findall(text)
    if re.sub(r"[\s,]+", "", NUMBERS.sub("", text)):
        fail(f"invalid numeric list: {text}")
    return [float(n) for n in parts]


def path_nodes(data):
    tokens = TOKENS.findall(data)
    if re.sub(r"[\s,]+", "", TOKENS.sub("", data)):
        fail(f"unrecognized path syntax: {data}")
    nodes = []
    pos = 0
    command = None
    while pos < len(tokens):
        if tokens[pos].isalpha():
            command = tokens[pos]
            pos += 1
            if command.upper() == "Z":
                nodes.append("PathNode.Close")
                command = None
                continue
        if command is None:
            fail("path has numbers without a command")
        kind = command.upper()
        count = ARITY[kind]
        if pos + count > len(tokens) or any(t.isalpha() for t in tokens[pos:pos + count]):
            fail(f"incomplete path command {command}")
        args = tokens[pos:pos + count]
        pos += count
        if kind == "A":
            if args[3] not in ("0", "1") or args[4] not in ("0", "1"):
                fail("arc flags must be 0 or 1")
            params = [f(v) for v in args[:3]] + [str(v == "1").lower() for v in args[3:5]] + [f(v) for v in args[5:]]
        else:
            params = [f(v) for v in args]
        name = (NODES if command.isupper() else RELATIVE)[kind]
        nodes.append(f"PathNode.{name}({', '.join(params)})")
        if kind == "M":
            command = "L" if command.isupper() else "l"
    if not nodes or not nodes[0].startswith(("PathNode.MoveTo", "PathNode.RelativeMoveTo")):
        fail("path must start with moveto")
    return nodes


def rect_path(attrs):
    x, y = float(attrs.get("x", 0)), float(attrs.get("y", 0))
    w, h, r = float(attrs["width"]), float(attrs["height"]), float(attrs.get("rx", 0))
    if w <= 0 or h <= 0 or r < 0:
        fail("invalid rectangle bounds")
    r = min(r, w / 2, h / 2)
    if r == 0:
        return f"M{x} {y}H{x+w}V{y+h}H{x}Z"
    return (f"M{x+r} {y}H{x+w-r}A{r} {r} 0 0 1 {x+w} {y+r}"
            f"V{y+h-r}A{r} {r} 0 0 1 {x+w-r} {y+h}H{x+r}"
            f"A{r} {r} 0 0 1 {x} {y+h-r}V{y+r}A{r} {r} 0 0 1 {x+r} {y}Z")


def circle_path(attrs):
    cx, cy, r = (float(attrs[key]) for key in ("cx", "cy", "r"))
    if r <= 0:
        fail("invalid circle radius")
    return f"M{cx+r} {cy}A{r} {r} 0 1 0 {cx-r} {cy}A{r} {r} 0 1 0 {cx+r} {cy}Z"


def dashed_nodes(data, dash):
    # ImageVector has no dash path effect. Segment the stroke at generation time by arc length.
    from svgpathtools import CubicBezier, Line, QuadraticBezier, parse_path

    pattern = numbers(dash)
    if not pattern or any(n <= 0 for n in pattern):
        fail("invalid dash pattern")
    if len(pattern) % 2:
        pattern *= 2
    result = []
    for subpath in parse_path(data).continuous_subpaths():
        index, remaining = 0, pattern[0]
        for segment in subpath:
            length = segment.length(error=1e-9)
            position = 0.0
            while position < length - 1e-9:
                step = min(remaining, length - position)
                if index % 2 == 0 and step > 1e-9:
                    piece = segment.cropped(segment.ilength(position), segment.ilength(position + step))
                    result.append(f"PathNode.MoveTo({f(piece.start.real)}, {f(piece.start.imag)})")
                    if isinstance(piece, Line):
                        result.append(f"PathNode.LineTo({f(piece.end.real)}, {f(piece.end.imag)})")
                    elif isinstance(piece, CubicBezier):
                        result.append("PathNode.CurveTo(" + ", ".join(f(v) for v in
                                      (piece.control1.real, piece.control1.imag, piece.control2.real,
                                       piece.control2.imag, piece.end.real, piece.end.imag)) + ")")
                    elif isinstance(piece, QuadraticBezier):
                        result.append("PathNode.QuadTo(" + ", ".join(f(v) for v in
                                      (piece.control.real, piece.control.imag, piece.end.real, piece.end.imag)) + ")")
                    else:
                        fail(f"unsupported dashed segment {type(piece).__name__}")
                position += step
                remaining -= step
                if remaining < 1e-9:
                    index = (index + 1) % len(pattern)
                    remaining = pattern[index]
    return result


def name_of(stem):
    parts = re.split(r"[^a-zA-Z0-9]+", stem)
    result = "".join(part[0].upper() + part[1:] for part in parts if part)
    if not result:
        fail(f"invalid icon name: {stem}")
    if result[0].isdigit() or result.lower() in KOTLIN_KEYWORDS:
        result = "Icon" + result
    return result


def validate(element):
    tag = element.tag.split("}")[-1]
    if tag not in ALLOWED:
        fail(f"unsupported SVG element {tag}")
    unknown = set(element.attrib) - ALLOWED[tag]
    if unknown:
        fail(f"unsupported {tag} attributes {sorted(unknown)}")
    return tag


def paint(color):
    if color == "none":
        return "null"
    if color in ("currentColor", "black"):
        return "SolidColor(Color.Black)"
    fail(f"unsupported SVG paint {color}")


def emit_path(element, inherited, level):
    attrs = inherited | element.attrib
    tag = validate(element)
    data = element.get("d") if tag == "path" else rect_path(attrs) if tag == "rect" else circle_path(attrs)
    nodes = dashed_nodes(data, attrs["stroke-dasharray"]) if "stroke-dasharray" in attrs else path_nodes(data)
    stroke = paint(attrs.get("stroke", "none"))
    fill = paint(attrs.get("fill", "black"))
    rule = attrs.get("fill-rule", "nonzero")
    if rule not in ("nonzero", "evenodd") or attrs.get("clip-rule", rule) != rule:
        fail("unsupported fill/clip rule")
    cap = attrs.get("stroke-linecap", "butt").title()
    join = attrs.get("stroke-linejoin", "miter").title()
    if cap not in ("Butt", "Round", "Square") or join not in ("Miter", "Round", "Bevel"):
        fail("unsupported stroke cap/join")
    pad = " " * level
    lines = [pad + "addPath(", pad + "    pathData = listOf("]
    lines.extend(pad + "        " + node + "," for node in nodes)
    lines += [pad + "    ),", pad + f"    pathFillType = PathFillType.{'EvenOdd' if rule == 'evenodd' else 'NonZero'},",
              pad + f"    fill = {fill},", pad + f"    stroke = {stroke},",
              pad + f"    strokeLineWidth = {f(attrs.get('stroke-width', 1))},",
              pad + f"    strokeLineCap = StrokeCap.{cap},", pad + f"    strokeLineJoin = StrokeJoin.{join},",
              pad + f"    strokeLineMiter = {f(attrs.get('stroke-miterlimit', 4))},", pad + ")"]
    transform = element.get("transform")
    if transform:
        if transform.startswith("rotate("):
            values = numbers(transform[7:-1])
            if len(values) != 3:
                fail("unsupported rotation")
            params = f"rotate = {f(values[0])}, pivotX = {f(values[1])}, pivotY = {f(values[2])}"
        elif transform.startswith("matrix("):
            values = numbers(transform[7:-1])
            if len(values) != 6:
                fail("unsupported transform matrix")
            a, b, c, d, tx, ty = values
            if (a, b, c, d) == (1, 0, 0, -1):
                params = f"scaleY = -1f, translationX = {f(tx)}, translationY = {f(ty)}"
            elif (a, b, c, d) == (0, -1, -1, 0):
                params = f"rotate = -90f, scaleY = -1f, translationX = {f(tx)}, translationY = {f(ty)}"
            else:
                fail(f"unsupported transform matrix {values}")
        else:
            fail(f"unsupported transform {transform}")
        lines = [pad + f"addGroup({params})"] + ["    " + line for line in lines] + [pad + "clearGroup()"]
    return lines


def render_svg(file, style, name):
    root = ET.parse(file).getroot()
    if validate(root) != "svg" or root.get("viewBox") != "0 0 24 24":
        fail("SVG must have 24x24 viewBox")
    if root.get("width") != "24" or root.get("height") != "24":
        fail("SVG must have 24x24 dimensions")
    children = list(root)
    drawing = [c for c in children if validate(c) != "defs"]
    defs = [c for c in children if validate(c) == "defs"]
    clips = {}
    for definition in defs:
        for clip in definition:
            if validate(clip) != "clipPath" or len(clip) != 1:
                fail("unsupported clip definition")
            item = clip[0]
            if validate(item) != "rect" or rect_path(item.attrib) != rect_path({"width": "24", "height": "24"}):
                fail("clip must be full 24x24 viewport")
            clips[clip.get("id")] = True
    lines = []
    inherited = {k: v for k, v in root.attrib.items() if k in ("fill", "stroke", "stroke-width")}
    for item in drawing:
        if validate(item) == "g":
            ref = item.get("clip-path", "")
            if not ref.startswith("url(#") or not ref.endswith(")") or ref[5:-1] not in clips:
                fail(f"unknown clip reference {ref}")
            for child in item:
                if validate(child) not in ("path", "rect", "circle"):
                    fail("unsupported drawing group")
                lines.extend(emit_path(child, inherited, 8))
        else:
            if validate(item) not in ("path", "rect", "circle"):
                fail("unsupported drawing element")
            if item.get("fill") == "white" and style == "regular" and file.stem == "snapchat":
                # White background is the SVG's opaque canvas; omit it so regular artwork is transparent.
                continue
            if item.get("fill") == "white" and style == "solid" and file.stem == "dots-grid-3x3":
                continue
            lines.extend(emit_path(item, inherited, 8))
    if style == "solid" and file.stem == "dots-grid-3x3":
        # SVG white painted dots are holes in the colored square. Cut them out so Icon tint works.
        base = drawing[0]
        if len(drawing) != 10 or any(c.get("fill") != "white" for c in drawing[1:]):
            fail("dots-grid knockout source changed")
        combined = base.attrib["d"] + " " + " ".join(circle_path({"cx": x, "cy": y, "r": 1.25})
                                                   for y in (5.5, 12, 18.5) for x in (5.5, 12, 18.5))
        virtual = ET.Element("path", {"d": combined, "fill": "currentColor", "fill-rule": "evenodd"})
        lines = emit_path(virtual, inherited, 8)
    if not lines:
        fail("icon contains no drawable geometry")
    package = f"io.github.alvarordev.iconoir.compose.{style}"
    return (f"// Generated from Iconoir {TAG} ({COMMIT}), icons/{style}/{file.name}. Do not edit.\n"
            f"package {package}\n\n"
            "import androidx.compose.ui.graphics.Color\n"
            "import androidx.compose.ui.graphics.PathFillType\n"
            "import androidx.compose.ui.graphics.SolidColor\n"
            "import androidx.compose.ui.graphics.StrokeCap\n"
            "import androidx.compose.ui.graphics.StrokeJoin\n"
            "import androidx.compose.ui.graphics.vector.ImageVector\n"
            "import androidx.compose.ui.graphics.vector.PathNode\n"
            "import androidx.compose.ui.unit.dp\n"
            "import io.github.alvarordev.iconoir.compose.Iconoir\n\n"
            f"public val Iconoir.{style.title()}.{name}: ImageVector\n"
            f"    get() = {name.lower()}Vector.value\n\n"
            f"private object {name.lower()}Vector {{\n"
            "    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {\n"
            f"        ImageVector.Builder(name = \"{style}/{file.stem}\", defaultWidth = 24.dp, "
            "defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {\n"
            + "\n".join(lines) + "\n"
            "        }.build()\n"
            "    }\n"
            "}\n")


def generate(source):
    expected = {}
    manifest = {"upstream": "https://github.com/iconoir-icons/iconoir", "tag": TAG, "commit": COMMIT,
                "icons": {}}
    for style in ("regular", "solid"):
        names = {}
        files = sorted((source / "icons" / style).glob("*.svg"))
        if not files:
            fail(f"no {style} SVG files at {source}")
        for file in files:
            name = name_of(file.stem)
            if name in names:
                fail(f"{style} naming collision: {names[name]} and {file.name}")
            names[name] = file.name
            try:
                expected[OUTPUT / style / f"{name}.kt"] = render_svg(file, style, name)
            except (ValueError, KeyError) as error:
                fail(f"{style}/{file.name}: {error}")
        manifest["icons"][style] = {k: names[k] for k in sorted(names)}
    expected[BASE / "upstream/catalog.json"] = json.dumps(manifest, indent=2, ensure_ascii=False) + "\n"
    return expected


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--source", type=Path, required=True, help="checked-out Iconoir repository")
    parser.add_argument("--check", action="store_true", help="fail if generated output differs")
    args = parser.parse_args()
    revision = subprocess.check_output(["git", "-C", str(args.source), "rev-parse", "HEAD"], text=True).strip()
    if revision != COMMIT:
        fail(f"expected Iconoir {TAG} at {COMMIT}, got {revision}")
    expected = generate(args.source)
    existing = set(OUTPUT.glob("*/*.kt")) | set((BASE / "upstream").glob("catalog.json"))
    differences = [str(path) for path, text in expected.items() if not path.exists() or path.read_text() != text]
    obsolete = existing - expected.keys()
    if args.check:
        if differences or obsolete:
            fail(f"generated files differ: {differences[:10]}; obsolete: {sorted(obsolete)[:10]}")
    else:
        for path in obsolete:
            path.unlink()
        for path, text in expected.items():
            path.parent.mkdir(parents=True, exist_ok=True)
            path.write_text(text)
    print(f"Validated {len(expected)-1} icons (regular and solid) against {TAG} / {COMMIT}")


if __name__ == "__main__":
    try:
        main()
    except ValueError as exc:
        sys.exit(str(exc))
