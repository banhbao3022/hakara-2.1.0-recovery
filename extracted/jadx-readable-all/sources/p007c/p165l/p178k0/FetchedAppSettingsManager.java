package p007c.p165l.p178k0;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookSdk;
import p007c.p165l.FacebookSdk2;
import p007c.p165l.GraphRequest2;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.AnalyticsUserIDStore;
import p007c.p165l.p166h0.AnalyticsUserIDStore2;
import p007c.p165l.p166h0.AppEventsLoggerImpl3;
import p007c.p165l.p166h0.UserDataStore;
import p007c.p165l.p166h0.p171e0.ActivityLifecycleTracker;
import p007c.p165l.p166h0.p171e0.AutomaticAnalyticsLogger;
import p007c.p165l.p166h0.p171e0.InAppPurchaseActivityLifecycleTracker;
import p007c.p165l.p166h0.p171e0.InAppPurchaseActivityLifecycleTracker2;
import p007c.p165l.p166h0.p171e0.InAppPurchaseActivityLifecycleTracker3;
import p007c.p165l.p166h0.p171e0.InAppPurchaseEventManager;

/* JADX INFO: renamed from: c.l.k0.s, reason: use source file name */
/* JADX INFO: compiled from: FetchedAppSettingsManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class FetchedAppSettingsManager {

    /* JADX INFO: renamed from: a */
    public static final String f5017a = "s";

    /* JADX INFO: renamed from: b */
    public static final String[] f5018b = {"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting"};

    /* JADX INFO: renamed from: c */
    public static final Map<String, FetchedAppSettings> f5019c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final AtomicReference<d> f5020d = new AtomicReference<>(d.NOT_LOADED);

    /* JADX INFO: renamed from: e */
    public static final ConcurrentLinkedQueue<e> f5021e = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: f */
    public static boolean f5022f = false;

    /* JADX INFO: renamed from: g */
    public static JSONArray f5023g = null;

    /* JADX INFO: renamed from: c.l.k0.s$a */
    /* JADX INFO: compiled from: FetchedAppSettingsManager.java */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Context f5024f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f5025g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f5026h;

        public a(Context context, String str, String str2) {
            this.f5024f = context;
            this.f5025g = str;
            this.f5026h = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject;
            SharedPreferences sharedPreferences = this.f5024f.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
            FetchedAppSettings fetchedAppSettingsM2526d = null;
            String string = sharedPreferences.getString(this.f5025g, null);
            if (!Utility.m2466y(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    fetchedAppSettingsM2526d = FetchedAppSettingsManager.m2526d(this.f5026h, jSONObject);
                }
            }
            JSONObject jSONObjectM2523a = FetchedAppSettingsManager.m2523a(this.f5026h);
            if (jSONObjectM2523a != null) {
                FetchedAppSettingsManager.m2526d(this.f5026h, jSONObjectM2523a);
                sharedPreferences.edit().putString(this.f5025g, jSONObjectM2523a.toString()).apply();
            }
            if (fetchedAppSettingsM2526d != null) {
                String str = fetchedAppSettingsM2526d.f5009i;
                if (!FetchedAppSettingsManager.f5022f && str != null && str.length() > 0) {
                    FetchedAppSettingsManager.f5022f = true;
                    Log.w(FetchedAppSettingsManager.f5017a, str);
                }
            }
            String str2 = this.f5026h;
            JSONObject jSONObjectM2518a = FetchedAppGateKeepersManager.m2518a(str2);
            if (jSONObjectM2518a != null) {
                HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
                Validate.m2479h();
                FacebookSdk.f5360i.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", str2), jSONObjectM2518a.toString()).apply();
                FetchedAppGateKeepersManager.m2521d(str2, jSONObjectM2518a);
            }
            String str3 = AutomaticAnalyticsLogger.f4729a;
            HashSet<LoggingBehavior> hashSet3 = FacebookSdk.f5352a;
            Validate.m2479h();
            Context context = FacebookSdk.f5360i;
            Validate.m2479h();
            String str4 = FacebookSdk.f5354c;
            boolean zM2659a = FacebookSdk.m2659a();
            Validate.m2477f(context, "context");
            if (zM2659a) {
                if (context instanceof Application) {
                    Application application = (Application) context;
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = AppEventsLoggerImpl3.f4842a;
                    if (!FacebookSdk.m2664f()) {
                        throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
                    }
                    if (!AnalyticsUserIDStore2.f4609d) {
                        if (AppEventsLoggerImpl3.f4842a == null) {
                            AppEventsLoggerImpl3.m2363b();
                        }
                        AppEventsLoggerImpl3.f4842a.execute(new AnalyticsUserIDStore());
                    }
                    if (!UserDataStore.f4591c.get()) {
                        UserDataStore.m2279a();
                    }
                    if (str4 == null) {
                        Validate.m2479h();
                        str4 = FacebookSdk.f5354c;
                    }
                    FacebookSdk.m2660b().execute(new FacebookSdk2(application.getApplicationContext(), str4));
                    ActivityLifecycleTracker.m2313c(application, str4);
                } else {
                    Log.w(AutomaticAnalyticsLogger.f4729a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
                }
            }
            if (InAppPurchaseActivityLifecycleTracker3.f4736c == null) {
                try {
                    Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
                    Boolean bool = Boolean.TRUE;
                    InAppPurchaseActivityLifecycleTracker3.f4736c = bool;
                    try {
                        Class.forName("com.android.billingclient.api.ProxyBillingActivity");
                        InAppPurchaseActivityLifecycleTracker3.f4737d = bool;
                    } catch (ClassNotFoundException unused2) {
                        InAppPurchaseActivityLifecycleTracker3.f4737d = Boolean.FALSE;
                    }
                    HashMap<String, Method> map = InAppPurchaseEventManager.f4742a;
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    SharedPreferences sharedPreferences2 = InAppPurchaseEventManager.f4745d;
                    long j2 = sharedPreferences2.getLong("LAST_CLEARED_TIME", 0L);
                    if (j2 == 0) {
                        sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                    } else if (jCurrentTimeMillis - j2 > 604800) {
                        sharedPreferences2.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                    }
                    InAppPurchaseActivityLifecycleTracker3.f4740g = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                    InAppPurchaseActivityLifecycleTracker3.f4738e = new InAppPurchaseActivityLifecycleTracker();
                    InAppPurchaseActivityLifecycleTracker3.f4739f = new InAppPurchaseActivityLifecycleTracker2();
                } catch (ClassNotFoundException unused3) {
                    InAppPurchaseActivityLifecycleTracker3.f4736c = Boolean.FALSE;
                }
            }
            if (InAppPurchaseActivityLifecycleTracker3.f4736c.booleanValue() && AutomaticAnalyticsLogger.m2318a() && InAppPurchaseActivityLifecycleTracker3.f4735b.compareAndSet(false, true)) {
                HashSet<LoggingBehavior> hashSet4 = FacebookSdk.f5352a;
                Validate.m2479h();
                Context context2 = FacebookSdk.f5360i;
                if (context2 instanceof Application) {
                    ((Application) context2).registerActivityLifecycleCallbacks(InAppPurchaseActivityLifecycleTracker3.f4739f);
                    context2.bindService(InAppPurchaseActivityLifecycleTracker3.f4740g, InAppPurchaseActivityLifecycleTracker3.f4738e, 1);
                }
            }
            FetchedAppSettingsManager.f5020d.set(FetchedAppSettingsManager.f5019c.containsKey(this.f5026h) ? d.SUCCESS : d.ERROR);
            FetchedAppSettingsManager.m2527e();
        }
    }

    /* JADX INFO: renamed from: c.l.k0.s$b */
    /* JADX INFO: compiled from: FetchedAppSettingsManager.java */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ e f5027f;

        public b(e eVar) {
            this.f5027f = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5027f.m2529a();
        }
    }

    /* JADX INFO: renamed from: c.l.k0.s$c */
    /* JADX INFO: compiled from: FetchedAppSettingsManager.java */
    public static class c implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ e f5028f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ FetchedAppSettings f5029g;

        public c(e eVar, FetchedAppSettings fetchedAppSettings) {
            this.f5028f = eVar;
            this.f5029g = fetchedAppSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5028f.m2530b(this.f5029g);
        }
    }

    /* JADX INFO: renamed from: c.l.k0.s$d */
    /* JADX INFO: compiled from: FetchedAppSettingsManager.java */
    public enum d {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* JADX INFO: renamed from: c.l.k0.s$e */
    /* JADX INFO: compiled from: FetchedAppSettingsManager.java */
    public interface e {
        /* JADX INFO: renamed from: a */
        void m2529a();

        /* JADX INFO: renamed from: b */
        void m2530b(FetchedAppSettings fetchedAppSettings);
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m2523a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(f5018b))));
        GraphRequest2 graphRequest2M2675l = GraphRequest2.m2675l(null, str, null);
        graphRequest2M2675l.f5384m = true;
        graphRequest2M2675l.f5380i = bundle;
        return graphRequest2M2675l.m2687d().f5408c;
    }

    /* JADX INFO: renamed from: b */
    public static FetchedAppSettings m2524b(String str) {
        if (str != null) {
            return f5019c.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m2525c() {
        d dVar = d.ERROR;
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        Context context = FacebookSdk.f5360i;
        Validate.m2479h();
        String str = FacebookSdk.f5354c;
        if (Utility.m2466y(str)) {
            f5020d.set(dVar);
            m2527e();
            return;
        }
        if (f5019c.containsKey(str)) {
            f5020d.set(d.SUCCESS);
            m2527e();
            return;
        }
        AtomicReference<d> atomicReference = f5020d;
        d dVar2 = d.NOT_LOADED;
        d dVar3 = d.LOADING;
        if (atomicReference.compareAndSet(dVar2, dVar3) || atomicReference.compareAndSet(dVar, dVar3)) {
            FacebookSdk.m2660b().execute(new a(context, String.format("com.facebook.internal.APP_SETTINGS.%s", str), str));
        } else {
            m2527e();
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    /* JADX WARN: Code duplicated, block: B:80:0x0177  */
    /* JADX INFO: renamed from: d */
    public static FetchedAppSettings m2526d(String str, JSONObject jSONObject) {
        FacebookRequestErrorClassification3 facebookRequestErrorClassification3;
        String strOptString;
        JSONArray jSONArrayOptJSONArray;
        String str2;
        JSONArray jSONArray;
        int[] iArr;
        FetchedAppSettings.a aVar;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("android_sdk_error_categories");
        String str3 = "name";
        Uri uri = null;
        char c2 = 0;
        if (jSONArrayOptJSONArray2 == null) {
            facebookRequestErrorClassification3 = FacebookRequestErrorClassification3.m2510a();
        } else {
            Map<Integer, Set<Integer>> mapM2511b = null;
            Map<Integer, Set<Integer>> mapM2511b2 = null;
            Map<Integer, Set<Integer>> mapM2511b3 = null;
            String strOptString2 = null;
            String strOptString3 = null;
            String strOptString4 = null;
            for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("name")) != null) {
                    if (strOptString.equalsIgnoreCase("other")) {
                        strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapM2511b = FacebookRequestErrorClassification3.m2511b(jSONObjectOptJSONObject);
                    } else if (strOptString.equalsIgnoreCase("transient")) {
                        strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapM2511b2 = FacebookRequestErrorClassification3.m2511b(jSONObjectOptJSONObject);
                    } else if (strOptString.equalsIgnoreCase("login_recoverable")) {
                        strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapM2511b3 = FacebookRequestErrorClassification3.m2511b(jSONObjectOptJSONObject);
                    }
                }
            }
            facebookRequestErrorClassification3 = new FacebookRequestErrorClassification3(mapM2511b, mapM2511b2, mapM2511b3, strOptString2, strOptString3, strOptString4);
        }
        FacebookRequestErrorClassification3 facebookRequestErrorClassification4 = facebookRequestErrorClassification3;
        int iOptInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        char c3 = 1;
        boolean z = (iOptInt & 8) != 0;
        boolean z2 = (iOptInt & 16) != 0;
        boolean z3 = (iOptInt & 32) != 0;
        boolean z4 = (iOptInt & 256) != 0;
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("auto_event_mapping_android");
        f5023g = jSONArrayOptJSONArray3;
        boolean zOptBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString5 = jSONObject.optString("gdpv4_nux_content", "");
        boolean zOptBoolean2 = jSONObject.optBoolean("gdpv4_nux_enabled", false);
        int iOptInt2 = jSONObject.optInt("app_events_session_timeout", 60);
        long jOptLong = jSONObject.optLong("seamless_login");
        SmartLoginOption smartLoginOption = SmartLoginOption.None;
        EnumSet enumSetNoneOf = EnumSet.noneOf(SmartLoginOption.class);
        for (SmartLoginOption smartLoginOption2 : SmartLoginOption.f4904i) {
            if ((smartLoginOption2.f4906k & jOptLong) != 0) {
                enumSetNoneOf.add(smartLoginOption2);
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("android_dialog_configs");
        HashMap map = new HashMap();
        if (jSONObjectOptJSONObject2 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("data")) != null) {
            int i2 = 0;
            while (i2 < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i2);
                String strOptString6 = jSONObjectOptJSONObject3.optString(str3);
                if (Utility.m2466y(strOptString6)) {
                    str2 = str3;
                    jSONArray = jSONArrayOptJSONArray;
                    aVar = null;
                } else {
                    String[] strArrSplit = strOptString6.split("\\|");
                    if (strArrSplit.length != 2) {
                        str2 = str3;
                        jSONArray = jSONArrayOptJSONArray;
                        aVar = null;
                    } else {
                        String str4 = strArrSplit[c2];
                        String str5 = strArrSplit[c3];
                        if (Utility.m2466y(str4) || Utility.m2466y(str5)) {
                            str2 = str3;
                            jSONArray = jSONArrayOptJSONArray;
                            aVar = null;
                        } else {
                            String strOptString7 = jSONObjectOptJSONObject3.optString("url");
                            Uri uri2 = !Utility.m2466y(strOptString7) ? Uri.parse(strOptString7) : uri;
                            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject3.optJSONArray("versions");
                            if (jSONArrayOptJSONArray4 != null) {
                                int length = jSONArrayOptJSONArray4.length();
                                iArr = new int[length];
                                int i3 = 0;
                                while (i3 < length) {
                                    String str6 = str3;
                                    int i4 = -1;
                                    JSONArray jSONArray2 = jSONArrayOptJSONArray;
                                    int iOptInt3 = jSONArrayOptJSONArray4.optInt(i3, -1);
                                    if (iOptInt3 == -1) {
                                        String strOptString8 = jSONArrayOptJSONArray4.optString(i3);
                                        if (Utility.m2466y(strOptString8)) {
                                            i4 = iOptInt3;
                                        } else {
                                            try {
                                                i4 = Integer.parseInt(strOptString8);
                                            } catch (NumberFormatException unused) {
                                                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                                            }
                                        }
                                    } else {
                                        i4 = iOptInt3;
                                    }
                                    iArr[i3] = i4;
                                    i3++;
                                    str3 = str6;
                                    jSONArrayOptJSONArray = jSONArray2;
                                }
                                str2 = str3;
                                jSONArray = jSONArrayOptJSONArray;
                            } else {
                                str2 = str3;
                                jSONArray = jSONArrayOptJSONArray;
                                iArr = null;
                            }
                            aVar = new FetchedAppSettings.a(str4, str5, uri2, iArr);
                        }
                    }
                }
                if (aVar != null) {
                    String str7 = aVar.f5014a;
                    Map map2 = (Map) map.get(str7);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(str7, map2);
                    }
                    map2.put(aVar.f5015b, aVar);
                }
                i2++;
                str3 = str2;
                jSONArrayOptJSONArray = jSONArray;
                uri = null;
                c2 = 0;
                c3 = 1;
            }
        }
        FetchedAppSettings fetchedAppSettings = new FetchedAppSettings(zOptBoolean, strOptString5, zOptBoolean2, iOptInt2, enumSetNoneOf, map, z, facebookRequestErrorClassification4, jSONObject.optString("smart_login_bookmark_icon_url"), jSONObject.optString("smart_login_menu_icon_url"), z2, z3, jSONArrayOptJSONArray3, jSONObject.optString("sdk_update_message"), z4, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"));
        f5019c.put(str, fetchedAppSettings);
        return fetchedAppSettings;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized void m2527e() {
        d dVar = f5020d.get();
        if (!d.NOT_LOADED.equals(dVar) && !d.LOADING.equals(dVar)) {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            FetchedAppSettings fetchedAppSettings = f5019c.get(FacebookSdk.f5354c);
            Handler handler = new Handler(Looper.getMainLooper());
            if (d.ERROR.equals(dVar)) {
                while (true) {
                    ConcurrentLinkedQueue<e> concurrentLinkedQueue = f5021e;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    } else {
                        handler.post(new b(concurrentLinkedQueue.poll()));
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<e> concurrentLinkedQueue2 = f5021e;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    } else {
                        handler.post(new c(concurrentLinkedQueue2.poll(), fetchedAppSettings));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static FetchedAppSettings m2528f(String str, boolean z) {
        if (!z) {
            Map<String, FetchedAppSettings> map = f5019c;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        JSONObject jSONObjectM2523a = m2523a(str);
        if (jSONObjectM2523a == null) {
            return null;
        }
        FetchedAppSettings fetchedAppSettingsM2526d = m2526d(str, jSONObjectM2523a);
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        if (str.equals(FacebookSdk.f5354c)) {
            f5020d.set(d.SUCCESS);
            m2527e();
        }
        return fetchedAppSettingsM2526d;
    }
}
