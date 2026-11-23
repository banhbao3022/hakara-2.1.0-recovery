package p007c.p165l.p178k0.p179k0.p181g;

import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.p178k0.p179k0.InstrumentUtility2;

/* JADX INFO: renamed from: c.l.k0.k0.g.a, reason: use source file name */
/* JADX INFO: compiled from: ErrorReportData.java */
/* JADX INFO: loaded from: classes.dex */
public final class ErrorReportData {

    /* JADX INFO: renamed from: a */
    public String f4976a;

    /* JADX INFO: renamed from: b */
    public String f4977b;

    /* JADX INFO: renamed from: c */
    public Long f4978c;

    public ErrorReportData(String str) {
        this.f4978c = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f4977b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        stringBuffer.append(this.f4978c);
        stringBuffer.append(".json");
        this.f4976a = stringBuffer.toString();
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f4978c;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.f4977b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public ErrorReportData(File file) {
        String name = file.getName();
        this.f4976a = name;
        JSONObject jSONObjectM2506c = InstrumentUtility2.m2506c(name, true);
        if (jSONObjectM2506c != null) {
            this.f4978c = Long.valueOf(jSONObjectM2506c.optLong("timestamp", 0L));
            this.f4977b = jSONObjectM2506c.optString("error_message", null);
        }
    }
}
