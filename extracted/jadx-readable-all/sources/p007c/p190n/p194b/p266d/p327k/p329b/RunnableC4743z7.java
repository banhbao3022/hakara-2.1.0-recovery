package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.k.b.z7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4743z7 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4585l7 f24630f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4677t7 f24631g;

    public RunnableC4743z7(C4677t7 c4677t7, C4585l7 c4585l7) {
        this.f24631g = c4677t7;
        this.f24630f = c4585l7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4677t7 c4677t7 = this.f24631g;
        InterfaceC4569k3 interfaceC4569k3 = c4677t7.f24455d;
        if (interfaceC4569k3 == null) {
            c4677t7.mo10684l().f24418f.m10811a("Failed to send current screen to service");
            return;
        }
        try {
            C4585l7 c4585l7 = this.f24630f;
            if (c4585l7 == null) {
                interfaceC4569k3.mo10393W2(0L, null, null, c4677t7.f24476a.f24528b.getPackageName());
            } else {
                interfaceC4569k3.mo10393W2(c4585l7.f24123c, c4585l7.f24121a, c4585l7.f24122b, c4677t7.f24476a.f24528b.getPackageName());
            }
            this.f24631g.m10772F();
        } catch (RemoteException e) {
            this.f24631g.mo10684l().f24418f.m10812b("Failed to send current screen to the service", e);
        }
    }
}
