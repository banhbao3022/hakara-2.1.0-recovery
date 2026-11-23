package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fc2 extends g82<fc2, ec2> implements m92 {
    private static final fc2 zzo;
    private int zzb;
    private int zze;
    private qb2 zzg;
    private vb2 zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private k82 zzj = h82.f14787g;
    private String zzk = "";
    private o82<String> zzm = t92.f19797g;

    static {
        fc2 fc2Var = new fc2();
        zzo = fc2Var;
        g82.m6957t(fc2.class, fc2Var);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m6788A(fc2 fc2Var, int i) {
        fc2Var.zzb |= 1;
        fc2Var.zze = i;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m6789B(fc2 fc2Var, String str) {
        str.getClass();
        fc2Var.zzb |= 2;
        fc2Var.zzf = str;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m6790C(fc2 fc2Var, qb2 qb2Var) {
        qb2Var.getClass();
        fc2Var.zzg = qb2Var;
        fc2Var.zzb |= 4;
    }

    /* JADX INFO: renamed from: D */
    public static void m6791D(fc2 fc2Var, dc2 dc2Var) {
        fc2Var.zzl = dc2Var.f13240k;
        fc2Var.zzb |= 64;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m6792E(fc2 fc2Var, String str) {
        str.getClass();
        o82<String> o82Var = fc2Var.zzm;
        if (!o82Var.zza()) {
            fc2Var.zzm = g82.m6953l(o82Var);
        }
        fc2Var.zzm.add(str);
    }

    /* JADX INFO: renamed from: y */
    public static ec2 m6793y() {
        return zzo.m6963o();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i2 == 2) {
            return new u92(zzo, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", cc2.f12979a, "zzm"});
        }
        if (i2 == 3) {
            return new fc2();
        }
        fb2 fb2Var = null;
        if (i2 == 4) {
            return new ec2(fb2Var);
        }
        if (i2 == 5) {
            return zzo;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final String m6795v() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: x */
    public final int m6796x() {
        return this.zzm.size();
    }
}
