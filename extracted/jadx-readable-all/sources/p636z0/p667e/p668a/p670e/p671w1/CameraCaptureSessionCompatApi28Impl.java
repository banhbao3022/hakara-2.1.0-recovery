package p636z0.p667e.p668a.p670e.p671w1;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z0.e.a.e.w1.c, reason: use source file name */
/* JADX INFO: compiled from: CameraCaptureSessionCompatApi28Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraCaptureSessionCompatApi28Impl extends CameraCaptureSessionCompatBaseImpl {
    public CameraCaptureSessionCompatApi28Impl(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraCaptureSessionCompatBaseImpl, p636z0.p667e.p668a.p670e.p671w1.CameraCaptureSessionCompat.a
    /* JADX INFO: renamed from: a */
    public int mo15207a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f35763a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraCaptureSessionCompatBaseImpl, p636z0.p667e.p668a.p670e.p671w1.CameraCaptureSessionCompat.a
    /* JADX INFO: renamed from: b */
    public int mo15208b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f35763a.captureBurstRequests(list, executor, captureCallback);
    }
}
