package p007c.p165l.p166h0.p171e0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.AppEventQueue;
import p007c.p165l.p166h0.AppEventQueue2;
import p007c.p165l.p166h0.AppEventsLoggerImpl3;
import p007c.p165l.p166h0.p167b0.MetadataIndexer2;
import p007c.p165l.p166h0.p167b0.MetadataRule;
import p007c.p165l.p166h0.p167b0.MetadataViewObserver;
import p007c.p165l.p166h0.p168c0.CodelessManager;
import p007c.p165l.p166h0.p168c0.CodelessManager3;
import p007c.p165l.p166h0.p168c0.CodelessMatcher;
import p007c.p165l.p166h0.p168c0.CodelessMatcher2;
import p007c.p165l.p166h0.p168c0.ViewIndexer;
import p007c.p165l.p166h0.p168c0.ViewIndexer2;
import p007c.p165l.p166h0.p168c0.ViewIndexer5;
import p007c.p165l.p166h0.p168c0.ViewIndexingTrigger;
import p007c.p165l.p166h0.p174h0.SuggestedEventsManager;
import p007c.p165l.p178k0.FeatureManager;
import p007c.p165l.p178k0.FetchedAppSettings;
import p007c.p165l.p178k0.FetchedAppSettingsManager;
import p007c.p165l.p178k0.Logger3;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.e0.a, reason: use source file name */
/* JADX INFO: compiled from: ActivityLifecycleTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class ActivityLifecycleTracker {

    /* JADX INFO: renamed from: a */
    public static final String f4708a = "c.l.h0.e0.a";

    /* JADX INFO: renamed from: c */
    public static volatile ScheduledFuture f4710c;

    /* JADX INFO: renamed from: f */
    public static volatile SessionInfo f4713f;

    /* JADX INFO: renamed from: h */
    public static String f4715h;

    /* JADX INFO: renamed from: i */
    public static long f4716i;

    /* JADX INFO: renamed from: k */
    public static WeakReference<Activity> f4718k;

    /* JADX INFO: renamed from: b */
    public static final ScheduledExecutorService f4709b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: d */
    public static final Object f4711d = new Object();

    /* JADX INFO: renamed from: e */
    public static AtomicInteger f4712e = new AtomicInteger(0);

    /* JADX INFO: renamed from: g */
    public static AtomicBoolean f4714g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j */
    public static int f4717j = 0;

    /* JADX INFO: renamed from: c.l.h0.e0.a$a */
    /* JADX INFO: compiled from: ActivityLifecycleTracker.java */
    public static class a implements FeatureManager.b {
        @Override // p007c.p165l.p178k0.FeatureManager.b
        /* JADX INFO: renamed from: a */
        public void mo2314a(boolean z) {
            if (z) {
                CodelessManager3.f4629e.set(true);
            } else {
                CodelessManager3.f4629e.set(false);
            }
        }
    }

    /* JADX INFO: renamed from: c.l.h0.e0.a$b */
    /* JADX INFO: compiled from: ActivityLifecycleTracker.java */
    public static class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            String str = ActivityLifecycleTracker.f4708a;
            HashMap<String, String> map = Logger3.f5043a;
            synchronized (FacebookSdk.f5352a) {
            }
            ActivityLifecycleTracker.f4709b.execute(new ActivityLifecycleTracker2());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            String str = ActivityLifecycleTracker.f4708a;
            HashMap<String, String> map = Logger3.f5043a;
            synchronized (FacebookSdk.f5352a) {
            }
            ViewIndexingTrigger viewIndexingTrigger = CodelessManager3.f4625a;
            CodelessMatcher2.m2288a().f4639g.remove(Integer.valueOf(activity.hashCode()));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Timer timer;
            String str = ActivityLifecycleTracker.f4708a;
            HashMap<String, String> map = Logger3.f5043a;
            synchronized (FacebookSdk.f5352a) {
            }
            if (ActivityLifecycleTracker.f4712e.decrementAndGet() < 0) {
                ActivityLifecycleTracker.f4712e.set(0);
                Log.w(str, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
            }
            ActivityLifecycleTracker.m2311a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strM2450i = Utility.m2450i(activity);
            if (CodelessManager3.f4629e.get()) {
                CodelessMatcher2 codelessMatcher2M2288a = CodelessMatcher2.m2288a();
                Objects.requireNonNull(codelessMatcher2M2288a);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
                }
                codelessMatcher2M2288a.f4636d.remove(activity);
                codelessMatcher2M2288a.f4637e.clear();
                codelessMatcher2M2288a.f4639g.put(Integer.valueOf(activity.hashCode()), (HashSet) codelessMatcher2M2288a.f4638f.clone());
                codelessMatcher2M2288a.f4638f.clear();
                ViewIndexer5 viewIndexer5 = CodelessManager3.f4627c;
                if (viewIndexer5 != null && viewIndexer5.f4661c.get() != null && (timer = viewIndexer5.f4662d) != null) {
                    try {
                        timer.cancel();
                        viewIndexer5.f4662d = null;
                    } catch (Exception e) {
                        Log.e(ViewIndexer5.f4659a, "Error unscheduling indexing job", e);
                    }
                }
                SensorManager sensorManager = CodelessManager3.f4626b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(CodelessManager3.f4625a);
                }
            }
            ActivityLifecycleTracker.f4709b.execute(new ActivityLifecycleTracker4(jCurrentTimeMillis, strM2450i));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            String str = ActivityLifecycleTracker.f4708a;
            HashMap<String, String> map = Logger3.f5043a;
            synchronized (FacebookSdk.f5352a) {
            }
            ActivityLifecycleTracker.f4718k = new WeakReference<>(activity);
            ActivityLifecycleTracker.f4712e.incrementAndGet();
            ActivityLifecycleTracker.m2311a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            ActivityLifecycleTracker.f4716i = jCurrentTimeMillis;
            String strM2450i = Utility.m2450i(activity);
            if (CodelessManager3.f4629e.get()) {
                CodelessMatcher2 codelessMatcher2M2288a = CodelessMatcher2.m2288a();
                Objects.requireNonNull(codelessMatcher2M2288a);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
                }
                codelessMatcher2M2288a.f4636d.add(activity);
                codelessMatcher2M2288a.f4638f.clear();
                if (codelessMatcher2M2288a.f4639g.containsKey(Integer.valueOf(activity.hashCode()))) {
                    codelessMatcher2M2288a.f4638f = codelessMatcher2M2288a.f4639g.get(Integer.valueOf(activity.hashCode()));
                }
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    codelessMatcher2M2288a.m2290c();
                } else {
                    codelessMatcher2M2288a.f4635c.post(new CodelessMatcher(codelessMatcher2M2288a));
                }
                Context applicationContext = activity.getApplicationContext();
                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                Validate.m2479h();
                String str2 = FacebookSdk.f5354c;
                FetchedAppSettings fetchedAppSettingsM2524b = FetchedAppSettingsManager.m2524b(str2);
                if (fetchedAppSettingsM2524b != null && fetchedAppSettingsM2524b.f5008h) {
                    SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                    CodelessManager3.f4626b = sensorManager;
                    if (sensorManager != null) {
                        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                        CodelessManager3.f4627c = new ViewIndexer5(activity);
                        ViewIndexingTrigger viewIndexingTrigger = CodelessManager3.f4625a;
                        viewIndexingTrigger.f4665a = new CodelessManager(fetchedAppSettingsM2524b, str2);
                        CodelessManager3.f4626b.registerListener(viewIndexingTrigger, defaultSensor, 2);
                        if (fetchedAppSettingsM2524b.f5008h) {
                            ViewIndexer5 viewIndexer5 = CodelessManager3.f4627c;
                            Objects.requireNonNull(viewIndexer5);
                            FacebookSdk.m2660b().execute(new ViewIndexer2(viewIndexer5, new ViewIndexer(viewIndexer5)));
                        }
                    }
                }
            }
            AtomicBoolean atomicBoolean = MetadataIndexer2.f4594a;
            try {
                if (MetadataIndexer2.f4594a.get()) {
                    List<MetadataRule> list = MetadataRule.f4595a;
                    if (!new ArrayList(MetadataRule.f4595a).isEmpty()) {
                        MetadataViewObserver.m2284b(activity);
                    }
                }
            } catch (Exception unused) {
            }
            SuggestedEventsManager.m2351b(activity);
            ActivityLifecycleTracker.f4709b.execute(new ActivityLifecycleTracker3(jCurrentTimeMillis, strM2450i, activity.getApplicationContext()));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            String str = ActivityLifecycleTracker.f4708a;
            HashMap<String, String> map = Logger3.f5043a;
            synchronized (FacebookSdk.f5352a) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            ActivityLifecycleTracker.f4717j++;
            String str = ActivityLifecycleTracker.f4708a;
            HashMap<String, String> map = Logger3.f5043a;
            synchronized (FacebookSdk.f5352a) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            String str = ActivityLifecycleTracker.f4708a;
            HashMap<String, String> map = Logger3.f5043a;
            synchronized (FacebookSdk.f5352a) {
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = AppEventsLoggerImpl3.f4842a;
            AppEventQueue.f4758c.execute(new AppEventQueue2());
            ActivityLifecycleTracker.f4717j--;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2311a() {
        synchronized (f4711d) {
            if (f4710c != null) {
                f4710c.cancel(false);
            }
            f4710c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static UUID m2312b() {
        if (f4713f != null) {
            return f4713f.f4752f;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m2313c(Application application, String str) {
        if (f4714g.compareAndSet(false, true)) {
            FeatureManager.m2514a(4, new a());
            f4715h = str;
            application.registerActivityLifecycleCallbacks(new b());
        }
    }
}
