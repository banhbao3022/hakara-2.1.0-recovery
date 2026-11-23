package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class s41 {

    /* JADX INFO: renamed from: a */
    public final x41<m20> f19464a;

    /* JADX INFO: renamed from: b */
    public final String f19465b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2976e1 f19466c;

    public s41(x41<m20> x41Var, String str) {
        this.f19464a = x41Var;
        this.f19465b = str;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m8346a(ew2 ew2Var, int i) throws RemoteException {
        this.f19466c = null;
        this.f19464a.mo6607b(ew2Var, this.f19465b, new y41(i), new r41(this));
    }
}
