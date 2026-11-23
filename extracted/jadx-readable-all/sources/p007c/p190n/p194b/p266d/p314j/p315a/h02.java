package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class h02 extends g82<h02, g02> implements m92 {
    private static final h02 zzg;
    private int zzb;
    private o02 zze;
    private g72 zzf = g72.f14513f;

    static {
        h02 h02Var = new h02();
        zzg = h02Var;
        g82.m6957t(h02.class, h02Var);
    }

    /* JADX INFO: renamed from: A */
    public static g02 m7043A() {
        return zzg.m6963o();
    }

    /* JADX INFO: renamed from: B */
    public static h02 m7044B() {
        return zzg;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m7047E(h02 h02Var, o02 o02Var) {
        o02Var.getClass();
        h02Var.zze = o02Var;
    }

    /* JADX INFO: renamed from: z */
    public static h02 m7049z(g72 g72Var, s72 s72Var) throws r82 {
        return (h02) g82.m6955n(zzg, g72Var, s72Var);
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
            return new h02();
        }
        f02 f02Var = null;
        if (i2 == 4) {
            return new g02(f02Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    /* JADX INFO: renamed from: v */
    public final int m7050v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final o02 m7051x() {
        o02 o02Var = this.zze;
        return o02Var == null ? o02.m7954x() : o02Var;
    }

    /* JADX INFO: renamed from: y */
    public final g72 m7052y() {
        return this.zzf;
    }
}
