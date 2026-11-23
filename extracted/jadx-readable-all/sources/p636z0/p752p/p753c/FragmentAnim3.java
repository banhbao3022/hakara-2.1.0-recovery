package p636z0.p752p.p753c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p636z0.p725k.p735h.CancellationSignal;

/* JADX INFO: renamed from: z0.p.c.q, reason: use source file name */
/* JADX INFO: compiled from: FragmentAnim.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentAnim3 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f38515a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f38516b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Fragment f38517c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ FragmentTransition7.a f38518d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CancellationSignal f38519e;

    public FragmentAnim3(ViewGroup viewGroup, View view, Fragment fragment, FragmentTransition7.a aVar, CancellationSignal cancellationSignal) {
        this.f38515a = viewGroup;
        this.f38516b = view;
        this.f38517c = fragment;
        this.f38518d = aVar;
        this.f38519e = cancellationSignal;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f38515a.endViewTransition(this.f38516b);
        Fragment fragment = this.f38517c;
        Fragment.b bVar = fragment.f38419P;
        Animator animator2 = bVar == null ? null : bVar.f38454b;
        fragment.m16538L0(null);
        if (animator2 == null || this.f38515a.indexOfChild(this.f38516b) >= 0) {
            return;
        }
        ((FragmentManager.d) this.f38518d).m16711a(this.f38517c, this.f38519e);
    }
}
