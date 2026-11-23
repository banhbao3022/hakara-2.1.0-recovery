package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class m31 extends AbstractBinderC3307n {

    /* JADX INFO: renamed from: f */
    public final s41 f16675f;

    public m31(Context context, AbstractC3264lu abstractC3264lu, hi1 hi1Var, mg0 mg0Var, InterfaceC3122i interfaceC3122i) {
        u41 u41Var = new u41(mg0Var, abstractC3264lu.mo7623e());
        u41Var.f20215b.f14748f.set(interfaceC3122i);
        this.f16675f = new s41(new e51(abstractC3264lu, context, u41Var, hi1Var), hi1Var.f14857c);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3344o
    /* JADX INFO: renamed from: d */
    public final synchronized String mo7654d() {
        String strMo5693c;
        s41 s41Var = this.f16675f;
        synchronized (s41Var) {
            strMo5693c = null;
            try {
                InterfaceC2976e1 interfaceC2976e1 = s41Var.f19466c;
                strMo5693c = interfaceC2976e1 != null ? interfaceC2976e1.mo5693c() : null;
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
            }
        }
        return strMo5693c;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3344o
    /* JADX INFO: renamed from: f */
    public final synchronized boolean mo7655f() throws RemoteException {
        boolean zMo6606a;
        s41 s41Var = this.f16675f;
        synchronized (s41Var) {
            zMo6606a = s41Var.f19464a.mo6606a();
        }
        return zMo6606a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3344o
    /* JADX INFO: renamed from: f4 */
    public final synchronized void mo7656f4(ew2 ew2Var, int i) throws RemoteException {
        this.f16675f.m8346a(ew2Var, i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3344o
    /* JADX INFO: renamed from: g */
    public final synchronized String mo7657g() {
        String strMo5693c;
        s41 s41Var = this.f16675f;
        synchronized (s41Var) {
            strMo5693c = null;
            try {
                InterfaceC2976e1 interfaceC2976e1 = s41Var.f19466c;
                strMo5693c = interfaceC2976e1 != null ? interfaceC2976e1.mo5693c() : null;
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
            }
        }
        return strMo5693c;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3344o
    /* JADX INFO: renamed from: y0 */
    public final void mo7651y0(ew2 ew2Var) throws RemoteException {
        this.f16675f.m8346a(ew2Var, 1);
    }
}
