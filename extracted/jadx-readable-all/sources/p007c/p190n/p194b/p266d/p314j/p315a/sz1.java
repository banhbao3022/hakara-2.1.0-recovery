package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sz1 extends g82<sz1, rz1> implements m92 {
    private static final sz1 zzg;
    private int zzb;
    private g72 zze = g72.f14513f;
    private yz1 zzf;

    static {
        sz1 sz1Var = new sz1();
        zzg = sz1Var;
        g82.m6957t(sz1.class, sz1Var);
    }

    /* JADX INFO: renamed from: A */
    public static rz1 m8374A() {
        return zzg.m6963o();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m8378E(sz1 sz1Var, yz1 yz1Var) {
        yz1Var.getClass();
        sz1Var.zzf = yz1Var;
    }

    /* JADX INFO: renamed from: z */
    public static sz1 m8379z(g72 g72Var, s72 s72Var) throws r82 {
        return (sz1) g82.m6955n(zzg, g72Var, s72Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new sz1();
        }
        qz1 qz1Var = null;
        if (i2 == 4) {
            return new rz1(qz1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    /* JADX INFO: renamed from: v */
    public final int m8380v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final g72 m8381x() {
        return this.zze;
    }

    /* JADX INFO: renamed from: y */
    public final yz1 m8382y() {
        yz1 yz1Var = this.zzf;
        return yz1Var == null ? yz1.m8840x() : yz1Var;
    }
}
