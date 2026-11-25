param(
    [string]$ProjectId = 'aosp-468507',
    [string]$Region = 'asia-southeast1',
    [string]$ServiceName = 'singora-backend',
    [int]$Port = 3000
)

$ErrorActionPreference = 'Stop'
$RepoRoot = Split-Path -Parent $PSScriptRoot

# Ensure gcloud CLI is discoverable on Windows
if (-not (Get-Command gcloud -ErrorAction SilentlyContinue)) {
    $sdkBin = Join-Path $env:LOCALAPPDATA 'Google\Cloud SDK\google-cloud-sdk\bin'
    if (Test-Path (Join-Path $sdkBin 'gcloud.cmd')) {
        $env:PATH = "$sdkBin;$env:PATH"
    } else {
        throw "Google Cloud SDK ('gcloud') not found in PATH. Install it from https://cloud.google.com/sdk/docs/install"
    }
}

Write-Host "[Cloud Run] Checking Google Cloud authentication status..." -ForegroundColor Cyan
$prevEap = $ErrorActionPreference
$ErrorActionPreference = 'Continue'
$token = & gcloud auth print-access-token 2>$null
$authExit = $LASTEXITCODE
$ErrorActionPreference = $prevEap

if ($authExit -ne 0 -or [string]::IsNullOrWhiteSpace($token)) {
    Write-Host "[Cloud Run] gcloud session missing or expired. Launching 'gcloud auth login'..." -ForegroundColor Yellow
    & gcloud auth login
    if ($LASTEXITCODE -ne 0) {
        throw "gcloud auth login failed or was cancelled."
    }
}

Push-Location $RepoRoot
try {
    Write-Host "[Cloud Run] Deploying '$ServiceName' from ./backend to project '$ProjectId' ($Region)..." -ForegroundColor Cyan
    & gcloud run deploy singora-backend `
        --source ./backend `
        --project $ProjectId `
        --region $Region `
        --allow-unauthenticated `
        --port 3000

    if ($LASTEXITCODE -ne 0) {
        throw "gcloud run deploy exited with code $LASTEXITCODE."
    }

    $serviceUrl = (& gcloud run services describe $ServiceName --project $ProjectId --region $Region --format='value(status.url)' 2>$null)
    if ($serviceUrl) {
        Write-Host ""
        Write-Host "=================================================================" -ForegroundColor Green
        Write-Host " Singora Cloud Run Deployment Complete!" -ForegroundColor Green
        Write-Host " Service URL : $serviceUrl" -ForegroundColor Yellow
        Write-Host " Health Check: $serviceUrl/health" -ForegroundColor Gray
        Write-Host " APK ApiUrl  : $serviceUrl/" -ForegroundColor Gray
        Write-Host "=================================================================" -ForegroundColor Green
    }
} finally {
    Pop-Location
}
