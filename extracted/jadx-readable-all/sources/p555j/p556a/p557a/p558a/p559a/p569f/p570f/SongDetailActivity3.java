package p555j.p556a.p557a.p558a.p559a.p569f.p570f;

import android.animation.ArgbEvaluator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.song.detail.SongDetailActivity;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: j.a.a.a.a.f.f.b, reason: use source file name */
/* JADX INFO: compiled from: SongDetailActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SongDetailActivity3 implements AppBarLayout.InterfaceC5907d {

    /* JADX INFO: renamed from: a */
    public int f31310a = R.attr.account_toolbar_icon_tint_uncollapsed;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SongDetailActivity f31311b;

    public SongDetailActivity3(SongDetailActivity songDetailActivity) {
        this.f31311b = songDetailActivity;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC5905b
    /* JADX INFO: renamed from: a */
    public void mo12696a(AppBarLayout appBarLayout, int i) {
        Intrinsics2.m13089e(appBarLayout, "appBarLayout");
        SongDetailActivity songDetailActivity = this.f31311b;
        int i2 = songDetailActivity.f34001z + i < 0 ? R.attr.account_toolbar_icon_tint_collapsed : R.attr.account_toolbar_icon_tint_uncollapsed;
        if (i2 != this.f31310a) {
            this.f31310a = i2;
        }
        float fAbs = Math.abs(i);
        SongDetailActivity songDetailActivity2 = this.f31311b;
        int i3 = songDetailActivity2.f34001z;
        songDetailActivity.f33995A = fAbs / i3;
        if (songDetailActivity2.f33995A > 1) {
            songDetailActivity2.f33995A = 1.0f;
        }
        songDetailActivity2.f33996B = i3 + i;
        songDetailActivity2.m14462V();
        Object objEvaluate = new ArgbEvaluator().evaluate(this.f31311b.f33995A, 0, Integer.valueOf(ContextCompat.m16134b(this.f31311b, R.color.white)));
        Objects.requireNonNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) objEvaluate).intValue();
        Object objEvaluate2 = new ArgbEvaluator().evaluate(this.f31311b.f33995A, 0, Integer.valueOf(ContextCompat.m16134b(this.f31311b, R.color.title_color)));
        Objects.requireNonNull(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) objEvaluate2).intValue();
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        SongDetailActivity songDetailActivity3 = this.f31311b;
        Object objEvaluate3 = argbEvaluator.evaluate(songDetailActivity3.f33995A, Integer.valueOf(ContextCompat.m16134b(songDetailActivity3, R.color.white_light)), Integer.valueOf(ContextCompat.m16134b(this.f31311b, R.color.title_color)));
        Objects.requireNonNull(objEvaluate3, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue3 = ((Integer) objEvaluate3).intValue();
        Object objEvaluate4 = new ArgbEvaluator().evaluate(this.f31311b.f33995A, 0, Integer.valueOf(ContextCompat.m16134b(this.f31311b, R.color.line)));
        Objects.requireNonNull(objEvaluate4, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue4 = ((Integer) objEvaluate4).intValue();
        ((Toolbar) this.f31311b.m14461U(R.id.toolbar)).setBackgroundColor(iIntValue);
        ((TextView) this.f31311b.m14461U(R.id.toolbarTitle)).setTextColor(iIntValue2);
        this.f31311b.m14461U(R.id.toolbarLine).setBackgroundColor(iIntValue4);
        ((ImageView) this.f31311b.m14461U(R.id.btnBack)).setColorFilter(iIntValue3);
        ((ImageView) this.f31311b.m14461U(R.id.btnSearch)).setColorFilter(iIntValue3);
    }
}
