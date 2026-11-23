package p007c.p165l.p166h0.p171e0;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.p166h0.AnalyticsUserIDStore2;
import p007c.p165l.p166h0.UserDataStore;
import p007c.p165l.p178k0.AttributionIdentifiers;
import p007c.p165l.p178k0.Logger3;
import p007c.p165l.p178k0.Utility;

/* JADX INFO: renamed from: c.l.h0.e0.f, reason: use source file name */
/* JADX INFO: compiled from: AppEventsLoggerUtility.java */
/* JADX INFO: loaded from: classes.dex */
public class AppEventsLoggerUtility {

    /* JADX INFO: renamed from: a */
    public static final Map<b, String> f4725a = new a();

    /* JADX INFO: renamed from: c.l.h0.e0.f$a */
    /* JADX INFO: compiled from: AppEventsLoggerUtility.java */
    public static class a extends HashMap<b, String> {
        public a() {
            put(b.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
            put(b.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
        }
    }

    /* JADX INFO: renamed from: c.l.h0.e0.f$b */
    /* JADX INFO: compiled from: AppEventsLoggerUtility.java */
    public enum b {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m2317a(b bVar, AttributionIdentifiers attributionIdentifiers, String str, boolean z, Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f4725a.get(bVar));
        if (!AnalyticsUserIDStore2.f4609d) {
            Log.w(AnalyticsUserIDStore2.f4606a, "initStore should have been called before calling setUserID");
            AnalyticsUserIDStore2.m2286a();
        }
        AnalyticsUserIDStore2.f4607b.readLock().lock();
        try {
            String str2 = AnalyticsUserIDStore2.f4608c;
            AnalyticsUserIDStore2.f4607b.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            jSONObject.put("anon_id", str);
            jSONObject.put("application_tracking_enabled", !z);
            if (attributionIdentifiers != null) {
                String str3 = attributionIdentifiers.f4888b;
                if (str3 != null) {
                    jSONObject.put("attribution", str3);
                }
                if (attributionIdentifiers.m2419b() != null) {
                    jSONObject.put("advertiser_id", attributionIdentifiers.m2419b());
                    jSONObject.put("advertiser_tracking_enabled", !attributionIdentifiers.f4891e);
                }
                if (!attributionIdentifiers.f4891e) {
                    if (!UserDataStore.f4591c.get()) {
                        UserDataStore.m2279a();
                    }
                    HashMap map = new HashMap();
                    map.putAll(UserDataStore.f4592d);
                    map.putAll(UserDataStore.f4593e);
                    String strM2431D = Utility.m2431D(map);
                    if (!strM2431D.isEmpty()) {
                        jSONObject.put("ud", strM2431D);
                    }
                }
                String str4 = attributionIdentifiers.f4890d;
                if (str4 != null) {
                    jSONObject.put("installer_package", str4);
                }
            }
            try {
                Utility.m2439L(jSONObject, context);
            } catch (Exception e) {
                e.toString();
                HashMap<String, String> map2 = Logger3.f5043a;
                synchronized (FacebookSdk.f5352a) {
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th) {
            AnalyticsUserIDStore2.f4607b.readLock().unlock();
            throw th;
        }
    }
}
