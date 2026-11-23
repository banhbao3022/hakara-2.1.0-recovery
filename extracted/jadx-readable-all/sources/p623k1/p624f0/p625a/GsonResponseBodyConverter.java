package p623k1.p624f0.p625a;

import java.io.IOException;
import java.io.Reader;
import java.util.Objects;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.JsonIOException;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonToken;
import p509g1.ResponseBody;
import p623k1.Converter;

/* JADX INFO: renamed from: k1.f0.a.c, reason: use source file name */
/* JADX INFO: compiled from: GsonResponseBodyConverter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {

    /* JADX INFO: renamed from: a */
    public final Gson6 f33149a;

    /* JADX INFO: renamed from: b */
    public final TypeAdapter2<T> f33150b;

    public GsonResponseBodyConverter(Gson6 gson6, TypeAdapter2<T> typeAdapter2) {
        this.f33149a = gson6;
        this.f33150b = typeAdapter2;
    }

    @Override // p623k1.Converter
    /* JADX INFO: renamed from: a */
    public Object mo14273a(ResponseBody responseBody) throws IOException {
        ResponseBody responseBody2 = responseBody;
        Gson6 gson6 = this.f33149a;
        Reader readerCharStream = responseBody2.charStream();
        Objects.requireNonNull(gson6);
        JsonReader2 jsonReader2 = new JsonReader2(readerCharStream);
        jsonReader2.f27518h = gson6.f27567l;
        try {
            T tMo12212a = this.f33150b.mo12212a(jsonReader2);
            if (jsonReader2.mo12234H0() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            responseBody2.close();
            return tMo12212a;
        } catch (Throwable th) {
            responseBody2.close();
            throw th;
        }
    }
}
