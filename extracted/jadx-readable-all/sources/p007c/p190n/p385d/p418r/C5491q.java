package p007c.p190n.p385d.p418r;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p385d.FirebaseApp2;

/* JADX INFO: renamed from: c.n.d.r.q */
/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class C5491q {

    /* JADX INFO: renamed from: a */
    public final Context f27085a;

    /* JADX INFO: renamed from: b */
    public String f27086b;

    /* JADX INFO: renamed from: c */
    public String f27087c;

    /* JADX INFO: renamed from: d */
    public int f27088d;

    /* JADX INFO: renamed from: e */
    public int f27089e = 0;

    public C5491q(Context context) {
        this.f27085a = context;
    }

    /* JADX INFO: renamed from: b */
    public static String m12073b(FirebaseApp2 firebaseApp2) {
        firebaseApp2.m11668a();
        String str = firebaseApp2.f26305f.f26323e;
        if (str != null) {
            return str;
        }
        firebaseApp2.m11668a();
        String str2 = firebaseApp2.f26305f.f26320b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* JADX INFO: renamed from: a */
    public synchronized String m12074a() {
        if (this.f27086b == null) {
            m12077e();
        }
        return this.f27086b;
    }

    /* JADX INFO: renamed from: c */
    public final PackageInfo m12075c(String str) {
        try {
            return this.f27085a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a A[Catch: all -> 0x0081, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000b, B:10:0x001c, B:13:0x0026, B:15:0x002c, B:17:0x003e, B:20:0x0045, B:23:0x004a, B:25:0x005c, B:28:0x0063, B:31:0x0068, B:33:0x0075, B:34:0x0079), top: B:43:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[Catch: all -> 0x0081, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000b, B:10:0x001c, B:13:0x0026, B:15:0x002c, B:17:0x003e, B:20:0x0045, B:23:0x004a, B:25:0x005c, B:28:0x0063, B:31:0x0068, B:33:0x0075, B:34:0x0079), top: B:43:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000b, B:10:0x001c, B:13:0x0026, B:15:0x002c, B:17:0x003e, B:20:0x0045, B:23:0x004a, B:25:0x005c, B:28:0x0063, B:31:0x0068, B:33:0x0075, B:34:0x0079), top: B:43:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0079 A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000b, B:10:0x001c, B:13:0x0026, B:15:0x002c, B:17:0x003e, B:20:0x0045, B:23:0x004a, B:25:0x005c, B:28:0x0063, B:31:0x0068, B:33:0x0075, B:34:0x0079), top: B:43:0x0001 }] */
    /* JADX INFO: renamed from: d */
    public boolean m12076d() {
        int i;
        List<ResolveInfo> listQueryBroadcastReceivers;
        synchronized (this) {
            i = this.f27089e;
            if (i == 0) {
                PackageManager packageManager = this.f27085a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                    i = 0;
                } else if (C2622l.m5464z()) {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers != null) {
                        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                        if (C2622l.m5464z()) {
                            this.f27089e = 2;
                            i = 2;
                        } else {
                            this.f27089e = 1;
                            i = 1;
                        }
                    } else {
                        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                        if (C2622l.m5464z()) {
                            this.f27089e = 2;
                            i = 2;
                        } else {
                            this.f27089e = 1;
                            i = 1;
                        }
                    }
                } else {
                    Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                        Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
                        intent3.setPackage("com.google.android.gms");
                        listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
                        if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.size() <= 0) {
                            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                            if (C2622l.m5464z()) {
                                this.f27089e = 2;
                                i = 2;
                            } else {
                                this.f27089e = 1;
                                i = 1;
                            }
                        } else {
                            this.f27089e = 2;
                            i = 2;
                        }
                    } else {
                        this.f27089e = 1;
                        i = 1;
                    }
                }
            }
        }
        return i != 0;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m12077e() {
        PackageInfo packageInfoM12075c = m12075c(this.f27085a.getPackageName());
        if (packageInfoM12075c != null) {
            this.f27086b = Integer.toString(packageInfoM12075c.versionCode);
            this.f27087c = packageInfoM12075c.versionName;
        }
    }
}
