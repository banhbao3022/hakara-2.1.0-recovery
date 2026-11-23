package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.k.b.w7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4710w7 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4480ca f24559f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4677t7 f24560g;

    public RunnableC4710w7(C4677t7 c4677t7, C4480ca c4480ca) {
        this.f24560g = c4677t7;
        this.f24559f = c4480ca;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4677t7 c4677t7 = this.f24560g;
        InterfaceC4569k3 interfaceC4569k3 = c4677t7.f24455d;
        if (interfaceC4569k3 == null) {
            c4677t7.mo10684l().f24418f.m10811a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            interfaceC4569k3.mo10396a3(this.f24559f);
        } catch (RemoteException e) {
            this.f24560g.mo10684l().f24418f.m10812b("Failed to reset data on the service: remote exception", e);
        }
        this.f24560g.m10772F();
    }
}
