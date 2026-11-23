package p007c.p190n.p194b.p195a.p196i.p197f;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: c.n.b.a.i.f.n, reason: use source file name */
/* JADX INFO: compiled from: LogResponse.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class LogResponse {
    /* JADX INFO: renamed from: a */
    public static LogResponse m2793a(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        AutoValue_LogResponse autoValue_LogResponse = new AutoValue_LogResponse(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return autoValue_LogResponse;
                    }
                    AutoValue_LogResponse autoValue_LogResponse2 = new AutoValue_LogResponse(jsonReader.nextLong());
                    jsonReader.close();
                    return autoValue_LogResponse2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo2790b();
}
