package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.b1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4095b1 extends AbstractC4099b5<C4095b1, a> implements InterfaceC4254m6 {
    private static final C4095b1 zzh;
    private static volatile InterfaceC4338s6<C4095b1> zzi;
    private int zzc;
    private int zzd;
    private C4207j1 zze;
    private C4207j1 zzf;
    private boolean zzg;

    /* JADX INFO: renamed from: c.n.b.d.j.k.b1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4095b1, a> implements InterfaceC4254m6 {
        public a() {
            super(C4095b1.zzh);
        }

        public a(C4263n1 c4263n1) {
            super(C4095b1.zzh);
        }
    }

    static {
        C4095b1 c4095b1 = new C4095b1();
        zzh = c4095b1;
        AbstractC4099b5.m9413p(C4095b1.class, c4095b1);
    }

    /* JADX INFO: renamed from: D */
    public static a m9390D() {
        return zzh.m9422q();
    }

    /* JADX INFO: renamed from: s */
    public static void m9392s(C4095b1 c4095b1, int i) {
        c4095b1.zzc |= 1;
        c4095b1.zzd = i;
    }

    /* JADX INFO: renamed from: t */
    public static void m9393t(C4095b1 c4095b1, C4207j1 c4207j1) {
        Objects.requireNonNull(c4095b1);
        c4095b1.zze = c4207j1;
        c4095b1.zzc |= 2;
    }

    /* JADX INFO: renamed from: u */
    public static void m9394u(C4095b1 c4095b1, boolean z) {
        c4095b1.zzc |= 8;
        c4095b1.zzg = z;
    }

    /* JADX INFO: renamed from: x */
    public static void m9395x(C4095b1 c4095b1, C4207j1 c4207j1) {
        Objects.requireNonNull(c4095b1);
        c4207j1.getClass();
        c4095b1.zzf = c4207j1;
        c4095b1.zzc |= 4;
    }

    /* JADX INFO: renamed from: A */
    public final C4207j1 m9396A() {
        C4207j1 c4207j1 = this.zzf;
        return c4207j1 == null ? C4207j1.m9844L() : c4207j1;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m9397B() {
        return (this.zzc & 8) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m9398C() {
        return this.zzg;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4263n1.f23332a[i - 1]) {
            case 1:
                return new C4095b1();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                InterfaceC4338s6<C4095b1> aVar = zzi;
                if (aVar == null) {
                    synchronized (C4095b1.class) {
                        aVar = zzi;
                        if (aVar == null) {
                            aVar = new AbstractC4099b5.a<>(zzh);
                            zzi = aVar;
                        }
                        break;
                    }
                }
                return aVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m9400v() {
        return (this.zzc & 1) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final int m9401w() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: y */
    public final C4207j1 m9402y() {
        C4207j1 c4207j1 = this.zze;
        return c4207j1 == null ? C4207j1.m9844L() : c4207j1;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m9403z() {
        return (this.zzc & 4) != 0;
    }
}
