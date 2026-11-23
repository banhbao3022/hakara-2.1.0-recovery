package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.e8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2983e8 implements InterfaceC3464r8 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3464r8 f13528a = new C2983e8();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map map) {
        InterfaceC3708xt interfaceC3708xt = (InterfaceC3708xt) obj;
        InterfaceC3464r8<InterfaceC3410ps> interfaceC3464r8 = C3427q8.f18212a;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i = Integer.parseInt(str);
            int i2 = Integer.parseInt(str2);
            int i3 = Integer.parseInt(str3);
            rd2 rd2VarMo6502s = interfaceC3708xt.mo6502s();
            if (rd2VarMo6502s != null) {
                rd2VarMo6502s.f18750d.mo4855d(i, i2, i3);
            }
        } catch (NumberFormatException unused) {
            C2622l.m5226A3("Could not parse touch parameters from gmsg.");
        }
    }
}
