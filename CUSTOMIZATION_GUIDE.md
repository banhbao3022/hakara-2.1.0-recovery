# Hakara 2.1.0 — Customization, Rebranding & Architecture Guide

This guide explains **what is recovered**, **how easy it is to modify**, and **how to build your own customized app** using either:
1. **Track A (Instant APK Rebuilder & Patcher)** — Modify URLs, App Name, Launcher Icons, and build a signed, installable APK in ~30 seconds.
2. **Track B (Android Studio Gradle Project)** — Full source-level customization in `android-project/`.

---

## 1. Reverse Engineering Completeness Assessment

| Component | Status | Location | Notes |
| :--- | :--- | :--- | :--- |
| **Android Manifest & 3,720 Resources** | **100% Recovered** | `android-project/app/src/main/res/` & `AndroidManifest.xml` | Layouts, drawables, strings, styles, animations, and manifest are 100% intact (including the fixed Facebook provider authority). |
| **First-Party App Logic (660 classes)** | **99.8% Decompiled** | `android-project/app/src/main/java/mtp/` (82 files) & `p555j/` (578 files) | **0** decompilation errors in `mtp.media.karaoke.*` (Activities, Models, Responses, Services, Widgets) and **659 / 660** clean in `p555j.p556a.p557a.*` (ViewModels, Repositories, DI, Interceptors). |
| **Smali Bytecode Tree** | **100% Buildable** | `emulator-test-apktool/` | Recompiles cleanly via `apktool b`, `zipalign`, and `apksigner`. |
| **Native C/C++ Libraries (86 `.so` files)** | **Prebuilt Binaries** | `android-project/app/src/main/jniLibs/` (`arm64-v8a`, `armeabi-v7a`, `x86`, `x86_64`) | Includes `libAudioEngine.so`, `libcainfilter.so`, `libsoundtouch.so`, and FFmpeg. Note: JNI symbols in `libAudioEngine.so` are bound to `Java_mtp_media_karaoke_ui_screen_sing_SingActivity_*`, `ProcessActivity_*`, and `NativeUtils_*`. Keep those 3 classes in package `mtp.media.karaoke.*` when reusing `libAudioEngine.so`. |

---

## 2. Security Fixes Applied (F-01 & F-02)

Both high-priority security vulnerabilities identified in the technical audit have been patched in **both** the buildable Smali tree (`emulator-test-apktool/`) and the Java source trees (`extracted/jadx-readable-all/sources/` & `android-project/`):

1. **F-01 Fixed (Third-Party Token & Header Leak + Cleartext HTTP)**:
   - [`Interceptor2.java`](android-project/app/src/main/java/p555j/p556a/p557a/p617j/Interceptor2.java) (`j/a/a/j/c.smali`): Added an origin host check so requests to `suggestqueries.google.com` skip attaching `Authorization: Bearer <token>`, `Unique-Id`, and `Sig` headers.
   - [`ApiService.java`](android-project/app/src/main/java/p555j/p556a/p557a/p606h/p613d/ApiService.java) (`j/a/a/h/d/a.smali`): Upgraded `http://suggestqueries.google.com/complete/search` to `https://suggestqueries.google.com/complete/search`.
   - [`network_security_config.xml`](android-project/app/src/main/res/xml/network_security_config.xml): Disabled cleartext HTTP traffic (`cleartextTrafficPermitted="false"`).
2. **F-02 Fixed (Access Token in Report Violation URL Query String)**:
   - [`ProfileFragment2.java`](android-project/app/src/main/java/p555j/p556a/p557a/p558a/p559a/p573i/ProfileFragment2.java) (`j/a/a/a/a/i/b.smali` & `w0.smali`): Removed `?token=<access_token>` from the report URL query string (`https://.../report-violation?content_id=...`).
   - [`WebViewActivity.java`](android-project/app/src/main/java/mtp/media/karaoke/p628ui/screen/webview/WebViewActivity.java) (`WebViewActivity.smali`): Passed `Authorization: Bearer <access_token>` via `WebView.loadUrl(url, extraHeaders)` instead of exposing the token in the URL.

---

## 3. Track A: Instant Configuration & APK Builder

To change the **App Name**, **Backend API Base URL**, **WebView Base URL**, **Support Link**, or **Launcher Icon** and immediately generate a signed, installable APK:

