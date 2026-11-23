package p636z0.p774z.p775b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* JADX INFO: renamed from: z0.z.b.j, reason: use source file name */
/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultItemAnimator3 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC0149b0 f39228a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f39229b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f39230c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DefaultItemAnimator f39231d;

    public DefaultItemAnimator3(DefaultItemAnimator defaultItemAnimator, RecyclerView.AbstractC0149b0 abstractC0149b0, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f39231d = defaultItemAnimator;
        this.f39228a = abstractC0149b0;
        this.f39229b = view;
        this.f39230c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f39229b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f39230c.setListener(null);
        this.f39231d.m693h(this.f39228a);
        this.f39231d.f39197p.remove(this.f39228a);
        this.f39231d.m17026t();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f39231d);
    }
}
