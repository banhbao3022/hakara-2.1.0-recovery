package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ny0 implements kx0<n00, InterfaceC3249lf, yy0> {

    /* JADX INFO: renamed from: a */
    public final Context f17471a;

    /* JADX INFO: renamed from: b */
    public final k10 f17472b;

    /* JADX INFO: renamed from: c */
    public View f17473c;

    /* JADX INFO: renamed from: d */
    public InterfaceC3692xd f17474d;

    public ny0(Context context, k10 k10Var) {
        this.f17471a = context;
        this.f17472b = k10Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: a */
    public final n00 mo5897a(di1 di1Var, final rh1 rh1Var, final ex0 ex0Var) throws mi1, s01 {
        final View view;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14154A4)).booleanValue() && rh1Var.f18806b0) {
            try {
                view = (View) BinderC2800b.m5639T1(this.f17474d.mo8623c());
                boolean zMo8624d = this.f17474d.mo8624d();
                if (view == null) {
                    throw new mi1(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zMo8624d) {
                    try {
                        view = (View) ((du1) cw0.m6249s(cw0.m6231a(null), new qu1(this, view, rh1Var) { // from class: c.n.b.d.j.a.ly0

                            /* JADX INFO: renamed from: a */
                            public final ny0 f16638a;

                            /* JADX INFO: renamed from: b */
                            public final View f16639b;

                            /* JADX INFO: renamed from: c */
                            public final rh1 f16640c;

                            {
                                this.f16638a = this;
                                this.f16639b = view;
                                this.f16640c = rh1Var;
                            }

                            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                            /* JADX INFO: renamed from: a */
                            public final kv1 mo4612a(Object obj) {
                                ny0 ny0Var = this.f16638a;
                                return cw0.m6231a(b20.m5917a(ny0Var.f17471a, this.f16639b, this.f16640c));
                            }
                        }, C2962do.f13334e)).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new mi1(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new mi1(e2);
            }
        } else {
            view = this.f17473c;
        }
        o00 o00VarMo5865c = this.f17472b.mo5865c(new c30(di1Var, rh1Var, ex0Var.f13743a), new u00(view, null, new k20(ex0Var) { // from class: c.n.b.d.j.a.ky0

            /* JADX INFO: renamed from: a */
            public final ex0 f16233a;

            {
                this.f16233a = ex0Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.k20
            public final InterfaceC3087h1 zza() throws mi1 {
                try {
                    return ((InterfaceC3249lf) this.f16233a.f13744b).mo7332g();
                } catch (RemoteException e3) {
                    throw new mi1(e3);
                }
            }
        }, rh1Var.f18829t.get(0)));
        o00VarMo5865c.mo7952j().m6351B0(view);
        ((yy0) ex0Var.f13745c).m8838G6(o00VarMo5865c.mo7411g());
        return o00VarMo5865c.mo7950h();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: b */
    public final void mo5898b(di1 di1Var, rh1 rh1Var, ex0<InterfaceC3249lf, yy0> ex0Var) throws mi1 {
        try {
            ex0Var.f13744b.mo7338z0(rh1Var.f18796T);
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14154A4)).booleanValue() && rh1Var.f18806b0) {
                ex0Var.f13744b.mo7326L4(rh1Var.f18791O, rh1Var.f18830u.toString(), di1Var.f13280a.f22289a.f15191d, new BinderC2800b(this.f17471a), new my0(this, ex0Var), (InterfaceC3618vd) ex0Var.f13745c, di1Var.f13280a.f22289a.f15192e);
            } else {
                ex0Var.f13744b.mo7333m4(rh1Var.f18791O, rh1Var.f18830u.toString(), di1Var.f13280a.f22289a.f15191d, new BinderC2800b(this.f17471a), new my0(this, ex0Var), (InterfaceC3618vd) ex0Var.f13745c, di1Var.f13280a.f22289a.f15192e);
            }
        } catch (RemoteException e) {
            throw new mi1(e);
        }
    }
}
