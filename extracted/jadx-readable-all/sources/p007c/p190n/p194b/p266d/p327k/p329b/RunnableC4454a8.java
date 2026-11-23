package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.k.b.a8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4454a8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4480ca f23716f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4677t7 f23717g;

    public RunnableC4454a8(C4677t7 c4677t7, C4480ca c4480ca) {
        this.f23717g = c4677t7;
        this.f23716f = c4480ca;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C4677t7 c4677t7 = this.f23717g;
        InterfaceC4569k3 interfaceC4569k3 = c4677t7.f24455d;
        if (interfaceC4569k3 == null) {
            c4677t7.mo10684l().f24418f.m10811a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            interfaceC4569k3.mo10408y3(this.f23716f);
            this.f23717g.m10387r().m10710z();
            this.f23717g.m10776w(interfaceC4569k3, null, this.f23716f);
            this.f23717g.m10772F();
        } catch (RemoteException e) {
            this.f23717g.mo10684l().f24418f.m10812b("Failed to send app launch to the service", e);
        }
    }
}
