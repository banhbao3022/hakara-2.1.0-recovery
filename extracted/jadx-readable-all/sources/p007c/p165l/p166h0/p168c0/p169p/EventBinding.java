package p007c.p165l.p166h0.p168c0.p169p;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.l.h0.c0.p.a, reason: use source file name */
/* JADX INFO: compiled from: EventBinding.java */
/* JADX INFO: loaded from: classes.dex */
public class EventBinding {

    /* JADX INFO: renamed from: a */
    public final String f4666a;

    /* JADX INFO: renamed from: b */
    public final List<PathComponent> f4667b;

    /* JADX INFO: renamed from: c */
    public final List<ParameterComponent> f4668c;

    /* JADX INFO: renamed from: d */
    public final String f4669d;

    /* JADX INFO: renamed from: c.l.h0.c0.p.a$a */
    /* JADX INFO: compiled from: EventBinding.java */
    public enum a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* JADX INFO: renamed from: c.l.h0.c0.p.a$b */
    /* JADX INFO: compiled from: EventBinding.java */
    public enum b {
        MANUAL,
        INFERENCE
    }

    public EventBinding(String str, b bVar, a aVar, String str2, List<PathComponent> list, List<ParameterComponent> list2, String str3, String str4, String str5) {
        this.f4666a = str;
        this.f4667b = list;
        this.f4668c = list2;
        this.f4669d = str5;
    }

    /* JADX INFO: renamed from: a */
    public static EventBinding m2295a(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        String string = jSONObject.getString("event_name");
        String string2 = jSONObject.getString("method");
        Locale locale = Locale.ENGLISH;
        b bVarValueOf = b.valueOf(string2.toUpperCase(locale));
        a aVarValueOf = a.valueOf(jSONObject.getString("event_type").toUpperCase(locale));
        String string3 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new PathComponent(jSONArray.getJSONObject(i)));
        }
        String strOptString = jSONObject.optString("path_type", "absolute");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                arrayList2.add(new ParameterComponent(jSONArrayOptJSONArray.getJSONObject(i2)));
            }
        }
        return new EventBinding(string, bVarValueOf, aVarValueOf, string3, arrayList, arrayList2, jSONObject.optString("component_id"), strOptString, jSONObject.optString("activity_name"));
    }
}
