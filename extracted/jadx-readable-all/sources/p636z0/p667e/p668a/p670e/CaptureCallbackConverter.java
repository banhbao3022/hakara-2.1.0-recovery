package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraCaptureSession;
import java.util.List;
import java.util.Objects;
import p636z0.p667e.p676b.p677v1.CameraCaptureCallback;
import p636z0.p667e.p676b.p677v1.CameraCaptureCallbacks;

/* JADX INFO: renamed from: z0.e.a.e.d1, reason: use source file name */
/* JADX INFO: compiled from: CaptureCallbackConverter.java */
/* JADX INFO: loaded from: classes.dex */
public final class CaptureCallbackConverter {
    /* JADX INFO: renamed from: a */
    public static void m15079a(CameraCaptureCallback cameraCaptureCallback, List<CameraCaptureSession.CaptureCallback> list) {
        if (cameraCaptureCallback instanceof CameraCaptureCallbacks) {
            Objects.requireNonNull((CameraCaptureCallbacks) cameraCaptureCallback);
            throw null;
        }
        if (cameraCaptureCallback instanceof CaptureCallbackContainer) {
            list.add(((CaptureCallbackContainer) cameraCaptureCallback).f35434a);
        } else {
            list.add(new CaptureCallbackAdapter(cameraCaptureCallback));
        }
    }
}
