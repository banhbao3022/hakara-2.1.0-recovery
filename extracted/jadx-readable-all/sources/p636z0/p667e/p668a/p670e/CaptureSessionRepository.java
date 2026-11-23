package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraDevice;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p636z0.p667e.p676b.p677v1.DeferrableSurface;

/* JADX INFO: renamed from: z0.e.a.e.f1, reason: use source file name */
/* JADX INFO: compiled from: CaptureSessionRepository.java */
/* JADX INFO: loaded from: classes.dex */
public class CaptureSessionRepository {

    /* JADX INFO: renamed from: a */
    public final Executor f35470a;

    /* JADX INFO: renamed from: b */
    public final Object f35471b = new Object();

    /* JADX INFO: renamed from: c */
    public final Set<SynchronizedCaptureSession> f35472c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public final Set<SynchronizedCaptureSession> f35473d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    public final Set<SynchronizedCaptureSession> f35474e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public final Map<SynchronizedCaptureSession, List<DeferrableSurface>> f35475f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final CameraDevice.StateCallback f35476g = new a();

    /* JADX INFO: renamed from: z0.e.a.e.f1$a */
    /* JADX INFO: compiled from: CaptureSessionRepository.java */
    public class a extends CameraDevice.StateCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            CaptureSessionRepository.this.f35470a.execute(new RunnableC7726y(this));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            CaptureSessionRepository.this.f35470a.execute(new RunnableC7726y(this));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public CaptureSessionRepository(Executor executor) {
        this.f35470a = executor;
    }
}
