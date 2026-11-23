package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.g3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3872g3 extends AbstractC4057z4<C3872g3, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3872g3> zzagb;
    private static final C3872g3 zzbfz;
    private int zzafn;
    private int zzbbl;
    private int zzbft;
    private int zzbfu;
    private InterfaceC3844d5 zzbfv;
    private InterfaceC3844d5 zzbfw;
    private InterfaceC3894i5<String> zzbfx;
    private InterfaceC3894i5<String> zzbfy;

    /* JADX INFO: renamed from: c.n.b.d.j.f.g3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3872g3, a> implements InterfaceC3915k6 {
        public a() {
            super(C3872g3.zzbfz);
        }

        public a(C3982r3 c3982r3) {
            super(C3872g3.zzbfz);
        }
    }

    static {
        C3872g3 c3872g3 = new C3872g3();
        zzbfz = c3872g3;
        AbstractC4057z4.m9319k(C3872g3.class, c3872g3);
    }

    public C3872g3() {
        C3824b5 c3824b5 = C3824b5.f22522g;
        this.zzbfv = c3824b5;
        this.zzbfw = c3824b5;
        C4041x6<Object> c4041x6 = C4041x6.f22987g;
        this.zzbfx = c4041x6;
        this.zzbfy = c4041x6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3872g3();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbfz, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001\u0004\u0000\u0002\f\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007\f\u0002", new Object[]{"zzafn", "zzbft", "zzbfu", C3810a1.f22472a, "zzbfv", "zzbfw", "zzbfx", "zzbfy", "zzbbl", C4026w0.f22967a});
            case 4:
                return zzbfz;
            case 5:
                InterfaceC3985r6<C3872g3> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3872g3.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbfz);
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
