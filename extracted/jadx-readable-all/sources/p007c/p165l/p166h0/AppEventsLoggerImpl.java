package p007c.p165l.p166h0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* JADX INFO: renamed from: c.l.h0.n, reason: use source file name */
/* JADX INFO: compiled from: AppEventsLoggerImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventsLoggerImpl implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Context f4840f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AppEventsLoggerImpl3 f4841g;

    public AppEventsLoggerImpl(Context context, AppEventsLoggerImpl3 appEventsLoggerImpl3) {
        this.f4840f = context;
        this.f4841g = appEventsLoggerImpl3;
    }

    @Override // java.lang.Runnable
    public void run() {
        Bundle bundle = new Bundle();
        String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
        String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            String str = strArr[i2];
            String str2 = strArr2[i2];
            try {
                Class.forName(str);
                bundle.putInt(str2, 1);
                i |= 1 << i2;
            } catch (ClassNotFoundException unused) {
            }
        }
        SharedPreferences sharedPreferences = this.f4840f.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
        if (sharedPreferences.getInt("kitsBitmask", 0) != i) {
            sharedPreferences.edit().putInt("kitsBitmask", i).apply();
            this.f4841g.m2367f("fb_sdk_initialize", null, bundle);
        }
    }
}
