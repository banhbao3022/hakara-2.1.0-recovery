package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import p636z0.p667e.p668a.p669d.Camera2ImplConfig;
import p636z0.p667e.p668a.p670e.p671w1.CameraCharacteristicsCompat;

/* JADX INFO: renamed from: z0.e.a.e.g1, reason: use source file name */
/* JADX INFO: compiled from: CropRegionZoomImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class CropRegionZoomImpl implements ZoomControl.b {

    /* JADX INFO: renamed from: a */
    public final CameraCharacteristicsCompat f35482a;

    public CropRegionZoomImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f35482a = cameraCharacteristicsCompat;
    }

    @Override // p636z0.p667e.p668a.p670e.ZoomControl.b
    /* JADX INFO: renamed from: a */
    public void mo15096a(TotalCaptureResult totalCaptureResult) {
    }

    @Override // p636z0.p667e.p668a.p670e.ZoomControl.b
    /* JADX INFO: renamed from: b */
    public void mo15097b(Camera2ImplConfig.a aVar) {
    }

    @Override // p636z0.p667e.p668a.p670e.ZoomControl.b
    /* JADX INFO: renamed from: c */
    public float mo15098c() {
        Float f = (Float) this.f35482a.m15209a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            return 1.0f;
        }
        return f.floatValue();
    }

    @Override // p636z0.p667e.p668a.p670e.ZoomControl.b
    /* JADX INFO: renamed from: d */
    public float mo15099d() {
        return 1.0f;
    }

    @Override // p636z0.p667e.p668a.p670e.ZoomControl.b
    /* JADX INFO: renamed from: e */
    public void mo15100e() {
    }
}
