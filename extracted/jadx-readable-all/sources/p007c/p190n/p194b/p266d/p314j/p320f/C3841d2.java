package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.d2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3841d2 extends AbstractC4057z4<C3841d2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3841d2> zzagb;
    private static final InterfaceC3874g5<Integer, EnumC3811a2> zzbav = new C3992s3();
    private static final C3841d2 zzbaw;
    private int zzafn;
    private String zzbas = "";
    private String zzbat = "";
    private InterfaceC3844d5 zzbau = C3824b5.f22522g;

    /* JADX INFO: renamed from: c.n.b.d.j.f.d2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3841d2, a> implements InterfaceC3915k6 {
        public a() {
            super(C3841d2.zzbaw);
        }

        public a(C3982r3 c3982r3) {
            super(C3841d2.zzbaw);
        }
    }

    static {
        C3841d2 c3841d2 = new C3841d2();
        zzbaw = c3841d2;
        AbstractC4057z4.m9319k(C3841d2.class, c3841d2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3841d2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbaw, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u001e", new Object[]{"zzafn", "zzbas", "zzbat", "zzbau", C3831c2.f22532a});
            case 4:
                return zzbaw;
            case 5:
                InterfaceC3985r6<C3841d2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3841d2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbaw);
                            zzagb = cVar;
                        }
                        break;
                    }
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
