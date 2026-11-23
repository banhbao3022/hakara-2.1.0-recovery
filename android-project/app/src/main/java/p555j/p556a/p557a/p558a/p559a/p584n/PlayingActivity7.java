package p555j.p556a.p557a.p558a.p559a.p584n;

import android.animation.ArgbEvaluator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.SimpleColorFilter;
import p007c.p056c.p057a.p059b0.KeyPath;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: j.a.a.a.a.n.g, reason: use source file name */
/* JADX INFO: compiled from: PlayingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PlayingActivity7 implements AppBarLayout.InterfaceC5907d {

    /* JADX INFO: renamed from: a */
    public int f31680a = R.attr.account_toolbar_icon_tint_uncollapsed;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PlayingActivity f31681b;

    public PlayingActivity7(PlayingActivity playingActivity) {
        this.f31681b = playingActivity;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC5905b
    /* JADX INFO: renamed from: a */
    public void mo12696a(AppBarLayout appBarLayout, int i) {
        Intrinsics2.m13089e(appBarLayout, "appBarLayout");
        PlayingActivity playingActivity = this.f31681b;
        int i2 = playingActivity.f33648D + i;
        if (i2 != playingActivity.f33650F) {
            playingActivity.f33650F = i2;
            playingActivity.m14392m0();
            PlayingActivity playingActivity2 = this.f31681b;
            int i3 = playingActivity2.f33648D + i < 0 ? R.attr.account_toolbar_icon_tint_collapsed : R.attr.account_toolbar_icon_tint_uncollapsed;
            if (i3 != this.f31680a) {
                this.f31680a = i3;
            }
            float fAbs = Math.abs(i);
            PlayingActivity playingActivity3 = this.f31681b;
            playingActivity2.f33649E = fAbs / playingActivity3.f33648D;
            if (playingActivity3.f33649E > 1) {
                playingActivity3.f33649E = 1.0f;
            }
            playingActivity3.m14394o0();
            Object objEvaluate = new ArgbEvaluator().evaluate(this.f31681b.f33649E, 0, Integer.valueOf(ContextCompat.m16134b(this.f31681b, R.color.white)));
            Objects.requireNonNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) objEvaluate).intValue();
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            PlayingActivity playingActivity4 = this.f31681b;
            Object objEvaluate2 = argbEvaluator.evaluate(playingActivity4.f33649E, Integer.valueOf(ContextCompat.m16134b(playingActivity4, R.color.white_light)), Integer.valueOf(ContextCompat.m16134b(this.f31681b, R.color.title_color)));
            Objects.requireNonNull(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) objEvaluate2).intValue();
            PlayingActivity playingActivity5 = this.f31681b;
            if (playingActivity5.f33665U && playingActivity5.f33668X == 1) {
                ArgbEvaluator argbEvaluator2 = new ArgbEvaluator();
                PlayingActivity playingActivity6 = this.f31681b;
                Object objEvaluate3 = argbEvaluator2.evaluate(playingActivity6.f33649E, Integer.valueOf(ContextCompat.m16134b(playingActivity6, R.color.transparent_white)), Integer.valueOf(ContextCompat.m16134b(this.f31681b, R.color.title_color)));
                Objects.requireNonNull(objEvaluate3, "null cannot be cast to non-null type kotlin.Int");
                iIntValue2 = ((Integer) objEvaluate3).intValue();
            }
            ArgbEvaluator argbEvaluator3 = new ArgbEvaluator();
            PlayingActivity playingActivity7 = this.f31681b;
            Object objEvaluate4 = argbEvaluator3.evaluate(playingActivity7.f33649E, Integer.valueOf(ContextCompat.m16134b(playingActivity7, R.color.white_light)), Integer.valueOf(ContextCompat.m16134b(this.f31681b, R.color.title_color)));
            Objects.requireNonNull(objEvaluate4, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue3 = ((Integer) objEvaluate4).intValue();
            Object objEvaluate5 = new ArgbEvaluator().evaluate(this.f31681b.f33649E, 0, Integer.valueOf(ContextCompat.m16134b(this.f31681b, R.color.line)));
            Objects.requireNonNull(objEvaluate5, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue4 = ((Integer) objEvaluate5).intValue();
            ((TextView) this.f31681b.m14383U(R.id.toolbarTitle)).setTextColor(iIntValue2);
            ((Toolbar) this.f31681b.m14383U(R.id.playingToolbar)).setBackgroundColor(iIntValue);
            this.f31681b.m14383U(R.id.toolbarLine).setBackgroundColor(iIntValue4);
            ((ImageView) this.f31681b.m14383U(R.id.btnBack)).setColorFilter(iIntValue3);
            ((LottieAnimationView) this.f31681b.m14383U(R.id.f33394eq)).f28104n.m1462a(new KeyPath("**"), LottieProperty.f2451C, new LottieValueCallback(new SimpleColorFilter(iIntValue3)));
        }
    }
}
