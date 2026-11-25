#requires -Version 5
<#
.SYNOPSIS
    Clones and packages the reverse-engineered karaoke app into "Singora" (com.banhbao.singora),
    upgrading targetSdkVersion to 35 with Android 12-16 compatibility shims (PendingIntent FLAG_IMMUTABLE,
    explicit android:exported, ForegroundService types, isolated ContentProvider authorities, Play Store
    stamp removal, custom Singora icons/strings, 16 KB page-size zipalign, and release upload keystore signing).

.EXAMPLE
    .\scripts\build-singora.ps1
    .\scripts\build-singora.ps1 -Production
#>

[CmdletBinding()]
param(
    [string]$ConfigPath = '',
    [string]$SourceApktoolDir = '',
    [string]$SingoraApktoolDir = '',
    [string]$OutDir = '',
    [switch]$Production,
    [switch]$Install
)

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'

$rootDir = Split-Path -Path $PSScriptRoot -Parent
if ([string]::IsNullOrWhiteSpace($ConfigPath))        { $ConfigPath        = Join-Path $rootDir 'singora-config.json' }
if ([string]::IsNullOrWhiteSpace($SourceApktoolDir))  { $SourceApktoolDir  = Join-Path $rootDir 'emulator-test-apktool' }
if ([string]::IsNullOrWhiteSpace($SingoraApktoolDir)) { $SingoraApktoolDir = Join-Path $rootDir 'singora-apktool' }
if ([string]::IsNullOrWhiteSpace($OutDir))            { $OutDir            = Join-Path $rootDir 'dist-singora' }

$cfg = Get-Content -LiteralPath $ConfigPath -Raw -Encoding UTF8 | ConvertFrom-Json
$appName   = $cfg.appName
$pkgId     = $cfg.packageId
$verCode   = [int]$cfg.versionCode
$verName   = $cfg.versionName
$targetSdk = [int]$cfg.targetSdkVersion

if ($Production) {
    $apiBaseUrl = $cfg.productionApiBaseUrl
    $webBaseUrl = $cfg.productionWebBaseUrl.TrimEnd('/')
    $supportUrl = "$webBaseUrl/delete-account"
    $modeLabel  = 'PRODUCTION (Google Play)'
} else {
    $apiBaseUrl = $cfg.apiBaseUrl
    $webBaseUrl = $cfg.webBaseUrl.TrimEnd('/')
    $supportUrl = $cfg.supportUrl
    $modeLabel  = 'EMULATOR / DEV'
}
if (-not $apiBaseUrl.EndsWith('/')) { $apiBaseUrl += '/' }

Write-Host "=== Building $appName ($pkgId) v$verName ($verCode) [targetSdk $targetSdk] ===" -ForegroundColor Magenta
Write-Host "  Mode         : $modeLabel"
Write-Host "  API Base URL : $apiBaseUrl"
Write-Host "  Web Base URL : $webBaseUrl"

# 1. Sync source tree into singora-apktool (if first time, mirror excluding build/dist)
if (-not (Test-Path -LiteralPath (Join-Path $SingoraApktoolDir 'AndroidManifest.xml'))) {
    Write-Host "  [1/6] Cloning decoded tree into singora-apktool..." -ForegroundColor Cyan
    $null = robocopy $SourceApktoolDir $SingoraApktoolDir /E /XD build dist /NFL /NDL /NJH /NJS /NC /NS
} else {
    Write-Host "  [1/6] Syncing core patched files into singora-apktool..." -ForegroundColor Cyan
    foreach ($rel in @(
        'AndroidManifest.xml',
        'apktool.yml',
        'res\xml\network_security_config.xml',
        'res\layout\sing_activity.xml',
        'smali_classes2\j\a\a\j\c.smali',
        'smali_classes2\j\a\a\j\f.smali',
        'smali_classes2\j\a\a\h\d\a.smali',
        'smali_classes2\j\a\a\a\a\i\b.smali',
        'smali_classes2\j\a\a\a\a\m\a.smali',
        'smali_classes2\j\a\a\a\a\m\a$g.smali',
        'smali_classes2\w0.smali',
        'smali_classes2\mtp\media\karaoke\ui\screen\sing\SingActivity.smali',
        'smali_classes2\mtp\media\karaoke\ui\screen\sing\SingActivity$b.smali',
        'smali_classes2\mtp\media\karaoke\ui\screen\sing\SingActivity$c.smali',
        'smali_classes2\mtp\media\karaoke\ui\screen\sing\SingActivity$p.smali',
        'smali_classes2\mtp\media\karaoke\ui\screen\sing\SingActivity$t.smali',
        'smali_classes2\mtp\media\karaoke\utils\SingTicker.smali',
        'smali_classes2\mtp\media\karaoke\ui\screen\webview\WebViewActivity.smali',
        'smali\mtp\media\karaoke\ui\screen\setting\SettingActivity$a.smali'
    )) {
        $srcFile = Join-Path $SourceApktoolDir $rel
        $dstFile = Join-Path $SingoraApktoolDir $rel
        if (Test-Path -LiteralPath $srcFile) {
            $dstParent = Split-Path -Path $dstFile -Parent
            if (-not (Test-Path -LiteralPath $dstParent)) { New-Item -ItemType Directory -Path $dstParent -Force | Out-Null }
            Copy-Item -LiteralPath $srcFile -Destination $dstFile -Force
        }
    }
}

