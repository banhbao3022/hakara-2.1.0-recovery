package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tl1 extends g82<tl1, uk1> implements m92 {
    private static final tl1 zzi;
    private int zzb;
    private o82<g72> zze = t92.f19797g;
    private g72 zzf = g72.f14513f;
    private int zzg = 1;
    private int zzh = 1;

    static {
        tl1 tl1Var = new tl1();
        zzi = tl1Var;
        g82.m6957t(tl1.class, tl1Var);
    }

    /* JADX INFO: renamed from: A */
    public static void m8422A(tl1 tl1Var, ja1 ja1Var) {
        tl1Var.zzh = ja1Var.f15539m;
        tl1Var.zzb |= 4;
    }

    /* JADX INFO: renamed from: v */
    public static uk1 m8423v() {
        return zzi.m6963o();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m8425y(tl1 tl1Var, g72 g72Var) {
        o82<g72> o82Var = tl1Var.zze;
        if (!o82Var.zza()) {
            tl1Var.zze = g82.m6953l(o82Var);
        }
        tl1Var.zze.add(g72Var);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m8426z(tl1 tl1Var, g72 g72Var) {
        tl1Var.zzb |= 1;
        tl1Var.zzf = g72Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", ff1.f14030a, "zzh", i91.f15112a});
        }
        if (i2 == 3) {
            return new tl1();
        }
        fn0 fn0Var = null;
        if (i2 == 4) {
            return new uk1(fn0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzi;
    }
}
