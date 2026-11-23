package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class d51 implements dv1<m20> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w41 f13177a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe0 f13178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e51 f13179c;

    public d51(e51 e51Var, w41 w41Var, qe0 qe0Var) {
        this.f13179c = e51Var;
        this.f13177a = w41Var;
        this.f13178b = qe0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        final yv2 yv2VarM5274K1 = C2622l.m5274K1(th, this.f13178b.mo7937a().f18187l);
        this.f13178b.mo7938b().m7108A0(new j60(yv2VarM5274K1));
        this.f13179c.f13509b.mo7624f().execute(new Runnable(this, yv2VarM5274K1) { // from class: c.n.b.d.j.a.c51

            /* JADX INFO: renamed from: f */
            public final d51 f12938f;

            /* JADX INFO: renamed from: g */
            public final yv2 f12939g;

            {
                this.f12938f = this;
                this.f12939g = yv2VarM5274K1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d51 d51Var = this.f12938f;
                d51Var.f13179c.f13511d.f20216c.mo6216o0(this.f12939g);
            }
        });
        cw0.m6233c(yv2VarM5274K1.f22116f, th, "NativeAdLoader.onFailure");
        this.f13177a.zza();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final void mo4617b(m20 m20Var) {
        m20 m20Var2 = m20Var;
        synchronized (this.f13179c) {
            m20Var2.f16670g.f14516f.f13530a.f14517g = this.f13179c.f13511d.f20215b;
            this.f13177a.mo5986b(m20Var2);
            this.f13179c.f13509b.mo7624f().execute(new Runnable(this) { // from class: c.n.b.d.j.a.b51

                /* JADX INFO: renamed from: f */
                public final d51 f12526f;

                {
                    this.f12526f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f12526f.f13179c.f13511d.f20215b.mo5730a0();
                }
            });
        }
    }
}
