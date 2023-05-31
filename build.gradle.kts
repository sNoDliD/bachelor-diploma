plugins {
    id("java")
//  id("org.jetbrains.kotlin.jvm") version "1.8.20"
    id("org.jetbrains.intellij") version "1.13.3"
}

group = "com.qmlplugin"
version = "1.0.0"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17 // todo: remove?
}
dependencies {
    implementation("org.jetbrains:annotations:24.0.0")
}

// Include the generated files in the source set
sourceSets {
    main {
        java {
            srcDirs("src/main/gen")
        }
    }
}
// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
intellij {
    version.set("2022.2.5")
////  type.set("IC") // Target IDE Platform
//
//    plugins.set(listOf(/* Plugin Dependencies */))
    plugins.set(listOf("com.intellij.java"))
}
tasks {
    buildSearchableOptions {
        enabled = false
    }

    withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }
    patchPluginXml {
        version.set("${project.version}")
        sinceBuild.set("222")
        untilBuild.set("231.*")
    }
}
