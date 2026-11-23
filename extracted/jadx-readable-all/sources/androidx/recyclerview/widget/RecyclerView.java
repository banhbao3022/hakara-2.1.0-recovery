package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.facebook.stetho.websocket.CloseCodes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p725k.p735h.TraceCompat;
import p636z0.p725k.p739l.AccessibilityDelegateCompat;
import p636z0.p725k.p739l.NestedScrollingChild;
import p636z0.p725k.p739l.NestedScrollingChildHelper;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.ViewConfigurationCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;
import p636z0.p745m.p746a.AbsSavedState;
import p636z0.p774z.C8463a;
import p636z0.p774z.p775b.AdapterHelper;
import p636z0.p774z.p775b.ChildHelper;
import p636z0.p774z.p775b.DefaultItemAnimator;
import p636z0.p774z.p775b.FastScroller;
import p636z0.p774z.p775b.GapWorker;
import p636z0.p774z.p775b.RecyclerView2;
import p636z0.p774z.p775b.RecyclerView3;
import p636z0.p774z.p775b.RecyclerViewAccessibilityDelegate;
import p636z0.p774z.p775b.ViewBoundsCheck;
import p636z0.p774z.p775b.ViewInfoStore;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements NestedScrollingChild {

    /* JADX INFO: renamed from: f */
    public static final int[] f910f = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: g */
    public static final boolean f911g;

    /* JADX INFO: renamed from: h */
    public static final boolean f912h;

    /* JADX INFO: renamed from: i */
    public static final boolean f913i;

    /* JADX INFO: renamed from: j */
    public static final Class<?>[] f914j;

    /* JADX INFO: renamed from: k */
    public static final Interpolator f915k;

    /* JADX INFO: renamed from: A */
    public final ArrayList<AbstractC0159l> f916A;

    /* JADX INFO: renamed from: A0 */
    public RecyclerViewAccessibilityDelegate f917A0;

    /* JADX INFO: renamed from: B */
    public final ArrayList<InterfaceC0164q> f918B;

    /* JADX INFO: renamed from: B0 */
    public InterfaceC0155h f919B0;

    /* JADX INFO: renamed from: C */
    public InterfaceC0164q f920C;

    /* JADX INFO: renamed from: C0 */
    public final int[] f921C0;

    /* JADX INFO: renamed from: D */
    public boolean f922D;

    /* JADX INFO: renamed from: D0 */
    public NestedScrollingChildHelper f923D0;

    /* JADX INFO: renamed from: E */
    public boolean f924E;

    /* JADX INFO: renamed from: E0 */
    public final int[] f925E0;

    /* JADX INFO: renamed from: F */
    public boolean f926F;

    /* JADX INFO: renamed from: F0 */
    public final int[] f927F0;

    /* JADX INFO: renamed from: G */
    public boolean f928G;

    /* JADX INFO: renamed from: G0 */
    public final int[] f929G0;

    /* JADX INFO: renamed from: H */
    public int f930H;

    /* JADX INFO: renamed from: H0 */
    public final List<AbstractC0149b0> f931H0;

    /* JADX INFO: renamed from: I */
    public boolean f932I;

    /* JADX INFO: renamed from: I0 */
    public Runnable f933I0;

    /* JADX INFO: renamed from: J */
    public boolean f934J;

    /* JADX INFO: renamed from: J0 */
    public boolean f935J0;

    /* JADX INFO: renamed from: K */
    public boolean f936K;

    /* JADX INFO: renamed from: K0 */
    public int f937K0;

    /* JADX INFO: renamed from: L */
    public int f938L;

    /* JADX INFO: renamed from: L0 */
    public int f939L0;

    /* JADX INFO: renamed from: M */
    public boolean f940M;

    /* JADX INFO: renamed from: M0 */
    public final ViewInfoStore.b f941M0;

    /* JADX INFO: renamed from: N */
    public final AccessibilityManager f942N;

    /* JADX INFO: renamed from: O */
    public List<InterfaceC0162o> f943O;

    /* JADX INFO: renamed from: P */
    public boolean f944P;

    /* JADX INFO: renamed from: Q */
    public boolean f945Q;

    /* JADX INFO: renamed from: R */
    public int f946R;

    /* JADX INFO: renamed from: S */
    public int f947S;

    /* JADX INFO: renamed from: T */
    public C0156i f948T;

    /* JADX INFO: renamed from: U */
    public EdgeEffect f949U;

    /* JADX INFO: renamed from: V */
    public EdgeEffect f950V;

    /* JADX INFO: renamed from: W */
    public EdgeEffect f951W;

    /* JADX INFO: renamed from: a0 */
    public EdgeEffect f952a0;

    /* JADX INFO: renamed from: b0 */
    public AbstractC0157j f953b0;

    /* JADX INFO: renamed from: c0 */
    public int f954c0;

    /* JADX INFO: renamed from: d0 */
    public int f955d0;

    /* JADX INFO: renamed from: e0 */
    public VelocityTracker f956e0;

    /* JADX INFO: renamed from: f0 */
    public int f957f0;

    /* JADX INFO: renamed from: g0 */
    public int f958g0;

    /* JADX INFO: renamed from: h0 */
    public int f959h0;

    /* JADX INFO: renamed from: i0 */
    public int f960i0;

    /* JADX INFO: renamed from: j0 */
    public int f961j0;

    /* JADX INFO: renamed from: k0 */
    public AbstractC0163p f962k0;

    /* JADX INFO: renamed from: l */
    public final C0169v f963l;

    /* JADX INFO: renamed from: l0 */
    public final int f964l0;

    /* JADX INFO: renamed from: m */
    public final C0167t f965m;

    /* JADX INFO: renamed from: m0 */
    public final int f966m0;

    /* JADX INFO: renamed from: n */
    public C0170w f967n;

    /* JADX INFO: renamed from: n0 */
    public float f968n0;

    /* JADX INFO: renamed from: o */
    public AdapterHelper f969o;

    /* JADX INFO: renamed from: o0 */
    public float f970o0;

    /* JADX INFO: renamed from: p */
    public ChildHelper f971p;

    /* JADX INFO: renamed from: p0 */
    public boolean f972p0;

    /* JADX INFO: renamed from: q */
    public final ViewInfoStore f973q;

    /* JADX INFO: renamed from: q0 */
    public final RunnableC0147a0 f974q0;

    /* JADX INFO: renamed from: r */
    public boolean f975r;

    /* JADX INFO: renamed from: r0 */
    public GapWorker f976r0;

    /* JADX INFO: renamed from: s */
    public final Runnable f977s;

    /* JADX INFO: renamed from: s0 */
    public GapWorker.b f978s0;

    /* JADX INFO: renamed from: t */
    public final Rect f979t;

    /* JADX INFO: renamed from: t0 */
    public final C0172y f980t0;

    /* JADX INFO: renamed from: u */
    public final Rect f981u;

    /* JADX INFO: renamed from: u0 */
    public AbstractC0165r f982u0;

    /* JADX INFO: renamed from: v */
    public final RectF f983v;

    /* JADX INFO: renamed from: v0 */
    public List<AbstractC0165r> f984v0;

    /* JADX INFO: renamed from: w */
    public AbstractC0152e f985w;

    /* JADX INFO: renamed from: w0 */
    public boolean f986w0;

    /* JADX INFO: renamed from: x */
    public AbstractC0160m f987x;

    /* JADX INFO: renamed from: x0 */
    public boolean f988x0;

    /* JADX INFO: renamed from: y */
    public InterfaceC0168u f989y;

    /* JADX INFO: renamed from: y0 */
    public AbstractC0157j.b f990y0;

    /* JADX INFO: renamed from: z */
    public final List<InterfaceC0168u> f991z;

    /* JADX INFO: renamed from: z0 */
    public boolean f992z0;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class RunnableC0146a implements Runnable {
        public RunnableC0146a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f928G || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f922D) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f934J) {
                recyclerView2.f932I = true;
            } else {
                recyclerView2.m618n();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public class RunnableC0147a0 implements Runnable {

        /* JADX INFO: renamed from: f */
        public int f994f;

        /* JADX INFO: renamed from: g */
        public int f995g;

        /* JADX INFO: renamed from: h */
        public OverScroller f996h;

        /* JADX INFO: renamed from: i */
        public Interpolator f997i;

        /* JADX INFO: renamed from: j */
        public boolean f998j;

        /* JADX INFO: renamed from: k */
        public boolean f999k;

        public RunnableC0147a0() {
            Interpolator interpolator = RecyclerView.f915k;
            this.f997i = interpolator;
            this.f998j = false;
            this.f999k = false;
            this.f996h = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* JADX INFO: renamed from: a */
        public void m636a() {
            if (this.f998j) {
                this.f999k = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            recyclerView.postOnAnimation(this);
        }

        /* JADX INFO: renamed from: b */
        public void m637b(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z = iAbs > iAbs2;
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    iAbs = iAbs2;
                }
                i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f915k;
            }
            if (this.f997i != interpolator) {
                this.f997i = interpolator;
                this.f996h = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f995g = 0;
            this.f994f = 0;
            RecyclerView.this.setScrollState(2);
            this.f996h.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f996h.computeScrollOffset();
            }
            m636a();
        }

        /* JADX INFO: renamed from: c */
        public void m638c() {
            RecyclerView.this.removeCallbacks(this);
            this.f996h.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f987x == null) {
                m638c();
                return;
            }
            this.f999k = false;
            this.f998j = true;
            recyclerView.m618n();
            OverScroller overScroller = this.f996h;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f994f;
                int i5 = currY - this.f995g;
                this.f994f = currX;
                this.f995g = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f929G0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.m629t(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f929G0;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m616m(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f985w != null) {
                    int[] iArr3 = recyclerView3.f929G0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m610i0(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f929G0;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i4 -= i2;
                    i5 -= i;
                    AbstractC0171x abstractC0171x = recyclerView4.f987x.f1041g;
                    if (abstractC0171x != null && !abstractC0171x.f1082d && abstractC0171x.f1083e) {
                        int iM809b = recyclerView4.f980t0.m809b();
                        if (iM809b == 0) {
                            abstractC0171x.m805g();
                        } else if (abstractC0171x.f1079a >= iM809b) {
                            abstractC0171x.f1079a = iM809b - 1;
                            abstractC0171x.m800b(i2, i);
                        } else {
                            abstractC0171x.m800b(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.f916A.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f929G0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.m630u(i2, i, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f929G0;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.m631v(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                AbstractC0171x abstractC0171x2 = recyclerView7.f987x.f1041g;
                if ((abstractC0171x2 != null && abstractC0171x2.f1082d) || !z) {
                    m636a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    GapWorker gapWorker = recyclerView8.f976r0;
                    if (gapWorker != null) {
                        gapWorker.m17049a(recyclerView8, i2, i);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else {
                            i3 = i6 > 0 ? currVelocity : 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        Objects.requireNonNull(recyclerView9);
                        if (i3 < 0) {
                            recyclerView9.m633x();
                            if (recyclerView9.f949U.isFinished()) {
                                recyclerView9.f949U.onAbsorb(-i3);
                            }
                        } else if (i3 > 0) {
                            recyclerView9.m634y();
                            if (recyclerView9.f951W.isFinished()) {
                                recyclerView9.f951W.onAbsorb(i3);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.m635z();
                            if (recyclerView9.f950V.isFinished()) {
                                recyclerView9.f950V.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.m632w();
                            if (recyclerView9.f952a0.isFinished()) {
                                recyclerView9.f952a0.onAbsorb(currVelocity);
                            }
                        }
                        if (i3 != 0 || currVelocity != 0) {
                            AtomicInteger atomicInteger = ViewCompat.f38073a;
                            recyclerView9.postInvalidateOnAnimation();
                        }
                    }
                    if (RecyclerView.f913i) {
                        GapWorker.b bVar = RecyclerView.this.f978s0;
                        int[] iArr7 = bVar.f39313c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f39314d = 0;
                    }
                }
            }
            AbstractC0171x abstractC0171x3 = RecyclerView.this.f987x.f1041g;
            if (abstractC0171x3 != null && abstractC0171x3.f1082d) {
                abstractC0171x3.m800b(0, 0);
            }
            this.f998j = false;
            if (!this.f999k) {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.m625q0(1);
            } else {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView10 = RecyclerView.this;
                AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                recyclerView10.postOnAnimation(this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class RunnableC0148b implements Runnable {
        public RunnableC0148b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0157j abstractC0157j = RecyclerView.this.f953b0;
            if (abstractC0157j != null) {
                abstractC0157j.mo699n();
            }
            RecyclerView.this.f992z0 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class AbstractC0149b0 {

        /* JADX INFO: renamed from: a */
        public static final List<Object> f1002a = Collections.emptyList();

        /* JADX INFO: renamed from: b */
        public final View f1003b;

        /* JADX INFO: renamed from: c */
        public WeakReference<RecyclerView> f1004c;

        /* JADX INFO: renamed from: k */
        public int f1012k;

        /* JADX INFO: renamed from: s */
        public RecyclerView f1020s;

        /* JADX INFO: renamed from: t */
        public AbstractC0152e<? extends AbstractC0149b0> f1021t;

        /* JADX INFO: renamed from: d */
        public int f1005d = -1;

        /* JADX INFO: renamed from: e */
        public int f1006e = -1;

        /* JADX INFO: renamed from: f */
        public long f1007f = -1;

        /* JADX INFO: renamed from: g */
        public int f1008g = -1;

        /* JADX INFO: renamed from: h */
        public int f1009h = -1;

        /* JADX INFO: renamed from: i */
        public AbstractC0149b0 f1010i = null;

        /* JADX INFO: renamed from: j */
        public AbstractC0149b0 f1011j = null;

        /* JADX INFO: renamed from: l */
        public List<Object> f1013l = null;

        /* JADX INFO: renamed from: m */
        public List<Object> f1014m = null;

        /* JADX INFO: renamed from: n */
        public int f1015n = 0;

        /* JADX INFO: renamed from: o */
        public C0167t f1016o = null;

        /* JADX INFO: renamed from: p */
        public boolean f1017p = false;

        /* JADX INFO: renamed from: q */
        public int f1018q = 0;

        /* JADX INFO: renamed from: r */
        public int f1019r = -1;

        public AbstractC0149b0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f1003b = view;
        }

        /* JADX INFO: renamed from: a */
        public void m639a(Object obj) {
            if (obj == null) {
                m640b(1024);
                return;
            }
            if ((1024 & this.f1012k) == 0) {
                if (this.f1013l == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f1013l = arrayList;
                    this.f1014m = Collections.unmodifiableList(arrayList);
                }
                this.f1013l.add(obj);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m640b(int i) {
            this.f1012k = i | this.f1012k;
        }

        /* JADX INFO: renamed from: c */
        public void m641c() {
            this.f1006e = -1;
            this.f1009h = -1;
        }

        /* JADX INFO: renamed from: d */
        public void m642d() {
            this.f1012k &= -33;
        }

        @Deprecated
        /* JADX INFO: renamed from: e */
        public final int m643e() {
            RecyclerView recyclerView;
            AbstractC0152e<? extends AbstractC0149b0> adapter;
            int iM580H;
            if (this.f1021t == null || (recyclerView = this.f1020s) == null || (adapter = recyclerView.getAdapter()) == null || (iM580H = this.f1020s.m580H(this)) == -1 || this.f1021t != adapter) {
                return -1;
            }
            return iM580H;
        }

        /* JADX INFO: renamed from: f */
        public final int m644f() {
            int i = this.f1009h;
            return i == -1 ? this.f1005d : i;
        }

        /* JADX INFO: renamed from: g */
        public List<Object> m645g() {
            if ((this.f1012k & 1024) != 0) {
                return f1002a;
            }
            List<Object> list = this.f1013l;
            return (list == null || list.size() == 0) ? f1002a : this.f1014m;
        }

        /* JADX INFO: renamed from: h */
        public boolean m646h(int i) {
            return (i & this.f1012k) != 0;
        }

        /* JADX INFO: renamed from: i */
        public boolean m647i() {
            return (this.f1003b.getParent() == null || this.f1003b.getParent() == this.f1020s) ? false : true;
        }

        /* JADX INFO: renamed from: j */
        public boolean m648j() {
            return (this.f1012k & 1) != 0;
        }

        /* JADX INFO: renamed from: k */
        public boolean m649k() {
            return (this.f1012k & 4) != 0;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m650l() {
            if ((this.f1012k & 16) == 0) {
                View view = this.f1003b;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                if (!view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: m */
        public boolean m651m() {
            return (this.f1012k & 8) != 0;
        }

        /* JADX INFO: renamed from: n */
        public boolean m652n() {
            return this.f1016o != null;
        }

        /* JADX INFO: renamed from: o */
        public boolean m653o() {
            return (this.f1012k & 256) != 0;
        }

        /* JADX INFO: renamed from: p */
        public boolean m654p() {
            return (this.f1012k & 2) != 0;
        }

        /* JADX INFO: renamed from: q */
        public void m655q(int i, boolean z) {
            if (this.f1006e == -1) {
                this.f1006e = this.f1005d;
            }
            if (this.f1009h == -1) {
                this.f1009h = this.f1005d;
            }
            if (z) {
                this.f1009h += i;
            }
            this.f1005d += i;
            if (this.f1003b.getLayoutParams() != null) {
                ((C0161n) this.f1003b.getLayoutParams()).f1060c = true;
            }
        }

        /* JADX INFO: renamed from: r */
        public void m656r() {
            this.f1012k = 0;
            this.f1005d = -1;
            this.f1006e = -1;
            this.f1007f = -1L;
            this.f1009h = -1;
            this.f1015n = 0;
            this.f1010i = null;
            this.f1011j = null;
            List<Object> list = this.f1013l;
            if (list != null) {
                list.clear();
            }
            this.f1012k &= -1025;
            this.f1018q = 0;
            this.f1019r = -1;
            RecyclerView.m573k(this);
        }

        /* JADX INFO: renamed from: s */
        public void m657s(int i, int i2) {
            this.f1012k = (i & i2) | (this.f1012k & (~i2));
        }

        /* JADX INFO: renamed from: t */
        public final void m658t(boolean z) {
            int i = this.f1015n;
            int i2 = z ? i - 1 : i + 1;
            this.f1015n = i2;
            if (i2 < 0) {
                this.f1015n = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i2 == 1) {
                this.f1012k |= 16;
            } else if (z && i2 == 0) {
                this.f1012k &= -17;
            }
        }

        public String toString() {
            StringBuilder sbM1561L = outline.m1561L(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbM1561L.append(Integer.toHexString(hashCode()));
            sbM1561L.append(" position=");
            sbM1561L.append(this.f1005d);
            sbM1561L.append(" id=");
            sbM1561L.append(this.f1007f);
            sbM1561L.append(", oldPos=");
            sbM1561L.append(this.f1006e);
            sbM1561L.append(", pLpos:");
            sbM1561L.append(this.f1009h);
            StringBuilder sb = new StringBuilder(sbM1561L.toString());
            if (m652n()) {
                sb.append(" scrap ");
                sb.append(this.f1017p ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m649k()) {
                sb.append(" invalid");
            }
            if (!m648j()) {
                sb.append(" unbound");
            }
            if ((this.f1012k & 2) != 0) {
                sb.append(" update");
            }
            if (m651m()) {
                sb.append(" removed");
            }
            if (m659u()) {
                sb.append(" ignored");
            }
            if (m653o()) {
                sb.append(" tmpDetached");
            }
            if (!m650l()) {
                StringBuilder sbM1556G = outline.m1556G(" not recyclable(");
                sbM1556G.append(this.f1015n);
                sbM1556G.append(")");
                sb.append(sbM1556G.toString());
            }
            if ((this.f1012k & 512) != 0 || m649k()) {
                sb.append(" undefined adapter position");
            }
            if (this.f1003b.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* JADX INFO: renamed from: u */
        public boolean m659u() {
            return (this.f1012k & 128) != 0;
        }

        /* JADX INFO: renamed from: v */
        public boolean m660v() {
            return (this.f1012k & 32) != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public class InterpolatorC0150c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C0151d implements ViewInfoStore.b {
        public C0151d() {
        }

        /* JADX INFO: renamed from: a */
        public void m661a(AbstractC0149b0 abstractC0149b0, AbstractC0157j.c cVar, AbstractC0157j.c cVar2) {
            RecyclerView.this.f965m.m795k(abstractC0149b0);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m603f(abstractC0149b0);
            abstractC0149b0.m658t(false);
            if (recyclerView.f953b0.mo689c(abstractC0149b0, cVar, cVar2)) {
                recyclerView.m597Z();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public static abstract class AbstractC0152e<VH extends AbstractC0149b0> {

        /* JADX INFO: renamed from: a */
        public final C0153f f1023a = new C0153f();

        /* JADX INFO: renamed from: b */
        public boolean f1024b = false;

        /* JADX INFO: renamed from: c */
        public int f1025c = 1;

        /* JADX INFO: renamed from: d */
        public abstract int mo662d();

        /* JADX INFO: renamed from: e */
        public long mo663e(int i) {
            return -1L;
        }

        /* JADX INFO: renamed from: f */
        public final void m664f(int i) {
            this.f1023a.m675d(i, 1, null);
        }

        /* JADX INFO: renamed from: g */
        public void mo665g(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: h */
        public abstract void mo666h(VH vh, int i);

        /* JADX INFO: renamed from: i */
        public abstract VH mo667i(ViewGroup viewGroup, int i);

        /* JADX INFO: renamed from: j */
        public void mo668j(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: k */
        public boolean mo669k(VH vh) {
            return false;
        }

        /* JADX INFO: renamed from: l */
        public void mo670l(VH vh) {
        }

        /* JADX INFO: renamed from: m */
        public void mo671m(VH vh) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public static class C0153f extends Observable<AbstractC0154g> {
        /* JADX INFO: renamed from: a */
        public boolean m672a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* JADX INFO: renamed from: b */
        public void m673b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0154g) ((Observable) this).mObservers.get(size)).mo678a();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m674c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0154g) ((Observable) this).mObservers.get(size)).mo682e(i, i2, 1);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m675d(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0154g) ((Observable) this).mObservers.get(size)).mo680c(i, i2, obj);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m676e(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0154g) ((Observable) this).mObservers.get(size)).mo681d(i, i2);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m677f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0154g) ((Observable) this).mObservers.get(size)).mo683f(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class AbstractC0154g {
        /* JADX INFO: renamed from: a */
        public void mo678a() {
        }

        /* JADX INFO: renamed from: b */
        public void mo679b(int i, int i2) {
        }

        /* JADX INFO: renamed from: c */
        public void mo680c(int i, int i2, Object obj) {
            mo679b(i, i2);
        }

        /* JADX INFO: renamed from: d */
        public void mo681d(int i, int i2) {
        }

        /* JADX INFO: renamed from: e */
        public void mo682e(int i, int i2, int i3) {
        }

        /* JADX INFO: renamed from: f */
        public void mo683f(int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public interface InterfaceC0155h {
        /* JADX INFO: renamed from: a */
        int m684a(int i, int i2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static class C0156i {
        /* JADX INFO: renamed from: a */
        public EdgeEffect m685a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static abstract class AbstractC0157j {

        /* JADX INFO: renamed from: a */
        public b f1026a = null;

        /* JADX INFO: renamed from: b */
        public ArrayList<a> f1027b = new ArrayList<>();

        /* JADX INFO: renamed from: c */
        public long f1028c = 120;

        /* JADX INFO: renamed from: d */
        public long f1029d = 120;

        /* JADX INFO: renamed from: e */
        public long f1030e = 250;

        /* JADX INFO: renamed from: f */
        public long f1031f = 250;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$j$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void m700a();
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$j$b */
        public interface b {
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$j$c */
        public static class c {

            /* JADX INFO: renamed from: a */
            public int f1032a;

            /* JADX INFO: renamed from: b */
            public int f1033b;
        }

        /* JADX INFO: renamed from: e */
        public static int m686e(AbstractC0149b0 abstractC0149b0) {
            int i = abstractC0149b0.f1012k & 14;
            if (abstractC0149b0.m649k()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int i2 = abstractC0149b0.f1006e;
            RecyclerView recyclerView = abstractC0149b0.f1020s;
            int iM580H = recyclerView == null ? -1 : recyclerView.m580H(abstractC0149b0);
            return (i2 == -1 || iM580H == -1 || i2 == iM580H) ? i : i | 2048;
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo687a(AbstractC0149b0 abstractC0149b0, c cVar, c cVar2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo688b(AbstractC0149b0 abstractC0149b0, AbstractC0149b0 abstractC0149b1, c cVar, c cVar2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo689c(AbstractC0149b0 abstractC0149b0, c cVar, c cVar2);

        /* JADX INFO: renamed from: d */
        public abstract boolean mo690d(AbstractC0149b0 abstractC0149b0, c cVar, c cVar2);

        /* JADX INFO: renamed from: f */
        public boolean mo691f(AbstractC0149b0 abstractC0149b0) {
            return true;
        }

        /* JADX INFO: renamed from: g */
        public boolean mo692g(AbstractC0149b0 abstractC0149b0, List<Object> list) {
            return mo691f(abstractC0149b0);
        }

        /* JADX INFO: renamed from: h */
        public final void m693h(AbstractC0149b0 abstractC0149b0) {
            b bVar = this.f1026a;
            if (bVar != null) {
                C0158k c0158k = (C0158k) bVar;
                Objects.requireNonNull(c0158k);
                boolean z = true;
                abstractC0149b0.m658t(true);
                if (abstractC0149b0.f1010i != null && abstractC0149b0.f1011j == null) {
                    abstractC0149b0.f1010i = null;
                }
                abstractC0149b0.f1011j = null;
                if ((abstractC0149b0.f1012k & 16) != 0) {
                    return;
                }
                RecyclerView recyclerView = RecyclerView.this;
                View view = abstractC0149b0.f1003b;
                recyclerView.m619n0();
                ChildHelper childHelper = recyclerView.f971p;
                int iIndexOfChild = ((RecyclerView2) childHelper.f39177a).f39135a.indexOfChild(view);
                if (iIndexOfChild == -1) {
                    childHelper.m17012l(view);
                } else if (childHelper.f39178b.m17016d(iIndexOfChild)) {
                    childHelper.f39178b.m17018f(iIndexOfChild);
                    childHelper.m17012l(view);
                    ((RecyclerView2) childHelper.f39177a).m16975c(iIndexOfChild);
                } else {
                    z = false;
                }
                if (z) {
                    AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(view);
                    recyclerView.f965m.m795k(abstractC0149b0M568K);
                    recyclerView.f965m.m792h(abstractC0149b0M568K);
                }
                recyclerView.m623p0(!z);
                if (z || !abstractC0149b0.m653o()) {
                    return;
                }
                RecyclerView.this.removeDetachedView(abstractC0149b0.f1003b, false);
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m694i() {
            int size = this.f1027b.size();
            for (int i = 0; i < size; i++) {
                this.f1027b.get(i).m700a();
            }
            this.f1027b.clear();
        }

        /* JADX INFO: renamed from: j */
        public abstract void mo695j(AbstractC0149b0 abstractC0149b0);

        /* JADX INFO: renamed from: k */
        public abstract void mo696k();

        /* JADX INFO: renamed from: l */
        public abstract boolean mo697l();

        /* JADX INFO: renamed from: m */
        public c m698m(AbstractC0149b0 abstractC0149b0) {
            c cVar = new c();
            View view = abstractC0149b0.f1003b;
            cVar.f1032a = view.getLeft();
            cVar.f1033b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }

        /* JADX INFO: renamed from: n */
        public abstract void mo699n();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public class C0158k implements AbstractC0157j.b {
        public C0158k() {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class AbstractC0159l {
        /* JADX INFO: renamed from: d */
        public void mo701d(Canvas canvas, RecyclerView recyclerView, C0172y c0172y) {
        }

        /* JADX INFO: renamed from: e */
        public void mo702e(Canvas canvas, RecyclerView recyclerView, C0172y c0172y) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static abstract class AbstractC0160m {

        /* JADX INFO: renamed from: a */
        public ChildHelper f1035a;

        /* JADX INFO: renamed from: b */
        public RecyclerView f1036b;

        /* JADX INFO: renamed from: c */
        public final ViewBoundsCheck.b f1037c;

        /* JADX INFO: renamed from: d */
        public final ViewBoundsCheck.b f1038d;

        /* JADX INFO: renamed from: e */
        public ViewBoundsCheck f1039e;

        /* JADX INFO: renamed from: f */
        public ViewBoundsCheck f1040f;

        /* JADX INFO: renamed from: g */
        public AbstractC0171x f1041g;

        /* JADX INFO: renamed from: h */
        public boolean f1042h;

        /* JADX INFO: renamed from: i */
        public boolean f1043i;

        /* JADX INFO: renamed from: j */
        public boolean f1044j;

        /* JADX INFO: renamed from: k */
        public boolean f1045k;

        /* JADX INFO: renamed from: l */
        public int f1046l;

        /* JADX INFO: renamed from: m */
        public boolean f1047m;

        /* JADX INFO: renamed from: n */
        public int f1048n;

        /* JADX INFO: renamed from: o */
        public int f1049o;

        /* JADX INFO: renamed from: p */
        public int f1050p;

        /* JADX INFO: renamed from: q */
        public int f1051q;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        public class a implements ViewBoundsCheck.b {
            public a() {
            }

            @Override // p636z0.p774z.p775b.ViewBoundsCheck.b
            /* JADX INFO: renamed from: a */
            public int mo767a(View view) {
                return AbstractC0160m.this.m710D(view) - ((ViewGroup.MarginLayoutParams) ((C0161n) view.getLayoutParams())).leftMargin;
            }

            @Override // p636z0.p774z.p775b.ViewBoundsCheck.b
            /* JADX INFO: renamed from: b */
            public int mo768b() {
                return AbstractC0160m.this.m730O();
            }

            @Override // p636z0.p774z.p775b.ViewBoundsCheck.b
            /* JADX INFO: renamed from: c */
            public int mo769c() {
                AbstractC0160m abstractC0160m = AbstractC0160m.this;
                return abstractC0160m.f1050p - abstractC0160m.m731P();
            }

            @Override // p636z0.p774z.p775b.ViewBoundsCheck.b
            /* JADX INFO: renamed from: d */
            public View mo770d(int i) {
                return AbstractC0160m.this.m762x(i);
            }

            @Override // p636z0.p774z.p775b.ViewBoundsCheck.b
            /* JADX INFO: renamed from: e */
            public int mo771e(View view) {
                return AbstractC0160m.this.m716G(view) + ((ViewGroup.MarginLayoutParams) ((C0161n) view.getLayoutParams())).rightMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        public class b implements ViewBoundsCheck.b {
            public b() {
            }

            @Override // p636z0.p774z.p775b.ViewBoundsCheck.b
            /* JADX INFO: renamed from: a */
            public int mo767a(View view) {
                return AbstractC0160m.this.m718H(view) - ((ViewGroup.MarginLayoutParams) ((C0161n) view.getLayoutParams())).topMargin;
            }

            @Override // p636z0.p774z.p775b.ViewBoundsCheck.b
            /* JADX INFO: renamed from: b */
            public int mo768b() {
                return AbstractC0160m.this.m733Q();
            }

            @Override // p636z0.p774z.p775b.ViewBoundsCheck.b
            /* JADX INFO: renamed from: c */
            public int mo769c() {
                AbstractC0160m abstractC0160m = AbstractC0160m.this;
                return abstractC0160m.f1051q - abstractC0160m.m729N();
            }

            @Override // p636z0.p774z.p775b.ViewBoundsCheck.b
            /* JADX INFO: renamed from: d */
            public View mo770d(int i) {
                return AbstractC0160m.this.m762x(i);
            }

            @Override // p636z0.p774z.p775b.ViewBoundsCheck.b
            /* JADX INFO: renamed from: e */
            public int mo771e(View view) {
                return AbstractC0160m.this.m707B(view) + ((ViewGroup.MarginLayoutParams) ((C0161n) view.getLayoutParams())).bottomMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m$c */
        public interface c {
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m$d */
        public static class d {

            /* JADX INFO: renamed from: a */
            public int f1054a;

            /* JADX INFO: renamed from: b */
            public int f1055b;

            /* JADX INFO: renamed from: c */
            public boolean f1056c;

            /* JADX INFO: renamed from: d */
            public boolean f1057d;
        }

        public AbstractC0160m() {
            a aVar = new a();
            this.f1037c = aVar;
            b bVar = new b();
            this.f1038d = bVar;
            this.f1039e = new ViewBoundsCheck(aVar);
            this.f1040f = new ViewBoundsCheck(bVar);
            this.f1042h = false;
            this.f1043i = false;
            this.f1044j = true;
            this.f1045k = true;
        }

        /* JADX INFO: renamed from: S */
        public static d m703S(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8463a.f39124a, i, i2);
            dVar.f1054a = typedArrayObtainStyledAttributes.getInt(0, 1);
            dVar.f1055b = typedArrayObtainStyledAttributes.getInt(10, 1);
            dVar.f1056c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            dVar.f1057d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        /* JADX INFO: renamed from: Y */
        public static boolean m704Y(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* JADX INFO: renamed from: h */
        public static int m705h(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001c  */
        /* JADX WARN: Code duplicated, block: B:21:0x002f  */
        /* JADX INFO: renamed from: z */
        public static int m706z(int i, int i2, int i3, int i4, boolean z) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 >= 0) {
                    i2 = 1073741824;
                } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                    i2 = 0;
                    i4 = 0;
                } else {
                    i4 = iMax;
                }
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else {
                if (i4 != -1) {
                    if (i4 == -2) {
                        i2 = (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? Integer.MIN_VALUE : 0;
                    } else {
                        i2 = 0;
                        i4 = 0;
                    }
                }
                i4 = iMax;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        /* JADX INFO: renamed from: A */
        public int mo472A(C0167t c0167t, C0172y c0172y) {
            return -1;
        }

        /* JADX INFO: renamed from: A0 */
        public void mo513A0(Parcelable parcelable) {
        }

        /* JADX INFO: renamed from: B */
        public int m707B(View view) {
            return view.getBottom() + ((C0161n) view.getLayoutParams()).f1059b.bottom;
        }

        /* JADX INFO: renamed from: B0 */
        public Parcelable mo515B0() {
            return null;
        }

        /* JADX INFO: renamed from: C */
        public void m708C(View view, Rect rect) {
            int[] iArr = RecyclerView.f910f;
            C0161n c0161n = (C0161n) view.getLayoutParams();
            Rect rect2 = c0161n.f1059b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0161n).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0161n).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0161n).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0161n).bottomMargin);
        }

        /* JADX INFO: renamed from: C0 */
        public void mo709C0(int i) {
        }

        /* JADX INFO: renamed from: D */
        public int m710D(View view) {
            return view.getLeft() - ((C0161n) view.getLayoutParams()).f1059b.left;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0069 A[PHI: r8
  0x0069: PHI (r8v8 int) = (r8v4 int), (r8v12 int) binds: [B:22:0x0058, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: D0 */
        public boolean mo711D0(C0167t c0167t, C0172y c0172y, int i, Bundle bundle) {
            int iM733Q;
            int iM730O;
            int i2;
            int i3;
            RecyclerView recyclerView = this.f1036b;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                iM733Q = recyclerView.canScrollVertically(1) ? (this.f1051q - m733Q()) - m729N() : 0;
                if (this.f1036b.canScrollHorizontally(1)) {
                    iM730O = (this.f1050p - m730O()) - m731P();
                    i2 = iM733Q;
                    i3 = iM730O;
                } else {
                    i2 = iM733Q;
                    i3 = 0;
                }
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                iM733Q = recyclerView.canScrollVertically(-1) ? -((this.f1051q - m733Q()) - m729N()) : 0;
                if (this.f1036b.canScrollHorizontally(-1)) {
                    iM730O = -((this.f1050p - m730O()) - m731P());
                    i2 = iM733Q;
                    i3 = iM730O;
                } else {
                    i2 = iM733Q;
                    i3 = 0;
                }
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.f1036b.m615l0(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        /* JADX INFO: renamed from: E */
        public int m712E(View view) {
            Rect rect = ((C0161n) view.getLayoutParams()).f1059b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* JADX INFO: renamed from: E0 */
        public boolean m713E0() {
            return false;
        }

        /* JADX INFO: renamed from: F */
        public int m714F(View view) {
            Rect rect = ((C0161n) view.getLayoutParams()).f1059b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* JADX INFO: renamed from: F0 */
        public void m715F0(C0167t c0167t) {
            for (int iM764y = m764y() - 1; iM764y >= 0; iM764y--) {
                if (!RecyclerView.m568K(m762x(iM764y)).m659u()) {
                    m721I0(iM764y, c0167t);
                }
            }
        }

        /* JADX INFO: renamed from: G */
        public int m716G(View view) {
            return view.getRight() + ((C0161n) view.getLayoutParams()).f1059b.right;
        }

        /* JADX INFO: renamed from: G0 */
        public void m717G0(C0167t c0167t) {
            int size = c0167t.f1068a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = c0167t.f1068a.get(i).f1003b;
                AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(view);
                if (!abstractC0149b0M568K.m659u()) {
                    abstractC0149b0M568K.m658t(false);
                    if (abstractC0149b0M568K.m653o()) {
                        this.f1036b.removeDetachedView(view, false);
                    }
                    AbstractC0157j abstractC0157j = this.f1036b.f953b0;
                    if (abstractC0157j != null) {
                        abstractC0157j.mo695j(abstractC0149b0M568K);
                    }
                    abstractC0149b0M568K.m658t(true);
                    AbstractC0149b0 abstractC0149b0M568K2 = RecyclerView.m568K(view);
                    abstractC0149b0M568K2.f1016o = null;
                    abstractC0149b0M568K2.f1017p = false;
                    abstractC0149b0M568K2.m642d();
                    c0167t.m792h(abstractC0149b0M568K2);
                }
            }
            c0167t.f1068a.clear();
            ArrayList<AbstractC0149b0> arrayList = c0167t.f1069b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f1036b.invalidate();
            }
        }

        /* JADX INFO: renamed from: H */
        public int m718H(View view) {
            return view.getTop() - ((C0161n) view.getLayoutParams()).f1059b.top;
        }

        /* JADX INFO: renamed from: H0 */
        public void m719H0(View view, C0167t c0167t) {
            ChildHelper childHelper = this.f1035a;
            int iIndexOfChild = ((RecyclerView2) childHelper.f39177a).f39135a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (childHelper.f39178b.m17018f(iIndexOfChild)) {
                    childHelper.m17012l(view);
                }
                ((RecyclerView2) childHelper.f39177a).m16975c(iIndexOfChild);
            }
            c0167t.m791g(view);
        }

        /* JADX INFO: renamed from: I */
        public View m720I() {
            View focusedChild;
            RecyclerView recyclerView = this.f1036b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f1035a.f39179c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* JADX INFO: renamed from: I0 */
        public void m721I0(int i, C0167t c0167t) {
            View viewM762x = m762x(i);
            m723J0(i);
            c0167t.m791g(viewM762x);
        }

        /* JADX INFO: renamed from: J */
        public int m722J() {
            RecyclerView recyclerView = this.f1036b;
            AbstractC0152e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo662d();
            }
            return 0;
        }

        /* JADX INFO: renamed from: J0 */
        public void m723J0(int i) {
            ChildHelper childHelper;
            int iM17006f;
            View viewM16973a;
            if (m762x(i) == null || (viewM16973a = ((RecyclerView2) childHelper.f39177a).m16973a((iM17006f = (childHelper = this.f1035a).m17006f(i)))) == null) {
                return;
            }
            if (childHelper.f39178b.m17018f(iM17006f)) {
                childHelper.m17012l(viewM16973a);
            }
            ((RecyclerView2) childHelper.f39177a).m16975c(iM17006f);
        }

        /* JADX INFO: renamed from: K */
        public int m724K() {
            RecyclerView recyclerView = this.f1036b;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            return recyclerView.getLayoutDirection();
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
        /* JADX INFO: renamed from: K0 */
        public boolean mo725K0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            boolean z3;
            int[] iArr = new int[2];
            int iM730O = m730O();
            int iM733Q = m733Q();
            int iM731P = this.f1050p - m731P();
            int iM729N = this.f1051q - m729N();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - iM730O;
            int iMin = Math.min(0, i);
            int i2 = top - iM733Q;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - iM731P;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - iM729N);
            if (m724K() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            int i4 = iArr[0];
            int i5 = iArr[1];
            if (z2) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild == null) {
                    z3 = false;
                } else {
                    int iM730O2 = m730O();
                    int iM733Q2 = m733Q();
                    int iM731P2 = this.f1050p - m731P();
                    int iM729N2 = this.f1051q - m729N();
                    Rect rect2 = this.f1036b.f979t;
                    m708C(focusedChild, rect2);
                    if (rect2.left - i4 >= iM731P2 || rect2.right - i4 <= iM730O2 || rect2.top - i5 >= iM729N2 || rect2.bottom - i5 <= iM733Q2) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                }
                if (z3) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                    } else {
                        recyclerView.m615l0(i4, i5, null, Integer.MIN_VALUE, false);
                    }
                    return true;
                }
            } else if (i4 == 0 || i5 != 0) {
                if (z) {
                    recyclerView.scrollBy(i4, i5);
                } else {
                    recyclerView.m615l0(i4, i5, null, Integer.MIN_VALUE, false);
                }
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: L */
        public int m726L() {
            RecyclerView recyclerView = this.f1036b;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            return recyclerView.getMinimumHeight();
        }

        /* JADX INFO: renamed from: L0 */
        public void m727L0() {
            RecyclerView recyclerView = this.f1036b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* JADX INFO: renamed from: M */
        public int m728M() {
            RecyclerView recyclerView = this.f1036b;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            return recyclerView.getMinimumWidth();
        }

        /* JADX INFO: renamed from: M0 */
        public int mo478M0(int i, C0167t c0167t, C0172y c0172y) {
            return 0;
        }

        /* JADX INFO: renamed from: N */
        public int m729N() {
            RecyclerView recyclerView = this.f1036b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* JADX INFO: renamed from: N0 */
        public void mo522N0(int i) {
        }

        /* JADX INFO: renamed from: O */
        public int m730O() {
            RecyclerView recyclerView = this.f1036b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* JADX INFO: renamed from: O0 */
        public int mo481O0(int i, C0167t c0167t, C0172y c0172y) {
            return 0;
        }

        /* JADX INFO: renamed from: P */
        public int m731P() {
            RecyclerView recyclerView = this.f1036b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* JADX INFO: renamed from: P0 */
        public void m732P0(RecyclerView recyclerView) {
            m734Q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* JADX INFO: renamed from: Q */
        public int m733Q() {
            RecyclerView recyclerView = this.f1036b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* JADX INFO: renamed from: Q0 */
        public void m734Q0(int i, int i2) {
            this.f1050p = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f1048n = mode;
            if (mode == 0 && !RecyclerView.f911g) {
                this.f1050p = 0;
            }
            this.f1051q = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f1049o = mode2;
            if (mode2 != 0 || RecyclerView.f911g) {
                return;
            }
            this.f1051q = 0;
        }

        /* JADX INFO: renamed from: R */
        public int m735R(View view) {
            return ((C0161n) view.getLayoutParams()).m772a();
        }

        /* JADX INFO: renamed from: R0 */
        public void mo485R0(Rect rect, int i, int i2) {
            int iM731P = m731P() + m730O() + rect.width();
            int iM729N = m729N() + m733Q() + rect.height();
            this.f1036b.setMeasuredDimension(m705h(i, iM731P, m728M()), m705h(i2, iM729N, m726L()));
        }

        /* JADX INFO: renamed from: S0 */
        public void m736S0(int i, int i2) {
            int iM764y = m764y();
            if (iM764y == 0) {
                this.f1036b.m620o(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < iM764y; i7++) {
                View viewM762x = m762x(i7);
                Rect rect = this.f1036b.f979t;
                m708C(viewM762x, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f1036b.f979t.set(i5, i6, i3, i4);
            mo485R0(this.f1036b.f979t, i, i2);
        }

        /* JADX INFO: renamed from: T */
        public int mo487T(C0167t c0167t, C0172y c0172y) {
            return -1;
        }

        /* JADX INFO: renamed from: T0 */
        public void m737T0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f1036b = null;
                this.f1035a = null;
                this.f1050p = 0;
                this.f1051q = 0;
            } else {
                this.f1036b = recyclerView;
                this.f1035a = recyclerView.f971p;
                this.f1050p = recyclerView.getWidth();
                this.f1051q = recyclerView.getHeight();
            }
            this.f1048n = 1073741824;
            this.f1049o = 1073741824;
        }

        /* JADX INFO: renamed from: U */
        public int m738U() {
            return 0;
        }

        /* JADX INFO: renamed from: U0 */
        public boolean m739U0(View view, int i, int i2, C0161n c0161n) {
            return (!view.isLayoutRequested() && this.f1044j && m704Y(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0161n).width) && m704Y(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0161n).height)) ? false : true;
        }

        /* JADX INFO: renamed from: V */
        public void m740V(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0161n) view.getLayoutParams()).f1059b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f1036b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f1036b.f983v;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* JADX INFO: renamed from: V0 */
        public boolean mo523V0() {
            return false;
        }

        /* JADX INFO: renamed from: W */
        public boolean mo524W() {
            return false;
        }

        /* JADX INFO: renamed from: W0 */
        public boolean m741W0(View view, int i, int i2, C0161n c0161n) {
            return (this.f1044j && m704Y(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0161n).width) && m704Y(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0161n).height)) ? false : true;
        }

        /* JADX INFO: renamed from: X */
        public boolean m742X() {
            return false;
        }

        /* JADX INFO: renamed from: X0 */
        public void mo525X0(RecyclerView recyclerView, C0172y c0172y, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* JADX INFO: renamed from: Y0 */
        public void m743Y0(AbstractC0171x abstractC0171x) {
            AbstractC0171x abstractC0171x2 = this.f1041g;
            if (abstractC0171x2 != null && abstractC0171x != abstractC0171x2 && abstractC0171x2.f1083e) {
                abstractC0171x2.m805g();
            }
            this.f1041g = abstractC0171x;
            RecyclerView recyclerView = this.f1036b;
            recyclerView.f974q0.m638c();
            if (abstractC0171x.f1086h) {
                StringBuilder sbM1556G = outline.m1556G("An instance of ");
                sbM1556G.append(abstractC0171x.getClass().getSimpleName());
                sbM1556G.append(" was started more than once. Each instance of");
                sbM1556G.append(abstractC0171x.getClass().getSimpleName());
                sbM1556G.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", sbM1556G.toString());
            }
            abstractC0171x.f1080b = recyclerView;
            abstractC0171x.f1081c = this;
            int i = abstractC0171x.f1079a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f980t0.f1094a = i;
            abstractC0171x.f1083e = true;
            abstractC0171x.f1082d = true;
            abstractC0171x.f1084f = recyclerView.f987x.mo553t(i);
            abstractC0171x.mo802d();
            abstractC0171x.f1080b.f974q0.m636a();
            abstractC0171x.f1086h = true;
        }

        /* JADX INFO: renamed from: Z */
        public boolean m744Z(View view, boolean z) {
            boolean z2 = this.f1039e.m17022b(view, 24579) && this.f1040f.m17022b(view, 24579);
            return z ? z2 : !z2;
        }

        /* JADX INFO: renamed from: Z0 */
        public boolean mo488Z0() {
            return false;
        }

        /* JADX INFO: renamed from: a0 */
        public void m745a0(View view, int i, int i2, int i3, int i4) {
            C0161n c0161n = (C0161n) view.getLayoutParams();
            Rect rect = c0161n.f1059b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0161n).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0161n).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0161n).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0161n).bottomMargin);
        }

        /* JADX INFO: renamed from: b */
        public void m746b(View view) {
            m748c(view, -1, false);
        }

        /* JADX INFO: renamed from: b0 */
        public void mo747b0(int i) {
            RecyclerView recyclerView = this.f1036b;
            if (recyclerView != null) {
                int iM17005e = recyclerView.f971p.m17005e();
                for (int i2 = 0; i2 < iM17005e; i2++) {
                    recyclerView.f971p.m17004d(i2).offsetLeftAndRight(i);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m748c(View view, int i, boolean z) {
            AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(view);
            if (z || abstractC0149b0M568K.m651m()) {
                this.f1036b.f973q.m17030a(abstractC0149b0M568K);
            } else {
                this.f1036b.f973q.m17035f(abstractC0149b0M568K);
            }
            C0161n c0161n = (C0161n) view.getLayoutParams();
            if (abstractC0149b0M568K.m660v() || abstractC0149b0M568K.m652n()) {
                if (abstractC0149b0M568K.m652n()) {
                    abstractC0149b0M568K.f1016o.m795k(abstractC0149b0M568K);
                } else {
                    abstractC0149b0M568K.m642d();
                }
                this.f1035a.m17002b(view, i, view.getLayoutParams(), false);
            } else {
                if (view.getParent() == this.f1036b) {
                    int iM17010j = this.f1035a.m17010j(view);
                    if (i == -1) {
                        i = this.f1035a.m17005e();
                    }
                    if (iM17010j == -1) {
                        StringBuilder sbM1556G = outline.m1556G("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        sbM1556G.append(this.f1036b.indexOfChild(view));
                        throw new IllegalStateException(outline.m1588j(this.f1036b, sbM1556G));
                    }
                    if (iM17010j != i) {
                        AbstractC0160m abstractC0160m = this.f1036b.f987x;
                        View viewM762x = abstractC0160m.m762x(iM17010j);
                        if (viewM762x == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM17010j + abstractC0160m.f1036b.toString());
                        }
                        abstractC0160m.m762x(iM17010j);
                        abstractC0160m.m759r(iM17010j);
                        C0161n c0161n2 = (C0161n) viewM762x.getLayoutParams();
                        AbstractC0149b0 abstractC0149b0M568K2 = RecyclerView.m568K(viewM762x);
                        if (abstractC0149b0M568K2.m651m()) {
                            abstractC0160m.f1036b.f973q.m17030a(abstractC0149b0M568K2);
                        } else {
                            abstractC0160m.f1036b.f973q.m17035f(abstractC0149b0M568K2);
                        }
                        abstractC0160m.f1035a.m17002b(viewM762x, i, c0161n2, abstractC0149b0M568K2.m651m());
                    }
                } else {
                    this.f1035a.m17001a(view, i, false);
                    c0161n.f1060c = true;
                    AbstractC0171x abstractC0171x = this.f1041g;
                    if (abstractC0171x != null && abstractC0171x.f1083e) {
                        Objects.requireNonNull(abstractC0171x.f1080b);
                        AbstractC0149b0 abstractC0149b0M568K3 = RecyclerView.m568K(view);
                        if ((abstractC0149b0M568K3 != null ? abstractC0149b0M568K3.m644f() : -1) == abstractC0171x.f1079a) {
                            abstractC0171x.f1084f = view;
                        }
                    }
                }
            }
            if (c0161n.f1061d) {
                abstractC0149b0M568K.f1003b.invalidate();
                c0161n.f1061d = false;
            }
        }

        /* JADX INFO: renamed from: c0 */
        public void mo749c0(int i) {
            RecyclerView recyclerView = this.f1036b;
            if (recyclerView != null) {
                int iM17005e = recyclerView.f971p.m17005e();
                for (int i2 = 0; i2 < iM17005e; i2++) {
                    recyclerView.f971p.m17004d(i2).offsetTopAndBottom(i);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void mo529d(String str) {
            RecyclerView recyclerView = this.f1036b;
            if (recyclerView != null) {
                recyclerView.m609i(str);
            }
        }

        /* JADX INFO: renamed from: d0 */
        public void mo750d0(AbstractC0152e abstractC0152e, AbstractC0152e abstractC0152e2) {
        }

        /* JADX INFO: renamed from: e */
        public boolean mo531e() {
            return false;
        }

        /* JADX INFO: renamed from: e0 */
        public boolean m751e0() {
            return false;
        }

        /* JADX INFO: renamed from: f */
        public boolean mo533f() {
            return false;
        }

        /* JADX INFO: renamed from: f0 */
        public void m752f0() {
        }

        /* JADX INFO: renamed from: g */
        public boolean mo490g(C0161n c0161n) {
            return c0161n != null;
        }

        @Deprecated
        /* JADX INFO: renamed from: g0 */
        public void m753g0() {
        }

        /* JADX INFO: renamed from: h0 */
        public void mo536h0(RecyclerView recyclerView, C0167t c0167t) {
            m753g0();
        }

        /* JADX INFO: renamed from: i */
        public void mo538i(int i, int i2, C0172y c0172y, c cVar) {
        }

        /* JADX INFO: renamed from: i0 */
        public View mo491i0(View view, int i, C0167t c0167t, C0172y c0172y) {
            return null;
        }

        /* JADX INFO: renamed from: j */
        public void mo540j(int i, c cVar) {
        }

        /* JADX INFO: renamed from: j0 */
        public void mo541j0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1036b;
            C0167t c0167t = recyclerView.f965m;
            C0172y c0172y = recyclerView.f980t0;
            m754k0(accessibilityEvent);
        }

        /* JADX INFO: renamed from: k */
        public int mo543k(C0172y c0172y) {
            return 0;
        }

        /* JADX INFO: renamed from: k0 */
        public void m754k0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1036b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f1036b.canScrollVertically(-1) && !this.f1036b.canScrollHorizontally(-1) && !this.f1036b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC0152e abstractC0152e = this.f1036b.f985w;
            if (abstractC0152e != null) {
                accessibilityEvent.setItemCount(abstractC0152e.mo662d());
            }
        }

        /* JADX INFO: renamed from: l */
        public int mo492l(C0172y c0172y) {
            return 0;
        }

        /* JADX INFO: renamed from: l0 */
        public void mo755l0(C0167t c0167t, C0172y c0172y, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.f1036b.canScrollVertically(-1) || this.f1036b.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.f38018b.addAction(8192);
                accessibilityNodeInfoCompat.f38018b.setScrollable(true);
            }
            if (this.f1036b.canScrollVertically(1) || this.f1036b.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.f38018b.addAction(4096);
                accessibilityNodeInfoCompat.f38018b.setScrollable(true);
            }
            accessibilityNodeInfoCompat.m16272p(AccessibilityNodeInfoCompat.b.m16277a(mo487T(c0167t, c0172y), mo472A(c0167t, c0172y), m742X(), m738U()));
        }

        /* JADX INFO: renamed from: m */
        public int mo493m(C0172y c0172y) {
            return 0;
        }

        /* JADX INFO: renamed from: m0 */
        public void m756m0(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(view);
            if (abstractC0149b0M568K == null || abstractC0149b0M568K.m651m() || this.f1035a.m17011k(abstractC0149b0M568K.f1003b)) {
                return;
            }
            RecyclerView recyclerView = this.f1036b;
            mo494n0(recyclerView.f965m, recyclerView.f980t0, view, accessibilityNodeInfoCompat);
        }

        /* JADX INFO: renamed from: n */
        public int mo547n(C0172y c0172y) {
            return 0;
        }

        /* JADX INFO: renamed from: n0 */
        public void mo494n0(C0167t c0167t, C0172y c0172y, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        /* JADX INFO: renamed from: o */
        public int mo495o(C0172y c0172y) {
            return 0;
        }

        /* JADX INFO: renamed from: o0 */
        public View m757o0() {
            return null;
        }

        /* JADX INFO: renamed from: p */
        public int mo496p(C0172y c0172y) {
            return 0;
        }

        /* JADX INFO: renamed from: p0 */
        public void mo497p0(RecyclerView recyclerView, int i, int i2) {
        }

        /* JADX INFO: renamed from: q */
        public void m758q(C0167t c0167t) {
            int iM764y = m764y();
            while (true) {
                iM764y--;
                if (iM764y < 0) {
                    return;
                }
                View viewM762x = m762x(iM764y);
                AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(viewM762x);
                if (!abstractC0149b0M568K.m659u()) {
                    if (!abstractC0149b0M568K.m649k() || abstractC0149b0M568K.m651m() || this.f1036b.f985w.f1024b) {
                        m762x(iM764y);
                        m759r(iM764y);
                        c0167t.m793i(viewM762x);
                        this.f1036b.f973q.m17035f(abstractC0149b0M568K);
                    } else {
                        m723J0(iM764y);
                        c0167t.m792h(abstractC0149b0M568K);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: q0 */
        public void mo498q0(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: r */
        public final void m759r(int i) {
            this.f1035a.m17003c(i);
        }

        /* JADX INFO: renamed from: r0 */
        public void mo500r0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* JADX INFO: renamed from: s */
        public View m760s(View view) {
            View viewM576C;
            RecyclerView recyclerView = this.f1036b;
            if (recyclerView == null || (viewM576C = recyclerView.m576C(view)) == null || this.f1035a.f39179c.contains(viewM576C)) {
                return null;
            }
            return viewM576C;
        }

        /* JADX INFO: renamed from: s0 */
        public void mo501s0(RecyclerView recyclerView, int i, int i2) {
        }

        /* JADX INFO: renamed from: t */
        public View mo553t(int i) {
            int iM764y = m764y();
            for (int i2 = 0; i2 < iM764y; i2++) {
                View viewM762x = m762x(i2);
                AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(viewM762x);
                if (abstractC0149b0M568K != null && abstractC0149b0M568K.m644f() == i && !abstractC0149b0M568K.m659u() && (this.f1036b.f980t0.f1100g || !abstractC0149b0M568K.m651m())) {
                    return viewM762x;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: t0 */
        public void m761t0() {
        }

        /* JADX INFO: renamed from: u */
        public abstract C0161n mo502u();

        /* JADX INFO: renamed from: u0 */
        public void mo503u0(RecyclerView recyclerView, int i, int i2, Object obj) {
            m761t0();
        }

        /* JADX INFO: renamed from: v */
        public C0161n mo504v(Context context, AttributeSet attributeSet) {
            return new C0161n(context, attributeSet);
        }

        /* JADX INFO: renamed from: v0 */
        public void mo505v0(C0167t c0167t, C0172y c0172y) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* JADX INFO: renamed from: w */
        public C0161n mo506w(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C0161n) {
                return new C0161n((C0161n) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0161n((ViewGroup.MarginLayoutParams) layoutParams) : new C0161n(layoutParams);
        }

        /* JADX INFO: renamed from: w0 */
        public void mo507w0(C0172y c0172y) {
        }

        /* JADX INFO: renamed from: x */
        public View m762x(int i) {
            ChildHelper childHelper = this.f1035a;
            if (childHelper == null) {
                return null;
            }
            return ((RecyclerView2) childHelper.f39177a).m16973a(childHelper.m17006f(i));
        }

        /* JADX INFO: renamed from: x0 */
        public void m763x0(int i, int i2) {
            this.f1036b.m620o(i, i2);
        }

        /* JADX INFO: renamed from: y */
        public int m764y() {
            ChildHelper childHelper = this.f1035a;
            if (childHelper != null) {
                return childHelper.m17005e();
            }
            return 0;
        }

        @Deprecated
        /* JADX INFO: renamed from: y0 */
        public boolean m765y0(RecyclerView recyclerView) {
            AbstractC0171x abstractC0171x = this.f1041g;
            return (abstractC0171x != null && abstractC0171x.f1083e) || recyclerView.m586O();
        }

        /* JADX INFO: renamed from: z0 */
        public boolean m766z0(RecyclerView recyclerView, View view, View view2) {
            return m765y0(recyclerView);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public interface InterfaceC0162o {
        /* JADX INFO: renamed from: a */
        void mo775a(View view);

        /* JADX INFO: renamed from: b */
        void mo776b(View view);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class AbstractC0163p {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo777a(int i, int i2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface InterfaceC0164q {
        /* JADX INFO: renamed from: a */
        void mo778a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* JADX INFO: renamed from: b */
        boolean mo779b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* JADX INFO: renamed from: c */
        void mo780c(boolean z);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class AbstractC0165r {
        /* JADX INFO: renamed from: a */
        public void mo781a(RecyclerView recyclerView, int i) {
        }

        /* JADX INFO: renamed from: b */
        public void mo782b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public static class C0166s {

        /* JADX INFO: renamed from: a */
        public SparseArray<a> f1062a = new SparseArray<>();

        /* JADX INFO: renamed from: b */
        public int f1063b = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$s$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public final ArrayList<AbstractC0149b0> f1064a = new ArrayList<>();

            /* JADX INFO: renamed from: b */
            public int f1065b = 5;

            /* JADX INFO: renamed from: c */
            public long f1066c = 0;

            /* JADX INFO: renamed from: d */
            public long f1067d = 0;
        }

        /* JADX INFO: renamed from: a */
        public final a m783a(int i) {
            a aVar = this.f1062a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f1062a.put(i, aVar2);
            return aVar2;
        }

        /* JADX INFO: renamed from: b */
        public long m784b(long j2, long j3) {
            if (j2 == 0) {
                return j3;
            }
            return (j3 / 4) + ((j2 / 4) * 3);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public final class C0167t {

        /* JADX INFO: renamed from: a */
        public final ArrayList<AbstractC0149b0> f1068a;

        /* JADX INFO: renamed from: b */
        public ArrayList<AbstractC0149b0> f1069b;

        /* JADX INFO: renamed from: c */
        public final ArrayList<AbstractC0149b0> f1070c;

        /* JADX INFO: renamed from: d */
        public final List<AbstractC0149b0> f1071d;

        /* JADX INFO: renamed from: e */
        public int f1072e;

        /* JADX INFO: renamed from: f */
        public int f1073f;

        /* JADX INFO: renamed from: g */
        public C0166s f1074g;

        /* JADX INFO: renamed from: h */
        public AbstractC0173z f1075h;

        public C0167t() {
            ArrayList<AbstractC0149b0> arrayList = new ArrayList<>();
            this.f1068a = arrayList;
            this.f1069b = null;
            this.f1070c = new ArrayList<>();
            this.f1071d = Collections.unmodifiableList(arrayList);
            this.f1072e = 2;
            this.f1073f = 2;
        }

        /* JADX INFO: renamed from: a */
        public void m785a(AbstractC0149b0 abstractC0149b0, boolean z) {
            RecyclerView.m573k(abstractC0149b0);
            View view = abstractC0149b0.f1003b;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = RecyclerView.this.f917A0;
            if (recyclerViewAccessibilityDelegate != null) {
                RecyclerViewAccessibilityDelegate.a aVar = recyclerViewAccessibilityDelegate.f39145e;
                ViewCompat.m16327u(view, aVar instanceof RecyclerViewAccessibilityDelegate.a ? aVar.f39147e.remove(view) : null);
            }
            if (z) {
                InterfaceC0168u interfaceC0168u = RecyclerView.this.f989y;
                if (interfaceC0168u != null) {
                    interfaceC0168u.m797a(abstractC0149b0);
                }
                int size = RecyclerView.this.f991z.size();
                for (int i = 0; i < size; i++) {
                    RecyclerView.this.f991z.get(i).m797a(abstractC0149b0);
                }
                AbstractC0152e abstractC0152e = RecyclerView.this.f985w;
                if (abstractC0152e != null) {
                    abstractC0152e.mo671m(abstractC0149b0);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f980t0 != null) {
                    recyclerView.f973q.m17036g(abstractC0149b0);
                }
            }
            abstractC0149b0.f1021t = null;
            abstractC0149b0.f1020s = null;
            C0166s c0166sM788d = m788d();
            Objects.requireNonNull(c0166sM788d);
            int i2 = abstractC0149b0.f1008g;
            ArrayList<AbstractC0149b0> arrayList = c0166sM788d.m783a(i2).f1064a;
            if (c0166sM788d.f1062a.get(i2).f1065b <= arrayList.size()) {
                return;
            }
            abstractC0149b0.m656r();
            arrayList.add(abstractC0149b0);
        }

        /* JADX INFO: renamed from: b */
        public void m786b() {
            this.f1068a.clear();
            m789e();
        }

        /* JADX INFO: renamed from: c */
        public int m787c(int i) {
            if (i >= 0 && i < RecyclerView.this.f980t0.m809b()) {
                RecyclerView recyclerView = RecyclerView.this;
                return !recyclerView.f980t0.f1100g ? i : recyclerView.f969o.m16965f(i, 0);
            }
            StringBuilder sbM1557H = outline.m1557H("invalid position ", i, ". State item count is ");
            sbM1557H.append(RecyclerView.this.f980t0.m809b());
            throw new IndexOutOfBoundsException(outline.m1588j(RecyclerView.this, sbM1557H));
        }

        /* JADX INFO: renamed from: d */
        public C0166s m788d() {
            if (this.f1074g == null) {
                this.f1074g = new C0166s();
            }
            return this.f1074g;
        }

        /* JADX INFO: renamed from: e */
        public void m789e() {
            for (int size = this.f1070c.size() - 1; size >= 0; size--) {
                m790f(size);
            }
            this.f1070c.clear();
            if (RecyclerView.f913i) {
                GapWorker.b bVar = RecyclerView.this.f978s0;
                int[] iArr = bVar.f39313c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f39314d = 0;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m790f(int i) {
            m785a(this.f1070c.get(i), true);
            this.f1070c.remove(i);
        }

        /* JADX INFO: renamed from: g */
        public void m791g(View view) {
            AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(view);
            if (abstractC0149b0M568K.m653o()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (abstractC0149b0M568K.m652n()) {
                abstractC0149b0M568K.f1016o.m795k(abstractC0149b0M568K);
            } else if (abstractC0149b0M568K.m660v()) {
                abstractC0149b0M568K.m642d();
            }
            m792h(abstractC0149b0M568K);
            if (RecyclerView.this.f953b0 == null || abstractC0149b0M568K.m650l()) {
                return;
            }
            RecyclerView.this.f953b0.mo695j(abstractC0149b0M568K);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0030  */
        /* JADX INFO: renamed from: h */
        public void m792h(AbstractC0149b0 abstractC0149b0) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = true;
            if (abstractC0149b0.m652n() || abstractC0149b0.f1003b.getParent() != null) {
                StringBuilder sbM1556G = outline.m1556G("Scrapped or attached views may not be recycled. isScrap:");
                sbM1556G.append(abstractC0149b0.m652n());
                sbM1556G.append(" isAttached:");
                sbM1556G.append(abstractC0149b0.f1003b.getParent() != null);
                throw new IllegalArgumentException(outline.m1588j(RecyclerView.this, sbM1556G));
            }
            if (abstractC0149b0.m653o()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb.append(abstractC0149b0);
                throw new IllegalArgumentException(outline.m1588j(RecyclerView.this, sb));
            }
            if (abstractC0149b0.m659u()) {
                throw new IllegalArgumentException(outline.m1588j(RecyclerView.this, outline.m1556G("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            if ((abstractC0149b0.f1012k & 16) == 0) {
                View view = abstractC0149b0.f1003b;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                if (view.hasTransientState()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            AbstractC0152e abstractC0152e = RecyclerView.this.f985w;
            if ((abstractC0152e != null && z && abstractC0152e.mo669k(abstractC0149b0)) || abstractC0149b0.m650l()) {
                if (this.f1073f <= 0 || abstractC0149b0.m646h(526)) {
                    z2 = false;
                } else {
                    int size = this.f1070c.size();
                    if (size >= this.f1073f && size > 0) {
                        m790f(0);
                        size--;
                    }
                    if (RecyclerView.f913i && size > 0 && !RecyclerView.this.f978s0.m17054c(abstractC0149b0.f1005d)) {
                        do {
                            size--;
                            if (size < 0) {
                                break;
                            }
                        } while (RecyclerView.this.f978s0.m17054c(this.f1070c.get(size).f1005d));
                        size++;
                    }
                    this.f1070c.add(size, abstractC0149b0);
                    z2 = true;
                }
                if (z2) {
                    z3 = z2;
                } else {
                    m785a(abstractC0149b0, true);
                }
                RecyclerView.this.f973q.m17036g(abstractC0149b0);
                if (z2 && !z4 && z) {
                    abstractC0149b0.f1021t = null;
                    abstractC0149b0.f1020s = null;
                    return;
                }
                return;
            }
            z3 = false;
            z2 = z3;
            z4 = false;
            RecyclerView.this.f973q.m17036g(abstractC0149b0);
            if (z2) {
            }
        }

        /* JADX INFO: renamed from: i */
        public void m793i(View view) {
            AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(view);
            if (!abstractC0149b0M568K.m646h(12) && abstractC0149b0M568K.m654p()) {
                AbstractC0157j abstractC0157j = RecyclerView.this.f953b0;
                if (!(abstractC0157j == null || abstractC0157j.mo692g(abstractC0149b0M568K, abstractC0149b0M568K.m645g()))) {
                    if (this.f1069b == null) {
                        this.f1069b = new ArrayList<>();
                    }
                    abstractC0149b0M568K.f1016o = this;
                    abstractC0149b0M568K.f1017p = true;
                    this.f1069b.add(abstractC0149b0M568K);
                    return;
                }
            }
            if (abstractC0149b0M568K.m649k() && !abstractC0149b0M568K.m651m() && !RecyclerView.this.f985w.f1024b) {
                throw new IllegalArgumentException(outline.m1588j(RecyclerView.this, outline.m1556G("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            abstractC0149b0M568K.f1016o = this;
            abstractC0149b0M568K.f1017p = false;
            this.f1068a.add(abstractC0149b0M568K);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:108:0x01e9  */
        /* JADX WARN: Code duplicated, block: B:113:0x01fe  */
        /* JADX WARN: Code duplicated, block: B:116:0x0203 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:117:0x0205  */
        /* JADX WARN: Code duplicated, block: B:119:0x020f  */
        /* JADX WARN: Code duplicated, block: B:120:0x021c  */
        /* JADX WARN: Code duplicated, block: B:122:0x0222  */
        /* JADX WARN: Code duplicated, block: B:125:0x022a  */
        /* JADX WARN: Code duplicated, block: B:130:0x0248  */
        /* JADX WARN: Code duplicated, block: B:234:0x0441  */
        /* JADX WARN: Code duplicated, block: B:240:0x0465  */
        /* JADX WARN: Code duplicated, block: B:242:0x046b  */
        /* JADX WARN: Code duplicated, block: B:244:0x0470  */
        /* JADX WARN: Code duplicated, block: B:245:0x0472  */
        /* JADX WARN: Code duplicated, block: B:247:0x0475  */
        /* JADX WARN: Code duplicated, block: B:249:0x047b  */
        /* JADX WARN: Code duplicated, block: B:251:0x0498  */
        /* JADX WARN: Code duplicated, block: B:253:0x04a6  */
        /* JADX WARN: Code duplicated, block: B:257:0x04ae  */
        /* JADX WARN: Code duplicated, block: B:259:0x04b1  */
        /* JADX WARN: Code duplicated, block: B:262:0x04bf  */
        /* JADX WARN: Code duplicated, block: B:263:0x04c1  */
        /* JADX WARN: Code duplicated, block: B:265:0x04c4  */
        /* JADX WARN: Code duplicated, block: B:267:0x04ca  */
        /* JADX WARN: Code duplicated, block: B:271:0x04e7  */
        /* JADX WARN: Code duplicated, block: B:273:0x04eb  */
        /* JADX WARN: Code duplicated, block: B:276:0x04fe  */
        /* JADX WARN: Code duplicated, block: B:280:0x0525  */
        /* JADX WARN: Code duplicated, block: B:283:0x052d  */
        /* JADX WARN: Code duplicated, block: B:285:0x0530  */
        /* JADX WARN: Code duplicated, block: B:287:0x053b  */
        /* JADX WARN: Code duplicated, block: B:291:0x0545  */
        /* JADX WARN: Code duplicated, block: B:293:0x054b  */
        /* JADX WARN: Code duplicated, block: B:295:0x0554 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:300:0x0566  */
        /* JADX WARN: Code duplicated, block: B:304:0x0571  */
        /* JADX WARN: Code duplicated, block: B:305:0x057f  */
        /* JADX WARN: Code duplicated, block: B:307:0x0587  */
        /* JADX WARN: Code duplicated, block: B:308:0x0595  */
        /* JADX WARN: Code duplicated, block: B:311:0x059b A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:324:0x00c9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:330:0x0101 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:334:0x01b9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:336:0x01b6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x0086 A[EDGE_INSN: B:35:0x0086->B:36:0x0087 BREAK  A[LOOP:0: B:14:0x0028->B:20:0x0042]] */
        /* JADX WARN: Code duplicated, block: B:42:0x0090  */
        /* JADX WARN: Code duplicated, block: B:44:0x0099  */
        /* JADX WARN: Code duplicated, block: B:57:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:59:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:69:0x0104  */
        /* JADX WARN: Code duplicated, block: B:71:0x0118  */
        /* JADX WARN: Code duplicated, block: B:73:0x0120  */
        /* JADX WARN: Code duplicated, block: B:75:0x0132 A[EDGE_INSN: B:75:0x0132->B:95:0x01ba BREAK  A[LOOP:1: B:43:0x0097->B:55:0x00c6]] */
        /* JADX WARN: Code duplicated, block: B:76:0x0143  */
        /* JADX WARN: Code duplicated, block: B:78:0x015c  */
        /* JADX WARN: Code duplicated, block: B:80:0x0173  */
        /* JADX WARN: Code duplicated, block: B:82:0x018a  */
        /* JADX WARN: Code duplicated, block: B:84:0x0193  */
        /* JADX WARN: Code duplicated, block: B:86:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:96:0x01bc  */
        /* JADX WARN: Code duplicated, block: B:98:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:99:0x01c9  */
        /* JADX WARN: Instruction removed from duplicated block: B:78:0x015c, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:80:0x0173, please report this as an issue */
        /* JADX INFO: renamed from: j */
        public AbstractC0149b0 m794j(int i, boolean z, long j2) {
            AbstractC0149b0 abstractC0149b0M582J;
            boolean z2;
            int iM16965f;
            int i2;
            AbstractC0152e<? extends AbstractC0149b0> abstractC0152e;
            boolean z3;
            AccessibilityManager accessibilityManager;
            boolean z4;
            View view;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate;
            RecyclerViewAccessibilityDelegate.a aVar;
            AccessibilityDelegateCompat accessibilityDelegateCompatM16313g;
            List<Object> list;
            ViewGroup.LayoutParams layoutParams;
            long j3;
            boolean z5;
            boolean z6;
            boolean z7;
            ViewGroup.LayoutParams layoutParams2;
            C0161n c0161n;
            int iM16965f2;
            RecyclerView recyclerViewM567F;
            AbstractC0149b0 abstractC0149b0Remove;
            AbstractC0173z abstractC0173z;
            View viewM810a;
            int size;
            int i3;
            int size2;
            int i4;
            AbstractC0149b0 abstractC0149b0;
            ChildHelper childHelper;
            int size3;
            int i5;
            View view2;
            ChildHelper childHelper2;
            int iIndexOfChild;
            int iM17010j;
            AbstractC0149b0 abstractC0149b0M568K;
            int i6;
            AbstractC0152e abstractC0152e2;
            boolean z8;
            int size4;
            int iM16965f3;
            if (i < 0 || i >= RecyclerView.this.f980t0.m809b()) {
                StringBuilder sbM1559J = outline.m1559J("Invalid item position ", i, "(", i, "). Item count:");
                sbM1559J.append(RecyclerView.this.f980t0.m809b());
                throw new IndexOutOfBoundsException(outline.m1588j(RecyclerView.this, sbM1559J));
            }
            boolean z9 = false;
            if (RecyclerView.this.f980t0.f1100g) {
                ArrayList<AbstractC0149b0> arrayList = this.f1069b;
                if (arrayList != null && (size4 = arrayList.size()) != 0) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size4) {
                            RecyclerView recyclerView = RecyclerView.this;
                            if (recyclerView.f985w.f1024b && (iM16965f3 = recyclerView.f969o.m16965f(i, 0)) > 0 && iM16965f3 < RecyclerView.this.f985w.mo662d()) {
                                long jMo663e = RecyclerView.this.f985w.mo663e(iM16965f3);
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= size4) {
                                        abstractC0149b0M582J = null;
                                        break;
                                    }
                                    AbstractC0149b0 abstractC0149b1 = this.f1069b.get(i8);
                                    if (!abstractC0149b1.m660v() && abstractC0149b1.f1007f == jMo663e) {
                                        abstractC0149b1.m640b(32);
                                        abstractC0149b0M582J = abstractC0149b1;
                                        break;
                                    }
                                    i8++;
                                }
                            } else {
                                abstractC0149b0M582J = null;
                                break;
                            }
                        } else {
                            abstractC0149b0M582J = this.f1069b.get(i7);
                            if (!abstractC0149b0M582J.m660v() && abstractC0149b0M582J.m644f() == i) {
                                abstractC0149b0M582J.m640b(32);
                                break;
                            }
                            i7++;
                        }
                    }
                } else {
                    abstractC0149b0M582J = null;
                    break;
                }
                z2 = abstractC0149b0M582J != null;
                if (abstractC0149b0M582J == null) {
                    size = this.f1068a.size();
                    i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            if (z) {
                                childHelper = RecyclerView.this.f971p;
                                size3 = childHelper.f39179c.size();
                                i5 = 0;
                                while (true) {
                                    if (i5 < size3) {
                                        view2 = null;
                                        break;
                                    }
                                    view2 = childHelper.f39179c.get(i5);
                                    Objects.requireNonNull((RecyclerView2) childHelper.f39177a);
                                    abstractC0149b0M568K = RecyclerView.m568K(view2);
                                    if (abstractC0149b0M568K.m644f() != i && !abstractC0149b0M568K.m649k() && !abstractC0149b0M568K.m651m()) {
                                        break;
                                    }
                                    i5++;
                                }
                                if (view2 != null) {
                                    size2 = this.f1070c.size();
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < size2) {
                                            abstractC0149b0M582J = null;
                                            break;
                                        }
                                        abstractC0149b0 = this.f1070c.get(i4);
                                        if (!abstractC0149b0.m649k() || abstractC0149b0.m644f() != i || abstractC0149b0.m647i()) {
                                            i4++;
                                        } else if (!z) {
                                            this.f1070c.remove(i4);
                                        }
                                    }
                                } else {
                                    abstractC0149b0M582J = RecyclerView.m568K(view2);
                                    childHelper2 = RecyclerView.this.f971p;
                                    iIndexOfChild = ((RecyclerView2) childHelper2.f39177a).f39135a.indexOfChild(view2);
                                    if (iIndexOfChild >= 0) {
                                        throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                                    }
                                    if (childHelper2.f39178b.m17016d(iIndexOfChild)) {
                                        throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                                    }
                                    childHelper2.f39178b.m17013a(iIndexOfChild);
                                    childHelper2.m17012l(view2);
                                    iM17010j = RecyclerView.this.f971p.m17010j(view2);
                                    if (iM17010j != -1) {
                                        RecyclerView.this.f971p.m17003c(iM17010j);
                                        m793i(view2);
                                        abstractC0149b0M582J.m640b(8224);
                                        break;
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("layout index should not be -1 after unhiding a view:");
                                    sb.append(abstractC0149b0M582J);
                                    throw new IllegalStateException(outline.m1588j(RecyclerView.this, sb));
                                }
                            } else {
                                size2 = this.f1070c.size();
                                i4 = 0;
                                while (true) {
                                    if (i4 < size2) {
                                        abstractC0149b0M582J = null;
                                        break;
                                    }
                                    abstractC0149b0 = this.f1070c.get(i4);
                                    if (!abstractC0149b0.m649k()) {
                                    }
                                    i4++;
                                }
                            }
                        } else {
                            abstractC0149b0 = this.f1068a.get(i3);
                            if (!abstractC0149b0.m660v() || abstractC0149b0.m644f() != i || abstractC0149b0.m649k() || (!RecyclerView.this.f980t0.f1100g && abstractC0149b0.m651m())) {
                                i3++;
                            } else {
                                abstractC0149b0.m640b(32);
                            }
                        }
                        abstractC0149b0M582J = abstractC0149b0;
                        break;
                    }
                    if (abstractC0149b0M582J != null) {
                        if (abstractC0149b0M582J.m651m()) {
                            z8 = RecyclerView.this.f980t0.f1100g;
                        } else {
                            i6 = abstractC0149b0M582J.f1005d;
                            if (i6 >= 0 || i6 >= RecyclerView.this.f985w.mo662d()) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Inconsistency detected. Invalid view holder adapter position");
                                sb2.append(abstractC0149b0M582J);
                                throw new IndexOutOfBoundsException(outline.m1588j(RecyclerView.this, sb2));
                            }
                            RecyclerView recyclerView2 = RecyclerView.this;
                            if (recyclerView2.f980t0.f1100g) {
                                abstractC0152e2 = RecyclerView.this.f985w;
                                if (abstractC0152e2.f1024b) {
                                }
                                z8 = true;
                            } else {
                                Objects.requireNonNull(recyclerView2.f985w);
                                if (abstractC0149b0M582J.f1008g != 0) {
                                    z8 = false;
                                } else {
                                    abstractC0152e2 = RecyclerView.this.f985w;
                                    if (abstractC0152e2.f1024b || abstractC0149b0M582J.f1007f == abstractC0152e2.mo663e(abstractC0149b0M582J.f1005d)) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                }
                            }
                        }
                        if (z8) {
                            z2 = true;
                        } else {
                            if (!z) {
                                abstractC0149b0M582J.m640b(4);
                                if (abstractC0149b0M582J.m652n()) {
                                    RecyclerView.this.removeDetachedView(abstractC0149b0M582J.f1003b, false);
                                    abstractC0149b0M582J.f1016o.m795k(abstractC0149b0M582J);
                                } else if (abstractC0149b0M582J.m660v()) {
                                    abstractC0149b0M582J.m642d();
                                }
                                m792h(abstractC0149b0M582J);
                            }
                            abstractC0149b0M582J = null;
                        }
                    }
                }
                if (abstractC0149b0M582J == null) {
                    iM16965f2 = RecyclerView.this.f969o.m16965f(i, 0);
                    if (iM16965f2 >= 0 || iM16965f2 >= RecyclerView.this.f985w.mo662d()) {
                        StringBuilder sbM1559J2 = outline.m1559J("Inconsistency detected. Invalid item position ", i, "(offset:", iM16965f2, ").state:");
                        sbM1559J2.append(RecyclerView.this.f980t0.m809b());
                        throw new IndexOutOfBoundsException(outline.m1588j(RecyclerView.this, sbM1559J2));
                    }
                    Objects.requireNonNull(RecyclerView.this.f985w);
                    AbstractC0152e abstractC0152e3 = RecyclerView.this.f985w;
                    if (abstractC0152e3.f1024b) {
                        long jMo663e2 = abstractC0152e3.mo663e(iM16965f2);
                        int size5 = this.f1068a.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                int size6 = this.f1070c.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        abstractC0149b0M582J = this.f1070c.get(size6);
                                        if (abstractC0149b0M582J.f1007f == jMo663e2 && !abstractC0149b0M582J.m647i()) {
                                            if (abstractC0149b0M582J.f1008g == 0) {
                                                if (!z) {
                                                    this.f1070c.remove(size6);
                                                    break;
                                                }
                                                break;
                                            }
                                            if (!z) {
                                                m790f(size6);
                                            }
                                        }
                                        size6--;
                                    }
                                    abstractC0149b0M582J = null;
                                    break;
                                }
                            }
                            AbstractC0149b0 abstractC0149b2 = this.f1068a.get(size5);
                            if (abstractC0149b2.f1007f == jMo663e2 && !abstractC0149b2.m660v()) {
                                if (abstractC0149b2.f1008g == 0) {
                                    abstractC0149b2.m640b(32);
                                    if (abstractC0149b2.m651m() && !RecyclerView.this.f980t0.f1100g) {
                                        abstractC0149b2.m657s(2, 14);
                                    }
                                    abstractC0149b0M582J = abstractC0149b2;
                                    break;
                                }
                                if (!z) {
                                    this.f1068a.remove(size5);
                                    RecyclerView.this.removeDetachedView(abstractC0149b2.f1003b, false);
                                    AbstractC0149b0 abstractC0149b0M568K2 = RecyclerView.m568K(abstractC0149b2.f1003b);
                                    abstractC0149b0M568K2.f1016o = null;
                                    abstractC0149b0M568K2.f1017p = false;
                                    abstractC0149b0M568K2.m642d();
                                    m792h(abstractC0149b0M568K2);
                                }
                            }
                            size5--;
                        }
                        if (abstractC0149b0M582J != null) {
                            abstractC0149b0M582J.f1005d = iM16965f2;
                            z2 = true;
                        }
                    }
                    if (abstractC0149b0M582J == null && (abstractC0173z = this.f1075h) != null && (viewM810a = abstractC0173z.m810a(this, i, 0)) != null) {
                        abstractC0149b0M582J = RecyclerView.this.m582J(viewM810a);
                        if (abstractC0149b0M582J == null) {
                            throw new IllegalArgumentException(outline.m1588j(RecyclerView.this, outline.m1556G("getViewForPositionAndType returned a view which does not have a ViewHolder")));
                        }
                        if (abstractC0149b0M582J.m659u()) {
                            throw new IllegalArgumentException(outline.m1588j(RecyclerView.this, outline.m1556G("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.")));
                        }
                    }
                    if (abstractC0149b0M582J == null) {
                        C0166s.a aVar2 = m788d().f1062a.get(0);
                        if (aVar2 != null && !aVar2.f1064a.isEmpty()) {
                            ArrayList<AbstractC0149b0> arrayList2 = aVar2.f1064a;
                            int size7 = arrayList2.size() - 1;
                            while (true) {
                                if (size7 < 0) {
                                    abstractC0149b0Remove = null;
                                    break;
                                }
                                if (!arrayList2.get(size7).m647i()) {
                                    abstractC0149b0Remove = arrayList2.remove(size7);
                                    break;
                                }
                                size7--;
                            }
                        } else {
                            abstractC0149b0Remove = null;
                            break;
                        }
                        if (abstractC0149b0Remove != null) {
                            abstractC0149b0Remove.m656r();
                            int[] iArr = RecyclerView.f910f;
                        }
                        abstractC0149b0M582J = abstractC0149b0Remove;
                    }
                    if (abstractC0149b0M582J == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j2 != Long.MAX_VALUE) {
                            long j4 = this.f1074g.m783a(0).f1066c;
                            if (!(j4 == 0 || j4 + nanoTime < j2)) {
                                return null;
                            }
                        }
                        RecyclerView recyclerView3 = RecyclerView.this;
                        AbstractC0152e abstractC0152e4 = recyclerView3.f985w;
                        Objects.requireNonNull(abstractC0152e4);
                        try {
                            int i9 = TraceCompat.f37894a;
                            Trace.beginSection("RV CreateView");
                            AbstractC0149b0 abstractC0149b0Mo667i = abstractC0152e4.mo667i(recyclerView3, 0);
                            if (abstractC0149b0Mo667i.f1003b.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            abstractC0149b0Mo667i.f1008g = 0;
                            Trace.endSection();
                            if (RecyclerView.f913i && (recyclerViewM567F = RecyclerView.m567F(abstractC0149b0Mo667i.f1003b)) != null) {
                                abstractC0149b0Mo667i.f1004c = new WeakReference<>(recyclerViewM567F);
                            }
                            long nanoTime2 = RecyclerView.this.getNanoTime();
                            C0166s c0166s = this.f1074g;
                            long j5 = nanoTime2 - nanoTime;
                            C0166s.a aVarM783a = c0166s.m783a(0);
                            aVarM783a.f1066c = c0166s.m784b(aVarM783a.f1066c, j5);
                            abstractC0149b0M582J = abstractC0149b0Mo667i;
                        } catch (Throwable th) {
                            int i10 = TraceCompat.f37894a;
                            Trace.endSection();
                            throw th;
                        }
                    }
                }
                if (z2 && !RecyclerView.this.f980t0.f1100g && abstractC0149b0M582J.m646h(8192)) {
                    abstractC0149b0M582J.m657s(0, 8192);
                    if (RecyclerView.this.f980t0.f1103j) {
                        AbstractC0157j.m686e(abstractC0149b0M582J);
                        AbstractC0157j abstractC0157j = RecyclerView.this.f953b0;
                        abstractC0149b0M582J.m645g();
                        RecyclerView.this.m600c0(abstractC0149b0M582J, abstractC0157j.m698m(abstractC0149b0M582J));
                    }
                }
                if (RecyclerView.this.f980t0.f1100g || !abstractC0149b0M582J.m648j()) {
                    if (abstractC0149b0M582J.m648j()) {
                        if ((abstractC0149b0M582J.f1012k & 2) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6 || abstractC0149b0M582J.m649k()) {
                            iM16965f = RecyclerView.this.f969o.m16965f(i, 0);
                            abstractC0149b0M582J.f1021t = null;
                            RecyclerView recyclerView4 = RecyclerView.this;
                            abstractC0149b0M582J.f1020s = recyclerView4;
                            i2 = abstractC0149b0M582J.f1008g;
                            long nanoTime3 = recyclerView4.getNanoTime();
                            if (j2 != Long.MAX_VALUE) {
                                j3 = this.f1074g.m783a(i2).f1067d;
                                if (j3 != 0) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                if (z5) {
                                }
                            }
                            abstractC0152e = RecyclerView.this.f985w;
                            Objects.requireNonNull(abstractC0152e);
                            if (abstractC0149b0M582J.f1021t == null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                abstractC0149b0M582J.f1005d = iM16965f;
                                if (abstractC0152e.f1024b) {
                                    abstractC0149b0M582J.f1007f = abstractC0152e.mo663e(iM16965f);
                                }
                                abstractC0149b0M582J.m657s(1, 519);
                                int i11 = TraceCompat.f37894a;
                                Trace.beginSection("RV OnBindView");
                            }
                            abstractC0149b0M582J.f1021t = abstractC0152e;
                            abstractC0149b0M582J.m645g();
                            abstractC0152e.mo666h(abstractC0149b0M582J, iM16965f);
                            if (z3) {
                                list = abstractC0149b0M582J.f1013l;
                                if (list != null) {
                                    list.clear();
                                }
                                abstractC0149b0M582J.f1012k &= -1025;
                                layoutParams = abstractC0149b0M582J.f1003b.getLayoutParams();
                                if (layoutParams instanceof C0161n) {
                                    ((C0161n) layoutParams).f1060c = true;
                                }
                                int i12 = TraceCompat.f37894a;
                                Trace.endSection();
                            }
                            long nanoTime4 = RecyclerView.this.getNanoTime();
                            C0166s c0166s2 = this.f1074g;
                            long j6 = nanoTime4 - nanoTime3;
                            C0166s.a aVarM783a2 = c0166s2.m783a(abstractC0149b0M582J.f1008g);
                            aVarM783a2.f1067d = c0166s2.m784b(aVarM783a2.f1067d, j6);
                            accessibilityManager = RecyclerView.this.f942N;
                            if (accessibilityManager == null) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                view = abstractC0149b0M582J.f1003b;
                                AtomicInteger atomicInteger = ViewCompat.f38073a;
                                if (view.getImportantForAccessibility() == 0) {
                                    view.setImportantForAccessibility(1);
                                }
                                recyclerViewAccessibilityDelegate = RecyclerView.this.f917A0;
                                if (recyclerViewAccessibilityDelegate != null) {
                                    aVar = recyclerViewAccessibilityDelegate.f39145e;
                                    if (aVar instanceof RecyclerViewAccessibilityDelegate.a) {
                                        Objects.requireNonNull(aVar);
                                        accessibilityDelegateCompatM16313g = ViewCompat.m16313g(view);
                                        if (accessibilityDelegateCompatM16313g != null) {
                                            aVar.f39147e.put(view, accessibilityDelegateCompatM16313g);
                                        }
                                    }
                                    ViewCompat.m16327u(view, aVar);
                                }
                            }
                            if (RecyclerView.this.f980t0.f1100g) {
                                abstractC0149b0M582J.f1009h = i;
                            }
                        }
                    } else {
                        iM16965f = RecyclerView.this.f969o.m16965f(i, 0);
                        abstractC0149b0M582J.f1021t = null;
                        RecyclerView recyclerView5 = RecyclerView.this;
                        abstractC0149b0M582J.f1020s = recyclerView5;
                        i2 = abstractC0149b0M582J.f1008g;
                        long nanoTime5 = recyclerView5.getNanoTime();
                        if (j2 != Long.MAX_VALUE) {
                            j3 = this.f1074g.m783a(i2).f1067d;
                            if (j3 != 0 || j3 + nanoTime5 < j2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                            }
                        }
                        abstractC0152e = RecyclerView.this.f985w;
                        Objects.requireNonNull(abstractC0152e);
                        if (abstractC0149b0M582J.f1021t == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            abstractC0149b0M582J.f1005d = iM16965f;
                            if (abstractC0152e.f1024b) {
                                abstractC0149b0M582J.f1007f = abstractC0152e.mo663e(iM16965f);
                            }
                            abstractC0149b0M582J.m657s(1, 519);
                            int i13 = TraceCompat.f37894a;
                            Trace.beginSection("RV OnBindView");
                        }
                        abstractC0149b0M582J.f1021t = abstractC0152e;
                        abstractC0149b0M582J.m645g();
                        abstractC0152e.mo666h(abstractC0149b0M582J, iM16965f);
                        if (z3) {
                            list = abstractC0149b0M582J.f1013l;
                            if (list != null) {
                                list.clear();
                            }
                            abstractC0149b0M582J.f1012k &= -1025;
                            layoutParams = abstractC0149b0M582J.f1003b.getLayoutParams();
                            if (layoutParams instanceof C0161n) {
                                ((C0161n) layoutParams).f1060c = true;
                            }
                            int i14 = TraceCompat.f37894a;
                            Trace.endSection();
                        }
                        long nanoTime6 = RecyclerView.this.getNanoTime();
                        C0166s c0166s3 = this.f1074g;
                        long j7 = nanoTime6 - nanoTime5;
                        C0166s.a aVarM783a3 = c0166s3.m783a(abstractC0149b0M582J.f1008g);
                        aVarM783a3.f1067d = c0166s3.m784b(aVarM783a3.f1067d, j7);
                        accessibilityManager = RecyclerView.this.f942N;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            view = abstractC0149b0M582J.f1003b;
                            AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            recyclerViewAccessibilityDelegate = RecyclerView.this.f917A0;
                            if (recyclerViewAccessibilityDelegate != null) {
                                aVar = recyclerViewAccessibilityDelegate.f39145e;
                                if (aVar instanceof RecyclerViewAccessibilityDelegate.a) {
                                    Objects.requireNonNull(aVar);
                                    accessibilityDelegateCompatM16313g = ViewCompat.m16313g(view);
                                    if (accessibilityDelegateCompatM16313g != null && accessibilityDelegateCompatM16313g != aVar) {
                                        aVar.f39147e.put(view, accessibilityDelegateCompatM16313g);
                                    }
                                }
                                ViewCompat.m16327u(view, aVar);
                            }
                        }
                        if (RecyclerView.this.f980t0.f1100g) {
                            abstractC0149b0M582J.f1009h = i;
                        }
                    }
                    layoutParams2 = abstractC0149b0M582J.f1003b.getLayoutParams();
                    if (layoutParams2 == null) {
                        c0161n = (C0161n) RecyclerView.this.generateDefaultLayoutParams();
                        abstractC0149b0M582J.f1003b.setLayoutParams(c0161n);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams2)) {
                        c0161n = (C0161n) layoutParams2;
                    } else {
                        c0161n = (C0161n) RecyclerView.this.generateLayoutParams(layoutParams2);
                        abstractC0149b0M582J.f1003b.setLayoutParams(c0161n);
                    }
                    c0161n.f1058a = abstractC0149b0M582J;
                    if (z2 && z7) {
                        z9 = true;
                    }
                    c0161n.f1061d = z9;
                    return abstractC0149b0M582J;
                }
                abstractC0149b0M582J.f1009h = i;
                layoutParams2 = abstractC0149b0M582J.f1003b.getLayoutParams();
                if (layoutParams2 == null) {
                    c0161n = (C0161n) RecyclerView.this.generateDefaultLayoutParams();
                    abstractC0149b0M582J.f1003b.setLayoutParams(c0161n);
                } else if (RecyclerView.this.checkLayoutParams(layoutParams2)) {
                    c0161n = (C0161n) RecyclerView.this.generateLayoutParams(layoutParams2);
                    abstractC0149b0M582J.f1003b.setLayoutParams(c0161n);
                } else {
                    c0161n = (C0161n) layoutParams2;
                }
                c0161n.f1058a = abstractC0149b0M582J;
                if (z2) {
                    z9 = true;
                }
                c0161n.f1061d = z9;
                return abstractC0149b0M582J;
            }
            abstractC0149b0M582J = null;
            if (abstractC0149b0M582J == null) {
                size = this.f1068a.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        abstractC0149b0 = this.f1068a.get(i3);
                        if (abstractC0149b0.m660v()) {
                        }
                        i3++;
                    } else {
                        if (z) {
                            size2 = this.f1070c.size();
                            i4 = 0;
                            while (true) {
                                if (i4 < size2) {
                                    abstractC0149b0M582J = null;
                                    break;
                                }
                                abstractC0149b0 = this.f1070c.get(i4);
                                if (!abstractC0149b0.m649k()) {
                                }
                                i4++;
                            }
                        } else {
                            childHelper = RecyclerView.this.f971p;
                            size3 = childHelper.f39179c.size();
                            i5 = 0;
                            while (true) {
                                if (i5 < size3) {
                                    view2 = null;
                                    break;
                                }
                                view2 = childHelper.f39179c.get(i5);
                                Objects.requireNonNull((RecyclerView2) childHelper.f39177a);
                                abstractC0149b0M568K = RecyclerView.m568K(view2);
                                if (abstractC0149b0M568K.m644f() != i) {
                                }
                                i5++;
                            }
                            if (view2 != null) {
                                size2 = this.f1070c.size();
                                i4 = 0;
                                while (true) {
                                    if (i4 < size2) {
                                        abstractC0149b0M582J = null;
                                        break;
                                    }
                                    abstractC0149b0 = this.f1070c.get(i4);
                                    if (!abstractC0149b0.m649k()) {
                                    }
                                    i4++;
                                }
                            } else {
                                abstractC0149b0M582J = RecyclerView.m568K(view2);
                                childHelper2 = RecyclerView.this.f971p;
                                iIndexOfChild = ((RecyclerView2) childHelper2.f39177a).f39135a.indexOfChild(view2);
                                if (iIndexOfChild >= 0) {
                                    throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                                }
                                if (childHelper2.f39178b.m17016d(iIndexOfChild)) {
                                    throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                                }
                                childHelper2.f39178b.m17013a(iIndexOfChild);
                                childHelper2.m17012l(view2);
                                iM17010j = RecyclerView.this.f971p.m17010j(view2);
                                if (iM17010j != -1) {
                                    RecyclerView.this.f971p.m17003c(iM17010j);
                                    m793i(view2);
                                    abstractC0149b0M582J.m640b(8224);
                                    break;
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("layout index should not be -1 after unhiding a view:");
                                sb3.append(abstractC0149b0M582J);
                                throw new IllegalStateException(outline.m1588j(RecyclerView.this, sb3));
                            }
                        }
                        if (abstractC0149b0M582J != null) {
                            if (abstractC0149b0M582J.m651m()) {
                                i6 = abstractC0149b0M582J.f1005d;
                                if (i6 >= 0) {
                                }
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Inconsistency detected. Invalid view holder adapter position");
                                sb4.append(abstractC0149b0M582J);
                                throw new IndexOutOfBoundsException(outline.m1588j(RecyclerView.this, sb4));
                            }
                            z8 = RecyclerView.this.f980t0.f1100g;
                            if (z8) {
                                if (!z) {
                                    abstractC0149b0M582J.m640b(4);
                                    if (abstractC0149b0M582J.m652n()) {
                                        RecyclerView.this.removeDetachedView(abstractC0149b0M582J.f1003b, false);
                                        abstractC0149b0M582J.f1016o.m795k(abstractC0149b0M582J);
                                    } else if (abstractC0149b0M582J.m660v()) {
                                        abstractC0149b0M582J.m642d();
                                    }
                                    m792h(abstractC0149b0M582J);
                                }
                                abstractC0149b0M582J = null;
                            } else {
                                z2 = true;
                            }
                        }
                    }
                    abstractC0149b0M582J = abstractC0149b0;
                    if (abstractC0149b0M582J != null) {
                        if (abstractC0149b0M582J.m651m()) {
                            i6 = abstractC0149b0M582J.f1005d;
                            if (i6 >= 0) {
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Inconsistency detected. Invalid view holder adapter position");
                            sb5.append(abstractC0149b0M582J);
                            throw new IndexOutOfBoundsException(outline.m1588j(RecyclerView.this, sb5));
                        }
                        z8 = RecyclerView.this.f980t0.f1100g;
                        if (z8) {
                            if (!z) {
                                abstractC0149b0M582J.m640b(4);
                                if (abstractC0149b0M582J.m652n()) {
                                    RecyclerView.this.removeDetachedView(abstractC0149b0M582J.f1003b, false);
                                    abstractC0149b0M582J.f1016o.m795k(abstractC0149b0M582J);
                                } else if (abstractC0149b0M582J.m660v()) {
                                    abstractC0149b0M582J.m642d();
                                }
                                m792h(abstractC0149b0M582J);
                            }
                            abstractC0149b0M582J = null;
                        } else {
                            z2 = true;
                        }
                    }
                }
            }
            if (abstractC0149b0M582J == null) {
                iM16965f2 = RecyclerView.this.f969o.m16965f(i, 0);
                if (iM16965f2 >= 0) {
                }
                StringBuilder sbM1559J3 = outline.m1559J("Inconsistency detected. Invalid item position ", i, "(offset:", iM16965f2, ").state:");
                sbM1559J3.append(RecyclerView.this.f980t0.m809b());
                throw new IndexOutOfBoundsException(outline.m1588j(RecyclerView.this, sbM1559J3));
            }
            if (z2) {
                abstractC0149b0M582J.m657s(0, 8192);
                if (RecyclerView.this.f980t0.f1103j) {
                    AbstractC0157j.m686e(abstractC0149b0M582J);
                    AbstractC0157j abstractC0157j2 = RecyclerView.this.f953b0;
                    abstractC0149b0M582J.m645g();
                    RecyclerView.this.m600c0(abstractC0149b0M582J, abstractC0157j2.m698m(abstractC0149b0M582J));
                }
            }
            if (RecyclerView.this.f980t0.f1100g) {
                if (abstractC0149b0M582J.m648j()) {
                    iM16965f = RecyclerView.this.f969o.m16965f(i, 0);
                    abstractC0149b0M582J.f1021t = null;
                    RecyclerView recyclerView6 = RecyclerView.this;
                    abstractC0149b0M582J.f1020s = recyclerView6;
                    i2 = abstractC0149b0M582J.f1008g;
                    long nanoTime7 = recyclerView6.getNanoTime();
                    if (j2 != Long.MAX_VALUE) {
                        j3 = this.f1074g.m783a(i2).f1067d;
                        if (j3 != 0) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        z7 = z5;
                    }
                    abstractC0152e = RecyclerView.this.f985w;
                    Objects.requireNonNull(abstractC0152e);
                    if (abstractC0149b0M582J.f1021t == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        abstractC0149b0M582J.f1005d = iM16965f;
                        if (abstractC0152e.f1024b) {
                            abstractC0149b0M582J.f1007f = abstractC0152e.mo663e(iM16965f);
                        }
                        abstractC0149b0M582J.m657s(1, 519);
                        int i15 = TraceCompat.f37894a;
                        Trace.beginSection("RV OnBindView");
                    }
                    abstractC0149b0M582J.f1021t = abstractC0152e;
                    abstractC0149b0M582J.m645g();
                    abstractC0152e.mo666h(abstractC0149b0M582J, iM16965f);
                    if (z3) {
                        list = abstractC0149b0M582J.f1013l;
                        if (list != null) {
                            list.clear();
                        }
                        abstractC0149b0M582J.f1012k &= -1025;
                        layoutParams = abstractC0149b0M582J.f1003b.getLayoutParams();
                        if (layoutParams instanceof C0161n) {
                            ((C0161n) layoutParams).f1060c = true;
                        }
                        int i16 = TraceCompat.f37894a;
                        Trace.endSection();
                    }
                    long nanoTime8 = RecyclerView.this.getNanoTime();
                    C0166s c0166s4 = this.f1074g;
                    long j8 = nanoTime8 - nanoTime7;
                    C0166s.a aVarM783a4 = c0166s4.m783a(abstractC0149b0M582J.f1008g);
                    aVarM783a4.f1067d = c0166s4.m784b(aVarM783a4.f1067d, j8);
                    accessibilityManager = RecyclerView.this.f942N;
                    if (accessibilityManager == null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        view = abstractC0149b0M582J.f1003b;
                        AtomicInteger atomicInteger3 = ViewCompat.f38073a;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        recyclerViewAccessibilityDelegate = RecyclerView.this.f917A0;
                        if (recyclerViewAccessibilityDelegate != null) {
                            aVar = recyclerViewAccessibilityDelegate.f39145e;
                            if (aVar instanceof RecyclerViewAccessibilityDelegate.a) {
                                Objects.requireNonNull(aVar);
                                accessibilityDelegateCompatM16313g = ViewCompat.m16313g(view);
                                if (accessibilityDelegateCompatM16313g != null) {
                                    aVar.f39147e.put(view, accessibilityDelegateCompatM16313g);
                                }
                            }
                            ViewCompat.m16327u(view, aVar);
                        }
                    }
                    if (RecyclerView.this.f980t0.f1100g) {
                        abstractC0149b0M582J.f1009h = i;
                    }
                } else {
                    if ((abstractC0149b0M582J.f1012k & 2) != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        iM16965f = RecyclerView.this.f969o.m16965f(i, 0);
                        abstractC0149b0M582J.f1021t = null;
                        RecyclerView recyclerView7 = RecyclerView.this;
                        abstractC0149b0M582J.f1020s = recyclerView7;
                        i2 = abstractC0149b0M582J.f1008g;
                        long nanoTime9 = recyclerView7.getNanoTime();
                        if (j2 != Long.MAX_VALUE) {
                            j3 = this.f1074g.m783a(i2).f1067d;
                            if (j3 != 0) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            if (z5) {
                            }
                        }
                        abstractC0152e = RecyclerView.this.f985w;
                        Objects.requireNonNull(abstractC0152e);
                        if (abstractC0149b0M582J.f1021t == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            abstractC0149b0M582J.f1005d = iM16965f;
                            if (abstractC0152e.f1024b) {
                                abstractC0149b0M582J.f1007f = abstractC0152e.mo663e(iM16965f);
                            }
                            abstractC0149b0M582J.m657s(1, 519);
                            int i17 = TraceCompat.f37894a;
                            Trace.beginSection("RV OnBindView");
                        }
                        abstractC0149b0M582J.f1021t = abstractC0152e;
                        abstractC0149b0M582J.m645g();
                        abstractC0152e.mo666h(abstractC0149b0M582J, iM16965f);
                        if (z3) {
                            list = abstractC0149b0M582J.f1013l;
                            if (list != null) {
                                list.clear();
                            }
                            abstractC0149b0M582J.f1012k &= -1025;
                            layoutParams = abstractC0149b0M582J.f1003b.getLayoutParams();
                            if (layoutParams instanceof C0161n) {
                                ((C0161n) layoutParams).f1060c = true;
                            }
                            int i18 = TraceCompat.f37894a;
                            Trace.endSection();
                        }
                        long nanoTime10 = RecyclerView.this.getNanoTime();
                        C0166s c0166s5 = this.f1074g;
                        long j9 = nanoTime10 - nanoTime9;
                        C0166s.a aVarM783a5 = c0166s5.m783a(abstractC0149b0M582J.f1008g);
                        aVarM783a5.f1067d = c0166s5.m784b(aVarM783a5.f1067d, j9);
                        accessibilityManager = RecyclerView.this.f942N;
                        if (accessibilityManager == null) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            view = abstractC0149b0M582J.f1003b;
                            AtomicInteger atomicInteger4 = ViewCompat.f38073a;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            recyclerViewAccessibilityDelegate = RecyclerView.this.f917A0;
                            if (recyclerViewAccessibilityDelegate != null) {
                                aVar = recyclerViewAccessibilityDelegate.f39145e;
                                if (aVar instanceof RecyclerViewAccessibilityDelegate.a) {
                                    Objects.requireNonNull(aVar);
                                    accessibilityDelegateCompatM16313g = ViewCompat.m16313g(view);
                                    if (accessibilityDelegateCompatM16313g != null) {
                                        aVar.f39147e.put(view, accessibilityDelegateCompatM16313g);
                                    }
                                }
                                ViewCompat.m16327u(view, aVar);
                            }
                        }
                        if (RecyclerView.this.f980t0.f1100g) {
                            abstractC0149b0M582J.f1009h = i;
                        }
                    } else {
                        iM16965f = RecyclerView.this.f969o.m16965f(i, 0);
                        abstractC0149b0M582J.f1021t = null;
                        RecyclerView recyclerView8 = RecyclerView.this;
                        abstractC0149b0M582J.f1020s = recyclerView8;
                        i2 = abstractC0149b0M582J.f1008g;
                        long nanoTime11 = recyclerView8.getNanoTime();
                        if (j2 != Long.MAX_VALUE) {
                            j3 = this.f1074g.m783a(i2).f1067d;
                            if (j3 != 0) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            if (z5) {
                            }
                        }
                        abstractC0152e = RecyclerView.this.f985w;
                        Objects.requireNonNull(abstractC0152e);
                        if (abstractC0149b0M582J.f1021t == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            abstractC0149b0M582J.f1005d = iM16965f;
                            if (abstractC0152e.f1024b) {
                                abstractC0149b0M582J.f1007f = abstractC0152e.mo663e(iM16965f);
                            }
                            abstractC0149b0M582J.m657s(1, 519);
                            int i19 = TraceCompat.f37894a;
                            Trace.beginSection("RV OnBindView");
                        }
                        abstractC0149b0M582J.f1021t = abstractC0152e;
                        abstractC0149b0M582J.m645g();
                        abstractC0152e.mo666h(abstractC0149b0M582J, iM16965f);
                        if (z3) {
                            list = abstractC0149b0M582J.f1013l;
                            if (list != null) {
                                list.clear();
                            }
                            abstractC0149b0M582J.f1012k &= -1025;
                            layoutParams = abstractC0149b0M582J.f1003b.getLayoutParams();
                            if (layoutParams instanceof C0161n) {
                                ((C0161n) layoutParams).f1060c = true;
                            }
                            int i110 = TraceCompat.f37894a;
                            Trace.endSection();
                        }
                        long nanoTime12 = RecyclerView.this.getNanoTime();
                        C0166s c0166s6 = this.f1074g;
                        long j10 = nanoTime12 - nanoTime11;
                        C0166s.a aVarM783a6 = c0166s6.m783a(abstractC0149b0M582J.f1008g);
                        aVarM783a6.f1067d = c0166s6.m784b(aVarM783a6.f1067d, j10);
                        accessibilityManager = RecyclerView.this.f942N;
                        if (accessibilityManager == null) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            view = abstractC0149b0M582J.f1003b;
                            AtomicInteger atomicInteger5 = ViewCompat.f38073a;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            recyclerViewAccessibilityDelegate = RecyclerView.this.f917A0;
                            if (recyclerViewAccessibilityDelegate != null) {
                                aVar = recyclerViewAccessibilityDelegate.f39145e;
                                if (aVar instanceof RecyclerViewAccessibilityDelegate.a) {
                                    Objects.requireNonNull(aVar);
                                    accessibilityDelegateCompatM16313g = ViewCompat.m16313g(view);
                                    if (accessibilityDelegateCompatM16313g != null) {
                                        aVar.f39147e.put(view, accessibilityDelegateCompatM16313g);
                                    }
                                }
                                ViewCompat.m16327u(view, aVar);
                            }
                        }
                        if (RecyclerView.this.f980t0.f1100g) {
                            abstractC0149b0M582J.f1009h = i;
                        }
                    }
                }
            } else if (abstractC0149b0M582J.m648j()) {
                iM16965f = RecyclerView.this.f969o.m16965f(i, 0);
                abstractC0149b0M582J.f1021t = null;
                RecyclerView recyclerView9 = RecyclerView.this;
                abstractC0149b0M582J.f1020s = recyclerView9;
                i2 = abstractC0149b0M582J.f1008g;
                long nanoTime13 = recyclerView9.getNanoTime();
                if (j2 != Long.MAX_VALUE) {
                    j3 = this.f1074g.m783a(i2).f1067d;
                    if (j3 != 0) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (z5) {
                    }
                }
                abstractC0152e = RecyclerView.this.f985w;
                Objects.requireNonNull(abstractC0152e);
                if (abstractC0149b0M582J.f1021t == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    abstractC0149b0M582J.f1005d = iM16965f;
                    if (abstractC0152e.f1024b) {
                        abstractC0149b0M582J.f1007f = abstractC0152e.mo663e(iM16965f);
                    }
                    abstractC0149b0M582J.m657s(1, 519);
                    int i111 = TraceCompat.f37894a;
                    Trace.beginSection("RV OnBindView");
                }
                abstractC0149b0M582J.f1021t = abstractC0152e;
                abstractC0149b0M582J.m645g();
                abstractC0152e.mo666h(abstractC0149b0M582J, iM16965f);
                if (z3) {
                    list = abstractC0149b0M582J.f1013l;
                    if (list != null) {
                        list.clear();
                    }
                    abstractC0149b0M582J.f1012k &= -1025;
                    layoutParams = abstractC0149b0M582J.f1003b.getLayoutParams();
                    if (layoutParams instanceof C0161n) {
                        ((C0161n) layoutParams).f1060c = true;
                    }
                    int i112 = TraceCompat.f37894a;
                    Trace.endSection();
                }
                long nanoTime14 = RecyclerView.this.getNanoTime();
                C0166s c0166s7 = this.f1074g;
                long j11 = nanoTime14 - nanoTime13;
                C0166s.a aVarM783a7 = c0166s7.m783a(abstractC0149b0M582J.f1008g);
                aVarM783a7.f1067d = c0166s7.m784b(aVarM783a7.f1067d, j11);
                accessibilityManager = RecyclerView.this.f942N;
                if (accessibilityManager == null) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (z4) {
                    view = abstractC0149b0M582J.f1003b;
                    AtomicInteger atomicInteger6 = ViewCompat.f38073a;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    recyclerViewAccessibilityDelegate = RecyclerView.this.f917A0;
                    if (recyclerViewAccessibilityDelegate != null) {
                        aVar = recyclerViewAccessibilityDelegate.f39145e;
                        if (aVar instanceof RecyclerViewAccessibilityDelegate.a) {
                            Objects.requireNonNull(aVar);
                            accessibilityDelegateCompatM16313g = ViewCompat.m16313g(view);
                            if (accessibilityDelegateCompatM16313g != null) {
                                aVar.f39147e.put(view, accessibilityDelegateCompatM16313g);
                            }
                        }
                        ViewCompat.m16327u(view, aVar);
                    }
                }
                if (RecyclerView.this.f980t0.f1100g) {
                    abstractC0149b0M582J.f1009h = i;
                }
            } else {
                if ((abstractC0149b0M582J.f1012k & 2) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    iM16965f = RecyclerView.this.f969o.m16965f(i, 0);
                    abstractC0149b0M582J.f1021t = null;
                    RecyclerView recyclerView10 = RecyclerView.this;
                    abstractC0149b0M582J.f1020s = recyclerView10;
                    i2 = abstractC0149b0M582J.f1008g;
                    long nanoTime15 = recyclerView10.getNanoTime();
                    if (j2 != Long.MAX_VALUE) {
                        j3 = this.f1074g.m783a(i2).f1067d;
                        if (j3 != 0) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (z5) {
                        }
                    }
                    abstractC0152e = RecyclerView.this.f985w;
                    Objects.requireNonNull(abstractC0152e);
                    if (abstractC0149b0M582J.f1021t == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        abstractC0149b0M582J.f1005d = iM16965f;
                        if (abstractC0152e.f1024b) {
                            abstractC0149b0M582J.f1007f = abstractC0152e.mo663e(iM16965f);
                        }
                        abstractC0149b0M582J.m657s(1, 519);
                        int i113 = TraceCompat.f37894a;
                        Trace.beginSection("RV OnBindView");
                    }
                    abstractC0149b0M582J.f1021t = abstractC0152e;
                    abstractC0149b0M582J.m645g();
                    abstractC0152e.mo666h(abstractC0149b0M582J, iM16965f);
                    if (z3) {
                        list = abstractC0149b0M582J.f1013l;
                        if (list != null) {
                            list.clear();
                        }
                        abstractC0149b0M582J.f1012k &= -1025;
                        layoutParams = abstractC0149b0M582J.f1003b.getLayoutParams();
                        if (layoutParams instanceof C0161n) {
                            ((C0161n) layoutParams).f1060c = true;
                        }
                        int i114 = TraceCompat.f37894a;
                        Trace.endSection();
                    }
                    long nanoTime16 = RecyclerView.this.getNanoTime();
                    C0166s c0166s8 = this.f1074g;
                    long j12 = nanoTime16 - nanoTime15;
                    C0166s.a aVarM783a8 = c0166s8.m783a(abstractC0149b0M582J.f1008g);
                    aVarM783a8.f1067d = c0166s8.m784b(aVarM783a8.f1067d, j12);
                    accessibilityManager = RecyclerView.this.f942N;
                    if (accessibilityManager == null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        view = abstractC0149b0M582J.f1003b;
                        AtomicInteger atomicInteger7 = ViewCompat.f38073a;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        recyclerViewAccessibilityDelegate = RecyclerView.this.f917A0;
                        if (recyclerViewAccessibilityDelegate != null) {
                            aVar = recyclerViewAccessibilityDelegate.f39145e;
                            if (aVar instanceof RecyclerViewAccessibilityDelegate.a) {
                                Objects.requireNonNull(aVar);
                                accessibilityDelegateCompatM16313g = ViewCompat.m16313g(view);
                                if (accessibilityDelegateCompatM16313g != null) {
                                    aVar.f39147e.put(view, accessibilityDelegateCompatM16313g);
                                }
                            }
                            ViewCompat.m16327u(view, aVar);
                        }
                    }
                    if (RecyclerView.this.f980t0.f1100g) {
                        abstractC0149b0M582J.f1009h = i;
                    }
                } else {
                    iM16965f = RecyclerView.this.f969o.m16965f(i, 0);
                    abstractC0149b0M582J.f1021t = null;
                    RecyclerView recyclerView11 = RecyclerView.this;
                    abstractC0149b0M582J.f1020s = recyclerView11;
                    i2 = abstractC0149b0M582J.f1008g;
                    long nanoTime17 = recyclerView11.getNanoTime();
                    if (j2 != Long.MAX_VALUE) {
                        j3 = this.f1074g.m783a(i2).f1067d;
                        if (j3 != 0) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (z5) {
                        }
                    }
                    abstractC0152e = RecyclerView.this.f985w;
                    Objects.requireNonNull(abstractC0152e);
                    if (abstractC0149b0M582J.f1021t == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        abstractC0149b0M582J.f1005d = iM16965f;
                        if (abstractC0152e.f1024b) {
                            abstractC0149b0M582J.f1007f = abstractC0152e.mo663e(iM16965f);
                        }
                        abstractC0149b0M582J.m657s(1, 519);
                        int i115 = TraceCompat.f37894a;
                        Trace.beginSection("RV OnBindView");
                    }
                    abstractC0149b0M582J.f1021t = abstractC0152e;
                    abstractC0149b0M582J.m645g();
                    abstractC0152e.mo666h(abstractC0149b0M582J, iM16965f);
                    if (z3) {
                        list = abstractC0149b0M582J.f1013l;
                        if (list != null) {
                            list.clear();
                        }
                        abstractC0149b0M582J.f1012k &= -1025;
                        layoutParams = abstractC0149b0M582J.f1003b.getLayoutParams();
                        if (layoutParams instanceof C0161n) {
                            ((C0161n) layoutParams).f1060c = true;
                        }
                        int i116 = TraceCompat.f37894a;
                        Trace.endSection();
                    }
                    long nanoTime18 = RecyclerView.this.getNanoTime();
                    C0166s c0166s9 = this.f1074g;
                    long j13 = nanoTime18 - nanoTime17;
                    C0166s.a aVarM783a9 = c0166s9.m783a(abstractC0149b0M582J.f1008g);
                    aVarM783a9.f1067d = c0166s9.m784b(aVarM783a9.f1067d, j13);
                    accessibilityManager = RecyclerView.this.f942N;
                    if (accessibilityManager == null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        view = abstractC0149b0M582J.f1003b;
                        AtomicInteger atomicInteger8 = ViewCompat.f38073a;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        recyclerViewAccessibilityDelegate = RecyclerView.this.f917A0;
                        if (recyclerViewAccessibilityDelegate != null) {
                            aVar = recyclerViewAccessibilityDelegate.f39145e;
                            if (aVar instanceof RecyclerViewAccessibilityDelegate.a) {
                                Objects.requireNonNull(aVar);
                                accessibilityDelegateCompatM16313g = ViewCompat.m16313g(view);
                                if (accessibilityDelegateCompatM16313g != null) {
                                    aVar.f39147e.put(view, accessibilityDelegateCompatM16313g);
                                }
                            }
                            ViewCompat.m16327u(view, aVar);
                        }
                    }
                    if (RecyclerView.this.f980t0.f1100g) {
                        abstractC0149b0M582J.f1009h = i;
                    }
                }
            }
            layoutParams2 = abstractC0149b0M582J.f1003b.getLayoutParams();
            if (layoutParams2 == null) {
                c0161n = (C0161n) RecyclerView.this.generateDefaultLayoutParams();
                abstractC0149b0M582J.f1003b.setLayoutParams(c0161n);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams2)) {
                c0161n = (C0161n) RecyclerView.this.generateLayoutParams(layoutParams2);
                abstractC0149b0M582J.f1003b.setLayoutParams(c0161n);
            } else {
                c0161n = (C0161n) layoutParams2;
            }
            c0161n.f1058a = abstractC0149b0M582J;
            if (z2) {
                z9 = true;
            }
            c0161n.f1061d = z9;
            return abstractC0149b0M582J;
        }

        /* JADX INFO: renamed from: k */
        public void m795k(AbstractC0149b0 abstractC0149b0) {
            if (abstractC0149b0.f1017p) {
                this.f1069b.remove(abstractC0149b0);
            } else {
                this.f1068a.remove(abstractC0149b0);
            }
            abstractC0149b0.f1016o = null;
            abstractC0149b0.f1017p = false;
            abstractC0149b0.m642d();
        }

        /* JADX INFO: renamed from: l */
        public void m796l() {
            AbstractC0160m abstractC0160m = RecyclerView.this.f987x;
            this.f1073f = this.f1072e + (abstractC0160m != null ? abstractC0160m.f1046l : 0);
            for (int size = this.f1070c.size() - 1; size >= 0 && this.f1070c.size() > this.f1073f; size--) {
                m790f(size);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public interface InterfaceC0168u {
        /* JADX INFO: renamed from: a */
        void m797a(AbstractC0149b0 abstractC0149b0);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public class C0169v extends AbstractC0154g {
        public C0169v() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: a */
        public void mo678a() {
            RecyclerView.this.m609i(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f980t0.f1099f = true;
            recyclerView.m599b0(true);
            if (RecyclerView.this.f969o.m16966g()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: c */
        public void mo680c(int i, int i2, Object obj) {
            RecyclerView.this.m609i(null);
            AdapterHelper adapterHelper = RecyclerView.this.f969o;
            Objects.requireNonNull(adapterHelper);
            boolean z = false;
            if (i2 >= 1) {
                adapterHelper.f39126b.add(adapterHelper.m16967h(4, i, i2, obj));
                adapterHelper.f39130f |= 4;
                if (adapterHelper.f39126b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                m798g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: d */
        public void mo681d(int i, int i2) {
            RecyclerView.this.m609i(null);
            AdapterHelper adapterHelper = RecyclerView.this.f969o;
            Objects.requireNonNull(adapterHelper);
            boolean z = false;
            if (i2 >= 1) {
                adapterHelper.f39126b.add(adapterHelper.m16967h(1, i, i2, null));
                adapterHelper.f39130f |= 1;
                if (adapterHelper.f39126b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                m798g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: e */
        public void mo682e(int i, int i2, int i3) {
            RecyclerView.this.m609i(null);
            AdapterHelper adapterHelper = RecyclerView.this.f969o;
            Objects.requireNonNull(adapterHelper);
            boolean z = false;
            if (i != i2) {
                if (i3 != 1) {
                    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
                }
                adapterHelper.f39126b.add(adapterHelper.m16967h(8, i, i2, null));
                adapterHelper.f39130f |= 8;
                if (adapterHelper.f39126b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                m798g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0154g
        /* JADX INFO: renamed from: f */
        public void mo683f(int i, int i2) {
            RecyclerView.this.m609i(null);
            AdapterHelper adapterHelper = RecyclerView.this.f969o;
            Objects.requireNonNull(adapterHelper);
            boolean z = false;
            if (i2 >= 1) {
                adapterHelper.f39126b.add(adapterHelper.m16967h(2, i, i2, null));
                adapterHelper.f39130f |= 2;
                if (adapterHelper.f39126b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                m798g();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m798g() {
            if (RecyclerView.f912h) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f924E && recyclerView.f922D) {
                    Runnable runnable = recyclerView.f977s;
                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                    recyclerView.postOnAnimation(runnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f940M = true;
            recyclerView2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public static abstract class AbstractC0171x {

        /* JADX INFO: renamed from: b */
        public RecyclerView f1080b;

        /* JADX INFO: renamed from: c */
        public AbstractC0160m f1081c;

        /* JADX INFO: renamed from: d */
        public boolean f1082d;

        /* JADX INFO: renamed from: e */
        public boolean f1083e;

        /* JADX INFO: renamed from: f */
        public View f1084f;

        /* JADX INFO: renamed from: h */
        public boolean f1086h;

        /* JADX INFO: renamed from: a */
        public int f1079a = -1;

        /* JADX INFO: renamed from: g */
        public final a f1085g = new a(0, 0);

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$x$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public int f1087a;

            /* JADX INFO: renamed from: b */
            public int f1088b;

            /* JADX INFO: renamed from: c */
            public int f1089c;

            /* JADX INFO: renamed from: d */
            public int f1090d;

            /* JADX INFO: renamed from: e */
            public Interpolator f1091e;

            /* JADX INFO: renamed from: f */
            public boolean f1092f;

            /* JADX INFO: renamed from: g */
            public int f1093g;

            public a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            /* JADX INFO: renamed from: a */
            public void m806a(RecyclerView recyclerView) {
                int i = this.f1090d;
                if (i >= 0) {
                    this.f1090d = -1;
                    recyclerView.m587P(i);
                    this.f1092f = false;
                    return;
                }
                if (!this.f1092f) {
                    this.f1093g = 0;
                    return;
                }
                Interpolator interpolator = this.f1091e;
                if (interpolator != null && this.f1089c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i2 = this.f1089c;
                if (i2 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.f974q0.m637b(this.f1087a, this.f1088b, i2, interpolator);
                int i3 = this.f1093g + 1;
                this.f1093g = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f1092f = false;
            }

            /* JADX INFO: renamed from: b */
            public void m807b(int i, int i2, int i3, Interpolator interpolator) {
                this.f1087a = i;
                this.f1088b = i2;
                this.f1089c = i3;
                this.f1091e = interpolator;
                this.f1092f = true;
            }

            public a(int i, int i2, int i3) {
                this(i, i2, i3, null);
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.f1090d = -1;
                this.f1092f = false;
                this.f1093g = 0;
                this.f1087a = i;
                this.f1088b = i2;
                this.f1089c = i3;
                this.f1091e = interpolator;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$x$b */
        public interface b {
            /* JADX INFO: renamed from: a */
            PointF mo526a(int i);
        }

        /* JADX INFO: renamed from: a */
        public PointF m799a(int i) {
            Object obj = this.f1081c;
            if (obj instanceof b) {
                return ((b) obj).mo526a(i);
            }
            StringBuilder sbM1556G = outline.m1556G("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sbM1556G.append(b.class.getCanonicalName());
            Log.w("RecyclerView", sbM1556G.toString());
            return null;
        }

        /* JADX INFO: renamed from: b */
        public void m800b(int i, int i2) {
            PointF pointFM799a;
            RecyclerView recyclerView = this.f1080b;
            if (this.f1079a == -1 || recyclerView == null) {
                m805g();
            }
            if (this.f1082d && this.f1084f == null && this.f1081c != null && (pointFM799a = m799a(this.f1079a)) != null) {
                float f = pointFM799a.x;
                if (f != 0.0f || pointFM799a.y != 0.0f) {
                    recyclerView.m610i0((int) Math.signum(f), (int) Math.signum(pointFM799a.y), null);
                }
            }
            this.f1082d = false;
            View view = this.f1084f;
            if (view != null) {
                Objects.requireNonNull(this.f1080b);
                AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(view);
                if ((abstractC0149b0M568K != null ? abstractC0149b0M568K.m644f() : -1) == this.f1079a) {
                    mo804f(this.f1084f, recyclerView.f980t0, this.f1085g);
                    this.f1085g.m806a(recyclerView);
                    m805g();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f1084f = null;
                }
            }
            if (this.f1083e) {
                mo801c(i, i2, recyclerView.f980t0, this.f1085g);
                a aVar = this.f1085g;
                boolean z = aVar.f1090d >= 0;
                aVar.m806a(recyclerView);
                if (z && this.f1083e) {
                    this.f1082d = true;
                    recyclerView.f974q0.m636a();
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo801c(int i, int i2, C0172y c0172y, a aVar);

        /* JADX INFO: renamed from: d */
        public abstract void mo802d();

        /* JADX INFO: renamed from: e */
        public abstract void mo803e();

        /* JADX INFO: renamed from: f */
        public abstract void mo804f(View view, C0172y c0172y, a aVar);

        /* JADX INFO: renamed from: g */
        public final void m805g() {
            if (this.f1083e) {
                this.f1083e = false;
                mo803e();
                this.f1080b.f980t0.f1094a = -1;
                this.f1084f = null;
                this.f1079a = -1;
                this.f1082d = false;
                AbstractC0160m abstractC0160m = this.f1081c;
                if (abstractC0160m.f1041g == this) {
                    abstractC0160m.f1041g = null;
                }
                this.f1081c = null;
                this.f1080b = null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C0172y {

        /* JADX INFO: renamed from: a */
        public int f1094a = -1;

        /* JADX INFO: renamed from: b */
        public int f1095b = 0;

        /* JADX INFO: renamed from: c */
        public int f1096c = 0;

        /* JADX INFO: renamed from: d */
        public int f1097d = 1;

        /* JADX INFO: renamed from: e */
        public int f1098e = 0;

        /* JADX INFO: renamed from: f */
        public boolean f1099f = false;

        /* JADX INFO: renamed from: g */
        public boolean f1100g = false;

        /* JADX INFO: renamed from: h */
        public boolean f1101h = false;

        /* JADX INFO: renamed from: i */
        public boolean f1102i = false;

        /* JADX INFO: renamed from: j */
        public boolean f1103j = false;

        /* JADX INFO: renamed from: k */
        public boolean f1104k = false;

        /* JADX INFO: renamed from: l */
        public int f1105l;

        /* JADX INFO: renamed from: m */
        public long f1106m;

        /* JADX INFO: renamed from: n */
        public int f1107n;

        /* JADX INFO: renamed from: a */
        public void m808a(int i) {
            if ((this.f1097d & i) != 0) {
                return;
            }
            StringBuilder sbM1556G = outline.m1556G("Layout state should be one of ");
            sbM1556G.append(Integer.toBinaryString(i));
            sbM1556G.append(" but it is ");
            sbM1556G.append(Integer.toBinaryString(this.f1097d));
            throw new IllegalStateException(sbM1556G.toString());
        }

        /* JADX INFO: renamed from: b */
        public int m809b() {
            return this.f1100g ? this.f1095b - this.f1096c : this.f1098e;
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("State{mTargetPosition=");
            sbM1556G.append(this.f1094a);
            sbM1556G.append(", mData=");
            sbM1556G.append((Object) null);
            sbM1556G.append(", mItemCount=");
            sbM1556G.append(this.f1098e);
            sbM1556G.append(", mIsMeasuring=");
            sbM1556G.append(this.f1102i);
            sbM1556G.append(", mPreviousLayoutItemCount=");
            sbM1556G.append(this.f1095b);
            sbM1556G.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sbM1556G.append(this.f1096c);
            sbM1556G.append(", mStructureChanged=");
            sbM1556G.append(this.f1099f);
            sbM1556G.append(", mInPreLayout=");
            sbM1556G.append(this.f1100g);
            sbM1556G.append(", mRunSimpleAnimations=");
            sbM1556G.append(this.f1103j);
            sbM1556G.append(", mRunPredictiveAnimations=");
            sbM1556G.append(this.f1104k);
            sbM1556G.append('}');
            return sbM1556G.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class AbstractC0173z {
        /* JADX INFO: renamed from: a */
        public abstract View m810a(C0167t c0167t, int i, int i2);
    }

    static {
        f911g = Build.VERSION.SDK_INT >= 23;
        f912h = true;
        f913i = true;
        Class<?> cls = Integer.TYPE;
        f914j = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f915k = new InterpolatorC0150c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: F */
    public static RecyclerView m567F(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM567F = m567F(viewGroup.getChildAt(i));
            if (recyclerViewM567F != null) {
                return recyclerViewM567F;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static AbstractC0149b0 m568K(View view) {
        if (view == null) {
            return null;
        }
        return ((C0161n) view.getLayoutParams()).f1058a;
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.f923D0 == null) {
            this.f923D0 = new NestedScrollingChildHelper(this);
        }
        return this.f923D0;
    }

    /* JADX INFO: renamed from: k */
    public static void m573k(AbstractC0149b0 abstractC0149b0) {
        WeakReference<RecyclerView> weakReference = abstractC0149b0.f1004c;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC0149b0.f1003b) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC0149b0.f1004c = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public String m574A() {
        StringBuilder sbM1556G = outline.m1556G(" ");
        sbM1556G.append(super.toString());
        sbM1556G.append(", adapter:");
        sbM1556G.append(this.f985w);
        sbM1556G.append(", layout:");
        sbM1556G.append(this.f987x);
        sbM1556G.append(", context:");
        sbM1556G.append(getContext());
        return sbM1556G.toString();
    }

    /* JADX INFO: renamed from: B */
    public final void m575B(C0172y c0172y) {
        if (getScrollState() != 2) {
            Objects.requireNonNull(c0172y);
            return;
        }
        OverScroller overScroller = this.f974q0.f996h;
        overScroller.getFinalX();
        overScroller.getCurrX();
        Objects.requireNonNull(c0172y);
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX INFO: renamed from: C */
    public View m576C(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m577D(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f918B.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0164q interfaceC0164q = this.f918B.get(i);
            if (interfaceC0164q.mo779b(this, motionEvent) && action != 3) {
                this.f920C = interfaceC0164q;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final void m578E(int[] iArr) {
        int iM17005e = this.f971p.m17005e();
        if (iM17005e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM17005e; i3++) {
            AbstractC0149b0 abstractC0149b0M568K = m568K(this.f971p.m17004d(i3));
            if (!abstractC0149b0M568K.m659u()) {
                int iM644f = abstractC0149b0M568K.m644f();
                if (iM644f < i) {
                    i = iM644f;
                }
                if (iM644f > i2) {
                    i2 = iM644f;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* JADX INFO: renamed from: G */
    public AbstractC0149b0 m579G(int i) {
        AbstractC0149b0 abstractC0149b0 = null;
        if (this.f944P) {
            return null;
        }
        int iM17008h = this.f971p.m17008h();
        for (int i2 = 0; i2 < iM17008h; i2++) {
            AbstractC0149b0 abstractC0149b0M568K = m568K(this.f971p.m17007g(i2));
            if (abstractC0149b0M568K != null && !abstractC0149b0M568K.m651m() && m580H(abstractC0149b0M568K) == i) {
                if (!this.f971p.m17011k(abstractC0149b0M568K.f1003b)) {
                    return abstractC0149b0M568K;
                }
                abstractC0149b0 = abstractC0149b0M568K;
            }
        }
        return abstractC0149b0;
    }

    /* JADX INFO: renamed from: H */
    public int m580H(AbstractC0149b0 abstractC0149b0) {
        if (!abstractC0149b0.m646h(524) && abstractC0149b0.m648j()) {
            AdapterHelper adapterHelper = this.f969o;
            int i = abstractC0149b0.f1005d;
            int size = adapterHelper.f39126b.size();
            for (int i2 = 0; i2 < size; i2++) {
                AdapterHelper.b bVar = adapterHelper.f39126b.get(i2);
                int i3 = bVar.f39131a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = bVar.f39132b;
                        if (i4 <= i) {
                            int i5 = bVar.f39134d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = bVar.f39132b;
                        if (i6 == i) {
                            i = bVar.f39134d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (bVar.f39134d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (bVar.f39132b <= i) {
                    i += bVar.f39134d;
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: I */
    public long m581I(AbstractC0149b0 abstractC0149b0) {
        return this.f985w.f1024b ? abstractC0149b0.f1007f : abstractC0149b0.f1005d;
    }

    /* JADX INFO: renamed from: J */
    public AbstractC0149b0 m582J(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m568K(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX INFO: renamed from: L */
    public Rect m583L(View view) {
        C0161n c0161n = (C0161n) view.getLayoutParams();
        if (!c0161n.f1060c) {
            return c0161n.f1059b;
        }
        if (this.f980t0.f1100g && (c0161n.m773b() || c0161n.f1058a.m649k())) {
            return c0161n.f1059b;
        }
        Rect rect = c0161n.f1059b;
        rect.set(0, 0, 0, 0);
        int size = this.f916A.size();
        for (int i = 0; i < size; i++) {
            this.f979t.set(0, 0, 0, 0);
            AbstractC0159l abstractC0159l = this.f916A.get(i);
            Rect rect2 = this.f979t;
            Objects.requireNonNull(abstractC0159l);
            ((C0161n) view.getLayoutParams()).m772a();
            rect2.set(0, 0, 0, 0);
            int i2 = rect.left;
            Rect rect3 = this.f979t;
            rect.left = i2 + rect3.left;
            rect.top += rect3.top;
            rect.right += rect3.right;
            rect.bottom += rect3.bottom;
        }
        c0161n.f1060c = false;
        return rect;
    }

    /* JADX INFO: renamed from: M */
    public boolean m584M() {
        return !this.f928G || this.f944P || this.f969o.m16966g();
    }

    /* JADX INFO: renamed from: N */
    public void m585N() {
        this.f952a0 = null;
        this.f950V = null;
        this.f951W = null;
        this.f949U = null;
    }

    /* JADX INFO: renamed from: O */
    public boolean m586O() {
        return this.f946R > 0;
    }

    /* JADX INFO: renamed from: P */
    public void m587P(int i) {
        if (this.f987x == null) {
            return;
        }
        setScrollState(2);
        this.f987x.mo522N0(i);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: Q */
    public void m588Q() {
        int iM17008h = this.f971p.m17008h();
        for (int i = 0; i < iM17008h; i++) {
            ((C0161n) this.f971p.m17007g(i).getLayoutParams()).f1060c = true;
        }
        C0167t c0167t = this.f965m;
        int size = c0167t.f1070c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0161n c0161n = (C0161n) c0167t.f1070c.get(i2).f1003b.getLayoutParams();
            if (c0161n != null) {
                c0161n.f1060c = true;
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public void m589R(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM17008h = this.f971p.m17008h();
        for (int i4 = 0; i4 < iM17008h; i4++) {
            AbstractC0149b0 abstractC0149b0M568K = m568K(this.f971p.m17007g(i4));
            if (abstractC0149b0M568K != null && !abstractC0149b0M568K.m659u()) {
                int i5 = abstractC0149b0M568K.f1005d;
                if (i5 >= i3) {
                    abstractC0149b0M568K.m655q(-i2, z);
                    this.f980t0.f1099f = true;
                } else if (i5 >= i) {
                    abstractC0149b0M568K.m640b(8);
                    abstractC0149b0M568K.m655q(-i2, z);
                    abstractC0149b0M568K.f1005d = i - 1;
                    this.f980t0.f1099f = true;
                }
            }
        }
        C0167t c0167t = this.f965m;
        int size = c0167t.f1070c.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            AbstractC0149b0 abstractC0149b0 = c0167t.f1070c.get(size);
            if (abstractC0149b0 != null) {
                int i6 = abstractC0149b0.f1005d;
                if (i6 >= i3) {
                    abstractC0149b0.m655q(-i2, z);
                } else if (i6 >= i) {
                    abstractC0149b0.m640b(8);
                    c0167t.m790f(size);
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m590S() {
    }

    /* JADX INFO: renamed from: T */
    public void m591T() {
    }

    /* JADX INFO: renamed from: U */
    public void m592U() {
        this.f946R++;
    }

    /* JADX INFO: renamed from: V */
    public void m593V(boolean z) {
        int i;
        int i2 = this.f946R - 1;
        this.f946R = i2;
        if (i2 < 1) {
            this.f946R = 0;
            if (z) {
                int i3 = this.f938L;
                this.f938L = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.f942N;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                        accessibilityEventObtain.setEventType(2048);
                        accessibilityEventObtain.setContentChangeTypes(i3);
                        sendAccessibilityEventUnchecked(accessibilityEventObtain);
                    }
                }
                for (int size = this.f931H0.size() - 1; size >= 0; size--) {
                    AbstractC0149b0 abstractC0149b0 = this.f931H0.get(size);
                    if (abstractC0149b0.f1003b.getParent() == this && !abstractC0149b0.m659u() && (i = abstractC0149b0.f1019r) != -1) {
                        View view = abstractC0149b0.f1003b;
                        AtomicInteger atomicInteger = ViewCompat.f38073a;
                        view.setImportantForAccessibility(i);
                        abstractC0149b0.f1019r = -1;
                    }
                }
                this.f931H0.clear();
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m594W(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f955d0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f955d0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f959h0 = x;
            this.f957f0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f960i0 = y;
            this.f958g0 = y;
        }
    }

    /* JADX INFO: renamed from: X */
    public void m595X() {
    }

    /* JADX INFO: renamed from: Y */
    public void m596Y() {
    }

    /* JADX INFO: renamed from: Z */
    public void m597Z() {
        if (this.f992z0 || !this.f922D) {
            return;
        }
        Runnable runnable = this.f933I0;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        postOnAnimation(runnable);
        this.f992z0 = true;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m598a0() {
        boolean z;
        boolean z2 = false;
        if (this.f944P) {
            AdapterHelper adapterHelper = this.f969o;
            adapterHelper.m16971l(adapterHelper.f39126b);
            adapterHelper.m16971l(adapterHelper.f39127c);
            adapterHelper.f39130f = 0;
            if (this.f945Q) {
                this.f987x.mo498q0(this);
            }
        }
        if (this.f953b0 != null && this.f987x.mo488Z0()) {
            this.f969o.m16969j();
        } else {
            this.f969o.m16962c();
        }
        boolean z3 = this.f986w0 || this.f988x0;
        C0172y c0172y = this.f980t0;
        boolean z4 = this.f928G && this.f953b0 != null && ((z = this.f944P) || z3 || this.f987x.f1042h) && (!z || this.f985w.f1024b);
        c0172y.f1103j = z4;
        if (z4 && z3 && !this.f944P) {
            if (this.f953b0 != null && this.f987x.mo488Z0()) {
                z2 = true;
            }
        }
        c0172y.f1104k = z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m == null || !abstractC0160m.m751e0()) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m599b0(boolean z) {
        this.f945Q = z | this.f945Q;
        this.f944P = true;
        int iM17008h = this.f971p.m17008h();
        for (int i = 0; i < iM17008h; i++) {
            AbstractC0149b0 abstractC0149b0M568K = m568K(this.f971p.m17007g(i));
            if (abstractC0149b0M568K != null && !abstractC0149b0M568K.m659u()) {
                abstractC0149b0M568K.m640b(6);
            }
        }
        m588Q();
        C0167t c0167t = this.f965m;
        int size = c0167t.f1070c.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0149b0 abstractC0149b0 = c0167t.f1070c.get(i2);
            if (abstractC0149b0 != null) {
                abstractC0149b0.m640b(6);
                abstractC0149b0.m639a(null);
            }
        }
        AbstractC0152e abstractC0152e = RecyclerView.this.f985w;
        if (abstractC0152e == null || !abstractC0152e.f1024b) {
            c0167t.m789e();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m600c0(AbstractC0149b0 abstractC0149b0, AbstractC0157j.c cVar) {
        abstractC0149b0.m657s(0, 8192);
        if (this.f980t0.f1101h && abstractC0149b0.m654p() && !abstractC0149b0.m651m() && !abstractC0149b0.m659u()) {
            this.f973q.f39219b.m15593m(m581I(abstractC0149b0), abstractC0149b0);
        }
        this.f973q.m17032c(abstractC0149b0, cVar);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0161n) && this.f987x.mo490g((C0161n) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m != null && abstractC0160m.mo531e()) {
            return this.f987x.mo543k(this.f980t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m != null && abstractC0160m.mo531e()) {
            return this.f987x.mo492l(this.f980t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m != null && abstractC0160m.mo531e()) {
            return this.f987x.mo493m(this.f980t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m != null && abstractC0160m.mo533f()) {
            return this.f987x.mo547n(this.f980t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m != null && abstractC0160m.mo533f()) {
            return this.f987x.mo495o(this.f980t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m != null && abstractC0160m.mo533f()) {
            return this.f987x.mo496p(this.f980t0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public void m601d0() {
        AbstractC0157j abstractC0157j = this.f953b0;
        if (abstractC0157j != null) {
            abstractC0157j.mo696k();
        }
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m != null) {
            abstractC0160m.m715F0(this.f965m);
            this.f987x.m717G0(this.f965m);
        }
        this.f965m.m786b();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m16291a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m16292b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m16293c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m16295e(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.f916A.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.f916A.get(i).mo702e(canvas, this, this.f980t0);
        }
        EdgeEffect edgeEffect = this.f949U;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f975r ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f949U;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f950V;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f975r) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f950V;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f951W;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f975r ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f951W;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f952a0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f975r) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f952a0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f953b0 == null || this.f916A.size() <= 0 || !this.f953b0.mo697l()) ? z : true) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* JADX INFO: renamed from: e0 */
    public void m602e0(AbstractC0165r abstractC0165r) {
        List<AbstractC0165r> list = this.f984v0;
        if (list != null) {
            list.remove(abstractC0165r);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m603f(AbstractC0149b0 abstractC0149b0) {
        View view = abstractC0149b0.f1003b;
        boolean z = view.getParent() == this;
        this.f965m.m795k(m582J(view));
        if (abstractC0149b0.m653o()) {
            this.f971p.m17002b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.f971p.m17001a(view, -1, true);
            return;
        }
        ChildHelper childHelper = this.f971p;
        int iIndexOfChild = ((RecyclerView2) childHelper.f39177a).f39135a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            childHelper.f39178b.m17020h(iIndexOfChild);
            childHelper.m17009i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m604f0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f979t.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0161n) {
            C0161n c0161n = (C0161n) layoutParams;
            if (!c0161n.f1060c) {
                Rect rect = c0161n.f1059b;
                Rect rect2 = this.f979t;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f979t);
            offsetRectIntoDescendantCoords(view, this.f979t);
        }
        this.f987x.mo725K0(this, view, this.f979t, !this.f928G, view2 == null);
    }

    /* JADX WARN: Code duplicated, block: B:139:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View viewMo491i0;
        int i2;
        byte b;
        boolean z;
        View viewM757o0 = this.f987x.m757o0();
        if (viewM757o0 != null) {
            return viewM757o0;
        }
        boolean z2 = false;
        boolean z3 = (this.f985w == null || this.f987x == null || m586O() || this.f934J) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i == 2 || i == 1)) {
            if (this.f987x.mo533f()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z && this.f987x.mo531e()) {
                z = focusFinder.findNextFocus(this, view, (this.f987x.m724K() == 1) ^ (i == 2) ? 66 : 17) == null;
            }
            if (z) {
                m618n();
                if (m576C(view) == null) {
                    return null;
                }
                m619n0();
                this.f987x.mo491i0(view, i, this.f965m, this.f980t0);
                m623p0(false);
            }
            viewMo491i0 = focusFinder.findNextFocus(this, view, i);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z3) {
                m618n();
                if (m576C(view) == null) {
                    return null;
                }
                m619n0();
                viewMo491i0 = this.f987x.mo491i0(view, i, this.f965m, this.f980t0);
                m623p0(false);
            } else {
                viewMo491i0 = viewFindNextFocus;
            }
        }
        if (viewMo491i0 != null && !viewMo491i0.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            m604f0(viewMo491i0, null);
            return view;
        }
        if (viewMo491i0 == null || viewMo491i0 == this || viewMo491i0 == view) {
            z2 = false;
        } else if (m576C(viewMo491i0) != null) {
            if (view != null && m576C(view) != null) {
                this.f979t.set(0, 0, view.getWidth(), view.getHeight());
                this.f981u.set(0, 0, viewMo491i0.getWidth(), viewMo491i0.getHeight());
                offsetDescendantRectToMyCoords(view, this.f979t);
                offsetDescendantRectToMyCoords(viewMo491i0, this.f981u);
                int i3 = this.f987x.m724K() == 1 ? -1 : 1;
                Rect rect = this.f979t;
                int i4 = rect.left;
                Rect rect2 = this.f981u;
                int i5 = rect2.left;
                if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                    i2 = 1;
                } else {
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
                }
                int i8 = rect.top;
                int i9 = rect2.top;
                if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                    b = 1;
                } else {
                    int i10 = rect.bottom;
                    int i11 = rect2.bottom;
                    b = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (byte) -1 : (byte) 0;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i != 130) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Invalid direction: ");
                                        sb.append(i);
                                        throw new IllegalArgumentException(outline.m1588j(this, sb));
                                    }
                                    if (b <= 0) {
                                        z2 = false;
                                    }
                                } else if (i2 <= 0) {
                                    z2 = false;
                                }
                            } else if (b >= 0) {
                                z2 = false;
                            }
                        } else if (i2 >= 0) {
                            z2 = false;
                        }
                    } else if (b <= 0 && (b != 0 || i2 * i3 <= 0)) {
                        z2 = false;
                    }
                } else if (b >= 0 && (b != 0 || i2 * i3 >= 0)) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2 ? viewMo491i0 : super.focusSearch(view, i);
    }

    /* JADX INFO: renamed from: g */
    public void m605g(AbstractC0159l abstractC0159l) {
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m != null) {
            abstractC0160m.mo529d("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f916A.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f916A.add(abstractC0159l);
        m588Q();
        requestLayout();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m606g0() {
        VelocityTracker velocityTracker = this.f956e0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m625q0(0);
        EdgeEffect edgeEffect = this.f949U;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f949U.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f950V;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f950V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f951W;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f951W.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f952a0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f952a0.isFinished();
        }
        if (zIsFinished) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m != null) {
            return abstractC0160m.mo502u();
        }
        throw new IllegalStateException(outline.m1588j(this, outline.m1556G("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m != null) {
            return abstractC0160m.mo504v(getContext(), attributeSet);
        }
        throw new IllegalStateException(outline.m1588j(this, outline.m1556G("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0152e getAdapter() {
        return this.f985w;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m == null) {
            return super.getBaseline();
        }
        Objects.requireNonNull(abstractC0160m);
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        InterfaceC0155h interfaceC0155h = this.f919B0;
        return interfaceC0155h == null ? super.getChildDrawingOrder(i, i2) : interfaceC0155h.m684a(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f975r;
    }

    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.f917A0;
    }

    public C0156i getEdgeEffectFactory() {
        return this.f948T;
    }

    public AbstractC0157j getItemAnimator() {
        return this.f953b0;
    }

    public int getItemDecorationCount() {
        return this.f916A.size();
    }

    public AbstractC0160m getLayoutManager() {
        return this.f987x;
    }

    public int getMaxFlingVelocity() {
        return this.f966m0;
    }

    public int getMinFlingVelocity() {
        return this.f964l0;
    }

    public long getNanoTime() {
        if (f913i) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0163p getOnFlingListener() {
        return this.f962k0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f972p0;
    }

    public C0166s getRecycledViewPool() {
        return this.f965m.m788d();
    }

    public int getScrollState() {
        return this.f954c0;
    }

    /* JADX INFO: renamed from: h */
    public void m607h(AbstractC0165r abstractC0165r) {
        if (this.f984v0 == null) {
            this.f984v0 = new ArrayList();
        }
        this.f984v0.add(abstractC0165r);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:39:0x0112 A[DONT_INVERT, PHI: r4
  0x0112: PHI (r4v12 boolean) = (r4v10 boolean), (r4v13 boolean) binds: [B:36:0x00f9, B:38:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0114  */
    /* JADX WARN: Code duplicated, block: B:44:0x011c  */
    /* JADX INFO: renamed from: h0 */
    public boolean m608h0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        m618n();
        if (this.f985w != null) {
            int[] iArr = this.f929G0;
            iArr[0] = 0;
            iArr[1] = 0;
            m610i0(i, i2, iArr);
            int[] iArr2 = this.f929G0;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f916A.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f929G0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        m630u(i5, i4, i6, i7, this.f925E0, i3, iArr3);
        int[] iArr4 = this.f929G0;
        int i10 = i6 - iArr4[0];
        int i11 = i7 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i12 = this.f959h0;
        int[] iArr5 = this.f925E0;
        this.f959h0 = i12 - iArr5[0];
        this.f960i0 -= iArr5[1];
        int[] iArr6 = this.f927F0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if (!((motionEvent.getSource() & 8194) == 8194)) {
                    float x = motionEvent.getX();
                    float f = i10;
                    float y = motionEvent.getY();
                    float f2 = i11;
                    if (f < 0.0f) {
                        m633x();
                        this.f949U.onPull((-f) / getWidth(), 1.0f - (y / getHeight()));
                    } else {
                        if (f > 0.0f) {
                            m634y();
                            this.f951W.onPull(f / getWidth(), y / getHeight());
                        } else {
                            z = false;
                        }
                        if (f2 < 0.0f) {
                            m635z();
                            this.f950V.onPull((-f2) / getHeight(), x / getWidth());
                        } else if (f2 > 0.0f) {
                            m632w();
                            this.f952a0.onPull(f2 / getHeight(), 1.0f - (x / getWidth()));
                        } else if (z || f != 0.0f || f2 != 0.0f) {
                            AtomicInteger atomicInteger = ViewCompat.f38073a;
                            postInvalidateOnAnimation();
                        }
                        z = true;
                        if (z) {
                            AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                            postInvalidateOnAnimation();
                        } else {
                            AtomicInteger atomicInteger3 = ViewCompat.f38073a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z = true;
                    if (f2 < 0.0f) {
                        m635z();
                        this.f950V.onPull((-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        m632w();
                        this.f952a0.onPull(f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else if (z) {
                        AtomicInteger atomicInteger4 = ViewCompat.f38073a;
                        postInvalidateOnAnimation();
                    } else {
                        AtomicInteger atomicInteger5 = ViewCompat.f38073a;
                        postInvalidateOnAnimation();
                    }
                    z = true;
                    if (z) {
                        AtomicInteger atomicInteger6 = ViewCompat.f38073a;
                        postInvalidateOnAnimation();
                    } else {
                        AtomicInteger atomicInteger7 = ViewCompat.f38073a;
                        postInvalidateOnAnimation();
                    }
                }
            }
            m616m(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            m631v(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i4 == 0) ? false : true;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m16298h(0);
    }

    /* JADX INFO: renamed from: i */
    public void m609i(String str) {
        if (m586O()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(outline.m1588j(this, outline.m1556G("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f947S > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(outline.m1588j(this, outline.m1556G(""))));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m610i0(int i, int i2, int[] iArr) {
        AbstractC0149b0 abstractC0149b0;
        m619n0();
        m592U();
        int i3 = TraceCompat.f37894a;
        Trace.beginSection("RV Scroll");
        m575B(this.f980t0);
        int iMo478M0 = i != 0 ? this.f987x.mo478M0(i, this.f965m, this.f980t0) : 0;
        int iMo481O0 = i2 != 0 ? this.f987x.mo481O0(i2, this.f965m, this.f980t0) : 0;
        Trace.endSection();
        int iM17005e = this.f971p.m17005e();
        for (int i4 = 0; i4 < iM17005e; i4++) {
            View viewM17004d = this.f971p.m17004d(i4);
            AbstractC0149b0 abstractC0149b0M582J = m582J(viewM17004d);
            if (abstractC0149b0M582J != null && (abstractC0149b0 = abstractC0149b0M582J.f1011j) != null) {
                View view = abstractC0149b0.f1003b;
                int left = viewM17004d.getLeft();
                int top = viewM17004d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m593V(true);
        m623p0(false);
        if (iArr != null) {
            iArr[0] = iMo478M0;
            iArr[1] = iMo481O0;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f922D;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f934J;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f38065d;
    }

    /* JADX INFO: renamed from: j */
    public final void m611j() {
        m606g0();
        setScrollState(0);
    }

    /* JADX INFO: renamed from: j0 */
    public void m612j0(int i) {
        if (this.f934J) {
            return;
        }
        m627r0();
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0160m.mo522N0(i);
            awakenScrollBars();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m613k0(AbstractC0149b0 abstractC0149b0, int i) {
        if (m586O()) {
            abstractC0149b0.f1019r = i;
            this.f931H0.add(abstractC0149b0);
            return false;
        }
        View view = abstractC0149b0.f1003b;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        view.setImportantForAccessibility(i);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public void m614l() {
        int iM17008h = this.f971p.m17008h();
        for (int i = 0; i < iM17008h; i++) {
            AbstractC0149b0 abstractC0149b0M568K = m568K(this.f971p.m17007g(i));
            if (!abstractC0149b0M568K.m659u()) {
                abstractC0149b0M568K.m641c();
            }
        }
        C0167t c0167t = this.f965m;
        int size = c0167t.f1070c.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0167t.f1070c.get(i2).m641c();
        }
        int size2 = c0167t.f1068a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            c0167t.f1068a.get(i3).m641c();
        }
        ArrayList<AbstractC0149b0> arrayList = c0167t.f1069b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                c0167t.f1069b.get(i4).m641c();
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m615l0(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f934J) {
            return;
        }
        if (!abstractC0160m.mo531e()) {
            i = 0;
        }
        if (!this.f987x.mo533f()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (!(i3 == Integer.MIN_VALUE || i3 > 0)) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            m621o0(i4, 1);
        }
        this.f974q0.m637b(i, i2, i3, interpolator);
    }

    /* JADX INFO: renamed from: m */
    public void m616m(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f949U;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f949U.onRelease();
            zIsFinished = this.f949U.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f951W;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f951W.onRelease();
            zIsFinished |= this.f951W.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f950V;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f950V.onRelease();
            zIsFinished |= this.f950V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f952a0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f952a0.onRelease();
            zIsFinished |= this.f952a0.isFinished();
        }
        if (zIsFinished) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m617m0(int i) {
        if (this.f934J) {
            return;
        }
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0160m.mo525X0(this, this.f980t0, i);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m618n() {
        if (!this.f928G || this.f944P) {
            int i = TraceCompat.f37894a;
            Trace.beginSection("RV FullInvalidate");
            m624q();
            Trace.endSection();
            return;
        }
        if (this.f969o.m16966g()) {
            AdapterHelper adapterHelper = this.f969o;
            int i2 = adapterHelper.f39130f;
            boolean z = false;
            if ((i2 & 4) != 0) {
                if (!((i2 & 11) != 0)) {
                    int i3 = TraceCompat.f37894a;
                    Trace.beginSection("RV PartialInvalidate");
                    m619n0();
                    m592U();
                    this.f969o.m16969j();
                    if (!this.f932I) {
                        int iM17005e = this.f971p.m17005e();
                        for (int i4 = 0; i4 < iM17005e; i4++) {
                            AbstractC0149b0 abstractC0149b0M568K = m568K(this.f971p.m17004d(i4));
                            if (abstractC0149b0M568K != null && !abstractC0149b0M568K.m659u() && abstractC0149b0M568K.m654p()) {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            m624q();
                        } else {
                            this.f969o.m16961b();
                        }
                    }
                    m623p0(true);
                    m593V(true);
                    Trace.endSection();
                    return;
                }
            }
            if (adapterHelper.m16966g()) {
                int i5 = TraceCompat.f37894a;
                Trace.beginSection("RV FullInvalidate");
                m624q();
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m619n0() {
        int i = this.f930H + 1;
        this.f930H = i;
        if (i != 1 || this.f934J) {
            return;
        }
        this.f932I = false;
    }

    /* JADX INFO: renamed from: o */
    public void m620o(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        setMeasuredDimension(AbstractC0160m.m705h(i, paddingRight, getMinimumWidth()), AbstractC0160m.m705h(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m621o0(int i, int i2) {
        return getScrollingChildHelper().m16299i(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f946R = 0;
        this.f922D = true;
        this.f928G = this.f928G && !isLayoutRequested();
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m != null) {
            abstractC0160m.f1043i = true;
            abstractC0160m.m752f0();
        }
        this.f992z0 = false;
        if (f913i) {
            ThreadLocal<GapWorker> threadLocal = GapWorker.f39305f;
            GapWorker gapWorker = threadLocal.get();
            this.f976r0 = gapWorker;
            if (gapWorker == null) {
                this.f976r0 = new GapWorker();
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                Display display = getDisplay();
                float f = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                GapWorker gapWorker2 = this.f976r0;
                gapWorker2.f39309j = (long) (1.0E9f / f);
                threadLocal.set(gapWorker2);
            }
            this.f976r0.f39307h.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        GapWorker gapWorker;
        super.onDetachedFromWindow();
        AbstractC0157j abstractC0157j = this.f953b0;
        if (abstractC0157j != null) {
            abstractC0157j.mo696k();
        }
        m627r0();
        this.f922D = false;
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m != null) {
            C0167t c0167t = this.f965m;
            abstractC0160m.f1043i = false;
            abstractC0160m.mo536h0(this, c0167t);
        }
        this.f931H0.clear();
        removeCallbacks(this.f933I0);
        Objects.requireNonNull(this.f973q);
        while (ViewInfoStore.a.f39220a.mo2057a() != null) {
        }
        if (!f913i || (gapWorker = this.f976r0) == null) {
            return;
        }
        gapWorker.f39307h.remove(this);
        this.f976r0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f916A.size();
        for (int i = 0; i < size; i++) {
            this.f916A.get(i).mo701d(canvas, this, this.f980t0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.f987x != null && !this.f934J && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.f987x.mo533f() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f987x.mo531e() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f987x.mo533f()) {
                    f = -axisValue2;
                } else if (this.f987x.mo531e()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                }
            } else {
                f = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                int i = (int) (axisValue * this.f968n0);
                int i2 = (int) (f * this.f970o0);
                AbstractC0160m abstractC0160m = this.f987x;
                if (abstractC0160m == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f934J) {
                    int[] iArr = this.f929G0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zMo531e = abstractC0160m.mo531e();
                    boolean zMo533f = this.f987x.mo533f();
                    m621o0(zMo533f ? (zMo531e ? 1 : 0) | 2 : zMo531e ? 1 : 0, 1);
                    if (m629t(zMo531e ? i : 0, zMo533f ? i2 : 0, this.f929G0, this.f925E0, 1)) {
                        int[] iArr2 = this.f929G0;
                        i -= iArr2[0];
                        i2 -= iArr2[1];
                    }
                    m608h0(zMo531e ? i : 0, zMo533f ? i2 : 0, motionEvent, 1);
                    GapWorker gapWorker = this.f976r0;
                    if (gapWorker != null && (i != 0 || i2 != 0)) {
                        gapWorker.m17049a(this, i, i2);
                    }
                    getScrollingChildHelper().m16300j(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f934J) {
            return false;
        }
        this.f920C = null;
        if (m577D(motionEvent)) {
            m611j();
            return true;
        }
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m == null) {
            return false;
        }
        boolean zMo531e = abstractC0160m.mo531e();
        boolean zMo533f = this.f987x.mo533f();
        if (this.f956e0 == null) {
            this.f956e0 = VelocityTracker.obtain();
        }
        this.f956e0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f936K) {
                this.f936K = false;
            }
            this.f955d0 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f959h0 = x;
            this.f957f0 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f960i0 = y;
            this.f958g0 = y;
            if (this.f954c0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m625q0(1);
            }
            int[] iArr = this.f927F0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zMo531e;
            if (zMo533f) {
                i = (zMo531e ? 1 : 0) | 2;
            }
            m621o0(i, 0);
        } else if (actionMasked == 1) {
            this.f956e0.clear();
            m625q0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f955d0);
            if (iFindPointerIndex < 0) {
                StringBuilder sbM1556G = outline.m1556G("Error processing scroll; pointer index for id ");
                sbM1556G.append(this.f955d0);
                sbM1556G.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", sbM1556G.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f954c0 != 1) {
                int i2 = x2 - this.f957f0;
                int i3 = y2 - this.f958g0;
                if (!zMo531e || Math.abs(i2) <= this.f961j0) {
                    z = false;
                } else {
                    this.f959h0 = x2;
                    z = true;
                }
                if (zMo533f && Math.abs(i3) > this.f961j0) {
                    this.f960i0 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m611j();
        } else if (actionMasked == 5) {
            this.f955d0 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f959h0 = x3;
            this.f957f0 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f960i0 = y3;
            this.f958g0 = y3;
        } else if (actionMasked == 6) {
            m594W(motionEvent);
        }
        return this.f954c0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = TraceCompat.f37894a;
        Trace.beginSection("RV OnLayout");
        m624q();
        Trace.endSection();
        this.f928G = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m == null) {
            m620o(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC0160m.mo524W()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f987x.m763x0(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f935J0 = z;
            if (z || this.f985w == null) {
                return;
            }
            if (this.f980t0.f1097d == 1) {
                m626r();
            }
            this.f987x.m734Q0(i, i2);
            this.f980t0.f1102i = true;
            m628s();
            this.f987x.m736S0(i, i2);
            if (this.f987x.mo523V0()) {
                this.f987x.m734Q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f980t0.f1102i = true;
                m628s();
                this.f987x.m736S0(i, i2);
            }
            this.f937K0 = getMeasuredWidth();
            this.f939L0 = getMeasuredHeight();
            return;
        }
        if (this.f924E) {
            this.f987x.m763x0(i, i2);
            return;
        }
        if (this.f940M) {
            m619n0();
            m592U();
            m598a0();
            m593V(true);
            C0172y c0172y = this.f980t0;
            if (c0172y.f1104k) {
                c0172y.f1100g = true;
            } else {
                this.f969o.m16962c();
                this.f980t0.f1100g = false;
            }
            this.f940M = false;
            m623p0(false);
        } else if (this.f980t0.f1104k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0152e abstractC0152e = this.f985w;
        if (abstractC0152e != null) {
            this.f980t0.f1098e = abstractC0152e.mo662d();
        } else {
            this.f980t0.f1098e = 0;
        }
        m619n0();
        this.f987x.m763x0(i, i2);
        m623p0(false);
        this.f980t0.f1100g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m586O()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0170w)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0170w c0170w = (C0170w) parcelable;
        this.f967n = c0170w;
        super.onRestoreInstanceState(c0170w.f38150g);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0170w c0170w = new C0170w(super.onSaveInstanceState());
        C0170w c0170w2 = this.f967n;
        if (c0170w2 != null) {
            c0170w.f1078h = c0170w2.f1078h;
        } else {
            AbstractC0160m abstractC0160m = this.f987x;
            if (abstractC0160m != null) {
                c0170w.f1078h = abstractC0160m.mo515B0();
            } else {
                c0170w.f1078h = null;
            }
        }
        return c0170w;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        m585N();
    }

    /* JADX WARN: Code duplicated, block: B:143:0x026d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f7 A[PHI: r0
  0x00f7: PHI (r0v51 int) = (r0v39 int), (r0v55 int) binds: [B:50:0x00e0, B:54:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM577D;
        int i;
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.f934J || this.f936K) {
            return false;
        }
        InterfaceC0164q interfaceC0164q = this.f920C;
        if (interfaceC0164q == null) {
            zM577D = motionEvent.getAction() == 0 ? false : m577D(motionEvent);
        } else {
            interfaceC0164q.mo778a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f920C = null;
            }
            zM577D = true;
        }
        if (zM577D) {
            m611j();
            return true;
        }
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m == null) {
            return false;
        }
        boolean zMo531e = abstractC0160m.mo531e();
        boolean zMo533f = this.f987x.mo533f();
        if (this.f956e0 == null) {
            this.f956e0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f927F0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f927F0;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.f955d0 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f959h0 = x;
            this.f957f0 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f960i0 = y;
            this.f958g0 = y;
            if (zMo533f) {
                i = zMo531e;
                i = (zMo531e ? 1 : 0) | 2;
            }
            i = zMo531e;
            m621o0(i, 0);
        } else if (actionMasked == 1) {
            this.f956e0.addMovement(motionEventObtain);
            this.f956e0.computeCurrentVelocity(CloseCodes.NORMAL_CLOSURE, this.f966m0);
            float f = zMo531e ? -this.f956e0.getXVelocity(this.f955d0) : 0.0f;
            float f2 = zMo533f ? -this.f956e0.getYVelocity(this.f955d0) : 0.0f;
            if (f == 0.0f && f2 == 0.0f) {
                setScrollState(0);
            } else {
                int i2 = (int) f;
                int i3 = (int) f2;
                AbstractC0160m abstractC0160m2 = this.f987x;
                if (abstractC0160m2 == null) {
                    Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else {
                    if (!this.f934J) {
                        int iMo531e = abstractC0160m2.mo531e();
                        boolean zMo533f2 = this.f987x.mo533f();
                        if (iMo531e == 0 || Math.abs(i2) < this.f964l0) {
                            i2 = 0;
                        }
                        if (!zMo533f2 || Math.abs(i3) < this.f964l0) {
                            i3 = 0;
                        }
                        if (i2 != 0 || i3 != 0) {
                            float f3 = i2;
                            float f4 = i3;
                            if (!dispatchNestedPreFling(f3, f4)) {
                                boolean z4 = iMo531e != 0 || zMo533f2;
                                dispatchNestedFling(f3, f4, z4);
                                AbstractC0163p abstractC0163p = this.f962k0;
                                if (abstractC0163p == null || !abstractC0163p.mo777a(i2, i3)) {
                                    if (z4) {
                                        if (zMo533f2) {
                                            iMo531e = (iMo531e == true ? 1 : 0) | 2;
                                        }
                                        m621o0(iMo531e, 1);
                                        int i4 = this.f966m0;
                                        int iMax = Math.max(-i4, Math.min(i2, i4));
                                        int i5 = this.f966m0;
                                        int iMax2 = Math.max(-i5, Math.min(i3, i5));
                                        RunnableC0147a0 runnableC0147a0 = this.f974q0;
                                        RecyclerView.this.setScrollState(2);
                                        runnableC0147a0.f995g = 0;
                                        runnableC0147a0.f994f = 0;
                                        Interpolator interpolator = runnableC0147a0.f997i;
                                        Interpolator interpolator2 = f915k;
                                        if (interpolator != interpolator2) {
                                            runnableC0147a0.f997i = interpolator2;
                                            runnableC0147a0.f996h = new OverScroller(RecyclerView.this.getContext(), interpolator2);
                                        }
                                        runnableC0147a0.f996h.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        runnableC0147a0.m636a();
                                    }
                                }
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        setScrollState(0);
                    }
                }
                z = false;
                if (!z) {
                    setScrollState(0);
                }
            }
            m606g0();
            z3 = true;
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f955d0);
            if (iFindPointerIndex < 0) {
                StringBuilder sbM1556G = outline.m1556G("Error processing scroll; pointer index for id ");
                sbM1556G.append(this.f955d0);
                sbM1556G.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", sbM1556G.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            int iMax3 = this.f959h0 - x2;
            int iMax4 = this.f960i0 - y2;
            if (this.f954c0 != 1) {
                if (zMo531e) {
                    iMax3 = iMax3 > 0 ? Math.max(0, iMax3 - this.f961j0) : Math.min(0, iMax3 + this.f961j0);
                    if (iMax3 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (zMo533f) {
                    iMax4 = iMax4 > 0 ? Math.max(0, iMax4 - this.f961j0) : Math.min(0, iMax4 + this.f961j0);
                    if (iMax4 != 0) {
                        z2 = true;
                    }
                }
                if (z2) {
                    setScrollState(1);
                }
            }
            int i6 = iMax3;
            int i7 = iMax4;
            if (this.f954c0 == 1) {
                int[] iArr3 = this.f929G0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                if (m629t(zMo531e ? i6 : 0, zMo533f ? i7 : 0, iArr3, this.f925E0, 0)) {
                    int[] iArr4 = this.f929G0;
                    i6 -= iArr4[0];
                    i7 -= iArr4[1];
                    int[] iArr5 = this.f927F0;
                    int i8 = iArr5[0];
                    int[] iArr6 = this.f925E0;
                    iArr5[0] = i8 + iArr6[0];
                    iArr5[1] = iArr5[1] + iArr6[1];
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i9 = i7;
                int[] iArr7 = this.f925E0;
                this.f959h0 = x2 - iArr7[0];
                this.f960i0 = y2 - iArr7[1];
                if (m608h0(zMo531e ? i6 : 0, zMo533f ? i9 : 0, motionEvent, 0)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                GapWorker gapWorker = this.f976r0;
                if (gapWorker != null && (i6 != 0 || i9 != 0)) {
                    gapWorker.m17049a(this, i6, i9);
                }
            }
        } else if (actionMasked == 3) {
            m611j();
        } else if (actionMasked == 5) {
            this.f955d0 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f959h0 = x3;
            this.f957f0 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f960i0 = y3;
            this.f958g0 = y3;
        } else if (actionMasked == 6) {
            m594W(motionEvent);
        }
        if (!z3) {
            this.f956e0.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m622p(View view) {
        AbstractC0149b0 abstractC0149b0M568K = m568K(view);
        m591T();
        AbstractC0152e abstractC0152e = this.f985w;
        if (abstractC0152e != null && abstractC0149b0M568K != null) {
            Objects.requireNonNull(abstractC0152e);
        }
        List<InterfaceC0162o> list = this.f943O;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f943O.get(size).mo775a(view);
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m623p0(boolean z) {
        if (this.f930H < 1) {
            this.f930H = 1;
        }
        if (!z && !this.f934J) {
            this.f932I = false;
        }
        if (this.f930H == 1) {
            if (z && this.f932I && !this.f934J && this.f987x != null && this.f985w != null) {
                m624q();
            }
            if (!this.f934J) {
                this.f932I = false;
            }
        }
        this.f930H--;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0353  */
    /* JADX WARN: Code duplicated, block: B:168:0x0397  */
    /* JADX WARN: Code duplicated, block: B:176:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:178:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:180:0x03be  */
    /* JADX WARN: Code duplicated, block: B:183:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:186:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:190:0x03d9 A[LOOP:3: B:182:0x03c4->B:190:0x03d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:196:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:199:0x03f5 A[LOOP:4: B:192:0x03e1->B:199:0x03f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:236:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x03d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x03f8 A[EDGE_INSN: B:240:0x03f8->B:200:0x03f8 BREAK  A[LOOP:4: B:192:0x03e1->B:199:0x03f5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x03f2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public void m624q() {
        long j2;
        AbstractC0149b0 abstractC0149b0M568K;
        int i;
        int iM809b;
        int i2;
        int iMin;
        AbstractC0149b0 abstractC0149b0M579G;
        View view;
        AbstractC0149b0 abstractC0149b0M579G2;
        int i3;
        View viewFindViewById;
        boolean z;
        AbstractC0149b0 abstractC0149b0;
        if (this.f985w == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f987x == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f980t0.f1102i = false;
        boolean z2 = true;
        boolean z3 = this.f935J0 && !(this.f937K0 == getWidth() && this.f939L0 == getHeight());
        this.f937K0 = 0;
        this.f939L0 = 0;
        this.f935J0 = false;
        if (this.f980t0.f1097d == 1) {
            m626r();
            this.f987x.m732P0(this);
            m628s();
        } else {
            AdapterHelper adapterHelper = this.f969o;
            if (((adapterHelper.f39127c.isEmpty() || adapterHelper.f39126b.isEmpty()) ? false : true) || z3 || this.f987x.f1050p != getWidth() || this.f987x.f1051q != getHeight()) {
                this.f987x.m732P0(this);
                m628s();
            } else {
                this.f987x.m732P0(this);
            }
        }
        int i4 = 4;
        this.f980t0.m808a(4);
        m619n0();
        m592U();
        C0172y c0172y = this.f980t0;
        c0172y.f1097d = 1;
        View view2 = null;
        if (c0172y.f1103j) {
            int iM17005e = this.f971p.m17005e() - 1;
            while (iM17005e >= 0) {
                AbstractC0149b0 abstractC0149b0M568K2 = m568K(this.f971p.m17004d(iM17005e));
                if (!abstractC0149b0M568K2.m659u()) {
                    long jM581I = m581I(abstractC0149b0M568K2);
                    Objects.requireNonNull(this.f953b0);
                    AbstractC0157j.c cVar = new AbstractC0157j.c();
                    View view3 = abstractC0149b0M568K2.f1003b;
                    cVar.f1032a = view3.getLeft();
                    cVar.f1033b = view3.getTop();
                    view3.getRight();
                    view3.getBottom();
                    AbstractC0149b0 abstractC0149b0M15590j = this.f973q.f39219b.m15590j(jM581I, null);
                    if (abstractC0149b0M15590j == null || abstractC0149b0M15590j.m659u()) {
                        this.f973q.m17031b(abstractC0149b0M568K2, cVar);
                    } else {
                        boolean zM17033d = this.f973q.m17033d(abstractC0149b0M15590j);
                        boolean zM17033d2 = this.f973q.m17033d(abstractC0149b0M568K2);
                        if (zM17033d && abstractC0149b0M15590j == abstractC0149b0M568K2) {
                            this.f973q.m17031b(abstractC0149b0M568K2, cVar);
                        } else {
                            AbstractC0157j.c cVarM17034e = this.f973q.m17034e(abstractC0149b0M15590j, i4);
                            this.f973q.m17031b(abstractC0149b0M568K2, cVar);
                            AbstractC0157j.c cVarM17034e2 = this.f973q.m17034e(abstractC0149b0M568K2, 8);
                            if (cVarM17034e == null) {
                                int iM17005e2 = this.f971p.m17005e();
                                for (int i5 = 0; i5 < iM17005e2; i5++) {
                                    AbstractC0149b0 abstractC0149b0M568K3 = m568K(this.f971p.m17004d(i5));
                                    if (abstractC0149b0M568K3 != abstractC0149b0M568K2 && m581I(abstractC0149b0M568K3) == jM581I) {
                                        AbstractC0152e abstractC0152e = this.f985w;
                                        if (abstractC0152e == null || !abstractC0152e.f1024b) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(abstractC0149b0M568K3);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(abstractC0149b0M568K2);
                                            throw new IllegalStateException(outline.m1588j(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(abstractC0149b0M568K3);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(abstractC0149b0M568K2);
                                        throw new IllegalStateException(outline.m1588j(this, sb2));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0149b0M15590j + " cannot be found but it is necessary for " + abstractC0149b0M568K2 + m574A());
                            } else {
                                abstractC0149b0M15590j.m658t(false);
                                if (zM17033d) {
                                    m603f(abstractC0149b0M15590j);
                                }
                                if (abstractC0149b0M15590j != abstractC0149b0M568K2) {
                                    if (zM17033d2) {
                                        m603f(abstractC0149b0M568K2);
                                    }
                                    abstractC0149b0M15590j.f1010i = abstractC0149b0M568K2;
                                    m603f(abstractC0149b0M15590j);
                                    this.f965m.m795k(abstractC0149b0M15590j);
                                    abstractC0149b0M568K2.m658t(false);
                                    abstractC0149b0M568K2.f1011j = abstractC0149b0M15590j;
                                }
                                if (this.f953b0.mo688b(abstractC0149b0M15590j, abstractC0149b0M568K2, cVarM17034e, cVarM17034e2)) {
                                    m597Z();
                                }
                            }
                        }
                    }
                }
                iM17005e--;
                i4 = 4;
            }
            ViewInfoStore viewInfoStore = this.f973q;
            ViewInfoStore.b bVar = this.f941M0;
            for (int i6 = viewInfoStore.f39218a.f36667l - 1; i6 >= 0; i6--) {
                AbstractC0149b0 abstractC0149b0M15611h = viewInfoStore.f39218a.m15611h(i6);
                ViewInfoStore.a aVarMo2036j = viewInfoStore.f39218a.mo2036j(i6);
                int i7 = aVarMo2036j.f39221b;
                if ((i7 & 3) == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.f987x.m719H0(abstractC0149b0M15611h.f1003b, recyclerView.f965m);
                } else if ((i7 & 1) != 0) {
                    AbstractC0157j.c cVar2 = aVarMo2036j.f39222c;
                    if (cVar2 == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.f987x.m719H0(abstractC0149b0M15611h.f1003b, recyclerView2.f965m);
                    } else {
                        ((C0151d) bVar).m661a(abstractC0149b0M15611h, cVar2, aVarMo2036j.f39223d);
                    }
                } else if ((i7 & 14) == 14) {
                    AbstractC0157j.c cVar3 = aVarMo2036j.f39222c;
                    AbstractC0157j.c cVar4 = aVarMo2036j.f39223d;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    Objects.requireNonNull(recyclerView3);
                    abstractC0149b0M15611h.m658t(false);
                    if (recyclerView3.f953b0.mo687a(abstractC0149b0M15611h, cVar3, cVar4)) {
                        recyclerView3.m597Z();
                    }
                } else if ((i7 & 12) == 12) {
                    AbstractC0157j.c cVar5 = aVarMo2036j.f39222c;
                    AbstractC0157j.c cVar6 = aVarMo2036j.f39223d;
                    C0151d c0151d = (C0151d) bVar;
                    Objects.requireNonNull(c0151d);
                    abstractC0149b0M15611h.m658t(false);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    if (recyclerView4.f944P) {
                        if (recyclerView4.f953b0.mo688b(abstractC0149b0M15611h, abstractC0149b0M15611h, cVar5, cVar6)) {
                            RecyclerView.this.m597Z();
                        }
                    } else if (recyclerView4.f953b0.mo690d(abstractC0149b0M15611h, cVar5, cVar6)) {
                        RecyclerView.this.m597Z();
                    }
                } else if ((i7 & 4) != 0) {
                    ((C0151d) bVar).m661a(abstractC0149b0M15611h, aVarMo2036j.f39222c, null);
                } else if ((i7 & 8) != 0) {
                    AbstractC0157j.c cVar7 = aVarMo2036j.f39222c;
                    AbstractC0157j.c cVar8 = aVarMo2036j.f39223d;
                    RecyclerView recyclerView5 = RecyclerView.this;
                    Objects.requireNonNull(recyclerView5);
                    abstractC0149b0M15611h.m658t(false);
                    if (recyclerView5.f953b0.mo687a(abstractC0149b0M15611h, cVar7, cVar8)) {
                        recyclerView5.m597Z();
                    }
                }
                ViewInfoStore.a.m17038b(aVarMo2036j);
            }
        }
        this.f987x.m717G0(this.f965m);
        C0172y c0172y2 = this.f980t0;
        c0172y2.f1095b = c0172y2.f1098e;
        this.f944P = false;
        this.f945Q = false;
        c0172y2.f1103j = false;
        c0172y2.f1104k = false;
        this.f987x.f1042h = false;
        ArrayList<AbstractC0149b0> arrayList = this.f965m.f1069b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m.f1047m) {
            abstractC0160m.f1046l = 0;
            abstractC0160m.f1047m = false;
            this.f965m.m796l();
        }
        this.f987x.mo507w0(this.f980t0);
        m593V(true);
        m623p0(false);
        ViewInfoStore viewInfoStore2 = this.f973q;
        viewInfoStore2.f39218a.clear();
        viewInfoStore2.f39219b.m15585b();
        int[] iArr = this.f921C0;
        int i8 = iArr[0];
        int i9 = iArr[1];
        m578E(iArr);
        int[] iArr2 = this.f921C0;
        if (iArr2[0] == i8 && iArr2[1] == i9) {
            z2 = false;
        }
        if (z2) {
            m631v(0, 0);
        }
        if (this.f972p0 && this.f985w != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j2 = this.f980t0.f1106m;
                if (j2 == -1) {
                    abstractC0149b0M568K = null;
                } else {
                    abstractC0149b0M568K = null;
                }
                if (abstractC0149b0M568K != null) {
                    if (this.f971p.m17005e() > 0) {
                        C0172y c0172y3 = this.f980t0;
                        int i10 = c0172y3.f1105l;
                        if (i10 != -1) {
                        }
                        iM809b = c0172y3.m809b();
                        i2 = i;
                        while (true) {
                            if (i2 < iM809b) {
                                abstractC0149b0M579G2 = m579G(i2);
                                if (abstractC0149b0M579G2 != null) {
                                    if (abstractC0149b0M579G2.f1003b.hasFocusable()) {
                                        view = abstractC0149b0M579G2.f1003b;
                                    } else {
                                        i2++;
                                    }
                                }
                                view2 = view;
                                break;
                            }
                            for (iMin = Math.min(iM809b, i) - 1; iMin >= 0; iMin--) {
                                abstractC0149b0M579G = m579G(iMin);
                                if (abstractC0149b0M579G == null) {
                                    break;
                                    break;
                                } else {
                                    if (abstractC0149b0M579G.f1003b.hasFocusable()) {
                                        view = abstractC0149b0M579G.f1003b;
                                        view2 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (this.f971p.m17005e() > 0) {
                    C0172y c0172y4 = this.f980t0;
                    int i11 = c0172y4.f1105l;
                    if (i11 != -1) {
                    }
                    iM809b = c0172y4.m809b();
                    i2 = i;
                    while (true) {
                        if (i2 < iM809b) {
                            abstractC0149b0M579G2 = m579G(i2);
                            if (abstractC0149b0M579G2 != null) {
                                if (abstractC0149b0M579G2.f1003b.hasFocusable()) {
                                    view = abstractC0149b0M579G2.f1003b;
                                } else {
                                    i2++;
                                }
                            }
                            view2 = view;
                            break;
                        }
                        while (iMin >= 0) {
                            abstractC0149b0M579G = m579G(iMin);
                            if (abstractC0149b0M579G == null) {
                                break;
                                break;
                            } else {
                                if (abstractC0149b0M579G.f1003b.hasFocusable()) {
                                    view = abstractC0149b0M579G.f1003b;
                                    view2 = view;
                                    break;
                                }
                            }
                        }
                    }
                }
                if (view2 != null) {
                    i3 = this.f980t0.f1107n;
                    if (i3 != -1) {
                        view2 = viewFindViewById;
                    }
                    view2.requestFocus();
                }
            } else if (this.f971p.m17011k(getFocusedChild())) {
                j2 = this.f980t0.f1106m;
                if (j2 == -1 && (z = this.f985w.f1024b)) {
                    if (z) {
                        int iM17008h = this.f971p.m17008h();
                        int i12 = 0;
                        abstractC0149b0 = null;
                        while (true) {
                            if (i12 < iM17008h) {
                                abstractC0149b0M568K = m568K(this.f971p.m17007g(i12));
                                if (abstractC0149b0M568K != null && !abstractC0149b0M568K.m651m() && abstractC0149b0M568K.f1007f == j2) {
                                    if (!this.f971p.m17011k(abstractC0149b0M568K.f1003b)) {
                                        break;
                                    } else {
                                        abstractC0149b0 = abstractC0149b0M568K;
                                    }
                                }
                                i12++;
                            }
                        }
                    } else {
                        abstractC0149b0 = null;
                    }
                    abstractC0149b0M568K = abstractC0149b0;
                    break;
                } else {
                    abstractC0149b0M568K = null;
                }
                if (abstractC0149b0M568K != null && !this.f971p.m17011k(abstractC0149b0M568K.f1003b) && abstractC0149b0M568K.f1003b.hasFocusable()) {
                    view2 = abstractC0149b0M568K.f1003b;
                } else if (this.f971p.m17005e() > 0) {
                    C0172y c0172y5 = this.f980t0;
                    int i13 = c0172y5.f1105l;
                    i = i13 != -1 ? i13 : 0;
                    iM809b = c0172y5.m809b();
                    i2 = i;
                    while (true) {
                        if (i2 < iM809b) {
                            abstractC0149b0M579G2 = m579G(i2);
                            if (abstractC0149b0M579G2 != null) {
                                if (abstractC0149b0M579G2.f1003b.hasFocusable()) {
                                    view = abstractC0149b0M579G2.f1003b;
                                } else {
                                    i2++;
                                }
                            }
                            view2 = view;
                            break;
                        }
                        while (iMin >= 0) {
                            abstractC0149b0M579G = m579G(iMin);
                            if (abstractC0149b0M579G == null) {
                                break;
                            }
                            if (abstractC0149b0M579G.f1003b.hasFocusable()) {
                                view = abstractC0149b0M579G.f1003b;
                                view2 = view;
                                break;
                            }
                        }
                    }
                }
                if (view2 != null) {
                    i3 = this.f980t0.f1107n;
                    if (i3 != -1 && (viewFindViewById = view2.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view2 = viewFindViewById;
                    }
                    view2.requestFocus();
                }
            }
        }
        C0172y c0172y6 = this.f980t0;
        c0172y6.f1106m = -1L;
        c0172y6.f1105l = -1;
        c0172y6.f1107n = -1;
    }

    /* JADX INFO: renamed from: q0 */
    public void m625q0(int i) {
        getScrollingChildHelper().m16300j(i);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX INFO: renamed from: r */
    public final void m626r() {
        int iM580H;
        View viewM576C;
        this.f980t0.m808a(1);
        m575B(this.f980t0);
        this.f980t0.f1102i = false;
        m619n0();
        ViewInfoStore viewInfoStore = this.f973q;
        viewInfoStore.f39218a.clear();
        viewInfoStore.f39219b.m15585b();
        m592U();
        m598a0();
        View focusedChild = (this.f972p0 && hasFocus() && this.f985w != null) ? getFocusedChild() : null;
        AbstractC0149b0 abstractC0149b0M582J = (focusedChild == null || (viewM576C = m576C(focusedChild)) == null) ? null : m582J(viewM576C);
        if (abstractC0149b0M582J == null) {
            C0172y c0172y = this.f980t0;
            c0172y.f1106m = -1L;
            c0172y.f1105l = -1;
            c0172y.f1107n = -1;
        } else {
            C0172y c0172y2 = this.f980t0;
            c0172y2.f1106m = this.f985w.f1024b ? abstractC0149b0M582J.f1007f : -1L;
            if (this.f944P) {
                iM580H = -1;
            } else if (abstractC0149b0M582J.m651m()) {
                iM580H = abstractC0149b0M582J.f1006e;
            } else {
                RecyclerView recyclerView = abstractC0149b0M582J.f1020s;
                if (recyclerView == null) {
                    iM580H = -1;
                } else {
                    iM580H = recyclerView.m580H(abstractC0149b0M582J);
                }
            }
            c0172y2.f1105l = iM580H;
            C0172y c0172y3 = this.f980t0;
            View focusedChild2 = abstractC0149b0M582J.f1003b;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            c0172y3.f1107n = id;
        }
        C0172y c0172y4 = this.f980t0;
        c0172y4.f1101h = c0172y4.f1103j && this.f988x0;
        this.f988x0 = false;
        this.f986w0 = false;
        c0172y4.f1100g = c0172y4.f1104k;
        c0172y4.f1098e = this.f985w.mo662d();
        m578E(this.f921C0);
        if (this.f980t0.f1103j) {
            int iM17005e = this.f971p.m17005e();
            for (int i = 0; i < iM17005e; i++) {
                AbstractC0149b0 abstractC0149b0M568K = m568K(this.f971p.m17004d(i));
                if (!abstractC0149b0M568K.m659u() && (!abstractC0149b0M568K.m649k() || this.f985w.f1024b)) {
                    AbstractC0157j abstractC0157j = this.f953b0;
                    AbstractC0157j.m686e(abstractC0149b0M568K);
                    abstractC0149b0M568K.m645g();
                    this.f973q.m17032c(abstractC0149b0M568K, abstractC0157j.m698m(abstractC0149b0M568K));
                    if (this.f980t0.f1101h && abstractC0149b0M568K.m654p() && !abstractC0149b0M568K.m651m() && !abstractC0149b0M568K.m659u() && !abstractC0149b0M568K.m649k()) {
                        this.f973q.f39219b.m15593m(m581I(abstractC0149b0M568K), abstractC0149b0M568K);
                    }
                }
            }
        }
        if (this.f980t0.f1104k) {
            int iM17008h = this.f971p.m17008h();
            for (int i2 = 0; i2 < iM17008h; i2++) {
                AbstractC0149b0 abstractC0149b0M568K2 = m568K(this.f971p.m17007g(i2));
                if (!abstractC0149b0M568K2.m659u() && abstractC0149b0M568K2.f1006e == -1) {
                    abstractC0149b0M568K2.f1006e = abstractC0149b0M568K2.f1005d;
                }
            }
            C0172y c0172y5 = this.f980t0;
            boolean z = c0172y5.f1099f;
            c0172y5.f1099f = false;
            this.f987x.mo505v0(this.f965m, c0172y5);
            this.f980t0.f1099f = z;
            for (int i3 = 0; i3 < this.f971p.m17005e(); i3++) {
                AbstractC0149b0 abstractC0149b0M568K3 = m568K(this.f971p.m17004d(i3));
                if (!abstractC0149b0M568K3.m659u()) {
                    ViewInfoStore.a orDefault = this.f973q.f39218a.getOrDefault(abstractC0149b0M568K3, null);
                    if (!((orDefault == null || (orDefault.f39221b & 4) == 0) ? false : true)) {
                        AbstractC0157j.m686e(abstractC0149b0M568K3);
                        boolean zM646h = abstractC0149b0M568K3.m646h(8192);
                        AbstractC0157j abstractC0157j2 = this.f953b0;
                        abstractC0149b0M568K3.m645g();
                        AbstractC0157j.c cVarM698m = abstractC0157j2.m698m(abstractC0149b0M568K3);
                        if (zM646h) {
                            m600c0(abstractC0149b0M568K3, cVarM698m);
                        } else {
                            ViewInfoStore viewInfoStore2 = this.f973q;
                            ViewInfoStore.a orDefault2 = viewInfoStore2.f39218a.getOrDefault(abstractC0149b0M568K3, null);
                            if (orDefault2 == null) {
                                orDefault2 = ViewInfoStore.a.m17037a();
                                viewInfoStore2.f39218a.put(abstractC0149b0M568K3, orDefault2);
                            }
                            orDefault2.f39221b |= 2;
                            orDefault2.f39222c = cVarM698m;
                        }
                    }
                }
            }
            m614l();
        } else {
            m614l();
        }
        m593V(true);
        m623p0(false);
        this.f980t0.f1097d = 2;
    }

    /* JADX INFO: renamed from: r0 */
    public void m627r0() {
        AbstractC0171x abstractC0171x;
        setScrollState(0);
        this.f974q0.m638c();
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m == null || (abstractC0171x = abstractC0160m.f1041g) == null) {
            return;
        }
        abstractC0171x.m805g();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        AbstractC0149b0 abstractC0149b0M568K = m568K(view);
        if (abstractC0149b0M568K != null) {
            if (abstractC0149b0M568K.m653o()) {
                abstractC0149b0M568K.f1012k &= -257;
            } else if (!abstractC0149b0M568K.m659u()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(abstractC0149b0M568K);
                throw new IllegalArgumentException(outline.m1588j(this, sb));
            }
        }
        view.clearAnimation();
        m622p(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f987x.m766z0(this, view, view2) && view2 != null) {
            m604f0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f987x.mo725K0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f918B.size();
        for (int i = 0; i < size; i++) {
            this.f918B.get(i).mo780c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f930H != 0 || this.f934J) {
            this.f932I = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m628s() {
        m619n0();
        m592U();
        this.f980t0.m808a(6);
        this.f969o.m16962c();
        this.f980t0.f1098e = this.f985w.mo662d();
        this.f980t0.f1096c = 0;
        if (this.f967n != null) {
            AbstractC0152e abstractC0152e = this.f985w;
            int iM15315d = C7804v0.m15315d(abstractC0152e.f1025c);
            if (iM15315d == 1 ? abstractC0152e.mo662d() > 0 : iM15315d != 2) {
                Parcelable parcelable = this.f967n.f1078h;
                if (parcelable != null) {
                    this.f987x.mo513A0(parcelable);
                }
                this.f967n = null;
            }
        }
        C0172y c0172y = this.f980t0;
        c0172y.f1100g = false;
        this.f987x.mo505v0(this.f965m, c0172y);
        C0172y c0172y2 = this.f980t0;
        c0172y2.f1099f = false;
        c0172y2.f1103j = c0172y2.f1103j && this.f953b0 != null;
        c0172y2.f1097d = 4;
        m593V(true);
        m623p0(false);
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f934J) {
            return;
        }
        boolean zMo531e = abstractC0160m.mo531e();
        boolean zMo533f = this.f987x.mo533f();
        if (zMo531e || zMo533f) {
            if (!zMo531e) {
                i = 0;
            }
            if (!zMo533f) {
                i2 = 0;
            }
            m608h0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (m586O()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f938L |= contentChangeTypes != 0 ? contentChangeTypes : 0;
            i = 1;
        }
        if (i != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.f917A0 = recyclerViewAccessibilityDelegate;
        ViewCompat.m16327u(this, recyclerViewAccessibilityDelegate);
    }

    public void setAdapter(AbstractC0152e abstractC0152e) {
        setLayoutFrozen(false);
        AbstractC0152e abstractC0152e2 = this.f985w;
        if (abstractC0152e2 != null) {
            abstractC0152e2.f1023a.unregisterObserver(this.f963l);
            this.f985w.mo668j(this);
        }
        m601d0();
        AdapterHelper adapterHelper = this.f969o;
        adapterHelper.m16971l(adapterHelper.f39126b);
        adapterHelper.m16971l(adapterHelper.f39127c);
        adapterHelper.f39130f = 0;
        AbstractC0152e abstractC0152e3 = this.f985w;
        this.f985w = abstractC0152e;
        if (abstractC0152e != null) {
            abstractC0152e.f1023a.registerObserver(this.f963l);
            abstractC0152e.mo665g(this);
        }
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m != null) {
            abstractC0160m.mo750d0(abstractC0152e3, this.f985w);
        }
        C0167t c0167t = this.f965m;
        AbstractC0152e abstractC0152e4 = this.f985w;
        c0167t.m786b();
        C0166s c0166sM788d = c0167t.m788d();
        Objects.requireNonNull(c0166sM788d);
        if (abstractC0152e3 != null) {
            c0166sM788d.f1063b--;
        }
        if (c0166sM788d.f1063b == 0) {
            for (int i = 0; i < c0166sM788d.f1062a.size(); i++) {
                c0166sM788d.f1062a.valueAt(i).f1064a.clear();
            }
        }
        if (abstractC0152e4 != null) {
            c0166sM788d.f1063b++;
        }
        this.f980t0.f1099f = true;
        m599b0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0155h interfaceC0155h) {
        if (interfaceC0155h == this.f919B0) {
            return;
        }
        this.f919B0 = interfaceC0155h;
        setChildrenDrawingOrderEnabled(interfaceC0155h != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f975r) {
            m585N();
        }
        this.f975r = z;
        super.setClipToPadding(z);
        if (this.f928G) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0156i c0156i) {
        Objects.requireNonNull(c0156i);
        this.f948T = c0156i;
        m585N();
    }

    public void setHasFixedSize(boolean z) {
        this.f924E = z;
    }

    public void setItemAnimator(AbstractC0157j abstractC0157j) {
        AbstractC0157j abstractC0157j2 = this.f953b0;
        if (abstractC0157j2 != null) {
            abstractC0157j2.mo696k();
            this.f953b0.f1026a = null;
        }
        this.f953b0 = abstractC0157j;
        if (abstractC0157j != null) {
            abstractC0157j.f1026a = this.f990y0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C0167t c0167t = this.f965m;
        c0167t.f1072e = i;
        c0167t.m796l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC0160m abstractC0160m) {
        if (abstractC0160m == this.f987x) {
            return;
        }
        m627r0();
        if (this.f987x != null) {
            AbstractC0157j abstractC0157j = this.f953b0;
            if (abstractC0157j != null) {
                abstractC0157j.mo696k();
            }
            this.f987x.m715F0(this.f965m);
            this.f987x.m717G0(this.f965m);
            this.f965m.m786b();
            if (this.f922D) {
                AbstractC0160m abstractC0160m2 = this.f987x;
                C0167t c0167t = this.f965m;
                abstractC0160m2.f1043i = false;
                abstractC0160m2.mo536h0(this, c0167t);
            }
            this.f987x.m737T0(null);
            this.f987x = null;
        } else {
            this.f965m.m786b();
        }
        ChildHelper childHelper = this.f971p;
        ChildHelper.a aVar = childHelper.f39178b;
        aVar.f39180a = 0L;
        ChildHelper.a aVar2 = aVar.f39181b;
        if (aVar2 != null) {
            aVar2.m17019g();
        }
        int size = childHelper.f39179c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ChildHelper.b bVar = childHelper.f39177a;
            View view = childHelper.f39179c.get(size);
            RecyclerView2 recyclerView2 = (RecyclerView2) bVar;
            Objects.requireNonNull(recyclerView2);
            AbstractC0149b0 abstractC0149b0M568K = m568K(view);
            if (abstractC0149b0M568K != null) {
                recyclerView2.f39135a.m613k0(abstractC0149b0M568K, abstractC0149b0M568K.f1018q);
                abstractC0149b0M568K.f1018q = 0;
            }
            childHelper.f39179c.remove(size);
        }
        RecyclerView2 recyclerView3 = (RecyclerView2) childHelper.f39177a;
        int iM16974b = recyclerView3.m16974b();
        for (int i = 0; i < iM16974b; i++) {
            View viewM16973a = recyclerView3.m16973a(i);
            recyclerView3.f39135a.m622p(viewM16973a);
            viewM16973a.clearAnimation();
        }
        recyclerView3.f39135a.removeAllViews();
        this.f987x = abstractC0160m;
        if (abstractC0160m != null) {
            if (abstractC0160m.f1036b != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(abstractC0160m);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(outline.m1588j(abstractC0160m.f1036b, sb));
            }
            abstractC0160m.m737T0(this);
            if (this.f922D) {
                AbstractC0160m abstractC0160m3 = this.f987x;
                abstractC0160m3.f1043i = true;
                abstractC0160m3.m752f0();
            }
        }
        this.f965m.m796l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        NestedScrollingChildHelper scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f38065d) {
            View view = scrollingChildHelper.f38064c;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            view.stopNestedScroll();
        }
        scrollingChildHelper.f38065d = z;
    }

    public void setOnFlingListener(AbstractC0163p abstractC0163p) {
        this.f962k0 = abstractC0163p;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0165r abstractC0165r) {
        this.f982u0 = abstractC0165r;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f972p0 = z;
    }

    public void setRecycledViewPool(C0166s c0166s) {
        C0167t c0167t = this.f965m;
        C0166s c0166s2 = c0167t.f1074g;
        if (c0166s2 != null) {
            c0166s2.f1063b--;
        }
        c0167t.f1074g = c0166s;
        if (c0166s == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        c0167t.f1074g.f1063b++;
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC0168u interfaceC0168u) {
        this.f989y = interfaceC0168u;
    }

    public void setScrollState(int i) {
        AbstractC0171x abstractC0171x;
        if (i == this.f954c0) {
            return;
        }
        this.f954c0 = i;
        if (i != 2) {
            this.f974q0.m638c();
            AbstractC0160m abstractC0160m = this.f987x;
            if (abstractC0160m != null && (abstractC0171x = abstractC0160m.f1041g) != null) {
                abstractC0171x.m805g();
            }
        }
        AbstractC0160m abstractC0160m2 = this.f987x;
        if (abstractC0160m2 != null) {
            abstractC0160m2.mo709C0(i);
        }
        m595X();
        AbstractC0165r abstractC0165r = this.f982u0;
        if (abstractC0165r != null) {
            abstractC0165r.mo781a(this, i);
        }
        List<AbstractC0165r> list = this.f984v0;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.f984v0.get(size).mo781a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f961j0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f961j0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0173z abstractC0173z) {
        this.f965m.f1075h = abstractC0173z;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m16299i(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m16300j(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f934J) {
            m609i("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f934J = true;
                this.f936K = true;
                m627r0();
                return;
            }
            this.f934J = false;
            if (this.f932I && this.f987x != null && this.f985w != null) {
                requestLayout();
            }
            this.f932I = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m629t(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m16293c(i, i2, iArr, iArr2, i3);
    }

    /* JADX INFO: renamed from: u */
    public final void m630u(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m16296f(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: v */
    public void m631v(int i, int i2) {
        this.f947S++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        m596Y();
        AbstractC0165r abstractC0165r = this.f982u0;
        if (abstractC0165r != null) {
            abstractC0165r.mo782b(this, i, i2);
        }
        List<AbstractC0165r> list = this.f984v0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f984v0.get(size).mo782b(this, i, i2);
            }
        }
        this.f947S--;
    }

    /* JADX INFO: renamed from: w */
    public void m632w() {
        if (this.f952a0 != null) {
            return;
        }
        EdgeEffect edgeEffectM685a = this.f948T.m685a(this);
        this.f952a0 = edgeEffectM685a;
        if (this.f975r) {
            edgeEffectM685a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectM685a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m633x() {
        if (this.f949U != null) {
            return;
        }
        EdgeEffect edgeEffectM685a = this.f948T.m685a(this);
        this.f949U = edgeEffectM685a;
        if (this.f975r) {
            edgeEffectM685a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectM685a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: y */
    public void m634y() {
        if (this.f951W != null) {
            return;
        }
        EdgeEffect edgeEffectM685a = this.f948T.m685a(this);
        this.f951W = edgeEffectM685a;
        if (this.f975r) {
            edgeEffectM685a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectM685a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: z */
    public void m635z() {
        if (this.f950V != null) {
            return;
        }
        EdgeEffect edgeEffectM685a = this.f948T.m685a(this);
        this.f950V = edgeEffectM685a;
        if (this.f975r) {
            edgeEffectM685a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectM685a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, mtp.media.karaoke.R.attr.recyclerViewStyle);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public static class C0170w extends AbsSavedState {
        public static final Parcelable.Creator<C0170w> CREATOR = new a();

        /* JADX INFO: renamed from: h */
        public Parcelable f1078h;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$w$a */
        public class a implements Parcelable.ClassLoaderCreator<C0170w> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0170w createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0170w(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0170w[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0170w(parcel, null);
            }
        }

        public C0170w(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1078h = parcel.readParcelable(classLoader == null ? AbstractC0160m.class.getClassLoader() : classLoader);
        }

        @Override // p636z0.p745m.p746a.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f38150g, i);
            parcel.writeParcelable(this.f1078h, 0);
        }

        public C0170w(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        float fM16344a;
        float fM16344a2;
        char c2;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        this.f963l = new C0169v();
        this.f965m = new C0167t();
        this.f973q = new ViewInfoStore();
        this.f977s = new RunnableC0146a();
        this.f979t = new Rect();
        this.f981u = new Rect();
        this.f983v = new RectF();
        this.f991z = new ArrayList();
        this.f916A = new ArrayList<>();
        this.f918B = new ArrayList<>();
        this.f930H = 0;
        this.f944P = false;
        this.f945Q = false;
        this.f946R = 0;
        this.f947S = 0;
        this.f948T = new C0156i();
        this.f953b0 = new DefaultItemAnimator();
        this.f954c0 = 0;
        this.f955d0 = -1;
        this.f968n0 = Float.MIN_VALUE;
        this.f970o0 = Float.MIN_VALUE;
        this.f972p0 = true;
        this.f974q0 = new RunnableC0147a0();
        this.f978s0 = f913i ? new GapWorker.b() : null;
        this.f980t0 = new C0172y();
        this.f986w0 = false;
        this.f988x0 = false;
        this.f990y0 = new C0158k();
        this.f992z0 = false;
        this.f921C0 = new int[2];
        this.f925E0 = new int[2];
        this.f927F0 = new int[2];
        this.f929G0 = new int[2];
        this.f931H0 = new ArrayList();
        this.f933I0 = new RunnableC0148b();
        this.f937K0 = 0;
        this.f939L0 = 0;
        this.f941M0 = new C0151d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f961j0 = viewConfiguration.getScaledTouchSlop();
        Method method = ViewConfigurationCompat.f38091a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            fM16344a = viewConfiguration.getScaledHorizontalScrollFactor();
        } else {
            fM16344a = ViewConfigurationCompat.m16344a(viewConfiguration, context);
        }
        this.f968n0 = fM16344a;
        if (i2 >= 26) {
            fM16344a2 = viewConfiguration.getScaledVerticalScrollFactor();
        } else {
            fM16344a2 = ViewConfigurationCompat.m16344a(viewConfiguration, context);
        }
        this.f970o0 = fM16344a2;
        this.f964l0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f966m0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f953b0.f1026a = this.f990y0;
        this.f969o = new AdapterHelper(new RecyclerView3(this));
        this.f971p = new ChildHelper(new RecyclerView2(this));
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if ((i2 >= 26 ? getImportantForAutofill() : 0) == 0 && i2 >= 26) {
            setImportantForAutofill(8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f942N = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        int[] iArr = C8463a.f39124a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.m16326t(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f975r = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.f926F = z;
        if (z) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c2 = 2;
                new FastScroller(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(mtp.media.karaoke.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(mtp.media.karaoke.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(mtp.media.karaoke.R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException(outline.m1588j(this, outline.m1556G("Trying to set fast scroller without both required drawables.")));
            }
        } else {
            c2 = 2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, classLoader).asSubclass(AbstractC0160m.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f914j);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c2] = Integer.valueOf(i);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC0160m) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int[] iArr2 = f910f;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ViewCompat.m16326t(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static class C0161n extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public AbstractC0149b0 f1058a;

        /* JADX INFO: renamed from: b */
        public final Rect f1059b;

        /* JADX INFO: renamed from: c */
        public boolean f1060c;

        /* JADX INFO: renamed from: d */
        public boolean f1061d;

        public C0161n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1059b = new Rect();
            this.f1060c = true;
            this.f1061d = false;
        }

        /* JADX INFO: renamed from: a */
        public int m772a() {
            return this.f1058a.m644f();
        }

        /* JADX INFO: renamed from: b */
        public boolean m773b() {
            return this.f1058a.m654p();
        }

        /* JADX INFO: renamed from: c */
        public boolean m774c() {
            return this.f1058a.m651m();
        }

        public C0161n(int i, int i2) {
            super(i, i2);
            this.f1059b = new Rect();
            this.f1060c = true;
            this.f1061d = false;
        }

        public C0161n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1059b = new Rect();
            this.f1060c = true;
            this.f1061d = false;
        }

        public C0161n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1059b = new Rect();
            this.f1060c = true;
            this.f1061d = false;
        }

        public C0161n(C0161n c0161n) {
            super((ViewGroup.LayoutParams) c0161n);
            this.f1059b = new Rect();
            this.f1060c = true;
            this.f1061d = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0160m abstractC0160m = this.f987x;
        if (abstractC0160m != null) {
            return abstractC0160m.mo506w(layoutParams);
        }
        throw new IllegalStateException(outline.m1588j(this, outline.m1556G("RecyclerView has no LayoutManager")));
    }
}
