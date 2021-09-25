import org.gradle.internal.impldep.org.eclipse.jgit.lib.InflaterCache.release

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("maven-publish")
}

group = "com.github.GustavoHGAraujo"

android {
    compileSdk = Common.Versions.compileSdk
    buildToolsVersion = Common.Versions.buildToolsVersion

    defaultConfig {
        minSdk = Common.Versions.minSdk
        targetSdk = Common.Versions.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    commonDependencies()
    testDependencies()
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("maven") {
                groupId = "com.gomagustavo"
                artifactId = "logger"
                version = "1.0.0"
            }
        }
    }
}