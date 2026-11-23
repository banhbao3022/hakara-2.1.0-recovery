package p007c.p008a.p009a.p010a.p014h.p016e;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import java.util.Objects;
import p007c.p008a.p009a.p010a.p014h.ListenerMux;
import p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi;
import p007c.p008a.p009a.p010a.p027i.OnBufferUpdateListener;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.h.e.b, reason: use source file name */
/* JADX INFO: compiled from: NativeAudioPlayer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NativeAudioPlayer implements AudioPlayerApi {

    /* JADX INFO: renamed from: a */
    public final MediaPlayer f1524a;

    /* JADX INFO: renamed from: b */
    public b f1525b;

    /* JADX INFO: renamed from: c */
    public ListenerMux f1526c;

    /* JADX INFO: renamed from: d */
    public long f1527d;

    /* JADX INFO: renamed from: e */
    public final Context f1528e;

    /* JADX INFO: renamed from: c.a.a.a.h.e.b$a */
    /* JADX INFO: compiled from: NativeAudioPlayer.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.h.e.b$b */
    /* JADX INFO: compiled from: NativeAudioPlayer.kt */
    public final class b implements MediaPlayer.OnBufferingUpdateListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            Intrinsics2.m13089e(mediaPlayer, "mediaPlayer");
            ListenerMux listenerMux = NativeAudioPlayer.this.f1526c;
            if (listenerMux != null) {
                Objects.requireNonNull(listenerMux.f1516r);
                OnBufferUpdateListener onBufferUpdateListener = listenerMux.f1507i;
                if (onBufferUpdateListener != null) {
                    onBufferUpdateListener.mo1062e(i);
                }
            }
            Objects.requireNonNull(NativeAudioPlayer.this);
        }
    }

    static {
        new a(null);
    }

    public NativeAudioPlayer(Context context) {
        Intrinsics2.m13089e(context, "context");
        this.f1528e = context;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f1524a = mediaPlayer;
        b bVar = new b();
        this.f1525b = bVar;
        mediaPlayer.setOnBufferingUpdateListener(bVar);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    /* JADX INFO: renamed from: a */
    public void mo1003a() {
        long j2 = this.f1527d;
        if (j2 != 0) {
            mo1006x(j2);
        }
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    /* JADX INFO: renamed from: b */
    public void mo1004b(Uri uri, MediaSource2 mediaSource2) {
        try {
            this.f1527d = 0L;
            MediaPlayer mediaPlayer = this.f1524a;
            Context context = this.f1528e;
            Intrinsics2.m13087c(uri);
            mediaPlayer.setDataSource(context, uri);
        } catch (Exception e) {
            Log.d("NativeMediaPlayer", "MediaPlayer: error setting data source", e);
        }
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    /* JADX INFO: renamed from: c */
    public void mo1005c() {
        this.f1524a.stop();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public long getCurrentPosition() {
        ListenerMux listenerMux = this.f1526c;
        if (listenerMux == null || !listenerMux.f1513o) {
            return 0L;
        }
        return this.f1524a.getCurrentPosition();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public long getDuration() {
        ListenerMux listenerMux = this.f1526c;
        if (listenerMux == null || !listenerMux.f1513o) {
            return 0L;
        }
        return this.f1524a.getDuration();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public boolean isPlaying() {
        return this.f1524a.isPlaying();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void pause() {
        this.f1524a.pause();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void prepareAsync() {
        try {
            this.f1524a.prepareAsync();
        } catch (Exception unused) {
        }
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void release() {
        this.f1524a.release();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void reset() {
        this.f1524a.reset();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void setAudioStreamType(int i) {
        this.f1524a.setAudioStreamType(i);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void setListenerMux(ListenerMux listenerMux) {
        Intrinsics2.m13089e(listenerMux, "listenerMux");
        this.f1526c = listenerMux;
        this.f1524a.setOnCompletionListener(listenerMux);
        this.f1524a.setOnPreparedListener(listenerMux);
        this.f1524a.setOnBufferingUpdateListener(listenerMux);
        this.f1524a.setOnSeekCompleteListener(listenerMux);
        this.f1524a.setOnErrorListener(listenerMux);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void setVolume(float f, float f2) {
        this.f1524a.setVolume(f, f2);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void setWakeMode(Context context, int i) {
        Intrinsics2.m13089e(context, "context");
        this.f1524a.setWakeMode(context, i);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void start() {
        this.f1524a.start();
        ListenerMux listenerMux = this.f1526c;
        if (listenerMux != null) {
            listenerMux.f1514p = false;
        }
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    /* JADX INFO: renamed from: x */
    public void mo1006x(long j2) {
        ListenerMux listenerMux = this.f1526c;
        if (listenerMux == null || !listenerMux.f1513o) {
            this.f1527d = j2;
        } else {
            this.f1524a.seekTo((int) j2);
            this.f1527d = 0L;
        }
    }
}
