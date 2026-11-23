package p000;

import mtp.media.karaoke.data.model.Song;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p569f.SongAdapter;
import p555j.p556a.p557a.p616i.ItemSongBinding;

/* JADX INFO: renamed from: v0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes2.dex */
public final class C7405v0 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34129g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34130h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f34131i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7405v0(int i, Object obj, Object obj2) {
        super(0);
        this.f34129g = i;
        this.f34130h = obj;
        this.f34131i = obj2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f34129g;
        if (i == 0) {
            Song song = ((ItemSongBinding) this.f34130h).f32396z;
            if (song != null) {
                InterfaceC6164l<Song, Unit> interfaceC6164l = ((SongAdapter) this.f34131i).f31281f;
                Intrinsics2.m13088d(song, "this");
                interfaceC6164l.mo3b(song);
            }
            return Unit.f29502a;
        }
        if (i == 1) {
            Song song2 = ((ItemSongBinding) this.f34130h).f32396z;
            if (song2 != null) {
                InterfaceC6164l<Song, Unit> interfaceC6164l2 = ((SongAdapter) this.f34131i).f31281f;
                Intrinsics2.m13088d(song2, "this");
                interfaceC6164l2.mo3b(song2);
            }
            return Unit.f29502a;
        }
        if (i != 2) {
            throw null;
        }
        Song song3 = ((ItemSongBinding) this.f34130h).f32396z;
        if (song3 != null) {
            InterfaceC6164l<Song, Unit> interfaceC6164l3 = ((SongAdapter) this.f34131i).f31282g;
            Intrinsics2.m13088d(song3, "this");
            interfaceC6164l3.mo3b(song3);
        }
        return Unit.f29502a;
    }
}
