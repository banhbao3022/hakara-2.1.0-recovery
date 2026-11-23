package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.r0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4318r0 extends AbstractC4099b5<C4318r0, a> implements InterfaceC4254m6 {
    private static final C4318r0 zzj;
    private static volatile InterfaceC4338s6<C4318r0> zzk;
    private int zzc;
    private int zzd;
    private String zze = "";
    private C4290p0 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    /* JADX INFO: renamed from: c.n.b.d.j.k.r0$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4318r0, a> implements InterfaceC4254m6 {
        public a() {
            super(C4318r0.zzj);
        }

        public a(C4346t0 c4346t0) {
            super(C4318r0.zzj);
        }
    }

    static {
        C4318r0 c4318r0 = new C4318r0();
        zzj = c4318r0;
        AbstractC4099b5.m9413p(C4318r0.class, c4318r0);
    }

    /* JADX INFO: renamed from: B */
    public static a m10174B() {
        return zzj.m9422q();
    }

    /* JADX INFO: renamed from: s */
    public static void m10176s(C4318r0 c4318r0, String str) {
        Objects.requireNonNull(c4318r0);
        str.getClass();
        c4318r0.zzc |= 2;
        c4318r0.zze = str;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m10177A() {
        return this.zzi;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4346t0.f23461a[i - 1]) {
            case 1:
                return new C4318r0();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                InterfaceC4338s6<C4318r0> aVar = zzk;
                if (aVar == null) {
                    synchronized (C4318r0.class) {
                        aVar = zzk;
                        if (aVar == null) {
                            aVar = new AbstractC4099b5.a<>(zzj);
                            zzk = aVar;
                        }
                        break;
                    }
                }
                return aVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m10178t() {
        return (this.zzc & 1) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final int m10179u() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: v */
    public final String m10180v() {
        return this.zze;
    }

    /* JADX INFO: renamed from: w */
    public final C4290p0 m10181w() {
        C4290p0 c4290p0 = this.zzf;
        return c4290p0 == null ? C4290p0.m10123B() : c4290p0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m10182x() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m10183y() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m10184z() {
        return (this.zzc & 32) != 0;
    }
}
