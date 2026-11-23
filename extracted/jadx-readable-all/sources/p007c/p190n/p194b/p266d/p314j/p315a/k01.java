package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class k01 extends h01<yc0> {

    /* JADX INFO: renamed from: a */
    public final AbstractC3264lu f15861a;

    /* JADX INFO: renamed from: b */
    public final s50 f15862b;

    /* JADX INFO: renamed from: c */
    public final q21 f15863c;

    /* JADX INFO: renamed from: d */
    public final ja0 f15864d;

    public k01(AbstractC3264lu abstractC3264lu, s50 s50Var, q21 q21Var, ja0 ja0Var) {
        this.f15861a = abstractC3264lu;
        this.f15862b = s50Var;
        this.f15863c = q21Var;
        this.f15864d = ja0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.h01
    /* JADX INFO: renamed from: c */
    public final kv1<yc0> mo6699c(ii1 ii1Var, Bundle bundle) {
        C3155iw c3155iwMo7635q = this.f15861a.mo7635q();
        s50 s50Var = this.f15862b;
        s50Var.f19468b = ii1Var;
        s50Var.f19469c = bundle;
        c3155iwMo7635q.f15403b = new t50(s50Var);
        c3155iwMo7635q.f15402a = this.f15864d;
        c3155iwMo7635q.f15404c = this.f15863c;
        q30<yc0> q30VarMo7563b = c3155iwMo7635q.mo7309d().mo7563b();
        return q30VarMo7563b.m8190c(q30VarMo7563b.m8189b());
    }
}
