package p636z0.p685e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: z0.e0.j, reason: use source file name */
/* JADX INFO: compiled from: Transition.java */
/* JADX INFO: loaded from: classes.dex */
public class Transition4 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayMap f36472a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Transition3 f36473b;

    public Transition4(Transition3 transition3, ArrayMap arrayMap) {
        this.f36473b = transition3;
        this.f36472a = arrayMap;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f36472a.remove(animator);
        this.f36473b.f36461u.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f36473b.f36461u.add(animator);
    }
}
