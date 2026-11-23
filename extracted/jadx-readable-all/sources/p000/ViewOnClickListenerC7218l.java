package p000;

import android.view.View;
import android.widget.RelativeLayout;
import java.util.Timer;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: l */
/* JADX INFO: compiled from: java-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC7218l implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f33301f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f33302g;

    public ViewOnClickListenerC7218l(int i, Object obj) {
        this.f33301f = i;
        this.f33302g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f33301f;
        if (i != 0) {
            if (i != 1) {
                throw null;
            }
            PlayingActivity.m14377Y((PlayingActivity) this.f33302g);
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) ((PlayingActivity) this.f33302g).m14383U(R.id.controlLayout);
        Intrinsics2.m13088d(relativeLayout, "controlLayout");
        if (relativeLayout.getVisibility() == 0) {
            RelativeLayout relativeLayout2 = (RelativeLayout) ((PlayingActivity) this.f33302g).m14383U(R.id.controlLayout);
            Intrinsics2.m13088d(relativeLayout2, "controlLayout");
            SkuDao.a.m14113z(relativeLayout2, true);
            PlayingActivity playingActivity = (PlayingActivity) this.f33302g;
            if (playingActivity.f33665U && playingActivity.f33668X == 1) {
                RelativeLayout relativeLayout3 = (RelativeLayout) playingActivity.m14383U(R.id.layoutVideoVertical);
                Intrinsics2.m13088d(relativeLayout3, "layoutVideoVertical");
                SkuDao.a.m14098l0(relativeLayout3, true);
                return;
            }
            return;
        }
        RelativeLayout relativeLayout4 = (RelativeLayout) ((PlayingActivity) this.f33302g).m14383U(R.id.controlLayout);
        Intrinsics2.m13088d(relativeLayout4, "controlLayout");
        SkuDao.a.m14098l0(relativeLayout4, true);
        PlayingActivity playingActivity2 = (PlayingActivity) this.f33302g;
        if (playingActivity2.f33665U && playingActivity2.f33668X == 1) {
            Intrinsics2.m13089e("layoutVideoVertical.invisible", "message");
            RelativeLayout relativeLayout5 = (RelativeLayout) ((PlayingActivity) this.f33302g).m14383U(R.id.layoutVideoVertical);
            Intrinsics2.m13088d(relativeLayout5, "layoutVideoVertical");
            SkuDao.a.m14113z(relativeLayout5, true);
        }
        PlayingActivity playingActivity3 = (PlayingActivity) this.f33302g;
        playingActivity3.f33652H.cancel();
        Timer timer = new Timer();
        playingActivity3.f33652H = timer;
        timer.schedule(new p555j.p556a.p557a.p558a.p559a.p584n.Timer(playingActivity3), 7000L);
    }
}
