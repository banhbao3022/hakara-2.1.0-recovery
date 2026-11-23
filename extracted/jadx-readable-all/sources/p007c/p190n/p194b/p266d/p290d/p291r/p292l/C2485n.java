package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p290d.p295s.C2539l;
import p007c.p190n.p194b.p266d.p290d.p295s.C2545p;
import p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2546q;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.n */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2485n extends C2458h.g {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C2458h f11346q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2485n(C2458h c2458h) {
        super(true);
        this.f11346q = c2458h;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.g
    /* JADX INFO: renamed from: m */
    public final void mo5087m() throws C2545p {
        C2539l c2539l = this.f11346q.f11290d;
        InterfaceC2546q interfaceC2546q = this.f11300n;
        Objects.requireNonNull(c2539l);
        JSONObject jSONObject = new JSONObject();
        long jM5170c = c2539l.m5170c();
        try {
            jSONObject.put("requestId", jM5170c);
            jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", c2539l.m5162p());
        } catch (JSONException unused) {
        }
        c2539l.m5169a(jSONObject.toString(), jM5170c, null);
        c2539l.f11452x.m5165c(jM5170c, interfaceC2546q);
    }
}
