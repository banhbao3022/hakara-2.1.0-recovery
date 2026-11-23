package p555j.p556a.p557a.p558a.p559a.p560a;

import android.graphics.Matrix;
import com.cgfay.media.CainMediaPlayer;
import com.cgfay.media.IMediaPlayer;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.process.ProcessActivity;
import mtp.media.karaoke.p628ui.widgets.VideoTextureView;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.a.z */
/* JADX INFO: compiled from: ProcessActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6606z implements IMediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ProcessActivity f31048a;

    public C6606z(ProcessActivity processActivity) {
        this.f31048a = processActivity;
    }

    @Override // com.cgfay.media.IMediaPlayer.OnPreparedListener
    public final void onPrepared(IMediaPlayer iMediaPlayer) {
        iMediaPlayer.start();
        ProcessActivity.m14406Z(this.f31048a);
        ProcessActivity processActivity = this.f31048a;
        if (processActivity.f33750c0 != null) {
            VideoTextureView videoTextureView = (VideoTextureView) processActivity.m14407U(R.id.videoPlayerView);
            Intrinsics2.m13088d(videoTextureView, "videoPlayerView");
            float width = videoTextureView.getWidth();
            VideoTextureView videoTextureView2 = (VideoTextureView) processActivity.m14407U(R.id.videoPlayerView);
            Intrinsics2.m13088d(videoTextureView2, "videoPlayerView");
            float height = videoTextureView2.getHeight();
            CainMediaPlayer cainMediaPlayer = processActivity.f33750c0;
            float videoWidth = cainMediaPlayer != null ? cainMediaPlayer.getVideoWidth() : 0.0f;
            CainMediaPlayer cainMediaPlayer2 = processActivity.f33750c0;
            float videoHeight = cainMediaPlayer2 != null ? cainMediaPlayer2.getVideoHeight() : 0.0f;
            float f = width > videoWidth ? width / videoWidth : videoWidth / width;
            float f2 = height > videoHeight ? height / videoHeight : videoHeight / height;
            float f3 = videoWidth / videoHeight;
            float f4 = 1.0f;
            float f5 = (width >= videoWidth ? height >= videoHeight && f < f2 : height >= videoHeight || f > f2) ? (height * f3) / width : 1.0f;
            if (height >= videoHeight ? width >= videoWidth && f2 <= f : width >= videoWidth || f2 > f) {
                f4 = (width / f3) / height;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f5, f4, width / 2.0f, height / 2.0f);
            Intrinsics2.m13088d(matrix, "VideoScaler.getVideoScal…  scaleType\n            )");
            ((VideoTextureView) processActivity.m14407U(R.id.videoPlayerView)).setTransform(matrix);
        }
    }
}
