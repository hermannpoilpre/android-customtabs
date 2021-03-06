/*
 * Copyright 2017 Sascha Peilicke
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(28)

    defaultConfig {
        applicationId = "com.example.saschpe.customtabs"
        minSdkVersion(17)
        targetSdkVersion(28)
        versionCode = 170201
        versionName = "2.0.1"
        base.archivesBaseName = "$applicationId-$versionName"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    sourceSets {
        // Increase Android Studio Kotlin compatibility
        findByName("androidTest")?.java?.srcDirs("src/androidTest/kotlin")
        findByName("main")?.java?.srcDirs("src/main/kotlin")
        findByName("test")?.java?.srcDirs("src/test/kotlin")
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8", version = "1.3.10"))
    implementation(project(":customtabs"))
    implementation("androidx.browser:browser:1.0.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("androidx.vectordrawable:vectordrawable-animated:1.0.0")
    implementation("com.google.android.material:material:1.0.0")
}