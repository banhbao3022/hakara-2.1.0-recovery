package p007c.p190n.p194b.p334e.p348i;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;

/* JADX INFO: renamed from: c.n.b.e.i.a, reason: use source file name */
/* JADX INFO: compiled from: BottomSheetBehavior.java */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior2 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f25055a;

    public BottomSheetBehavior2(BottomSheetBehavior bottomSheetBehavior) {
        this.f25055a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        MaterialShapeDrawable materialShapeDrawable = this.f25055a.f28845i;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.m11382r(fFloatValue);
        }
    }
}
