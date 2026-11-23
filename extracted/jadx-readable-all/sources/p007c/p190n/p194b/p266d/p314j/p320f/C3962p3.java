package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.p3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3962p3 extends AbstractC4057z4<C3962p3, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3962p3> zzagb;
    private static final C3962p3 zzbgz;
    private int zzafn;
    private int zzbbx;
    private int zzbfo;
    private int zzbgc;
    private int zzbgw;
    private boolean zzbgx;
    private boolean zzbgy;

    /* JADX INFO: renamed from: c.n.b.d.j.f.p3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3962p3, a> implements InterfaceC3915k6 {
        public a() {
            super(C3962p3.zzbgz);
        }

        public a(C3982r3 c3982r3) {
            super(C3962p3.zzbgz);
        }
    }

    static {
        C3962p3 c3962p3 = new C3962p3();
        zzbgz = c3962p3;
        AbstractC4057z4.m9319k(C3962p3.class, c3962p3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3962p3();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbgz, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\f\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\f\u0004\u0006\u0006\u0005", new Object[]{"zzafn", "zzbgc", "zzbgw", C3890i1.f22704a, "zzbgx", "zzbgy", "zzbfo", C3989s0.f22869a, "zzbbx"});
            case 4:
                return zzbgz;
            case 5:
                InterfaceC3985r6<C3962p3> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3962p3.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbgz);
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
