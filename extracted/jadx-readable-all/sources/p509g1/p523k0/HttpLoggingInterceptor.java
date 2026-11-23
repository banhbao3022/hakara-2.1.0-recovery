package p509g1.p523k0;

import com.facebook.stetho.inspector.network.DecompressionHelper;
import com.facebook.stetho.server.http.HttpHeaders;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.p481d0.StringsJVM;
import p477d1.p483s.Sets5;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Connection;
import p509g1.Headers2;
import p509g1.Interceptor;
import p509g1.MediaType2;
import p509g1.Request3;
import p509g1.RequestBody;
import p509g1.Response3;
import p509g1.ResponseBody;
import p509g1.p510j0.p514g.RealConnection;
import p509g1.p510j0.p515h.HttpHeaders2;
import p509g1.p510j0.p515h.RealInterceptorChain;
import p509g1.p510j0.p519l.Platform;
import p524h1.Buffer3;
import p524h1.BufferedSource;
import p524h1.GzipSource;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: g1.k0.a, reason: use source file name */
/* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HttpLoggingInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    public volatile Set<String> f30580a;

    /* JADX INFO: renamed from: b */
    public volatile a f30581b;

    /* JADX INFO: renamed from: c */
    public final b f30582c;

    /* JADX INFO: renamed from: g1.k0.a$a */
    /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
    public enum a {
        NONE,
        /* JADX INFO: Fake field, exist only in values array */
        BASIC,
        HEADERS,
        BODY
    }

    /* JADX INFO: renamed from: g1.k0.a$b */
    /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
    public interface b {

        /* JADX INFO: renamed from: a */
        public static final b f30587a;

        /* JADX INFO: renamed from: g1.k0.a$b$a */
        /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
        public static final class a {
            public a() {
            }

            public a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            new a(null);
            f30587a = new b() { // from class: g1.k0.b$a
                @Override // p509g1.p523k0.HttpLoggingInterceptor.b
                /* JADX INFO: renamed from: a */
                public void mo13624a(String str) {
                    Intrinsics2.m13090f(str, "message");
                    Objects.requireNonNull(Platform.f30547c);
                    Platform.m13604j(Platform.f30545a, str, 0, null, 6, null);
                }
            };
        }

        /* JADX INFO: renamed from: a */
        void mo13624a(String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public HttpLoggingInterceptor(b bVar) {
        Intrinsics2.m13090f(bVar, "logger");
        this.f30582c = bVar;
        this.f30580a = Sets5.f29521f;
        this.f30581b = a.NONE;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13622a(Headers2 headers2) {
        String strM13649c = headers2.m13649c("Content-Encoding");
        return (strM13649c == null || StringsJVM.m12989f(strM13649c, "identity", true) || StringsJVM.m12989f(strM13649c, DecompressionHelper.GZIP_ENCODING, true)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final void m13623b(Headers2 headers2, int i) {
        int i2 = i * 2;
        String str = this.f30580a.contains(headers2.f30639g[i2]) ? "██" : headers2.f30639g[i2 + 1];
        this.f30582c.mo13624a(headers2.f30639g[i2] + ": " + str);
    }

    @Override // p509g1.Interceptor
    public Response3 intercept(Interceptor.a aVar) throws Exception {
        String string;
        Long lValueOf;
        Charset charsetM13686a;
        Charset charsetM13686a2;
        Intrinsics2.m13090f(aVar, "chain");
        a aVar2 = this.f30581b;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) aVar;
        Request3 request3 = realInterceptorChain.f30292f;
        if (aVar2 == a.NONE) {
            return realInterceptorChain.mo13492a(request3);
        }
        boolean z = aVar2 == a.BODY;
        boolean z2 = z || aVar2 == a.HEADERS;
        RequestBody requestBody = request3.f29954e;
        Connection connectionMo13493b = realInterceptorChain.mo13493b();
        StringBuilder sbM1556G = outline.m1556G("--> ");
        sbM1556G.append(request3.f29952c);
        sbM1556G.append(' ');
        sbM1556G.append(request3.f29951b);
        if (connectionMo13493b != null) {
            StringBuilder sbM1556G2 = outline.m1556G(" ");
            sbM1556G2.append(((RealConnection) connectionMo13493b).m13466m());
            string = sbM1556G2.toString();
        } else {
            string = "";
        }
        sbM1556G.append(string);
        String string2 = sbM1556G.toString();
        if (!z2 && requestBody != null) {
            StringBuilder sbM1561L = outline.m1561L(string2, " (");
            sbM1561L.append(requestBody.mo13326a());
            sbM1561L.append("-byte body)");
            string2 = sbM1561L.toString();
        }
        this.f30582c.mo13624a(string2);
        if (z2) {
            Headers2 headers2 = request3.f29953d;
            if (requestBody != null) {
                MediaType2 mediaType2Mo13327b = requestBody.mo13327b();
                if (mediaType2Mo13327b != null && headers2.m13649c(HttpHeaders.CONTENT_TYPE) == null) {
                    this.f30582c.mo13624a("Content-Type: " + mediaType2Mo13327b);
                }
                if (requestBody.mo13326a() != -1 && headers2.m13649c(HttpHeaders.CONTENT_LENGTH) == null) {
                    b bVar = this.f30582c;
                    StringBuilder sbM1556G3 = outline.m1556G("Content-Length: ");
                    sbM1556G3.append(requestBody.mo13326a());
                    bVar.mo13624a(sbM1556G3.toString());
                }
            }
            int size = headers2.size();
            for (int i = 0; i < size; i++) {
                m13623b(headers2, i);
            }
            if (!z || requestBody == null) {
                b bVar2 = this.f30582c;
                StringBuilder sbM1556G4 = outline.m1556G("--> END ");
                sbM1556G4.append(request3.f29952c);
                bVar2.mo13624a(sbM1556G4.toString());
            } else if (m13622a(request3.f29953d)) {
                b bVar3 = this.f30582c;
                StringBuilder sbM1556G5 = outline.m1556G("--> END ");
                sbM1556G5.append(request3.f29952c);
                sbM1556G5.append(" (encoded body omitted)");
                bVar3.mo13624a(sbM1556G5.toString());
            } else {
                Buffer3 buffer3 = new Buffer3();
                requestBody.mo13328d(buffer3);
                MediaType2 mediaType2Mo13327b2 = requestBody.mo13327b();
                if (mediaType2Mo13327b2 == null || (charsetM13686a2 = mediaType2Mo13327b2.m13686a(StandardCharsets.UTF_8)) == null) {
                    charsetM13686a2 = StandardCharsets.UTF_8;
                    Intrinsics2.m13086b(charsetM13686a2, "UTF_8");
                }
                this.f30582c.mo13624a("");
                if (SkuDao.a.m14050B(buffer3)) {
                    this.f30582c.mo13624a(buffer3.mo13733S(charsetM13686a2));
                    b bVar4 = this.f30582c;
                    StringBuilder sbM1556G6 = outline.m1556G("--> END ");
                    sbM1556G6.append(request3.f29952c);
                    sbM1556G6.append(" (");
                    sbM1556G6.append(requestBody.mo13326a());
                    sbM1556G6.append("-byte body)");
                    bVar4.mo13624a(sbM1556G6.toString());
                } else {
                    b bVar5 = this.f30582c;
                    StringBuilder sbM1556G7 = outline.m1556G("--> END ");
                    sbM1556G7.append(request3.f29952c);
                    sbM1556G7.append(" (binary ");
                    sbM1556G7.append(requestBody.mo13326a());
                    sbM1556G7.append("-byte body omitted)");
                    bVar5.mo13624a(sbM1556G7.toString());
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            Response3 response3Mo13492a = realInterceptorChain.mo13492a(request3);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBody = response3Mo13492a.f29996m;
            if (responseBody == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            long jContentLength = responseBody.contentLength();
            String str = jContentLength != -1 ? jContentLength + "-byte" : "unknown-length";
            b bVar6 = this.f30582c;
            StringBuilder sbM1556G8 = outline.m1556G("<-- ");
            sbM1556G8.append(response3Mo13492a.f29993j);
            sbM1556G8.append(response3Mo13492a.f29992i.length() == 0 ? "" : String.valueOf(' ') + response3Mo13492a.f29992i);
            sbM1556G8.append(' ');
            sbM1556G8.append(response3Mo13492a.f29990g.f29951b);
            sbM1556G8.append(" (");
            sbM1556G8.append(millis);
            sbM1556G8.append("ms");
            sbM1556G8.append(!z2 ? outline.m1600v(", ", str, " body") : "");
            sbM1556G8.append(')');
            bVar6.mo13624a(sbM1556G8.toString());
            if (z2) {
                Headers2 headers3 = response3Mo13492a.f29995l;
                int size2 = headers3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    m13623b(headers3, i2);
                }
                if (!z || !HttpHeaders2.m13485a(response3Mo13492a)) {
                    this.f30582c.mo13624a("<-- END HTTP");
                } else if (m13622a(response3Mo13492a.f29995l)) {
                    this.f30582c.mo13624a("<-- END HTTP (encoded body omitted)");
                } else {
                    BufferedSource bufferedSourceSource = responseBody.source();
                    bufferedSourceSource.mo13738a0(Long.MAX_VALUE);
                    Buffer3 buffer3Mo13739b = bufferedSourceSource.mo13739b();
                    if (StringsJVM.m12989f(DecompressionHelper.GZIP_ENCODING, headers3.m13649c("Content-Encoding"), true)) {
                        lValueOf = Long.valueOf(buffer3Mo13739b.f30708g);
                        GzipSource gzipSource = new GzipSource(buffer3Mo13739b.clone());
                        try {
                            buffer3Mo13739b = new Buffer3();
                            buffer3Mo13739b.mo13734V(gzipSource);
                            C5729a.m12455j(gzipSource, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                C5729a.m12455j(gzipSource, th);
                                throw th2;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    MediaType2 mediaType2ContentType = responseBody.contentType();
                    if (mediaType2ContentType == null || (charsetM13686a = mediaType2ContentType.m13686a(StandardCharsets.UTF_8)) == null) {
                        charsetM13686a = StandardCharsets.UTF_8;
                        Intrinsics2.m13086b(charsetM13686a, "UTF_8");
                    }
                    if (!SkuDao.a.m14050B(buffer3Mo13739b)) {
                        this.f30582c.mo13624a("");
                        b bVar7 = this.f30582c;
                        StringBuilder sbM1556G9 = outline.m1556G("<-- END HTTP (binary ");
                        sbM1556G9.append(buffer3Mo13739b.f30708g);
                        sbM1556G9.append("-byte body omitted)");
                        bVar7.mo13624a(sbM1556G9.toString());
                        return response3Mo13492a;
                    }
                    if (jContentLength != 0) {
                        this.f30582c.mo13624a("");
                        this.f30582c.mo13624a(buffer3Mo13739b.clone().mo13733S(charsetM13686a));
                    }
                    if (lValueOf != null) {
                        b bVar8 = this.f30582c;
                        StringBuilder sbM1556G10 = outline.m1556G("<-- END HTTP (");
                        sbM1556G10.append(buffer3Mo13739b.f30708g);
                        sbM1556G10.append("-byte, ");
                        sbM1556G10.append(lValueOf);
                        sbM1556G10.append("-gzipped-byte body)");
                        bVar8.mo13624a(sbM1556G10.toString());
                    } else {
                        b bVar9 = this.f30582c;
                        StringBuilder sbM1556G11 = outline.m1556G("<-- END HTTP (");
                        sbM1556G11.append(buffer3Mo13739b.f30708g);
                        sbM1556G11.append("-byte body)");
                        bVar9.mo13624a(sbM1556G11.toString());
                    }
                }
            }
            return response3Mo13492a;
        } catch (Exception e) {
            this.f30582c.mo13624a("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    public /* synthetic */ HttpLoggingInterceptor(b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? b.f30587a : bVar);
    }
}
