package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class au2 extends g82<au2, vt2> implements m92 {
    private static final au2 zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        au2 au2Var = new au2();
        zzg = au2Var;
        g82.m6957t(au2.class, au2Var);
    }

    /* JADX INFO: renamed from: A */
    public static vt2 m5852A() {
        return zzg.m6963o();
    }

    /* JADX INFO: renamed from: B */
    public static au2 m5853B() {
        return zzg;
    }

    /* JADX INFO: renamed from: D */
    public static void m5855D(au2 au2Var, zt2 zt2Var) {
        au2Var.zze = zt2Var.f22403j;
        au2Var.zzb |= 1;
    }

    /* JADX INFO: renamed from: E */
    public static void m5856E(au2 au2Var, xt2 xt2Var) {
        au2Var.zzf = xt2Var.f21679k;
        au2Var.zzb |= 2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", yt2.f21994a, "zzf", wt2.f21362a});
        }
        if (i2 == 3) {
            return new au2();
        }
        es2 es2Var = null;
        if (i2 == 4) {
            return new vt2(es2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m5857v() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final zt2 m5858x() {
        zt2 zt2VarM8907f = zt2.m8907f(this.zze);
        return zt2VarM8907f == null ? zt2.NETWORKTYPE_UNSPECIFIED : zt2VarM8907f;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5859y() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final xt2 m5860z() {
        xt2 xt2VarM8755f = xt2.m8755f(this.zzf);
        return xt2VarM8755f == null ? xt2.CELLULAR_NETWORK_TYPE_UNSPECIFIED : xt2VarM8755f;
    }
}
