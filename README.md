# Iconoir Compose

[Iconoir](https://iconoir.com/) icons for Jetpack Compose and Compose Multiplatform. **1,383 regular + 288 solid icons** as individually accessible, lazily cached `ImageVector`s. The catalog comes from Iconoir [v7.12.1](https://github.com/iconoir-icons/iconoir/releases/tag/v7.12.1), commit `d7dfa4d0341df0670bfed9fc24221c9d7ef2112e`.

## Use

Once `0.1.0` is released to Maven Central, add to an Android Gradle project:

```kotlin
dependencies {
    implementation("io.github.alvarordev:iconoir-compose:0.1.0")
}
```

Or inside a Kotlin Multiplatform project's `kotlin { sourceSets { commonMain.dependencies { ... } } }`:

```kotlin
commonMain.dependencies {
    implementation("io.github.alvarordev:iconoir-compose:0.1.0")
}
```

During development, run `./gradlew :iconoir-compose:publishToMavenLocal` here, add `mavenLocal()` to your consumer's repositories, and use version `0.1.0-SNAPSHOT` instead. The included [`samples/android-consumer`](samples/android-consumer) resolves this artifact independently using Otaro's Kotlin, AGP, minSdk and Compose BOM baseline.
[`samples/kmp-consumer`](samples/kmp-consumer) independently consumes the common artifact from Android, iOS and JVM Desktop.

```kotlin
import io.github.alvarordev.iconoir.compose.Iconoir
import io.github.alvarordev.iconoir.compose.regular.Bell
import io.github.alvarordev.iconoir.compose.solid.Heart

Icon(
    imageVector = Iconoir.Regular.Bell,
    contentDescription = "Notifications", // null for a decorative icon
    modifier = Modifier.size(24.dp),
    tint = MaterialTheme.colorScheme.onSurface,
)
Icon(imageVector = Iconoir.Solid.Heart, contentDescription = null)
```

Use IDE completion after `Iconoir.Regular.` / `Iconoir.Solid.`; import the extension property from the corresponding `regular` or `solid` package. Not every icon has a solid variant. `upstream/catalog.json` maps public names to SVG filenames. There is no auto-mirroring for RTL; select the appropriate direction explicitly. The library does not depend on Material; apps may use any Compose vector renderer. Default vector size is 24 dp and tint is controlled by the consumer's `Icon`/`Image` API.

## Build and update

Requirements: JDK 17, Android SDK 37 (the sample uses 37.2); macOS + Xcode for iOS binaries. Library uses Kotlin 2.3.20, Compose Multiplatform 1.10.3, Android Gradle Plugin 9.4.0, Gradle 9.6.0, minSdk 24. Compose Multiplatform 1.10.3 uses Android Compose UI 1.10.5; Otaro's Android BOM 2026.03.01 resolves 1.10.6, keeping its UI and Foundation on the same release line. The separate consumer build verifies this combination.

```sh
./gradlew :iconoir-compose:assemble :iconoir-compose:desktopTest :iconoir-compose:testAndroidHostTest :iconoir-compose:publishToMavenLocal
./gradlew -p samples/android-consumer :app:assembleRelease
./gradlew -p samples/android-baseline :app:assembleRelease
python3 tools/check_size.py
./gradlew -p samples/kmp-consumer compileCommonMainKotlinMetadata compileAndroidMain compileKotlinDesktop compileKotlinIosArm64 compileKotlinIosSimulatorArm64
```

To regenerate icons (no asset download happens during consumer builds):

```sh
git clone --depth 1 --branch v7.12.1 --filter=blob:none --sparse https://github.com/iconoir-icons/iconoir.git ../iconoir-upstream
git -C ../iconoir-upstream sparse-checkout set icons
python3 -m venv .venv
.venv/bin/pip install -r tools/requirements.txt
.venv/bin/python -m unittest discover -s tools -p 'test_*.py'
.venv/bin/python tools/generate.py --source ../iconoir-upstream --check
# To create/update sources, omit --check; review generated diffs before releasing.
```

The generator verifies the exact Git commit, validates SVG attributes and geometry, emits path nodes before runtime, segments dashed strokes during generation, and fails on unknown SVG constructs or public naming collisions. Special handling: the white rectangle in upstream regular `snapchat` is treated as a transparent icon background; white dots in solid `dots-grid-3x3` become transparent holes so Compose tint is effective. If upstream changes either asset's structure, review this conversion before updating.

Each icon has its own lazy holder. An R8-minified consumer removes unreferenced icon holders; an unminified app will include the whole Android artifact. `tools/check_size.py` checks the mapping and compares two minified sample APKs. Locally the two-icon APK was 1,202,540 bytes versus 1,186,156 bytes for the no-icon baseline (16,384 bytes difference, unsigned release APKs); measurements vary by environment and app. The size check rejects a regression over 100,000 bytes in this sample. Check actual app sizes before promising a particular per-app overhead.

The sample also contains a **debug-only** `GalleryActivity` showing six representative regular and solid icons: bell, heart, transformed network rectangles, dashed border, transparent dot cutouts, and clipped git. It was visually checked on a physical Pixel 10 Pro. From a connected device, run `./gradlew -p samples/android-consumer :app:assembleDebug`, then `android run --apks=samples/android-consumer/app/build/outputs/apk/debug/app-debug.apk --activity=io.github.alvarordev.iconoir.sample.GalleryActivity`. The gallery is omitted from the release size comparison.

## Publishing

The Gradle build configures Maven Central's Portal through the Vanniktech publishing plugin. First verify ownership of `io.github.alvarordev` at [Central Portal](https://central.sonatype.com/) and create a GPG key whose public key is available to Central. Set `ORG_GRADLE_PROJECT_mavenCentralUsername`, `ORG_GRADLE_PROJECT_mavenCentralPassword`, `ORG_GRADLE_PROJECT_signingInMemoryKey`, and `ORG_GRADLE_PROJECT_signingInMemoryKeyPassword` outside version control. With a release tag matching the version:

```sh
./gradlew :iconoir-compose:publishAndReleaseToMavenCentral -PreleaseVersion=0.1.0
```

Publish all targets from a macOS host so iOS artifacts are built and signed there; inspect the Central deployment for module metadata, `.aar`, desktop jar, iOS klibs, sources and POM before announcing a release. A tagged release should update both the version and Iconoir provenance in release notes. Remote publication is not required for local builds.

## Attribution

Library code is MIT licensed: [LICENSE](LICENSE). Icons originate from [Iconoir](https://github.com/iconoir-icons/iconoir), © 2021 Luca Burgio, under its [MIT license](upstream/LICENSE). Its license notice accompanies this distribution.
