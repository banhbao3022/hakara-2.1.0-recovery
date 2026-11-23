package p007c.p190n.p194b.p334e.p338c0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: c.n.b.e.c0.l, reason: use source file name */
/* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class DropdownMenuEndIconDelegate5 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DropdownMenuEndIconDelegate f24863a;

    public DropdownMenuEndIconDelegate5(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        this.f24863a = dropdownMenuEndIconDelegate;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = this.f24863a;
        dropdownMenuEndIconDelegate.f24866c.setChecked(dropdownMenuEndIconDelegate.f24842j);
        this.f24863a.f24848p.start();
    }
}
