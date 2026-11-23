package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jz1 extends lw1<qw1, v22> {
    public jz1(Class cls) {
        super(cls);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lw1
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ qw1 mo5892a(v22 v22Var) throws GeneralSecurityException {
        v22 v22Var2 = v22Var;
        s22 s22VarM5923v = v22Var2.m8535x().m5923v();
        SecretKeySpec secretKeySpec = new SecretKeySpec(v22Var2.m8536y().m6948O(), "HMAC");
        int iM5924x = v22Var2.m8535x().m5924x();
        int iOrdinal = s22VarM5923v.ordinal();
        if (iOrdinal == 1) {
            return new d62(new c62("HMACSHA1", secretKeySpec), iM5924x);
        }
        if (iOrdinal == 3) {
            return new d62(new c62("HMACSHA256", secretKeySpec), iM5924x);
        }
        if (iOrdinal == 4) {
            return new d62(new c62("HMACSHA512", secretKeySpec), iM5924x);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
