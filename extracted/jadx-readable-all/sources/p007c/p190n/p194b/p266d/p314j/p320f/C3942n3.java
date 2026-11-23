package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.n3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3942n3 extends AbstractC4057z4<C3942n3, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3942n3> zzagb;
    private static final C3942n3 zzbgs;
    private int zzafn;
    private String zzbas = "";
    private String zzbat = "";

    /* JADX INFO: renamed from: c.n.b.d.j.f.n3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3942n3, a> implements InterfaceC3915k6 {
        public a() {
            super(C3942n3.zzbgs);
        }

        public a(C3982r3 c3982r3) {
            super(C3942n3.zzbgs);
        }
    }

    static {
        C3942n3 c3942n3 = new C3942n3();
        zzbgs = c3942n3;
        AbstractC4057z4.m9319k(C3942n3.class, c3942n3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3942n3();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbgs, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzafn", "zzbas", "zzbat"});
            case 4:
                return zzbgs;
            case 5:
                InterfaceC3985r6<C3942n3> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3942n3.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbgs);
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
