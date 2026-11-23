package p555j.p556a.p557a.p558a.p559a.p563d;

import android.widget.SeekBar;
import android.widget.TextView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.seekbar.CustomSeekBar;
import mtp.media.karaoke.p628ui.screen.duet.DuetCreateActivity;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayer;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p607a.NowPlayingMetadata;

/* JADX INFO: renamed from: j.a.a.a.a.d.c, reason: use source file name */
/* JADX INFO: compiled from: DuetCreateActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DuetCreateActivity2 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DuetCreateActivity f31171f;

    public DuetCreateActivity2(DuetCreateActivity duetCreateActivity) {
        this.f31171f = duetCreateActivity;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Intrinsics2.m13089e(seekBar, "sb");
        if (z) {
            TextView textView = (TextView) this.f31171f.m14355U(R.id.txtCurrentTime);
            Intrinsics2.m13088d(textView, "txtCurrentTime");
            textView.setText(NowPlayingMetadata.f32263a.m14034a(seekBar.getProgress()));
            DuetCreateActivity duetCreateActivity = this.f31171f;
            YouTubePlayer youTubePlayer = duetCreateActivity.f33519A;
            if (youTubePlayer != null) {
                CustomSeekBar customSeekBar = (CustomSeekBar) duetCreateActivity.m14355U(R.id.seekBar);
                Intrinsics2.m13088d(customSeekBar, "seekBar");
                youTubePlayer.seekTo(customSeekBar.getProgress());
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        Intrinsics2.m13089e(seekBar, "seekBar");
        YouTubePlayer youTubePlayer = this.f31171f.f33519A;
        if (youTubePlayer != null) {
            youTubePlayer.pause();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        Intrinsics2.m13089e(seekBar, "seekBar");
    }
}
