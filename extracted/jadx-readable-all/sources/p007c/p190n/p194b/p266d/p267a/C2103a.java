package p007c.p190n.p194b.p266d.p267a;

import androidx.annotation.RecentlyNonNull;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p314j.p315a.yv2;

/* JADX INFO: renamed from: c.n.b.d.a.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2103a {

    /* JADX INFO: renamed from: a */
    public final int f10443a;

    /* JADX INFO: renamed from: b */
    public final String f10444b;

    /* JADX INFO: renamed from: c */
    public final String f10445c;

    /* JADX INFO: renamed from: d */
    public final C2103a f10446d;

    public C2103a(int i, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        this(i, str, str2, null);
    }

    public C2103a(int i, @RecentlyNonNull String str, @RecentlyNonNull String str2, C2103a c2103a) {
        this.f10443a = i;
        this.f10444b = str;
        this.f10445c = str2;
        this.f10446d = c2103a;
    }

    /* JADX INFO: renamed from: a */
    public final yv2 m4597a() {
        C2103a c2103a = this.f10446d;
        return new yv2(this.f10443a, this.f10444b, this.f10445c, c2103a == null ? null : new yv2(c2103a.f10443a, c2103a.f10444b, c2103a.f10445c, null, null), null);
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: b */
    public JSONObject mo4598b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f10443a);
        jSONObject.put("Message", this.f10444b);
        jSONObject.put("Domain", this.f10445c);
        C2103a c2103a = this.f10446d;
        if (c2103a == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", c2103a.mo4598b());
        }
        return jSONObject;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return mo4598b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
