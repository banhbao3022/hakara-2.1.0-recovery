package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.f.u2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4010u2 extends AbstractC4057z4<C4010u2, a> implements InterfaceC3915k6 {
    private static volatile InterfaceC3985r6<C4010u2> zzagb;
    private static final C4010u2 zzbbt;
    private int zzafn;
    private String zzbbr = "";
    private String zzbbs = "";

    /* JADX INFO: renamed from: c.n.b.d.j.f.u2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends AbstractC4057z4.a<C4010u2, a> implements InterfaceC3915k6 {
        public a() {
            super(C4010u2.zzbbt);
        }

        public a(C3982r3 c3982r3) {
            super(C4010u2.zzbbt);
        }
    }

    static {
        C4010u2 c4010u2 = new C4010u2();
        zzbbt = c4010u2;
        AbstractC4057z4.m9319k(C4010u2.class, c4010u2);
    }

    /* JADX INFO: renamed from: n */
    public static void m9231n(C4010u2 c4010u2, String str) {
        Objects.requireNonNull(c4010u2);
        str.getClass();
        c4010u2.zzafn |= 1;
        c4010u2.zzbbr = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m9232o(C4010u2 c4010u2, String str) {
        Objects.requireNonNull(c4010u2);
        str.getClass();
        c4010u2.zzafn |= 2;
        c4010u2.zzbbs = str;
    }

    /* JADX INFO: renamed from: p */
    public static a m9233p() {
        return zzbbt.m9321m();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4
    /* JADX INFO: renamed from: h */
    public final Object mo8926h(int i, Object obj, Object obj2) {
        switch (C3982r3.f22859a[i - 1]) {
            case 1:
                return new C4010u2();
            case 2:
                return new a(null);
            case 3:
                return new C4023v6(zzbbt, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzafn", "zzbbr", "zzbbs"});
            case 4:
                return zzbbt;
            case 5:
                InterfaceC3985r6<C4010u2> cVar = zzagb;
                if (cVar == null) {
                    synchronized (C4010u2.class) {
                        cVar = zzagb;
                        if (cVar == null) {
                            cVar = new AbstractC4057z4.c<>(zzbbt);
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
