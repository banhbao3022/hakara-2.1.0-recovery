#requires -Version 5
<#
.SYNOPSIS
    Applies app-config.json (App Name, API Base URL, WebView URLs, Launcher Icon) and security patches (F-01, F-02)
    to emulator-test-apktool/ (and syncs with extracted/jadx-readable-all/sources), then builds, aligns, and signs
    an installable APK.

.EXAMPLE
    .\scripts\build-custom-apk.ps1
    .\scripts\build-custom-apk.ps1 -ConfigPath .\app-config.json -BaseName hakara-custom -SkipBuild
#>

[CmdletBinding()]
param(
    [string]$ConfigPath = '',
    [string]$ApktoolDir = '',
    [string]$JadxSourcesDir = '',
    [string]$OutDir = '',
    [string]$BaseName = 'hakara-2.1.0-custom',
    [switch]$SkipBuild,
    [switch]$Install
)

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'

$rootDir = Split-Path -Path $PSScriptRoot -Parent
if ([string]::IsNullOrWhiteSpace($ConfigPath))     { $ConfigPath     = Join-Path $rootDir 'app-config.json' }
if ([string]::IsNullOrWhiteSpace($ApktoolDir))     { $ApktoolDir     = Join-Path $rootDir 'emulator-test-apktool' }
if ([string]::IsNullOrWhiteSpace($JadxSourcesDir)) { $JadxSourcesDir = Join-Path $rootDir 'extracted\jadx-readable-all\sources' }
if ([string]::IsNullOrWhiteSpace($OutDir))         { $OutDir         = $rootDir }

if (-not (Test-Path -LiteralPath $ConfigPath)) {
    throw "Configuration file not found: $ConfigPath"
}

$config = Get-Content -LiteralPath $ConfigPath -Raw -Encoding UTF8 | ConvertFrom-Json

$appName = $config.appName
$apiBaseUrl = $config.apiBaseUrl
if (-not $apiBaseUrl.EndsWith('/')) {
    $apiBaseUrl += '/'
}
$webBaseUrl = $config.webBaseUrl.TrimEnd('/')
$supportUrl = $config.supportUrl

Write-Host "=== Hakara Customizer & Builder ===" -ForegroundColor Cyan
Write-Host "  App Name     : $appName"
Write-Host "  API Base URL : $apiBaseUrl"
Write-Host "  Web Base URL : $webBaseUrl"
Write-Host "  Support URL  : $supportUrl"

function Update-RegexInFile {
    param(
        [string]$FilePath,
        [string]$Pattern,
        [string]$Replacement
    )
    if (-not (Test-Path -LiteralPath $FilePath)) {
        return
    }
    $content = Get-Content -LiteralPath $FilePath -Raw -Encoding UTF8
    $updated = [regex]::Replace($content, $Pattern, $Replacement)
    if ($content -ne $updated) {
        [System.IO.File]::WriteAllText($FilePath, $updated, [System.Text.UTF8Encoding]::new($false))
        Write-Host "  [Patched] $FilePath" -ForegroundColor Green
    }
}

