package p007c.p451o.p452a.p453c.p454a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p007c.p451o.p452a.C5729a;

/* JADX INFO: renamed from: c.o.a.c.a.b, reason: use source file name */
/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
public final class View extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ android.view.View f27822a;

    public View(android.view.View view, boolean z) {
        this.f27822a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        C5729a.m12429B(this.f27822a);
    }
}
