package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Build;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class lo1 {

    /* JADX INFO: renamed from: b */
    public long f16432b = System.nanoTime();

    /* JADX INFO: renamed from: c */
    public int f16433c = 1;

    /* JADX INFO: renamed from: a */
    public hp1 f16431a = new hp1(null);

    /* JADX INFO: renamed from: a */
    public void mo7594a() {
    }

    /* JADX INFO: renamed from: b */
    public void mo7595b() {
        this.f16431a.clear();
    }

    /* JADX INFO: renamed from: c */
    public final WebView m7596c() {
        return this.f16431a.get();
    }

    /* JADX INFO: renamed from: d */
    public void mo7597d(nn1 nn1Var, ln1 ln1Var) {
        m7598e(nn1Var, ln1Var, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m7598e(nn1 nn1Var, ln1 ln1Var, JSONObject jSONObject) {
        String str = nn1Var.f17182h;
        JSONObject jSONObject2 = new JSONObject();
        po1.m8133b(jSONObject2, "environment", "app");
        po1.m8133b(jSONObject2, "adSessionType", ln1Var.f16413g);
        JSONObject jSONObject3 = new JSONObject();
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        po1.m8133b(jSONObject3, "deviceType", outline.m1552C(new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str3).length()), str2, "; ", str3));
        po1.m8133b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        po1.m8133b(jSONObject3, "os", "Android");
        po1.m8133b(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        po1.m8133b(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        po1.m8133b(jSONObject4, "partnerName", ln1Var.f16407a.f19627a);
        po1.m8133b(jSONObject4, "partnerVersion", ln1Var.f16407a.f19628b);
        po1.m8133b(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        po1.m8133b(jSONObject5, "libraryVersion", "1.3.3-google_20200416");
        po1.m8133b(jSONObject5, "appId", co1.f13066a.f13067b.getApplicationContext().getPackageName());
        po1.m8133b(jSONObject2, "app", jSONObject5);
        String str4 = ln1Var.f16412f;
        if (str4 != null) {
            po1.m8133b(jSONObject2, "contentUrl", str4);
        }
        po1.m8133b(jSONObject2, "customReferenceData", ln1Var.f16411e);
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = Collections.unmodifiableList(ln1Var.f16409c).iterator();
        if (it.hasNext()) {
            throw null;
        }
        eo1.m6651a(m7596c(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }

    /* JADX INFO: renamed from: f */
    public final void m7599f(float f) {
        eo1.m6651a(m7596c(), "setDeviceVolume", Float.valueOf(f));
    }
}
