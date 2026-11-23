package p007c.p008a.p009a.p029b.p039d;

import p007c.p008a.p009a.p029b.p030a.MediaPlayerApi;
import p007c.p008a.p009a.p029b.p030a.PlaylistItem;

/* JADX INFO: renamed from: c.a.a.b.d.a, reason: use source file name */
/* JADX INFO: compiled from: MediaStatusListener.kt */
/* JADX INFO: loaded from: classes.dex */
public interface MediaStatusListener<I extends PlaylistItem> {
    /* JADX INFO: renamed from: a */
    void mo1240a(MediaPlayerApi<I> mediaPlayerApi);

    /* JADX INFO: renamed from: b */
    void mo1241b(MediaPlayerApi<I> mediaPlayerApi);

    /* JADX INFO: renamed from: c */
    boolean mo1242c(MediaPlayerApi<I> mediaPlayerApi);

    /* JADX INFO: renamed from: d */
    void mo1243d(MediaPlayerApi<I> mediaPlayerApi, int i);

    /* JADX INFO: renamed from: e */
    void mo1244e(MediaPlayerApi<I> mediaPlayerApi);
}
