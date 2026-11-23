package p007c.p190n.p194b.p266d.p267a.p282z;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C2849an;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C2962do;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3147io;
import p007c.p190n.p194b.p266d.p314j.p315a.C3320nc;
import p007c.p190n.p194b.p266d.p314j.p315a.C3357oc;
import p007c.p190n.p194b.p266d.p314j.p315a.C3468rc;
import p007c.p190n.p194b.p266d.p314j.p315a.C3617vc;
import p007c.p190n.p194b.p266d.p314j.p315a.C3702xn;
import p007c.p190n.p194b.p266d.p314j.p315a.cw0;
import p007c.p190n.p194b.p266d.p314j.p315a.kv1;
import p007c.p190n.p194b.p266d.p314j.p315a.qu1;

/* JADX INFO: renamed from: c.n.b.d.a.z.g */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2316g {

    /* JADX INFO: renamed from: a */
    public Context f10837a;

    /* JADX INFO: renamed from: b */
    public long f10838b = 0;

    /* JADX INFO: renamed from: a */
    public final void m4845a(Context context, C3702xn c3702xn, boolean z, C2849an c2849an, String str, String str2, Runnable runnable) {
        C2330u c2330u = C2330u.f10884a;
        if (c2330u.f10896k.mo5621a() - this.f10838b < 5000) {
            C2622l.m5226A3("Not retrying to fetch app settings");
            return;
        }
        this.f10838b = c2330u.f10896k.mo5621a();
        if (c2849an != null) {
            long j2 = c2849an.f12218f;
            if (c2330u.f10896k.mo5623c() - j2 <= ((Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14320b2)).longValue() && c2849an.f12220h) {
                return;
            }
        }
        if (context == null) {
            C2622l.m5226A3("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            C2622l.m5226A3("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f10837a = applicationContext;
        C3468rc c3468rcM7228b = c2330u.f10902q.m7228b(applicationContext, c3702xn);
        C3320nc<JSONObject> c3320nc = C3357oc.f17593b;
        C3617vc c3617vc = new C3617vc(c3468rcM7228b.f18740c, "google.afma.config.fetchAppSettings", c3320nc, c3320nc);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            kv1 kv1VarM8544b = c3617vc.m8544b(jSONObject);
            qu1 qu1Var = C2315f.f10836a;
            Executor executor = C2962do.f13335f;
            kv1 kv1VarM6249s = cw0.m6249s(kv1VarM8544b, qu1Var, executor);
            if (runnable != null) {
                ((C3147io) kv1VarM8544b).f15328f.mo6230f(runnable, executor);
            }
            C2622l.m5320V0(kv1VarM6249s, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e) {
            C2622l.m5438t3("Error requesting application settings", e);
        }
    }
}
