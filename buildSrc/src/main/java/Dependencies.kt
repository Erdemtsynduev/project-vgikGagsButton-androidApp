object Versions {
    const val kotlin = "1.3.72"
    const val kotlin_coroutines = "1.3.6"

    const val android_x_core_ktx = "1.2.0"
    const val android_x_lifecycle = "2.2.0"
    const val android_x_constraint_layout = "1.1.3"
    const val material_design = "1.1.0"
    const val android_x_databinding_compiler = "3.6.3"

    const val android_x_navigation = "2.2.2"

    const val koin = "2.1.5"

    const val junit = "4.13"

    const val gradle_android = "4.0.0"

    const val min_sdk = 19
    const val target_sdk = 29
    const val compile_sdk = 29
    const val build_tools = "29.0.3"
}

object Deps {
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlin_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlin_coroutines}"
    const val kotlin_coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlin_coroutines}"

    const val core_ktx = "androidx.core:core-ktx:${Versions.android_x_core_ktx}"
    const val material_design = "com.google.android.material:material:${Versions.material_design}"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.android_x_constraint_layout}"
    const val databinding_compiler = "androidx.databinding:databinding-compiler:${Versions.android_x_databinding_compiler}"

    const val lifecycle = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.android_x_lifecycle}"

    const val navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.android_x_navigation}"
    const val navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.android_x_navigation}"

    const val koin = "org.koin:koin-android:${Versions.koin}"
    const val koin_viewmodel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val koin_scope = "org.koin:koin-android-scope:${Versions.koin}"
    const val koin_test = "org.koin:koin-test:${Versions.koin}"

    const val junit = "junit:junit:${Versions.junit}"

    const val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.gradle_android}"
    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Modules {
    const val buttons = ":buttons"
    const val baseui = ":baseui"
}
