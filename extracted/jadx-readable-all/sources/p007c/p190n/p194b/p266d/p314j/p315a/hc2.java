package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class hc2 extends g82<hc2, gc2> implements m92 {
    private static final hc2 zzh;
    private int zzb;
    private String zze = "";
    private long zzf;
    private boolean zzg;

    static {
        hc2 hc2Var = new hc2();
        zzh = hc2Var;
        g82.m6957t(hc2.class, hc2Var);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m7110A(hc2 hc2Var, boolean z) {
        hc2Var.zzb |= 4;
        hc2Var.zzg = z;
    }

    /* JADX INFO: renamed from: v */
    public static gc2 m7111v() {
        return zzh.m6963o();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m7113y(hc2 hc2Var, String str) {
        hc2Var.zzb |= 1;
        hc2Var.zze = str;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m7114z(hc2 hc2Var, long j2) {
        hc2Var.zzb |= 2;
        hc2Var.zzf = j2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new hc2();
        }
        fb2 fb2Var = null;
        if (i2 == 4) {
            return new gc2(fb2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzh;
    }
}
