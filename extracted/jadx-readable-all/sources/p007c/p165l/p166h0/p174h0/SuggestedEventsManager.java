package p007c.p165l.p166h0.p174h0;

import android.app.Activity;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.p171e0.ActivityLifecycleTracker;
import p007c.p165l.p166h0.p172f0.Model2;
import p007c.p165l.p166h0.p172f0.ModelManager4;
import p007c.p165l.p178k0.FetchedAppSettings;
import p007c.p165l.p178k0.FetchedAppSettingsManager;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.h0.d, reason: use source file name */
/* JADX INFO: compiled from: SuggestedEventsManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class SuggestedEventsManager {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f4811a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public static final Set<String> f4812b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static final Set<String> f4813c = new HashSet();

    /* JADX INFO: renamed from: a */
    public static void m2350a() {
        String str;
        try {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            FetchedAppSettings fetchedAppSettingsM2528f = FetchedAppSettingsManager.m2528f(FacebookSdk.f5354c, false);
            if (fetchedAppSettingsM2528f == null || (str = fetchedAppSettingsM2528f.f5012l) == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                for (int i = 0; i < jSONArray.length(); i++) {
                    f4812b.add(jSONArray.getString(i));
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    f4813c.add(jSONArray2.getString(i2));
                }
            }
            if (f4812b.isEmpty() && f4813c.isEmpty()) {
                return;
            }
            ConcurrentMap<String, Model2> concurrentMap = ModelManager4.f4791a;
            File file = !concurrentMap.containsKey("SUGGEST_EVENT") ? null : concurrentMap.get("SUGGEST_EVENT").f4765e;
            if (file == null) {
                return;
            }
            FeatureExtractor.m2337c(file);
            WeakReference<Activity> weakReference = ActivityLifecycleTracker.f4718k;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity != null) {
                m2351b(activity);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2351b(Activity activity) {
        try {
            if (f4811a.get() && FeatureExtractor.f4806e && (!f4812b.isEmpty() || !f4813c.isEmpty())) {
                ViewObserver.m2352c(activity);
            } else {
                ViewObserver.m2353d(activity);
            }
        } catch (Exception unused) {
        }
    }
}
