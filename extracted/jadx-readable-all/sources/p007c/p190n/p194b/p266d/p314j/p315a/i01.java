package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.view.ViewGroup;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class i01 extends h01<n00> {

    /* JADX INFO: renamed from: a */
    public final AbstractC3264lu f15067a;

    /* JADX INFO: renamed from: b */
    public final s50 f15068b;

    /* JADX INFO: renamed from: c */
    public final q21 f15069c;

    /* JADX INFO: renamed from: d */
    public final ja0 f15070d;

    /* JADX INFO: renamed from: e */
    public final me0 f15071e;

    /* JADX INFO: renamed from: f */
    public final u80 f15072f;

    /* JADX INFO: renamed from: g */
    public final ViewGroup f15073g;

    public i01(AbstractC3264lu abstractC3264lu, s50 s50Var, q21 q21Var, ja0 ja0Var, me0 me0Var, u80 u80Var, ViewGroup viewGroup) {
        this.f15067a = abstractC3264lu;
        this.f15068b = s50Var;
        this.f15069c = q21Var;
        this.f15070d = ja0Var;
        this.f15071e = me0Var;
        this.f15072f = u80Var;
        this.f15073g = viewGroup;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.h01
    /* JADX INFO: renamed from: c */
    public final kv1<n00> mo6699c(ii1 ii1Var, Bundle bundle) {
        C3710xv c3710xvMo7630l = this.f15067a.mo7630l();
        s50 s50Var = this.f15068b;
        s50Var.f19468b = ii1Var;
        s50Var.f19469c = bundle;
        c3710xvMo7630l.f21691b = new t50(s50Var);
        c3710xvMo7630l.f21690a = this.f15070d;
        c3710xvMo7630l.f21692c = this.f15069c;
        c3710xvMo7630l.f21695f = this.f15071e;
        c3710xvMo7630l.f21693d = new g20(this.f15072f);
        c3710xvMo7630l.f21694e = new k00(this.f15073g);
        q30<n00> q30VarMo5864b = c3710xvMo7630l.mo7309d().mo5864b();
        return q30VarMo5864b.m8190c(q30VarMo5864b.m8189b());
    }
}
