package p007c.p165l.p166h0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.p173g0.RestrictiveDataManager;
import p007c.p165l.p178k0.FeatureManager;
import p007c.p165l.p178k0.FetchedAppSettings;
import p007c.p165l.p178k0.FetchedAppSettingsManager;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.r, reason: use source file name */
/* JADX INFO: compiled from: AppEventsManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventsManager2 implements FeatureManager.b {
    @Override // p007c.p165l.p178k0.FeatureManager.b
    /* JADX INFO: renamed from: a */
    public void mo2314a(boolean z) {
        String str;
        if (z) {
            RestrictiveDataManager.f4796a = true;
            try {
                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                Validate.m2479h();
                FetchedAppSettings fetchedAppSettingsM2528f = FetchedAppSettingsManager.m2528f(FacebookSdk.f5354c, false);
                if (fetchedAppSettingsM2528f == null || (str = fetchedAppSettingsM2528f.f5013m) == null || str.isEmpty()) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                RestrictiveDataManager.f4798c.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        RestrictiveDataManager.a aVar = new RestrictiveDataManager.a(next, new HashMap());
                        if (jSONObjectOptJSONObject != null) {
                            HashMap map = new HashMap();
                            Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                String strOptString = jSONObjectOptJSONObject.optString(next2);
                                if (strOptString != null) {
                                    map.put(next2, strOptString);
                                }
                            }
                            aVar.f4800b = map;
                            RestrictiveDataManager.f4798c.add(aVar);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
