package p636z0.p685e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.e0.c, reason: use source file name */
/* JADX INFO: compiled from: Fade.java */
/* JADX INFO: loaded from: classes.dex */
public class Fade extends Visibility2 {

    /* JADX INFO: renamed from: z0.e0.c$a */
    /* JADX INFO: compiled from: Fade.java */
    public class a extends TransitionListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f36421a;

        public a(Fade fade, View view) {
            this.f36421a = view;
        }

        @Override // p636z0.p685e0.TransitionListenerAdapter, p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: c */
        public void mo12475c(Transition3 transition3) {
            View view = this.f36421a;
            ViewUtilsBase viewUtilsBase = ViewUtils6.f36500a;
            viewUtilsBase.mo15535e(view, 1.0f);
            viewUtilsBase.mo15532a(this.f36421a);
            transition3.mo15518z(this);
        }
    }

    /* JADX INFO: renamed from: z0.e0.c$b */
    /* JADX INFO: compiled from: Fade.java */
    public static class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final View f36422a;

        /* JADX INFO: renamed from: b */
        public boolean f36423b = false;

        public b(View view) {
            this.f36422a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewUtils6.f36500a.mo15535e(this.f36422a, 1.0f);
            if (this.f36423b) {
                this.f36422a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            View view = this.f36422a;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (view.hasOverlappingRendering() && this.f36422a.getLayerType() == 0) {
                this.f36423b = true;
                this.f36422a.setLayerType(2, null);
            }
        }
    }

    public Fade(int i) {
        m15466S(i);
    }

    @Override // p636z0.p685e0.Visibility2
    /* JADX INFO: renamed from: Q */
    public Animator mo15464Q(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Float f;
        float fFloatValue = (transitionValues == null || (f = (Float) transitionValues.f36492a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f.floatValue();
        return m15470T(view, fFloatValue != 1.0f ? fFloatValue : 0.0f, 1.0f);
    }

    @Override // p636z0.p685e0.Visibility2
    /* JADX INFO: renamed from: R */
    public Animator mo15465R(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewUtils6.f36500a.mo15534c(view);
        Float f = (Float) transitionValues.f36492a.get("android:fade:transitionAlpha");
        return m15470T(view, f != null ? f.floatValue() : 1.0f, 0.0f);
    }

    /* JADX INFO: renamed from: T */
    public final Animator m15470T(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        ViewUtils6.f36500a.mo15535e(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, ViewUtils6.f36501b, f2);
        objectAnimatorOfFloat.addListener(new b(view));
        mo15505a(new a(this, view));
        return objectAnimatorOfFloat;
    }

    @Override // p636z0.p685e0.Visibility2, p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: j */
    public void mo11342j(TransitionValues transitionValues) {
        m15462O(transitionValues);
        transitionValues.f36492a.put("android:fade:transitionAlpha", Float.valueOf(ViewUtils6.m15530a(transitionValues.f36493b)));
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.f36441d);
        m15466S(C8162a.m16077v(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.f36408E));
        typedArrayObtainStyledAttributes.recycle();
    }
}
