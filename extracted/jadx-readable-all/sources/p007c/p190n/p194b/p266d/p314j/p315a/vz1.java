package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vz1 extends g82<vz1, uz1> implements m92 {
    private static final vz1 zzf;
    private int zzb;
    private yz1 zze;

    static {
        vz1 vz1Var = new vz1();
        zzf = vz1Var;
        g82.m6957t(vz1.class, vz1Var);
    }

    /* JADX INFO: renamed from: y */
    public static vz1 m8597y(g72 g72Var, s72 s72Var) throws r82 {
        return (vz1) g82.m6955n(zzf, g72Var, s72Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new vz1();
        }
        tz1 tz1Var = null;
        if (i2 == 4) {
            return new uz1(tz1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    /* JADX INFO: renamed from: v */
    public final int m8599v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final yz1 m8600x() {
        yz1 yz1Var = this.zze;
        return yz1Var == null ? yz1.m8840x() : yz1Var;
    }
}
