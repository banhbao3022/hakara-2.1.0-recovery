package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.w2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4028w2 extends AbstractC4057z4<C4028w2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C4028w2> zzagb;
    private static final C4028w2 zzbce;
    private int zzafn;
    private int zzbbd;
    private int zzbcb;
    private int zzbcc;
    private int zzbcd;

    /* JADX INFO: renamed from: c.n.b.d.j.f.w2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C4028w2, a> implements InterfaceC3915k6 {
        public a() {
            super(C4028w2.zzbce);
        }

        public a(C3982r3 c3982r3) {
            super(C4028w2.zzbce);
        }
    }

    static {
        C4028w2 c4028w2 = new C4028w2();
        zzbce = c4028w2;
        AbstractC4057z4.m9319k(C4028w2.class, c4028w2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C4028w2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbce, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0000\u0002\u000b\u0001\u0003\f\u0002\u0004\u0004\u0003", new Object[]{"zzafn", "zzbcb", "zzbbd", "zzbcc", C3840d1.f22556a, "zzbcd"});
            case 4:
                return zzbce;
            case 5:
                InterfaceC3985r6<C4028w2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C4028w2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbce);
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
