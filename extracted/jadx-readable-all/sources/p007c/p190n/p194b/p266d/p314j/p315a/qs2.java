package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qs2 extends g82<qs2, os2> implements m92 {
    private static final qs2 zzg;
    private int zzb;
    private boolean zze;
    private int zzf;

    static {
        qs2 qs2Var = new qs2();
        zzg = qs2Var;
        g82.m6957t(qs2.class, qs2Var);
    }

    /* JADX INFO: renamed from: v */
    public static os2 m8224v() {
        return zzg.m6963o();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m8226y(qs2 qs2Var, boolean z) {
        qs2Var.zzb |= 1;
        qs2Var.zze = z;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m8227z(qs2 qs2Var, int i) {
        qs2Var.zzb |= 2;
        qs2Var.zzf = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new qs2();
        }
        es2 es2Var = null;
        if (i2 == 4) {
            return new os2(es2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}
