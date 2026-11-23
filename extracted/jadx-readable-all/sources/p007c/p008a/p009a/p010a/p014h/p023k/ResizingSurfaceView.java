package p007c.p008a.p009a.p010a.p014h.p023k;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import p007c.p008a.p009a.p010a.p014h.p023k.p026f.MatrixManager;
import p007c.p008a.p009a.p010a.p014h.p023k.p026f.ScaleType;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.h.k.b, reason: use source file name */
/* JADX INFO: compiled from: ResizingSurfaceView.kt */
/* JADX INFO: loaded from: classes.dex */
public class ResizingSurfaceView extends SurfaceView implements ClearableSurface {

    /* JADX INFO: renamed from: f */
    public static final String f1580f;

    /* JADX INFO: renamed from: g */
    public static final int f1581g;

    /* JADX INFO: renamed from: h */
    public static final int f1582h;

    /* JADX INFO: renamed from: i */
    public static final int[] f1583i;

    /* JADX INFO: renamed from: j */
    public static final int[] f1584j;

    /* JADX INFO: renamed from: k */
    public d f1585k;

    /* JADX INFO: renamed from: l */
    public Point f1586l;

    /* JADX INFO: renamed from: m */
    public Point f1587m;

    /* JADX INFO: renamed from: n */
    public MatrixManager f1588n;

    /* JADX INFO: renamed from: o */
    public View.OnAttachStateChangeListener f1589o;

    /* JADX INFO: renamed from: p */
    public ViewTreeObserver.OnGlobalLayoutListener f1590p;

    /* JADX INFO: renamed from: q */
    public final ReentrantLock f1591q;

    /* JADX INFO: renamed from: r */
    public int f1592r;

    /* JADX INFO: renamed from: s */
    public int f1593s;

    /* JADX INFO: renamed from: t */
    public boolean f1594t;

    /* JADX INFO: renamed from: c.a.a.a.h.k.b$a */
    /* JADX INFO: compiled from: ResizingSurfaceView.kt */
    public final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Intrinsics2.m13089e(view, "view");
            ResizingSurfaceView.this.getGlobalLayoutMatrixListenerLock().lock();
            ResizingSurfaceView.this.getViewTreeObserver().addOnGlobalLayoutListener(ResizingSurfaceView.this.getGlobalLayoutMatrixListener());
            ResizingSurfaceView.this.removeOnAttachStateChangeListener(this);
            ResizingSurfaceView.this.getGlobalLayoutMatrixListenerLock().unlock();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Intrinsics2.m13089e(view, "view");
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.h.k.b$b */
    /* JADX INFO: compiled from: ResizingSurfaceView.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.h.k.b$c */
    /* JADX INFO: compiled from: ResizingSurfaceView.kt */
    public final class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ResizingSurfaceView resizingSurfaceView = ResizingSurfaceView.this;
            resizingSurfaceView.setScaleType(resizingSurfaceView.getMatrixManager().m1199d());
            ResizingSurfaceView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.h.k.b$d */
    /* JADX INFO: compiled from: ResizingSurfaceView.kt */
    public interface d {
        /* JADX INFO: renamed from: a */
        void m1168a(int i, int i2);
    }

