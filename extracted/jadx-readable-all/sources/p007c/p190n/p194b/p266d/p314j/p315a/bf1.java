package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p314j.p315a.r50;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bf1<RequestComponentT extends r50<AdT>, AdT> implements lf1<RequestComponentT, AdT> {

    /* JADX INFO: renamed from: a */
    public final lf1<RequestComponentT, AdT> f12593a;

    /* JADX INFO: renamed from: b */
    public RequestComponentT f12594b;

    public bf1(lf1<RequestComponentT, AdT> lf1Var) {
        this.f12593a = lf1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lf1
    /* JADX INFO: renamed from: a */
    public final synchronized kv1<AdT> mo5768a(mf1 mf1Var, kf1<RequestComponentT> kf1Var) {
        RequestComponentT requestcomponentt;
        if (mf1Var.f16743a != null) {
            RequestComponentT requestcomponenttMo7309d = kf1Var.mo5787a(mf1Var.f16744b).mo7309d();
            this.f12594b = requestcomponenttMo7309d;
            q30<AdT> q30VarMo7141b = requestcomponenttMo7309d.mo7141b();
            return q30VarMo7141b.m8190c(q30VarMo7141b.m8188a(cw0.m6231a(mf1Var.f16743a)));
        }
        kv1<AdT> kv1VarMo5768a = this.f12593a.mo5768a(mf1Var, kf1Var);
        af1 af1Var = (af1) this.f12593a;
        synchronized (af1Var) {
            requestcomponentt = af1Var.f12113a;
        }
        this.f12594b = requestcomponentt;
        return kv1VarMo5768a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lf1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized RequestComponentT mo5769b() {
        return this.f12594b;
    }
}
