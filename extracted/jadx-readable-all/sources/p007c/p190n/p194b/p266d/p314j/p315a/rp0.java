package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.C2191r;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rp0 extends AbstractBinderC3206k9 {

    /* JADX INFO: renamed from: f */
    public final tp0 f19019f;

    /* JADX INFO: renamed from: g */
    public final pp0 f19020g;

    /* JADX INFO: renamed from: h */
    public final Map<Long, np0> f19021h = new HashMap();

    public rp0(tp0 tp0Var, pp0 pp0Var) {
        this.f19019f = tp0Var;
        this.f19020g = pp0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX INFO: renamed from: F6 */
    public static ew2 m8318F6(Map<String, String> map) {
        fw2 fw2Var = new fw2();
        String str = map.get("ad_request");
        if (str == null) {
            return fw2Var.m6890a();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "extras":
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        fw2Var.f14122a = bundle;
                        break;
                    case "keywords":
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        fw2Var.f14123b = arrayList;
                        break;
                    case "isTestDevice":
                        fw2Var.f14124c = jsonReader.nextBoolean();
                        break;
                    case "tagForChildDirectedTreatment":
                        if (!jsonReader.nextBoolean()) {
                            fw2Var.f14125d = 0;
                            break;
                        } else {
                            fw2Var.f14125d = 1;
                            break;
                        }
                        break;
                    case "tagForUnderAgeOfConsent":
                        if (!jsonReader.nextBoolean()) {
                            fw2Var.f14129h = 0;
                            break;
                        } else {
                            fw2Var.f14129h = 1;
                            break;
                        }
                        break;
                    case "maxAdContentRating":
                        String strNextString = jsonReader.nextString();
                        if (!C2191r.f10581a.contains(strNextString)) {
                            break;
                        } else {
                            fw2Var.f14130i = strNextString;
                            break;
                        }
                        break;
                    case "httpTimeoutMillis":
                        fw2Var.f14132k = jsonReader.nextInt();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            C2622l.m5318U2("Ad Request json was malformed, parsing ended early.");
        }
        ew2 ew2VarM6890a = fw2Var.m6890a();
        Bundle bundle2 = ew2VarM6890a.f13725r.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = ew2VarM6890a.f13715h;
            ew2VarM6890a.f13725r.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new ew2(ew2VarM6890a.f13713f, ew2VarM6890a.f13714g, bundle2, ew2VarM6890a.f13716i, ew2VarM6890a.f13717j, ew2VarM6890a.f13718k, ew2VarM6890a.f13719l, ew2VarM6890a.f13720m, ew2VarM6890a.f13721n, ew2VarM6890a.f13722o, ew2VarM6890a.f13723p, ew2VarM6890a.f13724q, ew2VarM6890a.f13725r, ew2VarM6890a.f13726s, ew2VarM6890a.f13727t, ew2VarM6890a.f13728u, ew2VarM6890a.f13729v, ew2VarM6890a.f13730w, ew2VarM6890a.f13731x, ew2VarM6890a.f13732y, ew2VarM6890a.f13733z, ew2VarM6890a.f13711A, ew2VarM6890a.f13712B);
    }
}
