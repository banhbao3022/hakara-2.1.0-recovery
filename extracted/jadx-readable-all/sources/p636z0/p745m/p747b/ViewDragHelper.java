package p636z0.p745m.p747b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.Arrays;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.m.b.e, reason: use source file name */
/* JADX INFO: compiled from: ViewDragHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewDragHelper {

    /* JADX INFO: renamed from: a */
    public static final Interpolator f38169a = new a();

    /* JADX INFO: renamed from: b */
    public int f38170b;

    /* JADX INFO: renamed from: c */
    public int f38171c;

    /* JADX INFO: renamed from: e */
    public float[] f38173e;

    /* JADX INFO: renamed from: f */
    public float[] f38174f;

    /* JADX INFO: renamed from: g */
    public float[] f38175g;

    /* JADX INFO: renamed from: h */
    public float[] f38176h;

    /* JADX INFO: renamed from: i */
    public int[] f38177i;

    /* JADX INFO: renamed from: j */
    public int[] f38178j;

    /* JADX INFO: renamed from: k */
    public int[] f38179k;

    /* JADX INFO: renamed from: l */
    public int f38180l;

    /* JADX INFO: renamed from: m */
    public VelocityTracker f38181m;

    /* JADX INFO: renamed from: n */
    public float f38182n;

    /* JADX INFO: renamed from: o */
    public float f38183o;

    /* JADX INFO: renamed from: p */
    public int f38184p;

    /* JADX INFO: renamed from: q */
    public final int f38185q;

    /* JADX INFO: renamed from: r */
    public OverScroller f38186r;

    /* JADX INFO: renamed from: s */
    public final c f38187s;

    /* JADX INFO: renamed from: t */
    public View f38188t;

    /* JADX INFO: renamed from: u */
    public boolean f38189u;

    /* JADX INFO: renamed from: v */
    public final ViewGroup f38190v;

    /* JADX INFO: renamed from: d */
    public int f38172d = -1;

    /* JADX INFO: renamed from: w */
    public final Runnable f38191w = new b();

    /* JADX INFO: renamed from: z0.m.b.e$a */
    /* JADX INFO: compiled from: ViewDragHelper.java */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: z0.m.b.e$b */
    /* JADX INFO: compiled from: ViewDragHelper.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper.this.m16392s(0);
        }
    }

    /* JADX INFO: renamed from: z0.m.b.e$c */
    /* JADX INFO: compiled from: ViewDragHelper.java */
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public int mo12706a(View view, int i, int i2) {
            return 0;
        }

        /* JADX INFO: renamed from: b */
        public int mo12707b(View view, int i, int i2) {
            return 0;
        }

        /* JADX INFO: renamed from: c */
        public int mo12708c(View view) {
            return 0;
        }

        /* JADX INFO: renamed from: d */
        public int mo12750d(View view) {
            return 0;
        }

        /* JADX INFO: renamed from: e */
        public void mo12709e(View view, int i) {
        }

        /* JADX INFO: renamed from: f */
        public void mo12710f(int i) {
        }

        /* JADX INFO: renamed from: g */
        public void mo12711g(View view, int i, int i2, int i3, int i4) {
        }

        /* JADX INFO: renamed from: h */
        public void mo12712h(View view, float f, float f2) {
        }

        /* JADX INFO: renamed from: i */
        public abstract boolean mo12713i(View view, int i);
    }

    public ViewDragHelper(Context context, ViewGroup viewGroup, c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f38190v = viewGroup;
        this.f38187s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f38185q = i;
        this.f38184p = i;
        this.f38171c = viewConfiguration.getScaledTouchSlop();
        this.f38182n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f38183o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f38186r = new OverScroller(context, f38169a);
    }

    /* JADX INFO: renamed from: a */
    public void m16374a() {
        this.f38172d = -1;
        float[] fArr = this.f38173e;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f38174f, 0.0f);
            Arrays.fill(this.f38175g, 0.0f);
            Arrays.fill(this.f38176h, 0.0f);
            Arrays.fill(this.f38177i, 0);
            Arrays.fill(this.f38178j, 0);
            Arrays.fill(this.f38179k, 0);
            this.f38180l = 0;
        }
        VelocityTracker velocityTracker = this.f38181m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f38181m = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m16375b(View view, int i) {
        if (view.getParent() != this.f38190v) {
            StringBuilder sbM1556G = outline.m1556G("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            sbM1556G.append(this.f38190v);
            sbM1556G.append(")");
            throw new IllegalArgumentException(sbM1556G.toString());
        }
        this.f38188t = view;
        this.f38172d = i;
        this.f38187s.mo12709e(view, i);
        m16392s(1);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16376c(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f38177i[i] & i2) != i2 || (0 & i2) == 0 || (this.f38179k[i] & i2) == i2 || (this.f38178j[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f38171c;
        if (fAbs <= i3 && fAbs2 <= i3) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            Objects.requireNonNull(this.f38187s);
        }
        return (this.f38178j[i] & i2) == 0 && fAbs > ((float) this.f38171c);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m16377d(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f38187s.mo12708c(view) > 0;
        boolean z2 = this.f38187s.mo12750d(view) > 0;
        if (z && z2) {
            float f3 = (f2 * f2) + (f * f);
            int i = this.f38171c;
            return f3 > ((float) (i * i));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f38171c);
        }
        return z2 && Math.abs(f2) > ((float) this.f38171c);
    }

    /* JADX INFO: renamed from: e */
    public final float m16378e(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        if (fAbs > f3) {
            return f > 0.0f ? f3 : -f3;
        }
        return f;
    }

    /* JADX INFO: renamed from: f */
    public final int m16379f(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        if (iAbs > i3) {
            return i > 0 ? i3 : -i3;
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public final void m16380g(int i) {
        float[] fArr = this.f38173e;
        if (fArr != null) {
            int i2 = this.f38180l;
            int i3 = 1 << i;
            if ((i3 & i2) != 0) {
                fArr[i] = 0.0f;
                this.f38174f[i] = 0.0f;
                this.f38175g[i] = 0.0f;
                this.f38176h[i] = 0.0f;
                this.f38177i[i] = 0;
                this.f38178j[i] = 0;
                this.f38179k[i] = 0;
                this.f38180l = (~i3) & i2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m16381h(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f38190v.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: i */
    public boolean m16382i(boolean z) {
        if (this.f38170b == 2) {
            boolean zComputeScrollOffset = this.f38186r.computeScrollOffset();
            int currX = this.f38186r.getCurrX();
            int currY = this.f38186r.getCurrY();
            int left = currX - this.f38188t.getLeft();
            int top = currY - this.f38188t.getTop();
            if (left != 0) {
                ViewCompat.m16319m(this.f38188t, left);
            }
            if (top != 0) {
                ViewCompat.m16320n(this.f38188t, top);
            }
            if (left != 0 || top != 0) {
                this.f38187s.mo12711g(this.f38188t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f38186r.getFinalX() && currY == this.f38186r.getFinalY()) {
                this.f38186r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.f38190v.post(this.f38191w);
                } else {
                    m16392s(0);
                }
            }
        }
        return this.f38170b == 2;
    }

    /* JADX INFO: renamed from: j */
    public final void m16383j(float f, float f2) {
        this.f38189u = true;
        this.f38187s.mo12712h(this.f38188t, f, f2);
        this.f38189u = false;
        if (this.f38170b == 1) {
            m16392s(0);
        }
    }

    /* JADX INFO: renamed from: k */
    public View m16384k(int i, int i2) {
        for (int childCount = this.f38190v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f38190v;
            Objects.requireNonNull(this.f38187s);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m16385l(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f38188t.getLeft();
        int top = this.f38188t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f38186r.abortAnimation();
            m16392s(0);
            return false;
        }
        View view = this.f38188t;
        int iM16379f = m16379f(i3, (int) this.f38183o, (int) this.f38182n);
        int iM16379f2 = m16379f(i4, (int) this.f38183o, (int) this.f38182n);
        int iAbs = Math.abs(i5);
        int iAbs2 = Math.abs(i6);
        int iAbs3 = Math.abs(iM16379f);
        int iAbs4 = Math.abs(iM16379f2);
        int i7 = iAbs3 + iAbs4;
        int i8 = iAbs + iAbs2;
        if (iM16379f != 0) {
            f = iAbs3;
            f2 = i7;
        } else {
            f = iAbs;
            f2 = i8;
        }
        float f5 = f / f2;
        if (iM16379f2 != 0) {
            f3 = iAbs4;
            f4 = i7;
        } else {
            f3 = iAbs2;
            f4 = i8;
        }
        int iM16381h = m16381h(i5, iM16379f, this.f38187s.mo12708c(view));
        this.f38186r.startScroll(left, top, i5, i6, (int) ((m16381h(i6, iM16379f2, this.f38187s.mo12750d(view)) * (f3 / f4)) + (iM16381h * f5)));
        m16392s(2);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m16386m(int i) {
        if ((this.f38180l & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void m16387n(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m16374a();
        }
        if (this.f38181m == null) {
            this.f38181m = VelocityTracker.obtain();
        }
        this.f38181m.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM16384k = m16384k((int) x, (int) y);
            m16390q(x, y, pointerId);
            m16395v(viewM16384k, pointerId);
            if ((this.f38177i[pointerId] & 0) != 0) {
                Objects.requireNonNull(this.f38187s);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f38170b == 1) {
                m16388o();
            }
            m16374a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f38170b != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i2 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i2);
                    if (m16386m(pointerId2)) {
                        float x2 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        float f = x2 - this.f38173e[pointerId2];
                        float f2 = y2 - this.f38174f[pointerId2];
                        m16389p(f, f2, pointerId2);
                        if (this.f38170b != 1) {
                            View viewM16384k2 = m16384k((int) x2, (int) y2);
                            if (m16377d(viewM16384k2, f, f2) && m16395v(viewM16384k2, pointerId2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i2++;
                }
                m16391r(motionEvent);
                return;
            }
            if (m16386m(this.f38172d)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f38172d);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f38175g;
                int i3 = this.f38172d;
                int i4 = (int) (x3 - fArr[i3]);
                int i5 = (int) (y3 - this.f38176h[i3]);
                int left = this.f38188t.getLeft() + i4;
                int top = this.f38188t.getTop() + i5;
                int left2 = this.f38188t.getLeft();
                int top2 = this.f38188t.getTop();
                if (i4 != 0) {
                    left = this.f38187s.mo12706a(this.f38188t, left, i4);
                    ViewCompat.m16319m(this.f38188t, left - left2);
                }
                int i6 = left;
                if (i5 != 0) {
                    top = this.f38187s.mo12707b(this.f38188t, top, i5);
                    ViewCompat.m16320n(this.f38188t, top - top2);
                }
                int i7 = top;
                if (i4 != 0 || i5 != 0) {
                    this.f38187s.mo12711g(this.f38188t, i6, i7, i6 - left2, i7 - top2);
                }
                m16391r(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f38170b == 1) {
                m16383j(0.0f, 0.0f);
            }
            m16374a();
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f38170b == 1 && pointerId3 == this.f38172d) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount2) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f38172d) {
                        View viewM16384k3 = m16384k((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view = this.f38188t;
                        if (viewM16384k3 == view && m16395v(view, pointerId4)) {
                            i = this.f38172d;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m16388o();
                }
            }
            m16380g(pointerId3);
            return;
        }
        int pointerId5 = motionEvent.getPointerId(actionIndex);
        float x4 = motionEvent.getX(actionIndex);
        float y4 = motionEvent.getY(actionIndex);
        m16390q(x4, y4, pointerId5);
        if (this.f38170b == 0) {
            m16395v(m16384k((int) x4, (int) y4), pointerId5);
            if ((this.f38177i[pointerId5] & 0) != 0) {
                Objects.requireNonNull(this.f38187s);
                return;
            }
            return;
        }
        int i8 = (int) x4;
        int i9 = (int) y4;
        View view2 = this.f38188t;
        if (view2 != null && i8 >= view2.getLeft() && i8 < view2.getRight() && i9 >= view2.getTop() && i9 < view2.getBottom()) {
            i2 = 1;
        }
        if (i2 != 0) {
            m16395v(this.f38188t, pointerId5);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m16388o() {
        this.f38181m.computeCurrentVelocity(CloseCodes.NORMAL_CLOSURE, this.f38182n);
        m16383j(m16378e(this.f38181m.getXVelocity(this.f38172d), this.f38183o, this.f38182n), m16378e(this.f38181m.getYVelocity(this.f38172d), this.f38183o, this.f38182n));
    }

    /* JADX INFO: renamed from: p */
    public final void m16389p(float f, float f2, int i) {
        int i2 = m16376c(f, f2, i, 1) ? 1 : 0;
        if (m16376c(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m16376c(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m16376c(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f38178j;
            iArr[i] = iArr[i] | i2;
            Objects.requireNonNull(this.f38187s);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m16390q(float f, float f2, int i) {
        float[] fArr = this.f38173e;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f38174f;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f38175g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f38176h;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f38177i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f38178j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f38179k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f38173e = fArr2;
            this.f38174f = fArr3;
            this.f38175g = fArr4;
            this.f38176h = fArr5;
            this.f38177i = iArr;
            this.f38178j = iArr2;
            this.f38179k = iArr3;
        }
        float[] fArr9 = this.f38173e;
        this.f38175g[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f38174f;
        this.f38176h[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f38177i;
        int i3 = (int) f;
        int i4 = (int) f2;
        int i5 = i3 < this.f38190v.getLeft() + this.f38184p ? 1 : 0;
        if (i4 < this.f38190v.getTop() + this.f38184p) {
            i5 |= 4;
        }
        if (i3 > this.f38190v.getRight() - this.f38184p) {
            i5 |= 2;
        }
        if (i4 > this.f38190v.getBottom() - this.f38184p) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.f38180l |= 1 << i;
    }

    /* JADX INFO: renamed from: r */
    public final void m16391r(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m16386m(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f38175g[pointerId] = x;
                this.f38176h[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m16392s(int i) {
        this.f38190v.removeCallbacks(this.f38191w);
        if (this.f38170b != i) {
            this.f38170b = i;
            this.f38187s.mo12710f(i);
            if (this.f38170b == 0) {
                this.f38188t = null;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m16393t(int i, int i2) {
        if (this.f38189u) {
            return m16385l(i, i2, (int) this.f38181m.getXVelocity(this.f38172d), (int) this.f38181m.getYVelocity(this.f38172d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
    /* JADX INFO: renamed from: u */
    public boolean m16394u(MotionEvent motionEvent) {
        View viewM16384k;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m16374a();
        }
        if (this.f38181m == null) {
            this.f38181m = VelocityTracker.obtain();
        }
        this.f38181m.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m16390q(x, y, pointerId);
            View viewM16384k2 = m16384k((int) x, (int) y);
            if (viewM16384k2 == this.f38188t && this.f38170b == 2) {
                m16395v(viewM16384k2, pointerId);
            }
            if ((this.f38177i[pointerId] & 0) != 0) {
                Objects.requireNonNull(this.f38187s);
            }
        } else if (actionMasked == 1) {
            m16374a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m16374a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m16390q(x2, y2, pointerId2);
                int i = this.f38170b;
                if (i == 0) {
                    if ((this.f38177i[pointerId2] & 0) != 0) {
                        Objects.requireNonNull(this.f38187s);
                    }
                } else if (i == 2 && (viewM16384k = m16384k((int) x2, (int) y2)) == this.f38188t) {
                    m16395v(viewM16384k, pointerId2);
                }
            } else if (actionMasked == 6) {
                m16380g(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f38173e != null && this.f38174f != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 0; i2 < pointerCount; i2++) {
                int pointerId3 = motionEvent.getPointerId(i2);
                if (m16386m(pointerId3)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f38173e[pointerId3];
                    float f2 = y3 - this.f38174f[pointerId3];
                    View viewM16384k3 = m16384k((int) x3, (int) y3);
                    boolean z = viewM16384k3 != null && m16377d(viewM16384k3, f, f2);
                    if (!z) {
                        m16389p(f, f2, pointerId3);
                        if (this.f38170b != 1) {
                            break;
                        }
                    } else {
                        int left = viewM16384k3.getLeft();
                        int i3 = (int) f;
                        int iMo12706a = this.f38187s.mo12706a(viewM16384k3, left + i3, i3);
                        int top = viewM16384k3.getTop();
                        int i4 = (int) f2;
                        int iMo12707b = this.f38187s.mo12707b(viewM16384k3, top + i4, i4);
                        int iMo12708c = this.f38187s.mo12708c(viewM16384k3);
                        int iMo12750d = this.f38187s.mo12750d(viewM16384k3);
                        if ((iMo12708c == 0 || (iMo12708c > 0 && iMo12706a == left)) && (iMo12750d == 0 || (iMo12750d > 0 && iMo12707b == top))) {
                            break;
                        }
                        m16389p(f, f2, pointerId3);
                        if (this.f38170b != 1 || (z && m16395v(viewM16384k3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m16391r(motionEvent);
        }
        return this.f38170b == 1;
    }

    /* JADX INFO: renamed from: v */
    public boolean m16395v(View view, int i) {
        if (view == this.f38188t && this.f38172d == i) {
            return true;
        }
        if (view == null || !this.f38187s.mo12713i(view, i)) {
            return false;
        }
        this.f38172d = i;
        m16375b(view, i);
        return true;
    }
}
