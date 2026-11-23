package p007c.p190n.p385d.p391l.p392e.p395k;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p421t.FirebaseInstallationsApi;

/* JADX INFO: renamed from: c.n.d.l.e.k.q0, reason: use source file name */
/* JADX INFO: compiled from: IdManager.java */
/* JADX INFO: loaded from: classes.dex */
public class IdManager implements InstallIdProvider {

    /* JADX INFO: renamed from: a */
    public static final Pattern f26564a = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: b */
    public static final String f26565b = Pattern.quote("/");

    /* JADX INFO: renamed from: c */
    public final InstallerPackageNameProvider f26566c;

    /* JADX INFO: renamed from: d */
    public final Context f26567d;

    /* JADX INFO: renamed from: e */
    public final String f26568e;

    /* JADX INFO: renamed from: f */
    public final FirebaseInstallationsApi f26569f;

    /* JADX INFO: renamed from: g */
    public String f26570g;

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f26567d = context;
        this.f26568e = str;
        this.f26569f = firebaseInstallationsApi;
        this.f26566c = new InstallerPackageNameProvider();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m11774a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String string = UUID.randomUUID().toString();
        lowerCase = string == null ? null : f26564a.matcher(string).replaceAll("").toLowerCase(Locale.US);
        Logger4.f26421a.m11713b("Created new Crashlytics IID: " + lowerCase);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX INFO: renamed from: b */
    public synchronized String m11775b() {
        String str;
        String str2 = this.f26570g;
        if (str2 != null) {
            return str2;
        }
        SharedPreferences sharedPreferencesM11751n = CommonUtils.m11751n(this.f26567d);
        AbstractC4781i<String> abstractC4781iMo12110w = this.f26569f.mo12110w();
        String string = sharedPreferencesM11751n.getString("firebase.installation.id", null);
        try {
            str = (String) Utils3.m11727a(abstractC4781iMo12110w);
        } catch (Exception e) {
            Logger4 logger4 = Logger4.f26421a;
            if (logger4.m11712a(3)) {
                Log.d(logger4.f26422b, "Failed to retrieve installation id", e);
            }
            str = string != null ? string : null;
        }
        if (string != null) {
            if (string.equals(str)) {
                this.f26570g = sharedPreferencesM11751n.getString("crashlytics.installation.id", null);
                Logger4.f26421a.m11713b("Found matching FID, using Crashlytics IID: " + this.f26570g);
                if (this.f26570g == null) {
                    this.f26570g = m11774a(str, sharedPreferencesM11751n);
                }
            } else {
                this.f26570g = m11774a(str, sharedPreferencesM11751n);
            }
            return this.f26570g;
        }
        SharedPreferences sharedPreferences = this.f26567d.getSharedPreferences("com.crashlytics.prefs", 0);
        String string2 = sharedPreferences.getString("crashlytics.installation.id", null);
        Logger4.f26421a.m11713b("No cached FID; legacy id is " + string2);
        if (string2 == null) {
            this.f26570g = m11774a(str, sharedPreferencesM11751n);
        } else {
            this.f26570g = string2;
            m11777d(string2, str, sharedPreferencesM11751n, sharedPreferences);
        }
        return this.f26570g;
    }

    /* JADX INFO: renamed from: c */
    public String m11776c() {
        String str;
        InstallerPackageNameProvider installerPackageNameProvider = this.f26566c;
        Context context = this.f26567d;
        synchronized (installerPackageNameProvider) {
            if (installerPackageNameProvider.f26578a == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                installerPackageNameProvider.f26578a = installerPackageName;
            }
            str = "".equals(installerPackageNameProvider.f26578a) ? null : installerPackageNameProvider.f26578a;
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m11777d(String str, String str2, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        Logger4.f26421a.m11713b("Migrating legacy Crashlytics IID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", str).putString("firebase.installation.id", str2).apply();
        sharedPreferences2.edit().remove("crashlytics.installation.id").remove("crashlytics.advertising.id").apply();
    }

    /* JADX INFO: renamed from: e */
    public final String m11778e(String str) {
        return str.replaceAll(f26565b, "");
    }
}
