package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class uy1 extends jw1<d22, k22> {
    public uy1(vy1 vy1Var, Class cls) {
        super(cls);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6123a(l92 l92Var) throws GeneralSecurityException {
        C2622l.m5324W0(((d22) l92Var).m6281v());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ l92 mo6124b(g72 g72Var) throws r82 {
        return d22.m6279x(g72Var, s72.m8347a());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jw1
    /* JADX INFO: renamed from: c */
    public final k22 mo6125c(l92 l92Var) throws GeneralSecurityException {
        d22 d22Var = (d22) l92Var;
        ECParameterSpec eCParameterSpecM5306R2 = C2622l.m5306R2(C2622l.m5377h2(d22Var.m6281v().m6919v().m8185v()));
        KeyPairGenerator keyPairGeneratorM8079a = p52.f17859f.m8079a("EC");
        keyPairGeneratorM8079a.initialize(eCParameterSpecM5306R2);
        KeyPair keyPairGenerateKeyPair = keyPairGeneratorM8079a.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
        ECPoint w = eCPublicKey.getW();
        m22 m22VarM7759B = n22.m7759B();
        if (m22VarM7759B.f13191h) {
            m22VarM7759B.m6298m();
            m22VarM7759B.f13191h = false;
        }
        ((n22) m22VarM7759B.f13190g).zzb = 0;
        g22 g22VarM6281v = d22Var.m6281v();
        if (m22VarM7759B.f13191h) {
            m22VarM7759B.m6298m();
            m22VarM7759B.f13191h = false;
        }
        n22.m7763F((n22) m22VarM7759B.f13190g, g22VarM6281v);
        g72 g72VarM6940H = g72.m6940H(w.getAffineX().toByteArray());
        if (m22VarM7759B.f13191h) {
            m22VarM7759B.m6298m();
            m22VarM7759B.f13191h = false;
        }
        ((n22) m22VarM7759B.f13190g).zzf = g72VarM6940H;
        g72 g72VarM6940H2 = g72.m6940H(w.getAffineY().toByteArray());
        if (m22VarM7759B.f13191h) {
            m22VarM7759B.m6298m();
            m22VarM7759B.f13191h = false;
        }
        ((n22) m22VarM7759B.f13190g).zzg = g72VarM6940H2;
        n22 n22VarM6300o = m22VarM7759B.m6300o();
        i22 i22VarM7422A = k22.m7422A();
        if (i22VarM7422A.f13191h) {
            i22VarM7422A.m6298m();
            i22VarM7422A.f13191h = false;
        }
        ((k22) i22VarM7422A.f13190g).zzb = 0;
        if (i22VarM7422A.f13191h) {
            i22VarM7422A.m6298m();
            i22VarM7422A.f13191h = false;
        }
        k22.m7425D((k22) i22VarM7422A.f13190g, n22VarM6300o);
        g72 g72VarM6940H3 = g72.m6940H(eCPrivateKey.getS().toByteArray());
        if (i22VarM7422A.f13191h) {
            i22VarM7422A.m6298m();
            i22VarM7422A.f13191h = false;
        }
        ((k22) i22VarM7422A.f13190g).zzf = g72VarM6940H3;
        return i22VarM7422A.m6300o();
    }
}
