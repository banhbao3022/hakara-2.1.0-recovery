package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.facebook.stetho.websocket.CloseCodes;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p695h0.p696a.PagerAdapter2;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p725k.p729e.Insets;
import p636z0.p725k.p739l.AccessibilityDelegateCompat;
import p636z0.p725k.p739l.OnApplyWindowInsetsListener;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.WindowInsetsCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;
import p636z0.p745m.p746a.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: f */
    public static final int[] f1217f = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: g */
    public static final Comparator<C0197f> f1218g = new C0192a();

    /* JADX INFO: renamed from: h */
    public static final Interpolator f1219h = new InterpolatorC0193b();

    /* JADX INFO: renamed from: i */
    public static final C0204m f1220i = new C0204m();

    /* JADX INFO: renamed from: A */
    public float f1221A;

    /* JADX INFO: renamed from: B */
    public int f1222B;

    /* JADX INFO: renamed from: C */
    public boolean f1223C;

    /* JADX INFO: renamed from: D */
    public boolean f1224D;

    /* JADX INFO: renamed from: E */
    public boolean f1225E;

    /* JADX INFO: renamed from: F */
    public int f1226F;

    /* JADX INFO: renamed from: G */
    public boolean f1227G;

    /* JADX INFO: renamed from: H */
    public boolean f1228H;

    /* JADX INFO: renamed from: I */
    public int f1229I;

    /* JADX INFO: renamed from: J */
    public int f1230J;

    /* JADX INFO: renamed from: K */
    public int f1231K;

    /* JADX INFO: renamed from: L */
    public float f1232L;

    /* JADX INFO: renamed from: M */
    public float f1233M;

    /* JADX INFO: renamed from: N */
    public float f1234N;

    /* JADX INFO: renamed from: O */
    public float f1235O;

    /* JADX INFO: renamed from: P */
    public int f1236P;

    /* JADX INFO: renamed from: Q */
    public VelocityTracker f1237Q;

    /* JADX INFO: renamed from: R */
    public int f1238R;

    /* JADX INFO: renamed from: S */
    public int f1239S;

    /* JADX INFO: renamed from: T */
    public int f1240T;

    /* JADX INFO: renamed from: U */
    public int f1241U;

    /* JADX INFO: renamed from: V */
    public EdgeEffect f1242V;

    /* JADX INFO: renamed from: W */
    public EdgeEffect f1243W;

    /* JADX INFO: renamed from: a0 */
    public boolean f1244a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f1245b0;

    /* JADX INFO: renamed from: c0 */
    public int f1246c0;

    /* JADX INFO: renamed from: d0 */
    public List<InterfaceC0201j> f1247d0;

    /* JADX INFO: renamed from: e0 */
    public InterfaceC0201j f1248e0;

    /* JADX INFO: renamed from: f0 */
    public List<InterfaceC0200i> f1249f0;

    /* JADX INFO: renamed from: g0 */
    public final Runnable f1250g0;

    /* JADX INFO: renamed from: h0 */
    public int f1251h0;

    /* JADX INFO: renamed from: j */
    public int f1252j;

    /* JADX INFO: renamed from: k */
    public final ArrayList<C0197f> f1253k;

    /* JADX INFO: renamed from: l */
    public final C0197f f1254l;

    /* JADX INFO: renamed from: m */
    public final Rect f1255m;

    /* JADX INFO: renamed from: n */
    public PagerAdapter2 f1256n;

    /* JADX INFO: renamed from: o */
    public int f1257o;

    /* JADX INFO: renamed from: p */
    public int f1258p;

    /* JADX INFO: renamed from: q */
    public Parcelable f1259q;

    /* JADX INFO: renamed from: r */
    public ClassLoader f1260r;

    /* JADX INFO: renamed from: s */
    public Scroller f1261s;

    /* JADX INFO: renamed from: t */
    public boolean f1262t;

    /* JADX INFO: renamed from: u */
    public C0202k f1263u;

    /* JADX INFO: renamed from: v */
    public int f1264v;

    /* JADX INFO: renamed from: w */
    public Drawable f1265w;

    /* JADX INFO: renamed from: x */
    public int f1266x;

    /* JADX INFO: renamed from: y */
    public int f1267y;

    /* JADX INFO: renamed from: z */
    public float f1268z;

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$a */
    public static class C0192a implements Comparator<C0197f> {
        @Override // java.util.Comparator
        public int compare(C0197f c0197f, C0197f c0197f2) {
            return c0197f.f1273b - c0197f2.f1273b;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$b */
    public static class InterpolatorC0193b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$c */
    public class RunnableC0194c implements Runnable {
        public RunnableC0194c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager viewPager = ViewPager.this;
            viewPager.m899r(viewPager.f1257o);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$d */
    public class C0195d implements OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a */
        public final Rect f1270a = new Rect();

        public C0195d() {
        }

        @Override // p636z0.p725k.p739l.OnApplyWindowInsetsListener
        /* JADX INFO: renamed from: a */
        public WindowInsetsCompat mo307a(View view, WindowInsetsCompat windowInsetsCompat) {
            WindowInsetsCompat windowInsetsCompatM16321o = ViewCompat.m16321o(view, windowInsetsCompat);
            if (windowInsetsCompatM16321o.m16231g()) {
                return windowInsetsCompatM16321o;
            }
            Rect rect = this.f1270a;
            rect.left = windowInsetsCompatM16321o.m16228c();
            rect.top = windowInsetsCompatM16321o.m16230e();
            rect.right = windowInsetsCompatM16321o.m16229d();
            rect.bottom = windowInsetsCompatM16321o.m16227b();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                WindowInsetsCompat windowInsetsCompatM16311e = ViewCompat.m16311e(ViewPager.this.getChildAt(i), windowInsetsCompatM16321o);
                rect.left = Math.min(windowInsetsCompatM16311e.m16228c(), rect.left);
                rect.top = Math.min(windowInsetsCompatM16311e.m16230e(), rect.top);
                rect.right = Math.min(windowInsetsCompatM16311e.m16229d(), rect.right);
                rect.bottom = Math.min(windowInsetsCompatM16311e.m16227b(), rect.bottom);
            }
            int i2 = rect.left;
            int i3 = rect.top;
            int i4 = rect.right;
            int i5 = rect.bottom;
            WindowInsetsCompat.b bVar = new WindowInsetsCompat.b(windowInsetsCompatM16321o);
            bVar.f37986a.mo16237d(Insets.m16166a(i2, i3, i4, i5));
            return bVar.m16233a();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$e */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC0196e {
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$f */
    public static class C0197f {

        /* JADX INFO: renamed from: a */
        public Object f1272a;

        /* JADX INFO: renamed from: b */
        public int f1273b;

        /* JADX INFO: renamed from: c */
        public boolean f1274c;

        /* JADX INFO: renamed from: d */
        public float f1275d;

        /* JADX INFO: renamed from: e */
        public float f1276e;
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$h */
    public class C0199h extends AccessibilityDelegateCompat {
        public C0199h() {
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: c */
        public void mo381c(View view, AccessibilityEvent accessibilityEvent) {
            PagerAdapter2 pagerAdapter2;
            this.f37977b.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            PagerAdapter2 pagerAdapter3 = ViewPager.this.f1256n;
            accessibilityEvent.setScrollable(pagerAdapter3 != null && pagerAdapter3.mo12480c() > 1);
            if (accessibilityEvent.getEventType() != 4096 || (pagerAdapter2 = ViewPager.this.f1256n) == null) {
                return;
            }
            accessibilityEvent.setItemCount(pagerAdapter2.mo12480c());
            accessibilityEvent.setFromIndex(ViewPager.this.f1257o);
            accessibilityEvent.setToIndex(ViewPager.this.f1257o);
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: d */
        public void mo382d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f37977b.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f38018b);
            accessibilityNodeInfoCompat.f38018b.setClassName(ViewPager.class.getName());
            PagerAdapter2 pagerAdapter2 = ViewPager.this.f1256n;
            accessibilityNodeInfoCompat.f38018b.setScrollable(pagerAdapter2 != null && pagerAdapter2.mo12480c() > 1);
            if (ViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.f38018b.addAction(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.f38018b.addAction(8192);
            }
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: g */
        public boolean mo383g(View view, int i, Bundle bundle) {
            if (super.mo383g(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f1257o + 1);
                return true;
            }
            if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f1257o - 1);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface InterfaceC0200i {
        /* JADX INFO: renamed from: a */
        void mo906a(ViewPager viewPager, PagerAdapter2 pagerAdapter2, PagerAdapter2 pagerAdapter3);
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$j */
    public interface InterfaceC0201j {
        /* JADX INFO: renamed from: a */
        void mo907a(int i);

        /* JADX INFO: renamed from: b */
        void mo908b(int i);

        /* JADX INFO: renamed from: c */
        void mo909c(int i, float f, int i2);
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$k */
    public class C0202k extends DataSetObserver {
        public C0202k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.m886e();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.m886e();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$l */
    public static class C0203l extends AbsSavedState {
        public static final Parcelable.Creator<C0203l> CREATOR = new a();

        /* JADX INFO: renamed from: h */
        public int f1285h;

        /* JADX INFO: renamed from: i */
        public Parcelable f1286i;

        /* JADX INFO: renamed from: j */
        public ClassLoader f1287j;

        /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$l$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0203l> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0203l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0203l(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0203l[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0203l(parcel, null);
            }
        }

        public C0203l(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("FragmentPager.SavedState{");
            sbM1556G.append(Integer.toHexString(System.identityHashCode(this)));
            sbM1556G.append(" position=");
            return outline.m1603y(sbM1556G, this.f1285h, "}");
        }

        @Override // p636z0.p745m.p746a.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f38150g, i);
            parcel.writeInt(this.f1285h);
            parcel.writeParcelable(this.f1286i, i);
        }

        public C0203l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? C0203l.class.getClassLoader() : classLoader;
            this.f1285h = parcel.readInt();
            this.f1286i = parcel.readParcelable(classLoader);
            this.f1287j = classLoader;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$m */
    public static class C0204m implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            C0198g c0198g = (C0198g) view.getLayoutParams();
            C0198g c0198g2 = (C0198g) view2.getLayoutParams();
            boolean z = c0198g.f1277a;
            if (z != c0198g2.f1277a) {
                return z ? 1 : -1;
            }
            return c0198g.f1281e - c0198g2.f1281e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.f1253k = new ArrayList<>();
        this.f1254l = new C0197f();
        this.f1255m = new Rect();
        this.f1258p = -1;
        this.f1259q = null;
        this.f1260r = null;
        this.f1268z = -3.4028235E38f;
        this.f1221A = Float.MAX_VALUE;
        this.f1226F = 1;
        this.f1236P = -1;
        this.f1244a0 = true;
        this.f1250g0 = new RunnableC0194c();
        this.f1251h0 = 0;
        m892k();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f1224D != z) {
            this.f1224D = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public C0197f m882a(int i, int i2) {
        C0197f c0197f = new C0197f();
        c0197f.f1273b = i;
        c0197f.f1272a = this.f1256n.mo12482f(this, i);
        Objects.requireNonNull(this.f1256n);
        c0197f.f1275d = 1.0f;
        if (i2 < 0 || i2 >= this.f1253k.size()) {
            this.f1253k.add(c0197f);
        } else {
            this.f1253k.add(i2, c0197f);
        }
        return c0197f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0197f c0197fM889h;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c0197fM889h = m889h(childAt)) != null && c0197fM889h.f1273b == this.f1257o) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C0197f c0197fM889h;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c0197fM889h = m889h(childAt)) != null && c0197fM889h.f1273b == this.f1257o) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0198g c0198g = (C0198g) layoutParams;
        boolean z = c0198g.f1277a | (view.getClass().getAnnotation(InterfaceC0196e.class) != null);
        c0198g.f1277a = z;
        if (!this.f1223C) {
            super.addView(view, i, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0198g.f1280d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m883b(int i) {
        boolean zRequestFocus;
        boolean z;
        View viewFindFocus = findFocus();
        boolean zM895n = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z = false;
                    break;
                }
                if (parent == this) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                StringBuilder sbM1556G = outline.m1556G("arrowScroll tried to find focus based on non-child current focused view ");
                sbM1556G.append(sb.toString());
                Log.e("ViewPager", sbM1556G.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i == 17) {
                zRequestFocus = (viewFindFocus == null || m888g(this.f1255m, viewFindNextFocus).left < m888g(this.f1255m, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : m895n();
            } else if (i == 66) {
                zRequestFocus = (viewFindFocus == null || m888g(this.f1255m, viewFindNextFocus).left > m888g(this.f1255m, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : m896o();
            }
            zM895n = zRequestFocus;
        } else if (i == 17 || i == 1) {
            zM895n = m895n();
        } else if (i == 66 || i == 2) {
            zM895n = m896o();
        }
        if (zM895n) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zM895n;
    }

    /* JADX INFO: renamed from: c */
    public boolean m884c(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m884c(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f1256n == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f1268z));
        }
        return i > 0 && scrollX < ((int) (((float) clientWidth) * this.f1221A));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0198g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f1262t = true;
        if (this.f1261s.isFinished() || !this.f1261s.computeScrollOffset()) {
            m885d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f1261s.getCurrX();
        int currY = this.f1261s.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m897p(currX)) {
                this.f1261s.abortAnimation();
                scrollTo(0, currY);
            }
        }
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: d */
    public final void m885d(boolean z) {
        boolean z2 = this.f1251h0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f1261s.isFinished()) {
                this.f1261s.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f1261s.getCurrX();
                int currY = this.f1261s.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m897p(currX);
                    }
                }
            }
        }
        this.f1225E = false;
        for (int i = 0; i < this.f1253k.size(); i++) {
            C0197f c0197f = this.f1253k.get(i);
            if (c0197f.f1274c) {
                c0197f.f1274c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (!z) {
                this.f1250g0.run();
                return;
            }
            Runnable runnable = this.f1250g0;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            postOnAnimation(runnable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zM895n;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zM895n = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 21) {
                    zM895n = keyEvent.hasModifiers(2) ? m895n() : m883b(17);
                } else if (keyCode == 22) {
                    zM895n = keyEvent.hasModifiers(2) ? m896o() : m883b(66);
                } else if (keyCode != 61) {
                    zM895n = false;
                } else if (keyEvent.hasNoModifiers()) {
                    zM895n = m883b(2);
                } else if (keyEvent.hasModifiers(1)) {
                    zM895n = m883b(1);
                } else {
                    zM895n = false;
                }
            }
            if (!zM895n) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0197f c0197fM889h;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c0197fM889h = m889h(childAt)) != null && c0197fM889h.f1273b == this.f1257o && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter2 pagerAdapter2;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter2 = this.f1256n) != null && pagerAdapter2.mo12480c() > 1)) {
            if (!this.f1242V.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f1268z * width);
                this.f1242V.setSize(height, width);
                zDraw = false | this.f1242V.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f1243W.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f1221A + 1.0f)) * width2);
                this.f1243W.setSize(height2, width2);
                zDraw |= this.f1243W.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f1242V.finish();
            this.f1243W.finish();
        }
        if (zDraw) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1265w;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* JADX INFO: renamed from: e */
    public void m886e() {
        int iMo12480c = this.f1256n.mo12480c();
        this.f1252j = iMo12480c;
        boolean z = this.f1253k.size() < (this.f1226F * 2) + 1 && this.f1253k.size() < iMo12480c;
        int iMax = this.f1257o;
        int i = 0;
        boolean z2 = false;
        while (i < this.f1253k.size()) {
            C0197f c0197f = this.f1253k.get(i);
            int iMo12481d = this.f1256n.mo12481d(c0197f.f1272a);
            if (iMo12481d != -1) {
                if (iMo12481d == -2) {
                    this.f1253k.remove(i);
                    i--;
                    if (!z2) {
                        this.f1256n.mo15664k(this);
                        z2 = true;
                    }
                    this.f1256n.mo12479a(this, c0197f.f1273b, c0197f.f1272a);
                    int i2 = this.f1257o;
                    if (i2 == c0197f.f1273b) {
                        iMax = Math.max(0, Math.min(i2, iMo12480c - 1));
                    }
                } else {
                    int i3 = c0197f.f1273b;
                    if (i3 != iMo12481d) {
                        if (i3 == this.f1257o) {
                            iMax = iMo12481d;
                        }
                        c0197f.f1273b = iMo12481d;
                    }
                }
                z = true;
            }
            i++;
        }
        if (z2) {
            this.f1256n.mo15662b(this);
        }
        Collections.sort(this.f1253k, f1218g);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                C0198g c0198g = (C0198g) getChildAt(i4).getLayoutParams();
                if (!c0198g.f1277a) {
                    c0198g.f1279c = 0.0f;
                }
            }
            m905x(iMax, false, true, 0);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m887f(int i) {
        InterfaceC0201j interfaceC0201j = this.f1248e0;
        if (interfaceC0201j != null) {
            interfaceC0201j.mo908b(i);
        }
        List<InterfaceC0201j> list = this.f1247d0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0201j interfaceC0201j2 = this.f1247d0.get(i2);
                if (interfaceC0201j2 != null) {
                    interfaceC0201j2.mo908b(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final Rect m888g(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0198g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public PagerAdapter2 getAdapter() {
        return this.f1256n;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f1257o;
    }

    public int getOffscreenPageLimit() {
        return this.f1226F;
    }

    public int getPageMargin() {
        return this.f1264v;
    }

    /* JADX INFO: renamed from: h */
    public C0197f m889h(View view) {
        for (int i = 0; i < this.f1253k.size(); i++) {
            C0197f c0197f = this.f1253k.get(i);
            if (this.f1256n.mo12483g(view, c0197f.f1272a)) {
                return c0197f;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final C0197f m890i() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.f1264v / clientWidth : 0.0f;
        C0197f c0197f = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f1253k.size()) {
            C0197f c0197f2 = this.f1253k.get(i3);
            if (!z && c0197f2.f1273b != (i = i2 + 1)) {
                c0197f2 = this.f1254l;
                c0197f2.f1276e = f + f3 + f2;
                c0197f2.f1273b = i;
                Objects.requireNonNull(this.f1256n);
                c0197f2.f1275d = 1.0f;
                i3--;
            }
            f = c0197f2.f1276e;
            float f4 = c0197f2.f1275d + f + f2;
            if (!z && scrollX < f) {
                return c0197f;
            }
            if (scrollX < f4 || i3 == this.f1253k.size() - 1) {
                return c0197f2;
            }
            i2 = c0197f2.f1273b;
            f3 = c0197f2.f1275d;
            i3++;
            c0197f = c0197f2;
            z = false;
        }
        return c0197f;
    }

    /* JADX INFO: renamed from: j */
    public C0197f m891j(int i) {
        for (int i2 = 0; i2 < this.f1253k.size(); i2++) {
            C0197f c0197f = this.f1253k.get(i2);
            if (c0197f.f1273b == i) {
                return c0197f;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m892k() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f1261s = new Scroller(context, f1219h);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1231K = viewConfiguration.getScaledPagingTouchSlop();
        this.f1238R = (int) (400.0f * f);
        this.f1239S = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1242V = new EdgeEffect(context);
        this.f1243W = new EdgeEffect(context);
        this.f1240T = (int) (25.0f * f);
        this.f1241U = (int) (2.0f * f);
        this.f1229I = (int) (f * 16.0f);
        ViewCompat.m16327u(this, new C0199h());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        ViewCompat.c.m16336d(this, new C0195d());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX INFO: renamed from: l */
    public void m893l(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.f1246c0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C0198g c0198g = (C0198g) childAt.getLayoutParams();
                if (c0198g.f1277a) {
                    int i4 = c0198g.f1278b & 7;
                    if (i4 != 1) {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        InterfaceC0201j interfaceC0201j = this.f1248e0;
        if (interfaceC0201j != null) {
            interfaceC0201j.mo909c(i, f, i2);
        }
        List<InterfaceC0201j> list = this.f1247d0;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                InterfaceC0201j interfaceC0201j2 = this.f1247d0.get(i6);
                if (interfaceC0201j2 != null) {
                    interfaceC0201j2.mo909c(i, f, i2);
                }
            }
        }
        this.f1245b0 = true;
    }

    /* JADX INFO: renamed from: m */
    public final void m894m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1236P) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1232L = motionEvent.getX(i);
            this.f1236P = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1237Q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m895n() {
        int i = this.f1257o;
        if (i <= 0) {
            return false;
        }
        mo904w(i - 1, true);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public boolean m896o() {
        PagerAdapter2 pagerAdapter2 = this.f1256n;
        if (pagerAdapter2 == null || this.f1257o >= pagerAdapter2.mo12480c() - 1) {
            return false;
        }
        mo904w(this.f1257o + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1244a0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1250g0);
        Scroller scroller = this.f1261s;
        if (scroller != null && !scroller.isFinished()) {
            this.f1261s.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.f1264v <= 0 || this.f1265w == null || this.f1253k.size() <= 0 || this.f1256n == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f2 = width;
        float f3 = this.f1264v / f2;
        int i2 = 0;
        C0197f c0197f = this.f1253k.get(0);
        float f4 = c0197f.f1276e;
        int size = this.f1253k.size();
        int i3 = c0197f.f1273b;
        int i4 = this.f1253k.get(size - 1).f1273b;
        while (i3 < i4) {
            while (true) {
                i = c0197f.f1273b;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                c0197f = this.f1253k.get(i2);
            }
            if (i3 == i) {
                float f5 = c0197f.f1276e;
                float f6 = c0197f.f1275d;
                f = (f5 + f6) * f2;
                f4 = f5 + f6 + f3;
            } else {
                Objects.requireNonNull(this.f1256n);
                f = (f4 + 1.0f) * f2;
                f4 = 1.0f + f3 + f4;
            }
            if (this.f1264v + f > scrollX) {
                this.f1265w.setBounds(Math.round(f), this.f1266x, Math.round(this.f1264v + f), this.f1267y);
                this.f1265w.draw(canvas);
            }
            if (f > scrollX + width) {
                return;
            }
            i3++;
            f3 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m902u();
            return false;
        }
        if (action != 0) {
            if (this.f1227G) {
                return true;
            }
            if (this.f1228H) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f1234N = x;
            this.f1232L = x;
            float y = motionEvent.getY();
            this.f1235O = y;
            this.f1233M = y;
            this.f1236P = motionEvent.getPointerId(0);
            this.f1228H = false;
            this.f1262t = true;
            this.f1261s.computeScrollOffset();
            if (this.f1251h0 != 2 || Math.abs(this.f1261s.getFinalX() - this.f1261s.getCurrX()) <= this.f1241U) {
                m885d(false);
                this.f1227G = false;
            } else {
                this.f1261s.abortAnimation();
                this.f1225E = false;
                m899r(this.f1257o);
                this.f1227G = true;
                m901t(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f1236P;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.f1232L;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.f1235O);
                if (f != 0.0f) {
                    float f2 = this.f1232L;
                    if (!((f2 < ((float) this.f1230J) && f > 0.0f) || (f2 > ((float) (getWidth() - this.f1230J)) && f < 0.0f)) && m884c(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f1232L = x2;
                        this.f1233M = y2;
                        this.f1228H = true;
                        return false;
                    }
                }
                int i2 = this.f1231K;
                if (fAbs > i2 && fAbs * 0.5f > fAbs2) {
                    this.f1227G = true;
                    m901t(true);
                    setScrollState(1);
                    float f3 = this.f1234N;
                    float f4 = this.f1231K;
                    this.f1232L = f > 0.0f ? f3 + f4 : f3 - f4;
                    this.f1233M = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i2) {
                    this.f1228H = true;
                }
                if (this.f1227G && m898q(x2)) {
                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m894m(motionEvent);
        }
        if (this.f1237Q == null) {
            this.f1237Q = VelocityTracker.obtain();
        }
        this.f1237Q.addMovement(motionEvent);
        return this.f1227G;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C0197f c0197fM889h;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0198g c0198g = (C0198g) childAt.getLayoutParams();
                if (c0198g.f1277a) {
                    int i9 = c0198g.f1278b;
                    int i10 = i9 & 7;
                    int i11 = i9 & 112;
                    if (i10 != 1) {
                        if (i10 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i11 != 16) {
                            if (i11 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i11 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i12 = paddingLeft + scrollX;
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + paddingTop);
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i13 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i13;
                        int i14 = paddingLeft + scrollX;
                        childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i15;
                    if (i11 != 16) {
                        if (i11 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i11 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i16 = paddingLeft + scrollX;
                        childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i17 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i17;
                    int i18 = paddingLeft + scrollX;
                    childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + paddingTop);
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i19 = (i5 - paddingLeft) - paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                C0198g c0198g2 = (C0198g) childAt2.getLayoutParams();
                if (!c0198g2.f1277a && (c0197fM889h = m889h(childAt2)) != null) {
                    float f = i19;
                    int i21 = ((int) (c0197fM889h.f1276e * f)) + paddingLeft;
                    if (c0198g2.f1280d) {
                        c0198g2.f1280d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c0198g2.f1279c), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f1266x = paddingTop;
        this.f1267y = i6 - paddingBottom;
        this.f1246c0 = i7;
        if (this.f1244a0) {
            z2 = false;
            m903v(this.f1257o, false, 0, false);
        } else {
            z2 = false;
        }
        this.f1244a0 = z2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af A[SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C0198g c0198g;
        C0198g c0198g2;
        int i3;
        int i4;
        int i5;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f1230J = Math.min(measuredWidth / 10, this.f1229I);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (c0198g2 = (C0198g) childAt.getLayoutParams()) != null && c0198g2.f1277a) {
                int i8 = c0198g2.f1278b;
                int i9 = i8 & 7;
                int i10 = i8 & 112;
                boolean z2 = i10 == 48 || i10 == 80;
                if (i9 != 3 && i9 != 5) {
                    z = false;
                }
                int i11 = Integer.MIN_VALUE;
                if (z2) {
                    i11 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                    i4 = ((ViewGroup.LayoutParams) c0198g2).width;
                    if (i4 != -2) {
                        if (i4 == -1) {
                            i4 = paddingLeft;
                        }
                        i11 = 1073741824;
                    } else {
                        i4 = paddingLeft;
                    }
                    i5 = ((ViewGroup.LayoutParams) c0198g2).height;
                    if (i5 != -2) {
                        i5 = measuredHeight;
                        i7 = i3;
                    } else if (i5 == -1) {
                        i5 = measuredHeight;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                    if (z2) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i4 = ((ViewGroup.LayoutParams) c0198g2).width;
                if (i4 != -2) {
                    if (i4 == -1) {
                        i4 = paddingLeft;
                    }
                    i11 = 1073741824;
                } else {
                    i4 = paddingLeft;
                }
                i5 = ((ViewGroup.LayoutParams) c0198g2).height;
                if (i5 != -2) {
                    i5 = measuredHeight;
                    i7 = i3;
                } else if (i5 == -1) {
                    i5 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f1222B = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f1223C = true;
        m899r(this.f1257o);
        this.f1223C = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c0198g = (C0198g) childAt2.getLayoutParams()) == null || !c0198g.f1277a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0198g.f1279c), 1073741824), this.f1222B);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C0197f c0197fM889h;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c0197fM889h = m889h(childAt)) != null && c0197fM889h.f1273b == this.f1257o && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0203l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0203l c0203l = (C0203l) parcelable;
        super.onRestoreInstanceState(c0203l.f38150g);
        PagerAdapter2 pagerAdapter2 = this.f1256n;
        if (pagerAdapter2 != null) {
            pagerAdapter2.mo12484h(c0203l.f1286i, c0203l.f1287j);
            m905x(c0203l.f1285h, false, true, 0);
        } else {
            this.f1258p = c0203l.f1285h;
            this.f1259q = c0203l.f1286i;
            this.f1260r = c0203l.f1287j;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0203l c0203l = new C0203l(super.onSaveInstanceState());
        c0203l.f1285h = this.f1257o;
        PagerAdapter2 pagerAdapter2 = this.f1256n;
        if (pagerAdapter2 != null) {
            c0203l.f1286i = pagerAdapter2.mo12485i();
        }
        return c0203l;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f1264v;
            m900s(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter2 pagerAdapter2;
        boolean zM902u = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter2 = this.f1256n) == null || pagerAdapter2.mo12480c() == 0) {
            return false;
        }
        if (this.f1237Q == null) {
            this.f1237Q = VelocityTracker.obtain();
        }
        this.f1237Q.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f1261s.abortAnimation();
            this.f1225E = false;
            m899r(this.f1257o);
            float x = motionEvent.getX();
            this.f1234N = x;
            this.f1232L = x;
            float y = motionEvent.getY();
            this.f1235O = y;
            this.f1233M = y;
            this.f1236P = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f1232L = motionEvent.getX(actionIndex);
                        this.f1236P = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m894m(motionEvent);
                        this.f1232L = motionEvent.getX(motionEvent.findPointerIndex(this.f1236P));
                    }
                } else if (this.f1227G) {
                    m903v(this.f1257o, true, 0, false);
                    zM902u = m902u();
                }
            } else if (!this.f1227G) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1236P);
                if (iFindPointerIndex == -1) {
                    zM902u = m902u();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.f1232L);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.f1233M);
                    if (fAbs > this.f1231K && fAbs > fAbs2) {
                        this.f1227G = true;
                        m901t(true);
                        float f = this.f1234N;
                        this.f1232L = x2 - f > 0.0f ? f + this.f1231K : f - this.f1231K;
                        this.f1233M = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f1227G) {
                        zM902u = false | m898q(motionEvent.getX(motionEvent.findPointerIndex(this.f1236P)));
                    }
                }
            } else if (this.f1227G) {
                zM902u = false | m898q(motionEvent.getX(motionEvent.findPointerIndex(this.f1236P)));
            }
        } else if (this.f1227G) {
            VelocityTracker velocityTracker = this.f1237Q;
            velocityTracker.computeCurrentVelocity(CloseCodes.NORMAL_CLOSURE, this.f1239S);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f1236P);
            this.f1225E = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C0197f c0197fM890i = m890i();
            float f2 = clientWidth;
            float f3 = this.f1264v / f2;
            int iMax = c0197fM890i.f1273b;
            float f4 = ((scrollX / f2) - c0197fM890i.f1276e) / (c0197fM890i.f1275d + f3);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f1236P)) - this.f1234N)) <= this.f1240T || Math.abs(xVelocity) <= this.f1238R) {
                iMax += (int) (f4 + (iMax >= this.f1257o ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                iMax++;
            }
            if (this.f1253k.size() > 0) {
                C0197f c0197f = this.f1253k.get(0);
                ArrayList<C0197f> arrayList = this.f1253k;
                iMax = Math.max(c0197f.f1273b, Math.min(iMax, arrayList.get(arrayList.size() - 1).f1273b));
            }
            m905x(iMax, true, true, xVelocity);
            zM902u = m902u();
        }
        if (zM902u) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m897p(int i) {
        if (this.f1253k.size() == 0) {
            if (this.f1244a0) {
                return false;
            }
            this.f1245b0 = false;
            m893l(0, 0.0f, 0);
            if (this.f1245b0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0197f c0197fM890i = m890i();
        int clientWidth = getClientWidth();
        int i2 = this.f1264v;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = c0197fM890i.f1273b;
        float f2 = ((i / f) - c0197fM890i.f1276e) / (c0197fM890i.f1275d + (i2 / f));
        this.f1245b0 = false;
        m893l(i4, f2, (int) (i3 * f2));
        if (this.f1245b0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m898q(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f1232L - f;
        this.f1232L = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f1268z * clientWidth;
        float f4 = this.f1221A * clientWidth;
        boolean z3 = false;
        C0197f c0197f = this.f1253k.get(0);
        ArrayList<C0197f> arrayList = this.f1253k;
        C0197f c0197f2 = arrayList.get(arrayList.size() - 1);
        if (c0197f.f1273b != 0) {
            f3 = c0197f.f1276e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c0197f2.f1273b != this.f1256n.mo12480c() - 1) {
            f4 = c0197f2.f1276e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f1242V.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f1243W.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f1232L = (scrollX - i) + this.f1232L;
        scrollTo(i, getScrollY());
        m897p(i);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00ed A[PHI: r3 r6 r12
  0x00ed: PHI (r3v22 int) = (r3v21 int), (r3v10 int), (r3v24 int) binds: [B:60:0x00e2, B:57:0x00cc, B:51:0x00b6] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r6v6 int) = (r6v1 int), (r6v5 int), (r6v8 int) binds: [B:60:0x00e2, B:57:0x00cc, B:51:0x00b6] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r12v5 float) = (r12v3 float), (r12v4 float), (r12v2 float) binds: [B:60:0x00e2, B:57:0x00cc, B:51:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0183 A[PHI: r1 r10
  0x0183: PHI (r1v19 float) = (r1v17 float), (r1v18 float), (r1v16 float) binds: [B:94:0x0178, B:91:0x015e, B:85:0x0142] A[DONT_GENERATE, DONT_INLINE]
  0x0183: PHI (r10v30 int) = (r10v28 int), (r10v29 int), (r10v27 int) binds: [B:94:0x0178, B:91:0x015e, B:85:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: r */
    public void m899r(int i) {
        C0197f c0197fM891j;
        String hexString;
        C0197f c0197fM882a;
        C0197f c0197fM889h;
        C0197f c0197fM889h2;
        int i2;
        int i3;
        C0197f c0197f;
        C0197f c0197f2;
        int i4 = this.f1257o;
        if (i4 != i) {
            c0197fM891j = m891j(i4);
            this.f1257o = i;
        } else {
            c0197fM891j = null;
        }
        if (this.f1256n == null || this.f1225E || getWindowToken() == null) {
            return;
        }
        this.f1256n.mo15664k(this);
        int i5 = this.f1226F;
        int iMax = Math.max(0, this.f1257o - i5);
        int iMo12480c = this.f1256n.mo12480c();
        int iMin = Math.min(iMo12480c - 1, this.f1257o + i5);
        if (iMo12480c != this.f1252j) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sbM1556G = outline.m1556G("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            sbM1556G.append(this.f1252j);
            sbM1556G.append(", found: ");
            sbM1556G.append(iMo12480c);
            sbM1556G.append(" Pager id: ");
            sbM1556G.append(hexString);
            sbM1556G.append(" Pager class: ");
            sbM1556G.append(getClass());
            sbM1556G.append(" Problematic adapter: ");
            sbM1556G.append(this.f1256n.getClass());
            throw new IllegalStateException(sbM1556G.toString());
        }
        int i6 = 0;
        while (true) {
            if (i6 < this.f1253k.size()) {
                c0197fM882a = this.f1253k.get(i6);
                int i7 = c0197fM882a.f1273b;
                int i8 = this.f1257o;
                if (i7 >= i8) {
                    if (i7 != i8) {
                        break;
                    } else {
                        break;
                    }
                }
                i6++;
            }
            c0197fM882a = null;
            break;
        }
        if (c0197fM882a == null && iMo12480c > 0) {
            c0197fM882a = m882a(this.f1257o, i6);
        }
        if (c0197fM882a != null) {
            int i9 = i6 - 1;
            C0197f c0197f3 = i9 >= 0 ? this.f1253k.get(i9) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - c0197fM882a.f1275d) + (getPaddingLeft() / clientWidth);
            float f = 0.0f;
            for (int i10 = this.f1257o - 1; i10 >= 0; i10--) {
                if (f >= paddingLeft && i10 < iMax) {
                    if (c0197f3 == null) {
                        break;
                    }
                    if (i10 == c0197f3.f1273b && !c0197f3.f1274c) {
                        this.f1253k.remove(i9);
                        this.f1256n.mo12479a(this, i10, c0197f3.f1272a);
                        i9--;
                        i6--;
                        if (i9 >= 0) {
                            c0197f3 = this.f1253k.get(i9);
                        } else {
                            c0197f3 = null;
                        }
                    }
                } else if (c0197f3 == null || i10 != c0197f3.f1273b) {
                    f += m882a(i10, i9 + 1).f1275d;
                    i6++;
                    if (i9 >= 0) {
                        c0197f3 = this.f1253k.get(i9);
                    } else {
                        c0197f3 = null;
                    }
                } else {
                    f += c0197f3.f1275d;
                    i9--;
                    if (i9 >= 0) {
                        c0197f3 = this.f1253k.get(i9);
                    } else {
                        c0197f3 = null;
                    }
                }
            }
            float f2 = c0197fM882a.f1275d;
            int i11 = i6 + 1;
            if (f2 < 2.0f) {
                C0197f c0197f4 = i11 < this.f1253k.size() ? this.f1253k.get(i11) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i12 = i11;
                for (int i13 = this.f1257o + 1; i13 < iMo12480c; i13++) {
                    if (f2 >= paddingRight && i13 > iMin) {
                        if (c0197f4 == null) {
                            break;
                        }
                        if (i13 == c0197f4.f1273b && !c0197f4.f1274c) {
                            this.f1253k.remove(i12);
                            this.f1256n.mo12479a(this, i13, c0197f4.f1272a);
                            if (i12 < this.f1253k.size()) {
                                c0197f4 = this.f1253k.get(i12);
                            } else {
                                c0197f4 = null;
                            }
                        }
                    } else if (c0197f4 == null || i13 != c0197f4.f1273b) {
                        C0197f c0197fM882a2 = m882a(i13, i12);
                        i12++;
                        f2 += c0197fM882a2.f1275d;
                        if (i12 < this.f1253k.size()) {
                            c0197f4 = this.f1253k.get(i12);
                        } else {
                            c0197f4 = null;
                        }
                    } else {
                        f2 += c0197f4.f1275d;
                        i12++;
                        if (i12 < this.f1253k.size()) {
                            c0197f4 = this.f1253k.get(i12);
                        } else {
                            c0197f4 = null;
                        }
                    }
                }
            }
            int iMo12480c2 = this.f1256n.mo12480c();
            int clientWidth2 = getClientWidth();
            float f3 = clientWidth2 > 0 ? this.f1264v / clientWidth2 : 0.0f;
            if (c0197fM891j != null) {
                int i14 = c0197fM891j.f1273b;
                int i15 = c0197fM882a.f1273b;
                if (i14 < i15) {
                    float f4 = c0197fM891j.f1276e + c0197fM891j.f1275d + f3;
                    int i16 = 0;
                    while (true) {
                        i14++;
                        if (i14 > c0197fM882a.f1273b || i16 >= this.f1253k.size()) {
                            break;
                        }
                        C0197f c0197f5 = this.f1253k.get(i16);
                        while (true) {
                            c0197f2 = c0197f5;
                            if (i14 <= c0197f2.f1273b || i16 >= this.f1253k.size() - 1) {
                                break;
                            }
                            i16++;
                            c0197f5 = this.f1253k.get(i16);
                        }
                        while (i14 < c0197f2.f1273b) {
                            Objects.requireNonNull(this.f1256n);
                            f4 += 1.0f + f3;
                            i14++;
                        }
                        c0197f2.f1276e = f4;
                        f4 += c0197f2.f1275d + f3;
                    }
                } else if (i14 > i15) {
                    int size = this.f1253k.size() - 1;
                    float f5 = c0197fM891j.f1276e;
                    while (true) {
                        i14--;
                        if (i14 < c0197fM882a.f1273b || size < 0) {
                            break;
                        }
                        C0197f c0197f6 = this.f1253k.get(size);
                        while (true) {
                            c0197f = c0197f6;
                            if (i14 >= c0197f.f1273b || size <= 0) {
                                break;
                            }
                            size--;
                            c0197f6 = this.f1253k.get(size);
                        }
                        while (i14 > c0197f.f1273b) {
                            Objects.requireNonNull(this.f1256n);
                            f5 -= 1.0f + f3;
                            i14--;
                        }
                        f5 -= c0197f.f1275d + f3;
                        c0197f.f1276e = f5;
                    }
                }
            }
            int size2 = this.f1253k.size();
            float f6 = c0197fM882a.f1276e;
            int i17 = c0197fM882a.f1273b;
            int i18 = i17 - 1;
            this.f1268z = i17 == 0 ? f6 : -3.4028235E38f;
            int i19 = iMo12480c2 - 1;
            this.f1221A = i17 == i19 ? (c0197fM882a.f1275d + f6) - 1.0f : Float.MAX_VALUE;
            int i20 = i6 - 1;
            while (i20 >= 0) {
                C0197f c0197f7 = this.f1253k.get(i20);
                while (true) {
                    i3 = c0197f7.f1273b;
                    if (i18 <= i3) {
                        break;
                    }
                    i18--;
                    Objects.requireNonNull(this.f1256n);
                    f6 -= 1.0f + f3;
                }
                f6 -= c0197f7.f1275d + f3;
                c0197f7.f1276e = f6;
                if (i3 == 0) {
                    this.f1268z = f6;
                }
                i20--;
                i18--;
            }
            float f7 = c0197fM882a.f1276e + c0197fM882a.f1275d + f3;
            int i21 = c0197fM882a.f1273b;
            while (true) {
                i21++;
                if (i11 >= size2) {
                    break;
                }
                C0197f c0197f8 = this.f1253k.get(i11);
                while (true) {
                    i2 = c0197f8.f1273b;
                    if (i21 >= i2) {
                        break;
                    }
                    i21++;
                    Objects.requireNonNull(this.f1256n);
                    f7 += 1.0f + f3;
                }
                if (i2 == i19) {
                    this.f1221A = (c0197f8.f1275d + f7) - 1.0f;
                }
                c0197f8.f1276e = f7;
                f7 += c0197f8.f1275d + f3;
                i11++;
            }
            this.f1256n.mo15663j(this, this.f1257o, c0197fM882a.f1272a);
        }
        this.f1256n.mo15662b(this);
        int childCount = getChildCount();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            C0198g c0198g = (C0198g) childAt.getLayoutParams();
            c0198g.f1282f = i22;
            if (!c0198g.f1277a && c0198g.f1279c == 0.0f && (c0197fM889h2 = m889h(childAt)) != null) {
                c0198g.f1279c = c0197fM889h2.f1275d;
                c0198g.f1281e = c0197fM889h2.f1273b;
            }
        }
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                c0197fM889h = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    c0197fM889h = m889h(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        c0197fM889h = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (c0197fM889h == null || c0197fM889h.f1273b != this.f1257o) {
                for (int i23 = 0; i23 < getChildCount(); i23++) {
                    View childAt2 = getChildAt(i23);
                    C0197f c0197fM889h3 = m889h(childAt2);
                    if (c0197fM889h3 != null && c0197fM889h3.f1273b == this.f1257o && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f1223C) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m900s(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.f1253k.isEmpty()) {
            if (!this.f1261s.isFinished()) {
                this.f1261s.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        C0197f c0197fM891j = m891j(this.f1257o);
        int iMin = (int) ((c0197fM891j != null ? Math.min(c0197fM891j.f1276e, this.f1221A) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            m885d(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public void setAdapter(PagerAdapter2 pagerAdapter2) {
        PagerAdapter2 pagerAdapter3 = this.f1256n;
        if (pagerAdapter3 != null) {
            synchronized (pagerAdapter3) {
            }
            this.f1256n.mo15664k(this);
            for (int i = 0; i < this.f1253k.size(); i++) {
                C0197f c0197f = this.f1253k.get(i);
                this.f1256n.mo12479a(this, c0197f.f1273b, c0197f.f1272a);
            }
            this.f1256n.mo15662b(this);
            this.f1253k.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C0198g) getChildAt(i2).getLayoutParams()).f1277a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f1257o = 0;
            scrollTo(0, 0);
        }
        PagerAdapter2 pagerAdapter4 = this.f1256n;
        this.f1256n = pagerAdapter2;
        this.f1252j = 0;
        if (pagerAdapter2 != null) {
            if (this.f1263u == null) {
                this.f1263u = new C0202k();
            }
            synchronized (this.f1256n) {
            }
            this.f1225E = false;
            boolean z = this.f1244a0;
            this.f1244a0 = true;
            this.f1252j = this.f1256n.mo12480c();
            if (this.f1258p >= 0) {
                this.f1256n.mo12484h(this.f1259q, this.f1260r);
                m905x(this.f1258p, false, true, 0);
                this.f1258p = -1;
                this.f1259q = null;
                this.f1260r = null;
            } else if (z) {
                requestLayout();
            } else {
                m899r(this.f1257o);
            }
        }
        List<InterfaceC0200i> list = this.f1249f0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f1249f0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f1249f0.get(i3).mo906a(this, pagerAdapter4, pagerAdapter2);
        }
    }

    public void setCurrentItem(int i) {
        this.f1225E = false;
        m905x(i, !this.f1244a0, false, 0);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f1226F) {
            this.f1226F = i;
            m899r(this.f1257o);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC0201j interfaceC0201j) {
        this.f1248e0 = interfaceC0201j;
    }

    public void setPageMargin(int i) {
        int i2 = this.f1264v;
        this.f1264v = i;
        int width = getWidth();
        m900s(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f1265w = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f1251h0 == i) {
            return;
        }
        this.f1251h0 = i;
        InterfaceC0201j interfaceC0201j = this.f1248e0;
        if (interfaceC0201j != null) {
            interfaceC0201j.mo907a(i);
        }
        List<InterfaceC0201j> list = this.f1247d0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0201j interfaceC0201j2 = this.f1247d0.get(i2);
                if (interfaceC0201j2 != null) {
                    interfaceC0201j2.mo907a(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m901t(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m902u() {
        this.f1236P = -1;
        this.f1227G = false;
        this.f1228H = false;
        VelocityTracker velocityTracker = this.f1237Q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1237Q = null;
        }
        this.f1242V.onRelease();
        this.f1243W.onRelease();
        return this.f1242V.isFinished() || this.f1243W.isFinished();
    }

    /* JADX INFO: renamed from: v */
    public final void m903v(int i, boolean z, int i2, boolean z2) {
        int iMax;
        int scrollX;
        int iAbs;
        C0197f c0197fM891j = m891j(i);
        if (c0197fM891j != null) {
            iMax = (int) (Math.max(this.f1268z, Math.min(c0197fM891j.f1276e, this.f1221A)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (!z) {
            if (z2) {
                m887f(i);
            }
            m885d(false);
            scrollTo(iMax, 0);
            m897p(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f1261s;
            if ((scroller == null || scroller.isFinished()) ? false : true) {
                scrollX = this.f1262t ? this.f1261s.getCurrX() : this.f1261s.getStartX();
                this.f1261s.abortAnimation();
                setScrollingCacheEnabled(false);
            } else {
                scrollX = getScrollX();
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = iMax - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                m885d(false);
                m899r(this.f1257o);
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i6 = clientWidth / 2;
                float f = clientWidth;
                float f2 = i6;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int iAbs2 = Math.abs(i2);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    Objects.requireNonNull(this.f1256n);
                    iAbs = (int) (((Math.abs(i4) / ((f * 1.0f) + this.f1264v)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f1262t = false;
                this.f1261s.startScroll(i3, scrollY, i4, i5, iMin);
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            m887f(i);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1265w;
    }

    /* JADX INFO: renamed from: w */
    public void mo904w(int i, boolean z) {
        this.f1225E = false;
        m905x(i, z, false, 0);
    }

    /* JADX INFO: renamed from: x */
    public void m905x(int i, boolean z, boolean z2, int i2) {
        PagerAdapter2 pagerAdapter2 = this.f1256n;
        if (pagerAdapter2 == null || pagerAdapter2.mo12480c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f1257o == i && this.f1253k.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f1256n.mo12480c()) {
            i = this.f1256n.mo12480c() - 1;
        }
        int i3 = this.f1226F;
        int i4 = this.f1257o;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.f1253k.size(); i5++) {
                this.f1253k.get(i5).f1274c = true;
            }
        }
        boolean z3 = this.f1257o != i;
        if (!this.f1244a0) {
            m899r(i);
            m903v(i, z, i2, z3);
        } else {
            this.f1257o = i;
            if (z3) {
                m887f(i);
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$g */
    public static class C0198g extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a */
        public boolean f1277a;

        /* JADX INFO: renamed from: b */
        public int f1278b;

        /* JADX INFO: renamed from: c */
        public float f1279c;

        /* JADX INFO: renamed from: d */
        public boolean f1280d;

        /* JADX INFO: renamed from: e */
        public int f1281e;

        /* JADX INFO: renamed from: f */
        public int f1282f;

        public C0198g() {
            super(-1, -1);
            this.f1279c = 0.0f;
        }

        public C0198g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1279c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f1217f);
            this.f1278b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0198g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i) {
        Context context = getContext();
        Object obj = ContextCompat.f37815a;
        setPageMarginDrawable(ContextCompat.c.m16141b(context, i));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1253k = new ArrayList<>();
        this.f1254l = new C0197f();
        this.f1255m = new Rect();
        this.f1258p = -1;
        this.f1259q = null;
        this.f1260r = null;
        this.f1268z = -3.4028235E38f;
        this.f1221A = Float.MAX_VALUE;
        this.f1226F = 1;
        this.f1236P = -1;
        this.f1244a0 = true;
        this.f1250g0 = new RunnableC0194c();
        this.f1251h0 = 0;
        m892k();
    }
}
