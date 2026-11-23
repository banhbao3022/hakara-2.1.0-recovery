package p007c.p190n.p194b.p266d.p298f.p307u;

import java.util.Iterator;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.n.b.d.f.u.f */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2786f {
    static {
        Pattern.compile("\\\\.");
        Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5628a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                try {
                    Objects.requireNonNull(next, "null reference");
                    if (!m5628a(jSONObject.get(next), jSONObject2.get(next))) {
                        return false;
                    }
                } catch (JSONException unused) {
                }
            }
            return true;
        }
        if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
            return obj.equals(obj2);
        }
        JSONArray jSONArray = (JSONArray) obj;
        JSONArray jSONArray2 = (JSONArray) obj2;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if (!m5628a(jSONArray.get(i), jSONArray2.get(i))) {
                    return false;
                }
            } catch (JSONException unused2) {
            }
        }
        return true;
    }
}
