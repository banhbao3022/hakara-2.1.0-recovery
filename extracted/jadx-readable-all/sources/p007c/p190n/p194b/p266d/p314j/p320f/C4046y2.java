package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.y2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4046y2 extends AbstractC4057z4<C4046y2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C4046y2> zzagb;
    private static final C4046y2 zzbcm;
    private int zzafn;
    private int zzbch;
    private int zzbci;
    private int zzbcj;
    private boolean zzbck;
    private int zzbcl;

    /* JADX INFO: renamed from: c.n.b.d.j.f.y2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C4046y2, a> implements InterfaceC3915k6 {
        public a() {
            super(C4046y2.zzbcm);
        }

        public a(C3982r3 c3982r3) {
            super(C4046y2.zzbcm);
        }
    }

    static {
        C4046y2 c4046y2 = new C4046y2();
        zzbcm = c4046y2;
        AbstractC4057z4.m9319k(C4046y2.class, c4046y2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C4046y2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbcm, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\u0007\u0003\u0005\u0004\u0004", new Object[]{"zzafn", "zzbch", C3930m1.f22786a, "zzbci", C3910k1.f22724a, "zzbcj", C3920l1.f22762a, "zzbck", "zzbcl"});
            case 4:
                return zzbcm;
            case 5:
                InterfaceC3985r6<C4046y2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C4046y2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbcm);
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
