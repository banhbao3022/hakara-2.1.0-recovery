package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.websocket.CloseCodes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gv2 extends g82<gv2, fv2> implements m92 {
    private static final gv2 zzi;
    private int zzb;
    private wu2 zze;
    private int zzf = CloseCodes.NORMAL_CLOSURE;
    private ev2 zzg;
    private uu2 zzh;

    static {
        gv2 gv2Var = new gv2();
        zzi = gv2Var;
        g82.m6957t(gv2.class, gv2Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zze", "zzf", kt2.f16038a, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new gv2();
        }
        es2 es2Var = null;
        if (i2 == 4) {
            return new fv2(es2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzi;
    }
}
