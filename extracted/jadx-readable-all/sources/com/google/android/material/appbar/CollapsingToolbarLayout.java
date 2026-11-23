package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p337c.AnimationUtils;
import p007c.p190n.p194b.p334e.p339d.CollapsingToolbarLayout2;
import p007c.p190n.p194b.p334e.p339d.ViewOffsetHelper;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p360t.CollapsingTextHelper;
import p007c.p190n.p194b.p334e.p360t.DescendantOffsetUtils;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p725k.p739l.OnApplyWindowInsetsListener;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.WindowInsetsCompat;

/* JADX INFO: loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public int f28734A;

    /* JADX INFO: renamed from: B */
    public WindowInsetsCompat f28735B;

    /* JADX INFO: renamed from: f */
    public boolean f28736f;

    /* JADX INFO: renamed from: g */
    public int f28737g;

    /* JADX INFO: renamed from: h */
    public ViewGroup f28738h;

    /* JADX INFO: renamed from: i */
    public View f28739i;

    /* JADX INFO: renamed from: j */
    public View f28740j;

    /* JADX INFO: renamed from: k */
    public int f28741k;

    /* JADX INFO: renamed from: l */
    public int f28742l;

    /* JADX INFO: renamed from: m */
    public int f28743m;

    /* JADX INFO: renamed from: n */
    public int f28744n;

    /* JADX INFO: renamed from: o */
    public final Rect f28745o;

    /* JADX INFO: renamed from: p */
    public final CollapsingTextHelper f28746p;

    /* JADX INFO: renamed from: q */
    public boolean f28747q;

    /* JADX INFO: renamed from: r */
    public boolean f28748r;

    /* JADX INFO: renamed from: s */
    public Drawable f28749s;

    /* JADX INFO: renamed from: t */
    public Drawable f28750t;

    /* JADX INFO: renamed from: u */
    public int f28751u;

    /* JADX INFO: renamed from: v */
    public boolean f28752v;

    /* JADX INFO: renamed from: w */
    public ValueAnimator f28753w;

    /* JADX INFO: renamed from: x */
    public long f28754x;

    /* JADX INFO: renamed from: y */
    public int f28755y;

    /* JADX INFO: renamed from: z */
    public AppBarLayout.InterfaceC5907d f28756z;

    /* JADX INFO: renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    public class C5908a implements OnApplyWindowInsetsListener {
        public C5908a() {
        }

        @Override // p636z0.p725k.p739l.OnApplyWindowInsetsListener
        /* JADX INFO: renamed from: a */
        public WindowInsetsCompat mo307a(View view, WindowInsetsCompat windowInsetsCompat) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            Objects.requireNonNull(collapsingToolbarLayout);
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            WindowInsetsCompat windowInsetsCompat2 = collapsingToolbarLayout.getFitsSystemWindows() ? windowInsetsCompat : null;
            if (!Objects.equals(collapsingToolbarLayout.f28735B, windowInsetsCompat2)) {
                collapsingToolbarLayout.f28735B = windowInsetsCompat2;
                collapsingToolbarLayout.requestLayout();
            }
            return windowInsetsCompat.m16226a();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    public class C5910c implements AppBarLayout.InterfaceC5907d {
        public C5910c() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC5905b
        /* JADX INFO: renamed from: a */
        public void mo12696a(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f28734A = i;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.f28735B;
            int iM16230e = windowInsetsCompat != null ? windowInsetsCompat.m16230e() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                C5909b c5909b = (C5909b) childAt.getLayoutParams();
                ViewOffsetHelper viewOffsetHelperM12698d = CollapsingToolbarLayout.m12698d(childAt);
                int i3 = c5909b.f28758a;
                if (i3 == 1) {
                    viewOffsetHelperM12698d.m11088b(C8162a.m16066k(-i, 0, CollapsingToolbarLayout.this.m12700c(childAt)));
                } else if (i3 == 2) {
                    viewOffsetHelperM12698d.m11088b(Math.round((-i) * c5909b.f28759b));
                }
            }
            CollapsingToolbarLayout.this.m12702f();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f28750t != null && iM16230e > 0) {
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                collapsingToolbarLayout2.postInvalidateOnAnimation();
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            AtomicInteger atomicInteger2 = ViewCompat.f38073a;
            CollapsingToolbarLayout.this.f28746p.m11325w(Math.abs(i) / ((height - collapsingToolbarLayout3.getMinimumHeight()) - iM16230e));
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: b */
    public static int m12697b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: d */
    public static ViewOffsetHelper m12698d(View view) {
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(R.id.view_offset_helper);
        if (viewOffsetHelper != null) {
            return viewOffsetHelper;
        }
        ViewOffsetHelper viewOffsetHelper2 = new ViewOffsetHelper(view);
        view.setTag(R.id.view_offset_helper, viewOffsetHelper2);
        return viewOffsetHelper2;
    }

    /* JADX INFO: renamed from: a */
    public final void m12699a() {
        View view;
        if (this.f28736f) {
            ViewGroup viewGroup = null;
            this.f28738h = null;
            this.f28739i = null;
            int i = this.f28737g;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.f28738h = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    while (true) {
                        if (parent == this) {
                            view = viewGroup2;
                            break;
                        } else {
                            if (parent == null) {
                                break;
                            }
                            if (parent instanceof View) {
                                view = (View) parent;
                            }
                            parent = parent.getParent();
                            view = view;
                        }
                    }
                    this.f28739i = view;
                }
            }
            if (this.f28738h == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f28738h = viewGroup;
            }
            m12701e();
            this.f28736f = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m12700c(View view) {
        return ((getHeight() - m12698d(view).f24935b) - view.getHeight()) - ((FrameLayout.LayoutParams) ((C5909b) view.getLayoutParams())).bottomMargin;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5909b;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        m12699a();
        if (this.f28738h == null && (drawable = this.f28749s) != null && this.f28751u > 0) {
            drawable.mutate().setAlpha(this.f28751u);
            this.f28749s.draw(canvas);
        }
        if (this.f28747q && this.f28748r) {
            this.f28746p.m11311g(canvas);
        }
        if (this.f28750t == null || this.f28751u <= 0) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f28735B;
        int iM16230e = windowInsetsCompat != null ? windowInsetsCompat.m16230e() : 0;
        if (iM16230e > 0) {
            this.f28750t.setBounds(0, -this.f28734A, getWidth(), iM16230e - this.f28734A);
            this.f28750t.mutate().setAlpha(this.f28751u);
            this.f28750t.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001d  */
    /* JADX WARN: Code duplicated, block: B:18:0x002d  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
    
        r3 = true;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean drawChild(android.graphics.Canvas r5, android.view.View r6, long r7) {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f28749s
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2d
            int r3 = r4.f28751u
            if (r3 <= 0) goto L2d
            android.view.View r3 = r4.f28739i
            if (r3 == 0) goto L14
            if (r3 != r4) goto L11
            goto L14
        L11:
            if (r6 != r3) goto L1a
            goto L18
        L14:
            android.view.ViewGroup r3 = r4.f28738h
            if (r6 != r3) goto L1a
        L18:
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 == 0) goto L2d
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r4.f28751u
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r4.f28749s
            r0.draw(r5)
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            boolean r5 = super.drawChild(r5, r6, r7)
            if (r5 != 0) goto L38
            if (r0 == 0) goto L37
            goto L38
        L37:
            r1 = 0
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f28750t;
        boolean zM11327y = false;
        if (drawable != null && drawable.isStateful()) {
            zM11327y = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f28749s;
        if (drawable2 != null && drawable2.isStateful()) {
            zM11327y |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper = this.f28746p;
        if (collapsingTextHelper != null) {
            zM11327y |= collapsingTextHelper.m11327y(drawableState);
        }
        if (zM11327y) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12701e() {
        View view;
        if (!this.f28747q && (view = this.f28740j) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f28740j);
            }
        }
        if (!this.f28747q || this.f28738h == null) {
            return;
        }
        if (this.f28740j == null) {
            this.f28740j = new View(getContext());
        }
        if (this.f28740j.getParent() == null) {
            this.f28738h.addView(this.f28740j, -1, -1);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12702f() {
        if (this.f28749s == null && this.f28750t == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f28734A < getScrimVisibleHeightTrigger());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C5909b(-1, -1);
    }

    public int getCollapsedTitleGravity() {
        return this.f28746p.f25446h;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f28746p.f25457s;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.f28749s;
    }

    public int getExpandedTitleGravity() {
        return this.f28746p.f25445g;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f28744n;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f28743m;
    }

    public int getExpandedTitleMarginStart() {
        return this.f28741k;
    }

    public int getExpandedTitleMarginTop() {
        return this.f28742l;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f28746p.f25458t;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getMaxLines() {
        return this.f28746p.f25438Y;
    }

    public int getScrimAlpha() {
        return this.f28751u;
    }

    public long getScrimAnimationDuration() {
        return this.f28754x;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f28755y;
        if (i >= 0) {
            return i;
        }
        WindowInsetsCompat windowInsetsCompat = this.f28735B;
        int iM16230e = windowInsetsCompat != null ? windowInsetsCompat.m16230e() : 0;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iM16230e, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f28750t;
    }

    public CharSequence getTitle() {
        if (this.f28747q) {
            return this.f28746p.f25462x;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object parent = getParent();
        if (parent instanceof AppBarLayout) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            setFitsSystemWindows(((View) parent).getFitsSystemWindows());
            if (this.f28756z == null) {
                this.f28756z = new C5910c();
            }
            ((AppBarLayout) parent).m12678a(this.f28756z);
            requestApplyInsets();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        List<AppBarLayout.InterfaceC5905b> list;
        ViewParent parent = getParent();
        AppBarLayout.InterfaceC5907d interfaceC5907d = this.f28756z;
        if (interfaceC5907d != null && (parent instanceof AppBarLayout) && (list = ((AppBarLayout) parent).f28712m) != null && interfaceC5907d != null) {
            list.remove(interfaceC5907d);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int titleMarginBottom;
        int titleMarginStart;
        int titleMarginEnd;
        int titleMarginTop;
        super.onLayout(z, i, i2, i3, i4);
        WindowInsetsCompat windowInsetsCompat = this.f28735B;
        if (windowInsetsCompat != null) {
            int iM16230e = windowInsetsCompat.m16230e();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iM16230e) {
                    ViewCompat.m16320n(childAt, iM16230e);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            ViewOffsetHelper viewOffsetHelperM12698d = m12698d(getChildAt(i6));
            viewOffsetHelperM12698d.f24935b = viewOffsetHelperM12698d.f24934a.getTop();
            viewOffsetHelperM12698d.f24936c = viewOffsetHelperM12698d.f24934a.getLeft();
        }
        if (this.f28747q && (view = this.f28740j) != null) {
            AtomicInteger atomicInteger2 = ViewCompat.f38073a;
            boolean z2 = view.isAttachedToWindow() && this.f28740j.getVisibility() == 0;
            this.f28748r = z2;
            if (z2) {
                boolean z3 = getLayoutDirection() == 1;
                View view2 = this.f28739i;
                if (view2 == null) {
                    view2 = this.f28738h;
                }
                int iM12700c = m12700c(view2);
                DescendantOffsetUtils.m11330a(this, this.f28740j, this.f28745o);
                ViewGroup viewGroup = this.f28738h;
                if (viewGroup instanceof Toolbar) {
                    Toolbar toolbar = (Toolbar) viewGroup;
                    titleMarginStart = toolbar.getTitleMarginStart();
                    titleMarginEnd = toolbar.getTitleMarginEnd();
                    titleMarginTop = toolbar.getTitleMarginTop();
                    titleMarginBottom = toolbar.getTitleMarginBottom();
                } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
                    titleMarginBottom = 0;
                    titleMarginStart = 0;
                    titleMarginEnd = 0;
                    titleMarginTop = 0;
                } else {
                    android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                    titleMarginStart = toolbar2.getTitleMarginStart();
                    titleMarginEnd = toolbar2.getTitleMarginEnd();
                    titleMarginTop = toolbar2.getTitleMarginTop();
                    titleMarginBottom = toolbar2.getTitleMarginBottom();
                }
                CollapsingTextHelper collapsingTextHelper = this.f28746p;
                Rect rect = this.f28745o;
                int i7 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
                int i8 = rect.top + iM12700c + titleMarginTop;
                int i9 = rect.right;
                if (!z3) {
                    titleMarginStart = titleMarginEnd;
                }
                int i10 = i9 - titleMarginStart;
                int i11 = (rect.bottom + iM12700c) - titleMarginBottom;
                if (!CollapsingTextHelper.m11304n(collapsingTextHelper.f25443e, i7, i8, i10, i11)) {
                    collapsingTextHelper.f25443e.set(i7, i8, i10, i11);
                    collapsingTextHelper.f25418E = true;
                    collapsingTextHelper.m11315l();
                }
                CollapsingTextHelper collapsingTextHelper2 = this.f28746p;
                int i12 = z3 ? this.f28743m : this.f28741k;
                int i13 = this.f28745o.top + this.f28742l;
                int i14 = (i3 - i) - (z3 ? this.f28741k : this.f28743m);
                int i15 = (i4 - i2) - this.f28744n;
                if (!CollapsingTextHelper.m11304n(collapsingTextHelper2.f25442d, i12, i13, i14, i15)) {
                    collapsingTextHelper2.f25442d.set(i12, i13, i14, i15);
                    collapsingTextHelper2.f25418E = true;
                    collapsingTextHelper2.m11315l();
                }
                this.f28746p.m11316m();
            }
        }
        if (this.f28738h != null && this.f28747q && TextUtils.isEmpty(this.f28746p.f25462x)) {
            ViewGroup viewGroup2 = this.f28738h;
            setTitle(viewGroup2 instanceof Toolbar ? ((Toolbar) viewGroup2).getTitle() : viewGroup2 instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup2).getTitle() : null);
        }
        m12702f();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            m12698d(getChildAt(i16)).m11087a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        m12699a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        WindowInsetsCompat windowInsetsCompat = this.f28735B;
        int iM16230e = windowInsetsCompat != null ? windowInsetsCompat.m16230e() : 0;
        if (mode == 0 && iM16230e > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iM16230e, 1073741824));
        }
        ViewGroup viewGroup = this.f28738h;
        if (viewGroup != null) {
            View view = this.f28739i;
            if (view == null || view == this) {
                setMinimumHeight(m12697b(viewGroup));
            } else {
                setMinimumHeight(m12697b(view));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f28749s;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        CollapsingTextHelper collapsingTextHelper = this.f28746p;
        if (collapsingTextHelper.f25446h != i) {
            collapsingTextHelper.f25446h = i;
            collapsingTextHelper.m11316m();
        }
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f28746p.m11317o(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f28746p.m11320r(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f28749s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f28749s = drawableMutate;
            if (drawableMutate != null) {
                drawableMutate.setBounds(0, 0, getWidth(), getHeight());
                this.f28749s.setCallback(this);
                this.f28749s.setAlpha(this.f28751u);
            }
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        Context context = getContext();
        Object obj = ContextCompat.f37815a;
        setContentScrim(ContextCompat.c.m16141b(context, i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        CollapsingTextHelper collapsingTextHelper = this.f28746p;
        if (collapsingTextHelper.f25445g != i) {
            collapsingTextHelper.f25445g = i;
            collapsingTextHelper.m11316m();
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f28744n = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f28743m = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f28741k = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f28742l = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f28746p.m11321s(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        CollapsingTextHelper collapsingTextHelper = this.f28746p;
        if (collapsingTextHelper.f25449k != colorStateList) {
            collapsingTextHelper.f25449k = colorStateList;
            collapsingTextHelper.m11316m();
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f28746p.m11324v(typeface);
    }

    public void setMaxLines(int i) {
        CollapsingTextHelper collapsingTextHelper = this.f28746p;
        if (i != collapsingTextHelper.f25438Y) {
            collapsingTextHelper.f25438Y = i;
            collapsingTextHelper.m11310f();
            collapsingTextHelper.m11316m();
        }
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f28751u) {
            if (this.f28749s != null && (viewGroup = this.f28738h) != null) {
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.f28751u = i;
            AtomicInteger atomicInteger2 = ViewCompat.f38073a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j2) {
        this.f28754x = j2;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f28755y != i) {
            this.f28755y = i;
            m12702f();
        }
    }

    public void setScrimsShown(boolean z) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.f28752v != z) {
            if (z2) {
                int i = z ? 255 : 0;
                m12699a();
                ValueAnimator valueAnimator = this.f28753w;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f28753w = valueAnimator2;
                    valueAnimator2.setDuration(this.f28754x);
                    this.f28753w.setInterpolator(i > this.f28751u ? AnimationUtils.f24795c : AnimationUtils.f24796d);
                    this.f28753w.addUpdateListener(new CollapsingToolbarLayout2(this));
                } else if (valueAnimator.isRunning()) {
                    this.f28753w.cancel();
                }
                this.f28753w.setIntValues(this.f28751u, i);
                this.f28753w.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.f28752v = z;
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f28750t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f28750t = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f28750t.setState(getDrawableState());
                }
                Drawable drawable3 = this.f28750t;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                C8162a.m16043N(drawable3, getLayoutDirection());
                this.f28750t.setVisible(getVisibility() == 0, false);
                this.f28750t.setCallback(this);
                this.f28750t.setAlpha(this.f28751u);
            }
            AtomicInteger atomicInteger2 = ViewCompat.f38073a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        Context context = getContext();
        Object obj = ContextCompat.f37815a;
        setStatusBarScrim(ContextCompat.c.m16141b(context, i));
    }

    public void setTitle(CharSequence charSequence) {
        this.f28746p.m11328z(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f28747q) {
            this.f28747q = z;
            setContentDescription(getTitle());
            m12701e();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f28750t;
        if (drawable != null && drawable.isVisible() != z) {
            this.f28750t.setVisible(z, false);
        }
        Drawable drawable2 = this.f28749s;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.f28749s.setVisible(z, false);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f28749s || drawable == this.f28750t;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new C5909b(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C5909b(getContext(), attributeSet);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        CollapsingTextHelper collapsingTextHelper = this.f28746p;
        if (collapsingTextHelper.f25450l != colorStateList) {
            collapsingTextHelper.f25450l = colorStateList;
            collapsingTextHelper.m11316m();
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 2132017848), attributeSet, i);
        this.f28736f = true;
        this.f28745o = new Rect();
        this.f28755y = -1;
        Context context2 = getContext();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.f28746p = collapsingTextHelper;
        collapsingTextHelper.f25422I = AnimationUtils.f24797e;
        collapsingTextHelper.m11316m();
        TypedArray typedArrayM11347d = ThemeEnforcement.m11347d(context2, attributeSet, C4801b.f24757l, i, 2132017848, new int[0]);
        collapsingTextHelper.m11323u(typedArrayM11347d.getInt(3, 8388691));
        collapsingTextHelper.m11319q(typedArrayM11347d.getInt(0, 8388627));
        int dimensionPixelSize = typedArrayM11347d.getDimensionPixelSize(4, 0);
        this.f28744n = dimensionPixelSize;
        this.f28743m = dimensionPixelSize;
        this.f28742l = dimensionPixelSize;
        this.f28741k = dimensionPixelSize;
        if (typedArrayM11347d.hasValue(7)) {
            this.f28741k = typedArrayM11347d.getDimensionPixelSize(7, 0);
        }
        if (typedArrayM11347d.hasValue(6)) {
            this.f28743m = typedArrayM11347d.getDimensionPixelSize(6, 0);
        }
        if (typedArrayM11347d.hasValue(8)) {
            this.f28742l = typedArrayM11347d.getDimensionPixelSize(8, 0);
        }
        if (typedArrayM11347d.hasValue(5)) {
            this.f28744n = typedArrayM11347d.getDimensionPixelSize(5, 0);
        }
        this.f28747q = typedArrayM11347d.getBoolean(15, true);
        setTitle(typedArrayM11347d.getText(14));
        collapsingTextHelper.m11321s(2132017596);
        collapsingTextHelper.m11317o(2132017561);
        if (typedArrayM11347d.hasValue(9)) {
            collapsingTextHelper.m11321s(typedArrayM11347d.getResourceId(9, 0));
        }
        if (typedArrayM11347d.hasValue(1)) {
            collapsingTextHelper.m11317o(typedArrayM11347d.getResourceId(1, 0));
        }
        this.f28755y = typedArrayM11347d.getDimensionPixelSize(12, -1);
        if (typedArrayM11347d.hasValue(10) && (i2 = typedArrayM11347d.getInt(10, 1)) != collapsingTextHelper.f25438Y) {
            collapsingTextHelper.f25438Y = i2;
            collapsingTextHelper.m11310f();
            collapsingTextHelper.m11316m();
        }
        this.f28754x = typedArrayM11347d.getInt(11, 600);
        setContentScrim(typedArrayM11347d.getDrawable(2));
        setStatusBarScrim(typedArrayM11347d.getDrawable(13));
        this.f28737g = typedArrayM11347d.getResourceId(16, -1);
        typedArrayM11347d.recycle();
        setWillNotDraw(false);
        C5908a c5908a = new C5908a();
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        ViewCompat.c.m16336d(this, c5908a);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C5909b(layoutParams);
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    public static class C5909b extends FrameLayout.LayoutParams {

        /* JADX INFO: renamed from: a */
        public int f28758a;

        /* JADX INFO: renamed from: b */
        public float f28759b;

        public C5909b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f28758a = 0;
            this.f28759b = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4801b.f24758m);
            this.f28758a = typedArrayObtainStyledAttributes.getInt(0, 0);
            this.f28759b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C5909b(int i, int i2) {
            super(i, i2);
            this.f28758a = 0;
            this.f28759b = 0.5f;
        }

        public C5909b(int i, int i2, int i3) {
            super(i, i2, i3);
            this.f28758a = 0;
            this.f28759b = 0.5f;
        }

        public C5909b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f28758a = 0;
            this.f28759b = 0.5f;
        }

        public C5909b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f28758a = 0;
            this.f28759b = 0.5f;
        }

        public C5909b(FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f28758a = 0;
            this.f28759b = 0.5f;
        }
    }
}
