package p007c.p114h.p115a.p120e;

import android.graphics.SurfaceTexture;
import android.media.ImageReader;
import android.opengl.GLES30;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import android.view.Surface;
import java.lang.ref.WeakReference;
import p007c.p114h.p115a.p116a.CameraParam;
import p007c.p114h.p115a.p119d.PreviewPresenter;
import p007c.p114h.p126d.p128b.EglCore;
import p007c.p114h.p126d.p128b.WindowSurface;
import p007c.p114h.p126d.p129c.p130a.GLImageFilter;
import p007c.p114h.p126d.p129c.p133c.p134e.DynamicColor;
import p007c.p114h.p126d.p129c.p136e.p137c.DynamicMakeup;
import p007c.p114h.p126d.p129c.p141h.p142g.DynamicSticker;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;

/* JADX INFO: renamed from: c.h.a.e.d, reason: use source file name */
/* JADX INFO: compiled from: CameraRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraRenderer extends Thread {

    /* JADX INFO: renamed from: f */
    public final Object f3914f;

    /* JADX INFO: renamed from: g */
    public int f3915g;

    /* JADX INFO: renamed from: h */
    public Looper f3916h;

    /* JADX INFO: renamed from: i */
    public CameraRenderHandler f3917i;

    /* JADX INFO: renamed from: j */
    public GLImageReader f3918j;

    /* JADX INFO: renamed from: k */
    public EglCore f3919k;

    /* JADX INFO: renamed from: l */
    public WindowSurface f3920l;

    /* JADX INFO: renamed from: m */
    public volatile boolean f3921m;

    /* JADX INFO: renamed from: n */
    public WeakReference<SurfaceTexture> f3922n;

    /* JADX INFO: renamed from: o */
    public final float[] f3923o;

    /* JADX INFO: renamed from: p */
    public int f3924p;

    /* JADX INFO: renamed from: q */
    public int f3925q;

    /* JADX INFO: renamed from: r */
    public final RenderManager f3926r;

    /* JADX INFO: renamed from: s */
    public final FrameRateMeter f3927s;

    /* JADX INFO: renamed from: t */
    public CameraParam f3928t;

    /* JADX INFO: renamed from: u */
    public final WeakReference<PreviewPresenter> f3929u;

    /* JADX INFO: renamed from: v */
    public volatile boolean f3930v;

    public CameraRenderer(PreviewPresenter previewPresenter) {
        super("CameraRenderer");
        this.f3914f = new Object();
        this.f3923o = new float[16];
        this.f3924p = -1;
        this.f3915g = -4;
        this.f3929u = new WeakReference<>(previewPresenter);
        this.f3928t = CameraParam.f3841a;
        this.f3926r = new RenderManager();
        this.f3927s = new FrameRateMeter();
        this.f3930v = false;
    }

    /* JADX INFO: renamed from: a */
    public void m2084a(DynamicMakeup dynamicMakeup) {
        synchronized (this.f3914f) {
            this.f3920l.m2123b();
            this.f3926r.m2096d(dynamicMakeup);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2085b(DynamicColor dynamicColor) {
        synchronized (this.f3914f) {
            this.f3920l.m2123b();
            this.f3926r.m2097e(dynamicColor);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2086c(DynamicSticker dynamicSticker) {
        synchronized (this.f3914f) {
            this.f3920l.m2123b();
            this.f3926r.m2098f(dynamicSticker);
        }
    }

    /* JADX INFO: renamed from: d */
    public CameraRenderHandler m2087d() {
        if (this.f3917i == null) {
            this.f3917i = new CameraRenderHandler(m2088e(), this);
        }
        return this.f3917i;
    }

    /* JADX INFO: renamed from: e */
    public final Looper m2088e() {
        if (!isAlive()) {
            return null;
        }
        synchronized (this) {
            while (isAlive() && this.f3916h == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        return this.f3916h;
    }

    /* JADX INFO: renamed from: f */
    public void m2089f(Surface surface) {
        WeakReference<PreviewPresenter> weakReference = this.f3929u;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        Log.d("CameraRenderer", "initRender: ");
        EglCore eglCore = new EglCore(null, 1);
        this.f3919k = eglCore;
        WindowSurface windowSurface = new WindowSurface(eglCore, surface, false);
        this.f3920l = windowSurface;
        windowSurface.m2123b();
        GLES30.glDisable(3024);
        GLES30.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES30.glEnable(2884);
        GLES30.glEnable(2929);
        this.f3926r.m2100h(this.f3929u.get().mo2077a());
        if (this.f3929u.get() != null) {
            this.f3929u.get().mo2078b(this.f3919k.f3991b);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2090g() {
        Log.d("CameraRenderer", "release: ");
        GLImageReader gLImageReader = this.f3918j;
        if (gLImageReader != null) {
            WindowSurface windowSurface = gLImageReader.f3934a;
            if (windowSurface != null) {
                windowSurface.m2123b();
            }
            ImageReader imageReader = gLImageReader.f3936c;
            if (imageReader != null) {
                imageReader.close();
                gLImageReader.f3936c = null;
            }
            GLImageFilter gLImageFilter = gLImageReader.f3938e;
            if (gLImageFilter != null) {
                gLImageFilter.mo2126o();
                gLImageReader.f3938e = null;
            }
            WindowSurface windowSurface2 = gLImageReader.f3934a;
            if (windowSurface2 != null) {
                windowSurface2.m2124c();
                gLImageReader.f3934a = null;
            }
            EglCore eglCore = gLImageReader.f3935b;
            if (eglCore != null) {
                eglCore.m2121c();
                gLImageReader.f3935b = null;
            }
            this.f3918j = null;
        }
        WindowSurface windowSurface3 = this.f3920l;
        if (windowSurface3 != null) {
            windowSurface3.m2123b();
        }
        int i = this.f3924p;
        if (i != -1) {
            OpenGLUtils.m2185j(i);
            this.f3924p = -1;
        }
        RenderManager renderManager = this.f3926r;
        renderManager.m2103k();
        renderManager.m2104l();
        renderManager.f3953l = null;
        WeakReference<SurfaceTexture> weakReference = this.f3922n;
        if (weakReference != null) {
            weakReference.clear();
        }
        WindowSurface windowSurface4 = this.f3920l;
        if (windowSurface4 != null) {
            windowSurface4.m2124c();
            this.f3920l = null;
        }
        EglCore eglCore2 = this.f3919k;
        if (eglCore2 != null) {
            eglCore2.m2121c();
            this.f3919k = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2091h(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            if (this.f3921m) {
                int i = this.f3924p;
                if (i != -1) {
                    OpenGLUtils.m2185j(i);
                }
                int iM2180e = OpenGLUtils.m2180e();
                this.f3924p = iM2180e;
                try {
                    surfaceTexture.attachToGLContext(iM2180e);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.f3921m = false;
            }
        }
        try {
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(this.f3923o);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        synchronized (this) {
            this.f3916h = Looper.myLooper();
            notifyAll();
        }
        Process.setThreadPriority(this.f3915g);
        Looper.loop();
        m2087d().m2083a();
        m2087d().removeCallbacksAndMessages(null);
        m2090g();
        this.f3930v = false;
        Log.d("CameraRenderer", "Thread has delete!");
    }
}
