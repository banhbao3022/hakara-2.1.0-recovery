package p007c.p165l.p166h0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p075b.p076a.InstallReferrerClientImpl;
import p007c.p071d.p075b.p076a.InstallReferrerClientImpl.b;
import p007c.p071d.p075b.p077b.InstallReferrerCommons;
import p007c.p165l.FacebookSdk;
import p007c.p165l.GraphRequest2;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.p170d0.EventDeactivationManager;
import p007c.p165l.p166h0.p171e0.AppEventsLoggerUtility;
import p007c.p165l.p178k0.FetchedAppSettings;
import p007c.p165l.p178k0.FetchedAppSettingsManager;
import p007c.p165l.p178k0.InstallReferrerUtil;
import p007c.p165l.p178k0.Logger3;
import p007c.p165l.p178k0.Validate;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p763u.p764a.LocalBroadcastManager;

/* JADX INFO: renamed from: c.l.h0.f, reason: use source file name */
/* JADX INFO: compiled from: AppEventQueue.java */
/* JADX INFO: loaded from: classes.dex */
public class AppEventQueue {

    /* JADX INFO: renamed from: a */
    public static final String f4756a = "c.l.h0.f";

    /* JADX INFO: renamed from: d */
    public static ScheduledFuture f4759d;

    /* JADX INFO: renamed from: b */
    public static volatile AppEventCollection f4757b = new AppEventCollection();

    /* JADX INFO: renamed from: c */
    public static final ScheduledExecutorService f4758c = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: e */
    public static final Runnable f4760e = new a();

