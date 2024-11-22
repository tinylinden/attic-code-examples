plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.detekt)
    alias(libs.plugins.test.logger)
}

group = "eu.tinylinden.attic"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    testImplementation(libs.kotlin.faker)
    testImplementation(libs.strikt.core)
    testImplementation(libs.mockk)
    testImplementation(libs.junit.jupiter.api)

    testRuntimeOnly(libs.junit.jupiter.engine)

    detektPlugins(libs.detekt.formatting)
}

tasks {
    withType<Test> {
        useJUnitPlatform()
        jvmArgs = listOf("-Xshare:off")
    }
}
