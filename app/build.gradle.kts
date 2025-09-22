plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.ieji"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.ieji"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    // 🚀 Ativando o Compose
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
}

dependencies {
    // Dependências básicas que você já tinha
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.runtime)

    // 🚀 Jetpack Compose BOM (sincroniza versões automaticamente)
    implementation(platform("androidx.compose:compose-bom:2024.09.01"))

    // Fundamentos e UI
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.foundation:foundation")

    // Material 3 (biblioteca de componentes visuais)
    implementation("androidx.compose.material3:material3")

    // Preview no Android Studio
    implementation("androidx.compose.ui:ui-tooling-preview")
    debugImplementation("androidx.compose.ui:ui-tooling")

    // Activity com suporte a Compose
    implementation("androidx.activity:activity-compose:1.9.2")

    // Testes
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation("com.mikhaellopez:circularimageview:4.3.1")
}