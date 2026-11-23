package p509g1.p510j0.p517j;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p477d1.TypeCastException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Headers2;
import p509g1.HttpUrl;
import p509g1.OkHttpClient;
import p509g1.Protocol;
import p509g1.Request3;
import p509g1.Response3;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p514g.RealConnection;
import p509g1.p510j0.p515h.ExchangeCodec;
import p509g1.p510j0.p515h.HttpHeaders2;
import p509g1.p510j0.p515h.RealInterceptorChain;
import p509g1.p510j0.p515h.StatusLine;
import p524h1.ByteString3;
import p524h1.Sink;
import p524h1.Source;

/* JADX INFO: renamed from: g1.j0.j.m, reason: use source file name */
/* JADX INFO: compiled from: Http2ExchangeCodec.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {

    /* JADX INFO: renamed from: d */
    public volatile Http2Stream f30453d;

    /* JADX INFO: renamed from: e */
    public final Protocol f30454e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f30455f;

    /* JADX INFO: renamed from: g */
    public final RealConnection f30456g;

    /* JADX INFO: renamed from: h */
    public final RealInterceptorChain f30457h;

    /* JADX INFO: renamed from: i */
    public final Http2Connection f30458i;

    /* JADX INFO: renamed from: c */
    public static final a f30452c = new a(null);

    /* JADX INFO: renamed from: a */
    public static final List<String> f30450a = Util9.m13372l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: b */
    public static final List<String> f30451b = Util9.m13372l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: g1.j0.j.m$a */
    /* JADX INFO: compiled from: Http2ExchangeCodec.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        Intrinsics2.m13090f(okHttpClient, "client");
        Intrinsics2.m13090f(realConnection, "connection");
        Intrinsics2.m13090f(realInterceptorChain, "chain");
        Intrinsics2.m13090f(http2Connection, "http2Connection");
        this.f30456g = realConnection;
        this.f30457h = realInterceptorChain;
        this.f30458i = http2Connection;
        List<Protocol> list = okHttpClient.f29850B;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f30454e = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    /* JADX INFO: renamed from: a */
    public void mo13477a() throws IOException {
        Http2Stream http2Stream = this.f30453d;
        if (http2Stream != null) {
            ((Http2Stream.b) http2Stream.m13555g()).close();
        } else {
            Intrinsics2.m13095k();
            throw null;
        }
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    /* JADX INFO: renamed from: b */
    public void mo13478b(Request3 request3) throws IOException {
        int i;
        Http2Stream http2Stream;
        boolean z;
        Intrinsics2.m13090f(request3, "request");
        if (this.f30453d != null) {
            return;
        }
        boolean z2 = request3.f29954e != null;
        Objects.requireNonNull(f30452c);
        Intrinsics2.m13090f(request3, "request");
        Headers2 headers2 = request3.f29953d;
        ArrayList arrayList = new ArrayList(headers2.size() + 4);
        arrayList.add(new Header(Header.f30340c, request3.f29952c));
        ByteString3 byteString3 = Header.f30341d;
        HttpUrl httpUrl = request3.f29951b;
        Intrinsics2.m13090f(httpUrl, "url");
        String strM13665b = httpUrl.m13665b();
        String strM13667d = httpUrl.m13667d();
        if (strM13667d != null) {
            strM13665b = strM13665b + '?' + strM13667d;
        }
        arrayList.add(new Header(byteString3, strM13665b));
        String strM13312b = request3.m13312b("Host");
        if (strM13312b != null) {
            arrayList.add(new Header(Header.f30343f, strM13312b));
        }
        arrayList.add(new Header(Header.f30342e, request3.f29951b.f30644d));
        int size = headers2.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strM13650f = headers2.m13650f(i2);
            Locale locale = Locale.US;
            Intrinsics2.m13086b(locale, "Locale.US");
            if (strM13650f == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strM13650f.toLowerCase(locale);
            Intrinsics2.m13086b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (!f30450a.contains(lowerCase) || (Intrinsics2.m13085a(lowerCase, "te") && Intrinsics2.m13085a(headers2.m13653m(i2), "trailers"))) {
                arrayList.add(new Header(lowerCase, headers2.m13653m(i2)));
            }
        }
        Http2Connection http2Connection = this.f30458i;
        Objects.requireNonNull(http2Connection);
        Intrinsics2.m13090f(arrayList, "requestHeaders");
        boolean z3 = !z2;
        synchronized (http2Connection.f30381G) {
            synchronized (http2Connection) {
                if (http2Connection.f30389m > 1073741823) {
                    http2Connection.m13524B(ErrorCode2.REFUSED_STREAM);
                }
                if (http2Connection.f30390n) {
                    throw new ConnectionShutdownException();
                }
                i = http2Connection.f30389m;
                http2Connection.f30389m = i + 2;
                http2Stream = new Http2Stream(i, http2Connection, z3, false, null);
                z = !z2 || http2Connection.f30378D >= http2Connection.f30379E || http2Stream.f30473c >= http2Stream.f30474d;
                if (http2Stream.m13557i()) {
                    http2Connection.f30386j.put(Integer.valueOf(i), http2Stream);
                }
            }
            http2Connection.f30381G.m13573u(z3, i, arrayList);
        }
        if (z) {
            http2Connection.f30381G.flush();
        }
        this.f30453d = http2Stream;
        if (this.f30455f) {
            Http2Stream http2Stream2 = this.f30453d;
            if (http2Stream2 == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            http2Stream2.m13553e(ErrorCode2.CANCEL);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream3 = this.f30453d;
        if (http2Stream3 == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        Http2Stream.d dVar = http2Stream3.f30479i;
        long j2 = this.f30457h.f30294h;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dVar.mo13702g(j2, timeUnit);
        Http2Stream http2Stream4 = this.f30453d;
        if (http2Stream4 == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        http2Stream4.f30480j.mo13702g(this.f30457h.f30295i, timeUnit);
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    /* JADX INFO: renamed from: c */
    public Source mo13479c(Response3 response3) {
        Intrinsics2.m13090f(response3, "response");
        Http2Stream http2Stream = this.f30453d;
        if (http2Stream != null) {
            return http2Stream.f30477g;
        }
        Intrinsics2.m13095k();
        throw null;
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    public void cancel() {
        this.f30455f = true;
        Http2Stream http2Stream = this.f30453d;
        if (http2Stream != null) {
            http2Stream.m13553e(ErrorCode2.CANCEL);
        }
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    /* JADX INFO: renamed from: d */
    public Response3.a mo13480d(boolean z) throws IOException {
        Headers2 headers2;
        Http2Stream http2Stream = this.f30453d;
        if (http2Stream == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        synchronized (http2Stream) {
            http2Stream.f30479i.m13703h();
            while (http2Stream.f30475e.isEmpty() && http2Stream.f30481k == null) {
                try {
                    http2Stream.m13560l();
                } catch (Throwable th) {
                    http2Stream.f30479i.m13564l();
                    throw th;
                }
            }
            http2Stream.f30479i.m13564l();
            if (!(!http2Stream.f30475e.isEmpty())) {
                IOException iOException = http2Stream.f30482l;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode2 errorCode2 = http2Stream.f30481k;
                if (errorCode2 != null) {
                    throw new StreamResetException(errorCode2);
                }
                Intrinsics2.m13095k();
                throw null;
            }
            Headers2 headers2RemoveFirst = http2Stream.f30475e.removeFirst();
            Intrinsics2.m13086b(headers2RemoveFirst, "headersQueue.removeFirst()");
            headers2 = headers2RemoveFirst;
        }
        a aVar = f30452c;
        Protocol protocol = this.f30454e;
        Objects.requireNonNull(aVar);
        Intrinsics2.m13090f(headers2, "headerBlock");
        Intrinsics2.m13090f(protocol, "protocol");
        Headers2.a aVar2 = new Headers2.a();
        int size = headers2.size();
        StatusLine statusLineM13498a = null;
        for (int i = 0; i < size; i++) {
            String strM13650f = headers2.m13650f(i);
            String strM13653m = headers2.m13653m(i);
            if (Intrinsics2.m13085a(strM13650f, ":status")) {
                statusLineM13498a = StatusLine.f30300a.m13498a("HTTP/1.1 " + strM13653m);
            } else if (!f30451b.contains(strM13650f)) {
                aVar2.m13657c(strM13650f, strM13653m);
            }
        }
        if (statusLineM13498a == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        Response3.a aVar3 = new Response3.a();
        aVar3.m13344f(protocol);
        aVar3.f30005c = statusLineM13498a.f30302c;
        aVar3.m13343e(statusLineM13498a.f30303d);
        aVar3.m13342d(aVar2.m13658d());
        if (z && aVar3.f30005c == 100) {
            return null;
        }
        return aVar3;
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    /* JADX INFO: renamed from: e */
    public RealConnection mo13481e() {
        return this.f30456g;
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    /* JADX INFO: renamed from: f */
    public void mo13482f() throws IOException {
        this.f30458i.f30381G.flush();
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    /* JADX INFO: renamed from: g */
    public long mo13483g(Response3 response3) {
        Intrinsics2.m13090f(response3, "response");
        if (HttpHeaders2.m13485a(response3)) {
            return Util9.m13371k(response3);
        }
        return 0L;
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    /* JADX INFO: renamed from: h */
    public Sink mo13484h(Request3 request3, long j2) {
        Intrinsics2.m13090f(request3, "request");
        Http2Stream http2Stream = this.f30453d;
        if (http2Stream != null) {
            return http2Stream.m13555g();
        }
        Intrinsics2.m13095k();
        throw null;
    }
}
