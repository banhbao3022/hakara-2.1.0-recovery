package p555j.p556a.p557a.p558a.p559a.p590r;

import android.os.CountDownTimer;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayer;

/* JADX INFO: renamed from: j.a.a.a.a.r.w */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CountDownTimerC6820w extends CountDownTimer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31924a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC6820w(SingActivity singActivity, long j2, long j3) {
        super(j2, j3);
        this.f31924a = singActivity;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        YouTubePlayer youTubePlayer = this.f31924a.f33900D;
        if (youTubePlayer != null) {
            youTubePlayer.seekTo(0.0f);
        }
        YouTubePlayer youTubePlayer2 = this.f31924a.f33900D;
        if (youTubePlayer2 != null) {
            youTubePlayer2.mo1318U();
        }
        this.f31924a.m14455p0();
        this.f31924a.m14450j0();
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j2) {
    }
}
