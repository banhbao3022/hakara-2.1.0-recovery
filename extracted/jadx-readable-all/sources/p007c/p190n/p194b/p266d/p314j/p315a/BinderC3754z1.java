package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.z1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3754z1 extends AbstractBinderC3307n {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ BinderC2828a2 f22147f;

    public /* synthetic */ BinderC3754z1(BinderC2828a2 binderC2828a2) {
        this.f22147f = binderC2828a2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3344o
    /* JADX INFO: renamed from: d */
    public final String mo7654d() throws RemoteException {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3344o
    /* JADX INFO: renamed from: f */
    public final boolean mo7655f() throws RemoteException {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3344o
    /* JADX INFO: renamed from: f4 */
    public final void mo7656f4(ew2 ew2Var, int i) throws RemoteException {
        C2622l.m5408n3("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        C3331nn.f17166a.post(new RunnableC3717y1(this));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3344o
    /* JADX INFO: renamed from: g */
    public final String mo7657g() throws RemoteException {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3344o
    /* JADX INFO: renamed from: y0 */
    public final void mo7651y0(ew2 ew2Var) throws RemoteException {
        C2622l.m5408n3("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        C3331nn.f17166a.post(new RunnableC3717y1(this));
    }
}
