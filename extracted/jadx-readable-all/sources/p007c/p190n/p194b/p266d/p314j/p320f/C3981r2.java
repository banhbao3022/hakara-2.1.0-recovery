package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.Iterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: renamed from: c.n.b.d.j.f.r2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3981r2 extends AbstractC4057z4<C3981r2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C3981r2> zzagb;
    private static final InterfaceC3874g5<Integer, EnumC3811a2> zzbbb = new C4002t3();
    private static final C3981r2 zzbbc;
    private int zzafn;
    private C4010u2 zzbax;
    private C3942n3 zzbay;
    private InterfaceC3894i5<C3922l3> zzbaz = C4041x6.f22987g;
    private InterfaceC3844d5 zzbba = C3824b5.f22522g;

    /* JADX INFO: renamed from: c.n.b.d.j.f.r2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C3981r2, a> implements InterfaceC3915k6 {
        public a() {
            super(C3981r2.zzbbc);
        }

        public a(C3982r3 c3982r3) {
            super(C3981r2.zzbbc);
        }
    }

    static {
        C3981r2 c3981r2 = new C3981r2();
        zzbbc = c3981r2;
        AbstractC4057z4.m9319k(C3981r2.class, c3981r2);
    }

    /* JADX INFO: renamed from: n */
    public static void m9203n(C3981r2 c3981r2, C4010u2 c4010u2) {
        Objects.requireNonNull(c3981r2);
        c4010u2.getClass();
        c3981r2.zzbax = c4010u2;
        c3981r2.zzafn |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m9204o(C3981r2 c3981r2, Iterable iterable) {
        RandomAccess randomAccess = c3981r2.zzbba;
        if (!((AbstractC3813a4) randomAccess).f22505f) {
            C3824b5 c3824b5 = (C3824b5) randomAccess;
            int i = c3824b5.f22524i;
            c3981r2.zzbba = c3824b5.mo8958r(i == 0 ? 10 : i << 1);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((C3824b5) c3981r2.zzbba).m8955j(((EnumC3811a2) it.next()).f22504K);
        }
    }

    /* JADX INFO: renamed from: p */
    public static a m9205p() {
        return zzbbc.m9321m();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C3981r2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbbc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u001b\u0004\u001e", new Object[]{"zzafn", "zzbax", "zzbay", "zzbaz", C3922l3.class, "zzbba", C3831c2.f22532a});
            case 4:
                return zzbbc;
            case 5:
                InterfaceC3985r6<C3981r2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C3981r2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbbc);
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
