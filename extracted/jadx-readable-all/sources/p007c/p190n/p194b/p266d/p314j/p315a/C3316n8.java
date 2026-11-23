package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.a.n8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3316n8 implements InterfaceC3464r8<InterfaceC3410ps> {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6148a(InterfaceC3410ps interfaceC3410ps, Map map) {
        InterfaceC3410ps interfaceC3410ps2 = interfaceC3410ps;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            interfaceC3410ps2.mo4863b();
        } else if ("resume".equals(str)) {
            interfaceC3410ps2.mo4862A0();
        }
    }
}
