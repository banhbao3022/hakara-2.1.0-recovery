package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class v22 extends g82<v22, u22> implements m92 {
    private static final v22 zzg;
    private int zzb;
    private b32 zze;
    private g72 zzf = g72.f14513f;

    static {
        v22 v22Var = new v22();
        zzg = v22Var;
        g82.m6957t(v22.class, v22Var);
    }

    /* JADX INFO: renamed from: A */
    public static u22 m8527A() {
        return zzg.m6963o();
    }

    /* JADX INFO: renamed from: B */
    public static v22 m8528B() {
        return zzg;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m8531E(v22 v22Var, b32 b32Var) {
        b32Var.getClass();
        v22Var.zze = b32Var;
    }

    /* JADX INFO: renamed from: z */
    public static v22 m8533z(g72 g72Var, s72 s72Var) throws r82 {
        return (v22) g82.m6955n(zzg, g72Var, s72Var);
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
            return new v22();
        }
        t22 t22Var = null;
        if (i2 == 4) {
            return new u22(t22Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    /* JADX INFO: renamed from: v */
    public final int m8534v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final b32 m8535x() {
        b32 b32Var = this.zze;
        return b32Var == null ? b32.m5921y() : b32Var;
    }

    /* JADX INFO: renamed from: y */
    public final g72 m8536y() {
        return this.zzf;
    }
}
