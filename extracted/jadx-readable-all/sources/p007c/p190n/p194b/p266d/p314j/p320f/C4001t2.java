package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.t2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4001t2 extends AbstractC4057z4<C4001t2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C4001t2> zzagb;
    private static final C4001t2 zzbbq;
    private int zzafn;
    private int zzbbj;
    private boolean zzbbk;
    private int zzbbl;
    private boolean zzbbm;
    private InterfaceC3894i5<C3871g2> zzbbn;
    private InterfaceC3894i5<C3871g2> zzbbo;
    private String zzbbp;

    /* JADX INFO: renamed from: c.n.b.d.j.f.t2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C4001t2, a> implements InterfaceC3915k6 {
        public a() {
            super(C4001t2.zzbbq);
        }

        public a(C3982r3 c3982r3) {
            super(C4001t2.zzbbq);
        }
    }

    static {
        C4001t2 c4001t2 = new C4001t2();
        zzbbq = c4001t2;
        AbstractC4057z4.m9319k(C4001t2.class, c4001t2);
    }

    public C4001t2() {
        C4041x6<Object> c4041x6 = C4041x6.f22987g;
        this.zzbbn = c4041x6;
        this.zzbbo = c4041x6;
        this.zzbbp = "";
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C4001t2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbbq, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\f\u0002\u0004\u0007\u0003\u0007\u001b\b\u001b\t\b\u0004", new Object[]{"zzafn", "zzbbj", C3909k0.f22723a, "zzbbk", "zzbbl", C4026w0.f22967a, "zzbbm", "zzbbn", C3871g2.class, "zzbbo", C3871g2.class, "zzbbp"});
            case 4:
                return zzbbq;
            case 5:
                InterfaceC3985r6<C4001t2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C4001t2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbbq);
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
