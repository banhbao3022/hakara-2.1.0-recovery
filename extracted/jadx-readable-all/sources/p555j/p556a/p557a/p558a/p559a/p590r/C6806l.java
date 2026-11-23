package p555j.p556a.p557a.p558a.p559a.p590r;

import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayer;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p607a.NowPlayingMetadata;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.a.a.r.l */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6806l implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SingActivity f31897f;

    public C6806l(SingActivity singActivity) {
        this.f31897f = singActivity;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Intrinsics2.m13089e(seekBar, "sb");
        if (z) {
            YouTubePlayer youTubePlayer = this.f31897f.f33900D;
            if (youTubePlayer != null) {
                youTubePlayer.seekTo(seekBar.getProgress());
            }
            TextView textView = (TextView) this.f31897f.m14442U(R.id.currTime);
            Intrinsics2.m13088d(textView, "currTime");
            NowPlayingMetadata.a aVar = NowPlayingMetadata.f32263a;
            textView.setText(aVar.m14034a(seekBar.getProgress()));
            TextView textView2 = (TextView) this.f31897f.m14442U(R.id.timerTextView);
            Intrinsics2.m13088d(textView2, "timerTextView");
            textView2.setText(aVar.m14034a(seekBar.getProgress()));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        Intrinsics2.m13089e(seekBar, "seekBar");
        SingActivity singActivity = this.f31897f;
        if (singActivity.f33930h0) {
            return;
        }
        singActivity.f33930h0 = true;
        TextView textView = (TextView) singActivity.m14442U(R.id.btnSingContinue);
        Intrinsics2.m13088d(textView, "btnSingContinue");
        SkuDao.a.m14068T(textView);
        RelativeLayout relativeLayout = (RelativeLayout) this.f31897f.m14442U(R.id.layoutNextPrevSecond);
        Intrinsics2.m13088d(relativeLayout, "layoutNextPrevSecond");
        SkuDao.a.m14068T(relativeLayout);
        SingActivity singActivity2 = this.f31897f;
        singActivity2.f33928f0 = (int) singActivity2.currentSeconds();
        Intrinsics2.m13089e(String.valueOf(this.f31897f.f33928f0), "message");
        this.f31897f.m14456q0();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        Intrinsics2.m13089e(seekBar, "seekBar");
    }
}
