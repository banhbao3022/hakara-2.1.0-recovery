package p000;

import mtp.media.karaoke.data.model.Recording;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p562c.ExploreAdapter;

/* JADX INFO: renamed from: m0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes2.dex */
public final class C7221m0 extends Lambda implements InterfaceC6164l<Recording, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f33308g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f33309h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f33310i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7221m0(int i, Object obj, Object obj2) {
        super(1);
        this.f33308g = i;
        this.f33309h = obj;
        this.f33310i = obj2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public final Unit mo3b(Recording recording) {
        int i = this.f33308g;
        if (i == 0) {
            Recording recording2 = recording;
            Intrinsics2.m13089e(recording2, "it");
            ((ExploreAdapter) this.f33309h).f31098m.mo3b(recording2);
            return Unit.f29502a;
        }
        if (i == 1) {
            Recording recording3 = recording;
            Intrinsics2.m13089e(recording3, "it");
            ((ExploreAdapter) this.f33309h).f31098m.mo3b(recording3);
            return Unit.f29502a;
        }
        if (i != 2) {
            throw null;
        }
        Recording recording4 = recording;
        Intrinsics2.m13089e(recording4, "it");
        ((ExploreAdapter) this.f33309h).f31098m.mo3b(recording4);
        return Unit.f29502a;
    }
}
