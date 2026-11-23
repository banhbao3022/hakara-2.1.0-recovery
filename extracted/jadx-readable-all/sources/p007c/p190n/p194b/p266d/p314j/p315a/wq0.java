package p007c.p190n.p194b.p266d.p314j.p315a;

import com.cgfay.media.CainMediaMetadataRetriever;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wq0 {

    /* JADX INFO: renamed from: a */
    public final String f21299a;

    /* JADX INFO: renamed from: b */
    public final String f21300b;

    /* JADX INFO: renamed from: c */
    public final int f21301c;

    /* JADX INFO: renamed from: d */
    public final String f21302d;

    /* JADX INFO: renamed from: e */
    public final int f21303e;

    public wq0(String str, String str2, int i, String str3, int i2) {
        this.f21299a = str;
        this.f21300b = str2;
        this.f21301c = i;
        this.f21302d = str3;
        this.f21303e = i2;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m8666a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f21299a);
        jSONObject.put("version", this.f21300b);
        jSONObject.put("status", this.f21301c);
        jSONObject.put(CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION, this.f21302d);
        jSONObject.put("initializationLatencyMillis", this.f21303e);
        return jSONObject;
    }
}
