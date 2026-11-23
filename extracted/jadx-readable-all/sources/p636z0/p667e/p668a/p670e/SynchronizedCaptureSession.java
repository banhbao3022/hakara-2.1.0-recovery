package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.List;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p667e.p668a.p670e.p671w1.CameraCaptureSessionCompat;

/* JADX INFO: renamed from: z0.e.a.e.n1, reason: use source file name */
/* JADX INFO: compiled from: SynchronizedCaptureSession.java */
/* JADX INFO: loaded from: classes.dex */
public interface SynchronizedCaptureSession {

    /* JADX INFO: renamed from: z0.e.a.e.n1$a */
    /* JADX INFO: compiled from: SynchronizedCaptureSession.java */
    public static abstract class a {
        /* JADX INFO: renamed from: k */
        public void mo15154k(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* JADX INFO: renamed from: l */
        public void mo15155l(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* JADX INFO: renamed from: m */
        public void mo15092m(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* JADX INFO: renamed from: n */
        public void mo15093n(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* JADX INFO: renamed from: o */
        public void mo15094o(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* JADX INFO: renamed from: p */
        public void mo15095p(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* JADX INFO: renamed from: q */
        public void mo15156q(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        }
    }

    /* JADX INFO: renamed from: b */
    a mo15146b();

    /* JADX INFO: renamed from: c */
    int mo15147c(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    void close();

    /* JADX INFO: renamed from: d */
    CameraCaptureSessionCompat mo15148d();

    /* JADX INFO: renamed from: e */
    void mo15149e() throws CameraAccessException;

    /* JADX INFO: renamed from: f */
    CameraDevice mo15150f();

    /* JADX INFO: renamed from: g */
    int mo15151g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    /* JADX INFO: renamed from: h */
    void mo15152h() throws CameraAccessException;

    /* JADX INFO: renamed from: j */
    ListenableFuture<Void> mo15153j(String str);
}
