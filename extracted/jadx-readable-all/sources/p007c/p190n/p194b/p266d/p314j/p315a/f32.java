package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class f32 extends g82<f32, d32> implements m92 {
    private static final f32 zzg;
    private String zzb = "";
    private g72 zze = g72.f14513f;
    private int zzf;

    static {
        f32 f32Var = new f32();
        zzg = f32Var;
        g82.m6957t(f32.class, f32Var);
    }

    /* JADX INFO: renamed from: A */
    public static f32 m6770A() {
        return zzg;
    }

    /* JADX INFO: renamed from: E */
    public static void m6774E(f32 f32Var, e32 e32Var) {
        Objects.requireNonNull(e32Var);
        if (e32Var == e32.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        f32Var.zzf = e32Var.f13486m;
    }

    /* JADX INFO: renamed from: z */
    public static d32 m6775z() {
        return zzg.m6963o();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new f32();
        }
        c32 c32Var = null;
        if (i2 == 4) {
            return new d32(c32Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    /* JADX INFO: renamed from: v */
    public final String m6776v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final g72 m6777x() {
        return this.zze;
    }

    /* JADX INFO: renamed from: y */
    public final e32 m6778y() {
        e32 e32Var;
        int i = this.zzf;
        if (i == 0) {
            e32Var = e32.UNKNOWN_KEYMATERIAL;
        } else if (i == 1) {
            e32Var = e32.SYMMETRIC;
        } else if (i == 2) {
            e32Var = e32.ASYMMETRIC_PRIVATE;
        } else if (i != 3) {
            e32Var = i != 4 ? null : e32.REMOTE;
        } else {
            e32Var = e32.ASYMMETRIC_PUBLIC;
        }
        return e32Var == null ? e32.UNRECOGNIZED : e32Var;
    }
}
