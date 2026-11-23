package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class g42 extends g82<g42, f42> implements m92 {
    private static final g42 zzf;
    private int zzb;
    private k42 zze;

    static {
        g42 g42Var = new g42();
        zzf = g42Var;
        g82.m6957t(g42.class, g42Var);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m6929C(g42 g42Var, k42 k42Var) {
        k42Var.getClass();
        g42Var.zze = k42Var;
    }

    /* JADX INFO: renamed from: y */
    public static g42 m6930y(g72 g72Var, s72 s72Var) throws r82 {
        return (g42) g82.m6955n(zzf, g72Var, s72Var);
    }

    /* JADX INFO: renamed from: z */
    public static f42 m6931z() {
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
            return new g42();
        }
        e42 e42Var = null;
        if (i2 == 4) {
            return new f42(e42Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    /* JADX INFO: renamed from: v */
    public final int m6932v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final k42 m6933x() {
        k42 k42Var = this.zze;
        return k42Var == null ? k42.m7438z() : k42Var;
    }
}
