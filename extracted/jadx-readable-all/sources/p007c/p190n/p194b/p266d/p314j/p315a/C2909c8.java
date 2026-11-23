package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.c8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2909c8 implements InterfaceC3464r8 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3464r8 f12954a = new C2909c8();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map map) {
        InterfaceC3410ps interfaceC3410ps = (InterfaceC3410ps) obj;
        InterfaceC3464r8<InterfaceC3410ps> interfaceC3464r8 = C3427q8.f18212a;
        String str = (String) map.get("u");
        if (str == null) {
            C2622l.m5226A3("URL missing from click GMSG.");
            return;
        }
        kv1<String> kv1VarM8196a = C3427q8.m8196a(interfaceC3410ps, str);
        C3094h8 c3094h8 = new C3094h8(interfaceC3410ps);
        kv1VarM8196a.mo6230f(new ev1(kv1VarM8196a, c3094h8), C2962do.f13330a);
    }
}
