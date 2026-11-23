package p007c.p190n.p194b.p266d.p298f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.p302q.C2725e1;
import p007c.p190n.p194b.p266d.p298f.p302q.C2748n0;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: renamed from: c.n.b.d.f.f */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2610f {

    /* JADX INFO: renamed from: a */
    public static final int f11567a;

    /* JADX INFO: renamed from: b */
    public static final C2610f f11568b;

    static {
        AtomicBoolean atomicBoolean = C2618j.f11583a;
        f11567a = 12451000;
        f11568b = new C2610f();
    }

    /* JADX INFO: renamed from: a */
    public int m5212a(@RecentlyNonNull Context context) {
        AtomicBoolean atomicBoolean = C2618j.f11583a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @RecentlyNullable
    /* JADX INFO: renamed from: b */
    public Intent mo5205b(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri uri = C2725e1.f11849a;
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && C2622l.m5242E(context)) {
            Uri uri2 = C2725e1.f11849a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sbM1556G = outline.m1556G("gcore_");
        sbM1556G.append(f11567a);
        sbM1556G.append("-");
        if (!TextUtils.isEmpty(str)) {
            sbM1556G.append(str);
        }
        sbM1556G.append("-");
        if (context != null) {
            sbM1556G.append(context.getPackageName());
        }
        sbM1556G.append("-");
        if (context != null) {
            try {
                sbM1556G.append(C2794c.m5637a(context).m5635c(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sbM1556G.toString();
        Uri uri3 = C2725e1.f11849a;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX INFO: renamed from: c */
    public int mo5206c(@RecentlyNonNull Context context) {
        return mo5207d(context, f11567a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0105  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0110  */
    /* JADX WARN: Code duplicated, block: B:69:0x0140  */
    /* JADX WARN: Code duplicated, block: B:77:0x015c  */
    /* JADX WARN: Code duplicated, block: B:78:0x015e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0172  */
    /* JADX WARN: Code duplicated, block: B:84:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0176  */
    /* JADX WARN: Code duplicated, block: B:87:0x017c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x017d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public int mo5207d(@RecentlyNonNull Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        int i2;
        int i3;
        int i4;
        ApplicationInfo applicationInfo;
        AtomicBoolean atomicBoolean = C2618j.f11583a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !C2618j.f11586d.get()) {
            C2748n0.m5606a(context);
            int i5 = C2748n0.f11892d;
            if (i5 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i5 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException(i5);
            }
        }
        boolean zM5217c = false;
        if (C2622l.m5242E(context)) {
            z = false;
        } else {
            if (C2622l.f11597e == null) {
                C2622l.f11597e = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (C2622l.f11597e.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        }
        C2622l.m5339a(i >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C2620k.m5218a(context);
            if (C2620k.m5220d(packageInfo2, true)) {
                if (z) {
                    Objects.requireNonNull(packageInfo, "null reference");
                    if (!C2620k.m5220d(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    } else if (z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        i3 = packageInfo2.versionCode;
                        if (i3 == -1) {
                            i4 = -1;
                        } else {
                            i4 = i3 / CloseCodes.NORMAL_CLOSURE;
                        }
                        if (i4 < (i != -1 ? i / CloseCodes.NORMAL_CLOSURE : -1)) {
                            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 82);
                            sb.append("Google Play services out of date for ");
                            sb.append(packageName);
                            sb.append(".  Requires ");
                            sb.append(i);
                            sb.append(" but found ");
                            sb.append(i3);
                            Log.w("GooglePlayServicesUtil", sb.toString());
                            i2 = 2;
                        } else {
                            applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e);
                                    i2 = 1;
                                }
                            }
                            if (applicationInfo.enabled) {
                                i2 = 0;
                            } else {
                                i2 = 3;
                            }
                        }
                    } else {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    }
                } else {
                    if (z) {
                    }
                    i3 = packageInfo2.versionCode;
                    if (i3 == -1) {
                        i4 = -1;
                    } else {
                        i4 = i3 / CloseCodes.NORMAL_CLOSURE;
                    }
                    if (i4 < (i != -1 ? i / CloseCodes.NORMAL_CLOSURE : -1)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 82);
                        sb2.append("Google Play services out of date for ");
                        sb2.append(packageName);
                        sb2.append(".  Requires ");
                        sb2.append(i);
                        sb2.append(" but found ");
                        sb2.append(i3);
                        Log.w("GooglePlayServicesUtil", sb2.toString());
                        i2 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        if (applicationInfo.enabled) {
                            i2 = 3;
                        } else {
                            i2 = 0;
                        }
                    }
                }
                if (i2 == 18) {
                    zM5217c = true;
                } else if (i2 == 1) {
                    zM5217c = C2618j.m5217c(context, "com.google.android.gms");
                }
                if (zM5217c) {
                    return 18;
                }
                return i2;
            }
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            i2 = 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (i2 == 18) {
            zM5217c = true;
        } else if (i2 == 1) {
            zM5217c = C2618j.m5217c(context, "com.google.android.gms");
        }
        if (zM5217c) {
            return 18;
        }
        return i2;
    }
}
