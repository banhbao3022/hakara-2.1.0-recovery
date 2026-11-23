package p007c.p165l.p182l0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import p007c.p165l.p166h0.InternalAppEventsLogger;

/* JADX INFO: renamed from: c.l.l0.p, reason: use source file name */
/* JADX INFO: compiled from: LoginLogger.java */
/* JADX INFO: loaded from: classes.dex */
public class LoginLogger {

    /* JADX INFO: renamed from: a */
    public final InternalAppEventsLogger f5152a;

    /* JADX INFO: renamed from: b */
    public String f5153b;

    /* JADX INFO: renamed from: c */
    public String f5154c;

    public LoginLogger(Context context, String str) {
        PackageInfo packageInfo;
        this.f5153b = str;
        this.f5152a = new InternalAppEventsLogger(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.f5154c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m2589b(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public void m2590a(String str, String str2, String str3) {
        Bundle bundleM2589b = m2589b("");
        bundleM2589b.putString("2_result", "error");
        bundleM2589b.putString("5_error_message", str2);
        bundleM2589b.putString("3_method", str3);
        this.f5152a.m2370c(str, bundleM2589b);
    }
}
