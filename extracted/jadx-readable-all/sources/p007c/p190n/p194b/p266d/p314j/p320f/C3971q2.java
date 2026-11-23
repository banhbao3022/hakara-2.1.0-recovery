package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.q2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3971q2 extends AbstractC4057z4<C3971q2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3971q2> zzagb;
    private static final InterfaceC3874g5<Integer, ?> zzbit = new C4011u3();
    private static final C3971q2 zzbiu;
    private int zzafn;
    private int zzbes;
    private int zzbiq;
    private InterfaceC3844d5 zzbis = C3824b5.f22522g;

    /* JADX INFO: renamed from: c.n.b.d.j.f.q2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3971q2, a> implements InterfaceC3915k6 {
        public a() {
            super(C3971q2.zzbiu);
        }

        public a(C3982r3 c3982r3) {
            super(C3971q2.zzbiu);
        }
    }

    static {
        C3971q2 c3971q2 = new C3971q2();
        zzbiu = c3971q2;
        AbstractC4057z4.m9319k(C3971q2.class, c3971q2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3971q2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbiu, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u001e", new Object[]{"zzafn", "zzbes", C3821b2.f22518a, "zzbiq", C4026w0.f22967a, "zzbis", C4054z1.f22998a});
            case 4:
                return zzbiu;
            case 5:
                InterfaceC3985r6<C3971q2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3971q2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbiu);
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
