package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.y0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4412y0 extends AbstractC4099b5<C4412y0, a> implements InterfaceC4254m6 {
    private static final C4412y0 zzf;
    private static volatile InterfaceC4338s6<C4412y0> zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    /* JADX INFO: renamed from: c.n.b.d.j.k.y0$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4412y0, a> implements InterfaceC4254m6 {
        public a() {
            super(C4412y0.zzf);
        }

        public a(C4081a1 c4081a1) {
            super(C4412y0.zzf);
        }
    }

    static {
        C4412y0 c4412y0 = new C4412y0();
        zzf = c4412y0;
        AbstractC4099b5.m9413p(C4412y0.class, c4412y0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4081a1.f23025a[i - 1]) {
            case 1:
                return new C4412y0();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                InterfaceC4338s6<C4412y0> aVar = zzg;
                if (aVar == null) {
                    synchronized (C4412y0.class) {
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
    public final String m10337s() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: t */
    public final String m10338t() {
        return this.zze;
    }
}
