package p007c.p165l;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.p166h0.InternalAppEventsLogger;
import p007c.p165l.p178k0.AttributionIdentifiers;
import p007c.p165l.p178k0.FetchedAppSettings;
import p007c.p165l.p178k0.FetchedAppSettingsManager;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.g0, reason: use source file name */
/* JADX INFO: compiled from: UserSettingsManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class UserSettingsManager {

    /* JADX INFO: renamed from: a */
    public static final String f4572a = "c.l.g0";

    /* JADX INFO: renamed from: b */
    public static AtomicBoolean f4573b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static AtomicBoolean f4574c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static b f4575d = new b(true, "com.facebook.sdk.AutoInitEnabled");

    /* JADX INFO: renamed from: e */
    public static b f4576e = new b(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* JADX INFO: renamed from: f */
    public static b f4577f = new b(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* JADX INFO: renamed from: g */
    public static b f4578g = new b(false, "auto_event_setup_enabled");

    /* JADX INFO: renamed from: h */
    public static SharedPreferences f4579h;

    /* JADX INFO: renamed from: c.l.g0$a */
    /* JADX INFO: compiled from: UserSettingsManager.java */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ long f4580f;

        public a(long j2) {
            this.f4580f = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (UserSettingsManager.f4577f.m2275a()) {
                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                Validate.m2479h();
                FetchedAppSettings fetchedAppSettingsM2528f = FetchedAppSettingsManager.m2528f(FacebookSdk.f5354c, false);
                if (fetchedAppSettingsM2528f != null && fetchedAppSettingsM2528f.f5008h) {
                    Validate.m2479h();
                    AttributionIdentifiers attributionIdentifiersM2418c = AttributionIdentifiers.m2418c(FacebookSdk.f5360i);
                    if (((attributionIdentifiersM2418c == null || attributionIdentifiersM2418c.m2419b() == null) ? null : attributionIdentifiersM2418c.m2419b()) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("advertiser_id", attributionIdentifiersM2418c.m2419b());
                        bundle.putString("fields", "auto_event_setup_enabled");
                        Validate.m2479h();
                        GraphRequest2 graphRequest2M2675l = GraphRequest2.m2675l(null, FacebookSdk.f5354c, null);
                        graphRequest2M2675l.f5384m = true;
                        graphRequest2M2675l.f5380i = bundle;
                        JSONObject jSONObject = graphRequest2M2675l.m2687d().f5408c;
                        if (jSONObject != null) {
                            UserSettingsManager.f4578g.f4582b = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                            b bVar = UserSettingsManager.f4578g;
                            bVar.f4584d = this.f4580f;
                            UserSettingsManager.m2274g(bVar);
                        }
                    }
                }
            }
            UserSettingsManager.f4574c.set(false);
        }
    }

    /* JADX INFO: renamed from: c.l.g0$b */
    /* JADX INFO: compiled from: UserSettingsManager.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public String f4581a;

        /* JADX INFO: renamed from: b */
        public Boolean f4582b;

        /* JADX INFO: renamed from: c */
        public boolean f4583c;

        /* JADX INFO: renamed from: d */
        public long f4584d;

        public b(boolean z, String str) {
            this.f4583c = z;
            this.f4581a = str;
        }

        /* JADX INFO: renamed from: a */
        public boolean m2275a() {
            Boolean bool = this.f4582b;
            return bool == null ? this.f4583c : bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2268a() {
        m2272e(f4578g);
        long jCurrentTimeMillis = System.currentTimeMillis();
        b bVar = f4578g;
        if (bVar.f4582b == null || jCurrentTimeMillis - bVar.f4584d >= 604800000) {
            bVar.f4582b = null;
            bVar.f4584d = 0L;
            if (f4574c.compareAndSet(false, true)) {
                FacebookSdk.m2660b().execute(new a(jCurrentTimeMillis));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2269b() {
        Bundle bundle;
        Bundle bundle2;
        if (FacebookSdk.m2664f()) {
            if (f4573b.compareAndSet(false, true)) {
                Validate.m2479h();
                f4579h = FacebookSdk.f5360i.getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                b[] bVarArr = {f4576e, f4577f, f4575d};
                for (int i = 0; i < 3; i++) {
                    b bVar = bVarArr[i];
                    if (bVar == f4578g) {
                        m2268a();
                    } else if (bVar.f4582b == null) {
                        m2272e(bVar);
                        if (bVar.f4582b == null) {
                            m2273f();
                            try {
                                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                                Validate.m2479h();
                                Context context = FacebookSdk.f5360i;
                                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                                if (applicationInfo != null && (bundle2 = applicationInfo.metaData) != null && bundle2.containsKey(bVar.f4581a)) {
                                    bVar.f4582b = Boolean.valueOf(applicationInfo.metaData.getBoolean(bVar.f4581a, bVar.f4583c));
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                                HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
                            }
                        }
                    } else {
                        m2274g(bVar);
                    }
                }
                m2268a();
                try {
                    HashSet<LoggingBehavior> hashSet3 = FacebookSdk.f5352a;
                    Validate.m2479h();
                    Context context2 = FacebookSdk.f5360i;
                    ApplicationInfo applicationInfo2 = context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 128);
                    if (applicationInfo2 != null && (bundle = applicationInfo2.metaData) != null) {
                        if (!bundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                            Log.w(f4572a, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                        }
                        if (!applicationInfo2.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                            Log.w(f4572a, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                        }
                        m2269b();
                        if (!f4577f.m2275a()) {
                            Log.w(f4572a, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                m2271d();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2270c() {
        Bundle bundle;
        try {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            Context context = FacebookSdk.f5360i;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
            Bundle bundle2 = new Bundle();
            if (!Utility.m2462u()) {
                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w(f4572a, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            internalAppEventsLogger.m2369b("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2271d() {
        int i;
        if (f4573b.get() && FacebookSdk.m2664f()) {
            Validate.m2479h();
            Context context = FacebookSdk.f5360i;
            int i2 = 0;
            int i3 = ((f4575d.m2275a() ? 1 : 0) << 0) | 0 | ((f4576e.m2275a() ? 1 : 0) << 1) | ((f4577f.m2275a() ? 1 : 0) << 2);
            int i4 = f4579h.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
            if (i4 != i3) {
                f4579h.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i3).commit();
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    if (applicationInfo == null || applicationInfo.metaData == null) {
                        i = 0;
                    } else {
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled"};
                        boolean[] zArr = {true, true, true};
                        int i5 = 0;
                        i = 0;
                        for (int i6 = 0; i6 < 3; i6++) {
                            try {
                                i |= (applicationInfo.metaData.containsKey(strArr[i6]) ? 1 : 0) << i6;
                                i5 |= (applicationInfo.metaData.getBoolean(strArr[i6], zArr[i6]) ? 1 : 0) << i6;
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
                        i2 = i5;
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
                Bundle bundle = new Bundle();
                bundle.putInt("usage", i);
                bundle.putInt("initial", i2);
                bundle.putInt("previous", i4);
                bundle.putInt("current", i3);
                internalAppEventsLogger.m2370c("fb_sdk_settings_changed", bundle);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2272e(b bVar) {
        m2273f();
        try {
            String string = f4579h.getString(bVar.f4581a, "");
            if (string.isEmpty()) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            bVar.f4582b = Boolean.valueOf(jSONObject.getBoolean("value"));
            bVar.f4584d = jSONObject.getLong("last_timestamp");
        } catch (JSONException unused) {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2273f() {
        if (!f4573b.get()) {
            throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m2274g(b bVar) {
        m2273f();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", bVar.f4582b);
            jSONObject.put("last_timestamp", bVar.f4584d);
            f4579h.edit().putString(bVar.f4581a, jSONObject.toString()).commit();
            m2271d();
        } catch (Exception unused) {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        }
    }
}
