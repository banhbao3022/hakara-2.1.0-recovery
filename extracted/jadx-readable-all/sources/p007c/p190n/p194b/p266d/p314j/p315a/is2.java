package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.websocket.CloseCodes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class is2 extends g82<is2, hs2> implements m92 {
    private static final is2 zzp;
    private int zzb;
    private int zze;
    private int zzf = CloseCodes.NORMAL_CLOSURE;
    private zs2 zzg;
    private bt2 zzh;
    private o82<xs2> zzi;
    private dt2 zzj;
    private mu2 zzk;
    private cu2 zzl;
    private st2 zzm;
    private ut2 zzn;
    private o82<yu2> zzo;

    static {
        is2 is2Var = new is2();
        zzp = is2Var;
        g82.m6957t(is2.class, is2Var);
    }

    public is2() {
        t92<Object> t92Var = t92.f19797g;
        this.zzi = t92Var;
        this.zzo = t92Var;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m7298A(is2 is2Var, bt2 bt2Var) {
        is2Var.zzh = bt2Var;
        is2Var.zzb |= 8;
    }

    /* JADX INFO: renamed from: x */
    public static is2 m7299x() {
        return zzp;
    }

    /* JADX INFO: renamed from: z */
    public static void m7301z(is2 is2Var, gs2 gs2Var) {
        is2Var.zze = gs2Var.f14673s;
        is2Var.zzb |= 1;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzp, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzb", "zze", fs2.f14110a, "zzf", kt2.f16038a, "zzg", "zzh", "zzi", xs2.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", yu2.class});
        }
        if (i2 == 3) {
            return new is2();
        }
        es2 es2Var = null;
        if (i2 == 4) {
            return new hs2(es2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzp;
    }

    /* JADX INFO: renamed from: v */
    public final bt2 m7302v() {
        bt2 bt2Var = this.zzh;
        return bt2Var == null ? bt2.m6096v() : bt2Var;
    }
}
