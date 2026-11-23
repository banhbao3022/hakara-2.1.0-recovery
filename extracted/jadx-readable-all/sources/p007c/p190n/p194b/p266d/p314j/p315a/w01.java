package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class w01 implements kx0<dl0, vi1, yy0> {

    /* JADX INFO: renamed from: a */
    public final Context f20972a;

    /* JADX INFO: renamed from: b */
    public final Executor f20973b;

    /* JADX INFO: renamed from: c */
    public final hl0 f20974c;

    public w01(Context context, Executor executor, hl0 hl0Var) {
        this.f20972a = context;
        this.f20973b = executor;
        this.f20974c = hl0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ dl0 mo5897a(di1 di1Var, rh1 rh1Var, final ex0 ex0Var) throws mi1, s01 {
        el0 el0VarMo7142c = this.f20974c.mo7142c(new c30(di1Var, rh1Var, ex0Var.f13743a), new fl0(new ce0(ex0Var) { // from class: c.n.b.d.j.a.v01

            /* JADX INFO: renamed from: a */
            public final ex0 f20684a;

            {
                this.f20684a = ex0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ce0
            /* JADX INFO: renamed from: a */
            public final void mo6171a(boolean z, Context context) throws be0 {
                ex0 ex0Var2 = this.f20684a;
                try {
                    ((vi1) ex0Var2.f13744b).m8560b(z);
                    vi1 vi1Var = (vi1) ex0Var2.f13744b;
                    Objects.requireNonNull(vi1Var);
                    try {
                        vi1Var.f20804a.mo7844h3(new BinderC2800b(context));
                    } catch (Throwable th) {
                        throw new mi1(th);
                    }
                } catch (mi1 e) {
                    throw new be0(e.getCause());
                }
            }
        }));
        el0VarMo7142c.mo7406a().m7109u0(new C3194jy((vi1) ex0Var.f13744b), this.f20973b);
        ((yy0) ex0Var.f13745c).m8838G6(el0VarMo7142c.mo6642m());
        return el0VarMo7142c.mo6637h();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: b */
    public final void mo5898b(di1 di1Var, rh1 rh1Var, ex0<vi1, yy0> ex0Var) throws mi1 {
        String strValueOf;
        String str;
        try {
            ii1 ii1Var = di1Var.f13280a.f22289a;
            if (ii1Var.f15202o.f21885a == 3) {
                vi1 vi1Var = ex0Var.f13744b;
                Context context = this.f20972a;
                ew2 ew2Var = ii1Var.f15191d;
                String string = rh1Var.f18830u.toString();
                InterfaceC3618vd interfaceC3618vd = (InterfaceC3618vd) ex0Var.f13745c;
                Objects.requireNonNull(vi1Var);
                try {
                    vi1Var.f20804a.mo7850n5(new BinderC2800b(context), ew2Var, string, interfaceC3618vd);
                    return;
                } catch (Throwable th) {
                    throw new mi1(th);
                }
            }
            vi1 vi1Var2 = ex0Var.f13744b;
            Context context2 = this.f20972a;
            ew2 ew2Var2 = ii1Var.f15191d;
            String string2 = rh1Var.f18830u.toString();
            InterfaceC3618vd interfaceC3618vd2 = (InterfaceC3618vd) ex0Var.f13745c;
            Objects.requireNonNull(vi1Var2);
            try {
                vi1Var2.f20804a.mo7827N1(new BinderC2800b(context2), ew2Var2, string2, interfaceC3618vd2);
                return;
            } catch (Throwable th2) {
                throw new mi1(th2);
            }
        } catch (Exception e) {
            strValueOf = String.valueOf(ex0Var.f13743a);
            if (strValueOf.length() != 0) {
                str = "Fail to load ad from adapter ".concat(strValueOf);
            } else {
                str = new String("Fail to load ad from adapter ");
            }
            C2622l.m5241D3(str, e);
        }
        strValueOf = String.valueOf(ex0Var.f13743a);
        if (strValueOf.length() != 0) {
            str = "Fail to load ad from adapter ".concat(strValueOf);
        } else {
            str = new String("Fail to load ad from adapter ");
        }
        C2622l.m5241D3(str, e);
    }
}
