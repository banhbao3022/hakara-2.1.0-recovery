package p007c.p190n.p194b.p266d.p297e;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: renamed from: c.n.b.d.e.u */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2594u {

    /* JADX INFO: renamed from: a */
    public final Context f11541a;

    /* JADX INFO: renamed from: b */
    public int f11542b;

    /* JADX INFO: renamed from: c */
    public int f11543c = 0;

    public C2594u(Context context) {
        this.f11541a = context;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m5189a() {
        int i = this.f11543c;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f11541a.getPackageManager();
        if (C2794c.m5637a(this.f11541a).f11958a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C2622l.m5464z()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f11543c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f11543c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (C2622l.m5464z()) {
            this.f11543c = 2;
        } else {
            this.f11543c = 1;
        }
        return this.f11543c;
    }

    /* JADX INFO: renamed from: b */
    public final PackageInfo m5190b(String str) {
        try {
            return C2794c.m5637a(this.f11541a).f11958a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            Log.w("Metadata", sb.toString());
            return null;
        }
    }
}
