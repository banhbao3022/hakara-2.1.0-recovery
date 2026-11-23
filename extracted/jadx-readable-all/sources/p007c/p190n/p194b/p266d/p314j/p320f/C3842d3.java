package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.d3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3842d3 extends AbstractC4057z4<C3842d3, b> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3842d3> zzagb;
    private static final C3842d3 zzbfd;
    private int zzafn;
    private int zzbez;
    private int zzbfa;
    private int zzbfb;
    private InterfaceC3894i5<a> zzbfc = C4041x6.f22987g;

    /* JADX INFO: renamed from: c.n.b.d.j.f.d3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4<a, C8516a> implements InterfaceC3915k6 {
        private static volatile InterfaceC3985r6<a> zzagb;
        private static final a zzbfi;
        private int zzafn;
        private int zzbfe;
        private int zzbff;
        private int zzbfg;
        private int zzbfh;

        /* JADX INFO: renamed from: c.n.b.d.j.f.d3$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
        public static final class C8516a extends AbstractC4057z4.a<a, C8516a> implements InterfaceC3915k6 {
            public C8516a() {
                super(a.zzbfi);
            }

            public C8516a(C3982r3 c3982r3) {
                super(a.zzbfi);
            }
        }

        static {
            a aVar = new a();
            zzbfi = aVar;
            AbstractC4057z4.m9319k(a.class, aVar);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
        /* JADX INFO: renamed from: h */
        public final Object mo8926h(int i, Object obj, Object obj2) {
            switch (C3982r3.f22859a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C8516a(null);
                case 3:
                    return new C4023v6(zzbfi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003", new Object[]{"zzafn", "zzbfe", "zzbff", "zzbfg", "zzbfh"});
                case 4:
                    return zzbfi;
                case 5:
                    InterfaceC3985r6<a> cVar = zzagb;
                    if (cVar == null) {
                        synchronized (a.class) {
                            cVar = zzagb;
                            if (cVar == null) {
                                cVar = new AbstractC4057z4.c<>(zzbfi);
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

    /* JADX INFO: renamed from: c.n.b.d.j.f.d3$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class b extends AbstractC4057z4.a<C3842d3, b> implements InterfaceC3915k6 {
        public b() {
            super(C3842d3.zzbfd);
        }

        public b(C3982r3 c3982r3) {
            super(C3842d3.zzbfd);
        }
    }

    static {
        C3842d3 c3842d3 = new C3842d3();
        zzbfd = c3842d3;
        AbstractC4057z4.m9319k(C3842d3.class, c3842d3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3842d3();
            case 2:
                return new b(null);
            case 3:
                return new C4023v6(zzbfd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u001b", new Object[]{"zzafn", "zzbez", "zzbfa", "zzbfb", "zzbfc", a.class});
            case 4:
                return zzbfd;
            case 5:
                InterfaceC3985r6<C3842d3> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3842d3.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbfd);
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
