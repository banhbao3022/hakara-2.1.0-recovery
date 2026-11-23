package p007c.p190n.p385d.p391l.p392e.p395k;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.io.FilenameFilter;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.C4778g0;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p391l.p392e.Logger4;

/* JADX INFO: renamed from: c.n.d.l.e.k.m0, reason: use source file name */
/* JADX INFO: compiled from: DataCollectionArbiter.java */
/* JADX INFO: loaded from: classes.dex */
public class DataCollectionArbiter {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f26540a;

    /* JADX INFO: renamed from: b */
    public final FirebaseApp2 f26541b;

    /* JADX INFO: renamed from: e */
    public boolean f26544e;

    /* JADX INFO: renamed from: f */
    public Boolean f26545f;

    /* JADX INFO: renamed from: c */
    public final Object f26542c = new Object();

    /* JADX INFO: renamed from: d */
    public C4782j<Void> f26543d = new C4782j<>();

    /* JADX INFO: renamed from: g */
    public C4782j<Void> f26546g = new C4782j<>();

    public DataCollectionArbiter(FirebaseApp2 firebaseApp2) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f26544e = false;
        firebaseApp2.m11668a();
        Context context = firebaseApp2.f26303d;
        this.f26541b = firebaseApp2;
        SharedPreferences sharedPreferencesM11751n = CommonUtils.m11751n(context);
        this.f26540a = sharedPreferencesM11751n;
        if (sharedPreferencesM11751n.contains("firebase_crashlytics_collection_enabled")) {
            this.f26544e = false;
            boolValueOf = Boolean.valueOf(sharedPreferencesM11751n.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e) {
                Logger4 logger4 = Logger4.f26421a;
                if (logger4.m11712a(3)) {
                    Log.d(logger4.f26422b, "Unable to get PackageManager. Falling through", e);
                }
            }
            if (boolValueOf2 == null) {
                this.f26544e = false;
                boolValueOf = null;
            } else {
                this.f26544e = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f26545f = boolValueOf;
        synchronized (this.f26542c) {
            if (m11770a()) {
                this.f26543d.m10948b(null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m11770a() {
        boolean zBooleanValue;
        String str;
        Boolean bool = this.f26545f;
        zBooleanValue = bool != null ? bool.booleanValue() : this.f26541b.m11671g();
        String str2 = zBooleanValue ? "ENABLED" : "DISABLED";
        if (this.f26545f == null) {
            str = "global Firebase setting";
        } else {
            str = this.f26544e ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        Logger4.f26421a.m11713b(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC4781i<Void> m11771b() {
        C4778g0<Void> c4778g0;
        C4778g0<Void> c4778g1 = this.f26546g.f24683a;
        synchronized (this.f26542c) {
            c4778g0 = this.f26543d.f24683a;
        }
        FilenameFilter filenameFilter = Utils3.f26467a;
        C4782j c4782j = new C4782j();
        Utils4 utils4 = new Utils4(c4782j);
        c4778g1.mo10933f(utils4);
        c4778g0.mo10933f(utils4);
        return c4782j.f24683a;
    }
}
