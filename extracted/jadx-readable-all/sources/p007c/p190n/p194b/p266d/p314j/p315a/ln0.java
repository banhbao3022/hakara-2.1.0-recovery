package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ln0 implements z80, u70, l60, a70, uv2, da0 {

    /* JADX INFO: renamed from: f */
    public final as2 f16405f;

    /* JADX INFO: renamed from: g */
    public boolean f16406g = false;

    public ln0(as2 as2Var, qf1 qf1Var) {
        this.f16405f = as2Var;
        as2Var.m5845a(bs2.AD_REQUEST);
        if (qf1Var != null) {
            as2Var.m5845a(bs2.REQUEST_IS_PREFETCH);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.da0
    /* JADX INFO: renamed from: F0 */
    public final void mo5942F0(boolean z) {
        this.f16405f.m5845a(z ? bs2.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED : bs2.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z80
    /* JADX INFO: renamed from: Q */
    public final void mo6214Q(final di1 di1Var) {
        this.f16405f.m5846b(new zr2(di1Var) { // from class: c.n.b.d.j.a.hn0

            /* JADX INFO: renamed from: a */
            public final di1 f14917a;

            {
                this.f14917a = di1Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.zr2
            /* JADX INFO: renamed from: a */
            public final void mo6684a(mt2 mt2Var) {
                di1 di1Var2 = this.f14917a;
                hs2 hs2VarM6965q = mt2Var.m7732s().m6965q();
                at2 at2VarM6965q = mt2Var.m7732s().m7302v().m6965q();
                String str = di1Var2.f13281b.f12695b.f20318b;
                if (at2VarM6965q.f13191h) {
                    at2VarM6965q.m6298m();
                    at2VarM6965q.f13191h = false;
                }
                bt2.m6098y((bt2) at2VarM6965q.f13190g, str);
                if (hs2VarM6965q.f13191h) {
                    hs2VarM6965q.m6298m();
                    hs2VarM6965q.f13191h = false;
                }
                is2.m7298A((is2) hs2VarM6965q.f13190g, at2VarM6965q.m6300o());
                mt2Var.m7733t(hs2VarM6965q);
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.da0
    /* JADX INFO: renamed from: Z */
    public final void mo5943Z(final ts2 ts2Var) {
        this.f16405f.m5846b(new zr2(ts2Var) { // from class: c.n.b.d.j.a.in0

            /* JADX INFO: renamed from: a */
            public final ts2 f15326a;

            {
                this.f15326a = ts2Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.zr2
            /* JADX INFO: renamed from: a */
            public final void mo6684a(mt2 mt2Var) {
                mt2Var.m7734v(this.f15326a);
            }
        });
        this.f16405f.m5845a(bs2.REQUEST_LOADED_FROM_CACHE);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u70
    /* JADX INFO: renamed from: a0 */
    public final void mo5730a0() {
        this.f16405f.m5845a(bs2.AD_LOADED);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.da0
    /* JADX INFO: renamed from: c0 */
    public final void mo5944c0(final ts2 ts2Var) {
        this.f16405f.m5846b(new zr2(ts2Var) { // from class: c.n.b.d.j.a.kn0

            /* JADX INFO: renamed from: a */
            public final ts2 f15994a;

            {
                this.f15994a = ts2Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.zr2
            /* JADX INFO: renamed from: a */
            public final void mo6684a(mt2 mt2Var) {
                mt2Var.m7734v(this.f15994a);
            }
        });
        this.f16405f.m5845a(bs2.REQUEST_PREFETCH_INTERCEPTED);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.da0
    /* JADX INFO: renamed from: d */
    public final void mo5945d(boolean z) {
        this.f16405f.m5845a(z ? bs2.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED : bs2.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a70
    /* JADX INFO: renamed from: i */
    public final synchronized void mo5699i() {
        this.f16405f.m5845a(bs2.AD_IMPRESSION);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.uv2
    /* JADX INFO: renamed from: i0 */
    public final synchronized void mo2739i0() {
        if (this.f16406g) {
            this.f16405f.m5845a(bs2.AD_SUBSEQUENT_CLICK);
        } else {
            this.f16405f.m5845a(bs2.AD_FIRST_CLICK);
            this.f16406g = true;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z80
    /* JADX INFO: renamed from: m */
    public final void mo6215m(C3437qi c3437qi) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.da0
    /* JADX INFO: renamed from: m0 */
    public final void mo5946m0(final ts2 ts2Var) {
        this.f16405f.m5846b(new zr2(ts2Var) { // from class: c.n.b.d.j.a.jn0

            /* JADX INFO: renamed from: a */
            public final ts2 f15666a;

            {
                this.f15666a = ts2Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.zr2
            /* JADX INFO: renamed from: a */
            public final void mo6684a(mt2 mt2Var) {
                mt2Var.m7734v(this.f15666a);
            }
        });
        this.f16405f.m5845a(bs2.REQUEST_SAVED_TO_CACHE);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.da0
    /* JADX INFO: renamed from: n */
    public final void mo5947n() {
        this.f16405f.m5845a(bs2.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.l60
    /* JADX INFO: renamed from: o0 */
    public final void mo6216o0(yv2 yv2Var) {
        switch (yv2Var.f22116f) {
            case 1:
                this.f16405f.m5845a(bs2.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                break;
            case 2:
                this.f16405f.m5845a(bs2.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                break;
            case 3:
                this.f16405f.m5845a(bs2.AD_FAILED_TO_LOAD_NO_FILL);
                break;
            case 4:
                this.f16405f.m5845a(bs2.AD_FAILED_TO_LOAD_TIMEOUT);
                break;
            case 5:
                this.f16405f.m5845a(bs2.AD_FAILED_TO_LOAD_CANCELLED);
                break;
            case 6:
                this.f16405f.m5845a(bs2.AD_FAILED_TO_LOAD_NO_ERROR);
                break;
            case 7:
                this.f16405f.m5845a(bs2.AD_FAILED_TO_LOAD_NOT_FOUND);
                break;
            default:
                this.f16405f.m5845a(bs2.AD_FAILED_TO_LOAD);
                break;
        }
    }
}
