package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.j.k.k1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4221k1 extends AbstractC4099b5<C4221k1, a> implements InterfaceC4254m6 {
    private static final C4221k1 zzf;
    private static volatile InterfaceC4338s6<C4221k1> zzg;
    private int zzc;
    private int zzd;
    private InterfaceC4211j5 zze = C4430z5.f23654g;

    /* JADX INFO: renamed from: c.n.b.d.j.k.k1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4221k1, a> implements InterfaceC4254m6 {
        public a() {
            super(C4221k1.zzf);
        }

        public a(C4263n1 c4263n1) {
            super(C4221k1.zzf);
        }
    }

    static {
        C4221k1 c4221k1 = new C4221k1();
        zzf = c4221k1;
        AbstractC4099b5.m9413p(C4221k1.class, c4221k1);
    }

    /* JADX INFO: renamed from: t */
    public static void m9913t(C4221k1 c4221k1, int i) {
        c4221k1.zzc |= 1;
        c4221k1.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static void m9914u(C4221k1 c4221k1, Iterable iterable) {
        InterfaceC4211j5 interfaceC4211j5 = c4221k1.zze;
        if (!((AbstractC4335s3) interfaceC4211j5).f23452f) {
            c4221k1.zze = AbstractC4099b5.m9411m(interfaceC4211j5);
        }
        AbstractC4293p3.m10138c(iterable, c4221k1.zze);
    }

    /* JADX INFO: renamed from: z */
    public static a m9915z() {
        return zzf.m9422q();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4263n1.f23332a[i - 1]) {
            case 1:
                return new C4221k1();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                InterfaceC4338s6<C4221k1> aVar = zzg;
                if (aVar == null) {
                    synchronized (C4221k1.class) {
                        aVar = zzg;
                        if (aVar == null) {
                            aVar = new AbstractC4099b5.a<>(zzf);
                            zzg = aVar;
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
    public final long m9916s(int i) {
        C4430z5 c4430z5 = (C4430z5) this.zze;
        c4430z5.m10346m(i);
        return c4430z5.f23655h[i];
    }

    /* JADX INFO: renamed from: v */
    public final boolean m9917v() {
        return (this.zzc & 1) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final int m9918w() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: x */
    public final List<Long> m9919x() {
        return this.zze;
    }

    /* JADX INFO: renamed from: y */
    public final int m9920y() {
        return ((C4430z5) this.zze).size();
    }
}
