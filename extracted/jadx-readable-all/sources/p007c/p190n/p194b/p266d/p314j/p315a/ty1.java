package p007c.p190n.p194b.p266d.p314j.p315a;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ty1 extends lw1<fw1, k22> {
    public ty1(Class cls) {
        super(cls);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lw1
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ fw1 mo5892a(k22 k22Var) throws GeneralSecurityException {
        k22 k22Var2 = k22Var;
        g22 g22VarM7767x = k22Var2.m7429x().m7767x();
        q22 q22VarM6919v = g22VarM7767x.m6919v();
        int iM5377h2 = C2622l.m5377h2(q22VarM6919v.m8185v());
        byte[] bArrM6948O = k22Var2.m7430y().m6948O();
        return new j52((ECPrivateKey) p52.f17860g.m8079a("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArrM6948O), C2622l.m5306R2(iM5377h2))), q22VarM6919v.m8187y().m6948O(), C2622l.m5297P1(q22VarM6919v.m8186x()), C2622l.m5255G2(g22VarM7767x.m6921y()), new dz1(g22VarM7767x.m6920x().m5682v()));
    }
}
