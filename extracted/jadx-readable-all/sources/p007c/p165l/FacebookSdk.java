package p007c.p165l;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.p166h0.AppEventQueue;
import p007c.p165l.p166h0.AppEventQueue3;
import p007c.p165l.p166h0.AppEventsLogger;
import p007c.p165l.p166h0.AppEventsLoggerImpl;
import p007c.p165l.p166h0.AppEventsLoggerImpl3;
import p007c.p165l.p166h0.AppEventsManager;
import p007c.p165l.p166h0.AppEventsManager2;
import p007c.p165l.p166h0.AppEventsManager3;
import p007c.p165l.p166h0.AppEventsManager4;
import p007c.p165l.p166h0.p171e0.ActivityLifecycleTracker;
import p007c.p165l.p178k0.BoltsMeasurementEventListener;
import p007c.p165l.p178k0.FeatureManager;
import p007c.p165l.p178k0.FetchedAppSettingsManager;
import p007c.p165l.p178k0.LockOnGetVariable;
import p007c.p165l.p178k0.NativeProtocol;
import p007c.p165l.p178k0.ServerProtocol;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;
import p007c.p165l.p178k0.p179k0.InstrumentManager;
import p007c.p165l.p178k0.p179k0.InstrumentManager2;
import p636z0.p763u.p764a.LocalBroadcastManager;

