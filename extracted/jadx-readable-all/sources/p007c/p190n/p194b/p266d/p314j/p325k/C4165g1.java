package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.g1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4165g1 extends AbstractC4099b5<C4165g1, a> implements InterfaceC4254m6 {
    private static final C4165g1 zzd;
    private static volatile InterfaceC4338s6<C4165g1> zze;
    private InterfaceC4197i5<C4179h1> zzc = C4379v6.f23569g;

    /* JADX INFO: renamed from: c.n.b.d.j.k.g1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public static final class a extends AbstractC4099b5.b<C4165g1, a> implements InterfaceC4254m6 {
        public a() {
            super(C4165g1.zzd);
        }

        /* JADX INFO: renamed from: v */
        public final a m9631v(C4179h1.a aVar) {
            if (this.f23087h) {
                m9431r();
                this.f23087h = false;
            }
            C4165g1.m9626u((C4165g1) this.f23086g, (C4179h1) ((AbstractC4099b5) aVar.m9433t()));
            return this;
        }

        public a(C4263n1 c4263n1) {
            super(C4165g1.zzd);
        }
    }

    static {
        C4165g1 c4165g1 = new C4165g1();
        zzd = c4165g1;
        AbstractC4099b5.m9413p(C4165g1.class, c4165g1);
    }

    /* JADX INFO: renamed from: u */
    public static void m9626u(C4165g1 c4165g1, C4179h1 c4179h1) {
        Objects.requireNonNull(c4165g1);
        InterfaceC4197i5<C4179h1> interfaceC4197i5 = c4165g1.zzc;
        if (!interfaceC4197i5.zza()) {
            c4165g1.zzc = AbstractC4099b5.m9410l(interfaceC4197i5);
        }
        c4165g1.zzc.add(c4179h1);
    }

    /* JADX INFO: renamed from: v */
    public static a m9627v() {
        return zzd.m9422q();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5
    /* JADX INFO: renamed from: n */
    public final Object mo9399n(int i, Object obj, Object obj2) {
        switch (C4263n1.f23332a[i - 1]) {
            case 1:
                return new C4165g1();
            case 2:
                return new a(null);
            case 3:
                return new C4405x6(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C4179h1.class});
            case 4:
                return zzd;
            case 5:
                InterfaceC4338s6<C4165g1> aVar = zze;
                if (aVar == null) {
                    synchronized (C4165g1.class) {
                        aVar = zze;
                        if (aVar == null) {
                            aVar = new AbstractC4099b5.a<>(zzd);
                            zze = aVar;
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
    public final C4179h1 m9629s() {
        return this.zzc.get(0);
    }

    /* JADX INFO: renamed from: t */
    public final List<C4179h1> m9630t() {
        return this.zzc;
    }
}
