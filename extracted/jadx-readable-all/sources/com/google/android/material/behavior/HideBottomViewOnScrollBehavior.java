package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p007c.p190n.p194b.p334e.p337c.AnimationUtils;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0098c<V> {

    /* JADX INFO: renamed from: a */
    public int f28762a;

    /* JADX INFO: renamed from: b */
    public int f28763b;

    /* JADX INFO: renamed from: c */
    public int f28764c;

    /* JADX INFO: renamed from: d */
    public ViewPropertyAnimator f28765d;

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C5911a extends AnimatorListenerAdapter {
        public C5911a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f28765d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f28762a = 0;
        this.f28763b = 2;
        this.f28764c = 0;
    }

    /* JADX INFO: renamed from: B */
    public final void m12703B(V v, int i, long j2, TimeInterpolator timeInterpolator) {
        this.f28765d = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j2).setListener(new C5911a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: k */
    public boolean mo319k(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f28762a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: r */
    public void mo326r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.f28763b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f28765d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f28763b = 1;
            m12703B(v, this.f28762a + this.f28764c, 175L, AnimationUtils.f24795c);
            return;
        }
        if (i2 >= 0 || this.f28763b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f28765d;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            v.clearAnimation();
        }
        this.f28763b = 2;
        m12703B(v, 0, 225L, AnimationUtils.f24796d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: x */
    public boolean mo332x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28762a = 0;
        this.f28763b = 2;
        this.f28764c = 0;
    }
}
