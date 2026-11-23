package p007c.p165l.p178k0.p179k0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.k0.k0.a, reason: use source file name */
/* JADX INFO: compiled from: InstrumentData.java */
/* JADX INFO: loaded from: classes.dex */
public final class InstrumentData {

    /* JADX INFO: renamed from: a */
    public String f4962a;

    /* JADX INFO: renamed from: b */
    public String f4963b;

    /* JADX INFO: renamed from: c */
    public String f4964c;

    /* JADX INFO: renamed from: d */
    public String f4965d;

    /* JADX INFO: renamed from: e */
    public Long f4966e;

    /* JADX INFO: renamed from: f */
    public String f4967f;

    /* JADX INFO: renamed from: c.l.k0.k0.a$a */
    /* JADX INFO: compiled from: InstrumentData.java */
    public enum a {
        CrashReport,
        CrashShield,
        ThreadCheck;

        @Override // java.lang.Enum
        public String toString() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return "CrashReport";
            }
            if (iOrdinal != 1) {
                return iOrdinal != 2 ? "Unknown" : "ThreadCheck";
            }
            return "CrashShield";
        }
    }

    public InstrumentData(Throwable th, a aVar) {
        String str;
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        Context context = FacebookSdk.f5360i;
        String string = null;
        Throwable th2 = null;
        if (context == null) {
            str = null;
        } else {
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str = null;
            }
        }
        this.f4963b = str;
        this.f4964c = th == null ? null : th.getCause() == null ? th.toString() : th.getCause().toString();
        if (th != null) {
            JSONArray jSONArray = new JSONArray();
            while (th != null && th != th2) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    jSONArray.put(stackTraceElement.toString());
                }
                th2 = th;
                th = th.getCause();
            }
            string = jSONArray.toString();
        }
        this.f4965d = string;
        this.f4966e = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f4967f = aVar.toString();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("crash_log_");
        stringBuffer.append(this.f4966e.toString());
        stringBuffer.append(".json");
        this.f4962a = stringBuffer.toString();
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f4963b;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l = this.f4966e;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            String str2 = this.f4964c;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f4965d;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            String str4 = this.f4967f;
            if (str4 != null) {
                jSONObject.put("type", str4);
            }
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public InstrumentData(File file) {
        String name = file.getName();
        this.f4962a = name;
        JSONObject jSONObjectM2506c = InstrumentUtility2.m2506c(name, true);
        if (jSONObjectM2506c != null) {
            this.f4963b = jSONObjectM2506c.optString("app_version", null);
            this.f4964c = jSONObjectM2506c.optString("reason", null);
            this.f4965d = jSONObjectM2506c.optString("callstack", null);
            this.f4966e = Long.valueOf(jSONObjectM2506c.optLong("timestamp", 0L));
            this.f4967f = jSONObjectM2506c.optString("type", null);
        }
    }
}
