package p007c.p190n.p194b.p266d.p267a;

import androidx.annotation.RecentlyNonNull;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;

/* JADX INFO: renamed from: c.n.b.d.a.m */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2186m extends C2103a {

    /* JADX INFO: renamed from: e */
    public final C2192s f10579e;

    public C2186m(int i, @RecentlyNonNull String str, @RecentlyNonNull String str2, C2103a c2103a, C2192s c2192s) {
        super(i, str, str2, c2103a);
        this.f10579e = c2192s;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.C2103a
    @RecentlyNonNull
    /* JADX INFO: renamed from: b */
    public final JSONObject mo4598b() throws JSONException {
        JSONObject jSONObjectMo4598b = super.mo4598b();
        C2192s c2192s = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14279U4)).booleanValue() ? this.f10579e : null;
        if (c2192s == null) {
            jSONObjectMo4598b.put("Response Info", "null");
        } else {
            jSONObjectMo4598b.put("Response Info", c2192s.m4634a());
        }
        return jSONObjectMo4598b;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.C2103a
    @RecentlyNonNull
    public String toString() {
        try {
            return mo4598b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
