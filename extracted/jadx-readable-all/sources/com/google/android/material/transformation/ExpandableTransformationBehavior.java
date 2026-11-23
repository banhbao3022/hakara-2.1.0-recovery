package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: b */
    public AnimatorSet f29246b;

    /* JADX INFO: renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    public class C5991a extends AnimatorListenerAdapter {
        public C5991a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f29246b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* JADX INFO: renamed from: C */
    public boolean mo12896C(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f29246b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetMo12897D = mo12897D(view, view2, z, z3);
        this.f29246b = animatorSetMo12897D;
        animatorSetMo12897D.addListener(new C5991a());
        this.f29246b.start();
        if (!z2) {
            this.f29246b.end();
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public abstract AnimatorSet mo12897D(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
