package p007c.p190n.p194b.p209b.p212b2;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: renamed from: c.n.b.b.b2.m, reason: use source file name */
/* JADX INFO: compiled from: EGLSurfaceTexture.java */
/* JADX INFO: loaded from: classes.dex */
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: f */
    public static final int[] f6332f = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: g */
    public final Handler f6333g;

    /* JADX INFO: renamed from: h */
    public final int[] f6334h;

    /* JADX INFO: renamed from: i */
    public final c f6335i;

    /* JADX INFO: renamed from: j */
    public EGLDisplay f6336j;

    /* JADX INFO: renamed from: k */
    public EGLContext f6337k;

    /* JADX INFO: renamed from: l */
    public EGLSurface f6338l;

    /* JADX INFO: renamed from: m */
    public SurfaceTexture f6339m;

    /* JADX INFO: renamed from: c.n.b.b.b2.m$b */
    /* JADX INFO: compiled from: EGLSurfaceTexture.java */
    public static final class b extends RuntimeException {
        public b(String str, a aVar) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.b2.m$c */
    /* JADX INFO: compiled from: EGLSurfaceTexture.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        void m3143a();
    }

    public EGLSurfaceTexture(Handler handler) {
        this(handler, null);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f6333g.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        c cVar = this.f6335i;
        if (cVar != null) {
            cVar.m3143a();
        }
        SurfaceTexture surfaceTexture = this.f6339m;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public EGLSurfaceTexture(Handler handler, c cVar) {
        this.f6333g = handler;
        this.f6335i = cVar;
        this.f6334h = new int[1];
    }
}
