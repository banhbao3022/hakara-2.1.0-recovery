package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.n.b.d.j.a.g8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3057g8 implements InterfaceC3464r8<InterfaceC3410ps> {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6148a(InterfaceC3410ps interfaceC3410ps, Map map) {
        JSONObject jSONObjectMo6199b;
        InterfaceC3410ps interfaceC3410ps2 = interfaceC3410ps;
        InterfaceC3128i5 interfaceC3128i5Mo6450K = interfaceC3410ps2.mo6450K();
        if (interfaceC3128i5Mo6450K == null || (jSONObjectMo6199b = interfaceC3128i5Mo6450K.mo6199b()) == null) {
            interfaceC3410ps2.mo6433B0("nativeAdViewSignalsReady", new JSONObject());
        } else {
            interfaceC3410ps2.mo6433B0("nativeAdViewSignalsReady", jSONObjectMo6199b);
        }
    }
}
