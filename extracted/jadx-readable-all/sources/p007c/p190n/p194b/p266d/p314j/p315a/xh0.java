package p007c.p190n.p194b.p266d.p314j.p315a;

import p636z0.p691g.ArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xh0 implements a70 {

    /* JADX INFO: renamed from: f */
    public final bg0 f21544f;

    /* JADX INFO: renamed from: g */
    public final hg0 f21545g;

    public xh0(bg0 bg0Var, hg0 hg0Var) {
        this.f21544f = bg0Var;
        this.f21545g = hg0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a70
    /* JADX INFO: renamed from: i */
    public final void mo5699i() {
        if (this.f21544f.m6005k() == null) {
            return;
        }
        InterfaceC3410ps interfaceC3410psM6004j = this.f21544f.m6004j();
        InterfaceC3410ps interfaceC3410psM6003i = this.f21544f.m6003i();
        if (interfaceC3410psM6004j == null) {
            interfaceC3410psM6004j = interfaceC3410psM6003i != null ? interfaceC3410psM6003i : null;
        }
        if (!this.f21545g.mo6999c() || interfaceC3410psM6004j == null) {
            return;
        }
        interfaceC3410psM6004j.mo6501r0("onSdkImpression", new ArrayMap());
    }
}
