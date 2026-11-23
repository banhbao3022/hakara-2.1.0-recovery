package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class g22 extends g82<g22, f22> implements m92 {
    private static final g22 zzg;
    private q22 zzb;
    private a22 zze;
    private int zzf;

    static {
        g22 g22Var = new g22();
        zzg = g22Var;
        g82.m6957t(g22.class, g22Var);
    }

    /* JADX INFO: renamed from: z */
    public static g22 m6918z() {
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
            return new u92(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new g22();
        }
        e22 e22Var = null;
        if (i2 == 4) {
            return new f22(e22Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    /* JADX INFO: renamed from: v */
    public final q22 m6919v() {
        q22 q22Var = this.zzb;
        return q22Var == null ? q22.m8184z() : q22Var;
    }

    /* JADX INFO: renamed from: x */
    public final a22 m6920x() {
        a22 a22Var = this.zze;
        return a22Var == null ? a22.m5680x() : a22Var;
    }

    /* JADX INFO: renamed from: y */
    public final x12 m6921y() {
        x12 x12Var;
        int i = this.zzf;
        if (i == 0) {
            x12Var = x12.UNKNOWN_FORMAT;
        } else if (i == 1) {
            x12Var = x12.UNCOMPRESSED;
        } else if (i != 2) {
            x12Var = i != 3 ? null : x12.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        } else {
            x12Var = x12.COMPRESSED;
        }
        return x12Var == null ? x12.UNRECOGNIZED : x12Var;
    }
}
