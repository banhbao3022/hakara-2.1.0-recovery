package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p267a.C2177g;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2269i0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class iy0 implements kx0<n00, vi1, yy0> {

    /* JADX INFO: renamed from: a */
    public final Context f15417a;

    /* JADX INFO: renamed from: b */
    public final k10 f15418b;

    /* JADX INFO: renamed from: c */
    public final Executor f15419c;

    public iy0(Context context, k10 k10Var, Executor executor) {
        this.f15417a = context;
        this.f15418b = k10Var;
        this.f15419c = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: a */
    public final n00 mo5897a(di1 di1Var, final rh1 rh1Var, ex0 ex0Var) throws mi1, s01 {
        final View view;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14154A4)).booleanValue() && rh1Var.f18806b0) {
            vi1 vi1Var = (vi1) ex0Var.f13744b;
            Objects.requireNonNull(vi1Var);
            try {
                InterfaceC3692xd interfaceC3692xdMo7829T = vi1Var.f20804a.mo7829T();
                if (interfaceC3692xdMo7829T == null) {
                    C2622l.m5408n3("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                    throw new mi1(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                }
                try {
                    view = (View) BinderC2800b.m5639T1(interfaceC3692xdMo7829T.mo8623c());
                    boolean zMo8624d = interfaceC3692xdMo7829T.mo8624d();
                    if (view == null) {
                        throw new mi1(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                    }
                    if (zMo8624d) {
                        try {
                            view = (View) ((du1) cw0.m6249s(cw0.m6231a(null), new qu1(this, view, rh1Var) { // from class: c.n.b.d.j.a.hy0

                                /* JADX INFO: renamed from: a */
                                public final iy0 f15050a;

                                /* JADX INFO: renamed from: b */
                                public final View f15051b;

                                /* JADX INFO: renamed from: c */
                                public final rh1 f15052c;

                                {
                                    this.f15050a = this;
                                    this.f15051b = view;
                                    this.f15052c = rh1Var;
                                }

                                @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                                /* JADX INFO: renamed from: a */
                                public final kv1 mo4612a(Object obj) {
                                    iy0 iy0Var = this.f15050a;
                                    return cw0.m6231a(b20.m5917a(iy0Var.f15417a, this.f15051b, this.f15052c));
                                }
                            }, C2962do.f13334e)).get();
                        } catch (InterruptedException | ExecutionException e) {
                            throw new mi1(e);
                        }
                    }
                } catch (RemoteException e2) {
                    throw new mi1(e2);
                }
            } catch (Throwable th) {
                throw new mi1(th);
            }
        } else {
            vi1 vi1Var2 = (vi1) ex0Var.f13744b;
            Objects.requireNonNull(vi1Var2);
            try {
                view = (View) BinderC2800b.m5639T1(vi1Var2.f20804a.mo7838d());
            } catch (Throwable th2) {
                throw new mi1(th2);
            }
        }
        k10 k10Var = this.f15418b;
        c30 c30Var = new c30(di1Var, rh1Var, ex0Var.f13743a);
        final vi1 vi1Var3 = (vi1) ex0Var.f13744b;
        o00 o00VarMo5865c = k10Var.mo5865c(c30Var, new u00(view, null, new k20(vi1Var3) { // from class: c.n.b.d.j.a.fy0

            /* JADX INFO: renamed from: a */
            public final vi1 f14135a;

            {
                this.f14135a = vi1Var3;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.k20
            public final InterfaceC3087h1 zza() throws mi1 {
                vi1 vi1Var4 = this.f14135a;
                Objects.requireNonNull(vi1Var4);
                try {
                    return vi1Var4.f20804a.mo7828O();
                } catch (Throwable th3) {
                    throw new mi1(th3);
                }
            }
        }, rh1Var.f18829t.get(0)));
        o00VarMo5865c.mo7952j().m6351B0(view);
        o00VarMo5865c.mo7406a().m7109u0(new C3194jy((vi1) ex0Var.f13744b), this.f15419c);
        ((yy0) ex0Var.f13745c).m8838G6(o00VarMo5865c.mo7410f());
        return o00VarMo5865c.mo7950h();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: b */
    public final void mo5898b(di1 di1Var, rh1 rh1Var, ex0<vi1, yy0> ex0Var) throws mi1 {
        jw2 jw2VarM5279L1;
        jw2 jw2Var = di1Var.f13280a.f22289a.f15192e;
        if (jw2Var.f15848s) {
            Context context = this.f15417a;
            int i = jw2Var.f15839j;
            int i2 = jw2Var.f15836g;
            C2177g c2177g = new C2177g(i, i2);
            c2177g.f10569n = true;
            c2177g.f10570o = i2;
            jw2VarM5279L1 = new jw2(context, c2177g);
        } else {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14154A4)).booleanValue() && rh1Var.f18806b0) {
                Context context2 = this.f15417a;
                int i3 = jw2Var.f15839j;
                int i4 = jw2Var.f15836g;
                C2177g c2177g2 = new C2177g(i3, i4);
                c2177g2.f10571p = true;
                c2177g2.f10572q = i4;
                jw2VarM5279L1 = new jw2(context2, c2177g2);
            } else {
                jw2VarM5279L1 = C2622l.m5279L1(this.f15417a, rh1Var.f18829t);
            }
        }
        jw2 jw2Var2 = jw2VarM5279L1;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14154A4)).booleanValue() && rh1Var.f18806b0) {
            vi1 vi1Var = ex0Var.f13744b;
            Context context3 = this.f15417a;
            ew2 ew2Var = di1Var.f13280a.f22289a.f15191d;
            String string = rh1Var.f18830u.toString();
            String strM4783k = C2269i0.m4783k(rh1Var.f18827r);
            InterfaceC3618vd interfaceC3618vd = (InterfaceC3618vd) ex0Var.f13745c;
            Objects.requireNonNull(vi1Var);
            try {
                vi1Var.f20804a.mo7822G2(new BinderC2800b(context3), jw2Var2, ew2Var, string, strM4783k, interfaceC3618vd);
                return;
            } catch (Throwable th) {
                throw new mi1(th);
            }
        }
        vi1 vi1Var2 = ex0Var.f13744b;
        Context context4 = this.f15417a;
        ew2 ew2Var2 = di1Var.f13280a.f22289a.f15191d;
        String string2 = rh1Var.f18830u.toString();
        String strM4783k2 = C2269i0.m4783k(rh1Var.f18827r);
        InterfaceC3618vd interfaceC3618vd2 = (InterfaceC3618vd) ex0Var.f13745c;
        Objects.requireNonNull(vi1Var2);
        try {
            vi1Var2.f20804a.mo7832W3(new BinderC2800b(context4), jw2Var2, ew2Var2, string2, strM4783k2, interfaceC3618vd2);
        } catch (Throwable th2) {
            throw new mi1(th2);
        }
    }
}
