package p007c.p165l.p166h0.p168c0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.AccessToken;
import p007c.p165l.FacebookSdk;
import p007c.p165l.GraphRequest2;
import p007c.p165l.GraphResponse;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Logger3;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.c0.l, reason: use source file name */
/* JADX INFO: compiled from: ViewIndexer.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewIndexer3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f4657f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ViewIndexer5 f4658g;

    public ViewIndexer3(ViewIndexer5 viewIndexer5, String str) {
        this.f4658g = viewIndexer5;
        this.f4657f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String strM2460s = Utility.m2460s("MD5", this.f4657f.getBytes());
        AccessToken accessTokenM2247b = AccessToken.m2247b();
        if (strM2460s == null || !strM2460s.equals(this.f4658g.f4663e)) {
            String str2 = this.f4657f;
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            String str3 = FacebookSdk.f5354c;
            GraphRequest2 graphRequest2M2676m = null;
            if (str2 != null) {
                graphRequest2M2676m = GraphRequest2.m2676m(accessTokenM2247b, String.format(Locale.US, "%s/app_indexing", str3), null, null);
                Bundle bundle = graphRequest2M2676m.f5380i;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString("tree", str2);
                Validate.m2479h();
                Context context = FacebookSdk.f5360i;
                try {
                    str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException unused) {
                    str = "";
                }
                bundle.putString("app_version", str);
                bundle.putString("platform", "android");
                bundle.putString("request_type", "app_indexing");
                if (CodelessManager3.f4628d == null) {
                    CodelessManager3.f4628d = UUID.randomUUID().toString();
                }
                bundle.putString("device_session_id", CodelessManager3.f4628d);
                graphRequest2M2676m.f5380i = bundle;
                graphRequest2M2676m.m2691u(new ViewIndexer4());
            }
            if (graphRequest2M2676m != null) {
                GraphResponse graphResponseM2687d = graphRequest2M2676m.m2687d();
                try {
                    JSONObject jSONObject = graphResponseM2687d.f5408c;
                    if (jSONObject == null) {
                        Log.e(ViewIndexer5.f4659a, "Error sending UI component tree to Facebook: " + graphResponseM2687d.f5409d);
                        return;
                    }
                    if ("true".equals(jSONObject.optString("success"))) {
                        String str4 = ViewIndexer5.f4659a;
                        HashMap<String, String> map = Logger3.f5043a;
                        synchronized (FacebookSdk.f5352a) {
                        }
                        this.f4658g.f4663e = strM2460s;
                    }
                    if (jSONObject.has("is_app_indexing_enabled")) {
                        CodelessManager3.f4630f = Boolean.valueOf(jSONObject.getBoolean("is_app_indexing_enabled"));
                    }
                } catch (JSONException e) {
                    Log.e(ViewIndexer5.f4659a, "Error decoding server response.", e);
                }
            }
        }
    }
}
