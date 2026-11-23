package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.x7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3686x7 implements InterfaceC3464r8 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3464r8 f21444a = new C3686x7();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map map) {
        Intent uri;
        InterfaceC3485rt interfaceC3485rt = (InterfaceC3485rt) obj;
        InterfaceC3464r8<InterfaceC3410ps> interfaceC3464r8 = C3427q8.f18212a;
        PackageManager packageManager = interfaceC3485rt.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString("i");
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        if (TextUtils.isEmpty(strOptString7)) {
                            uri = null;
                        } else {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e) {
                                String strValueOf = String.valueOf(strOptString7);
                                C2622l.m5438t3(strValueOf.length() != 0 ? "Error parsing the url: ".concat(strValueOf) : new String("Error parsing the url: "), e);
                                uri = null;
                            }
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        try {
                            jSONObject.put(strOptString, packageManager.resolveActivity(uri, 65536) != null);
                        } catch (JSONException e2) {
                            C2622l.m5438t3("Error constructing openable urls response.", e2);
                        }
                    } catch (JSONException e3) {
                        C2622l.m5438t3("Error parsing the intent data.", e3);
                    }
                }
                ((InterfaceC3577ua) interfaceC3485rt).mo6433B0("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((InterfaceC3577ua) interfaceC3485rt).mo6433B0("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((InterfaceC3577ua) interfaceC3485rt).mo6433B0("openableIntents", new JSONObject());
        }
    }
}
