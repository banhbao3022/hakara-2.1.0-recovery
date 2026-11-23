package p007c.p190n.p194b.p334e.p339d;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* JADX INFO: renamed from: c.n.b.e.d.e, reason: use source file name */
/* JADX INFO: compiled from: CollapsingToolbarLayout.java */
/* JADX INFO: loaded from: classes.dex */
public class CollapsingToolbarLayout2 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CollapsingToolbarLayout f24917a;

    public CollapsingToolbarLayout2(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f24917a = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f24917a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
