package p007c.p190n.p385d.p418r;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p297e.C2575c;
import p007c.p190n.p194b.p266d.p297e.C2581h;
import p007c.p190n.p194b.p266d.p297e.C2594u;
import p007c.p190n.p194b.p266d.p297e.C2595v;
import p007c.p190n.p194b.p266d.p297e.C2596w;
import p007c.p190n.p194b.p266d.p297e.ExecutorC2576c0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4767b;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p417q.HeartBeatInfo;
import p007c.p190n.p385d.p420s.Provider2;
import p007c.p190n.p385d.p421t.FirebaseInstallationsApi;
import p007c.p190n.p385d.p421t.InstallationTokenResult;
import p007c.p190n.p385d.p429x.UserAgentPublisher;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.n.d.r.n */
/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class C5488n {

    /* JADX INFO: renamed from: a */
    public final FirebaseApp2 f27077a;

    /* JADX INFO: renamed from: b */
    public final C5491q f27078b;

    /* JADX INFO: renamed from: c */
    public final C2575c f27079c;

    /* JADX INFO: renamed from: d */
    public final Provider2<UserAgentPublisher> f27080d;

    /* JADX INFO: renamed from: e */
    public final Provider2<HeartBeatInfo> f27081e;

    /* JADX INFO: renamed from: f */
    public final FirebaseInstallationsApi f27082f;

    public C5488n(FirebaseApp2 firebaseApp2, C5491q c5491q, Provider2<UserAgentPublisher> provider2, Provider2<HeartBeatInfo> provider3, FirebaseInstallationsApi firebaseInstallationsApi) {
        firebaseApp2.m11668a();
        C2575c c2575c = new C2575c(firebaseApp2.f26303d);
        this.f27077a = firebaseApp2;
        this.f27078b = c5491q;
        this.f27079c = c2575c;
        this.f27080d = provider2;
        this.f27081e = provider3;
        this.f27082f = firebaseInstallationsApi;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC4781i<String> m12069a(AbstractC4781i<Bundle> abstractC4781i) {
        Executor executor = C5482h.f27066a;
        return abstractC4781i.mo10934g(ExecutorC5481g.f27065f, new InterfaceC4767b(this) { // from class: c.n.d.r.m

            /* JADX INFO: renamed from: a */
            public final C5488n f27076a;

            {
                this.f27076a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4767b
            /* JADX INFO: renamed from: a */
            public Object mo5191a(AbstractC4781i abstractC4781i2) throws IOException {
                Objects.requireNonNull(this.f27076a);
                Bundle bundle = (Bundle) abstractC4781i2.mo10938k(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                String strValueOf = String.valueOf(bundle);
                Log.w("FirebaseInstanceId", outline.m1550A(new StringBuilder(strValueOf.length() + 21), "Unexpected response: ", strValueOf), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC4781i<Bundle> m12070b(String str, String str2, String str3, final Bundle bundle) {
        int i;
        String str4;
        String strEncodeToString;
        int i2;
        int i3;
        PackageInfo packageInfoM5190b;
        int iMo12059a;
        PackageInfo packageInfoM12075c;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        FirebaseApp2 firebaseApp2 = this.f27077a;
        firebaseApp2.m11668a();
        bundle.putString("gmp_app_id", firebaseApp2.f26305f.f26320b);
        C5491q c5491q = this.f27078b;
        synchronized (c5491q) {
            if (c5491q.f27088d == 0 && (packageInfoM12075c = c5491q.m12075c("com.google.android.gms")) != null) {
                c5491q.f27088d = packageInfoM12075c.versionCode;
            }
            i = c5491q.f27088d;
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f27078b.m12074a());
        C5491q c5491q2 = this.f27078b;
        synchronized (c5491q2) {
            if (c5491q2.f27087c == null) {
                c5491q2.m12077e();
            }
            str4 = c5491q2.f27087c;
        }
        bundle.putString("app_ver_name", str4);
        FirebaseApp2 firebaseApp3 = this.f27077a;
        firebaseApp3.m11668a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(firebaseApp3.f26304e.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String strMo12093a = ((InstallationTokenResult) C4340s8.m10204a(this.f27082f.mo12099a(false))).mo12093a();
            if (TextUtils.isEmpty(strMo12093a)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strMo12093a);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fiid-21.0.1");
        HeartBeatInfo heartBeatInfo = this.f27081e.get();
        UserAgentPublisher userAgentPublisher = this.f27080d.get();
        if (heartBeatInfo != null && userAgentPublisher != null && (iMo12059a = heartBeatInfo.mo12059a("fire-iid")) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(C7804v0.m15315d(iMo12059a)));
            bundle.putString("Firebase-Client", userAgentPublisher.mo12210a());
        }
        final C2575c c2575c = this.f27079c;
        C2594u c2594u = c2575c.f11504f;
        synchronized (c2594u) {
            if (c2594u.f11542b == 0 && (packageInfoM5190b = c2594u.m5190b("com.google.android.gms")) != null) {
                c2594u.f11542b = packageInfoM5190b.versionCode;
            }
            i2 = c2594u.f11542b;
        }
        if (i2 < 12000000) {
            return !(c2575c.f11504f.m5189a() != 0) ? C4340s8.m10207d(new IOException("MISSING_INSTANCEID_SERVICE")) : c2575c.m5178b(bundle).mo10935h(ExecutorC2576c0.f11509f, new InterfaceC4767b(c2575c, bundle) { // from class: c.n.b.d.e.y

                /* JADX INFO: renamed from: a */
                public final C2575c f11546a;

                /* JADX INFO: renamed from: b */
                public final Bundle f11547b;

                {
                    this.f11546a = c2575c;
                    this.f11547b = bundle;
                }

                @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4767b
                /* JADX INFO: renamed from: a */
                public final Object mo5191a(AbstractC4781i abstractC4781i) {
                    C2575c c2575c2 = this.f11546a;
                    Bundle bundle2 = this.f11547b;
                    Objects.requireNonNull(c2575c2);
                    if (!abstractC4781i.mo10941n()) {
                        return abstractC4781i;
                    }
                    Bundle bundle3 = (Bundle) abstractC4781i.mo10937j();
                    return !(bundle3 != null && bundle3.containsKey("google.messenger")) ? abstractC4781i : c2575c2.m5178b(bundle2).mo10942o(ExecutorC2576c0.f11509f, C2599z.f11548a);
                }
            });
        }
        C2581h c2581hM5180a = C2581h.m5180a(c2575c.f11503e);
        synchronized (c2581hM5180a) {
            i3 = c2581hM5180a.f11520e;
            c2581hM5180a.f11520e = i3 + 1;
        }
        return c2581hM5180a.m5181b(new C2595v(i3, bundle)).mo10934g(ExecutorC2576c0.f11509f, C2596w.f11544a);
    }
}
