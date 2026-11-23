package p007c.p451o.p452a.p453c.p454a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p477d1.p493x.p494b.InterfaceC6164l;

/* JADX INFO: renamed from: c.o.a.c.a.d, reason: use source file name */
/* JADX INFO: compiled from: ViewPropertyAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ViewPropertyAnimator extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC6164l f27826a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC6164l f27827b;

    public ViewPropertyAnimator(InterfaceC6164l interfaceC6164l, InterfaceC6164l interfaceC6164l2) {
        this.f27826a = interfaceC6164l;
        this.f27827b = interfaceC6164l2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        InterfaceC6164l interfaceC6164l = this.f27826a;
        if (interfaceC6164l != null) {
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        InterfaceC6164l interfaceC6164l = this.f27827b;
        if (interfaceC6164l != null) {
        }
    }
}
