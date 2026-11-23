package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.d1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4123d1 extends AbstractC4099b5<C4123d1, a> implements InterfaceC4254m6 {
    private static final C4123d1 zzi;
    private static volatile InterfaceC4338s6<C4123d1> zzj;
    private int zzc;
    private InterfaceC4197i5<C4151f1> zzd = C4379v6.f23569g;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;

    /* JADX INFO: renamed from: c.n.b.d.j.k.d1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4123d1, a> implements InterfaceC4254m6 {
        public a() {
            super(C4123d1.zzi);
        }

        /* JADX INFO: renamed from: A */
        public final List<C4151f1> m9529A() {
            return Collections.unmodifiableList(((C4123d1) this.f23086g).m9528t());
        }

        /* JADX INFO: renamed from: C */
        public final int m9530C() {
            return ((C4123d1) this.f23086g).m9518B();
        }

        /* JADX INFO: renamed from: E */
        public final a m9531E(int i) {
            if (this.f23087h) {
                m9431r();
                this.f23087h = false;
            }
            C4123d1.m9513v((C4123d1) this.f23086g, i);
            return this;
        }

        /* JADX INFO: renamed from: F */
        public final String m9532F() {
            return ((C4123d1) this.f23086g).m9519D();
        }

        /* JADX INFO: renamed from: G */
        public final long m9533G() {
            return ((C4123d1) this.f23086g).m9521F();
        }

        /* JADX INFO: renamed from: I */
        public final long m9534I() {
            return ((C4123d1) this.f23086g).m9523H();
        }

        /* JADX INFO: renamed from: v */
        public final a m9535v(int i, C4151f1 c4151f1) {
            if (this.f23087h) {
                m9431r();
                this.f23087h = false;
            }
            C4123d1.m9514w((C4123d1) this.f23086g, i, c4151f1);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m9536w(long j2) {
            if (this.f23087h) {
                m9431r();
                this.f23087h = false;
            }
            C4123d1.m9515x((C4123d1) this.f23086g, j2);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m9537x(C4151f1.a aVar) {
            if (this.f23087h) {
                m9431r();
                this.f23087h = false;
            }
            C4123d1.m9516y((C4123d1) this.f23086g, (C4151f1) ((AbstractC4099b5) aVar.m9433t()));
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final a m9538y(String str) {
            if (this.f23087h) {
                m9431r();
                this.f23087h = false;
            }
            C4123d1.m9508A((C4123d1) this.f23086g, str);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public final C4151f1 m9539z(int i) {
            return ((C4123d1) this.f23086g).m9527s(i);
        }

        public a(C4263n1 c4263n1) {
            super(C4123d1.zzi);
        }
    }

    static {
        C4123d1 c4123d1 = new C4123d1();
        zzi = c4123d1;
        AbstractC4099b5.m9413p(C4123d1.class, c4123d1);
    }

    /* JADX INFO: renamed from: A */
    public static void m9508A(C4123d1 c4123d1, String str) {
        Objects.requireNonNull(c4123d1);
        str.getClass();
        c4123d1.zzc |= 1;
        c4123d1.zze = str;
    }

    /* JADX INFO: renamed from: C */
    public static void m9509C(C4123d1 c4123d1, long j2) {
        c4123d1.zzc |= 4;
        c4123d1.zzg = j2;
    }

    /* JADX INFO: renamed from: K */
    public static a m9510K() {
        return zzi.m9422q();
    }

    /* JADX INFO: renamed from: u */
    public static void m9512u(C4123d1 c4123d1) {
        Objects.requireNonNull(c4123d1);
        c4123d1.zzd = C4379v6.f23569g;
    }

    /* JADX INFO: renamed from: v */
    public static void m9513v(C4123d1 c4123d1, int i) {
        c4123d1.m9526M();
        c4123d1.zzd.remove(i);
    }

    /* JADX INFO: renamed from: w */
    public static void m9514w(C4123d1 c4123d1, int i, C4151f1 c4151f1) {
        Objects.requireNonNull(c4123d1);
        c4151f1.getClass();
        c4123d1.m9526M();
        c4123d1.zzd.set(i, c4151f1);
    }

    /* JADX INFO: renamed from: x */
    public static void m9515x(C4123d1 c4123d1, long j2) {
        c4123d1.zzc |= 2;
        c4123d1.zzf = j2;
    }

    /* JADX INFO: renamed from: y */
    public static void m9516y(C4123d1 c4123d1, C4151f1 c4151f1) {
        Objects.requireNonNull(c4123d1);
        c4151f1.getClass();
        c4123d1.m9526M();
        c4123d1.zzd.add(c4151f1);
    }

    /* JADX INFO: renamed from: z */
    public static void m9517z(C4123d1 c4123d1, Iterable iterable) {
        c4123d1.m9526M();
        AbstractC4293p3.m10138c(iterable, c4123d1.zzd);
    }

    /* JADX INFO: renamed from: B */
    public final int m9518B() {
        return this.zzd.size();
    }

    /* JADX INFO: renamed from: D */
    public final String m9519D() {
        return this.zze;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m9520E() {
        return (this.zzc & 2) != 0;
    }

    /* JADX INFO: renamed from: F */
    public final long m9521F() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m9522G() {
        return (this.zzc & 4) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final long m9523H() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m9524I() {
        return (this.zzc & 8) != 0;
    }

    /* JADX INFO: renamed from: J */
    public final int m9525J() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: M */
    public final void m9526M() {
        InterfaceC4197i5<C4151f1> interfaceC4197i5 = this.zzd;
        if (interfaceC4197i5.zza()) {
            return;
        }
        this.zzd = AbstractC4099b5.m9410l(interfaceC4197i5);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4263n1.f23332a[i - 1]) {
            case 1:
                return new C4123d1();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", C4151f1.class, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                InterfaceC4338s6<C4123d1> aVar = zzj;
                if (aVar == null) {
                    synchronized (C4123d1.class) {
                        aVar = zzj;
                        if (aVar == null) {
                            aVar = new AbstractC4099b5.a<>(zzi);
                            zzj = aVar;
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

    /* JADX INFO: renamed from: s */
    public final C4151f1 m9527s(int i) {
        return this.zzd.get(i);
    }

    /* JADX INFO: renamed from: t */
    public final List<C4151f1> m9528t() {
        return this.zzd;
    }
}
