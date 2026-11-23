package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.f1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4151f1 extends AbstractC4099b5<C4151f1, a> implements InterfaceC4254m6 {
    private static final C4151f1 zzj;
    private static volatile InterfaceC4338s6<C4151f1> zzk;
    private int zzc;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private InterfaceC4197i5<C4151f1> zzi = C4379v6.f23569g;

    /* JADX INFO: renamed from: c.n.b.d.j.k.f1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4151f1, a> implements InterfaceC4254m6 {
        public a() {
            super(C4151f1.zzj);
        }

        /* JADX INFO: renamed from: v */
        public final a m9591v(double d) {
            if (this.f23087h) {
                m9431r();
                this.f23087h = false;
            }
            C4151f1.m9574t((C4151f1) this.f23086g, d);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m9592w(long j2) {
            if (this.f23087h) {
                m9431r();
                this.f23087h = false;
            }
            C4151f1.m9575u((C4151f1) this.f23086g, j2);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m9593x(String str) {
            if (this.f23087h) {
                m9431r();
                this.f23087h = false;
            }
            C4151f1.m9578x((C4151f1) this.f23086g, str);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final a m9594y(String str) {
            if (this.f23087h) {
                m9431r();
                this.f23087h = false;
            }
            C4151f1.m9568B((C4151f1) this.f23086g, str);
            return this;
        }

        public a(C4263n1 c4263n1) {
            super(C4151f1.zzj);
        }
    }

    static {
        C4151f1 c4151f1 = new C4151f1();
        zzj = c4151f1;
        AbstractC4099b5.m9413p(C4151f1.class, c4151f1);
    }

    /* JADX INFO: renamed from: A */
    public static void m9567A(C4151f1 c4151f1) {
        c4151f1.zzc &= -5;
        c4151f1.zzf = 0L;
    }

    /* JADX INFO: renamed from: B */
    public static void m9568B(C4151f1 c4151f1, String str) {
        Objects.requireNonNull(c4151f1);
        str.getClass();
        c4151f1.zzc |= 2;
        c4151f1.zze = str;
    }

    /* JADX INFO: renamed from: C */
    public static void m9569C(C4151f1 c4151f1) {
        c4151f1.zzc &= -17;
        c4151f1.zzh = 0.0d;
    }

    /* JADX INFO: renamed from: F */
    public static void m9570F(C4151f1 c4151f1) {
        Objects.requireNonNull(c4151f1);
        c4151f1.zzi = C4379v6.f23569g;
    }

    /* JADX INFO: renamed from: O */
    public static a m9571O() {
        return zzj.m9422q();
    }

    /* JADX INFO: renamed from: s */
    public static void m9573s(C4151f1 c4151f1) {
        c4151f1.zzc &= -3;
        c4151f1.zze = zzj.zze;
    }

    /* JADX INFO: renamed from: t */
    public static void m9574t(C4151f1 c4151f1, double d) {
        c4151f1.zzc |= 16;
        c4151f1.zzh = d;
    }

    /* JADX INFO: renamed from: u */
    public static void m9575u(C4151f1 c4151f1, long j2) {
        c4151f1.zzc |= 4;
        c4151f1.zzf = j2;
    }

    /* JADX INFO: renamed from: v */
    public static void m9576v(C4151f1 c4151f1, C4151f1 c4151f2) {
        Objects.requireNonNull(c4151f1);
        InterfaceC4197i5<C4151f1> interfaceC4197i5 = c4151f1.zzi;
        if (!interfaceC4197i5.zza()) {
            c4151f1.zzi = AbstractC4099b5.m9410l(interfaceC4197i5);
        }
        c4151f1.zzi.add(c4151f2);
    }

    /* JADX INFO: renamed from: w */
    public static void m9577w(C4151f1 c4151f1, Iterable iterable) {
        InterfaceC4197i5<C4151f1> interfaceC4197i5 = c4151f1.zzi;
        if (!interfaceC4197i5.zza()) {
            c4151f1.zzi = AbstractC4099b5.m9410l(interfaceC4197i5);
        }
        AbstractC4293p3.m10138c(iterable, c4151f1.zzi);
    }

    /* JADX INFO: renamed from: x */
    public static void m9578x(C4151f1 c4151f1, String str) {
        Objects.requireNonNull(c4151f1);
        str.getClass();
        c4151f1.zzc |= 1;
        c4151f1.zzd = str;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m9579D() {
        return (this.zzc & 2) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final String m9580E() {
        return this.zze;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m9581G() {
        return (this.zzc & 4) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final long m9582H() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m9583I() {
        return (this.zzc & 8) != 0;
    }

    /* JADX INFO: renamed from: J */
    public final float m9584J() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m9585K() {
        return (this.zzc & 16) != 0;
    }

    /* JADX INFO: renamed from: L */
    public final double m9586L() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: M */
    public final List<C4151f1> m9587M() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: N */
    public final int m9588N() {
        return this.zzi.size();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4263n1.f23332a[i - 1]) {
            case 1:
                return new C4151f1();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", C4151f1.class});
            case 4:
                return zzj;
            case 5:
                InterfaceC4338s6<C4151f1> aVar = zzk;
                if (aVar == null) {
                    synchronized (C4151f1.class) {
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

    /* JADX INFO: renamed from: y */
    public final boolean m9589y() {
        return (this.zzc & 1) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final String m9590z() {
        return this.zzd;
    }
}
