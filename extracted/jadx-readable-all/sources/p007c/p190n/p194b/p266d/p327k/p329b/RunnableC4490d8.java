package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.k.b.d8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4490d8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Bundle f23834f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4480ca f23835g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4677t7 f23836h;

    public RunnableC4490d8(C4677t7 c4677t7, Bundle bundle, C4480ca c4480ca) {
        this.f23836h = c4677t7;
        this.f23834f = bundle;
        this.f23835g = c4480ca;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4677t7 c4677t7 = this.f23836h;
        InterfaceC4569k3 interfaceC4569k3 = c4677t7.f24455d;
        if (interfaceC4569k3 == null) {
            c4677t7.mo10684l().f24418f.m10811a("Failed to send default event parameters to service");
            return;
        }
        try {
            interfaceC4569k3.mo10406u5(this.f23834f, this.f23835g);
        } catch (RemoteException e) {
            this.f23836h.mo10684l().f24418f.m10812b("Failed to send default event parameters to service", e);
        }
    }
}
