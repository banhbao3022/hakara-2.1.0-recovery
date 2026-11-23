package p007c.p190n.p194b.p334e.p346g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: renamed from: c.n.b.e.g.a, reason: use source file name */
/* JADX INFO: compiled from: BottomAppBar.java */
/* JADX INFO: loaded from: classes.dex */
public class BottomAppBar2 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BottomAppBar f24983a;

    public BottomAppBar2(BottomAppBar bottomAppBar) {
        this.f24983a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        BottomAppBar.m12716w(this.f24983a);
        this.f24983a.f28783a0 = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f24983a.f28791i0++;
    }
}
