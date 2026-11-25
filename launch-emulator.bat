@echo off
setlocal
set "ROOT=%~dp0"
set "SDK=%LOCALAPPDATA%\Android\Sdk"
set "EMU=%SDK%\emulator\emulator.exe"
set "ADB=%SDK%\platform-tools\adb.exe"
set "APK=%ROOT%dist-singora\singora-1.0.0-emulator-ready-signed.apk"

echo [1/4] Ensuring Singora Backend is running on port 3000...
powershell -NoProfile -Command "try { $null = Invoke-RestMethod -Uri 'http://127.0.0.1:3000/health' -TimeoutSec 2; Write-Host '  Backend already running on http://127.0.0.1:3000' } catch { Write-Host '  Starting Singora Backend...'; Start-Process -FilePath 'node' -ArgumentList '--no-warnings','src/server.js' -WorkingDirectory '%ROOT%backend' -WindowStyle Minimized; Start-Sleep -Seconds 2 }"

echo [2/4] Launching visible Android 16 Emulator (Medium_Phone_API_36)...
start "" "%EMU%" -avd Medium_Phone_API_36 -no-snapshot-load -dns-server 8.8.8.8,1.1.1.1

echo [3/4] Waiting for Android 16 to finish booting...
"%ADB%" wait-for-device
:wait_boot
for /f "delims=" %%i in ('"%ADB%" shell getprop sys.boot_completed 2^>nul') do set "BOOT=%%i"
if not "%BOOT%"=="1" (
    timeout /t 2 /nobreak >nul
    goto wait_boot
)

echo [4/4] Installing and opening Singora on your emulator...
"%ADB%" install -r "%APK%"
"%ADB%" shell pm grant com.banhbao.singora android.permission.RECORD_AUDIO 2>nul
"%ADB%" shell pm grant com.banhbao.singora android.permission.CAMERA 2>nul
"%ADB%" shell pm grant com.banhbao.singora android.permission.POST_NOTIFICATIONS 2>nul
"%ADB%" shell pm grant com.banhbao.singora android.permission.READ_MEDIA_IMAGES 2>nul
"%ADB%" shell pm grant com.banhbao.singora android.permission.READ_MEDIA_AUDIO 2>nul
"%ADB%" shell pm grant com.banhbao.singora android.permission.READ_MEDIA_VIDEO 2>nul
"%ADB%" shell pm grant com.banhbao.singora android.permission.ACCESS_FINE_LOCATION 2>nul
"%ADB%" shell pm grant com.banhbao.singora android.permission.ACCESS_COARSE_LOCATION 2>nul
"%ADB%" shell monkey -p com.banhbao.singora -c android.intent.category.LAUNCHER 1 >nul 2>&1

echo.
echo Singora is now running visibly on your screen!
pause
