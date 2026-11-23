package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.y */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4043y extends AbstractC4057z4<C4043y, a> implements InterfaceC3915k6 {
    private static final C4043y zzaga;
    private static volatile InterfaceC3985r6<C4043y> zzagb;
    private int zzafn;
    private int zzafo;
    private int zzafp;
    private int zzafq;
    private int zzafr;
    private int zzafs;
    private int zzaft;
    private int zzafu;
    private int zzafv;
    private int zzafw;
    private int zzafx;
    private int zzafy;
    private boolean zzafz;

    /* JADX INFO: renamed from: c.n.b.d.j.f.y$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C4043y, a> implements InterfaceC3915k6 {
        public a() {
            super(C4043y.zzaga);
        }

        public a(C3809a0 c3809a0) {
            super(C4043y.zzaga);
        }
    }

    static {
        C4043y c4043y = new C4043y();
        zzaga = c4043y;
        AbstractC4057z4.m9319k(C4043y.class, c4043y);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3809a0.f22471a[i - 1]) {
            case 1:
                return new C4043y();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzaga, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\f\u0002\u0004\f\u0003\u0005\f\u0004\u0006\f\u0005\u0007\f\u0006\b\f\u0007\t\u0004\b\n\u0004\t\u000b\u0004\n\f\u0007\u000b", new Object[]{"zzafn", "zzafo", "zzafp", "zzafq", C3839d0.f22555a, "zzafr", C3849e0.f22567a, "zzafs", C3829c0.f22530a, "zzaft", C3859f0.f22573a, "zzafu", C3869g0.f22682a, "zzafv", C3819b0.f22516a, "zzafw", "zzafx", "zzafy", "zzafz"});
            case 4:
                return zzaga;
            case 5:
                InterfaceC3985r6<C4043y> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C4043y.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzaga);
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
