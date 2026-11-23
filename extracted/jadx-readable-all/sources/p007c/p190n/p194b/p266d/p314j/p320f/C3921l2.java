package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.l2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3921l2 extends AbstractC4057z4<C3921l2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3921l2> zzagb;
    private static final C3921l2 zzbih;
    private int zzafn;
    private String zzbdd = "";
    private InterfaceC3894i5<C3892i3> zzbie;
    private InterfaceC3894i5<C3832c3> zzbif;
    private boolean zzbig;

    /* JADX INFO: renamed from: c.n.b.d.j.f.l2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3921l2, a> implements InterfaceC3915k6 {
        public a() {
            super(C3921l2.zzbih);
        }

        public a(C3982r3 c3982r3) {
            super(C3921l2.zzbih);
        }
    }

    static {
        C3921l2 c3921l2 = new C3921l2();
        zzbih = c3921l2;
        AbstractC4057z4.m9319k(C3921l2.class, c3921l2);
    }

    public C3921l2() {
        C4041x6<Object> c4041x6 = C4041x6.f22987g;
        this.zzbie = c4041x6;
        this.zzbif = c4041x6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3921l2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbih, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\b\u0000\u0002\u001b\u0003\u001b\u0004\u0007\u0001", new Object[]{"zzafn", "zzbdd", "zzbie", C3892i3.class, "zzbif", C3832c3.class, "zzbig"});
            case 4:
                return zzbih;
            case 5:
                InterfaceC3985r6<C3921l2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3921l2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbih);
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
