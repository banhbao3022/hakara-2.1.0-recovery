package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p314j.p325k.C4145e9;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4316qc;

/* JADX INFO: renamed from: c.n.b.d.k.b.x7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4721x7 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4480ca f24583f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC4316qc f24584g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4677t7 f24585h;

    public RunnableC4721x7(C4677t7 c4677t7, C4480ca c4480ca, InterfaceC4316qc interfaceC4316qc) {
        this.f24585h = c4677t7;
        this.f24583f = c4480ca;
        this.f24584g = interfaceC4316qc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                if (C4145e9.m9566a() && this.f24585h.f24476a.f24534h.m10417k(C4647r.f24311H0) && !this.f24585h.m10818g().m10540y().m10493k()) {
                    this.f24585h.mo10684l().f24423k.m10811a("Analytics storage consent denied; will not get app instance id");
                    this.f24585h.m10383i().f23855g.set(null);
                    this.f24585h.m10818g().f23898m.m10640b(null);
                    this.f24585h.m10817f().m10879M(this.f24584g, null);
                    return;
                }
                C4677t7 c4677t7 = this.f24585h;
                InterfaceC4569k3 interfaceC4569k3 = c4677t7.f24455d;
                if (interfaceC4569k3 == null) {
                    c4677t7.mo10684l().f24418f.m10811a("Failed to get app instance id");
                    this.f24585h.m10817f().m10879M(this.f24584g, null);
                    return;
                }
                String strMo10402m2 = interfaceC4569k3.mo10402m2(this.f24583f);
                if (strMo10402m2 != null) {
                    this.f24585h.m10383i().f23855g.set(strMo10402m2);
                    this.f24585h.m10818g().f23898m.m10640b(strMo10402m2);
                }
                this.f24585h.m10772F();
                this.f24585h.m10817f().m10879M(this.f24584g, strMo10402m2);
            } catch (RemoteException e) {
                this.f24585h.mo10684l().f24418f.m10812b("Failed to get app instance id", e);
                this.f24585h.m10817f().m10879M(this.f24584g, null);
            }
        } catch (Throwable th) {
            this.f24585h.m10817f().m10879M(this.f24584g, null);
            throw th;
        }
    }
}
