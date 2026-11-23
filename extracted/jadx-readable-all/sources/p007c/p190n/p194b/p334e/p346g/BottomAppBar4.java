package p007c.p190n.p194b.p334e.p346g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.e.g.c, reason: use source file name */
/* JADX INFO: compiled from: BottomAppBar.java */
/* JADX INFO: loaded from: classes.dex */
public class BottomAppBar4 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f24987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionMenuView f24988b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f24989c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f24990d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ BottomAppBar f24991e;

    public BottomAppBar4(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f24991e = bottomAppBar;
        this.f24988b = actionMenuView;
        this.f24989c = i;
        this.f24990d = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f24987a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f24987a) {
            return;
        }
        BottomAppBar bottomAppBar = this.f24991e;
        int i = bottomAppBar.f28792j0;
        boolean z = i != 0;
        if (i != 0) {
            bottomAppBar.f28792j0 = 0;
            bottomAppBar.getMenu().clear();
            bottomAppBar.m235n(i);
        }
        BottomAppBar bottomAppBar2 = this.f24991e;
        ActionMenuView actionMenuView = this.f24988b;
        int i2 = this.f24989c;
        boolean z2 = this.f24990d;
        Objects.requireNonNull(bottomAppBar2);
        BottomAppBar5 bottomAppBar5 = new BottomAppBar5(bottomAppBar2, actionMenuView, i2, z2);
        if (z) {
            actionMenuView.post(bottomAppBar5);
        } else {
            bottomAppBar5.run();
        }
    }
}
