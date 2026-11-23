package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class e02 extends g82<e02, d02> implements m92 {
    private static final e02 zzf;
    private l02 zzb;
    private y22 zze;

    static {
        e02 e02Var = new e02();
        zzf = e02Var;
        g82.m6957t(e02.class, e02Var);
    }

    /* JADX INFO: renamed from: y */
    public static e02 m6575y(g72 g72Var, s72 s72Var) throws r82 {
        return (e02) g82.m6955n(zzf, g72Var, s72Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new e02();
        }
        c02 c02Var = null;
        if (i2 == 4) {
            return new d02(c02Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    /* JADX INFO: renamed from: v */
    public final l02 m6577v() {
        l02 l02Var = this.zzb;
        return l02Var == null ? l02.m7569z() : l02Var;
    }

    /* JADX INFO: renamed from: x */
    public final y22 m6578x() {
        y22 y22Var = this.zze;
        return y22Var == null ? y22.m8773z() : y22Var;
    }
}
