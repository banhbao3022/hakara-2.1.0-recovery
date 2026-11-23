package p007c.p043b.p044a.p045a.p046a.p050e;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.p476ui.views.YouTubePlayerSeekBar;

/* JADX INFO: renamed from: c.b.a.a.a.e.a, reason: use source file name */
/* JADX INFO: compiled from: YouTubePlayerSeekBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class YouTubePlayerSeekBar2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ YouTubePlayerSeekBar f1867f;

    public YouTubePlayerSeekBar2(YouTubePlayerSeekBar youTubePlayerSeekBar) {
        this.f1867f = youTubePlayerSeekBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1867f.getVideoDurationTextView().setText("");
    }
}
