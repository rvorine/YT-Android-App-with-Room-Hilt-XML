## Android App with Room and Hilt (XML)

---

build.gradle.kts (Project Level)

```kotlin
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("com.google.dagger.hilt.android") version "2.49" apply false
    id("com.google.devtools.ksp") version "1.9.10-1.0.13" apply false
}
```

---

build.gradle.kts (Module Level)

```kotlin
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("com.google.dagger.hilt.android") version "2.49" apply false
    id("com.google.devtools.ksp") version "1.9.10-1.0.13" apply false
    kotlin("kapt")
}
```

```kotlin
android {
    room {
        schemaDirectory("$projectDir/schemas")
    }
    kapt {
        correctErrorTypes = true
    }
}
```

```kotlin
dependencies {
    //life-cycle extension
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.4")

    //hilt
    implementation("com.google.dagger:hilt-android:2.49")
    implementation("androidx.hilt:hilt-navigation-compose:2.49")
    kapt("com.google.dagger:hilt-android-compiler:2.49")
    kapt("androidx.hilt:hilt-compiler:1.2.0")


    //room
    implementation("androidx.room:room-compiler:2.6.1")
    implementation("androidx.room:room-runtime:2.6.1")
}
```
