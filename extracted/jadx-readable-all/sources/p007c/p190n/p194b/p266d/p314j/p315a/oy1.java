package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class oy1 extends jw1<q12, n12> {
    public oy1(py1 py1Var, Class cls) {
        super(cls);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6123a(l92 l92Var) throws GeneralSecurityException {
        q12 q12Var = (q12) l92Var;
        if (q12Var.m8182v() == 64) {
            return;
        }
        int iM8182v = q12Var.m8182v();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(iM8182v);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidAlgorithmParameterException(sb.toString());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ l92 mo6124b(g72 g72Var) throws r82 {
        return q12.m8180x(g72Var, s72.m8347a());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: c */
    public final n12 mo6125c(l92 l92Var) throws GeneralSecurityException {
        m12 m12VarM7754z = n12.m7754z();
        byte[] bArrM6935a = g62.m6935a(((q12) l92Var).m8182v());
        g72 g72VarM6939G = g72.m6939G(bArrM6935a, 0, bArrM6935a.length);
        if (m12VarM7754z.f13191h) {
            m12VarM7754z.m6298m();
            m12VarM7754z.f13191h = false;
        }
        ((n12) m12VarM7754z.f13190g).zze = g72VarM6939G;
        if (m12VarM7754z.f13191h) {
            m12VarM7754z.m6298m();
            m12VarM7754z.f13191h = false;
        }
        ((n12) m12VarM7754z.f13190g).zzb = 0;
        return m12VarM7754z.m6300o();
    }
}
