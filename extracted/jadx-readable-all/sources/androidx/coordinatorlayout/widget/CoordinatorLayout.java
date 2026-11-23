package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p707j.C8039a;
import p636z0.p707j.p708b.DirectedAcyclicGraph;
import p636z0.p707j.p708b.ViewGroupUtils2;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p725k.p738k.Pools2;
import p636z0.p725k.p738k.Pools4;
import p636z0.p725k.p739l.NestedScrollingParent2;
import p636z0.p725k.p739l.NestedScrollingParent3;
import p636z0.p725k.p739l.NestedScrollingParentHelper;
import p636z0.p725k.p739l.OnApplyWindowInsetsListener;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.WindowInsetsCompat;
import p636z0.p745m.p746a.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2, NestedScrollingParent3 {

    /* JADX INFO: renamed from: f */
    public static final String f616f;

    /* JADX INFO: renamed from: g */
    public static final Class<?>[] f617g;

    /* JADX INFO: renamed from: h */
    public static final ThreadLocal<Map<String, Constructor<AbstractC0098c>>> f618h;

    /* JADX INFO: renamed from: i */
    public static final Comparator<View> f619i;

    /* JADX INFO: renamed from: j */
    public static final Pools2<Rect> f620j;

    /* JADX INFO: renamed from: A */
    public Drawable f621A;

    /* JADX INFO: renamed from: B */
    public ViewGroup.OnHierarchyChangeListener f622B;

    /* JADX INFO: renamed from: C */
    public OnApplyWindowInsetsListener f623C;

    /* JADX INFO: renamed from: D */
    public final NestedScrollingParentHelper f624D;

    /* JADX INFO: renamed from: k */
    public final List<View> f625k;

    /* JADX INFO: renamed from: l */
    public final DirectedAcyclicGraph<View> f626l;

    /* JADX INFO: renamed from: m */
    public final List<View> f627m;

    /* JADX INFO: renamed from: n */
    public final List<View> f628n;

    /* JADX INFO: renamed from: o */
    public Paint f629o;

    /* JADX INFO: renamed from: p */
    public final int[] f630p;

    /* JADX INFO: renamed from: q */
    public final int[] f631q;

    /* JADX INFO: renamed from: r */
    public boolean f632r;

    /* JADX INFO: renamed from: s */
    public boolean f633s;

    /* JADX INFO: renamed from: t */
    public int[] f634t;

    /* JADX INFO: renamed from: u */
    public View f635u;

    /* JADX INFO: renamed from: v */
    public View f636v;

    /* JADX INFO: renamed from: w */
    public ViewTreeObserverOnPreDrawListenerC0102g f637w;

    /* JADX INFO: renamed from: x */
    public boolean f638x;

    /* JADX INFO: renamed from: y */
    public WindowInsetsCompat f639y;

    /* JADX INFO: renamed from: z */
    public boolean f640z;

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0096a implements OnApplyWindowInsetsListener {
        public C0096a() {
        }

        @Override // p636z0.p725k.p739l.OnApplyWindowInsetsListener
        /* JADX INFO: renamed from: a */
        public WindowInsetsCompat mo307a(View view, WindowInsetsCompat windowInsetsCompat) {
            AbstractC0098c abstractC0098c;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.f639y, windowInsetsCompat)) {
                coordinatorLayout.f639y = windowInsetsCompat;
                boolean z = windowInsetsCompat.m16230e() > 0;
                coordinatorLayout.f640z = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                if (!windowInsetsCompat.m16231g()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        AtomicInteger atomicInteger = ViewCompat.f38073a;
                        if (childAt.getFitsSystemWindows() && (abstractC0098c = ((C0101f) childAt.getLayoutParams()).f643a) != null) {
                            windowInsetsCompat = abstractC0098c.m313e(windowInsetsCompat);
                            if (windowInsetsCompat.m16231g()) {
                                break;
                            }
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return windowInsetsCompat;
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface InterfaceC0097b {
        AbstractC0098c getBehavior();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class AbstractC0098c<V extends View> {
        public AbstractC0098c() {
        }

        /* JADX INFO: renamed from: A */
        public boolean mo308A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* JADX INFO: renamed from: a */
        public boolean mo309a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public int m310b() {
            return -16777216;
        }

        /* JADX INFO: renamed from: c */
        public float m311c() {
            return 0.0f;
        }

        /* JADX INFO: renamed from: d */
        public boolean mo312d(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public WindowInsetsCompat m313e(WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        /* JADX INFO: renamed from: f */
        public void mo314f(C0101f c0101f) {
        }

        /* JADX INFO: renamed from: g */
        public boolean mo315g(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* JADX INFO: renamed from: h */
        public void mo316h(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* JADX INFO: renamed from: i */
        public void mo317i() {
        }

        /* JADX INFO: renamed from: j */
        public boolean mo318j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* JADX INFO: renamed from: k */
        public boolean mo319k(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* JADX INFO: renamed from: l */
        public boolean mo320l(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* JADX INFO: renamed from: m */
        public boolean m321m() {
            return false;
        }

        /* JADX INFO: renamed from: n */
        public boolean mo322n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* JADX INFO: renamed from: o */
        public void m323o() {
        }

        /* JADX INFO: renamed from: p */
        public void mo324p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                m323o();
            }
        }

        @Deprecated
        /* JADX INFO: renamed from: q */
        public void m325q() {
        }

        /* JADX INFO: renamed from: r */
        public void mo326r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            if (i5 == 0) {
                m325q();
            }
        }

        @Deprecated
        /* JADX INFO: renamed from: s */
        public void m327s() {
        }

        /* JADX INFO: renamed from: t */
        public boolean mo328t(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* JADX INFO: renamed from: u */
        public void mo329u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* JADX INFO: renamed from: v */
        public Parcelable mo330v(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* JADX INFO: renamed from: w */
        public boolean m331w() {
            return false;
        }

        /* JADX INFO: renamed from: x */
        public boolean mo332x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return m331w();
            }
            return false;
        }

        @Deprecated
        /* JADX INFO: renamed from: y */
        public void m333y() {
        }

        /* JADX INFO: renamed from: z */
        public void mo334z(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                m333y();
            }
        }

        public AbstractC0098c(Context context, AttributeSet attributeSet) {
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface InterfaceC0099d {
        Class<? extends AbstractC0098c> value();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public class ViewGroupOnHierarchyChangeListenerC0100e implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroupOnHierarchyChangeListenerC0100e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f622B;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m298r(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f622B;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public class ViewTreeObserverOnPreDrawListenerC0102g implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC0102g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m298r(0);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    public static class C0104i implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            float z = view.getZ();
            float z2 = view2.getZ();
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f616f = r0 != null ? r0.getName() : null;
        f619i = new C0104i();
        f617g = new Class[]{Context.class, AttributeSet.class};
        f618h = new ThreadLocal<>();
        f620j = new Pools4(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public static Rect m287a() {
        Rect rectMo2057a = f620j.mo2057a();
        return rectMo2057a == null ? new Rect() : rectMo2057a;
    }

    /* JADX INFO: renamed from: b */
    public final void m288b(C0101f c0101f, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0101f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0101f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0101f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0101f).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* JADX INFO: renamed from: c */
    public void m289c(View view) {
        ArrayList<View> orDefault = this.f626l.f37212b.getOrDefault(view, null);
        if (orDefault == null || orDefault.isEmpty()) {
            return;
        }
        for (int i = 0; i < orDefault.size(); i++) {
            View view2 = orDefault.get(i);
            AbstractC0098c abstractC0098c = ((C0101f) view2.getLayoutParams()).f643a;
            if (abstractC0098c != null) {
                abstractC0098c.mo315g(this, view2, view);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0101f) && super.checkLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public void m290d(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m293g(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        C0101f c0101f = (C0101f) view.getLayoutParams();
        AbstractC0098c abstractC0098c = c0101f.f643a;
        if (abstractC0098c != null) {
            float fM311c = abstractC0098c.m311c();
            if (fM311c > 0.0f) {
                if (this.f629o == null) {
                    this.f629o = new Paint();
                }
                this.f629o.setColor(c0101f.f643a.m310b());
                Paint paint = this.f629o;
                int iRound = Math.round(fM311c * 255.0f);
                if (iRound < 0) {
                    iRound = 0;
                } else if (iRound > 255) {
                    iRound = 255;
                }
                paint.setAlpha(iRound);
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f629o);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f621A;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public List<View> m291e(View view) {
        DirectedAcyclicGraph<View> directedAcyclicGraph = this.f626l;
        int i = directedAcyclicGraph.f37212b.f36667l;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList<View> arrayListM15612l = directedAcyclicGraph.f37212b.m15612l(i2);
            if (arrayListM15612l != null && arrayListM15612l.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(directedAcyclicGraph.f37212b.m15611h(i2));
            }
        }
        this.f628n.clear();
        if (arrayList != null) {
            this.f628n.addAll(arrayList);
        }
        return this.f628n;
    }

    /* JADX INFO: renamed from: f */
    public List<View> m292f(View view) {
        ArrayList<View> orDefault = this.f626l.f37212b.getOrDefault(view, null);
        this.f628n.clear();
        if (orDefault != null) {
            this.f628n.addAll(orDefault);
        }
        return this.f628n;
    }

    /* JADX INFO: renamed from: g */
    public void m293g(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = ViewGroupUtils2.f37215a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = ViewGroupUtils2.f37215a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        ViewGroupUtils2.m15873a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = ViewGroupUtils2.f37216b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0101f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0101f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m302v();
        return Collections.unmodifiableList(this.f625k);
    }

    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f639y;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f624D.m16301a();
    }

    public Drawable getStatusBarBackground() {
        return this.f621A;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* JADX INFO: renamed from: h */
    public final void m294h(int i, Rect rect, Rect rect2, C0101f c0101f, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = c0101f.f645c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c0101f.f646d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX INFO: renamed from: i */
    public final int m295i(int i) {
        int[] iArr = this.f634t;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent3
    /* JADX INFO: renamed from: j */
    public void mo169j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0098c abstractC0098c;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0101f c0101f = (C0101f) childAt.getLayoutParams();
                if (c0101f.m335a(i5) && (abstractC0098c = c0101f.f643a) != null) {
                    int[] iArr2 = this.f630p;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0098c.mo326r(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f630p;
                    iMax = i3 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, this.f630p[1]) : Math.min(iMax2, this.f630p[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m298r(1);
        }
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent2
    /* JADX INFO: renamed from: k */
    public void mo170k(View view, int i, int i2, int i3, int i4, int i5) {
        mo169j(view, i, i2, i3, i4, 0, this.f631q);
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent2
    /* JADX INFO: renamed from: l */
    public boolean mo171l(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0101f c0101f = (C0101f) childAt.getLayoutParams();
                AbstractC0098c abstractC0098c = c0101f.f643a;
                if (abstractC0098c != null) {
                    boolean zMo332x = abstractC0098c.mo332x(this, childAt, view, view2, i, i2);
                    z |= zMo332x;
                    c0101f.m336b(i2, zMo332x);
                } else {
                    c0101f.m336b(i2, false);
                }
            }
        }
        return z;
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent2
    /* JADX INFO: renamed from: m */
    public void mo172m(View view, View view2, int i, int i2) {
        AbstractC0098c abstractC0098c;
        NestedScrollingParentHelper nestedScrollingParentHelper = this.f624D;
        if (i2 == 1) {
            nestedScrollingParentHelper.f38068b = i;
        } else {
            nestedScrollingParentHelper.f38067a = i;
        }
        this.f636v = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C0101f c0101f = (C0101f) getChildAt(i3).getLayoutParams();
            if (c0101f.m335a(i2) && (abstractC0098c = c0101f.f643a) != null && i2 == 0) {
                abstractC0098c.m327s();
            }
        }
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent2
    /* JADX INFO: renamed from: n */
    public void mo173n(View view, int i) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.f624D;
        if (i == 1) {
            nestedScrollingParentHelper.f38068b = 0;
        } else {
            nestedScrollingParentHelper.f38067a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0101f c0101f = (C0101f) childAt.getLayoutParams();
            if (c0101f.m335a(i)) {
                AbstractC0098c abstractC0098c = c0101f.f643a;
                if (abstractC0098c != null) {
                    abstractC0098c.mo334z(this, childAt, view, i);
                }
                c0101f.m336b(i, false);
                c0101f.f658p = false;
            }
        }
        this.f636v = null;
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent2
    /* JADX INFO: renamed from: o */
    public void mo174o(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0098c abstractC0098c;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0101f c0101f = (C0101f) childAt.getLayoutParams();
                if (c0101f.m335a(i3) && (abstractC0098c = c0101f.f643a) != null) {
                    int[] iArr2 = this.f630p;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0098c.mo324p(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f630p;
                    iMax = i > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f630p;
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m298r(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m303w(false);
        if (this.f638x) {
            if (this.f637w == null) {
                this.f637w = new ViewTreeObserverOnPreDrawListenerC0102g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f637w);
        }
        if (this.f639y == null) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.f633s = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m303w(false);
        if (this.f638x && this.f637w != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f637w);
        }
        View view = this.f636v;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f633s = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f640z || this.f621A == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f639y;
        int iM16230e = windowInsetsCompat != null ? windowInsetsCompat.m16230e() : 0;
        if (iM16230e > 0) {
            this.f621A.setBounds(0, 0, getWidth(), iM16230e);
            this.f621A.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m303w(true);
        }
        boolean zM301u = m301u(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m303w(true);
        }
        return zM301u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0098c abstractC0098c;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        int layoutDirection = getLayoutDirection();
        int size = this.f625k.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f625k.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0098c = ((C0101f) view.getLayoutParams()).f643a) == null || !abstractC0098c.mo319k(this, view, layoutDirection))) {
                m299s(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0159  */
    /* JADX WARN: Code duplicated, block: B:78:0x0161  */
    /* JADX WARN: Code duplicated, block: B:81:0x0183  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int iMax;
        int i4;
        int i5;
        AbstractC0098c abstractC0098c;
        C0101f c0101f;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        m302v();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i12);
            DirectedAcyclicGraph<View> directedAcyclicGraph = this.f626l;
            int i13 = directedAcyclicGraph.f37212b.f36667l;
            int i14 = 0;
            while (true) {
                if (i14 < i13) {
                    ArrayList<View> arrayListM15612l = directedAcyclicGraph.f37212b.m15612l(i14);
                    if (arrayListM15612l != null && arrayListM15612l.contains(childAt)) {
                        z2 = true;
                        break;
                    }
                    i14++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                z = true;
                break;
            }
            i12++;
        }
        if (z != this.f638x) {
            if (z) {
                if (this.f633s) {
                    if (this.f637w == null) {
                        this.f637w = new ViewTreeObserverOnPreDrawListenerC0102g();
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f637w);
                }
                this.f638x = true;
            } else {
                if (this.f633s && this.f637w != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f637w);
                }
                this.f638x = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        int layoutDirection = getLayoutDirection();
        boolean z3 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i15 = paddingLeft + paddingRight;
        int i16 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z4 = this.f639y != null && getFitsSystemWindows();
        int size3 = this.f625k.size();
        int i17 = suggestedMinimumWidth;
        int i18 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i19 = 0;
        while (i19 < size3) {
            View view = this.f625k.get(i19);
            if (view.getVisibility() == 8) {
                i10 = i19;
                i7 = size3;
                i8 = paddingLeft;
            } else {
                C0101f c0101f2 = (C0101f) view.getLayoutParams();
                int i20 = c0101f2.f647e;
                if (i20 < 0 || mode == 0) {
                    i3 = iCombineMeasuredStates;
                } else {
                    int iM295i = m295i(i20);
                    int i21 = c0101f2.f645c;
                    if (i21 == 0) {
                        i21 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i21, layoutDirection) & 7;
                    i3 = iCombineMeasuredStates;
                    if ((absoluteGravity == 3 && !z3) || (absoluteGravity == 5 && z3)) {
                        iMax = Math.max(0, (size - paddingRight) - iM295i);
                    } else if ((absoluteGravity == 5 && !z3) || (absoluteGravity == 3 && z3)) {
                        iMax = Math.max(0, iM295i - paddingLeft);
                    }
                    if (z4 || view.getFitsSystemWindows()) {
                        i4 = i;
                        i5 = i2;
                    } else {
                        int iM16229d = this.f639y.m16229d() + this.f639y.m16228c();
                        int iM16227b = this.f639y.m16227b() + this.f639y.m16230e();
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM16229d, mode);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM16227b, mode2);
                        i4 = iMakeMeasureSpec;
                        i5 = iMakeMeasureSpec2;
                    }
                    abstractC0098c = c0101f2.f643a;
                    if (abstractC0098c != null) {
                        c0101f = c0101f2;
                        i9 = i3;
                        i10 = i19;
                        i6 = i18;
                        i8 = paddingLeft;
                        i11 = i17;
                        i7 = size3;
                        if (!abstractC0098c.mo320l(this, view, i4, iMax, i5, 0)) {
                        }
                        C0101f c0101f3 = c0101f;
                        int iMax2 = Math.max(i11, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0101f3).leftMargin + ((ViewGroup.MarginLayoutParams) c0101f3).rightMargin);
                        int iMax3 = Math.max(i6, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0101f3).topMargin + ((ViewGroup.MarginLayoutParams) c0101f3).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                        i17 = iMax2;
                        i18 = iMax3;
                    } else {
                        c0101f = c0101f2;
                        i6 = i18;
                        i7 = size3;
                        i8 = paddingLeft;
                        i9 = i3;
                        i10 = i19;
                        i11 = i17;
                    }
                    measureChildWithMargins(view, i4, iMax, i5, 0);
                    C0101f c0101f4 = c0101f;
                    int iMax4 = Math.max(i11, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0101f4).leftMargin + ((ViewGroup.MarginLayoutParams) c0101f4).rightMargin);
                    int iMax5 = Math.max(i6, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0101f4).topMargin + ((ViewGroup.MarginLayoutParams) c0101f4).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                    i17 = iMax4;
                    i18 = iMax5;
                }
                iMax = 0;
                if (z4) {
                    i4 = i;
                    i5 = i2;
                } else {
                    i4 = i;
                    i5 = i2;
                }
                abstractC0098c = c0101f2.f643a;
                if (abstractC0098c != null) {
                    c0101f = c0101f2;
                    i9 = i3;
                    i10 = i19;
                    i6 = i18;
                    i8 = paddingLeft;
                    i11 = i17;
                    i7 = size3;
                    if (!abstractC0098c.mo320l(this, view, i4, iMax, i5, 0)) {
                    }
                    C0101f c0101f5 = c0101f;
                    int iMax6 = Math.max(i11, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0101f5).leftMargin + ((ViewGroup.MarginLayoutParams) c0101f5).rightMargin);
                    int iMax7 = Math.max(i6, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0101f5).topMargin + ((ViewGroup.MarginLayoutParams) c0101f5).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                    i17 = iMax6;
                    i18 = iMax7;
                } else {
                    c0101f = c0101f2;
                    i6 = i18;
                    i7 = size3;
                    i8 = paddingLeft;
                    i9 = i3;
                    i10 = i19;
                    i11 = i17;
                }
                measureChildWithMargins(view, i4, iMax, i5, 0);
                C0101f c0101f6 = c0101f;
                int iMax8 = Math.max(i11, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0101f6).leftMargin + ((ViewGroup.MarginLayoutParams) c0101f6).rightMargin);
                int iMax9 = Math.max(i6, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0101f6).topMargin + ((ViewGroup.MarginLayoutParams) c0101f6).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                i17 = iMax8;
                i18 = iMax9;
            }
            i19 = i10 + 1;
            paddingLeft = i8;
            size3 = i7;
        }
        int i22 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i17, i, (-16777216) & i22), View.resolveSizeAndState(i18, i2, i22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        AbstractC0098c abstractC0098c;
        int childCount = getChildCount();
        boolean zM321m = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0101f c0101f = (C0101f) childAt.getLayoutParams();
                if (c0101f.m335a(0) && (abstractC0098c = c0101f.f643a) != null) {
                    zM321m |= abstractC0098c.m321m();
                }
            }
        }
        if (zM321m) {
            m298r(1);
        }
        return zM321m;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0098c abstractC0098c;
        int childCount = getChildCount();
        boolean zMo322n = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0101f c0101f = (C0101f) childAt.getLayoutParams();
                if (c0101f.m335a(0) && (abstractC0098c = c0101f.f643a) != null) {
                    zMo322n |= abstractC0098c.mo322n(this, childAt, view, f, f2);
                }
            }
        }
        return zMo322n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo174o(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo169j(view, i, i2, i3, i4, 0, this.f631q);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo172m(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0103h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0103h c0103h = (C0103h) parcelable;
        super.onRestoreInstanceState(c0103h.f38150g);
        SparseArray<Parcelable> sparseArray = c0103h.f661h;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0098c abstractC0098c = m296p(childAt).f643a;
            if (id != -1 && abstractC0098c != null && (parcelable2 = sparseArray.get(id)) != null) {
                abstractC0098c.mo329u(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableMo330v;
        C0103h c0103h = new C0103h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0098c abstractC0098c = ((C0101f) childAt.getLayoutParams()).f643a;
            if (id != -1 && abstractC0098c != null && (parcelableMo330v = abstractC0098c.mo330v(this, childAt)) != null) {
                sparseArray.append(id, parcelableMo330v);
            }
        }
        c0103h.f661h = sparseArray;
        return c0103h;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo171l(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mo173n(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[PHI: r3
  0x0029: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0020, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM301u;
        boolean zMo308A;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f635u == null) {
            zM301u = m301u(motionEvent, 1);
            if (!zM301u) {
                zMo308A = false;
            }
            motionEventObtain = null;
            if (this.f635u == null) {
                zMo308A |= super.onTouchEvent(motionEvent);
            } else if (zM301u) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                m303w(false);
            }
            return zMo308A;
        }
        zM301u = false;
        AbstractC0098c abstractC0098c = ((C0101f) this.f635u.getLayoutParams()).f643a;
        if (abstractC0098c != null) {
            zMo308A = abstractC0098c.mo308A(this, this.f635u, motionEvent);
        } else {
            zMo308A = false;
        }
        motionEventObtain = null;
        if (this.f635u == null) {
            zMo308A |= super.onTouchEvent(motionEvent);
        } else if (zM301u) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            m303w(false);
        } else {
            m303w(false);
        }
        return zMo308A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public C0101f m296p(View view) {
        C0101f c0101f = (C0101f) view.getLayoutParams();
        if (!c0101f.f644b) {
            if (view instanceof InterfaceC0097b) {
                AbstractC0098c behavior = ((InterfaceC0097b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                AbstractC0098c abstractC0098c = c0101f.f643a;
                if (abstractC0098c != behavior) {
                    if (abstractC0098c != null) {
                        abstractC0098c.mo317i();
                    }
                    c0101f.f643a = behavior;
                    c0101f.f644b = true;
                    if (behavior != null) {
                        behavior.mo314f(c0101f);
                    }
                }
                c0101f.f644b = true;
            } else {
                InterfaceC0099d interfaceC0099d = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    interfaceC0099d = (InterfaceC0099d) superclass.getAnnotation(InterfaceC0099d.class);
                    if (interfaceC0099d != null) {
                        break;
                    }
                }
                if (interfaceC0099d != null) {
                    try {
                        AbstractC0098c abstractC0098cNewInstance = interfaceC0099d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        AbstractC0098c abstractC0098c2 = c0101f.f643a;
                        if (abstractC0098c2 != abstractC0098cNewInstance) {
                            if (abstractC0098c2 != null) {
                                abstractC0098c2.mo317i();
                            }
                            c0101f.f643a = abstractC0098cNewInstance;
                            c0101f.f644b = true;
                            if (abstractC0098cNewInstance != null) {
                                abstractC0098cNewInstance.mo314f(c0101f);
                            }
                        }
                    } catch (Exception e) {
                        StringBuilder sbM1556G = outline.m1556G("Default behavior class ");
                        sbM1556G.append(interfaceC0099d.value().getName());
                        sbM1556G.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", sbM1556G.toString(), e);
                    }
                }
                c0101f.f644b = true;
            }
        }
        return c0101f;
    }

    /* JADX INFO: renamed from: q */
    public boolean m297q(View view, int i, int i2) {
        Rect rectM287a = m287a();
        m293g(view, rectM287a);
        try {
            return rectM287a.contains(i, i2);
        } finally {
            rectM287a.setEmpty();
            f620j.mo2058b(rectM287a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
    /* JADX INFO: renamed from: r */
    public final void m298r(int i) {
        int i2;
        Rect rect;
        int i3;
        boolean zMo315g;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        AbstractC0098c abstractC0098c;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        int layoutDirection = getLayoutDirection();
        int size = this.f625k.size();
        Rect rectM287a = m287a();
        Rect rectM287a2 = m287a();
        Rect rectM287a3 = m287a();
        int i10 = 0;
        while (i10 < size) {
            View view = this.f625k.get(i10);
            C0101f c0101f = (C0101f) view.getLayoutParams();
            if (i == 0 && view.getVisibility() == 8) {
                i3 = size;
                rect = rectM287a3;
                i2 = i10;
            } else {
                int i11 = 0;
                while (i11 < i10) {
                    if (c0101f.f654l == this.f625k.get(i11)) {
                        C0101f c0101f2 = (C0101f) view.getLayoutParams();
                        if (c0101f2.f653k != null) {
                            Rect rectM287a4 = m287a();
                            Rect rectM287a5 = m287a();
                            Rect rectM287a6 = m287a();
                            m293g(c0101f2.f653k, rectM287a4);
                            m290d(view, false, rectM287a5);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            m294h(layoutDirection, rectM287a4, rectM287a6, c0101f2, measuredWidth, measuredHeight);
                            boolean z3 = (rectM287a6.left == rectM287a5.left && rectM287a6.top == rectM287a5.top) ? false : true;
                            m288b(c0101f2, rectM287a6, measuredWidth, measuredHeight);
                            int i12 = rectM287a6.left - rectM287a5.left;
                            int i13 = rectM287a6.top - rectM287a5.top;
                            if (i12 != 0) {
                                ViewCompat.m16319m(view, i12);
                            }
                            if (i13 != 0) {
                                ViewCompat.m16320n(view, i13);
                            }
                            if (z3 && (abstractC0098c = c0101f2.f643a) != null) {
                                abstractC0098c.mo315g(this, view, c0101f2.f653k);
                            }
                            rectM287a4.setEmpty();
                            Pools2<Rect> pools2 = f620j;
                            pools2.mo2058b(rectM287a4);
                            rectM287a5.setEmpty();
                            pools2.mo2058b(rectM287a5);
                            rectM287a6.setEmpty();
                            pools2.mo2058b(rectM287a6);
                        }
                    }
                    i11++;
                    c0101f = c0101f;
                    size = size;
                    i10 = i10;
                    rectM287a3 = rectM287a3;
                }
                int i14 = size;
                Rect rect2 = rectM287a3;
                i2 = i10;
                C0101f c0101f3 = c0101f;
                m290d(view, true, rectM287a2);
                if (c0101f3.f649g != 0 && !rectM287a2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c0101f3.f649g, layoutDirection);
                    int i15 = absoluteGravity & 112;
                    if (i15 == 48) {
                        rectM287a.top = Math.max(rectM287a.top, rectM287a2.bottom);
                    } else if (i15 == 80) {
                        rectM287a.bottom = Math.max(rectM287a.bottom, getHeight() - rectM287a2.top);
                    }
                    int i16 = absoluteGravity & 7;
                    if (i16 == 3) {
                        rectM287a.left = Math.max(rectM287a.left, rectM287a2.right);
                    } else if (i16 == 5) {
                        rectM287a.right = Math.max(rectM287a.right, getWidth() - rectM287a2.left);
                    }
                }
                if (c0101f3.f650h != 0 && view.getVisibility() == 0) {
                    AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        C0101f c0101f4 = (C0101f) view.getLayoutParams();
                        AbstractC0098c abstractC0098c2 = c0101f4.f643a;
                        Rect rectM287a7 = m287a();
                        Rect rectM287a8 = m287a();
                        rectM287a8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (abstractC0098c2 == null || !abstractC0098c2.mo309a(this, view, rectM287a7)) {
                            rectM287a7.set(rectM287a8);
                        } else if (!rectM287a8.contains(rectM287a7)) {
                            StringBuilder sbM1556G = outline.m1556G("Rect should be within the child's bounds. Rect:");
                            sbM1556G.append(rectM287a7.toShortString());
                            sbM1556G.append(" | Bounds:");
                            sbM1556G.append(rectM287a8.toShortString());
                            throw new IllegalArgumentException(sbM1556G.toString());
                        }
                        rectM287a8.setEmpty();
                        Pools2<Rect> pools3 = f620j;
                        pools3.mo2058b(rectM287a8);
                        if (rectM287a7.isEmpty()) {
                            rectM287a7.setEmpty();
                            pools3.mo2058b(rectM287a7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c0101f4.f650h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (rectM287a7.top - ((ViewGroup.MarginLayoutParams) c0101f4).topMargin) - c0101f4.f652j) >= (i9 = rectM287a.top)) {
                                z = false;
                            } else {
                                m305y(view, i9 - i8);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM287a7.bottom) - ((ViewGroup.MarginLayoutParams) c0101f4).bottomMargin) + c0101f4.f652j) < (i7 = rectM287a.bottom)) {
                                m305y(view, height - i7);
                                z = true;
                            }
                            if (!z) {
                                m305y(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (rectM287a7.left - ((ViewGroup.MarginLayoutParams) c0101f4).leftMargin) - c0101f4.f651i) >= (i6 = rectM287a.left)) {
                                z2 = false;
                            } else {
                                m304x(view, i6 - i5);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM287a7.right) - ((ViewGroup.MarginLayoutParams) c0101f4).rightMargin) + c0101f4.f651i) < (i4 = rectM287a.right)) {
                                m304x(view, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                m304x(view, 0);
                            }
                            rectM287a7.setEmpty();
                            pools3.mo2058b(rectM287a7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect2;
                    rect.set(((C0101f) view.getLayoutParams()).f659q);
                    if (rect.equals(rectM287a2)) {
                        i3 = i14;
                    } else {
                        ((C0101f) view.getLayoutParams()).f659q.set(rectM287a2);
                    }
                } else {
                    rect = rect2;
                }
                i3 = i14;
                for (int i17 = i2 + 1; i17 < i3; i17++) {
                    View view2 = this.f625k.get(i17);
                    C0101f c0101f5 = (C0101f) view2.getLayoutParams();
                    AbstractC0098c abstractC0098c3 = c0101f5.f643a;
                    if (abstractC0098c3 != null && abstractC0098c3.mo312d(this, view2, view)) {
                        if (i == 0 && c0101f5.f658p) {
                            c0101f5.f658p = false;
                        } else {
                            if (i != 2) {
                                zMo315g = abstractC0098c3.mo315g(this, view2, view);
                            } else {
                                abstractC0098c3.mo316h(this, view2, view);
                                zMo315g = true;
                            }
                            if (i == 1) {
                                c0101f5.f658p = zMo315g;
                            }
                        }
                    }
                }
            }
            i10 = i2 + 1;
            size = i3;
            rectM287a3 = rect;
        }
        Rect rect3 = rectM287a3;
        rectM287a.setEmpty();
        Pools2<Rect> pools4 = f620j;
        pools4.mo2058b(rectM287a);
        rectM287a2.setEmpty();
        pools4.mo2058b(rectM287a2);
        rect3.setEmpty();
        pools4.mo2058b(rect3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0098c abstractC0098c = ((C0101f) view.getLayoutParams()).f643a;
        if (abstractC0098c == null || !abstractC0098c.mo328t(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f632r) {
            return;
        }
        m303w(false);
        this.f632r = true;
    }

    /* JADX INFO: renamed from: s */
    public void m299s(View view, int i) {
        C0101f c0101f = (C0101f) view.getLayoutParams();
        View view2 = c0101f.f653k;
        int i2 = 0;
        if (view2 == null && c0101f.f648f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            Rect rectM287a = m287a();
            Rect rectM287a2 = m287a();
            try {
                m293g(view2, rectM287a);
                C0101f c0101f2 = (C0101f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m294h(i, rectM287a, rectM287a2, c0101f2, measuredWidth, measuredHeight);
                m288b(c0101f2, rectM287a2, measuredWidth, measuredHeight);
                view.layout(rectM287a2.left, rectM287a2.top, rectM287a2.right, rectM287a2.bottom);
                return;
            } finally {
                rectM287a.setEmpty();
                Pools2<Rect> pools2 = f620j;
                pools2.mo2058b(rectM287a);
                rectM287a2.setEmpty();
                pools2.mo2058b(rectM287a2);
            }
        }
        int i3 = c0101f.f647e;
        if (i3 < 0) {
            C0101f c0101f3 = (C0101f) view.getLayoutParams();
            Rect rectM287a3 = m287a();
            rectM287a3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0101f3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0101f3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0101f3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0101f3).bottomMargin);
            if (this.f639y != null) {
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM287a3.left = this.f639y.m16228c() + rectM287a3.left;
                    rectM287a3.top = this.f639y.m16230e() + rectM287a3.top;
                    rectM287a3.right -= this.f639y.m16229d();
                    rectM287a3.bottom -= this.f639y.m16227b();
                }
            }
            Rect rectM287a4 = m287a();
            int i4 = c0101f3.f645c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM287a3, rectM287a4, i);
            view.layout(rectM287a4.left, rectM287a4.top, rectM287a4.right, rectM287a4.bottom);
            rectM287a3.setEmpty();
            Pools2<Rect> pools3 = f620j;
            pools3.mo2058b(rectM287a3);
            rectM287a4.setEmpty();
            pools3.mo2058b(rectM287a4);
            return;
        }
        C0101f c0101f4 = (C0101f) view.getLayoutParams();
        int i5 = c0101f4.f645c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iM295i = m295i(i3) - measuredWidth2;
        if (i6 == 1) {
            iM295i += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iM295i += measuredWidth2;
        }
        if (i7 == 16) {
            i2 = 0 + (measuredHeight2 / 2);
        } else if (i7 == 80) {
            i2 = measuredHeight2 + 0;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0101f4).leftMargin, Math.min(iM295i, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0101f4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0101f4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0101f4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m306z();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f622B = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f621A;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f621A = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f621A.setState(getDrawableState());
                }
                Drawable drawable3 = this.f621A;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                C8162a.m16043N(drawable3, getLayoutDirection());
                this.f621A.setVisible(getVisibility() == 0, false);
                this.f621A.setCallback(this);
            }
            AtomicInteger atomicInteger2 = ViewCompat.f38073a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawableM16141b;
        if (i != 0) {
            Context context = getContext();
            Object obj = ContextCompat.f37815a;
            drawableM16141b = ContextCompat.c.m16141b(context, i);
        } else {
            drawableM16141b = null;
        }
        setStatusBarBackground(drawableM16141b);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f621A;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f621A.setVisible(z, false);
    }

    /* JADX INFO: renamed from: t */
    public void m300t(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m301u(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f627m;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = f619i;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zMo318j = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C0101f c0101f = (C0101f) view.getLayoutParams();
            AbstractC0098c abstractC0098c = c0101f.f643a;
            if (!(zMo318j || z2) || actionMasked == 0) {
                if (!zMo318j && abstractC0098c != null) {
                    if (i == 0) {
                        zMo318j = abstractC0098c.mo318j(this, view, motionEvent);
                    } else if (i == 1) {
                        zMo318j = abstractC0098c.mo308A(this, view, motionEvent);
                    }
                    if (zMo318j) {
                        this.f635u = view;
                    }
                }
                AbstractC0098c abstractC0098c2 = c0101f.f643a;
                if (abstractC0098c2 == null) {
                    c0101f.f655m = false;
                }
                boolean z3 = c0101f.f655m;
                if (z3) {
                    z = true;
                } else {
                    z = (abstractC0098c2 != null && abstractC0098c2.m311c() > 0.0f) | z3;
                    c0101f.f655m = z;
                }
                boolean z4 = z && !z3;
                if (z && !z4) {
                    break;
                }
                z2 = z4;
            } else if (abstractC0098c != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    abstractC0098c.mo318j(this, view, motionEventObtain);
                } else if (i == 1) {
                    abstractC0098c.mo308A(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zMo318j;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v7 android.view.View
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    /* JADX INFO: renamed from: v */
    public final void m302v() {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m302v():void");
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f621A;
    }

    /* JADX INFO: renamed from: w */
    public final void m303w(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0098c abstractC0098c = ((C0101f) childAt.getLayoutParams()).f643a;
            if (abstractC0098c != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC0098c.mo318j(this, childAt, motionEventObtain);
                } else {
                    abstractC0098c.mo308A(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0101f) getChildAt(i2).getLayoutParams()).f655m = false;
        }
        this.f635u = null;
        this.f632r = false;
    }

    /* JADX INFO: renamed from: x */
    public final void m304x(View view, int i) {
        C0101f c0101f = (C0101f) view.getLayoutParams();
        int i2 = c0101f.f651i;
        if (i2 != i) {
            ViewCompat.m16319m(view, i - i2);
            c0101f.f651i = i;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m305y(View view, int i) {
        C0101f c0101f = (C0101f) view.getLayoutParams();
        int i2 = c0101f.f652j;
        if (i2 != i) {
            ViewCompat.m16320n(view, i - i2);
            c0101f.f652j = i;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m306z() {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (!getFitsSystemWindows()) {
            ViewCompat.c.m16336d(this, null);
            return;
        }
        if (this.f623C == null) {
            this.f623C = new C0096a();
        }
        ViewCompat.c.m16336d(this, this.f623C);
        setSystemUiVisibility(1280);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0101f) {
            return new C0101f((C0101f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0101f((ViewGroup.MarginLayoutParams) layoutParams) : new C0101f(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.f625k = new ArrayList();
        this.f626l = new DirectedAcyclicGraph<>();
        this.f627m = new ArrayList();
        this.f628n = new ArrayList();
        this.f630p = new int[2];
        this.f631q = new int[2];
        this.f624D = new NestedScrollingParentHelper(this);
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8039a.f37209a, 0, 2132017973);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8039a.f37209a, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C8039a.f37209a, attributeSet, typedArrayObtainStyledAttributes, 0, 2132017973);
            } else {
                saveAttributeDataForStyleable(context, C8039a.f37209a, attributeSet, typedArrayObtainStyledAttributes, i, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f634t = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f634t.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f634t;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        this.f621A = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m306z();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0100e());
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public static class C0103h extends AbsSavedState {
        public static final Parcelable.Creator<C0103h> CREATOR = new a();

        /* JADX INFO: renamed from: h */
        public SparseArray<Parcelable> f661h;

        /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0103h> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0103h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0103h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0103h[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0103h(parcel, null);
            }
        }

        public C0103h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f661h = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f661h.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // p636z0.p745m.p746a.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f38150g, i);
            SparseArray<Parcelable> sparseArray = this.f661h;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f661h.keyAt(i2);
                parcelableArr[i2] = this.f661h.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public C0103h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0101f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public AbstractC0098c f643a;

        /* JADX INFO: renamed from: b */
        public boolean f644b;

        /* JADX INFO: renamed from: c */
        public int f645c;

        /* JADX INFO: renamed from: d */
        public int f646d;

        /* JADX INFO: renamed from: e */
        public int f647e;

        /* JADX INFO: renamed from: f */
        public int f648f;

        /* JADX INFO: renamed from: g */
        public int f649g;

        /* JADX INFO: renamed from: h */
        public int f650h;

        /* JADX INFO: renamed from: i */
        public int f651i;

        /* JADX INFO: renamed from: j */
        public int f652j;

        /* JADX INFO: renamed from: k */
        public View f653k;

        /* JADX INFO: renamed from: l */
        public View f654l;

        /* JADX INFO: renamed from: m */
        public boolean f655m;

        /* JADX INFO: renamed from: n */
        public boolean f656n;

        /* JADX INFO: renamed from: o */
        public boolean f657o;

        /* JADX INFO: renamed from: p */
        public boolean f658p;

        /* JADX INFO: renamed from: q */
        public final Rect f659q;

        public C0101f(int i, int i2) {
            super(i, i2);
            this.f644b = false;
            this.f645c = 0;
            this.f646d = 0;
            this.f647e = -1;
            this.f648f = -1;
            this.f649g = 0;
            this.f650h = 0;
            this.f659q = new Rect();
        }

        /* JADX INFO: renamed from: a */
        public boolean m335a(int i) {
            if (i == 0) {
                return this.f656n;
            }
            if (i != 1) {
                return false;
            }
            return this.f657o;
        }

        /* JADX INFO: renamed from: b */
        public void m336b(int i, boolean z) {
            if (i == 0) {
                this.f656n = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.f657o = z;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0101f(Context context, AttributeSet attributeSet) {
            AbstractC0098c abstractC0098cNewInstance;
            super(context, attributeSet);
            this.f644b = false;
            this.f645c = 0;
            this.f646d = 0;
            this.f647e = -1;
            this.f648f = -1;
            this.f649g = 0;
            this.f650h = 0;
            this.f659q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8039a.f37210b);
            this.f645c = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.f648f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.f646d = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.f647e = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.f649g = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.f650h = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.f644b = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f616f;
                if (TextUtils.isEmpty(string)) {
                    abstractC0098cNewInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f616f;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<AbstractC0098c>>> threadLocal = CoordinatorLayout.f618h;
                        Map<String, Constructor<AbstractC0098c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<AbstractC0098c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f617g);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        abstractC0098cNewInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e) {
                        throw new RuntimeException(outline.m1599u("Could not inflate Behavior subclass ", string), e);
                    }
                }
                this.f643a = abstractC0098cNewInstance;
            }
            typedArrayObtainStyledAttributes.recycle();
            AbstractC0098c abstractC0098c = this.f643a;
            if (abstractC0098c != null) {
                abstractC0098c.mo314f(this);
            }
        }

        public C0101f(C0101f c0101f) {
            super((ViewGroup.MarginLayoutParams) c0101f);
            this.f644b = false;
            this.f645c = 0;
            this.f646d = 0;
            this.f647e = -1;
            this.f648f = -1;
            this.f649g = 0;
            this.f650h = 0;
            this.f659q = new Rect();
        }

        public C0101f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f644b = false;
            this.f645c = 0;
            this.f646d = 0;
            this.f647e = -1;
            this.f648f = -1;
            this.f649g = 0;
            this.f650h = 0;
            this.f659q = new Rect();
        }

        public C0101f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f644b = false;
            this.f645c = 0;
            this.f646d = 0;
            this.f647e = -1;
            this.f648f = -1;
            this.f649g = 0;
            this.f650h = 0;
            this.f659q = new Rect();
        }
    }
}
