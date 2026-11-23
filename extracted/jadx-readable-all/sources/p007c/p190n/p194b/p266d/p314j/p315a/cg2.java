package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class cg2 extends g82<cg2, bg2> implements m92 {
    private static final cg2 zzh;
    private int zzb;
    private fg2 zze;
    private g72 zzf;
    private g72 zzg;

    static {
        cg2 cg2Var = new cg2();
        zzh = cg2Var;
        g82.m6957t(cg2.class, cg2Var);
    }

    public cg2() {
        g72 g72Var = g72.f14513f;
        this.zzf = g72Var;
        this.zzg = g72Var;
    }

    /* JADX INFO: renamed from: z */
    public static cg2 m6177z(g72 g72Var, s72 s72Var) throws r82 {
        return (cg2) g82.m6955n(zzh, g72Var, s72Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new cg2();
        }
        ag2 ag2Var = null;
        if (i2 == 4) {
            return new bg2(ag2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzh;
    }

    /* JADX INFO: renamed from: v */
    public final fg2 m6178v() {
        fg2 fg2Var = this.zze;
        return fg2Var == null ? fg2.m6802E() : fg2Var;
    }

    /* JADX INFO: renamed from: x */
    public final g72 m6179x() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: y */
    public final g72 m6180y() {
        return this.zzg;
    }
}
