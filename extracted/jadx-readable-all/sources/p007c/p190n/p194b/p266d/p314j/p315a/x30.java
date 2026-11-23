package p007c.p190n.p194b.p266d.p314j.p315a;

import java.math.BigInteger;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class x30 implements zc2<C3775zm> {

    /* JADX INFO: renamed from: a */
    public final gd2<InterfaceC2782b> f21430a;

    /* JADX INFO: renamed from: b */
    public final gd2<C3146in> f21431b;

    /* JADX INFO: renamed from: c */
    public final gd2<ii1> f21432c;

    public x30(gd2<InterfaceC2782b> gd2Var, gd2<C3146in> gd2Var2, gd2<ii1> gd2Var3) {
        this.f21430a = gd2Var;
        this.f21431b = gd2Var2;
        this.f21432c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        String string;
        InterfaceC2782b interfaceC2782bMo4613a = this.f21430a.mo4613a();
        C3146in c3146inMo4613a = ((ij1) this.f21431b).mo4613a();
        String str = ((y50) this.f21432c).m8778b().f15193f;
        C3072gn c3072gn = c3146inMo4613a.f15321c;
        synchronized (c3072gn) {
            string = c3072gn.f14624a.toString();
            c3072gn.f14624a = c3072gn.f14624a.add(BigInteger.ONE);
            c3072gn.f14625b = string;
        }
        return new C3775zm(interfaceC2782bMo4613a, c3146inMo4613a, string, str);
    }
}
