package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yz1 extends g82<yz1, xz1> implements m92 {
    private static final yz1 zze;
    private int zzb;

    static {
        yz1 yz1Var = new yz1();
        zze = yz1Var;
        g82.m6957t(yz1.class, yz1Var);
    }

    /* JADX INFO: renamed from: x */
    public static yz1 m8840x() {
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
            return new yz1();
        }
        wz1 wz1Var = null;
        if (i2 == 4) {
            return new xz1(wz1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }

    /* JADX INFO: renamed from: v */
    public final int m8842v() {
        return this.zzb;
    }
}
