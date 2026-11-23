package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class d42 extends g82<d42, c42> implements m92 {
    private static final d42 zze;
    private String zzb = "";

    static {
        d42 d42Var = new d42();
        zze = d42Var;
        g82.m6957t(d42.class, d42Var);
    }

    /* JADX INFO: renamed from: x */
    public static d42 m6283x(g72 g72Var, s72 s72Var) throws r82 {
        return (d42) g82.m6955n(zze, g72Var, s72Var);
    }

    /* JADX INFO: renamed from: y */
    public static d42 m6284y() {
        return zze;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new d42();
        }
        b42 b42Var = null;
        if (i2 == 4) {
            return new c42(b42Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }

    /* JADX INFO: renamed from: v */
    public final String m6286v() {
        return this.zzb;
    }
}
