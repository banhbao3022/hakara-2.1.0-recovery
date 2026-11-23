package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.JsonReader;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.io.IOException;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class th1 {

    /* JADX INFO: renamed from: a */
    public String f19832a;

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public th1(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        byte b;
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1724546052) {
                if (iHashCode == 3059181 && strNextName.equals("code")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (strNextName.equals(CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION)) {
                b = 1;
            } else {
                b = -1;
            }
            if (b == 0) {
                jsonReader.nextInt();
            } else if (b != 1) {
                jsonReader.skipValue();
            } else {
                strNextString = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.f19832a = strNextString;
    }
}
