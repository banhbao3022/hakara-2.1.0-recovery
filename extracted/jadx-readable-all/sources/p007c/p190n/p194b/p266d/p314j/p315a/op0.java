package p007c.p190n.p194b.p266d.p314j.p315a;

import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class op0 {

    /* JADX INFO: renamed from: a */
    public Long f17713a;

    /* JADX INFO: renamed from: b */
    public final String f17714b;

    /* JADX INFO: renamed from: c */
    public String f17715c;

    /* JADX INFO: renamed from: d */
    public Integer f17716d;

    /* JADX INFO: renamed from: e */
    public String f17717e;

    /* JADX INFO: renamed from: f */
    public Integer f17718f;

    public /* synthetic */ op0(String str) {
        this.f17714b = str;
    }

    /* JADX INFO: renamed from: a */
    public static String m8051a(op0 op0Var) {
        String str = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14183E5);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", op0Var.f17713a);
            jSONObject.put("eventCategory", op0Var.f17714b);
            jSONObject.putOpt("event", op0Var.f17715c);
            jSONObject.putOpt("errorCode", op0Var.f17716d);
            jSONObject.putOpt("rewardType", op0Var.f17717e);
            jSONObject.putOpt("rewardAmount", op0Var.f17718f);
        } catch (JSONException unused) {
            C2622l.m5226A3("Could not convert parameters to JSON.");
        }
        String string = jSONObject.toString();
        return outline.m1553D(new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(string).length()), str, "(\"h5adsEvent\",", string, ");");
    }
}
