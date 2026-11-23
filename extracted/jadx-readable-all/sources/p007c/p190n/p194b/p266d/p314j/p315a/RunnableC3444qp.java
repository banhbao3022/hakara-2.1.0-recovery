package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.qp */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3444qp implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC3000ep f18401f;

    public RunnableC3444qp(InterfaceC3000ep interfaceC3000ep) {
        this.f18401f = interfaceC3000ep;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3333np c3333np = (C3333np) this.f18401f;
        if (c3333np.f17200l) {
            if (c3333np.f17209u.getParent() != null) {
                c3333np.f17195g.removeView(c3333np.f17209u);
            }
        }
        if (c3333np.f17208t == null) {
            return;
        }
        C2330u c2330u = C2330u.f10884a;
        long jMo5621a = c2330u.f10896k.mo5621a();
        if (c3333np.f17199k.getBitmap(c3333np.f17208t) != null) {
            c3333np.f17210v = true;
        }
        long jMo5621a2 = c2330u.f10896k.mo5621a() - jMo5621a;
        if (C2096e.m4556E()) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Spinner frame grab took ");
            sb.append(jMo5621a2);
            sb.append("ms");
            C2096e.m4590z(sb.toString());
        }
        if (jMo5621a2 > c3333np.f17198j) {
            C2622l.m5226A3("Spinner frame grab crossed jank threshold! Suspending spinner.");
            c3333np.f17203o = false;
            c3333np.f17208t = null;
            C3533t3 c3533t3 = c3333np.f17196h;
            if (c3533t3 != null) {
                c3533t3.m8398c("spinner_jank", Long.toString(jMo5621a2));
            }
        }
    }
}
