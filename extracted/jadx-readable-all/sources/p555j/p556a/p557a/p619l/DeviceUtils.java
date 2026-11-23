package p555j.p556a.p557a.p619l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import java.util.Locale;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;

/* JADX INFO: renamed from: j.a.a.l.c, reason: use source file name */
/* JADX INFO: compiled from: DeviceUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DeviceUtils {

    /* JADX INFO: renamed from: a */
    public static final a f33080a = new a(null);

    /* JADX INFO: renamed from: j.a.a.l.c$a */
    /* JADX INFO: compiled from: DeviceUtils.kt */
    public static final class a {
        public a() {
        }

        @SuppressLint({"HardwareIds"})
        /* JADX INFO: renamed from: a */
        public final String m14247a(Context context) {
            if (context == null) {
                SharedPreferences sharedPreferences = ModelPrefs.f32358a;
                if (sharedPreferences != null) {
                    String str = (String) outline.m1584f(sharedPreferences.getString("device_id", null), String.class);
                    return str != null ? str : "";
                }
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            Intrinsics2.m13088d(string, "Settings.Secure.getStrin…ROID_ID\n                )");
            Intrinsics2.m13089e("device_id", "key");
            String strM12319f = new GsonBuilder().m12322a().m12319f(string);
            SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
            if (sharedPreferences2 != null) {
                outline.m1564O(sharedPreferences2, "device_id", strM12319f);
                return string;
            }
            Intrinsics2.m13096l("preferences");
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public final String m14248b() {
            Locale locale = Locale.getDefault();
            Intrinsics2.m13088d(locale, "Locale.getDefault()");
            String language = locale.getLanguage();
            Intrinsics2.m13088d(language, "Locale.getDefault().language");
            return language;
        }

        /* JADX INFO: renamed from: c */
        public final String m14249c() {
            Locale locale = Locale.getDefault();
            Intrinsics2.m13088d(locale, "Locale.getDefault()");
            String country = locale.getCountry();
            Intrinsics2.m13088d(country, "Locale.getDefault().country");
            return country;
        }

        /* JADX INFO: renamed from: d */
        public final String m14250d() {
            String str = Build.VERSION.RELEASE;
            Intrinsics2.m13088d(str, "Build.VERSION.RELEASE");
            return str;
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
