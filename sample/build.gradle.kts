plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = Common.Versions.compileSdk
    buildToolsVersion = Common.Versions.buildToolsVersion

    defaultConfig {
        applicationId = "com.example.sample"
        minSdk = Common.Versions.minSdk
        targetSdk = Common.Versions.targetSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
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
    implementation(project(":logger"))

    commonDependencies()
    testDependencies()

    implementation(ThirdParty.androidXAppCompat)
    implementation(ThirdParty.androidXConstraintLayout)
    implementation(ThirdParty.googleMaterial)
}