package p007c.p190n.p385d.p391l.p392e.p406s;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p385d.p391l.p392e.p395k.SystemCurrentTimeProvider;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.AppSettingsData;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.FeaturesSettingsData;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.SessionSettingsData;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.SettingsData;

/* JADX INFO: renamed from: c.n.d.l.e.s.b, reason: use source file name */
/* JADX INFO: compiled from: DefaultSettingsJsonTransform.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultSettingsJsonTransform implements SettingsJsonTransform {
    /* JADX INFO: renamed from: b */
    public static long m12028b(SystemCurrentTimeProvider systemCurrentTimeProvider, long j2, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        Objects.requireNonNull(systemCurrentTimeProvider);
        return (j2 * 1000) + System.currentTimeMillis();
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p406s.SettingsJsonTransform
    /* JADX INFO: renamed from: a */
    public SettingsData mo12029a(SystemCurrentTimeProvider systemCurrentTimeProvider, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        JSONObject jSONObject2 = jSONObject.getJSONObject("app");
        return new SettingsData(m12028b(systemCurrentTimeProvider, iOptInt2, jSONObject), new AppSettingsData(jSONObject2.getString("status"), jSONObject2.getString("url"), jSONObject2.getString("reports_url"), jSONObject2.getString("ndk_reports_url"), jSONObject2.optBoolean("update_required", false)), new SessionSettingsData(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 4), new FeaturesSettingsData(jSONObject.getJSONObject("features").optBoolean("collect_reports", true)), iOptInt, iOptInt2);
    }
}
