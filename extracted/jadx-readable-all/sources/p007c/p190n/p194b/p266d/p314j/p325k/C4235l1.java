package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.l1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4235l1 extends AbstractC4099b5<C4235l1, a> implements InterfaceC4254m6 {
    private static final C4235l1 zzj;
    private static volatile InterfaceC4338s6<C4235l1> zzk;
    private int zzc;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    /* JADX INFO: renamed from: c.n.b.d.j.k.l1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4235l1, a> implements InterfaceC4254m6 {
        public a() {
            super(C4235l1.zzj);
        }

        /* JADX INFO: renamed from: v */
        public final a m9940v(long j2) {
            if (this.f23087h) {
                m9431r();
                this.f23087h = false;
            }
            C4235l1.m9927u((C4235l1) this.f23086g, j2);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m9941w(String str) {
            if (this.f23087h) {
                m9431r();
                this.f23087h = false;
            }
            C4235l1.m9928v((C4235l1) this.f23086g, str);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m9942x(long j2) {
            if (this.f23087h) {
                m9431r();
                this.f23087h = false;
            }
            C4235l1.m9930z((C4235l1) this.f23086g, j2);
            return this;
        }

        public a(C4263n1 c4263n1) {
            super(C4235l1.zzj);
        }
    }

    static {
        C4235l1 c4235l1 = new C4235l1();
        zzj = c4235l1;
        AbstractC4099b5.m9413p(C4235l1.class, c4235l1);
    }

    /* JADX INFO: renamed from: A */
    public static void m9921A(C4235l1 c4235l1, String str) {
        Objects.requireNonNull(c4235l1);
        str.getClass();
        c4235l1.zzc |= 4;
        c4235l1.zzf = str;
    }

    /* JADX INFO: renamed from: C */
    public static void m9922C(C4235l1 c4235l1) {
        c4235l1.zzc &= -33;
        c4235l1.zzi = 0.0d;
    }

    /* JADX INFO: renamed from: J */
    public static a m9923J() {
        return zzj.m9422q();
    }

    /* JADX INFO: renamed from: s */
    public static void m9925s(C4235l1 c4235l1) {
        c4235l1.zzc &= -5;
        c4235l1.zzf = zzj.zzf;
    }

    /* JADX INFO: renamed from: t */
    public static void m9926t(C4235l1 c4235l1, double d) {
        c4235l1.zzc |= 32;
        c4235l1.zzi = d;
    }

    /* JADX INFO: renamed from: u */
    public static void m9927u(C4235l1 c4235l1, long j2) {
        c4235l1.zzc |= 1;
        c4235l1.zzd = j2;
    }

    /* JADX INFO: renamed from: v */
    public static void m9928v(C4235l1 c4235l1, String str) {
        Objects.requireNonNull(c4235l1);
        str.getClass();
        c4235l1.zzc |= 2;
        c4235l1.zze = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m9929y(C4235l1 c4235l1) {
        c4235l1.zzc &= -9;
        c4235l1.zzg = 0L;
    }

    /* JADX INFO: renamed from: z */
    public static void m9930z(C4235l1 c4235l1, long j2) {
        c4235l1.zzc |= 8;
        c4235l1.zzg = j2;
    }

    /* JADX INFO: renamed from: B */
    public final String m9931B() {
        return this.zze;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m9932D() {
        return (this.zzc & 4) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final String m9933E() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m9934F() {
        return (this.zzc & 8) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final long m9935G() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m9936H() {
        return (this.zzc & 32) != 0;
    }

    /* JADX INFO: renamed from: I */
    public final double m9937I() {
        return this.zzi;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4263n1.f23332a[i - 1]) {
            case 1:
                return new C4235l1();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                InterfaceC4338s6<C4235l1> aVar = zzk;
                if (aVar == null) {
                    synchronized (C4235l1.class) {
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

    /* JADX INFO: renamed from: w */
    public final boolean m9938w() {
        return (this.zzc & 1) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final long m9939x() {
        return this.zzd;
    }
}
