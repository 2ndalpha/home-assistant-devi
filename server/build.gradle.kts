repositories {
    mavenCentral()
}

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.ktor)
}

dependencies {
    implementation("io.ktor:ktor-server-netty")
}

application {
    mainClass.set("devithermostat.ApplicationKt")
}