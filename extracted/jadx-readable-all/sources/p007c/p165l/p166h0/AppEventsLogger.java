package p007c.p165l.p166h0;

import android.content.Context;
import java.util.UUID;
import p007c.p165l.AccessToken;

/* JADX INFO: renamed from: c.l.h0.m, reason: use source file name */
/* JADX INFO: compiled from: AppEventsLogger.java */
/* JADX INFO: loaded from: classes.dex */
public class AppEventsLogger {

    /* JADX INFO: renamed from: a */
    public AppEventsLoggerImpl3 f4839a;

    public AppEventsLogger(Context context, String str, AccessToken accessToken) {
        this.f4839a = new AppEventsLoggerImpl3(context, (String) null, (AccessToken) null);
    }

    /* JADX INFO: renamed from: a */
    public static String m2360a(Context context) {
        if (AppEventsLoggerImpl3.f4844c == null) {
            synchronized (AppEventsLoggerImpl3.f4843b) {
                if (AppEventsLoggerImpl3.f4844c == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    AppEventsLoggerImpl3.f4844c = string;
                    if (string == null) {
                        AppEventsLoggerImpl3.f4844c = "XZ" + UUID.randomUUID().toString();
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", AppEventsLoggerImpl3.f4844c).apply();
                    }
                }
            }
        }
        return AppEventsLoggerImpl3.f4844c;
    }

    /* JADX INFO: renamed from: b */
    public static AppEventsLogger m2361b(Context context) {
        return new AppEventsLogger(context, null, null);
    }
}