# 2. Patch apktool.yml (targetSdkVersion, versionCode, versionName)
Write-Host "  [2/6] Configuring apktool.yml & AndroidManifest.xml for Google Play..." -ForegroundColor Cyan
$ymlPath = Join-Path $SingoraApktoolDir 'apktool.yml'
$yml = [System.IO.File]::ReadAllText($ymlPath)
$yml = [regex]::Replace($yml, 'targetSdkVersion:\s*\d+', "targetSdkVersion: $targetSdk")
$yml = [regex]::Replace($yml, 'versionCode:\s*\d+', "versionCode: $verCode")
$yml = [regex]::Replace($yml, 'versionName:\s*[^\r\n]+', "versionName: $verName")
[System.IO.File]::WriteAllText($ymlPath, $yml, [System.Text.UTF8Encoding]::new($false))

# 3. Patch AndroidManifest.xml (package, authorities, Android 12-15 exported & FGS types, strip old Play stamp)
$manifestPath = Join-Path $SingoraApktoolDir 'AndroidManifest.xml'
$m = [System.IO.File]::ReadAllText($manifestPath)
$m = $m.Replace('package="mtp.media.karaoke"', "package=`"$pkgId`"")
$m = $m.Replace('android:compileSdkVersion="30"', "android:compileSdkVersion=`"$targetSdk`"")
$m = $m.Replace('platformBuildVersionCode="30"', "platformBuildVersionCode=`"$targetSdk`"")
$m = $m.Replace('mtp.media.karaoke.fileprovider', "$pkgId.fileprovider")
$m = $m.Replace('mtp.media.karaoke.firebaseinitprovider', "$pkgId.firebaseinitprovider")
$m = $m.Replace('mtp.media.karaoke.mobileadsinitprovider', "$pkgId.mobileadsinitprovider")
$m = $m.Replace('mtp.media.karaoke.workmanager-init', "$pkgId.workmanager-init")
$m = $m.Replace('mtp.media.karaoke.FacebookInitProvider', "$pkgId.FacebookInitProvider")
$m = $m.Replace('mtp.media.karaoke.lifecycle-process', "$pkgId.lifecycle-process")
$m = $m.Replace('com.facebook.app.FacebookContentProvider2387402521276125', "com.facebook.app.FacebookContentProvider9988776655443322")
$m = $m.Replace('cct.mtp.media.karaoke', "cct.$pkgId")

# Android 12+ explicit android:exported on intent-filtered components
$m = $m.Replace(
    '<activity android:launchMode="singleTop" android:name="mtp.media.karaoke.ui.screen.search.SearchActivity" android:screenOrientation="portrait">',
    '<activity android:exported="false" android:launchMode="singleTop" android:name="mtp.media.karaoke.ui.screen.search.SearchActivity" android:screenOrientation="portrait">'
)
$m = $m.Replace(
    '<activity android:name="mtp.media.karaoke.ui.screen.splash.SplashActivity" android:screenOrientation="portrait" android:theme="@style/SplashTheme">',
    '<activity android:exported="true" android:name="mtp.media.karaoke.ui.screen.splash.SplashActivity" android:screenOrientation="portrait" android:theme="@style/SplashTheme">'
)
$m = $m.Replace(
    '<receiver android:name="androidx.media.session.MediaButtonReceiver">',
    '<receiver android:exported="true" android:name="androidx.media.session.MediaButtonReceiver">'
)

# Android 14+ ForegroundService types & permissions
if ($m -notmatch 'FOREGROUND_SERVICE_MEDIA_PLAYBACK') {
    $fgsPerms = @"
    <uses-permission android:name="android.permission.POST_NOTIFICATIONS"/>
    <uses-permission android:name="android.permission.READ_MEDIA_AUDIO"/>
    <uses-permission android:name="android.permission.READ_MEDIA_VIDEO"/>
    <uses-permission android:name="android.permission.READ_MEDIA_IMAGES"/>
    <uses-permission android:name="android.permission.FOREGROUND_SERVICE_MEDIA_PLAYBACK"/>
    <uses-permission android:name="android.permission.FOREGROUND_SERVICE_DATA_SYNC"/>
"@
    $m = $m.Replace('<uses-permission android:name="android.permission.FOREGROUND_SERVICE"/>', "<uses-permission android:name=`"android.permission.FOREGROUND_SERVICE`"/>`r`n$fgsPerms")
}
$m = $m.Replace(
    '<service android:enabled="true" android:exported="false" android:name="mtp.media.karaoke.service.MediaService"/>',
    '<service android:enabled="true" android:exported="false" android:foregroundServiceType="mediaPlayback" android:name="mtp.media.karaoke.service.MediaService"/>'
)
$m = $m.Replace(
    '<service android:directBootAware="false" android:enabled="@bool/enable_system_foreground_service_default" android:exported="false" android:name="androidx.work.impl.foreground.SystemForegroundService"/>',
    '<service android:directBootAware="false" android:enabled="@bool/enable_system_foreground_service_default" android:exported="false" android:foregroundServiceType="dataSync" android:name="androidx.work.impl.foreground.SystemForegroundService"/>'
)

# Strip legacy APKPure / Play Store distribution stamps so Google Play Console accepts new upload
$m = [regex]::Replace($m, '\s*<meta-data android:name="com\.android\.(stamp\.[^"]+|vending\.splits|vending\.derived\.apk\.id|dynamic\.apk\.fused\.modules)"[^/]*/>', '')

# Privacy hardening: disable full auto-backup of private tokens (F-04)
$m = $m.Replace('android:allowBackup="true"', 'android:allowBackup="false"')

if ($Production) {
    $netCfgPath = Join-Path $SingoraApktoolDir 'res\xml\network_security_config.xml'
    $prodNetCfg = @"
<?xml version="1.0" encoding="utf-8"?>
<network-security-config>
    <base-config cleartextTrafficPermitted="false" />
</network-security-config>
"@
    [System.IO.File]::WriteAllText($netCfgPath, $prodNetCfg, [System.Text.UTF8Encoding]::new($false))
}

[System.IO.File]::WriteAllText($manifestPath, $m, [System.Text.UTF8Encoding]::new($false))

# 4. Inject PendingIntentCompat (Android 12+ FLAG_IMMUTABLE) & rewrite PendingIntent calls across DEX
Write-Host "  [3/6] Injecting Android 12-16 PendingIntentCompat shim..." -ForegroundColor Cyan
$compatSmaliPath = Join-Path $SingoraApktoolDir 'smali_classes2\mtp\media\karaoke\utils\PendingIntentCompat.smali'
$compatSmali = @'
.class public final Lmtp/media/karaoke/utils/PendingIntentCompat;
.super Ljava/lang/Object;
.source "PendingIntentCompat.java"

.method public static ensureFlags(I)I
    .locals 2
    const/high16 v0, 0x6000000
    and-int v1, p0, v0
    if-nez v1, :cond_ok
    const/high16 v0, 0x4000000
    or-int/2addr p0, v0
    :cond_ok
    return p0
.end method

.method public static getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    .locals 0
    invoke-static {p3}, Lmtp/media/karaoke/utils/PendingIntentCompat;->ensureFlags(I)I
    move-result p3
    invoke-static {p0, p1, p2, p3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    move-result-object p0
    return-object p0
.end method

.method public static getActivity(Landroid/content/Context;ILandroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/PendingIntent;
    .locals 0
    invoke-static {p3}, Lmtp/media/karaoke/utils/PendingIntentCompat;->ensureFlags(I)I
    move-result p3
    invoke-static {p0, p1, p2, p3, p4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/PendingIntent;
    move-result-object p0
    return-object p0
.end method

.method public static getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    .locals 0
    invoke-static {p3}, Lmtp/media/karaoke/utils/PendingIntentCompat;->ensureFlags(I)I
    move-result p3
    invoke-static {p0, p1, p2, p3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    move-result-object p0
    return-object p0
.end method

.method public static getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    .locals 0
    invoke-static {p3}, Lmtp/media/karaoke/utils/PendingIntentCompat;->ensureFlags(I)I
    move-result p3
    invoke-static {p0, p1, p2, p3}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    move-result-object p0
    return-object p0
.end method

.method public static registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    .locals 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    const/16 v1, 0x22
    if-lt v0, v1, :cond_legacy
    const/4 v0, 0x2
    invoke-virtual {p0, p1, p2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;
    move-result-object p0
    return-object p0
    :cond_legacy
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    move-result-object p0
    return-object p0
.end method

.method public static registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
    .locals 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    const/16 v1, 0x22
    if-lt v0, v1, :cond_legacy
    const/4 v5, 0x2
    move-object v0, p0
    move-object v1, p1
    move-object v2, p2
    move-object v3, p3
    move-object v4, p4
    invoke-virtual/range {v0 .. v5}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;
    move-result-object p0
    return-object p0
    :cond_legacy
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
    move-result-object p0
    return-object p0
.end method
'@
[System.IO.File]::WriteAllText($compatSmaliPath, $compatSmali, [System.Text.UTF8Encoding]::new($false))

# Inject SingTicker.smali (native C++ Superpowered currentSeconds() 500ms UI timer & auto-finish loop without YouTube)
$singTickerPath = Join-Path $SingoraApktoolDir 'smali_classes2\mtp\media\karaoke\utils\SingTicker.smali'
$singTickerSmali = @'
.class public final Lmtp/media/karaoke/utils/SingTicker;
.super Ljava/lang/Object;
.source "SingTicker.java"

# interfaces
.implements Ljava/lang/Runnable;

# instance fields
.field public final app:Lmtp/media/karaoke/ui/screen/sing/SingActivity;

.method public constructor <init>(Lmtp/media/karaoke/ui/screen/sing/SingActivity;)V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    iput-object p1, p0, Lmtp/media/karaoke/utils/SingTicker;->app:Lmtp/media/karaoke/ui/screen/sing/SingActivity;
    return-void
.end method

.method public static start(Lmtp/media/karaoke/ui/screen/sing/SingActivity;)V
    .locals 4
    const v0, 0x7f0a042f
    invoke-virtual {p0, v0}, Lmtp/media/karaoke/ui/screen/sing/SingActivity;->U(I)Landroid/view/View;
    move-result-object v0
    if-eqz v0, :cond_end
    new-instance v1, Lmtp/media/karaoke/utils/SingTicker;
    invoke-direct {v1, p0}, Lmtp/media/karaoke/utils/SingTicker;-><init>(Lmtp/media/karaoke/ui/screen/sing/SingActivity;)V
    const-wide/16 v2, 0x1f4
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
    :cond_end
    return-void
.end method

.method public run()V
    .locals 6

    iget-object v0, p0, Lmtp/media/karaoke/utils/SingTicker;->app:Lmtp/media/karaoke/ui/screen/sing/SingActivity;
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z
    move-result v1
    if-nez v1, :cond_stop
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z
    move-result v1
    if-eqz v1, :cond_alive
    :cond_stop
    return-void

    :cond_alive
    iget-boolean v1, v0, Lmtp/media/karaoke/ui/screen/sing/SingActivity;->J:Z
    if-eqz v1, :cond_reschedule

    invoke-virtual {v0}, Lmtp/media/karaoke/ui/screen/sing/SingActivity;->currentSeconds()F
    move-result v1
    iput v1, v0, Lmtp/media/karaoke/ui/screen/sing/SingActivity;->X:F

    sget-object v2, Lj/a/a/h/a/f;->a:Lj/a/a/h/a/f$a;
    invoke-virtual {v2, v1}, Lj/a/a/h/a/f$a;->a(F)Ljava/lang/String;
    move-result-object v2

    const v3, 0x7f0a042f
    invoke-virtual {v0, v3}, Lmtp/media/karaoke/ui/screen/sing/SingActivity;->U(I)Landroid/view/View;
    move-result-object v3
    check-cast v3, Landroid/widget/TextView;
    if-eqz v3, :cond_curr
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_curr
    const v3, 0x7f0a014c
    invoke-virtual {v0, v3}, Lmtp/media/karaoke/ui/screen/sing/SingActivity;->U(I)Landroid/view/View;
    move-result-object v3
    check-cast v3, Landroid/widget/TextView;
    if-eqz v3, :cond_prog
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_prog
    const v3, 0x7f0a037a
    invoke-virtual {v0, v3}, Lmtp/media/karaoke/ui/screen/sing/SingActivity;->U(I)Landroid/view/View;
    move-result-object v3
    check-cast v3, Lmtp/media/karaoke/ui/widgets/CircleProgressBar;
    if-eqz v3, :cond_seek
    invoke-virtual {v3, v1}, Lmtp/media/karaoke/ui/widgets/CircleProgressBar;->setProgressWithAnimation(F)V

    :cond_seek
    const v3, 0x7f0a03d2
    invoke-virtual {v0, v3}, Lmtp/media/karaoke/ui/screen/sing/SingActivity;->U(I)Landroid/view/View;
    move-result-object v3
    check-cast v3, Lmtp/media/karaoke/addon/seekbar/CustomSeekBar;
    if-eqz v3, :cond_check_end
    float-to-int v4, v1
    invoke-virtual {v3, v4}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_check_end
    iget v3, v0, Lmtp/media/karaoke/ui/screen/sing/SingActivity;->W:F
    const/high16 v4, 0x40000000    # 2.0f
    cmpl-float v4, v3, v4
    if-lez v4, :cond_reschedule
    const v4, 0x3e800000    # 0.25f
    sub-float/2addr v3, v4
    cmpl-float v3, v1, v3
    if-ltz v3, :cond_reschedule
    invoke-static {v0}, Lmtp/media/karaoke/ui/screen/sing/SingActivity;->b0(Lmtp/media/karaoke/ui/screen/sing/SingActivity;)V
    return-void

    :cond_reschedule
    const v1, 0x7f0a042f
    invoke-virtual {v0, v1}, Lmtp/media/karaoke/ui/screen/sing/SingActivity;->U(I)Landroid/view/View;
    move-result-object v1
    if-eqz v1, :cond_done
    const-wide/16 v2, 0x1f4
    invoke-virtual {v1, p0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
    :cond_done
    return-void
.end method
'@
[System.IO.File]::WriteAllText($singTickerPath, $singTickerSmali, [System.Text.UTF8Encoding]::new($false))

# Ensure SingActivity inner classes apply standalone C++ recording & Android 13-16 permission fixes idempotently
$singP = Join-Path $SingoraApktoolDir 'smali_classes2\mtp\media\karaoke\ui\screen\sing\SingActivity$p.smali'
if (Test-Path -LiteralPath $singP) {
    $spTxt = [System.IO.File]::ReadAllText($singP)
    $spUpd = $spTxt.Replace('const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"', 'const-string v2, "android.permission.RECORD_AUDIO"')
    if ($spTxt -ne $spUpd) { [System.IO.File]::WriteAllText($singP, $spUpd, [System.Text.UTF8Encoding]::new($false)) }
}
$singC = Join-Path $SingoraApktoolDir 'smali_classes2\mtp\media\karaoke\ui\screen\sing\SingActivity$c.smali'
if (Test-Path -LiteralPath $singC) {
    $scTxt = [System.IO.File]::ReadAllText($singC)
    $scUpd = [regex]::Replace($scTxt, '(iget-boolean v3, v2, Lmtp/media/karaoke/ui/screen/sing/SingActivity;->I:Z\s+)if-eqz v3, :cond_f', '$1nop')
    if ($scUpd -notmatch '->p0\(\)V') {
        $scUpd = $scUpd.Replace(
            "const v1, 0x7f080357`r`n`r`n    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V",
            "const v1, 0x7f080357`r`n`r`n    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V`r`n`r`n    iget-object v0, p0, Lmtp/media/karaoke/ui/screen/sing/SingActivity`$c;->h:Ljava/lang/Object;`r`n    check-cast v0, Lmtp/media/karaoke/ui/screen/sing/SingActivity;`r`n    invoke-virtual {v0}, Lmtp/media/karaoke/ui/screen/sing/SingActivity;->p0()V"
        )
    }
    if ($scTxt -ne $scUpd) { [System.IO.File]::WriteAllText($singC, $scUpd, [System.Text.UTF8Encoding]::new($false)) }
}
$singB = Join-Path $SingoraApktoolDir 'smali_classes2\mtp\media\karaoke\ui\screen\sing\SingActivity$b.smali'
if (Test-Path -LiteralPath $singB) {
    $sbTxt = [System.IO.File]::ReadAllText($singB)
    $sbUpd = [regex]::Replace($sbTxt, '(iget v2, v1, Lmtp/media/karaoke/ui/screen/sing/SingActivity;->X:F\s+)const/16 v5, 0x32', '$1const/16 v5, 0x3')
    if ($sbTxt -ne $sbUpd) { [System.IO.File]::WriteAllText($singB, $sbUpd, [System.Text.UTF8Encoding]::new($false)) }
}
$singT = Join-Path $SingoraApktoolDir 'smali_classes2\mtp\media\karaoke\ui\screen\sing\SingActivity$t.smali'
if (Test-Path -LiteralPath $singT) {
    $stTxt = [System.IO.File]::ReadAllText($singT)
    if ($stTxt -notmatch 'SingTicker;->start') {
        $stUpd = [regex]::Replace($stTxt, '(iput-boolean v7, p1, Lmtp/media/karaoke/ui/screen/sing/SingActivity;->t0:Z)', "`$1`r`n    invoke-static {p1}, Lmtp/media/karaoke/utils/SingTicker;->start(Lmtp/media/karaoke/ui/screen/sing/SingActivity;)V")
        [System.IO.File]::WriteAllText($singT, $stUpd, [System.Text.UTF8Encoding]::new($false))
    }
}

# Remove any previous PendingIntentCompat1 from smali/ and move small leaf packages from smali/ to smali_classes2/
# so classes.dex stays well below the 65,535 DEX method reference limit!
$oldDex1Compat = Join-Path $SingoraApktoolDir 'smali\mtp\media\karaoke\utils\PendingIntentCompat1.smali'
if (Test-Path -LiteralPath $oldDex1Compat) { Remove-Item -LiteralPath $oldDex1Compat -Force }

foreach ($leafPkg in @('pub', 'me', 'y0')) {
    $dex1Leaf = Join-Path $SingoraApktoolDir "smali\$leafPkg"
    $dex2Leaf = Join-Path $SingoraApktoolDir "smali_classes2\$leafPkg"
    if (Test-Path -LiteralPath $dex1Leaf) {
        $null = robocopy $dex1Leaf $dex2Leaf /E /MOVE /NFL /NDL /NJH /NJS /NC /NS
    }
}

$allSmaliHits = Get-ChildItem $SingoraApktoolDir -Include '*.smali' -Recurse |
    Where-Object { $_.Name -ne 'PendingIntentCompat.smali' } |
    Select-String -Pattern '(Landroid/app/PendingIntent|Lmtp/media/karaoke/utils/PendingIntentCompat1);->get(Activity|Broadcast|Service)\(' -List
foreach ($hit in $allSmaliHits) {
    $txt = [System.IO.File]::ReadAllText($hit.Path)
    $upd = [regex]::Replace($txt, '(Landroid/app/PendingIntent|Lmtp/media/karaoke/utils/PendingIntentCompat1);->get(Activity|Broadcast|Service)\(', 'Lmtp/media/karaoke/utils/PendingIntentCompat;->get$2(')
    if ($txt -ne $upd) { [System.IO.File]::WriteAllText($hit.Path, $upd, [System.Text.UTF8Encoding]::new($false)) }
}

# Android 14+ (targetSdk >= 34) dynamic BroadcastReceiver flag enforcement fix (RECEIVER_EXPORTED = 0x2)
$recvHits = Get-ChildItem $SingoraApktoolDir -Include '*.smali' -Recurse |
    Where-Object { $_.Name -ne 'PendingIntentCompat.smali' } |
    Select-String -Pattern 'invoke-virtual \{([^}]+)\}, L(android/content/Context|android/app/Activity|android/app/Service);->registerReceiver\(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;(Ljava/lang/String;Landroid/os/Handler;)?\)Landroid/content/Intent;' -List
foreach ($rh in $recvHits) {
    $txt = [System.IO.File]::ReadAllText($rh.Path)
    $upd = [regex]::Replace(
        $txt,
        'invoke-virtual \{([^}]+)\}, L(android/content/Context|android/app/Activity|android/app/Service);->registerReceiver\((Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;(?:Ljava/lang/String;Landroid/os/Handler;)?)\)Landroid/content/Intent;',
        'invoke-static {$1}, Lmtp/media/karaoke/utils/PendingIntentCompat;->registerReceiver(Landroid/content/Context;$3)Landroid/content/Intent;'
    )
    if ($txt -ne $upd) { [System.IO.File]::WriteAllText($rh.Path, $upd, [System.Text.UTF8Encoding]::new($false)) }
}

# Android 14+ (targetSdk >= 34) exact alarm restriction fix for WorkManager ForceStopRunnable & Alarms:
# Replace AlarmManager.setExact(...) with inexact AlarmManager.set(...) so SCHEDULE_EXACT_ALARM is not required
$alarmHits = Get-ChildItem (Join-Path $SingoraApktoolDir 'smali') -Include '*.smali' -Recurse |
    Select-String -Pattern 'Landroid/app/AlarmManager;->setExact\(' -List
foreach ($ah in $alarmHits) {
    $txt = [System.IO.File]::ReadAllText($ah.Path)
    $upd = $txt.Replace('Landroid/app/AlarmManager;->setExact(', 'Landroid/app/AlarmManager;->set(')
    if ($txt -ne $upd) { [System.IO.File]::WriteAllText($ah.Path, $upd, [System.Text.UTF8Encoding]::new($false)) }
}

# Update any hardcoded mtp.media.karaoke.fileprovider string in smali
$fpHits = Get-ChildItem $SingoraApktoolDir -Include '*.smali' -Recurse |
    Select-String -Pattern 'mtp\.media\.karaoke\.fileprovider' -List
foreach ($hit in $fpHits) {
    $txt = [System.IO.File]::ReadAllText($hit.Path)
    $upd = $txt.Replace('mtp.media.karaoke.fileprovider', "$pkgId.fileprovider")
    [System.IO.File]::WriteAllText($hit.Path, $upd, [System.Text.UTF8Encoding]::new($false))
}

# Fix relative LayoutManager class names in res/layout* XMLs (RecyclerView resolves leading "." against packageId,
# whereas custom widget classes reside in mtp.media.karaoke.ui.widgets.*)
$layoutXmls = Get-ChildItem (Join-Path $SingoraApktoolDir 'res') -Include '*.xml' -Recurse |
    Where-Object { $_.Directory.Name -like 'layout*' }
foreach ($lx in $layoutXmls) {
    $lt = [System.IO.File]::ReadAllText($lx.FullName)
    $lu = $lt.Replace('=".', '="mtp.media.karaoke.')
    if ($lt -ne $lu) {
        [System.IO.File]::WriteAllText($lx.FullName, $lu, [System.Text.UTF8Encoding]::new($false))
    }
}

# Upgrade legacy Android <=12 storage permission checks in first-party & cropper screens for targetSdk 35
foreach ($permRel in @(
    @{ Path = 'smali\x.smali'; Old = 'android.permission.WRITE_EXTERNAL_STORAGE'; New = 'android.permission.RECORD_AUDIO' },
    @{ Path = 'smali_classes2\k0.smali'; Old = 'android.permission.READ_EXTERNAL_STORAGE'; New = 'android.permission.READ_MEDIA_IMAGES' },
    @{ Path = 'smali_classes2\k0.smali'; Old = 'android.permission.WRITE_EXTERNAL_STORAGE'; New = 'android.permission.READ_MEDIA_IMAGES' },
    @{ Path = 'smali\com\theartofdev\edmodo\cropper\CropImageActivity.smali'; Old = 'android.permission.READ_EXTERNAL_STORAGE'; New = 'android.permission.READ_MEDIA_IMAGES' }
)) {
    $pp = Join-Path $SingoraApktoolDir $permRel.Path
    if (Test-Path -LiteralPath $pp) {
        $pt = [System.IO.File]::ReadAllText($pp)
        $pu = $pt.Replace($permRel.Old, $permRel.New)
        if ($pt -ne $pu) { [System.IO.File]::WriteAllText($pp, $pu, [System.Text.UTF8Encoding]::new($false)) }
    }
}

# Rebrand Google Play Billing diamond SKU prefix from NativeUtils.getPackage() ("mtp.media.karaoke.") to "$pkgId."
$skuSmali = Join-Path $SingoraApktoolDir 'smali\j\a\a\h\b\a.smali'
if (Test-Path -LiteralPath $skuSmali) {
    $st = [System.IO.File]::ReadAllText($skuSmali)
    $su = [regex]::Replace(
        $st,
        'invoke-static \{\}, Lmtp/media/karaoke/utils/NativeUtils;->getPackage\(\)Ljava/lang/String;\s+move-result-object v2',
        "const-string v2, `"$pkgId.`""
    )
    if ($st -ne $su) {
        [System.IO.File]::WriteAllText($skuSmali, $su, [System.Text.UTF8Encoding]::new($false))
    }
}

# 5. Rebrand Strings, URLs & Launcher Icons
Write-Host "  [4/6] Applying Singora branding, URLs, and launcher icons..." -ForegroundColor Cyan
$stringFiles = Get-ChildItem (Join-Path $SingoraApktoolDir 'res') -Recurse -Filter 'strings.xml'
foreach ($sf in $stringFiles) {
    $s = [System.IO.File]::ReadAllText($sf.FullName)
    $u = $s.Replace('Hakara', $appName)
    if ($sf.Directory.Name -eq 'values') {
        $u = [regex]::Replace($u, '<string name="facebook_app_id">[^<]*</string>', '<string name="facebook_app_id">9988776655443322</string>')
        $u = [regex]::Replace($u, '<string name="fb_login_protocol_scheme">[^<]*</string>', '<string name="fb_login_protocol_scheme">fb9988776655443322</string>')
    }
    if ($s -ne $u) {
        [System.IO.File]::WriteAllText($sf.FullName, $u, [System.Text.UTF8Encoding]::new($false))
    }
}

# Patch URLs in Singora smali
function Patch-SmaliRegex([string]$RelPath, [string]$Pattern, [string]$Replacement) {
    $p = Join-Path $SingoraApktoolDir $RelPath
    if (-not (Test-Path -LiteralPath $p)) { return }
    $c = [System.IO.File]::ReadAllText($p)
    $n = [regex]::Replace($c, $Pattern, $Replacement)
    if ($c -ne $n) { [System.IO.File]::WriteAllText($p, $n, [System.Text.UTF8Encoding]::new($false)) }
}

Patch-SmaliRegex 'smali_classes2\j\a\a\j\f.smali' '(const-string v0, ")https?://[^"]+("[\r\n]+\s+invoke-virtual \{p2, v0\}, Lg1/w\$b;->c)' "`${1}$apiBaseUrl`${2}"
Patch-SmaliRegex 'smali_classes2\j\a\a\a\a\i\b.smali' 'const-string v0, "https?://[^"]+/report-violation\?content_id="' "const-string v0, `"$webBaseUrl/report-violation?content_id=`""
Patch-SmaliRegex 'smali_classes2\w0.smali' 'const-string v1, "https?://[^"]+/report-violation\?content_id="' "const-string v1, `"$webBaseUrl/report-violation?content_id=`""
foreach ($sr in @('smali\mtp\media\karaoke\ui\screen\setting\SettingActivity$a.smali', 'smali_classes2\j\a\a\a\a\m\a.smali')) {
    Patch-SmaliRegex $sr 'const-string v1, "https?://[^"]+/terms"' "const-string v1, `"$webBaseUrl/terms`""
    Patch-SmaliRegex $sr 'const-string v1, "https?://[^"]+/privacy"' "const-string v1, `"$webBaseUrl/privacy`""
    Patch-SmaliRegex $sr 'const-string v2, "https?://[^"]+"' "const-string v2, `"$supportUrl`""
}

# Apply Singora icons across mipmap directories & adaptive launcher XML
$iconSrcDir = Join-Path $rootDir 'assets-singora'
if (Test-Path -LiteralPath $iconSrcDir) {
    $mipmapDirs = Get-ChildItem (Join-Path $SingoraApktoolDir 'res') -Directory -Filter 'mipmap-*'
    foreach ($md in $mipmapDirs) {
        if ($md.Name -match 'anydpi') {
            # Point adaptive icon XML directly to @mipmap/ic_launcher_foreground & purple/magenta background
            foreach ($xmlName in @('ic_launcher.xml', 'ic_launcher_round.xml')) {
                $xmlPath = Join-Path $md.FullName $xmlName
                if (Test-Path -LiteralPath $xmlPath) {
                    $adaptiveXml = @"
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@color/colorPrimary" />
    <foreground android:drawable="@mipmap/ic_launcher_foreground" />
</adaptive-icon>
"@
                    [System.IO.File]::WriteAllText($xmlPath, $adaptiveXml, [System.Text.UTF8Encoding]::new($false))
                }
            }
        } else {
            Copy-Item -LiteralPath (Join-Path $iconSrcDir 'ic_launcher.png') -Destination (Join-Path $md.FullName 'ic_launcher.png') -Force
            Copy-Item -LiteralPath (Join-Path $iconSrcDir 'ic_launcher_round.png') -Destination (Join-Path $md.FullName 'ic_launcher_round.png') -Force
            Copy-Item -LiteralPath (Join-Path $iconSrcDir 'ic_launcher_foreground.png') -Destination (Join-Path $md.FullName 'ic_launcher_foreground.png') -Force
        }
    }
}

# 6. Generate Singora Upload Keystore & Build 16 KB Aligned Signed APK
Write-Host "  [5/6] Ensuring dedicated Singora Release Keystore..." -ForegroundColor Cyan
$keystoreDir = Join-Path $rootDir 'keystore'
New-Item -ItemType Directory -Path $keystoreDir -Force | Out-Null
$keystorePath = Join-Path $keystoreDir 'singora-upload-key.jks'
$passFile     = Join-Path $keystoreDir 'keystore.pass'
$keyAlias     = 'singora-upload'
if (-not [string]::IsNullOrWhiteSpace($env:SINGORA_KEYSTORE_PASS)) {
    $storePass = $env:SINGORA_KEYSTORE_PASS
} elseif (Test-Path -LiteralPath $passFile) {
    $storePass = (Get-Content -LiteralPath $passFile -Raw).Trim()
} else {
    $storePass = [guid]::NewGuid().ToString('N')
    [System.IO.File]::WriteAllText($passFile, $storePass, [System.Text.UTF8Encoding]::new($false))
}

if (-not (Test-Path -LiteralPath $keystorePath)) {
    & keytool -genkeypair -v -keystore $keystorePath -storepass $storePass -keypass $storePass `
        -alias $keyAlias -keyalg RSA -keysize 2048 -validity 10000 `
        -dname 'CN=Singora Karaoke, OU=Mobile, O=BanhBao Studio, L=Ho Chi Minh, S=HCM, C=VN'
    if ($LASTEXITCODE -ne 0) { throw "Failed to generate Singora upload keystore" }
}

New-Item -ItemType Directory -Path $OutDir -Force | Out-Null
$apktool = Join-Path $env:USERPROFILE 'Tools\apktool\apktool.bat'
if (-not (Test-Path $apktool)) { $apktool = (Get-Command apktool).Source }
$sdkBuildTools = Get-ChildItem "$env:LOCALAPPDATA\Android\Sdk\build-tools" -Directory | Sort-Object Name -Descending | Select-Object -First 1
$zipalign = Join-Path $sdkBuildTools.FullName 'zipalign.exe'
$apksigner = Join-Path $sdkBuildTools.FullName 'apksigner.bat'
$adb = Join-Path $env:LOCALAPPDATA 'Android\Sdk\platform-tools\adb.exe'

$modeSuffix = if ($Production) { 'playstore-release' } else { 'emulator-ready' }
$unsignedApk = Join-Path $OutDir "singora-$verName-$modeSuffix-unsigned.apk"
$alignedApk  = Join-Path $OutDir "singora-$verName-$modeSuffix-aligned.apk"
$signedApk   = Join-Path $OutDir "singora-$verName-$modeSuffix-signed.apk"

Write-Host "  [6/6] Building, 16 KB page-aligning, and signing Singora APK..." -ForegroundColor Cyan
& $apktool b $SingoraApktoolDir -o $unsignedApk
if ($LASTEXITCODE -ne 0) { throw "apktool b failed for Singora" }

# Use -P 16 -f 4 (16 KB ELF page-size alignment supported by Android Build-Tools 35/36!)
& $zipalign -P 16 -f 4 $unsignedApk $alignedApk
if ($LASTEXITCODE -ne 0) {
    Write-Warning "zipalign -P 16 fallback to -p 4..."
    & $zipalign -f -p 4 $unsignedApk $alignedApk
    if ($LASTEXITCODE -ne 0) { throw "zipalign failed" }
}

& $apksigner sign --ks $keystorePath --ks-key-alias $keyAlias --ks-pass "pass:$storePass" --key-pass "pass:$storePass" --out $signedApk $alignedApk
if ($LASTEXITCODE -ne 0) { throw "apksigner failed" }

& $apksigner verify --print-certs $signedApk | Select-Object -First 4
Remove-Item -LiteralPath $unsignedApk, $alignedApk -Force -ErrorAction SilentlyContinue

Write-Host "SUCCESS! Signed Singora APK: $signedApk" -ForegroundColor Green

if ($Install) {
    & $adb install -r $signedApk
}
