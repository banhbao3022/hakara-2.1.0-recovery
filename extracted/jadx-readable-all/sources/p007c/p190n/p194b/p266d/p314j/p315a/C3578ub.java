package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.AbstractMap;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.d.j.a.ub */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3578ub implements InterfaceC3295mo<InterfaceC2987ec> {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3295mo
    /* JADX INFO: renamed from: a */
    public final void mo5960a(InterfaceC2987ec interfaceC2987ec) {
        C2096e.m4590z("Ending javascript session.");
        C3024fc c3024fc = (C3024fc) interfaceC2987ec;
        for (AbstractMap.SimpleEntry<String, InterfaceC3464r8<? super InterfaceC2987ec>> simpleEntry : c3024fc.f14011g) {
            String strValueOf = String.valueOf(simpleEntry.getValue().toString());
            C2096e.m4590z(strValueOf.length() != 0 ? "Unregistering eventhandler: ".concat(strValueOf) : new String("Unregistering eventhandler: "));
            c3024fc.f14010f.mo6617c(simpleEntry.getKey(), simpleEntry.getValue());
        }
        c3024fc.f14011g.clear();
    }
}
