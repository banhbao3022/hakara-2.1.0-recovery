package p623k1.p624f0.p625a;

import com.facebook.stetho.common.Utf8Charset;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Objects;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.p437g0.JsonWriter;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.MediaType2;
import p509g1.RequestBody;
import p509g1.RequestBody2;
import p524h1.Buffer3;
import p524h1.Buffer4;
import p524h1.ByteString3;
import p623k1.Converter;

/* JADX INFO: renamed from: k1.f0.a.b, reason: use source file name */
/* JADX INFO: compiled from: GsonRequestBodyConverter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {

    /* JADX INFO: renamed from: a */
    public static final MediaType2 f33145a = MediaType2.f30664c.m13687a("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: b */
    public static final Charset f33146b = Charset.forName(Utf8Charset.NAME);

    /* JADX INFO: renamed from: c */
    public final Gson6 f33147c;

    /* JADX INFO: renamed from: d */
    public final TypeAdapter2<T> f33148d;

    public GsonRequestBodyConverter(Gson6 gson6, TypeAdapter2<T> typeAdapter2) {
        this.f33147c = gson6;
        this.f33148d = typeAdapter2;
    }

    @Override // p623k1.Converter
    /* JADX INFO: renamed from: a */
    public RequestBody mo14273a(Object obj) throws IOException {
        Buffer3 buffer3 = new Buffer3();
        JsonWriter jsonWriterM12318e = this.f33147c.m12318e(new OutputStreamWriter(new Buffer4(buffer3), f33146b));
        this.f33148d.mo12213b(jsonWriterM12318e, obj);
        jsonWriterM12318e.close();
        MediaType2 mediaType2 = f33145a;
        ByteString3 byteString3Mo13736Y = buffer3.mo13736Y();
        Objects.requireNonNull(RequestBody.f29980a);
        Intrinsics2.m13090f(byteString3Mo13736Y, "content");
        Intrinsics2.m13090f(byteString3Mo13736Y, "$this$toRequestBody");
        return new RequestBody2(byteString3Mo13736Y, mediaType2);
    }
}
