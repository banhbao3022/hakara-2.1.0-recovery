package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.p306t.C2778a;
import p007c.p190n.p194b.p266d.p298f.p309v.C2793b;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: renamed from: c.n.b.d.k.b.o4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4618o4 {

    /* JADX INFO: renamed from: a */
    public final C4707w4 f24227a;

    public C4618o4(C4707w4 c4707w4) {
        this.f24227a = c4707w4;
    }

    /* JADX INFO: renamed from: a */
    public final void m10711a(String str) {
        if (str == null || str.isEmpty()) {
            this.f24227a.mo10684l().f24422j.m10811a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f24227a.mo10686n().mo10381b();
        if (!m10712b()) {
            this.f24227a.mo10684l().f24424l.m10811a("Install Referrer Reporter is not available");
            return;
        }
        ServiceConnectionC4606n4 serviceConnectionC4606n4 = new ServiceConnectionC4606n4(this, str);
        this.f24227a.mo10686n().mo10381b();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f24227a.f24528b.getPackageManager();
        if (packageManager == null) {
            this.f24227a.mo10684l().f24422j.m10811a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            this.f24227a.mo10684l().f24424l.m10811a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !m10712b()) {
                this.f24227a.mo10684l().f24421i.m10811a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            try {
                this.f24227a.mo10684l().f24426n.m10812b("Install Referrer Service is", C2778a.m5615b().m5616a(this.f24227a.f24528b, new Intent(intent), serviceConnectionC4606n4, 1) ? "available" : "not available");
            } catch (Exception e) {
                this.f24227a.mo10684l().f24418f.m10812b("Exception occurred while binding to Install Referrer Service", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10712b() {
        try {
            C2793b c2793bM5637a = C2794c.m5637a(this.f24227a.f24528b);
            if (c2793bM5637a != null) {
                return c2793bM5637a.f11958a.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f24227a.mo10684l().f24426n.m10811a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.f24227a.mo10684l().f24426n.m10812b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
