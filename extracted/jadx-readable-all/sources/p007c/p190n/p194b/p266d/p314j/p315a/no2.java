package p007c.p190n.p194b.p266d.p314j.p315a;

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
import android.util.Log;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class no2 extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* JADX INFO: renamed from: f */
    public final int[] f17188f;

    /* JADX INFO: renamed from: g */
    public Handler f17189g;

    /* JADX INFO: renamed from: h */
    public SurfaceTexture f17190h;

    /* JADX INFO: renamed from: i */
    public Error f17191i;

    /* JADX INFO: renamed from: j */
    public RuntimeException f17192j;

    /* JADX INFO: renamed from: k */
    public oo2 f17193k;

    public no2() {
        super("dummySurface");
        this.f17188f = new int[1];
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i == 2) {
                    this.f17190h.updateTexImage();
                    return true;
                }
                if (i != 3) {
                    return true;
                }
                try {
                    try {
                        this.f17190h.release();
                        this.f17193k = null;
                        this.f17190h = null;
                        GLES20.glDeleteTextures(1, this.f17188f, 0);
                    } catch (Throwable th) {
                        this.f17193k = null;
                        this.f17190h = null;
                        GLES20.glDeleteTextures(1, this.f17188f, 0);
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        Log.e("DummySurface", "Failed to release dummy surface", th2);
                    } finally {
                        quit();
                    }
                }
                return true;
            }
            try {
                boolean z = message.arg1 != 0;
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                C2622l.m5363e3(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
                int[] iArr = new int[2];
                C2622l.m5363e3(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                C2622l.m5363e3(EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                C2622l.m5363e3(eGLContextEglCreateContext != null, "eglCreateContext failed");
                EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                C2622l.m5363e3(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                C2622l.m5363e3(EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), "eglMakeCurrent failed");
                GLES20.glGenTextures(1, this.f17188f, 0);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f17188f[0]);
                this.f17190h = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this);
                this.f17193k = new oo2(this, this.f17190h);
                synchronized (this) {
                    notify();
                }
            } catch (Error e) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e);
                this.f17191i = e;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                this.f17192j = e2;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f17189g.sendEmptyMessage(2);
    }
}
