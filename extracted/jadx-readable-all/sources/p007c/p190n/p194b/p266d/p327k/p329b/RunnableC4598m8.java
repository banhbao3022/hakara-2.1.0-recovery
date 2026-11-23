package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.k.b.m8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4598m8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC4569k3 f24164f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ServiceConnectionC4610n8 f24165g;

    public RunnableC4598m8(ServiceConnectionC4610n8 serviceConnectionC4610n8, InterfaceC4569k3 interfaceC4569k3) {
        this.f24165g = serviceConnectionC4610n8;
        this.f24164f = interfaceC4569k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f24165g) {
            this.f24165g.f24187a = false;
            if (!this.f24165g.f24189c.m10768B()) {
                this.f24165g.f24189c.mo10684l().f24426n.m10811a("Connected to service");
                C4677t7 c4677t7 = this.f24165g.f24189c;
                InterfaceC4569k3 interfaceC4569k3 = this.f24164f;
                c4677t7.mo10381b();
                Objects.requireNonNull(interfaceC4569k3, "null reference");
                c4677t7.f24455d = interfaceC4569k3;
                c4677t7.m10772F();
                c4677t7.m10774H();
            }
        }
    }
}
