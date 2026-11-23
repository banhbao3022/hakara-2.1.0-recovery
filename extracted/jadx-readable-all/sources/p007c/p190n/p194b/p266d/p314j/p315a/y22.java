package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class y22 extends g82<y22, x22> implements m92 {
    private static final y22 zzg;
    private b32 zzb;
    private int zze;
    private int zzf;

    static {
        y22 y22Var = new y22();
        zzg = y22Var;
        g82.m6957t(y22.class, y22Var);
    }

    /* JADX INFO: renamed from: y */
    public static y22 m8772y(g72 g72Var, s72 s72Var) throws r82 {
        return (y22) g82.m6955n(zzg, g72Var, s72Var);
    }

    /* JADX INFO: renamed from: z */
    public static y22 m8773z() {
        return zzg;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new y22();
        }
        w22 w22Var = null;
        if (i2 == 4) {
            return new x22(w22Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    /* JADX INFO: renamed from: v */
    public final b32 m8774v() {
        b32 b32Var = this.zzb;
        return b32Var == null ? b32.m5921y() : b32Var;
    }

    /* JADX INFO: renamed from: x */
    public final int m8775x() {
        return this.zze;
    }
}
