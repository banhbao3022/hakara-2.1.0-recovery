package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class d22 extends g82<d22, c22> implements m92 {
    private static final d22 zze;
    private g22 zzb;

    static {
        d22 d22Var = new d22();
        zze = d22Var;
        g82.m6957t(d22.class, d22Var);
    }

    /* JADX INFO: renamed from: x */
    public static d22 m6279x(g72 g72Var, s72 s72Var) throws r82 {
        return (d22) g82.m6955n(zze, g72Var, s72Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new d22();
        }
        b22 b22Var = null;
        if (i2 == 4) {
            return new c22(b22Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }

    /* JADX INFO: renamed from: v */
    public final g22 m6281v() {
        g22 g22Var = this.zzb;
        return g22Var == null ? g22.m6918z() : g22Var;
    }
}
