package p007c.p190n.p194b.p334e.p339d;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.AppBarLayout;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;

/* JADX INFO: renamed from: c.n.b.e.d.a, reason: use source file name */
/* JADX INFO: compiled from: AppBarLayout.java */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout2 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MaterialShapeDrawable f24906a;

    public AppBarLayout2(AppBarLayout appBarLayout, MaterialShapeDrawable materialShapeDrawable) {
        this.f24906a = materialShapeDrawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f24906a.m11380p(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
