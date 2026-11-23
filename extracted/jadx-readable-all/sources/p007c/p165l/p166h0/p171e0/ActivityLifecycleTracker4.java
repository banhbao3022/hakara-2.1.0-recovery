package p007c.p165l.p166h0.p171e0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.InternalAppEventsLogger;
import p007c.p165l.p178k0.FetchedAppSettings;
import p007c.p165l.p178k0.FetchedAppSettingsManager;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.e0.d, reason: use source file name */
/* JADX INFO: compiled from: ActivityLifecycleTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityLifecycleTracker4 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f4722f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f4723g;

    /* JADX INFO: renamed from: c.l.h0.e0.d$a */
    /* JADX INFO: compiled from: ActivityLifecycleTracker.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActivityLifecycleTracker.f4712e.get() <= 0) {
                SessionLogger.m2328b(ActivityLifecycleTracker4.this.f4723g, ActivityLifecycleTracker.f4713f, ActivityLifecycleTracker.f4715h);
                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                Validate.m2479h();
                SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.f5360i).edit();
                editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
                editorEdit.apply();
                Validate.m2479h();
                SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.f5360i).edit();
                editorEdit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                editorEdit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                editorEdit2.apply();
                ActivityLifecycleTracker.f4713f = null;
            }
            synchronized (ActivityLifecycleTracker.f4711d) {
                ActivityLifecycleTracker.f4710c = null;
            }
        }
    }

    public ActivityLifecycleTracker4(long j2, String str) {
        this.f4722f = j2;
        this.f4723g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (ActivityLifecycleTracker.f4713f == null) {
            ActivityLifecycleTracker.f4713f = new SessionInfo(Long.valueOf(this.f4722f), null);
        }
        ActivityLifecycleTracker.f4713f.f4748b = Long.valueOf(this.f4722f);
        if (ActivityLifecycleTracker.f4712e.get() <= 0) {
            a aVar = new a();
            synchronized (ActivityLifecycleTracker.f4711d) {
                ScheduledExecutorService scheduledExecutorService = ActivityLifecycleTracker.f4709b;
                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                Validate.m2479h();
                FetchedAppSettings fetchedAppSettingsM2524b = FetchedAppSettingsManager.m2524b(FacebookSdk.f5354c);
                ActivityLifecycleTracker.f4710c = scheduledExecutorService.schedule(aVar, fetchedAppSettingsM2524b == null ? 60 : fetchedAppSettingsM2524b.f5002b, TimeUnit.SECONDS);
            }
        }
        long j2 = ActivityLifecycleTracker.f4716i;
        long j3 = j2 > 0 ? (this.f4722f - j2) / 1000 : 0L;
        String str = this.f4723g;
        String str2 = AutomaticAnalyticsLogger.f4729a;
        HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
        Validate.m2479h();
        Context context = FacebookSdk.f5360i;
        Validate.m2479h();
        String str3 = FacebookSdk.f5354c;
        Validate.m2477f(context, "context");
        FetchedAppSettings fetchedAppSettingsM2528f = FetchedAppSettingsManager.m2528f(str3, false);
        if (fetchedAppSettingsM2528f != null && fetchedAppSettingsM2528f.f5005e && j3 > 0) {
            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            internalAppEventsLogger.m2368a("fb_aa_time_spent_on_view", j3, bundle);
        }
        ActivityLifecycleTracker.f4713f.m2326a();
    }
}
