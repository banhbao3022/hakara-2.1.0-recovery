package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.n0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4262n0 extends AbstractC4099b5<C4262n0, a> implements InterfaceC4254m6 {
    private static final C4262n0 zzi;
    private static volatile InterfaceC4338s6<C4262n0> zzj;
    private int zzc;
    private int zzd;
    private InterfaceC4197i5<C4318r0> zze;
    private InterfaceC4197i5<C4276o0> zzf;
    private boolean zzg;
    private boolean zzh;

    /* JADX INFO: renamed from: c.n.b.d.j.k.n0$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4262n0, a> implements InterfaceC4254m6 {
        public a() {
            super(C4262n0.zzi);
        }

        public a(C4346t0 c4346t0) {
            super(C4262n0.zzi);
        }
    }

    static {
        C4262n0 c4262n0 = new C4262n0();
        zzi = c4262n0;
        AbstractC4099b5.m9413p(C4262n0.class, c4262n0);
    }

    public C4262n0() {
        C4379v6<Object> c4379v6 = C4379v6.f23569g;
        this.zze = c4379v6;
        this.zzf = c4379v6;
    }

    /* JADX INFO: renamed from: t */
    public static void m10015t(C4262n0 c4262n0, int i, C4276o0 c4276o0) {
        Objects.requireNonNull(c4262n0);
        InterfaceC4197i5<C4276o0> interfaceC4197i5 = c4262n0.zzf;
        if (!interfaceC4197i5.zza()) {
            c4262n0.zzf = AbstractC4099b5.m9410l(interfaceC4197i5);
        }
        c4262n0.zzf.set(i, c4276o0);
    }

    /* JADX INFO: renamed from: u */
    public static void m10016u(C4262n0 c4262n0, int i, C4318r0 c4318r0) {
        Objects.requireNonNull(c4262n0);
        InterfaceC4197i5<C4318r0> interfaceC4197i5 = c4262n0.zze;
        if (!interfaceC4197i5.zza()) {
            c4262n0.zze = AbstractC4099b5.m9410l(interfaceC4197i5);
        }
        c4262n0.zze.set(i, c4318r0);
    }

    /* JADX INFO: renamed from: A */
    public final List<C4276o0> m10017A() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: B */
    public final int m10018B() {
        return this.zzf.size();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4346t0.f23461a[i - 1]) {
            case 1:
                return new C4262n0();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", C4318r0.class, "zzf", C4276o0.class, "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                InterfaceC4338s6<C4262n0> aVar = zzj;
                if (aVar == null) {
                    synchronized (C4262n0.class) {
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
    public final C4318r0 m10019s(int i) {
        return this.zze.get(i);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m10020v() {
        return (this.zzc & 1) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final int m10021w() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: x */
    public final C4276o0 m10022x(int i) {
        return this.zzf.get(i);
    }

    /* JADX INFO: renamed from: y */
    public final List<C4318r0> m10023y() {
        return this.zze;
    }

    /* JADX INFO: renamed from: z */
    public final int m10024z() {
        return this.zze.size();
    }
}
