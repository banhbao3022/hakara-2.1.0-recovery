package p007c.p165l.p166h0.p171e0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import p007c.p008a.p009a.p010a.C0244f;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.FacebookSdk;
import p007c.p165l.p166h0.AppEventQueue;
import p007c.p165l.p166h0.AppEventQueue3;
import p007c.p165l.p166h0.AppEventsLoggerImpl3;
import p007c.p165l.p166h0.InternalAppEventsLogger;
import p007c.p165l.p178k0.Logger3;

/* JADX INFO: renamed from: c.l.h0.e0.m, reason: use source file name */
/* JADX INFO: compiled from: SessionLogger.java */
/* JADX INFO: loaded from: classes.dex */
public class SessionLogger {

    /* JADX INFO: renamed from: a */
    public static final long[] f4753a = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    /* JADX INFO: renamed from: a */
    public static void m2327a(String str, SourceApplicationInfo sourceApplicationInfo, String str2, Context context) {
        String string;
        String string2;
        Bundle bundleM1575Z = outline.m1575Z("fb_mobile_launch_source", "Unclassified");
        try {
            PackageManager packageManager = context.getPackageManager();
            String str3 = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            string = sharedPreferences.getString(str3, null);
            if (string == null || string.length() != 32) {
                string = C0244f.m1013b(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
                sharedPreferences.edit().putString(str3, string).apply();
            }
        } catch (Exception unused) {
            string = null;
        }
        bundleM1575Z.putString("fb_mobile_pckg_fp", string);
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuilder sb = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            for (Signature signature : signatureArr) {
                messageDigest.update(signature.toByteArray());
                sb.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb.append(":");
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            string2 = sb.toString();
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused2) {
            string2 = "";
        }
        bundleM1575Z.putString("fb_mobile_app_cert_hash", string2);
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(str, str2, null);
        internalAppEventsLogger.m2369b("fb_mobile_activate_app", bundleM1575Z);
        AppEventsLoggerImpl3.m2362a();
        Objects.requireNonNull(internalAppEventsLogger.f4855a);
        AppEventQueue.f4758c.execute(new AppEventQueue3(1));
    }

    /* JADX INFO: renamed from: b */
    public static void m2328b(String str, SessionInfo sessionInfo, String str2) {
        Long l;
        Long l2 = sessionInfo.f4750d;
        Long l3 = 0L;
        Long lValueOf = Long.valueOf((l2 == null ? 0L : l2.longValue()) - sessionInfo.f4748b.longValue());
        if (lValueOf.longValue() < 0) {
            HashMap<String, String> map = Logger3.f5043a;
            synchronized (FacebookSdk.f5352a) {
            }
            lValueOf = l3;
        }
        Long lValueOf2 = Long.valueOf((sessionInfo.f4747a == null || (l = sessionInfo.f4748b) == null) ? 0L : l.longValue() - sessionInfo.f4747a.longValue());
        if (lValueOf2.longValue() < 0) {
            HashMap<String, String> map2 = Logger3.f5043a;
            synchronized (FacebookSdk.f5352a) {
            }
        } else {
            l3 = lValueOf2;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", sessionInfo.f4749c);
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[1];
        long jLongValue = lValueOf.longValue();
        int i = 0;
        while (true) {
            long[] jArr = f4753a;
            if (i >= jArr.length || jArr[i] >= jLongValue) {
                break;
            } else {
                i++;
            }
        }
        objArr[0] = Integer.valueOf(i);
        bundle.putString("fb_mobile_time_between_sessions", String.format(locale, "session_quanta_%d", objArr));
        SourceApplicationInfo sourceApplicationInfo = sessionInfo.f4751e;
        bundle.putString("fb_mobile_launch_source", sourceApplicationInfo != null ? sourceApplicationInfo.toString() : "Unclassified");
        bundle.putLong("_logTime", sessionInfo.f4748b.longValue() / 1000);
        new InternalAppEventsLogger(str, str2, null).m2368a("fb_mobile_deactivate_app", l3.longValue() / 1000.0d, bundle);
    }
}
