package p636z0.p667e.p668a.p670e.p671w1;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z0.e.a.e.w1.d, reason: use source file name */
/* JADX INFO: compiled from: CameraCaptureSessionCompatBaseImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraCaptureSessionCompatBaseImpl implements CameraCaptureSessionCompat.a {

    /* JADX INFO: renamed from: a */
    public final CameraCaptureSession f35763a;

    /* JADX INFO: renamed from: b */
    public final Object f35764b;

    /* JADX INFO: renamed from: z0.e.a.e.w1.d$a */
    /* JADX INFO: compiled from: CameraCaptureSessionCompatBaseImpl.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Handler f35765a;

        public a(Handler handler) {
            this.f35765a = handler;
        }
    }

    public CameraCaptureSessionCompatBaseImpl(CameraCaptureSession cameraCaptureSession, Object obj) {
        Objects.requireNonNull(cameraCaptureSession);
        this.f35763a = cameraCaptureSession;
        this.f35764b = obj;
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraCaptureSessionCompat.a
    /* JADX INFO: renamed from: a */
    public int mo15207a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f35763a.setRepeatingRequest(captureRequest, new CameraCaptureSessionCompat.b(executor, captureCallback), ((a) this.f35764b).f35765a);
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraCaptureSessionCompat.a
    /* JADX INFO: renamed from: b */
    public int mo15208b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f35763a.captureBurst(list, new CameraCaptureSessionCompat.b(executor, captureCallback), ((a) this.f35764b).f35765a);
    }
}
