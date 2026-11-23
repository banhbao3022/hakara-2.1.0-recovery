package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class a42 extends g82<a42, z32> implements m92 {
    private static final a42 zzf;
    private int zzb;
    private d42 zze;

    static {
        a42 a42Var = new a42();
        zzf = a42Var;
        g82.m6957t(a42.class, a42Var);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m5688C(a42 a42Var, d42 d42Var) {
        d42Var.getClass();
        a42Var.zze = d42Var;
    }

    /* JADX INFO: renamed from: y */
    public static a42 m5689y(g72 g72Var, s72 s72Var) throws r82 {
        return (a42) g82.m6955n(zzf, g72Var, s72Var);
    }

    /* JADX INFO: renamed from: z */
    public static z32 m5690z() {
        return zzf.m6963o();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new a42();
        }
        y32 y32Var = null;
        if (i2 == 4) {
            return new z32(y32Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    /* JADX INFO: renamed from: v */
    public final int m5691v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final d42 m5692x() {
        d42 d42Var = this.zze;
        return d42Var == null ? d42.m6284y() : d42Var;
    }
}
