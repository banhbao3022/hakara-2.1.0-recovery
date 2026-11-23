package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.e2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3851e2 extends AbstractC4057z4<C3851e2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3851e2> zzagb;
    private static final C3851e2 zzbhd;
    private int zzafn;
    private long zzbha;
    private InterfaceC3864f5 zzbhb;
    private InterfaceC3864f5 zzbhc;

    /* JADX INFO: renamed from: c.n.b.d.j.f.e2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3851e2, a> implements InterfaceC3915k6 {
        public a() {
            super(C3851e2.zzbhd);
        }

        public a(C3982r3 c3982r3) {
            super(C3851e2.zzbhd);
        }
    }

    static {
        C3851e2 c3851e2 = new C3851e2();
        zzbhd = c3851e2;
        AbstractC4057z4.m9319k(C3851e2.class, c3851e2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c.n.b.d.j.f.f5, c.n.b.d.j.f.v5] */
    public C3851e2() {
        ?? r0 = C4022v5.f22960g;
        this.zzbhb = r0;
        this.zzbhc = r0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3851e2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbhd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0005\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzafn", "zzbha", "zzbhb", "zzbhc"});
            case 4:
                return zzbhd;
            case 5:
                InterfaceC3985r6<C3851e2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3851e2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbhd);
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
