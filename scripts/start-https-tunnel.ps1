param(
    [string]$TargetUrl = 'http://127.0.0.1:3000',
    [string]$CloudflaredPath = (Join-Path $env:USERPROFILE 'Tools\cloudflared\cloudflared.exe'),
    [string]$LogFile = (Join-Path $env:TEMP 'singora-cloudflared.log'),
    [switch]$Background
)

$ErrorActionPreference = 'Stop'

if (-not (Test-Path $CloudflaredPath)) {
    $cfDir = Split-Path -Parent $CloudflaredPath
    New-Item -ItemType Directory -Force -Path $cfDir | Out-Null
    Write-Host "[Singora Tunnel] Downloading official cloudflared Windows binary to $CloudflaredPath..." -ForegroundColor Cyan
    Invoke-WebRequest `
        -Uri 'https://github.com/cloudflare/cloudflared/releases/latest/download/cloudflared-windows-amd64.exe' `
        -OutFile $CloudflaredPath `
        -UseBasicParsing
}

try {
    $health = Invoke-RestMethod -Uri "$($TargetUrl.TrimEnd('/'))/health" -TimeoutSec 3
    if ($health.ok) {
        Write-Host "[Singora Tunnel] Local backend healthy at $TargetUrl (songs=$($health.songs), recordings=$($health.recordings))" -ForegroundColor Green
    }
} catch {
    Write-Warning "Local backend at $TargetUrl did not respond to /health yet. Make sure 'node backend/src/server.js' is running."
}

if (Test-Path $LogFile) {
    Remove-Item -Force $LogFile -ErrorAction SilentlyContinue
}

Write-Host "[Singora Tunnel] Starting Cloudflare Quick Tunnel -> $TargetUrl ..." -ForegroundColor Cyan
$proc = Start-Process -FilePath $CloudflaredPath `
    -ArgumentList @('tunnel', '--url', $TargetUrl, '--no-autoupdate', '--logfile', $LogFile) `
    -PassThru `
    -WindowStyle Hidden

$publicUrl = $null
$deadline = (Get-Date).AddSeconds(25)
while ((Get-Date) -lt $deadline) {
    if ($proc.HasExited) {
        throw "cloudflared exited unexpectedly with code $($proc.ExitCode). Check log: $LogFile"
    }
    if (Test-Path $LogFile) {
        $content = Get-Content -Path $LogFile -Raw -ErrorAction SilentlyContinue
        if ($content -match 'https://[a-z0-9-]+\.trycloudflare\.com') {
            $publicUrl = $Matches[0]
            break
        }
    }
    Start-Sleep -Milliseconds 500
}

if (-not $publicUrl) {
    if (-not $proc.HasExited) { Stop-Process -Id $proc.Id -Force -ErrorAction SilentlyContinue }
    throw "Timed out waiting for trycloudflare.com URL. Check log: $LogFile"
}

Write-Host ""
Write-Host "=================================================================" -ForegroundColor Green
Write-Host " Singora Public HTTPS Tunnel is LIVE!" -ForegroundColor Green
Write-Host " Public URL : $publicUrl" -ForegroundColor Yellow
Write-Host " Health URL : $publicUrl/health" -ForegroundColor Gray
Write-Host " APK ApiUrl : $publicUrl/" -ForegroundColor Gray
Write-Host " Tunnel PID : $($proc.Id)" -ForegroundColor Gray
Write-Host "=================================================================" -ForegroundColor Green
Write-Host ""

if ($Background) {
    Write-Output $publicUrl
    return
}

Write-Host "Press Ctrl+C to stop the HTTPS tunnel..." -ForegroundColor Cyan
try {
    Wait-Process -Id $proc.Id
} finally {
    if (-not $proc.HasExited) {
        Stop-Process -Id $proc.Id -Force -ErrorAction SilentlyContinue
        Write-Host "[Singora Tunnel] Stopped tunnel process (PID $($proc.Id))." -ForegroundColor Yellow
    }
}
