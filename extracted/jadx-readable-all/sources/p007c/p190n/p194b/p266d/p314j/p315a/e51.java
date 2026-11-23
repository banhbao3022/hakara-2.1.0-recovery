package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class e51 implements x41<m20> {

    /* JADX INFO: renamed from: a */
    public final hi1 f13508a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3264lu f13509b;

    /* JADX INFO: renamed from: c */
    public final Context f13510c;

    /* JADX INFO: renamed from: d */
    public final u41 f13511d;

    /* JADX INFO: renamed from: e */
    public a30 f13512e;

    public e51(AbstractC3264lu abstractC3264lu, Context context, u41 u41Var, hi1 hi1Var) {
        this.f13509b = abstractC3264lu;
        this.f13510c = context;
        this.f13511d = u41Var;
        this.f13508a = hi1Var;
        hi1Var.f14871q = u41Var.f20215b;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.x41
    /* JADX INFO: renamed from: a */
    public final boolean mo6606a() {
        a30 a30Var = this.f13512e;
        return a30Var != null && a30Var.f12007d;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.x41
    /* JADX INFO: renamed from: b */
    public final boolean mo6607b(ew2 ew2Var, String str, v41 v41Var, w41<? super m20> w41Var) throws RemoteException {
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        if (C2267h1.m4749h(this.f13510c) && ew2Var.f13731x == null) {
            C2622l.m5408n3("Failed to load the ad because app ID is missing.");
            this.f13509b.mo7624f().execute(new Runnable(this) { // from class: c.n.b.d.j.a.z41

                /* JADX INFO: renamed from: f */
                public final e51 f22172f;

                {
                    this.f22172f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f22172f.f13511d.f20216c.mo6216o0(C2622l.m5285M2(4, null, null));
                }
            });
            return false;
        }
        if (str == null) {
            C2622l.m5408n3("Ad unit ID should not be null for NativeAdLoader.");
            this.f13509b.mo7624f().execute(new Runnable(this) { // from class: c.n.b.d.j.a.a51

                /* JADX INFO: renamed from: f */
                public final e51 f12022f;

                {
                    this.f12022f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f12022f.f13511d.f20216c.mo6216o0(C2622l.m5285M2(6, null, null));
                }
            });
            return false;
        }
        cw0.m6239i(this.f13510c, ew2Var.f13718k);
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14400m5)).booleanValue() && ew2Var.f13718k) {
            this.f13509b.mo7644z().m6073b(true);
        }
        int i = ((y41) v41Var).f21742a;
        hi1 hi1Var = this.f13508a;
        hi1Var.f14855a = ew2Var;
        hi1Var.f14867m = i;
        ii1 ii1VarM7136a = hi1Var.m7136a();
        InterfaceC2863b0 interfaceC2863b0 = ii1VarM7136a.f15201n;
        if (interfaceC2863b0 != null) {
            h41 h41Var = this.f13511d.f20215b;
            h41Var.f14749g.set(interfaceC2863b0);
            h41Var.f14754l.set(true);
            h41Var.m7055p();
        }
        C3228kv c3228kvMo7637s = this.f13509b.mo7637s();
        s50 s50Var = new s50();
        s50Var.f19467a = this.f13510c;
        s50Var.f19468b = ii1VarM7136a;
        c3228kvMo7637s.f16044b = new t50(s50Var);
        ia0 ia0Var = new ia0();
        ia0Var.m7223d(this.f13511d.f20215b, this.f13509b.mo7624f());
        c3228kvMo7637s.f16043a = new ja0(ia0Var);
        u41 u41Var = this.f13511d;
        c3228kvMo7637s.f16045c = new me0(u41Var.f20214a, u41Var.f20215b.m7054n());
        c3228kvMo7637s.f16046d = new k00(null);
        qe0 qe0VarMo7309d = c3228kvMo7637s.mo7309d();
        this.f13509b.mo7643y().m8651a(1);
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        ScheduledExecutorService scheduledExecutorServiceMo7625g = this.f13509b.mo7625g();
        q30<t20> q30VarMo7937a = qe0VarMo7309d.mo7937a();
        a30 a30Var = new a30(lv1Var, scheduledExecutorServiceMo7625g, q30VarMo7937a.m8190c(q30VarMo7937a.m8189b()));
        this.f13512e = a30Var;
        d51 d51Var = new d51(this, w41Var, qe0VarMo7309d);
        kv1<t20> kv1Var = a30Var.f12006c;
        y20 y20Var = new y20(a30Var, d51Var);
        kv1Var.mo6230f(new ev1(kv1Var, y20Var), a30Var.f12004a);
        return true;
    }
}
