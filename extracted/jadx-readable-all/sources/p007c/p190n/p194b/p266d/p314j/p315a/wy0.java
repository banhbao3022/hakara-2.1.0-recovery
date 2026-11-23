package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wy0 implements bx0<n00> {

    /* JADX INFO: renamed from: a */
    public final k10 f21393a;

    /* JADX INFO: renamed from: b */
    public final dy0 f21394b;

    /* JADX INFO: renamed from: c */
    public final lv1 f21395c;

    /* JADX INFO: renamed from: d */
    public final k60 f21396d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorService f21397e;

    public wy0(k10 k10Var, dy0 dy0Var, k60 k60Var, ScheduledExecutorService scheduledExecutorService, lv1 lv1Var) {
        this.f21393a = k10Var;
        this.f21394b = dy0Var;
        this.f21396d = k60Var;
        this.f21397e = scheduledExecutorService;
        this.f21395c = lv1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: a */
    public final kv1<n00> mo6115a(final di1 di1Var, final rh1 rh1Var) {
        return this.f21395c.mo6691u0(new Callable(this, di1Var, rh1Var) { // from class: c.n.b.d.j.a.ty0

            /* JADX INFO: renamed from: a */
            public final wy0 f20179a;

            /* JADX INFO: renamed from: b */
            public final di1 f20180b;

            /* JADX INFO: renamed from: c */
            public final rh1 f20181c;

            {
                this.f20179a = this;
                this.f20180b = di1Var;
                this.f20181c = rh1Var;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                final wy0 wy0Var = this.f20179a;
                final di1 di1Var2 = this.f20180b;
                final rh1 rh1Var2 = this.f20181c;
                v10 v10VarMo4613a = wy0Var.f21393a.mo5866d(new c30(di1Var2, rh1Var2, null), new w10(di1Var2.f13280a.f22289a.m7255a(), new Runnable(wy0Var, di1Var2, rh1Var2) { // from class: c.n.b.d.j.a.uy0

                    /* JADX INFO: renamed from: f */
                    public final wy0 f20677f;

                    /* JADX INFO: renamed from: g */
                    public final di1 f20678g;

                    /* JADX INFO: renamed from: h */
                    public final rh1 f20679h;

                    {
                        this.f20677f = wy0Var;
                        this.f20678g = di1Var2;
                        this.f20679h = rh1Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        wy0 wy0Var2 = this.f20677f;
                        di1 di1Var3 = this.f20678g;
                        rh1 rh1Var3 = this.f20679h;
                        kv1 kv1VarM6248r = cw0.m6248r(wy0Var2.f21394b.mo6115a(di1Var3, rh1Var3), rh1Var3.f18789M, TimeUnit.SECONDS, wy0Var2.f21397e);
                        kv1VarM6248r.mo6230f(new ev1(kv1VarM6248r, new vy0(wy0Var2)), wy0Var2.f21395c);
                    }
                })).f22423o.mo4613a();
                Objects.requireNonNull(v10VarMo4613a, "Cannot return null from a non-@Nullable @Provides method");
                return v10VarMo4613a;
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: b */
    public final boolean mo6116b(di1 di1Var, rh1 rh1Var) {
        return di1Var.f13280a.f22289a.m7255a() != null && this.f21394b.mo6116b(di1Var, rh1Var);
    }
}
