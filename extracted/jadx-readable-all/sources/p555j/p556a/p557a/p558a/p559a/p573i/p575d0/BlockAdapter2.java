package p555j.p556a.p557a.p558a.p559a.p573i.p575d0;

import mtp.media.karaoke.data.model.User;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p616i.ItemUserBlockBinding;

/* JADX INFO: renamed from: j.a.a.a.a.i.d0.d, reason: use source file name */
/* JADX INFO: compiled from: BlockAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BlockAdapter2 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ItemUserBlockBinding f31433g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ BlockAdapter f31434h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockAdapter2(ItemUserBlockBinding itemUserBlockBinding, BlockAdapter blockAdapter) {
        super(0);
        this.f31433g = itemUserBlockBinding;
        this.f31434h = blockAdapter;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        User user = this.f31433g.f32596w;
        if (user != null) {
            InterfaceC6164l<User, Unit> interfaceC6164l = this.f31434h.f31431f;
            Intrinsics2.m13088d(user, "this");
            interfaceC6164l.mo3b(user);
        }
        return Unit.f29502a;
    }
}
