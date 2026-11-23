package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.f.v2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4019v2 extends AbstractC4057z4<C4019v2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C4019v2> zzagb;
    private static final C4019v2 zzbca;
    private int zzafn;
    private C3832c3 zzbbu;
    private boolean zzbbv;
    private long zzbbw;
    private int zzbbx;
    private int zzbby;
    private int zzbbz;

    /* JADX INFO: renamed from: c.n.b.d.j.f.v2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C4019v2, a> implements InterfaceC3915k6 {
        public a() {
            super(C4019v2.zzbca);
        }

        /* JADX INFO: renamed from: q */
        public final a m9280q(EnumC3929m0 enumC3929m0) {
            if (this.f23003h) {
                m9324n();
                this.f23003h = false;
            }
            C4019v2.m9274q((C4019v2) this.f23002g, enumC3929m0);
            return this;
        }

        public a(C3982r3 c3982r3) {
            super(C4019v2.zzbca);
        }
    }

    static {
        C4019v2 c4019v2 = new C4019v2();
        zzbca = c4019v2;
        AbstractC4057z4.m9319k(C4019v2.class, c4019v2);
    }

    /* JADX INFO: renamed from: n */
    public static a m9271n(C4019v2 c4019v2) {
        a aVarM9321m = zzbca.m9321m();
        aVarM9321m.m9323l(c4019v2);
        return aVarM9321m;
    }

    /* JADX INFO: renamed from: o */
    public static void m9272o(C4019v2 c4019v2, long j2) {
        c4019v2.zzafn |= 4;
        c4019v2.zzbbw = j2;
    }

    /* JADX INFO: renamed from: p */
    public static void m9273p(C4019v2 c4019v2, EnumC3919l0 enumC3919l0) {
        Objects.requireNonNull(c4019v2);
        c4019v2.zzbbz = enumC3919l0.f22761O;
        c4019v2.zzafn |= 32;
    }

    /* JADX INFO: renamed from: q */
    public static void m9274q(C4019v2 c4019v2, EnumC3929m0 enumC3929m0) {
        Objects.requireNonNull(c4019v2);
        c4019v2.zzbby = enumC3929m0.f22785u;
        c4019v2.zzafn |= 16;
    }

    /* JADX INFO: renamed from: r */
    public static void m9275r(C4019v2 c4019v2, C3832c3 c3832c3) {
        Objects.requireNonNull(c4019v2);
        c3832c3.getClass();
        c4019v2.zzbbu = c3832c3;
        c4019v2.zzafn |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static void m9276s(C4019v2 c4019v2, boolean z) {
        c4019v2.zzafn |= 2;
        c4019v2.zzbbv = z;
    }

    /* JADX INFO: renamed from: t */
    public static a m9277t() {
        return zzbca.m9321m();
    }

    /* JADX INFO: renamed from: u */
    public static C4019v2 m9278u() {
        return zzbca;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C4019v2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbca, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0000\u0002\u0007\u0001\u0003\u0005\u0002\u0004\u0006\u0003\u0005\f\u0004\u0006\f\u0005", new Object[]{"zzafn", "zzbbu", "zzbbv", "zzbbw", "zzbbx", "zzbby", C3949o0.f22826a, "zzbbz", C3939n0.f22819a});
            case 4:
                return zzbca;
            case 5:
                InterfaceC3985r6<C4019v2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C4019v2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbca);
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
