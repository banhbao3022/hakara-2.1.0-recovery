package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mb2 extends g82<mb2, lb2> implements m92 {
    private static final mb2 zzh;
    private int zzb;
    private g72 zze;
    private g72 zzf;
    private byte zzg = 2;

    static {
        mb2 mb2Var = new mb2();
        zzh = mb2Var;
        g82.m6957t(mb2.class, mb2Var);
    }

    public mb2() {
        g72 g72Var = g72.f14513f;
        this.zze = g72Var;
        this.zzf = g72Var;
    }

    /* JADX INFO: renamed from: v */
    public static lb2 m7684v() {
        return zzh.m6963o();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m7686y(mb2 mb2Var, g72 g72Var) {
        mb2Var.zzb |= 1;
        mb2Var.zze = g72Var;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m7687z(mb2 mb2Var, g72 g72Var) {
        mb2Var.zzb |= 2;
        mb2Var.zzf = g72Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new u92(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new mb2();
        }
        fb2 fb2Var = null;
        if (i2 == 4) {
            return new lb2(fb2Var);
        }
        if (i2 == 5) {
            return zzh;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
