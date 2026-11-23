package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nz0 implements kx0<yc0, InterfaceC3249lf, yy0> {

    /* JADX INFO: renamed from: a */
    public final Context f17475a;

    /* JADX INFO: renamed from: b */
    public final ud0 f17476b;

    public nz0(Context context, ud0 ud0Var) {
        this.f17475a = context;
        this.f17476b = ud0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: a */
    public final yc0 mo5897a(di1 di1Var, rh1 rh1Var, ex0 ex0Var) throws mi1, s01 {
        iz0 iz0Var = new iz0(rh1Var, (InterfaceC3249lf) ex0Var.f13744b, false);
        zc0 zc0VarMo7564c = this.f17476b.mo7564c(new c30(di1Var, rh1Var, ex0Var.f13743a), new cd0(iz0Var, null));
        iz0Var.f15426d = zc0VarMo7564c.mo7408d();
        ((yy0) ex0Var.f13745c).m8838G6(zc0VarMo7564c.mo7411g());
        return zc0VarMo7564c.mo7412h();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: b */
    public final void mo5898b(di1 di1Var, rh1 rh1Var, ex0<InterfaceC3249lf, yy0> ex0Var) throws mi1 {
        try {
            ex0Var.f13744b.mo7338z0(rh1Var.f18796T);
            ex0Var.f13744b.mo7330e5(rh1Var.f18791O, rh1Var.f18830u.toString(), di1Var.f13280a.f22289a.f15191d, new BinderC2800b(this.f17475a), new mz0(ex0Var), (InterfaceC3618vd) ex0Var.f13745c);
        } catch (RemoteException e) {
            throw new mi1(e);
        }
    }
}
