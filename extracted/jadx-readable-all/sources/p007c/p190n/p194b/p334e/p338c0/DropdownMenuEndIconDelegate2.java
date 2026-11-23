package p007c.p190n.p194b.p334e.p338c0;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: c.n.b.e.c0.i, reason: use source file name */
/* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class DropdownMenuEndIconDelegate2 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DropdownMenuEndIconDelegate f24859a;

    public DropdownMenuEndIconDelegate2(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        this.f24859a = dropdownMenuEndIconDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f24859a.f24866c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
