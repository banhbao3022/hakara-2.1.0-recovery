package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.stetho.websocket.CloseCodes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p348i.BottomSheetBehavior2;
import p007c.p190n.p194b.p334e.p348i.BottomSheetBehavior3;
import p007c.p190n.p194b.p334e.p348i.BottomSheetBehavior4;
import p007c.p190n.p194b.p334e.p357q.ElevationOverlayProvider;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;
import p636z0.p745m.p746a.AbsSavedState;
import p636z0.p745m.p747b.ViewDragHelper;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0098c<V> {

    /* JADX INFO: renamed from: A */
    public boolean f28821A;

    /* JADX INFO: renamed from: B */
    public int f28822B;

    /* JADX INFO: renamed from: C */
    public boolean f28823C;

    /* JADX INFO: renamed from: D */
    public int f28824D;

    /* JADX INFO: renamed from: E */
    public int f28825E;

    /* JADX INFO: renamed from: F */
    public int f28826F;

    /* JADX INFO: renamed from: G */
    public WeakReference<V> f28827G;

    /* JADX INFO: renamed from: H */
    public WeakReference<View> f28828H;

    /* JADX INFO: renamed from: I */
    public final ArrayList<AbstractC5926c> f28829I;

    /* JADX INFO: renamed from: J */
    public VelocityTracker f28830J;

    /* JADX INFO: renamed from: K */
    public int f28831K;

    /* JADX INFO: renamed from: L */
    public int f28832L;

    /* JADX INFO: renamed from: M */
    public boolean f28833M;

    /* JADX INFO: renamed from: N */
    public Map<View, Integer> f28834N;

    /* JADX INFO: renamed from: O */
    public int f28835O;

    /* JADX INFO: renamed from: P */
    public final ViewDragHelper.c f28836P;

    /* JADX INFO: renamed from: a */
    public int f28837a;

    /* JADX INFO: renamed from: b */
    public boolean f28838b;

    /* JADX INFO: renamed from: c */
    public float f28839c;

    /* JADX INFO: renamed from: d */
    public int f28840d;

    /* JADX INFO: renamed from: e */
    public boolean f28841e;

    /* JADX INFO: renamed from: f */
    public int f28842f;

    /* JADX INFO: renamed from: g */
    public int f28843g;

    /* JADX INFO: renamed from: h */
    public boolean f28844h;

    /* JADX INFO: renamed from: i */
    public MaterialShapeDrawable f28845i;

    /* JADX INFO: renamed from: j */
    public int f28846j;

    /* JADX INFO: renamed from: k */
    public boolean f28847k;

    /* JADX INFO: renamed from: l */
    public ShapeAppearanceModel f28848l;

    /* JADX INFO: renamed from: m */
    public boolean f28849m;

    /* JADX INFO: renamed from: n */
    public BottomSheetBehavior<V>.RunnableC5928e f28850n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f28851o;

    /* JADX INFO: renamed from: p */
    public int f28852p;

    /* JADX INFO: renamed from: q */
    public int f28853q;

    /* JADX INFO: renamed from: r */
    public int f28854r;

    /* JADX INFO: renamed from: s */
    public float f28855s;

    /* JADX INFO: renamed from: t */
    public int f28856t;

    /* JADX INFO: renamed from: u */
    public float f28857u;

    /* JADX INFO: renamed from: v */
    public boolean f28858v;

    /* JADX INFO: renamed from: w */
    public boolean f28859w;

    /* JADX INFO: renamed from: x */
    public boolean f28860x;

    /* JADX INFO: renamed from: y */
    public int f28861y;

    /* JADX INFO: renamed from: z */
    public ViewDragHelper f28862z;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class RunnableC5924a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ View f28863f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f28864g;

        public RunnableC5924a(View view, int i) {
            this.f28863f = view;
            this.f28864g = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m12742M(this.f28863f, this.f28864g);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C5925b extends ViewDragHelper.c {
        public C5925b() {
        }

        @Override // p636z0.p745m.p747b.ViewDragHelper.c
        /* JADX INFO: renamed from: a */
        public int mo12706a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // p636z0.p745m.p747b.ViewDragHelper.c
        /* JADX INFO: renamed from: b */
        public int mo12707b(View view, int i, int i2) {
            int iM12736G = BottomSheetBehavior.this.m12736G();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C8162a.m16066k(i, iM12736G, bottomSheetBehavior.f28858v ? bottomSheetBehavior.f28826F : bottomSheetBehavior.f28856t);
        }

        @Override // p636z0.p745m.p747b.ViewDragHelper.c
        /* JADX INFO: renamed from: d */
        public int mo12750d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f28858v ? bottomSheetBehavior.f28826F : bottomSheetBehavior.f28856t;
        }

        @Override // p636z0.p745m.p747b.ViewDragHelper.c
        /* JADX INFO: renamed from: f */
        public void mo12710f(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f28860x) {
                    bottomSheetBehavior.m12741L(1);
                }
            }
        }

        @Override // p636z0.p745m.p747b.ViewDragHelper.c
        /* JADX INFO: renamed from: g */
        public void mo12711g(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.m12734E(i2);
        }

        @Override // p636z0.p745m.p747b.ViewDragHelper.c
        /* JADX INFO: renamed from: h */
        public void mo12712h(View view, float f, float f2) {
            int i;
            int i2 = 4;
            if (f2 < 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f28838b) {
                    i = bottomSheetBehavior.f28853q;
                } else {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                    int i3 = bottomSheetBehavior2.f28854r;
                    if (top > i3) {
                        i = i3;
                        i2 = 6;
                    } else {
                        i = bottomSheetBehavior2.f28852p;
                    }
                }
                i2 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                if (bottomSheetBehavior3.f28858v && bottomSheetBehavior3.m12744O(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                        int top2 = view.getTop();
                        BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                        if (!(top2 > (bottomSheetBehavior4.m12736G() + bottomSheetBehavior4.f28826F) / 2)) {
                            BottomSheetBehavior bottomSheetBehavior5 = BottomSheetBehavior.this;
                            if (bottomSheetBehavior5.f28838b) {
                                i = bottomSheetBehavior5.f28853q;
                            } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.f28852p) < Math.abs(view.getTop() - BottomSheetBehavior.this.f28854r)) {
                                i = BottomSheetBehavior.this.f28852p;
                            } else {
                                i = BottomSheetBehavior.this.f28854r;
                                i2 = 6;
                            }
                            i2 = 3;
                        }
                    }
                    i = BottomSheetBehavior.this.f28826F;
                    i2 = 5;
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top3 = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior6 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior6.f28838b) {
                        int i4 = bottomSheetBehavior6.f28854r;
                        if (top3 < i4) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior6.f28856t)) {
                                i = BottomSheetBehavior.this.f28852p;
                                i2 = 3;
                            } else {
                                i = BottomSheetBehavior.this.f28854r;
                            }
                        } else if (Math.abs(top3 - i4) < Math.abs(top3 - BottomSheetBehavior.this.f28856t)) {
                            i = BottomSheetBehavior.this.f28854r;
                        } else {
                            i = BottomSheetBehavior.this.f28856t;
                        }
                        i2 = 6;
                    } else if (Math.abs(top3 - bottomSheetBehavior6.f28853q) < Math.abs(top3 - BottomSheetBehavior.this.f28856t)) {
                        i = BottomSheetBehavior.this.f28853q;
                        i2 = 3;
                    } else {
                        i = BottomSheetBehavior.this.f28856t;
                    }
                } else {
                    BottomSheetBehavior bottomSheetBehavior7 = BottomSheetBehavior.this;
                    if (bottomSheetBehavior7.f28838b) {
                        i = bottomSheetBehavior7.f28856t;
                    } else {
                        int top4 = view.getTop();
                        if (Math.abs(top4 - BottomSheetBehavior.this.f28854r) < Math.abs(top4 - BottomSheetBehavior.this.f28856t)) {
                            i = BottomSheetBehavior.this.f28854r;
                            i2 = 6;
                        } else {
                            i = BottomSheetBehavior.this.f28856t;
                        }
                    }
                }
            }
            BottomSheetBehavior.this.m12745P(view, i2, i, true);
        }

        @Override // p636z0.p745m.p747b.ViewDragHelper.c
        /* JADX INFO: renamed from: i */
        public boolean mo12713i(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f28861y;
            if (i2 == 1 || bottomSheetBehavior.f28833M) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f28831K == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f28828H;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f28827G;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public static abstract class AbstractC5926c {
        /* JADX INFO: renamed from: a */
        public abstract void mo11124a(View view, float f);

        /* JADX INFO: renamed from: b */
        public abstract void mo11125b(View view, int i);
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public static class C5927d extends AbsSavedState {
        public static final Parcelable.Creator<C5927d> CREATOR = new a();

        /* JADX INFO: renamed from: h */
        public final int f28867h;

        /* JADX INFO: renamed from: i */
        public int f28868i;

        /* JADX INFO: renamed from: j */
        public boolean f28869j;

        /* JADX INFO: renamed from: k */
        public boolean f28870k;

        /* JADX INFO: renamed from: l */
        public boolean f28871l;

        /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d$a */
        public static class a implements Parcelable.ClassLoaderCreator<C5927d> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C5927d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C5927d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C5927d[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C5927d(parcel, (ClassLoader) null);
            }
        }

        public C5927d(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // p636z0.p745m.p746a.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f38150g, i);
            parcel.writeInt(this.f28867h);
            parcel.writeInt(this.f28868i);
            parcel.writeInt(this.f28869j ? 1 : 0);
            parcel.writeInt(this.f28870k ? 1 : 0);
            parcel.writeInt(this.f28871l ? 1 : 0);
        }

        public C5927d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f28867h = parcel.readInt();
            this.f28868i = parcel.readInt();
            this.f28869j = parcel.readInt() == 1;
            this.f28870k = parcel.readInt() == 1;
            this.f28871l = parcel.readInt() == 1;
        }

        public C5927d(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f28867h = bottomSheetBehavior.f28861y;
            this.f28868i = bottomSheetBehavior.f28840d;
            this.f28869j = bottomSheetBehavior.f28838b;
            this.f28870k = bottomSheetBehavior.f28858v;
            this.f28871l = bottomSheetBehavior.f28859w;
        }

        @Deprecated
        public C5927d(Parcelable parcelable, int i) {
            super(parcelable);
            this.f28867h = i;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public class RunnableC5928e implements Runnable {

        /* JADX INFO: renamed from: f */
        public final View f28872f;

        /* JADX INFO: renamed from: g */
        public boolean f28873g;

        /* JADX INFO: renamed from: h */
        public int f28874h;

        public RunnableC5928e(View view, int i) {
            this.f28872f = view;
            this.f28874h = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper viewDragHelper = BottomSheetBehavior.this.f28862z;
            if (viewDragHelper == null || !viewDragHelper.m16382i(true)) {
                BottomSheetBehavior.this.m12741L(this.f28874h);
            } else {
                View view = this.f28872f;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                view.postOnAnimation(this);
            }
            this.f28873g = false;
        }
    }

    public BottomSheetBehavior() {
        this.f28837a = 0;
        this.f28838b = true;
        this.f28850n = null;
        this.f28855s = 0.5f;
        this.f28857u = -1.0f;
        this.f28860x = true;
        this.f28861y = 4;
        this.f28829I = new ArrayList<>();
        this.f28835O = -1;
        this.f28836P = new C5925b();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: A */
    public boolean mo308A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f28861y == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.f28862z;
        if (viewDragHelper != null) {
            viewDragHelper.m16387n(motionEvent);
        }
        if (actionMasked == 0) {
            this.f28831K = -1;
            VelocityTracker velocityTracker = this.f28830J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f28830J = null;
            }
        }
        if (this.f28830J == null) {
            this.f28830J = VelocityTracker.obtain();
        }
        this.f28830J.addMovement(motionEvent);
        if (this.f28862z != null && actionMasked == 2 && !this.f28821A) {
            float fAbs = Math.abs(this.f28832L - motionEvent.getY());
            ViewDragHelper viewDragHelper2 = this.f28862z;
            if (fAbs > viewDragHelper2.f38171c) {
                viewDragHelper2.m16375b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f28821A;
    }

    /* JADX INFO: renamed from: B */
    public final void m12731B() {
        int iM12732C = m12732C();
        if (this.f28838b) {
            this.f28856t = Math.max(this.f28826F - iM12732C, this.f28853q);
        } else {
            this.f28856t = this.f28826F - iM12732C;
        }
    }

    /* JADX INFO: renamed from: C */
    public final int m12732C() {
        int i;
        if (this.f28841e) {
            return Math.min(Math.max(this.f28842f, this.f28826F - ((this.f28825E * 9) / 16)), this.f28824D);
        }
        return (this.f28847k || (i = this.f28846j) <= 0) ? this.f28840d : Math.max(this.f28840d, i + this.f28843g);
    }

    /* JADX INFO: renamed from: D */
    public final void m12733D(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f28844h) {
            this.f28848l = ShapeAppearanceModel.m11392b(context, attributeSet, R.attr.bottomSheetStyle, 2132017847).m11398a();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f28848l);
            this.f28845i = materialShapeDrawable;
            materialShapeDrawable.f25574h.f25595b = new ElevationOverlayProvider(context);
            materialShapeDrawable.m11365A();
            if (z && colorStateList != null) {
                this.f28845i.m11381q(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.f28845i.setTint(typedValue.data);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m12734E(int i) {
        float f;
        float fM12736G;
        V v = this.f28827G.get();
        if (v == null || this.f28829I.isEmpty()) {
            return;
        }
        int i2 = this.f28856t;
        if (i > i2 || i2 == m12736G()) {
            int i3 = this.f28856t;
            f = i3 - i;
            fM12736G = this.f28826F - i3;
        } else {
            int i4 = this.f28856t;
            f = i4 - i;
            fM12736G = i4 - m12736G();
        }
        float f2 = f / fM12736G;
        for (int i5 = 0; i5 < this.f28829I.size(); i5++) {
            this.f28829I.get(i5).mo11124a(v, f2);
        }
    }

    /* JADX INFO: renamed from: F */
    public View m12735F(View view) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewM12735F = m12735F(viewGroup.getChildAt(i));
            if (viewM12735F != null) {
                return viewM12735F;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    public int m12736G() {
        return this.f28838b ? this.f28853q : this.f28852p;
    }

    /* JADX INFO: renamed from: H */
    public final void m12737H(V v, AccessibilityNodeInfoCompat.a aVar, int i) {
        ViewCompat.m16325s(v, aVar, null, new BottomSheetBehavior4(this, i));
    }

    /* JADX INFO: renamed from: I */
    public void m12738I(boolean z) {
        if (this.f28858v != z) {
            this.f28858v = z;
            if (!z && this.f28861y == 5) {
                m12740K(4);
            }
            m12746Q();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    /* JADX INFO: renamed from: J */
    public void m12739J(int i) {
        boolean z = true;
        if (i == -1) {
            if (this.f28841e) {
                z = false;
            } else {
                this.f28841e = true;
            }
        } else if (this.f28841e || this.f28840d != i) {
            this.f28841e = false;
            this.f28840d = Math.max(0, i);
        } else {
            z = false;
        }
        if (z) {
            m12749T(false);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m12740K(int i) {
        if (i == this.f28861y) {
            return;
        }
        if (this.f28827G != null) {
            m12743N(i);
            return;
        }
        if (i == 4 || i == 3 || i == 6 || (this.f28858v && i == 5)) {
            this.f28861y = i;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m12741L(int i) {
        V v;
        if (this.f28861y == i) {
            return;
        }
        this.f28861y = i;
        WeakReference<V> weakReference = this.f28827G;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m12748S(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m12748S(false);
        }
        m12747R(i);
        for (int i2 = 0; i2 < this.f28829I.size(); i2++) {
            this.f28829I.get(i2).mo11125b(v, i);
        }
        m12746Q();
    }

    /* JADX INFO: renamed from: M */
    public void m12742M(View view, int i) {
        int iM12736G;
        int i2;
        if (i == 4) {
            iM12736G = this.f28856t;
        } else if (i == 6) {
            iM12736G = this.f28854r;
            if (this.f28838b && iM12736G <= (i2 = this.f28853q)) {
                i = 3;
                iM12736G = i2;
            }
        } else if (i == 3) {
            iM12736G = m12736G();
        } else {
            if (!this.f28858v || i != 5) {
                throw new IllegalArgumentException(outline.m1590l("Illegal state argument: ", i));
            }
            iM12736G = this.f28826F;
        }
        m12745P(view, i, iM12736G, false);
    }

    /* JADX INFO: renamed from: N */
    public final void m12743N(int i) {
        V v = this.f28827G.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (v.isAttachedToWindow()) {
                v.post(new RunnableC5924a(v, i));
                return;
            }
        }
        m12742M(v, i);
    }

    /* JADX INFO: renamed from: O */
    public boolean m12744O(View view, float f) {
        if (this.f28859w) {
            return true;
        }
        if (view.getTop() < this.f28856t) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.f28856t)) / ((float) m12732C()) > 0.5f;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    /* JADX INFO: renamed from: P */
    public void m12745P(View view, int i, int i2, boolean z) {
        ViewDragHelper viewDragHelper = this.f28862z;
        boolean z2 = false;
        if (viewDragHelper != null) {
            if (!z) {
                int left = view.getLeft();
                viewDragHelper.f38188t = view;
                viewDragHelper.f38172d = -1;
                boolean zM16385l = viewDragHelper.m16385l(left, i2, 0, 0);
                if (!zM16385l && viewDragHelper.f38170b == 0 && viewDragHelper.f38188t != null) {
                    viewDragHelper.f38188t = null;
                }
                if (zM16385l) {
                    z2 = true;
                }
            } else if (viewDragHelper.m16393t(view.getLeft(), i2)) {
                z2 = true;
            }
        }
        if (!z2) {
            m12741L(i);
            return;
        }
        m12741L(2);
        m12747R(i);
        if (this.f28850n == null) {
            this.f28850n = new RunnableC5928e(view, i);
        }
        BottomSheetBehavior<V>.RunnableC5928e runnableC5928e = this.f28850n;
        if (runnableC5928e.f28873g) {
            runnableC5928e.f28874h = i;
            return;
        }
        runnableC5928e.f28874h = i;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        view.postOnAnimation(runnableC5928e);
        this.f28850n.f28873g = true;
    }

    /* JADX INFO: renamed from: Q */
    public final void m12746Q() {
        V v;
        WeakReference<V> weakReference = this.f28827G;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        ViewCompat.m16324r(524288, v);
        ViewCompat.m16318l(v, 0);
        ViewCompat.m16324r(262144, v);
        ViewCompat.m16318l(v, 0);
        ViewCompat.m16324r(1048576, v);
        ViewCompat.m16318l(v, 0);
        int i = this.f28835O;
        if (i != -1) {
            ViewCompat.m16324r(i, v);
            ViewCompat.m16318l(v, 0);
        }
        if (this.f28861y != 6) {
            String string = v.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            BottomSheetBehavior4 bottomSheetBehavior4 = new BottomSheetBehavior4(this, 6);
            List<AccessibilityNodeInfoCompat.a> listM16316j = ViewCompat.m16316j(v);
            int i2 = 0;
            int i3 = -1;
            while (true) {
                int[] iArr = ViewCompat.f38078f;
                if (i2 >= iArr.length || i3 != -1) {
                    break;
                }
                int i4 = iArr[i2];
                boolean z = true;
                for (int i5 = 0; i5 < listM16316j.size(); i5++) {
                    z &= listM16316j.get(i5).m16275a() != i4;
                }
                if (z) {
                    i3 = i4;
                }
                i2++;
            }
            if (i3 != -1) {
                ViewCompat.m16307a(v, new AccessibilityNodeInfoCompat.a(i3, string, bottomSheetBehavior4));
            }
            this.f28835O = i3;
        }
        if (this.f28858v && this.f28861y != 5) {
            m12737H(v, AccessibilityNodeInfoCompat.a.f38026f, 5);
        }
        int i6 = this.f28861y;
        if (i6 == 3) {
            m12737H(v, AccessibilityNodeInfoCompat.a.f38025e, this.f28838b ? 4 : 6);
            return;
        }
        if (i6 == 4) {
            m12737H(v, AccessibilityNodeInfoCompat.a.f38024d, this.f28838b ? 3 : 6);
        } else {
            if (i6 != 6) {
                return;
            }
            m12737H(v, AccessibilityNodeInfoCompat.a.f38025e, 4);
            m12737H(v, AccessibilityNodeInfoCompat.a.f38024d, 3);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m12747R(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.f28849m != z) {
            this.f28849m = z;
            if (this.f28845i == null || (valueAnimator = this.f28851o) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f28851o.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.f28851o.setFloatValues(1.0f - f, f);
            this.f28851o.start();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m12748S(boolean z) {
        WeakReference<V> weakReference = this.f28827G;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f28834N != null) {
                    return;
                } else {
                    this.f28834N = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f28827G.get() && z) {
                    this.f28834N.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f28834N = null;
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m12749T(boolean z) {
        V v;
        if (this.f28827G != null) {
            m12731B();
            if (this.f28861y != 4 || (v = this.f28827G.get()) == null) {
                return;
            }
            if (z) {
                m12743N(this.f28861y);
            } else {
                v.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: f */
    public void mo314f(CoordinatorLayout.C0101f c0101f) {
        this.f28827G = null;
        this.f28862z = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: i */
    public void mo317i() {
        this.f28827G = null;
        this.f28862z = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: j */
    public boolean mo318j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        if (!v.isShown() || !this.f28860x) {
            this.f28821A = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f28831K = -1;
            VelocityTracker velocityTracker = this.f28830J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f28830J = null;
            }
        }
        if (this.f28830J == null) {
            this.f28830J = VelocityTracker.obtain();
        }
        this.f28830J.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f28832L = (int) motionEvent.getY();
            if (this.f28861y != 2) {
                WeakReference<View> weakReference = this.f28828H;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.m297q(view, x, this.f28832L)) {
                    this.f28831K = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f28833M = true;
                }
            }
            this.f28821A = this.f28831K == -1 && !coordinatorLayout.m297q(v, x, this.f28832L);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f28833M = false;
            this.f28831K = -1;
            if (this.f28821A) {
                this.f28821A = false;
                return false;
            }
        }
        if (!this.f28821A && (viewDragHelper = this.f28862z) != null && viewDragHelper.m16394u(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f28828H;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f28821A || this.f28861y == 1 || coordinatorLayout.m297q(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f28862z == null || Math.abs(((float) this.f28832L) - motionEvent.getY()) <= ((float) this.f28862z.f38171c)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: k */
    public boolean mo319k(CoordinatorLayout coordinatorLayout, V v, int i) {
        MaterialShapeDrawable materialShapeDrawable;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.f28827G == null) {
            this.f28842f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.f28847k && !this.f28841e) {
                C4799a.m11019y(v, new BottomSheetBehavior3(this));
            }
            this.f28827G = new WeakReference<>(v);
            if (this.f28844h && (materialShapeDrawable = this.f28845i) != null) {
                v.setBackground(materialShapeDrawable);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.f28845i;
            if (materialShapeDrawable2 != null) {
                float elevation = this.f28857u;
                if (elevation == -1.0f) {
                    elevation = v.getElevation();
                }
                materialShapeDrawable2.m11380p(elevation);
                boolean z = this.f28861y == 3;
                this.f28849m = z;
                this.f28845i.m11382r(z ? 0.0f : 1.0f);
            }
            m12746Q();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.f28862z == null) {
            this.f28862z = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.f28836P);
        }
        int top = v.getTop();
        coordinatorLayout.m299s(v, i);
        this.f28825E = coordinatorLayout.getWidth();
        this.f28826F = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f28824D = height;
        this.f28853q = Math.max(0, this.f28826F - height);
        this.f28854r = (int) ((1.0f - this.f28855s) * this.f28826F);
        m12731B();
        int i2 = this.f28861y;
        if (i2 == 3) {
            ViewCompat.m16320n(v, m12736G());
        } else if (i2 == 6) {
            ViewCompat.m16320n(v, this.f28854r);
        } else if (this.f28858v && i2 == 5) {
            ViewCompat.m16320n(v, this.f28826F);
        } else if (i2 == 4) {
            ViewCompat.m16320n(v, this.f28856t);
        } else if (i2 == 1 || i2 == 2) {
            ViewCompat.m16320n(v, top - v.getTop());
        }
        this.f28828H = new WeakReference<>(m12735F(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: n */
    public boolean mo322n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f28828H;
        return (weakReference == null || view != weakReference.get() || this.f28861y == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: p */
    public void mo324p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f28828H;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < m12736G()) {
                iArr[1] = top - m12736G();
                ViewCompat.m16320n(v, -iArr[1]);
                m12741L(3);
            } else {
                if (!this.f28860x) {
                    return;
                }
                iArr[1] = i2;
                ViewCompat.m16320n(v, -i2);
                m12741L(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.f28856t;
            if (i4 > i5 && !this.f28858v) {
                iArr[1] = top - i5;
                ViewCompat.m16320n(v, -iArr[1]);
                m12741L(4);
            } else {
                if (!this.f28860x) {
                    return;
                }
                iArr[1] = i2;
                ViewCompat.m16320n(v, -i2);
                m12741L(1);
            }
        }
        m12734E(v.getTop());
        this.f28822B = i2;
        this.f28823C = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: r */
    public void mo326r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: u */
    public void mo329u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C5927d c5927d = (C5927d) parcelable;
        int i = this.f28837a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f28840d = c5927d.f28868i;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f28838b = c5927d.f28869j;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f28858v = c5927d.f28870k;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f28859w = c5927d.f28871l;
            }
        }
        int i2 = c5927d.f28867h;
        if (i2 == 1 || i2 == 2) {
            this.f28861y = 4;
        } else {
            this.f28861y = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: v */
    public Parcelable mo330v(CoordinatorLayout coordinatorLayout, V v) {
        return new C5927d((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: x */
    public boolean mo332x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f28822B = 0;
        this.f28823C = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ca  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: z */
    public void mo334z(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int top;
        int i2;
        int top2;
        int i3;
        float yVelocity;
        int i4 = 3;
        if (v.getTop() == m12736G()) {
            m12741L(3);
            return;
        }
        WeakReference<View> weakReference = this.f28828H;
        if (weakReference != null && view == weakReference.get() && this.f28823C) {
            if (this.f28822B > 0) {
                if (this.f28838b) {
                    i2 = this.f28853q;
                } else {
                    int top3 = v.getTop();
                    int i5 = this.f28854r;
                    if (top3 > i5) {
                        i2 = i5;
                        i4 = 6;
                    } else {
                        i2 = this.f28852p;
                    }
                }
            } else if (this.f28858v) {
                VelocityTracker velocityTracker = this.f28830J;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(CloseCodes.NORMAL_CLOSURE, this.f28839c);
                    yVelocity = this.f28830J.getYVelocity(this.f28831K);
                }
                if (m12744O(v, yVelocity)) {
                    i2 = this.f28826F;
                    i4 = 5;
                } else if (this.f28822B == 0) {
                    top2 = v.getTop();
                    if (this.f28838b) {
                        i3 = this.f28854r;
                        if (top2 < i3) {
                            if (top2 < Math.abs(top2 - this.f28856t)) {
                                i2 = this.f28852p;
                            } else {
                                i2 = this.f28854r;
                            }
                        } else if (Math.abs(top2 - i3) < Math.abs(top2 - this.f28856t)) {
                            i2 = this.f28854r;
                        } else {
                            i2 = this.f28856t;
                            i4 = 4;
                        }
                        i4 = 6;
                    } else if (Math.abs(top2 - this.f28853q) < Math.abs(top2 - this.f28856t)) {
                        i2 = this.f28853q;
                    } else {
                        i2 = this.f28856t;
                        i4 = 4;
                    }
                } else {
                    if (this.f28838b) {
                        i2 = this.f28856t;
                    } else {
                        top = v.getTop();
                        if (Math.abs(top - this.f28854r) < Math.abs(top - this.f28856t)) {
                            i2 = this.f28854r;
                            i4 = 6;
                        } else {
                            i2 = this.f28856t;
                        }
                    }
                    i4 = 4;
                }
            } else if (this.f28822B == 0) {
                top2 = v.getTop();
                if (this.f28838b) {
                    i3 = this.f28854r;
                    if (top2 < i3) {
                        if (top2 < Math.abs(top2 - this.f28856t)) {
                            i2 = this.f28852p;
                        } else {
                            i2 = this.f28854r;
                        }
                    } else if (Math.abs(top2 - i3) < Math.abs(top2 - this.f28856t)) {
                        i2 = this.f28854r;
                    } else {
                        i2 = this.f28856t;
                        i4 = 4;
                    }
                    i4 = 6;
                } else if (Math.abs(top2 - this.f28853q) < Math.abs(top2 - this.f28856t)) {
                    i2 = this.f28853q;
                } else {
                    i2 = this.f28856t;
                    i4 = 4;
                }
            } else {
                if (this.f28838b) {
                    i2 = this.f28856t;
                } else {
                    top = v.getTop();
                    if (Math.abs(top - this.f28854r) < Math.abs(top - this.f28856t)) {
                        i2 = this.f28854r;
                        i4 = 6;
                    } else {
                        i2 = this.f28856t;
                    }
                }
                i4 = 4;
            }
            m12745P(v, i4, i2, false);
            this.f28823C = false;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.f28837a = 0;
        this.f28838b = true;
        this.f28850n = null;
        this.f28855s = 0.5f;
        this.f28857u = -1.0f;
        this.f28860x = true;
        this.f28861y = 4;
        this.f28829I = new ArrayList<>();
        this.f28835O = -1;
        this.f28836P = new C5925b();
        this.f28843g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4801b.f24751f);
        this.f28844h = typedArrayObtainStyledAttributes.hasValue(11);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(1);
        if (zHasValue) {
            m12733D(context, attributeSet, zHasValue, C4799a.m10961L(context, typedArrayObtainStyledAttributes, 1));
        } else {
            m12733D(context, attributeSet, zHasValue, null);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f28851o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f28851o.addUpdateListener(new BottomSheetBehavior2(this));
        this.f28857u = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            m12739J(i);
        } else {
            m12739J(typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1));
        }
        m12738I(typedArrayObtainStyledAttributes.getBoolean(6, false));
        this.f28847k = typedArrayObtainStyledAttributes.getBoolean(10, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(4, true);
        if (this.f28838b != z) {
            this.f28838b = z;
            if (this.f28827G != null) {
                m12731B();
            }
            m12741L((this.f28838b && this.f28861y == 6) ? 3 : this.f28861y);
            m12746Q();
        }
        this.f28859w = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f28860x = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f28837a = typedArrayObtainStyledAttributes.getInt(8, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(5, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f28855s = f;
            if (this.f28827G != null) {
                this.f28854r = (int) ((1.0f - f) * this.f28826F);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(3);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i2 = typedValuePeekValue2.data;
                if (i2 >= 0) {
                    this.f28852p = i2;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f28852p = dimensionPixelOffset;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            this.f28839c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
