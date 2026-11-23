package p007c.p165l.p178k0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.FacebookSdk;
import p007c.p165l.FacebookSdkNotInitializedException;
import p007c.p165l.LoggingBehavior;

/* JADX INFO: renamed from: c.l.k0.g0, reason: use source file name */
/* JADX INFO: compiled from: Validate.java */
/* JADX INFO: loaded from: classes.dex */
public final class Validate {

    /* JADX INFO: renamed from: a */
    public static final String f4922a = "c.l.k0.g0";

    /* JADX INFO: renamed from: a */
    public static String m2472a() {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        m2479h();
        String str = FacebookSdk.f5354c;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2473b(Context context, String str) {
        List<ResolveInfo> listQueryIntentActivities;
        m2477f(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities == null) {
            return false;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!activityInfo.name.equals("com.facebook.CustomTabActivity") || !activityInfo.packageName.equals(context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public static void m2474c(Context context, boolean z) {
        ActivityInfo activityInfo;
        m2477f(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = null;
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null) {
            if (z) {
                throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
            }
            Log.w(f4922a, "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2475d(Context context, boolean z) {
        m2477f(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (z) {
                throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            }
            Log.w(f4922a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    /* JADX INFO: renamed from: e */
    public static <T> void m2476e(Collection<T> collection, String str) {
        m2477f(collection, str);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException(outline.m1600v("Container '", str, "' cannot contain null values"));
            }
        }
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(outline.m1600v("Container '", str, "' cannot be empty"));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2477f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(outline.m1600v("Argument '", str, "' cannot be null"));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m2478g(String str, String str2) {
        if (Utility.m2466y(str)) {
            throw new IllegalArgumentException(outline.m1600v("Argument '", str2, "' cannot be null or empty"));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m2479h() {
        if (!FacebookSdk.m2664f()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
