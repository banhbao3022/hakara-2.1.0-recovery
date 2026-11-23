package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dz1 implements i52 {

    /* JADX INFO: renamed from: a */
    public final String f13441a;

    /* JADX INFO: renamed from: b */
    public final int f13442b;

    /* JADX INFO: renamed from: c */
    public a12 f13443c;

    /* JADX INFO: renamed from: d */
    public b02 f13444d;

    /* JADX INFO: renamed from: e */
    public int f13445e;

    /* JADX INFO: renamed from: f */
    public n12 f13446f;

    public dz1(k32 k32Var) throws GeneralSecurityException {
        String strM7434v = k32Var.m7434v();
        this.f13441a = strM7434v;
        if (strM7434v.equals(ex1.f13747b)) {
            try {
                d12 d12VarM6275x = d12.m6275x(k32Var.m7435x(), s72.m8347a());
                this.f13443c = (a12) cx1.m6262f(k32Var);
                this.f13442b = d12VarM6275x.m6277v();
                return;
            } catch (r82 e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (strM7434v.equals(ex1.f13746a)) {
            try {
                e02 e02VarM6575y = e02.m6575y(k32Var.m7435x(), s72.m8347a());
                this.f13444d = (b02) cx1.m6262f(k32Var);
                this.f13445e = e02VarM6575y.m6577v().m7571x();
                this.f13442b = this.f13445e + e02VarM6575y.m6578x().m8775x();
                return;
            } catch (r82 e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        }
        if (!strM7434v.equals(qy1.f18666a)) {
            String strValueOf = String.valueOf(strM7434v);
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(strValueOf) : new String("unsupported AEAD DEM key type: "));
        }
        try {
            q12 q12VarM8180x = q12.m8180x(k32Var.m7435x(), s72.m8347a());
            this.f13446f = (n12) cx1.m6262f(k32Var);
            this.f13442b = q12VarM8180x.m8182v();
        } catch (r82 e3) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
        }
    }
}
