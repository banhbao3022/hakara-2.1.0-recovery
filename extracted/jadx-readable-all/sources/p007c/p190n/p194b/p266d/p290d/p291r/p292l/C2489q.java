package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p290d.C2407m;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p290d.p295s.C2539l;
import p007c.p190n.p194b.p266d.p290d.p295s.C2543n;
import p007c.p190n.p194b.p266d.p290d.p295s.C2545p;
import p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2546q;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.q */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2489q extends C2458h.g {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C2407m f11352q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C2458h f11353r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2489q(C2458h c2458h, C2407m c2407m) {
        super(false);
        this.f11353r = c2458h;
        this.f11352q = c2407m;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.g
    /* JADX INFO: renamed from: m */
    public final void mo5087m() throws C2545p {
        C2539l c2539l = this.f11353r.f11290d;
        InterfaceC2546q interfaceC2546q = this.f11300n;
        C2407m c2407m = this.f11352q;
        Objects.requireNonNull(c2539l);
        JSONObject jSONObject = new JSONObject();
        long jM5170c = c2539l.m5170c();
        long j2 = c2407m.f11086c ? 4294967296000L : c2407m.f11084a;
        try {
            jSONObject.put("requestId", jM5170c);
            jSONObject.put("type", "SEEK");
            jSONObject.put("mediaSessionId", c2539l.m5162p());
            jSONObject.put("currentTime", C2516a.m5111a(j2));
            int i = c2407m.f11085b;
            if (i == 1) {
                jSONObject.put("resumeState", "PLAYBACK_START");
            } else if (i == 2) {
                jSONObject.put("resumeState", "PLAYBACK_PAUSE");
            }
            JSONObject jSONObject2 = c2407m.f11087d;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        c2539l.m5169a(jSONObject.toString(), jM5170c, null);
        c2539l.f11436h = Long.valueOf(j2);
        c2539l.f11442n.m5165c(jM5170c, new C2543n(c2539l, interfaceC2546q));
    }
}
