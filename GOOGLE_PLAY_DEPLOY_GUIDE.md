# Singora (`com.banhbao.singora`) — Full-Stack Run & Google Play Store Deployment Guide

## 1. Quick Start: Run Backend + Both Apps Locally (Emulator)

### Step 1: Start the Singora Karaoke Backend
```powershell
cd D:\revert\work\hakara-2.1.0-recovery\backend
npm install
npm run generate-media   # Synthesizes playable stereo karaoke MP4/M4A tracks & artwork
npm start                # Listens on http://0.0.0.0:3000 (Emulator: http://10.0.2.2:3000/)
```
- Verify backend health & all 57 endpoints anytime:
  ```powershell
  npm test
  ```

### Step 2: Build & Run Either App on Android Emulator
Both apps can be installed **side-by-side** on the same Android 16 (`Medium_Phone_API_36`) emulator:

- **App 1 — Patched Original App (`mtp.media.karaoke`):**
  ```powershell
  .\scripts\build-custom-apk.ps1 -Install
  ```
- **App 2 — Your Rebranded Clone: Singora (`com.banhbao.singora`, `targetSdkVersion 35`):**
  ```powershell
  .\scripts\build-singora.ps1 -Install
  ```

---

## 2. Building Your Production Google Play Bundle (`.aab`)

When your backend is deployed to your HTTPS domain (for example `https://api.singora.app/` and `https://www.singora.app`):

1. **Set your production domain** in [`singora-config.json`](singora-config.json):
   ```json
   {
     "appName": "Singora",
     "packageId": "com.banhbao.singora",
     "versionCode": 1,
     "versionName": "1.0.0",
     "targetSdkVersion": 35,
     "productionApiBaseUrl": "https://api.singora.app/",
     "productionWebBaseUrl": "https://www.singora.app"
   }
   ```

2. **Build the Production Signed APK (16 KB page-aligned, strict HTTPS):**
   ```powershell
   .\scripts\build-singora.ps1 -Production
   ```
   Output: `dist-singora\singora-1.0.0-playstore-release-signed.apk`

3. **Convert & Validate the Google Play Android App Bundle (`.aab`):**
   ```powershell
   .\scripts\build-singora-aab.ps1
   ```
   Output: `dist-singora\singora-1.0.0-playstore-release.aab` (signed with `keystore\singora-upload-key.jks` and verified via official Google `bundletool validate`).

---

## 3. Google Play Console Submission Checklist

| Play Console Section | What to Provide / Configure |
| :--- | :--- |
| **App Bundle Upload** | Upload `dist-singora\singora-1.0.0-playstore-release.aab` under **Production** or **Internal Testing**. Keep `keystore\singora-upload-key.jks` backed up safely! |
| **Google Sign-In / Firebase** | Copy the **App Signing Key SHA-1** from Google Play Console (*Setup -> App signing*) + your upload key SHA-1 (`8B:35:CB:BB:39:B0:7D:A3:EF:7B:46:FB:54:1E:CD:18:5A:03:2F:5E`) into your Google Cloud / Firebase Android OAuth client for `com.banhbao.singora`. |
| **Privacy Policy URL** | `https://<your-domain>/privacy` (already built and served by `backend/src/routes/web.js`!). |
| **Account Deletion URL** | `https://<your-domain>/delete-account` (already built and served by `backend/src/routes/web.js` + `DELETE /v1/users/me`!). |
| **UGC Moderation Declaration** | Declare that Singora provides in-app Terms acceptance on sign-in, in-app Content & Profile Reporting (`/report-violation`), and in-app User Blocking (`POST /v1/blocks`). |
| **Store Listing Icon** | Upload [`assets-singora/play_store_512.png`](assets-singora/play_store_512.png) (512×512 high-res icon). |
| **Music Licensing Rights** | Only host backing tracks in `backend/public/media/songs/` for which you hold distribution/karaoke rights. Legacy YouTube scraping has been completely removed. |
