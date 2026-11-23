package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fg2 extends g82<fg2, eg2> implements m92 {
    private static final fg2 zzj;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        fg2 fg2Var = new fg2();
        zzj = fg2Var;
        g82.m6957t(fg2.class, fg2Var);
    }

    /* JADX INFO: renamed from: B */
    public static fg2 m6799B(g72 g72Var) throws r82 {
        fg2 fg2Var = zzj;
        s72 s72VarM8347a = s72.m8347a();
        try {
            j72 j72VarMo5715D = g72Var.mo5715D();
            g82 g82Var = (g82) fg2Var.mo5663u(4, null, null);
            try {
                ba2 ba2VarM8349a = s92.f19505a.m8349a(g82Var.getClass());
                k72 k72Var = j72VarMo5715D.f15506b;
                if (k72Var == null) {
                    k72Var = new k72(j72VarMo5715D);
                }
                ba2VarM8349a.mo5954j(g82Var, k72Var, s72VarM8347a);
                ba2VarM8349a.mo5952h(g82Var);
                try {
                    j72VarMo5715D.mo7080g(0);
                    g82.m6950i(g82Var);
                    g82.m6950i(g82Var);
                    return (fg2) g82Var;
                } catch (r82 e) {
                    throw e;
                }
            } catch (IOException e2) {
                if (e2.getCause() instanceof r82) {
                    throw ((r82) e2.getCause());
                }
                throw new r82(e2.getMessage());
            } catch (RuntimeException e3) {
                if (e3.getCause() instanceof r82) {
                    throw ((r82) e3.getCause());
                }
                throw e3;
            }
        } catch (r82 e4) {
            throw e4;
        }
    }

    /* JADX INFO: renamed from: C */
    public static fg2 m6800C(g72 g72Var, s72 s72Var) throws r82 {
        return (fg2) g82.m6955n(zzj, g72Var, s72Var);
    }

    /* JADX INFO: renamed from: D */
    public static eg2 m6801D() {
        return zzj.m6963o();
    }

    /* JADX INFO: renamed from: E */
    public static fg2 m6802E() {
        return zzj;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m6804G(fg2 fg2Var, String str) {
        str.getClass();
        fg2Var.zzb |= 1;
        fg2Var.zze = str;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m6805H(fg2 fg2Var, String str) {
        str.getClass();
        fg2Var.zzb |= 2;
        fg2Var.zzf = str;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m6806I(fg2 fg2Var, long j2) {
        fg2Var.zzb |= 4;
        fg2Var.zzg = j2;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m6807J(fg2 fg2Var, long j2) {
        fg2Var.zzb |= 8;
        fg2Var.zzh = j2;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m6808K(fg2 fg2Var, long j2) {
        fg2Var.zzb |= 16;
        fg2Var.zzi = j2;
    }

    /* JADX INFO: renamed from: A */
    public final long m6809A() {
        return this.zzi;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new fg2();
        }
        dg2 dg2Var = null;
        if (i2 == 4) {
            return new eg2(dg2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzj;
    }

    /* JADX INFO: renamed from: v */
    public final String m6810v() {
        return this.zze;
    }

    /* JADX INFO: renamed from: x */
    public final String m6811x() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: y */
    public final long m6812y() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: z */
    public final long m6813z() {
        return this.zzh;
    }
}
