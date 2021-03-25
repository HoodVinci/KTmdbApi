plugins {
    kotlin("jvm").version("1.4.30")
    application

}

group = "com.hoodbrains.ktmdbapi.cli"
version = "0.1"

application {
    mainClass.set("com.hoodbrains.ktmdbapi.cli.TmdbApiCliKt")
}
repositories {
    mavenCentral()

}

dependencies {
    testImplementation("junit", "junit", "4.12")
    implementation("com.github.ajalt.clikt:clikt:3.1.0")
}
