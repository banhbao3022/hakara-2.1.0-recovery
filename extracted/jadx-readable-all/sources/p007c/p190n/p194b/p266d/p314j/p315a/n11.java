package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class n11 implements bx0<dl0> {

    /* JADX INFO: renamed from: a */
    public final Context f16990a;

    /* JADX INFO: renamed from: b */
    public final yl0 f16991b;

    /* JADX INFO: renamed from: c */
    public final hl0 f16992c;

    /* JADX INFO: renamed from: d */
    public final ii1 f16993d;

    /* JADX INFO: renamed from: e */
    public final Executor f16994e;

    /* JADX INFO: renamed from: f */
    public final C3702xn f16995f;

    /* JADX INFO: renamed from: g */
    public final C3575u8 f16996g;

    /* JADX INFO: renamed from: h */
    public final boolean f16997h = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14393l5)).booleanValue();

    public n11(Context context, C3702xn c3702xn, ii1 ii1Var, Executor executor, hl0 hl0Var, yl0 yl0Var, C3575u8 c3575u8) {
        this.f16990a = context;
        this.f16993d = ii1Var;
        this.f16992c = hl0Var;
        this.f16994e = executor;
        this.f16995f = c3702xn;
        this.f16991b = yl0Var;
        this.f16996g = c3575u8;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: a */
    public final kv1<dl0> mo6115a(final di1 di1Var, final rh1 rh1Var) {
        final cm0 cm0Var = new cm0();
        kv1<dl0> kv1VarM6249s = cw0.m6249s(cw0.m6231a(null), new qu1(this, rh1Var, di1Var, cm0Var) { // from class: c.n.b.d.j.a.g11

            /* JADX INFO: renamed from: a */
            public final n11 f14143a;

            /* JADX INFO: renamed from: b */
            public final rh1 f14144b;

            /* JADX INFO: renamed from: c */
            public final di1 f14145c;

            /* JADX INFO: renamed from: d */
            public final cm0 f14146d;

            {
                this.f14143a = this;
                this.f14144b = rh1Var;
                this.f14145c = di1Var;
                this.f14146d = cm0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) throws C3781zs {
                final n11 n11Var = this.f14143a;
                final rh1 rh1Var2 = this.f14144b;
                di1 di1Var2 = this.f14145c;
                cm0 cm0Var2 = this.f14146d;
                final InterfaceC3410ps interfaceC3410psM8802a = n11Var.f16991b.m8802a(n11Var.f16993d.f15192e, rh1Var2, di1Var2.f13281b.f12695b);
                C2967dt c2967dt = (C2967dt) interfaceC3410psM8802a;
                c2967dt.f13378f.mo6444H(rh1Var2.f18793Q);
                Objects.requireNonNull(cm0Var2);
                C3147io c3147io = new C3147io();
                final el0 el0VarMo7142c = n11Var.f16992c.mo7142c(new c30(di1Var2, rh1Var2, null), new fl0(new m11(n11Var.f16990a, n11Var.f16991b, n11Var.f16993d, n11Var.f16995f, rh1Var2, c3147io, interfaceC3410psM8802a, n11Var.f16996g, n11Var.f16997h), interfaceC3410psM8802a));
                c3147io.m7286a(el0VarMo7142c);
                c2967dt.mo6479f0("/reward", new C3095h9(el0VarMo7142c.mo6640k()));
                el0VarMo7142c.mo7408d().m7109u0(new a70(interfaceC3410psM8802a) { // from class: c.n.b.d.j.a.i11

                    /* JADX INFO: renamed from: f */
                    public final InterfaceC3410ps f15076f;

                    {
                        this.f15076f = interfaceC3410psM8802a;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a70
                    /* JADX INFO: renamed from: i */
                    public final void mo5699i() {
                        InterfaceC3410ps interfaceC3410ps = this.f15076f;
                        if (interfaceC3410ps.mo6459O0() != null) {
                            ((C3670ws) interfaceC3410ps.mo6459O0()).m8683n();
                        }
                    }
                }, C2962do.f13335f);
                el0VarMo7142c.mo6641l().m8741a(interfaceC3410psM8802a, true, n11Var.f16997h ? n11Var.f16996g : null);
                el0VarMo7142c.mo6641l();
                wh1 wh1Var = rh1Var2.f18827r;
                return cw0.m6250t(xl0.m8740b(interfaceC3410psM8802a, wh1Var.f21126b, wh1Var.f21125a), new cs1(n11Var, interfaceC3410psM8802a, rh1Var2, el0VarMo7142c) { // from class: c.n.b.d.j.a.j11

                    /* JADX INFO: renamed from: a */
                    public final InterfaceC3410ps f15438a;

                    /* JADX INFO: renamed from: b */
                    public final rh1 f15439b;

                    /* JADX INFO: renamed from: c */
                    public final el0 f15440c;

                    {
                        this.f15438a = interfaceC3410psM8802a;
                        this.f15439b = rh1Var2;
                        this.f15440c = el0VarMo7142c;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
                    public final Object apply(Object obj2) {
                        InterfaceC3410ps interfaceC3410ps = this.f15438a;
                        rh1 rh1Var3 = this.f15439b;
                        el0 el0Var = this.f15440c;
                        if (rh1Var3.f18784H) {
                            interfaceC3410ps.mo6509v0();
                        }
                        interfaceC3410ps.mo6465U();
                        interfaceC3410ps.onPause();
                        return el0Var.mo6637h();
                    }
                }, n11Var.f16994e);
            }
        }, this.f16994e);
        ((du1) kv1VarM6249s).mo6230f(new Runnable(cm0Var) { // from class: c.n.b.d.j.a.h11

            /* JADX INFO: renamed from: f */
            public final cm0 f14719f;

            {
                this.f14719f = cm0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f14719f.m6204a();
            }
        }, this.f16994e);
        return kv1VarM6249s;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: b */
    public final boolean mo6116b(di1 di1Var, rh1 rh1Var) {
        wh1 wh1Var = rh1Var.f18827r;
        return (wh1Var == null || wh1Var.f21125a == null) ? false : true;
    }
}
