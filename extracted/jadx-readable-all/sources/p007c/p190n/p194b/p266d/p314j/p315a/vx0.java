package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vx0 implements bx0<C3788zz> {

    /* JADX INFO: renamed from: a */
    public final AbstractC3565tz f20957a;

    /* JADX INFO: renamed from: b */
    public final Context f20958b;

    /* JADX INFO: renamed from: c */
    public final yl0 f20959c;

    /* JADX INFO: renamed from: d */
    public final Executor f20960d;

    public vx0(AbstractC3565tz abstractC3565tz, Context context, Executor executor, yl0 yl0Var) {
        this.f20958b = context;
        this.f20957a = abstractC3565tz;
        this.f20960d = executor;
        this.f20959c = yl0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: a */
    public final kv1<C3788zz> mo6115a(final di1 di1Var, final rh1 rh1Var) {
        return cw0.m6249s(cw0.m6231a(null), new qu1(this, di1Var, rh1Var) { // from class: c.n.b.d.j.a.sx0

            /* JADX INFO: renamed from: a */
            public final vx0 f19730a;

            /* JADX INFO: renamed from: b */
            public final di1 f19731b;

            /* JADX INFO: renamed from: c */
            public final rh1 f19732c;

            {
                this.f19730a = this;
                this.f19731b = di1Var;
                this.f19732c = rh1Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) throws C3781zs {
                vx0 vx0Var = this.f19730a;
                di1 di1Var2 = this.f19731b;
                rh1 rh1Var2 = this.f19732c;
                jw2 jw2VarM5279L1 = C2622l.m5279L1(vx0Var.f20958b, rh1Var2.f18829t);
                final InterfaceC3410ps interfaceC3410psM8802a = vx0Var.f20959c.m8802a(jw2VarM5279L1, rh1Var2, di1Var2.f13281b.f12695b);
                final AbstractC3343nz abstractC3343nzMo8463c = vx0Var.f20957a.mo8463c(new c30(di1Var2, rh1Var2, null), new C3380oz((View) interfaceC3410psM8802a, interfaceC3410psM8802a, C2622l.m5407n2(jw2VarM5279L1), rh1Var2.f18797U, rh1Var2.f18801Y, rh1Var2.f18786J));
                abstractC3343nzMo8463c.mo7949i().m8741a(interfaceC3410psM8802a, false, null);
                y60 y60VarMo7408d = abstractC3343nzMo8463c.mo7408d();
                a70 a70Var = new a70(interfaceC3410psM8802a) { // from class: c.n.b.d.j.a.tx0

                    /* JADX INFO: renamed from: f */
                    public final InterfaceC3410ps f20177f;

                    {
                        this.f20177f = interfaceC3410psM8802a;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a70
                    /* JADX INFO: renamed from: i */
                    public final void mo5699i() {
                        InterfaceC3410ps interfaceC3410ps = this.f20177f;
                        if (interfaceC3410ps.mo6459O0() != null) {
                            ((C3670ws) interfaceC3410ps.mo6459O0()).m8683n();
                        }
                    }
                };
                lv1 lv1Var = C2962do.f13335f;
                y60VarMo7408d.m7109u0(a70Var, lv1Var);
                abstractC3343nzMo8463c.mo7949i();
                wh1 wh1Var = rh1Var2.f18827r;
                return cw0.m6250t(xl0.m8740b(interfaceC3410psM8802a, wh1Var.f21126b, wh1Var.f21125a), new cs1(abstractC3343nzMo8463c) { // from class: c.n.b.d.j.a.ux0

                    /* JADX INFO: renamed from: a */
                    public final AbstractC3343nz f20670a;

                    {
                        this.f20670a = abstractC3343nzMo8463c;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
                    public final Object apply(Object obj2) {
                        return this.f20670a.mo7948h();
                    }
                }, lv1Var);
            }
        }, this.f20960d);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: b */
    public final boolean mo6116b(di1 di1Var, rh1 rh1Var) {
        wh1 wh1Var = rh1Var.f18827r;
        return (wh1Var == null || wh1Var.f21125a == null) ? false : true;
    }
}
