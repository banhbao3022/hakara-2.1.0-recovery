package p007c.p190n.p194b.p266d.p314j.p315a;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oc1 implements ha1 {

    /* JADX INFO: renamed from: a */
    public static final ha1 f17595a = new oc1();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final void mo5696d(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
        } catch (JSONException unused) {
        }
    }
}
