package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class k22 extends g82<k22, i22> implements m92 {
    private static final k22 zzg;
    private int zzb;
    private n22 zze;
    private g72 zzf = g72.f14513f;

    static {
        k22 k22Var = new k22();
        zzg = k22Var;
        g82.m6957t(k22.class, k22Var);
    }

    /* JADX INFO: renamed from: A */
    public static i22 m7422A() {
        return zzg.m6963o();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m7425D(k22 k22Var, n22 n22Var) {
        n22Var.getClass();
        k22Var.zze = n22Var;
    }

    /* JADX INFO: renamed from: z */
    public static k22 m7427z(g72 g72Var, s72 s72Var) throws r82 {
        return (k22) g82.m6955n(zzg, g72Var, s72Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new k22();
        }
        h22 h22Var = null;
        if (i2 == 4) {
            return new i22(h22Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    /* JADX INFO: renamed from: v */
    public final int m7428v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final n22 m7429x() {
        n22 n22Var = this.zze;
        return n22Var == null ? n22.m7760C() : n22Var;
    }

    /* JADX INFO: renamed from: y */
    public final g72 m7430y() {
        return this.zzf;
    }
}
