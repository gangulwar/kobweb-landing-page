import com.varabyte.kobweb.gradle.application.extensions.AppBlock.LegacyRouteRedirectStrategy
import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.application)
    // alias(libs.plugins.kobwebx.markdown)
}

group = "com.gangulwar"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            description.set("Powered by Kobweb")

            head.add {
//                link(rel = "stylesheet", href = "/fonts/faces.css")
                link(rel = "preconnect", href = "https://fonts.googleapis.com")
                link(rel = "preconnect", href = "https://fonts.gstatic.com")
                link(
                    href = "https://fonts.googleapis.com/css2?family=Roboto+Slab:wght@100..900&display=swap",
                    rel = "stylesheet"
                )
                link(
                    href = "https://fonts.googleapis.com/css2?family=Inter&display=swap",
                    rel = "stylesheet"
                )
            }

        }
    }
}

kotlin {
    configAsKobwebApplication("gangulwar")

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
        }

        jsMain.dependencies {
            implementation(compose.html.core)
            implementation(libs.kobweb.core)
            implementation(libs.kobweb.silk)
            implementation(libs.silk.icons.fa)
            // implementation(libs.kobwebx.markdown)

        }
    }
}
