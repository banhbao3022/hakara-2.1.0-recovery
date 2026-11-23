package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Objects;
import p636z0.p667e.p676b.p677v1.CameraCaptureCallback;
import p636z0.p667e.p676b.p677v1.CameraCaptureFailure;
import p636z0.p667e.p676b.p677v1.TagBundle;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.a.e.b1, reason: use source file name */
/* JADX INFO: compiled from: CaptureCallbackAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class CaptureCallbackAdapter extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a */
    public final CameraCaptureCallback f35430a;

    public CaptureCallbackAdapter(CameraCaptureCallback cameraCaptureCallback) {
        Objects.requireNonNull(cameraCaptureCallback, "cameraCaptureCallback is null");
        this.f35430a = cameraCaptureCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        TagBundle tagBundle;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            C8162a.m16061f(tag instanceof TagBundle, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            tagBundle = (TagBundle) tag;
        } else {
            tagBundle = TagBundle.f36212a;
        }
        this.f35430a.mo15131b(new Camera2CameraCaptureResult(tagBundle, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f35430a.mo15132c(new CameraCaptureFailure(CameraCaptureFailure.a.ERROR));
    }
}
