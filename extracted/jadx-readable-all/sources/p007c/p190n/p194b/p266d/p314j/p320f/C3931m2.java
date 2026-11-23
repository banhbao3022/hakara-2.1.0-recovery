package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.m2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3931m2 extends AbstractC4057z4<C3931m2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3931m2> zzagb;
    private static final C3931m2 zzbii;
    private int zzafn;
    private C3991s2 zzbeu;

    /* JADX INFO: renamed from: c.n.b.d.j.f.m2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3931m2, a> implements InterfaceC3915k6 {
        public a() {
            super(C3931m2.zzbii);
        }

        public a(C3982r3 c3982r3) {
            super(C3931m2.zzbii);
        }
    }

    static {
        C3931m2 c3931m2 = new C3931m2();
        zzbii = c3931m2;
        AbstractC4057z4.m9319k(C3931m2.class, c3931m2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3931m2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbii, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{"zzafn", "zzbeu"});
            case 4:
                return zzbii;
            case 5:
                InterfaceC3985r6<C3931m2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3931m2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbii);
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
