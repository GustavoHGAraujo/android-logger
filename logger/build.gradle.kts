import org.gradle.internal.impldep.org.eclipse.jgit.lib.InflaterCache.release

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("maven-publish")
}

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

    implementation("com.github.jitpack:android-example:1.0.1")
}

//afterEvaluate {
//    publishing {
//        publications {
//            create<MavenPublication>("maven-publish") {
//                groupId = "com.github.GustavoHGAraujo"
//                artifactId = "android-logger"
//            }
//        }
//    }
//}