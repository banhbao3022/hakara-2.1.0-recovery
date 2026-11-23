package p555j.p556a.p557a.p558a.p559a.p584n;

import android.widget.RelativeLayout;
import java.util.TimerTask;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.a.a.n.a, reason: use source file name */
/* JADX INFO: compiled from: Timer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Timer extends TimerTask {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlayingActivity f31674f;

    public Timer(PlayingActivity playingActivity) {
        this.f31674f = playingActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f31674f.m14383U(R.id.controlLayout);
        Intrinsics2.m13088d(relativeLayout, "controlLayout");
        SkuDao.a.m14113z(relativeLayout, true);
        PlayingActivity playingActivity = this.f31674f;
        if (playingActivity.f33665U && playingActivity.f33668X == 1) {
            RelativeLayout relativeLayout2 = (RelativeLayout) playingActivity.m14383U(R.id.layoutVideoVertical);
            Intrinsics2.m13088d(relativeLayout2, "layoutVideoVertical");
            if (relativeLayout2.getVisibility() == 4) {
                RelativeLayout relativeLayout3 = (RelativeLayout) this.f31674f.m14383U(R.id.layoutVideoVertical);
                Intrinsics2.m13088d(relativeLayout3, "layoutVideoVertical");
                SkuDao.a.m14098l0(relativeLayout3, true);
            }
        }
    }
}
