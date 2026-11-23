package p007c.p190n.p194b.p266d.p267a.p282z;

import android.content.SharedPreferences;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2311z0;
import p007c.p190n.p194b.p266d.p314j.p315a.C2849an;
import p007c.p190n.p194b.p266d.p314j.p315a.cw0;
import p007c.p190n.p194b.p266d.p314j.p315a.kv1;
import p007c.p190n.p194b.p266d.p314j.p315a.qu1;

/* JADX INFO: renamed from: c.n.b.d.a.z.f */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2315f implements qu1 {

    /* JADX INFO: renamed from: a */
    public static final qu1 f10836a = new C2315f();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
    /* JADX INFO: renamed from: a */
    public final kv1 mo4612a(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            String string = jSONObject.getString("appSettingsJson");
            C2330u c2330u = C2330u.f10884a;
            C2311z0 c2311z0 = (C2311z0) c2330u.f10893h.m6649f();
            c2311z0.m4831a();
            synchronized (c2311z0.f10805a) {
                long jMo5623c = c2330u.f10896k.mo5623c();
                if (string == null || string.equals(c2311z0.f10816l.f12217e)) {
                    c2311z0.f10816l.f12218f = jMo5623c;
                } else {
                    c2311z0.f10816l = new C2849an(string, jMo5623c);
                    SharedPreferences.Editor editor = c2311z0.f10811g;
                    if (editor != null) {
                        editor.putString("app_settings_json", string);
                        c2311z0.f10811g.putLong("app_settings_last_update_ms", jMo5623c);
                        c2311z0.f10811g.apply();
                    }
                    c2311z0.m4832b();
                    Iterator<Runnable> it = c2311z0.f10807c.iterator();
                    while (it.hasNext()) {
                        it.next().run();
                    }
                }
            }
        }
        return cw0.m6231a(null);
    }
}
