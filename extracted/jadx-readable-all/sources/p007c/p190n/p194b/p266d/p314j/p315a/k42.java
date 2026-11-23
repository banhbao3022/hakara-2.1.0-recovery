package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class k42 extends g82<k42, j42> implements m92 {
    private static final k42 zzf;
    private String zzb = "";
    private k32 zze;

    static {
        k42 k42Var = new k42();
        zzf = k42Var;
        g82.m6957t(k42.class, k42Var);
    }

    /* JADX INFO: renamed from: y */
    public static k42 m7437y(g72 g72Var, s72 s72Var) throws r82 {
        return (k42) g82.m6955n(zzf, g72Var, s72Var);
    }

    /* JADX INFO: renamed from: z */
    public static k42 m7438z() {
        return zzf;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new k42();
        }
        i42 i42Var = null;
        if (i2 == 4) {
            return new j42(i42Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    /* JADX INFO: renamed from: v */
    public final String m7439v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final k32 m7440x() {
        k32 k32Var = this.zze;
        return k32Var == null ? k32.m7432y() : k32Var;
    }
}