    static {
        new b(null);
        f1580f = "ResizingSurfaceView";
        f1581g = 360;
        f1582h = 12440;
        f1583i = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344};
        f1584j = new int[]{12440, 2, 12344};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResizingSurfaceView(Context context) {
        super(context);
        Intrinsics2.m13089e(context, "context");
        this.f1586l = new Point(0, 0);
        this.f1587m = new Point(0, 0);
        this.f1588n = new MatrixManager();
        this.f1589o = new a();
        this.f1590p = new c();
        this.f1591q = new ReentrantLock(true);
        this.f1594t = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m1164b(int i, boolean z) {
        int i2 = z ? i : this.f1592r;
        if (z) {
            i = this.f1593s;
        }
        this.f1592r = i2;
        this.f1593s = i;
        this.f1588n.m1201f(this, (i2 + i) % f1581g);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p023k.ClearableSurface
    /* JADX INFO: renamed from: e */
    public void mo1163e() {
        try {
            EGL egl = EGLContext.getEGL();
            if (egl == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
            }
            EGL10 egl10 = (EGL10) egl;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eGLDisplayEglGetDisplay, null);
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            egl10.eglChooseConfig(eGLDisplayEglGetDisplay, f1583i, eGLConfigArr, 1, new int[1]);
            EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, f1584j);
            EGLSurface eGLSurfaceEglCreateWindowSurface = egl10.eglCreateWindowSurface(eGLDisplayEglGetDisplay, eGLConfigArr[0], this, new int[]{12344});
            egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, eGLContextEglCreateContext);
            egl10.eglSwapBuffers(eGLDisplayEglGetDisplay, eGLSurfaceEglCreateWindowSurface);
            egl10.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreateWindowSurface);
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
            egl10.eglTerminate(eGLDisplayEglGetDisplay);
        } catch (Exception e) {
            Log.e(f1580f, "Error clearing surface", e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1165g(int i, int i2) {
        Point point = this.f1586l;
        if (point.x == i && point.y == i2) {
            return;
        }
        point.x = i;
        point.y = i2;
        m1166h();
        d dVar = this.f1585k;
        if (dVar != null) {
            dVar.m1168a(i, i2);
        }
    }

    public final View.OnAttachStateChangeListener getAttachedListener() {
        return this.f1589o;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener getGlobalLayoutMatrixListener() {
        return this.f1590p;
    }

    public final ReentrantLock getGlobalLayoutMatrixListenerLock() {
        return this.f1591q;
    }

    public final Point getLastNotifiedSize() {
        return this.f1586l;
    }

    public final MatrixManager getMatrixManager() {
        return this.f1588n;
    }

    public final boolean getMeasureBasedOnAspectRatio() {
        return this.f1594t;
    }

    public final d getOnSizeChangeListener() {
        return this.f1585k;
    }

    public final int getRequestedConfigurationRotation() {
        return this.f1593s;
    }

    public final int getRequestedUserRotation() {
        return this.f1592r;
    }

    public final ScaleType getScaleType() {
        return this.f1588n.m1199d();
    }

    public final Point getVideoSize() {
        return this.f1587m;
    }

    /* JADX INFO: renamed from: h */
    public final void m1166h() {
        this.f1591q.lock();
        if (getWindowToken() == null) {
            addOnAttachStateChangeListener(this.f1589o);
        } else {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f1590p);
        }
        this.f1591q.unlock();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1167i(int i, int i2) {
        this.f1588n.m1203h(i, i2);
        m1166h();
        Point point = this.f1587m;
        point.x = i;
        point.y = i2;
        return (i == 0 || i2 == 0) ? false : true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics2.m13089e(configuration, "newConfig");
        m1166h();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (!this.f1594t) {
            super.onMeasure(i, i2);
            m1165g(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        int defaultSize = View.getDefaultSize(this.f1587m.x, i);
        int defaultSize2 = View.getDefaultSize(this.f1587m.y, i2);
        Point point = this.f1587m;
        if (point.x <= 0 || point.y <= 0) {
            setMeasuredDimension(defaultSize, defaultSize2);
            m1165g(defaultSize, defaultSize2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            Point point2 = this.f1587m;
            int i4 = point2.x;
            int i5 = i4 * size2;
            int i6 = point2.y;
            if (i5 < size * i6) {
                size = (i4 * size2) / i6;
            } else if (i4 * size2 > size * i6) {
                size2 = (i6 * size) / i4;
            }
        } else if (mode == 1073741824) {
            Point point3 = this.f1587m;
            int i7 = (point3.y * size) / point3.x;
            if (mode2 != Integer.MIN_VALUE || i7 <= size2) {
                size2 = i7;
            }
        } else if (mode2 == 1073741824) {
            Point point4 = this.f1587m;
            int i8 = (point4.x * size2) / point4.y;
            if (mode != Integer.MIN_VALUE || i8 <= size) {
                size = i8;
            }
        } else {
            Point point5 = this.f1587m;
            int i9 = point5.x;
            int i10 = point5.y;
            if (mode2 != Integer.MIN_VALUE || i10 <= size2) {
                size2 = i10;
                i3 = i9;
            } else {
                i3 = (size2 * i9) / i10;
            }
            if (mode != Integer.MIN_VALUE || i3 <= size) {
                size = i3;
            } else {
                size2 = (i10 * size) / i9;
            }
        }
        setMeasuredDimension(size, size2);
        m1165g(size, size2);
    }

    public final void setAttachedListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        Intrinsics2.m13089e(onAttachStateChangeListener, "<set-?>");
        this.f1589o = onAttachStateChangeListener;
    }

    public final void setGlobalLayoutMatrixListener(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        Intrinsics2.m13089e(onGlobalLayoutListener, "<set-?>");
        this.f1590p = onGlobalLayoutListener;
    }

    public final void setLastNotifiedSize(Point point) {
        Intrinsics2.m13089e(point, "<set-?>");
        this.f1586l = point;
    }

    public final void setMatrixManager(MatrixManager matrixManager) {
        Intrinsics2.m13089e(matrixManager, "<set-?>");
        this.f1588n = matrixManager;
    }

    public final void setMeasureBasedOnAspectRatio(boolean z) {
        this.f1594t = z;
    }

    public final void setMeasureBasedOnAspectRatioEnabled(boolean z) {
        this.f1594t = z;
        requestLayout();
    }

    public final void setOnSizeChangeListener(d dVar) {
        this.f1585k = dVar;
    }

    public final void setRequestedConfigurationRotation(int i) {
        this.f1593s = i;
    }

    public final void setRequestedUserRotation(int i) {
        this.f1592r = i;
    }

    public final void setScaleType(ScaleType scaleType) {
        Intrinsics2.m13089e(scaleType, "scaleType");
        this.f1588n.m1202g(this, scaleType);
    }

    public final void setVideoSize(Point point) {
        Intrinsics2.m13089e(point, "<set-?>");
        this.f1587m = point;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResizingSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f1586l = new Point(0, 0);
        this.f1587m = new Point(0, 0);
        this.f1588n = new MatrixManager();
        this.f1589o = new a();
        this.f1590p = new c();
        this.f1591q = new ReentrantLock(true);
        this.f1594t = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResizingSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f1586l = new Point(0, 0);
        this.f1587m = new Point(0, 0);
        this.f1588n = new MatrixManager();
        this.f1589o = new a();
        this.f1590p = new c();
        this.f1591q = new ReentrantLock(true);
        this.f1594t = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public ResizingSurfaceView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f1586l = new Point(0, 0);
        this.f1587m = new Point(0, 0);
        this.f1588n = new MatrixManager();
        this.f1589o = new a();
        this.f1590p = new c();
        this.f1591q = new ReentrantLock(true);
        this.f1594t = true;
    }
}
