package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class wo0 {

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f21275a;

    /* JADX INFO: renamed from: b */
    public final Executor f21276b;

    /* JADX INFO: renamed from: c */
    public final C3665wn f21277c;

    /* JADX INFO: renamed from: d */
    public final boolean f21278d;

    /* JADX INFO: renamed from: e */
    public final sm1 f21279e;

    public wo0(Executor executor, C3665wn c3665wn, sm1 sm1Var) {
        C3201k4.f15880b.m6603d();
        this.f21275a = new HashMap();
        this.f21276b = executor;
        this.f21277c = c3665wn;
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14333d1;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            this.f21278d = ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14340e1)).booleanValue();
        } else {
            this.f21278d = ((double) gx2.f14692a.f14697f.nextFloat()) <= C3201k4.f15879a.m6603d().doubleValue();
        }
        this.f21279e = sm1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m8663a(Map<String, String> map) {
        final String strM8356a = this.f21279e.m8356a(map);
        if (this.f21278d) {
            this.f21276b.execute(new Runnable(this, strM8356a) { // from class: c.n.b.d.j.a.vo0

                /* JADX INFO: renamed from: f */
                public final wo0 f20869f;

                /* JADX INFO: renamed from: g */
                public final String f20870g;

                {
                    this.f20869f = this;
                    this.f20870g = strM8356a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    wo0 wo0Var = this.f20869f;
                    wo0Var.f21277c.mo4730f(this.f20870g);
                }
            });
        }
        C2096e.m4590z(strM8356a);
    }
}
