package p007c.p190n.p194b.p266d.p290d;

import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p290d.p295s.AbstractBinderC2533i;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p290d.p295s.C2519b0;
import p007c.p190n.p194b.p266d.p290d.p295s.C2536j0;
import p007c.p190n.p194b.p266d.p290d.p295s.C2550u;
import p007c.p190n.p194b.p266d.p333n.C4782j;

/* JADX INFO: renamed from: c.n.b.d.d.l0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2405l0 extends AbstractBinderC2533i {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2372a0 f11083f;

    public BinderC2405l0(C2372a0 c2372a0) {
        this.f11083f = c2372a0;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: A */
    public final void mo4970A(final int i) {
        this.f11083f.f10980n.post(new Runnable(this, i) { // from class: c.n.b.d.d.k0

            /* JADX INFO: renamed from: f */
            public final BinderC2405l0 f11071f;

            /* JADX INFO: renamed from: g */
            public final int f11072g;

            {
                this.f11071f = this;
                this.f11072g = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BinderC2405l0 binderC2405l0 = this.f11071f;
                int i2 = this.f11072g;
                C2372a0 c2372a0 = binderC2405l0.f11083f;
                c2372a0.f10971A = -1;
                c2372a0.f10972B = -1;
                c2372a0.f10989w = null;
                c2372a0.f10990x = null;
                c2372a0.f10991y = 0.0d;
                c2372a0.m4949m();
                c2372a0.f10992z = false;
                c2372a0.f10973C = null;
                C2372a0 c2372a1 = binderC2405l0.f11083f;
                c2372a1.f10981o = 1;
                Iterator<C2418p1> it = c2372a1.f10978H.iterator();
                while (it.hasNext()) {
                    it.next().mo4994d(i2);
                }
                binderC2405l0.f11083f.m4948l();
                C2372a0 c2372a2 = binderC2405l0.f11083f;
                c2372a2.m4944e(c2372a2.f10979m);
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: A0 */
    public final void mo4971A0(int i) {
        C2372a0.m4941h(this.f11083f, i);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: C0 */
    public final void mo4972C0(final String str, final String str2) {
        C2372a0.f10968j.m5119a("Receive (type=text, ns=%s) %s", str, str2);
        this.f11083f.f10980n.post(new Runnable(this, str, str2) { // from class: c.n.b.d.d.r0

            /* JADX INFO: renamed from: f */
            public final BinderC2405l0 f11369f;

            /* JADX INFO: renamed from: g */
            public final String f11370g;

            /* JADX INFO: renamed from: h */
            public final String f11371h;

            {
                this.f11369f = this;
                this.f11370g = str;
                this.f11371h = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2383e.d dVar;
                BinderC2405l0 binderC2405l0 = this.f11369f;
                String str3 = this.f11370g;
                String str4 = this.f11371h;
                synchronized (binderC2405l0.f11083f.f10976F) {
                    dVar = binderC2405l0.f11083f.f10976F.get(str3);
                }
                if (dVar != null) {
                    dVar.mo4961a(binderC2405l0.f11083f.f10974D, str3, str4);
                } else {
                    C2372a0.f10968j.m5119a("Discarded message for unknown namespace '%s'", str3);
                }
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: E4 */
    public final void mo4973E4(final C2536j0 c2536j0) {
        this.f11083f.f10980n.post(new Runnable(this, c2536j0) { // from class: c.n.b.d.d.p0

            /* JADX INFO: renamed from: f */
            public final BinderC2405l0 f11133f;

            /* JADX INFO: renamed from: g */
            public final C2536j0 f11134g;

            {
                this.f11133f = this;
                this.f11134g = c2536j0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                boolean z2;
                boolean z3;
                BinderC2405l0 binderC2405l0 = this.f11133f;
                C2536j0 c2536j1 = this.f11134g;
                C2372a0 c2372a0 = binderC2405l0.f11083f;
                C2518b c2518b = C2372a0.f10968j;
                Objects.requireNonNull(c2372a0);
                C2380d c2380d = c2536j1.f11427i;
                if (!C2516a.m5114d(c2380d, c2372a0.f10989w)) {
                    c2372a0.f10989w = c2380d;
                    c2372a0.f10977G.mo4957c(c2380d);
                }
                double d = c2536j1.f11424f;
                if (Double.isNaN(d) || Math.abs(d - c2372a0.f10991y) <= 1.0E-7d) {
                    z = false;
                } else {
                    c2372a0.f10991y = d;
                    z = true;
                }
                boolean z4 = c2536j1.f11425g;
                if (z4 != c2372a0.f10992z) {
                    c2372a0.f10992z = z4;
                    z = true;
                }
                C2518b c2518b2 = C2372a0.f10968j;
                c2518b2.m5119a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(c2372a0.f10982p));
                C2383e.c cVar = c2372a0.f10977G;
                if (cVar != null && (z || c2372a0.f10982p)) {
                    cVar.mo4960f();
                }
                Double.isNaN(c2536j1.f11430l);
                int i = c2536j1.f11426h;
                if (i != c2372a0.f10971A) {
                    c2372a0.f10971A = i;
                    z2 = true;
                } else {
                    z2 = false;
                }
                c2518b2.m5119a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(c2372a0.f10982p));
                C2383e.c cVar2 = c2372a0.f10977G;
                if (cVar2 != null && (z2 || c2372a0.f10982p)) {
                    cVar2.mo4955a(c2372a0.f10971A);
                }
                int i2 = c2536j1.f11428j;
                if (i2 != c2372a0.f10972B) {
                    c2372a0.f10972B = i2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                c2518b2.m5119a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(c2372a0.f10982p));
                C2383e.c cVar3 = c2372a0.f10977G;
                if (cVar3 != null && (z3 || c2372a0.f10982p)) {
                    cVar3.mo4959e(c2372a0.f10972B);
                }
                if (!C2516a.m5114d(c2372a0.f10973C, c2536j1.f11429k)) {
                    c2372a0.f10973C = c2536j1.f11429k;
                }
                c2372a0.f10982p = false;
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: U5 */
    public final void mo4974U5(final int i) {
        C2372a0.m4941h(this.f11083f, i);
        C2372a0 c2372a0 = this.f11083f;
        if (c2372a0.f10977G != null) {
            c2372a0.f10980n.post(new Runnable(this, i) { // from class: c.n.b.d.d.q0

                /* JADX INFO: renamed from: f */
                public final BinderC2405l0 f11139f;

                /* JADX INFO: renamed from: g */
                public final int f11140g;

                {
                    this.f11139f = this;
                    this.f11140g = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BinderC2405l0 binderC2405l0 = this.f11139f;
                    binderC2405l0.f11083f.f10977G.mo4956b(this.f11140g);
                }
            });
        }
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: Y */
    public final void mo4975Y(final int i) {
        this.f11083f.f10980n.post(new Runnable(this, i) { // from class: c.n.b.d.d.m0

            /* JADX INFO: renamed from: f */
            public final BinderC2405l0 f11091f;

            /* JADX INFO: renamed from: g */
            public final int f11092g;

            {
                this.f11091f = this;
                this.f11092g = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BinderC2405l0 binderC2405l0 = this.f11091f;
                int i2 = this.f11092g;
                C2372a0 c2372a0 = binderC2405l0.f11083f;
                c2372a0.f10981o = 3;
                Iterator<C2418p1> it = c2372a0.f10978H.iterator();
                while (it.hasNext()) {
                    it.next().mo4992b(i2);
                }
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: Z3 */
    public final void mo4976Z3(String str, byte[] bArr) {
        C2372a0.f10968j.m5119a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: d0 */
    public final void mo4977d0(int i) {
        C2372a0 c2372a0 = this.f11083f;
        C2518b c2518b = C2372a0.f10968j;
        c2372a0.m4947j(i);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: h1 */
    public final void mo4978h1(String str, double d, boolean z) {
        C2372a0.f10968j.m5119a("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: k6 */
    public final void mo4979k6(String str, long j2) {
        C2372a0.m4940f(this.f11083f, j2, 0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: l0 */
    public final void mo4980l0(C2380d c2380d, String str, String str2, boolean z) {
        C2372a0 c2372a0 = this.f11083f;
        c2372a0.f10989w = c2380d;
        c2372a0.f10990x = str;
        C2519b0 c2519b0 = new C2519b0(new Status(0), c2380d, str, str2, z);
        synchronized (c2372a0.f10987u) {
            C4782j<C2383e.a> c4782j = c2372a0.f10984r;
            if (c4782j != null) {
                c4782j.f24683a.m10944q(c2519b0);
            }
            c2372a0.f10984r = null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: n3 */
    public final void mo4981n3(final C2550u c2550u) {
        this.f11083f.f10980n.post(new Runnable(this, c2550u) { // from class: c.n.b.d.d.s0

            /* JADX INFO: renamed from: f */
            public final BinderC2405l0 f11478f;

            /* JADX INFO: renamed from: g */
            public final C2550u f11479g;

            {
                this.f11478f = this;
                this.f11479g = c2550u;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                BinderC2405l0 binderC2405l0 = this.f11478f;
                C2550u c2550u2 = this.f11479g;
                C2372a0 c2372a0 = binderC2405l0.f11083f;
                C2518b c2518b = C2372a0.f10968j;
                Objects.requireNonNull(c2372a0);
                String str = c2550u2.f11467f;
                if (C2516a.m5114d(str, c2372a0.f10990x)) {
                    z = false;
                } else {
                    c2372a0.f10990x = str;
                    z = true;
                }
                C2372a0.f10968j.m5119a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(c2372a0.f10983q));
                C2383e.c cVar = c2372a0.f10977G;
                if (cVar != null && (z || c2372a0.f10983q)) {
                    cVar.mo4958d();
                }
                c2372a0.f10983q = false;
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: x0 */
    public final void mo4982x0(int i) {
        C2372a0.m4941h(this.f11083f, i);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: y */
    public final void mo4983y(final int i) {
        this.f11083f.f10980n.post(new Runnable(this, i) { // from class: c.n.b.d.d.o0

            /* JADX INFO: renamed from: f */
            public final BinderC2405l0 f11129f;

            /* JADX INFO: renamed from: g */
            public final int f11130g;

            {
                this.f11129f = this;
                this.f11130g = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BinderC2405l0 binderC2405l0 = this.f11129f;
                int i2 = this.f11130g;
                if (i2 != 0) {
                    C2372a0 c2372a0 = binderC2405l0.f11083f;
                    c2372a0.f10981o = 1;
                    Iterator<C2418p1> it = c2372a0.f10978H.iterator();
                    while (it.hasNext()) {
                        it.next().mo4993c(i2);
                    }
                    binderC2405l0.f11083f.m4948l();
                    return;
                }
                C2372a0 c2372a1 = binderC2405l0.f11083f;
                c2372a1.f10981o = 2;
                c2372a1.f10982p = true;
                c2372a1.f10983q = true;
                Iterator<C2418p1> it2 = c2372a1.f10978H.iterator();
                while (it2.hasNext()) {
                    it2.next().mo4991a();
                }
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2527f
    /* JADX INFO: renamed from: z2 */
    public final void mo4984z2(String str, long j2, int i) {
        C2372a0.m4940f(this.f11083f, j2, i);
    }
}
