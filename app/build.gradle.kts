plugins {
    alias(libs.plugins.android.application)
    // ถ้าโปรเจ็กต์นี้มีไฟล์ Kotlin ให้เติมบรรทัดนี้ด้วย:
    // alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.electroniclearning"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.electroniclearning"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    // แก้เคส resource แปลก ๆ ระหว่าง merge
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    // ถ้ามี Kotlin ให้เปิดด้วย
    // kotlinOptions { jvmTarget = "11" }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
