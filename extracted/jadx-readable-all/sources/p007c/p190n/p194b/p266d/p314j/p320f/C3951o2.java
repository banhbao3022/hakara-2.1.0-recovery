package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.o2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3951o2 extends AbstractC4057z4<C3951o2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3951o2> zzagb;
    private static final C3951o2 zzbil;
    private int zzafn;
    private InterfaceC3894i5<C3871g2> zzbbn;
    private int zzbhp;
    private int zzbhz;
    private InterfaceC3894i5<C3871g2> zzbik;

    /* JADX INFO: renamed from: c.n.b.d.j.f.o2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3951o2, a> implements InterfaceC3915k6 {
        public a() {
            super(C3951o2.zzbil);
        }

        public a(C3982r3 c3982r3) {
            super(C3951o2.zzbil);
        }
    }

    static {
        C3951o2 c3951o2 = new C3951o2();
        zzbil = c3951o2;
        AbstractC4057z4.m9319k(C3951o2.class, c3951o2);
    }

    public C3951o2() {
        C4041x6<Object> c4041x6 = C4041x6.f22987g;
        this.zzbbn = c4041x6;
        this.zzbik = c4041x6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3951o2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbil, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\f\u0000\u0002\u001b\u0003\u001b\u0004\u0004\u0001", new Object[]{"zzafn", "zzbhz", C4018v1.f22905a, "zzbbn", C3871g2.class, "zzbik", C3871g2.class, "zzbhp"});
            case 4:
                return zzbil;
            case 5:
                InterfaceC3985r6<C3951o2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3951o2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbil);
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
