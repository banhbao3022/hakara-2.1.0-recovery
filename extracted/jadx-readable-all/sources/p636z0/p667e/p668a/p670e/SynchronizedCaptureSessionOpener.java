package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat;
import p636z0.p667e.p676b.p677v1.DeferrableSurface;

/* JADX INFO: renamed from: z0.e.a.e.r1, reason: use source file name */
/* JADX INFO: compiled from: SynchronizedCaptureSessionOpener.java */
/* JADX INFO: loaded from: classes.dex */
public final class SynchronizedCaptureSessionOpener {

    /* JADX INFO: renamed from: a */
    public final b f35666a;

    /* JADX INFO: renamed from: z0.e.a.e.r1$a */
    /* JADX INFO: compiled from: SynchronizedCaptureSessionOpener.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Executor f35667a;

        /* JADX INFO: renamed from: b */
        public final ScheduledExecutorService f35668b;

        /* JADX INFO: renamed from: c */
        public final Handler f35669c;

        /* JADX INFO: renamed from: d */
        public final CaptureSessionRepository f35670d;

        /* JADX INFO: renamed from: e */
        public final int f35671e;

        /* JADX INFO: renamed from: f */
        public final Set<String> f35672f;

        public a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, CaptureSessionRepository captureSessionRepository, int i) {
            HashSet hashSet = new HashSet();
            this.f35672f = hashSet;
            this.f35667a = executor;
            this.f35668b = scheduledExecutorService;
            this.f35669c = handler;
            this.f35670d = captureSessionRepository;
            this.f35671e = i;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 23) {
                hashSet.add("force_close");
            }
            if (i == 2 || i2 <= 23) {
                hashSet.add("deferrableSurface_close");
            }
            if (i == 2) {
                hashSet.add("wait_for_request");
            }
        }

        /* JADX INFO: renamed from: a */
        public SynchronizedCaptureSessionOpener m15199a() {
            return this.f35672f.isEmpty() ? new SynchronizedCaptureSessionOpener(new SynchronizedCaptureSessionBaseImpl2(this.f35670d, this.f35667a, this.f35668b, this.f35669c)) : new SynchronizedCaptureSessionOpener(new SynchronizedCaptureSessionImpl(this.f35672f, this.f35670d, this.f35667a, this.f35668b, this.f35669c));
        }
    }

    /* JADX INFO: renamed from: z0.e.a.e.r1$b */
    /* JADX INFO: compiled from: SynchronizedCaptureSessionOpener.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        ListenableFuture<List<Surface>> mo15188a(List<DeferrableSurface> list, long j2);

        /* JADX INFO: renamed from: i */
        ListenableFuture<Void> mo15189i(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat);

        boolean stop();
    }

    public SynchronizedCaptureSessionOpener(b bVar) {
        this.f35666a = bVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m15198a() {
        return this.f35666a.stop();
    }
}
