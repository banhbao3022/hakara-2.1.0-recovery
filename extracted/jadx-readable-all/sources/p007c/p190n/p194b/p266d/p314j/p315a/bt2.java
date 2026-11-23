package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.websocket.CloseCodes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bt2 extends g82<bt2, at2> implements m92 {
    private static final bt2 zzj;
    private int zzb;
    private String zze = "";
    private o82<xs2> zzf = t92.f19797g;
    private int zzg = CloseCodes.NORMAL_CLOSURE;
    private int zzh = CloseCodes.NORMAL_CLOSURE;
    private int zzi = CloseCodes.NORMAL_CLOSURE;

    static {
        bt2 bt2Var = new bt2();
        zzj = bt2Var;
        g82.m6957t(bt2.class, bt2Var);
    }

    /* JADX INFO: renamed from: v */
    public static bt2 m6096v() {
        return zzj;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m6098y(bt2 bt2Var, String str) {
        str.getClass();
        bt2Var.zzb |= 1;
        bt2Var.zze = str;
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
            return new u92(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzb", "zze", "zzf", xs2.class, "zzg", j82Var, "zzh", j82Var, "zzi", j82Var});
        }
        if (i2 == 3) {
            return new bt2();
        }
        es2 es2Var = null;
        if (i2 == 4) {
            return new at2(es2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzj;
    }
}
