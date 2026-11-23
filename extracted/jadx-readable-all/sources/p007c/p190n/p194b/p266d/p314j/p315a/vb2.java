package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vb2 extends g82<vb2, rb2> implements m92 {
    private static final vb2 zzl;
    private int zzb;
    private ub2 zze;
    private g72 zzg;
    private g72 zzh;
    private int zzi;
    private g72 zzj;
    private byte zzk = 2;
    private o82<mb2> zzf = t92.f19797g;

    static {
        vb2 vb2Var = new vb2();
        zzl = vb2Var;
        g82.m6957t(vb2.class, vb2Var);
    }

    public vb2() {
        g72 g72Var = g72.f14513f;
        this.zzg = g72Var;
        this.zzh = g72Var;
        this.zzj = g72Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i2 == 2) {
            return new u92(zzl, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzb", "zze", "zzf", mb2.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new vb2();
        }
        fb2 fb2Var = null;
        if (i2 == 4) {
            return new rb2(fb2Var);
        }
        if (i2 == 5) {
            return zzl;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
