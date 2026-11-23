package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.i3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3892i3 extends AbstractC4057z4<C3892i3, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3892i3> zzagb;
    private static final C3892i3 zzbge;
    private int zzafn;
    private int zzbgb;
    private int zzbgc;
    private int zzbgd;

    /* JADX INFO: renamed from: c.n.b.d.j.f.i3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3892i3, a> implements InterfaceC3915k6 {
        public a() {
            super(C3892i3.zzbge);
        }

        public a(C3982r3 c3982r3) {
            super(C3892i3.zzbge);
        }
    }

    static {
        C3892i3 c3892i3 = new C3892i3();
        zzbge = c3892i3;
        AbstractC4057z4.m9319k(C3892i3.class, c3892i3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3892i3();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbge, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\u0004\u0002", new Object[]{"zzafn", "zzbgb", C3810a1.f22472a, "zzbgc", "zzbgd"});
            case 4:
                return zzbge;
            case 5:
                InterfaceC3985r6<C3892i3> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3892i3.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbge);
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
