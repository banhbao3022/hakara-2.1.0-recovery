package p007c.p190n.p194b.p334e.p339d;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: renamed from: c.n.b.e.d.b, reason: use source file name */
/* JADX INFO: compiled from: AppBarLayout.java */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout3 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoordinatorLayout f24907a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppBarLayout f24908b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AppBarLayout.BaseBehavior f24909c;

    public AppBarLayout3(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f24909c = baseBehavior;
        this.f24907a = coordinatorLayout;
        this.f24908b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f24909c.m11078K(this.f24907a, this.f24908b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
