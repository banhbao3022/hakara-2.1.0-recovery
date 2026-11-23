package p636z0.p685e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: z0.e0.k, reason: use source file name */
/* JADX INFO: compiled from: Transition.java */
/* JADX INFO: loaded from: classes.dex */
public class Transition5 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Transition3 f36474a;

    public Transition5(Transition3 transition3) {
        this.f36474a = transition3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f36474a.m15513p();
        animator.removeListener(this);
    }
}
