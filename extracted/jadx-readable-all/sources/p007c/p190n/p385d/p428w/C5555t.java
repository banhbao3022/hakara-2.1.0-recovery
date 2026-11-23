package p007c.p190n.p385d.p428w;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.w.t */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class C5555t {

    /* JADX INFO: renamed from: a */
    public final Bundle f27289a;

    public C5555t(Bundle bundle) {
        Objects.requireNonNull(bundle, "data");
        this.f27289a = new Bundle(bundle);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m12190l(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    /* JADX INFO: renamed from: n */
    public static String m12191n(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* JADX INFO: renamed from: a */
    public boolean m12192a(String str) {
        String strM12201j = m12201j(str);
        return "1".equals(strM12201j) || Boolean.parseBoolean(strM12201j);
    }

    /* JADX INFO: renamed from: b */
    public Integer m12193b(String str) {
        String strM12201j = m12201j(str);
        if (TextUtils.isEmpty(strM12201j)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strM12201j));
        } catch (NumberFormatException unused) {
            String strM12191n = m12191n(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strM12191n).length() + 38 + String.valueOf(strM12201j).length());
            outline.m1572W(sb, "Couldn't parse value of ", strM12191n, "(", strM12201j);
            outline.m1571V(sb, ") into an int", "NotificationParams");
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public JSONArray m12194c(String str) {
        String strM12201j = m12201j(str);
        if (TextUtils.isEmpty(strM12201j)) {
            return null;
        }
        try {
            return new JSONArray(strM12201j);
        } catch (JSONException unused) {
            String strM12191n = m12191n(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strM12191n).length() + 50 + String.valueOf(strM12201j).length());
            outline.m1572W(sb, "Malformed JSON for key ", strM12191n, ": ", strM12201j);
            outline.m1571V(sb, ", falling back to default", "NotificationParams");
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public int[] m12195d() {
        JSONArray jSONArrayM12194c = m12194c("gcm.n.light_settings");
        if (jSONArrayM12194c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayM12194c.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayM12194c.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayM12194c.optInt(1);
            iArr[2] = jSONArrayM12194c.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            String strValueOf = String.valueOf(jSONArrayM12194c);
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(strValueOf.length() + 60 + String.valueOf(message).length());
            outline.m1572W(sb, "LightSettings is invalid: ", strValueOf, ". ", message);
            outline.m1571V(sb, ". Skipping setting LightSettings", "NotificationParams");
            return null;
        } catch (JSONException unused) {
            String strValueOf2 = String.valueOf(jSONArrayM12194c);
            outline.m1573X(new StringBuilder(strValueOf2.length() + 58), "LightSettings is invalid: ", strValueOf2, ". Skipping setting LightSettings", "NotificationParams");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public Uri m12196e() {
        String strM12201j = m12201j("gcm.n.link_android");
        if (TextUtils.isEmpty(strM12201j)) {
            strM12201j = m12201j("gcm.n.link");
        }
        if (TextUtils.isEmpty(strM12201j)) {
            return null;
        }
        return Uri.parse(strM12201j);
    }

    /* JADX INFO: renamed from: f */
    public Object[] m12197f(String str) {
        JSONArray jSONArrayM12194c = m12194c(String.valueOf(str).concat("_loc_args"));
        if (jSONArrayM12194c == null) {
            return null;
        }
        int length = jSONArrayM12194c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayM12194c.optString(i);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: g */
    public String m12198g(String str) {
        return m12201j(String.valueOf(str).concat("_loc_key"));
    }

    /* JADX INFO: renamed from: h */
    public Long m12199h(String str) {
        String strM12201j = m12201j(str);
        if (TextUtils.isEmpty(strM12201j)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strM12201j));
        } catch (NumberFormatException unused) {
            String strM12191n = m12191n(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strM12191n).length() + 38 + String.valueOf(strM12201j).length());
            outline.m1572W(sb, "Couldn't parse value of ", strM12191n, "(", strM12201j);
            outline.m1571V(sb, ") into a long", "NotificationParams");
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public String m12200i(Resources resources, String str, String str2) {
        String strM12201j = m12201j(str2);
        if (!TextUtils.isEmpty(strM12201j)) {
            return strM12201j;
        }
        String strM12198g = m12198g(str2);
        if (TextUtils.isEmpty(strM12198g)) {
            return null;
        }
        int identifier = resources.getIdentifier(strM12198g, "string", str);
        if (identifier == 0) {
            String strM12191n = m12191n(str2.concat("_loc_key"));
            Log.w("NotificationParams", outline.m1553D(new StringBuilder(String.valueOf(strM12191n).length() + 49 + str2.length()), strM12191n, " resource not found: ", str2, " Default value will be used."));
            return null;
        }
        Object[] objArrM12197f = m12197f(str2);
        if (objArrM12197f == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrM12197f);
        } catch (MissingFormatArgumentException e) {
            String strM12191n2 = m12191n(str2);
            String string = Arrays.toString(objArrM12197f);
            StringBuilder sb = new StringBuilder(String.valueOf(strM12191n2).length() + 58 + String.valueOf(string).length());
            outline.m1572W(sb, "Missing format argument for ", strM12191n2, ": ", string);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public String m12201j(String str) {
        Bundle bundle = this.f27289a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (this.f27289a.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    /* JADX INFO: renamed from: k */
    public long[] m12202k() {
        JSONArray jSONArrayM12194c = m12194c("gcm.n.vibrate_timings");
        if (jSONArrayM12194c == null) {
            return null;
        }
        try {
            if (jSONArrayM12194c.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayM12194c.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayM12194c.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            String strValueOf = String.valueOf(jSONArrayM12194c);
            outline.m1573X(new StringBuilder(strValueOf.length() + 74), "User defined vibrateTimings is invalid: ", strValueOf, ". Skipping setting vibrateTimings.", "NotificationParams");
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public Bundle m12203m() {
        Bundle bundle = new Bundle(this.f27289a);
        for (String str : this.f27289a.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
