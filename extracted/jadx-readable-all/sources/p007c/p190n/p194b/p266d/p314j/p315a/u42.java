package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class u42 extends g82<u42, t42> implements m92 {
    private static final u42 zzb;

    static {
        u42 u42Var = new u42();
        zzb = u42Var;
        g82.m6957t(u42.class, u42Var);
    }

    /* JADX INFO: renamed from: v */
    public static u42 m8468v(g72 g72Var, s72 s72Var) throws r82 {
        return (u42) g82.m6955n(zzb, g72Var, s72Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        s42 s42Var = null;
        if (i2 == 2) {
            return new u92(zzb, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new u42();
        }
        if (i2 == 4) {
            return new t42(s42Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
