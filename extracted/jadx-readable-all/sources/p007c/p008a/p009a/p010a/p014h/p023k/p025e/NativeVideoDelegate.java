package p007c.p008a.p009a.p010a.p014h.p023k.p025e;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import p007c.p008a.p009a.p010a.p014h.ListenerMux;
import p007c.p008a.p009a.p010a.p014h.p023k.ClearableSurface;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.h.k.e.a, reason: use source file name */
/* JADX INFO: compiled from: NativeVideoDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NativeVideoDelegate {

    /* JADX INFO: renamed from: a */
    public Map<String, String> f1620a;

    /* JADX INFO: renamed from: b */
    public c f1621b;

    /* JADX INFO: renamed from: c */
    public MediaPlayer f1622c;

    /* JADX INFO: renamed from: d */
    public boolean f1623d;

    /* JADX INFO: renamed from: e */
    public long f1624e;

    /* JADX INFO: renamed from: f */
    public int f1625f;

    /* JADX INFO: renamed from: g */
    public float f1626g;

    /* JADX INFO: renamed from: h */
    public ListenerMux f1627h;

    /* JADX INFO: renamed from: i */
    public b f1628i;

    /* JADX INFO: renamed from: j */
    public MediaPlayer.OnCompletionListener f1629j;

    /* JADX INFO: renamed from: k */
    public MediaPlayer.OnPreparedListener f1630k;

    /* JADX INFO: renamed from: l */
    public MediaPlayer.OnBufferingUpdateListener f1631l;

    /* JADX INFO: renamed from: m */
    public MediaPlayer.OnSeekCompleteListener f1632m;

    /* JADX INFO: renamed from: n */
    public MediaPlayer.OnErrorListener f1633n;

    /* JADX INFO: renamed from: o */
    public MediaPlayer.OnInfoListener f1634o;

    /* JADX INFO: renamed from: p */
    public Context f1635p;

    /* JADX INFO: renamed from: q */
    public a f1636q;

    /* JADX INFO: renamed from: r */
    public ClearableSurface f1637r;

    /* JADX INFO: renamed from: c.a.a.a.h.k.e.a$a */
    /* JADX INFO: compiled from: NativeVideoDelegate.kt */
    public interface a {
        /* JADX INFO: renamed from: d */
        void mo1195d(int i, int i2);
    }

    /* JADX INFO: renamed from: c.a.a.a.h.k.e.a$b */
    /* JADX INFO: compiled from: NativeVideoDelegate.kt */
    public final class b implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnInfoListener, MediaPlayer.OnVideoSizeChangedListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            Intrinsics2.m13089e(mediaPlayer, "mp");
            NativeVideoDelegate nativeVideoDelegate = NativeVideoDelegate.this;
            nativeVideoDelegate.f1625f = i;
            MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener = nativeVideoDelegate.f1631l;
            if (onBufferingUpdateListener != null) {
                onBufferingUpdateListener.onBufferingUpdate(mediaPlayer, i);
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            Intrinsics2.m13089e(mediaPlayer, "mp");
            NativeVideoDelegate.this.m1190i(c.COMPLETED);
            NativeVideoDelegate nativeVideoDelegate = NativeVideoDelegate.this;
            MediaPlayer.OnCompletionListener onCompletionListener = nativeVideoDelegate.f1629j;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(nativeVideoDelegate.f1622c);
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            Log.d("ContentValues", "Error: " + i + ',' + i2);
            NativeVideoDelegate.this.m1190i(c.ERROR);
            NativeVideoDelegate nativeVideoDelegate = NativeVideoDelegate.this;
            MediaPlayer.OnErrorListener onErrorListener = nativeVideoDelegate.f1633n;
            return onErrorListener != null && onErrorListener.onError(nativeVideoDelegate.f1622c, i, i2);
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            Intrinsics2.m13089e(mediaPlayer, "mp");
            MediaPlayer.OnInfoListener onInfoListener = NativeVideoDelegate.this.f1634o;
            return onInfoListener != null && onInfoListener.onInfo(mediaPlayer, i, i2);
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            Intrinsics2.m13089e(mediaPlayer, "mp");
            NativeVideoDelegate.this.m1190i(c.PREPARED);
            NativeVideoDelegate nativeVideoDelegate = NativeVideoDelegate.this;
            MediaPlayer.OnPreparedListener onPreparedListener = nativeVideoDelegate.f1630k;
            if (onPreparedListener != null) {
                onPreparedListener.onPrepared(nativeVideoDelegate.f1622c);
            }
            NativeVideoDelegate.this.f1636q.mo1195d(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
            NativeVideoDelegate nativeVideoDelegate2 = NativeVideoDelegate.this;
            long j2 = nativeVideoDelegate2.f1624e;
            if (j2 != 0) {
                nativeVideoDelegate2.m1189h(j2);
            }
            NativeVideoDelegate nativeVideoDelegate3 = NativeVideoDelegate.this;
            if (nativeVideoDelegate3.f1623d) {
                nativeVideoDelegate3.m1192k();
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            Intrinsics2.m13089e(mediaPlayer, "mp");
            MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = NativeVideoDelegate.this.f1632m;
            if (onSeekCompleteListener != null) {
                onSeekCompleteListener.onSeekComplete(mediaPlayer);
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            Intrinsics2.m13089e(mediaPlayer, "mp");
            NativeVideoDelegate.this.f1636q.mo1195d(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.h.k.e.a$c */
    /* JADX INFO: compiled from: NativeVideoDelegate.kt */
    public enum c {
        ERROR,
        IDLE,
        PREPARING,
        PREPARED,
        PLAYING,
        PAUSED,
        COMPLETED
    }

    public NativeVideoDelegate(Context context, a aVar, ClearableSurface clearableSurface) {
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(aVar, "callback");
        Intrinsics2.m13089e(clearableSurface, "clearableSurface");
        this.f1635p = context;
        this.f1636q = aVar;
        this.f1637r = clearableSurface;
        c cVar = c.IDLE;
        this.f1621b = cVar;
        this.f1626g = 1.0f;
        this.f1628i = new b();
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnInfoListener(this.f1628i);
        mediaPlayer.setOnErrorListener(this.f1628i);
        mediaPlayer.setOnPreparedListener(this.f1628i);
        mediaPlayer.setOnCompletionListener(this.f1628i);
        mediaPlayer.setOnSeekCompleteListener(this.f1628i);
        mediaPlayer.setOnBufferingUpdateListener(this.f1628i);
        mediaPlayer.setOnVideoSizeChangedListener(this.f1628i);
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setScreenOnWhilePlaying(true);
        this.f1622c = mediaPlayer;
        this.f1621b = cVar;
    }

    /* JADX INFO: renamed from: a */
    public final long m1182a() {
        ListenerMux listenerMux = this.f1627h;
        if (listenerMux == null || !listenerMux.f1513o || !m1186e()) {
            return 0L;
        }
        MediaPlayer mediaPlayer = this.f1622c;
        Intrinsics2.m13087c(mediaPlayer);
        return mediaPlayer.getCurrentPosition();
    }

    /* JADX INFO: renamed from: b */
    public final long m1183b() {
        ListenerMux listenerMux = this.f1627h;
        if (listenerMux == null || !listenerMux.f1513o || !m1186e()) {
            return 0L;
        }
        MediaPlayer mediaPlayer = this.f1622c;
        Intrinsics2.m13087c(mediaPlayer);
        return mediaPlayer.getDuration();
    }

    /* JADX INFO: renamed from: c */
    public final float m1184c() {
        MediaPlayer mediaPlayer;
        PlaybackParams playbackParams;
        if (Build.VERSION.SDK_INT < 23 || (mediaPlayer = this.f1622c) == null || (playbackParams = mediaPlayer.getPlaybackParams()) == null) {
            return 1.0f;
        }
        return playbackParams.getSpeed();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1185d() {
        if (m1186e()) {
            MediaPlayer mediaPlayer = this.f1622c;
            Intrinsics2.m13087c(mediaPlayer);
            if (mediaPlayer.isPlaying()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1186e() {
        c cVar = this.f1621b;
        return (cVar == c.ERROR || cVar == c.IDLE || cVar == c.PREPARING) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final void m1187f(int i, int i2) {
        if (this.f1622c == null || i <= 0 || i2 <= 0) {
            return;
        }
        long j2 = this.f1624e;
        if (j2 != 0) {
            m1189h(j2);
        }
        if (this.f1623d) {
            m1192k();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1188g() {
        MediaPlayer mediaPlayer;
        if (m1186e() && (mediaPlayer = this.f1622c) != null && mediaPlayer.isPlaying()) {
            MediaPlayer mediaPlayer2 = this.f1622c;
            if (mediaPlayer2 != null) {
                mediaPlayer2.pause();
            }
            this.f1621b = c.PAUSED;
        }
        this.f1623d = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m1189h(long j2) {
        if (!m1186e()) {
            this.f1624e = j2;
            return;
        }
        MediaPlayer mediaPlayer = this.f1622c;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo((int) j2);
        }
        this.f1624e = 0L;
    }

    /* JADX INFO: renamed from: i */
    public final void m1190i(c cVar) {
        Intrinsics2.m13089e(cVar, "<set-?>");
        this.f1621b = cVar;
    }

    /* JADX INFO: renamed from: j */
    public final void m1191j(Uri uri, Map<String, String> map) {
        Intrinsics2.m13089e(uri, "uri");
        this.f1620a = map;
        this.f1624e = 0L;
        this.f1623d = false;
        c cVar = c.ERROR;
        this.f1625f = 0;
        try {
            MediaPlayer mediaPlayer = this.f1622c;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
            }
            MediaPlayer mediaPlayer2 = this.f1622c;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setDataSource(this.f1635p.getApplicationContext(), uri, this.f1620a);
            }
            MediaPlayer mediaPlayer3 = this.f1622c;
            if (mediaPlayer3 != null) {
                mediaPlayer3.prepareAsync();
            }
            this.f1621b = c.PREPARING;
        } catch (IOException e) {
            Log.w("ContentValues", "Unable to open content: " + uri, e);
            this.f1621b = cVar;
            this.f1628i.onError(this.f1622c, 1, 0);
        } catch (IllegalArgumentException e2) {
            Log.w("ContentValues", "Unable to open content: " + uri, e2);
            this.f1621b = cVar;
            this.f1628i.onError(this.f1622c, 1, 0);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1192k() {
        if (m1186e()) {
            MediaPlayer mediaPlayer = this.f1622c;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
            this.f1621b = c.PLAYING;
        }
        this.f1623d = true;
        ListenerMux listenerMux = this.f1627h;
        if (listenerMux != null) {
            listenerMux.f1514p = false;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1193l(boolean z) {
        ListenerMux listenerMux;
        this.f1621b = c.IDLE;
        if (m1186e()) {
            try {
                MediaPlayer mediaPlayer = this.f1622c;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                }
            } catch (Exception e) {
                Log.d("ContentValues", "stopPlayback: error calling mediaPlayer.stop()", e);
            }
        }
        this.f1623d = false;
        if (!z || (listenerMux = this.f1627h) == null) {
            return;
        }
        ClearableSurface clearableSurface = this.f1637r;
        listenerMux.f1515q = true;
        listenerMux.f1512n = new WeakReference<>(clearableSurface);
    }

    /* JADX INFO: renamed from: m */
    public final void m1194m() {
        this.f1621b = c.IDLE;
        try {
            MediaPlayer mediaPlayer = this.f1622c;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
            }
            MediaPlayer mediaPlayer2 = this.f1622c;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
        } catch (Exception e) {
            Log.d("ContentValues", "stopPlayback: error calling mediaPlayer.reset() or mediaPlayer.release()", e);
        }
        this.f1623d = false;
    }
}
