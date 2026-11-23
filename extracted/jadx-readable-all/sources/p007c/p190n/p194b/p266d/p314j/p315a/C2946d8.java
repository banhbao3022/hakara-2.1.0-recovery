package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2278l0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.d8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2946d8 implements InterfaceC3464r8 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3464r8 f13186a = new C2946d8();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map map) {
        InterfaceC3485rt interfaceC3485rt = (InterfaceC3485rt) obj;
        InterfaceC3464r8<InterfaceC3410ps> interfaceC3464r8 = C3427q8.f18212a;
        String str = (String) map.get("u");
        if (str == null) {
            C2622l.m5226A3("URL missing from httpTrack GMSG.");
        } else {
            new C2278l0(interfaceC3485rt.getContext(), ((InterfaceC3745yt) interfaceC3485rt).mo6495o().f21615f, str).m4707b();
        }
    }
}
