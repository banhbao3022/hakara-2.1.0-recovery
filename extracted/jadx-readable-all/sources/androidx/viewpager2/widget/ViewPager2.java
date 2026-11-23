package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p704i0.C8024a;
import p636z0.p704i0.p705b.StatefulAdapter;
import p636z0.p704i0.p706c.CompositeOnPageChangeCallback;
import p636z0.p704i0.p706c.FakeDrag;
import p636z0.p704i0.p706c.PageTransformerAdapter;
import p636z0.p704i0.p706c.ScrollEventAdapter;
import p636z0.p704i0.p706c.ViewPager22;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityViewCommand;
import p636z0.p774z.p775b.PagerSnapHelper;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: f */
    public final Rect f1307f;

    /* JADX INFO: renamed from: g */
    public final Rect f1308g;

    /* JADX INFO: renamed from: h */
    public CompositeOnPageChangeCallback f1309h;

    /* JADX INFO: renamed from: i */
    public int f1310i;

    /* JADX INFO: renamed from: j */
    public boolean f1311j;

    /* JADX INFO: renamed from: k */
    public RecyclerView.AbstractC0154g f1312k;

    /* JADX INFO: renamed from: l */
    public LinearLayoutManager f1313l;

    /* JADX INFO: renamed from: m */
    public int f1314m;

    /* JADX INFO: renamed from: n */
    public Parcelable f1315n;

    /* JADX INFO: renamed from: o */
    public RecyclerView f1316o;

    /* JADX INFO: renamed from: p */
    public PagerSnapHelper f1317p;

    /* JADX INFO: renamed from: q */
    public ScrollEventAdapter f1318q;

    /* JADX INFO: renamed from: r */
    public CompositeOnPageChangeCallback f1319r;

    /* JADX INFO: renamed from: s */
    public FakeDrag f1320s;

    /* JADX INFO: renamed from: t */
    public PageTransformerAdapter f1321t;

    /* JADX INFO: renamed from: u */
    public RecyclerView.AbstractC0157j f1322u;

    /* JADX INFO: renamed from: v */
    public boolean f1323v;

    /* JADX INFO: renamed from: w */
    public boolean f1324w;

    /* JADX INFO: renamed from: x */
    public int f1325x;

    /* JADX INFO: renamed from: y */
    public AbstractC0212d f1326y;

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$a */
    public class C0209a extends AbstractC0213e {
        public C0209a() {
            super(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: a */
        public void mo678a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f1311j = true;
            viewPager2.f1318q.f37204l = true;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$b */
    public class C0210b extends AbstractC0215g {
        public C0210b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0215g
        /* JADX INFO: renamed from: a */
        public void mo928a(int i) {
            if (i == 0) {
                ViewPager2.this.m927e();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0215g
        /* JADX INFO: renamed from: c */
        public void mo929c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f1310i != i) {
                viewPager2.f1310i = i;
                viewPager2.f1326y.mo931b();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$c */
    public class C0211c extends AbstractC0215g {
        public C0211c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0215g
        /* JADX INFO: renamed from: c */
        public void mo929c(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f1316o.requestFocus(2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$d */
    public abstract class AbstractC0212d {
        public AbstractC0212d(ViewPager2 viewPager2, C0209a c0209a) {
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo930a(CompositeOnPageChangeCallback compositeOnPageChangeCallback, RecyclerView recyclerView);

        /* JADX INFO: renamed from: b */
        public abstract void mo931b();
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$e */
    public static abstract class AbstractC0213e extends RecyclerView.AbstractC0154g {
        public AbstractC0213e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: b */
        public final void mo679b(int i, int i2) {
            mo678a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: c */
        public final void mo680c(int i, int i2, Object obj) {
            mo678a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: d */
        public final void mo681d(int i, int i2) {
            mo678a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: e */
        public final void mo682e(int i, int i2, int i3) {
            mo678a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: f */
        public final void mo683f(int i, int i2) {
            mo678a();
        }

        public AbstractC0213e(C0209a c0209a) {
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$f */
    public class C0214f extends LinearLayoutManager {
        public C0214f(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
        /* JADX INFO: renamed from: D0 */
        public boolean mo711D0(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, int i, Bundle bundle) {
            Objects.requireNonNull(ViewPager2.this.f1326y);
            return super.mo711D0(c0167t, c0172y, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
        /* JADX INFO: renamed from: K0 */
        public boolean mo725K0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* JADX INFO: renamed from: a1 */
        public void mo527a1(RecyclerView.C0172y c0172y, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo527a1(c0172y, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
        /* JADX INFO: renamed from: l0 */
        public void mo755l0(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.mo755l0(c0167t, c0172y, accessibilityNodeInfoCompat);
            Objects.requireNonNull(ViewPager2.this.f1326y);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$g */
    public static abstract class AbstractC0215g {
        /* JADX INFO: renamed from: a */
        public void mo928a(int i) {
        }

        /* JADX INFO: renamed from: b */
        public void mo932b(int i, float f, int i2) {
        }

        /* JADX INFO: renamed from: c */
        public void mo929c(int i) {
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$h */
    public class C0216h extends AbstractC0212d {

        /* JADX INFO: renamed from: a */
        public final AccessibilityViewCommand f1331a;

        /* JADX INFO: renamed from: b */
        public final AccessibilityViewCommand f1332b;

        /* JADX INFO: renamed from: c */
        public RecyclerView.AbstractC0154g f1333c;

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$h$a */
        public class a implements AccessibilityViewCommand {
            public a() {
            }

            @Override // p636z0.p725k.p739l.p740b0.AccessibilityViewCommand
            /* JADX INFO: renamed from: a */
            public boolean mo935a(View view, AccessibilityViewCommand.a aVar) {
                C0216h.this.m933c(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$h$b */
        public class b implements AccessibilityViewCommand {
            public b() {
            }

            @Override // p636z0.p725k.p739l.p740b0.AccessibilityViewCommand
            /* JADX INFO: renamed from: a */
            public boolean mo935a(View view, AccessibilityViewCommand.a aVar) {
                C0216h.this.m933c(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$h$c */
        public class c extends AbstractC0213e {
            public c() {
                super(null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
            /* JADX INFO: renamed from: a */
            public void mo678a() {
                C0216h.this.m934d();
            }
        }

        public C0216h() {
            super(ViewPager2.this, null);
            this.f1331a = new a();
            this.f1332b = new b();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0212d
        /* JADX INFO: renamed from: a */
        public void mo930a(CompositeOnPageChangeCallback compositeOnPageChangeCallback, RecyclerView recyclerView) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            recyclerView.setImportantForAccessibility(2);
            this.f1333c = new c();
            if (ViewPager2.this.getImportantForAccessibility() == 0) {
                ViewPager2.this.setImportantForAccessibility(1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0212d
        /* JADX INFO: renamed from: b */
        public void mo931b() {
            m934d();
        }

        /* JADX INFO: renamed from: c */
        public void m933c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f1324w) {
                viewPager2.m926d(i, true);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m934d() {
            int iMo662d;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = R.id.accessibilityActionPageLeft;
            ViewCompat.m16323q(viewPager2, R.id.accessibilityActionPageLeft);
            ViewCompat.m16323q(viewPager2, R.id.accessibilityActionPageRight);
            ViewCompat.m16323q(viewPager2, R.id.accessibilityActionPageUp);
            ViewCompat.m16323q(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (iMo662d = ViewPager2.this.getAdapter().mo662d()) == 0) {
                return;
            }
            ViewPager2 viewPager3 = ViewPager2.this;
            if (viewPager3.f1324w) {
                if (viewPager3.getOrientation() != 0) {
                    if (ViewPager2.this.f1310i < iMo662d - 1) {
                        ViewCompat.m16325s(viewPager2, new AccessibilityNodeInfoCompat.a(R.id.accessibilityActionPageDown, null), null, this.f1331a);
                    }
                    if (ViewPager2.this.f1310i > 0) {
                        ViewCompat.m16325s(viewPager2, new AccessibilityNodeInfoCompat.a(R.id.accessibilityActionPageUp, null), null, this.f1332b);
                        return;
                    }
                    return;
                }
                boolean zM924b = ViewPager2.this.m924b();
                int i2 = zM924b ? R.id.accessibilityActionPageLeft : R.id.accessibilityActionPageRight;
                if (zM924b) {
                    i = R.id.accessibilityActionPageRight;
                }
                if (ViewPager2.this.f1310i < iMo662d - 1) {
                    ViewCompat.m16325s(viewPager2, new AccessibilityNodeInfoCompat.a(i2, null), null, this.f1331a);
                }
                if (ViewPager2.this.f1310i > 0) {
                    ViewCompat.m16325s(viewPager2, new AccessibilityNodeInfoCompat.a(i, null), null, this.f1332b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public interface InterfaceC0217i {
        /* JADX INFO: renamed from: a */
        void m936a(View view, float f);
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$j */
    public class C0218j extends PagerSnapHelper {
        public C0218j() {
        }

        @Override // p636z0.p774z.p775b.PagerSnapHelper, p636z0.p774z.p775b.SnapHelper
        /* JADX INFO: renamed from: e */
        public View mo937e(RecyclerView.AbstractC0160m abstractC0160m) {
            if (ViewPager2.this.f1320s.f37190a.f37205m) {
                return null;
            }
            return super.mo937e(abstractC0160m);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public class C0219k extends RecyclerView {
        public C0219k(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            Objects.requireNonNull(ViewPager2.this.f1326y);
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f1310i);
            accessibilityEvent.setToIndex(ViewPager2.this.f1310i);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f1324w && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f1324w && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$m */
    public static class RunnableC0221m implements Runnable {

        /* JADX INFO: renamed from: f */
        public final int f1343f;

        /* JADX INFO: renamed from: g */
        public final RecyclerView f1344g;

        public RunnableC0221m(int i, RecyclerView recyclerView) {
            this.f1343f = i;
            this.f1344g = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1344g.m617m0(this.f1343f);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.f1307f = new Rect();
        this.f1308g = new Rect();
        this.f1309h = new CompositeOnPageChangeCallback(3);
        this.f1311j = false;
        this.f1312k = new C0209a();
        this.f1314m = -1;
        this.f1322u = null;
        this.f1323v = false;
        this.f1324w = true;
        this.f1325x = -1;
        m923a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m923a(Context context, AttributeSet attributeSet) {
        this.f1326y = new C0216h();
        C0219k c0219k = new C0219k(context);
        this.f1316o = c0219k;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        c0219k.setId(View.generateViewId());
        this.f1316o.setDescendantFocusability(131072);
        C0214f c0214f = new C0214f(context);
        this.f1313l = c0214f;
        this.f1316o.setLayoutManager(c0214f);
        this.f1316o.setScrollingTouchSlop(1);
        int[] iArr = C8024a.f37176a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f1316o.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            RecyclerView recyclerView = this.f1316o;
            ViewPager22 viewPager22 = new ViewPager22(this);
            if (recyclerView.f943O == null) {
                recyclerView.f943O = new ArrayList();
            }
            recyclerView.f943O.add(viewPager22);
            ScrollEventAdapter scrollEventAdapter = new ScrollEventAdapter(this);
            this.f1318q = scrollEventAdapter;
            this.f1320s = new FakeDrag(this, scrollEventAdapter, this.f1316o);
            C0218j c0218j = new C0218j();
            this.f1317p = c0218j;
            c0218j.mo14020b(this.f1316o);
            this.f1316o.m607h(this.f1318q);
            CompositeOnPageChangeCallback compositeOnPageChangeCallback = new CompositeOnPageChangeCallback(3);
            this.f1319r = compositeOnPageChangeCallback;
            this.f1318q.f37193a = compositeOnPageChangeCallback;
            C0210b c0210b = new C0210b();
            C0211c c0211c = new C0211c();
            this.f1319r.f37189a.add(c0210b);
            this.f1319r.f37189a.add(c0211c);
            this.f1326y.mo930a(this.f1319r, this.f1316o);
            CompositeOnPageChangeCallback compositeOnPageChangeCallback2 = this.f1319r;
            compositeOnPageChangeCallback2.f37189a.add(this.f1309h);
            PageTransformerAdapter pageTransformerAdapter = new PageTransformerAdapter(this.f1313l);
            this.f1321t = pageTransformerAdapter;
            this.f1319r.f37189a.add(pageTransformerAdapter);
            RecyclerView recyclerView2 = this.f1316o;
            attachViewToParent(recyclerView2, 0, recyclerView2.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m924b() {
        return this.f1313l.m724K() == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m925c() {
        RecyclerView.AbstractC0152e adapter;
        if (this.f1314m == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f1315n;
        if (parcelable != null) {
            if (adapter instanceof StatefulAdapter) {
                ((StatefulAdapter) adapter).mo912b(parcelable);
            }
            this.f1315n = null;
        }
        int iMax = Math.max(0, Math.min(this.f1314m, adapter.mo662d() - 1));
        this.f1310i = iMax;
        this.f1314m = -1;
        this.f1316o.m612j0(iMax);
        ((C0216h) this.f1326y).m934d();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.f1316o.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.f1316o.canScrollVertically(i);
    }

    /* JADX INFO: renamed from: d */
    public void m926d(int i, boolean z) {
        RecyclerView.AbstractC0152e adapter = getAdapter();
        if (adapter == null) {
            if (this.f1314m != -1) {
                this.f1314m = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.mo662d() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.mo662d() - 1);
        int i2 = this.f1310i;
        if (iMin == i2) {
            if (this.f1318q.f37198f == 0) {
                return;
            }
        }
        if (iMin == i2 && z) {
            return;
        }
        double d = i2;
        this.f1310i = iMin;
        ((C0216h) this.f1326y).m934d();
        ScrollEventAdapter scrollEventAdapter = this.f1318q;
        if (!(scrollEventAdapter.f37198f == 0)) {
            scrollEventAdapter.m15869f();
            ScrollEventAdapter.a aVar = scrollEventAdapter.f37199g;
            d = ((double) aVar.f37206a) + ((double) aVar.f37207b);
        }
        ScrollEventAdapter scrollEventAdapter2 = this.f1318q;
        scrollEventAdapter2.f37197e = z ? 2 : 3;
        scrollEventAdapter2.f37205m = false;
        boolean z2 = scrollEventAdapter2.f37201i != iMin;
        scrollEventAdapter2.f37201i = iMin;
        scrollEventAdapter2.m15867d(2);
        if (z2) {
            scrollEventAdapter2.m15866c(iMin);
        }
        if (!z) {
            this.f1316o.m612j0(iMin);
            return;
        }
        double d2 = iMin;
        if (Math.abs(d2 - d) <= 3.0d) {
            this.f1316o.m617m0(iMin);
            return;
        }
        this.f1316o.m612j0(d2 > d ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f1316o;
        recyclerView.post(new RunnableC0221m(iMin, recyclerView));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof C0220l) {
            int i = ((C0220l) parcelable).f1340f;
            sparseArray.put(this.f1316o.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m925c();
    }

    /* JADX INFO: renamed from: e */
    public void m927e() {
        PagerSnapHelper pagerSnapHelper = this.f1317p;
        if (pagerSnapHelper == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewMo937e = pagerSnapHelper.mo937e(this.f1313l);
        if (viewMo937e == null) {
            return;
        }
        int iM735R = this.f1313l.m735R(viewMo937e);
        if (iM735R != this.f1310i && getScrollState() == 0) {
            this.f1319r.mo929c(iM735R);
        }
        this.f1311j = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        AbstractC0212d abstractC0212d = this.f1326y;
        Objects.requireNonNull(abstractC0212d);
        if (!(abstractC0212d instanceof C0216h)) {
            return super.getAccessibilityClassName();
        }
        Objects.requireNonNull(this.f1326y);
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.AbstractC0152e getAdapter() {
        return this.f1316o.getAdapter();
    }

    public int getCurrentItem() {
        return this.f1310i;
    }

    public int getItemDecorationCount() {
        return this.f1316o.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f1325x;
    }

    public int getOrientation() {
        return this.f1313l.f877r;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f1316o;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f1318q.f37198f;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iMo662d;
        int iMo662d2;
        RecyclerView.AbstractC0152e adapter;
        int iMo662d3;
        ViewPager2 viewPager2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0216h c0216h = (C0216h) this.f1326y;
        if (ViewPager2.this.getAdapter() != null) {
            if (ViewPager2.this.getOrientation() == 1) {
                iMo662d = ViewPager2.this.getAdapter().mo662d();
            } else {
                iMo662d2 = ViewPager2.this.getAdapter().mo662d();
                iMo662d = 0;
            }
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) AccessibilityNodeInfoCompat.b.m16277a(iMo662d, iMo662d2, false, 0).f38033a);
            adapter = ViewPager2.this.getAdapter();
            if (adapter == null && (iMo662d3 = adapter.mo662d()) != 0) {
                viewPager2 = ViewPager2.this;
                if (viewPager2.f1324w) {
                    if (viewPager2.f1310i > 0) {
                        accessibilityNodeInfo.addAction(8192);
                    }
                    if (ViewPager2.this.f1310i < iMo662d3 - 1) {
                        accessibilityNodeInfo.addAction(4096);
                    }
                    accessibilityNodeInfo.setScrollable(true);
                }
                return;
            }
            return;
        }
        iMo662d = 0;
        iMo662d2 = 0;
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) AccessibilityNodeInfoCompat.b.m16277a(iMo662d, iMo662d2, false, 0).f38033a);
        adapter = ViewPager2.this.getAdapter();
        if (adapter == null) {
            return;
        }
        viewPager2 = ViewPager2.this;
        if (viewPager2.f1324w) {
            return;
        }
        if (viewPager2.f1310i > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (ViewPager2.this.f1310i < iMo662d3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f1316o.getMeasuredWidth();
        int measuredHeight = this.f1316o.getMeasuredHeight();
        this.f1307f.left = getPaddingLeft();
        this.f1307f.right = (i3 - i) - getPaddingRight();
        this.f1307f.top = getPaddingTop();
        this.f1307f.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f1307f, this.f1308g);
        RecyclerView recyclerView = this.f1316o;
        Rect rect = this.f1308g;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f1311j) {
            m927e();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        measureChild(this.f1316o, i, i2);
        int measuredWidth = this.f1316o.getMeasuredWidth();
        int measuredHeight = this.f1316o.getMeasuredHeight();
        int measuredState = this.f1316o.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0220l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0220l c0220l = (C0220l) parcelable;
        super.onRestoreInstanceState(c0220l.getSuperState());
        this.f1314m = c0220l.f1341g;
        this.f1315n = c0220l.f1342h;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0220l c0220l = new C0220l(super.onSaveInstanceState());
        c0220l.f1340f = this.f1316o.getId();
        int i = this.f1314m;
        if (i == -1) {
            i = this.f1310i;
        }
        c0220l.f1341g = i;
        Parcelable parcelable = this.f1315n;
        if (parcelable != null) {
            c0220l.f1342h = parcelable;
        } else {
            Object adapter = this.f1316o.getAdapter();
            if (adapter instanceof StatefulAdapter) {
                c0220l.f1342h = ((StatefulAdapter) adapter).mo911a();
            }
        }
        return c0220l;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        Objects.requireNonNull((C0216h) this.f1326y);
        if (!(i == 8192 || i == 4096)) {
            return super.performAccessibilityAction(i, bundle);
        }
        C0216h c0216h = (C0216h) this.f1326y;
        Objects.requireNonNull(c0216h);
        if (!(i == 8192 || i == 4096)) {
            throw new IllegalStateException();
        }
        c0216h.m933c(i == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
        return true;
    }

    public void setAdapter(RecyclerView.AbstractC0152e abstractC0152e) {
        RecyclerView.AbstractC0152e adapter = this.f1316o.getAdapter();
        C0216h c0216h = (C0216h) this.f1326y;
        Objects.requireNonNull(c0216h);
        if (adapter != null) {
            adapter.f1023a.unregisterObserver(c0216h.f1333c);
        }
        if (adapter != null) {
            adapter.f1023a.unregisterObserver(this.f1312k);
        }
        this.f1316o.setAdapter(abstractC0152e);
        this.f1310i = 0;
        m925c();
        C0216h c0216h2 = (C0216h) this.f1326y;
        c0216h2.m934d();
        if (abstractC0152e != null) {
            abstractC0152e.f1023a.registerObserver(c0216h2.f1333c);
        }
        if (abstractC0152e != null) {
            abstractC0152e.f1023a.registerObserver(this.f1312k);
        }
    }

    public void setCurrentItem(int i) {
        if (this.f1320s.f37190a.f37205m) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        m926d(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        ((C0216h) this.f1326y).m934d();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f1325x = i;
        this.f1316o.requestLayout();
    }

    public void setOrientation(int i) {
        this.f1313l.m518D1(i);
        ((C0216h) this.f1326y).m934d();
    }

    public void setPageTransformer(InterfaceC0217i interfaceC0217i) {
        if (interfaceC0217i != null) {
            if (!this.f1323v) {
                this.f1322u = this.f1316o.getItemAnimator();
                this.f1323v = true;
            }
            this.f1316o.setItemAnimator(null);
        } else if (this.f1323v) {
            this.f1316o.setItemAnimator(this.f1322u);
            this.f1322u = null;
            this.f1323v = false;
        }
        PageTransformerAdapter pageTransformerAdapter = this.f1321t;
        if (interfaceC0217i == pageTransformerAdapter.f37192b) {
            return;
        }
        pageTransformerAdapter.f37192b = interfaceC0217i;
        if (interfaceC0217i == null) {
            return;
        }
        ScrollEventAdapter scrollEventAdapter = this.f1318q;
        scrollEventAdapter.m15869f();
        ScrollEventAdapter.a aVar = scrollEventAdapter.f37199g;
        double d = ((double) aVar.f37206a) + ((double) aVar.f37207b);
        int i = (int) d;
        float f = (float) (d - ((double) i));
        this.f1321t.mo932b(i, f, Math.round(getPageSize() * f));
    }

    public void setUserInputEnabled(boolean z) {
        this.f1324w = z;
        ((C0216h) this.f1326y).m934d();
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$l */
    public static class C0220l extends View.BaseSavedState {
        public static final Parcelable.Creator<C0220l> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public int f1340f;

        /* JADX INFO: renamed from: g */
        public int f1341g;

        /* JADX INFO: renamed from: h */
        public Parcelable f1342h;

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$l$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0220l> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return Build.VERSION.SDK_INT >= 24 ? new C0220l(parcel, null) : new C0220l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0220l[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0220l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new C0220l(parcel, classLoader) : new C0220l(parcel);
            }
        }

        public C0220l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1340f = parcel.readInt();
            this.f1341g = parcel.readInt();
            this.f1342h = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1340f);
            parcel.writeInt(this.f1341g);
            parcel.writeParcelable(this.f1342h, i);
        }

        public C0220l(Parcel parcel) {
            super(parcel);
            this.f1340f = parcel.readInt();
            this.f1341g = parcel.readInt();
            this.f1342h = parcel.readParcelable(null);
        }

        public C0220l(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1307f = new Rect();
        this.f1308g = new Rect();
        this.f1309h = new CompositeOnPageChangeCallback(3);
        this.f1311j = false;
        this.f1312k = new C0209a();
        this.f1314m = -1;
        this.f1322u = null;
        this.f1323v = false;
        this.f1324w = true;
        this.f1325x = -1;
        m923a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1307f = new Rect();
        this.f1308g = new Rect();
        this.f1309h = new CompositeOnPageChangeCallback(3);
        this.f1311j = false;
        this.f1312k = new C0209a();
        this.f1314m = -1;
        this.f1322u = null;
        this.f1323v = false;
        this.f1324w = true;
        this.f1325x = -1;
        m923a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1307f = new Rect();
        this.f1308g = new Rect();
        this.f1309h = new CompositeOnPageChangeCallback(3);
        this.f1311j = false;
        this.f1312k = new C0209a();
        this.f1314m = -1;
        this.f1322u = null;
        this.f1323v = false;
        this.f1324w = true;
        this.f1325x = -1;
        m923a(context, attributeSet);
    }
}
