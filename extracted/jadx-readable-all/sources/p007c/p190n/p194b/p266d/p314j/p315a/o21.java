package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class o21<AdT> implements bx0<AdT> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3719y3 f17505a;

    /* JADX INFO: renamed from: b */
    public final lv1 f17506b;

    /* JADX INFO: renamed from: c */
    public final yl1 f17507c;

    /* JADX INFO: renamed from: d */
    public final x21 f17508d;

    /* JADX WARN: Multi-variable type inference failed */
    public o21(yl1 yl1Var, yl1 yl1Var2, lv1 lv1Var, InterfaceC3719y3 interfaceC3719y3, x21 x21Var) {
        this.f17507c = yl1Var;
        this.f17506b = yl1Var2;
        this.f17505a = lv1Var;
        this.f17508d = interfaceC3719y3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: a */
    public final kv1<AdT> mo6115a(di1 di1Var, rh1 rh1Var) {
        C3147io c3147io = new C3147io();
        t21 t21Var = new t21();
        n21 n21Var = new n21(this, c3147io, di1Var, rh1Var, t21Var);
        synchronized (t21Var) {
            t21Var.f19754a = n21Var;
        }
        wh1 wh1Var = rh1Var.f18827r;
        final BinderC3570u3 binderC3570u3 = new BinderC3570u3(t21Var, wh1Var.f21126b, wh1Var.f21125a);
        yl1 yl1Var = this.f17507c;
        ol1 ol1VarM5280L2 = C2622l.m5280L2(new el1(this, binderC3570u3) { // from class: c.n.b.d.j.a.m21

            /* JADX INFO: renamed from: a */
            public final o21 f16672a;

            /* JADX INFO: renamed from: b */
            public final BinderC3570u3 f16673b;

            {
                this.f16672a = this;
                this.f16673b = binderC3570u3;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.el1
            public final void zza() throws RemoteException {
                o21 o21Var = this.f16672a;
                o21Var.f17505a.mo8714n6(this.f16673b);
            }
        }, this.f17506b, rl1.CUSTOM_RENDER_SYN, yl1Var);
        return ol1VarM5280L2.f17674f.m8125a(rl1.CUSTOM_RENDER_ACK, ol1VarM5280L2.m8042f()).m8039c(c3147io).m8042f();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: b */
    public final boolean mo6116b(di1 di1Var, rh1 rh1Var) {
        wh1 wh1Var;
        return (this.f17505a == null || (wh1Var = rh1Var.f18827r) == null || wh1Var.f21125a == null) ? false : true;
    }
}
