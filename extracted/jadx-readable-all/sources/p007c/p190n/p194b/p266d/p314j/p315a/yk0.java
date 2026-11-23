package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.C2193t;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yk0 extends C2193t.a {

    /* JADX INFO: renamed from: a */
    public final bg0 f21906a;

    public yk0(bg0 bg0Var) {
        this.f21906a = bg0Var;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC3198k1 m8801d(bg0 bg0Var) {
        InterfaceC3087h1 interfaceC3087h1M6009s = bg0Var.m6009s();
        if (interfaceC3087h1M6009s == null) {
            return null;
        }
        try {
            return interfaceC3087h1M6009s.mo5783u();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.C2193t.a
    /* JADX INFO: renamed from: a */
    public final void mo4637a() {
        InterfaceC3198k1 interfaceC3198k1M8801d = m8801d(this.f21906a);
        if (interfaceC3198k1M8801d == null) {
            return;
        }
        try {
            interfaceC3198k1M8801d.mo7190g();
        } catch (RemoteException e) {
            C2622l.m5241D3("Unable to call onVideoEnd()", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.C2193t.a
    /* JADX INFO: renamed from: b */
    public final void mo4638b() {
        InterfaceC3198k1 interfaceC3198k1M8801d = m8801d(this.f21906a);
        if (interfaceC3198k1M8801d == null) {
            return;
        }
        try {
            interfaceC3198k1M8801d.mo7189f();
        } catch (RemoteException e) {
            C2622l.m5241D3("Unable to call onVideoEnd()", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.C2193t.a
    /* JADX INFO: renamed from: c */
    public final void mo4639c() {
        InterfaceC3198k1 interfaceC3198k1M8801d = m8801d(this.f21906a);
        if (interfaceC3198k1M8801d == null) {
            return;
        }
        try {
            interfaceC3198k1M8801d.mo7187c();
        } catch (RemoteException e) {
            C2622l.m5241D3("Unable to call onVideoEnd()", e);
        }
    }
}
