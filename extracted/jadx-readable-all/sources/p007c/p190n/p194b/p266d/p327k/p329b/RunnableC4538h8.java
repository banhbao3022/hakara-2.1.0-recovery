package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.k.b.h8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4538h8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4480ca f23977f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4677t7 f23978g;

    public RunnableC4538h8(C4677t7 c4677t7, C4480ca c4480ca) {
        this.f23978g = c4677t7;
        this.f23977f = c4480ca;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4677t7 c4677t7 = this.f23978g;
        InterfaceC4569k3 interfaceC4569k3 = c4677t7.f24455d;
        if (interfaceC4569k3 == null) {
            c4677t7.mo10684l().f24418f.m10811a("Failed to send consent settings to service");
            return;
        }
        try {
            interfaceC4569k3.mo10398d1(this.f23977f);
            this.f23978g.m10772F();
        } catch (RemoteException e) {
            this.f23978g.mo10684l().f24418f.m10812b("Failed to send consent settings to the service", e);
        }
    }
}
