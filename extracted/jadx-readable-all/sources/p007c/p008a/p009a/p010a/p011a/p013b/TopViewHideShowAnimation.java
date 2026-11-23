package p007c.p008a.p009a.p010a.p011a.p013b;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p754q.p755a.p756a.FastOutLinearInInterpolator;
import p636z0.p754q.p755a.p756a.LinearOutSlowInInterpolator;

/* JADX INFO: renamed from: c.a.a.a.a.b.b, reason: use source file name */
/* JADX INFO: compiled from: TopViewHideShowAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TopViewHideShowAnimation extends AnimationSet {

    /* JADX INFO: renamed from: f */
    public final View f1486f;

    /* JADX INFO: renamed from: g */
    public final boolean f1487g;

    /* JADX INFO: renamed from: c.a.a.a.a.b.b$a */
    /* JADX INFO: compiled from: TopViewHideShowAnimation.kt */
    public final class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Intrinsics2.m13089e(animation, "animation");
            TopViewHideShowAnimation topViewHideShowAnimation = TopViewHideShowAnimation.this;
            topViewHideShowAnimation.f1486f.setVisibility(topViewHideShowAnimation.f1487g ? 0 : 8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics2.m13089e(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics2.m13089e(animation, "animation");
            TopViewHideShowAnimation.this.f1486f.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopViewHideShowAnimation(View view, boolean z, long j2) {
        super(false);
        Intrinsics2.m13089e(view, "animationView");
        this.f1486f = view;
        this.f1487g = z;
        AlphaAnimation alphaAnimation = new AlphaAnimation(!z ? 1 : 0, z ? 1.0f : 0.0f);
        alphaAnimation.setDuration(j2);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, z ? -view.getHeight() : 0, z ? 0 : -view.getHeight());
        translateAnimation.setInterpolator(z ? new LinearOutSlowInInterpolator() : new FastOutLinearInInterpolator());
        translateAnimation.setDuration(j2);
        addAnimation(alphaAnimation);
        addAnimation(translateAnimation);
        setAnimationListener(new a());
    }
}