### Step 1: Edit [`app-config.json`](app-config.json)
```json
{
  "appName": "MyKaraoke",
  "apiBaseUrl": "https://api.yourdomain.com/",
  "webBaseUrl": "https://www.yourdomain.com",
  "supportUrl": "https://m.me/yourpage",
  "launcherIconPng": ""
}
```

### Step 2: Run [`scripts/build-custom-apk.ps1`](scripts/build-custom-apk.ps1)
```powershell
.\scripts\build-custom-apk.ps1
```
- This script automatically patches `emulator-test-apktool/`, syncs the URLs into `extracted/jadx-readable-all/sources/` and `android-project/`, runs `apktool b`, aligns with `zipalign`, and signs with `apksigner`, outputting:
  - `hakara-2.1.0-custom-signed.apk` (Ready to install on any device/emulator!)
- Add `-Install` to automatically install onto a connected ADB device/emulator, or `-SkipBuild` to only apply the configuration changes to the source files.

---

## 4. Track B: Working in `android-project/` (Android Studio)

The [`android-project/`](android-project/) folder is organized as a standard Android Studio Gradle project:

```text
android-project/
├── build.gradle
├── settings.gradle
├── gradle.properties
└── app/
    ├── build.gradle
    └── src/main/
        ├── AndroidManifest.xml
        ├── res/                  # 3,720 decoded XML layouts, drawables, strings, styles
        ├── jniLibs/              # 86 native .so libraries across arm64-v8a, armeabi-v7a, x86, x86_64
        └── java/
            ├── mtp/media/karaoke/  # 82 core Activities, Data Models, API Responses, Services, Widgets
            └── p555j/p556a/p557a/  # 578 first-party ViewModels, Repositories, Retrofit API, Koin DI
```

### First-Party Package Map (`p555j.p556a.p557a` -> `mtp.media.karaoke`)
When JADX exported the obfuscated Kotlin packages, it renamed single-letter packages with numeric prefixes (`p555j.p556a.p557a`). Here is what each package corresponds to:
- `p555j.p556a.p557a.p558a.p559a.*` (`j.a.a.a.a.*`): Feature **Fragments, Adapters & ViewModels** (Explore, Feed, Duet, Comment, Profile, Sing, Song, Wallet, Login).
- `p555j.p556a.p557a.p558a.p592b.*` (`j.a.a.a.b.*`): Base UI classes (`BaseActivity3`, `BaseFragment2`, `BaseViewModel`, `BaseListAdapter`).
- `p555j.p556a.p557a.p597g.*` (`j.a.a.g.*`): Custom Dialogs, Widget helpers & `YouTubeExtractor`.
- `p555j.p556a.p557a.p606h.p609c.*` (`j.a.a.h.c.*`): **Local Storage** — Room DAOs (`RecordingDao`, `KeywordDao`, `SkuDao`), Entities, and `SharedPreferences` (`ModelPrefs`).
- `p555j.p556a.p557a.p606h.p613d.*` (`j.a.a.h.d.*`): **Remote API** — [`ApiService.java`](android-project/app/src/main/java/p555j/p556a/p557a/p606h/p613d/ApiService.java) (all 57 Retrofit endpoints) & `ErrorHandlingAdapter`.
- `p555j.p556a.p557a.p606h.p614e.*` (`j.a.a.h.e.*`): **Repositories** (`UserRepository`, `SongRepository`, `RecordingRepository`, `CommentRepository`, `GiftRepository`, `NotificationRepository`, `SearchRepository`).
- `p555j.p556a.p557a.p616i.*` (`j.a.a.i.*`): Generated Android **DataBinding** classes (`*Binding.java` — note: Android Studio generates these automatically from `res/layout/*.xml` when `dataBinding true` is enabled).
- `p555j.p556a.p557a.p617j.*` (`j.a.a.j.*`): **Koin DI & Networking Modules** (`AppModule`, `NetworkModule3`, `Interceptor2`, `RepositoryModule`, `ViewModelModule`).
- `p555j.p556a.p557a.p619l.*` (`j.a.a.l.*`): **Utilities** (`DeviceUtils`, `PathUtils`, `LinkUtils2`, `DialogUtils`).
