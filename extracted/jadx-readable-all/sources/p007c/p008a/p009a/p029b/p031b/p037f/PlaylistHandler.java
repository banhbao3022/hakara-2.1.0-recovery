package p007c.p008a.p009a.p029b.p031b.p037f;

import java.util.List;
import p007c.p008a.p009a.p029b.p030a.MediaPlayerApi;
import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p007c.p008a.p009a.p029b.p038c.MediaProgress;
import p007c.p008a.p009a.p029b.p038c.PlaybackState;
import p007c.p008a.p009a.p029b.p038c.PlaylistItemChange;
import p007c.p008a.p009a.p029b.p039d.ServiceCallbacks;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.b.b.f.b, reason: use source file name */
/* JADX INFO: compiled from: PlaylistHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class PlaylistHandler<I extends PlaylistItem> {

    /* JADX INFO: renamed from: f */
    public PlaylistItemChange<? extends I> f1730f;

    /* JADX INFO: renamed from: g */
    public MediaProgress f1731g;

    /* JADX INFO: renamed from: h */
    public PlaybackState f1732h;

    /* JADX INFO: renamed from: i */
    public MediaPlayerApi<I> f1733i;

    /* JADX INFO: renamed from: j */
    public final List<MediaPlayerApi<I>> f1734j;

    /* JADX WARN: Multi-variable type inference failed */
    public PlaylistHandler(List<? extends MediaPlayerApi<I>> list) {
        Intrinsics2.m13090f(list, "mediaPlayers");
        this.f1734j = list;
        this.f1731g = new MediaProgress(0L, 0, 0L);
        this.f1732h = PlaybackState.PREPARING;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo1245f();

    /* JADX INFO: renamed from: g */
    public abstract void mo1246g(boolean z);

    /* JADX INFO: renamed from: h */
    public abstract void mo1247h();

    /* JADX INFO: renamed from: i */
    public abstract void mo1248i();

    /* JADX INFO: renamed from: j */
    public abstract void mo1249j(long j2);

    /* JADX INFO: renamed from: l */
    public abstract void mo1251l(ServiceCallbacks serviceCallbacks);

    /* JADX INFO: renamed from: m */
    public abstract void mo1252m(long j2, boolean z);

    /* JADX INFO: renamed from: n */
    public abstract void mo1253n();

    /* JADX INFO: renamed from: o */
    public abstract void mo1254o();

    /* JADX INFO: renamed from: p */
    public abstract void mo1255p();

    /* JADX INFO: renamed from: q */
    public abstract void mo1256q();

    /* JADX INFO: renamed from: r */
    public abstract void mo1257r();
}
