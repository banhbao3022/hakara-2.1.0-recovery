package p007c.p043b.p044a.p045a.p051b;

import p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener;

/* JADX INFO: renamed from: c.b.a.a.b.f, reason: use source file name */
/* JADX INFO: compiled from: YouTubePlayer.kt */
/* JADX INFO: loaded from: classes.dex */
public interface YouTubePlayer {
    /* JADX INFO: renamed from: U */
    void mo1318U();

    /* JADX INFO: renamed from: b */
    boolean mo1319b(YouTubePlayerListener youTubePlayerListener);

    /* JADX INFO: renamed from: c */
    boolean mo1320c(YouTubePlayerListener youTubePlayerListener);

    /* JADX INFO: renamed from: d */
    void mo1321d(String str, float f);

    /* JADX INFO: renamed from: e */
    void mo1322e(String str, float f);

    void pause();

    void seekTo(float f);

    void setVolume(int i);
}
