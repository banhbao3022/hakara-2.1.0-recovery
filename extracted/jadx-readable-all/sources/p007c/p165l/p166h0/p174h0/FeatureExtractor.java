package p007c.p165l.p166h0.p174h0;

import android.util.Patterns;
import com.facebook.stetho.common.Utf8Charset;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.l.h0.h0.a, reason: use source file name */
/* JADX INFO: compiled from: FeatureExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class FeatureExtractor {

    /* JADX INFO: renamed from: a */
    public static Map<String, String> f4802a = null;

    /* JADX INFO: renamed from: b */
    public static Map<String, String> f4803b = null;

    /* JADX INFO: renamed from: c */
    public static Map<String, String> f4804c = null;

    /* JADX INFO: renamed from: d */
    public static JSONObject f4805d = null;

    /* JADX INFO: renamed from: e */
    public static boolean f4806e = false;

    /* JADX INFO: renamed from: a */
    public static float[] m2335a(JSONObject jSONObject, String str) {
        if (!f4806e) {
            return null;
        }
        float[] fArr = new float[30];
        Arrays.fill(fArr, 0.0f);
        try {
            String lowerCase = str.toLowerCase();
            JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
            String strOptString = jSONObject.optString("screenname");
            JSONArray jSONArray = new JSONArray();
            m2341g(jSONObject2, jSONArray);
            m2344j(fArr, m2340f(jSONObject2));
            JSONObject jSONObjectM2336b = m2336b(jSONObject2);
            if (jSONObjectM2336b == null) {
                return null;
            }
            m2344j(fArr, m2339e(jSONObjectM2336b, jSONArray, strOptString, jSONObject2.toString(), lowerCase));
        } catch (JSONException unused) {
        }
        return fArr;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m2336b(JSONObject jSONObject) {
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectM2336b = m2336b(jSONArrayOptJSONArray.getJSONObject(i));
                if (jSONObjectM2336b != null) {
                    return jSONObjectM2336b;
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m2337c(File file) {
        try {
            f4805d = new JSONObject();
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            f4805d = new JSONObject(new String(bArr, Utf8Charset.NAME));
            HashMap map = new HashMap();
            f4802a = map;
            map.put("ENGLISH", "1");
            f4802a.put("GERMAN", "2");
            f4802a.put("SPANISH", "3");
            f4802a.put("JAPANESE", "4");
            HashMap map2 = new HashMap();
            f4803b = map2;
            map2.put("VIEW_CONTENT", "0");
            f4803b.put("SEARCH", "1");
            f4803b.put("ADD_TO_CART", "2");
            f4803b.put("ADD_TO_WISHLIST", "3");
            f4803b.put("INITIATE_CHECKOUT", "4");
            f4803b.put("ADD_PAYMENT_INFO", "5");
            f4803b.put("PURCHASE", "6");
            f4803b.put("LEAD", "7");
            f4803b.put("COMPLETE_REGISTRATION", "8");
            HashMap map3 = new HashMap();
            f4804c = map3;
            map3.put("BUTTON_TEXT", "1");
            f4804c.put("PAGE_TITLE", "2");
            f4804c.put("RESOLVED_DOCUMENT_LINK", "3");
            f4804c.put("BUTTON_ID", "4");
            f4806e = true;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2338d(String[] strArr, String[] strArr2) {
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (str2.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static float[] m2339e(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float[] fArr = new float[30];
        Arrays.fill(fArr, 0.0f);
        int length = jSONArray.length();
        fArr[3] = length > 1 ? length - 1 : 0;
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if ((jSONArray.getJSONObject(i).optInt("classtypebitmask") & 32) > 0) {
                    fArr[9] = fArr[9] + 1.0f;
                }
            } catch (JSONException unused) {
            }
        }
        fArr[13] = -1.0f;
        fArr[14] = -1.0f;
        String str4 = str + '|' + str3;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        m2345k(jSONObject, sb, sb2);
        String string = sb.toString();
        String string2 = sb2.toString();
        fArr[15] = m2343i("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
        fArr[16] = m2343i("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
        fArr[17] = m2343i("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", string) ? 1.0f : 0.0f;
        fArr[18] = str2.contains("password") ? 1.0f : 0.0f;
        fArr[19] = m2342h("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
        fArr[20] = m2342h("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
        fArr[21] = m2342h("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
        fArr[22] = m2343i("ENGLISH", "PURCHASE", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
        fArr[24] = m2343i("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
        fArr[25] = m2342h("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2) ? 1.0f : 0.0f;
        fArr[27] = m2342h("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
        fArr[28] = m2343i("ENGLISH", "LEAD", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
        fArr[29] = m2343i("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
        return fArr;
    }

    /* JADX INFO: renamed from: f */
    public static float[] m2340f(JSONObject jSONObject) {
        float[] fArr = new float[30];
        Arrays.fill(fArr, 0.0f);
        String lowerCase = jSONObject.optString("text").toLowerCase();
        String lowerCase2 = jSONObject.optString("hint").toLowerCase();
        String lowerCase3 = jSONObject.optString("classname").toLowerCase();
        int iOptInt = jSONObject.optInt("inputtype", -1);
        String[] strArr = {lowerCase, lowerCase2};
        if (m2338d(new String[]{"$", "amount", "price", "total"}, strArr)) {
            fArr[0] = (float) (((double) fArr[0]) + 1.0d);
        }
        if (m2338d(new String[]{"password", "pwd"}, strArr)) {
            fArr[1] = (float) (((double) fArr[1]) + 1.0d);
        }
        if (m2338d(new String[]{"tel", "phone"}, strArr)) {
            fArr[2] = (float) (((double) fArr[2]) + 1.0d);
        }
        if (m2338d(new String[]{"search"}, strArr)) {
            fArr[4] = (float) (((double) fArr[4]) + 1.0d);
        }
        if (iOptInt >= 0) {
            fArr[5] = (float) (((double) fArr[5]) + 1.0d);
        }
        if (iOptInt == 3 || iOptInt == 2) {
            fArr[6] = (float) (((double) fArr[6]) + 1.0d);
        }
        if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
            fArr[7] = (float) (((double) fArr[7]) + 1.0d);
        }
        if (lowerCase3.contains("checkbox")) {
            fArr[8] = (float) (((double) fArr[8]) + 1.0d);
        }
        if (m2338d(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
            fArr[10] = (float) (((double) fArr[10]) + 1.0d);
        }
        if (lowerCase3.contains("radio") && lowerCase3.contains("button")) {
            fArr[12] = (float) (((double) fArr[12]) + 1.0d);
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                m2344j(fArr, m2340f(jSONArrayOptJSONArray.getJSONObject(i)));
            }
        } catch (JSONException unused) {
        }
        return fArr;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2341g(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        boolean z2;
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            int i = 0;
            while (true) {
                if (i >= jSONArrayOptJSONArray.length()) {
                    z = false;
                    z2 = false;
                    break;
                }
                if (jSONArrayOptJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                    z = true;
                    z2 = true;
                    break;
                }
                i++;
            }
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i2));
                }
            } else {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                    if (m2341g(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2342h(String str, String str2) {
        return Pattern.compile(str).matcher(str2).find();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2343i(String str, String str2, String str3, String str4) {
        return m2342h(f4805d.optJSONObject("rulesForLanguage").optJSONObject(f4802a.get(str)).optJSONObject("rulesForEvent").optJSONObject(f4803b.get(str2)).optJSONObject("positiveRules").optString(f4804c.get(str3)), str4);
    }

    /* JADX INFO: renamed from: j */
    public static void m2344j(float[] fArr, float[] fArr2) {
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = fArr[i] + fArr2[i];
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m2345k(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        String lowerCase = jSONObject.optString("text", "").toLowerCase();
        String lowerCase2 = jSONObject.optString("hint", "").toLowerCase();
        if (!lowerCase.isEmpty()) {
            sb.append(lowerCase);
            sb.append(" ");
        }
        if (!lowerCase2.isEmpty()) {
            sb2.append(lowerCase2);
            sb2.append(" ");
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            m2345k(jSONObject, sb, sb2);
        }
    }
}
