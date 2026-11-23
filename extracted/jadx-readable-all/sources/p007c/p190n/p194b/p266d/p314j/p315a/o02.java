package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class o02 extends g82<o02, n02> implements m92 {
    private static final o02 zze;
    private int zzb;

    static {
        o02 o02Var = new o02();
        zze = o02Var;
        g82.m6957t(o02.class, o02Var);
    }

    /* JADX INFO: renamed from: x */
    public static o02 m7954x() {
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
            return new u92(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new o02();
        }
        m02 m02Var = null;
        if (i2 == 4) {
            return new n02(m02Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }

    /* JADX INFO: renamed from: v */
    public final int m7956v() {
        return this.zzb;
    }
}
