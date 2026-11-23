package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class u02 extends g82<u02, t02> implements m92 {
    private static final u02 zzf;
    private x02 zzb;
    private int zze;

    static {
        u02 u02Var = new u02();
        zzf = u02Var;
        g82.m6957t(u02.class, u02Var);
    }

    /* JADX INFO: renamed from: y */
    public static u02 m8464y(g72 g72Var, s72 s72Var) throws r82 {
        return (u02) g82.m6955n(zzf, g72Var, s72Var);
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
            return new u02();
        }
        s02 s02Var = null;
        if (i2 == 4) {
            return new t02(s02Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    /* JADX INFO: renamed from: v */
    public final x02 m8466v() {
        x02 x02Var = this.zzb;
        return x02Var == null ? x02.m8711x() : x02Var;
    }

    /* JADX INFO: renamed from: x */
    public final int m8467x() {
        return this.zze;
    }
}
