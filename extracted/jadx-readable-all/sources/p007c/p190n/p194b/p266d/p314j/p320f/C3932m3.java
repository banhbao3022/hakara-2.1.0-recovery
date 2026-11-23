package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.m3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3932m3 extends AbstractC4057z4<C3932m3, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3932m3> zzagb;
    private static final C3932m3 zzbgr;
    private int zzafn;
    private byte zzbem = 2;
    private int zzbgo;
    private int zzbgp;
    private int zzbgq;

    /* JADX INFO: renamed from: c.n.b.d.j.f.m3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3932m3, a> implements InterfaceC3915k6 {
        public a() {
            super(C3932m3.zzbgr);
        }

        public a(C3982r3 c3982r3) {
            super(C3932m3.zzbgr);
        }
    }

    static {
        C3932m3 c3932m3 = new C3932m3();
        zzbgr = c3932m3;
        AbstractC4057z4.m9319k(C3932m3.class, c3932m3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3932m3();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbgr, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001Ԍ\u0000\u0002\u0004\u0001\u0003\f\u0002", new Object[]{"zzafn", "zzbgo", C3870g1.f22683a, "zzbgp", "zzbgq", C3972q3.f22845a});
            case 4:
                return zzbgr;
            case 5:
                InterfaceC3985r6<C3932m3> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3932m3.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbgr);
                            zzagb = cVar;
                        }
                        break;
                    }
                }
                return cVar;
            case 6:
                return Byte.valueOf(this.zzbem);
            case 7:
                this.zzbem = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
