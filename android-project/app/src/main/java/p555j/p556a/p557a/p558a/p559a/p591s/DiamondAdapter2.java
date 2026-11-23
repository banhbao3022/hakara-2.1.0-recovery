package p555j.p556a.p557a.p558a.p559a.p591s;

import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p611b.SkuEntity;
import p555j.p556a.p557a.p616i.ItemDiamondSkuBinding;

/* JADX INFO: renamed from: j.a.a.a.a.s.c, reason: use source file name */
/* JADX INFO: compiled from: DiamondAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DiamondAdapter2 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ItemDiamondSkuBinding f31943g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DiamondAdapter f31944h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiamondAdapter2(ItemDiamondSkuBinding itemDiamondSkuBinding, DiamondAdapter diamondAdapter) {
        super(0);
        this.f31943g = itemDiamondSkuBinding;
        this.f31944h = diamondAdapter;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        SkuEntity skuEntity = this.f31943g.f32761w;
        if (skuEntity != null) {
            InterfaceC6164l<SkuEntity, Unit> interfaceC6164l = this.f31944h.f31941f;
            Intrinsics2.m13088d(skuEntity, "this");
            interfaceC6164l.mo3b(skuEntity);
        }
        return Unit.f29502a;
    }
}
