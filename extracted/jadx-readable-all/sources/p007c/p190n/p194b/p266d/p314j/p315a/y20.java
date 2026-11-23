package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class y20 implements dv1<t20> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dv1 f21733a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a30 f21734b;

    public y20(a30 a30Var, dv1 dv1Var) {
        this.f21734b = a30Var;
        this.f21733a = dv1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        this.f21733a.mo4616a(th);
        C2962do.f13334e.execute(new Runnable(this.f21734b) { // from class: c.n.b.d.j.a.x20

            /* JADX INFO: renamed from: f */
            public final a30 f21428f;

            {
                this.f21428f = a30Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f21428f.f12007d = false;
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final void mo4617b(t20 t20Var) {
        final a30 a30Var = this.f21734b;
        List<? extends kv1<? extends m20>> list = t20Var.f19753a;
        final dv1 dv1Var = this.f21733a;
        if (list == null || list.isEmpty()) {
            a30Var.f12004a.execute(new Runnable(dv1Var) { // from class: c.n.b.d.j.a.u20

                /* JADX INFO: renamed from: f */
                public final dv1 f20202f;

                {
                    this.f20202f = dv1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f20202f.mo4616a(new or0(3));
                }
            });
            return;
        }
        kv1 kv1VarM6231a = cw0.m6231a(null);
        for (final kv1<? extends m20> kv1Var : list) {
            kv1VarM6231a = cw0.m6249s(cw0.m6247q(kv1VarM6231a, Throwable.class, new qu1(dv1Var) { // from class: c.n.b.d.j.a.v20

                /* JADX INFO: renamed from: a */
                public final dv1 f20691a;

                {
                    this.f20691a = dv1Var;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                /* JADX INFO: renamed from: a */
                public final kv1 mo4612a(Object obj) {
                    this.f20691a.mo4616a((Throwable) obj);
                    return cw0.m6231a(null);
                }
            }, a30Var.f12004a), new qu1(a30Var, dv1Var, kv1Var) { // from class: c.n.b.d.j.a.w20

                /* JADX INFO: renamed from: a */
                public final a30 f20979a;

                /* JADX INFO: renamed from: b */
                public final dv1 f20980b;

                /* JADX INFO: renamed from: c */
                public final kv1 f20981c;

                {
                    this.f20979a = a30Var;
                    this.f20980b = dv1Var;
                    this.f20981c = kv1Var;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                /* JADX INFO: renamed from: a */
                public final kv1 mo4612a(Object obj) {
                    a30 a30Var2 = this.f20979a;
                    dv1 dv1Var2 = this.f20980b;
                    kv1 kv1Var2 = this.f20981c;
                    m20 m20Var = (m20) obj;
                    Objects.requireNonNull(a30Var2);
                    if (m20Var != null) {
                        dv1Var2.mo4617b(m20Var);
                    }
                    return cw0.m6248r(kv1Var2, C2831a5.f12016a.m6603d().longValue(), TimeUnit.MILLISECONDS, a30Var2.f12005b);
                }
            }, a30Var.f12004a);
        }
        z20 z20Var = new z20(a30Var, dv1Var);
        kv1VarM6231a.mo6230f(new ev1(kv1VarM6231a, z20Var), a30Var.f12004a);
    }
}
