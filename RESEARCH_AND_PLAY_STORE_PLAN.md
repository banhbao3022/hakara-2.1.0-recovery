# Karaoke App Research, Full-Stack Architecture & Google Play Deployment Plan

## 1. Market & Open-Source Karaoke Research Summary

### 1.1 Hakara (`mtp.media.karaoke`) Product Analysis
Based on store intelligence and our binary/source audit, **Hakara** combines a **mobile vocal studio** with a **music social network**:
- **Core Karaoke Engine:** Powered natively by the **Superpowered C++ Audio SDK** (`libAudioEngine.so`) paired with **CainMedia / FFmpeg** (`libcainfilter.so`, `libffrecorder.so`) for real-time vocal loopback, pitch/tone shifting (`setTone`), custom reverb/echo (`customReverb`, `effect`), MV camera filters, and post-recording audio/video mixing (`ProcessActivity`).
- **Interactive Duets:** Supports solo audio/video recordings and timestamp-segmented duets (`Duet` + `Duet2` segments `s` -> `e`).
- **Social & Virtual Economy:** Following/Nearby/Explore feeds, song rankings, comments, likes, shares, virtual gifts (`Coins` & `Stars`), Google Play IAP (`Diamonds`), and daily check-in/reward tasks.

### 1.2 Open-Source Android Karaoke Ecosystem (GitHub Findings)
- **`SuperpoweredSDK/switchboard-android`:** Confirms Superpowered C++ DSP is the industry standard for low-latency Android vocal recording, backing-track sync, pitch shifting, and reverb — matching what `libAudioEngine.so` already provides inside this codebase.
- **`unicorncoderforever/AndroidKaraoke` & `fajarpnugroho/santan-kara`:** Demonstrate local backing-track caching before recording start so network jitter never desynchronizes vocals from music (the exact pattern `SingActivity.m14447g0` uses when downloading `Song.link` / `Song.link_video` to cache before calling `startAudio`).
- **`MythicalSHUB/SpatialFlow` & `Y0ungB/PitchCoach`:** Highlight HTTP `Range` streaming (`206 Partial Content`) as essential for ExoPlayer feed playback and seeking.

---

## 2. Google Play Store Compliance Requirements (2026) for **Singora (`com.banhbao.singora`)**

Publishing a cloned/rebranded social audio app to Google Play requires addressing five mandatory technical and policy gates:

| Google Play Requirement | Issue in Original Hakara 2.1.0 APK | Fix Implemented in **Singora (`com.banhbao.singora`)** |
| :--- | :--- | :--- |
| **1. Unique Application ID & Authorities** | Uses `mtp.media.karaoke` and `mtp.media.karaoke.*` ContentProviders. | Repackaged to `com.banhbao.singora` with isolated provider authorities (`com.banhbao.singora.fileprovider`, `.firebaseinitprovider`, `.workmanager-init`, `.lifecycle-process`) while preserving internal `Lmtp/media/karaoke/*` DEX class names so `libAudioEngine.so` JNI bindings work natively without recompiling C++. |
| **2. Target API Level (API 35+)** | Targets legacy SDK 30 (Android 11); missing `android:exported` on intent-filtered components & Android 14 foreground service types. | Upgraded `targetSdkVersion` to `35`, added explicit `android:exported` on all activities/services/receivers with `<intent-filter>`, declared `FOREGROUND_SERVICE_MEDIA_PLAYBACK` for `MediaService`, and patched `PendingIntent` flags for Android 12+ (`FLAG_IMMUTABLE`). |
| **3. Device & Network Abuse Policy (No YouTube Scraping)** | `SingActivity` invokes `YouTubeExtractor` (`youtube.com/watch?v=...` scraping), which is broken in 2026 and causes immediate Google Play rejection. | Bypassed `YouTubeExtractor` in `SingActivity` so songs load directly from first-party licensed/hosted URLs (`Song.link`, `Song.link_video`, and `GET /v1/songs/getLink`) served by our backend. |
| **4. User-Generated Content (UGC) & Account Deletion Policy** | Token leaked in report URL (`F-02`); lacked dedicated account-deletion endpoint/page required since 2024+. | Fixed `F-01` & `F-02`; backend serves `/terms`, `/privacy`, `/report-violation` (with moderation DB persistence), and `/delete-account` (self-service account & data deletion page + `DELETE /v1/users/me`). |
| **5. Release Signing & 16 KB Page Alignment** | Debug-signed APK with 4 KB zipalign. | Dedicated release keystore generator + `zipalign -P 16 -f -v 4` (16 KB page-aligned shared libraries) + APK & AAB packaging script (`scripts/build-singora-release.ps1`). |

---

## 3. Full-Stack Execution Architecture

```text
hakara-2.1.0-recovery/
├── backend/                     # Node.js (Express + SQLite + Multer + Range Streaming)
│   ├── src/
│   │   ├── server.js            # Express app, CORS, HMAC/Bearer middleware, Range media server
│   │   ├── db.js                # SQLite schema + rich seed data (users, songs, recordings, gifts, tasks)
│   │   ├── routes/v1.js         # All 57 REST endpoints from BACKEND_API_SPEC.md + moderation/deletion
│   │   └── routes/web.js        # WebView HTML pages: /privacy, /terms, /report-violation, /delete-account
│   ├── scripts/
│   │   ├── generate-media.py    # Synthesizes real stereo WAV/MP4 karaoke tracks & thumbnails
│   │   └── test-api.js          # Automated integration test suite for all API routes
│   └── public/                  # Hosted backing tracks, uploaded recordings, avatars, gift icons
├── emulator-test-apktool/       # Reverse-engineered Hakara (mtp.media.karaoke) connected to backend
├── singora-apktool/             # Custom Google-Play-ready Singora (com.banhbao.singora) clone
└── scripts/
    ├── build-custom-apk.ps1     # Builds & signs Hakara (mtp.media.karaoke)
    └── build-singora.ps1        # Syncs, rebrands, 16KB-aligns & signs Singora (com.banhbao.singora)
```
