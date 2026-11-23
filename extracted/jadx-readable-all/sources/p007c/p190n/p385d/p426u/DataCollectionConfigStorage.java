package p007c.p190n.p385d.p426u;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import p007c.p190n.p385d.p416p.Publisher;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: c.n.d.u.a, reason: use source file name */
/* JADX INFO: compiled from: DataCollectionConfigStorage.java */
/* JADX INFO: loaded from: classes.dex */
public class DataCollectionConfigStorage {

    /* JADX INFO: renamed from: a */
    public final Context f27221a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f27222b;

    /* JADX INFO: renamed from: c */
    public final Publisher f27223c;

    /* JADX INFO: renamed from: d */
    public boolean f27224d;

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            Object obj = ContextCompat.f37815a;
            context = i >= 24 ? ContextCompat.e.m16147a(context) : null;
        }
        this.f27221a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f27222b = sharedPreferences;
        this.f27223c = publisher;
        boolean z2 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = z2;
        }
        this.f27224d = z;
    }
}
