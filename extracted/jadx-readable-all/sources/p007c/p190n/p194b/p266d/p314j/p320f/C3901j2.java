package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.j2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3901j2 extends AbstractC4057z4<C3901j2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3901j2> zzagb;
    private static final C3901j2 zzbhy;
    private int zzafn;
    private InterfaceC3894i5<C3941n2> zzbhv;
    private InterfaceC3894i5<C3822b3> zzbhw;
    private C3931m2 zzbhx;

    /* JADX INFO: renamed from: c.n.b.d.j.f.j2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3901j2, a> implements InterfaceC3915k6 {
        public a() {
            super(C3901j2.zzbhy);
        }

        public a(C3982r3 c3982r3) {
            super(C3901j2.zzbhy);
        }
    }

    static {
        C3901j2 c3901j2 = new C3901j2();
        zzbhy = c3901j2;
        AbstractC4057z4.m9319k(C3901j2.class, c3901j2);
    }

    public C3901j2() {
        C4041x6<Object> c4041x6 = C4041x6.f22987g;
        this.zzbhv = c4041x6;
        this.zzbhw = c4041x6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3901j2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbhy, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\t\u0000", new Object[]{"zzafn", "zzbhv", C3941n2.class, "zzbhw", C3822b3.class, "zzbhx"});
            case 4:
                return zzbhy;
            case 5:
                InterfaceC3985r6<C3901j2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3901j2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbhy);
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
