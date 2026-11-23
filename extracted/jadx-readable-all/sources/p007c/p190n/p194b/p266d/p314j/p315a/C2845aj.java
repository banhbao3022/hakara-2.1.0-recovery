package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.aj */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2845aj extends AbstractC2882bj {

    /* JADX INFO: renamed from: a */
    public final Object f12180a = new Object();

    /* JADX INFO: renamed from: b */
    public final Context f12181b;

    /* JADX INFO: renamed from: c */
    public SharedPreferences f12182c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3098hc<JSONObject, JSONObject> f12183d;

    public C2845aj(Context context, InterfaceC3098hc<JSONObject, JSONObject> interfaceC3098hc) {
        this.f12181b = context.getApplicationContext();
        this.f12183d = interfaceC3098hc;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m5816b(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", C3702xn.m8742H().f21615f);
            jSONObject.put("mf", C3423q4.f18189a.m6603d());
            jSONObject.put("cl", "367272508");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.m12665b(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC2882bj
    /* JADX INFO: renamed from: a */
    public final kv1<Void> mo5817a() {
        synchronized (this.f12180a) {
            if (this.f12182c == null) {
                this.f12182c = this.f12181b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (C2330u.f10884a.f10896k.mo5623c() - this.f12182c.getLong("js_last_update", 0L) < C3423q4.f18190b.m6603d().longValue()) {
            return cw0.m6231a(null);
        }
        return cw0.m6250t(((C3617vc) this.f12183d).m8544b(m5816b(this.f12181b)), new cs1(this) { // from class: c.n.b.d.j.a.zi

            /* JADX INFO: renamed from: a */
            public final C2845aj f22290a;

            {
                this.f22290a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
            public final Object apply(Object obj) {
                C2845aj c2845aj = this.f22290a;
                JSONObject jSONObject = (JSONObject) obj;
                Context context = c2845aj.f12181b;
                AbstractC3718y2<String> abstractC3718y2 = C3052g3.f14310a;
                C2862b c2862b = C2862b.f12493a;
                C2829a3 c2829a3 = c2862b.f12495c;
                SharedPreferences.Editor editorEdit = context.getSharedPreferences("google_ads_flags", 0).edit();
                C3755z2 c3755z2 = c2862b.f12494b;
                C2979e4<Boolean> c2979e4 = C3127i4.f15087a;
                for (AbstractC3718y2<?> abstractC3718y3 : c3755z2.f22156a) {
                    if (abstractC3718y3.f21730a == 1) {
                        abstractC3718y3.mo8392b(editorEdit, abstractC3718y3.mo8393c(jSONObject));
                    }
                }
                if (jSONObject != null) {
                    editorEdit.putString("flag_configuration", jSONObject.toString());
                } else {
                    C2622l.m5408n3("Flag Json is null.");
                }
                C2829a3 c2829a4 = C2862b.f12493a.f12495c;
                editorEdit.commit();
                c2845aj.f12182c.edit().putLong("js_last_update", C2330u.f10884a.f10896k.mo5623c()).apply();
                return null;
            }
        }, C2962do.f13335f);
    }
}
