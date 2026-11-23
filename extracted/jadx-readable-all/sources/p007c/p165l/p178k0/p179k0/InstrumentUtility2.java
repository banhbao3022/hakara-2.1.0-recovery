package p007c.p165l.p178k0.p179k0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.GraphRequest2;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.k0.k0.e, reason: use source file name */
/* JADX INFO: compiled from: InstrumentUtility.java */
/* JADX INFO: loaded from: classes.dex */
public final class InstrumentUtility2 {
    /* JADX INFO: renamed from: a */
    public static boolean m2504a(String str) {
        File fileM2505b = m2505b();
        if (fileM2505b == null || str == null) {
            return false;
        }
        return new File(fileM2505b, str).delete();
    }

    /* JADX INFO: renamed from: b */
    public static File m2505b() {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        File file = new File(FacebookSdk.f5360i.getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m2506c(String str, boolean z) {
        File fileM2505b = m2505b();
        if (fileM2505b != null && str != null) {
            try {
                return new JSONObject(Utility.m2436I(new FileInputStream(new File(fileM2505b, str))));
            } catch (Exception unused) {
                if (z) {
                    m2504a(str);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m2507d(String str, JSONArray jSONArray, GraphRequest2.c cVar) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            GraphRequest2.m2676m(null, String.format("%s/instruments", FacebookSdk.f5354c), jSONObject, cVar).m2688e();
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2508e(String str, String str2) {
        File fileM2505b = m2505b();
        if (fileM2505b == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileM2505b, str));
            fileOutputStream.write(str2.getBytes());
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
