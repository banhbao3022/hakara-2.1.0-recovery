package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.f3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3862f3 extends AbstractC4057z4<C3862f3, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3862f3> zzagb;
    private static final C3862f3 zzbfs;
    private int zzafn;
    private String zzbdd = "";
    private boolean zzbfq;
    private C3971q2 zzbfr;

    /* JADX INFO: renamed from: c.n.b.d.j.f.f3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3862f3, a> implements InterfaceC3915k6 {
        public a() {
            super(C3862f3.zzbfs);
        }

        public a(C3982r3 c3982r3) {
            super(C3862f3.zzbfs);
        }
    }

    static {
        C3862f3 c3862f3 = new C3862f3();
        zzbfs = c3862f3;
        AbstractC4057z4.m9319k(C3862f3.class, c3862f3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3862f3();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbfs, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\t\u0002", new Object[]{"zzafn", "zzbdd", "zzbfq", "zzbfr"});
            case 4:
                return zzbfs;
            case 5:
                InterfaceC3985r6<C3862f3> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3862f3.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbfs);
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
