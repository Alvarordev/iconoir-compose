# Tasks 001 — Iconoir Compose

- [x] Approve spec and record plan / implementation backlog.
- [x] Configure standalone Kotlin Multiplatform library, wrapper, Maven publication and documentation.
- [x] Implement fail-closed, deterministic upstream SVG generator with pinned revision and regression tests.
- [x] Generate the entire v7.12.1 regular + solid catalog and record counts, names, attribution.
- [x] Add CI, Android/KMP consumer checks and release instructions.
- [x] Run generator tests, Android/JVM build, Maven Local, independent Otaro-compatible Android and KMP consumer compilation; iOS targets compile cross-host on Linux.
- [x] Run macOS CI (including iOS target compilation and consumption) after the first push: [Verify run 36288113805](https://github.com/Alvarordev/iconoir-compose/actions/runs/36288113805).
- [x] Visually inspect six representative icons on a physical Pixel 10 Pro: regular/solid, dashed strokes, transformed rectangles, clips and white cutouts.
- [ ] Automate pixel-level reference comparisons in CI for representative icons.
- [x] Prepare tagged macOS release workflow and document the four repository secrets required for Central.
- [ ] Confirm Central namespace, signing key and Portal token; publish first release only after credentials are set.
