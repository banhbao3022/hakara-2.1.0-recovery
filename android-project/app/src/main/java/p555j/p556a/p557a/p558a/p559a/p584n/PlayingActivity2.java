package p555j.p556a.p557a.p558a.p559a.p584n;

import android.widget.RelativeLayout;
import java.util.TimerTask;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.n.b, reason: use source file name */
/* JADX INFO: compiled from: PlayingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PlayingActivity2 extends TimerTask {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlayingActivity f31675f;

    public PlayingActivity2(PlayingActivity playingActivity) {
        this.f31675f = playingActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        PlayingActivity playingActivity = this.f31675f;
        RelativeLayout relativeLayout = (RelativeLayout) playingActivity.m14383U(R.id.giftAnimationView);
        Intrinsics2.m13088d(relativeLayout, "giftAnimationView");
        playingActivity.slideDown(relativeLayout);
    }
}
