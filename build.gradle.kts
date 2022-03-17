import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    application
    id("org.openjfx.javafxplugin") version "0.0.10"
}

group = "com.ldickmanns"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.10")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.10")
    implementation("org.openjfx:javafx-fxml:17.0.2")

    implementation("org.slf4j:slf4j-api:1.7.33")
    implementation("org.slf4j:slf4j-simple:1.7.33")
    implementation("org.jetbrains.kotlinx:kotlin-deeplearning-api:0.3.0")

//    compile 'junit:junit:4.12'
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

javafx {
    version = "17"
    modules = listOf("javafx.controls")
}
