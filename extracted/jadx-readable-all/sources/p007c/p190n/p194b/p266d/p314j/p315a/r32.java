package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class r32 extends g82<r32, q32> implements m92 {
    private static final r32 zzh;
    private f32 zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        r32 r32Var = new r32();
        zzh = r32Var;
        g82.m6957t(r32.class, r32Var);
    }

    /* JADX INFO: renamed from: A */
    public final l42 m8247A() {
        l42 l42Var;
        int i = this.zzg;
        if (i == 0) {
            l42Var = l42.UNKNOWN_PREFIX;
        } else if (i == 1) {
            l42Var = l42.TINK;
        } else if (i == 2) {
            l42Var = l42.LEGACY;
        } else if (i != 3) {
            l42Var = i != 4 ? null : l42.CRUNCHY;
        } else {
            l42Var = l42.RAW;
        }
        return l42Var == null ? l42.UNRECOGNIZED : l42Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new r32();
        }
        o32 o32Var = null;
        if (i2 == 4) {
            return new q32(o32Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzh;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m8248v() {
        return this.zzb != null;
    }

    /* JADX INFO: renamed from: x */
    public final f32 m8249x() {
        f32 f32Var = this.zzb;
        return f32Var == null ? f32.m6770A() : f32Var;
    }

    /* JADX INFO: renamed from: y */
    public final h32 m8250y() {
        h32 h32Var;
        int i = this.zze;
        if (i == 0) {
            h32Var = h32.UNKNOWN_STATUS;
        } else if (i == 1) {
            h32Var = h32.ENABLED;
        } else if (i != 2) {
            h32Var = i != 3 ? null : h32.DESTROYED;
        } else {
            h32Var = h32.DISABLED;
        }
        return h32Var == null ? h32.UNRECOGNIZED : h32Var;
    }

    /* JADX INFO: renamed from: z */
    public final int m8251z() {
        return this.zzf;
    }
}
