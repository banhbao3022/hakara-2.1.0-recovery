package p007c.p165l;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import p007c.p165l.p166h0.AppEventsLogger;
import p007c.p165l.p166h0.p171e0.AppEventsLoggerUtility;
import p007c.p165l.p178k0.AttributionIdentifiers;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.o, reason: use source file name */
/* JADX INFO: compiled from: FacebookSdk.java */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookSdk2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Context f5368f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f5369g;

    public FacebookSdk2(Context context, String str) {
        this.f5368f = context;
        this.f5369g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context = this.f5368f;
        String str = this.f5369g;
        try {
            if (context == null || str == null) {
                throw new IllegalArgumentException("Both context and applicationId must be non-null");
            }
            AttributionIdentifiers attributionIdentifiersM2418c = AttributionIdentifiers.m2418c(context);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
            String str2 = str + "ping";
            long j2 = sharedPreferences.getLong(str2, 0L);
            try {
                AppEventsLoggerUtility.b bVar = AppEventsLoggerUtility.b.MOBILE_INSTALL_EVENT;
                String strM2360a = AppEventsLogger.m2360a(context);
                Validate.m2479h();
                GraphRequest2 graphRequest2M2676m = GraphRequest2.m2676m(null, String.format("%s/activities", str), AppEventsLoggerUtility.m2317a(bVar, attributionIdentifiersM2418c, strM2360a, context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false), context), null);
                if (j2 == 0 && graphRequest2M2676m.m2687d().f5409d == null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong(str2, System.currentTimeMillis());
                    editorEdit.apply();
                }
            } catch (JSONException e) {
                throw new FacebookException("An error occurred while publishing install.", e);
            }
        } catch (Exception unused) {
        }
    }
}
