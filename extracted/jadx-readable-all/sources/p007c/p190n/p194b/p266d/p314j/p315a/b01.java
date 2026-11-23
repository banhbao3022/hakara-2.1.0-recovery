package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class b01 implements kx0<wf0, InterfaceC3249lf, yy0> {

    /* JADX INFO: renamed from: a */
    public final Context f12498a;

    /* JADX INFO: renamed from: b */
    public final qe0 f12499b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2952de f12500c;

    /* JADX INFO: renamed from: d */
    public final C3702xn f12501d;

    public b01(Context context, qe0 qe0Var, C3702xn c3702xn) {
        this.f12498a = context;
        this.f12499b = qe0Var;
        this.f12501d = c3702xn;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ wf0 mo5897a(di1 di1Var, rh1 rh1Var, ex0 ex0Var) throws mi1, s01 {
        if (!di1Var.f13280a.f22289a.f15194g.contains(Integer.toString(6))) {
            throw new s01(2, "Unified must be used for RTB.");
        }
        bg0 bg0VarM5991l = bg0.m5991l(this.f12500c);
        if (!di1Var.f13280a.f22289a.f15194g.contains(Integer.toString(bg0VarM5991l.m6008r()))) {
            throw new s01(1, "No corresponding native ad listener");
        }
        dg0 dg0VarMo7940d = this.f12499b.mo7940d(new c30(di1Var, rh1Var, ex0Var.f13743a), new ng0(bg0VarM5991l), new bi0(null, null, this.f12500c, null));
        ((yy0) ex0Var.f13745c).m8838G6(dg0VarMo7940d.mo7411g());
        return dg0VarMo7940d.mo6798h();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: b */
    public final void mo5898b(di1 di1Var, rh1 rh1Var, ex0<InterfaceC3249lf, yy0> ex0Var) throws mi1 {
        try {
            ex0Var.f13744b.mo7338z0(rh1Var.f18796T);
            if (this.f12501d.f21617h < ((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14293X0)).intValue()) {
                ex0Var.f13744b.mo7325B2(rh1Var.f18791O, rh1Var.f18830u.toString(), di1Var.f13280a.f22289a.f15191d, new BinderC2800b(this.f12498a), new a01(this, ex0Var), (InterfaceC3618vd) ex0Var.f13745c);
            } else {
                ex0Var.f13744b.mo7336v6(rh1Var.f18791O, rh1Var.f18830u.toString(), di1Var.f13280a.f22289a.f15191d, new BinderC2800b(this.f12498a), new a01(this, ex0Var), (InterfaceC3618vd) ex0Var.f13745c, di1Var.f13280a.f22289a.f15196i);
            }
        } catch (RemoteException e) {
            throw new mi1(e);
        }
    }
}
