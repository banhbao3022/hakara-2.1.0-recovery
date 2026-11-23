package p007c.p165l.p178k0;

import java.util.HashSet;
import java.util.Objects;
import p007c.p071d.p075b.p076a.InstallReferrerClient;
import p007c.p071d.p075b.p076a.InstallReferrerStateListener;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.AppEventsLoggerImpl2;
import p007c.p165l.p175i0.C1095a;

/* JADX INFO: renamed from: c.l.k0.u, reason: use source file name */
/* JADX INFO: compiled from: InstallReferrerUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class InstallReferrerUtil implements InstallReferrerStateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InstallReferrerClient f5037a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InstallReferrerUtil2 f5038b;

    public InstallReferrerUtil(InstallReferrerClient installReferrerClient, InstallReferrerUtil2 installReferrerUtil2) {
        this.f5037a = installReferrerClient;
        this.f5038b = installReferrerUtil2;
    }

    /* JADX INFO: renamed from: a */
    public void m2531a(int i) {
        if (i != 0) {
            if (i != 2) {
                return;
            }
            C1095a.m2386b();
            return;
        }
        try {
            String string = this.f5037a.mo1546a().f2790a.getString("install_referrer");
            if (string != null && (string.contains("fb") || string.contains("facebook"))) {
                Objects.requireNonNull((AppEventsLoggerImpl2) this.f5038b);
                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                Validate.m2479h();
                FacebookSdk.f5360i.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", string).apply();
            }
            C1095a.m2386b();
        } catch (Exception unused) {
        }
    }
}
