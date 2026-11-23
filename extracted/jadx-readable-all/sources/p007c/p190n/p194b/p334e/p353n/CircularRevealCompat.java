package p007c.p190n.p194b.p334e.p353n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: c.n.b.e.n.a, reason: use source file name */
/* JADX INFO: compiled from: CircularRevealCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class CircularRevealCompat extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CircularRevealWidget f25183a;

    public CircularRevealCompat(CircularRevealWidget circularRevealWidget) {
        this.f25183a = circularRevealWidget;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f25183a.mo11200b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f25183a.mo11199a();
    }
}
