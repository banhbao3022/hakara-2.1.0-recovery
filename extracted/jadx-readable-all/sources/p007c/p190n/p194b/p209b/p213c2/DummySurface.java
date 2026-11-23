package p007c.p190n.p194b.p209b.p213c2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.EGLSurfaceTexture;
import p007c.p190n.p194b.p209b.p212b2.Log;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.c2.m, reason: use source file name */
/* JADX INFO: compiled from: DummySurface.java */
/* JADX INFO: loaded from: classes.dex */
public final class DummySurface extends Surface {

    /* JADX INFO: renamed from: f */
    public static int f6446f;

    /* JADX INFO: renamed from: g */
    public static boolean f6447g;

    /* JADX INFO: renamed from: h */
    public final b f6448h;

    /* JADX INFO: renamed from: i */
    public boolean f6449i;

    /* JADX INFO: renamed from: c.n.b.b.c2.m$b */
    /* JADX INFO: compiled from: DummySurface.java */
    public static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: f */
        public EGLSurfaceTexture f6450f;

        /* JADX INFO: renamed from: g */
        public Handler f6451g;

        /* JADX INFO: renamed from: h */
        public Error f6452h;

        /* JADX INFO: renamed from: i */
        public RuntimeException f6453i;

        /* JADX INFO: renamed from: j */
        public DummySurface f6454j;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        /* JADX INFO: renamed from: a */
        public final void m3262a(int i) {
            EGLSurface eGLSurfaceEglCreatePbufferSurface;
            Objects.requireNonNull(this.f6450f);
            EGLSurfaceTexture eGLSurfaceTexture = this.f6450f;
            Objects.requireNonNull(eGLSurfaceTexture);
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            if (eGLDisplayEglGetDisplay == null) {
                throw new EGLSurfaceTexture.b("eglGetDisplay failed", null);
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                throw new EGLSurfaceTexture.b("eglInitialize failed", null);
            }
            eGLSurfaceTexture.f6336j = eGLDisplayEglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, EGLSurfaceTexture.f6332f, 0, eGLConfigArr, 0, 1, iArr2, 0);
            if (!zEglChooseConfig || iArr2[0] <= 0 || eGLConfigArr[0] == null) {
                throw new EGLSurfaceTexture.b(Util6.m3126n("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), null);
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLSurfaceTexture.f6336j, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            if (eGLContextEglCreateContext == null) {
                throw new EGLSurfaceTexture.b("eglCreateContext failed", null);
            }
            eGLSurfaceTexture.f6337k = eGLContextEglCreateContext;
            EGLDisplay eGLDisplay = eGLSurfaceTexture.f6336j;
            if (i == 1) {
                eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                if (eGLSurfaceEglCreatePbufferSurface == null) {
                    throw new EGLSurfaceTexture.b("eglCreatePbufferSurface failed", null);
                }
            }
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                throw new EGLSurfaceTexture.b("eglMakeCurrent failed", null);
            }
            eGLSurfaceTexture.f6338l = eGLSurfaceEglCreatePbufferSurface;
            GLES20.glGenTextures(1, eGLSurfaceTexture.f6334h, 0);
            C2096e.m4568d();
            SurfaceTexture surfaceTexture = new SurfaceTexture(eGLSurfaceTexture.f6334h[0]);
            eGLSurfaceTexture.f6339m = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(eGLSurfaceTexture);
            SurfaceTexture surfaceTexture2 = this.f6450f.f6339m;
            Objects.requireNonNull(surfaceTexture2);
            this.f6454j = new DummySurface(this, surfaceTexture2, i != 0, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public final void m3263b() {
            Objects.requireNonNull(this.f6450f);
            EGLSurfaceTexture eGLSurfaceTexture = this.f6450f;
            eGLSurfaceTexture.f6333g.removeCallbacks(eGLSurfaceTexture);
            try {
                SurfaceTexture surfaceTexture = eGLSurfaceTexture.f6339m;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, eGLSurfaceTexture.f6334h, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = eGLSurfaceTexture.f6336j;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = eGLSurfaceTexture.f6336j;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = eGLSurfaceTexture.f6338l;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(eGLSurfaceTexture.f6336j, eGLSurfaceTexture.f6338l);
                }
                EGLContext eGLContext = eGLSurfaceTexture.f6337k;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLSurfaceTexture.f6336j, eGLContext);
                }
                if (Util6.f6307a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = eGLSurfaceTexture.f6336j;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(eGLSurfaceTexture.f6336j);
                }
                eGLSurfaceTexture.f6336j = null;
                eGLSurfaceTexture.f6337k = null;
                eGLSurfaceTexture.f6338l = null;
                eGLSurfaceTexture.f6339m = null;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        m3263b();
                    } catch (Throwable th) {
                        try {
                            Log.m3154b("DummySurface", "Failed to release dummy surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    m3262a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    Log.m3154b("DummySurface", "Failed to initialize dummy surface", e);
                    this.f6452h = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    Log.m3154b("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f6453i = e2;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    public DummySurface(b bVar, SurfaceTexture surfaceTexture, boolean z, a aVar) {
        super(surfaceTexture);
        this.f6448h = bVar;
    }

    /* JADX INFO: renamed from: a */
    public static int m3259a(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i = Util6.f6307a;
        boolean z = false;
        if (!(i >= 24 && (i >= 26 || !("samsung".equals(Util6.f6309c) || "XT1650".equals(Util6.f6310d))) && ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_EXT_protected_content")))) {
            return 0;
        }
        if (i >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context")) {
            z = true;
        }
        return z ? 1 : 2;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized boolean m3260b(Context context) {
        if (!f6447g) {
            f6446f = m3259a(context);
            f6447g = true;
        }
        return f6446f != 0;
    }

    /* JADX INFO: renamed from: c */
    public static DummySurface m3261c(Context context, boolean z) {
        boolean z2 = false;
        C2096e.m4570f(!z || m3260b(context));
        b bVar = new b();
        int i = z ? f6446f : 0;
        bVar.start();
        Handler handler = new Handler(bVar.getLooper(), bVar);
        bVar.f6451g = handler;
        bVar.f6450f = new EGLSurfaceTexture(handler);
        synchronized (bVar) {
            bVar.f6451g.obtainMessage(1, i, 0).sendToTarget();
            while (bVar.f6454j == null && bVar.f6453i == null && bVar.f6452h == null) {
                try {
                    bVar.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = bVar.f6453i;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = bVar.f6452h;
        if (error != null) {
            throw error;
        }
        DummySurface dummySurface = bVar.f6454j;
        Objects.requireNonNull(dummySurface);
        return dummySurface;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f6448h) {
            if (!this.f6449i) {
                b bVar = this.f6448h;
                Objects.requireNonNull(bVar.f6451g);
                bVar.f6451g.sendEmptyMessage(2);
                this.f6449i = true;
            }
        }
    }
}
