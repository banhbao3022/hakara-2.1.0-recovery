package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class e60 implements zc2<InterfaceC2884bl> {

    /* JADX INFO: renamed from: a */
    public final gd2<Context> f13516a;

    /* JADX INFO: renamed from: b */
    public final gd2<C3702xn> f13517b;

    /* JADX INFO: renamed from: c */
    public final gd2<rh1> f13518c;

    /* JADX INFO: renamed from: d */
    public final gd2<C3736yk> f13519d;

    public e60(d60 d60Var, gd2<Context> gd2Var, gd2<C3702xn> gd2Var2, gd2<rh1> gd2Var3, gd2<C3736yk> gd2Var4) {
        this.f13516a = gd2Var;
        this.f13517b = gd2Var2;
        this.f13518c = gd2Var3;
        this.f13519d = gd2Var4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo4613a() {
        Context contextMo4613a = this.f13516a.mo4613a();
        C3702xn c3702xnM8831b = ((C3746yu) this.f13517b).m8831b();
        rh1 rh1VarM6282b = ((d30) this.f13518c).m6282b();
        C3736yk c3736yk = new C3736yk();
        C3773zk c3773zk = rh1VarM6282b.f18835z;
        if (c3773zk != null) {
            return new C3662wk(contextMo4613a, c3702xnM8831b, c3773zk, rh1VarM6282b.f18827r.f21126b, c3736yk, null);
        }
        return null;
    }
}
