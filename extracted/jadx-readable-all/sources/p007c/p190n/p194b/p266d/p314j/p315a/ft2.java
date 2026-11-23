package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.websocket.CloseCodes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ft2 extends g82<ft2, et2> implements m92 {
    private static final ft2 zzm;
    private int zzb;
    private uu2 zzf;
    private int zzg;
    private wu2 zzh;
    private int zzi;
    private String zze = "";
    private int zzj = CloseCodes.NORMAL_CLOSURE;
    private int zzk = CloseCodes.NORMAL_CLOSURE;
    private int zzl = CloseCodes.NORMAL_CLOSURE;

    static {
        ft2 ft2Var = new ft2();
        zzm = ft2Var;
        g82.m6957t(ft2.class, ft2Var);
    }

    /* JADX INFO: renamed from: v */
    public static ft2 m6855v() {
        return zzm;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m6857y(ft2 ft2Var, String str) {
        ft2Var.zzb |= 1;
        ft2Var.zze = str;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m6858z(ft2 ft2Var, wu2 wu2Var) {
        wu2Var.getClass();
        ft2Var.zzh = wu2Var;
        ft2Var.zzb |= 8;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            j82 j82Var = kt2.f16038a;
            return new u92(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", j82Var, "zzk", j82Var, "zzl", j82Var});
        }
        if (i2 == 3) {
            return new ft2();
        }
        es2 es2Var = null;
        if (i2 == 4) {
            return new et2(es2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzm;
    }
}
