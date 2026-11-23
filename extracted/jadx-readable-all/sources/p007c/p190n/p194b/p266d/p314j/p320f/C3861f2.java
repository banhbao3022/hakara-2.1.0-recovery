package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.f2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3861f2 extends AbstractC4057z4<C3861f2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3861f2> zzagb;
    private static final C3861f2 zzbhh;
    private int zzafn;
    private int zzbhe;
    private int zzbhf;
    private int zzbhg;

    /* JADX INFO: renamed from: c.n.b.d.j.f.f2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3861f2, a> implements InterfaceC3915k6 {
        public a() {
            super(C3861f2.zzbhh);
        }

        public a(C3982r3 c3982r3) {
            super(C3861f2.zzbhh);
        }
    }

    static {
        C3861f2 c3861f2 = new C3861f2();
        zzbhh = c3861f2;
        AbstractC4057z4.m9319k(C3861f2.class, c3861f2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3861f2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbhh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002", new Object[]{"zzafn", "zzbhe", "zzbhf", "zzbhg"});
            case 4:
                return zzbhh;
            case 5:
                InterfaceC3985r6<C3861f2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3861f2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbhh);
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
