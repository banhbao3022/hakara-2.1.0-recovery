package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.n2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3941n2 extends AbstractC4057z4<C3941n2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3941n2> zzagb;
    private static final C3941n2 zzbij;
    private int zzafn;
    private int zzbes;
    private int zzbet;
    private C3991s2 zzbeu;

    /* JADX INFO: renamed from: c.n.b.d.j.f.n2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3941n2, a> implements InterfaceC3915k6 {
        public a() {
            super(C3941n2.zzbij);
        }

        public a(C3982r3 c3982r3) {
            super(C3941n2.zzbij);
        }
    }

    static {
        C3941n2 c3941n2 = new C3941n2();
        zzbij = c3941n2;
        AbstractC4057z4.m9319k(C3941n2.class, c3941n2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3941n2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbij, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u000b\u0001\u0003\t\u0002", new Object[]{"zzafn", "zzbes", C4000t1.f22875a, "zzbet", "zzbeu"});
            case 4:
                return zzbij;
            case 5:
                InterfaceC3985r6<C3941n2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3941n2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbij);
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
