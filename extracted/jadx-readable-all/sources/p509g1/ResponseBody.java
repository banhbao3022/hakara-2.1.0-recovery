package p509g1;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.p481d0.Charsets2;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p524h1.Buffer3;
import p524h1.BufferedSource;
import p524h1.ByteString3;

/* JADX INFO: renamed from: g1.g0, reason: use source file name */
/* JADX INFO: compiled from: ResponseBody.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ResponseBody implements Closeable {
    public static final b Companion = new b(null);
    private Reader reader;

    /* JADX INFO: renamed from: g1.g0$a */
    /* JADX INFO: compiled from: ResponseBody.kt */
    public static final class a extends Reader {

        /* JADX INFO: renamed from: f */
        public boolean f30024f;

        /* JADX INFO: renamed from: g */
        public Reader f30025g;

        /* JADX INFO: renamed from: h */
        public final BufferedSource f30026h;

        /* JADX INFO: renamed from: i */
        public final Charset f30027i;

        public a(BufferedSource bufferedSource, Charset charset) {
            Intrinsics2.m13090f(bufferedSource, "source");
            Intrinsics2.m13090f(charset, "charset");
            this.f30026h = bufferedSource;
            this.f30027i = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f30024f = true;
            Reader reader = this.f30025g;
            if (reader != null) {
                reader.close();
            } else {
                this.f30026h.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            Intrinsics2.m13090f(cArr, "cbuf");
            if (this.f30024f) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f30025g;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f30026h.mo13710C0(), Util9.m13378r(this.f30026h, this.f30027i));
                this.f30025g = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: g1.g0$b */
    /* JADX INFO: compiled from: ResponseBody.kt */
    public static final class b {

        /* JADX INFO: renamed from: g1.g0$b$a */
        /* JADX INFO: compiled from: ResponseBody.kt */
        public static final class a extends ResponseBody {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ BufferedSource f30028f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ MediaType2 f30029g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ long f30030h;

            public a(BufferedSource bufferedSource, MediaType2 mediaType2, long j2) {
                this.f30028f = bufferedSource;
                this.f30029g = mediaType2;
                this.f30030h = j2;
            }

            @Override // p509g1.ResponseBody
            public long contentLength() {
                return this.f30030h;
            }

            @Override // p509g1.ResponseBody
            public MediaType2 contentType() {
                return this.f30029g;
            }

            @Override // p509g1.ResponseBody
            public BufferedSource source() {
                return this.f30028f;
            }
        }

        public b() {
        }

        /* JADX INFO: renamed from: a */
        public final ResponseBody m13350a(String str, MediaType2 mediaType2) {
            Intrinsics2.m13090f(str, "$this$toResponseBody");
            Charset charset = Charsets2.f29452a;
            if (mediaType2 != null) {
                Pattern pattern = MediaType2.f30662a;
                Charset charsetM13686a = mediaType2.m13686a(null);
                if (charsetM13686a == null) {
                    mediaType2 = MediaType2.f30664c.m13688b(mediaType2 + "; charset=utf-8");
                } else {
                    charset = charsetM13686a;
                }
            }
            Buffer3 buffer3 = new Buffer3();
            Intrinsics2.m13090f(str, "string");
            Intrinsics2.m13090f(charset, "charset");
            Buffer3 buffer3M13727O0 = buffer3.m13727O0(str, 0, str.length(), charset);
            return m13351b(buffer3M13727O0, mediaType2, buffer3M13727O0.f30708g);
        }

        /* JADX INFO: renamed from: b */
        public final ResponseBody m13351b(BufferedSource bufferedSource, MediaType2 mediaType2, long j2) {
            Intrinsics2.m13090f(bufferedSource, "$this$asResponseBody");
            return new a(bufferedSource, mediaType2, j2);
        }

        /* JADX INFO: renamed from: c */
        public final ResponseBody m13352c(ByteString3 byteString3, MediaType2 mediaType2) {
            Intrinsics2.m13090f(byteString3, "$this$toResponseBody");
            Buffer3 buffer3 = new Buffer3();
            buffer3.m13717G0(byteString3);
            long jMo13765j = byteString3.mo13765j();
            Intrinsics2.m13090f(buffer3, "$this$asResponseBody");
            return new a(buffer3, mediaType2, jMo13765j);
        }

        /* JADX INFO: renamed from: d */
        public final ResponseBody m13353d(byte[] bArr, MediaType2 mediaType2) {
            Intrinsics2.m13090f(bArr, "$this$toResponseBody");
            Buffer3 buffer3 = new Buffer3();
            buffer3.m13718H0(bArr);
            long length = bArr.length;
            Intrinsics2.m13090f(buffer3, "$this$asResponseBody");
            return new a(buffer3, mediaType2, length);
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private final Charset charset() {
        Charset charsetM13686a;
        MediaType2 mediaType2ContentType = contentType();
        return (mediaType2ContentType == null || (charsetM13686a = mediaType2ContentType.m13686a(Charsets2.f29452a)) == null) ? Charsets2.f29452a : charsetM13686a;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(InterfaceC6164l<? super BufferedSource, ? extends T> interfaceC6164l, InterfaceC6164l<? super T, Integer> interfaceC6164l2) throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > Integer.MAX_VALUE) {
            throw new IOException(outline.m1594p("Cannot buffer entire body for content length: ", jContentLength));
        }
        BufferedSource bufferedSourceSource = source();
        try {
            T tMo3b = interfaceC6164l.mo3b(bufferedSourceSource);
            C5729a.m12455j(bufferedSourceSource, null);
            int iIntValue = interfaceC6164l2.mo3b(tMo3b).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return tMo3b;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C5729a.m12455j(bufferedSourceSource, th);
                throw th2;
            }
        }
    }

    public static final ResponseBody create(MediaType2 mediaType2, long j2, BufferedSource bufferedSource) {
        Objects.requireNonNull(Companion);
        Intrinsics2.m13090f(bufferedSource, "content");
        Intrinsics2.m13090f(bufferedSource, "$this$asResponseBody");
        return new b.a(bufferedSource, mediaType2, j2);
    }

    public static final ResponseBody create(ByteString3 byteString3, MediaType2 mediaType2) {
        return Companion.m13352c(byteString3, mediaType2);
    }

    public static final ResponseBody create(String str, MediaType2 mediaType2) {
        return Companion.m13350a(str, mediaType2);
    }

    public static final ResponseBody create(byte[] bArr, MediaType2 mediaType2) {
        return Companion.m13353d(bArr, mediaType2);
    }

    public final InputStream byteStream() {
        return source().mo13710C0();
    }

    public final ByteString3 byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > Integer.MAX_VALUE) {
            throw new IOException(outline.m1594p("Cannot buffer entire body for content length: ", jContentLength));
        }
        BufferedSource bufferedSourceSource = source();
        try {
            ByteString3 byteString3Mo13736Y = bufferedSourceSource.mo13736Y();
            C5729a.m12455j(bufferedSourceSource, null);
            int iMo13765j = byteString3Mo13736Y.mo13765j();
            if (jContentLength == -1 || jContentLength == iMo13765j) {
                return byteString3Mo13736Y;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iMo13765j + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C5729a.m12455j(bufferedSourceSource, th);
                throw th2;
            }
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > Integer.MAX_VALUE) {
            throw new IOException(outline.m1594p("Cannot buffer entire body for content length: ", jContentLength));
        }
        BufferedSource bufferedSourceSource = source();
        try {
            byte[] bArrMo13756w = bufferedSourceSource.mo13756w();
            C5729a.m12455j(bufferedSourceSource, null);
            int length = bArrMo13756w.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrMo13756w;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C5729a.m12455j(bufferedSourceSource, th);
                throw th2;
            }
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(source(), charset());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util9.m13364d(source());
    }

    public abstract long contentLength();

    public abstract MediaType2 contentType();

    public abstract BufferedSource source();

    public final String string() throws IOException {
        BufferedSource bufferedSourceSource = source();
        try {
            String strMo13733S = bufferedSourceSource.mo13733S(Util9.m13378r(bufferedSourceSource, charset()));
            C5729a.m12455j(bufferedSourceSource, null);
            return strMo13733S;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C5729a.m12455j(bufferedSourceSource, th);
                throw th2;
            }
        }
    }

    public static final ResponseBody create(MediaType2 mediaType2, String str) {
        b bVar = Companion;
        Objects.requireNonNull(bVar);
        Intrinsics2.m13090f(str, "content");
        return bVar.m13350a(str, mediaType2);
    }

    public static final ResponseBody create(MediaType2 mediaType2, ByteString3 byteString3) {
        b bVar = Companion;
        Objects.requireNonNull(bVar);
        Intrinsics2.m13090f(byteString3, "content");
        return bVar.m13352c(byteString3, mediaType2);
    }

    public static final ResponseBody create(MediaType2 mediaType2, byte[] bArr) {
        b bVar = Companion;
        Objects.requireNonNull(bVar);
        Intrinsics2.m13090f(bArr, "content");
        return bVar.m13353d(bArr, mediaType2);
    }

    public static final ResponseBody create(BufferedSource bufferedSource, MediaType2 mediaType2, long j2) {
        Objects.requireNonNull(Companion);
        Intrinsics2.m13090f(bufferedSource, "$this$asResponseBody");
        return new b.a(bufferedSource, mediaType2, j2);
    }
}
