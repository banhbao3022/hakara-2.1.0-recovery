package p636z0.p774z.p775b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* JADX INFO: renamed from: z0.z.b.m, reason: use source file name */
/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultItemAnimator6 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DefaultItemAnimator.d f39242a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f39243b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f39244c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DefaultItemAnimator f39245d;

    public DefaultItemAnimator6(DefaultItemAnimator defaultItemAnimator, DefaultItemAnimator.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f39245d = defaultItemAnimator;
        this.f39242a = dVar;
        this.f39243b = viewPropertyAnimator;
        this.f39244c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f39243b.setListener(null);
        this.f39244c.setAlpha(1.0f);
        this.f39244c.setTranslationX(0.0f);
        this.f39244c.setTranslationY(0.0f);
        this.f39245d.m693h(this.f39242a.f39208b);
        this.f39245d.f39200s.remove(this.f39242a.f39208b);
        this.f39245d.m17026t();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        DefaultItemAnimator defaultItemAnimator = this.f39245d;
        RecyclerView.AbstractC0149b0 abstractC0149b0 = this.f39242a.f39208b;
        Objects.requireNonNull(defaultItemAnimator);
    }
}
