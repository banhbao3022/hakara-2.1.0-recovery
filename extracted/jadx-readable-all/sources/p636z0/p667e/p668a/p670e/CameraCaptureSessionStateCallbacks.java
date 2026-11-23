package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: z0.e.a.e.x0, reason: use source file name */
/* JADX INFO: compiled from: CameraCaptureSessionStateCallbacks.java */
/* JADX INFO: loaded from: classes.dex */
public final class CameraCaptureSessionStateCallbacks extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a */
    public final List<CameraCaptureSession.StateCallback> f35829a = new ArrayList();

    public CameraCaptureSessionStateCallbacks(List<CameraCaptureSession.StateCallback> list) {
        for (CameraCaptureSession.StateCallback stateCallback : list) {
            if (!(stateCallback instanceof CameraCaptureSessionStateCallbacks2)) {
                this.f35829a.add(stateCallback);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        Iterator<CameraCaptureSession.StateCallback> it = this.f35829a.iterator();
        while (it.hasNext()) {
            it.next().onActive(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        Iterator<CameraCaptureSession.StateCallback> it = this.f35829a.iterator();
        while (it.hasNext()) {
            it.next().onCaptureQueueEmpty(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        Iterator<CameraCaptureSession.StateCallback> it = this.f35829a.iterator();
        while (it.hasNext()) {
            it.next().onClosed(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Iterator<CameraCaptureSession.StateCallback> it = this.f35829a.iterator();
        while (it.hasNext()) {
            it.next().onConfigureFailed(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Iterator<CameraCaptureSession.StateCallback> it = this.f35829a.iterator();
        while (it.hasNext()) {
            it.next().onConfigured(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        Iterator<CameraCaptureSession.StateCallback> it = this.f35829a.iterator();
        while (it.hasNext()) {
            it.next().onReady(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        Iterator<CameraCaptureSession.StateCallback> it = this.f35829a.iterator();
        while (it.hasNext()) {
            it.next().onSurfacePrepared(cameraCaptureSession, surface);
        }
    }
}
