package p636z0.p667e.p668a.p670e.p671w1;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z0.e.a.e.w1.b, reason: use source file name */
/* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class CameraCaptureSessionCompat {

    /* JADX INFO: renamed from: a */
    public final a f35714a;

    /* JADX INFO: renamed from: z0.e.a.e.w1.b$a */
    /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        int mo15207a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        /* JADX INFO: renamed from: b */
        int mo15208b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    /* JADX INFO: renamed from: z0.e.a.e.w1.b$b */
    /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        public final CameraCaptureSession.CaptureCallback f35715a;

        /* JADX INFO: renamed from: b */
        public final Executor f35716b;

        /* JADX INFO: renamed from: z0.e.a.e.w1.b$b$a */
        /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraCaptureSession f35717f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ CaptureRequest f35718g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ long f35719h;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ long f35720i;

            public a(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j3) {
                this.f35717f = cameraCaptureSession;
                this.f35718g = captureRequest;
                this.f35719h = j2;
                this.f35720i = j3;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f35715a.onCaptureStarted(this.f35717f, this.f35718g, this.f35719h, this.f35720i);
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
        public class RunnableC8563b implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraCaptureSession f35722f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ CaptureRequest f35723g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ CaptureResult f35724h;

            public RunnableC8563b(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                this.f35722f = cameraCaptureSession;
                this.f35723g = captureRequest;
                this.f35724h = captureResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f35715a.onCaptureProgressed(this.f35722f, this.f35723g, this.f35724h);
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.b$b$c */
        /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
        public class c implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraCaptureSession f35726f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ CaptureRequest f35727g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ TotalCaptureResult f35728h;

            public c(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                this.f35726f = cameraCaptureSession;
                this.f35727g = captureRequest;
                this.f35728h = totalCaptureResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f35715a.onCaptureCompleted(this.f35726f, this.f35727g, this.f35728h);
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.b$b$d */
        /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
        public class d implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraCaptureSession f35730f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ CaptureRequest f35731g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ CaptureFailure f35732h;

            public d(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                this.f35730f = cameraCaptureSession;
                this.f35731g = captureRequest;
                this.f35732h = captureFailure;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f35715a.onCaptureFailed(this.f35730f, this.f35731g, this.f35732h);
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.b$b$e */
        /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
        public class e implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraCaptureSession f35734f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ int f35735g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ long f35736h;

            public e(CameraCaptureSession cameraCaptureSession, int i, long j2) {
                this.f35734f = cameraCaptureSession;
                this.f35735g = i;
                this.f35736h = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f35715a.onCaptureSequenceCompleted(this.f35734f, this.f35735g, this.f35736h);
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.b$b$f */
        /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
        public class f implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraCaptureSession f35738f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ int f35739g;

            public f(CameraCaptureSession cameraCaptureSession, int i) {
                this.f35738f = cameraCaptureSession;
                this.f35739g = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f35715a.onCaptureSequenceAborted(this.f35738f, this.f35739g);
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.b$b$g */
        /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
        public class g implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraCaptureSession f35741f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ CaptureRequest f35742g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ Surface f35743h;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ long f35744i;

            public g(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j2) {
                this.f35741f = cameraCaptureSession;
                this.f35742g = captureRequest;
                this.f35743h = surface;
                this.f35744i = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f35715a.onCaptureBufferLost(this.f35741f, this.f35742g, this.f35743h, this.f35744i);
            }
        }

        public b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f35716b = executor;
            this.f35715a = captureCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j2) {
            this.f35716b.execute(new g(cameraCaptureSession, captureRequest, surface, j2));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f35716b.execute(new c(cameraCaptureSession, captureRequest, totalCaptureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f35716b.execute(new d(cameraCaptureSession, captureRequest, captureFailure));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f35716b.execute(new RunnableC8563b(cameraCaptureSession, captureRequest, captureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            this.f35716b.execute(new f(cameraCaptureSession, i));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j2) {
            this.f35716b.execute(new e(cameraCaptureSession, i, j2));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j3) {
            this.f35716b.execute(new a(cameraCaptureSession, captureRequest, j2, j3));
        }
    }

    /* JADX INFO: renamed from: z0.e.a.e.w1.b$c */
    /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
    public static final class c extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a */
        public final CameraCaptureSession.StateCallback f35746a;

        /* JADX INFO: renamed from: b */
        public final Executor f35747b;

        /* JADX INFO: renamed from: z0.e.a.e.w1.b$c$a */
        /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraCaptureSession f35748f;

            public a(CameraCaptureSession cameraCaptureSession) {
                this.f35748f = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f35746a.onConfigured(this.f35748f);
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.b$c$b */
        /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
        public class b implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraCaptureSession f35750f;

            public b(CameraCaptureSession cameraCaptureSession) {
                this.f35750f = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f35746a.onConfigureFailed(this.f35750f);
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.b$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
        public class RunnableC8564c implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraCaptureSession f35752f;

            public RunnableC8564c(CameraCaptureSession cameraCaptureSession) {
                this.f35752f = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f35746a.onReady(this.f35752f);
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.b$c$d */
        /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
        public class d implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraCaptureSession f35754f;

            public d(CameraCaptureSession cameraCaptureSession) {
                this.f35754f = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f35746a.onActive(this.f35754f);
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.b$c$e */
        /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
        public class e implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraCaptureSession f35756f;

            public e(CameraCaptureSession cameraCaptureSession) {
                this.f35756f = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f35746a.onCaptureQueueEmpty(this.f35756f);
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.b$c$f */
        /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
        public class f implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraCaptureSession f35758f;

            public f(CameraCaptureSession cameraCaptureSession) {
                this.f35758f = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f35746a.onClosed(this.f35758f);
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.w1.b$c$g */
        /* JADX INFO: compiled from: CameraCaptureSessionCompat.java */
        public class g implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CameraCaptureSession f35760f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ Surface f35761g;

            public g(CameraCaptureSession cameraCaptureSession, Surface surface) {
                this.f35760f = cameraCaptureSession;
                this.f35761g = surface;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f35746a.onSurfacePrepared(this.f35760f, this.f35761g);
            }
        }

        public c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f35747b = executor;
            this.f35746a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            this.f35747b.execute(new d(cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            this.f35747b.execute(new e(cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            this.f35747b.execute(new f(cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            this.f35747b.execute(new b(cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            this.f35747b.execute(new a(cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            this.f35747b.execute(new RunnableC8564c(cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            this.f35747b.execute(new g(cameraCaptureSession, surface));
        }
    }

    public CameraCaptureSessionCompat(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f35714a = new CameraCaptureSessionCompatApi28Impl(cameraCaptureSession);
        } else {
            this.f35714a = new CameraCaptureSessionCompatBaseImpl(cameraCaptureSession, new CameraCaptureSessionCompatBaseImpl.a(handler));
        }
    }

    /* JADX INFO: renamed from: a */
    public CameraCaptureSession m15206a() {
        return ((CameraCaptureSessionCompatBaseImpl) this.f35714a).f35763a;
    }
}
