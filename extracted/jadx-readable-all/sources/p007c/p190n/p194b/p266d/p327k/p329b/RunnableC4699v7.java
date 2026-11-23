package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4316qc;

/* JADX INFO: renamed from: c.n.b.d.k.b.v7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4699v7 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f24501f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24502g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f24503h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C4480ca f24504i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC4316qc f24505j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4677t7 f24506k;

    public RunnableC4699v7(C4677t7 c4677t7, String str, String str2, boolean z, C4480ca c4480ca, InterfaceC4316qc interfaceC4316qc) {
        this.f24506k = c4677t7;
        this.f24501f = str;
        this.f24502g = str2;
        this.f24503h = z;
        this.f24504i = c4480ca;
        this.f24505j = interfaceC4316qc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle();
        try {
            try {
                C4677t7 c4677t7 = this.f24506k;
                InterfaceC4569k3 interfaceC4569k3 = c4677t7.f24455d;
                if (interfaceC4569k3 == null) {
                    c4677t7.mo10684l().f24418f.m10813c("Failed to get user properties; not connected to service", this.f24501f, this.f24502g);
                    this.f24506k.m10817f().m10878L(this.f24505j, bundle);
                } else {
                    Bundle bundleM10851A = C4723x9.m10851A(interfaceC4569k3.mo10407v3(this.f24501f, this.f24502g, this.f24503h, this.f24504i));
                    this.f24506k.m10772F();
                    this.f24506k.m10817f().m10878L(this.f24505j, bundleM10851A);
                }
            } catch (RemoteException e) {
                this.f24506k.mo10684l().f24418f.m10813c("Failed to get user properties; remote exception", this.f24501f, e);
                this.f24506k.m10817f().m10878L(this.f24505j, bundle);
            }
        } catch (Throwable th) {
            this.f24506k.m10817f().m10878L(this.f24505j, bundle);
            throw th;
        }
    }
}
