package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.e3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3852e3 extends AbstractC4057z4<C3852e3, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3852e3> zzagb;
    private static final C3852e3 zzbfp;
    private int zzafn;
    private boolean zzbfj;
    private int zzbfk;
    private int zzbfl;
    private int zzbfm;
    private C3962p3 zzbfn;
    private int zzbfo;

    /* JADX INFO: renamed from: c.n.b.d.j.f.e3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3852e3, a> implements InterfaceC3915k6 {
        public a() {
            super(C3852e3.zzbfp);
        }

        public a(C3982r3 c3982r3) {
            super(C3852e3.zzbfp);
        }
    }

    static {
        C3852e3 c3852e3 = new C3852e3();
        zzbfp = c3852e3;
        AbstractC4057z4.m9319k(C3852e3.class, c3852e3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3852e3();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbfp, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\t\u0004\u0006\f\u0005", new Object[]{"zzafn", "zzbfj", "zzbfk", C4026w0.f22967a, "zzbfl", C4044y0.f22990a, "zzbfm", C3959p0.f22836a, "zzbfn", "zzbfo", C4035x0.f22984a});
            case 4:
                return zzbfp;
            case 5:
                InterfaceC3985r6<C3852e3> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3852e3.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbfp);
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
