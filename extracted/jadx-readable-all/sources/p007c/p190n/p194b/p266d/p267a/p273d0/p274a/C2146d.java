package p007c.p190n.p194b.p266d.p267a.p273d0.p274a;

import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p275e0.AbstractC2171b;
import p007c.p190n.p194b.p266d.p267a.p275e0.C2170a;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.a.d0.a.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2146d extends AbstractC2171b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f10495a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2141a f10496b;

    public C2146d(C2141a c2141a, String str) {
        this.f10496b = c2141a;
        this.f10495a = str;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p275e0.AbstractC2171b
    /* JADX INFO: renamed from: a */
    public final void mo4614a(String str) {
        String strValueOf = String.valueOf(str);
        C2622l.m5226A3(strValueOf.length() != 0 ? "Failed to generate query info for the tagging library, error: ".concat(strValueOf) : new String("Failed to generate query info for the tagging library, error: "));
        this.f10496b.f10486b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.f10495a, str), null);
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p275e0.AbstractC2171b
    /* JADX INFO: renamed from: b */
    public final void mo4615b(C2170a c2170a) {
        String str;
        String str2 = c2170a.f10553a.f20975a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f10495a);
            jSONObject.put("signal", str2);
            str = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            str = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", this.f10495a, c2170a.f10553a.f20975a);
        }
        this.f10496b.f10486b.evaluateJavascript(str, null);
    }
}
