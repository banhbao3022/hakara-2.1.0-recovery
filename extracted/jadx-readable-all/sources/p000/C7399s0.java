package p000;

import mtp.media.karaoke.data.model.Recording;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p563d.p565e.DuetOwnerAdapter;
import p555j.p556a.p557a.p616i.ItemDuetOwnerJoinedBinding;

/* JADX INFO: renamed from: s0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes2.dex */
public final class C7399s0 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34098g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34099h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f34100i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7399s0(int i, Object obj, Object obj2) {
        super(0);
        this.f34098g = i;
        this.f34099h = obj;
        this.f34100i = obj2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f34098g;
        if (i == 0) {
            Recording recording = ((ItemDuetOwnerJoinedBinding) this.f34099h).f32911w;
            if (recording != null) {
                InterfaceC6164l<Recording, Unit> interfaceC6164l = ((DuetOwnerAdapter) this.f34100i).f31175g;
                Intrinsics2.m13088d(recording, "this");
                interfaceC6164l.mo3b(recording);
            }
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        Recording recording2 = ((ItemDuetOwnerJoinedBinding) this.f34099h).f32911w;
        if (recording2 != null) {
            InterfaceC6164l<Recording, Unit> interfaceC6164l2 = ((DuetOwnerAdapter) this.f34100i).f31175g;
            Intrinsics2.m13088d(recording2, "this");
            interfaceC6164l2.mo3b(recording2);
        }
        return Unit.f29502a;
    }
}
