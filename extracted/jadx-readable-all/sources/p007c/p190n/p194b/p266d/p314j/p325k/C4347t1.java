package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.t1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4347t1 extends AbstractC4099b5<C4347t1, b> implements InterfaceC4254m6 {
    private static final C4347t1 zzk;
    private static volatile InterfaceC4338s6<C4347t1> zzl;
    private int zzc;
    private int zzd;
    private boolean zzf;
    private long zzg;
    private double zzh;
    private String zze = "";
    private InterfaceC4197i5<C4347t1> zzi = C4379v6.f23569g;
    private String zzj = "";

    /* JADX INFO: renamed from: c.n.b.d.j.k.t1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public enum a implements InterfaceC4155f5 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);


        /* JADX INFO: renamed from: l */
        public final int f23468l;

        a(int i) {
            this.f23468l = i;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f23468l + " name=" + name() + '>';
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4155f5
        public final int zza() {
            return this.f23468l;
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.k.t1$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class b extends AbstractC4099b5.b<C4347t1, b> implements InterfaceC4254m6 {
        public b() {
            super(C4347t1.zzk);
        }

        public b(C4361u1 c4361u1) {
            super(C4347t1.zzk);
        }
    }

    static {
        C4347t1 c4347t1 = new C4347t1();
        zzk = c4347t1;
        AbstractC4099b5.m9413p(C4347t1.class, c4347t1);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4361u1.f23493a[i - 1]) {
            case 1:
                return new C4347t1();
            case 2:
                return new b(null);
            case 3:
                return new C4405x6(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005က\u0004\u0006\u001b\u0007ဈ\u0005", new Object[]{"zzc", "zzd", C4374v1.f23510a, "zze", "zzf", "zzg", "zzh", "zzi", C4347t1.class, "zzj"});
            case 4:
                return zzk;
            case 5:
                InterfaceC4338s6<C4347t1> aVar = zzl;
                if (aVar == null) {
                    synchronized (C4347t1.class) {
                        aVar = zzl;
                        if (aVar == null) {
                            aVar = new AbstractC4099b5.a<>(zzk);
                            zzl = aVar;
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
