package p007c.p008a.p009a.p029b.p031b.p032a;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import java.util.Objects;
import p007c.p008a.p009a.p029b.p030a.MediaPlayerApi;
import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler;
import p007c.p008a.p009a.p029b.p042g.SimplifiedAudioManager;
import p477d1.TypeCastException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.b.b.a.b, reason: use source file name */
/* JADX INFO: compiled from: DefaultAudioFocusProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public class DefaultAudioFocusProvider<I extends PlaylistItem> implements AudioFocusProvider<I>, AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public boolean f1684a;

    /* JADX INFO: renamed from: b */
    public int f1685b;

    /* JADX INFO: renamed from: c */
    public PlaylistHandler<I> f1686c;

    /* JADX INFO: renamed from: d */
    public SimplifiedAudioManager f1687d;

    /* JADX INFO: renamed from: c.a.a.b.b.a.b$a */
    /* JADX INFO: compiled from: DefaultAudioFocusProvider.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public DefaultAudioFocusProvider(Context context) {
        Intrinsics2.m13090f(context, "context");
        this.f1687d = new SimplifiedAudioManager(context);
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p032a.AudioFocusProvider
    /* JADX INFO: renamed from: a */
    public boolean mo1224a() {
        MediaPlayerApi<I> mediaPlayerApi;
        int iRequestAudioFocus;
        PlaylistHandler<I> playlistHandler = this.f1686c;
        if (playlistHandler == null || (mediaPlayerApi = playlistHandler.f1733i) == null || mediaPlayerApi.mo1216d()) {
            return false;
        }
        if (this.f1685b == 1) {
            return true;
        }
        SimplifiedAudioManager simplifiedAudioManager = this.f1687d;
        Objects.requireNonNull(simplifiedAudioManager);
        Intrinsics2.m13090f(this, "listener");
        if (Build.VERSION.SDK_INT < 26) {
            iRequestAudioFocus = simplifiedAudioManager.f1809a.requestAudioFocus(this, 3, 1);
        } else {
            Intrinsics2.m13090f(this, "listener");
            AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(this).setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build()).setWillPauseWhenDucked(true).build();
            Intrinsics2.m13086b(audioFocusRequestBuild, "AudioFocusRequest.Builde…\n                .build()");
            simplifiedAudioManager.f1810b = audioFocusRequestBuild;
            iRequestAudioFocus = simplifiedAudioManager.f1809a.requestAudioFocus(audioFocusRequestBuild);
        }
        return 1 == iRequestAudioFocus;
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p032a.AudioFocusProvider
    /* JADX INFO: renamed from: b */
    public void mo1225b() {
        MediaPlayerApi<I> mediaPlayerApi;
        PlaylistHandler<I> playlistHandler = this.f1686c;
        if (playlistHandler == null || (mediaPlayerApi = playlistHandler.f1733i) == null || mediaPlayerApi.mo1216d()) {
            return;
        }
        m1227d(this.f1685b);
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p032a.AudioFocusProvider
    /* JADX INFO: renamed from: c */
    public boolean mo1226c() {
        MediaPlayerApi<I> mediaPlayerApi;
        int iAbandonAudioFocusRequest;
        PlaylistHandler<I> playlistHandler = this.f1686c;
        if (playlistHandler == null || (mediaPlayerApi = playlistHandler.f1733i) == null || mediaPlayerApi.mo1216d()) {
            return false;
        }
        if (this.f1685b == 0) {
            return true;
        }
        SimplifiedAudioManager simplifiedAudioManager = this.f1687d;
        Objects.requireNonNull(simplifiedAudioManager);
        Intrinsics2.m13090f(this, "listener");
        if (Build.VERSION.SDK_INT < 26) {
            iAbandonAudioFocusRequest = simplifiedAudioManager.f1809a.abandonAudioFocus(this);
        } else {
            AudioManager audioManager = simplifiedAudioManager.f1809a;
            Object obj = simplifiedAudioManager.f1810b;
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.media.AudioFocusRequest");
            }
            iAbandonAudioFocusRequest = audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
        }
        if (1 == iAbandonAudioFocusRequest) {
            this.f1685b = 0;
        }
        return 1 == iAbandonAudioFocusRequest;
    }

    /* JADX INFO: renamed from: d */
    public void m1227d(int i) {
        MediaPlayerApi<I> mediaPlayerApi;
        MediaPlayerApi<I> mediaPlayerApi2;
        MediaPlayerApi<I> mediaPlayerApi3;
        MediaPlayerApi<I> mediaPlayerApi4;
        PlaylistHandler<I> playlistHandler;
        MediaPlayerApi<I> mediaPlayerApi5;
        this.f1685b = i;
        PlaylistHandler<I> playlistHandler2 = this.f1686c;
        if (playlistHandler2 == null || (mediaPlayerApi = playlistHandler2.f1733i) == null || mediaPlayerApi.mo1216d()) {
            return;
        }
        if (i == -3) {
            PlaylistHandler<I> playlistHandler3 = this.f1686c;
            if (playlistHandler3 == null || (mediaPlayerApi2 = playlistHandler3.f1733i) == null || !mediaPlayerApi2.isPlaying()) {
                return;
            }
            mediaPlayerApi2.setVolume(0.1f, 0.1f);
            return;
        }
        if (i == -2) {
            PlaylistHandler<I> playlistHandler4 = this.f1686c;
            if (playlistHandler4 == null || (mediaPlayerApi3 = playlistHandler4.f1733i) == null || !mediaPlayerApi3.isPlaying()) {
                return;
            }
            this.f1684a = true;
            PlaylistHandler<I> playlistHandler5 = this.f1686c;
            if (playlistHandler5 != null) {
                playlistHandler5.mo1246g(true);
                return;
            }
            return;
        }
        if (i == -1) {
            PlaylistHandler<I> playlistHandler6 = this.f1686c;
            if (playlistHandler6 == null || (mediaPlayerApi4 = playlistHandler6.f1733i) == null || !mediaPlayerApi4.isPlaying()) {
                return;
            }
            this.f1684a = true;
            PlaylistHandler<I> playlistHandler7 = this.f1686c;
            if (playlistHandler7 != null) {
                playlistHandler7.mo1246g(false);
                return;
            }
            return;
        }
        if (i != 1 || (playlistHandler = this.f1686c) == null || (mediaPlayerApi5 = playlistHandler.f1733i) == null) {
            return;
        }
        if (!this.f1684a || mediaPlayerApi5.isPlaying()) {
            mediaPlayerApi5.setVolume(1.0f, 1.0f);
            return;
        }
        this.f1684a = false;
        PlaylistHandler<I> playlistHandler8 = this.f1686c;
        if (playlistHandler8 != null) {
            playlistHandler8.mo1247h();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m1228e(PlaylistHandler<I> playlistHandler) {
        Intrinsics2.m13090f(playlistHandler, "playlistHandler");
        this.f1686c = playlistHandler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        if (this.f1685b == i) {
            return;
        }
        m1227d(i);
    }
}
