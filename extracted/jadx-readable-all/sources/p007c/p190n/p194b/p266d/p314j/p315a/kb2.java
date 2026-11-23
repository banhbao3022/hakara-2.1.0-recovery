package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class kb2 extends g82<kb2, jb2> implements m92 {
    private static final kb2 zzf;
    private int zzb;
    private String zze = "";

    static {
        kb2 kb2Var = new kb2();
        zzf = kb2Var;
        g82.m6957t(kb2.class, kb2Var);
    }

    /* JADX INFO: renamed from: v */
    public static jb2 m7488v() {
        return zzf.m6963o();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m7490y(kb2 kb2Var, String str) {
        kb2Var.zzb |= 1;
        kb2Var.zze = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new kb2();
        }
        fb2 fb2Var = null;
        if (i2 == 4) {
            return new jb2(fb2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }
}
