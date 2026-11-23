package p007c.p165l.p166h0;

import android.os.Bundle;
import android.util.Log;
import com.facebook.stetho.common.Utf8Charset;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.p170d0.EventDeactivationManager;
import p007c.p165l.p166h0.p171e0.AppEventUtility;
import p007c.p165l.p166h0.p172f0.ModelManager4;
import p007c.p165l.p166h0.p173g0.AddressFilterManager;
import p007c.p165l.p166h0.p173g0.RestrictiveDataManager;
import p007c.p165l.p178k0.Logger3;

/* JADX INFO: renamed from: c.l.h0.d, reason: use source file name */
/* JADX INFO: compiled from: AppEvent.java */
/* JADX INFO: loaded from: classes.dex */
public class AppEvent implements Serializable {

    /* JADX INFO: renamed from: f */
    public static final HashSet<String> f4692f = new HashSet<>();

    /* JADX INFO: renamed from: g */
    public final JSONObject f4693g;

    /* JADX INFO: renamed from: h */
    public final boolean f4694h;

    /* JADX INFO: renamed from: i */
    public final boolean f4695i;

    /* JADX INFO: renamed from: j */
    public final String f4696j;

    /* JADX INFO: renamed from: k */
    public final String f4697k;

    /* JADX INFO: renamed from: c.l.h0.d$b */
    /* JADX INFO: compiled from: AppEvent.java */
    public static class b implements Serializable {
        private Object readResolve() throws JSONException {
            return new AppEvent(null, false, false, null, null);
        }
    }

    /* JADX INFO: renamed from: c.l.h0.d$c */
    /* JADX INFO: compiled from: AppEvent.java */
    public static class c implements Serializable {

        /* JADX INFO: renamed from: f */
        public final String f4698f;

        /* JADX INFO: renamed from: g */
        public final boolean f4699g;

        /* JADX INFO: renamed from: h */
        public final boolean f4700h;

        /* JADX INFO: renamed from: i */
        public final String f4701i;

        public c(String str, boolean z, boolean z2, String str2, a aVar) {
            this.f4698f = str;
            this.f4699g = z;
            this.f4700h = z2;
            this.f4701i = str2;
        }

        private Object readResolve() throws JSONException {
            return new AppEvent(this.f4698f, this.f4699g, this.f4700h, this.f4701i, null);
        }
    }

    public AppEvent(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) throws JSONException, FacebookException {
        String str3;
        this.f4694h = z;
        this.f4695i = z2;
        this.f4696j = str2;
        m2308b(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_eventName", str2);
        jSONObject.put("_eventName_md5", m2307a(str2));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            HashMap map = new HashMap();
            for (String str4 : bundle.keySet()) {
                m2308b(str4);
                Object obj = bundle.get(str4);
                if (!(obj instanceof String) && !(obj instanceof Number)) {
                    throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", obj, str4));
                }
                map.put(str4, obj.toString());
            }
            if (AddressFilterManager.f4794a && map.size() != 0) {
                try {
                    ArrayList<String> arrayList = new ArrayList(map.keySet());
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str5 : arrayList) {
                        String str6 = (String) map.get(str5);
                        float[] fArr = new float[30];
                        Arrays.fill(fArr, 0.0f);
                        String strM2334c = ModelManager4.m2334c("DATA_DETECTION_ADDRESS", fArr, str6);
                        if (strM2334c != null && strM2334c.equals("SHOULD_FILTER")) {
                            map.remove(str5);
                            if (!AddressFilterManager.f4795b) {
                                str6 = "";
                            }
                            jSONObject2.put(str5, str6);
                        }
                    }
                    if (jSONObject2.length() != 0) {
                        map.put("_onDeviceParams", jSONObject2.toString());
                    }
                } catch (Exception unused) {
                }
            }
            String str7 = this.f4696j;
            if (RestrictiveDataManager.f4796a) {
                HashMap map2 = new HashMap();
                for (String str8 : new ArrayList(map.keySet())) {
                    try {
                        Iterator it = new ArrayList(RestrictiveDataManager.f4798c).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                str3 = null;
                                break;
                            }
                            RestrictiveDataManager.a aVar = (RestrictiveDataManager.a) it.next();
                            if (aVar != null && str7.equals(aVar.f4799a)) {
                                for (String str9 : aVar.f4800b.keySet()) {
                                    if (str8.equals(str9)) {
                                        str3 = aVar.f4800b.get(str9);
                                        break;
                                    }
                                    str3 = null;
                                }
                            }
                        }
                    } catch (Exception e) {
                        Log.w(RestrictiveDataManager.f4797b, "getMatchedRuleType failed", e);
                    }
                    if (str3 != null) {
                        map2.put(str8, str3);
                        map.remove(str8);
                    }
                }
                if (map2.size() > 0) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject3.put((String) entry.getKey(), entry.getValue());
                        }
                        map.put("_restrictedParams", jSONObject3.toString());
                    } catch (JSONException unused2) {
                    }
                }
            }
            String str10 = this.f4696j;
            if (EventDeactivationManager.f4702a) {
                ArrayList<String> arrayList2 = new ArrayList(map.keySet());
                for (EventDeactivationManager.a aVar2 : new ArrayList(EventDeactivationManager.f4703b)) {
                    if (aVar2.f4705a.equals(str10)) {
                        for (String str11 : arrayList2) {
                            if (aVar2.f4706b.contains(str11)) {
                                map.remove(str11);
                            }
                        }
                    }
                }
            }
            for (String str12 : map.keySet()) {
                jSONObject.put(str12, map.get(str12));
            }
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (this.f4695i) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f4694h) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            jSONObject.toString();
            HashMap<String, String> map3 = Logger3.f5043a;
            synchronized (FacebookSdk.f5352a) {
            }
        }
        this.f4693g = jSONObject;
        this.f4697k = m2307a(jSONObject.toString());
    }

    /* JADX INFO: renamed from: a */
    public static String m2307a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(Utf8Charset.NAME);
            messageDigest.update(bytes, 0, bytes.length);
            return AppEventUtility.m2315a(messageDigest.digest());
        } catch (UnsupportedEncodingException unused) {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            return "1";
        } catch (NoSuchAlgorithmException unused2) {
            HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
            return "0";
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2308b(String str) throws FacebookException {
        boolean zContains;
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", str, 40));
        }
        HashSet<String> hashSet = f4692f;
        synchronized (hashSet) {
            zContains = hashSet.contains(str);
        }
        if (zContains) {
            return;
        }
        if (!str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
            throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", str));
        }
        synchronized (hashSet) {
            hashSet.add(str);
        }
    }

    private Object writeReplace() {
        return new c(this.f4693g.toString(), this.f4694h, this.f4695i, this.f4697k, null);
    }

    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", this.f4693g.optString("_eventName"), Boolean.valueOf(this.f4694h), this.f4693g.toString());
    }

    public AppEvent(String str, boolean z, boolean z2, String str2, a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.f4693g = jSONObject;
        this.f4694h = z;
        this.f4696j = jSONObject.optString("_eventName");
        this.f4697k = str2;
        this.f4695i = z2;
    }
}
