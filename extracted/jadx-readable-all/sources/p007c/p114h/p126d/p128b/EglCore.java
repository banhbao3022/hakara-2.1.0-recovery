package p007c.p114h.p126d.p128b;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Log;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.h.d.b.a, reason: use source file name */
/* JADX INFO: compiled from: EglCore.java */
/* JADX INFO: loaded from: classes.dex */
public final class EglCore {

    /* JADX INFO: renamed from: a */
    public EGLDisplay f3990a;

    /* JADX INFO: renamed from: b */
    public EGLContext f3991b;

    /* JADX INFO: renamed from: c */
    public EGLConfig f3992c;

    public EglCore() {
        this(null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m2119a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbM1561L = outline.m1561L(str, ": EGL error: 0x");
        sbM1561L.append(Integer.toHexString(iEglGetError));
        throw new RuntimeException(sbM1561L.toString());
    }

    /* JADX INFO: renamed from: b */
    public final EGLConfig m2120b(int i, int i2) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, i2 >= 3 ? 68 : 4, 12344, 0, 12344};
        if ((i & 1) != 0) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.f3990a, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        Log.w("EGLCore", "unable to find RGB8888 / " + i2 + " EGLConfig");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m2121c() {
        EGLDisplay eGLDisplay = this.f3990a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f3990a, this.f3991b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f3990a);
        }
        this.f3990a = EGL14.EGL_NO_DISPLAY;
        this.f3991b = EGL14.EGL_NO_CONTEXT;
        this.f3992c = null;
    }

    public void finalize() throws Throwable {
        try {
            if (this.f3990a != EGL14.EGL_NO_DISPLAY) {
                Log.w("EGLCore", "WARNING: EglCore was not explicitly released -- state may be leaked");
                m2121c();
            }
        } finally {
            super.finalize();
        }
    }

    public EglCore(EGLContext eGLContext, int i) {
        EGLConfig eGLConfigM2120b;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.f3990a = eGLDisplay;
        this.f3991b = EGL14.EGL_NO_CONTEXT;
        this.f3992c = null;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("EGL already set up");
        }
        eGLContext = eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f3990a = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            this.f3990a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        if ((i & 2) != 0 && (eGLConfigM2120b = m2120b(i, 3)) != null) {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f3990a, eGLConfigM2120b, eGLContext, new int[]{12440, 3, 12344}, 0);
            if (EGL14.eglGetError() == 12288) {
                this.f3992c = eGLConfigM2120b;
                this.f3991b = eGLContextEglCreateContext;
            }
        }
        if (this.f3991b == EGL14.EGL_NO_CONTEXT) {
            EGLConfig eGLConfigM2120b2 = m2120b(i, 2);
            if (eGLConfigM2120b2 == null) {
                throw new RuntimeException("Unable to find a suitable EGLConfig");
            }
            EGLContext eGLContextEglCreateContext2 = EGL14.eglCreateContext(this.f3990a, eGLConfigM2120b2, eGLContext, new int[]{12440, 2, 12344}, 0);
            m2119a("eglCreateContext");
            this.f3992c = eGLConfigM2120b2;
            this.f3991b = eGLContextEglCreateContext2;
        }
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f3990a, this.f3991b, 12440, iArr2, 0);
        Log.d("EGLCore", "EGLContext created, client version " + iArr2[0]);
    }
}
