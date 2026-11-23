package p007c.p165l.p166h0.p171e0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.HashSet;
import java.util.UUID;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.e0.b, reason: use source file name */
/* JADX INFO: compiled from: ActivityLifecycleTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityLifecycleTracker2 implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        if (ActivityLifecycleTracker.f4713f == null) {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.f5360i);
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j3 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            SessionInfo sessionInfo = null;
            sessionInfo = null;
            sessionInfo = null;
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j2 != 0 && j3 != 0 && string != null) {
                SessionInfo sessionInfo2 = new SessionInfo(Long.valueOf(j2), Long.valueOf(j3));
                sessionInfo2.f4749c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                Validate.m2479h();
                SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.f5360i);
                sessionInfo2.f4751e = defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage") ? new SourceApplicationInfo(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false)) : null;
                sessionInfo2.f4750d = Long.valueOf(System.currentTimeMillis());
                sessionInfo2.f4752f = UUID.fromString(string);
                sessionInfo = sessionInfo2;
            }
            ActivityLifecycleTracker.f4713f = sessionInfo;
        }
    }
}
