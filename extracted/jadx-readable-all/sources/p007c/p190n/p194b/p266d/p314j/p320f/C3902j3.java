package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.j3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3902j3 extends AbstractC4057z4<C3902j3, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3902j3> zzagb;
    private static final C3902j3 zzbgg;
    private InterfaceC3894i5<C3862f3> zzbgf = C4041x6.f22987g;

    /* JADX INFO: renamed from: c.n.b.d.j.f.j3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3902j3, a> implements InterfaceC3915k6 {
        public a() {
            super(C3902j3.zzbgg);
        }

        public a(C3982r3 c3982r3) {
            super(C3902j3.zzbgg);
        }
    }

    static {
        C3902j3 c3902j3 = new C3902j3();
        zzbgg = c3902j3;
        AbstractC4057z4.m9319k(C3902j3.class, c3902j3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3902j3();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbgg, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbgf", C3862f3.class});
            case 4:
                return zzbgg;
            case 5:
                InterfaceC3985r6<C3902j3> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3902j3.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbgg);
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
