plugins {
    id(BuildPlugins.libraryPlugin)
    id(BuildPlugins.kotlinAndroidPlugin)
}

android {
    compileSdkVersion(AndroidSdk.compile)

    sourceSets["main"].java.srcDir("src/main/kotlin")
}

dependencies {
    implementation(Dependencies.kotlinStandardLibrary)

    implementation(project(":data"))

    implementation(Dependencies.appCompat)

    implementation(Dependencies.coroutines)
    implementation(Dependencies.lifecycleLiveData)
    implementation(Dependencies.lifecycleViewModel)

    implementation(Dependencies.koin)
    implementation(Dependencies.koinScope)
    implementation(Dependencies.koinViewModel)
}