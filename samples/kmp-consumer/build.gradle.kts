plugins {
    id("org.jetbrains.kotlin.multiplatform") version "2.3.20"
    id("com.android.kotlin.multiplatform.library") version "9.4.0"
    id("org.jetbrains.kotlin.plugin.compose") version "2.3.20"
}

kotlin {
    android {
        namespace = "io.github.alvarordev.iconoir.kmpsample"
        compileSdk = 37
        minSdk = 24
    }
    jvm("desktop")
    iosArm64()
    iosSimulatorArm64()
    jvmToolchain(17)
    sourceSets {
        commonMain.dependencies {
            implementation("io.github.alvarordev:iconoir-compose:0.1.0-SNAPSHOT")
            implementation("org.jetbrains.compose.ui:ui:1.10.3")
            implementation("org.jetbrains.compose.foundation:foundation:1.10.3")
        }
    }
}
