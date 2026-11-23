package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.c1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4109c1 extends AbstractC4099b5<C4109c1, a> implements InterfaceC4254m6 {
    private static final C4109c1 zzf;
    private static volatile InterfaceC4338s6<C4109c1> zzg;
    private int zzc;
    private int zzd;
    private long zze;

    /* JADX INFO: renamed from: c.n.b.d.j.k.c1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4109c1, a> implements InterfaceC4254m6 {
        public a() {
            super(C4109c1.zzf);
        }

        public a(C4263n1 c4263n1) {
            super(C4109c1.zzf);
        }
    }

    static {
        C4109c1 c4109c1 = new C4109c1();
        zzf = c4109c1;
        AbstractC4099b5.m9413p(C4109c1.class, c4109c1);
    }

    /* JADX INFO: renamed from: s */
    public static void m9493s(C4109c1 c4109c1, int i) {
        c4109c1.zzc |= 1;
        c4109c1.zzd = i;
    }

    /* JADX INFO: renamed from: t */
    public static void m9494t(C4109c1 c4109c1, long j2) {
        c4109c1.zzc |= 2;
        c4109c1.zze = j2;
    }

    /* JADX INFO: renamed from: y */
    public static a m9495y() {
        return zzf.m9422q();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4263n1.f23332a[i - 1]) {
            case 1:
                return new C4109c1();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                InterfaceC4338s6<C4109c1> aVar = zzg;
                if (aVar == null) {
                    synchronized (C4109c1.class) {
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

    /* JADX INFO: renamed from: u */
    public final boolean m9497u() {
        return (this.zzc & 1) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final int m9498v() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m9499w() {
        return (this.zzc & 2) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final long m9500x() {
        return this.zze;
    }
}
