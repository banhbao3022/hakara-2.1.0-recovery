package p007c.p114h.p126d.p129c.p139g;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p114h.p122b.C0868a;
import p007c.p114h.p126d.p129c.p133c.p134e.DynamicColor;
import p007c.p114h.p126d.p129c.p133c.p134e.DynamicColorBaseData;
import p007c.p114h.p126d.p129c.p133c.p134e.DynamicColorData;

/* JADX INFO: renamed from: c.h.d.c.g.h, reason: use source file name */
/* JADX INFO: compiled from: ResourceJsonCodec.java */
/* JADX INFO: loaded from: classes.dex */
public class ResourceJsonCodec {
    /* JADX INFO: renamed from: a */
    public static DynamicColor m2172a(String str) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject(C0868a.m2105a(new FileInputStream(new File(str, "json"))));
        DynamicColor dynamicColor = new DynamicColor();
        dynamicColor.f4140a = str;
        if (dynamicColor.f4141b == null) {
            dynamicColor.f4141b = new ArrayList();
        }
        JSONArray jSONArray = jSONObject.getJSONArray("filterList");
        for (int i = 0; i < jSONArray.length(); i++) {
            DynamicColorData dynamicColorData = new DynamicColorData();
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if ("filter".equals(jSONObject2.getString("type"))) {
                dynamicColorData.f4142a = jSONObject2.getString("name");
                dynamicColorData.f4143b = jSONObject2.getString("vertexShader");
                dynamicColorData.f4144c = jSONObject2.getString("fragmentShader");
                JSONArray jSONArray2 = jSONObject2.getJSONArray("uniformList");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    dynamicColorData.f4145d.add(jSONArray2.getString(i2));
                }
                JSONObject jSONObject3 = jSONObject2.getJSONObject("uniformData");
                if (jSONObject3 != null) {
                    Iterator<String> itKeys = jSONObject3.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        dynamicColorData.f4146e.add(new DynamicColorBaseData.a(next, jSONObject3.getString(next)));
                    }
                }
                dynamicColorData.f4147f = (float) jSONObject2.getDouble("strength");
                dynamicColorData.f4148g = jSONObject2.getInt("texelOffset") == 1;
                dynamicColorData.f4149h = jSONObject2.getString("audioPath");
                dynamicColorData.f4150i = jSONObject2.getInt("audioLooping") == 1;
            }
            dynamicColor.f4141b.add(dynamicColorData);
        }
        return dynamicColor;
    }
}
