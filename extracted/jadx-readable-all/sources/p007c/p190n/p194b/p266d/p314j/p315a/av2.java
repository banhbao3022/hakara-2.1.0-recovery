package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.websocket.CloseCodes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class av2 extends g82<av2, zu2> implements m92 {
    private static final av2 zzh;
    private int zzb;
    private int zze = CloseCodes.NORMAL_CLOSURE;
    private ev2 zzf;
    private uu2 zzg;

    static {
        av2 av2Var = new av2();
        zzh = av2Var;
        g82.m6957t(av2.class, av2Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", kt2.f16038a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new av2();
        }
        es2 es2Var = null;
        if (i2 == 4) {
            return new zu2(es2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzh;
    }
}
