package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.j.k.s0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4332s0 extends AbstractC4099b5<C4332s0, a> implements InterfaceC4254m6 {
    private static final C4332s0 zzh;
    private static volatile InterfaceC4338s6<C4332s0> zzi;
    private int zzc;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private InterfaceC4197i5<String> zzg = C4379v6.f23569g;

    /* JADX INFO: renamed from: c.n.b.d.j.k.s0$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4332s0, a> implements InterfaceC4254m6 {
        public a() {
            super(C4332s0.zzh);
        }

        public a(C4346t0 c4346t0) {
            super(C4332s0.zzh);
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.k.s0$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public enum b implements InterfaceC4155f5 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);


        /* JADX INFO: renamed from: n */
        public final int f23451n;

        b(int i) {
            this.f23451n = i;
        }

        /* JADX INFO: renamed from: f */
        public static b m10201f(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f23451n + " name=" + name() + '>';
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4155f5
        public final int zza() {
            return this.f23451n;
        }
    }

    static {
        C4332s0 c4332s0 = new C4332s0();
        zzh = c4332s0;
        AbstractC4099b5.m9413p(C4332s0.class, c4332s0);
    }

    /* JADX INFO: renamed from: A */
    public static C4332s0 m10191A() {
        return zzh;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4346t0.f23461a[i - 1]) {
            case 1:
                return new C4332s0();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", C4425z0.f23647a, "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                InterfaceC4338s6<C4332s0> aVar = zzi;
                if (aVar == null) {
                    synchronized (C4332s0.class) {
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

    /* JADX INFO: renamed from: s */
    public final boolean m10193s() {
        return (this.zzc & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final b m10194t() {
        b bVarM10201f = b.m10201f(this.zzd);
        return bVarM10201f == null ? b.UNKNOWN_MATCH_TYPE : bVarM10201f;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m10195u() {
        return (this.zzc & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final String m10196v() {
        return this.zze;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m10197w() {
        return (this.zzc & 4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m10198x() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: y */
    public final List<String> m10199y() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: z */
    public final int m10200z() {
        return this.zzg.size();
    }
}
