package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tv2 extends g82<tv2, sv2> implements m92 {
    private static final tv2 zzg;
    private int zzb;
    private boolean zze;
    private int zzf;

    static {
        tv2 tv2Var = new tv2();
        zzg = tv2Var;
        g82.m6957t(tv2.class, tv2Var);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m8458A(tv2 tv2Var, int i) {
        tv2Var.zzb |= 2;
        tv2Var.zzf = i;
    }

    /* JADX INFO: renamed from: x */
    public static sv2 m8459x() {
        return zzg.m6963o();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m8461z(tv2 tv2Var, boolean z) {
        tv2Var.zzb |= 1;
        tv2Var.zze = z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new tv2();
        }
        es2 es2Var = null;
        if (i2 == 4) {
            return new sv2(es2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m8462v() {
        return this.zze;
    }
}
