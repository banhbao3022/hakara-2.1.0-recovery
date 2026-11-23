package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pf1 implements zc2<lf1<hl0, dl0>> {

    /* JADX INFO: renamed from: a */
    public final gd2<Context> f17965a;

    /* JADX INFO: renamed from: b */
    public final gd2<jj1> f17966b;

    /* JADX INFO: renamed from: c */
    public final gd2<ak1> f17967c;

    public pf1(gd2<Context> gd2Var, gd2<jj1> gd2Var2, gd2<ak1> gd2Var3) {
        this.f17965a = gd2Var;
        this.f17966b = gd2Var2;
        this.f17967c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lf1<hl0, dl0> mo4613a() {
        Context contextMo4613a = this.f17965a.mo4613a();
        jj1 jj1VarMo4613a = this.f17966b.mo4613a();
        ak1 ak1VarMo4613a = this.f17967c.mo4613a();
        if (((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14278U3)).intValue() <= 0) {
            return new af1();
        }
        zj1 zj1VarM5820a = ak1VarMo4613a.m5820a(rj1.Rewarded, contextMo4613a, jj1VarMo4613a, new qe1(new me1()));
        bf1 bf1Var = new bf1(new af1());
        nj1 nj1Var = zj1VarM5820a.f22304a;
        lv1 lv1Var = C2962do.f13330a;
        return new se1(bf1Var, new ye1(nj1Var, lv1Var), zj1VarM5820a.f22305b, lv1Var);
    }
}
