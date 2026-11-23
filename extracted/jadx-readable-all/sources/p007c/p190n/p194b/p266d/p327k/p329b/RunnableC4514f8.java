package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4316qc;

/* JADX INFO: renamed from: c.n.b.d.k.b.f8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4514f8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4625p f23918f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f23919g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC4316qc f23920h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C4677t7 f23921i;

    public RunnableC4514f8(C4677t7 c4677t7, C4625p c4625p, String str, InterfaceC4316qc interfaceC4316qc) {
        this.f23921i = c4677t7;
        this.f23918f = c4625p;
        this.f23919g = str;
        this.f23920h = interfaceC4316qc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                C4677t7 c4677t7 = this.f23921i;
                InterfaceC4569k3 interfaceC4569k3 = c4677t7.f24455d;
                if (interfaceC4569k3 == null) {
                    c4677t7.mo10684l().f24418f.m10811a("Discarding data. Failed to send event to service to bundle");
                    this.f23921i.m10817f().m10882P(this.f23920h, null);
                } else {
                    byte[] bArrMo10394X0 = interfaceC4569k3.mo10394X0(this.f23918f, this.f23919g);
                    this.f23921i.m10772F();
                    this.f23921i.m10817f().m10882P(this.f23920h, bArrMo10394X0);
                }
            } catch (RemoteException e) {
                this.f23921i.mo10684l().f24418f.m10812b("Failed to send event to the service to bundle", e);
                this.f23921i.m10817f().m10882P(this.f23920h, null);
            }
        } catch (Throwable th) {
            this.f23921i.m10817f().m10882P(this.f23920h, null);
            throw th;
        }
    }
}
