plugins {
    java
}

group = "com.hoobrains.ktmdbapi"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit", "junit", "4.12")
    implementation("com.github.ajalt.clikt:clikt:3.1.0")
    implementation(project(":client"))
}

