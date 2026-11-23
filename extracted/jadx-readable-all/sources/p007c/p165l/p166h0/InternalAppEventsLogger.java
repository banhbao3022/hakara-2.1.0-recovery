package p007c.p165l.p166h0;

import android.content.Context;
import android.os.Bundle;
import java.util.Objects;
import p007c.p165l.AccessToken;
import p007c.p165l.FacebookSdk;
import p007c.p165l.p166h0.p171e0.ActivityLifecycleTracker;

/* JADX INFO: renamed from: c.l.h0.w, reason: use source file name */
/* JADX INFO: compiled from: InternalAppEventsLogger.java */
/* JADX INFO: loaded from: classes.dex */
public class InternalAppEventsLogger {

    /* JADX INFO: renamed from: a */
    public AppEventsLoggerImpl3 f4855a;

    public InternalAppEventsLogger(Context context) {
        this.f4855a = new AppEventsLoggerImpl3(context, (String) null, (AccessToken) null);
    }

    /* JADX INFO: renamed from: a */
    public void m2368a(String str, double d, Bundle bundle) {
        if (FacebookSdk.m2659a()) {
            AppEventsLoggerImpl3 appEventsLoggerImpl3 = this.f4855a;
            Objects.requireNonNull(appEventsLoggerImpl3);
            appEventsLoggerImpl3.m2366e(str, Double.valueOf(d), bundle, false, ActivityLifecycleTracker.m2312b());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2369b(String str, Bundle bundle) {
        if (FacebookSdk.m2659a()) {
            this.f4855a.m2365d(str, bundle);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2370c(String str, Bundle bundle) {
        if (FacebookSdk.m2659a()) {
            this.f4855a.m2367f(str, null, bundle);
        }
    }

    public InternalAppEventsLogger(Context context, String str) {
        this.f4855a = new AppEventsLoggerImpl3(context, str, (AccessToken) null);
    }

    public InternalAppEventsLogger(String str, String str2, AccessToken accessToken) {
        this.f4855a = new AppEventsLoggerImpl3(str, str2, accessToken);
    }
}
