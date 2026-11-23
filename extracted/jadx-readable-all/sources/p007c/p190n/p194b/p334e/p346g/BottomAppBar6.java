package p007c.p190n.p194b.p334e.p346g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: c.n.b.e.g.e, reason: use source file name */
/* JADX INFO: compiled from: BottomAppBar.java */
/* JADX INFO: loaded from: classes.dex */
public class BottomAppBar6 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BottomAppBar f24996a;

    public BottomAppBar6(BottomAppBar bottomAppBar) {
        this.f24996a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f24996a.f28799q0.onAnimationStart(animator);
        FloatingActionButton floatingActionButtonM12720C = this.f24996a.m12720C();
        if (floatingActionButtonM12720C != null) {
            floatingActionButtonM12720C.setTranslationX(this.f24996a.getFabTranslationX());
        }
    }
}
