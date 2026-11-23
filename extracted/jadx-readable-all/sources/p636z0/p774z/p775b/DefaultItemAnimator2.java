package p636z0.p774z.p775b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* JADX INFO: renamed from: z0.z.b.i, reason: use source file name */
/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultItemAnimator2 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC0149b0 f39224a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f39225b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f39226c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DefaultItemAnimator f39227d;

    public DefaultItemAnimator2(DefaultItemAnimator defaultItemAnimator, RecyclerView.AbstractC0149b0 abstractC0149b0, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f39227d = defaultItemAnimator;
        this.f39224a = abstractC0149b0;
        this.f39225b = viewPropertyAnimator;
        this.f39226c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f39225b.setListener(null);
        this.f39226c.setAlpha(1.0f);
        this.f39227d.m693h(this.f39224a);
        this.f39227d.f39199r.remove(this.f39224a);
        this.f39227d.m17026t();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f39227d);
    }
}
