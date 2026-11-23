package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2269i0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class uh1 {

    /* JADX INFO: renamed from: a */
    public final List<String> f20317a;

    /* JADX INFO: renamed from: b */
    public final String f20318b;

    /* JADX INFO: renamed from: c */
    public final int f20319c;

    /* JADX INFO: renamed from: d */
    public final String f20320d;

    /* JADX INFO: renamed from: e */
    public final int f20321e;

    /* JADX INFO: renamed from: f */
    public final long f20322f;

    /* JADX INFO: renamed from: g */
    public final boolean f20323g;

    /* JADX INFO: renamed from: h */
    public final th1 f20324h;

    public uh1(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List<String> listEmptyList = Collections.emptyList();
        jsonReader.beginObject();
        int iNextInt = 0;
        long jNextLong = 0;
        th1 th1Var = null;
        boolean zNextBoolean = false;
        String strNextString = "";
        String strNextString2 = strNextString;
        int iNextInt2 = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("nofill_urls".equals(strNextName)) {
                listEmptyList = C2269i0.m4774b(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString2 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14267S4)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    th1Var = new th1(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
        }
        jsonReader.endObject();
        this.f20317a = listEmptyList;
        this.f20319c = iNextInt;
        this.f20318b = strNextString;
        this.f20320d = strNextString2;
        this.f20321e = iNextInt2;
        this.f20322f = jNextLong;
        this.f20324h = th1Var;
        this.f20323g = zNextBoolean;
    }
}
