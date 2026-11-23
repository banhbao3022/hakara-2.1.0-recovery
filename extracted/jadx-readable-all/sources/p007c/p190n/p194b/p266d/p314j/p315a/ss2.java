package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ss2 extends g82<ss2, rs2> implements m92 {
    private static final ss2 zzh;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        ss2 ss2Var = new ss2();
        zzh = ss2Var;
        g82.m6957t(ss2.class, ss2Var);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m8363A(ss2 ss2Var, int i) {
        ss2Var.zzb |= 4;
        ss2Var.zzg = i;
    }

    /* JADX INFO: renamed from: v */
    public static rs2 m8364v() {
        return zzh.m6963o();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m8366y(ss2 ss2Var, boolean z) {
        ss2Var.zzb |= 1;
        ss2Var.zze = z;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m8367z(ss2 ss2Var, boolean z) {
        ss2Var.zzb |= 2;
        ss2Var.zzf = z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new ss2();
        }
        es2 es2Var = null;
        if (i2 == 4) {
            return new rs2(es2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzh;
    }
}
