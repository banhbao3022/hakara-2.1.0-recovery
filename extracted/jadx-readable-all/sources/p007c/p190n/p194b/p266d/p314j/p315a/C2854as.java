package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.as */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2854as extends AbstractC3669wr {
    public C2854as(InterfaceC3704xp interfaceC3704xp) {
        super(interfaceC3704xp);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3669wr
    /* JADX INFO: renamed from: g */
    public final boolean mo5841g(String str) {
        String strM7884b = C3331nn.m7884b(str);
        InterfaceC3704xp interfaceC3704xp = this.f21309h.get();
        if (interfaceC3704xp != null && strM7884b != null) {
            interfaceC3704xp.mo6516z(strM7884b, this);
        }
        C2622l.m5226A3("VideoStreamNoopCache is doing nothing.");
        m8669o(str, strM7884b, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3669wr
    /* JADX INFO: renamed from: n */
    public final void mo5842n() {
    }
}
