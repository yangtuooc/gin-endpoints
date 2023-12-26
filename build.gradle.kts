import com.jetbrains.plugin.structure.intellij.beans.IdeaVersionBean
import com.jetbrains.plugin.structure.intellij.version.IdeVersion

plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.9.0"
    id("org.jetbrains.intellij") version "1.15.0"
}

group = "cn.yangtuooc"
version = "233.11799.196"

repositories {
    mavenCentral()
}

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
intellij {
    version.set("2023.3")
    type.set("GO") // Target IDE Platform

    plugins.set(
        listOf(
            /* Plugin Dependencies */
            "org.jetbrains.plugins.go:233.11799.196",
        )
    )
}

idea {
    module {
        isDownloadSources = true
        isDownloadJavadoc = true
    }
}


tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }

    patchPluginXml {
        sinceBuild.set("233.11799.196")
//        untilBuild.set("232.*")
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }

    runPluginVerifier {
        ideVersions.add(IdeVersion.createIdeVersion("GO-2023.3").asString())
    }
}
