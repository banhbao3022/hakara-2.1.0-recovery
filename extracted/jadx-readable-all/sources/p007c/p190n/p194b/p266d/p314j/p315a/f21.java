package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class f21 extends g82<f21, f11> implements m92 {
    private static final f21 zzk;
    private int zzb;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;

    static {
        f21 f21Var = new f21();
        zzk = f21Var;
        g82.m6957t(f21.class, f21Var);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m6700A(f21 f21Var, long j2) {
        f21Var.zzb |= 16;
        f21Var.zzi = j2;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m6701B(f21 f21Var, long j2) {
        f21Var.zzb |= 32;
        f21Var.zzj = j2;
    }

    /* JADX INFO: renamed from: v */
    public static f11 m6702v() {
        return zzk.m6963o();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m6704y(f21 f21Var, long j2) {
        f21Var.zzb |= 4;
        f21Var.zzg = j2;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m6705z(f21 f21Var, long j2) {
        f21Var.zzb |= 8;
        f21Var.zzh = j2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new f21();
        }
        fn0 fn0Var = null;
        if (i2 == 4) {
            return new f11(fn0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzk;
    }
}
