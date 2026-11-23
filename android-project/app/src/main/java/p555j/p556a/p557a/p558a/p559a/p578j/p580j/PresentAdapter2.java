package p555j.p556a.p557a.p558a.p559a.p578j.p580j;

import mtp.media.karaoke.data.model.Present;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p616i.ItemGiftPresentBinding;

/* JADX INFO: renamed from: j.a.a.a.a.j.j.b, reason: use source file name */
/* JADX INFO: compiled from: PresentAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PresentAdapter2 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ItemGiftPresentBinding f31593g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ PresentAdapter f31594h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresentAdapter2(ItemGiftPresentBinding itemGiftPresentBinding, PresentAdapter presentAdapter) {
        super(0);
        this.f31593g = itemGiftPresentBinding;
        this.f31594h = presentAdapter;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        Present present = this.f31593g.f32545v;
        if (present != null) {
            InterfaceC6164l<Present, Unit> interfaceC6164l = this.f31594h.f31591g;
            Intrinsics2.m13088d(present, "this");
            interfaceC6164l.mo3b(present);
        }
        return Unit.f29502a;
    }
}
