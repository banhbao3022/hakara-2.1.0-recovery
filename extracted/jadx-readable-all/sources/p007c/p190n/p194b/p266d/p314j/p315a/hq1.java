package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class hq1 extends g82<hq1, gq1> implements m92 {
    private static final l82<Integer, fq1> zzf = new dq1();
    private static final hq1 zzj;
    private int zzb;
    private k82 zze = h82.f14787g;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        hq1 hq1Var = new hq1();
        zzj = hq1Var;
        g82.m6957t(hq1.class, hq1Var);
    }

    /* JADX INFO: renamed from: v */
    public static gq1 m7153v() {
        return zzj.m6963o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public static void m7155y(hq1 hq1Var, fq1 fq1Var) {
        fq1Var.getClass();
        k82 k82Var = hq1Var.zze;
        if (!((u62) k82Var).f20226f) {
            hq1Var.zze = g82.m6952k(k82Var);
        }
        ((h82) hq1Var.zze).m7102j(fq1Var.f14098i);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m7156z(hq1 hq1Var, String str) {
        str.getClass();
        hq1Var.zzb |= 1;
        hq1Var.zzg = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzj, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzb", "zze", eq1.f13647a, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new hq1();
        }
        dq1 dq1Var = null;
        if (i2 == 4) {
            return new gq1(dq1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzj;
    }
}
