package p636z0.p752p.p753c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: z0.p.c.d, reason: use source file name */
/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultSpecialEffectsController2 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f38304a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f38305b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f38306c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ SpecialEffectsController.d f38307d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ DefaultSpecialEffectsController.b f38308e;

    public DefaultSpecialEffectsController2(DefaultSpecialEffectsController defaultSpecialEffectsController, ViewGroup viewGroup, View view, boolean z, SpecialEffectsController.d dVar, DefaultSpecialEffectsController.b bVar) {
        this.f38304a = viewGroup;
        this.f38305b = view;
        this.f38306c = z;
        this.f38307d = dVar;
        this.f38308e = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f38304a.endViewTransition(this.f38305b);
        if (this.f38306c) {
            this.f38307d.f38583a.m16632f(this.f38305b);
        }
        this.f38308e.m16466a();
    }
}
