package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.x0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4399x0 extends AbstractC4099b5<C4399x0, a> implements InterfaceC4254m6 {
    private static final C4399x0 zzm;
    private static volatile InterfaceC4338s6<C4399x0> zzn;
    private int zzc;
    private long zzd;
    private String zze = "";
    private int zzf;
    private InterfaceC4197i5<C4412y0> zzg;
    private InterfaceC4197i5<C4386w0> zzh;
    private InterfaceC4197i5<C4262n0> zzi;
    private String zzj;
    private boolean zzk;
    private InterfaceC4197i5<C4333s1> zzl;

    /* JADX INFO: renamed from: c.n.b.d.j.k.x0$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4399x0, a> implements InterfaceC4254m6 {
        public a() {
            super(C4399x0.zzm);
        }

        public a(C4081a1 c4081a1) {
            super(C4399x0.zzm);
        }
    }

    static {
        C4399x0 c4399x0 = new C4399x0();
        zzm = c4399x0;
        AbstractC4099b5.m9413p(C4399x0.class, c4399x0);
    }

    public C4399x0() {
        C4379v6<Object> c4379v6 = C4379v6.f23569g;
        this.zzg = c4379v6;
        this.zzh = c4379v6;
        this.zzi = c4379v6;
        this.zzj = "";
        this.zzl = c4379v6;
    }

    /* JADX INFO: renamed from: D */
    public static a m10314D() {
        return zzm.m9422q();
    }

    /* JADX INFO: renamed from: E */
    public static C4399x0 m10315E() {
        return zzm;
    }

    /* JADX INFO: renamed from: t */
    public static void m10317t(C4399x0 c4399x0) {
        Objects.requireNonNull(c4399x0);
        c4399x0.zzi = C4379v6.f23569g;
    }

    /* JADX INFO: renamed from: u */
    public static void m10318u(C4399x0 c4399x0, int i, C4386w0 c4386w0) {
        Objects.requireNonNull(c4399x0);
        InterfaceC4197i5<C4386w0> interfaceC4197i5 = c4399x0.zzh;
        if (!interfaceC4197i5.zza()) {
            c4399x0.zzh = AbstractC4099b5.m9410l(interfaceC4197i5);
        }
        c4399x0.zzh.set(i, c4386w0);
    }

    /* JADX INFO: renamed from: A */
    public final int m10319A() {
        return this.zzh.size();
    }

    /* JADX INFO: renamed from: B */
    public final List<C4262n0> m10320B() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m10321C() {
        return this.zzk;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4081a1.f23025a[i - 1]) {
            case 1:
                return new C4399x0();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", C4412y0.class, "zzh", C4386w0.class, "zzi", C4262n0.class, "zzj", "zzk", "zzl", C4333s1.class});
            case 4:
                return zzm;
            case 5:
                InterfaceC4338s6<C4399x0> aVar = zzn;
                if (aVar == null) {
                    synchronized (C4399x0.class) {
                        aVar = zzn;
                        if (aVar == null) {
                            aVar = new AbstractC4099b5.a<>(zzm);
                            zzn = aVar;
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
    public final C4386w0 m10322s(int i) {
        return this.zzh.get(i);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m10323v() {
        return (this.zzc & 1) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final long m10324w() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m10325x() {
        return (this.zzc & 2) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final String m10326y() {
        return this.zze;
    }

    /* JADX INFO: renamed from: z */
    public final List<C4412y0> m10327z() {
        return this.zzg;
    }
}
