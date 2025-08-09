plugins {
    id("fabric-loom") version "1.2.+"
    id("maven-publish")
}

repositories {
    mavenCentral()
}

val minecraftVersion = "1.21.1"
val yarnMappings = "1.21.1+build.0"
val loaderVersion = "0.15.4"

dependencies {
    minecraft("com.mojang:minecraft:${minecraftVersion}")
    mappings("net.fabricmc:yarn:${yarnMappings}:v2")
    modImplementation("net.fabricmc:fabric-loader:${loaderVersion}")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.86.0+1.21")
}

java { toolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }
