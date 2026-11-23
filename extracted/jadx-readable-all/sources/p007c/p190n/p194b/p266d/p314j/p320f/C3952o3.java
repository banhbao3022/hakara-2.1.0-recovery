package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.o3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3952o3 extends AbstractC4057z4<C3952o3, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3952o3> zzagb;
    private static final C3952o3 zzbgv;
    private int zzafn;
    private int zzbcf;
    private long zzbgt;
    private int zzbgu;

    /* JADX INFO: renamed from: c.n.b.d.j.f.o3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3952o3, a> implements InterfaceC3915k6 {
        public a() {
            super(C3952o3.zzbgv);
        }

        public a(C3982r3 c3982r3) {
            super(C3952o3.zzbgv);
        }
    }

    static {
        C3952o3 c3952o3 = new C3952o3();
        zzbgv = c3952o3;
        AbstractC4057z4.m9319k(C3952o3.class, c3952o3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3952o3();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbgv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\f\u0002", new Object[]{"zzafn", "zzbcf", C3880h1.f22689a, "zzbgt", "zzbgu", C3969q0.f22843a});
            case 4:
                return zzbgv;
            case 5:
                InterfaceC3985r6<C3952o3> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3952o3.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbgv);
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
