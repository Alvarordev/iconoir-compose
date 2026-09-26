# Specification 001 — Iconoir Compose library

**Status:** Approved by user, 2026-09-26

**Repository:** `alvarordev/iconoir-compose`

**First consumer:** `/home/hazard/code/Otaro`

**Proposed coordinates:** `io.github.alvarordev:iconoir-compose:0.1.0`

## Purpose

Provide the Iconoir icon collection as a reusable, performant Compose library for Android and Kotlin Multiplatform projects. A consumer should add one versioned Gradle dependency and use individual regular or solid icons as Compose `ImageVector`s without downloading assets or parsing SVGs at runtime.

The [Iconoir Swift package](https://github.com/iconoir-icons/iconoir-swift) demonstrates the intended experience: a named, discoverable API generated from the [upstream Iconoir SVG collection](https://github.com/iconoir-icons/iconoir). The upstream SVGs, not the Swift-generated assets, are the authoritative artwork.

## Users and scope

- Android apps built with Jetpack Compose, starting with Otaro.
- Compose Multiplatform apps targeting iOS and JVM Desktop.
- Library maintainers updating the catalog when upstream Iconoir publishes a new release.

The initial release supports Android, iOS (device and simulator), and JVM Desktop. JavaScript/Wasm, Android Views/XML, UIKit/SwiftUI wrappers, and an Otaro-wide icon migration are outside this specification.

## Requirements

### Consumer API

1. Publish a Kotlin Multiplatform Gradle library under the proposed coordinates, with an Android variant consumable by a regular Android Gradle project as well as shared variants consumable by KMP projects.
2. Expose regular and solid icons by distinct, discoverable Kotlin names, for example `Iconoir.Regular.Bell` and `Iconoir.Solid.Bell`. An icon is exposed in a style only when that asset exists upstream; no placeholder or inferred solid variant is generated.
3. Each icon is an `ImageVector` usable with standard Compose `Icon` / `Image`, tint, size, accessibility description, and vector painter APIs. Rendering does not depend on Material components.
4. Define stable, deterministic naming for hyphens, punctuation, leading digits, Kotlin keywords, case collisions, and duplicate names across styles. Document any names that differ from the upstream SVG filename. Icon names are part of the public API; subsequent renames require a compatibility policy.
5. Ship usage documentation covering Gradle installation in Android and KMP projects, imports, regular/solid selection, tint, sizing, decorative versus meaningful content descriptions, and the supported Kotlin/Compose versions.

Example intended use (the exact package layout is finalized in the plan):

```kotlin
import io.github.alvarordev.iconoir.compose.Iconoir
import io.github.alvarordev.iconoir.compose.regular.Bell

Icon(
    imageVector = Iconoir.Regular.Bell,
    contentDescription = "Notifications",
)
```

### Catalog fidelity and updates

6. Generate from a pinned, immutable revision of the upstream Iconoir repository. Record the upstream tag and commit SHA in the repository and release notes; start with the v7.12.1 catalog subject to confirming its exact commit during implementation. A released library never fetches `main` to construct icons.
7. Include every supported regular and solid SVG in that revision. Preserve the 24 × 24 coordinate system where applicable, paths, fills, strokes, stroke widths, caps, joins, fill rules, opacity, and transforms so that the rendered artwork matches its source. Where SVG features cannot be represented faithfully, generation fails with an actionable asset name and reason rather than silently changing artwork.
8. Generation is deterministic: the same pinned inputs and generator revision yield identical generated sources and catalog counts. Upstream updates report added, removed, and renamed assets and identify API-breaking changes for review.
9. Retain upstream MIT license text, credit Iconoir in repository documentation and published metadata, and distinguish library code from upstream artwork where necessary.

### Runtime and size

10. Icon geometry is converted ahead of time. Consumer apps perform no runtime SVG parsing, network access, disk asset lookup, or eager initialization of the entire catalog.
11. Construct each vector on first access and reuse the cached result on subsequent accesses. Access is safe when called concurrently on supported targets; avoid recomputing vectors during recomposition.
12. Keep icon declarations independently reachable so that a shrinking Android release consumer using a small subset does not retain the whole catalog. Do not expose an eagerly populated all-icons registry in the production artifact. Measure the behavior rather than assuming it applies identically to iOS or Desktop linkers.
13. Keep runtime dependencies limited to the Compose APIs needed to expose and render vectors; no Material dependency is required by the library.

### Distribution and compatibility

14. Publish the Android, iOS, and JVM Desktop variants with Gradle module metadata, source artifacts, license, project URL, developer information, and signed Maven Central publications. The repository must also support publishing to Maven Local for pre-release consumer checks.
15. Target a Kotlin/Compose/Gradle combination compatible with Otaro's declared baseline: Kotlin 2.3.20, AGP 9.4.0, Gradle 9.6.0, Compose BOM 2026.03.01, JVM 17, and Android minSdk 24. Verify actual dependency resolution in Otaro; select and document the corresponding Compose Multiplatform version during planning.
16. A maintainer can reproduce catalog generation, run validation locally, and publish a new tagged version with documented credentials supplied externally (never committed to this repository).

## Acceptance criteria

- A standalone Android Compose consumer (including an Otaro-compatible dependency graph) compiles and renders a regular and an available solid icon from the published-to-local artifact.
- A KMP sample compiles icon usage for Android, JVM Desktop, and the configured iOS targets; iOS build checks run on macOS.
- Generated names are unique, catalog counts match the supported pinned upstream files, and rerunning generation leaves the working tree unchanged.
- Representative rendered output is checked against upstream SVGs, including curved strokes, line caps/joins, transforms, fill rules, and solid cutouts. Every unsupported SVG input produces an explicit generation failure.
- Repeated access returns the cached icon instance; concurrent access does not produce inconsistent results. A benchmark or reproducible measurement reports first-access and cached-access cost against an agreed baseline in the plan.
- A minified Android release consumer using a few icons is checked for unused-icon removal and measured for incremental download/APK size. An unminified consumer is not claimed to have the same size characteristics.
- Maven Local publication resolves with Gradle module metadata and sources; the release workflow documents the steps needed to verify the `io.github.alvarordev` namespace and publish to Maven Central.
- Documentation identifies the pinned Iconoir revision and includes MIT attribution.

## Dependencies and boundaries

- The library is a separate repository beside Otaro. No Otaro application behavior changes are part of this specification.
- Otaro is spec-driven (`Otaro/specs/constitution.md`): integrating the library into its product UI or replacing existing Material icons requires Otaro's own approved spec, plan, and tasks.
- Maven Central namespace ownership, signing credentials, and any remote GitHub repository creation require access to the owner's accounts; local development and Maven Local verification can proceed independently.

## Questions for the implementation plan

- Which Compose Multiplatform and Android Gradle plugin versions produce metadata compatible with Otaro's declared versions and the available iOS toolchain?
- What vector conversion strategy preserves all constructs in the pinned upstream SVG corpus, and which exceptions (if any) require documented handling?
- Which numeric thresholds and measurement environment will define acceptable cold-access, cached-access, and size overhead?
- Which API compatibility policy will apply when upstream removes or renames an icon?
