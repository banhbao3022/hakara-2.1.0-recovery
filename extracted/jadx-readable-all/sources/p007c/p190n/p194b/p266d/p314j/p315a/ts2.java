package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ts2 extends g82<ts2, ls2> implements m92 {
    private static final ts2 zze;
    private o82<ks2> zzb = t92.f19797g;

    static {
        ts2 ts2Var = new ts2();
        zze = ts2Var;
        g82.m6957t(ts2.class, ts2Var);
    }

    /* JADX INFO: renamed from: v */
    public static ls2 m8452v() {
        return zze.m6963o();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m8454y(ts2 ts2Var, ks2 ks2Var) {
        o82<ks2> o82Var = ts2Var.zzb;
        if (!o82Var.zza()) {
            ts2Var.zzb = g82.m6953l(o82Var);
        }
        ts2Var.zzb.add(ks2Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", ks2.class});
        }
        if (i2 == 3) {
            return new ts2();
        }
        es2 es2Var = null;
        if (i2 == 4) {
            return new ls2(es2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }
}
