package p509g1.p510j0.p515h;

import com.facebook.stetho.inspector.network.DecompressionHelper;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import p477d1.p481d0.StringsJVM;
import p477d1.p483s.Collections2;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Cookie;
import p509g1.CookieJar;
import p509g1.Headers2;
import p509g1.Interceptor;
import p509g1.MediaType2;
import p509g1.Request3;
import p509g1.RequestBody;
import p509g1.Response3;
import p509g1.ResponseBody;
import p509g1.p510j0.Util9;
import p524h1.GzipSource;
import p524h1.RealBufferedSource;

/* JADX INFO: renamed from: g1.j0.h.a, reason: use source file name */
/* JADX INFO: compiled from: BridgeInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BridgeInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final CookieJar f30280a;

    public BridgeInterceptor(CookieJar cookieJar) {
        Intrinsics2.m13090f(cookieJar, "cookieJar");
        this.f30280a = cookieJar;
    }

    @Override // p509g1.Interceptor
    public Response3 intercept(Interceptor.a aVar) throws IOException {
        boolean z;
        ResponseBody responseBody;
        Intrinsics2.m13090f(aVar, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) aVar;
        Request3 request3 = realInterceptorChain.f30292f;
        Objects.requireNonNull(request3);
        Request3.a aVar2 = new Request3.a(request3);
        RequestBody requestBody = request3.f29954e;
        if (requestBody != null) {
            MediaType2 mediaType2Mo13327b = requestBody.mo13327b();
            if (mediaType2Mo13327b != null) {
                aVar2.m13316d(HttpHeaders.CONTENT_TYPE, mediaType2Mo13327b.f30665d);
            }
            long jMo13326a = requestBody.mo13326a();
            if (jMo13326a != -1) {
                aVar2.m13316d(HttpHeaders.CONTENT_LENGTH, String.valueOf(jMo13326a));
                aVar2.m13319g("Transfer-Encoding");
            } else {
                aVar2.m13316d("Transfer-Encoding", "chunked");
                aVar2.m13319g(HttpHeaders.CONTENT_LENGTH);
            }
        }
        int i = 0;
        if (request3.m13312b("Host") == null) {
            aVar2.m13316d("Host", Util9.m13383w(request3.f29951b, false));
        }
        if (request3.m13312b("Connection") == null) {
            aVar2.m13316d("Connection", "Keep-Alive");
        }
        if (request3.m13312b("Accept-Encoding") == null && request3.m13312b("Range") == null) {
            aVar2.m13316d("Accept-Encoding", DecompressionHelper.GZIP_ENCODING);
            z = true;
        } else {
            z = false;
        }
        List<Cookie> listMo13638b = this.f30280a.mo13638b(request3.f29951b);
        if (!listMo13638b.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : listMo13638b) {
                int i2 = i + 1;
                if (i < 0) {
                    Collections2.m13041f();
                    throw null;
                }
                Cookie cookie = (Cookie) obj;
                if (i > 0) {
                    sb.append("; ");
                }
                sb.append(cookie.f30606f);
                sb.append('=');
                sb.append(cookie.f30607g);
                i = i2;
            }
            String string = sb.toString();
            Intrinsics2.m13086b(string, "StringBuilder().apply(builderAction).toString()");
            aVar2.m13316d("Cookie", string);
        }
        if (request3.m13312b("User-Agent") == null) {
            aVar2.m13316d("User-Agent", "okhttp/4.8.1");
        }
        Response3 response3Mo13492a = realInterceptorChain.mo13492a(aVar2.m13314b());
        HttpHeaders2.m13488d(this.f30280a, request3.f29951b, response3Mo13492a.f29995l);
        Response3.a aVar3 = new Response3.a(response3Mo13492a);
        aVar3.m13345g(request3);
        if (z && StringsJVM.m12989f(DecompressionHelper.GZIP_ENCODING, Response3.m13336c(response3Mo13492a, "Content-Encoding", null, 2), true) && HttpHeaders2.m13485a(response3Mo13492a) && (responseBody = response3Mo13492a.f29996m) != null) {
            GzipSource gzipSource = new GzipSource(responseBody.source());
            Headers2.a aVarM13651h = response3Mo13492a.f29995l.m13651h();
            aVarM13651h.m13660f("Content-Encoding");
            aVarM13651h.m13660f(HttpHeaders.CONTENT_LENGTH);
            aVar3.m13342d(aVarM13651h.m13658d());
            String strM13336c = Response3.m13336c(response3Mo13492a, HttpHeaders.CONTENT_TYPE, null, 2);
            Intrinsics2.m13090f(gzipSource, "$this$buffer");
            aVar3.f30009g = new RealResponseBody(strM13336c, -1L, new RealBufferedSource(gzipSource));
        }
        return aVar3.m13339a();
    }
}
