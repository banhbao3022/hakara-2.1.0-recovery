package p636z0.p667e.p676b.p681w1;

import p636z0.p667e.p668a.p670e.Camera2CameraCaptureResult;
import p636z0.p667e.p676b.ImageInfo;
import p636z0.p667e.p676b.p677v1.CameraCaptureResult;
import p636z0.p667e.p676b.p677v1.TagBundle;

/* JADX INFO: renamed from: z0.e.b.w1.b, reason: use source file name */
/* JADX INFO: compiled from: CameraCaptureResultImageInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class CameraCaptureResultImageInfo implements ImageInfo {

    /* JADX INFO: renamed from: a */
    public final CameraCaptureResult f36334a;

    public CameraCaptureResultImageInfo(CameraCaptureResult cameraCaptureResult) {
        this.f36334a = cameraCaptureResult;
    }

    @Override // p636z0.p667e.p676b.ImageInfo
    /* JADX INFO: renamed from: a */
    public TagBundle mo15259a() {
        return ((Camera2CameraCaptureResult) this.f36334a).f35517a;
    }

    @Override // p636z0.p667e.p676b.ImageInfo
    /* JADX INFO: renamed from: b */
    public long mo15260b() {
        return ((Camera2CameraCaptureResult) this.f36334a).m15101a();
    }
}
