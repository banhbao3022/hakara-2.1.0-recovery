package p509g1.p510j0.p515h;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import p477d1.p481d0.Regex2;
import p477d1.p483s.Collections4;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Address;
import p509g1.CertificatePinner;
import p509g1.HttpUrl;
import p509g1.Interceptor;
import p509g1.OkHttpClient;
import p509g1.Request3;
import p509g1.Response3;
import p509g1.ResponseBody;
import p509g1.Route;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p514g.Exchange;
import p509g1.p510j0.p514g.ExchangeFinder;
import p509g1.p510j0.p514g.RealCall;
import p509g1.p510j0.p514g.RealConnection;
import p509g1.p510j0.p514g.RealConnectionPool;
import p509g1.p510j0.p514g.RouteException;
import p509g1.p510j0.p514g.RouteSelector;
import p509g1.p510j0.p517j.ConnectionShutdownException;

/* JADX INFO: renamed from: g1.j0.h.i, reason: use source file name */
/* JADX INFO: compiled from: RetryAndFollowUpInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final OkHttpClient f30299a;

    /* JADX INFO: renamed from: g1.j0.h.i$a */
    /* JADX INFO: compiled from: RetryAndFollowUpInterceptor.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        Intrinsics2.m13090f(okHttpClient, "client");
        this.f30299a = okHttpClient;
    }

    /* JADX INFO: renamed from: a */
    public final Request3 m13495a(Response3 response3, Exchange exchange) throws IOException {
        String strM13336c;
        RealConnection realConnection;
        Route route = (exchange == null || (realConnection = exchange.f30187b) == null) ? null : realConnection.f30251q;
        int i = response3.f29993j;
        String str = response3.f29990g.f29952c;
        if (i != 307 && i != 308) {
            if (i == 401) {
                return this.f30299a.f29867o.mo13301a(route, response3);
            }
            if (i == 421) {
                if (exchange == null || !(!Intrinsics2.m13085a(exchange.f30190e.f30210h.f29835a.f30647g, exchange.f30187b.f30251q.f30034a.f29835a.f30647g))) {
                    return null;
                }
                RealConnection realConnection2 = exchange.f30187b;
                synchronized (realConnection2) {
                    realConnection2.f30244j = true;
                }
                return response3.f29990g;
            }
            if (i == 503) {
                Response3 response4 = response3.f29999p;
                if ((response4 == null || response4.f29993j != 503) && m13497c(response3, Integer.MAX_VALUE) == 0) {
                    return response3.f29990g;
                }
                return null;
            }
            if (i == 407) {
                if (route == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                if (route.f30035b.type() == Proxy.Type.HTTP) {
                    return this.f30299a.f29875w.mo13301a(route, response3);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (i == 408) {
                if (!this.f30299a.f29866n) {
                    return null;
                }
                Response3 response5 = response3.f29999p;
                if ((response5 == null || response5.f29993j != 408) && m13497c(response3, 0) <= 0) {
                    return response3.f29990g;
                }
                return null;
            }
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f30299a.f29868p || (strM13336c = Response3.m13336c(response3, "Location", null, 2)) == null) {
            return null;
        }
        HttpUrl httpUrl = response3.f29990g.f29951b;
        Objects.requireNonNull(httpUrl);
        Intrinsics2.m13090f(strM13336c, "link");
        HttpUrl.a aVarM13670g = httpUrl.m13670g(strM13336c);
        HttpUrl httpUrlM13674b = aVarM13670g != null ? aVarM13670g.m13674b() : null;
        if (httpUrlM13674b == null) {
            return null;
        }
        if (!Intrinsics2.m13085a(httpUrlM13674b.f30644d, response3.f29990g.f29951b.f30644d) && !this.f30299a.f29869q) {
            return null;
        }
        Request3 request3 = response3.f29990g;
        Objects.requireNonNull(request3);
        Request3.a aVar = new Request3.a(request3);
        if (HttpMethod3.m13490a(str)) {
            int i2 = response3.f29993j;
            Intrinsics2.m13090f(str, "method");
            boolean z = Intrinsics2.m13085a(str, "PROPFIND") || i2 == 308 || i2 == 307;
            Intrinsics2.m13090f(str, "method");
            if (!(true ^ Intrinsics2.m13085a(str, "PROPFIND")) || i2 == 308 || i2 == 307) {
                aVar.m13318f(str, z ? response3.f29990g.f29954e : null);
            } else {
                aVar.m13318f("GET", null);
            }
            if (!z) {
                aVar.m13319g("Transfer-Encoding");
                aVar.m13319g(HttpHeaders.CONTENT_LENGTH);
                aVar.m13319g(HttpHeaders.CONTENT_TYPE);
            }
        }
        if (!Util9.m13361a(response3.f29990g.f29951b, httpUrlM13674b)) {
            aVar.m13319g("Authorization");
        }
        aVar.m13321i(httpUrlM13674b);
        return aVar.m13314b();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13496b(IOException iOException, RealCall realCall, Request3 request3, boolean z) {
        boolean zM13471a;
        RouteSelector routeSelector;
        RealConnection realConnection;
        if (!this.f30299a.f29866n) {
            return false;
        }
        if (z && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z)))) {
            return false;
        }
        ExchangeFinder exchangeFinder = realCall.f30218k;
        Route route = null;
        if (exchangeFinder == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        int i = exchangeFinder.f30205c;
        if (i == 0 && exchangeFinder.f30206d == 0 && exchangeFinder.f30207e == 0) {
            zM13471a = false;
        } else if (exchangeFinder.f30208f == null) {
            if (i <= 1 && exchangeFinder.f30206d <= 1 && exchangeFinder.f30207e <= 0 && (realConnection = exchangeFinder.f30211i.f30219l) != null) {
                synchronized (realConnection) {
                    if (realConnection.f30245k == 0 && Util9.m13361a(realConnection.f30251q.f30034a.f29835a, exchangeFinder.f30210h.f29835a)) {
                        route = realConnection.f30251q;
                    }
                }
            }
            if (route != null) {
                exchangeFinder.f30208f = route;
            } else {
                RouteSelector.b bVar = exchangeFinder.f30203a;
                if ((bVar == null || !bVar.m13473a()) && (routeSelector = exchangeFinder.f30204b) != null) {
                    zM13471a = routeSelector.m13471a();
                }
            }
            zM13471a = true;
        } else {
            zM13471a = true;
        }
        return zM13471a;
    }

    /* JADX INFO: renamed from: c */
    public final int m13497c(Response3 response3, int i) {
        String strM13336c = Response3.m13336c(response3, "Retry-After", null, 2);
        if (strM13336c == null) {
            return i;
        }
        if (!new Regex2("\\d+").m12982a(strM13336c)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM13336c);
        Intrinsics2.m13086b(numValueOf, "Integer.valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // p509g1.Interceptor
    public Response3 intercept(Interceptor.a aVar) throws Throwable {
        ArrayList arrayList;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        Intrinsics2.m13090f(aVar, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) aVar;
        Request3 request3 = realInterceptorChain.f30292f;
        RealCall realCall = realInterceptorChain.f30288b;
        boolean z = true;
        List list = Collections4.f29519f;
        Response3 response3 = null;
        int i = 0;
        Request3 request3M13495a = request3;
        boolean z2 = true;
        while (true) {
            Objects.requireNonNull(realCall);
            Intrinsics2.m13090f(request3M13495a, "request");
            if (!(realCall.f30221n == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            synchronized (realCall) {
                if (!(realCall.f30223p ^ z)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
                if (!(realCall.f30222o ^ z)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            if (z2) {
                RealConnectionPool realConnectionPool = realCall.f30213f;
                HttpUrl httpUrl = request3M13495a.f29951b;
                if (httpUrl.f30643c) {
                    OkHttpClient okHttpClient = realCall.f30228u;
                    SSLSocketFactory sSLSocketFactory2 = okHttpClient.f29877y;
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("CLEARTEXT-only client");
                    }
                    HostnameVerifier hostnameVerifier2 = okHttpClient.f29851C;
                    certificatePinner = okHttpClient.f29852D;
                    sSLSocketFactory = sSLSocketFactory2;
                    hostnameVerifier = hostnameVerifier2;
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    certificatePinner = null;
                }
                String str = httpUrl.f30647g;
                int i2 = httpUrl.f30648h;
                OkHttpClient okHttpClient2 = realCall.f30228u;
                realCall.f30218k = new ExchangeFinder(realConnectionPool, new Address(str, i2, okHttpClient2.f29872t, okHttpClient2.f29876x, sSLSocketFactory, hostnameVerifier, certificatePinner, okHttpClient2.f29875w, okHttpClient2.f29873u, okHttpClient2.f29850B, okHttpClient2.f29849A, okHttpClient2.f29874v), realCall, realCall.f30214g);
            }
            try {
                if (realCall.f30225r) {
                    throw new IOException("Canceled");
                }
                try {
                    Response3 response3Mo13492a = realInterceptorChain.mo13492a(request3M13495a);
                    if (response3 != 0) {
                        Response3.a aVar2 = new Response3.a(response3Mo13492a);
                        Response3.a aVar3 = new Response3.a(response3);
                        aVar3.f30009g = null;
                        Response3 response3M13339a = aVar3.m13339a();
                        if (!(response3M13339a.f29996m == null)) {
                            throw new IllegalArgumentException("priorResponse.body != null".toString());
                        }
                        aVar2.f30012j = response3M13339a;
                        response3Mo13492a = aVar2.m13339a();
                    }
                    Response3 response4 = response3Mo13492a;
                    Exchange exchange = realCall.f30221n;
                    try {
                        request3M13495a = m13495a(response4, exchange);
                        if (request3M13495a == null) {
                            if (exchange != null && exchange.f30186a) {
                                if (!(!realCall.f30220m)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                realCall.f30220m = true;
                                realCall.f30215h.m13704i();
                            }
                            realCall.m13447g(false);
                            return response4;
                        }
                        ResponseBody responseBody = response4.f29996m;
                        if (responseBody != null) {
                            byte[] bArr = Util9.f30070a;
                            Intrinsics2.m13090f(responseBody, "$this$closeQuietly");
                            try {
                                responseBody.close();
                            } catch (RuntimeException e) {
                                throw e;
                            } catch (Exception unused) {
                            }
                        }
                        i++;
                        if (i > 20) {
                            throw new ProtocolException("Too many follow-up requests: " + i);
                        }
                        realCall.m13447g(true);
                        response3 = response4;
                        list = list;
                        z2 = true;
                        response3 = response3;
                        z = true;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (RouteException e2) {
                    List list2 = list;
                    if (!m13496b(e2.f30264f, realCall, request3M13495a, false)) {
                        IOException iOException = e2.f30265g;
                        Util9.m13360A(iOException, list2);
                        throw iOException;
                    }
                    IOException iOException2 = e2.f30265g;
                    Intrinsics2.m13089e(list2, "$this$plus");
                    ArrayList arrayList2 = new ArrayList(list2.size() + 1);
                    arrayList2.addAll(list2);
                    arrayList2.add(iOException2);
                    realCall.m13447g(true);
                    arrayList = arrayList2;
                    list = arrayList;
                    i = i;
                    z2 = false;
                } catch (IOException e3) {
                    if (!m13496b(e3, realCall, request3M13495a, !(e3 instanceof ConnectionShutdownException))) {
                        Util9.m13360A(e3, list);
                        throw e3;
                    }
                    Collection collection = list;
                    Intrinsics2.m13089e(collection, "$this$plus");
                    arrayList = new ArrayList(collection.size() + 1);
                    arrayList.addAll(collection);
                    arrayList.add(e3);
                    realCall.m13447g(true);
                    list = arrayList;
                    i = i;
                    z2 = false;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            realCall.m13447g(true);
            throw th;
        }
    }
}
