package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.q0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4304q0 extends AbstractC4099b5<C4304q0, b> implements InterfaceC4254m6 {
    private static final C4304q0 zzi;
    private static volatile InterfaceC4338s6<C4304q0> zzj;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    /* JADX INFO: renamed from: c.n.b.d.j.k.q0$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public enum a implements InterfaceC4155f5 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);


        /* JADX INFO: renamed from: l */
        public final int f23417l;

        a(int i) {
            this.f23417l = i;
        }

        /* JADX INFO: renamed from: f */
        public static a m10156f(int i) {
            if (i == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i == 1) {
                return LESS_THAN;
            }
            if (i == 2) {
                return GREATER_THAN;
            }
            if (i == 3) {
                return EQUAL;
            }
            if (i != 4) {
                return null;
            }
            return BETWEEN;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f23417l + " name=" + name() + '>';
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4155f5
        public final int zza() {
            return this.f23417l;
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.k.q0$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class b extends AbstractC4099b5.b<C4304q0, b> implements InterfaceC4254m6 {
        public b() {
            super(C4304q0.zzi);
        }

        public b(C4346t0 c4346t0) {
            super(C4304q0.zzi);
        }
    }

    static {
        C4304q0 c4304q0 = new C4304q0();
        zzi = c4304q0;
        AbstractC4099b5.m9413p(C4304q0.class, c4304q0);
    }

    /* JADX INFO: renamed from: C */
    public static C4304q0 m10144C() {
        return zzi;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m10146A() {
        return (this.zzc & 16) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final String m10147B() {
        return this.zzh;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4346t0.f23461a[i - 1]) {
            case 1:
                return new C4304q0();
            case 2:
                return new b(null);
            case 3:
                return new C4405x6(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", C4360u0.f23492a, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                InterfaceC4338s6<C4304q0> aVar = zzj;
                if (aVar == null) {
                    synchronized (C4304q0.class) {
                        aVar = zzj;
                        if (aVar == null) {
                            aVar = new AbstractC4099b5.a<>(zzi);
                            zzj = aVar;
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

    /* JADX INFO: renamed from: s */
    public final boolean m10148s() {
        return (this.zzc & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final a m10149t() {
        a aVarM10156f = a.m10156f(this.zzd);
        return aVarM10156f == null ? a.UNKNOWN_COMPARISON_TYPE : aVarM10156f;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m10150u() {
        return (this.zzc & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m10151v() {
        return this.zze;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m10152w() {
        return (this.zzc & 4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final String m10153x() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m10154y() {
        return (this.zzc & 8) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final String m10155z() {
        return this.zzg;
    }
}