    /* JADX INFO: renamed from: c.l.h0.f$a */
    /* JADX INFO: compiled from: AppEventQueue.java */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            AppEventQueue.f4759d = null;
            AppEventsLoggerImpl3.m2362a();
            AppEventQueue.m2329a(2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2329a(int i) {
        PersistedEvents persistedEventsM2358a = AppEventStore.m2358a();
        AppEventCollection appEventCollection = f4757b;
        synchronized (appEventCollection) {
            for (AccessTokenAppIdPair accessTokenAppIdPair : persistedEventsM2358a.f4856f.keySet()) {
                SessionEventsState sessionEventsStateM2309a = appEventCollection.m2309a(accessTokenAppIdPair);
                Iterator<AppEvent> it = persistedEventsM2358a.f4856f.get(accessTokenAppIdPair).iterator();
                while (it.hasNext()) {
                    sessionEventsStateM2309a.m2372a(it.next());
                }
            }
        }
        try {
            FlushStatistics flushStatisticsM2330b = m2330b(i, f4757b);
            if (flushStatisticsM2330b != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", flushStatisticsM2330b.f4853a);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", flushStatisticsM2330b.f4854b);
                Validate.m2479h();
                LocalBroadcastManager.m16762a(FacebookSdk.f5360i).m16764c(intent);
            }
        } catch (Exception e) {
            Log.w(f4756a, "Caught unexpected exception while flushing app events: ", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x014d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX INFO: renamed from: b */
    public static FlushStatistics m2330b(int i, AppEventCollection appEventCollection) {
        SessionEventsState sessionEventsState;
        ArrayList arrayList;
        Iterator<AccessTokenAppIdPair> it;
        JSONObject jSONObject;
        int length;
        GraphRequest2 graphRequest2;
        ServiceInfo serviceInfo;
        boolean z;
        FlushStatistics flushStatistics = new FlushStatistics();
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        Context context = FacebookSdk.f5360i;
        Validate.m2479h();
        ?? r4 = 0;
        boolean z2 = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
        ArrayList arrayList2 = new ArrayList();
        Iterator<AccessTokenAppIdPair> it2 = appEventCollection.m2310b().iterator();
        while (it2.hasNext()) {
            AccessTokenAppIdPair next = it2.next();
            synchronized (appEventCollection) {
                sessionEventsState = appEventCollection.f4707a.get(next);
            }
            String str = next.f4586g;
            FetchedAppSettings fetchedAppSettingsM2528f = FetchedAppSettingsManager.m2528f(str, r4);
            Object[] objArr = new Object[1];
            objArr[r4] = str;
            GraphRequest2 graphRequest2M2676m = GraphRequest2.m2676m(null, String.format("%s/activities", objArr), null, null);
            Bundle bundle = graphRequest2M2676m.f5380i;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("access_token", next.f4585f);
            synchronized (AppEventsLoggerImpl3.f4843b) {
            }
            AppEventsLoggerImpl2 appEventsLoggerImpl2 = new AppEventsLoggerImpl2();
            HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
            Validate.m2479h();
            if (FacebookSdk.f5360i.getSharedPreferences("com.facebook.sdk.appEventPreferences", r4).getBoolean("is_referrer_updated", r4)) {
                arrayList = arrayList2;
                it = it2;
            } else {
                Validate.m2479h();
                Context context2 = FacebookSdk.f5360i;
                if (context2 == null) {
                    throw new IllegalArgumentException("Please provide a valid Context.");
                }
                InstallReferrerClientImpl installReferrerClientImpl = new InstallReferrerClientImpl(context2);
                InstallReferrerUtil installReferrerUtil = new InstallReferrerUtil(installReferrerClientImpl, appEventsLoggerImpl2);
                if (installReferrerClientImpl.m1547b()) {
                    InstallReferrerCommons.m1548a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
                    installReferrerUtil.m2531a(r4);
                } else {
                    int i2 = installReferrerClientImpl.f2784a;
                    if (i2 == 1) {
                        InstallReferrerCommons.m1549b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
                        installReferrerUtil.m2531a(3);
                    } else if (i2 == 3) {
                        InstallReferrerCommons.m1549b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
                        installReferrerUtil.m2531a(3);
                    } else {
                        InstallReferrerCommons.m1548a("InstallReferrerClient", "Starting install referrer service setup.");
                        installReferrerClientImpl.f2787d = installReferrerClientImpl.new b(installReferrerUtil, null);
                        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                        it = it2;
                        arrayList = arrayList2;
                        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                        List<ResolveInfo> listQueryIntentServices = installReferrerClientImpl.f2785b.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
                            installReferrerClientImpl.f2784a = 0;
                            InstallReferrerCommons.m1548a("InstallReferrerClient", "Install Referrer service unavailable on device.");
                            installReferrerUtil.m2531a(2);
                        } else {
                            String str2 = serviceInfo.packageName;
                            String str3 = serviceInfo.name;
                            if (!"com.android.vending".equals(str2) || str3 == null) {
                                InstallReferrerCommons.m1549b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                                installReferrerClientImpl.f2784a = 0;
                                installReferrerUtil.m2531a(2);
                            } else {
                                try {
                                    z = installReferrerClientImpl.f2785b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
                                } catch (PackageManager.NameNotFoundException unused) {
                                }
                                if (!z) {
                                    InstallReferrerCommons.m1549b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                                    installReferrerClientImpl.f2784a = 0;
                                    installReferrerUtil.m2531a(2);
                                } else if (installReferrerClientImpl.f2785b.bindService(new Intent(intent), installReferrerClientImpl.f2787d, 1)) {
                                    InstallReferrerCommons.m1548a("InstallReferrerClient", "Service was bonded successfully.");
                                } else {
                                    InstallReferrerCommons.m1549b("InstallReferrerClient", "Connection to service is blocked.");
                                    installReferrerClientImpl.f2784a = 0;
                                    installReferrerUtil.m2531a(1);
                                }
                            }
                        }
                    }
                }
                arrayList = arrayList2;
                it = it2;
            }
            Validate.m2479h();
            r4 = 0;
            String string = FacebookSdk.f5360i.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
            if (string != null) {
                bundle.putString("install_referrer", string);
            }
            graphRequest2M2676m.f5380i = bundle;
            boolean z3 = fetchedAppSettingsM2528f != null ? fetchedAppSettingsM2528f.f5001a : false;
            Validate.m2479h();
            Context context3 = FacebookSdk.f5360i;
            synchronized (sessionEventsState) {
                int i3 = sessionEventsState.f4860c;
                List<AppEvent> list = sessionEventsState.f4859b;
                if (EventDeactivationManager.f4702a) {
                    Iterator<AppEvent> it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (EventDeactivationManager.f4704c.contains(it3.next().f4696j)) {
                            it3.remove();
                        }
                    }
                }
                sessionEventsState.f4859b.addAll(sessionEventsState.f4858a);
                sessionEventsState.f4858a.clear();
                JSONArray jSONArray = new JSONArray();
                for (AppEvent appEvent : sessionEventsState.f4859b) {
                    if (!(appEvent.f4697k == null ? true : AppEvent.m2307a(appEvent.f4693g.toString()).equals(appEvent.f4697k))) {
                        appEvent.toString();
                        HashSet<LoggingBehavior> hashSet3 = FacebookSdk.f5352a;
                    } else if (z3 || !appEvent.f4694h) {
                        jSONArray.put(appEvent.f4693g);
                    }
                }
                if (jSONArray.length() == 0) {
                    length = 0;
                } else {
                    try {
                        jSONObject = AppEventsLoggerUtility.m2317a(AppEventsLoggerUtility.b.CUSTOM_APP_EVENTS, sessionEventsState.f4861d, sessionEventsState.f4862e, z2, context3);
                        if (sessionEventsState.f4860c > 0) {
                            jSONObject.put("num_skipped_events", i3);
                        }
                    } catch (JSONException unused2) {
                        jSONObject = new JSONObject();
                    }
                    graphRequest2M2676m.f5378g = jSONObject;
                    Bundle bundle2 = graphRequest2M2676m.f5380i;
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                    }
                    String string2 = jSONArray.toString();
                    if (string2 != null) {
                        bundle2.putString("custom_events", string2);
                        graphRequest2M2676m.f5382k = string2;
                    }
                    graphRequest2M2676m.f5380i = bundle2;
                    length = jSONArray.length();
                }
            }
            if (length == 0) {
                graphRequest2 = null;
            } else {
                flushStatistics.f4853a += length;
                graphRequest2M2676m.m2691u(new AppEventQueue5(next, graphRequest2M2676m, sessionEventsState, flushStatistics));
                graphRequest2 = graphRequest2M2676m;
            }
            arrayList2 = arrayList;
            if (graphRequest2 != null) {
                arrayList2.add(graphRequest2);
            }
            it2 = it;
        }
        if (arrayList2.size() <= 0) {
            return null;
        }
        C7804v0.m15322k(i);
        HashMap<String, String> map = Logger3.f5043a;
        synchronized (FacebookSdk.f5352a) {
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            ((GraphRequest2) it4.next()).m2687d();
        }
        return flushStatistics;
    }
}
