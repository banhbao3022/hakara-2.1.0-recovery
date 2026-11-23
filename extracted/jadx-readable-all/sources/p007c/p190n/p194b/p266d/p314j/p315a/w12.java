package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class w12 extends g82<w12, v12> implements m92 {
    private static final w12 zzb;

    static {
        w12 w12Var = new w12();
        zzb = w12Var;
        g82.m6957t(w12.class, w12Var);
    }

    /* JADX INFO: renamed from: v */
    public static w12 m8604v(g72 g72Var, s72 s72Var) throws r82 {
        return (w12) g82.m6955n(zzb, g72Var, s72Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        u12 u12Var = null;
        if (i2 == 2) {
            return new u92(zzb, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new w12();
        }
        if (i2 == 4) {
            return new v12(u12Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
