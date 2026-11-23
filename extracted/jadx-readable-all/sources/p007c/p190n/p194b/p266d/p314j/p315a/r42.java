package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class r42 extends g82<r42, q42> implements m92 {
    private static final r42 zzf;
    private int zzb;
    private g72 zze = g72.f14513f;

    static {
        r42 r42Var = new r42();
        zzf = r42Var;
        g82.m6957t(r42.class, r42Var);
    }

    /* JADX INFO: renamed from: y */
    public static r42 m8255y(g72 g72Var, s72 s72Var) throws r82 {
        return (r42) g82.m6955n(zzf, g72Var, s72Var);
    }

    /* JADX INFO: renamed from: z */
    public static q42 m8256z() {
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
            return new u92(zzf, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new r42();
        }
        p42 p42Var = null;
        if (i2 == 4) {
            return new q42(p42Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    /* JADX INFO: renamed from: v */
    public final int m8257v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final g72 m8258x() {
        return this.zze;
    }
}
