package p007c.p190n.p194b.p334e.p338c0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: c.n.b.e.c0.b, reason: use source file name */
/* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class ClearTextEndIconDelegate2 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClearTextEndIconDelegate f24829a;

    public ClearTextEndIconDelegate2(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        this.f24829a = clearTextEndIconDelegate;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f24829a.f24864a.setEndIconVisible(true);
    }
}
