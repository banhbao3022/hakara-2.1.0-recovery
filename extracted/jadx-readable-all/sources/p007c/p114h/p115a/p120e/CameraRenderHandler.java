package p007c.p114h.p115a.p120e;

import android.graphics.SurfaceTexture;
import android.opengl.GLES30;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import p007c.p114h.p115a.p117b.CameraPreviewFragment2;
import p007c.p114h.p115a.p118c.OnFpsListener;
import p007c.p114h.p115a.p119d.CameraPreviewPresenter;
import p007c.p114h.p126d.p128b.EglCore;
import p007c.p114h.p126d.p128b.WindowSurface;
import p007c.p114h.p126d.p129c.p130a.GLImageOESInputFilter;
import p007c.p114h.p126d.p129c.p131b.p132g.IBeautify;
import p007c.p114h.p126d.p129c.p133c.p134e.DynamicColor;
import p007c.p114h.p126d.p129c.p136e.p137c.DynamicMakeup;
import p007c.p114h.p126d.p129c.p141h.p142g.DynamicSticker;
import p007c.p114h.p144e.LandmarkEngine;

/* JADX INFO: renamed from: c.h.a.e.c, reason: use source file name */
/* JADX INFO: compiled from: CameraRenderHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraRenderHandler extends Handler {

    /* JADX INFO: renamed from: a */
    public ArrayList<Runnable> f3912a;

    /* JADX INFO: renamed from: b */
    public final WeakReference<CameraRenderer> f3913b;

    public CameraRenderHandler(Looper looper, CameraRenderer cameraRenderer) {
        super(looper);
        this.f3912a = new ArrayList<>();
        this.f3913b = new WeakReference<>(cameraRenderer);
    }

    /* JADX INFO: renamed from: a */
    public void m2083a() {
        synchronized (this) {
            while (!this.f3912a.isEmpty()) {
                Runnable runnableRemove = this.f3912a.remove(0);
                if (runnableRemove != null) {
                    runnableRemove.run();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public void handleMessage(Message message) {
        WeakReference<SurfaceTexture> weakReference;
        long timestamp;
        if (this.f3913b.get() == null) {
            return;
        }
        m2083a();
        CameraRenderer cameraRenderer = this.f3913b.get();
        switch (message.what) {
            case 1:
                Object obj = message.obj;
                if (obj instanceof SurfaceHolder) {
                    cameraRenderer.m2089f(((SurfaceHolder) obj).getSurface());
                    return;
                }
                if (obj instanceof Surface) {
                    cameraRenderer.m2089f((Surface) obj);
                    return;
                }
                if (obj instanceof SurfaceTexture) {
                    Objects.requireNonNull(cameraRenderer);
                    Log.d("CameraRenderer", "initRender: ");
                    EglCore eglCore = new EglCore(null, 1);
                    cameraRenderer.f3919k = eglCore;
                    WindowSurface windowSurface = new WindowSurface(eglCore, (SurfaceTexture) obj);
                    cameraRenderer.f3920l = windowSurface;
                    windowSurface.m2123b();
                    GLES30.glDisable(3024);
                    GLES30.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES30.glEnable(2884);
                    GLES30.glEnable(2929);
                    cameraRenderer.f3926r.m2100h(cameraRenderer.f3929u.get().mo2077a());
                    if (cameraRenderer.f3929u.get() != null) {
                        cameraRenderer.f3929u.get().mo2078b(cameraRenderer.f3919k.f3991b);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                int i = message.arg1;
                int i2 = message.arg2;
                RenderManager renderManager = cameraRenderer.f3926r;
                renderManager.f3948g = i;
                renderManager.f3949h = i2;
                if (renderManager.f3950i == 0 || renderManager.f3951j == 0) {
                    return;
                }
                renderManager.m2094b();
                renderManager.m2102j();
                return;
            case 3:
                cameraRenderer.m2090g();
                return;
            case 4:
                if (cameraRenderer.f3920l == null || (weakReference = cameraRenderer.f3922n) == null || weakReference.get() == null) {
                    return;
                }
                cameraRenderer.f3920l.m2123b();
                synchronized (cameraRenderer) {
                    SurfaceTexture surfaceTexture = cameraRenderer.f3922n.get();
                    cameraRenderer.m2091h(surfaceTexture);
                    timestamp = surfaceTexture.getTimestamp();
                    break;
                }
                int iMo2130e = cameraRenderer.f3924p;
                if (iMo2130e == -1) {
                    return;
                }
                RenderManager renderManager2 = cameraRenderer.f3926r;
                float[] fArr = cameraRenderer.f3923o;
                if (renderManager2.f3942a.get(0) != null && renderManager2.f3942a.get(8) != null) {
                    if (renderManager2.f3942a.get(0) instanceof GLImageOESInputFilter) {
                        ((GLImageOESInputFilter) renderManager2.f3942a.get(0)).f4066w = fArr;
                    }
                    iMo2130e = renderManager2.f3942a.get(0).mo2130e(iMo2130e, renderManager2.f3944c, renderManager2.f3945d);
                    Objects.requireNonNull(renderManager2.f3952k);
                    if (renderManager2.f3942a.get(1) != null) {
                        if ((renderManager2.f3942a.get(1) instanceof IBeautify) && renderManager2.f3952k.f3847g != null) {
                            ((IBeautify) renderManager2.f3942a.get(1)).mo2149a(renderManager2.f3952k.f3847g);
                        }
                        iMo2130e = renderManager2.f3942a.get(1).mo2130e(iMo2130e, renderManager2.f3944c, renderManager2.f3945d);
                    }
                    renderManager2.f3942a.get(8).mo2129d(iMo2130e, renderManager2.f3946e, renderManager2.f3947f);
                }
                cameraRenderer.f3925q = iMo2130e;
                if (cameraRenderer.f3929u.get() != null) {
                    cameraRenderer.f3929u.get().mo2079c(cameraRenderer.f3925q, timestamp);
                }
                RenderManager renderManager3 = cameraRenderer.f3926r;
                int i3 = cameraRenderer.f3925q;
                if (renderManager3.f3942a.get(9) != null && renderManager3.f3952k.f3842b && LandmarkEngine.b.f4266a.m2193c()) {
                    renderManager3.f3942a.get(9).mo2129d(i3, renderManager3.f3946e, renderManager3.f3947f);
                }
                cameraRenderer.f3920l.m2125d();
                synchronized (cameraRenderer.f3914f) {
                    Objects.requireNonNull(cameraRenderer.f3928t);
                    break;
                }
                if (cameraRenderer.f3928t.f3846f != null) {
                    FrameRateMeter frameRateMeter = cameraRenderer.f3927s;
                    Objects.requireNonNull(frameRateMeter);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (frameRateMeter.f3933c == 0) {
                        frameRateMeter.f3933c = jCurrentTimeMillis;
                    }
                    long j2 = jCurrentTimeMillis - frameRateMeter.f3933c;
                    if (j2 > 1000) {
                        frameRateMeter.f3932b = (frameRateMeter.f3931a / j2) * 1000.0f;
                        frameRateMeter.f3933c = jCurrentTimeMillis;
                        frameRateMeter.f3931a = 0;
                    }
                    frameRateMeter.f3931a++;
                    OnFpsListener onFpsListener = cameraRenderer.f3928t.f3846f;
                    Objects.requireNonNull(cameraRenderer.f3927s);
                    System.currentTimeMillis();
                    T t = ((CameraPreviewPresenter) onFpsListener).f3908a;
                    if (t != 0) {
                        ((CameraPreviewFragment2) t).m2071b1();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                DynamicColor dynamicColor = (DynamicColor) message.obj;
                synchronized (cameraRenderer.f3914f) {
                    cameraRenderer.f3920l.m2123b();
                    cameraRenderer.f3926r.m2095c(dynamicColor);
                    break;
                }
                return;
            case 6:
                Object obj2 = message.obj;
                if (obj2 == null) {
                    cameraRenderer.m2084a(null);
                    return;
                } else {
                    cameraRenderer.m2084a((DynamicMakeup) obj2);
                    return;
                }
            case 7:
                Object obj3 = message.obj;
                if (obj3 == null) {
                    cameraRenderer.m2086c(null);
                    return;
                } else if (obj3 instanceof DynamicColor) {
                    cameraRenderer.m2085b((DynamicColor) obj3);
                    return;
                } else {
                    if (obj3 instanceof DynamicSticker) {
                        cameraRenderer.m2086c((DynamicSticker) obj3);
                        return;
                    }
                    return;
                }
            case 8:
                boolean zBooleanValue = ((Boolean) message.obj).booleanValue();
                synchronized (cameraRenderer.f3914f) {
                    cameraRenderer.f3920l.m2123b();
                    cameraRenderer.f3926r.m2099g(zBooleanValue);
                    break;
                }
                return;
            default:
                return;
        }
    }
}
