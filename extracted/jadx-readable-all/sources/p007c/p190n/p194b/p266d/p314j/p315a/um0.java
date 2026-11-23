package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class um0 implements zc2<as2> {

    /* JADX INFO: renamed from: a */
    public final gd2<Context> f20375a;

    /* JADX INFO: renamed from: b */
    public final gd2<String> f20376b;

    /* JADX INFO: renamed from: c */
    public final gd2<C3702xn> f20377c;

    /* JADX INFO: renamed from: d */
    public final gd2<gs2> f20378d;

    /* JADX INFO: renamed from: e */
    public final gd2<String> f20379e;

    public um0(gd2<Context> gd2Var, gd2<String> gd2Var2, gd2<C3702xn> gd2Var3, gd2<gs2> gd2Var4, gd2<String> gd2Var5) {
        this.f20375a = gd2Var;
        this.f20376b = gd2Var2;
        this.f20377c = gd2Var3;
        this.f20378d = gd2Var4;
        this.f20379e = gd2Var5;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        Context contextM8156b = ((C3412pu) this.f20375a).m8156b();
        final String strMo4613a = ((gs0) this.f20376b).mo4613a();
        C3702xn c3702xnM8831b = ((C3746yu) this.f20377c).m8831b();
        final gs2 gs2VarMo4613a = this.f20378d.mo4613a();
        final String strMo4613a2 = this.f20379e.mo4613a();
        as2 as2Var = new as2(new ds2(contextM8156b));
        vu2 vu2VarM8695v = wu2.m8695v();
        int i = c3702xnM8831b.f21616g;
        if (vu2VarM8695v.f13191h) {
            vu2VarM8695v.m6298m();
            vu2VarM8695v.f13191h = false;
        }
        wu2.m8697y((wu2) vu2VarM8695v.f13190g, i);
        int i2 = c3702xnM8831b.f21617h;
        if (vu2VarM8695v.f13191h) {
            vu2VarM8695v.m6298m();
            vu2VarM8695v.f13191h = false;
        }
        wu2.m8698z((wu2) vu2VarM8695v.f13190g, i2);
        int i3 = true != c3702xnM8831b.f21618i ? 2 : 0;
        if (vu2VarM8695v.f13191h) {
            vu2VarM8695v.m6298m();
            vu2VarM8695v.f13191h = false;
        }
        wu2.m8694A((wu2) vu2VarM8695v.f13190g, i3);
        final wu2 wu2VarM6300o = vu2VarM8695v.m6300o();
        as2Var.m5846b(new zr2(gs2VarMo4613a, strMo4613a, wu2VarM6300o, strMo4613a2) { // from class: c.n.b.d.j.a.tm0

            /* JADX INFO: renamed from: a */
            public final gs2 f19915a;

            /* JADX INFO: renamed from: b */
            public final String f19916b;

            /* JADX INFO: renamed from: c */
            public final wu2 f19917c;

            /* JADX INFO: renamed from: d */
            public final String f19918d;

            {
                this.f19915a = gs2VarMo4613a;
                this.f19916b = strMo4613a;
                this.f19917c = wu2VarM6300o;
                this.f19918d = strMo4613a2;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.zr2
            /* JADX INFO: renamed from: a */
            public final void mo6684a(mt2 mt2Var) {
                gs2 gs2Var = this.f19915a;
                String str = this.f19916b;
                wu2 wu2Var = this.f19917c;
                String str2 = this.f19918d;
                hs2 hs2VarM6965q = mt2Var.m7732s().m6965q();
                if (hs2VarM6965q.f13191h) {
                    hs2VarM6965q.m6298m();
                    hs2VarM6965q.f13191h = false;
                }
                is2.m7301z((is2) hs2VarM6965q.f13190g, gs2Var);
                mt2Var.m7733t(hs2VarM6965q);
                et2 et2VarM6965q = ((ot2) mt2Var.f13190g).m8066x().m6965q();
                if (et2VarM6965q.f13191h) {
                    et2VarM6965q.m6298m();
                    et2VarM6965q.f13191h = false;
                }
                ft2.m6857y((ft2) et2VarM6965q.f13190g, str);
                if (et2VarM6965q.f13191h) {
                    et2VarM6965q.m6298m();
                    et2VarM6965q.f13191h = false;
                }
                ft2.m6858z((ft2) et2VarM6965q.f13190g, wu2Var);
                mt2Var.m7731r(et2VarM6965q);
                if (mt2Var.f13191h) {
                    mt2Var.m6298m();
                    mt2Var.f13191h = false;
                }
                ot2.m8056B((ot2) mt2Var.f13190g, str2);
            }
        });
        return as2Var;
    }
}
