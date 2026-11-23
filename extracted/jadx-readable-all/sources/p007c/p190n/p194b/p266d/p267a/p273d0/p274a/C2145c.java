package p007c.p190n.p194b.p266d.p267a.p273d0.p274a;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: c.n.b.d.a.d0.a.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2145c {

    /* JADX INFO: renamed from: a */
    public final String f10492a;

    /* JADX INFO: renamed from: b */
    public String f10493b;

    /* JADX INFO: renamed from: c */
    public Bundle f10494c = new Bundle();

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    public C2145c(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        byte b;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -995427962) {
                if (iHashCode == -271442291 && strNextName.equals("signal_dictionary")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (strNextName.equals("params")) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                strNextString = jsonReader.nextString();
            } else if (b != 1) {
                jsonReader.skipValue();
            } else {
                map = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    map.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            }
        }
        this.f10492a = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f10494c.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }
}
