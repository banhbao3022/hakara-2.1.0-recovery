package p555j.p556a.p557a.p606h.p607a;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;
import p007c.p008a.p009a.p010a.AudioPlayer;
import p007c.p008a.p009a.p010a.p014h.ListenerMux;
import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p007c.p190n.p194b.p209b.p212b2.EventLogger;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.h.a.a, reason: use source file name */
/* JADX INFO: compiled from: AudioApi.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AudioApi extends BaseMediaApi {

    /* JADX INFO: renamed from: i */
    public final AudioPlayer f32252i;

    /* JADX WARN: Multi-variable type inference failed */
    public AudioApi(Context context) {
        Intrinsics2.m13089e(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics2.m13088d(applicationContext, "context.applicationContext");
        AudioPlayer audioPlayer = new AudioPlayer(applicationContext, null, 2, 0 == true ? 1 : 0);
        this.f32252i = audioPlayer;
        ListenerMux listenerMux = audioPlayer.f1489a;
        listenerMux.f1509k = this;
        listenerMux.f1505g = this;
        listenerMux.f1506h = this;
        listenerMux.f1508j = this;
        listenerMux.f1507i = this;
        Objects.requireNonNull(audioPlayer);
        Intrinsics2.m13089e(context, "context");
        audioPlayer.f1491c.setWakeMode(context, 1);
        audioPlayer.f1491c.setAudioStreamType(3);
        audioPlayer.f1489a.f1511m = new EventLogger(null);
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    /* JADX INFO: renamed from: U */
    public void mo1214U() {
        this.f32252i.f1491c.start();
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
            return this.f32252i.getCurrentPosition();
        }
        return 0L;
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    public long getDuration() {
        if (this.f32253f) {
            return this.f32252i.getDuration();
        }
        return 0L;
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    /* JADX INFO: renamed from: h */
    public boolean mo1217h(PlaylistItem playlistItem) {
        MediaItem4 mediaItem4 = (MediaItem4) playlistItem;
        Intrinsics2.m13089e(mediaItem4, "item");
        return (mediaItem4.f32262a.f32261f ? (char) 1 : (char) 2) == 1;
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    /* JADX INFO: renamed from: i */
    public void mo1218i(PlaylistItem playlistItem) {
        MediaItem4 mediaItem4 = (MediaItem4) playlistItem;
        Intrinsics2.m13089e(mediaItem4, "item");
        try {
            this.f32253f = false;
            this.f32254g = 0;
            AudioPlayer audioPlayer = this.f32252i;
            audioPlayer.f1491c.mo1004b(Uri.parse(mediaItem4.f32262a.f32258c), null);
            audioPlayer.f1490b = -1L;
            this.f32252i.f1491c.prepareAsync();
        } catch (Exception unused) {
        }
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    public boolean isPlaying() {
        return this.f32252i.f1491c.isPlaying();
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    public void pause() {
        this.f32252i.f1491c.pause();
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    public void release() {
        this.f32252i.f1491c.release();
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    public void reset() {
        AudioPlayer audioPlayer = this.f32252i;
        audioPlayer.f1491c.mo1005c();
        audioPlayer.mo1004b(null, null);
        audioPlayer.f1491c.reset();
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    public void setVolume(float f, float f2) {
        this.f32252i.f1491c.setVolume(f, f2);
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    public void stop() {
        this.f32252i.f1491c.mo1005c();
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    /* JADX INFO: renamed from: x */
    public void mo1219x(long j2) {
        this.f32252i.f1491c.mo1006x((int) j2);
    }
}
