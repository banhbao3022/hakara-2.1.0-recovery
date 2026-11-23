package p007c.p190n.p194b.p334e.p359s;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Objects;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.p363w.RippleUtils;
import p007c.p190n.p194b.p334e.p364x.ShadowViewDelegate;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: c.n.b.e.s.k, reason: use source file name */
/* JADX INFO: compiled from: FloatingActionButtonImplLollipop.java */
/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButtonImplLollipop extends FloatingActionButtonImpl3 {

    /* JADX INFO: renamed from: c.n.b.e.s.k$a */
    /* JADX INFO: compiled from: FloatingActionButtonImplLollipop.java */
    public static class a extends MaterialShapeDrawable {
        public a(ShapeAppearanceModel shapeAppearanceModel) {
            super(shapeAppearanceModel);
        }

        @Override // p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public FloatingActionButtonImplLollipop(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        super(floatingActionButton, shadowViewDelegate);
    }

    @Override // p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3
    /* JADX INFO: renamed from: d */
    public float mo11274d() {
        return this.f25378F.getElevation();
    }

    @Override // p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3
    /* JADX INFO: renamed from: e */
    public void mo11275e(Rect rect) {
        if (FloatingActionButton.this.f28986q) {
            super.mo11275e(rect);
        } else if (m11290t()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f25395r - this.f25378F.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3
    /* JADX INFO: renamed from: f */
    public void mo11276f(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        ShapeAppearanceModel shapeAppearanceModel = this.f25385h;
        Objects.requireNonNull(shapeAppearanceModel);
        a aVar = new a(shapeAppearanceModel);
        this.f25386i = aVar;
        aVar.setTintList(colorStateList);
        if (mode != null) {
            this.f25386i.setTintMode(mode);
        }
        this.f25386i.m11378n(this.f25378F.getContext());
        if (i > 0) {
            Context context = this.f25378F.getContext();
            ShapeAppearanceModel shapeAppearanceModel2 = this.f25385h;
            Objects.requireNonNull(shapeAppearanceModel2);
            BorderDrawable borderDrawable = new BorderDrawable(shapeAppearanceModel2);
            int iM16134b = ContextCompat.m16134b(context, R.color.design_fab_stroke_top_outer_color);
            int iM16134b2 = ContextCompat.m16134b(context, R.color.design_fab_stroke_top_inner_color);
            int iM16134b3 = ContextCompat.m16134b(context, R.color.design_fab_stroke_end_inner_color);
            int iM16134b4 = ContextCompat.m16134b(context, R.color.design_fab_stroke_end_outer_color);
            borderDrawable.f25345i = iM16134b;
            borderDrawable.f25346j = iM16134b2;
            borderDrawable.f25347k = iM16134b3;
            borderDrawable.f25348l = iM16134b4;
            float f = i;
            if (borderDrawable.f25344h != f) {
                borderDrawable.f25344h = f;
                borderDrawable.f25338b.setStrokeWidth(f * 1.3333f);
                borderDrawable.f25350n = true;
                borderDrawable.invalidateSelf();
            }
            borderDrawable.m11270b(colorStateList);
            this.f25388k = borderDrawable;
            BorderDrawable borderDrawable2 = this.f25388k;
            Objects.requireNonNull(borderDrawable2);
            MaterialShapeDrawable materialShapeDrawable = this.f25386i;
            Objects.requireNonNull(materialShapeDrawable);
            layerDrawable = new LayerDrawable(new Drawable[]{borderDrawable2, materialShapeDrawable});
        } else {
            this.f25388k = null;
            layerDrawable = this.f25386i;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.m11360c(colorStateList2), layerDrawable, null);
        this.f25387j = rippleDrawable;
        this.f25389l = rippleDrawable;
    }

    @Override // p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3
    /* JADX INFO: renamed from: i */
    public void mo11279i() {
    }

    @Override // p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3
    /* JADX INFO: renamed from: j */
    public void mo11280j() {
        m11292v();
    }

    @Override // p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3
    /* JADX INFO: renamed from: k */
    public void mo11281k(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (!this.f25378F.isEnabled()) {
                this.f25378F.setElevation(0.0f);
                this.f25378F.setTranslationZ(0.0f);
                return;
            }
            this.f25378F.setElevation(this.f25392o);
            if (this.f25378F.isPressed()) {
                this.f25378F.setTranslationZ(this.f25394q);
            } else if (this.f25378F.isFocused() || this.f25378F.isHovered()) {
                this.f25378F.setTranslationZ(this.f25393p);
            } else {
                this.f25378F.setTranslationZ(0.0f);
            }
        }
    }

    @Override // p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3
    /* JADX INFO: renamed from: l */
    public void mo11282l(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.f25378F.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(FloatingActionButtonImpl3.f25367b, m11297x(f, f3));
            stateListAnimator.addState(FloatingActionButtonImpl3.f25368c, m11297x(f, f2));
            stateListAnimator.addState(FloatingActionButtonImpl3.f25369d, m11297x(f, f2));
            stateListAnimator.addState(FloatingActionButtonImpl3.f25370e, m11297x(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f25378F, "elevation", f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f25378F;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f25378F, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(FloatingActionButtonImpl3.f25366a);
            stateListAnimator.addState(FloatingActionButtonImpl3.f25371f, animatorSet);
            stateListAnimator.addState(FloatingActionButtonImpl3.f25372g, m11297x(0.0f, 0.0f));
            this.f25378F.setStateListAnimator(stateListAnimator);
        }
        if (mo11288r()) {
            m11292v();
        }
    }

    @Override // p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3
    /* JADX INFO: renamed from: p */
    public void mo11286p(ColorStateList colorStateList) {
        Drawable drawable = this.f25387j;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(RippleUtils.m11360c(colorStateList));
        } else if (drawable != null) {
            drawable.setTintList(RippleUtils.m11360c(colorStateList));
        }
    }

    @Override // p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3
    /* JADX INFO: renamed from: r */
    public boolean mo11288r() {
        return FloatingActionButton.this.f28986q || !m11290t();
    }

    @Override // p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3
    /* JADX INFO: renamed from: u */
    public void mo11291u() {
    }

    /* JADX INFO: renamed from: x */
    public final Animator m11297x(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f25378F, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f25378F, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(FloatingActionButtonImpl3.f25366a);
        return animatorSet;
    }
}
