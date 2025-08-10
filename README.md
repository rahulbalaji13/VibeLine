# TwitRed — Twitter + Reddit Clone (Android)

This is a starter Android Studio project scaffold (Kotlin + Jetpack Compose) for a hybrid Twitter + Reddit app.

## What's included
- Kotlin + Jetpack Compose UI placeholders
- MVVM-ready structure
- Firebase libraries added to Gradle (Auth, Firestore, Storage) but **google-services.json is a placeholder**
- Hilt, Coroutines, Coil, Navigation dependencies
- README with setup steps

## How to set up Firebase (required for full features)
1. Create a Firebase project at https://console.firebase.google.com/
2. Add an Android app with package name `com.example.twitterredditclone`
3. Download the `google-services.json` file and place it into `app/`
4. If you want Google Sign-In, add your app's SHA-1 fingerprint in Firebase console (you can get it via `./gradlew signingReport` in Android Studio)
5. Enable Authentication providers (Email/Password, Google) and create a Firestore database and Storage bucket.

## Run locally
1. Open this folder in Android Studio Flamingo or newer.
2. Let Gradle sync and build.
3. Run on an emulator or device.

## Notes
- I included placeholders for screens and Firebase wiring; you'll need to implement ViewModels, Repositories, and Firestore rules for production.
- If you want, I can continue and implement full features (auth flows, feed queries, create post with image upload). Tell me which screen to prioritize next.

