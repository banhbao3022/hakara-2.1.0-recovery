package p007c.p190n.p194b.p334e.p359s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: renamed from: c.n.b.e.s.d, reason: use source file name */
/* JADX INFO: compiled from: ExtendedFloatingActionButton.java */
/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton2 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f25354a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MotionStrategy f25355b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ExtendedFloatingActionButton.AbstractC5954i f25356c;

    public ExtendedFloatingActionButton2(ExtendedFloatingActionButton extendedFloatingActionButton, MotionStrategy motionStrategy, ExtendedFloatingActionButton.AbstractC5954i abstractC5954i) {
        this.f25355b = motionStrategy;
        this.f25356c = abstractC5954i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f25354a = true;
        this.f25355b.mo11264a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f25355b.mo11265e();
        if (this.f25354a) {
            return;
        }
        this.f25355b.mo11301g(this.f25356c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f25355b.onAnimationStart(animator);
        this.f25354a = false;
    }
}
