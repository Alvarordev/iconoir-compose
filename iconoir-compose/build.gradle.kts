import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kmp)
    alias(libs.plugins.compose)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.maven.publish)
}

group = "io.github.alvarordev"
version = providers.gradleProperty("releaseVersion").orElse("0.2.0-SNAPSHOT").get()

kotlin {
    android {
        namespace = "io.github.alvarordev.iconoir.compose"
        compileSdk = 37
        minSdk = 24
        compilerOptions.jvmTarget.set(JvmTarget.JVM_17)
        withHostTest {}
    }
    jvm("desktop")
    iosArm64()
    iosSimulatorArm64()
    jvmToolchain(17)

    sourceSets {
        commonMain.dependencies {
            api("org.jetbrains.compose.ui:ui:${libs.versions.compose.get()}")
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}

mavenPublishing {
    publishToMavenCentral()
    if (providers.gradleProperty("releaseVersion").isPresent) {
        signAllPublications()
    }
    pom {
            name.set("Iconoir Compose")
            description.set("Iconoir SVG icons as lazy Compose ImageVectors for Android and Kotlin Multiplatform")
            url.set("https://github.com/alvarordev/iconoir-compose")
            licenses {
                license {
                    name.set("MIT License")
                    url.set("https://opensource.org/licenses/MIT")
                }
            }
            developers {
                developer {
                    id.set("alvarordev")
                    name.set("Alvaro R")
                    url.set("https://github.com/alvarordev")
                }
            }
            scm {
                url.set("https://github.com/alvarordev/iconoir-compose")
                connection.set("scm:git:https://github.com/alvarordev/iconoir-compose.git")
                developerConnection.set("scm:git:ssh://git@github.com/alvarordev/iconoir-compose.git")
            }
    }
}
