package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.w0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4386w0 extends AbstractC4099b5<C4386w0, a> implements InterfaceC4254m6 {
    private static final C4386w0 zzh;
    private static volatile InterfaceC4338s6<C4386w0> zzi;
    private int zzc;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    /* JADX INFO: renamed from: c.n.b.d.j.k.w0$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4386w0, a> implements InterfaceC4254m6 {
        public a() {
            super(C4386w0.zzh);
        }

        /* JADX INFO: renamed from: v */
        public final String m10306v() {
            return ((C4386w0) this.f23086g).m10301s();
        }

        /* JADX INFO: renamed from: w */
        public final int m10307w() {
            return ((C4386w0) this.f23086g).m10305x();
        }

        public a(C4081a1 c4081a1) {
            super(C4386w0.zzh);
        }
    }

    static {
        C4386w0 c4386w0 = new C4386w0();
        zzh = c4386w0;
        AbstractC4099b5.m9413p(C4386w0.class, c4386w0);
    }

    /* JADX INFO: renamed from: t */
    public static void m10299t(C4386w0 c4386w0, String str) {
        Objects.requireNonNull(c4386w0);
        str.getClass();
        c4386w0.zzc |= 1;
        c4386w0.zzd = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4081a1.f23025a[i - 1]) {
            case 1:
                return new C4386w0();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                InterfaceC4338s6<C4386w0> aVar = zzi;
                if (aVar == null) {
                    synchronized (C4386w0.class) {
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
    public final String m10301s() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m10302u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m10303v() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m10304w() {
        return (this.zzc & 8) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final int m10305x() {
        return this.zzg;
    }
}
