package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.q1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4305q1 extends AbstractC4099b5<C4305q1, a> implements InterfaceC4254m6 {
    private static final C4305q1 zzd;
    private static volatile InterfaceC4338s6<C4305q1> zze;
    private InterfaceC4197i5<C4319r1> zzc = C4379v6.f23569g;

    /* JADX INFO: renamed from: c.n.b.d.j.k.q1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4305q1, a> implements InterfaceC4254m6 {
        public a() {
            super(C4305q1.zzd);
        }

        public a(C4361u1 c4361u1) {
            super(C4305q1.zzd);
        }
    }

    static {
        C4305q1 c4305q1 = new C4305q1();
        zzd = c4305q1;
        AbstractC4099b5.m9413p(C4305q1.class, c4305q1);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4361u1.f23493a[i - 1]) {
            case 1:
                return new C4305q1();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C4319r1.class});
            case 4:
                return zzd;
            case 5:
                InterfaceC4338s6<C4305q1> aVar = zze;
                if (aVar == null) {
                    synchronized (C4305q1.class) {
                        aVar = zze;
                        if (aVar == null) {
                            aVar = new AbstractC4099b5.a<>(zzd);
                            zze = aVar;
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
