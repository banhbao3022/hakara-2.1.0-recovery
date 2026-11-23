package p555j.p556a.p557a.p558a.p559a.p578j.p579i;

import mtp.media.karaoke.data.model.Present;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p616i.ItemFanGiftBinding;

/* JADX INFO: renamed from: j.a.a.a.a.j.i.c, reason: use source file name */
/* JADX INFO: compiled from: FanGiftAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FanGiftAdapter2 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ItemFanGiftBinding f31580g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ FanGiftAdapter f31581h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FanGiftAdapter2(ItemFanGiftBinding itemFanGiftBinding, FanGiftAdapter fanGiftAdapter) {
        super(0);
        this.f31580g = itemFanGiftBinding;
        this.f31581h = fanGiftAdapter;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        Present present = this.f31580g.f32442A;
        if (present != null) {
            InterfaceC6164l<Present, Unit> interfaceC6164l = this.f31581h.f31578f;
            Intrinsics2.m13088d(present, "this");
            interfaceC6164l.mo3b(present);
        }
        return Unit.f29502a;
    }
}
