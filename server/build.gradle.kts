repositories {
    mavenCentral()
}

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.ktor)
}

dependencies {
    implementation("io.ktor:ktor-server-netty")
    implementation("io.github.sonic-amiga:opensdg_java:1.0.0")
    implementation("org.slf4j:slf4j-api:1.7.36")
}

application {
    mainClass.set("devithermostat.ApplicationKt")
}