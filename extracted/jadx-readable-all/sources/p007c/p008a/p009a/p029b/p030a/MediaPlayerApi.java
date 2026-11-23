package p007c.p008a.p009a.p029b.p030a;

import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p007c.p008a.p009a.p029b.p039d.MediaStatusListener;

/* JADX INFO: renamed from: c.a.a.b.a.a, reason: use source file name */
/* JADX INFO: compiled from: MediaPlayerApi.kt */
/* JADX INFO: loaded from: classes.dex */
public interface MediaPlayerApi<I extends PlaylistItem> {
    /* JADX INFO: renamed from: U */
    void mo1214U();

    /* JADX INFO: renamed from: c */
    void mo1215c(MediaStatusListener<I> mediaStatusListener);

    /* JADX INFO: renamed from: d */
    boolean mo1216d();

    int getBufferedPercent();

    long getCurrentPosition();

    long getDuration();

    /* JADX INFO: renamed from: h */
    boolean mo1217h(I i);

    /* JADX INFO: renamed from: i */
    void mo1218i(I i);

    boolean isPlaying();

    void pause();

    void release();

    void reset();

    void setVolume(float f, float f2);

    void stop();

    /* JADX INFO: renamed from: x */
    void mo1219x(long j2);
}
