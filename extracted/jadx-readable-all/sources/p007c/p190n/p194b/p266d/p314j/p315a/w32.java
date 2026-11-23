package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class w32 extends g82<w32, v32> implements m92 {
    private static final w32 zzh;
    private String zzb = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        w32 w32Var = new w32();
        zzh = w32Var;
        g82.m6957t(w32.class, w32Var);
    }

    /* JADX INFO: renamed from: B */
    public static void m8607B(w32 w32Var, l42 l42Var) {
        Objects.requireNonNull(l42Var);
        if (l42Var == l42.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        w32Var.zzg = l42Var.f16287m;
    }

    /* JADX INFO: renamed from: v */
    public static v32 m8608v() {
        return zzh.m6963o();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m8610y(w32 w32Var, String str) {
        str.getClass();
        w32Var.zzb = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m8611z(w32 w32Var, h32 h32Var) {
        Objects.requireNonNull(h32Var);
        if (h32Var == h32.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        w32Var.zze = h32Var.f14738l;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new w32();
        }
        t32 t32Var = null;
        if (i2 == 4) {
            return new v32(t32Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzh;
    }
}
