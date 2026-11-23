package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class t12 extends g82<t12, s12> implements m92 {
    private static final t12 zzf;
    private int zzb;
    private g72 zze = g72.f14513f;

    static {
        t12 t12Var = new t12();
        zzf = t12Var;
        g82.m6957t(t12.class, t12Var);
    }

    /* JADX INFO: renamed from: y */
    public static t12 m8387y(g72 g72Var, s72 s72Var) throws r82 {
        return (t12) g82.m6955n(zzf, g72Var, s72Var);
    }

    /* JADX INFO: renamed from: z */
    public static s12 m8388z() {
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
            return new u92(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new t12();
        }
        r12 r12Var = null;
        if (i2 == 4) {
            return new s12(r12Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    /* JADX INFO: renamed from: v */
    public final int m8389v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final g72 m8390x() {
        return this.zze;
    }
}
