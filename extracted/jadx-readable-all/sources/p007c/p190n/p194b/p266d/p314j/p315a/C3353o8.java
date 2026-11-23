package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.a.o8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3353o8 implements InterfaceC3464r8<InterfaceC3410ps> {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(InterfaceC3410ps interfaceC3410ps, Map map) {
        InterfaceC3410ps interfaceC3410ps2 = interfaceC3410ps;
        if (map.keySet().contains("start")) {
            C3670ws c3670ws = (C3670ws) interfaceC3410ps2.mo6459O0();
            synchronized (c3670ws.f21328j) {
            }
            c3670ws.f21321C++;
            c3670ws.m8684p();
            return;
        }
        if (map.keySet().contains("stop")) {
            C3670ws c3670ws2 = (C3670ws) interfaceC3410ps2.mo6459O0();
            c3670ws2.f21321C--;
            c3670ws2.m8684p();
        } else if (map.keySet().contains("cancel")) {
            C3670ws c3670ws3 = (C3670ws) interfaceC3410ps2.mo6459O0();
            as2 as2Var = c3670ws3.f21326h;
            if (as2Var != null) {
                as2Var.m5845a(bs2.DELAY_PAGE_LOAD_CANCELLED_AD);
            }
            c3670ws3.f21320B = true;
            c3670ws3.m8684p();
            c3670ws3.f21325g.destroy();
        }
    }
}
