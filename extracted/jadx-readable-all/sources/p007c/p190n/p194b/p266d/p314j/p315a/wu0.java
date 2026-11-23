package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wu0 implements dl1<vu0, ru0> {

    /* JADX INFO: renamed from: a */
    public final String f21363a;

    public wu0(String str) {
        this.f21363a = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dl1
    /* JADX INFO: renamed from: a */
    public final ru0 mo5679a(vu0 vu0Var) throws Exception {
        vu0 vu0Var2 = vu0Var;
        int iOptInt = vu0Var2.f20945a.optInt("http_timeout_millis", 60000);
        C3548ti c3548ti = vu0Var2.f20946b;
        int i = c3548ti.f19839g;
        if (i != -2) {
            if (i != 1) {
                throw new or0(1);
            }
            List<String> list = c3548ti.f19833a;
            if (list != null) {
                C2622l.m5408n3(TextUtils.join(", ", list));
            }
            throw new or0(2, "Error building request URL.");
        }
        HashMap map = new HashMap();
        if (vu0Var2.f20946b.f19837e && !TextUtils.isEmpty(this.f21363a)) {
            map.put("Cookie", this.f21363a);
        }
        String str = "";
        if (vu0Var2.f20946b.f19836d) {
            JSONObject jSONObjectOptJSONObject = vu0Var2.f20945a.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                C2096e.m4590z("DSID signal does not exist.");
            }
        }
        C3548ti c3548ti2 = vu0Var2.f20946b;
        if (c3548ti2 != null && !TextUtils.isEmpty(c3548ti2.f19835c)) {
            str = vu0Var2.f20946b.f19835c;
        }
        return new ru0(vu0Var2.f20946b.f19838f, iOptInt, map, str);
    }
}
