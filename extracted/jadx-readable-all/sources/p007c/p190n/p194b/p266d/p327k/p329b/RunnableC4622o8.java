package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.k.b.o8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4622o8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC4569k3 f24235f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ServiceConnectionC4610n8 f24236g;

    public RunnableC4622o8(ServiceConnectionC4610n8 serviceConnectionC4610n8, InterfaceC4569k3 interfaceC4569k3) {
        this.f24236g = serviceConnectionC4610n8;
        this.f24235f = interfaceC4569k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f24236g) {
            this.f24236g.f24187a = false;
            if (!this.f24236g.f24189c.m10768B()) {
                this.f24236g.f24189c.mo10684l().f24425m.m10811a("Connected to remote service");
                C4677t7 c4677t7 = this.f24236g.f24189c;
                InterfaceC4569k3 interfaceC4569k3 = this.f24235f;
                c4677t7.mo10381b();
                Objects.requireNonNull(interfaceC4569k3, "null reference");
                c4677t7.f24455d = interfaceC4569k3;
                c4677t7.m10772F();
                c4677t7.m10774H();
            }
        }
    }
}
