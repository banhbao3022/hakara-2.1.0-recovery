package p007c.p165l.p166h0.p172f0;

import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.p178k0.FeatureManager;
import p007c.p165l.p178k0.Utility;

/* JADX INFO: renamed from: c.l.h0.f0.b, reason: use source file name */
/* JADX INFO: compiled from: ModelManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class ModelManager implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        Locale localeM2456o;
        try {
            JSONObject jSONObjectM2332a = ModelManager4.m2332a();
            if (jSONObjectM2332a != null) {
                ModelManager4.f4792b.edit().putString("models", jSONObjectM2332a.toString()).apply();
            } else {
                jSONObjectM2332a = new JSONObject(ModelManager4.f4792b.getString("models", ""));
            }
            Iterator<String> itKeys = jSONObjectM2332a.keys();
            while (itKeys.hasNext()) {
                try {
                    String next = itKeys.next();
                    Model2 model2M2333b = ModelManager4.m2333b(jSONObjectM2332a.getJSONObject(next));
                    if (model2M2333b != null) {
                        ModelManager4.f4791a.put(next, model2M2333b);
                    }
                } catch (JSONException unused) {
                }
            }
            ConcurrentMap<String, Model2> concurrentMap = ModelManager4.f4791a;
            if (concurrentMap.containsKey("SUGGEST_EVENT") && ((localeM2456o = Utility.m2456o()) == null || localeM2456o.getLanguage().contains("en"))) {
                FeatureManager.m2514a(8, new ModelManager2());
            }
            if (concurrentMap.containsKey("DATA_DETECTION_ADDRESS")) {
                FeatureManager.m2514a(9, new ModelManager3());
            }
        } catch (Exception unused2) {
        }
    }
}
