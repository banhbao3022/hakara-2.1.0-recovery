package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class i71 extends g82<i71, h61> implements m92 {
    private static final i71 zzi;
    private int zzb;
    private g72 zze;
    private g72 zzf;
    private g72 zzg;
    private g72 zzh;

    static {
        i71 i71Var = new i71();
        zzi = i71Var;
        g82.m6957t(i71.class, i71Var);
    }

    public i71() {
        g72 g72Var = g72.f14513f;
        this.zze = g72Var;
        this.zzf = g72Var;
        this.zzg = g72Var;
        this.zzh = g72Var;
    }

    /* JADX INFO: renamed from: A */
    public static i71 m7195A(byte[] bArr, s72 s72Var) throws r82 {
        g82 g82VarM6954m = g82.m6954m(zzi, bArr, 0, bArr.length, s72Var);
        g82.m6950i(g82VarM6954m);
        return (i71) g82VarM6954m;
    }

    /* JADX INFO: renamed from: B */
    public static h61 m7196B() {
        return zzi.m6963o();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m7198D(i71 i71Var, g72 g72Var) {
        i71Var.zzb |= 1;
        i71Var.zze = g72Var;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m7199E(i71 i71Var, g72 g72Var) {
        i71Var.zzb |= 2;
        i71Var.zzf = g72Var;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m7200F(i71 i71Var, g72 g72Var) {
        i71Var.zzb |= 4;
        i71Var.zzg = g72Var;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m7201G(i71 i71Var, g72 g72Var) {
        i71Var.zzb |= 8;
        i71Var.zzh = g72Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new i71();
        }
        fn0 fn0Var = null;
        if (i2 == 4) {
            return new h61(fn0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzi;
    }

    /* JADX INFO: renamed from: v */
    public final g72 m7202v() {
        return this.zze;
    }

    /* JADX INFO: renamed from: x */
    public final g72 m7203x() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: y */
    public final g72 m7204y() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: z */
    public final g72 m7205z() {
        return this.zzh;
    }
}
