package p636z0.p774z.p775b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* JADX INFO: renamed from: z0.z.b.k, reason: use source file name */
/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultItemAnimator4 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC0149b0 f39232a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f39233b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f39234c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f39235d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f39236e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DefaultItemAnimator f39237f;

    public DefaultItemAnimator4(DefaultItemAnimator defaultItemAnimator, RecyclerView.AbstractC0149b0 abstractC0149b0, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f39237f = defaultItemAnimator;
        this.f39232a = abstractC0149b0;
        this.f39233b = i;
        this.f39234c = view;
        this.f39235d = i2;
        this.f39236e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.f39233b != 0) {
            this.f39234c.setTranslationX(0.0f);
        }
        if (this.f39235d != 0) {
            this.f39234c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f39236e.setListener(null);
        this.f39237f.m693h(this.f39232a);
        this.f39237f.f39198q.remove(this.f39232a);
        this.f39237f.m17026t();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f39237f);
    }
}
