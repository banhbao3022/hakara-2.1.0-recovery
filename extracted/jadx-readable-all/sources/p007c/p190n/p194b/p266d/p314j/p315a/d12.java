package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class d12 extends g82<d12, c12> implements m92 {
    private static final d12 zzf;
    private int zzb;
    private int zze;

    static {
        d12 d12Var = new d12();
        zzf = d12Var;
        g82.m6957t(d12.class, d12Var);
    }

    /* JADX INFO: renamed from: x */
    public static d12 m6275x(g72 g72Var, s72 s72Var) throws r82 {
        return (d12) g82.m6955n(zzf, g72Var, s72Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzf, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new d12();
        }
        b12 b12Var = null;
        if (i2 == 4) {
            return new c12(b12Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    /* JADX INFO: renamed from: v */
    public final int m6277v() {
        return this.zzb;
    }
}
