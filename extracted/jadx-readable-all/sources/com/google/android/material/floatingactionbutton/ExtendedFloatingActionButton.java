package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p337c.MotionSpec;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p359s.AnimatorTracker;
import p007c.p190n.p194b.p334e.p359s.BaseMotionStrategy;
import p007c.p190n.p194b.p334e.p359s.ExtendedFloatingActionButton2;
import p007c.p190n.p194b.p334e.p359s.MotionStrategy;
import p007c.p190n.p194b.p334e.p360t.DescendantOffsetUtils;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC0097b {

    /* JADX INFO: renamed from: w */
    public static final Property<View, Float> f28947w = new C5948c(Float.class, "width");

    /* JADX INFO: renamed from: x */
    public static final Property<View, Float> f28948x = new C5949d(Float.class, "height");

    /* JADX INFO: renamed from: y */
    public static final Property<View, Float> f28949y = new C5950e(Float.class, "paddingStart");

    /* JADX INFO: renamed from: z */
    public static final Property<View, Float> f28950z = new C5951f(Float.class, "paddingEnd");

    /* JADX INFO: renamed from: A */
    public int f28951A;

    /* JADX INFO: renamed from: B */
    public final AnimatorTracker f28952B;

    /* JADX INFO: renamed from: C */
    public final MotionStrategy f28953C;

    /* JADX INFO: renamed from: D */
    public final MotionStrategy f28954D;

    /* JADX INFO: renamed from: E */
    public final MotionStrategy f28955E;

    /* JADX INFO: renamed from: F */
    public final MotionStrategy f28956F;

    /* JADX INFO: renamed from: G */
    public final int f28957G;

    /* JADX INFO: renamed from: H */
    public int f28958H;

    /* JADX INFO: renamed from: I */
    public int f28959I;

    /* JADX INFO: renamed from: J */
    public final CoordinatorLayout.AbstractC0098c<ExtendedFloatingActionButton> f28960J;

    /* JADX INFO: renamed from: K */
    public boolean f28961K;

    /* JADX INFO: renamed from: L */
    public boolean f28962L;

    /* JADX INFO: renamed from: M */
    public boolean f28963M;

    /* JADX INFO: renamed from: N */
    public ColorStateList f28964N;

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public class C5946a implements InterfaceC5956k {
        public C5946a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC5956k
        /* JADX INFO: renamed from: a */
        public int mo12796a() {
            return ExtendedFloatingActionButton.this.f28959I;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC5956k
        /* JADX INFO: renamed from: b */
        public int mo12797b() {
            return ExtendedFloatingActionButton.this.f28958H;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC5956k
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC5956k
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC5956k
        public int getWidth() {
            int measuredWidth = ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2);
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return measuredWidth + extendedFloatingActionButton.f28958H + extendedFloatingActionButton.f28959I;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public class C5947b implements InterfaceC5956k {
        public C5947b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC5956k
        /* JADX INFO: renamed from: a */
        public int mo12796a() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC5956k
        /* JADX INFO: renamed from: b */
        public int mo12797b() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC5956k
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC5956k
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.getCollapsedSize(), ExtendedFloatingActionButton.this.getCollapsedSize());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC5956k
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    public static class C5948c extends Property<View, Float> {
        public C5948c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public static class C5949d extends Property<View, Float> {
        public C5949d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    public static class C5950e extends Property<View, Float> {
        public C5950e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        public void set(View view, Float f) {
            View view2 = view;
            int iIntValue = f.intValue();
            int paddingTop = view2.getPaddingTop();
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            view2.setPaddingRelative(iIntValue, paddingTop, view2.getPaddingEnd(), view2.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    public static class C5951f extends Property<View, Float> {
        public C5951f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        public void set(View view, Float f) {
            View view2 = view;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    public class C5952g extends BaseMotionStrategy {

        /* JADX INFO: renamed from: g */
        public final InterfaceC5956k f28970g;

        /* JADX INFO: renamed from: h */
        public final boolean f28971h;

        public C5952g(AnimatorTracker animatorTracker, InterfaceC5956k interfaceC5956k, boolean z) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
            this.f28970g = interfaceC5956k;
            this.f28971h = z;
        }

        @Override // p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: b */
        public int mo11298b() {
            return this.f28971h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: c */
        public void mo11299c() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f28961K = this.f28971h;
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f28970g.getLayoutParams().width;
            layoutParams.height = this.f28970g.getLayoutParams().height;
            ExtendedFloatingActionButton extendedFloatingActionButton2 = ExtendedFloatingActionButton.this;
            int iMo12797b = this.f28970g.mo12797b();
            int paddingTop = ExtendedFloatingActionButton.this.getPaddingTop();
            int iMo12796a = this.f28970g.mo12796a();
            int paddingBottom = ExtendedFloatingActionButton.this.getPaddingBottom();
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            extendedFloatingActionButton2.setPaddingRelative(iMo12797b, paddingTop, iMo12796a, paddingBottom);
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: d */
        public boolean mo11300d() {
            boolean z = this.f28971h;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return z == extendedFloatingActionButton.f28961K || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // p007c.p190n.p194b.p334e.p359s.BaseMotionStrategy, p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: e */
        public void mo11265e() {
            super.mo11265e();
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f28962L = false;
            extendedFloatingActionButton.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f28970g.getLayoutParams().width;
            layoutParams.height = this.f28970g.getLayoutParams().height;
        }

        @Override // p007c.p190n.p194b.p334e.p359s.BaseMotionStrategy, p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: f */
        public AnimatorSet mo11266f() {
            MotionSpec motionSpecM11268i = m11268i();
            if (motionSpecM11268i.m11040g("width")) {
                PropertyValuesHolder[] propertyValuesHolderArrM11038e = motionSpecM11268i.m11038e("width");
                propertyValuesHolderArrM11038e[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f28970g.getWidth());
                motionSpecM11268i.f24807b.put("width", propertyValuesHolderArrM11038e);
            }
            if (motionSpecM11268i.m11040g("height")) {
                PropertyValuesHolder[] propertyValuesHolderArrM11038e2 = motionSpecM11268i.m11038e("height");
                propertyValuesHolderArrM11038e2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f28970g.getHeight());
                motionSpecM11268i.f24807b.put("height", propertyValuesHolderArrM11038e2);
            }
            if (motionSpecM11268i.m11040g("paddingStart")) {
                PropertyValuesHolder[] propertyValuesHolderArrM11038e3 = motionSpecM11268i.m11038e("paddingStart");
                PropertyValuesHolder propertyValuesHolder = propertyValuesHolderArrM11038e3[0];
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                propertyValuesHolder.setFloatValues(extendedFloatingActionButton.getPaddingStart(), this.f28970g.mo12797b());
                motionSpecM11268i.f24807b.put("paddingStart", propertyValuesHolderArrM11038e3);
            }
            if (motionSpecM11268i.m11040g("paddingEnd")) {
                PropertyValuesHolder[] propertyValuesHolderArrM11038e4 = motionSpecM11268i.m11038e("paddingEnd");
                PropertyValuesHolder propertyValuesHolder2 = propertyValuesHolderArrM11038e4[0];
                ExtendedFloatingActionButton extendedFloatingActionButton2 = ExtendedFloatingActionButton.this;
                AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                propertyValuesHolder2.setFloatValues(extendedFloatingActionButton2.getPaddingEnd(), this.f28970g.mo12796a());
                motionSpecM11268i.f24807b.put("paddingEnd", propertyValuesHolderArrM11038e4);
            }
            if (motionSpecM11268i.m11040g("labelOpacity")) {
                PropertyValuesHolder[] propertyValuesHolderArrM11038e5 = motionSpecM11268i.m11038e("labelOpacity");
                boolean z = this.f28971h;
                propertyValuesHolderArrM11038e5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                motionSpecM11268i.f24807b.put("labelOpacity", propertyValuesHolderArrM11038e5);
            }
            return m11267h(motionSpecM11268i);
        }

        @Override // p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: g */
        public void mo11301g(AbstractC5954i abstractC5954i) {
            if (abstractC5954i == null) {
                return;
            }
            boolean z = this.f28971h;
        }

        @Override // p007c.p190n.p194b.p334e.p359s.BaseMotionStrategy, p007c.p190n.p194b.p334e.p359s.MotionStrategy
        public void onAnimationStart(Animator animator) {
            AnimatorTracker animatorTracker = this.f25333d;
            Animator animator2 = animatorTracker.f25329a;
            if (animator2 != null) {
                animator2.cancel();
            }
            animatorTracker.f25329a = animator;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f28961K = this.f28971h;
            extendedFloatingActionButton.f28962L = true;
            extendedFloatingActionButton.setHorizontallyScrolling(true);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    public class C5953h extends BaseMotionStrategy {

        /* JADX INFO: renamed from: g */
        public boolean f28973g;

        public C5953h(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // p007c.p190n.p194b.p334e.p359s.BaseMotionStrategy, p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: a */
        public void mo11264a() {
            this.f25333d.f25329a = null;
            this.f28973g = true;
        }

        @Override // p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: b */
        public int mo11298b() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: c */
        public void mo11299c() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: d */
        public boolean mo11300d() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            Property<View, Float> property = ExtendedFloatingActionButton.f28947w;
            if (extendedFloatingActionButton.getVisibility() == 0) {
                if (extendedFloatingActionButton.f28951A != 1) {
                    return false;
                }
            } else if (extendedFloatingActionButton.f28951A == 2) {
                return false;
            }
            return true;
        }

        @Override // p007c.p190n.p194b.p334e.p359s.BaseMotionStrategy, p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: e */
        public void mo11265e() {
            super.mo11265e();
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f28951A = 0;
            if (this.f28973g) {
                return;
            }
            extendedFloatingActionButton.setVisibility(8);
        }

        @Override // p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: g */
        public void mo11301g(AbstractC5954i abstractC5954i) {
        }

        @Override // p007c.p190n.p194b.p334e.p359s.BaseMotionStrategy, p007c.p190n.p194b.p334e.p359s.MotionStrategy
        public void onAnimationStart(Animator animator) {
            AnimatorTracker animatorTracker = this.f25333d;
            Animator animator2 = animatorTracker.f25329a;
            if (animator2 != null) {
                animator2.cancel();
            }
            animatorTracker.f25329a = animator;
            this.f28973g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f28951A = 1;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    public static abstract class AbstractC5954i {
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    public class C5955j extends BaseMotionStrategy {
        public C5955j(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: b */
        public int mo11298b() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: c */
        public void mo11299c() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: d */
        public boolean mo11300d() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            Property<View, Float> property = ExtendedFloatingActionButton.f28947w;
            return extendedFloatingActionButton.m12790j();
        }

        @Override // p007c.p190n.p194b.p334e.p359s.BaseMotionStrategy, p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: e */
        public void mo11265e() {
            super.mo11265e();
            ExtendedFloatingActionButton.this.f28951A = 0;
        }

        @Override // p007c.p190n.p194b.p334e.p359s.MotionStrategy
        /* JADX INFO: renamed from: g */
        public void mo11301g(AbstractC5954i abstractC5954i) {
        }

        @Override // p007c.p190n.p194b.p334e.p359s.BaseMotionStrategy, p007c.p190n.p194b.p334e.p359s.MotionStrategy
        public void onAnimationStart(Animator animator) {
            AnimatorTracker animatorTracker = this.f25333d;
            Animator animator2 = animatorTracker.f25329a;
            if (animator2 != null) {
                animator2.cancel();
            }
            animatorTracker.f25329a = animator;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f28951A = 2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k */
    public interface InterfaceC5956k {
        /* JADX INFO: renamed from: a */
        int mo12796a();

        /* JADX INFO: renamed from: b */
        int mo12797b();

        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getWidth();
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: i */
    public static void m12789i(ExtendedFloatingActionButton extendedFloatingActionButton, MotionStrategy motionStrategy, AbstractC5954i abstractC5954i) {
        Objects.requireNonNull(extendedFloatingActionButton);
        if (motionStrategy.mo11300d()) {
            return;
        }
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (!((extendedFloatingActionButton.isLaidOut() || (!extendedFloatingActionButton.m12790j() && extendedFloatingActionButton.f28963M)) && !extendedFloatingActionButton.isInEditMode())) {
            motionStrategy.mo11299c();
            motionStrategy.mo11301g(null);
            return;
        }
        extendedFloatingActionButton.measure(0, 0);
        AnimatorSet animatorSetMo11266f = motionStrategy.mo11266f();
        animatorSetMo11266f.addListener(new ExtendedFloatingActionButton2(extendedFloatingActionButton, motionStrategy, null));
        Iterator<Animator.AnimatorListener> it = ((BaseMotionStrategy) motionStrategy).f25332c.iterator();
        while (it.hasNext()) {
            animatorSetMo11266f.addListener(it.next());
        }
        animatorSetMo11266f.start();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0097b
    public CoordinatorLayout.AbstractC0098c<ExtendedFloatingActionButton> getBehavior() {
        return this.f28960J;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i = this.f28957G;
        if (i >= 0) {
            return i;
        }
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        return (Math.min(getPaddingStart(), getPaddingEnd()) * 2) + getIconSize();
    }

    public MotionSpec getExtendMotionSpec() {
        return ((BaseMotionStrategy) this.f28954D).f25335f;
    }

    public MotionSpec getHideMotionSpec() {
        return ((BaseMotionStrategy) this.f28956F).f25335f;
    }

    public MotionSpec getShowMotionSpec() {
        return ((BaseMotionStrategy) this.f28955E).f25335f;
    }

    public MotionSpec getShrinkMotionSpec() {
        return ((BaseMotionStrategy) this.f28953C).f25335f;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m12790j() {
        if (getVisibility() != 0) {
            return this.f28951A == 2;
        }
        return this.f28951A != 1;
    }

    /* JADX INFO: renamed from: k */
    public final void m12791k() {
        this.f28964N = getTextColors();
    }

    /* JADX INFO: renamed from: l */
    public void m12792l(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f28961K && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f28961K = false;
            this.f28953C.mo11299c();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f28963M = z;
    }

    public void setExtendMotionSpec(MotionSpec motionSpec) {
        ((BaseMotionStrategy) this.f28954D).f25335f = motionSpec;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(MotionSpec.m11035b(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f28961K == z) {
            return;
        }
        MotionStrategy motionStrategy = z ? this.f28954D : this.f28953C;
        if (motionStrategy.mo11300d()) {
            return;
        }
        motionStrategy.mo11299c();
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        ((BaseMotionStrategy) this.f28956F).f25335f = motionSpec;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(MotionSpec.m11035b(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.f28961K || this.f28962L) {
            return;
        }
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        this.f28958H = getPaddingStart();
        this.f28959I = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.f28961K || this.f28962L) {
            return;
        }
        this.f28958H = i;
        this.f28959I = i3;
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        ((BaseMotionStrategy) this.f28955E).f25335f = motionSpec;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(MotionSpec.m11035b(getContext(), i));
    }

    public void setShrinkMotionSpec(MotionSpec motionSpec) {
        ((BaseMotionStrategy) this.f28953C).f25335f = motionSpec;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(MotionSpec.m11035b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        m12791k();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0098c<T> {

        /* JADX INFO: renamed from: a */
        public Rect f28965a;

        /* JADX INFO: renamed from: b */
        public boolean f28966b;

        /* JADX INFO: renamed from: c */
        public boolean f28967c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f28966b = false;
            this.f28967c = true;
        }

        /* JADX INFO: renamed from: B */
        public final boolean m12793B(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f28966b || this.f28967c) && ((CoordinatorLayout.C0101f) extendedFloatingActionButton.getLayoutParams()).f648f == view.getId();
        }

        /* JADX INFO: renamed from: C */
        public final boolean m12794C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m12793B(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f28965a == null) {
                this.f28965a = new Rect();
            }
            Rect rect = this.f28965a;
            DescendantOffsetUtils.m11330a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                ExtendedFloatingActionButton.m12789i(extendedFloatingActionButton, this.f28967c ? extendedFloatingActionButton.f28953C : extendedFloatingActionButton.f28956F, null);
                return true;
            }
            ExtendedFloatingActionButton.m12789i(extendedFloatingActionButton, this.f28967c ? extendedFloatingActionButton.f28954D : extendedFloatingActionButton.f28955E, null);
            return true;
        }

        /* JADX INFO: renamed from: D */
        public final boolean m12795D(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m12793B(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0101f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                ExtendedFloatingActionButton.m12789i(extendedFloatingActionButton, this.f28967c ? extendedFloatingActionButton.f28953C : extendedFloatingActionButton.f28956F, null);
                return true;
            }
            ExtendedFloatingActionButton.m12789i(extendedFloatingActionButton, this.f28967c ? extendedFloatingActionButton.f28954D : extendedFloatingActionButton.f28955E, null);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo309a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: f */
        public void mo314f(CoordinatorLayout.C0101f c0101f) {
            if (c0101f.f650h == 0) {
                c0101f.f650h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: g */
        public boolean mo315g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m12794C(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0101f ? ((CoordinatorLayout.C0101f) layoutParams).f643a instanceof BottomSheetBehavior : false) {
                    m12795D(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: k */
        public boolean mo319k(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> listM291e = coordinatorLayout.m291e(extendedFloatingActionButton);
            int size = listM291e.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = listM291e.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.C0101f ? ((CoordinatorLayout.C0101f) layoutParams).f643a instanceof BottomSheetBehavior : false) && m12795D(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m12794C(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m299s(extendedFloatingActionButton, i);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4801b.f24760o);
            this.f28966b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f28967c = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 2132017904), attributeSet, i);
        this.f28951A = 0;
        AnimatorTracker animatorTracker = new AnimatorTracker();
        this.f28952B = animatorTracker;
        C5955j c5955j = new C5955j(animatorTracker);
        this.f28955E = c5955j;
        C5953h c5953h = new C5953h(animatorTracker);
        this.f28956F = c5953h;
        this.f28961K = true;
        this.f28962L = false;
        this.f28963M = false;
        Context context2 = getContext();
        this.f28960J = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayM11347d = ThemeEnforcement.m11347d(context2, attributeSet, C4801b.f24759n, i, 2132017904, new int[0]);
        MotionSpec motionSpecM11034a = MotionSpec.m11034a(context2, typedArrayM11347d, 4);
        MotionSpec motionSpecM11034a2 = MotionSpec.m11034a(context2, typedArrayM11347d, 3);
        MotionSpec motionSpecM11034a3 = MotionSpec.m11034a(context2, typedArrayM11347d, 2);
        MotionSpec motionSpecM11034a4 = MotionSpec.m11034a(context2, typedArrayM11347d, 5);
        this.f28957G = typedArrayM11347d.getDimensionPixelSize(0, -1);
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        this.f28958H = getPaddingStart();
        this.f28959I = getPaddingEnd();
        AnimatorTracker animatorTracker2 = new AnimatorTracker();
        C5952g c5952g = new C5952g(animatorTracker2, new C5946a(), true);
        this.f28954D = c5952g;
        C5952g c5952g2 = new C5952g(animatorTracker2, new C5947b(), false);
        this.f28953C = c5952g2;
        c5955j.f25335f = motionSpecM11034a;
        c5953h.f25335f = motionSpecM11034a2;
        c5952g.f25335f = motionSpecM11034a3;
        c5952g2.f25335f = motionSpecM11034a4;
        typedArrayM11347d.recycle();
        setShapeAppearanceModel(ShapeAppearanceModel.m11393c(context2, attributeSet, i, 2132017904, ShapeAppearanceModel.f25618a).m11398a());
        m12791k();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m12791k();
    }
}
