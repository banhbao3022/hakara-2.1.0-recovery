package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.websocket.CloseCodes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rv2 extends g82<rv2, qv2> implements m92 {
    private static final rv2 zzg;
    private int zzb;
    private int zze = CloseCodes.NORMAL_CLOSURE;
    private ev2 zzf;

    static {
        rv2 rv2Var = new rv2();
        zzg = rv2Var;
        g82.m6957t(rv2.class, rv2Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", kt2.f16038a, "zzf"});
        }
        if (i2 == 3) {
            return new rv2();
        }
        es2 es2Var = null;
        if (i2 == 4) {
            return new qv2(es2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}
