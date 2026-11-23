package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ed1 implements dv1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w41 f13558a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fd1 f13559b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f13560c;

    public ed1(gd1 gd1Var, w41 w41Var, fd1 fd1Var) {
        this.f13560c = gd1Var;
        this.f13558a = w41Var;
        this.f13559b = fd1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        InterfaceC3751yz interfaceC3751yz = (InterfaceC3751yz) this.f13560c.f14538e.mo5769b();
        final yv2 yv2VarM5274K1 = interfaceC3751yz == null ? C2622l.m5274K1(th, null) : C2622l.m5274K1(th, interfaceC3751yz.mo7141b().f18187l);
        synchronized (this.f13560c) {
            gd1 gd1Var = this.f13560c;
            gd1Var.f14541h = null;
            if (interfaceC3751yz != null) {
                interfaceC3751yz.mo8328a().m7108A0(new j60(yv2VarM5274K1));
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14231M4)).booleanValue()) {
                    this.f13560c.f14535b.execute(new Runnable(this, yv2VarM5274K1) { // from class: c.n.b.d.j.a.dd1

                        /* JADX INFO: renamed from: f */
                        public final ed1 f13243f;

                        /* JADX INFO: renamed from: g */
                        public final yv2 f13244g;

                        {
                            this.f13243f = this;
                            this.f13244g = yv2VarM5274K1;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ed1 ed1Var = this.f13243f;
                            ed1Var.f13560c.f14537d.mo6216o0(this.f13244g);
                        }
                    });
                }
            } else {
                gd1Var.f14537d.mo6216o0(yv2VarM5274K1);
                ((InterfaceC3751yz) this.f13560c.m6992d(this.f13559b).mo7309d()).mo7141b().f18181f.m7108A0(aa0.f12047a);
            }
            cw0.m6233c(yv2VarM5274K1.f22116f, th, "AppOpenAdLoader.onFailure");
            this.f13558a.zza();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final void mo4617b(Object obj) {
        m20 m20Var = (m20) obj;
        synchronized (this.f13560c) {
            this.f13560c.f14541h = null;
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14231M4)).booleanValue()) {
                m20Var.f16670g.f14516f.f13530a.f14519i = this.f13560c.f14537d;
            }
            this.f13558a.mo5986b(m20Var);
        }
    }
}
