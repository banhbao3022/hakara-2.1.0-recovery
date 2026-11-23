package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class a22 extends g82<a22, z12> implements m92 {
    private static final a22 zze;
    private k32 zzb;

    static {
        a22 a22Var = new a22();
        zze = a22Var;
        g82.m6957t(a22.class, a22Var);
    }

    /* JADX INFO: renamed from: x */
    public static a22 m5680x() {
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
            return new u92(zze, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new a22();
        }
        y12 y12Var = null;
        if (i2 == 4) {
            return new z12(y12Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }

    /* JADX INFO: renamed from: v */
    public final k32 m5682v() {
        k32 k32Var = this.zzb;
        return k32Var == null ? k32.m7432y() : k32Var;
    }
}
