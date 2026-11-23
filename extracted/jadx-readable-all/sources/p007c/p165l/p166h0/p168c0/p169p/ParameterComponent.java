package p007c.p165l.p166h0.p168c0.p169p;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.l.h0.c0.p.b, reason: use source file name */
/* JADX INFO: compiled from: ParameterComponent.java */
/* JADX INFO: loaded from: classes.dex */
public final class ParameterComponent {

    /* JADX INFO: renamed from: a */
    public final String f4677a;

    /* JADX INFO: renamed from: b */
    public final String f4678b;

    /* JADX INFO: renamed from: c */
    public final List<PathComponent> f4679c;

    /* JADX INFO: renamed from: d */
    public final String f4680d;

    public ParameterComponent(JSONObject jSONObject) throws JSONException {
        this.f4677a = jSONObject.getString("name");
        this.f4678b = jSONObject.optString("value");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("path");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(new PathComponent(jSONArrayOptJSONArray.getJSONObject(i)));
            }
        }
        this.f4679c = arrayList;
        this.f4680d = jSONObject.optString("path_type", "absolute");
    }
}
