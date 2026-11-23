package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.f2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3014f2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final InterfaceC3032fk f13776f;

    public RunnableC3014f2(InterfaceC3032fk interfaceC3032fk) {
        this.f13776f = interfaceC3032fk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3032fk interfaceC3032fk = this.f13776f;
        if (interfaceC3032fk != null) {
            try {
                interfaceC3032fk.mo6362y(1);
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
            }
        }
    }
}
