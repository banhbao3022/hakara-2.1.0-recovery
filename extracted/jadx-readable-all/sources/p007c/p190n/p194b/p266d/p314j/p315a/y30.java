package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class y30 implements u70, uv2, z80, a70, i60, da0 {

    /* JADX INFO: renamed from: f */
    public final InterfaceC2782b f21737f;

    /* JADX INFO: renamed from: g */
    public final C3775zm f21738g;

    public y30(InterfaceC2782b interfaceC2782b, C3775zm c3775zm) {
        this.f21737f = interfaceC2782b;
        this.f21738g = c3775zm;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.da0
    /* JADX INFO: renamed from: F0 */
    public final void mo5942F0(boolean z) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z80
    /* JADX INFO: renamed from: Q */
    public final void mo6214Q(di1 di1Var) {
        C3775zm c3775zm = this.f21738g;
        long jMo5621a = this.f21737f.mo5621a();
        synchronized (c3775zm.f22338d) {
            c3775zm.f22345k = jMo5621a;
            if (jMo5621a != -1) {
                c3775zm.f22336b.m7283a(c3775zm);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.da0
    /* JADX INFO: renamed from: Z */
    public final void mo5943Z(ts2 ts2Var) {
        C3775zm c3775zm = this.f21738g;
        synchronized (c3775zm.f22338d) {
            c3775zm.f22336b.m7284b();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8776a(ew2 ew2Var) {
        C3775zm c3775zm = this.f21738g;
        synchronized (c3775zm.f22338d) {
            long jMo5621a = c3775zm.f22335a.mo5621a();
            c3775zm.f22344j = jMo5621a;
            C3146in c3146in = c3775zm.f22336b;
            synchronized (c3146in.f15319a) {
                c3146in.f15322d.m6842a(ew2Var, jMo5621a);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u70
    /* JADX INFO: renamed from: a0 */
    public final void mo5730a0() {
        C3775zm c3775zm = this.f21738g;
        synchronized (c3775zm.f22338d) {
            if (c3775zm.f22345k != -1) {
                c3775zm.f22342h = c3775zm.f22335a.mo5621a();
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: b */
    public final void mo6969b() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: c */
    public final void mo6970c() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.da0
    /* JADX INFO: renamed from: c0 */
    public final void mo5944c0(ts2 ts2Var) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.da0
    /* JADX INFO: renamed from: d */
    public final void mo5945d(boolean z) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: e */
    public final void mo6972e() {
        C3775zm c3775zm = this.f21738g;
        synchronized (c3775zm.f22338d) {
            if (c3775zm.f22345k != -1 && !c3775zm.f22337c.isEmpty()) {
                C3738ym last = c3775zm.f22337c.getLast();
                if (last.f21917b == -1) {
                    last.f21917b = last.f21918c.f22335a.mo5621a();
                    c3775zm.f22336b.m7283a(c3775zm);
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: f */
    public final void mo6973f() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: g */
    public final void mo6974g() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a70
    /* JADX INFO: renamed from: i */
    public final void mo5699i() {
        C3775zm c3775zm = this.f21738g;
        synchronized (c3775zm.f22338d) {
            if (c3775zm.f22345k != -1 && c3775zm.f22341g == -1) {
                c3775zm.f22341g = c3775zm.f22335a.mo5621a();
                c3775zm.f22336b.m7283a(c3775zm);
            }
            C3146in c3146in = c3775zm.f22336b;
            synchronized (c3146in.f15319a) {
                C3035fn c3035fn = c3146in.f15322d;
                synchronized (c3035fn.f14071f) {
                    c3035fn.f14075j++;
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.uv2
    /* JADX INFO: renamed from: i0 */
    public final void mo2739i0() {
        C3775zm c3775zm = this.f21738g;
        synchronized (c3775zm.f22338d) {
            if (c3775zm.f22345k != -1) {
                C3738ym c3738ym = new C3738ym(c3775zm);
                c3738ym.f21916a = c3738ym.f21918c.f22335a.mo5621a();
                c3775zm.f22337c.add(c3738ym);
                c3775zm.f22343i++;
                C3146in c3146in = c3775zm.f22336b;
                synchronized (c3146in.f15319a) {
                    C3035fn c3035fn = c3146in.f15322d;
                    synchronized (c3035fn.f14071f) {
                        c3035fn.f14074i++;
                    }
                }
                c3775zm.f22336b.m7283a(c3775zm);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: j */
    public final void mo6975j(InterfaceC3068gj interfaceC3068gj, String str, String str2) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z80
    /* JADX INFO: renamed from: m */
    public final void mo6215m(C3437qi c3437qi) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.da0
    /* JADX INFO: renamed from: m0 */
    public final void mo5946m0(ts2 ts2Var) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.da0
    /* JADX INFO: renamed from: n */
    public final void mo5947n() {
    }
}
