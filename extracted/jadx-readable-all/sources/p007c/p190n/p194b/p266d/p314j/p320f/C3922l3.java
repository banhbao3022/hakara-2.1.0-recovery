package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.l3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3922l3 extends AbstractC4057z4<C3922l3, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3922l3> zzagb;
    private static final C3922l3 zzbgn;
    private int zzafn;
    private int zzbgl;
    private int zzbgm;

    /* JADX INFO: renamed from: c.n.b.d.j.f.l3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3922l3, a> implements InterfaceC3915k6 {
        public a() {
            super(C3922l3.zzbgn);
        }

        public a(C3982r3 c3982r3) {
            super(C3922l3.zzbgn);
        }
    }

    static {
        C3922l3 c3922l3 = new C3922l3();
        zzbgn = c3922l3;
        AbstractC4057z4.m9319k(C3922l3.class, c3922l3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3922l3();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbgn, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001", new Object[]{"zzafn", "zzbgl", C4017v0.f22904a, "zzbgm"});
            case 4:
                return zzbgn;
            case 5:
                InterfaceC3985r6<C3922l3> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3922l3.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbgn);
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
