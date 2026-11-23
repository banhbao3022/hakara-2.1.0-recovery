package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xf1 implements dv1<yc0> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w41 f21519a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ud0 f21520b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yf1 f21521c;

    public xf1(yf1 yf1Var, w41 w41Var, ud0 ud0Var) {
        this.f21521c = yf1Var;
        this.f21519a = w41Var;
        this.f21520b = ud0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        final yv2 yv2VarM5274K1 = C2622l.m5274K1(th, this.f21520b.mo7563b().f18187l);
        synchronized (this.f21521c) {
            this.f21521c.f21872h = null;
            this.f21520b.mo7562a().m7108A0(new j60(yv2VarM5274K1));
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14237N4)).booleanValue()) {
                this.f21521c.f21866b.execute(new Runnable(this, yv2VarM5274K1) { // from class: c.n.b.d.j.a.vf1

                    /* JADX INFO: renamed from: f */
                    public final xf1 f20759f;

                    /* JADX INFO: renamed from: g */
                    public final yv2 f20760g;

                    {
                        this.f20759f = this;
                        this.f20760g = yv2VarM5274K1;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        xf1 xf1Var = this.f20759f;
                        xf1Var.f21521c.f21868d.mo6216o0(this.f20760g);
                    }
                });
                this.f21521c.f21866b.execute(new Runnable(this, yv2VarM5274K1) { // from class: c.n.b.d.j.a.wf1

                    /* JADX INFO: renamed from: f */
                    public final xf1 f21069f;

                    /* JADX INFO: renamed from: g */
                    public final yv2 f21070g;

                    {
                        this.f21069f = this;
                        this.f21070g = yv2VarM5274K1;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        xf1 xf1Var = this.f21069f;
                        xf1Var.f21521c.f21869e.mo6216o0(this.f21070g);
                    }
                });
            }
            cw0.m6233c(yv2VarM5274K1.f22116f, th, "InterstitialAdLoader.onFailure");
            this.f21519a.zza();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final void mo4617b(yc0 yc0Var) {
        yc0 yc0Var2 = yc0Var;
        synchronized (this.f21521c) {
            this.f21521c.f21872h = null;
            AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14237N4;
            C2862b c2862b = C2862b.f12493a;
            if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                e90 e90Var = yc0Var2.f16670g.f14516f;
                yf1 yf1Var = this.f21521c;
                h41 h41Var = yf1Var.f21868d;
                g90 g90Var = e90Var.f13530a;
                g90Var.f14517g = h41Var;
                g90Var.f14520j = yf1Var.f21869e;
            }
            this.f21519a.mo5986b(yc0Var2);
            if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                this.f21521c.f21866b.execute(new Runnable(this) { // from class: c.n.b.d.j.a.tf1

                    /* JADX INFO: renamed from: f */
                    public final xf1 f19826f;

                    {
                        this.f19826f = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19826f.f21521c.f21868d.mo5730a0();
                    }
                });
                this.f21521c.f21866b.execute(new Runnable(this) { // from class: c.n.b.d.j.a.uf1

                    /* JADX INFO: renamed from: f */
                    public final xf1 f20302f;

                    {
                        this.f20302f = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20302f.f21521c.f21869e.mo5730a0();
                    }
                });
            }
        }
    }
}
