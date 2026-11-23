package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class n32 extends g82<n32, m32> implements m92 {
    private static final n32 zzi;
    private int zzf;
    private boolean zzg;
    private String zzb = "";
    private String zze = "";
    private String zzh = "";

    static {
        n32 n32Var = new n32();
        zzi = n32Var;
        g82.m6957t(n32.class, n32Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new n32();
        }
        l32 l32Var = null;
        if (i2 == 4) {
            return new m32(l32Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzi;
    }

    /* JADX INFO: renamed from: v */
    public final String m7774v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final String m7775x() {
        return this.zze;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m7776y() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: z */
    public final String m7777z() {
        return this.zzh;
    }
}
