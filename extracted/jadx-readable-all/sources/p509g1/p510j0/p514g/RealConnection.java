package p509g1.p510j0.p514g;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p481d0.Indent2;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Address;
import p509g1.Call;
import p509g1.CertificatePinner;
import p509g1.CertificatePinner2;
import p509g1.Connection;
import p509g1.ConnectionSpec;
import p509g1.EventListener;
import p509g1.Handshake;
import p509g1.Headers2;
import p509g1.HttpUrl;
import p509g1.OkHttpClient;
import p509g1.Protocol;
import p509g1.Request3;
import p509g1.Response3;
import p509g1.Route;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p513f.TaskQueue;
import p509g1.p510j0.p513f.TaskQueue2;
import p509g1.p510j0.p513f.TaskRunner;
import p509g1.p510j0.p515h.ExchangeCodec;
import p509g1.p510j0.p515h.RealInterceptorChain;
import p509g1.p510j0.p516i.Http1ExchangeCodec;
import p509g1.p510j0.p517j.ErrorCode2;
import p509g1.p510j0.p517j.Http2;
import p509g1.p510j0.p517j.Http2Connection;
import p509g1.p510j0.p517j.Http2ExchangeCodec;
import p509g1.p510j0.p517j.Http2Stream;
import p509g1.p510j0.p517j.Http2Writer;
import p509g1.p510j0.p517j.Settings2;
import p509g1.p510j0.p519l.Platform;
import p509g1.p510j0.p522n.OkHostnameVerifier;
import p524h1.BufferedSink;
import p524h1.BufferedSource;
import p524h1.RealBufferedSink;
import p524h1.RealBufferedSource;
import p524h1.Sink;
import p524h1.Source;
import p524h1.Timeout2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: g1.j0.g.f, reason: use source file name */
/* JADX INFO: compiled from: RealConnection.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RealConnection extends Http2Connection.d implements Connection {

    /* JADX INFO: renamed from: b */
    public Socket f30236b;

    /* JADX INFO: renamed from: c */
    public Socket f30237c;

    /* JADX INFO: renamed from: d */
    public Handshake f30238d;

    /* JADX INFO: renamed from: e */
    public Protocol f30239e;

    /* JADX INFO: renamed from: f */
    public Http2Connection f30240f;

    /* JADX INFO: renamed from: g */
    public BufferedSource f30241g;

    /* JADX INFO: renamed from: h */
    public BufferedSink f30242h;

    /* JADX INFO: renamed from: i */
    public boolean f30243i;

    /* JADX INFO: renamed from: j */
    public boolean f30244j;

    /* JADX INFO: renamed from: k */
    public int f30245k;

    /* JADX INFO: renamed from: l */
    public int f30246l;

    /* JADX INFO: renamed from: m */
    public int f30247m;

    /* JADX INFO: renamed from: n */
    public int f30248n;

    /* JADX INFO: renamed from: o */
    public final List<Reference<RealCall>> f30249o;

    /* JADX INFO: renamed from: p */
    public long f30250p;

    /* JADX INFO: renamed from: q */
    public final Route f30251q;

    /* JADX INFO: renamed from: g1.j0.g.f$a */
    /* JADX INFO: compiled from: RealConnection.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route) {
        Intrinsics2.m13090f(realConnectionPool, "connectionPool");
        Intrinsics2.m13090f(route, "route");
        this.f30251q = route;
        this.f30248n = 1;
        this.f30249o = new ArrayList();
        this.f30250p = Long.MAX_VALUE;
    }

    @Override // p509g1.p510j0.p517j.Http2Connection.d
    /* JADX INFO: renamed from: a */
    public synchronized void mo13454a(Http2Connection http2Connection, Settings2 settings2) {
        Intrinsics2.m13090f(http2Connection, "connection");
        Intrinsics2.m13090f(settings2, "settings");
        this.f30248n = (settings2.f30511a & 16) != 0 ? settings2.f30512b[4] : Integer.MAX_VALUE;
    }

    @Override // p509g1.p510j0.p517j.Http2Connection.d
    /* JADX INFO: renamed from: b */
    public void mo13455b(Http2Stream http2Stream) throws IOException {
        Intrinsics2.m13090f(http2Stream, "stream");
        http2Stream.m13551c(ErrorCode2.REFUSED_STREAM, null);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x011b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0121  */
    /* JADX WARN: Code duplicated, block: B:58:0x012d  */
    /* JADX WARN: Code duplicated, block: B:78:0x015a  */
    /* JADX WARN: Code duplicated, block: B:92:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:0: B:86:0x007a->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final void m13456c(int i, int i2, int i3, int i4, boolean z, Call call, EventListener eventListener) throws Throwable {
        Socket socket;
        Socket socket2;
        boolean z2;
        Intrinsics2.m13090f(call, "call");
        Intrinsics2.m13090f(eventListener, "eventListener");
        if (!(this.f30239e == null)) {
            throw new IllegalStateException("already connected".toString());
        }
        List<ConnectionSpec> list = this.f30251q.f30034a.f29837c;
        ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(list);
        Address address = this.f30251q.f30034a;
        if (address.f29840f == null) {
            if (!list.contains(ConnectionSpec.f30592d)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f30251q.f30034a.f29835a.f30647g;
            Objects.requireNonNull(Platform.f30547c);
            if (!Platform.f30545a.mo13593h(str)) {
                throw new RouteException(new UnknownServiceException(outline.m1600v("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (address.f29836b.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                if (this.f30251q.m13354a()) {
                    m13459f(i, i2, i3, call, eventListener);
                    if (this.f30236b == null) {
                        break;
                    }
                } else {
                    try {
                        m13458e(i, i2, call, eventListener);
                    } catch (IOException e) {
                        e = e;
                        socket = this.f30237c;
                        if (socket != null) {
                            Util9.m13365e(socket);
                        }
                        socket2 = this.f30236b;
                        if (socket2 != null) {
                            Util9.m13365e(socket2);
                        }
                        this.f30237c = null;
                        this.f30236b = null;
                        this.f30241g = null;
                        this.f30242h = null;
                        this.f30238d = null;
                        this.f30239e = null;
                        this.f30240f = null;
                        this.f30248n = 1;
                        Route route = this.f30251q;
                        InetSocketAddress inetSocketAddress = route.f30036c;
                        Proxy proxy = route.f30035b;
                        Intrinsics2.m13090f(call, "call");
                        Intrinsics2.m13090f(inetSocketAddress, "inetSocketAddress");
                        Intrinsics2.m13090f(proxy, "proxy");
                        Intrinsics2.m13090f(e, "ioe");
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            Intrinsics2.m13090f(e, "e");
                            routeException.f30265g.addSuppressed(e);
                            routeException.f30264f = e;
                        }
                        if (z) {
                            throw routeException;
                        }
                        Intrinsics2.m13090f(e, "e");
                        connectionSpecSelector.f30184c = true;
                        if (connectionSpecSelector.f30183b || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException))) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            throw routeException;
                        }
                    }
                }
                try {
                    m13460g(connectionSpecSelector, i4, call, eventListener);
                    Route route2 = this.f30251q;
                    InetSocketAddress inetSocketAddress2 = route2.f30036c;
                    Proxy proxy2 = route2.f30035b;
                    Intrinsics2.m13090f(call, "call");
                    Intrinsics2.m13090f(inetSocketAddress2, "inetSocketAddress");
                    Intrinsics2.m13090f(proxy2, "proxy");
                    break;
                } catch (IOException e2) {
                    e = e2;
                    socket = this.f30237c;
                    if (socket != null) {
                        Util9.m13365e(socket);
                    }
                    socket2 = this.f30236b;
                    if (socket2 != null) {
                        Util9.m13365e(socket2);
                    }
                    this.f30237c = null;
                    this.f30236b = null;
                    this.f30241g = null;
                    this.f30242h = null;
                    this.f30238d = null;
                    this.f30239e = null;
                    this.f30240f = null;
                    this.f30248n = 1;
                    Route route3 = this.f30251q;
                    InetSocketAddress inetSocketAddress3 = route3.f30036c;
                    Proxy proxy3 = route3.f30035b;
                    Intrinsics2.m13090f(call, "call");
                    Intrinsics2.m13090f(inetSocketAddress3, "inetSocketAddress");
                    Intrinsics2.m13090f(proxy3, "proxy");
                    Intrinsics2.m13090f(e, "ioe");
                    if (routeException == null) {
                        routeException = new RouteException(e);
                    } else {
                        Intrinsics2.m13090f(e, "e");
                        routeException.f30265g.addSuppressed(e);
                        routeException.f30264f = e;
                    }
                    if (z) {
                        throw routeException;
                    }
                    Intrinsics2.m13090f(e, "e");
                    connectionSpecSelector.f30184c = true;
                    if (connectionSpecSelector.f30183b) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        throw routeException;
                    }
                }
            } catch (IOException e3) {
                e = e3;
            }
        }
        if (this.f30251q.m13354a() && this.f30236b == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f30250p = System.nanoTime();
    }

    /* JADX INFO: renamed from: d */
    public final void m13457d(OkHttpClient okHttpClient, Route route, IOException iOException) {
        Intrinsics2.m13090f(okHttpClient, "client");
        Intrinsics2.m13090f(route, "failedRoute");
        Intrinsics2.m13090f(iOException, "failure");
        if (route.f30035b.type() != Proxy.Type.DIRECT) {
            Address address = route.f30034a;
            address.f29845k.connectFailed(address.f29835a.m13672i(), route.f30035b.address(), iOException);
        }
        RouteDatabase routeDatabase = okHttpClient.f29860L;
        synchronized (routeDatabase) {
            Intrinsics2.m13090f(route, "failedRoute");
            routeDatabase.f30263a.add(route);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13458e(int i, int i2, Call call, EventListener eventListener) throws IOException {
        Socket socket;
        int i3;
        Route route = this.f30251q;
        Proxy proxy = route.f30035b;
        Address address = route.f30034a;
        Proxy.Type type = proxy.type();
        if (type != null && ((i3 = C6371g.f30252a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = address.f29839e.createSocket();
            if (socket == null) {
                Intrinsics2.m13095k();
                throw null;
            }
        } else {
            socket = new Socket(proxy);
        }
        this.f30236b = socket;
        InetSocketAddress inetSocketAddress = this.f30251q.f30036c;
        Objects.requireNonNull(eventListener);
        Intrinsics2.m13090f(call, "call");
        Intrinsics2.m13090f(inetSocketAddress, "inetSocketAddress");
        Intrinsics2.m13090f(proxy, "proxy");
        socket.setSoTimeout(i2);
        try {
            Objects.requireNonNull(Platform.f30547c);
            Platform.f30545a.mo13595e(socket, this.f30251q.f30036c, i);
            try {
                Source sourceM14076a0 = SkuDao.a.m14076a0(socket);
                Intrinsics2.m13090f(sourceM14076a0, "$this$buffer");
                this.f30241g = new RealBufferedSource(sourceM14076a0);
                Sink sinkM14073Y = SkuDao.a.m14073Y(socket);
                Intrinsics2.m13090f(sinkM14073Y, "$this$buffer");
                this.f30242h = new RealBufferedSink(sinkM14073Y);
            } catch (NullPointerException e) {
                if (Intrinsics2.m13085a(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder sbM1556G = outline.m1556G("Failed to connect to ");
            sbM1556G.append(this.f30251q.f30036c);
            ConnectException connectException = new ConnectException(sbM1556G.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [g1.a0, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX INFO: renamed from: f */
    public final void m13459f(int i, int i2, int i3, Call call, EventListener eventListener) throws IOException {
        Request3.a aVar = new Request3.a();
        aVar.m13321i(this.f30251q.f30034a.f29835a);
        boolean z = false;
        aVar.m13318f("CONNECT", null);
        boolean z2 = true;
        aVar.m13316d("Host", Util9.m13383w(this.f30251q.f30034a.f29835a, true));
        aVar.m13316d("Proxy-Connection", "Keep-Alive");
        aVar.m13316d("User-Agent", "okhttp/4.8.1");
        Request3 request3M13314b = aVar.m13314b();
        Response3.a aVar2 = new Response3.a();
        aVar2.m13345g(request3M13314b);
        aVar2.m13344f(Protocol.HTTP_1_1);
        aVar2.f30005c = 407;
        aVar2.m13343e("Preemptive Authenticate");
        aVar2.f30009g = Util9.f30072c;
        aVar2.f30013k = -1L;
        aVar2.f30014l = -1L;
        Intrinsics2.m13090f("Proxy-Authenticate", "name");
        Intrinsics2.m13090f("OkHttp-Preemptive", "value");
        Headers2.a aVar3 = aVar2.f30008f;
        Objects.requireNonNull(aVar3);
        Intrinsics2.m13090f("Proxy-Authenticate", "name");
        Intrinsics2.m13090f("OkHttp-Preemptive", "value");
        Headers2.b bVar = Headers2.f30638f;
        bVar.m13661a("Proxy-Authenticate");
        bVar.m13662b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar3.m13660f("Proxy-Authenticate");
        aVar3.m13657c("Proxy-Authenticate", "OkHttp-Preemptive");
        Response3 response3M13339a = aVar2.m13339a();
        Route route = this.f30251q;
        Request3 request3Mo13301a = route.f30034a.f29843i.mo13301a(route, response3M13339a);
        if (request3Mo13301a != null) {
            request3M13314b = request3Mo13301a;
        }
        HttpUrl httpUrl = request3M13314b.f29951b;
        int i4 = 0;
        while (i4 < 21) {
            m13458e(i, i2, call, eventListener);
            String str = "CONNECT " + Util9.m13383w(httpUrl, z2) + " HTTP/1.1";
            ?? r5 = z;
            while (true) {
                BufferedSource bufferedSource = this.f30241g;
                if (bufferedSource == null) {
                    Intrinsics2.m13095k();
                    throw r5;
                }
                BufferedSink bufferedSink = this.f30242h;
                if (bufferedSink == null) {
                    Intrinsics2.m13095k();
                    throw r5;
                }
                Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(r5, this, bufferedSource, bufferedSink);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                bufferedSource.mo13391d().mo13702g(i2, timeUnit);
                bufferedSink.mo13505d().mo13702g(i3, timeUnit);
                http1ExchangeCodec.m13503k(request3M13314b.f29953d, str);
                http1ExchangeCodec.f30312g.flush();
                Response3.a aVarMo13480d = http1ExchangeCodec.mo13480d(false);
                if (aVarMo13480d == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                aVarMo13480d.m13345g(request3M13314b);
                Response3 response3M13339a2 = aVarMo13480d.m13339a();
                Intrinsics2.m13090f(response3M13339a2, "response");
                long jM13371k = Util9.m13371k(response3M13339a2);
                if (jM13371k != -1) {
                    Source sourceM13502j = http1ExchangeCodec.m13502j(jM13371k);
                    Util9.m13381u(sourceM13502j, Integer.MAX_VALUE, timeUnit);
                    ((Http1ExchangeCodec.e) sourceM13502j).close();
                }
                int i5 = response3M13339a2.f29993j;
                if (i5 == 200) {
                    if (!bufferedSource.mo13739b().mo13759y() || !bufferedSink.mo13739b().mo13759y()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    request3M13314b = null;
                    break;
                }
                if (i5 != 407) {
                    StringBuilder sbM1556G = outline.m1556G("Unexpected response code for CONNECT: ");
                    sbM1556G.append(response3M13339a2.f29993j);
                    throw new IOException(sbM1556G.toString());
                }
                Route route2 = this.f30251q;
                Request3 request3Mo13301a2 = route2.f30034a.f29843i.mo13301a(route2, response3M13339a2);
                if (request3Mo13301a2 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if (StringsJVM.m12989f("close", Response3.m13336c(response3M13339a2, "Connection", null, 2), true)) {
                    request3M13314b = request3Mo13301a2;
                    break;
                } else {
                    r5 = 0;
                    request3M13314b = request3Mo13301a2;
                }
            }
            if (request3M13314b == null) {
                return;
            }
            Socket socket = this.f30236b;
            if (socket != null) {
                Util9.m13365e(socket);
            }
            this.f30236b = null;
            this.f30242h = null;
            this.f30241g = null;
            Route route3 = this.f30251q;
            InetSocketAddress inetSocketAddress = route3.f30036c;
            Proxy proxy = route3.f30035b;
            Intrinsics2.m13090f(call, "call");
            Intrinsics2.m13090f(inetSocketAddress, "inetSocketAddress");
            Intrinsics2.m13090f(proxy, "proxy");
            i4++;
            z = false;
            z2 = true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: g */
    public final void m13460g(ConnectionSpecSelector connectionSpecSelector, int i, Call call, EventListener eventListener) throws Throwable {
        Address address = this.f30251q.f30034a;
        if (address.f29840f == null) {
            List<Protocol> list = address.f29836b;
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol)) {
                this.f30237c = this.f30236b;
                this.f30239e = Protocol.HTTP_1_1;
                return;
            } else {
                this.f30237c = this.f30236b;
                this.f30239e = protocol;
                m13468o(i);
                return;
            }
        }
        Intrinsics2.m13090f(call, "call");
        Address address2 = this.f30251q.f30034a;
        SSLSocketFactory sSLSocketFactory = address2.f29840f;
        SSLSocket sSLSocket = null;
        String strMo13592f = null;
        try {
            if (sSLSocketFactory == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            Socket socket = this.f30236b;
            HttpUrl httpUrl = address2.f29835a;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, httpUrl.f30647g, httpUrl.f30648h, true);
            if (socketCreateSocket == null) {
                throw new TypeCastException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                ConnectionSpec connectionSpecM13431a = connectionSpecSelector.m13431a(sSLSocket2);
                if (connectionSpecM13431a.f30594f) {
                    Objects.requireNonNull(Platform.f30547c);
                    Platform.f30545a.mo13591d(sSLSocket2, address2.f29835a.f30647g, address2.f29836b);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                Handshake.a aVar = Handshake.f30630a;
                Intrinsics2.m13086b(session, "sslSocketSession");
                Handshake handshakeM13647a = aVar.m13647a(session);
                HostnameVerifier hostnameVerifier = address2.f29841g;
                if (hostnameVerifier == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                if (hostnameVerifier.verify(address2.f29835a.f30647g, session)) {
                    CertificatePinner certificatePinner = address2.f29842h;
                    if (certificatePinner == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    this.f30238d = new Handshake(handshakeM13647a.f30632c, handshakeM13647a.f30633d, handshakeM13647a.f30634e, new RealConnection2(certificatePinner, handshakeM13647a, address2));
                    certificatePinner.m13346a(address2.f29835a.f30647g, new RealConnection3(this));
                    if (connectionSpecM13431a.f30594f) {
                        Objects.requireNonNull(Platform.f30547c);
                        strMo13592f = Platform.f30545a.mo13592f(sSLSocket2);
                    }
                    this.f30237c = sSLSocket2;
                    Source sourceM14076a0 = SkuDao.a.m14076a0(sSLSocket2);
                    Intrinsics2.m13090f(sourceM14076a0, "$this$buffer");
                    this.f30241g = new RealBufferedSource(sourceM14076a0);
                    Sink sinkM14073Y = SkuDao.a.m14073Y(sSLSocket2);
                    Intrinsics2.m13090f(sinkM14073Y, "$this$buffer");
                    this.f30242h = new RealBufferedSink(sinkM14073Y);
                    this.f30239e = strMo13592f != null ? Protocol.f29917m.m13302a(strMo13592f) : Protocol.HTTP_1_1;
                    Objects.requireNonNull(Platform.f30547c);
                    Platform.f30545a.mo13603a(sSLSocket2);
                    Intrinsics2.m13090f(call, "call");
                    if (this.f30239e == Protocol.HTTP_2) {
                        m13468o(i);
                        return;
                    }
                    return;
                }
                List<Certificate> listM13646b = handshakeM13647a.m13646b();
                if (!(!listM13646b.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + address2.f29835a.f30647g + " not verified (no certificates)");
                }
                Certificate certificate = listM13646b.get(0);
                if (certificate == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                X509Certificate x509Certificate = (X509Certificate) certificate;
                StringBuilder sb = new StringBuilder();
                sb.append("\n              |Hostname ");
                sb.append(address2.f29835a.f30647g);
                sb.append(" not verified:\n              |    certificate: ");
                sb.append(CertificatePinner.f30017b.m13348a(x509Certificate));
                sb.append("\n              |    DN: ");
                Principal subjectDN = x509Certificate.getSubjectDN();
                Intrinsics2.m13086b(subjectDN, "cert.subjectDN");
                sb.append(subjectDN.getName());
                sb.append("\n              |    subjectAltNames: ");
                OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.f30579a;
                Intrinsics2.m13090f(x509Certificate, "certificate");
                List<String> listM13620a = okHostnameVerifier.m13620a(x509Certificate, 7);
                List<String> listM13620a2 = okHostnameVerifier.m13620a(x509Certificate, 2);
                Intrinsics2.m13089e(listM13620a, "$this$plus");
                Intrinsics2.m13089e(listM13620a2, "elements");
                ArrayList arrayList = new ArrayList(listM13620a2.size() + listM13620a.size());
                arrayList.addAll(listM13620a);
                arrayList.addAll(listM13620a2);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(Indent2.m12985b(sb.toString(), null, 1));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Objects.requireNonNull(Platform.f30547c);
                    Platform.f30545a.mo13603a(sSLSocket);
                }
                if (sSLSocket != null) {
                    Util9.m13365e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00d3  */
    /* JADX INFO: renamed from: h */
    public final boolean m13461h(Address address, List<Route> list) {
        boolean z;
        boolean z2;
        Handshake handshake;
        boolean z3;
        Intrinsics2.m13090f(address, "address");
        byte[] bArr = Util9.f30070a;
        if (this.f30249o.size() >= this.f30248n || this.f30243i || !this.f30251q.f30034a.m13299a(address)) {
            return false;
        }
        if (Intrinsics2.m13085a(address.f29835a.f30647g, this.f30251q.f30034a.f29835a.f30647g)) {
            return true;
        }
        if (this.f30240f != null && list != null) {
            if (!list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    Route route = (Route) it.next();
                    if (route.f30035b.type() == Proxy.Type.DIRECT && this.f30251q.f30035b.type() == Proxy.Type.DIRECT && Intrinsics2.m13085a(this.f30251q.f30036c, route.f30036c)) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (z) {
                HostnameVerifier hostnameVerifier = address.f29841g;
                OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.f30579a;
                if (hostnameVerifier != okHostnameVerifier) {
                    return false;
                }
                HttpUrl httpUrl = address.f29835a;
                byte[] bArr2 = Util9.f30070a;
                HttpUrl httpUrl2 = this.f30251q.f30034a.f29835a;
                if (httpUrl.f30648h == httpUrl2.f30648h) {
                    if (!Intrinsics2.m13085a(httpUrl.f30647g, httpUrl2.f30647g)) {
                        if (!this.f30244j && (handshake = this.f30238d) != null) {
                            List<Certificate> listM13646b = handshake.m13646b();
                            if (!listM13646b.isEmpty()) {
                                String str = httpUrl.f30647g;
                                Certificate certificate = listM13646b.get(0);
                                if (certificate == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                                }
                                if (okHostnameVerifier.m13621b(str, (X509Certificate) certificate)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                            }
                        }
                        z2 = false;
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return false;
                }
                try {
                    CertificatePinner certificatePinner = address.f29842h;
                    if (certificatePinner == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    String str2 = address.f29835a.f30647g;
                    Handshake handshake2 = this.f30238d;
                    if (handshake2 == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    List<Certificate> listM13646b2 = handshake2.m13646b();
                    Intrinsics2.m13090f(str2, "hostname");
                    Intrinsics2.m13090f(listM13646b2, "peerCertificates");
                    certificatePinner.m13346a(str2, new CertificatePinner2(certificatePinner, listM13646b2, str2));
                    return true;
                } catch (SSLPeerUnverifiedException unused) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m13462i(boolean z) {
        long j2;
        byte[] bArr = Util9.f30070a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f30236b;
        if (socket == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        Socket socket2 = this.f30237c;
        if (socket2 == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        BufferedSource bufferedSource = this.f30241g;
        if (bufferedSource == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.f30240f;
        if (http2Connection != null) {
            synchronized (http2Connection) {
                if (http2Connection.f30390n) {
                    return false;
                }
                return http2Connection.f30399w >= http2Connection.f30398v || jNanoTime < http2Connection.f30401y;
            }
        }
        synchronized (this) {
            j2 = jNanoTime - this.f30250p;
        }
        if (j2 < 10000000000L || !z) {
            return true;
        }
        Intrinsics2.m13090f(socket2, "$this$isHealthy");
        Intrinsics2.m13090f(bufferedSource, "source");
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !bufferedSource.mo13759y();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m13463j() {
        return this.f30240f != null;
    }

    /* JADX INFO: renamed from: k */
    public final ExchangeCodec m13464k(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) throws SocketException {
        Intrinsics2.m13090f(okHttpClient, "client");
        Intrinsics2.m13090f(realInterceptorChain, "chain");
        Socket socket = this.f30237c;
        if (socket == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        BufferedSource bufferedSource = this.f30241g;
        if (bufferedSource == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        BufferedSink bufferedSink = this.f30242h;
        if (bufferedSink == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        Http2Connection http2Connection = this.f30240f;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        socket.setSoTimeout(realInterceptorChain.f30294h);
        Timeout2 timeout2Mo13391d = bufferedSource.mo13391d();
        long j2 = realInterceptorChain.f30294h;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout2Mo13391d.mo13702g(j2, timeUnit);
        bufferedSink.mo13505d().mo13702g(realInterceptorChain.f30295i, timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, bufferedSource, bufferedSink);
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m13465l() {
        this.f30243i = true;
    }

    /* JADX INFO: renamed from: m */
    public Protocol m13466m() {
        Protocol protocol = this.f30239e;
        if (protocol != null) {
            return protocol;
        }
        Intrinsics2.m13095k();
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public Socket m13467n() {
        Socket socket = this.f30237c;
        if (socket != null) {
            return socket;
        }
        Intrinsics2.m13095k();
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final void m13468o(int i) throws IOException {
        String strM1599u;
        int i2;
        Socket socket = this.f30237c;
        if (socket == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        BufferedSource bufferedSource = this.f30241g;
        if (bufferedSource == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        BufferedSink bufferedSink = this.f30242h;
        if (bufferedSink == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        socket.setSoTimeout(0);
        TaskRunner taskRunner = TaskRunner.f30169a;
        Http2Connection.b bVar = new Http2Connection.b(true, taskRunner);
        String str = this.f30251q.f30034a.f29835a.f30647g;
        Intrinsics2.m13090f(socket, "socket");
        Intrinsics2.m13090f(str, "peerName");
        Intrinsics2.m13090f(bufferedSource, "source");
        Intrinsics2.m13090f(bufferedSink, "sink");
        bVar.f30405a = socket;
        if (bVar.f30412h) {
            strM1599u = Util9.f30076g + ' ' + str;
        } else {
            strM1599u = outline.m1599u("MockWebServer ", str);
        }
        bVar.f30406b = strM1599u;
        bVar.f30407c = bufferedSource;
        bVar.f30408d = bufferedSink;
        Intrinsics2.m13090f(this, "listener");
        bVar.f30409e = this;
        bVar.f30411g = i;
        Http2Connection http2Connection = new Http2Connection(bVar);
        this.f30240f = http2Connection;
        Objects.requireNonNull(Http2Connection.f30374g);
        Settings2 settings2 = Http2Connection.f30373f;
        this.f30248n = (settings2.f30511a & 16) != 0 ? settings2.f30512b[4] : Integer.MAX_VALUE;
        Intrinsics2.m13090f(taskRunner, "taskRunner");
        Http2Writer http2Writer = http2Connection.f30381G;
        synchronized (http2Writer) {
            if (http2Writer.f30499i) {
                throw new IOException("closed");
            }
            if (http2Writer.f30502l) {
                Logger logger = Http2Writer.f30496f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Util9.m13369i(">> CONNECTION " + Http2.f30368a.mo13766l(), new Object[0]));
                }
                http2Writer.f30501k.mo13749m0(Http2.f30368a);
                http2Writer.f30501k.flush();
            }
        }
        Http2Writer http2Writer2 = http2Connection.f30381G;
        Settings2 settings3 = http2Connection.f30402z;
        synchronized (http2Writer2) {
            Intrinsics2.m13090f(settings3, "settings");
            if (http2Writer2.f30499i) {
                throw new IOException("closed");
            }
            http2Writer2.m13571f(0, Integer.bitCount(settings3.f30511a) * 6, 4, 0);
            int i3 = 0;
            while (i3 < 10) {
                if (((1 << i3) & settings3.f30511a) != 0) {
                    if (i3 != 4) {
                        i2 = i3 != 7 ? i3 : 4;
                    } else {
                        i2 = 3;
                    }
                    http2Writer2.f30501k.mo13751p(i2);
                    http2Writer2.f30501k.mo13753s(settings3.f30512b[i3]);
                }
                i3++;
            }
            http2Writer2.f30501k.flush();
        }
        int iM13579a = http2Connection.f30402z.m13579a();
        if (iM13579a != 65535) {
            http2Connection.f30381G.m13567H(0, iM13579a - 65535);
        }
        TaskQueue2 taskQueue2M13427f = taskRunner.m13427f();
        String str2 = http2Connection.f30387k;
        taskQueue2M13427f.m13419c(new TaskQueue(http2Connection.f30382H, str2, true, str2, true), 0L);
    }

    public String toString() {
        Object obj;
        StringBuilder sbM1556G = outline.m1556G("Connection{");
        sbM1556G.append(this.f30251q.f30034a.f29835a.f30647g);
        sbM1556G.append(':');
        sbM1556G.append(this.f30251q.f30034a.f29835a.f30648h);
        sbM1556G.append(',');
        sbM1556G.append(" proxy=");
        sbM1556G.append(this.f30251q.f30035b);
        sbM1556G.append(" hostAddress=");
        sbM1556G.append(this.f30251q.f30036c);
        sbM1556G.append(" cipherSuite=");
        Handshake handshake = this.f30238d;
        if (handshake == null || (obj = handshake.f30633d) == null) {
            obj = "none";
        }
        sbM1556G.append(obj);
        sbM1556G.append(" protocol=");
        sbM1556G.append(this.f30239e);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
