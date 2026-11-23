package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p335a0.ExtendableSavedState;
import p007c.p190n.p194b.p334e.p337c.MotionSpec;
import p007c.p190n.p194b.p334e.p337c.TransformationCallback;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p358r.ExpandableWidget;
import p007c.p190n.p194b.p334e.p358r.ExpandableWidgetHelper;
import p007c.p190n.p194b.p334e.p359s.BorderDrawable;
import p007c.p190n.p194b.p334e.p359s.FloatingActionButton2;
import p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl;
import p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl2;
import p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3;
import p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl5;
import p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImplLollipop;
import p007c.p190n.p194b.p334e.p360t.DescendantOffsetUtils;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p007c.p190n.p194b.p334e.p360t.VisibilityAwareImageButton;
import p007c.p190n.p194b.p334e.p364x.ShadowViewDelegate;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p007c.p190n.p194b.p334e.p365y.Shapeable;
import p636z0.p644b.p653h.AppCompatDrawableManager;
import p636z0.p644b.p653h.AppCompatImageHelper;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements ExpandableWidget, Shapeable, CoordinatorLayout.InterfaceC0097b {

    /* JADX INFO: renamed from: g */
    public ColorStateList f28976g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f28977h;

    /* JADX INFO: renamed from: i */
    public ColorStateList f28978i;

    /* JADX INFO: renamed from: j */
    public PorterDuff.Mode f28979j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f28980k;

    /* JADX INFO: renamed from: l */
    public int f28981l;

    /* JADX INFO: renamed from: m */
    public int f28982m;

    /* JADX INFO: renamed from: n */
    public int f28983n;

    /* JADX INFO: renamed from: o */
    public int f28984o;

    /* JADX INFO: renamed from: p */
    public int f28985p;

    /* JADX INFO: renamed from: q */
    public boolean f28986q;

    /* JADX INFO: renamed from: r */
    public final Rect f28987r;

    /* JADX INFO: renamed from: s */
    public final Rect f28988s;

    /* JADX INFO: renamed from: t */
    public final AppCompatImageHelper f28989t;

    /* JADX INFO: renamed from: u */
    public final ExpandableWidgetHelper f28990u;

    /* JADX INFO: renamed from: v */
    public FloatingActionButtonImpl3 f28991v;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public static abstract class AbstractC5957a {
        /* JADX INFO: renamed from: a */
        public void mo11108a(FloatingActionButton floatingActionButton) {
        }

        /* JADX INFO: renamed from: b */
        public void mo11109b(FloatingActionButton floatingActionButton) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public class C5958b implements ShadowViewDelegate {
        public C5958b() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C5959c<T extends FloatingActionButton> implements FloatingActionButtonImpl3.e {

        /* JADX INFO: renamed from: a */
        public final TransformationCallback<T> f28995a;

        public C5959c(TransformationCallback<T> transformationCallback) {
            this.f28995a = transformationCallback;
        }

        @Override // p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3.e
        /* JADX INFO: renamed from: a */
        public void mo11295a() {
            TransformationCallback<T> transformationCallback = this.f28995a;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            BottomAppBar.C5916b c5916b = (BottomAppBar.C5916b) transformationCallback;
            Objects.requireNonNull(c5916b);
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().f25001j != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().f25001j = translationX;
                BottomAppBar.this.f28782W.invalidateSelf();
            }
            float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().f25000i != fMax) {
                BottomAppBar.this.getTopEdgeTreatment().m11111b(fMax);
                BottomAppBar.this.f28782W.invalidateSelf();
            }
            BottomAppBar.this.f28782W.m11382r(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3.e
        /* JADX INFO: renamed from: b */
        public void mo11296b() {
            TransformationCallback<T> transformationCallback = this.f28995a;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            BottomAppBar.C5916b c5916b = (BottomAppBar.C5916b) transformationCallback;
            Objects.requireNonNull(c5916b);
            BottomAppBar.this.f28782W.m11382r(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C5959c) && ((C5959c) obj).f28995a.equals(this.f28995a);
        }

        public int hashCode() {
            return this.f28995a.hashCode();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private FloatingActionButtonImpl3 getImpl() {
        if (this.f28991v == null) {
            this.f28991v = new FloatingActionButtonImplLollipop(this, new C5958b());
        }
        return this.f28991v;
    }

    /* JADX INFO: renamed from: n */
    public static int m12799n(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    @Override // p007c.p190n.p194b.p334e.p358r.ExpandableWidget
    /* JADX INFO: renamed from: a */
    public boolean mo11263a() {
        return this.f28990u.f25327b;
    }

    /* JADX INFO: renamed from: d */
    public void m12800d(Animator.AnimatorListener animatorListener) {
        FloatingActionButtonImpl3 impl = getImpl();
        if (impl.f25376D == null) {
            impl.f25376D = new ArrayList<>();
        }
        impl.f25376D.add(animatorListener);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo11281k(getDrawableState());
    }

    /* JADX INFO: renamed from: e */
    public void m12801e(Animator.AnimatorListener animatorListener) {
        FloatingActionButtonImpl3 impl = getImpl();
        if (impl.f25375C == null) {
            impl.f25375C = new ArrayList<>();
        }
        impl.f25375C.add(animatorListener);
    }

    /* JADX INFO: renamed from: f */
    public void m12802f(TransformationCallback<? extends FloatingActionButton> transformationCallback) {
        FloatingActionButtonImpl3 impl = getImpl();
        C5959c c5959c = new C5959c(transformationCallback);
        if (impl.f25377E == null) {
            impl.f25377E = new ArrayList<>();
        }
        impl.f25377E.add(c5959c);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public boolean m12803g(Rect rect) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (!isLaidOut()) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m12808l(rect);
        return true;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f28976g;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f28977h;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0097b
    public CoordinatorLayout.AbstractC0098c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo11274d();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f25393p;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f25394q;
    }

    public Drawable getContentBackground() {
        return getImpl().f25389l;
    }

    public int getCustomSize() {
        return this.f28983n;
    }

    public int getExpandedComponentIdHint() {
        return this.f28990u.f25328c;
    }

    public MotionSpec getHideMotionSpec() {
        return getImpl().f25401x;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f28980k;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f28980k;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        ShapeAppearanceModel shapeAppearanceModel = getImpl().f25385h;
        Objects.requireNonNull(shapeAppearanceModel);
        return shapeAppearanceModel;
    }

    public MotionSpec getShowMotionSpec() {
        return getImpl().f25400w;
    }

    public int getSize() {
        return this.f28982m;
    }

    public int getSizeDimension() {
        return m12804h(this.f28982m);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f28978i;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f28979j;
    }

    public boolean getUseCompatPadding() {
        return this.f28986q;
    }

    /* JADX INFO: renamed from: h */
    public final int m12804h(int i) {
        int i2 = this.f28983n;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m12804h(1) : m12804h(0);
    }

    /* JADX INFO: renamed from: i */
    public void m12805i(AbstractC5957a abstractC5957a, boolean z) {
        FloatingActionButtonImpl3 impl = getImpl();
        FloatingActionButton2 floatingActionButton2 = abstractC5957a == null ? null : new FloatingActionButton2(this, abstractC5957a);
        if (impl.m11277g()) {
            return;
        }
        Animator animator = impl.f25399v;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.m11289s()) {
            impl.f25378F.m11348b(z ? 8 : 4, z);
            if (floatingActionButton2 != null) {
                floatingActionButton2.f25357a.mo11108a(floatingActionButton2.f25358b);
                return;
            }
            return;
        }
        MotionSpec motionSpec = impl.f25401x;
        if (motionSpec == null) {
            if (impl.f25398u == null) {
                impl.f25398u = MotionSpec.m11035b(impl.f25378F.getContext(), R.animator.design_fab_hide_motion_spec);
            }
            motionSpec = impl.f25398u;
            Objects.requireNonNull(motionSpec);
        }
        AnimatorSet animatorSetM11272b = impl.m11272b(motionSpec, 0.0f, 0.0f, 0.0f);
        animatorSetM11272b.addListener(new FloatingActionButtonImpl(impl, z, floatingActionButton2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f25376D;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetM11272b.addListener(it.next());
            }
        }
        animatorSetM11272b.start();
    }

    /* JADX INFO: renamed from: j */
    public boolean m12806j() {
        return getImpl().m11277g();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo11279i();
    }

    /* JADX INFO: renamed from: k */
    public boolean m12807k() {
        return getImpl().m11278h();
    }

    /* JADX INFO: renamed from: l */
    public final void m12808l(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f28987r;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* JADX INFO: renamed from: m */
    public final void m12809m() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f28978i;
        if (colorStateList == null) {
            C8162a.m16067l(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f28979j;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(AppCompatDrawableManager.m14905c(colorForState, mode));
    }

    /* JADX INFO: renamed from: o */
    public void m12810o(AbstractC5957a abstractC5957a, boolean z) {
        FloatingActionButtonImpl3 impl = getImpl();
        FloatingActionButton2 floatingActionButton2 = abstractC5957a == null ? null : new FloatingActionButton2(this, abstractC5957a);
        if (impl.m11278h()) {
            return;
        }
        Animator animator = impl.f25399v;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.m11289s()) {
            impl.f25378F.m11348b(0, z);
            impl.f25378F.setAlpha(1.0f);
            impl.f25378F.setScaleY(1.0f);
            impl.f25378F.setScaleX(1.0f);
            impl.m11285o(1.0f);
            if (floatingActionButton2 != null) {
                floatingActionButton2.f25357a.mo11109b(floatingActionButton2.f25358b);
                return;
            }
            return;
        }
        if (impl.f25378F.getVisibility() != 0) {
            impl.f25378F.setAlpha(0.0f);
            impl.f25378F.setScaleY(0.0f);
            impl.f25378F.setScaleX(0.0f);
            impl.m11285o(0.0f);
        }
        MotionSpec motionSpec = impl.f25400w;
        if (motionSpec == null) {
            if (impl.f25397t == null) {
                impl.f25397t = MotionSpec.m11035b(impl.f25378F.getContext(), R.animator.design_fab_show_motion_spec);
            }
            motionSpec = impl.f25397t;
            Objects.requireNonNull(motionSpec);
        }
        AnimatorSet animatorSetM11272b = impl.m11272b(motionSpec, 1.0f, 1.0f, 1.0f);
        animatorSetM11272b.addListener(new FloatingActionButtonImpl2(impl, z, floatingActionButton2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f25375C;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetM11272b.addListener(it.next());
            }
        }
        animatorSetM11272b.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        FloatingActionButtonImpl3 impl = getImpl();
        MaterialShapeDrawable materialShapeDrawable = impl.f25386i;
        if (materialShapeDrawable != null) {
            C4799a.m11005o0(impl.f25378F, materialShapeDrawable);
        }
        if (!(impl instanceof FloatingActionButtonImplLollipop)) {
            ViewTreeObserver viewTreeObserver = impl.f25378F.getViewTreeObserver();
            if (impl.f25384L == null) {
                impl.f25384L = new FloatingActionButtonImpl5(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f25384L);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FloatingActionButtonImpl3 impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f25378F.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.f25384L;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.f25384L = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f28984o = (sizeDimension - this.f28985p) / 2;
        getImpl().m11292v();
        int iMin = Math.min(m12799n(sizeDimension, i), m12799n(sizeDimension, i2));
        Rect rect = this.f28987r;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f38150g);
        ExpandableWidgetHelper expandableWidgetHelper = this.f28990u;
        Bundle orDefault = extendableSavedState.f24728h.getOrDefault("expandableWidgetHelper", null);
        Objects.requireNonNull(orDefault);
        Bundle bundle = orDefault;
        Objects.requireNonNull(expandableWidgetHelper);
        expandableWidgetHelper.f25327b = bundle.getBoolean("expanded", false);
        expandableWidgetHelper.f25328c = bundle.getInt("expandedComponentIdHint", 0);
        if (expandableWidgetHelper.f25327b) {
            ViewParent parent = expandableWidgetHelper.f25326a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).m289c(expandableWidgetHelper.f25326a);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        SimpleArrayMap<String, Bundle> simpleArrayMap = extendableSavedState.f24728h;
        ExpandableWidgetHelper expandableWidgetHelper = this.f28990u;
        Objects.requireNonNull(expandableWidgetHelper);
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", expandableWidgetHelper.f25327b);
        bundle.putInt("expandedComponentIdHint", expandableWidgetHelper.f25328c);
        simpleArrayMap.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m12803g(this.f28988s) && !this.f28988s.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f28976g != colorStateList) {
            this.f28976g = colorStateList;
            FloatingActionButtonImpl3 impl = getImpl();
            MaterialShapeDrawable materialShapeDrawable = impl.f25386i;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintList(colorStateList);
            }
            BorderDrawable borderDrawable = impl.f25388k;
            if (borderDrawable != null) {
                borderDrawable.m11270b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f28977h != mode) {
            this.f28977h = mode;
            MaterialShapeDrawable materialShapeDrawable = getImpl().f25386i;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        FloatingActionButtonImpl3 impl = getImpl();
        if (impl.f25392o != f) {
            impl.f25392o = f;
            impl.mo11282l(f, impl.f25393p, impl.f25394q);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        FloatingActionButtonImpl3 impl = getImpl();
        if (impl.f25393p != f) {
            impl.f25393p = f;
            impl.mo11282l(impl.f25392o, f, impl.f25394q);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        FloatingActionButtonImpl3 impl = getImpl();
        if (impl.f25394q != f) {
            impl.f25394q = f;
            impl.mo11282l(impl.f25392o, impl.f25393p, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f28983n) {
            this.f28983n = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().m11293w(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f25390m) {
            getImpl().f25390m = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f28990u.f25328c = i;
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        getImpl().f25401x = motionSpec;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(MotionSpec.m11035b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            FloatingActionButtonImpl3 impl = getImpl();
            impl.m11285o(impl.f25403z);
            if (this.f28978i != null) {
                m12809m();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f28989t.m14928c(i);
        m12809m();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().m11283m();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().m11283m();
    }

    public void setShadowPaddingEnabled(boolean z) {
        FloatingActionButtonImpl3 impl = getImpl();
        impl.f25391n = z;
        impl.m11292v();
    }

    @Override // p007c.p190n.p194b.p334e.p365y.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        getImpl().m11287q(shapeAppearanceModel);
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        getImpl().f25400w = motionSpec;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(MotionSpec.m11035b(getContext(), i));
    }

    public void setSize(int i) {
        this.f28983n = 0;
        if (i != this.f28982m) {
            this.f28982m = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f28978i != colorStateList) {
            this.f28978i = colorStateList;
            m12809m();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f28979j != mode) {
            this.f28979j = mode;
            m12809m();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().m11284n();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().m11284n();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().m11284n();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f28986q != z) {
            this.f28986q = z;
            getImpl().mo11280j();
        }
    }

    @Override // p007c.p190n.p194b.p334e.p360t.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0098c<T> {

        /* JADX INFO: renamed from: a */
        public Rect f28992a;

        /* JADX INFO: renamed from: b */
        public boolean f28993b;

        public BaseBehavior() {
            this.f28993b = true;
        }

        /* JADX INFO: renamed from: B */
        public boolean m12811B(FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f28987r;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* JADX INFO: renamed from: C */
        public final boolean m12812C(View view, FloatingActionButton floatingActionButton) {
            return this.f28993b && ((CoordinatorLayout.C0101f) floatingActionButton.getLayoutParams()).f648f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* JADX INFO: renamed from: D */
        public final boolean m12813D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m12812C(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f28992a == null) {
                this.f28992a = new Rect();
            }
            Rect rect = this.f28992a;
            DescendantOffsetUtils.m11330a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m12805i(null, false);
                return true;
            }
            floatingActionButton.m12810o(null, false);
            return true;
        }

        /* JADX INFO: renamed from: E */
        public final boolean m12814E(View view, FloatingActionButton floatingActionButton) {
            if (!m12812C(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0101f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m12805i(null, false);
                return true;
            }
            floatingActionButton.m12810o(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo309a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return m12811B((FloatingActionButton) view, rect);
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
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m12813D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0101f ? ((CoordinatorLayout.C0101f) layoutParams).f643a instanceof BottomSheetBehavior : false) {
                    m12814E(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
        /* JADX INFO: renamed from: k */
        public boolean mo319k(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> listM291e = coordinatorLayout.m291e(floatingActionButton);
            int size = listM291e.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = listM291e.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.C0101f ? ((CoordinatorLayout.C0101f) layoutParams).f643a instanceof BottomSheetBehavior : false) && m12814E(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m12813D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m299s(floatingActionButton, i);
            Rect rect = floatingActionButton.f28987r;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.C0101f c0101f = (CoordinatorLayout.C0101f) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c0101f).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c0101f).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c0101f).bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c0101f).topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                ViewCompat.m16320n(floatingActionButton, i2);
            }
            if (i4 == 0) {
                return true;
            }
            ViewCompat.m16319m(floatingActionButton, i4);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4801b.f24762q);
            this.f28993b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f28980k != colorStateList) {
            this.f28980k = colorStateList;
            getImpl().mo11286p(this.f28980k);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 2132017849), attributeSet, i);
        this.f28987r = new Rect();
        this.f28988s = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM11347d = ThemeEnforcement.m11347d(context2, attributeSet, C4801b.f24761p, i, 2132017849, new int[0]);
        this.f28976g = C4799a.m10961L(context2, typedArrayM11347d, 1);
        this.f28977h = C4799a.m10999l0(typedArrayM11347d.getInt(2, -1), null);
        this.f28980k = C4799a.m10961L(context2, typedArrayM11347d, 12);
        this.f28982m = typedArrayM11347d.getInt(7, -1);
        this.f28983n = typedArrayM11347d.getDimensionPixelSize(6, 0);
        this.f28981l = typedArrayM11347d.getDimensionPixelSize(3, 0);
        float dimension = typedArrayM11347d.getDimension(4, 0.0f);
        float dimension2 = typedArrayM11347d.getDimension(9, 0.0f);
        float dimension3 = typedArrayM11347d.getDimension(11, 0.0f);
        this.f28986q = typedArrayM11347d.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        this.f28985p = typedArrayM11347d.getDimensionPixelSize(10, 0);
        MotionSpec motionSpecM11034a = MotionSpec.m11034a(context2, typedArrayM11347d, 15);
        MotionSpec motionSpecM11034a2 = MotionSpec.m11034a(context2, typedArrayM11347d, 8);
        ShapeAppearanceModel shapeAppearanceModelM11398a = ShapeAppearanceModel.m11393c(context2, attributeSet, i, 2132017849, ShapeAppearanceModel.f25618a).m11398a();
        boolean z = typedArrayM11347d.getBoolean(5, false);
        setEnabled(typedArrayM11347d.getBoolean(0, true));
        typedArrayM11347d.recycle();
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.f28989t = appCompatImageHelper;
        appCompatImageHelper.m14927b(attributeSet, i);
        this.f28990u = new ExpandableWidgetHelper(this);
        getImpl().m11287q(shapeAppearanceModelM11398a);
        getImpl().mo11276f(this.f28976g, this.f28977h, this.f28980k, this.f28981l);
        getImpl().f25395r = dimensionPixelSize;
        FloatingActionButtonImpl3 impl = getImpl();
        if (impl.f25392o != dimension) {
            impl.f25392o = dimension;
            impl.mo11282l(dimension, impl.f25393p, impl.f25394q);
        }
        FloatingActionButtonImpl3 impl2 = getImpl();
        if (impl2.f25393p != dimension2) {
            impl2.f25393p = dimension2;
            impl2.mo11282l(impl2.f25392o, dimension2, impl2.f25394q);
        }
        FloatingActionButtonImpl3 impl3 = getImpl();
        if (impl3.f25394q != dimension3) {
            impl3.f25394q = dimension3;
            impl3.mo11282l(impl3.f25392o, impl3.f25393p, dimension3);
        }
        FloatingActionButtonImpl3 impl4 = getImpl();
        int i2 = this.f28985p;
        if (impl4.f25373A != i2) {
            impl4.f25373A = i2;
            impl4.m11285o(impl4.f25403z);
        }
        getImpl().f25400w = motionSpecM11034a;
        getImpl().f25401x = motionSpecM11034a2;
        getImpl().f25390m = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
