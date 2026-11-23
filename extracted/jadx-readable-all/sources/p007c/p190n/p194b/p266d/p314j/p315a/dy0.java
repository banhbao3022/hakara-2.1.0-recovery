package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2277l;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dy0 implements bx0<n00> {

    /* JADX INFO: renamed from: a */
    public final k10 f13425a;

    /* JADX INFO: renamed from: b */
    public final Context f13426b;

    /* JADX INFO: renamed from: c */
    public final yl0 f13427c;

    /* JADX INFO: renamed from: d */
    public final ii1 f13428d;

    /* JADX INFO: renamed from: e */
    public final Executor f13429e;

    /* JADX INFO: renamed from: f */
    public final cs1<rh1, C2277l> f13430f;

    public dy0(k10 k10Var, Context context, Executor executor, yl0 yl0Var, ii1 ii1Var, cs1<rh1, C2277l> cs1Var) {
        this.f13426b = context;
        this.f13425a = k10Var;
        this.f13429e = executor;
        this.f13427c = yl0Var;
        this.f13428d = ii1Var;
        this.f13430f = cs1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: a */
    public final kv1<n00> mo6115a(final di1 di1Var, final rh1 rh1Var) {
        return cw0.m6249s(cw0.m6231a(null), new qu1(this, di1Var, rh1Var) { // from class: c.n.b.d.j.a.xx0

            /* JADX INFO: renamed from: a */
            public final dy0 f21711a;

            /* JADX INFO: renamed from: b */
            public final di1 f21712b;

            /* JADX INFO: renamed from: c */
            public final rh1 f21713c;

            {
                this.f21711a = this;
                this.f21712b = di1Var;
                this.f21713c = rh1Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) throws C3781zs {
                View bm0Var;
                dy0 dy0Var = this.f21711a;
                di1 di1Var2 = this.f21712b;
                rh1 rh1Var2 = this.f21713c;
                jw2 jw2VarM5279L1 = C2622l.m5279L1(dy0Var.f13426b, rh1Var2.f18829t);
                final InterfaceC3410ps interfaceC3410psM8802a = dy0Var.f13427c.m8802a(jw2VarM5279L1, rh1Var2, di1Var2.f13281b.f12695b);
                ((C2967dt) interfaceC3410psM8802a).f13378f.mo6444H(rh1Var2.f18793Q);
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14154A4)).booleanValue() && rh1Var2.f18806b0) {
                    bm0Var = b20.m5917a(dy0Var.f13426b, (View) interfaceC3410psM8802a, rh1Var2);
                } else {
                    bm0Var = new bm0(dy0Var.f13426b, (View) interfaceC3410psM8802a, dy0Var.f13430f.apply(rh1Var2));
                }
                o00 o00VarMo5865c = dy0Var.f13425a.mo5865c(new c30(di1Var2, rh1Var2, null), new u00(bm0Var, interfaceC3410psM8802a, new k20(interfaceC3410psM8802a) { // from class: c.n.b.d.j.a.yx0

                    /* JADX INFO: renamed from: a */
                    public final InterfaceC3410ps f22132a;

                    {
                        this.f22132a = interfaceC3410psM8802a;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.k20
                    public final InterfaceC3087h1 zza() {
                        return this.f22132a.mo6480g();
                    }
                }, C2622l.m5407n2(jw2VarM5279L1)));
                o00VarMo5865c.mo7951i().m8741a(interfaceC3410psM8802a, false, null);
                y60 y60VarMo7408d = o00VarMo5865c.mo7408d();
                a70 a70Var = new a70(interfaceC3410psM8802a) { // from class: c.n.b.d.j.a.zx0

                    /* JADX INFO: renamed from: f */
                    public final InterfaceC3410ps f22434f;

                    {
                        this.f22434f = interfaceC3410psM8802a;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a70
                    /* JADX INFO: renamed from: i */
                    public final void mo5699i() {
                        InterfaceC3410ps interfaceC3410ps = this.f22434f;
                        if (interfaceC3410ps.mo6459O0() != null) {
                            ((C3670ws) interfaceC3410ps.mo6459O0()).m8683n();
                        }
                    }
                };
                lv1 lv1Var = C2962do.f13335f;
                y60VarMo7408d.m7109u0(a70Var, lv1Var);
                o00VarMo5865c.mo7951i();
                wh1 wh1Var = rh1Var2.f18827r;
                kv1<?> kv1VarM8740b = xl0.m8740b(interfaceC3410psM8802a, wh1Var.f21126b, wh1Var.f21125a);
                if (rh1Var2.f18784H) {
                    ((C3147io) kv1VarM8740b).f15328f.mo6230f(new Runnable(interfaceC3410psM8802a) { // from class: c.n.b.d.j.a.ay0

                        /* JADX INFO: renamed from: f */
                        public final InterfaceC3410ps f12483f;

                        {
                            this.f12483f = interfaceC3410psM8802a;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12483f.mo6509v0();
                        }
                    }, dy0Var.f13429e);
                }
                ((C3147io) kv1VarM8740b).f15328f.mo6230f(new Runnable(dy0Var, interfaceC3410psM8802a) { // from class: c.n.b.d.j.a.by0

                    /* JADX INFO: renamed from: f */
                    public final dy0 f12894f;

                    /* JADX INFO: renamed from: g */
                    public final InterfaceC3410ps f12895g;

                    {
                        this.f12894f = dy0Var;
                        this.f12895g = interfaceC3410psM8802a;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dy0 dy0Var2 = this.f12894f;
                        InterfaceC3410ps interfaceC3410ps = this.f12895g;
                        Objects.requireNonNull(dy0Var2);
                        interfaceC3410ps.mo6465U();
                        BinderC3263lt binderC3263ltMo6480g = interfaceC3410ps.mo6480g();
                        C3310n2 c3310n2 = dy0Var2.f13428d.f15188a;
                        if (c3310n2 == null || binderC3263ltMo6480g == null) {
                            return;
                        }
                        binderC3263ltMo6480g.m7613G6(c3310n2);
                    }
                }, dy0Var.f13429e);
                return cw0.m6250t(kv1VarM8740b, new cs1(o00VarMo5865c) { // from class: c.n.b.d.j.a.cy0

                    /* JADX INFO: renamed from: a */
                    public final o00 f13151a;

                    {
                        this.f13151a = o00VarMo5865c;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
                    public final Object apply(Object obj2) {
                        return this.f13151a.mo7950h();
                    }
                }, lv1Var);
            }
        }, this.f13429e);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: b */
    public final boolean mo6116b(di1 di1Var, rh1 rh1Var) {
        wh1 wh1Var = rh1Var.f18827r;
        return (wh1Var == null || wh1Var.f21125a == null) ? false : true;
    }
}
