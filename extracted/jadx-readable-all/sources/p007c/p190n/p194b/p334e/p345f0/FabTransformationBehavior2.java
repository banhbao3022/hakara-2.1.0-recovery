package p007c.p190n.p194b.p334e.p345f0;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;

/* JADX INFO: renamed from: c.n.b.e.f0.a, reason: use source file name */
/* JADX INFO: compiled from: FabTransformationBehavior.java */
/* JADX INFO: loaded from: classes.dex */
public class FabTransformationBehavior2 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f24979a;

    public FabTransformationBehavior2(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.f24979a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f24979a.invalidate();
    }
}
