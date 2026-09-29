# Guía rápida de Iconoir Compose

[Inicio](../README.md) · [Catálogo de nombres](../upstream/catalog.json) · [Iconos originales](https://iconoir.com/)

Esta guía usa la versión **`0.1.0`**, publicada en [Maven Central](https://central.sonatype.com/artifact/io.github.alvarordev/iconoir-compose/0.1.0). Sirve para apps Android con Jetpack Compose y para código compartido de Compose Multiplatform.

## 1. Instala la dependencia

Verifica que en el `settings.gradle.kts` de tu proyecto existan los repositorios `google()` y `mavenCentral()` en `dependencyResolutionManagement`.

**App Android:** agrega esto al `build.gradle.kts` del módulo donde usarás los iconos:

```kotlin
dependencies {
    implementation("io.github.alvarordev:iconoir-compose:0.1.0")
}
```

**Proyecto Kotlin Multiplatform:** agrega la dependencia a `commonMain` para reutilizar los mismos iconos en Android, iOS y Desktop:

```kotlin
kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation("io.github.alvarordev:iconoir-compose:0.1.0")
        }
    }
}
```

## 2. Importa y muestra un icono

Cada icono es una propiedad de extensión sobre `Iconoir.Regular` o `Iconoir.Solid`. **Importa la propiedad del icono**, además de `Iconoir`:

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
fun EjemploIconos() {
    Row {
        Icon(
            imageVector = Iconoir.Regular.Bell,
            contentDescription = "Notificaciones",
            modifier = Modifier.size(24.dp),
            tint = MaterialTheme.colorScheme.onSurface,
        )
        Icon(
            imageVector = Iconoir.Solid.Heart,
            contentDescription = null, // Decorativo
        )
    }
}
```

En una app real, usa recursos de cadenas localizadas para la descripción de los iconos informativos. Para uno puramente decorativo, utiliza `contentDescription = null`.

La librería **no requiere Material**. Si tu app usa otra UI de Compose, utiliza directamente `ImageVector` con `rememberVectorPainter`:

```kotlin
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.alvarordev.iconoir.compose.Iconoir
import io.github.alvarordev.iconoir.compose.regular.Bell

@Composable
fun Campana() {
    Image(
        painter = rememberVectorPainter(Iconoir.Regular.Bell),
        contentDescription = "Notificaciones",
    )
}
```

## 3. Encuentra otros iconos

1. Busca el diseño en [iconoir.com](https://iconoir.com/).
2. Consulta su nombre Kotlin y el SVG de origen en [`upstream/catalog.json`](../upstream/catalog.json). Por ejemplo, `Bell` corresponde a `bell.svg` en `regular`.
3. Importa `io.github.alvarordev.iconoir.compose.regular.Nombre` o `io.github.alvarordev.iconoir.compose.solid.Nombre`. No todos los iconos regulares tienen versión sólida.

Todos los vectores tienen un tamaño predeterminado de **24 dp**; `Modifier.size(...)` cambia su tamaño y `tint` cambia su color. La librería no invierte automáticamente las flechas en interfaces RTL: elige la dirección correspondiente.

## Si algo no compila

| Síntoma | Qué revisar |
| --- | --- |
| `Unresolved reference: Bell` | Agrega `import io.github.alvarordev.iconoir.compose.regular.Bell` además del import de `Iconoir`. |
| No encuentro `Iconoir.Solid.<Nombre>` | Verifica en el [catálogo](../upstream/catalog.json) si existe una variante `solid` para ese nombre. |
| Gradle no encuentra la dependencia | Confirma la versión `0.1.0`, `mavenCentral()` en los repositorios y la configuración de `google()` para las dependencias AndroidX. |

Para ejemplos compilables, revisa [`samples/android-consumer`](../samples/android-consumer) y [`samples/kmp-consumer`](../samples/kmp-consumer).
