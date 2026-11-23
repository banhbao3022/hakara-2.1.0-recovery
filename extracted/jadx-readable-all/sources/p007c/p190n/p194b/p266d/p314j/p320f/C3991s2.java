package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.s2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3991s2 extends AbstractC4057z4<C3991s2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3991s2> zzagb;
    private static final C3991s2 zzbbi;
    private int zzafn;
    private int zzbbd;
    private double zzbbe;
    private double zzbbf;
    private double zzbbg;
    private double zzbbh;

    /* JADX INFO: renamed from: c.n.b.d.j.f.s2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3991s2, a> implements InterfaceC3915k6 {
        public a() {
            super(C3991s2.zzbbi);
        }

        public a(C3982r3 c3982r3) {
            super(C3991s2.zzbbi);
        }
    }

    static {
        C3991s2 c3991s2 = new C3991s2();
        zzbbi = c3991s2;
        AbstractC4057z4.m9319k(C3991s2.class, c3991s2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3991s2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbbi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0000\u0002\u0000\u0001\u0003\u0000\u0002\u0004\u0000\u0003\u0005\u0000\u0004", new Object[]{"zzafn", "zzbbd", "zzbbe", "zzbbf", "zzbbg", "zzbbh"});
            case 4:
                return zzbbi;
            case 5:
                InterfaceC3985r6<C3991s2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3991s2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbbi);
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
