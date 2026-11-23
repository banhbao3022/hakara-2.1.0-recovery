package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.x2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4037x2 extends AbstractC4057z4<C4037x2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C4037x2> zzagb;
    private static final C4037x2 zzbcg;
    private int zzafn;
    private int zzbcf;

    /* JADX INFO: renamed from: c.n.b.d.j.f.x2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C4037x2, a> implements InterfaceC3915k6 {
        public a() {
            super(C4037x2.zzbcg);
        }

        public a(C3982r3 c3982r3) {
            super(C4037x2.zzbcg);
        }
    }

    static {
        C4037x2 c4037x2 = new C4037x2();
        zzbcg = c4037x2;
        AbstractC4057z4.m9319k(C4037x2.class, c4037x2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C4037x2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbcg, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"zzafn", "zzbcf", C3979r0.f22857a});
            case 4:
                return zzbcg;
            case 5:
                InterfaceC3985r6<C4037x2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C4037x2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbcg);
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
