buildscript {
	dependencies {
		classpath("com.android.tools.build:gradle:8.1.0")
		classpath("com.google.gms:google-services:4.4.1")
		classpath("com.google.firebase:firebase-crashlytics-gradle:2.9.9")
	}
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
	id("com.android.application") version "8.3.2" apply false
	id("org.jetbrains.kotlin.android") version "1.9.22" apply false
	id("com.android.library") version "8.3.2" apply false
	id("com.android.dynamic-feature") version "8.3.2" apply false
	id("com.google.dagger.hilt.android") version "2.48" apply false
	id("com.google.devtools.ksp") version "1.9.22-1.0.17" apply false
}