package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gz1 extends jw1<vz1, sz1> {
    public gz1(Class cls) {
        super(cls);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: a */
    public final void mo6123a(l92 l92Var) throws GeneralSecurityException {
        vz1 vz1Var = (vz1) l92Var;
        hz1.m7180h(vz1Var.m8600x());
        if (vz1Var.m8599v() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ l92 mo6124b(g72 g72Var) throws r82 {
        return vz1.m8597y(g72Var, s72.m8347a());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: c */
    public final sz1 mo6125c(l92 l92Var) throws GeneralSecurityException {
        vz1 vz1Var = (vz1) l92Var;
        rz1 rz1VarM8374A = sz1.m8374A();
        if (rz1VarM8374A.f13191h) {
            rz1VarM8374A.m6298m();
            rz1VarM8374A.f13191h = false;
        }
        ((sz1) rz1VarM8374A.f13190g).zzb = 0;
        byte[] bArrM6935a = g62.m6935a(vz1Var.m8599v());
        g72 g72VarM6939G = g72.m6939G(bArrM6935a, 0, bArrM6935a.length);
        if (rz1VarM8374A.f13191h) {
            rz1VarM8374A.m6298m();
            rz1VarM8374A.f13191h = false;
        }
        ((sz1) rz1VarM8374A.f13190g).zze = g72VarM6939G;
        yz1 yz1VarM8600x = vz1Var.m8600x();
        if (rz1VarM8374A.f13191h) {
            rz1VarM8374A.m6298m();
            rz1VarM8374A.f13191h = false;
        }
        sz1.m8378E((sz1) rz1VarM8374A.f13190g, yz1VarM8600x);
        return rz1VarM8374A.m6300o();
    }
}
