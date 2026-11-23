package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.g2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3871g2 extends AbstractC4057z4<C3871g2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3871g2> zzagb;
    private static final C3871g2 zzbhj;
    private int zzafn;
    private int zzbgc;
    private String zzbhi = "";

    /* JADX INFO: renamed from: c.n.b.d.j.f.g2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3871g2, a> implements InterfaceC3915k6 {
        public a() {
            super(C3871g2.zzbhj);
        }

        public a(C3982r3 c3982r3) {
            super(C3871g2.zzbhj);
        }
    }

    static {
        C3871g2 c3871g2 = new C3871g2();
        zzbhj = c3871g2;
        AbstractC4057z4.m9319k(C3871g2.class, c3871g2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3871g2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbhj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001", new Object[]{"zzafn", "zzbgc", "zzbhi"});
            case 4:
                return zzbhj;
            case 5:
                InterfaceC3985r6<C3871g2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3871g2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbhj);
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
