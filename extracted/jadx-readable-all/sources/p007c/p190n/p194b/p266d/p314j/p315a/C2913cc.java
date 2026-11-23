package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2298t;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.cc */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2913cc extends C3406po<InterfaceC3689xa> {

    /* JADX INFO: renamed from: c */
    public final Object f12973c = new Object();

    /* JADX INFO: renamed from: d */
    public boolean f12974d = false;

    /* JADX INFO: renamed from: e */
    public int f12975e = 0;

    public C2913cc(InterfaceC2298t<InterfaceC3689xa> interfaceC2298t) {
    }

    /* JADX INFO: renamed from: d */
    public final C3690xb m6163d() {
        C3690xb c3690xb = new C3690xb(this);
        synchronized (this.f12973c) {
            m8128a(new C3727yb(c3690xb), new C3764zb(c3690xb));
            C2622l.m5384j(this.f12975e >= 0);
            this.f12975e++;
        }
        return c3690xb;
    }

    /* JADX INFO: renamed from: e */
    public final void m6164e() {
        synchronized (this.f12973c) {
            C2622l.m5384j(this.f12975e > 0);
            C2096e.m4590z("Releasing 1 reference for JS Engine");
            this.f12975e--;
            m6166g();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6165f() {
        synchronized (this.f12973c) {
            C2622l.m5384j(this.f12975e >= 0);
            C2096e.m4590z("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f12974d = true;
            m6166g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6166g() {
        synchronized (this.f12973c) {
            C2622l.m5384j(this.f12975e >= 0);
            if (this.f12974d && this.f12975e == 0) {
                C2096e.m4590z("No reference is left (including root). Cleaning up engine.");
                m8128a(new C2875bc(this), new C3258lo());
            } else {
                C2096e.m4590z("There are still references to the engine. Not destroying.");
            }
        }
    }
}
