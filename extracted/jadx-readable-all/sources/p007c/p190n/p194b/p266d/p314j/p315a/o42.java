package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class o42 extends g82<o42, n42> implements m92 {
    private static final o42 zzf;
    private String zzb = "";
    private o82<n32> zze = t92.f19797g;

    static {
        o42 o42Var = new o42();
        zzf = o42Var;
        g82.m6957t(o42.class, o42Var);
    }

    /* JADX INFO: renamed from: x */
    public static o42 m7960x() {
        return zzf;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zze", n32.class});
        }
        if (i2 == 3) {
            return new o42();
        }
        m42 m42Var = null;
        if (i2 == 4) {
            return new n42(m42Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    /* JADX INFO: renamed from: v */
    public final List<n32> m7962v() {
        return this.zze;
    }
}
