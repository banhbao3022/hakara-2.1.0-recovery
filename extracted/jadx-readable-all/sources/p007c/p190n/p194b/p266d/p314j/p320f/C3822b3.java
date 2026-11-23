package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.b3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3822b3 extends AbstractC4057z4<C3822b3, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3822b3> zzagb;
    private static final C3822b3 zzbev;
    private int zzafn;
    private int zzbes;
    private int zzbet;
    private C3991s2 zzbeu;

    /* JADX INFO: renamed from: c.n.b.d.j.f.b3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3822b3, a> implements InterfaceC3915k6 {
        public a() {
            super(C3822b3.zzbev);
        }

        public a(C3982r3 c3982r3) {
            super(C3822b3.zzbev);
        }
    }

    static {
        C3822b3 c3822b3 = new C3822b3();
        zzbev = c3822b3;
        AbstractC4057z4.m9319k(C3822b3.class, c3822b3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3822b3();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbev, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u000b\u0001\u0003\t\u0002", new Object[]{"zzafn", "zzbes", C3999t0.f22874a, "zzbet", "zzbeu"});
            case 4:
                return zzbev;
            case 5:
                InterfaceC3985r6<C3822b3> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3822b3.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbev);
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
