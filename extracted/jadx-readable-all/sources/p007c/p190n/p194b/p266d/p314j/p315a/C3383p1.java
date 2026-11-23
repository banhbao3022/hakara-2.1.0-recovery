package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.C2186m;
import p007c.p190n.p194b.p266d.p267a.C2193t;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.p1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3383p1 extends hx2 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3420q1 f17810c;

    public C3383p1(C3420q1 c3420q1) {
        this.f17810c = c3420q1;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hx2, p007c.p190n.p194b.p266d.p267a.AbstractC2138c
    /* JADX INFO: renamed from: c */
    public final void mo2736c(C2186m c2186m) {
        InterfaceC3087h1 interfaceC3087h1Mo4875M;
        C3420q1 c3420q1 = this.f17810c;
        C2193t c2193t = c3420q1.f18154c;
        InterfaceC3604v interfaceC3604v = c3420q1.f18160i;
        if (interfaceC3604v != null) {
            try {
                interfaceC3087h1Mo4875M = interfaceC3604v.mo4875M();
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
                interfaceC3087h1Mo4875M = null;
            }
        } else {
            interfaceC3087h1Mo4875M = null;
        }
        c2193t.m4636b(interfaceC3087h1Mo4875M);
        super.mo2736c(c2186m);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hx2, p007c.p190n.p194b.p266d.p267a.AbstractC2138c
    /* JADX INFO: renamed from: e */
    public final void mo2737e() {
        InterfaceC3087h1 interfaceC3087h1Mo4875M;
        C3420q1 c3420q1 = this.f17810c;
        C2193t c2193t = c3420q1.f18154c;
        InterfaceC3604v interfaceC3604v = c3420q1.f18160i;
        if (interfaceC3604v != null) {
            try {
                interfaceC3087h1Mo4875M = interfaceC3604v.mo4875M();
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
                interfaceC3087h1Mo4875M = null;
            }
        } else {
            interfaceC3087h1Mo4875M = null;
        }
        c2193t.m4636b(interfaceC3087h1Mo4875M);
        super.mo2737e();
    }
}
