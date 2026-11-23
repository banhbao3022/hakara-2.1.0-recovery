package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: renamed from: c.n.b.d.j.a.bd */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2876bd implements qu1 {

    /* JADX INFO: renamed from: a */
    public final C2951dd f12569a;

    /* JADX INFO: renamed from: b */
    public final Object f12570b;

    public C2876bd(C2951dd c2951dd, Object obj) {
        this.f12569a = c2951dd;
        this.f12570b = obj;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
    /* JADX INFO: renamed from: a */
    public final kv1 mo4612a(Object obj) throws JSONException {
        C2951dd c2951dd = this.f12569a;
        Object obj2 = this.f12570b;
        Objects.requireNonNull(c2951dd);
        C3147io c3147io = new C3147io();
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        String string = UUID.randomUUID().toString();
        C3427q8.f18227p.m6782b(string, new C2914cd(c2951dd, c3147io));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj2);
        ((InterfaceC2987ec) obj).mo6507u0("google.afma.activeView.handleUpdate", jSONObject);
        return c3147io;
    }
}
