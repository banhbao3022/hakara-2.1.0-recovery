package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class z01 implements kx0<dl0, InterfaceC3249lf, yy0> {

    /* JADX INFO: renamed from: a */
    public final Context f22145a;

    /* JADX INFO: renamed from: b */
    public final hl0 f22146b;

    public z01(Context context, hl0 hl0Var) {
        this.f22145a = context;
        this.f22146b = hl0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: a */
    public final dl0 mo5897a(di1 di1Var, rh1 rh1Var, ex0 ex0Var) throws mi1, s01 {
        iz0 iz0Var = new iz0(rh1Var, (InterfaceC3249lf) ex0Var.f13744b, true);
        el0 el0VarMo7142c = this.f22146b.mo7142c(new c30(di1Var, rh1Var, ex0Var.f13743a), new fl0(iz0Var));
        iz0Var.f15426d = el0VarMo7142c.mo7408d();
        ((yy0) ex0Var.f13745c).m8838G6(el0VarMo7142c.mo6643n());
        return el0VarMo7142c.mo6637h();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: b */
    public final void mo5898b(di1 di1Var, rh1 rh1Var, ex0<InterfaceC3249lf, yy0> ex0Var) throws mi1 {
        try {
            ex0Var.f13744b.mo7338z0(rh1Var.f18796T);
            if (di1Var.f13280a.f22289a.f15202o.f21885a == 3) {
                ex0Var.f13744b.mo7328Y0(rh1Var.f18791O, rh1Var.f18830u.toString(), di1Var.f13280a.f22289a.f15191d, new BinderC2800b(this.f22145a), new y01(ex0Var), (InterfaceC3618vd) ex0Var.f13745c);
            } else {
                ex0Var.f13744b.mo7337w3(rh1Var.f18791O, rh1Var.f18830u.toString(), di1Var.f13280a.f22289a.f15191d, new BinderC2800b(this.f22145a), new y01(ex0Var), (InterfaceC3618vd) ex0Var.f13745c);
            }
        } catch (RemoteException e) {
            C2096e.m4554C("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
