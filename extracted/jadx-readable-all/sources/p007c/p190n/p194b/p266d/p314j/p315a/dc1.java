package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dc1 implements ha1<JSONObject> {

    /* JADX INFO: renamed from: a */
    public final List<String> f13234a;

    public dc1(List<String> list) {
        this.f13234a = list;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5696d(JSONObject jSONObject) {
        try {
            jSONObject.put("eid", TextUtils.join(",", this.f13234a));
        } catch (JSONException unused) {
            C2096e.m4590z("Failed putting experiment ids.");
        }
    }
}
