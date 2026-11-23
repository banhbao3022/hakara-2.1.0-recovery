package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class q12 extends g82<q12, p12> implements m92 {
    private static final q12 zze;
    private int zzb;

    static {
        q12 q12Var = new q12();
        zze = q12Var;
        g82.m6957t(q12.class, q12Var);
    }

    /* JADX INFO: renamed from: x */
    public static q12 m8180x(g72 g72Var, s72 s72Var) throws r82 {
        return (q12) g82.m6955n(zze, g72Var, s72Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new q12();
        }
        o12 o12Var = null;
        if (i2 == 4) {
            return new p12(o12Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }

    /* JADX INFO: renamed from: v */
    public final int m8182v() {
        return this.zzb;
    }
}
