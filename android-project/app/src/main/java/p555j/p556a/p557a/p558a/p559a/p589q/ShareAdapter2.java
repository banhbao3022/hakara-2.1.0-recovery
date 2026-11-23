package p555j.p556a.p557a.p558a.p559a.p589q;

import mtp.media.karaoke.data.model.Simple;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p616i.ItemShareBinding;

/* JADX INFO: renamed from: j.a.a.a.a.q.b, reason: use source file name */
/* JADX INFO: compiled from: ShareAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ShareAdapter2 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ItemShareBinding f31781g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ShareAdapter f31782h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareAdapter2(ItemShareBinding itemShareBinding, ShareAdapter shareAdapter) {
        super(0);
        this.f31781g = itemShareBinding;
        this.f31782h = shareAdapter;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        Simple simple = this.f31781g.f32955u;
        if (simple != null) {
            InterfaceC6164l<Simple, Unit> interfaceC6164l = this.f31782h.f31779g;
            Intrinsics2.m13088d(simple, "this");
            interfaceC6164l.mo3b(simple);
        }
        return Unit.f29502a;
    }
}
