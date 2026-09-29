# Maintaining Iconoir Compose

[README](../README.md) · [Release workflow](../.github/workflows/release.yml)

This document is for contributors updating the catalog, running checks, or publishing a new version. Installation and API examples for consumers live in the [README](../README.md) and [Spanish quick guide](guia-rapida.md).

## Toolchain and targets

- JDK 17, Gradle 9.6.0 (via `./gradlew`), Kotlin 2.3.20, Android Gradle Plugin 9.4.0, Compose Multiplatform 1.10.3.
- Android library: minSdk 24, compileSdk 37. Sample Android consumer: compileSdk 37.2, Compose BOM 2026.03.01.
- iOS device (`iosArm64`) and Apple Silicon simulator (`iosSimulatorArm64`): use macOS with Xcode for release builds.
- JVM Desktop: JDK 17. Python 3.12 and `tools/requirements.txt` are only needed to regenerate icons, not to consume the published library.

## Running checks

```sh
./gradlew :iconoir-compose:assemble :iconoir-compose:desktopTest :iconoir-compose:testAndroidHostTest :iconoir-compose:publishToMavenLocal
./gradlew -p samples/android-consumer :app:assembleRelease
./gradlew -p samples/android-baseline :app:assembleRelease
python3 tools/check_size.py
./gradlew -p samples/kmp-consumer compileCommonMainKotlinMetadata compileAndroidMain compileKotlinDesktop compileKotlinIosArm64 compileKotlinIosSimulatorArm64
```

The Android and KMP consumer samples resolve `0.2.0-SNAPSHOT` from Maven Local. The Android size check compares a two-icon, R8-minified app with its no-icon baseline and confirms only those icons remain reachable; it does not predict size in every consumer. The debug-only [`GalleryActivity`](../samples/android-consumer/app/src/debug/java/io/github/alvarordev/iconoir/sample/GalleryActivity.kt) displays regular, solid, transformed, dashed, clipped, and cutout artwork for visual inspection.

[Verify CI](../.github/workflows/verify.yml) runs Linux checks and compiles the iOS library and independent iOS consumer on macOS.

## Regenerating the icon catalog

The checked-in sources come from the [Iconoir v7.12.1 release](https://github.com/iconoir-icons/iconoir/releases/tag/v7.12.1), commit `d7dfa4d0341df0670bfed9fc24221c9d7ef2112e`. Fetch exactly that revision to check the generated sources:

```sh
git clone --depth 1 --branch v7.12.1 --filter=blob:none --sparse https://github.com/iconoir-icons/iconoir.git ../iconoir-upstream
git -C ../iconoir-upstream sparse-checkout set icons
python3 -m venv .venv
.venv/bin/pip install -r tools/requirements.txt
.venv/bin/python -m unittest discover -s tools -p 'test_*.py'
.venv/bin/python tools/generate.py --source ../iconoir-upstream --check
```

Omit `--check` to regenerate. `tools/generate.py` verifies the upstream commit, fails on unsupported SVG constructs or public naming collisions, and updates [`upstream/catalog.json`](../upstream/catalog.json). Review the catalog diff for added, removed, or renamed public icon properties before releasing. When moving to a new upstream release, update the pinned tag and commit in the generator, provenance, and docs deliberately.

The generator emits individual icon files and segments dashed strokes at generation time because `ImageVector` has no dash path effect. Upstream regular `snapchat` has an opaque white canvas that is treated as transparent; solid `dots-grid-3x3` uses white dots that become transparent cutouts so consumer tint still works. Recheck those exceptions if the original SVGs change. No source retrieval or parsing occurs in consumer builds.

## Stroke-weight implementation

`ImageVector.withStrokeWeight(weight)` in `StrokeWeight.kt` copies a generated vector's group/path tree, preserving geometry, fills, transforms, clip paths, trim properties, and tint metadata. It scales only paths with a stroke by `weight / 1.5f`; this retains deliberate variations such as the 1.2195-wide paths in `Frame`. The default weight and fill-only vectors return the original cached instance. `rememberIconoirVector(icon, weight)` caches the adjusted instance per icon/weight within a composition, avoiding vector construction on recomposition. Avoid calling `withStrokeWeight` directly on every frame.

Use `StrokeWeightTest` for stroke, fill, transformed, dashed, and invalid-weight coverage. The Android sample and KMP common sample exercise the remembered API. Stroke-weight adjustment was introduced in `0.2.0`; `0.1.0` remains immutable and does not include this API.

## Publishing a new version

1. Ensure CI passes on the release commit. Update docs and provenance when changing the icon catalog; breaking icon removals or renames require an API compatibility decision.
2. In [Central Portal](https://central.sonatype.com/publishing/namespaces), ensure the `io.github.alvarordev` namespace is verified for the account owning the publishing token.
3. Ensure GitHub Actions has `MAVEN_CENTRAL_USERNAME`, `MAVEN_CENTRAL_PASSWORD` (Portal user token), `SIGNING_IN_MEMORY_KEY`, and `SIGNING_IN_MEMORY_KEY_PASSWORD`. Never commit these values.
4. Push a `vMAJOR.MINOR.PATCH` Git tag on the verified commit. [`release.yml`](../.github/workflows/release.yml) runs tests, builds all targets on macOS, signs them, and invokes `publishAndReleaseToMavenCentral` using the tag's version.
5. Check that Central serves the root Gradle module metadata, Android AAR, Desktop JAR, iOS klibs, sources, and POM before announcing the release. Propagation after Central accepts a deployment can take several minutes.

For a manual release **from macOS**, supply the corresponding `ORG_GRADLE_PROJECT_mavenCentralUsername`, `ORG_GRADLE_PROJECT_mavenCentralPassword`, `ORG_GRADLE_PROJECT_signingInMemoryKey`, and `ORG_GRADLE_PROJECT_signingInMemoryKeyPassword` environment variables outside the repository and run:

```sh
./gradlew :iconoir-compose:publishAndReleaseToMavenCentral -PreleaseVersion=0.3.0
```

The library's source code is [MIT licensed](../LICENSE); upstream artwork retains the [Iconoir MIT notice](../upstream/LICENSE).
