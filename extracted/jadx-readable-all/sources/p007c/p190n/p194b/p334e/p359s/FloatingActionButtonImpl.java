package p007c.p190n.p194b.p334e.p359s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: c.n.b.e.s.f, reason: use source file name */
/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButtonImpl extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f25359a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f25360b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FloatingActionButtonImpl3.f f25361c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ FloatingActionButtonImpl3 f25362d;

    public FloatingActionButtonImpl(FloatingActionButtonImpl3 floatingActionButtonImpl3, boolean z, FloatingActionButtonImpl3.f fVar) {
        this.f25362d = floatingActionButtonImpl3;
        this.f25360b = z;
        this.f25361c = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f25359a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        FloatingActionButtonImpl3 floatingActionButtonImpl3 = this.f25362d;
        floatingActionButtonImpl3.f25374B = 0;
        floatingActionButtonImpl3.f25399v = null;
        if (this.f25359a) {
            return;
        }
        FloatingActionButton floatingActionButton = floatingActionButtonImpl3.f25378F;
        boolean z = this.f25360b;
        floatingActionButton.m11348b(z ? 8 : 4, z);
        FloatingActionButtonImpl3.f fVar = this.f25361c;
        if (fVar != null) {
            FloatingActionButton2 floatingActionButton2 = (FloatingActionButton2) fVar;
            floatingActionButton2.f25357a.mo11108a(floatingActionButton2.f25358b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f25362d.f25378F.m11348b(0, this.f25360b);
        FloatingActionButtonImpl3 floatingActionButtonImpl3 = this.f25362d;
        floatingActionButtonImpl3.f25374B = 1;
        floatingActionButtonImpl3.f25399v = animator;
        this.f25359a = false;
    }
}
