package p555j.p556a.p557a.p619l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.l.f, reason: use source file name */
/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Extensions extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f33085a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f33086b;

    public Extensions(View view, int i) {
        this.f33085a = view;
        this.f33086b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        Intrinsics2.m13089e(animator, "animation");
        super.onAnimationEnd(animator);
        this.f33085a.setVisibility(this.f33086b);
    }
}
