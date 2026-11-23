package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class kz1 extends jw1<y22, v22> {
    public kz1(lz1 lz1Var, Class cls) {
        super(cls);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6123a(l92 l92Var) throws GeneralSecurityException {
        y22 y22Var = (y22) l92Var;
        if (y22Var.m8775x() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        lz1.m7650i(y22Var.m8774v());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ l92 mo6124b(g72 g72Var) throws r82 {
        return y22.m8772y(g72Var, s72.m8347a());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: c */
    public final v22 mo6125c(l92 l92Var) throws GeneralSecurityException {
        y22 y22Var = (y22) l92Var;
        u22 u22VarM8527A = v22.m8527A();
        if (u22VarM8527A.f13191h) {
            u22VarM8527A.m6298m();
            u22VarM8527A.f13191h = false;
        }
        ((v22) u22VarM8527A.f13190g).zzb = 0;
        b32 b32VarM8774v = y22Var.m8774v();
        if (u22VarM8527A.f13191h) {
            u22VarM8527A.m6298m();
            u22VarM8527A.f13191h = false;
        }
        v22.m8531E((v22) u22VarM8527A.f13190g, b32VarM8774v);
        byte[] bArrM6935a = g62.m6935a(y22Var.m8775x());
        g72 g72VarM6939G = g72.m6939G(bArrM6935a, 0, bArrM6935a.length);
        if (u22VarM8527A.f13191h) {
            u22VarM8527A.m6298m();
            u22VarM8527A.f13191h = false;
        }
        ((v22) u22VarM8527A.f13190g).zzf = g72VarM6939G;
        return u22VarM8527A.m6300o();
    }
}
