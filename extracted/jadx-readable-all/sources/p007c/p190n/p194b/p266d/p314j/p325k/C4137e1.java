package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.e1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4137e1 extends AbstractC4099b5<C4137e1, a> implements InterfaceC4254m6 {
    private static final C4137e1 zzf;
    private static volatile InterfaceC4338s6<C4137e1> zzg;
    private int zzc;
    private String zzd = "";
    private long zze;

    /* JADX INFO: renamed from: c.n.b.d.j.k.e1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4137e1, a> implements InterfaceC4254m6 {
        public a() {
            super(C4137e1.zzf);
        }

        public a(C4263n1 c4263n1) {
            super(C4137e1.zzf);
        }
    }

    static {
        C4137e1 c4137e1 = new C4137e1();
        zzf = c4137e1;
        AbstractC4099b5.m9413p(C4137e1.class, c4137e1);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4263n1.f23332a[i - 1]) {
            case 1:
                return new C4137e1();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                InterfaceC4338s6<C4137e1> aVar = zzg;
                if (aVar == null) {
                    synchronized (C4137e1.class) {
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
