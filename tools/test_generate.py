import tempfile
import unittest
import xml.etree.ElementTree as ET
from pathlib import Path

from generate import name_of, path_nodes, render_svg, numbers


class GeneratorTest(unittest.TestCase):
    def test_path_commands_and_implicit_lines(self):
        self.assertEqual(
            path_nodes("M1 2 3 4l5-6A2 2 0 0 1 9 10z"),
            ["PathNode.MoveTo(1f, 2f)", "PathNode.LineTo(3f, 4f)",
             "PathNode.RelativeLineTo(5f, -6f)",
             "PathNode.ArcTo(2f, 2f, 0f, false, true, 9f, 10f)", "PathNode.Close"],
        )

    def test_invalid_path_fails_closed(self):
        for path in ("M0", "M0 0Z1 1", "M0 0X2 2", "M0 0A1 1 0 2 0 1 1"):
            with self.subTest(path=path), self.assertRaises(ValueError):
                path_nodes(path)

    def test_filename_identifiers(self):
        self.assertEqual(name_of("cell-2x2"), "Cell2x2")
        self.assertEqual(name_of("3d-square"), "Icon3dSquare")
        self.assertEqual(name_of("bell-notification"), "BellNotification")

    def test_invalid_numeric_list_fails(self):
        with self.assertRaises(ValueError):
            numbers("1 2 dubious")

    def test_unknown_svg_geometry_fails_with_context(self):
        with tempfile.TemporaryDirectory() as tmp:
            file = Path(tmp) / "unsupported.svg"
            file.write_text('<svg width="24" height="24" viewBox="0 0 24 24"><polygon points="1,1 2,2"/></svg>')
            with self.assertRaisesRegex(ValueError, "polygon"):
                render_svg(file, "regular", "Unsupported")

    def test_knockouts_remain_transparent_for_tint(self):
        with tempfile.TemporaryDirectory() as tmp:
            file = Path(tmp) / "dots-grid-3x3.svg"
            base = ET.Element("svg", {"width": "24", "height": "24", "viewBox": "0 0 24 24", "fill": "none"})
            ET.SubElement(base, "path", {"d": "M2 2H22V22H2Z", "fill": "currentColor"})
            for _ in range(9):
                ET.SubElement(base, "path", {"d": "M5 6Z", "fill": "white"})
            ET.ElementTree(base).write(file)
            output = render_svg(file, "solid", "DotsGrid3x3")
            self.assertIn("PathFillType.EvenOdd", output)
            self.assertNotIn("Color.White", output)


if __name__ == "__main__":
    unittest.main()
