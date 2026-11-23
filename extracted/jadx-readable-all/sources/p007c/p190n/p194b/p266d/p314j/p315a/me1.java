package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p314j.p315a.m20;
import p007c.p190n.p194b.p266d.p314j.p315a.r50;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class me1<R extends r50<AdT>, AdT extends m20> implements lf1<R, vj1<AdT>> {

    /* JADX INFO: renamed from: a */
    public R f16736a;

    /* JADX INFO: renamed from: b */
    public final Executor f16737b = wu1.INSTANCE;

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lf1
    /* JADX INFO: renamed from: a */
    public final kv1<vj1<AdT>> mo5768a(mf1 mf1Var, kf1<R> kf1Var) {
        q50<R> q50VarMo5787a = kf1Var.mo5787a(mf1Var.f16744b);
        q50VarMo5787a.mo7306a(new qf1(true));
        R rMo7309d = q50VarMo5787a.mo7309d();
        this.f16736a = rMo7309d;
        final q30 q30VarMo7141b = rMo7309d.mo7141b();
        final vj1 vj1Var = new vj1();
        C3437qi c3437qi = mf1Var.f16743a;
        return cw0.m6250t(cw0.m6249s(zu1.m8908s(c3437qi != null ? q30VarMo7141b.m8188a(cw0.m6231a(c3437qi)) : q30VarMo7141b.m8189b()), new qu1(this, vj1Var, q30VarMo7141b) { // from class: c.n.b.d.j.a.ke1

            /* JADX INFO: renamed from: a */
            public final vj1 f15928a;

            /* JADX INFO: renamed from: b */
            public final q30 f15929b;

            {
                this.f15928a = vj1Var;
                this.f15929b = q30VarMo7141b;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                vj1 vj1Var2 = this.f15928a;
                q30 q30Var = this.f15929b;
                di1 di1Var = (di1) obj;
                vj1Var2.f20806b = di1Var;
                Iterator<rh1> it = di1Var.f13281b.f12694a.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Iterator<String> it2 = it.next().f18803a.iterator();
                    while (it2.hasNext()) {
                        if (!it2.next().contains("FirstPartyRenderer")) {
                            return cw0.m6231a(null);
                        }
                        z = true;
                    }
                }
                if (z) {
                    return q30Var.m8190c(cw0.m6231a(di1Var));
                }
                return cw0.m6231a(null);
            }
        }, this.f16737b), new cs1(vj1Var) { // from class: c.n.b.d.j.a.le1

            /* JADX INFO: renamed from: a */
            public final vj1 f16330a;

            {
                this.f16330a = vj1Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
            public final Object apply(Object obj) {
                vj1 vj1Var2 = this.f16330a;
                vj1Var2.f20807c = (AdT) obj;
                return vj1Var2;
            }
        }, this.f16737b);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lf1
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5769b() {
        return this.f16736a;
    }
}
