package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraCaptureSession;
import java.util.Objects;
import p636z0.p667e.p676b.p677v1.CameraCaptureCallback;

/* JADX INFO: renamed from: z0.e.a.e.c1, reason: use source file name */
/* JADX INFO: compiled from: CaptureCallbackContainer.java */
/* JADX INFO: loaded from: classes.dex */
public final class CaptureCallbackContainer extends CameraCaptureCallback {

    /* JADX INFO: renamed from: a */
    public final CameraCaptureSession.CaptureCallback f35434a;

    public CaptureCallbackContainer(CameraCaptureSession.CaptureCallback captureCallback) {
        Objects.requireNonNull(captureCallback, "captureCallback is null");
        this.f35434a = captureCallback;
    }
}
