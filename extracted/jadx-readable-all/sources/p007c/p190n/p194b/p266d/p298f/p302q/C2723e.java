package p007c.p190n.p194b.p266d.p298f.p302q;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p266d.p298f.C2616i;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;
import p636z0.p691g.SimpleArrayMap;

/* JADX INFO: renamed from: c.n.b.d.f.q.e */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2723e {

    /* JADX INFO: renamed from: a */
    public static final SimpleArrayMap<String, String> f11848a = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: a */
    public static String m5587a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C2794c.m5637a(context).m5634b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m5588b(Context context, int i) {
        Resources resources = context.getResources();
        String strM5587a = m5587a(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strM5587a);
        }
        if (i == 2) {
            return C2622l.m5242E(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strM5587a);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strM5587a);
        }
        if (i == 5) {
            return m5591e(context, "common_google_play_services_invalid_account_text", strM5587a);
        }
        if (i == 7) {
            return m5591e(context, "common_google_play_services_network_error_text", strM5587a);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strM5587a);
        }
        if (i == 20) {
            return m5591e(context, "common_google_play_services_restricted_profile_text", strM5587a);
        }
        switch (i) {
            case 16:
                return m5591e(context, "common_google_play_services_api_unavailable_text", strM5587a);
            case 17:
                return m5591e(context, "common_google_play_services_sign_in_failed_text", strM5587a);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strM5587a);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strM5587a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m5589c(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m5590d(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m5590d(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m5590d(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m5590d(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m5590d(Context context, String str) {
        Resources resourcesForApplication;
        SimpleArrayMap<String, String> simpleArrayMap = f11848a;
        synchronized (simpleArrayMap) {
            String orDefault = simpleArrayMap.getOrDefault(str, null);
            if (orDefault != null) {
                return orDefault;
            }
            int i = C2616i.f11577e;
            try {
                resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resourcesForApplication = null;
            }
            if (resourcesForApplication == null) {
                return null;
            }
            int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String strValueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", strValueOf.length() != 0 ? "Missing resource: ".concat(strValueOf) : new String("Missing resource: "));
                return null;
            }
            String string = resourcesForApplication.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                f11848a.put(str, string);
                return string;
            }
            String strValueOf2 = String.valueOf(str);
            Log.w("GoogleApiAvailability", strValueOf2.length() != 0 ? "Got empty resource: ".concat(strValueOf2) : new String("Got empty resource: "));
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m5591e(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strM5590d = m5590d(context, str);
        if (strM5590d == null) {
            strM5590d = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strM5590d, str2);
    }
}
