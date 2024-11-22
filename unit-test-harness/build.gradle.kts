plugins {
    kotlin("jvm") version "1.9.0"
    id("io.gitlab.arturbosch.detekt") version "1.23.7"
    id("com.adarshr.test-logger") version "3.1.0"
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
    testImplementation(kotlin("test"))
    testImplementation("io.strikt:strikt-core:0.34.0")
    testImplementation("io.mockk:mockk:1.13.13")
    testImplementation("io.github.serpro69:kotlin-faker:1.16.0")

    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.23.7")
}

tasks {
    withType<Test> {
        useJUnitPlatform()
        jvmArgs = listOf("-Xshare:off")
    }
}
