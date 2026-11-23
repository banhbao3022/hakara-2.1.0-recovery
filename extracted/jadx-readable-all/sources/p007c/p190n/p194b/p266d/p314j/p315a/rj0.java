package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rj0 {

    /* JADX INFO: renamed from: a */
    public final ii1 f18849a;

    /* JADX INFO: renamed from: b */
    public final Executor f18850b;

    /* JADX INFO: renamed from: c */
    public final yl0 f18851c;

    public rj0(ii1 ii1Var, Executor executor, yl0 yl0Var) {
        this.f18849a = ii1Var;
        this.f18850b = executor;
        this.f18851c = yl0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m8280a(InterfaceC3410ps interfaceC3410ps) {
        C2967dt c2967dt = (C2967dt) interfaceC3410ps;
        c2967dt.f13378f.mo6479f0("/video", C3427q8.f18224m);
        c2967dt.f13378f.mo6479f0("/videoMeta", C3427q8.f18225n);
        c2967dt.f13378f.mo6479f0("/precache", new C3706xr());
        c2967dt.f13378f.mo6479f0("/delayPageLoaded", C3427q8.f18228q);
        c2967dt.f13378f.mo6479f0("/instrument", C3427q8.f18226o);
        c2967dt.f13378f.mo6479f0("/log", C3427q8.f18219h);
        c2967dt.f13378f.mo6479f0("/videoClicked", C3427q8.f18220i);
        C3670ws c3670ws = (C3670ws) c2967dt.mo6459O0();
        synchronized (c3670ws.f21328j) {
            c3670ws.f21338t = true;
        }
        InterfaceC3464r8<InterfaceC3410ps> interfaceC3464r8 = C3427q8.f18212a;
        c2967dt.f13378f.mo6479f0("/click", C2909c8.f12954a);
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14240O1)).booleanValue()) {
            c2967dt.f13378f.mo6479f0("/getNativeAdViewSignals", C3427q8.f18231t);
        }
        if (this.f18849a.f15189b != null) {
            C3670ws c3670ws2 = (C3670ws) c2967dt.mo6459O0();
            synchronized (c3670ws2.f21328j) {
                c3670ws2.f21339u = true;
            }
            c2967dt.f13378f.mo6479f0("/open", new C2910c9(null, null, null, null, null));
        } else {
            C3670ws c3670ws3 = (C3670ws) c2967dt.mo6459O0();
            synchronized (c3670ws3.f21328j) {
                c3670ws3.f21339u = false;
            }
        }
        if (C2330u.f10884a.f10910y.m6048f(interfaceC3410ps.getContext())) {
            c2967dt.f13378f.mo6479f0("/logScionEvent", new C3687x8(interfaceC3410ps.getContext()));
        }
    }
}
