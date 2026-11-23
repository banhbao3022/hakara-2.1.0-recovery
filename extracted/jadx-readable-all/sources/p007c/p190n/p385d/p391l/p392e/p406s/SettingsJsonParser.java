package p007c.p190n.p385d.p391l.p392e.p406s;

import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p385d.p391l.p392e.p395k.SystemCurrentTimeProvider;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.SettingsData;

/* JADX INFO: renamed from: c.n.d.l.e.s.e, reason: use source file name */
/* JADX INFO: compiled from: SettingsJsonParser.java */
/* JADX INFO: loaded from: classes.dex */
public class SettingsJsonParser {

    /* JADX INFO: renamed from: a */
    public final SystemCurrentTimeProvider f26965a;

    public SettingsJsonParser(SystemCurrentTimeProvider systemCurrentTimeProvider) {
        this.f26965a = systemCurrentTimeProvider;
    }

    /* JADX INFO: renamed from: a */
    public SettingsData m12035a(JSONObject jSONObject) throws JSONException {
        return (jSONObject.getInt("settings_version") != 3 ? new DefaultSettingsJsonTransform() : new SettingsV3JsonTransform()).mo12029a(this.f26965a, jSONObject);
    }
}
