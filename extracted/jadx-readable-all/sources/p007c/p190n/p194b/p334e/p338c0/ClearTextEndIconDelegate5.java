package p007c.p190n.p194b.p334e.p338c0;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: c.n.b.e.c0.e, reason: use source file name */
/* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class ClearTextEndIconDelegate5 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClearTextEndIconDelegate f24832a;

    public ClearTextEndIconDelegate5(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        this.f24832a = clearTextEndIconDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f24832a.f24866c.setScaleX(fFloatValue);
        this.f24832a.f24866c.setScaleY(fFloatValue);
    }
}
