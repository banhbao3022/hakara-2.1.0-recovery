package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class b02 extends g82<b02, a02> implements m92 {
    private static final b02 zzg;
    private int zzb;
    private h02 zze;
    private v22 zzf;

    static {
        b02 b02Var = new b02();
        zzg = b02Var;
        g82.m6957t(b02.class, b02Var);
    }

    /* JADX INFO: renamed from: A */
    public static a02 m5899A() {
        return zzg.m6963o();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m5902D(b02 b02Var, h02 h02Var) {
        h02Var.getClass();
        b02Var.zze = h02Var;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m5903E(b02 b02Var, v22 v22Var) {
        v22Var.getClass();
        b02Var.zzf = v22Var;
    }

    /* JADX INFO: renamed from: z */
    public static b02 m5904z(g72 g72Var, s72 s72Var) throws r82 {
        return (b02) g82.m6955n(zzg, g72Var, s72Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new b02();
        }
        zz1 zz1Var = null;
        if (i2 == 4) {
            return new a02(zz1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    /* JADX INFO: renamed from: v */
    public final int m5905v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final h02 m5906x() {
        h02 h02Var = this.zze;
        return h02Var == null ? h02.m7044B() : h02Var;
    }

    /* JADX INFO: renamed from: y */
    public final v22 m5907y() {
        v22 v22Var = this.zzf;
        return v22Var == null ? v22.m8528B() : v22Var;
    }
}
