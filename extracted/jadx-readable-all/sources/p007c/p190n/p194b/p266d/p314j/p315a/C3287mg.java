package p007c.p190n.p194b.p266d.p314j.p315a;

import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.mg */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C3287mg {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3410ps f16745a;

    /* JADX INFO: renamed from: b */
    public final String f16746b;

    public C3287mg(InterfaceC3410ps interfaceC3410ps, String str) {
        this.f16745a = interfaceC3410ps;
        this.f16746b = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m7693b(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.f16746b);
            InterfaceC3410ps interfaceC3410ps = this.f16745a;
            if (interfaceC3410ps != null) {
                interfaceC3410ps.mo6433B0("onError", jSONObjectPut);
            }
        } catch (JSONException e) {
            C2622l.m5438t3("Error occurred while dispatching error event.", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7694c(int i, int i2, int i3, int i4) {
        try {
            this.f16745a.mo6433B0("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            C2622l.m5438t3("Error occurred while dispatching size change.", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7695d(String str) {
        try {
            this.f16745a.mo6433B0("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            C2622l.m5438t3("Error occurred while dispatching state change.", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7696e(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f16745a.mo6433B0("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            C2622l.m5438t3("Error occurred while obtaining screen information.", e);
        }
    }
}
