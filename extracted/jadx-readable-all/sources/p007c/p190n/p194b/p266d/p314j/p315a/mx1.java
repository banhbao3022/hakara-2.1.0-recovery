package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mx1 extends jw1<l02, h02> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nx1 f16958b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx1(nx1 nx1Var, Class cls) {
        super(cls);
        this.f16958b = nx1Var;
    }

    /* JADX INFO: renamed from: d */
    public static final h02 m7738d(l02 l02Var) throws GeneralSecurityException {
        g02 g02VarM7043A = h02.m7043A();
        o02 o02VarM7570v = l02Var.m7570v();
        if (g02VarM7043A.f13191h) {
            g02VarM7043A.m6298m();
            g02VarM7043A.f13191h = false;
        }
        h02.m7047E((h02) g02VarM7043A.f13190g, o02VarM7570v);
        byte[] bArrM6935a = g62.m6935a(l02Var.m7571x());
        g72 g72VarM6939G = g72.m6939G(bArrM6935a, 0, bArrM6935a.length);
        if (g02VarM7043A.f13191h) {
            g02VarM7043A.m6298m();
            g02VarM7043A.f13191h = false;
        }
        ((h02) g02VarM7043A.f13190g).zzf = g72VarM6939G;
        if (g02VarM7043A.f13191h) {
            g02VarM7043A.m6298m();
            g02VarM7043A.f13191h = false;
        }
        ((h02) g02VarM7043A.f13190g).zzb = 0;
        return g02VarM7043A.m6300o();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: a */
    public final void mo6123a(l92 l92Var) throws GeneralSecurityException {
        l02 l02Var = (l02) l92Var;
        h62.m7066a(l02Var.m7571x());
        nx1.m7947i(l02Var.m7570v());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ l92 mo6124b(g72 g72Var) throws r82 {
        return l02.m7568y(g72Var, s72.m8347a());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ h02 mo6125c(l92 l92Var) throws GeneralSecurityException {
        return m7738d((l02) l92Var);
    }
}
