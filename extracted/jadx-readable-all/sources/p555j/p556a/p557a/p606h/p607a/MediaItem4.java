package p555j.p556a.p557a.p606h.p607a;

import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.h.a.e, reason: use source file name */
/* JADX INFO: compiled from: MediaItem.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MediaItem4 implements PlaylistItem {

    /* JADX INFO: renamed from: a */
    public final MediaItem3 f32262a;

    public MediaItem4(MediaItem3 mediaItem3) {
        Intrinsics2.m13089e(mediaItem3, "data");
        this.f32262a = mediaItem3;
    }

    @Override // p007c.p008a.p009a.p029b.p030a.PlaylistItem
    /* JADX INFO: renamed from: a */
    public boolean mo1220a() {
        return false;
    }

    @Override // p007c.p008a.p009a.p029b.p030a.PlaylistItem
    /* JADX INFO: renamed from: b */
    public String mo1221b() {
        String str = this.f32262a.f32259d;
        return str != null ? str : "Hakara";
    }

    @Override // p007c.p008a.p009a.p029b.p030a.PlaylistItem
    /* JADX INFO: renamed from: c */
    public String mo1222c() {
        return "Hakara";
    }

    @Override // p007c.p008a.p009a.p029b.p030a.PlaylistItem
    public String getTitle() {
        return this.f32262a.f32257b;
    }

    @Override // p007c.p008a.p009a.p029b.p030a.PlaylistItem
    /* JADX INFO: renamed from: w */
    public long mo1223w() {
        return this.f32262a.f32256a;
    }
}
