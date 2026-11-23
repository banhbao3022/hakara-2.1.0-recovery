package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class ha0<ListenerT> {

    /* JADX INFO: renamed from: f */
    public final Map<ListenerT, Executor> f14796f = new HashMap();

    public ha0(Set<bc0<ListenerT>> set) {
        synchronized (this) {
            for (bc0<ListenerT> bc0Var : set) {
                synchronized (this) {
                    m7109u0(bc0Var.f12554a, bc0Var.f12555b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final synchronized void m7108A0(final ga0<ListenerT> ga0Var) {
        for (Map.Entry<ListenerT, Executor> entry : this.f14796f.entrySet()) {
            final ListenerT key = entry.getKey();
            entry.getValue().execute(new Runnable(ga0Var, key) { // from class: c.n.b.d.j.a.fa0

                /* JADX INFO: renamed from: f */
                public final ga0 f13999f;

                /* JADX INFO: renamed from: g */
                public final Object f14000g;

                {
                    this.f13999f = ga0Var;
                    this.f14000g = key;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.f13999f.mo5710a(this.f14000g);
                    } catch (Throwable th) {
                        C2330u.f10884a.f10893h.m6648e(th, "EventEmitter.notify");
                        C2096e.m4554C("Event emitter exception.", th);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final synchronized void m7109u0(ListenerT listenert, Executor executor) {
        this.f14796f.put(listenert, executor);
    }
}
