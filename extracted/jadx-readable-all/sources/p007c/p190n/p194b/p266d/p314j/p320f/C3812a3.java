package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.a3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3812a3 extends AbstractC4057z4<C3812a3, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3812a3> zzagb;
    private static final C3812a3 zzber;
    private int zzafn;
    private int zzbeo = 0;
    private Object zzbep;
    private long zzbeq;

    /* JADX INFO: renamed from: c.n.b.d.j.f.a3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3812a3, a> implements InterfaceC3915k6 {
        public a() {
            super(C3812a3.zzber);
        }

        public a(C3982r3 c3982r3) {
            super(C3812a3.zzber);
        }
    }

    static {
        C3812a3 c3812a3 = new C3812a3();
        zzber = c3812a3;
        AbstractC4057z4.m9319k(C3812a3.class, c3812a3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3812a3();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzber, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0005\u0000\u0002:\u0000\u00035\u0000\u00048\u0000", new Object[]{"zzbep", "zzbeo", "zzafn", "zzbeq"});
            case 4:
                return zzber;
            case 5:
                InterfaceC3985r6<C3812a3> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3812a3.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzber);
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
