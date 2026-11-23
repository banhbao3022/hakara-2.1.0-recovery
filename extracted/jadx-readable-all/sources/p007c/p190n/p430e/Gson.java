package p007c.p190n.p430e;

import java.io.IOException;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonToken;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.f, reason: use source file name */
/* JADX INFO: compiled from: Gson.java */
/* JADX INFO: loaded from: classes.dex */
public class Gson extends TypeAdapter2<Number> {
    public Gson(Gson6 gson6) {
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: a */
    public Number mo12212a(JsonReader2 jsonReader2) throws IOException {
        if (jsonReader2.mo12234H0() != JsonToken.NULL) {
            return Double.valueOf(jsonReader2.mo12244g0());
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
            Gson6.m12314a(number2.doubleValue());
            jsonWriter.mo12260u0(number2);
        }
    }
}
