package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gz0 implements bx0<yc0> {

    /* JADX INFO: renamed from: a */
    public final Context f14703a;

    /* JADX INFO: renamed from: b */
    public final yl0 f14704b;

    /* JADX INFO: renamed from: c */
    public final ud0 f14705c;

    /* JADX INFO: renamed from: d */
    public final ii1 f14706d;

    /* JADX INFO: renamed from: e */
    public final Executor f14707e;

    /* JADX INFO: renamed from: f */
    public final C3702xn f14708f;

    /* JADX INFO: renamed from: g */
    public final C3575u8 f14709g;

    /* JADX INFO: renamed from: h */
    public final boolean f14710h = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14393l5)).booleanValue();

    public gz0(Context context, C3702xn c3702xn, ii1 ii1Var, Executor executor, ud0 ud0Var, yl0 yl0Var, C3575u8 c3575u8) {
        this.f14703a = context;
        this.f14706d = ii1Var;
        this.f14705c = ud0Var;
        this.f14707e = executor;
        this.f14708f = c3702xn;
        this.f14704b = yl0Var;
        this.f14709g = c3575u8;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: a */
    public final kv1<yc0> mo6115a(final di1 di1Var, final rh1 rh1Var) {
        final cm0 cm0Var = new cm0();
        kv1<yc0> kv1VarM6249s = cw0.m6249s(cw0.m6231a(null), new qu1(this, rh1Var, di1Var, cm0Var) { // from class: c.n.b.d.j.a.az0

            /* JADX INFO: renamed from: a */
            public final gz0 f12489a;

            /* JADX INFO: renamed from: b */
            public final rh1 f12490b;

            /* JADX INFO: renamed from: c */
            public final di1 f12491c;

            /* JADX INFO: renamed from: d */
            public final cm0 f12492d;

            {
                this.f12489a = this;
                this.f12490b = rh1Var;
                this.f12491c = di1Var;
                this.f12492d = cm0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) throws C3781zs {
                final gz0 gz0Var = this.f12489a;
                final rh1 rh1Var2 = this.f12490b;
                di1 di1Var2 = this.f12491c;
                cm0 cm0Var2 = this.f12492d;
                final InterfaceC3410ps interfaceC3410psM8802a = gz0Var.f14704b.m8802a(gz0Var.f14706d.f15192e, rh1Var2, di1Var2.f13281b.f12695b);
                ((C2967dt) interfaceC3410psM8802a).f13378f.mo6444H(rh1Var2.f18793Q);
                Objects.requireNonNull(cm0Var2);
                C3147io c3147io = new C3147io();
                final zc0 zc0VarMo7564c = gz0Var.f14705c.mo7564c(new c30(di1Var2, rh1Var2, null), new cd0(new ez0(gz0Var.f14703a, gz0Var.f14708f, c3147io, rh1Var2, interfaceC3410psM8802a, gz0Var.f14706d, gz0Var.f14710h, gz0Var.f14709g), interfaceC3410psM8802a));
                c3147io.m7286a(zc0VarMo7564c);
                zc0VarMo7564c.mo7408d().m7109u0(new a70(interfaceC3410psM8802a) { // from class: c.n.b.d.j.a.cz0

                    /* JADX INFO: renamed from: f */
                    public final InterfaceC3410ps f13155f;

                    {
                        this.f13155f = interfaceC3410psM8802a;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a70
                    /* JADX INFO: renamed from: i */
                    public final void mo5699i() {
                        InterfaceC3410ps interfaceC3410ps = this.f13155f;
                        if (interfaceC3410ps.mo6459O0() != null) {
                            ((C3670ws) interfaceC3410ps.mo6459O0()).m8683n();
                        }
                    }
                }, C2962do.f13335f);
                zc0VarMo7564c.mo7415k().m8741a(interfaceC3410psM8802a, true, gz0Var.f14710h ? gz0Var.f14709g : null);
                zc0VarMo7564c.mo7415k();
                wh1 wh1Var = rh1Var2.f18827r;
                return cw0.m6250t(xl0.m8740b(interfaceC3410psM8802a, wh1Var.f21126b, wh1Var.f21125a), new cs1(gz0Var, interfaceC3410psM8802a, rh1Var2, zc0VarMo7564c) { // from class: c.n.b.d.j.a.dz0

                    /* JADX INFO: renamed from: a */
                    public final InterfaceC3410ps f13438a;

                    /* JADX INFO: renamed from: b */
                    public final rh1 f13439b;

                    /* JADX INFO: renamed from: c */
                    public final zc0 f13440c;

                    {
                        this.f13438a = interfaceC3410psM8802a;
                        this.f13439b = rh1Var2;
                        this.f13440c = zc0VarMo7564c;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
                    public final Object apply(Object obj2) {
                        InterfaceC3410ps interfaceC3410ps = this.f13438a;
                        rh1 rh1Var3 = this.f13439b;
                        zc0 zc0Var = this.f13440c;
                        if (rh1Var3.f18784H) {
                            interfaceC3410ps.mo6509v0();
                        }
                        interfaceC3410ps.mo6465U();
                        interfaceC3410ps.onPause();
                        return zc0Var.mo7412h();
                    }
                }, gz0Var.f14707e);
            }
        }, this.f14707e);
        ((du1) kv1VarM6249s).mo6230f(new Runnable(cm0Var) { // from class: c.n.b.d.j.a.bz0

            /* JADX INFO: renamed from: f */
            public final cm0 f12899f;

            {
                this.f12899f = cm0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12899f.m6204a();
            }
        }, this.f14707e);
        return kv1VarM6249s;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: b */
    public final boolean mo6116b(di1 di1Var, rh1 rh1Var) {
        wh1 wh1Var = rh1Var.f18827r;
        return (wh1Var == null || wh1Var.f21125a == null) ? false : true;
    }
}
