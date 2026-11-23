package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p337c.TransformationCallback;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p346g.BottomAppBar2;
import p007c.p190n.p194b.p334e.p346g.BottomAppBar3;
import p007c.p190n.p194b.p334e.p346g.BottomAppBar4;
import p007c.p190n.p194b.p334e.p346g.BottomAppBar6;
import p007c.p190n.p194b.p334e.p346g.BottomAppBarTopEdgeTreatment;
import p007c.p190n.p194b.p334e.p357q.ElevationOverlayProvider;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p007c.p190n.p194b.p334e.p360t.ViewUtils;
import p007c.p190n.p194b.p334e.p360t.ViewUtils3;
import p007c.p190n.p194b.p334e.p360t.ViewUtils4;
import p007c.p190n.p194b.p334e.p365y.CornerSize;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.WindowInsetsCompat;
import p636z0.p745m.p746a.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC0097b {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f28780U = 0;

    /* JADX INFO: renamed from: V */
    public final int f28781V;

    /* JADX INFO: renamed from: W */
    public final MaterialShapeDrawable f28782W;

    /* JADX INFO: renamed from: a0 */
    public Animator f28783a0;

    /* JADX INFO: renamed from: b0 */
    public Animator f28784b0;

    /* JADX INFO: renamed from: c0 */
    public int f28785c0;

    /* JADX INFO: renamed from: d0 */
    public int f28786d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f28787e0;

    /* JADX INFO: renamed from: f0 */
    public final boolean f28788f0;

    /* JADX INFO: renamed from: g0 */
    public final boolean f28789g0;

    /* JADX INFO: renamed from: h0 */
    public final boolean f28790h0;

    /* JADX INFO: renamed from: i0 */
    public int f28791i0;

    /* JADX INFO: renamed from: j0 */
    public int f28792j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f28793k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f28794l0;

    /* JADX INFO: renamed from: m0 */
    public Behavior f28795m0;

    /* JADX INFO: renamed from: n0 */
    public int f28796n0;

    /* JADX INFO: renamed from: o0 */
    public int f28797o0;

    /* JADX INFO: renamed from: p0 */
    public int f28798p0;

    /* JADX INFO: renamed from: q0 */
    public AnimatorListenerAdapter f28799q0;

    /* JADX INFO: renamed from: r0 */
    public TransformationCallback<FloatingActionButton> f28800r0;

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public class C5915a extends AnimatorListenerAdapter {
        public C5915a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.f28793k0) {
                return;
            }
            bottomAppBar.m12725H(bottomAppBar.f28785c0, bottomAppBar.f28794l0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    public class C5916b implements TransformationCallback<FloatingActionButton> {
        public C5916b() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    public class C5917c implements ViewUtils3 {
        public C5917c() {
        }

        @Override // p007c.p190n.p194b.p334e.p360t.ViewUtils3
        /* JADX INFO: renamed from: a */
        public WindowInsetsCompat mo11121a(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils4 viewUtils4) {
            boolean z;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.f28788f0) {
                bottomAppBar.f28796n0 = windowInsetsCompat.m16227b();
            }
            BottomAppBar bottomAppBar2 = BottomAppBar.this;
            boolean z2 = false;
            if (bottomAppBar2.f28789g0) {
                z = bottomAppBar2.f28798p0 != windowInsetsCompat.m16228c();
                BottomAppBar.this.f28798p0 = windowInsetsCompat.m16228c();
            } else {
                z = false;
            }
            BottomAppBar bottomAppBar3 = BottomAppBar.this;
            if (bottomAppBar3.f28790h0) {
                boolean z3 = bottomAppBar3.f28797o0 != windowInsetsCompat.m16229d();
                BottomAppBar.this.f28797o0 = windowInsetsCompat.m16229d();
                z2 = z3;
            }
            if (z || z2) {
                BottomAppBar bottomAppBar4 = BottomAppBar.this;
                Animator animator = bottomAppBar4.f28784b0;
                if (animator != null) {
                    animator.cancel();
                }
                Animator animator2 = bottomAppBar4.f28783a0;
                if (animator2 != null) {
                    animator2.cancel();
                }
                BottomAppBar.this.m12727J();
                BottomAppBar.this.m12726I();
            }
            return windowInsetsCompat;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    public class C5918d extends AnimatorListenerAdapter {
        public C5918d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.m12716w(BottomAppBar.this);
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.f28793k0 = false;
            bottomAppBar.f28784b0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f28791i0++;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    public static class C5919e extends AbsSavedState {
        public static final Parcelable.Creator<C5919e> CREATOR = new a();

        /* JADX INFO: renamed from: h */
        public int f28810h;

        /* JADX INFO: renamed from: i */
        public boolean f28811i;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$e$a */
        public static class a implements Parcelable.ClassLoaderCreator<C5919e> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C5919e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C5919e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C5919e[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C5919e(parcel, null);
            }
        }

        public C5919e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p636z0.p745m.p746a.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f38150g, i);
            parcel.writeInt(this.f28810h);
            parcel.writeInt(this.f28811i ? 1 : 0);
        }

        public C5919e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f28810h = parcel.readInt();
            this.f28811i = parcel.readInt() != 0;
        }
    }

    public BottomAppBar(Context context) {
        this(context, null, 0);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f28796n0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return m12723F(this.f28785c0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f25000i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f28798p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f28797o0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
        return (BottomAppBarTopEdgeTreatment) this.f28782W.f25574h.f25594a.f25627j;
    }

    /* JADX INFO: renamed from: w */
    public static void m12716w(BottomAppBar bottomAppBar) {
        bottomAppBar.f28791i0--;
    }

    /* JADX INFO: renamed from: C */
    public final FloatingActionButton m12720C() {
        View viewM12721D = m12721D();
        if (viewM12721D instanceof FloatingActionButton) {
            return (FloatingActionButton) viewM12721D;
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final View m12721D() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).m292f(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public int m12722E(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean zM10975Z = C4799a.m10975Z(this);
        int measuredWidth = zM10975Z ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0088e) && (((Toolbar.C0088e) childAt.getLayoutParams()).f34411a & 8388615) == 8388611) {
                measuredWidth = zM10975Z ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((zM10975Z ? actionMenuView.getRight() : actionMenuView.getLeft()) + (zM10975Z ? this.f28797o0 : -this.f28798p0));
    }

    /* JADX INFO: renamed from: F */
    public final float m12723F(int i) {
        boolean zM10975Z = C4799a.m10975Z(this);
        if (i == 1) {
            return ((getMeasuredWidth() / 2) - (this.f28781V + (zM10975Z ? this.f28798p0 : this.f28797o0))) * (zM10975Z ? -1 : 1);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m12724G() {
        FloatingActionButton floatingActionButtonM12720C = m12720C();
        return floatingActionButtonM12720C != null && floatingActionButtonM12720C.m12807k();
    }

    /* JADX INFO: renamed from: H */
    public final void m12725H(int i, boolean z) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (!isLaidOut()) {
            this.f28793k0 = false;
            int i2 = this.f28792j0;
            if (i2 != 0) {
                this.f28792j0 = 0;
                getMenu().clear();
                m235n(i2);
                return;
            }
            return;
        }
        Animator animator = this.f28784b0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!m12724G()) {
            i = 0;
            z = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            if (Math.abs(actionMenuView.getTranslationX() - m12722E(actionMenuView, i, z)) > 1.0f) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                objectAnimatorOfFloat2.addListener(new BottomAppBar4(this, actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150L);
                animatorSet.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                arrayList.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        this.f28784b0 = animatorSet2;
        animatorSet2.addListener(new C5918d());
        this.f28784b0.start();
    }

    /* JADX INFO: renamed from: I */
    public final void m12726I() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f28784b0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (m12724G()) {
            actionMenuView.setTranslationX(m12722E(actionMenuView, this.f28785c0, this.f28794l0));
        } else {
            actionMenuView.setTranslationX(m12722E(actionMenuView, 0, false));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m12727J() {
        getTopEdgeTreatment().f25001j = getFabTranslationX();
        View viewM12721D = m12721D();
        this.f28782W.m11382r((this.f28794l0 && m12724G()) ? 1.0f : 0.0f);
        if (viewM12721D != null) {
            viewM12721D.setTranslationY(getFabTranslationY());
            viewM12721D.setTranslationX(getFabTranslationX());
        }
    }

    /* JADX INFO: renamed from: K */
    public boolean m12728K(int i) {
        float f = i;
        if (f == getTopEdgeTreatment().f24999h) {
            return false;
        }
        getTopEdgeTreatment().f24999h = f;
        this.f28782W.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.f28782W.f25574h.f25600g;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f25000i;
    }

    public int getFabAlignmentMode() {
        return this.f28785c0;
    }

    public int getFabAnimationMode() {
        return this.f28786d0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f24998g;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f24997f;
    }

    public boolean getHideOnScroll() {
        return this.f28787e0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4799a.m11005o0(this, this.f28782W);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.f28784b0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f28783a0;
            if (animator2 != null) {
                animator2.cancel();
            }
            m12727J();
        }
        m12726I();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5919e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5919e c5919e = (C5919e) parcelable;
        super.onRestoreInstanceState(c5919e.f38150g);
        this.f28785c0 = c5919e.f28810h;
        this.f28794l0 = c5919e.f28811i;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        C5919e c5919e = new C5919e(super.onSaveInstanceState());
        c5919e.f28810h = this.f28785c0;
        c5919e.f28811i = this.f28794l0;
        return c5919e;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.f28782W.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().m11111b(f);
            this.f28782W.invalidateSelf();
            m12727J();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        MaterialShapeDrawable materialShapeDrawable = this.f28782W;
        MaterialShapeDrawable.b bVar = materialShapeDrawable.f25574h;
        if (bVar.f25608o != f) {
            bVar.f25608o = f;
            materialShapeDrawable.m11365A();
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.f28782W;
        int iM11374j = materialShapeDrawable2.f25574h.f25611r - materialShapeDrawable2.m11374j();
        Behavior behavior = getBehavior();
        behavior.f28764c = iM11374j;
        if (behavior.f28763b == 1) {
            setTranslationY(behavior.f28762a + iM11374j);
        }
    }

    public void setFabAlignmentMode(int i) {
        this.f28792j0 = 0;
        this.f28793k0 = true;
        m12725H(i, this.f28794l0);
        if (this.f28785c0 != i) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (isLaidOut()) {
                Animator animator = this.f28783a0;
                if (animator != null) {
                    animator.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.f28786d0 == 1) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(m12720C(), "translationX", m12723F(i));
                    objectAnimatorOfFloat.setDuration(300L);
                    arrayList.add(objectAnimatorOfFloat);
                } else {
                    FloatingActionButton floatingActionButtonM12720C = m12720C();
                    if (floatingActionButtonM12720C != null && !floatingActionButtonM12720C.m12806j()) {
                        this.f28791i0++;
                        floatingActionButtonM12720C.m12805i(new BottomAppBar3(this, i), true);
                    }
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                this.f28783a0 = animatorSet;
                animatorSet.addListener(new BottomAppBar2(this));
                this.f28783a0.start();
            }
        }
        this.f28785c0 = i;
    }

    public void setFabAnimationMode(int i) {
        this.f28786d0 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().f24998g = f;
            this.f28782W.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f24997f = f;
            this.f28782W.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f28787e0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0097b
    public Behavior getBehavior() {
        if (this.f28795m0 == null) {
            this.f28795m0 = new Behavior();
        }
        return this.f28795m0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: e */
        public final Rect f28801e;

        /* JADX INFO: renamed from: f */
        public WeakReference<BottomAppBar> f28802f;

        /* JADX INFO: renamed from: g */
        public int f28803g;

        /* JADX INFO: renamed from: h */
        public final View.OnLayoutChangeListener f28804h;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class ViewOnLayoutChangeListenerC5914a implements View.OnLayoutChangeListener {
            public ViewOnLayoutChangeListenerC5914a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = Behavior.this.f28802f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Rect rect = Behavior.this.f28801e;
                rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                floatingActionButton.m12808l(rect);
                int iHeight = Behavior.this.f28801e.height();
                bottomAppBar.m12728K(iHeight);
                CoordinatorLayout.C0101f c0101f = (CoordinatorLayout.C0101f) view.getLayoutParams();
                if (Behavior.this.f28803g == 0) {
                    ((ViewGroup.MarginLayoutParams) c0101f).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - iHeight) / 2));
                    ((ViewGroup.MarginLayoutParams) c0101f).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) c0101f).rightMargin = bottomAppBar.getRightInset();
                    if (C4799a.m10975Z(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) c0101f).leftMargin += bottomAppBar.f28781V;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0101f).rightMargin += bottomAppBar.f28781V;
                    }
                }
            }
        }

        public Behavior() {
            this.f28804h = new ViewOnLayoutChangeListenerC5914a();
            this.f28801e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: k */
        public boolean mo319k(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f28802f = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.f28780U;
            View viewM12721D = bottomAppBar.m12721D();
            if (viewM12721D != null) {
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                if (!viewM12721D.isLaidOut()) {
                    CoordinatorLayout.C0101f c0101f = (CoordinatorLayout.C0101f) viewM12721D.getLayoutParams();
                    c0101f.f646d = 49;
                    this.f28803g = ((ViewGroup.MarginLayoutParams) c0101f).bottomMargin;
                    if (viewM12721D instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewM12721D;
                        floatingActionButton.addOnLayoutChangeListener(this.f28804h);
                        floatingActionButton.m12800d(bottomAppBar.f28799q0);
                        floatingActionButton.m12801e(new BottomAppBar6(bottomAppBar));
                        floatingActionButton.m12802f(bottomAppBar.f28800r0);
                    }
                    bottomAppBar.m12727J();
                }
            }
            coordinatorLayout.m299s(bottomAppBar, i);
            this.f28762a = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: x */
        public boolean mo332x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (((BottomAppBar) view).getHideOnScroll()) {
                if (i == 2) {
                    return true;
                }
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f28804h = new ViewOnLayoutChangeListenerC5914a();
            this.f28801e = new Rect();
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 2132017868), attributeSet, i);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f28782W = materialShapeDrawable;
        this.f28791i0 = 0;
        this.f28792j0 = 0;
        this.f28793k0 = false;
        this.f28794l0 = true;
        this.f28799q0 = new C5915a();
        this.f28800r0 = new C5916b();
        Context context2 = getContext();
        TypedArray typedArrayM11347d = ThemeEnforcement.m11347d(context2, attributeSet, C4801b.f24749d, i, 2132017868, new int[0]);
        ColorStateList colorStateListM10961L = C4799a.m10961L(context2, typedArrayM11347d, 0);
        int dimensionPixelSize = typedArrayM11347d.getDimensionPixelSize(1, 0);
        float dimensionPixelOffset = typedArrayM11347d.getDimensionPixelOffset(4, 0);
        float dimensionPixelOffset2 = typedArrayM11347d.getDimensionPixelOffset(5, 0);
        float dimensionPixelOffset3 = typedArrayM11347d.getDimensionPixelOffset(6, 0);
        this.f28785c0 = typedArrayM11347d.getInt(2, 0);
        this.f28786d0 = typedArrayM11347d.getInt(3, 0);
        this.f28787e0 = typedArrayM11347d.getBoolean(7, false);
        this.f28788f0 = typedArrayM11347d.getBoolean(8, false);
        this.f28789g0 = typedArrayM11347d.getBoolean(9, false);
        this.f28790h0 = typedArrayM11347d.getBoolean(10, false);
        typedArrayM11347d.recycle();
        this.f28781V = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        BottomAppBarTopEdgeTreatment bottomAppBarTopEdgeTreatment = new BottomAppBarTopEdgeTreatment(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        CornerSize cornerSize = ShapeAppearanceModel.f25618a;
        ShapeAppearanceModel.b bVar = new ShapeAppearanceModel.b();
        bVar.f25639i = bottomAppBarTopEdgeTreatment;
        materialShapeDrawable.f25574h.f25594a = bVar.m11398a();
        materialShapeDrawable.invalidateSelf();
        materialShapeDrawable.m11385u(2);
        materialShapeDrawable.m11383s(Paint.Style.FILL);
        materialShapeDrawable.f25574h.f25595b = new ElevationOverlayProvider(context2);
        materialShapeDrawable.m11365A();
        setElevation(dimensionPixelSize);
        materialShapeDrawable.setTintList(colorStateListM10961L);
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        setBackground(materialShapeDrawable);
        C5917c c5917c = new C5917c();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C4801b.f24765t, i, 2132017868);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(2, false);
        typedArrayObtainStyledAttributes.recycle();
        C4799a.m11019y(this, new ViewUtils(z, z2, z3, c5917c));
    }
}
