package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.BinderC2232o;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.i8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3131i8 implements InterfaceC3464r8<InterfaceC3410ps> {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6148a(InterfaceC3410ps interfaceC3410ps, Map map) {
        InterfaceC3410ps interfaceC3410ps2 = interfaceC3410ps;
        if (interfaceC3410ps2.mo6460P() != null) {
            interfaceC3410ps2.mo6460P().zza();
        }
        BinderC2232o binderC2232oMo6436D = interfaceC3410ps2.mo6436D();
        if (binderC2232oMo6436D != null) {
            binderC2232oMo6436D.m4683a();
            return;
        }
        BinderC2232o binderC2232oMo6446I = interfaceC3410ps2.mo6446I();
        if (binderC2232oMo6446I != null) {
            binderC2232oMo6446I.m4683a();
        } else {
            C2622l.m5226A3("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
