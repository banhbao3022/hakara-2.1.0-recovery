package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.p2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3961p2 extends AbstractC4057z4<C3961p2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3961p2> zzagb;
    private static final C3961p2 zzbir;
    private int zzafn;
    private int zzbim;
    private int zzbin;
    private InterfaceC3894i5<C3832c3> zzbio;
    private InterfaceC3894i5<C3832c3> zzbip;
    private int zzbiq;

    /* JADX INFO: renamed from: c.n.b.d.j.f.p2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3961p2, a> implements InterfaceC3915k6 {
        public a() {
            super(C3961p2.zzbir);
        }

        public a(C3982r3 c3982r3) {
            super(C3961p2.zzbir);
        }
    }

    static {
        C3961p2 c3961p2 = new C3961p2();
        zzbir = c3961p2;
        AbstractC4057z4.m9319k(C3961p2.class, c3961p2);
    }

    public C3961p2() {
        C4041x6<Object> c4041x6 = C4041x6.f22987g;
        this.zzbio = c4041x6;
        this.zzbip = c4041x6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3961p2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbir, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u001b\u0004\u001b\u0005\f\u0002", new Object[]{"zzafn", "zzbim", C4027w1.f22968a, "zzbin", C4045y1.f22991a, "zzbio", C3832c3.class, "zzbip", C3832c3.class, "zzbiq", C4026w0.f22967a});
            case 4:
                return zzbir;
            case 5:
                InterfaceC3985r6<C3961p2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3961p2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbir);
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
