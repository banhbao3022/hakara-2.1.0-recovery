package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.p0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4290p0 extends AbstractC4099b5<C4290p0, a> implements InterfaceC4254m6 {
    private static final C4290p0 zzh;
    private static volatile InterfaceC4338s6<C4290p0> zzi;
    private int zzc;
    private C4332s0 zzd;
    private C4304q0 zze;
    private boolean zzf;
    private String zzg = "";

    /* JADX INFO: renamed from: c.n.b.d.j.k.p0$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4290p0, a> implements InterfaceC4254m6 {
        public a() {
            super(C4290p0.zzh);
        }

        public a(C4346t0 c4346t0) {
            super(C4290p0.zzh);
        }
    }

    static {
        C4290p0 c4290p0 = new C4290p0();
        zzh = c4290p0;
        AbstractC4099b5.m9413p(C4290p0.class, c4290p0);
    }

    /* JADX INFO: renamed from: B */
    public static C4290p0 m10123B() {
        return zzh;
    }

    /* JADX INFO: renamed from: s */
    public static void m10125s(C4290p0 c4290p0, String str) {
        Objects.requireNonNull(c4290p0);
        str.getClass();
        c4290p0.zzc |= 8;
        c4290p0.zzg = str;
    }

    /* JADX INFO: renamed from: A */
    public final String m10126A() {
        return this.zzg;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4346t0.f23461a[i - 1]) {
            case 1:
                return new C4290p0();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                InterfaceC4338s6<C4290p0> aVar = zzi;
                if (aVar == null) {
                    synchronized (C4290p0.class) {
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

    /* JADX INFO: renamed from: t */
    public final boolean m10127t() {
        return (this.zzc & 1) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final C4332s0 m10128u() {
        C4332s0 c4332s0 = this.zzd;
        return c4332s0 == null ? C4332s0.m10191A() : c4332s0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m10129v() {
        return (this.zzc & 2) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final C4304q0 m10130w() {
        C4304q0 c4304q0 = this.zze;
        return c4304q0 == null ? C4304q0.m10144C() : c4304q0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m10131x() {
        return (this.zzc & 4) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m10132y() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m10133z() {
        return (this.zzc & 8) != 0;
    }
}
