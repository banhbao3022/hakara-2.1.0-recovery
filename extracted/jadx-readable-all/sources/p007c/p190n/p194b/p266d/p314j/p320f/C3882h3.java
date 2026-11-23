package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.h3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3882h3 extends AbstractC4057z4<C3882h3, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3882h3> zzagb;
    private static final C3882h3 zzbga;
    private int zzafn;
    private int zzbfu;

    /* JADX INFO: renamed from: c.n.b.d.j.f.h3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3882h3, a> implements InterfaceC3915k6 {
        public a() {
            super(C3882h3.zzbga);
        }

        public a(C3982r3 c3982r3) {
            super(C3882h3.zzbga);
        }
    }

    static {
        C3882h3 c3882h3 = new C3882h3();
        zzbga = c3882h3;
        AbstractC4057z4.m9319k(C3882h3.class, c3882h3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3882h3();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbga, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"zzafn", "zzbfu", C3810a1.f22472a});
            case 4:
                return zzbga;
            case 5:
                InterfaceC3985r6<C3882h3> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3882h3.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbga);
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
