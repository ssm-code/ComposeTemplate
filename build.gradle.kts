buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.24")
        classpath("com.android.tools.build:gradle:8.3.2")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.49")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}