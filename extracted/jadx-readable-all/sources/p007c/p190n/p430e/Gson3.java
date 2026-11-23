package p007c.p190n.p430e;

import java.io.IOException;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonToken;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.h, reason: use source file name */
/* JADX INFO: compiled from: Gson.java */
/* JADX INFO: loaded from: classes.dex */
public class Gson3 extends TypeAdapter2<Number> {
    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: a */
    public Number mo12212a(JsonReader2 jsonReader2) throws IOException {
        if (jsonReader2.mo12234H0() != JsonToken.NULL) {
            return Long.valueOf(jsonReader2.mo12246t0());
        }
        jsonReader2.mo12249z0();
        return null;
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: b */
    public void mo12213b(JsonWriter jsonWriter, Number number) throws IOException {
        Number number2 = number;
        if (number2 == null) {
            jsonWriter.mo12254O();
        } else {
            jsonWriter.mo12261x0(number2.toString());
        }
    }
}
