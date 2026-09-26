"""Verify a two-icon R8 consumer keeps no other icons and report release APK overhead."""

from pathlib import Path

root = Path(__file__).resolve().parents[1] / "samples"
consumer = root / "android-consumer/app/build/outputs"
baseline = root / "android-baseline/app/build/outputs"
size = (consumer / "apk/release/app-release-unsigned.apk").stat().st_size
base = (baseline / "apk/release/app-release-unsigned.apk").stat().st_size
mapping = (consumer / "mapping/release/mapping.txt").read_text()
classes = [line.split(" -> ")[0] for line in mapping.splitlines()
           if line.startswith(("io.github.alvarordev.iconoir.compose.regular.",
                               "io.github.alvarordev.iconoir.compose.solid."))]
expected = {"io.github.alvarordev.iconoir.compose.regular.BellKt",
            "io.github.alvarordev.iconoir.compose.regular.bellVector",
            "io.github.alvarordev.iconoir.compose.solid.HeartKt",
            "io.github.alvarordev.iconoir.compose.solid.heartVector"}
if set(classes) != expected:
    raise SystemExit(f"unexpected R8 icon symbols: {classes}")
if size - base > 100_000:
    raise SystemExit(f"two-icon APK exceeds 100 KiB overhead: {size - base} bytes")
print(f"R8 retained only Bell/Heart; consumer {size:,} B, baseline {base:,} B, delta {size-base:,} B")
