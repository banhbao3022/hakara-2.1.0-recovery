package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2269i0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bi1 {

    /* JADX INFO: renamed from: a */
    public final List<rh1> f12694a;

    /* JADX INFO: renamed from: b */
    public final uh1 f12695b;

    /* JADX INFO: renamed from: c */
    public final List<ai1> f12696c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<c.n.b.d.j.a.rh1>] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public bi1(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException, AssertionError {
        ?? EmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        uh1 uh1Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        EmptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            EmptyList.add(new rh1(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        uh1Var = new uh1(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectM4775c = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectM4775c = C2269i0.m4775c(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList.add(new ai1(strNextString, jSONObjectM4775c));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f12696c = arrayList;
        this.f12694a = EmptyList;
        this.f12695b = uh1Var == null ? new uh1(new JsonReader(new StringReader("{}"))) : uh1Var;
    }

    /* JADX INFO: renamed from: a */
    public static bi1 m6015a(Reader reader) throws vh1 {
        try {
            try {
                bi1 bi1Var = new bi1(new JsonReader(reader));
                try {
                    reader.close();
                } catch (IOException unused) {
                }
                return bi1Var;
            } catch (Throwable th) {
                try {
                    reader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new vh1("unable to parse ServerResponse", e);
        }
    }
}
