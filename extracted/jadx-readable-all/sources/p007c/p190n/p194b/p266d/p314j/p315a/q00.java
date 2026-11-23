package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class q00 extends n00 {

    /* JADX INFO: renamed from: i */
    public final Context f18138i;

    /* JADX INFO: renamed from: j */
    public final View f18139j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC3410ps f18140k;

    /* JADX INFO: renamed from: l */
    public final sh1 f18141l;

    /* JADX INFO: renamed from: m */
    public final k20 f18142m;

    /* JADX INFO: renamed from: n */
    public final mg0 f18143n;

    /* JADX INFO: renamed from: o */
    public final hc0 f18144o;

    /* JADX INFO: renamed from: p */
    public final vc2<j31> f18145p;

    /* JADX INFO: renamed from: q */
    public final Executor f18146q;

    /* JADX INFO: renamed from: r */
    public jw2 f18147r;

    public q00(l20 l20Var, Context context, sh1 sh1Var, View view, InterfaceC3410ps interfaceC3410ps, k20 k20Var, mg0 mg0Var, hc0 hc0Var, vc2<j31> vc2Var, Executor executor) {
        super(l20Var);
        this.f18138i = context;
        this.f18139j = view;
        this.f18140k = interfaceC3410ps;
        this.f18141l = sh1Var;
        this.f18142m = k20Var;
        this.f18143n = mg0Var;
        this.f18144o = hc0Var;
        this.f18145p = vc2Var;
        this.f18146q = executor;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.m20
    /* JADX INFO: renamed from: a */
    public final void mo7653a() {
        this.f18146q.execute(new Runnable(this) { // from class: c.n.b.d.j.a.p00

            /* JADX INFO: renamed from: f */
            public final q00 f17804f;

            {
                this.f17804f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                q00 q00Var = this.f17804f;
                InterfaceC3648w6 interfaceC3648w6 = q00Var.f18143n.f16751e;
                if (interfaceC3648w6 == null) {
                    return;
                }
                try {
                    interfaceC3648w6.mo8537l3(q00Var.f18145p.m8545a(), new BinderC2800b(q00Var.f18138i));
                } catch (RemoteException e) {
                    C2622l.m5438t3("RemoteException when notifyAdLoad is called", e);
                }
            }
        });
        super.mo7653a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.n00
    /* JADX INFO: renamed from: c */
    public final View mo7743c() {
        return this.f18139j;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.n00
    /* JADX INFO: renamed from: d */
    public final void mo7744d(ViewGroup viewGroup, jw2 jw2Var) {
        InterfaceC3410ps interfaceC3410ps;
        if (viewGroup == null || (interfaceC3410ps = this.f18140k) == null) {
            return;
        }
        interfaceC3410ps.mo6437D0(C3005eu.m6686a(jw2Var));
        viewGroup.setMinimumHeight(jw2Var.f15837h);
        viewGroup.setMinimumWidth(jw2Var.f15840k);
        this.f18147r = jw2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.n00
    /* JADX INFO: renamed from: e */
    public final InterfaceC3087h1 mo7745e() {
        try {
            return this.f18142m.zza();
        } catch (mi1 unused) {
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.n00
    /* JADX INFO: renamed from: f */
    public final sh1 mo7746f() {
        jw2 jw2Var = this.f18147r;
        if (jw2Var != null) {
            return C2622l.m5407n2(jw2Var);
        }
        rh1 rh1Var = this.f16665b;
        if (rh1Var.f18799W) {
            for (String str : rh1Var.f18803a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new sh1(this.f18139j.getWidth(), this.f18139j.getHeight(), false);
        }
        return this.f16665b.f18826q.get(0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.n00
    /* JADX INFO: renamed from: g */
    public final sh1 mo7747g() {
        return this.f18141l;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.n00
    /* JADX INFO: renamed from: h */
    public final int mo7748h() {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14154A4;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() && this.f16665b.f18806b0) {
            if (!((Boolean) c2862b.f12496d.m6596a(C3052g3.f14161B4)).booleanValue()) {
                return 0;
            }
        }
        return this.f16664a.f13281b.f12695b.f20319c;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.n00
    /* JADX INFO: renamed from: i */
    public final void mo7749i() {
        this.f18144o.zza();
    }
}
