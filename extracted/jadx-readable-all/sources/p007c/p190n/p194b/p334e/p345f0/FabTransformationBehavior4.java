package p007c.p190n.p194b.p334e.p345f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.FabTransformationBehavior;
import p007c.p190n.p194b.p334e.p353n.CircularRevealWidget;

/* JADX INFO: renamed from: c.n.b.e.f0.c, reason: use source file name */
/* JADX INFO: compiled from: FabTransformationBehavior.java */
/* JADX INFO: loaded from: classes.dex */
public class FabTransformationBehavior4 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CircularRevealWidget f24982a;

    public FabTransformationBehavior4(FabTransformationBehavior fabTransformationBehavior, CircularRevealWidget circularRevealWidget) {
        this.f24982a = circularRevealWidget;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        CircularRevealWidget.e revealInfo = this.f24982a.getRevealInfo();
        revealInfo.f25198c = Float.MAX_VALUE;
        this.f24982a.setRevealInfo(revealInfo);
    }
}
