package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class b32 extends g82<b32, a32> implements m92 {
    private static final b32 zzf;
    private int zzb;
    private int zze;

    static {
        b32 b32Var = new b32();
        zzf = b32Var;
        g82.m6957t(b32.class, b32Var);
    }

    /* JADX INFO: renamed from: y */
    public static b32 m5921y() {
        return zzf;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new b32();
        }
        z22 z22Var = null;
        if (i2 == 4) {
            return new a32(z22Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    /* JADX INFO: renamed from: v */
    public final s22 m5923v() {
        s22 s22VarM8340f = s22.m8340f(this.zzb);
        return s22VarM8340f == null ? s22.UNRECOGNIZED : s22VarM8340f;
    }

    /* JADX INFO: renamed from: x */
    public final int m5924x() {
        return this.zze;
    }
}
