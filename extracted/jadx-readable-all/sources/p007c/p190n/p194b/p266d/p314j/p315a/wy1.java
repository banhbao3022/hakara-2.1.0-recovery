package p007c.p190n.p194b.p266d.p314j.p315a;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wy1 extends lw1<gw1, n22> {
    public wy1(Class cls) {
        super(cls);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lw1
    /* JADX INFO: renamed from: a */
    public final gw1 mo5892a(n22 n22Var) throws GeneralSecurityException {
        n22 n22Var2 = n22Var;
        g22 g22VarM7767x = n22Var2.m7767x();
        q22 q22VarM6919v = g22VarM7767x.m6919v();
        int iM5377h2 = C2622l.m5377h2(q22VarM6919v.m8185v());
        byte[] bArrM6948O = n22Var2.m7768y().m6948O();
        byte[] bArrM6948O2 = n22Var2.m7769z().m6948O();
        ECParameterSpec eCParameterSpecM5306R2 = C2622l.m5306R2(iM5377h2);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArrM6948O), new BigInteger(1, bArrM6948O2));
        C2622l.m5361e1(eCPoint, eCParameterSpecM5306R2.getCurve());
        return new k52((ECPublicKey) p52.f17860g.m8079a("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecM5306R2)), q22VarM6919v.m8187y().m6948O(), C2622l.m5297P1(q22VarM6919v.m8186x()), C2622l.m5255G2(g22VarM7767x.m6921y()), new dz1(g22VarM7767x.m6920x().m5682v()));
    }
}
