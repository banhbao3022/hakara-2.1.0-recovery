package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: z0.e.a.e.q0, reason: use source file name */
/* JADX INFO: compiled from: Camera2CaptureCallbacks.java */
/* JADX INFO: loaded from: classes.dex */
public final class Camera2CaptureCallbacks extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a */
    public final List<CameraCaptureSession.CaptureCallback> f35651a = new ArrayList();

    public Camera2CaptureCallbacks(List<CameraCaptureSession.CaptureCallback> list) {
        for (CameraCaptureSession.CaptureCallback captureCallback : list) {
            if (!(captureCallback instanceof Camera2CaptureCallbacks2)) {
                this.f35651a.add(captureCallback);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j2) {
        Iterator<CameraCaptureSession.CaptureCallback> it = this.f35651a.iterator();
        while (it.hasNext()) {
            it.next().onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j2);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = this.f35651a.iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        Iterator<CameraCaptureSession.CaptureCallback> it = this.f35651a.iterator();
        while (it.hasNext()) {
            it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = this.f35651a.iterator();
        while (it.hasNext()) {
            it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        Iterator<CameraCaptureSession.CaptureCallback> it = this.f35651a.iterator();
        while (it.hasNext()) {
            it.next().onCaptureSequenceAborted(cameraCaptureSession, i);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j2) {
        Iterator<CameraCaptureSession.CaptureCallback> it = this.f35651a.iterator();
        while (it.hasNext()) {
            it.next().onCaptureSequenceCompleted(cameraCaptureSession, i, j2);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j3) {
        Iterator<CameraCaptureSession.CaptureCallback> it = this.f35651a.iterator();
        while (it.hasNext()) {
            it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j2, j3);
        }
    }
}
