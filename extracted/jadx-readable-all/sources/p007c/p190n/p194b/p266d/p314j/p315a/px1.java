package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class px1 extends jw1<u02, r02> {
    public px1(qx1 qx1Var, Class cls) {
        super(cls);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6123a(l92 l92Var) throws GeneralSecurityException {
        u02 u02Var = (u02) l92Var;
        h62.m7066a(u02Var.m8467x());
        if (u02Var.m8466v().m8713v() != 12 && u02Var.m8466v().m8713v() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ l92 mo6124b(g72 g72Var) throws r82 {
        return u02.m8464y(g72Var, s72.m8347a());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: c */
    public final r02 mo6125c(l92 l92Var) throws GeneralSecurityException {
        u02 u02Var = (u02) l92Var;
        q02 q02VarM8233A = r02.m8233A();
        byte[] bArrM6935a = g62.m6935a(u02Var.m8467x());
        g72 g72VarM6939G = g72.m6939G(bArrM6935a, 0, bArrM6935a.length);
        if (q02VarM8233A.f13191h) {
            q02VarM8233A.m6298m();
            q02VarM8233A.f13191h = false;
        }
        ((r02) q02VarM8233A.f13190g).zzf = g72VarM6939G;
        x02 x02VarM8466v = u02Var.m8466v();
        if (q02VarM8233A.f13191h) {
            q02VarM8233A.m6298m();
            q02VarM8233A.f13191h = false;
        }
        r02.m8236D((r02) q02VarM8233A.f13190g, x02VarM8466v);
        if (q02VarM8233A.f13191h) {
            q02VarM8233A.m6298m();
            q02VarM8233A.f13191h = false;
        }
        ((r02) q02VarM8233A.f13190g).zzb = 0;
        return q02VarM8233A.m6300o();
    }
}
