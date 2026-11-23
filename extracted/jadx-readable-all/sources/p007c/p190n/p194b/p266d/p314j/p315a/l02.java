package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class l02 extends g82<l02, k02> implements m92 {
    private static final l02 zzf;
    private o02 zzb;
    private int zze;

    static {
        l02 l02Var = new l02();
        zzf = l02Var;
        g82.m6957t(l02.class, l02Var);
    }

    /* JADX INFO: renamed from: y */
    public static l02 m7568y(g72 g72Var, s72 s72Var) throws r82 {
        return (l02) g82.m6955n(zzf, g72Var, s72Var);
    }

    /* JADX INFO: renamed from: z */
    public static l02 m7569z() {
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
            return new u92(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new l02();
        }
        j02 j02Var = null;
        if (i2 == 4) {
            return new k02(j02Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    /* JADX INFO: renamed from: v */
    public final o02 m7570v() {
        o02 o02Var = this.zzb;
        return o02Var == null ? o02.m7954x() : o02Var;
    }

    /* JADX INFO: renamed from: x */
    public final int m7571x() {
        return this.zze;
    }
}