/* JADX INFO: renamed from: c.l.n, reason: use source file name */
/* JADX INFO: compiled from: FacebookSdk.java */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookSdk {

    /* JADX INFO: renamed from: b */
    public static Executor f5353b;

    /* JADX INFO: renamed from: c */
    public static volatile String f5354c;

    /* JADX INFO: renamed from: d */
    public static volatile String f5355d;

    /* JADX INFO: renamed from: e */
    public static volatile String f5356e;

    /* JADX INFO: renamed from: f */
    public static volatile Boolean f5357f;

    /* JADX INFO: renamed from: i */
    public static Context f5360i;

    /* JADX INFO: renamed from: l */
    public static String f5363l;

    /* JADX INFO: renamed from: m */
    public static Boolean f5364m;

    /* JADX INFO: renamed from: n */
    public static Boolean f5365n;

    /* JADX INFO: renamed from: a */
    public static final HashSet<LoggingBehavior> f5352a = new HashSet<>(Arrays.asList(LoggingBehavior.DEVELOPER_ERRORS));

    /* JADX INFO: renamed from: g */
    public static volatile String f5358g = "facebook.com";

    /* JADX INFO: renamed from: h */
    public static AtomicLong f5359h = new AtomicLong(65536);

    /* JADX INFO: renamed from: j */
    public static int f5361j = 64206;

    /* JADX INFO: renamed from: k */
    public static final Object f5362k = new Object();

    /* JADX INFO: renamed from: c.l.n$a */
    /* JADX INFO: compiled from: FacebookSdk.java */
    public static class a implements Callable<File> {
        @Override // java.util.concurrent.Callable
        public File call() throws Exception {
            return FacebookSdk.f5360i.getCacheDir();
        }
    }

    /* JADX INFO: renamed from: c.l.n$b */
    /* JADX INFO: compiled from: FacebookSdk.java */
    public static class b implements FeatureManager.b {
        @Override // p007c.p165l.p178k0.FeatureManager.b
        /* JADX INFO: renamed from: a */
        public void mo2314a(boolean z) {
            if (z && FacebookSdk.m2659a()) {
                FeatureManager.m2514a(12, new InstrumentManager());
                FeatureManager.m2514a(13, new InstrumentManager2());
            }
        }
    }

    /* JADX INFO: renamed from: c.l.n$c */
    /* JADX INFO: compiled from: FacebookSdk.java */
    public static class c implements FeatureManager.b {
        @Override // p007c.p165l.p178k0.FeatureManager.b
        /* JADX INFO: renamed from: a */
        public void mo2314a(boolean z) {
            if (z && FacebookSdk.m2659a()) {
                FeatureManager.m2514a(6, new AppEventsManager());
                FeatureManager.m2514a(5, new AppEventsManager2());
                FeatureManager.m2514a(7, new AppEventsManager3());
                FeatureManager.m2514a(10, new AppEventsManager4());
            }
        }
    }

    /* JADX INFO: renamed from: c.l.n$d */
    /* JADX INFO: compiled from: FacebookSdk.java */
    public static class d implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e f5366a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f5367b;

        public d(e eVar, Context context) {
            this.f5366a = eVar;
            this.f5367b = context;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0029  */
        /* JADX WARN: Code duplicated, block: B:17:0x0047  */
        /* JADX WARN: Code duplicated, block: B:19:0x004a  */
        /* JADX WARN: Code duplicated, block: B:22:0x0053  */
        /* JADX WARN: Code duplicated, block: B:24:0x005d  */
        /* JADX WARN: Code duplicated, block: B:27:0x0064  */
        /* JADX WARN: Code duplicated, block: B:31:0x0074  */
        /* JADX WARN: Code duplicated, block: B:38:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            AccessToken accessTokenM2246a;
            ProfileManager profileManagerM2255a;
            String string;
            Profile profile;
            e eVar;
            Context context;
            String str;
            AccessTokenManager2 accessTokenManager2M2259a = AccessTokenManager2.m2259a();
            AccessTokenCache accessTokenCache = accessTokenManager2M2259a.f4522c;
            if (accessTokenCache.f4507a.contains("com.facebook.AccessTokenManager.CachedAccessToken")) {
                String string2 = accessTokenCache.f4507a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
                if (string2 != null) {
                    try {
                        accessTokenM2246a = AccessToken.m2246a(new JSONObject(string2));
                    } catch (JSONException unused) {
                        accessTokenM2246a = null;
                    }
                }
                if (accessTokenM2246a != null) {
                    accessTokenManager2M2259a.m2262d(accessTokenM2246a, false);
                }
                profileManagerM2255a = ProfileManager.m2255a();
                string = profileManagerM2255a.f4511c.f4506a.getString("com.facebook.ProfileManager.CachedProfile", null);
                if (string != null) {
                    try {
                        profile = new Profile(new JSONObject(string));
                    } catch (JSONException unused2) {
                        profile = null;
                    }
                } else {
                    profile = null;
                }
                if (profile != null) {
                    profileManagerM2255a.m2256b(profile, false);
                }
                if (AccessToken.m2248c()) {
                    String str2 = Profile.f5423f;
                    if (ProfileManager.m2255a().f4512d == null) {
                        Profile.m2707a();
                    }
                }
                eVar = this.f5366a;
                if (eVar != null) {
                    eVar.m2669a();
                }
                context = FacebookSdk.f5360i;
                str = FacebookSdk.f5354c;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = AppEventsLoggerImpl3.f4842a;
                if (FacebookSdk.m2659a()) {
                    AppEventsLoggerImpl3.f4842a.execute(new AppEventsLoggerImpl(context, new AppEventsLoggerImpl3(context, str, (AccessToken) null)));
                }
                Objects.requireNonNull(AppEventsLogger.m2361b(this.f5367b.getApplicationContext()).f4839a);
                AppEventQueue.f4758c.execute(new AppEventQueue3(1));
                return null;
            }
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            accessTokenM2246a = null;
            if (accessTokenM2246a != null) {
                accessTokenManager2M2259a.m2262d(accessTokenM2246a, false);
            }
            profileManagerM2255a = ProfileManager.m2255a();
            string = profileManagerM2255a.f4511c.f4506a.getString("com.facebook.ProfileManager.CachedProfile", null);
            if (string != null) {
                profile = new Profile(new JSONObject(string));
            } else {
                profile = null;
            }
            if (profile != null) {
                profileManagerM2255a.m2256b(profile, false);
            }
            if (AccessToken.m2248c()) {
                String str3 = Profile.f5423f;
                if (ProfileManager.m2255a().f4512d == null) {
                    Profile.m2707a();
                }
            }
            eVar = this.f5366a;
            if (eVar != null) {
                eVar.m2669a();
            }
            context = FacebookSdk.f5360i;
            str = FacebookSdk.f5354c;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = AppEventsLoggerImpl3.f4842a;
            if (FacebookSdk.m2659a()) {
                AppEventsLoggerImpl3.f4842a.execute(new AppEventsLoggerImpl(context, new AppEventsLoggerImpl3(context, str, (AccessToken) null)));
            }
            Objects.requireNonNull(AppEventsLogger.m2361b(this.f5367b.getApplicationContext()).f4839a);
            AppEventQueue.f4758c.execute(new AppEventQueue3(1));
            return null;
        }
    }

    /* JADX INFO: renamed from: c.l.n$e */
    /* JADX INFO: compiled from: FacebookSdk.java */
    public interface e {
        /* JADX INFO: renamed from: a */
        void m2669a();
    }

    static {
        Collection<String> collection = ServerProtocol.f4898a;
        f5363l = "v5.0";
        Boolean bool = Boolean.FALSE;
        f5364m = bool;
        f5365n = bool;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2659a() {
        UserSettingsManager.m2269b();
        return UserSettingsManager.f4576e.m2275a();
    }

    /* JADX INFO: renamed from: b */
    public static Executor m2660b() {
        synchronized (f5362k) {
            if (f5353b == null) {
                f5353b = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f5353b;
    }

    /* JADX INFO: renamed from: c */
    public static String m2661c() {
        AccessToken accessTokenM2247b = AccessToken.m2247b();
        String str = accessTokenM2247b != null ? accessTokenM2247b.f4505t : null;
        if (str == null) {
            return f5358g;
        }
        return str.equals("gaming") ? f5358g.replace("facebook.com", "fb.gg") : f5358g;
    }

    /* JADX INFO: renamed from: d */
    public static String m2662d() {
        String.format("getGraphApiVersion: %s", f5363l);
        return f5363l;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized boolean m2663e() {
        return f5365n.booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public static synchronized boolean m2664f() {
        return f5364m.booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2665g(LoggingBehavior loggingBehavior) {
        synchronized (f5352a) {
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static void m2666h(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return;
            }
            if (f5354c == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                        f5354c = str.substring(2);
                    } else {
                        f5354c = str;
                    }
                } else if (obj instanceof Integer) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f5355d == null) {
                f5355d = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f5356e == null) {
                f5356e = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f5361j == 64206) {
                f5361j = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f5357f == null) {
                f5357f = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static synchronized void m2667i(Context context) {
        m2668j(context, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public static synchronized void m2668j(Context context, e eVar) {
        if (f5364m.booleanValue()) {
            return;
        }
        Validate.m2477f(context, "applicationContext");
        Validate.m2474c(context, false);
        Validate.m2475d(context, false);
        f5360i = context.getApplicationContext();
        AppEventsLogger.m2360a(context);
        m2666h(f5360i);
        if (Utility.m2466y(f5354c)) {
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        Boolean bool = Boolean.TRUE;
        f5364m = bool;
        UserSettingsManager.m2269b();
        if (UserSettingsManager.f4575d.m2275a()) {
            f5365n = bool;
        }
        if (f5360i instanceof Application) {
            UserSettingsManager.m2269b();
            if (UserSettingsManager.f4576e.m2275a()) {
                ActivityLifecycleTracker.m2313c((Application) f5360i, f5354c);
            }
        }
        FetchedAppSettingsManager.m2525c();
        NativeProtocol.m2549m();
        UserSettingsManager.m2270c();
        Context context2 = f5360i;
        if (BoltsMeasurementEventListener.f4896a == null) {
            BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context2);
            BoltsMeasurementEventListener.f4896a = boltsMeasurementEventListener;
            LocalBroadcastManager.m16762a(boltsMeasurementEventListener.f4897b).m16763b(boltsMeasurementEventListener, new IntentFilter("com.parse.bolts.measurement_event"));
            BoltsMeasurementEventListener boltsMeasurementEventListener2 = BoltsMeasurementEventListener.f4896a;
        }
        new LockOnGetVariable((Callable) new a());
        FeatureManager.m2514a(11, new b());
        FeatureManager.m2514a(3, new c());
        m2660b().execute(new FutureTask(new d(null, context)));
    }
}
