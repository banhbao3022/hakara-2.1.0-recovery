package p007c.p190n.p194b.p334e.p359s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: c.n.b.e.s.g, reason: use source file name */
/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButtonImpl2 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f25363a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingActionButtonImpl3.f f25364b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FloatingActionButtonImpl3 f25365c;

    public FloatingActionButtonImpl2(FloatingActionButtonImpl3 floatingActionButtonImpl3, boolean z, FloatingActionButtonImpl3.f fVar) {
        this.f25365c = floatingActionButtonImpl3;
        this.f25363a = z;
        this.f25364b = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        FloatingActionButtonImpl3 floatingActionButtonImpl3 = this.f25365c;
        floatingActionButtonImpl3.f25374B = 0;
        floatingActionButtonImpl3.f25399v = null;
        FloatingActionButtonImpl3.f fVar = this.f25364b;
        if (fVar != null) {
            FloatingActionButton2 floatingActionButton2 = (FloatingActionButton2) fVar;
            floatingActionButton2.f25357a.mo11109b(floatingActionButton2.f25358b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f25365c.f25378F.m11348b(0, this.f25363a);
        FloatingActionButtonImpl3 floatingActionButtonImpl3 = this.f25365c;
        floatingActionButtonImpl3.f25374B = 2;
        floatingActionButtonImpl3.f25399v = animator;
    }
}
