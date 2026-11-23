package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class x02 extends g82<x02, w02> implements m92 {
    private static final x02 zze;
    private int zzb;

    static {
        x02 x02Var = new x02();
        zze = x02Var;
        g82.m6957t(x02.class, x02Var);
    }

    /* JADX INFO: renamed from: x */
    public static x02 m8711x() {
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
            return new x02();
        }
        v02 v02Var = null;
        if (i2 == 4) {
            return new w02(v02Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }

    /* JADX INFO: renamed from: v */
    public final int m8713v() {
        return this.zzb;
    }
}
