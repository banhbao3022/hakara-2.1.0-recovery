package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.k3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3912k3 extends AbstractC4057z4<C3912k3, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3912k3> zzagb;
    private static final C3912k3 zzbgk;
    private int zzafn;
    private int zzbgh;
    private int zzbgi;
    private C3892i3 zzbgj;

    /* JADX INFO: renamed from: c.n.b.d.j.f.k3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3912k3, a> implements InterfaceC3915k6 {
        public a() {
            super(C3912k3.zzbgk);
        }

        public a(C3982r3 c3982r3) {
            super(C3912k3.zzbgk);
        }
    }

    static {
        C3912k3 c3912k3 = new C3912k3();
        zzbgk = c3912k3;
        AbstractC4057z4.m9319k(C3912k3.class, c3912k3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3912k3();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbgk, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\t\u0002", new Object[]{"zzafn", "zzbgh", "zzbgi", "zzbgj"});
            case 4:
                return zzbgk;
            case 5:
                InterfaceC3985r6<C3912k3> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3912k3.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbgk);
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
