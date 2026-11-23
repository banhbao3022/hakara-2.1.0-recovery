package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.p645c.WindowDecorActionBar;
import p636z0.p644b.p651g.ViewPropertyAnimatorCompatSet;
import p636z0.p644b.p651g.p652i.MenuPresenter;
import p636z0.p644b.p653h.DecorContentParent;
import p636z0.p644b.p653h.DecorToolbar;
import p636z0.p725k.p729e.Insets;
import p636z0.p725k.p739l.NestedScrollingParent2;
import p636z0.p725k.p739l.NestedScrollingParent3;
import p636z0.p725k.p739l.NestedScrollingParentHelper;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.WindowInsetsCompat;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent2, NestedScrollingParent3 {

    /* JADX INFO: renamed from: f */
    public static final int[] f297f = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: A */
    public WindowInsetsCompat f298A;

    /* JADX INFO: renamed from: B */
    public WindowInsetsCompat f299B;

    /* JADX INFO: renamed from: C */
    public WindowInsetsCompat f300C;

    /* JADX INFO: renamed from: D */
    public WindowInsetsCompat f301D;

    /* JADX INFO: renamed from: E */
    public InterfaceC0059d f302E;

    /* JADX INFO: renamed from: F */
    public OverScroller f303F;

    /* JADX INFO: renamed from: G */
    public ViewPropertyAnimator f304G;

    /* JADX INFO: renamed from: H */
    public final AnimatorListenerAdapter f305H;

    /* JADX INFO: renamed from: I */
    public final Runnable f306I;

    /* JADX INFO: renamed from: J */
    public final Runnable f307J;

    /* JADX INFO: renamed from: K */
    public final NestedScrollingParentHelper f308K;

    /* JADX INFO: renamed from: g */
    public int f309g;

    /* JADX INFO: renamed from: h */
    public int f310h;

    /* JADX INFO: renamed from: i */
    public ContentFrameLayout f311i;

    /* JADX INFO: renamed from: j */
    public ActionBarContainer f312j;

    /* JADX INFO: renamed from: k */
    public DecorToolbar f313k;

    /* JADX INFO: renamed from: l */
    public Drawable f314l;

    /* JADX INFO: renamed from: m */
    public boolean f315m;

    /* JADX INFO: renamed from: n */
    public boolean f316n;

    /* JADX INFO: renamed from: o */
    public boolean f317o;

    /* JADX INFO: renamed from: p */
    public boolean f318p;

    /* JADX INFO: renamed from: q */
    public boolean f319q;

    /* JADX INFO: renamed from: r */
    public int f320r;

    /* JADX INFO: renamed from: s */
    public int f321s;

    /* JADX INFO: renamed from: t */
    public final Rect f322t;

    /* JADX INFO: renamed from: u */
    public final Rect f323u;

    /* JADX INFO: renamed from: v */
    public final Rect f324v;

    /* JADX INFO: renamed from: w */
    public final Rect f325w;

    /* JADX INFO: renamed from: x */
    public final Rect f326x;

    /* JADX INFO: renamed from: y */
    public final Rect f327y;

    /* JADX INFO: renamed from: z */
    public final Rect f328z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0056a extends AnimatorListenerAdapter {
        public C0056a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f304G = null;
            actionBarOverlayLayout.f319q = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f304G = null;
            actionBarOverlayLayout.f319q = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class RunnableC0057b implements Runnable {
        public RunnableC0057b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m176q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f304G = actionBarOverlayLayout.f312j.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f305H);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class RunnableC0058c implements Runnable {
        public RunnableC0058c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m176q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f304G = actionBarOverlayLayout.f312j.animate().translationY(-ActionBarOverlayLayout.this.f312j.getHeight()).setListener(ActionBarOverlayLayout.this.f305H);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface InterfaceC0059d {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0060e extends ViewGroup.MarginLayoutParams {
        public C0060e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0060e(int i, int i2) {
            super(i, i2);
        }

        public C0060e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0060e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // p636z0.p644b.p653h.DecorContentParent
    /* JADX INFO: renamed from: a */
    public void mo160a(Menu menu, MenuPresenter.a aVar) {
        m178s();
        this.f313k.mo14851a(menu, aVar);
    }

    @Override // p636z0.p644b.p653h.DecorContentParent
    /* JADX INFO: renamed from: b */
    public boolean mo161b() {
        m178s();
        return this.f313k.mo14852b();
    }

    @Override // p636z0.p644b.p653h.DecorContentParent
    /* JADX INFO: renamed from: c */
    public void mo162c() {
        m178s();
        this.f313k.mo14853c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0060e;
    }

    @Override // p636z0.p644b.p653h.DecorContentParent
    /* JADX INFO: renamed from: d */
    public boolean mo163d() {
        m178s();
        return this.f313k.mo14854d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f314l == null || this.f315m) {
            return;
        }
        if (this.f312j.getVisibility() == 0) {
            translationY = (int) (this.f312j.getTranslationY() + this.f312j.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f314l.setBounds(0, translationY, getWidth(), this.f314l.getIntrinsicHeight() + translationY);
        this.f314l.draw(canvas);
    }

    @Override // p636z0.p644b.p653h.DecorContentParent
    /* JADX INFO: renamed from: e */
    public boolean mo164e() {
        m178s();
        return this.f313k.mo14855e();
    }

    @Override // p636z0.p644b.p653h.DecorContentParent
    /* JADX INFO: renamed from: f */
    public boolean mo165f() {
        m178s();
        return this.f313k.mo14856f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // p636z0.p644b.p653h.DecorContentParent
    /* JADX INFO: renamed from: g */
    public boolean mo166g() {
        m178s();
        return this.f313k.mo14857g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0060e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0060e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f312j;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f308K.m16301a();
    }

    public CharSequence getTitle() {
        m178s();
        return this.f313k.getTitle();
    }

    @Override // p636z0.p644b.p653h.DecorContentParent
    /* JADX INFO: renamed from: h */
    public void mo167h(int i) {
        m178s();
        if (i == 2) {
            this.f313k.mo14871u();
        } else if (i == 5) {
            this.f313k.mo14872v();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // p636z0.p644b.p653h.DecorContentParent
    /* JADX INFO: renamed from: i */
    public void mo168i() {
        m178s();
        this.f313k.mo14858h();
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent3
    /* JADX INFO: renamed from: j */
    public void mo169j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent2
    /* JADX INFO: renamed from: k */
    public void mo170k(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent2
    /* JADX INFO: renamed from: l */
    public boolean mo171l(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent2
    /* JADX INFO: renamed from: m */
    public void mo172m(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent2
    /* JADX INFO: renamed from: n */
    public void mo173n(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent2
    /* JADX INFO: renamed from: o */
    public void mo174o(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m178s();
        WindowInsetsCompat windowInsetsCompatM16225j = WindowInsetsCompat.m16225j(windowInsets, this);
        boolean zM175p = m175p(this.f312j, new Rect(windowInsetsCompatM16225j.m16228c(), windowInsetsCompatM16225j.m16230e(), windowInsetsCompatM16225j.m16229d(), windowInsetsCompatM16225j.m16227b()), true, true, false, true);
        Rect rect = this.f322t;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        ViewCompat.c.m16334b(this, windowInsetsCompatM16225j, rect);
        Rect rect2 = this.f322t;
        WindowInsetsCompat windowInsetsCompatMo16243j = windowInsetsCompatM16225j.f37981b.mo16243j(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f298A = windowInsetsCompatMo16243j;
        boolean z = true;
        if (!this.f299B.equals(windowInsetsCompatMo16243j)) {
            this.f299B = this.f298A;
            zM175p = true;
        }
        if (this.f323u.equals(this.f322t)) {
            z = zM175p;
        } else {
            this.f323u.set(this.f322t);
        }
        if (z) {
            requestLayout();
        }
        return windowInsetsCompatM16225j.f37981b.mo16254a().m16226a().f37981b.mo16249b().m16232h();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m177r(getContext());
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m176q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0060e c0060e = (C0060e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0060e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0060e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        m178s();
        measureChildWithMargins(this.f312j, i, 0, i2, 0);
        C0060e c0060e = (C0060e) this.f312j.getLayoutParams();
        int iMax = Math.max(0, this.f312j.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0060e).leftMargin + ((ViewGroup.MarginLayoutParams) c0060e).rightMargin);
        int iMax2 = Math.max(0, this.f312j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0060e).topMargin + ((ViewGroup.MarginLayoutParams) c0060e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f312j.getMeasuredState());
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f309g;
            if (this.f317o && this.f312j.getTabContainer() != null) {
                measuredHeight += this.f309g;
            }
        } else {
            measuredHeight = this.f312j.getVisibility() != 8 ? this.f312j.getMeasuredHeight() : 0;
        }
        this.f324v.set(this.f322t);
        WindowInsetsCompat windowInsetsCompat = this.f298A;
        this.f300C = windowInsetsCompat;
        if (this.f316n || z) {
            Insets insetsM16166a = Insets.m16166a(windowInsetsCompat.m16228c(), this.f300C.m16230e() + measuredHeight, this.f300C.m16229d(), this.f300C.m16227b() + 0);
            WindowInsetsCompat.b bVar = new WindowInsetsCompat.b(this.f300C);
            bVar.f37986a.mo16237d(insetsM16166a);
            this.f300C = bVar.m16233a();
        } else {
            Rect rect = this.f324v;
            rect.top += measuredHeight;
            rect.bottom += 0;
            this.f300C = windowInsetsCompat.f37981b.mo16243j(0, measuredHeight, 0, 0);
        }
        m175p(this.f311i, this.f324v, true, true, true, true);
        if (!this.f301D.equals(this.f300C)) {
            WindowInsetsCompat windowInsetsCompat2 = this.f300C;
            this.f301D = windowInsetsCompat2;
            ViewCompat.m16311e(this.f311i, windowInsetsCompat2);
        }
        measureChildWithMargins(this.f311i, i, 0, i2, 0);
        C0060e c0060e2 = (C0060e) this.f311i.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f311i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0060e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0060e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f311i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0060e2).topMargin + ((ViewGroup.MarginLayoutParams) c0060e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f311i.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f318p || !z) {
            return false;
        }
        this.f303F.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f303F.getFinalY() > this.f312j.getHeight()) {
            m176q();
            this.f307J.run();
        } else {
            m176q();
            this.f306I.run();
        }
        this.f319q = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f320r + i2;
        this.f320r = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        WindowDecorActionBar windowDecorActionBar;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet;
        this.f308K.f38067a = i;
        this.f320r = getActionBarHideOffset();
        m176q();
        InterfaceC0059d interfaceC0059d = this.f302E;
        if (interfaceC0059d == null || (viewPropertyAnimatorCompatSet = (windowDecorActionBar = (WindowDecorActionBar) interfaceC0059d).f34576v) == null) {
            return;
        }
        viewPropertyAnimatorCompatSet.m14737a();
        windowDecorActionBar.f34576v = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f312j.getVisibility() != 0) {
            return false;
        }
        return this.f318p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f318p && !this.f319q) {
            if (this.f320r <= this.f312j.getHeight()) {
                m176q();
                postDelayed(this.f306I, 600L);
            } else {
                m176q();
                postDelayed(this.f307J, 600L);
            }
        }
        InterfaceC0059d interfaceC0059d = this.f302E;
        if (interfaceC0059d != null) {
            Objects.requireNonNull((WindowDecorActionBar) interfaceC0059d);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m178s();
        int i2 = this.f321s ^ i;
        this.f321s = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0059d interfaceC0059d = this.f302E;
        if (interfaceC0059d != null) {
            ((WindowDecorActionBar) interfaceC0059d).f34572r = !z2;
            if (z || !z2) {
                WindowDecorActionBar windowDecorActionBar = (WindowDecorActionBar) interfaceC0059d;
                if (windowDecorActionBar.f34573s) {
                    windowDecorActionBar.f34573s = false;
                    windowDecorActionBar.m14691y(true);
                }
            } else {
                WindowDecorActionBar windowDecorActionBar2 = (WindowDecorActionBar) interfaceC0059d;
                if (!windowDecorActionBar2.f34573s) {
                    windowDecorActionBar2.f34573s = true;
                    windowDecorActionBar2.m14691y(true);
                }
            }
        }
        if ((i2 & 256) == 0 || this.f302E == null) {
            return;
        }
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f310h = i;
        InterfaceC0059d interfaceC0059d = this.f302E;
        if (interfaceC0059d != null) {
            ((WindowDecorActionBar) interfaceC0059d).f34571q = i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final boolean m175p(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        C0060e c0060e = (C0060e) view.getLayoutParams();
        if (z) {
            int i = ((ViewGroup.MarginLayoutParams) c0060e).leftMargin;
            int i2 = rect.left;
            if (i != i2) {
                ((ViewGroup.MarginLayoutParams) c0060e).leftMargin = i2;
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        if (z2) {
            int i3 = ((ViewGroup.MarginLayoutParams) c0060e).topMargin;
            int i4 = rect.top;
            if (i3 != i4) {
                ((ViewGroup.MarginLayoutParams) c0060e).topMargin = i4;
                z5 = true;
            }
        }
        if (z4) {
            int i5 = ((ViewGroup.MarginLayoutParams) c0060e).rightMargin;
            int i6 = rect.right;
            if (i5 != i6) {
                ((ViewGroup.MarginLayoutParams) c0060e).rightMargin = i6;
                z5 = true;
            }
        }
        if (z3) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0060e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0060e).bottomMargin = i8;
                return true;
            }
        }
        return z5;
    }

    /* JADX INFO: renamed from: q */
    public void m176q() {
        removeCallbacks(this.f306I);
        removeCallbacks(this.f307J);
        ViewPropertyAnimator viewPropertyAnimator = this.f304G;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m177r(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f297f);
        this.f309g = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f314l = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f315m = context.getApplicationInfo().targetSdkVersion < 19;
        this.f303F = new OverScroller(context);
    }

    /* JADX INFO: renamed from: s */
    public void m178s() {
        DecorToolbar wrapper;
        if (this.f311i == null) {
            this.f311i = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f312j = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof DecorToolbar) {
                wrapper = (DecorToolbar) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    StringBuilder sbM1556G = outline.m1556G("Can't make a decor toolbar out of ");
                    sbM1556G.append(callbackFindViewById.getClass().getSimpleName());
                    throw new IllegalStateException(sbM1556G.toString());
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f313k = wrapper;
        }
    }

    public void setActionBarHideOffset(int i) {
        m176q();
        this.f312j.setTranslationY(-Math.max(0, Math.min(i, this.f312j.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0059d interfaceC0059d) {
        this.f302E = interfaceC0059d;
        if (getWindowToken() != null) {
            ((WindowDecorActionBar) this.f302E).f34571q = this.f310h;
            int i = this.f321s;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f317o = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f318p) {
            this.f318p = z;
            if (z) {
                return;
            }
            m176q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m178s();
        this.f313k.setIcon(i);
    }

    public void setLogo(int i) {
        m178s();
        this.f313k.mo14863m(i);
    }

    public void setOverlayMode(boolean z) {
        this.f316n = z;
        this.f315m = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p636z0.p644b.p653h.DecorContentParent
    public void setWindowCallback(Window.Callback callback) {
        m178s();
        this.f313k.setWindowCallback(callback);
    }

    @Override // p636z0.p644b.p653h.DecorContentParent
    public void setWindowTitle(CharSequence charSequence) {
        m178s();
        this.f313k.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f310h = 0;
        this.f322t = new Rect();
        this.f323u = new Rect();
        this.f324v = new Rect();
        this.f325w = new Rect();
        this.f326x = new Rect();
        this.f327y = new Rect();
        this.f328z = new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.f37980a;
        this.f298A = windowInsetsCompat;
        this.f299B = windowInsetsCompat;
        this.f300C = windowInsetsCompat;
        this.f301D = windowInsetsCompat;
        this.f305H = new C0056a();
        this.f306I = new RunnableC0057b();
        this.f307J = new RunnableC0058c();
        m177r(context);
        this.f308K = new NestedScrollingParentHelper(this);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0060e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m178s();
        this.f313k.setIcon(drawable);
    }
}
