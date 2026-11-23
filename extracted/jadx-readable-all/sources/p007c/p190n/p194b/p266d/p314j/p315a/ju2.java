package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ju2 extends g82<ju2, gu2> implements m92 {
    private static final ju2 zzl;
    private int zzb;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private o82<fu2> zze = t92.f19797g;
    private String zzi = "";
    private String zzj = "";

    static {
        ju2 ju2Var = new ju2();
        zzl = ju2Var;
        g82.m6957t(ju2.class, ju2Var);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m7392A(ju2 ju2Var, int i) {
        ju2Var.zzb |= 2;
        ju2Var.zzg = i;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m7393B(ju2 ju2Var, long j2) {
        ju2Var.zzb |= 4;
        ju2Var.zzh = j2;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m7394C(ju2 ju2Var, String str) {
        str.getClass();
        ju2Var.zzb |= 8;
        ju2Var.zzi = str;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m7395D(ju2 ju2Var, String str) {
        str.getClass();
        ju2Var.zzb |= 16;
        ju2Var.zzj = str;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m7396E(ju2 ju2Var, long j2) {
        ju2Var.zzb |= 32;
        ju2Var.zzk = j2;
    }

    /* JADX INFO: renamed from: v */
    public static gu2 m7397v() {
        return zzl.m6963o();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m7399y(ju2 ju2Var, Iterable iterable) {
        o82<fu2> o82Var = ju2Var.zze;
        if (!o82Var.zza()) {
            ju2Var.zze = g82.m6953l(o82Var);
        }
        t62.m8399h(iterable, ju2Var.zze);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m7400z(ju2 ju2Var, int i) {
        ju2Var.zzb |= 1;
        ju2Var.zzf = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zzb", "zze", fu2.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new ju2();
        }
        es2 es2Var = null;
        if (i2 == 4) {
            return new gu2(es2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzl;
    }
}
