package p007c.p114h.p126d.p128b;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.h.d.b.b, reason: use source file name */
/* JADX INFO: compiled from: WindowSurface.java */
/* JADX INFO: loaded from: classes.dex */
public class WindowSurface {

    /* JADX INFO: renamed from: a */
    public EglCore f3993a;

    /* JADX INFO: renamed from: b */
    public EGLSurface f3994b = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: c */
    public Surface f3995c;

    /* JADX INFO: renamed from: d */
    public boolean f3996d;

    public WindowSurface(EglCore eglCore, SurfaceTexture surfaceTexture) {
        this.f3993a = eglCore;
        m2122a(surfaceTexture);
    }

    /* JADX INFO: renamed from: a */
    public void m2122a(Object obj) {
        if (this.f3994b != EGL14.EGL_NO_SURFACE) {
            throw new IllegalStateException("surface already created");
        }
        EglCore eglCore = this.f3993a;
        Objects.requireNonNull(eglCore);
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            throw new RuntimeException(outline.m1598t("invalid surface: ", obj));
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eglCore.f3990a, eglCore.f3992c, obj, new int[]{12344}, 0);
        eglCore.m2119a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface == null) {
            throw new RuntimeException("surface was null");
        }
        this.f3994b = eGLSurfaceEglCreateWindowSurface;
    }

    /* JADX INFO: renamed from: b */
    public void m2123b() {
        EglCore eglCore = this.f3993a;
        EGLSurface eGLSurface = this.f3994b;
        if (eglCore.f3990a == EGL14.EGL_NO_DISPLAY) {
            Log.d("EGLCore", "NOTE: makeCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(eglCore.f3990a, eGLSurface, eGLSurface, eglCore.f3991b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2124c() {
        EglCore eglCore = this.f3993a;
        EGL14.eglDestroySurface(eglCore.f3990a, this.f3994b);
        this.f3994b = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f3995c;
        if (surface != null) {
            if (this.f3996d) {
                surface.release();
            }
            this.f3995c = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m2125d() {
        EglCore eglCore = this.f3993a;
        boolean zEglSwapBuffers = EGL14.eglSwapBuffers(eglCore.f3990a, this.f3994b);
        if (!zEglSwapBuffers) {
            Log.d("EglSurfaceBase", "WARNING: swapBuffers() failed");
        }
        return zEglSwapBuffers;
    }

    public WindowSurface(EglCore eglCore, Surface surface, boolean z) {
        this.f3993a = eglCore;
        m2122a(surface);
        this.f3995c = surface;
        this.f3996d = z;
    }
}
