package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.k.b.e8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4502e8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4480ca f23870f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4677t7 f23871g;

    public RunnableC4502e8(C4677t7 c4677t7, C4480ca c4480ca) {
        this.f23871g = c4677t7;
        this.f23870f = c4480ca;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4677t7 c4677t7 = this.f23871g;
        InterfaceC4569k3 interfaceC4569k3 = c4677t7.f24455d;
        if (interfaceC4569k3 == null) {
            c4677t7.mo10684l().f24418f.m10811a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            interfaceC4569k3.mo10404q4(this.f23870f);
            this.f23871g.m10772F();
        } catch (RemoteException e) {
            this.f23871g.mo10684l().f24418f.m10812b("Failed to send measurementEnabled to the service", e);
        }
    }
}
