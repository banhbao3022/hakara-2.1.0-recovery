package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.s7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3500s7 implements InterfaceC3464r8<Object> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3537t7 f19477a;

    public C3500s7(InterfaceC3537t7 interfaceC3537t7) {
        this.f19477a = interfaceC3537t7;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            C2622l.m5226A3("App event with no name parameter.");
        } else {
            this.f19477a.mo8124M(str, map.get("info"));
        }
    }
}
