package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.i1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4193i1 extends AbstractC4099b5<C4193i1, a> implements InterfaceC4254m6 {
    private static final C4193i1 zzf;
    private static volatile InterfaceC4338s6<C4193i1> zzg;
    private int zzc;
    private int zzd = 1;
    private InterfaceC4197i5<C4137e1> zze = C4379v6.f23569g;

    /* JADX INFO: renamed from: c.n.b.d.j.k.i1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4193i1, a> implements InterfaceC4254m6 {
        public a() {
            super(C4193i1.zzf);
        }

        public a(C4263n1 c4263n1) {
            super(C4193i1.zzf);
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.k.i1$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public enum b implements InterfaceC4155f5 {
        RADS(1),
        PROVISIONING(2);


        /* JADX INFO: renamed from: i */
        public final int f23235i;

        b(int i) {
            this.f23235i = i;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f23235i + " name=" + name() + '>';
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4155f5
        public final int zza() {
            return this.f23235i;
        }
    }

    static {
        C4193i1 c4193i1 = new C4193i1();
        zzf = c4193i1;
        AbstractC4099b5.m9413p(C4193i1.class, c4193i1);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4263n1.f23332a[i - 1]) {
            case 1:
                return new C4193i1();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", C4291p1.f23391a, "zze", C4137e1.class});
            case 4:
                return zzf;
            case 5:
                InterfaceC4338s6<C4193i1> aVar = zzg;
                if (aVar == null) {
                    synchronized (C4193i1.class) {
                        aVar = zzg;
                        if (aVar == null) {
                            aVar = new AbstractC4099b5.a<>(zzf);
                            zzg = aVar;
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
}
