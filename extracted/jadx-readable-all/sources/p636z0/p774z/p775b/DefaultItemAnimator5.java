package p636z0.p774z.p775b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* JADX INFO: renamed from: z0.z.b.l, reason: use source file name */
/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultItemAnimator5 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DefaultItemAnimator.d f39238a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f39239b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f39240c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DefaultItemAnimator f39241d;

    public DefaultItemAnimator5(DefaultItemAnimator defaultItemAnimator, DefaultItemAnimator.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f39241d = defaultItemAnimator;
        this.f39238a = dVar;
        this.f39239b = viewPropertyAnimator;
        this.f39240c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f39239b.setListener(null);
        this.f39240c.setAlpha(1.0f);
        this.f39240c.setTranslationX(0.0f);
        this.f39240c.setTranslationY(0.0f);
        this.f39241d.m693h(this.f39238a.f39207a);
        this.f39241d.f39200s.remove(this.f39238a.f39207a);
        this.f39241d.m17026t();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        DefaultItemAnimator defaultItemAnimator = this.f39241d;
        RecyclerView.AbstractC0149b0 abstractC0149b0 = this.f39238a.f39207a;
        Objects.requireNonNull(defaultItemAnimator);
    }
}
