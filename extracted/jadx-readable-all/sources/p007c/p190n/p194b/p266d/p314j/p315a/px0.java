package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class px0 implements bx0<h00> {

    /* JADX INFO: renamed from: a */
    public final c00 f18113a;

    /* JADX INFO: renamed from: b */
    public final Context f18114b;

    /* JADX INFO: renamed from: c */
    public final yl0 f18115c;

    /* JADX INFO: renamed from: d */
    public final ii1 f18116d;

    /* JADX INFO: renamed from: e */
    public final Executor f18117e;

    /* JADX INFO: renamed from: f */
    public final C3702xn f18118f;

    /* JADX INFO: renamed from: g */
    public final C3575u8 f18119g;

    /* JADX INFO: renamed from: h */
    public final boolean f18120h = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14393l5)).booleanValue();

    public px0(c00 c00Var, Context context, Executor executor, yl0 yl0Var, ii1 ii1Var, C3702xn c3702xn, C3575u8 c3575u8) {
        this.f18114b = context;
        this.f18113a = c00Var;
        this.f18117e = executor;
        this.f18115c = yl0Var;
        this.f18116d = ii1Var;
        this.f18118f = c3702xn;
        this.f18119g = c3575u8;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: a */
    public final kv1<h00> mo6115a(final di1 di1Var, final rh1 rh1Var) {
        final cm0 cm0Var = new cm0();
        kv1<h00> kv1VarM6249s = cw0.m6249s(cw0.m6231a(null), new qu1(this, rh1Var, di1Var, cm0Var) { // from class: c.n.b.d.j.a.lx0

            /* JADX INFO: renamed from: a */
            public final px0 f16633a;

            /* JADX INFO: renamed from: b */
            public final rh1 f16634b;

            /* JADX INFO: renamed from: c */
            public final di1 f16635c;

            /* JADX INFO: renamed from: d */
            public final cm0 f16636d;

            {
                this.f16633a = this;
                this.f16634b = rh1Var;
                this.f16635c = di1Var;
                this.f16636d = cm0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) throws C3781zs {
                final px0 px0Var = this.f16633a;
                final rh1 rh1Var2 = this.f16634b;
                di1 di1Var2 = this.f16635c;
                cm0 cm0Var2 = this.f16636d;
                final InterfaceC3410ps interfaceC3410psM8802a = px0Var.f18115c.m8802a(px0Var.f18116d.f15192e, rh1Var2, di1Var2.f13281b.f12695b);
                ((C2967dt) interfaceC3410psM8802a).f13378f.mo6444H(rh1Var2.f18793Q);
                Objects.requireNonNull(cm0Var2);
                C3147io c3147io = new C3147io();
                final a00 a00VarMo6140c = px0Var.f18113a.mo6140c(new c30(di1Var2, rh1Var2, null), new cd0(new rx0(px0Var.f18118f, c3147io, rh1Var2, interfaceC3410psM8802a, px0Var.f18116d, px0Var.f18120h, px0Var.f18119g), interfaceC3410psM8802a), new b00(rh1Var2.f18797U));
                a00VarMo6140c.mo5653i().m8741a(interfaceC3410psM8802a, false, px0Var.f18120h ? px0Var.f18119g : null);
                c3147io.m7286a(a00VarMo6140c);
                a00VarMo6140c.mo7408d().m7109u0(new a70(interfaceC3410psM8802a) { // from class: c.n.b.d.j.a.nx0

                    /* JADX INFO: renamed from: f */
                    public final InterfaceC3410ps f17468f;

                    {
                        this.f17468f = interfaceC3410psM8802a;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a70
                    /* JADX INFO: renamed from: i */
                    public final void mo5699i() {
                        InterfaceC3410ps interfaceC3410ps = this.f17468f;
                        if (interfaceC3410ps.mo6459O0() != null) {
                            ((C3670ws) interfaceC3410ps.mo6459O0()).m8683n();
                        }
                    }
                }, C2962do.f13335f);
                a00VarMo6140c.mo5653i();
                wh1 wh1Var = rh1Var2.f18827r;
                return cw0.m6250t(xl0.m8740b(interfaceC3410psM8802a, wh1Var.f21126b, wh1Var.f21125a), new cs1(px0Var, interfaceC3410psM8802a, rh1Var2, a00VarMo6140c) { // from class: c.n.b.d.j.a.ox0

                    /* JADX INFO: renamed from: a */
                    public final InterfaceC3410ps f17779a;

                    /* JADX INFO: renamed from: b */
                    public final rh1 f17780b;

                    /* JADX INFO: renamed from: c */
                    public final a00 f17781c;

                    {
                        this.f17779a = interfaceC3410psM8802a;
                        this.f17780b = rh1Var2;
                        this.f17781c = a00VarMo6140c;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
                    public final Object apply(Object obj2) {
                        InterfaceC3410ps interfaceC3410ps = this.f17779a;
                        rh1 rh1Var3 = this.f17780b;
                        a00 a00Var = this.f17781c;
                        if (rh1Var3.f18784H) {
                            interfaceC3410ps.mo6509v0();
                        }
                        interfaceC3410ps.mo6465U();
                        interfaceC3410ps.onPause();
                        return a00Var.mo5652h();
                    }
                }, px0Var.f18117e);
            }
        }, this.f18117e);
        ((du1) kv1VarM6249s).mo6230f(new Runnable(cm0Var) { // from class: c.n.b.d.j.a.mx0

            /* JADX INFO: renamed from: f */
            public final cm0 f16957f;

            {
                this.f16957f = cm0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f16957f.m6204a();
            }
        }, this.f18117e);
        return kv1VarM6249s;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: b */
    public final boolean mo6116b(di1 di1Var, rh1 rh1Var) {
        wh1 wh1Var = rh1Var.f18827r;
        return (wh1Var == null || wh1Var.f21125a == null) ? false : true;
    }
}
