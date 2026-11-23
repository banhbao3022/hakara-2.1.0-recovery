package p007c.p043b.p044a.p045a.p051b.p052a;

import p007c.p043b.p044a.p045a.p051b.PlayerConstants3;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants4;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayer;
import p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.b.a.a.b.a.c, reason: use source file name */
/* JADX INFO: compiled from: PlaybackResumer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackResumer extends AbstractYouTubePlayerListener {

    /* JADX INFO: renamed from: f */
    public boolean f1876f;

    /* JADX INFO: renamed from: g */
    public boolean f1877g;

    /* JADX INFO: renamed from: h */
    public PlayerConstants3 f1878h;

    /* JADX INFO: renamed from: i */
    public String f1879i;

    /* JADX INFO: renamed from: j */
    public float f1880j;

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener, p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: a */
    public void mo1291a(YouTubePlayer youTubePlayer, float f) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        this.f1880j = f;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener, p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: f */
    public void mo1296f(YouTubePlayer youTubePlayer, String str) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(str, "videoId");
        this.f1879i = str;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener, p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: g */
    public void mo1297g(YouTubePlayer youTubePlayer, PlayerConstants4 playerConstants4) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(playerConstants4, "state");
        int iOrdinal = playerConstants4.ordinal();
        if (iOrdinal == 2) {
            this.f1877g = false;
        } else if (iOrdinal == 3) {
            this.f1877g = true;
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f1877g = false;
        }
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener, p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: s */
    public void mo1309s(YouTubePlayer youTubePlayer, PlayerConstants3 playerConstants3) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(playerConstants3, "error");
        if (playerConstants3 == PlayerConstants3.HTML_5_PLAYER) {
            this.f1878h = playerConstants3;
        }
    }
}
