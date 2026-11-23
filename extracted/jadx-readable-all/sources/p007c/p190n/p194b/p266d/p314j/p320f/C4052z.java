package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.z */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4052z extends AbstractC4057z4<C4052z, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C4052z> zzagb;
    private static final C4052z zzahs;
    private int zzafn;
    private int zzahm;
    private int zzahn;
    private int zzaho;
    private int zzahp;
    private C4043y zzahq;
    private int zzahr;

    /* JADX INFO: renamed from: c.n.b.d.j.f.z$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C4052z, a> implements InterfaceC3915k6 {
        public a() {
            super(C4052z.zzahs);
        }

        public a(C3809a0 c3809a0) {
            super(C4052z.zzahs);
        }
    }

    static {
        C4052z c4052z = new C4052z();
        zzahs = c4052z;
        AbstractC4057z4.m9319k(C4052z.class, c4052z);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3809a0.f22471a[i - 1]) {
            case 1:
                return new C4052z();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzahs, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\t\u0004\u0006\f\u0005", new Object[]{"zzafn", "zzahm", "zzahn", C3899j0.f22707a, "zzaho", "zzahp", "zzahq", "zzahr", C3879h0.f22688a});
            case 4:
                return zzahs;
            case 5:
                InterfaceC3985r6<C4052z> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C4052z.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzahs);
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
