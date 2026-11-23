package p007c.p165l.p166h0.p171e0;

import android.content.Context;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.HashSet;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.FetchedAppSettings;
import p007c.p165l.p178k0.FetchedAppSettingsManager;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.e0.c, reason: use source file name */
/* JADX INFO: compiled from: ActivityLifecycleTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityLifecycleTracker3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f4719f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f4720g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f4721h;

    public ActivityLifecycleTracker3(long j2, String str, Context context) {
        this.f4719f = j2;
        this.f4720g = str;
        this.f4721h = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (ActivityLifecycleTracker.f4713f == null) {
            ActivityLifecycleTracker.f4713f = new SessionInfo(Long.valueOf(this.f4719f), null);
            SessionLogger.m2327a(this.f4720g, null, ActivityLifecycleTracker.f4715h, this.f4721h);
        } else if (ActivityLifecycleTracker.f4713f.f4748b != null) {
            long jLongValue = this.f4719f - ActivityLifecycleTracker.f4713f.f4748b.longValue();
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            FetchedAppSettings fetchedAppSettingsM2524b = FetchedAppSettingsManager.m2524b(FacebookSdk.f5354c);
            if (jLongValue > (fetchedAppSettingsM2524b == null ? 60 : fetchedAppSettingsM2524b.f5002b) * CloseCodes.NORMAL_CLOSURE) {
                SessionLogger.m2328b(this.f4720g, ActivityLifecycleTracker.f4713f, ActivityLifecycleTracker.f4715h);
                SessionLogger.m2327a(this.f4720g, null, ActivityLifecycleTracker.f4715h, this.f4721h);
                ActivityLifecycleTracker.f4713f = new SessionInfo(Long.valueOf(this.f4719f), null);
            } else if (jLongValue > 1000) {
                ActivityLifecycleTracker.f4713f.f4749c++;
            }
        }
        ActivityLifecycleTracker.f4713f.f4748b = Long.valueOf(this.f4719f);
        ActivityLifecycleTracker.f4713f.m2326a();
    }
}
