#requires -Version 5
<#
.SYNOPSIS
    Converts a built Singora APK into an official Google Play Android App Bundle (.aab)
    using Android SDK aapt2 (proto conversion) + Google bundletool + jarsigner, and
    validates the resulting .aab with `bundletool validate`.
#>

[CmdletBinding()]
param(
    [string]$InputApk = '',
    [string]$OutAab = ''
)

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'

$rootDir = Split-Path -Path $PSScriptRoot -Parent
$distDir = Join-Path $rootDir 'dist-singora'
if ([string]::IsNullOrWhiteSpace($InputApk)) {
    $InputApk = Join-Path $distDir 'singora-1.0.0-playstore-release-signed.apk'
}
if ([string]::IsNullOrWhiteSpace($OutAab)) {
    $OutAab = Join-Path $distDir 'singora-1.0.0-playstore-release.aab'
}

if (-not (Test-Path -LiteralPath $InputApk)) {
    throw "Input APK not found: $InputApk. Run .\scripts\build-singora.ps1 -Production first."
}

$sdkBuildTools = Get-ChildItem "$env:LOCALAPPDATA\Android\Sdk\build-tools" -Directory | Sort-Object Name -Descending | Select-Object -First 1
$aapt2 = Join-Path $sdkBuildTools.FullName 'aapt2.exe'

$toolsDir = Join-Path $env:USERPROFILE 'Tools\bundletool'
New-Item -ItemType Directory -Path $toolsDir -Force | Out-Null
$bundletoolJar = Join-Path $toolsDir 'bundletool-all-1.17.2.jar'

if (-not (Test-Path -LiteralPath $bundletoolJar)) {
    Write-Host "Downloading official Google bundletool v1.17.2..." -ForegroundColor Cyan
    Invoke-WebRequest -Uri 'https://github.com/google/bundletool/releases/download/1.17.2/bundletool-all-1.17.2.jar' -OutFile $bundletoolJar -UseBasicParsing
}

$workDir = Join-Path $env:TEMP ("singora_aab_" + [guid]::NewGuid().ToString('N'))
New-Item -ItemType Directory -Path $workDir -Force | Out-Null

try {
    $protoApk = Join-Path $workDir 'proto.apk'
    Write-Host "  [1/4] Converting resources & manifest to Protobuf format via aapt2..." -ForegroundColor Cyan
    & $aapt2 convert --output-format proto -o $protoApk $InputApk
    if ($LASTEXITCODE -ne 0) { throw "aapt2 convert failed" }

    $baseZip = Join-Path $workDir 'base.zip'
    Write-Host "  [2/4] Packaging AAB base module layout..." -ForegroundColor Cyan
    $pyPackager = Join-Path $workDir 'repack_base.py'
    $pyCode = @'
import sys, zipfile

proto_apk, base_zip = sys.argv[1], sys.argv[2]
skip_exact = {"META-INF/MANIFEST.MF"}

with zipfile.ZipFile(proto_apk, "r") as zin, zipfile.ZipFile(base_zip, "w", zipfile.ZIP_DEFLATED) as zout:
    for info in zin.infolist():
        name = info.filename
        if name.endswith("/"):
            continue
        upper = name.upper()
        if upper in skip_exact or (upper.startswith("META-INF/") and upper.endswith((".SF", ".RSA", ".DSA", ".EC"))):
            continue
        data = zin.read(name)
        if name == "AndroidManifest.xml":
            target = "manifest/AndroidManifest.xml"
        elif name == "resources.pb":
            target = "resources.pb"
        elif name.startswith("classes") and name.endswith(".dex") and "/" not in name:
            target = "dex/" + name
        elif name.startswith(("res/", "assets/", "lib/")):
            target = name
        else:
            target = "root/" + name

        zi = zipfile.ZipInfo(target)
        zi.compress_type = zipfile.ZIP_STORED if info.compress_type == zipfile.ZIP_STORED else zipfile.ZIP_DEFLATED
        zout.writestr(zi, data)
'@
    [System.IO.File]::WriteAllText($pyPackager, $pyCode, [System.Text.UTF8Encoding]::new($false))
    & python $pyPackager $protoApk $baseZip
    if ($LASTEXITCODE -ne 0) { throw "Base module zip packaging failed" }

    if (Test-Path -LiteralPath $OutAab) { Remove-Item -LiteralPath $OutAab -Force }

    Write-Host "  [3/4] Building Android App Bundle (.aab) via Google bundletool..." -ForegroundColor Cyan
    & java -jar $bundletoolJar build-bundle --modules=$baseZip --output=$OutAab
    if ($LASTEXITCODE -ne 0) { throw "bundletool build-bundle failed" }

    Write-Host "  [4/4] Signing .aab with Singora Upload Keystore & running bundletool validate..." -ForegroundColor Cyan
    $keystorePath = Join-Path $rootDir 'keystore\singora-upload-key.jks'
    $passFile     = Join-Path $rootDir 'keystore\keystore.pass'
    $keyAlias     = 'singora-upload'
    $storePass    = if ($env:SINGORA_KEYSTORE_PASS) { $env:SINGORA_KEYSTORE_PASS } else { (Get-Content -LiteralPath $passFile -Raw).Trim() }

    & jarsigner -keystore $keystorePath -storepass $storePass -keypass $storePass -sigalg SHA256withRSA -digestalg SHA-256 $OutAab $keyAlias
    if ($LASTEXITCODE -ne 0) { throw "jarsigner failed on .aab" }

    & java -jar $bundletoolJar validate --bundle=$OutAab
    if ($LASTEXITCODE -ne 0) { throw "bundletool validate failed" }

    Write-Host "SUCCESS! Google-Play-validated AAB ready at: $OutAab" -ForegroundColor Green
} finally {
    Remove-Item -LiteralPath $workDir -Recurse -Force -ErrorAction SilentlyContinue
}
