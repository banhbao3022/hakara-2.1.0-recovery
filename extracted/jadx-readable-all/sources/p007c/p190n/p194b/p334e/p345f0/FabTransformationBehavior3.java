package p007c.p190n.p194b.p334e.p345f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.transformation.FabTransformationBehavior;
import p007c.p190n.p194b.p334e.p353n.CircularRevealWidget;

/* JADX INFO: renamed from: c.n.b.e.f0.b, reason: use source file name */
/* JADX INFO: compiled from: FabTransformationBehavior.java */
/* JADX INFO: loaded from: classes.dex */
public class FabTransformationBehavior3 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CircularRevealWidget f24980a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Drawable f24981b;

    public FabTransformationBehavior3(FabTransformationBehavior fabTransformationBehavior, CircularRevealWidget circularRevealWidget, Drawable drawable) {
        this.f24980a = circularRevealWidget;
        this.f24981b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f24980a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f24980a.setCircularRevealOverlayDrawable(this.f24981b);
    }
}
