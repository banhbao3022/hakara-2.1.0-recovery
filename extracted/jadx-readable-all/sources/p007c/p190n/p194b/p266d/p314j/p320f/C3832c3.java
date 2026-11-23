package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.f.c3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3832c3 extends AbstractC4057z4<C3832c3, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3832c3> zzagb;
    private static final C3832c3 zzbey;
    private int zzafn;
    private String zzbew = "";
    private String zzbex = "";

    /* JADX INFO: renamed from: c.n.b.d.j.f.c3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3832c3, a> implements InterfaceC3915k6 {
        public a() {
            super(C3832c3.zzbey);
        }

        public a(C3982r3 c3982r3) {
            super(C3832c3.zzbey);
        }
    }

    static {
        C3832c3 c3832c3 = new C3832c3();
        zzbey = c3832c3;
        AbstractC4057z4.m9319k(C3832c3.class, c3832c3);
    }

    /* JADX INFO: renamed from: n */
    public static void m9005n(C3832c3 c3832c3, String str) {
        Objects.requireNonNull(c3832c3);
        str.getClass();
        c3832c3.zzafn |= 1;
        c3832c3.zzbew = str;
    }

    /* JADX INFO: renamed from: o */
    public static a m9006o() {
        return zzbey.m9321m();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3832c3();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbey, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzafn", "zzbew", "zzbex"});
            case 4:
                return zzbey;
            case 5:
                InterfaceC3985r6<C3832c3> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3832c3.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbey);
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
