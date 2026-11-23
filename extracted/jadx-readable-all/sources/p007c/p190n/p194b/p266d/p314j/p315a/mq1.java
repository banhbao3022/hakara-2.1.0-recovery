package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mq1 extends g82<mq1, jq1> implements m92 {
    private static final mq1 zzi;
    private int zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private hq1 zzh;

    static {
        mq1 mq1Var = new mq1();
        zzi = mq1Var;
        g82.m6957t(mq1.class, mq1Var);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m7722A(mq1 mq1Var, hq1 hq1Var) {
        mq1Var.zzh = hq1Var;
        mq1Var.zzb |= 8;
    }

    /* JADX INFO: renamed from: v */
    public static jq1 m7723v() {
        return zzi.m6963o();
    }

    /* JADX INFO: renamed from: y */
    public static void m7725y(mq1 mq1Var, lq1 lq1Var) {
        mq1Var.zze = lq1Var.f16461i;
        mq1Var.zzb |= 1;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m7726z(mq1 mq1Var, String str) {
        str.getClass();
        mq1Var.zzb |= 2;
        mq1Var.zzf = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zze", kq1.f16018a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new mq1();
        }
        iq1 iq1Var = null;
        if (i2 == 4) {
            return new jq1(iq1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzi;
    }
}
