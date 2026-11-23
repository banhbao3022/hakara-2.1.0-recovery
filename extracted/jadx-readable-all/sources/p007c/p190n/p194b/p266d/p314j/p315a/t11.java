package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class t11 implements kx0<dl0, vi1, zy0> {

    /* JADX INFO: renamed from: a */
    public final Context f19750a;

    /* JADX INFO: renamed from: b */
    public final Executor f19751b;

    /* JADX INFO: renamed from: c */
    public final hl0 f19752c;

    public t11(Context context, Executor executor, hl0 hl0Var) {
        this.f19750a = context;
        this.f19751b = executor;
        this.f19752c = hl0Var;
    }

    /* JADX INFO: renamed from: c */
    public static final void m8383c(di1 di1Var, rh1 rh1Var, ex0<vi1, zy0> ex0Var) {
        try {
            vi1 vi1Var = ex0Var.f13744b;
            ew2 ew2Var = di1Var.f13280a.f22289a.f15191d;
            String string = rh1Var.f18830u.toString();
            Objects.requireNonNull(vi1Var);
            try {
                vi1Var.f20804a.mo7819A6(ew2Var, string);
            } catch (Throwable th) {
                throw new mi1(th);
            }
        } catch (Exception e) {
            String strValueOf = String.valueOf(ex0Var.f13743a);
            C2622l.m5241D3(strValueOf.length() != 0 ? "Fail to load ad from adapter ".concat(strValueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: a */
    public final dl0 mo5897a(di1 di1Var, rh1 rh1Var, final ex0 ex0Var) throws mi1, s01 {
        el0 el0VarMo7142c = this.f19752c.mo7142c(new c30(di1Var, rh1Var, ex0Var.f13743a), new fl0(new ce0(ex0Var) { // from class: c.n.b.d.j.a.p11

            /* JADX INFO: renamed from: a */
            public final ex0 f17812a;

            {
                this.f17812a = ex0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ce0
            /* JADX INFO: renamed from: a */
            public final void mo6171a(boolean z, Context context) throws be0 {
                ex0 ex0Var2 = this.f17812a;
                try {
                    ((vi1) ex0Var2.f13744b).m8560b(z);
                    vi1 vi1Var = (vi1) ex0Var2.f13744b;
                    Objects.requireNonNull(vi1Var);
                    try {
                        vi1Var.f20804a.mo7849n();
                    } catch (Throwable th) {
                        throw new mi1(th);
                    }
                } catch (mi1 e) {
                    C2622l.m5241D3("Cannot show rewarded video.", e);
                    throw new be0(e.getCause());
                }
            }
        }));
        el0VarMo7142c.mo7406a().m7109u0(new C3194jy((vi1) ex0Var.f13744b), this.f19751b);
        o70 o70VarMo7757b = el0VarMo7142c.mo7757b();
        g60 g60VarMo7407c = el0VarMo7142c.mo7407c();
        m80 m80VarMo6638i = el0VarMo7142c.mo6638i();
        oc0 oc0VarMo6640k = el0VarMo7142c.mo6640k();
        zy0 zy0Var = (zy0) ex0Var.f13745c;
        s11 s11Var = new s11(m80VarMo6638i, g60VarMo7407c, o70VarMo7757b, oc0VarMo6640k);
        synchronized (zy0Var) {
            zy0Var.f22445f = s11Var;
        }
        return el0VarMo7142c.mo6637h();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: b */
    public final void mo5898b(di1 di1Var, rh1 rh1Var, ex0<vi1, zy0> ex0Var) throws mi1 {
        if (ex0Var.f13744b.m8559a()) {
            m8383c(di1Var, rh1Var, ex0Var);
            return;
        }
        r11 r11Var = new r11(this, di1Var, rh1Var, ex0Var);
        zy0 zy0Var = (zy0) ex0Var.f13745c;
        synchronized (zy0Var) {
            zy0Var.f22447h = r11Var;
        }
        vi1 vi1Var = ex0Var.f13744b;
        Context context = this.f19750a;
        ew2 ew2Var = di1Var.f13280a.f22289a.f15191d;
        InterfaceC3438qj interfaceC3438qj = (InterfaceC3438qj) ex0Var.f13745c;
        String string = rh1Var.f18830u.toString();
        Objects.requireNonNull(vi1Var);
        try {
            vi1Var.f20804a.mo7841e3(new BinderC2800b(context), ew2Var, null, interfaceC3438qj, string);
        } catch (Throwable th) {
            throw new mi1(th);
        }
    }
}
