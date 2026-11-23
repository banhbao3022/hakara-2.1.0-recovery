package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qb2 extends g82<qb2, nb2> implements m92 {
    private static final qb2 zzk;
    private int zzb;
    private pb2 zze;
    private g72 zzg;
    private g72 zzh;
    private int zzi;
    private byte zzj = 2;
    private o82<mb2> zzf = t92.f19797g;

    static {
        qb2 qb2Var = new qb2();
        zzk = qb2Var;
        g82.m6957t(qb2.class, qb2Var);
    }

    public qb2() {
        g72 g72Var = g72.f14513f;
        this.zzg = g72Var;
        this.zzh = g72Var;
    }

    /* JADX INFO: renamed from: v */
    public static nb2 m8198v() {
        return zzk.m6963o();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m8200y(qb2 qb2Var, mb2 mb2Var) {
        mb2Var.getClass();
        o82<mb2> o82Var = qb2Var.zzf;
        if (!o82Var.zza()) {
            qb2Var.zzf = g82.m6953l(o82Var);
        }
        qb2Var.zzf.add(mb2Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i2 == 2) {
            return new u92(zzk, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzb", "zze", "zzf", mb2.class, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new qb2();
        }
        fb2 fb2Var = null;
        if (i2 == 4) {
            return new nb2(fb2Var);
        }
        if (i2 == 5) {
            return zzk;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
