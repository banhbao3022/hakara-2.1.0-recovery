package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class k12 extends g82<k12, i12> implements m92 {
    private static final k12 zzf;
    private int zzb;
    private int zze;

    static {
        k12 k12Var = new k12();
        zzf = k12Var;
        g82.m6957t(k12.class, k12Var);
    }

    /* JADX INFO: renamed from: x */
    public static k12 m7419x(g72 g72Var, s72 s72Var) throws r82 {
        return (k12) g82.m6955n(zzf, g72Var, s72Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzb"});
        }
        if (i2 == 3) {
            return new k12();
        }
        h12 h12Var = null;
        if (i2 == 4) {
            return new i12(h12Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    /* JADX INFO: renamed from: v */
    public final int m7421v() {
        return this.zzb;
    }
}
