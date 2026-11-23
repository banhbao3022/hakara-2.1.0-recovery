package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p337c.AnimationUtils;
import p007c.p190n.p194b.p334e.p339d.AppBarLayout2;
import p007c.p190n.p194b.p334e.p339d.AppBarLayout3;
import p007c.p190n.p194b.p334e.p339d.AppBarLayout4;
import p007c.p190n.p194b.p334e.p339d.AppBarLayout5;
import p007c.p190n.p194b.p334e.p339d.HeaderBehavior;
import p007c.p190n.p194b.p334e.p339d.HeaderScrollingViewBehavior;
import p007c.p190n.p194b.p334e.p339d.ViewUtilsLollipop;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p357q.ElevationOverlayProvider;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.NestedScrollingChild;
import p636z0.p725k.p739l.OnApplyWindowInsetsListener;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.WindowInsetsCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC0097b {

    /* JADX INFO: renamed from: f */
    public int f28705f;

    /* JADX INFO: renamed from: g */
    public int f28706g;

    /* JADX INFO: renamed from: h */
    public int f28707h;

    /* JADX INFO: renamed from: i */
    public int f28708i;

    /* JADX INFO: renamed from: j */
    public boolean f28709j;

    /* JADX INFO: renamed from: k */
    public int f28710k;

    /* JADX INFO: renamed from: l */
    public WindowInsetsCompat f28711l;

    /* JADX INFO: renamed from: m */
    public List<InterfaceC5905b> f28712m;

    /* JADX INFO: renamed from: n */
    public boolean f28713n;

    /* JADX INFO: renamed from: o */
    public boolean f28714o;

    /* JADX INFO: renamed from: p */
    public boolean f28715p;

    /* JADX INFO: renamed from: q */
    public int f28716q;

    /* JADX INFO: renamed from: r */
    public WeakReference<View> f28717r;

    /* JADX INFO: renamed from: s */
    public ValueAnimator f28718s;

    /* JADX INFO: renamed from: t */
    public int[] f28719t;

    /* JADX INFO: renamed from: u */
    public Drawable f28720u;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        @Override // p007c.p190n.p194b.p334e.p339d.HeaderScrollingViewBehavior
        /* JADX INFO: renamed from: G */
        public float mo11083G(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.AbstractC0098c abstractC0098c = ((CoordinatorLayout.C0101f) appBarLayout.getLayoutParams()).f643a;
                int iMo11075H = abstractC0098c instanceof BaseBehavior ? ((BaseBehavior) abstractC0098c).mo11075H() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iMo11075H > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iMo11075H / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // p007c.p190n.p194b.p334e.p339d.HeaderScrollingViewBehavior
        /* JADX INFO: renamed from: H */
        public int mo11084H(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // p007c.p190n.p194b.p334e.p339d.HeaderScrollingViewBehavior
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public AppBarLayout mo11081E(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: d */
        public boolean mo312d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: g */
        public boolean mo315g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.AbstractC0098c abstractC0098c = ((CoordinatorLayout.C0101f) view2.getLayoutParams()).f643a;
            if (abstractC0098c instanceof BaseBehavior) {
                ViewCompat.m16320n(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC0098c).f28721j) + this.f24930e) - m11082F(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f28715p) {
                return false;
            }
            appBarLayout.m12682e(appBarLayout.m12683f(view));
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: h */
        public void mo316h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.m16324r(AccessibilityNodeInfoCompat.a.f38022b.m16275a(), coordinatorLayout);
                ViewCompat.m16318l(coordinatorLayout, 0);
                ViewCompat.m16324r(AccessibilityNodeInfoCompat.a.f38023c.m16275a(), coordinatorLayout);
                ViewCompat.m16318l(coordinatorLayout, 0);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: t */
        public boolean mo328t(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutMo11081E = mo11081E(coordinatorLayout.m291e(view));
            if (appBarLayoutMo11081E != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f24928c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutMo11081E.m12681d(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4801b.f24737I);
            this.f24931f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public class C5904a implements OnApplyWindowInsetsListener {
        public C5904a() {
        }

        @Override // p636z0.p725k.p739l.OnApplyWindowInsetsListener
        /* JADX INFO: renamed from: a */
        public WindowInsetsCompat mo307a(View view, WindowInsetsCompat windowInsetsCompat) {
            AppBarLayout appBarLayout = AppBarLayout.this;
            Objects.requireNonNull(appBarLayout);
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            WindowInsetsCompat windowInsetsCompat2 = appBarLayout.getFitsSystemWindows() ? windowInsetsCompat : null;
            if (!Objects.equals(appBarLayout.f28711l, windowInsetsCompat2)) {
                appBarLayout.f28711l = windowInsetsCompat2;
                appBarLayout.m12685h();
                appBarLayout.requestLayout();
            }
            return windowInsetsCompat;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public interface InterfaceC5905b<T extends AppBarLayout> {
        /* JADX INFO: renamed from: a */
        void mo12696a(T t, int i);
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public interface InterfaceC5907d extends InterfaceC5905b<AppBarLayout> {
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public void m12678a(InterfaceC5907d interfaceC5907d) {
        if (this.f28712m == null) {
            this.f28712m = new ArrayList();
        }
        if (interfaceC5907d == null || this.f28712m.contains(interfaceC5907d)) {
            return;
        }
        this.f28712m.add(interfaceC5907d);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5906c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C5906c((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C5906c((ViewGroup.MarginLayoutParams) layoutParams) : new C5906c(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public void m12680c(int i) {
        this.f28705f = i;
        if (!willNotDraw()) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            postInvalidateOnAnimation();
        }
        List<InterfaceC5905b> list = this.f28712m;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC5905b interfaceC5905b = this.f28712m.get(i2);
                if (interfaceC5905b != null) {
                    interfaceC5905b.mo12696a(this, i);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5906c;
    }

    /* JADX INFO: renamed from: d */
    public final void m12681d(boolean z, boolean z2, boolean z3) {
        this.f28710k = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f28720u != null && getTopInset() > 0) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f28705f);
            this.f28720u.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f28720u;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m12682e(boolean z) {
        if (this.f28714o == z) {
            return false;
        }
        this.f28714o = z;
        refreshDrawableState();
        if (this.f28715p && (getBackground() instanceof MaterialShapeDrawable)) {
            MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f28718s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, dimension);
            this.f28718s = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f28718s.setInterpolator(AnimationUtils.f24793a);
            this.f28718s.addUpdateListener(new AppBarLayout2(this, materialShapeDrawable));
            this.f28718s.start();
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public boolean m12683f(View view) {
        int i;
        if (this.f28717r == null && (i = this.f28716q) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f28716q);
            }
            if (viewFindViewById != null) {
                this.f28717r = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f28717r;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m12684g() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        return !childAt.getFitsSystemWindows();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C5906c(-1, -2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0097b
    public CoordinatorLayout.AbstractC0098c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int minimumHeight;
        int i = this.f28707h;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C5906c c5906c = (C5906c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c5906c.f28732a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                int i4 = ((LinearLayout.LayoutParams) c5906c).topMargin + ((LinearLayout.LayoutParams) c5906c).bottomMargin;
                if ((i3 & 8) != 0) {
                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                    minimumHeight = i4 + childAt.getMinimumHeight();
                } else if ((i3 & 2) != 0) {
                    AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                    minimumHeight = i4 + (measuredHeight - childAt.getMinimumHeight());
                } else {
                    minimumHeight = i4 + measuredHeight;
                }
                if (childCount == 0) {
                    AtomicInteger atomicInteger3 = ViewCompat.f38073a;
                    if (childAt.getFitsSystemWindows()) {
                        minimumHeight = Math.min(minimumHeight, measuredHeight - getTopInset());
                    }
                }
                i2 += minimumHeight;
            }
        }
        int iMax = Math.max(0, i2);
        this.f28707h = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.f28708i;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C5906c c5906c = (C5906c) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) c5906c).topMargin + ((LinearLayout.LayoutParams) c5906c).bottomMargin + childAt.getMeasuredHeight();
            int i3 = c5906c.f28732a;
            if ((i3 & 1) == 0) {
                break;
            }
            minimumHeight += measuredHeight;
            if ((i3 & 2) != 0) {
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f28708i = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f28716q;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f28710k;
    }

    public Drawable getStatusBarForeground() {
        return this.f28720u;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f28711l;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.m16230e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f28706g;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C5906c c5906c = (C5906c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c5906c.f28732a;
            if ((i3 & 1) == 0) {
                break;
            }
            int topInset = measuredHeight + ((LinearLayout.LayoutParams) c5906c).topMargin + ((LinearLayout.LayoutParams) c5906c).bottomMargin + minimumHeight;
            if (i2 == 0) {
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                if (childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
            }
            minimumHeight = topInset;
            if ((i3 & 2) != 0) {
                AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f28706g = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: renamed from: h */
    public final void m12685h() {
        setWillNotDraw(!(this.f28720u != null && getTopInset() > 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            C4799a.m11005o0(this, (MaterialShapeDrawable) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.f28719t == null) {
            this.f28719t = new int[4];
        }
        int[] iArr = this.f28719t;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f28713n;
        iArr[0] = z ? R.attr.state_liftable : -2130969569;
        iArr[1] = (z && this.f28714o) ? R.attr.state_lifted : -2130969570;
        iArr[2] = z ? R.attr.state_collapsible : -2130969567;
        iArr[3] = (z && this.f28714o) ? R.attr.state_collapsed : -2130969566;
        return LinearLayout.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f28717r;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f28717r = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        boolean z3 = true;
        if (getFitsSystemWindows() && m12684g()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.m16320n(getChildAt(childCount), topInset);
            }
        }
        this.f28706g = -1;
        this.f28707h = -1;
        this.f28708i = -1;
        this.f28709j = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((C5906c) getChildAt(i5).getLayoutParams()).f28733b != null) {
                this.f28709j = true;
                break;
            }
        }
        Drawable drawable = this.f28720u;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f28715p) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((C5906c) getChildAt(i6).getLayoutParams()).f28732a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.f28713n != z3) {
            this.f28713n = z3;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (getFitsSystemWindows() && m12684g()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = C8162a.m16066k(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        this.f28706g = -1;
        this.f28707h = -1;
        this.f28708i = -1;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C4799a.m11003n0(this, f);
    }

    public void setExpanded(boolean z) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        m12681d(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.f28715p = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f28716q = i;
        WeakReference<View> weakReference = this.f28717r;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f28717r = null;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f28720u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f28720u = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f28720u.setState(getDrawableState());
                }
                Drawable drawable3 = this.f28720u;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                C8162a.m16043N(drawable3, getLayoutDirection());
                this.f28720u.setVisible(getVisibility() == 0, false);
                this.f28720u.setCallback(this);
            }
            m12685h();
            AtomicInteger atomicInteger2 = ViewCompat.f38073a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(AppCompatResources.m14707b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        ViewUtilsLollipop.m11089a(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f28720u;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f28720u;
    }

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* JADX INFO: renamed from: j */
        public int f28721j;

        /* JADX INFO: renamed from: k */
        public int f28722k;

        /* JADX INFO: renamed from: l */
        public ValueAnimator f28723l;

        /* JADX INFO: renamed from: m */
        public int f28724m;

        /* JADX INFO: renamed from: n */
        public boolean f28725n;

        /* JADX INFO: renamed from: o */
        public float f28726o;

        /* JADX INFO: renamed from: p */
        public WeakReference<View> f28727p;

        public BaseBehavior() {
            this.f28724m = -1;
        }

        /* JADX INFO: renamed from: N */
        public static boolean m12686N(int i, int i2) {
            return (i & i2) == i2;
        }

        @Override // p007c.p190n.p194b.p334e.p339d.HeaderBehavior
        /* JADX INFO: renamed from: E */
        public boolean mo11072E(View view) {
            WeakReference<View> weakReference = this.f28727p;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // p007c.p190n.p194b.p334e.p339d.HeaderBehavior
        /* JADX INFO: renamed from: F */
        public int mo11073F(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // p007c.p190n.p194b.p334e.p339d.HeaderBehavior
        /* JADX INFO: renamed from: G */
        public int mo11074G(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // p007c.p190n.p194b.p334e.p339d.HeaderBehavior
        /* JADX INFO: renamed from: H */
        public int mo11075H() {
            return m11085B() + this.f28721j;
        }

        @Override // p007c.p190n.p194b.p334e.p339d.HeaderBehavior
        /* JADX INFO: renamed from: I */
        public void mo11076I(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            m12692S(coordinatorLayout, appBarLayout);
            if (appBarLayout.f28715p) {
                appBarLayout.m12682e(appBarLayout.m12683f(m12688O(coordinatorLayout)));
            }
        }

        @Override // p007c.p190n.p194b.p334e.p339d.HeaderBehavior
        /* JADX INFO: renamed from: L */
        public int mo11079L(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int top;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iMo11075H = mo11075H();
            int topInset = 0;
            if (i2 == 0 || iMo11075H < i2 || iMo11075H > i3) {
                this.f28721j = 0;
            } else {
                int iM16066k = C8162a.m16066k(i, i2, i3);
                if (iMo11075H != iM16066k) {
                    if (!appBarLayout.f28709j) {
                        top = iM16066k;
                        break;
                    }
                    int iAbs = Math.abs(iM16066k);
                    int childCount = appBarLayout.getChildCount();
                    int i4 = 0;
                    while (true) {
                        if (i4 < childCount) {
                            View childAt = appBarLayout.getChildAt(i4);
                            C5906c c5906c = (C5906c) childAt.getLayoutParams();
                            Interpolator interpolator = c5906c.f28733b;
                            if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i5 = c5906c.f28732a;
                                    if ((i5 & 1) != 0) {
                                        topInset = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) c5906c).topMargin + ((LinearLayout.LayoutParams) c5906c).bottomMargin;
                                        if ((i5 & 2) != 0) {
                                            AtomicInteger atomicInteger = ViewCompat.f38073a;
                                            topInset -= childAt.getMinimumHeight();
                                        }
                                    }
                                    AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                                    if (childAt.getFitsSystemWindows()) {
                                        topInset -= appBarLayout.getTopInset();
                                    }
                                    if (topInset > 0) {
                                        float f = topInset;
                                        top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iM16066k);
                                        break;
                                    }
                                }
                            } else {
                                i4++;
                            }
                        }
                        top = iM16066k;
                        break;
                    }
                    boolean zM11086D = m11086D(top);
                    int i6 = iMo11075H - iM16066k;
                    this.f28721j = iM16066k - top;
                    if (!zM11086D && appBarLayout.f28709j) {
                        coordinatorLayout.m289c(appBarLayout);
                    }
                    appBarLayout.m12680c(m11085B());
                    m12694U(coordinatorLayout, appBarLayout, iM16066k, iM16066k < iMo11075H ? -1 : 1, false);
                    topInset = i6;
                }
            }
            m12693T(coordinatorLayout, appBarLayout);
            return topInset;
        }

        /* JADX INFO: renamed from: M */
        public final void m12687M(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int iAbs = Math.abs(mo11075H() - i);
            float fAbs = Math.abs(f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t.getHeight()) + 1.0f) * 150.0f);
            int iMo11075H = mo11075H();
            if (iMo11075H == i) {
                ValueAnimator valueAnimator = this.f28723l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f28723l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f28723l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f28723l = valueAnimator3;
                valueAnimator3.setInterpolator(AnimationUtils.f24797e);
                this.f28723l.addUpdateListener(new AppBarLayout3(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f28723l.setDuration(Math.min(iRound, 600));
            this.f28723l.setIntValues(iMo11075H, i);
            this.f28723l.start();
        }

        /* JADX INFO: renamed from: O */
        public final View m12688O(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: P */
        public void m12689P(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int downNestedPreScrollRange;
            if (i != 0) {
                if (i < 0) {
                    int i3 = -appBarLayout.getTotalScrollRange();
                    i2 = i3;
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i3;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i2 != downNestedPreScrollRange) {
                    iArr[1] = m11077J(coordinatorLayout, appBarLayout, i, i2, downNestedPreScrollRange);
                }
            }
            if (appBarLayout.f28715p) {
                appBarLayout.m12682e(appBarLayout.m12683f(view));
            }
        }

        /* JADX INFO: renamed from: Q */
        public void m12690Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int[] iArr) {
            if (i < 0) {
                iArr[1] = m11077J(coordinatorLayout, appBarLayout, i, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i == 0) {
                m12693T(coordinatorLayout, appBarLayout);
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x002a  */
        /* JADX INFO: renamed from: R */
        public boolean m12691R(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = true;
            if ((i & 2) == 0) {
                z = false;
            } else if (!appBarLayout.f28715p) {
                if (!((appBarLayout.getTotalScrollRange() != 0) && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight())) {
                    z = false;
                }
            }
            if (z && (valueAnimator = this.f28723l) != null) {
                valueAnimator.cancel();
            }
            this.f28727p = null;
            this.f28722k = i2;
            return z;
        }

        /* JADX INFO: renamed from: S */
        public final void m12692S(CoordinatorLayout coordinatorLayout, T t) {
            int iMo11075H = mo11075H();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C5906c c5906c = (C5906c) childAt.getLayoutParams();
                if (m12686N(c5906c.f28732a, 32)) {
                    top -= ((LinearLayout.LayoutParams) c5906c).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c5906c).bottomMargin;
                }
                int i2 = -iMo11075H;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                C5906c c5906c2 = (C5906c) childAt2.getLayoutParams();
                int i3 = c5906c2.f28732a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        minimumHeight += t.getTopInset();
                    }
                    if (m12686N(i3, 2)) {
                        AtomicInteger atomicInteger = ViewCompat.f38073a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if (m12686N(i3, 5)) {
                        AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iMo11075H < minimumHeight2) {
                            i4 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (m12686N(i3, 32)) {
                        i4 += ((LinearLayout.LayoutParams) c5906c2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) c5906c2).bottomMargin;
                    }
                    if (iMo11075H < (minimumHeight + i4) / 2) {
                        i4 = minimumHeight;
                    }
                    m12687M(coordinatorLayout, t, C8162a.m16066k(i4, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* JADX INFO: renamed from: T */
        public final void m12693T(CoordinatorLayout coordinatorLayout, T t) {
            AccessibilityNodeInfoCompat.a aVar = AccessibilityNodeInfoCompat.a.f38022b;
            ViewCompat.m16324r(aVar.m16275a(), coordinatorLayout);
            ViewCompat.m16318l(coordinatorLayout, 0);
            AccessibilityNodeInfoCompat.a aVar2 = AccessibilityNodeInfoCompat.a.f38023c;
            ViewCompat.m16324r(aVar2.m16275a(), coordinatorLayout);
            ViewCompat.m16318l(coordinatorLayout, 0);
            View viewM12688O = m12688O(coordinatorLayout);
            if (viewM12688O == null || t.getTotalScrollRange() == 0 || !(((CoordinatorLayout.C0101f) viewM12688O.getLayoutParams()).f643a instanceof ScrollingViewBehavior)) {
                return;
            }
            if (mo11075H() != (-t.getTotalScrollRange()) && viewM12688O.canScrollVertically(1)) {
                ViewCompat.m16325s(coordinatorLayout, aVar, null, new AppBarLayout5(this, t, false));
            }
            if (mo11075H() != 0) {
                if (!viewM12688O.canScrollVertically(-1)) {
                    ViewCompat.m16325s(coordinatorLayout, aVar2, null, new AppBarLayout5(this, t, true));
                    return;
                }
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    ViewCompat.m16325s(coordinatorLayout, aVar2, null, new AppBarLayout4(this, coordinatorLayout, t, viewM12688O, i));
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005d  */
        /* JADX INFO: renamed from: U */
        public final void m12694U(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View childAt;
            boolean zM12683f;
            int iAbs = Math.abs(i);
            int childCount = t.getChildCount();
            boolean z2 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = t.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((C5906c) childAt.getLayoutParams()).f28732a;
                if ((i4 & 1) != 0) {
                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                    int minimumHeight = childAt.getMinimumHeight();
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - t.getTopInset() : (-i) < (childAt.getBottom() - minimumHeight) - t.getTopInset()) {
                        zM12683f = false;
                    } else {
                        zM12683f = true;
                    }
                } else {
                    zM12683f = false;
                }
                if (t.f28715p) {
                    zM12683f = t.m12683f(m12688O(coordinatorLayout));
                }
                boolean zM12682e = t.m12682e(zM12683f);
                if (!z) {
                    if (!zM12682e) {
                        return;
                    }
                    List<View> listM292f = coordinatorLayout.m292f(t);
                    int size = listM292f.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        CoordinatorLayout.AbstractC0098c abstractC0098c = ((CoordinatorLayout.C0101f) listM292f.get(i5).getLayoutParams()).f643a;
                        if (abstractC0098c instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) abstractC0098c).f24931f == 0) {
                                break;
                            }
                            z2 = true;
                            break;
                        }
                    }
                    if (!z2) {
                        return;
                    }
                }
                t.jumpDrawablesToCurrentState();
            }
        }

        @Override // p007c.p190n.p194b.p334e.p339d.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: k */
        public boolean mo319k(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo319k(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            int i2 = this.f28724m;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i2);
                int i3 = -childAt.getBottom();
                if (this.f28725n) {
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f28726o) + i3;
                }
                m11078K(coordinatorLayout, appBarLayout, iRound);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        m12687M(coordinatorLayout, appBarLayout, i4, 0.0f);
                    } else {
                        m11078K(coordinatorLayout, appBarLayout, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m12687M(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        m11078K(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f28710k = 0;
            this.f28724m = -1;
            m11086D(C8162a.m16066k(m11085B(), -appBarLayout.getTotalScrollRange(), 0));
            m12694U(coordinatorLayout, appBarLayout, m11085B(), 0, true);
            appBarLayout.m12680c(m11085B());
            m12693T(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: l */
        public boolean mo320l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0101f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.m300t(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: p */
        public /* bridge */ /* synthetic */ void mo324p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            m12689P(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: r */
        public /* bridge */ /* synthetic */ void mo326r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            m12690Q(coordinatorLayout, (AppBarLayout) view, i4, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: u */
        public void mo329u(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            if (!(parcelable instanceof C5903a)) {
                this.f28724m = -1;
                return;
            }
            C5903a c5903a = (C5903a) parcelable;
            this.f28724m = c5903a.f28728h;
            this.f28726o = c5903a.f28729i;
            this.f28725n = c5903a.f28730j;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: v */
        public Parcelable mo330v(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int iM11085B = m11085B();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iM11085B;
                if (childAt.getTop() + iM11085B <= 0 && bottom >= 0) {
                    C5903a c5903a = new C5903a(absSavedState);
                    c5903a.f28728h = i;
                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                    c5903a.f28730j = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    c5903a.f28729i = bottom / childAt.getHeight();
                    return c5903a;
                }
            }
            return absSavedState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: x */
        public /* bridge */ /* synthetic */ boolean mo332x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return m12691R(coordinatorLayout, (AppBarLayout) view, view2, i, i2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: z */
        public void mo334z(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f28722k == 0 || i == 1) {
                m12692S(coordinatorLayout, appBarLayout);
                if (appBarLayout.f28715p) {
                    appBarLayout.m12682e(appBarLayout.m12683f(view2));
                }
            }
            this.f28727p = new WeakReference<>(view2);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f28724m = -1;
        }

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public static class C5903a extends p636z0.p745m.p746a.AbsSavedState {
            public static final Parcelable.Creator<C5903a> CREATOR = new a();

            /* JADX INFO: renamed from: h */
            public int f28728h;

            /* JADX INFO: renamed from: i */
            public float f28729i;

            /* JADX INFO: renamed from: j */
            public boolean f28730j;

            /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a */
            public static class a implements Parcelable.ClassLoaderCreator<C5903a> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                public C5903a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C5903a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public Object[] newArray(int i) {
                    return new C5903a[i];
                }

                @Override // android.os.Parcelable.Creator
                public Object createFromParcel(Parcel parcel) {
                    return new C5903a(parcel, null);
                }
            }

            public C5903a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f28728h = parcel.readInt();
                this.f28729i = parcel.readFloat();
                this.f28730j = parcel.readByte() != 0;
            }

            @Override // p636z0.p745m.p746a.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f38150g, i);
                parcel.writeInt(this.f28728h);
                parcel.writeFloat(this.f28729i);
                parcel.writeByte(this.f28730j ? (byte) 1 : (byte) 0);
            }

            public C5903a(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C5906c(-1, -2);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 2132017845), attributeSet, i);
        this.f28706g = -1;
        this.f28707h = -1;
        this.f28708i = -1;
        this.f28710k = 0;
        Context context2 = getContext();
        setOrientation(1);
        int i2 = Build.VERSION.SDK_INT;
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        Context context3 = getContext();
        TypedArray typedArrayM11347d = ThemeEnforcement.m11347d(context3, attributeSet, ViewUtilsLollipop.f24941a, i, 2132017845, new int[0]);
        try {
            if (typedArrayM11347d.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayM11347d.getResourceId(0, 0)));
            }
            typedArrayM11347d.recycle();
            TypedArray typedArrayM11347d2 = ThemeEnforcement.m11347d(context2, attributeSet, C4801b.f24746a, i, 2132017845, new int[0]);
            Drawable drawable = typedArrayM11347d2.getDrawable(0);
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            setBackground(drawable);
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
                materialShapeDrawable.m11381q(ColorStateList.valueOf(colorDrawable.getColor()));
                materialShapeDrawable.f25574h.f25595b = new ElevationOverlayProvider(context2);
                materialShapeDrawable.m11365A();
                setBackground(materialShapeDrawable);
            }
            if (typedArrayM11347d2.hasValue(4)) {
                m12681d(typedArrayM11347d2.getBoolean(4, false), false, false);
            }
            if (typedArrayM11347d2.hasValue(3)) {
                ViewUtilsLollipop.m11089a(this, typedArrayM11347d2.getDimensionPixelSize(3, 0));
            }
            if (i2 >= 26) {
                if (typedArrayM11347d2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayM11347d2.getBoolean(2, false));
                }
                if (typedArrayM11347d2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayM11347d2.getBoolean(1, false));
                }
            }
            this.f28715p = typedArrayM11347d2.getBoolean(5, false);
            this.f28716q = typedArrayM11347d2.getResourceId(6, -1);
            setStatusBarForeground(typedArrayM11347d2.getDrawable(7));
            typedArrayM11347d2.recycle();
            ViewCompat.c.m16336d(this, new C5904a());
        } catch (Throwable th) {
            typedArrayM11347d.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C5906c(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C5906c(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public static class C5906c extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a */
        public int f28732a;

        /* JADX INFO: renamed from: b */
        public Interpolator f28733b;

        public C5906c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f28732a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4801b.f24747b);
            this.f28732a = typedArrayObtainStyledAttributes.getInt(0, 0);
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                this.f28733b = android.view.animation.AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public C5906c(int i, int i2) {
            super(i, i2);
            this.f28732a = 1;
        }

        public C5906c(int i, int i2, float f) {
            super(i, i2, f);
            this.f28732a = 1;
        }

        public C5906c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f28732a = 1;
        }

        public C5906c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f28732a = 1;
        }

        public C5906c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f28732a = 1;
        }

        public C5906c(C5906c c5906c) {
            super((LinearLayout.LayoutParams) c5906c);
            this.f28732a = 1;
            this.f28732a = c5906c.f28732a;
            this.f28733b = c5906c.f28733b;
        }
    }
}
