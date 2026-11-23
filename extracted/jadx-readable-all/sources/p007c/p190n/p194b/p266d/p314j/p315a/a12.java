package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class a12 extends g82<a12, z02> implements m92 {
    private static final a12 zzf;
    private int zzb;
    private g72 zze = g72.f14513f;

    static {
        a12 a12Var = new a12();
        zzf = a12Var;
        g82.m6957t(a12.class, a12Var);
    }

    /* JADX INFO: renamed from: y */
    public static a12 m5661y(g72 g72Var, s72 s72Var) throws r82 {
        return (a12) g82.m6955n(zzf, g72Var, s72Var);
    }

    /* JADX INFO: renamed from: z */
    public static z02 m5662z() {
        return zzf.m6963o();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzf, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new a12();
        }
        y02 y02Var = null;
        if (i2 == 4) {
            return new z02(y02Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    /* JADX INFO: renamed from: v */
    public final int m5664v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final g72 m5665x() {
        return this.zze;
    }
}
