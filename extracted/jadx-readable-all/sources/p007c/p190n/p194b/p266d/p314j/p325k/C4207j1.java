package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.j1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4207j1 extends AbstractC4099b5<C4207j1, a> implements InterfaceC4254m6 {
    private static final C4207j1 zzg;
    private static volatile InterfaceC4338s6<C4207j1> zzh;
    private InterfaceC4211j5 zzc;
    private InterfaceC4211j5 zzd;
    private InterfaceC4197i5<C4109c1> zze;
    private InterfaceC4197i5<C4221k1> zzf;

    /* JADX INFO: renamed from: c.n.b.d.j.k.j1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4207j1, a> implements InterfaceC4254m6 {
        public a() {
            super(C4207j1.zzg);
        }

        public a(C4263n1 c4263n1) {
            super(C4207j1.zzg);
        }
    }

    static {
        C4207j1 c4207j1 = new C4207j1();
        zzg = c4207j1;
        AbstractC4099b5.m9413p(C4207j1.class, c4207j1);
    }

    public C4207j1() {
        C4430z5 c4430z5 = C4430z5.f23654g;
        this.zzc = c4430z5;
        this.zzd = c4430z5;
        C4379v6<Object> c4379v6 = C4379v6.f23569g;
        this.zze = c4379v6;
        this.zzf = c4379v6;
    }

    /* JADX INFO: renamed from: A */
    public static void m9839A(C4207j1 c4207j1, int i) {
        InterfaceC4197i5<C4221k1> interfaceC4197i5 = c4207j1.zzf;
        if (!interfaceC4197i5.zza()) {
            c4207j1.zzf = AbstractC4099b5.m9410l(interfaceC4197i5);
        }
        c4207j1.zzf.remove(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public static void m9840B(C4207j1 c4207j1, Iterable iterable) {
        InterfaceC4211j5 interfaceC4211j5 = c4207j1.zzd;
        if (!((AbstractC4335s3) interfaceC4211j5).f23452f) {
            c4207j1.zzd = AbstractC4099b5.m9411m(interfaceC4211j5);
        }
        AbstractC4293p3.m10138c(iterable, c4207j1.zzd);
    }

    /* JADX INFO: renamed from: D */
    public static void m9841D(C4207j1 c4207j1, Iterable iterable) {
        InterfaceC4197i5<C4109c1> interfaceC4197i5 = c4207j1.zze;
        if (!interfaceC4197i5.zza()) {
            c4207j1.zze = AbstractC4099b5.m9410l(interfaceC4197i5);
        }
        AbstractC4293p3.m10138c(iterable, c4207j1.zze);
    }

    /* JADX INFO: renamed from: F */
    public static void m9842F(C4207j1 c4207j1, Iterable iterable) {
        InterfaceC4197i5<C4221k1> interfaceC4197i5 = c4207j1.zzf;
        if (!interfaceC4197i5.zza()) {
            c4207j1.zzf = AbstractC4099b5.m9410l(interfaceC4197i5);
        }
        AbstractC4293p3.m10138c(iterable, c4207j1.zzf);
    }

    /* JADX INFO: renamed from: K */
    public static a m9843K() {
        return zzg.m9422q();
    }

    /* JADX INFO: renamed from: L */
    public static C4207j1 m9844L() {
        return zzg;
    }

    /* JADX INFO: renamed from: u */
    public static void m9846u(C4207j1 c4207j1) {
        Objects.requireNonNull(c4207j1);
        c4207j1.zzc = C4430z5.f23654g;
    }

    /* JADX INFO: renamed from: v */
    public static void m9847v(C4207j1 c4207j1, int i) {
        InterfaceC4197i5<C4109c1> interfaceC4197i5 = c4207j1.zze;
        if (!interfaceC4197i5.zza()) {
            c4207j1.zze = AbstractC4099b5.m9410l(interfaceC4197i5);
        }
        c4207j1.zze.remove(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public static void m9848w(C4207j1 c4207j1, Iterable iterable) {
        InterfaceC4211j5 interfaceC4211j5 = c4207j1.zzc;
        if (!((AbstractC4335s3) interfaceC4211j5).f23452f) {
            c4207j1.zzc = AbstractC4099b5.m9411m(interfaceC4211j5);
        }
        AbstractC4293p3.m10138c(iterable, c4207j1.zzc);
    }

    /* JADX INFO: renamed from: z */
    public static void m9849z(C4207j1 c4207j1) {
        Objects.requireNonNull(c4207j1);
        c4207j1.zzd = C4430z5.f23654g;
    }

    /* JADX INFO: renamed from: C */
    public final List<Long> m9850C() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: E */
    public final int m9851E() {
        return ((C4430z5) this.zzd).size();
    }

    /* JADX INFO: renamed from: G */
    public final List<C4109c1> m9852G() {
        return this.zze;
    }

    /* JADX INFO: renamed from: H */
    public final int m9853H() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: I */
    public final List<C4221k1> m9854I() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: J */
    public final int m9855J() {
        return this.zzf.size();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4263n1.f23332a[i - 1]) {
            case 1:
                return new C4207j1();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", C4109c1.class, "zzf", C4221k1.class});
            case 4:
                return zzg;
            case 5:
                InterfaceC4338s6<C4207j1> aVar = zzh;
                if (aVar == null) {
                    synchronized (C4207j1.class) {
                        aVar = zzh;
                        if (aVar == null) {
                            aVar = new AbstractC4099b5.a<>(zzg);
                            zzh = aVar;
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
    public final C4109c1 m9856s(int i) {
        return this.zze.get(i);
    }

    /* JADX INFO: renamed from: t */
    public final List<Long> m9857t() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: x */
    public final int m9858x() {
        return ((C4430z5) this.zzc).size();
    }

    /* JADX INFO: renamed from: y */
    public final C4221k1 m9859y(int i) {
        return this.zzf.get(i);
    }
}
