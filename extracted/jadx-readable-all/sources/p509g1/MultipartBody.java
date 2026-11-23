package p509g1;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p524h1.Buffer3;
import p524h1.BufferedSink;
import p524h1.ByteString3;

/* JADX INFO: renamed from: g1.z, reason: use source file name */
/* JADX INFO: compiled from: MultipartBody.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MultipartBody extends RequestBody {

    /* JADX INFO: renamed from: b */
    public static final MediaType2 f30668b;

    /* JADX INFO: renamed from: c */
    public static final MediaType2 f30669c;

    /* JADX INFO: renamed from: d */
    public static final byte[] f30670d;

    /* JADX INFO: renamed from: e */
    public static final byte[] f30671e;

    /* JADX INFO: renamed from: f */
    public static final byte[] f30672f;

    /* JADX INFO: renamed from: g */
    public static final b f30673g = new b(null);

    /* JADX INFO: renamed from: h */
    public final MediaType2 f30674h;

    /* JADX INFO: renamed from: i */
    public long f30675i;

    /* JADX INFO: renamed from: j */
    public final ByteString3 f30676j;

    /* JADX INFO: renamed from: k */
    public final MediaType2 f30677k;

    /* JADX INFO: renamed from: l */
    public final List<c> f30678l;

    /* JADX INFO: renamed from: g1.z$b */
    /* JADX INFO: compiled from: MultipartBody.kt */
    public static final class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m13693a(StringBuilder sb, String str) {
            Intrinsics2.m13090f(sb, "$this$appendQuotedString");
            Intrinsics2.m13090f(str, "key");
            sb.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(cCharAt);
                }
            }
            sb.append('\"');
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: g1.z$c */
    /* JADX INFO: compiled from: MultipartBody.kt */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public static final a f30682a = new a(null);

        /* JADX INFO: renamed from: b */
        public final Headers2 f30683b;

        /* JADX INFO: renamed from: c */
        public final RequestBody f30684c;

        /* JADX INFO: renamed from: g1.z$c$a */
        /* JADX INFO: compiled from: MultipartBody.kt */
        public static final class a {
            public a() {
            }

            /* JADX INFO: renamed from: a */
            public final c m13694a(Headers2 headers2, RequestBody requestBody) {
                Intrinsics2.m13090f(requestBody, "body");
                if (!((headers2 != null ? headers2.m13649c(HttpHeaders.CONTENT_TYPE) : null) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((headers2 != null ? headers2.m13649c(HttpHeaders.CONTENT_LENGTH) : null) == null) {
                    return new c(headers2, requestBody, null);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            /* JADX INFO: renamed from: b */
            public final c m13695b(String str, String str2, RequestBody requestBody) {
                Intrinsics2.m13090f(str, "name");
                Intrinsics2.m13090f(requestBody, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                b bVar = MultipartBody.f30673g;
                bVar.m13693a(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    bVar.m13693a(sb, str2);
                }
                String string = sb.toString();
                Intrinsics2.m13086b(string, "StringBuilder().apply(builderAction).toString()");
                Headers2.a aVar = new Headers2.a();
                Intrinsics2.m13090f("Content-Disposition", "name");
                Intrinsics2.m13090f(string, "value");
                Headers2.f30638f.m13661a("Content-Disposition");
                aVar.m13657c("Content-Disposition", string);
                return m13694a(aVar.m13658d(), requestBody);
            }

            public a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public c(Headers2 headers2, RequestBody requestBody, DefaultConstructorMarker defaultConstructorMarker) {
            this.f30683b = headers2;
            this.f30684c = requestBody;
        }
    }

    static {
        MediaType2.a aVar = MediaType2.f30664c;
        f30668b = aVar.m13687a("multipart/mixed");
        aVar.m13687a("multipart/alternative");
        aVar.m13687a("multipart/digest");
        aVar.m13687a("multipart/parallel");
        f30669c = aVar.m13687a("multipart/form-data");
        f30670d = new byte[]{(byte) 58, (byte) 32};
        f30671e = new byte[]{(byte) 13, (byte) 10};
        byte b2 = (byte) 45;
        f30672f = new byte[]{b2, b2};
    }

    public MultipartBody(ByteString3 byteString3, MediaType2 mediaType2, List<c> list) {
        Intrinsics2.m13090f(byteString3, "boundaryByteString");
        Intrinsics2.m13090f(mediaType2, "type");
        Intrinsics2.m13090f(list, "parts");
        this.f30676j = byteString3;
        this.f30677k = mediaType2;
        this.f30678l = list;
        this.f30674h = MediaType2.f30664c.m13687a(mediaType2 + "; boundary=" + byteString3.m13772w());
        this.f30675i = -1L;
    }

    @Override // p509g1.RequestBody
    /* JADX INFO: renamed from: a */
    public long mo13326a() throws IOException {
        long j2 = this.f30675i;
        if (j2 != -1) {
            return j2;
        }
        long jM13689e = m13689e(null, true);
        this.f30675i = jM13689e;
        return jM13689e;
    }

    @Override // p509g1.RequestBody
    /* JADX INFO: renamed from: b */
    public MediaType2 mo13327b() {
        return this.f30674h;
    }

    @Override // p509g1.RequestBody
    /* JADX INFO: renamed from: d */
    public void mo13328d(BufferedSink bufferedSink) throws IOException {
        Intrinsics2.m13090f(bufferedSink, "sink");
        m13689e(bufferedSink, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final long m13689e(BufferedSink bufferedSink, boolean z) throws IOException {
        Buffer3 buffer3;
        if (z) {
            bufferedSink = new Buffer3();
            buffer3 = bufferedSink;
        } else {
            buffer3 = 0;
        }
        int size = this.f30678l.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            c cVar = this.f30678l.get(i);
            Headers2 headers2 = cVar.f30683b;
            RequestBody requestBody = cVar.f30684c;
            if (bufferedSink == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            bufferedSink.mo13747l0(f30672f);
            bufferedSink.mo13749m0(this.f30676j);
            bufferedSink.mo13747l0(f30671e);
            if (headers2 != null) {
                int size2 = headers2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    bufferedSink.mo13728P(headers2.m13650f(i2)).mo13747l0(f30670d).mo13728P(headers2.m13653m(i2)).mo13747l0(f30671e);
                }
            }
            MediaType2 mediaType2Mo13327b = requestBody.mo13327b();
            if (mediaType2Mo13327b != null) {
                bufferedSink.mo13728P("Content-Type: ").mo13728P(mediaType2Mo13327b.f30665d).mo13747l0(f30671e);
            }
            long jMo13326a = requestBody.mo13326a();
            if (jMo13326a != -1) {
                bufferedSink.mo13728P("Content-Length: ").mo13760y0(jMo13326a).mo13747l0(f30671e);
            } else if (z) {
                if (buffer3 != 0) {
                    buffer3.skip(buffer3.f30708g);
                    return -1L;
                }
                Intrinsics2.m13095k();
                throw null;
            }
            byte[] bArr = f30671e;
            bufferedSink.mo13747l0(bArr);
            if (z) {
                j2 += jMo13326a;
            } else {
                requestBody.mo13328d(bufferedSink);
            }
            bufferedSink.mo13747l0(bArr);
        }
        if (bufferedSink == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        byte[] bArr2 = f30672f;
        bufferedSink.mo13747l0(bArr2);
        bufferedSink.mo13749m0(this.f30676j);
        bufferedSink.mo13747l0(bArr2);
        bufferedSink.mo13747l0(f30671e);
        if (!z) {
            return j2;
        }
        if (buffer3 == 0) {
            Intrinsics2.m13095k();
            throw null;
        }
        long j3 = buffer3.f30708g;
        long j4 = j2 + j3;
        buffer3.skip(j3);
        return j4;
    }

    /* JADX INFO: renamed from: g1.z$a */
    /* JADX INFO: compiled from: MultipartBody.kt */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final ByteString3 f30679a;

        /* JADX INFO: renamed from: b */
        public MediaType2 f30680b;

        /* JADX INFO: renamed from: c */
        public final List<c> f30681c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public a(String str) {
            Intrinsics2.m13090f(str, "boundary");
            this.f30679a = ByteString3.f30712g.m13777c(str);
            this.f30680b = MultipartBody.f30668b;
            this.f30681c = new ArrayList();
        }

        /* JADX INFO: renamed from: a */
        public final a m13690a(c cVar) {
            Intrinsics2.m13090f(cVar, "part");
            this.f30681c.add(cVar);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final MultipartBody m13691b() {
            if (!this.f30681c.isEmpty()) {
                return new MultipartBody(this.f30679a, this.f30680b, Util9.m13384x(this.f30681c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        /* JADX INFO: renamed from: c */
        public final a m13692c(MediaType2 mediaType2) {
            Intrinsics2.m13090f(mediaType2, "type");
            if (Intrinsics2.m13085a(mediaType2.f30666e, "multipart")) {
                this.f30680b = mediaType2;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + mediaType2).toString());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics2.m13086b(str, "UUID.randomUUID().toString()");
            }
            this(str);
        }
    }
}
