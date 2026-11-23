package p509g1.p510j0.p516i;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p481d0.Strings5;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.CookieJar;
import p509g1.Headers2;
import p509g1.HttpUrl;
import p509g1.OkHttpClient;
import p509g1.Request3;
import p509g1.Response3;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p514g.RealConnection;
import p509g1.p510j0.p515h.ExchangeCodec;
import p509g1.p510j0.p515h.HttpHeaders2;
import p509g1.p510j0.p515h.StatusLine;
import p524h1.Buffer3;
import p524h1.BufferedSink;
import p524h1.BufferedSource;
import p524h1.ForwardingTimeout;
import p524h1.Sink;
import p524h1.Source;
import p524h1.Timeout2;

/* JADX INFO: renamed from: g1.j0.i.b, reason: use source file name */
/* JADX INFO: compiled from: Http1ExchangeCodec.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {

    /* JADX INFO: renamed from: a */
    public int f30306a;

    /* JADX INFO: renamed from: b */
    public final HeadersReader f30307b;

    /* JADX INFO: renamed from: c */
    public Headers2 f30308c;

    /* JADX INFO: renamed from: d */
    public final OkHttpClient f30309d;

    /* JADX INFO: renamed from: e */
    public final RealConnection f30310e;

    /* JADX INFO: renamed from: f */
    public final BufferedSource f30311f;

    /* JADX INFO: renamed from: g */
    public final BufferedSink f30312g;

    /* JADX INFO: renamed from: g1.j0.i.b$a */
    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    public abstract class a implements Source {

        /* JADX INFO: renamed from: f */
        public final ForwardingTimeout f30313f;

        /* JADX INFO: renamed from: g */
        public boolean f30314g;

        public a() {
            this.f30313f = new ForwardingTimeout(Http1ExchangeCodec.this.f30311f.mo13391d());
        }

        /* JADX INFO: renamed from: a */
        public final void m13504a() {
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            int i = http1ExchangeCodec.f30306a;
            if (i == 6) {
                return;
            }
            if (i == 5) {
                Http1ExchangeCodec.m13501i(http1ExchangeCodec, this.f30313f);
                Http1ExchangeCodec.this.f30306a = 6;
            } else {
                StringBuilder sbM1556G = outline.m1556G("state: ");
                sbM1556G.append(Http1ExchangeCodec.this.f30306a);
                throw new IllegalStateException(sbM1556G.toString());
            }
        }

        @Override // p524h1.Source
        /* JADX INFO: renamed from: d */
        public Timeout2 mo13391d() {
            return this.f30313f;
        }

        @Override // p524h1.Source
        /* JADX INFO: renamed from: p0 */
        public long mo13392p0(Buffer3 buffer3, long j2) throws IOException {
            Intrinsics2.m13090f(buffer3, "sink");
            try {
                return Http1ExchangeCodec.this.f30311f.mo13392p0(buffer3, j2);
            } catch (IOException e) {
                Http1ExchangeCodec.this.f30310e.m13465l();
                m13504a();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: g1.j0.i.b$b */
    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    public final class b implements Sink {

        /* JADX INFO: renamed from: f */
        public final ForwardingTimeout f30316f;

        /* JADX INFO: renamed from: g */
        public boolean f30317g;

        public b() {
            this.f30316f = new ForwardingTimeout(Http1ExchangeCodec.this.f30312g.mo13505d());
        }

        @Override // p524h1.Sink
        /* JADX INFO: renamed from: U */
        public void mo13415U(Buffer3 buffer3, long j2) throws IOException {
            Intrinsics2.m13090f(buffer3, "source");
            if (!(!this.f30317g)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j2 == 0) {
                return;
            }
            Http1ExchangeCodec.this.f30312g.mo13735W(j2);
            Http1ExchangeCodec.this.f30312g.mo13728P("\r\n");
            Http1ExchangeCodec.this.f30312g.mo13415U(buffer3, j2);
            Http1ExchangeCodec.this.f30312g.mo13728P("\r\n");
        }

        @Override // p524h1.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f30317g) {
                return;
            }
            this.f30317g = true;
            Http1ExchangeCodec.this.f30312g.mo13728P("0\r\n\r\n");
            Http1ExchangeCodec.m13501i(Http1ExchangeCodec.this, this.f30316f);
            Http1ExchangeCodec.this.f30306a = 3;
        }

        @Override // p524h1.Sink
        /* JADX INFO: renamed from: d */
        public Timeout2 mo13505d() {
            return this.f30316f;
        }

        @Override // p524h1.Sink, java.io.Flushable
        public synchronized void flush() {
            if (this.f30317g) {
                return;
            }
            Http1ExchangeCodec.this.f30312g.flush();
        }
    }

    /* JADX INFO: renamed from: g1.j0.i.b$c */
    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    public final class c extends a {

        /* JADX INFO: renamed from: i */
        public long f30319i;

        /* JADX INFO: renamed from: j */
        public boolean f30320j;

        /* JADX INFO: renamed from: k */
        public final HttpUrl f30321k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ Http1ExchangeCodec f30322l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super();
            Intrinsics2.m13090f(httpUrl, "url");
            this.f30322l = http1ExchangeCodec;
            this.f30321k = httpUrl;
            this.f30319i = -1L;
            this.f30320j = true;
        }

        @Override // p524h1.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f30314g) {
                return;
            }
            if (this.f30320j && !Util9.m13368h(this, 100, TimeUnit.MILLISECONDS)) {
                this.f30322l.f30310e.m13465l();
                m13504a();
            }
            this.f30314g = true;
        }

        @Override // p509g1.p510j0.p516i.Http1ExchangeCodec.a, p524h1.Source
        /* JADX INFO: renamed from: p0 */
        public long mo13392p0(Buffer3 buffer3, long j2) throws IOException {
            Intrinsics2.m13090f(buffer3, "sink");
            boolean z = true;
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(outline.m1594p("byteCount < 0: ", j2).toString());
            }
            if (!(!this.f30314g)) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f30320j) {
                return -1L;
            }
            long j3 = this.f30319i;
            if (j3 == 0 || j3 == -1) {
                if (j3 != -1) {
                    this.f30322l.f30311f.mo13741e0();
                }
                try {
                    this.f30319i = this.f30322l.f30311f.mo13709B0();
                    String strMo13741e0 = this.f30322l.f30311f.mo13741e0();
                    if (strMo13741e0 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                    String string = Strings5.m13004G(strMo13741e0).toString();
                    if (this.f30319i >= 0) {
                        if (string.length() <= 0) {
                            z = false;
                        }
                        if (!z || StringsJVM.m12997n(string, ";", false, 2)) {
                            if (this.f30319i == 0) {
                                this.f30320j = false;
                                Http1ExchangeCodec http1ExchangeCodec = this.f30322l;
                                http1ExchangeCodec.f30308c = http1ExchangeCodec.f30307b.m13499a();
                                Http1ExchangeCodec http1ExchangeCodec2 = this.f30322l;
                                OkHttpClient okHttpClient = http1ExchangeCodec2.f30309d;
                                if (okHttpClient == null) {
                                    Intrinsics2.m13095k();
                                    throw null;
                                }
                                CookieJar cookieJar = okHttpClient.f29870r;
                                HttpUrl httpUrl = this.f30321k;
                                Headers2 headers2 = http1ExchangeCodec2.f30308c;
                                if (headers2 == null) {
                                    Intrinsics2.m13095k();
                                    throw null;
                                }
                                HttpHeaders2.m13488d(cookieJar, httpUrl, headers2);
                                m13504a();
                            }
                            if (!this.f30320j) {
                                return -1L;
                            }
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f30319i + string + '\"');
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jMo13392p0 = super.mo13392p0(buffer3, Math.min(j2, this.f30319i));
            if (jMo13392p0 != -1) {
                this.f30319i -= jMo13392p0;
                return jMo13392p0;
            }
            this.f30322l.f30310e.m13465l();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m13504a();
            throw protocolException;
        }
    }

    /* JADX INFO: renamed from: g1.j0.i.b$d */
    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    public static final class d {
        public d() {
        }

        public d(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: g1.j0.i.b$e */
    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    public final class e extends a {

        /* JADX INFO: renamed from: i */
        public long f30323i;

        public e(long j2) {
            super();
            this.f30323i = j2;
            if (j2 == 0) {
                m13504a();
            }
        }

        @Override // p524h1.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f30314g) {
                return;
            }
            if (this.f30323i != 0 && !Util9.m13368h(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.f30310e.m13465l();
                m13504a();
            }
            this.f30314g = true;
        }

        @Override // p509g1.p510j0.p516i.Http1ExchangeCodec.a, p524h1.Source
        /* JADX INFO: renamed from: p0 */
        public long mo13392p0(Buffer3 buffer3, long j2) throws IOException {
            Intrinsics2.m13090f(buffer3, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(outline.m1594p("byteCount < 0: ", j2).toString());
            }
            if (!(!this.f30314g)) {
                throw new IllegalStateException("closed".toString());
            }
            long j3 = this.f30323i;
            if (j3 == 0) {
                return -1L;
            }
            long jMo13392p0 = super.mo13392p0(buffer3, Math.min(j3, j2));
            if (jMo13392p0 == -1) {
                Http1ExchangeCodec.this.f30310e.m13465l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m13504a();
                throw protocolException;
            }
            long j4 = this.f30323i - jMo13392p0;
            this.f30323i = j4;
            if (j4 == 0) {
                m13504a();
            }
            return jMo13392p0;
        }
    }

    /* JADX INFO: renamed from: g1.j0.i.b$f */
    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    public final class f implements Sink {

        /* JADX INFO: renamed from: f */
        public final ForwardingTimeout f30325f;

        /* JADX INFO: renamed from: g */
        public boolean f30326g;

        public f() {
            this.f30325f = new ForwardingTimeout(Http1ExchangeCodec.this.f30312g.mo13505d());
        }

        @Override // p524h1.Sink
        /* JADX INFO: renamed from: U */
        public void mo13415U(Buffer3 buffer3, long j2) throws IOException {
            Intrinsics2.m13090f(buffer3, "source");
            if (!(!this.f30326g)) {
                throw new IllegalStateException("closed".toString());
            }
            Util9.m13363c(buffer3.f30708g, 0L, j2);
            Http1ExchangeCodec.this.f30312g.mo13415U(buffer3, j2);
        }

        @Override // p524h1.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f30326g) {
                return;
            }
            this.f30326g = true;
            Http1ExchangeCodec.m13501i(Http1ExchangeCodec.this, this.f30325f);
            Http1ExchangeCodec.this.f30306a = 3;
        }

        @Override // p524h1.Sink
        /* JADX INFO: renamed from: d */
        public Timeout2 mo13505d() {
            return this.f30325f;
        }

        @Override // p524h1.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.f30326g) {
                return;
            }
            Http1ExchangeCodec.this.f30312g.flush();
        }
    }

    /* JADX INFO: renamed from: g1.j0.i.b$g */
    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    public final class g extends a {

        /* JADX INFO: renamed from: i */
        public boolean f30328i;

        public g(Http1ExchangeCodec http1ExchangeCodec) {
            super();
        }

        @Override // p524h1.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f30314g) {
                return;
            }
            if (!this.f30328i) {
                m13504a();
            }
            this.f30314g = true;
        }

        @Override // p509g1.p510j0.p516i.Http1ExchangeCodec.a, p524h1.Source
        /* JADX INFO: renamed from: p0 */
        public long mo13392p0(Buffer3 buffer3, long j2) throws IOException {
            Intrinsics2.m13090f(buffer3, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(outline.m1594p("byteCount < 0: ", j2).toString());
            }
            if (!(!this.f30314g)) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f30328i) {
                return -1L;
            }
            long jMo13392p0 = super.mo13392p0(buffer3, j2);
            if (jMo13392p0 != -1) {
                return jMo13392p0;
            }
            this.f30328i = true;
            m13504a();
            return -1L;
        }
    }

    static {
        new d(null);
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        Intrinsics2.m13090f(realConnection, "connection");
        Intrinsics2.m13090f(bufferedSource, "source");
        Intrinsics2.m13090f(bufferedSink, "sink");
        this.f30309d = okHttpClient;
        this.f30310e = realConnection;
        this.f30311f = bufferedSource;
        this.f30312g = bufferedSink;
        this.f30307b = new HeadersReader(bufferedSource);
    }

    /* JADX INFO: renamed from: i */
    public static final void m13501i(Http1ExchangeCodec http1ExchangeCodec, ForwardingTimeout forwardingTimeout) {
        Objects.requireNonNull(http1ExchangeCodec);
        Timeout2 timeout2 = forwardingTimeout.f30718e;
        Timeout2 timeout3 = Timeout2.f30690a;
        Intrinsics2.m13090f(timeout3, "delegate");
        forwardingTimeout.f30718e = timeout3;
        timeout2.mo13696a();
        timeout2.mo13697b();
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    /* JADX INFO: renamed from: a */
    public void mo13477a() throws IOException {
        this.f30312g.flush();
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    /* JADX INFO: renamed from: b */
    public void mo13478b(Request3 request3) {
        Intrinsics2.m13090f(request3, "request");
        Proxy.Type type = this.f30310e.f30251q.f30035b.type();
        Intrinsics2.m13086b(type, "connection.route().proxy.type()");
        Intrinsics2.m13090f(request3, "request");
        Intrinsics2.m13090f(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request3.f29952c);
        sb.append(' ');
        HttpUrl httpUrl = request3.f29951b;
        if (!httpUrl.f30643c && type == Proxy.Type.HTTP) {
            sb.append(httpUrl);
        } else {
            Intrinsics2.m13090f(httpUrl, "url");
            String strM13665b = httpUrl.m13665b();
            String strM13667d = httpUrl.m13667d();
            if (strM13667d != null) {
                strM13665b = strM13665b + '?' + strM13667d;
            }
            sb.append(strM13665b);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        Intrinsics2.m13086b(string, "StringBuilder().apply(builderAction).toString()");
        m13503k(request3.f29953d, string);
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    /* JADX INFO: renamed from: c */
    public Source mo13479c(Response3 response3) {
        Intrinsics2.m13090f(response3, "response");
        if (!HttpHeaders2.m13485a(response3)) {
            return m13502j(0L);
        }
        if (StringsJVM.m12989f("chunked", Response3.m13336c(response3, "Transfer-Encoding", null, 2), true)) {
            HttpUrl httpUrl = response3.f29990g.f29951b;
            if (this.f30306a == 4) {
                this.f30306a = 5;
                return new c(this, httpUrl);
            }
            StringBuilder sbM1556G = outline.m1556G("state: ");
            sbM1556G.append(this.f30306a);
            throw new IllegalStateException(sbM1556G.toString().toString());
        }
        long jM13371k = Util9.m13371k(response3);
        if (jM13371k != -1) {
            return m13502j(jM13371k);
        }
        if (this.f30306a == 4) {
            this.f30306a = 5;
            this.f30310e.m13465l();
            return new g(this);
        }
        StringBuilder sbM1556G2 = outline.m1556G("state: ");
        sbM1556G2.append(this.f30306a);
        throw new IllegalStateException(sbM1556G2.toString().toString());
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    public void cancel() {
        Socket socket = this.f30310e.f30236b;
        if (socket != null) {
            Util9.m13365e(socket);
        }
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    /* JADX INFO: renamed from: d */
    public Response3.a mo13480d(boolean z) {
        int i = this.f30306a;
        boolean z2 = true;
        if (i != 1 && i != 3) {
            z2 = false;
        }
        if (!z2) {
            StringBuilder sbM1556G = outline.m1556G("state: ");
            sbM1556G.append(this.f30306a);
            throw new IllegalStateException(sbM1556G.toString().toString());
        }
        try {
            StatusLine statusLineM13498a = StatusLine.f30300a.m13498a(this.f30307b.m13500b());
            Response3.a aVar = new Response3.a();
            aVar.m13344f(statusLineM13498a.f30301b);
            aVar.f30005c = statusLineM13498a.f30302c;
            aVar.m13343e(statusLineM13498a.f30303d);
            aVar.m13342d(this.f30307b.m13499a());
            if (z && statusLineM13498a.f30302c == 100) {
                return null;
            }
            if (statusLineM13498a.f30302c == 100) {
                this.f30306a = 3;
                return aVar;
            }
            this.f30306a = 4;
            return aVar;
        } catch (EOFException e2) {
            throw new IOException(outline.m1599u("unexpected end of stream on ", this.f30310e.f30251q.f30034a.f29835a.m13671h()), e2);
        }
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    /* JADX INFO: renamed from: e */
    public RealConnection mo13481e() {
        return this.f30310e;
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    /* JADX INFO: renamed from: f */
    public void mo13482f() throws IOException {
        this.f30312g.flush();
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    /* JADX INFO: renamed from: g */
    public long mo13483g(Response3 response3) {
        Intrinsics2.m13090f(response3, "response");
        if (!HttpHeaders2.m13485a(response3)) {
            return 0L;
        }
        if (StringsJVM.m12989f("chunked", Response3.m13336c(response3, "Transfer-Encoding", null, 2), true)) {
            return -1L;
        }
        return Util9.m13371k(response3);
    }

    @Override // p509g1.p510j0.p515h.ExchangeCodec
    /* JADX INFO: renamed from: h */
    public Sink mo13484h(Request3 request3, long j2) {
        Intrinsics2.m13090f(request3, "request");
        if (StringsJVM.m12989f("chunked", request3.m13312b("Transfer-Encoding"), true)) {
            if (this.f30306a == 1) {
                this.f30306a = 2;
                return new b();
            }
            StringBuilder sbM1556G = outline.m1556G("state: ");
            sbM1556G.append(this.f30306a);
            throw new IllegalStateException(sbM1556G.toString().toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f30306a == 1) {
            this.f30306a = 2;
            return new f();
        }
        StringBuilder sbM1556G2 = outline.m1556G("state: ");
        sbM1556G2.append(this.f30306a);
        throw new IllegalStateException(sbM1556G2.toString().toString());
    }

    /* JADX INFO: renamed from: j */
    public final Source m13502j(long j2) {
        if (this.f30306a == 4) {
            this.f30306a = 5;
            return new e(j2);
        }
        StringBuilder sbM1556G = outline.m1556G("state: ");
        sbM1556G.append(this.f30306a);
        throw new IllegalStateException(sbM1556G.toString().toString());
    }

    /* JADX INFO: renamed from: k */
    public final void m13503k(Headers2 headers2, String str) {
        Intrinsics2.m13090f(headers2, "headers");
        Intrinsics2.m13090f(str, "requestLine");
        if (!(this.f30306a == 0)) {
            StringBuilder sbM1556G = outline.m1556G("state: ");
            sbM1556G.append(this.f30306a);
            throw new IllegalStateException(sbM1556G.toString().toString());
        }
        this.f30312g.mo13728P(str).mo13728P("\r\n");
        int size = headers2.size();
        for (int i = 0; i < size; i++) {
            this.f30312g.mo13728P(headers2.m13650f(i)).mo13728P(": ").mo13728P(headers2.m13653m(i)).mo13728P("\r\n");
        }
        this.f30312g.mo13728P("\r\n");
        this.f30306a = 1;
    }
}
