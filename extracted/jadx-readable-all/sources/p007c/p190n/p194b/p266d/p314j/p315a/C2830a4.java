package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p636z0.p663d.p664a.CustomTabsClient7;
import p636z0.p663d.p664a.CustomTabsServiceConnection;
import p636z0.p663d.p664a.CustomTabsSession;

/* JADX INFO: renamed from: c.n.b.d.j.a.a4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2830a4 {

    /* JADX INFO: renamed from: a */
    public CustomTabsSession f12009a;

    /* JADX INFO: renamed from: b */
    public CustomTabsClient7 f12010b;

    /* JADX INFO: renamed from: c */
    public CustomTabsServiceConnection f12011c;

    /* JADX INFO: renamed from: d */
    public InterfaceC3756z3 f12012d;

    /* JADX INFO: renamed from: a */
    public static boolean m5684a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
            for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                    return resolveInfoResolveActivity.activityInfo.packageName.equals(C2622l.m5263I0(context));
                }
            }
        }
        return false;
    }
}
