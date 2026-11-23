package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.websocket.CloseCodes;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ot2 extends g82<ot2, mt2> implements m92 {
    private static final ot2 zzr;
    private int zzb;
    private int zze;
    private int zzg;
    private wu2 zzi;
    private ft2 zzk;
    private jt2 zzl;
    private au2 zzm;
    private is2 zzn;
    private ju2 zzo;
    private tv2 zzp;
    private ts2 zzq;
    private String zzf = "";
    private int zzh = CloseCodes.NORMAL_CLOSURE;
    private n82 zzj = b92.f12548g;

    static {
        ot2 ot2Var = new ot2();
        zzr = ot2Var;
        g82.m6957t(ot2.class, ot2Var);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m8056B(ot2 ot2Var, String str) {
        str.getClass();
        ot2Var.zzb |= 2;
        ot2Var.zzf = str;
    }

    /* JADX INFO: renamed from: C */
    public static void m8057C(ot2 ot2Var, Iterable iterable) {
        RandomAccess randomAccess = ot2Var.zzj;
        if (!((u62) randomAccess).f20226f) {
            b92 b92Var = (b92) randomAccess;
            int i = b92Var.f12550i;
            ot2Var.zzj = b92Var.mo5705l(i == 0 ? 10 : i + i);
        }
        t62.m8399h(iterable, ot2Var.zzj);
    }

    /* JADX INFO: renamed from: D */
    public static void m8058D(ot2 ot2Var) {
        ot2Var.zzj = b92.f12548g;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m8059E(ot2 ot2Var, ft2 ft2Var) {
        ot2Var.zzk = ft2Var;
        ot2Var.zzb |= 32;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m8060F(ot2 ot2Var, is2 is2Var) {
        ot2Var.zzn = is2Var;
        ot2Var.zzb |= 256;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m8061G(ot2 ot2Var, ju2 ju2Var) {
        ju2Var.getClass();
        ot2Var.zzo = ju2Var;
        ot2Var.zzb |= 512;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m8062H(ot2 ot2Var, tv2 tv2Var) {
        tv2Var.getClass();
        ot2Var.zzp = tv2Var;
        ot2Var.zzb |= 1024;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m8063I(ot2 ot2Var, ts2 ts2Var) {
        ts2Var.getClass();
        ot2Var.zzq = ts2Var;
        ot2Var.zzb |= 2048;
    }

    /* JADX INFO: renamed from: z */
    public static mt2 m8064z() {
        return zzr.m6963o();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzr, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", kt2.f16038a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i2 == 3) {
            return new ot2();
        }
        es2 es2Var = null;
        if (i2 == 4) {
            return new mt2(es2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzr;
    }

    /* JADX INFO: renamed from: v */
    public final String m8065v() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: x */
    public final ft2 m8066x() {
        ft2 ft2Var = this.zzk;
        return ft2Var == null ? ft2.m6855v() : ft2Var;
    }

    /* JADX INFO: renamed from: y */
    public final is2 m8067y() {
        is2 is2Var = this.zzn;
        return is2Var == null ? is2.m7299x() : is2Var;
    }
}
