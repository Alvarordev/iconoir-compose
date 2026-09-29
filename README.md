# Iconoir Compose

[![Maven Central](https://img.shields.io/maven-central/v/io.github.alvarordev/iconoir-compose?label=Maven%20Central)](https://central.sonatype.com/artifact/io.github.alvarordev/iconoir-compose)
[![Verify](https://github.com/Alvarordev/iconoir-compose/actions/workflows/verify.yml/badge.svg)](https://github.com/Alvarordev/iconoir-compose/actions/workflows/verify.yml)
[![License: MIT](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

**Iconoir icons for Jetpack Compose and Compose Multiplatform.** Use 1,383 regular and 288 solid icons as standard Compose `ImageVector`s on Android, iOS, and JVM Desktop. Add one Gradle dependency; there are no SVG downloads or runtime parsing in your app.

[Quick start](#quick-start) · [Guía rápida en español](docs/guia-rapida.md) · [Browse Iconoir icons](https://iconoir.com/) · [Icon name catalog](upstream/catalog.json)

## Why Iconoir Compose?

- **Native Compose API:** Pass an icon to `Icon`, `Image`, or `rememberVectorPainter`; control its tint, size, and accessibility description with Compose.
- **Regular and solid styles:** Pick `Iconoir.Regular.Bell` or an available solid icon such as `Iconoir.Solid.Heart`.
- **Fast by default:** Vectors are generated ahead of time and cached individually on first access. No network, file I/O, or SVG parser is needed at runtime.
- **Shared artwork:** The same names and vector API work in Android and Compose Multiplatform source sets.

## Quick start

Version **`0.2.0`** is available on [Maven Central](https://central.sonatype.com/artifact/io.github.alvarordev/iconoir-compose/0.2.0). Ensure your project resolves dependencies from `google()` and `mavenCentral()`.

**Android app** — add to your module's `build.gradle.kts`:

```kotlin
dependencies {
    implementation("io.github.alvarordev:iconoir-compose:0.2.0")
}
```

**Kotlin Multiplatform app** — add to `commonMain`:

```kotlin
kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation("io.github.alvarordev:iconoir-compose:0.2.0")
        }
    }
}
```

Then import the icon you want and use it with your app's Compose UI:

```kotlin
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.alvarordev.iconoir.compose.Iconoir
import io.github.alvarordev.iconoir.compose.regular.Bell
import io.github.alvarordev.iconoir.compose.solid.Heart

@Composable
fun IconoirExample() {
    Row {
        Icon(
            imageVector = Iconoir.Regular.Bell,
            contentDescription = "Notifications",
            modifier = Modifier.size(24.dp),
            tint = MaterialTheme.colorScheme.onSurface,
        )
        Icon(
            imageVector = Iconoir.Solid.Heart,
            contentDescription = null, // Decorative icon
        )
    }
}
```

Icons are **extension properties**: importing `Iconoir` alone is not enough. Import the individual icon from `regular` or `solid` as shown above. Solid variants only exist where Iconoir provides them. Find a name at [iconoir.com](https://iconoir.com/) and check its corresponding Kotlin property in the [catalog](upstream/catalog.json).

Material is only used in the example: the library itself depends on Compose UI, not Material. See the [Spanish quick guide](docs/guia-rapida.md) for a Material-free example using `Image` and `rememberVectorPainter`, plus installation and troubleshooting.

## Adjustable stroke weight

Iconoir's regular artwork uses a default stroke weight of **1.5** on its 24-unit viewport. Use `rememberIconoirVector` to render it thinner or thicker without rebuilding it on every recomposition:

```kotlin
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import io.github.alvarordev.iconoir.compose.Iconoir
import io.github.alvarordev.iconoir.compose.rememberIconoirVector
import io.github.alvarordev.iconoir.compose.regular.Bell

@Composable
fun ThickBell() {
    Icon(
        imageVector = rememberIconoirVector(Iconoir.Regular.Bell, strokeWeight = 2f),
        contentDescription = "Notifications",
    )
}
```

For one-off use outside a composable, import `io.github.alvarordev.iconoir.compose.withStrokeWeight` and call `Iconoir.Regular.Bell.withStrokeWeight(2f)`. This creates a new vector; the default `1.5f` returns the original. Only actual strokes change: pure filled icons such as `Iconoir.Solid.Heart` are unaffected. Size remains independent (`Modifier.size(...)`).

## Platform support

| Target | Published variant |
| --- | --- |
| Android (minSdk 24) | Android library (AAR) |
| iOS | `iosArm64` and `iosSimulatorArm64` |
| JVM Desktop | JVM library (JDK 17) |

The `0.2.0` library is built with Kotlin 2.3.20 and Compose Multiplatform 1.10.3. Android consumers can use their existing Compose BOM; the [Android sample](samples/android-consumer) verifies consumption with BOM 2026.03.01, AGP 9.4.0, and minSdk 24. [KMP sample](samples/kmp-consumer) verifies usage from `commonMain` on all published platforms.

## Size and performance

Each icon is constructed once, on first access, and reused thereafter. There is no production registry that eagerly loads the full catalog. In Android **minified** release builds, R8 can remove unused icon definitions; debug or unminified builds may include the entire catalog. The [size check](tools/check_size.py) builds a two-icon sample and a baseline to guard against regressions—its APK difference is not a promise of identical results in every app.

Directional icons are not automatically mirrored for RTL layouts; choose the appropriate direction for your UI. Provide a localized `contentDescription` for meaningful icons and `null` for purely decorative ones.

## Development and attribution

Run local tests and publish a snapshot to Maven Local with:

```sh
./gradlew :iconoir-compose:desktopTest :iconoir-compose:testAndroidHostTest :iconoir-compose:publishToMavenLocal
```

Generated icons are checked into the repository. For upstream updates, generator commands, CI, and release instructions, see [Maintaining the library](docs/maintaining.md).

Icon artwork comes from [Iconoir](https://github.com/iconoir-icons/iconoir), pinned to [v7.12.1](https://github.com/iconoir-icons/iconoir/releases/tag/v7.12.1) (`d7dfa4d0341df0670bfed9fc24221c9d7ef2112e`). Library code is [MIT licensed](LICENSE); the original artwork's MIT notice is in [upstream/LICENSE](upstream/LICENSE).
