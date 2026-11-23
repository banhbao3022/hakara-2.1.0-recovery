package p007c.p165l.p166h0;

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import p007c.p165l.AccessToken;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.p171e0.ActivityLifecycleTracker;
import p007c.p165l.p178k0.FetchedAppGateKeepersManager;
import p007c.p165l.p178k0.FetchedAppSettingsManager;
import p007c.p165l.p178k0.Logger3;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.p, reason: use source file name */
/* JADX INFO: compiled from: AppEventsLoggerImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class AppEventsLoggerImpl3 {

    /* JADX INFO: renamed from: a */
    public static ScheduledThreadPoolExecutor f4842a;

    /* JADX INFO: renamed from: b */
    public static final Object f4843b = new Object();

    /* JADX INFO: renamed from: c */
    public static String f4844c;

    /* JADX INFO: renamed from: d */
    public static boolean f4845d;

    /* JADX INFO: renamed from: e */
    public final String f4846e;

    /* JADX INFO: renamed from: f */
    public final AccessTokenAppIdPair f4847f;

    /* JADX INFO: renamed from: c.l.h0.p$a */
    /* JADX INFO: compiled from: AppEventsLoggerImpl.java */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            HashSet hashSet = new HashSet();
            Iterator<AccessTokenAppIdPair> it = AppEventQueue.f4757b.m2310b().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().f4586g);
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                FetchedAppSettingsManager.m2528f((String) it2.next(), true);
            }
        }
    }

    public AppEventsLoggerImpl3(Context context, String str, AccessToken accessToken) {
        this(Utility.m2450i(context), str, accessToken);
    }

    /* JADX INFO: renamed from: a */
    public static int m2362a() {
        synchronized (f4843b) {
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public static void m2363b() {
        synchronized (f4843b) {
            if (f4842a != null) {
                return;
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            f4842a = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new a(), 0L, 86400L, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2364c(AppEvent appEvent, AccessTokenAppIdPair accessTokenAppIdPair) {
        AppEventQueue.f4758c.execute(new AppEventQueue4(accessTokenAppIdPair, appEvent));
        if (appEvent.f4694h || f4845d) {
            return;
        }
        if (appEvent.f4696j.equals("fb_mobile_activate_app")) {
            f4845d = true;
            return;
        }
        HashMap<String, String> map = Logger3.f5043a;
        synchronized (FacebookSdk.f5352a) {
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2365d(String str, Bundle bundle) {
        m2366e(str, null, bundle, false, ActivityLifecycleTracker.m2312b());
    }

    /* JADX INFO: renamed from: e */
    public void m2366e(String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        if (str == null || str.isEmpty()) {
            return;
        }
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        if (FetchedAppGateKeepersManager.m2519b("app_events_killswitch", FacebookSdk.f5354c, false)) {
            HashMap<String, String> map = Logger3.f5043a;
            synchronized (FacebookSdk.f5352a) {
            }
            return;
        }
        try {
            m2364c(new AppEvent(this.f4846e, str, d, bundle, z, ActivityLifecycleTracker.f4717j == 0, uuid), this.f4847f);
        } catch (FacebookException e) {
            e.toString();
            HashMap<String, String> map2 = Logger3.f5043a;
            synchronized (FacebookSdk.f5352a) {
            }
        } catch (JSONException e2) {
            e2.toString();
            HashMap<String, String> map3 = Logger3.f5043a;
            synchronized (FacebookSdk.f5352a) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m2367f(String str, Double d, Bundle bundle) {
        m2366e(str, d, bundle, true, ActivityLifecycleTracker.m2312b());
    }

    public AppEventsLoggerImpl3(String str, String str2, AccessToken accessToken) {
        Validate.m2479h();
        this.f4846e = str;
        accessToken = accessToken == null ? AccessToken.m2247b() : accessToken;
        if (accessToken != null && !accessToken.m2250d() && (str2 == null || str2.equals(accessToken.f4502q))) {
            this.f4847f = new AccessTokenAppIdPair(accessToken);
        } else {
            if (str2 == null) {
                Validate.m2479h();
                str2 = Utility.m2454m(FacebookSdk.f5360i);
            }
            this.f4847f = new AccessTokenAppIdPair(null, str2);
        }
        m2363b();
    }
}
