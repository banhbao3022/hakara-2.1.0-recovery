package p555j.p556a.p557a.p558a.p559a.p563d;

import android.widget.TextView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.seekbar.CustomSeekBar;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.p628ui.screen.duet.DuetCreateActivity;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants4;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayer;
import p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p607a.NowPlayingMetadata;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.a.a.d.d, reason: use source file name */
/* JADX INFO: compiled from: DuetCreateActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DuetCreateActivity3 extends AbstractYouTubePlayerListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DuetCreateActivity f31172f;

    public DuetCreateActivity3(DuetCreateActivity duetCreateActivity) {
        this.f31172f = duetCreateActivity;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener, p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: a */
    public void mo1291a(YouTubePlayer youTubePlayer, float f) {
        Intrinsics2.m13089e(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        CustomSeekBar customSeekBar = (CustomSeekBar) this.f31172f.m14355U(R.id.seekBar);
        Intrinsics2.m13088d(customSeekBar, "seekBar");
        customSeekBar.setProgress((int) f);
        TextView textView = (TextView) this.f31172f.m14355U(R.id.txtCurrentTime);
        Intrinsics2.m13088d(textView, "txtCurrentTime");
        textView.setText(NowPlayingMetadata.f32263a.m14034a(f));
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener, p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: g */
    public void mo1297g(YouTubePlayer youTubePlayer, PlayerConstants4 playerConstants4) {
        Intrinsics2.m13089e(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13089e(playerConstants4, "state");
        Intrinsics2.m13089e(playerConstants4.toString(), "message");
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener, p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: h */
    public void mo1298h(YouTubePlayer youTubePlayer) {
        Intrinsics2.m13089e(youTubePlayer, "youTubePlayer");
        Song song = this.f31172f.f33529z;
        if (song != null) {
            youTubePlayer.mo1322e(String.valueOf(song.getYoutubeId()), 0.0f);
        }
        this.f31172f.f33519A = youTubePlayer;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener, p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: u */
    public void mo1311u(YouTubePlayer youTubePlayer, float f) {
        Intrinsics2.m13089e(youTubePlayer, "youTubePlayer");
        DuetCreateActivity duetCreateActivity = this.f31172f;
        duetCreateActivity.f33520B = f;
        CustomSeekBar customSeekBar = (CustomSeekBar) duetCreateActivity.m14355U(R.id.seekBar);
        Intrinsics2.m13088d(customSeekBar, "seekBar");
        customSeekBar.setMax((int) f);
        TextView textView = (TextView) this.f31172f.m14355U(R.id.txtTotalTime);
        Intrinsics2.m13088d(textView, "txtTotalTime");
        textView.setText(NowPlayingMetadata.f32263a.m14034a(f));
        DuetCreateActivity duetCreateActivity2 = this.f31172f;
        Intrinsics2.m13089e(String.valueOf(duetCreateActivity2.f33520B), "message");
        duetCreateActivity2.m14357Y();
        TextView textView2 = (TextView) duetCreateActivity2.m14355U(R.id.txtTotalTime);
        Intrinsics2.m13088d(textView2, "txtTotalTime");
        SkuDao.a.m14068T(textView2);
        TextView textView3 = (TextView) duetCreateActivity2.m14355U(R.id.txtCurrentTime);
        Intrinsics2.m13088d(textView3, "txtCurrentTime");
        SkuDao.a.m14068T(textView3);
        ((CustomSeekBar) duetCreateActivity2.m14355U(R.id.seekBar)).setOnSeekBarChangeListener(new DuetCreateActivity2(duetCreateActivity2));
    }
}
