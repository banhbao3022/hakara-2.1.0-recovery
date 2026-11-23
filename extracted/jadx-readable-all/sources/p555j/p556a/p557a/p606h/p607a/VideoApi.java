package p555j.p556a.p557a.p606h.p607a;

import android.net.Uri;
import com.devbrackets.android.exomedia.p474ui.widget.VideoView;
import p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls;
import p007c.p008a.p009a.p010a.p011a.p012a.VideoControls;
import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p007c.p008a.p009a.p029b.p038c.PlaybackState;
import p007c.p008a.p009a.p029b.p039d.PlaylistListener;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.h.a.g, reason: use source file name */
/* JADX INFO: compiled from: VideoApi.kt */
/* JADX INFO: loaded from: classes.dex */
public final class VideoApi extends BaseMediaApi implements PlaylistListener<MediaItem4> {

    /* JADX INFO: renamed from: i */
    public VideoView f32269i;

    public VideoApi(VideoView videoView) {
        Intrinsics2.m13089e(videoView, "videoView");
        this.f32269i = videoView;
        videoView.setOnErrorListener(this);
        this.f32269i.setOnPreparedListener(this);
        this.f32269i.setOnCompletionListener(this);
        this.f32269i.setOnSeekCompletionListener(this);
        this.f32269i.setOnBufferUpdateListener(this);
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    /* JADX INFO: renamed from: U */
    public void mo1214U() {
        this.f32269i.m12575e();
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    /* JADX INFO: renamed from: d */
    public boolean mo1216d() {
        return false;
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    public int getBufferedPercent() {
        return this.f32254g;
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    public long getCurrentPosition() {
        if (this.f32253f) {
            return this.f32269i.getCurrentPosition();
        }
        return 0L;
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    public long getDuration() {
        if (this.f32253f) {
            return this.f32269i.getDuration();
        }
        return 0L;
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    /* JADX INFO: renamed from: h */
    public boolean mo1217h(PlaylistItem playlistItem) {
        MediaItem4 mediaItem4 = (MediaItem4) playlistItem;
        Intrinsics2.m13089e(mediaItem4, "item");
        return (mediaItem4.f32262a.f32261f ? (char) 1 : (char) 2) == 2;
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    /* JADX INFO: renamed from: i */
    public void mo1218i(PlaylistItem playlistItem) {
        MediaItem4 mediaItem4 = (MediaItem4) playlistItem;
        Intrinsics2.m13089e(mediaItem4, "item");
        this.f32253f = false;
        this.f32254g = 0;
        this.f32269i.setVideoURI(Uri.parse(mediaItem4.f32262a.f32258c));
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    public boolean isPlaying() {
        return this.f32269i.m12572a();
    }

    @Override // p007c.p008a.p009a.p029b.p039d.PlaylistListener
    /* JADX INFO: renamed from: n */
    public boolean mo1268n(PlaybackState playbackState) {
        Intrinsics2.m13089e(playbackState, "playbackState");
        return false;
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    public void pause() {
        VideoView.m12571c(this.f32269i, false, 1, null);
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    public void release() {
        VideoView videoView = this.f32269i;
        videoView.f28209k.m12577a();
        videoView.getVideoViewImpl().mo1095f();
        videoView.setKeepScreenOn(false);
        VideoControls videoControls = videoView.f28219u;
        if (videoControls != null) {
            videoControls.mo974d(false);
        }
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    public void reset() {
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    public void setVolume(float f, float f2) {
        this.f32269i.setVolume((f + f2) / 2);
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    public void stop() {
        this.f32269i.m12576f(true);
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    /* JADX INFO: renamed from: x */
    public void mo1219x(long j2) {
        VideoView videoView = this.f32269i;
        long j3 = (int) j2;
        VideoControls videoControls = videoView.f28219u;
        if (videoControls != null) {
            videoControls.mo995f(false);
        }
        videoView.getVideoViewImpl().mo1096x(j3);
    }

    @Override // p007c.p008a.p009a.p029b.p039d.PlaylistListener
    /* JADX INFO: renamed from: y */
    public boolean mo1269y(PlaylistItem playlistItem, boolean z, boolean z2) {
        String str;
        MediaItem4 mediaItem4 = (MediaItem4) playlistItem;
        VideoControls videoControls = this.f32269i.getVideoControls();
        if (!(videoControls instanceof DefaultVideoControls)) {
            videoControls = null;
        }
        DefaultVideoControls defaultVideoControls = (DefaultVideoControls) videoControls;
        if (defaultVideoControls == null) {
            return false;
        }
        String str2 = "";
        if (mediaItem4 == null || (str = mediaItem4.f32262a.f32257b) == null) {
            str = "";
        }
        defaultVideoControls.setTitle(str);
        defaultVideoControls.setSubTitle(mediaItem4 != null ? "Hakara" : "");
        if (mediaItem4 != null && (str2 = mediaItem4.f32262a.f32259d) == null) {
            str2 = "Hakara";
        }
        defaultVideoControls.setDescription(str2);
        defaultVideoControls.setPreviousButtonEnabled(z2);
        defaultVideoControls.setNextButtonEnabled(z);
        return false;
    }
}
