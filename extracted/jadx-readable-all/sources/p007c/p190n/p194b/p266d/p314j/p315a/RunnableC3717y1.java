package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.y1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3717y1 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ BinderC3754z1 f21727f;

    public RunnableC3717y1(BinderC3754z1 binderC3754z1) {
        this.f21727f = binderC3754z1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3122i interfaceC3122i = this.f21727f.f22147f.f11999f;
        if (interfaceC3122i != null) {
            try {
                interfaceC3122i.mo5871L(1);
            } catch (RemoteException e) {
                C2622l.m5241D3("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
