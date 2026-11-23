package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ci1 extends g82<ci1, eh1> implements m92 {
    private static final ci1 zzh;
    private int zzb;
    private long zze;
    private String zzf = "";
    private g72 zzg = g72.f14513f;

    static {
        ci1 ci1Var = new ci1();
        zzh = ci1Var;
        g82.m6957t(ci1.class, ci1Var);
    }

    /* JADX INFO: renamed from: y */
    public static ci1 m6189y() {
        return zzh;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzh, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new ci1();
        }
        fn0 fn0Var = null;
        if (i2 == 4) {
            return new eh1(fn0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzh;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m6191v() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final long m6192x() {
        return this.zze;
    }
}
