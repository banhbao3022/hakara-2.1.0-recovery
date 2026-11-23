package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.f9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3021f9 implements InterfaceC3464r8<Object> {

    /* JADX INFO: renamed from: a */
    public final Object f13996a = new Object();

    /* JADX INFO: renamed from: b */
    public final Map<String, InterfaceC2984e9> f13997b = new HashMap();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map<String, String> map) {
        String strConcat;
        String str = map.get("id");
        String str2 = map.get("fail");
        String str3 = map.get("fail_reason");
        String str4 = map.get("fail_stack");
        String str5 = map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            strConcat = "";
        } else {
            String strValueOf = String.valueOf(str4);
            strConcat = strValueOf.length() != 0 ? "\n".concat(strValueOf) : new String("\n");
        }
        synchronized (this.f13996a) {
            InterfaceC2984e9 interfaceC2984e9Remove = this.f13997b.remove(str);
            if (interfaceC2984e9Remove == null) {
                String strValueOf2 = String.valueOf(str);
                C2622l.m5226A3(strValueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(strValueOf2) : new String("Received result for unexpected method invocation: "));
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                String strValueOf3 = String.valueOf(str3);
                String strValueOf4 = String.valueOf(strConcat);
                interfaceC2984e9Remove.mo6167t(strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3));
            } else {
                if (str5 == null) {
                    interfaceC2984e9Remove.mo6168u(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (C2096e.m4556E()) {
                        String strValueOf5 = String.valueOf(jSONObject.toString(2));
                        C2096e.m4590z(strValueOf5.length() != 0 ? "Result GMSG: ".concat(strValueOf5) : new String("Result GMSG: "));
                    }
                    interfaceC2984e9Remove.mo6168u(jSONObject);
                } catch (JSONException e) {
                    interfaceC2984e9Remove.mo6167t(e.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6782b(String str, InterfaceC2984e9 interfaceC2984e9) {
        synchronized (this.f13996a) {
            this.f13997b.put(str, interfaceC2984e9);
        }
    }
}
