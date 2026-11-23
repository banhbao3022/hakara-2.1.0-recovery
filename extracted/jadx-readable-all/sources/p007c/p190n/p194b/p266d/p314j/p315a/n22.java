package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class n22 extends g82<n22, m22> implements m92 {
    private static final n22 zzh;
    private int zzb;
    private g22 zze;
    private g72 zzf;
    private g72 zzg;

    static {
        n22 n22Var = new n22();
        zzh = n22Var;
        g82.m6957t(n22.class, n22Var);
    }

    public n22() {
        g72 g72Var = g72.f14513f;
        this.zzf = g72Var;
        this.zzg = g72Var;
    }

    /* JADX INFO: renamed from: A */
    public static n22 m7758A(g72 g72Var, s72 s72Var) throws r82 {
        return (n22) g82.m6955n(zzh, g72Var, s72Var);
    }

    /* JADX INFO: renamed from: B */
    public static m22 m7759B() {
        return zzh.m6963o();
    }

    /* JADX INFO: renamed from: C */
    public static n22 m7760C() {
        return zzh;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m7763F(n22 n22Var, g22 g22Var) {
        g22Var.getClass();
        n22Var.zze = g22Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new n22();
        }
        l22 l22Var = null;
        if (i2 == 4) {
            return new m22(l22Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzh;
    }

    /* JADX INFO: renamed from: v */
    public final int m7766v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final g22 m7767x() {
        g22 g22Var = this.zze;
        return g22Var == null ? g22.m6918z() : g22Var;
    }

    /* JADX INFO: renamed from: y */
    public final g72 m7768y() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: z */
    public final g72 m7769z() {
        return this.zzg;
    }
}
