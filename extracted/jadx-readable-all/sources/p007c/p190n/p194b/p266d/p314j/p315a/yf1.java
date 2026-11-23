package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yf1 implements x41<yc0> {

    /* JADX INFO: renamed from: a */
    public final Context f21865a;

    /* JADX INFO: renamed from: b */
    public final Executor f21866b;

    /* JADX INFO: renamed from: c */
    public final AbstractC3264lu f21867c;

    /* JADX INFO: renamed from: d */
    public final h41 f21868d;

    /* JADX INFO: renamed from: e */
    public final wg1 f21869e;

    /* JADX INFO: renamed from: f */
    public InterfaceC3719y3 f21870f;

    /* JADX INFO: renamed from: g */
    public final hi1 f21871g;

    /* JADX INFO: renamed from: h */
    public kv1<yc0> f21872h;

    public yf1(Context context, Executor executor, AbstractC3264lu abstractC3264lu, h41 h41Var, wg1 wg1Var, hi1 hi1Var) {
        this.f21865a = context;
        this.f21866b = executor;
        this.f21867c = abstractC3264lu;
        this.f21868d = h41Var;
        this.f21871g = hi1Var;
        this.f21869e = wg1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.x41
    /* JADX INFO: renamed from: a */
    public final boolean mo6606a() {
        kv1<yc0> kv1Var = this.f21872h;
        return (kv1Var == null || kv1Var.isDone()) ? false : true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.x41
    /* JADX INFO: renamed from: b */
    public final boolean mo6607b(ew2 ew2Var, String str, v41 v41Var, w41<? super yc0> w41Var) {
        ud0 ud0VarMo7309d;
        if (str == null) {
            C2622l.m5408n3("Ad unit ID should not be null for interstitial ad.");
            this.f21866b.execute(new Runnable(this) { // from class: c.n.b.d.j.a.sf1

                /* JADX INFO: renamed from: f */
                public final yf1 f19548f;

                {
                    this.f19548f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f19548f.f21868d.mo6216o0(C2622l.m5285M2(6, null, null));
                }
            });
            return false;
        }
        if (mo6606a()) {
            return false;
        }
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14400m5;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() && ew2Var.f13718k) {
            this.f21867c.mo7644z().m6073b(true);
        }
        jw2 jw2Var = ((rf1) v41Var).f18765a;
        hi1 hi1Var = this.f21871g;
        hi1Var.f14857c = str;
        hi1Var.f14856b = jw2Var;
        hi1Var.f14855a = ew2Var;
        ii1 ii1VarM7136a = hi1Var.m7136a();
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14237N4)).booleanValue()) {
            C3155iw c3155iwMo7635q = this.f21867c.mo7635q();
            s50 s50Var = new s50();
            s50Var.f19467a = this.f21865a;
            s50Var.f19468b = ii1VarM7136a;
            c3155iwMo7635q.f15403b = new t50(s50Var);
            ia0 ia0Var = new ia0();
            ia0Var.m7226g(this.f21868d, this.f21866b);
            ia0Var.m7223d(this.f21868d, this.f21866b);
            c3155iwMo7635q.f15402a = new ja0(ia0Var);
            c3155iwMo7635q.f15404c = new q21(this.f21870f);
            ud0VarMo7309d = c3155iwMo7635q.mo7309d();
        } else {
            ia0 ia0Var2 = new ia0();
            wg1 wg1Var = this.f21869e;
            if (wg1Var != null) {
                ia0Var2.f15118d.add(new bc0<>(wg1Var, this.f21866b));
                ia0Var2.m7221b(this.f21869e, this.f21866b);
                ia0Var2.m7222c(this.f21869e, this.f21866b);
            }
            C3155iw c3155iwMo7635q2 = this.f21867c.mo7635q();
            s50 s50Var2 = new s50();
            s50Var2.f19467a = this.f21865a;
            s50Var2.f19468b = ii1VarM7136a;
            c3155iwMo7635q2.f15403b = new t50(s50Var2);
            ia0Var2.m7226g(this.f21868d, this.f21866b);
            ia0Var2.m7220a(this.f21868d, this.f21866b);
            ia0Var2.m7221b(this.f21868d, this.f21866b);
            ia0Var2.m7222c(this.f21868d, this.f21866b);
            ia0Var2.m7224e(this.f21868d, this.f21866b);
            ia0Var2.m7223d(this.f21868d, this.f21866b);
            ia0Var2.m7225f(this.f21868d, this.f21866b);
            ia0Var2.f15125k.add(new bc0<>(this.f21868d, this.f21866b));
            c3155iwMo7635q2.f15402a = new ja0(ia0Var2);
            c3155iwMo7635q2.f15404c = new q21(this.f21870f);
            ud0VarMo7309d = c3155iwMo7635q2.mo7309d();
        }
        q30<yc0> q30VarMo7563b = ud0VarMo7309d.mo7563b();
        kv1<yc0> kv1VarM8190c = q30VarMo7563b.m8190c(q30VarMo7563b.m8189b());
        this.f21872h = kv1VarM8190c;
        xf1 xf1Var = new xf1(this, w41Var, ud0VarMo7309d);
        Executor executor = this.f21866b;
        ((fl1) kv1VarM8190c).f14054h.mo6230f(new ev1(kv1VarM8190c, xf1Var), executor);
        return true;
    }
}