# 1. Patch Apktool tree (if present)
if (Test-Path -LiteralPath $ApktoolDir) {
    # 1a. strings.xml (App Name)
    $stringsXml = Join-Path $ApktoolDir 'res\values\strings.xml'
    Update-RegexInFile -FilePath $stringsXml `
        -Pattern '<string name="app_name">[^<]*</string>' `
        -Replacement "<string name=`"app_name`">$appName</string>"

    # 1b. Retrofit API Base URL in NetworkModule3 (j/a/a/j/f.smali)
    $networkSmali = Join-Path $ApktoolDir 'smali_classes2\j\a\a\j\f.smali'
    Update-RegexInFile -FilePath $networkSmali `
        -Pattern '(const-string v0, ")https?://[^"]+("[\r\n]+\s+invoke-virtual \{p2, v0\}, Lg1/w\$b;->c)' `
        -Replacement "`${1}$apiBaseUrl`${2}"

    # 1c. Report Violation WebView URLs (F-02 fixed: no token in query string)
    $profileReportSmali = Join-Path $ApktoolDir 'smali_classes2\j\a\a\a\a\i\b.smali'
    Update-RegexInFile -FilePath $profileReportSmali `
        -Pattern 'const-string v0, "https?://[^"]+/report-violation\?content_id="' `
        -Replacement "const-string v0, `"$webBaseUrl/report-violation?content_id=`""

    $commentReportSmali = Join-Path $ApktoolDir 'smali_classes2\w0.smali'
    Update-RegexInFile -FilePath $commentReportSmali `
        -Pattern 'const-string v1, "https?://[^"]+/report-violation\?content_id="' `
        -Replacement "const-string v1, `"$webBaseUrl/report-violation?content_id=`""

    # 1d. Privacy, Terms & Support URLs in SettingActivity & Login
    foreach ($smaliRel in @('smali\mtp\media\karaoke\ui\screen\setting\SettingActivity$a.smali', 'smali_classes2\j\a\a\a\a\m\a.smali')) {
        $smaliFile = Join-Path $ApktoolDir $smaliRel
        Update-RegexInFile -FilePath $smaliFile `
            -Pattern 'const-string v1, "https?://[^"]+/terms"' `
            -Replacement "const-string v1, `"$webBaseUrl/terms`""
        Update-RegexInFile -FilePath $smaliFile `
            -Pattern 'const-string v1, "https?://[^"]+/privacy"' `
            -Replacement "const-string v1, `"$webBaseUrl/privacy`""
        Update-RegexInFile -FilePath $smaliFile `
            -Pattern 'const-string v2, "https?://m\.me/[^"]+"' `
            -Replacement "const-string v2, `"$supportUrl`""
    }

    # 1e. Optional custom launcher icon replacement
    if (-not [string]::IsNullOrWhiteSpace($config.launcherIconPng) -and (Test-Path -LiteralPath $config.launcherIconPng)) {
        $mipmapDirs = Get-ChildItem -Path (Join-Path $ApktoolDir 'res') -Directory -Filter 'mipmap-*dpi*'
        foreach ($dir in $mipmapDirs) {
            foreach ($iconName in @('ic_launcher.png', 'ic_launcher_round.png', 'ic_launcher_foreground.png')) {
                $targetIcon = Join-Path $dir.FullName $iconName
                if (Test-Path -LiteralPath $targetIcon) {
                    Copy-Item -LiteralPath $config.launcherIconPng -Destination $targetIcon -Force
                }
            }
        }
        Write-Host "  [Patched] Launcher icons updated from $($config.launcherIconPng)" -ForegroundColor Green
    }
}

# 2. Sync Decompiled Java sources (extracted/jadx-readable-all/sources) & Android Studio project (if present)
foreach ($srcRoot in @($JadxSourcesDir, (Join-Path $PSScriptRoot '..\android-project\app\src\main\java'))) {
    if (Test-Path -LiteralPath $srcRoot) {
        $netJava = Join-Path $srcRoot 'p555j\p556a\p557a\p617j\NetworkModule3.java'
        Update-RegexInFile -FilePath $netJava `
            -Pattern 'm13681c\("https?://[^"]+"\)' `
            -Replacement "m13681c(`"$apiBaseUrl`")"

        $profJava = Join-Path $srcRoot 'p555j\p556a\p557a\p558a\p559a\p573i\ProfileFragment2.java'
        Update-RegexInFile -FilePath $profJava `
            -Pattern 'm1556G\("https?://[^"]+/report-violation\?content_id="\)' `
            -Replacement "m1556G(`"$webBaseUrl/report-violation?content_id=`")"

        $setJava = Join-Path $srcRoot 'mtp\media\karaoke\p628ui\screen\setting\SettingActivity.java'
        Update-RegexInFile -FilePath $setJava `
            -Pattern 'm14254a\("https?://[^"]+/privacy"' `
            -Replacement "m14254a(`"$webBaseUrl/privacy`""
        Update-RegexInFile -FilePath $setJava `
            -Pattern 'm14254a\("https?://[^"]+/terms"' `
            -Replacement "m14254a(`"$webBaseUrl/terms`""
    }
}

if ($SkipBuild) {
    Write-Host "SkipBuild specified; configuration patches complete." -ForegroundColor Yellow
    return
}

# 3. Rebuild, Zipalign & Sign APK via reverse-skill pipeline
$rebuildScript = 'D:\revert\reverse-skill\skills\apk-reverse\scripts\rebuild-sign-install.ps1'
if (-not (Test-Path -LiteralPath $rebuildScript)) {
    throw "Rebuild script not found at $rebuildScript"
}

$buildArgs = @{
    ProjectDir = $ApktoolDir
    OutDir     = $OutDir
    BaseName   = $BaseName
    Clean      = $true
}
if ($Install) {
    $buildArgs['Install'] = $true
    $buildArgs['Reinstall'] = $true
}

Write-Host "Building, aligning, and signing APK..." -ForegroundColor Cyan
& $rebuildScript @buildArgs
