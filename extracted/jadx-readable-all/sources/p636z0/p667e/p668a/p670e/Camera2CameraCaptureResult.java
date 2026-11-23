package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CaptureResult;
import p636z0.p667e.p676b.p677v1.CameraCaptureResult;
import p636z0.p667e.p676b.p677v1.TagBundle;

/* JADX INFO: renamed from: z0.e.a.e.l0, reason: use source file name */
/* JADX INFO: compiled from: Camera2CameraCaptureResult.java */
/* JADX INFO: loaded from: classes.dex */
public class Camera2CameraCaptureResult implements CameraCaptureResult {

    /* JADX INFO: renamed from: a */
    public final TagBundle f35517a;

    /* JADX INFO: renamed from: b */
    public final CaptureResult f35518b;

    public Camera2CameraCaptureResult(TagBundle tagBundle, CaptureResult captureResult) {
        this.f35517a = tagBundle;
        this.f35518b = captureResult;
    }

    /* JADX INFO: renamed from: a */
    public long m15101a() {
        Long l = (Long) this.f35518b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }
}
