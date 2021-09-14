object ThirdParty {

	internal object Versions {
		const val androidXAppCompat = "1.3.0"
		const val androidXConstraintLayout = "2.0.4"
		const val androidXCoreKtx = "1.5.0"
		const val androidXEspressoCore = "3.3.0"
		const val androidXJUnitExt = "1.1.2"
		const val androidXLiveDataKtx = "2.3.1"
		const val androidXNavComponent = "2.3.5"

		const val googleFirebase = "28.0.1"
		const val googleFirebaseCrashlytics = "2.5.1"
		const val googleMaterial = "1.3.0"
		const val googlePlayServicesAuth = "19.2.0"
		const val googleServices = "4.3.8"

		const val facebook = "5.15.3"
		const val gradleVersion = "4.2.1"

		const val jUnit = "4.13.2"

		const val koin = "3.1.2"

		const val kotlin = "1.5.0"
		const val kotlinCoroutines = "1.4.1"
		const val kotlinGradlePlugin = "1.5.30"
	}

	const val androidGradleVersion = "com.android.tools.build:gradle:${Versions.gradleVersion}"

	const val androidXAppCompat = "androidx.appcompat:appcompat:${Versions.androidXAppCompat}"
	const val androidXCoreKtx = "androidx.core:core-ktx:${Versions.androidXCoreKtx}"
	const val androidXConstraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.androidXConstraintLayout}"
	const val androidXEspressoCore = "androidx.test.espresso:espresso-core:${Versions.androidXEspressoCore}"
	const val androidXJUnitExt = "androidx.test.ext:junit:${Versions.androidXJUnitExt}"
	const val androidXLiveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.androidXLiveDataKtx}"

	const val androidXNavigationComponentSafeArgsGradlePlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.androidXNavComponent}"
	const val androidXNavigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.androidXNavComponent}"
	const val androidXNavigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.androidXNavComponent}"

	const val googleFirebasePlatform = "com.google.firebase:firebase-bom:${Versions.googleFirebase}"
	const val googleFirebaseAuth = "com.google.firebase:firebase-auth"
	const val googleFirebaseAuthKtx = "com.google.firebase:firebase-auth-ktx"
	const val googleFirebaseAnalyticsKtx = "com.google.firebase:firebase-analytics-ktx"
	const val googleFirebaseConfigKtx = "com.google.firebase:firebase-config-ktx"
	const val googleFirebaseCrashlyticsKtx = "com.google.firebase:firebase-crashlytics-ktx"
	const val googleFirebaseFirestoreKtx = "com.google.firebase:firebase-firestore-ktx"

	const val googleFirebaseCrashlyticsGradle = "com.google.firebase:firebase-crashlytics-gradle:${Versions.googleFirebaseCrashlytics}"
	const val googleMaterial = "com.google.android.material:material:${Versions.googleMaterial}"
	const val googlePlayServicesAuth = "com.google.android.gms:play-services-auth:${Versions.googlePlayServicesAuth}"
	const val googleServices = "com.google.gms:google-services:${Versions.googleServices}"

	const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
	const val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
	const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradlePlugin}"

	const val facebook = "com.facebook.android:facebook-android-sdk:${Versions.facebook}"

	const val jUnit = "junit:junit:${Versions.jUnit}"

	const val koin = "io.insert-koin:koin-android:${Versions.koin}"

}
