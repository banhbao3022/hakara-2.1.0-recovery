package p007c.p190n.p194b.p334e.p338c0;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: c.n.b.e.c0.d, reason: use source file name */
/* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class ClearTextEndIconDelegate4 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClearTextEndIconDelegate f24831a;

    public ClearTextEndIconDelegate4(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        this.f24831a = clearTextEndIconDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f24831a.f24866c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
