package p007c.p008a.p009a.p010a.p011a.p013b;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.Objects;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p754q.p755a.p756a.FastOutLinearInInterpolator;
import p636z0.p754q.p755a.p756a.LinearOutSlowInInterpolator;

/* JADX INFO: renamed from: c.a.a.a.a.b.a, reason: use source file name */
/* JADX INFO: compiled from: BottomViewHideShowAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BottomViewHideShowAnimation extends AnimationSet {

    /* JADX INFO: renamed from: f */
    public final View f1483f;

    /* JADX INFO: renamed from: g */
    public final boolean f1484g;

    /* JADX INFO: renamed from: c.a.a.a.a.b.a$a */
    /* JADX INFO: compiled from: BottomViewHideShowAnimation.kt */
    public final class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Intrinsics2.m13089e(animation, "animation");
            BottomViewHideShowAnimation bottomViewHideShowAnimation = BottomViewHideShowAnimation.this;
            bottomViewHideShowAnimation.f1483f.setVisibility(bottomViewHideShowAnimation.f1484g ? 0 : 8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics2.m13089e(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics2.m13089e(animation, "animation");
            BottomViewHideShowAnimation.this.f1483f.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomViewHideShowAnimation(View view, boolean z, long j2) {
        super(false);
        Intrinsics2.m13089e(view, "animationView");
        this.f1483f = view;
        this.f1484g = z;
        AlphaAnimation alphaAnimation = new AlphaAnimation(!z ? 1 : 0, z ? 1.0f : 0.0f);
        alphaAnimation.setDuration(j2);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, z ? m1002a(view) : 0, z ? 0 : m1002a(view));
        translateAnimation.setInterpolator(z ? new LinearOutSlowInInterpolator() : new FastOutLinearInInterpolator());
        translateAnimation.setDuration(j2);
        addAnimation(alphaAnimation);
        addAnimation(translateAnimation);
        setAnimationListener(new a());
    }

    /* JADX INFO: renamed from: a */
    public final int m1002a(View view) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = view.getContext().getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels - view.getTop();
    }
}
