package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zb2 extends g82<zb2, wb2> implements m92 {
    private static final zb2 zzh;
    private int zzb;
    private int zze;
    private String zzf = "";
    private g72 zzg = g72.f14513f;

    static {
        zb2 zb2Var = new zb2();
        zzh = zb2Var;
        g82.m6957t(zb2.class, zb2Var);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m8875A(zb2 zb2Var, g72 g72Var) {
        g72Var.getClass();
        zb2Var.zzb |= 4;
        zb2Var.zzg = g72Var;
    }

    /* JADX INFO: renamed from: v */
    public static wb2 m8876v() {
        return zzh.m6963o();
    }

    /* JADX INFO: renamed from: y */
    public static void m8878y(zb2 zb2Var, yb2 yb2Var) {
        zb2Var.zze = yb2Var.f21840i;
        zb2Var.zzb |= 1;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m8879z(zb2 zb2Var) {
        zb2Var.zzb |= 2;
        zb2Var.zzf = "image/png";
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", xb2.f21482a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zb2();
        }
        fb2 fb2Var = null;
        if (i2 == 4) {
            return new wb2(fb2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzh;
    }
}
