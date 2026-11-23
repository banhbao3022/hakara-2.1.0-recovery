package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gc0 extends g82<gc0, d70> implements m92 {
    private static final gc0 zzr;
    private int zzb;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private o82<a90> zzp = t92.f19797g;

    static {
        gc0 gc0Var = new gc0();
        zzr = gc0Var;
        g82.m6957t(gc0.class, gc0Var);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m6982A(gc0 gc0Var, String str) {
        str.getClass();
        gc0Var.zzb |= 4;
        gc0Var.zzg = str;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m6983B(gc0 gc0Var, String str) {
        str.getClass();
        gc0Var.zzb |= 8;
        gc0Var.zzh = str;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m6984C(gc0 gc0Var, String str) {
        gc0Var.zzb |= 16;
        gc0Var.zzi = str;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m6985D(gc0 gc0Var, String str) {
        gc0Var.zzb |= 1024;
        gc0Var.zzo = str;
    }

    /* JADX INFO: renamed from: E */
    public static void m6986E(gc0 gc0Var, fb0 fb0Var) {
        gc0Var.zzq = fb0Var.f14008j;
        gc0Var.zzb |= 2048;
    }

    /* JADX INFO: renamed from: v */
    public static d70 m6987v() {
        return zzr.m6963o();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m6989y(gc0 gc0Var, String str) {
        str.getClass();
        gc0Var.zzb |= 1;
        gc0Var.zze = str;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m6990z(gc0 gc0Var, long j2) {
        gc0Var.zzb |= 2;
        gc0Var.zzf = j2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzr, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", a90.class, "zzq", ea0.f13535a});
        }
        if (i2 == 3) {
            return new gc0();
        }
        c60 c60Var = null;
        if (i2 == 4) {
            return new d70(c60Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzr;
    }
}
