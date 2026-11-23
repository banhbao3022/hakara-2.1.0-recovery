package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p314j.p315a.r50;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class af1<RequestComponentT extends r50<AdT>, AdT> implements lf1<RequestComponentT, AdT> {

    /* JADX INFO: renamed from: a */
    public RequestComponentT f12113a;

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lf1
    /* JADX INFO: renamed from: a */
    public final synchronized kv1<AdT> mo5768a(mf1 mf1Var, kf1<RequestComponentT> kf1Var) {
        q30<AdT> q30VarMo7141b;
        RequestComponentT requestcomponenttMo7309d = kf1Var.mo5787a(mf1Var.f16744b).mo7309d();
        this.f12113a = requestcomponenttMo7309d;
        q30VarMo7141b = requestcomponenttMo7309d.mo7141b();
        return q30VarMo7141b.m8190c(q30VarMo7141b.m8189b());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lf1
    /* JADX INFO: renamed from: b */
    public final Object mo5769b() {
        RequestComponentT requestcomponentt;
        synchronized (this) {
            requestcomponentt = this.f12113a;
        }
        return requestcomponentt;
    }
}
