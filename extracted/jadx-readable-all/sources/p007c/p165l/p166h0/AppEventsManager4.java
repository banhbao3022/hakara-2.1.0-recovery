package p007c.p165l.p166h0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.p170d0.EventDeactivationManager;
import p007c.p165l.p178k0.FeatureManager;
import p007c.p165l.p178k0.FetchedAppSettings;
import p007c.p165l.p178k0.FetchedAppSettingsManager;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.t, reason: use source file name */
/* JADX INFO: compiled from: AppEventsManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventsManager4 implements FeatureManager.b {
    @Override // p007c.p165l.p178k0.FeatureManager.b
    /* JADX INFO: renamed from: a */
    public void mo2314a(boolean z) {
        ArrayList arrayList;
        if (!z) {
            return;
        }
        EventDeactivationManager.f4702a = true;
        synchronized (EventDeactivationManager.class) {
            try {
                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                Validate.m2479h();
                FetchedAppSettings fetchedAppSettingsM2528f = FetchedAppSettingsManager.m2528f(FacebookSdk.f5354c, false);
                if (fetchedAppSettingsM2528f == null) {
                    return;
                }
                String str = fetchedAppSettingsM2528f.f5013m;
                if (!str.isEmpty()) {
                    JSONObject jSONObject = new JSONObject(str);
                    EventDeactivationManager.f4703b.clear();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        if (jSONObject2 != null) {
                            if (jSONObject2.optBoolean("is_deprecated_event")) {
                                EventDeactivationManager.f4704c.add(next);
                            } else {
                                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                EventDeactivationManager.a aVar = new EventDeactivationManager.a(next, new ArrayList());
                                if (jSONArrayOptJSONArray != null) {
                                    try {
                                        arrayList = new ArrayList();
                                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                            arrayList.add(jSONArrayOptJSONArray.getString(i));
                                        }
                                    } catch (JSONException unused) {
                                        arrayList = new ArrayList();
                                    }
                                    aVar.f4706b = arrayList;
                                }
                                EventDeactivationManager.f4703b.add(aVar);
                            }
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }
}
