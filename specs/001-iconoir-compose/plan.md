# Plan 001 — Iconoir Compose

**Spec:** [spec.md](spec.md) · **Status:** In implementation

## Build and API

- Single `:iconoir-compose` KMP library; Android via `com.android.kotlin.multiplatform.library`, iOS arm64/simulator arm64 and JVM Desktop. Kotlin 2.3.20, AGP 9.4.0, Gradle 9.6, Compose Multiplatform 1.10.3 (Android UI 1.10.5, compatible with Otaro BOM 2026.03.01's 1.10.6); JDK 17 toolchain and Android minSdk 24. The independent Otaro-compatible consumer resolves the variant and verifies it on a physical device.
- `Iconoir.Regular` / `Iconoir.Solid` marker objects; generated extension properties, one per asset, in `regular` and `solid` packages. Per-icon `private val` lazy cache with Kotlin `LazyThreadSafetyMode.SYNCHRONIZED` on supported targets. No all-icons production index.
- `api(compose.ui)` for the exposed `ImageVector` type; `maven-publish` plus `signing` and POM metadata. Publish locally without signing; sign release publications with environment secrets. Maven Central release instructions and GitHub Actions checks on Linux and macOS.

## Generation

- Pin upstream Iconoir v7.12.1 at commit `d7dfa4d0341df0670bfed9fc24221c9d7ef2112e` (annotated tag `2fc09832d1e7f8a3a3b9f08b19174a399d4d4d85`). Generate and check in Kotlin sources; obtain upstream sources from the tag at regeneration time. Never fetch during consumer builds.
- Python stdlib generator parses SVG XML and SVG path tokens into Compose `PathNode`s. Emit explicit vector `addPath` calls with SVG paint, bounds, and clipped groups; normalize simple shapes and transforms. Fail closed on unsupported constructs. For dashed strokes, pre-segment with pinned `svgpathtools` dependency at generation time. Investigate white knockouts under tint; convert to actual transparent cutouts or document/verify exceptional treatment.
- Keep a manifest of file count, icon names and upstream provenance; generator `--check` compares regenerated sources to tracked output. An upstream update must review differences and public name changes.

## Verification

- Python unit tests for path tokenization, naming, unsupported constructs, style/viewport handling and determinism; complete-corpus generation is the integration test.
- Kotlin compilation for Android and JVM on Linux; iOS compilation on macOS CI. Cache identity unit test and Android shrinking comparison sample/measurement before claiming specific size benefit.
- `publishToMavenLocal`, then resolve the artifact from an Otaro-compatible Android consumer without changing Otaro's UI. Verify available host limitations explicitly.

## Release compatibility

- Publish no automatic release from PRs. Release tags require signing and Central credentials and namespace verification; missing secrets must never block local builds.
- Treat removed/renamed upstream icons as a breaking change. Preserve previously published public names within a major version or postpone removal until a major release. Do not mirror icons automatically for RTL; consumers choose appropriate arrows.
