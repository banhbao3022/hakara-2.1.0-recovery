package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import p636z0.p667e.p668a.p669d.Camera2ImplConfig;
import p636z0.p667e.p668a.p670e.p671w1.CameraCharacteristicsCompat;

/* JADX INFO: renamed from: z0.e.a.e.j0, reason: use source file name */
/* JADX INFO: compiled from: AndroidRZoomImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidRZoomImpl implements ZoomControl.b {

    /* JADX INFO: renamed from: a */
    public final CameraCharacteristicsCompat f35498a;

    /* JADX INFO: renamed from: b */
    public final Range<Float> f35499b;

    /* JADX INFO: renamed from: c */
    public float f35500c = 1.0f;

    public AndroidRZoomImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f35498a = cameraCharacteristicsCompat;
        this.f35499b = (Range) cameraCharacteristicsCompat.m15209a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    @Override // p636z0.p667e.p668a.p670e.ZoomControl.b
    /* JADX INFO: renamed from: a */
    public void mo15096a(TotalCaptureResult totalCaptureResult) {
    }

    @Override // p636z0.p667e.p668a.p670e.ZoomControl.b
    /* JADX INFO: renamed from: b */
    public void mo15097b(Camera2ImplConfig.a aVar) {
        aVar.m15073d(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f35500c));
    }

    @Override // p636z0.p667e.p668a.p670e.ZoomControl.b
    /* JADX INFO: renamed from: c */
    public float mo15098c() {
        return ((Float) this.f35499b.getUpper()).floatValue();
    }

    @Override // p636z0.p667e.p668a.p670e.ZoomControl.b
    /* JADX INFO: renamed from: d */
    public float mo15099d() {
        return ((Float) this.f35499b.getLower()).floatValue();
    }

    @Override // p636z0.p667e.p668a.p670e.ZoomControl.b
    /* JADX INFO: renamed from: e */
    public void mo15100e() {
        this.f35500c = 1.0f;
    }
}
