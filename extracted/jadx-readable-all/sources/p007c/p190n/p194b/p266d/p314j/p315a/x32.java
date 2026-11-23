package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class x32 extends g82<x32, u32> implements m92 {
    private static final x32 zzf;
    private int zzb;
    private o82<w32> zze = t92.f19797g;

    static {
        x32 x32Var = new x32();
        zzf = x32Var;
        g82.m6957t(x32.class, x32Var);
    }

    /* JADX INFO: renamed from: v */
    public static u32 m8715v() {
        return zzf.m6963o();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m8718z(x32 x32Var, w32 w32Var) {
        w32Var.getClass();
        o82<w32> o82Var = x32Var.zze;
        if (!o82Var.zza()) {
            x32Var.zze = g82.m6953l(o82Var);
        }
        x32Var.zze.add(w32Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzb", "zze", w32.class});
        }
        if (i2 == 3) {
            return new x32();
        }
        t32 t32Var = null;
        if (i2 == 4) {
            return new u32(t32Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }
}
