package p007c.p190n.p194b.p334e.p338c0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: c.n.b.e.c0.c, reason: use source file name */
/* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class ClearTextEndIconDelegate3 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClearTextEndIconDelegate f24830a;

    public ClearTextEndIconDelegate3(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        this.f24830a = clearTextEndIconDelegate;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f24830a.f24864a.setEndIconVisible(false);
    }
}
