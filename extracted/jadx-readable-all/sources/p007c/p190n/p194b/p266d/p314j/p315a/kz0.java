package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2269i0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class kz0 implements kx0<yc0, vi1, yy0> {

    /* JADX INFO: renamed from: a */
    public final Context f16241a;

    /* JADX INFO: renamed from: b */
    public final ud0 f16242b;

    /* JADX INFO: renamed from: c */
    public final C3702xn f16243c;

    /* JADX INFO: renamed from: d */
    public final Executor f16244d;

    public kz0(Context context, C3702xn c3702xn, ud0 ud0Var, Executor executor) {
        this.f16241a = context;
        this.f16243c = c3702xn;
        this.f16242b = ud0Var;
        this.f16244d = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ yc0 mo5897a(di1 di1Var, rh1 rh1Var, final ex0 ex0Var) throws mi1, s01 {
        zc0 zc0VarMo7564c = this.f16242b.mo7564c(new c30(di1Var, rh1Var, ex0Var.f13743a), new cd0(new ce0(this, ex0Var) { // from class: c.n.b.d.j.a.jz0

            /* JADX INFO: renamed from: a */
            public final kz0 f15858a;

            /* JADX INFO: renamed from: b */
            public final ex0 f15859b;

            {
                this.f15858a = this;
                this.f15859b = ex0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ce0
            /* JADX INFO: renamed from: a */
            public final void mo6171a(boolean z, Context context) throws be0 {
                kz0 kz0Var = this.f15858a;
                ex0 ex0Var2 = this.f15859b;
                Objects.requireNonNull(kz0Var);
                try {
                    ((vi1) ex0Var2.f13744b).m8560b(z);
                    if (kz0Var.f16243c.f21617h < ((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14423q0)).intValue()) {
                        vi1 vi1Var = (vi1) ex0Var2.f13744b;
                        Objects.requireNonNull(vi1Var);
                        try {
                            vi1Var.f20804a.mo7842g();
                            return;
                        } catch (Throwable th) {
                            throw new mi1(th);
                        }
                    }
                    vi1 vi1Var2 = (vi1) ex0Var2.f13744b;
                    Objects.requireNonNull(vi1Var2);
                    try {
                        vi1Var2.f20804a.mo7831U1(new BinderC2800b(context));
                        return;
                    } catch (Throwable th2) {
                        throw new mi1(th2);
                    }
                } catch (mi1 e) {
                    C2622l.m5458x3("Cannot show interstitial.");
                    throw new be0(e.getCause());
                }
                C2622l.m5458x3("Cannot show interstitial.");
                throw new be0(e.getCause());
            }
        }, null));
        zc0VarMo7564c.mo7406a().m7109u0(new C3194jy((vi1) ex0Var.f13744b), this.f16244d);
        ((yy0) ex0Var.f13745c).m8838G6(zc0VarMo7564c.mo7410f());
        return zc0VarMo7564c.mo7412h();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: b */
    public final void mo5898b(di1 di1Var, rh1 rh1Var, ex0<vi1, yy0> ex0Var) throws mi1 {
        vi1 vi1Var = ex0Var.f13744b;
        Context context = this.f16241a;
        ew2 ew2Var = di1Var.f13280a.f22289a.f15191d;
        String string = rh1Var.f18830u.toString();
        String strM4783k = C2269i0.m4783k(rh1Var.f18827r);
        InterfaceC3618vd interfaceC3618vd = (InterfaceC3618vd) ex0Var.f13745c;
        Objects.requireNonNull(vi1Var);
        try {
            vi1Var.f20804a.mo7836c1(new BinderC2800b(context), ew2Var, string, strM4783k, interfaceC3618vd);
        } catch (Throwable th) {
            throw new mi1(th);
        }
    }
}
