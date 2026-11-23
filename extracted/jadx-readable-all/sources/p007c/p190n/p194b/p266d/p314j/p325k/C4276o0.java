package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.o0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4276o0 extends AbstractC4099b5<C4276o0, a> implements InterfaceC4254m6 {
    private static final C4276o0 zzl;
    private static volatile InterfaceC4338s6<C4276o0> zzm;
    private int zzc;
    private int zzd;
    private String zze = "";
    private InterfaceC4197i5<C4290p0> zzf = C4379v6.f23569g;
    private boolean zzg;
    private C4304q0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* JADX INFO: renamed from: c.n.b.d.j.k.o0$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4276o0, a> implements InterfaceC4254m6 {
        public a() {
            super(C4276o0.zzl);
        }

        public a(C4346t0 c4346t0) {
            super(C4276o0.zzl);
        }
    }

    static {
        C4276o0 c4276o0 = new C4276o0();
        zzl = c4276o0;
        AbstractC4099b5.m9413p(C4276o0.class, c4276o0);
    }

    /* JADX INFO: renamed from: G */
    public static a m10101G() {
        return zzl.m9422q();
    }

    /* JADX INFO: renamed from: t */
    public static void m10103t(C4276o0 c4276o0, int i, C4290p0 c4290p0) {
        Objects.requireNonNull(c4276o0);
        c4290p0.getClass();
        InterfaceC4197i5<C4290p0> interfaceC4197i5 = c4276o0.zzf;
        if (!interfaceC4197i5.zza()) {
            c4276o0.zzf = AbstractC4099b5.m9410l(interfaceC4197i5);
        }
        c4276o0.zzf.set(i, c4290p0);
    }

    /* JADX INFO: renamed from: u */
    public static void m10104u(C4276o0 c4276o0, String str) {
        Objects.requireNonNull(c4276o0);
        str.getClass();
        c4276o0.zzc |= 2;
        c4276o0.zze = str;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m10105A() {
        return (this.zzc & 8) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final C4304q0 m10106B() {
        C4304q0 c4304q0 = this.zzh;
        return c4304q0 == null ? C4304q0.m10144C() : c4304q0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m10107C() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m10108D() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m10109E() {
        return (this.zzc & 64) != 0;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m10110F() {
        return this.zzk;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4346t0.f23461a[i - 1]) {
            case 1:
                return new C4276o0();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", C4290p0.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                InterfaceC4338s6<C4276o0> aVar = zzm;
                if (aVar == null) {
                    synchronized (C4276o0.class) {
                        aVar = zzm;
                        if (aVar == null) {
                            aVar = new AbstractC4099b5.a<>(zzl);
                            zzm = aVar;
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
    public final C4290p0 m10111s(int i) {
        return this.zzf.get(i);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m10112v() {
        return (this.zzc & 1) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final int m10113w() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: x */
    public final String m10114x() {
        return this.zze;
    }

    /* JADX INFO: renamed from: y */
    public final List<C4290p0> m10115y() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: z */
    public final int m10116z() {
        return this.zzf.size();
    }
}
