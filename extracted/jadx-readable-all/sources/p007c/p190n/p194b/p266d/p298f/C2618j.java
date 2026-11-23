package p007c.p190n.p194b.p266d.p298f;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: renamed from: c.n.b.d.f.j */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2618j {

    /* JADX INFO: renamed from: b */
    public static boolean f11584b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f11585c = false;

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f11583a = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f11586d = new AtomicBoolean();

    @RecentlyNullable
    /* JADX INFO: renamed from: a */
    public static Context m5215a(@RecentlyNonNull Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5216b(@RecentlyNonNull Context context) {
        try {
            if (!f11585c) {
                PackageInfo packageInfo = C2794c.m5637a(context).f11958a.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C2620k.m5218a(context);
                if (packageInfo == null || C2620k.m5220d(packageInfo, false) || !C2620k.m5220d(packageInfo, true)) {
                    f11584b = false;
                } else {
                    f11584b = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            f11585c = true;
        }
        return f11584b || !"user".equals(Build.TYPE);
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: c */
    public static boolean m5217c(Context context, String str) throws PackageManager.NameNotFoundException {
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (zEquals) {
                return applicationInfo.enabled;
            }
            if (applicationInfo.enabled) {
                Object systemService = context.getSystemService("user");
                Objects.requireNonNull(systemService, "null reference");
                Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
                if (!(applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile")))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
    }
}
