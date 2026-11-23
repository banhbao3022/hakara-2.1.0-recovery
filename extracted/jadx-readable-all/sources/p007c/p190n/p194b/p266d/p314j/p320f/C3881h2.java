package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.h2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3881h2 extends AbstractC4057z4<C3881h2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3881h2> zzagb;
    private static final C3881h2 zzbhq;
    private int zzafn;
    private boolean zzbhk;
    private boolean zzbhl;
    private int zzbhm;
    private int zzbho;
    private int zzbhp;
    private String zzbhn = "";
    private String zzbbp = "";

    /* JADX INFO: renamed from: c.n.b.d.j.f.h2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3881h2, a> implements InterfaceC3915k6 {
        public a() {
            super(C3881h2.zzbhq);
        }

        public a(C3982r3 c3982r3) {
            super(C3881h2.zzbhq);
        }
    }

    static {
        C3881h2 c3881h2 = new C3881h2();
        zzbhq = c3881h2;
        AbstractC4057z4.m9319k(C3881h2.class, c3881h2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3881h2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbhq, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0004\u0002\u0004\b\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\b\u0006", new Object[]{"zzafn", "zzbhk", "zzbhl", "zzbhm", "zzbhn", "zzbho", "zzbhp", "zzbbp"});
            case 4:
                return zzbhq;
            case 5:
                InterfaceC3985r6<C3881h2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3881h2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbhq);
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
