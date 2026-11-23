package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: z0.e.a.e.w0, reason: use source file name */
/* JADX INFO: compiled from: CameraBurstCaptureCallback.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraBurstCaptureCallback extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: b */
    public a f35711b = null;

    /* JADX INFO: renamed from: a */
    public final Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> f35710a = new HashMap();

    /* JADX INFO: renamed from: z0.e.a.e.w0$a */
    /* JADX INFO: compiled from: CameraBurstCaptureCallback.java */
    public interface a {
    }

    /* JADX INFO: renamed from: a */
    public final List<CameraCaptureSession.CaptureCallback> m15203a(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = this.f35710a.get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j2) {
        Iterator<CameraCaptureSession.CaptureCallback> it = m15203a(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j2);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = m15203a(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        Iterator<CameraCaptureSession.CaptureCallback> it = m15203a(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = m15203a(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        a aVar = this.f35711b;
        if (aVar != null) {
            ((C7724x) aVar).m15241a(cameraCaptureSession, i, true);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j2) {
        a aVar = this.f35711b;
        if (aVar != null) {
            ((C7724x) aVar).m15241a(cameraCaptureSession, i, false);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j3) {
        Iterator<CameraCaptureSession.CaptureCallback> it = m15203a(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j2, j3);
        }
    }
}
