package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p290d.C2410n;
import p007c.p190n.p194b.p266d.p290d.p295s.C2539l;
import p007c.p190n.p194b.p266d.p290d.p295s.C2545p;
import p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2546q;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.n0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2486n0 extends C2458h.g {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C2458h f11347q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2486n0(C2458h c2458h) {
        super(false);
        this.f11347q = c2458h;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.g
    /* JADX INFO: renamed from: m */
    public final void mo5087m() throws C2545p {
        C2539l c2539l = this.f11347q.f11290d;
        InterfaceC2546q interfaceC2546q = this.f11300n;
        Objects.requireNonNull(c2539l);
        JSONObject jSONObject = new JSONObject();
        long jM5170c = c2539l.m5170c();
        try {
            jSONObject.put("requestId", jM5170c);
            jSONObject.put("type", "GET_STATUS");
            C2410n c2410n = c2539l.f11435g;
            if (c2410n != null) {
                jSONObject.put("mediaSessionId", c2410n.f11096g);
            }
        } catch (JSONException unused) {
        }
        c2539l.m5169a(jSONObject.toString(), jM5170c, null);
        c2539l.f11445q.m5165c(jM5170c, interfaceC2546q);
    }
}
