package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p290d.p295s.C2539l;
import p007c.p190n.p194b.p266d.p290d.p295s.C2545p;
import p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2546q;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.p */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2488p extends C2458h.g {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ JSONObject f11350q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C2458h f11351r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2488p(C2458h c2458h, JSONObject jSONObject) {
        super(false);
        this.f11351r = c2458h;
        this.f11350q = jSONObject;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.g
    /* JADX INFO: renamed from: m */
    public final void mo5087m() throws C2545p {
        C2539l c2539l = this.f11351r.f11290d;
        InterfaceC2546q interfaceC2546q = this.f11300n;
        JSONObject jSONObject = this.f11350q;
        Objects.requireNonNull(c2539l);
        JSONObject jSONObject2 = new JSONObject();
        long jM5170c = c2539l.m5170c();
        try {
            jSONObject2.put("requestId", jM5170c);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", c2539l.m5162p());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        c2539l.m5169a(jSONObject2.toString(), jM5170c, null);
        c2539l.f11439k.m5165c(jM5170c, interfaceC2546q);
    }
}
