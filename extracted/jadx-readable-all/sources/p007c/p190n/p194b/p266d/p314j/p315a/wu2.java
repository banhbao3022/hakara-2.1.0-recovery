package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wu2 extends g82<wu2, vu2> implements m92 {
    private static final wu2 zzh;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        wu2 wu2Var = new wu2();
        zzh = wu2Var;
        g82.m6957t(wu2.class, wu2Var);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m8694A(wu2 wu2Var, int i) {
        wu2Var.zzb |= 4;
        wu2Var.zzg = i;
    }

    /* JADX INFO: renamed from: v */
    public static vu2 m8695v() {
        return zzh.m6963o();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m8697y(wu2 wu2Var, int i) {
        wu2Var.zzb |= 1;
        wu2Var.zze = i;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m8698z(wu2 wu2Var, int i) {
        wu2Var.zzb |= 2;
        wu2Var.zzf = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new wu2();
        }
        es2 es2Var = null;
        if (i2 == 4) {
            return new vu2(es2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzh;
    }
}
