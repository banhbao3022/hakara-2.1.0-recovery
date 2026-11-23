package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class k21 implements bx0<n00> {

    /* JADX INFO: renamed from: a */
    public final Context f15868a;

    /* JADX INFO: renamed from: b */
    public final k10 f15869b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3719y3 f15870c;

    /* JADX INFO: renamed from: d */
    public final lv1 f15871d;

    /* JADX INFO: renamed from: e */
    public final yl1 f15872e;

    public k21(Context context, k10 k10Var, yl1 yl1Var, lv1 lv1Var, InterfaceC3719y3 interfaceC3719y3) {
        this.f15868a = context;
        this.f15869b = k10Var;
        this.f15872e = yl1Var;
        this.f15871d = lv1Var;
        this.f15870c = interfaceC3719y3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: a */
    public final kv1<n00> mo6115a(di1 di1Var, rh1 rh1Var) {
        o00 o00VarMo5865c = this.f15869b.mo5865c(new c30(di1Var, rh1Var, null), new i21(new View(this.f15868a), g21.f14148a, rh1Var.f18829t.get(0)));
        j21 j21VarMo7953k = o00VarMo5865c.mo7953k();
        wh1 wh1Var = rh1Var.f18827r;
        final BinderC3570u3 binderC3570u3 = new BinderC3570u3(j21VarMo7953k, wh1Var.f21126b, wh1Var.f21125a);
        yl1 yl1Var = this.f15872e;
        ol1 ol1VarM5280L2 = C2622l.m5280L2(new el1(this, binderC3570u3) { // from class: c.n.b.d.j.a.h21

            /* JADX INFO: renamed from: a */
            public final k21 f14722a;

            /* JADX INFO: renamed from: b */
            public final BinderC3570u3 f14723b;

            {
                this.f14722a = this;
                this.f14723b = binderC3570u3;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.el1
            public final void zza() throws RemoteException {
                k21 k21Var = this.f14722a;
                k21Var.f15870c.mo8714n6(this.f14723b);
            }
        }, this.f15871d, rl1.CUSTOM_RENDER_SYN, yl1Var);
        return ol1VarM5280L2.f17674f.m8125a(rl1.CUSTOM_RENDER_ACK, ol1VarM5280L2.m8042f()).m8039c(cw0.m6231a(o00VarMo5865c.mo7950h())).m8042f();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: b */
    public final boolean mo6116b(di1 di1Var, rh1 rh1Var) {
        wh1 wh1Var;
        return (this.f15870c == null || (wh1Var = rh1Var.f18827r) == null || wh1Var.f21125a == null) ? false : true;
    }
}
