package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.s1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4333s1 extends AbstractC4099b5<C4333s1, a> implements InterfaceC4254m6 {
    private static final C4333s1 zzf;
    private static volatile InterfaceC4338s6<C4333s1> zzg;
    private int zzc;
    private InterfaceC4197i5<C4347t1> zzd = C4379v6.f23569g;
    private C4305q1 zze;

    /* JADX INFO: renamed from: c.n.b.d.j.k.s1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4333s1, a> implements InterfaceC4254m6 {
        public a() {
            super(C4333s1.zzf);
        }

        public a(C4361u1 c4361u1) {
            super(C4333s1.zzf);
        }
    }

    static {
        C4333s1 c4333s1 = new C4333s1();
        zzf = c4333s1;
        AbstractC4099b5.m9413p(C4333s1.class, c4333s1);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4361u1.f23493a[i - 1]) {
            case 1:
                return new C4333s1();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", C4347t1.class, "zze"});
            case 4:
                return zzf;
            case 5:
                InterfaceC4338s6<C4333s1> aVar = zzg;
                if (aVar == null) {
                    synchronized (C4333s1.class) {
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
}
