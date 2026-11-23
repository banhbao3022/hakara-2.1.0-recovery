package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p007c.p190n.p194b.p334e.p337c.AnimatorSetCompat;
import p007c.p190n.p194b.p334e.p337c.MotionTiming;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c */
    public final MotionTiming f29259c;

    /* JADX INFO: renamed from: d */
    public final MotionTiming f29260d;

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C5994a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f29261a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f29262b;

        public C5994a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f29261a = z;
            this.f29262b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f29261a) {
                return;
            }
            this.f29262b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f29261a) {
                this.f29262b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f29259c = new MotionTiming(75L, 150L);
        this.f29260d = new MotionTiming(0L, 150L);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: A */
    public boolean mo308A(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* JADX INFO: renamed from: D */
    public AnimatorSet mo12897D(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        m12909E(view2, z, z2, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.m11032a(animatorSet, arrayList);
        animatorSet.addListener(new C5994a(this, z, view2));
        return animatorSet;
    }

    /* JADX INFO: renamed from: E */
    public final void m12909E(View view, boolean z, boolean z2, List list) {
        ObjectAnimator objectAnimatorOfFloat;
        MotionTiming motionTiming = z ? this.f29259c : this.f29260d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        motionTiming.m11041a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: d */
    public boolean mo312d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29259c = new MotionTiming(75L, 150L);
        this.f29260d = new MotionTiming(0L, 150L);
    }
}
