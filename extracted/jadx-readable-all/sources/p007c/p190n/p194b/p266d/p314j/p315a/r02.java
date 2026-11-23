package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class r02 extends g82<r02, q02> implements m92 {
    private static final r02 zzg;
    private int zzb;
    private x02 zze;
    private g72 zzf = g72.f14513f;

    static {
        r02 r02Var = new r02();
        zzg = r02Var;
        g82.m6957t(r02.class, r02Var);
    }

    /* JADX INFO: renamed from: A */
    public static q02 m8233A() {
        return zzg.m6963o();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m8236D(r02 r02Var, x02 x02Var) {
        x02Var.getClass();
        r02Var.zze = x02Var;
    }

    /* JADX INFO: renamed from: z */
    public static r02 m8238z(g72 g72Var, s72 s72Var) throws r82 {
        return (r02) g82.m6955n(zzg, g72Var, s72Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new r02();
        }
        p02 p02Var = null;
        if (i2 == 4) {
            return new q02(p02Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    /* JADX INFO: renamed from: v */
    public final int m8239v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final x02 m8240x() {
        x02 x02Var = this.zze;
        return x02Var == null ? x02.m8711x() : x02Var;
    }

    /* JADX INFO: renamed from: y */
    public final g72 m8241y() {
        return this.zzf;
    }
}
