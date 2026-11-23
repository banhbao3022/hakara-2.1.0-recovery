package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class po1 {

    /* JADX INFO: renamed from: a */
    public static WindowManager f18046a;

    /* JADX INFO: renamed from: b */
    public static final String[] f18047b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c */
    public static float f18048c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: a */
    public static JSONObject m8132a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / f18048c);
            jSONObject.put("y", i2 / f18048c);
            jSONObject.put("width", i3 / f18048c);
            jSONObject.put("height", i4 / f18048c);
        } catch (JSONException e) {
            C2622l.m5351c1("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static void m8133b(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            C2622l.m5351c1(sb.toString(), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8134c(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            q62.f18207a.mo7443b(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m8135d(JSONObject jSONObject) {
        float f;
        float f2 = 0.0f;
        if (f18046a != null) {
            Point point = new Point(0, 0);
            f18046a.getDefaultDisplay().getRealSize(point);
            float f3 = point.x;
            float f4 = f18048c;
            f2 = f3 / f4;
            f = point.y / f4;
        } else {
            f = 0.0f;
        }
        try {
            jSONObject.put("width", f2);
            jSONObject.put("height", f);
        } catch (JSONException e) {
            q62.f18207a.mo7443b(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f A[LOOP:1: B:38:0x007b->B:42:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0093 A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static boolean m8136e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        int i;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f18047b;
            for (int i2 = 0; i2 < 4; i2++) {
                String str = strArr[i2];
                if (jSONObject.optDouble(str) == jSONObject2.optDouble(str)) {
                }
            }
            if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""))) {
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("isFriendlyObstructionFor");
                JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                if (jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) {
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray == null) {
                    }
                    if (m8137f(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
                        for (i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            if (m8136e(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                            }
                        }
                        return true;
                    }
                } else if (m8137f(jSONArrayOptJSONArray3, jSONArrayOptJSONArray4)) {
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                        if (jSONArrayOptJSONArray3.optString(i3, "").equals(jSONArrayOptJSONArray4.optString(i3, ""))) {
                        }
                    }
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 != null) {
                        if (m8137f(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
                            while (i < jSONArrayOptJSONArray.length()) {
                                if (m8136e(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8137f(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
