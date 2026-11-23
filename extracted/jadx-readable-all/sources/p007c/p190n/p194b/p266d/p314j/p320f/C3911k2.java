package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.k2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3911k2 extends AbstractC4057z4<C3911k2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3911k2> zzagb;
    private static final C3911k2 zzbid;
    private int zzafn;
    private C3832c3 zzbbu;
    private int zzbcf;
    private long zzbgt;
    private int zzbhz;
    private int zzbia;
    private int zzbib;
    private InterfaceC3894i5<C3832c3> zzbic = C4041x6.f22987g;

    /* JADX INFO: renamed from: c.n.b.d.j.f.k2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3911k2, a> implements InterfaceC3915k6 {
        public a() {
            super(C3911k2.zzbid);
        }

        public a(C3982r3 c3982r3) {
            super(C3911k2.zzbid);
        }
    }

    static {
        C3911k2 c3911k2 = new C3911k2();
        zzbid = c3911k2;
        AbstractC4057z4.m9319k(C3911k2.class, c3911k2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3911k2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbid, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\t\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\f\u0004\u0006\u0002\u0005\u0007\u001b", new Object[]{"zzafn", "zzbbu", "zzbhz", C3960p1.f22837a, "zzbcf", C3940n1.f22820a, "zzbia", C4026w0.f22967a, "zzbib", C3969q0.f22843a, "zzbgt", "zzbic", C3832c3.class});
            case 4:
                return zzbid;
            case 5:
                InterfaceC3985r6<C3911k2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3911k2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbid);
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
