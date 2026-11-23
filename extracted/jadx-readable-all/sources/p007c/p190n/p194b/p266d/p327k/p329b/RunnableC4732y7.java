package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p266d.p314j.p325k.C4145e9;

/* JADX INFO: renamed from: c.n.b.d.k.b.y7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4732y7 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReference f24605f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4480ca f24606g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4677t7 f24607h;

    public RunnableC4732y7(C4677t7 c4677t7, AtomicReference atomicReference, C4480ca c4480ca) {
        this.f24607h = c4677t7;
        this.f24605f = atomicReference;
        this.f24606g = c4480ca;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f24605f) {
            try {
                try {
                    if (C4145e9.m9566a() && this.f24607h.f24476a.f24534h.m10417k(C4647r.f24311H0) && !this.f24607h.m10818g().m10540y().m10493k()) {
                        this.f24607h.mo10684l().f24423k.m10811a("Analytics storage consent denied; will not get app instance id");
                        this.f24607h.m10383i().f23855g.set(null);
                        this.f24607h.m10818g().f23898m.m10640b(null);
                        this.f24605f.set(null);
                        this.f24605f.notify();
                        return;
                    }
                    C4677t7 c4677t7 = this.f24607h;
                    InterfaceC4569k3 interfaceC4569k3 = c4677t7.f24455d;
                    if (interfaceC4569k3 == null) {
                        c4677t7.mo10684l().f24418f.m10811a("Failed to get app instance id");
                        this.f24605f.notify();
                        return;
                    }
                    this.f24605f.set(interfaceC4569k3.mo10402m2(this.f24606g));
                    String str = (String) this.f24605f.get();
                    if (str != null) {
                        this.f24607h.m10383i().f23855g.set(str);
                        this.f24607h.m10818g().f23898m.m10640b(str);
                    }
                    this.f24607h.m10772F();
                    this.f24605f.notify();
                } catch (RemoteException e) {
                    this.f24607h.mo10684l().f24418f.m10812b("Failed to get app instance id", e);
                    this.f24605f.notify();
                }
            } catch (Throwable th) {
                this.f24605f.notify();
                throw th;
            }
        }
    }
}
