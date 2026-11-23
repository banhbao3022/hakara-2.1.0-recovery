package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p290d.p295s.C2539l;
import p007c.p190n.p194b.p266d.p290d.p295s.C2545p;
import p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2546q;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.o */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2487o extends C2458h.g {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int[] f11348q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C2458h f11349r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2487o(C2458h c2458h, int[] iArr) {
        super(true);
        this.f11349r = c2458h;
        this.f11348q = iArr;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.g
    /* JADX INFO: renamed from: m */
    public final void mo5087m() throws C2545p {
        C2539l c2539l = this.f11349r.f11290d;
        InterfaceC2546q interfaceC2546q = this.f11300n;
        int[] iArr = this.f11348q;
        Objects.requireNonNull(c2539l);
        JSONObject jSONObject = new JSONObject();
        long jM5170c = c2539l.m5170c();
        try {
            jSONObject.put("requestId", jM5170c);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", c2539l.m5162p());
            JSONArray jSONArray = new JSONArray();
            for (int i : iArr) {
                jSONArray.put(i);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        c2539l.m5169a(jSONObject.toString(), jM5170c, null);
        c2539l.f11453y.m5165c(jM5170c, interfaceC2546q);
    }
}
