package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class u41 {

    /* JADX INFO: renamed from: a */
    public final mg0 f20214a;

    /* JADX INFO: renamed from: b */
    public final h41 f20215b;

    /* JADX INFO: renamed from: c */
    public final l60 f20216c;

    public u41(mg0 mg0Var, im1 im1Var) {
        this.f20214a = mg0Var;
        final h41 h41Var = new h41(im1Var);
        this.f20215b = h41Var;
        final InterfaceC3503sa interfaceC3503sa = mg0Var.f16752f;
        this.f20216c = new l60(h41Var, interfaceC3503sa) { // from class: c.n.b.d.j.a.t41

            /* JADX INFO: renamed from: f */
            public final h41 f19765f;

            /* JADX INFO: renamed from: g */
            public final InterfaceC3503sa f19766g;

            {
                this.f19765f = h41Var;
                this.f19766g = interfaceC3503sa;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.l60
            /* JADX INFO: renamed from: o0 */
            public final void mo6216o0(yv2 yv2Var) {
                h41 h41Var2 = this.f19765f;
                InterfaceC3503sa interfaceC3503sa2 = this.f19766g;
                h41Var2.mo6216o0(yv2Var);
                if (interfaceC3503sa2 != null) {
                    try {
                        interfaceC3503sa2.mo8269s(yv2Var);
                    } catch (RemoteException e) {
                        C2622l.m5271J3("#007 Could not call remote method.", e);
                    }
                }
                if (interfaceC3503sa2 != null) {
                    try {
                        interfaceC3503sa2.mo8270y(yv2Var.f22116f);
                    } catch (RemoteException e2) {
                        C2622l.m5271J3("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }
}
