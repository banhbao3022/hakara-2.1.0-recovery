package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class q22 extends g82<q22, p22> implements m92 {
    private static final q22 zzg;
    private int zzb;
    private int zze;
    private g72 zzf = g72.f14513f;

    static {
        q22 q22Var = new q22();
        zzg = q22Var;
        g82.m6957t(q22.class, q22Var);
    }

    /* JADX INFO: renamed from: z */
    public static q22 m8184z() {
        return zzg;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzg, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new q22();
        }
        o22 o22Var = null;
        if (i2 == 4) {
            return new p22(o22Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    /* JADX INFO: renamed from: v */
    public final r22 m8185v() {
        r22 r22Var;
        int i = this.zzb;
        if (i == 0) {
            r22Var = r22.UNKNOWN_CURVE;
        } else if (i == 2) {
            r22Var = r22.NIST_P256;
        } else if (i == 3) {
            r22Var = r22.NIST_P384;
        } else if (i != 4) {
            r22Var = i != 5 ? null : r22.CURVE25519;
        } else {
            r22Var = r22.NIST_P521;
        }
        return r22Var == null ? r22.UNRECOGNIZED : r22Var;
    }

    /* JADX INFO: renamed from: x */
    public final s22 m8186x() {
        s22 s22VarM8340f = s22.m8340f(this.zze);
        return s22VarM8340f == null ? s22.UNRECOGNIZED : s22VarM8340f;
    }

    /* JADX INFO: renamed from: y */
    public final g72 m8187y() {
        return this.zzf;
    }
}
