import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

internal fun DependencyHandler.implementation(dependency: Any): Dependency? =
    add("implementation", dependency)

internal fun DependencyHandler.api(dependency: Any): Dependency? =
    add("api", dependency)

internal fun DependencyHandler.testImplementation(dependency: Any): Dependency? =
    add("testImplementation", dependency)

internal fun DependencyHandler.testApi(dependency: Any): Dependency? =
    add("testApi", dependency)

internal fun DependencyHandler.androidTestImplementation(dependency: Any): Dependency? =
    add("androidTestImplementation", dependency)

fun DependencyHandler.testDependencies() {
    testImplementation(ThirdParty.jUnit)
    androidTestImplementation(ThirdParty.androidXJUnitExt)
    androidTestImplementation(ThirdParty.androidXEspressoCore)
}

fun DependencyHandler.commonDependencies() {
    implementation(ThirdParty.androidXCoreKtx)
    implementation(ThirdParty.koin)
    implementation(ThirdParty.kotlin)
    implementation(ThirdParty.kotlinCoroutines)
}