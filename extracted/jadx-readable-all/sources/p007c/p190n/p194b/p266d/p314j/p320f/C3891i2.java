package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.i2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3891i2 extends AbstractC4057z4<C3891i2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3891i2> zzagb;
    private static final C3891i2 zzbhu;
    private int zzafn;
    private int zzbhr;
    private int zzbhs;
    private int zzbht;

    /* JADX INFO: renamed from: c.n.b.d.j.f.i2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3891i2, a> implements InterfaceC3915k6 {
        public a() {
            super(C3891i2.zzbhu);
        }

        public a(C3982r3 c3982r3) {
            super(C3891i2.zzbhu);
        }
    }

    static {
        C3891i2 c3891i2 = new C3891i2();
        zzbhu = c3891i2;
        AbstractC4057z4.m9319k(C3891i2.class, c3891i2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3891i2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbhu, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\f\u0001\u0003\u0004\u0002", new Object[]{"zzafn", "zzbhr", "zzbhs", C3900j1.f22708a, "zzbht"});
            case 4:
                return zzbhu;
            case 5:
                InterfaceC3985r6<C3891i2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3891i2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbhu);
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
