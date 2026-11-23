package p509g1;

import java.io.Closeable;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.p514g.Exchange;

/* JADX INFO: renamed from: g1.f0, reason: use source file name */
/* JADX INFO: compiled from: Response.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Response3 implements Closeable {

    /* JADX INFO: renamed from: f */
    public CacheControl f29989f;

    /* JADX INFO: renamed from: g */
    public final Request3 f29990g;

    /* JADX INFO: renamed from: h */
    public final Protocol f29991h;

    /* JADX INFO: renamed from: i */
    public final String f29992i;

    /* JADX INFO: renamed from: j */
    public final int f29993j;

    /* JADX INFO: renamed from: k */
    public final Handshake f29994k;

    /* JADX INFO: renamed from: l */
    public final Headers2 f29995l;

    /* JADX INFO: renamed from: m */
    public final ResponseBody f29996m;

    /* JADX INFO: renamed from: n */
    public final Response3 f29997n;

    /* JADX INFO: renamed from: o */
    public final Response3 f29998o;

    /* JADX INFO: renamed from: p */
    public final Response3 f29999p;

    /* JADX INFO: renamed from: q */
    public final long f30000q;

    /* JADX INFO: renamed from: r */
    public final long f30001r;

    /* JADX INFO: renamed from: s */
    public final Exchange f30002s;

    public Response3(Request3 request3, Protocol protocol, String str, int i, Handshake handshake, Headers2 headers2, ResponseBody responseBody, Response3 response3, Response3 response4, Response3 response5, long j2, long j3, Exchange exchange) {
        Intrinsics2.m13090f(request3, "request");
        Intrinsics2.m13090f(protocol, "protocol");
        Intrinsics2.m13090f(str, "message");
        Intrinsics2.m13090f(headers2, "headers");
        this.f29990g = request3;
        this.f29991h = protocol;
        this.f29992i = str;
        this.f29993j = i;
        this.f29994k = handshake;
        this.f29995l = headers2;
        this.f29996m = responseBody;
        this.f29997n = response3;
        this.f29998o = response4;
        this.f29999p = response5;
        this.f30000q = j2;
        this.f30001r = j3;
        this.f30002s = exchange;
    }

    /* JADX INFO: renamed from: c */
    public static String m13336c(Response3 response3, String str, String str2, int i) {
        int i2 = i & 2;
        Objects.requireNonNull(response3);
        Intrinsics2.m13090f(str, "name");
        String strM13649c = response3.f29995l.m13649c(str);
        if (strM13649c != null) {
            return strM13649c;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final CacheControl m13337a() {
        CacheControl cacheControl = this.f29989f;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControlM13324b = CacheControl.f29961a.m13324b(this.f29995l);
        this.f29989f = cacheControlM13324b;
        return cacheControlM13324b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.f29996m;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        responseBody.close();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m13338f() {
        int i = this.f29993j;
        return 200 <= i && 299 >= i;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Response{protocol=");
        sbM1556G.append(this.f29991h);
        sbM1556G.append(", code=");
        sbM1556G.append(this.f29993j);
        sbM1556G.append(", message=");
        sbM1556G.append(this.f29992i);
        sbM1556G.append(", url=");
        sbM1556G.append(this.f29990g.f29951b);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }

    /* JADX INFO: renamed from: g1.f0$a */
    /* JADX INFO: compiled from: Response.kt */
    public static class a {

        /* JADX INFO: renamed from: a */
        public Request3 f30003a;

        /* JADX INFO: renamed from: b */
        public Protocol f30004b;

        /* JADX INFO: renamed from: c */
        public int f30005c;

        /* JADX INFO: renamed from: d */
        public String f30006d;

        /* JADX INFO: renamed from: e */
        public Handshake f30007e;

        /* JADX INFO: renamed from: f */
        public Headers2.a f30008f;

        /* JADX INFO: renamed from: g */
        public ResponseBody f30009g;

        /* JADX INFO: renamed from: h */
        public Response3 f30010h;

        /* JADX INFO: renamed from: i */
        public Response3 f30011i;

        /* JADX INFO: renamed from: j */
        public Response3 f30012j;

        /* JADX INFO: renamed from: k */
        public long f30013k;

        /* JADX INFO: renamed from: l */
        public long f30014l;

        /* JADX INFO: renamed from: m */
        public Exchange f30015m;

        public a() {
            this.f30005c = -1;
            this.f30008f = new Headers2.a();
        }

        /* JADX INFO: renamed from: a */
        public Response3 m13339a() {
            int i = this.f30005c;
            if (!(i >= 0)) {
                StringBuilder sbM1556G = outline.m1556G("code < 0: ");
                sbM1556G.append(this.f30005c);
                throw new IllegalStateException(sbM1556G.toString().toString());
            }
            Request3 request3 = this.f30003a;
            if (request3 == null) {
                throw new IllegalStateException("request == null".toString());
            }
            Protocol protocol = this.f30004b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f30006d;
            if (str != null) {
                return new Response3(request3, protocol, str, i, this.f30007e, this.f30008f.m13658d(), this.f30009g, this.f30010h, this.f30011i, this.f30012j, this.f30013k, this.f30014l, this.f30015m);
            }
            throw new IllegalStateException("message == null".toString());
        }

        /* JADX INFO: renamed from: b */
        public a m13340b(Response3 response3) {
            m13341c("cacheResponse", response3);
            this.f30011i = response3;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final void m13341c(String str, Response3 response3) {
            if (response3 != null) {
                if (!(response3.f29996m == null)) {
                    throw new IllegalArgumentException(outline.m1599u(str, ".body != null").toString());
                }
                if (!(response3.f29997n == null)) {
                    throw new IllegalArgumentException(outline.m1599u(str, ".networkResponse != null").toString());
                }
                if (!(response3.f29998o == null)) {
                    throw new IllegalArgumentException(outline.m1599u(str, ".cacheResponse != null").toString());
                }
                if (!(response3.f29999p == null)) {
                    throw new IllegalArgumentException(outline.m1599u(str, ".priorResponse != null").toString());
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public a m13342d(Headers2 headers2) {
            Intrinsics2.m13090f(headers2, "headers");
            this.f30008f = headers2.m13651h();
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m13343e(String str) {
            Intrinsics2.m13090f(str, "message");
            this.f30006d = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m13344f(Protocol protocol) {
            Intrinsics2.m13090f(protocol, "protocol");
            this.f30004b = protocol;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m13345g(Request3 request3) {
            Intrinsics2.m13090f(request3, "request");
            this.f30003a = request3;
            return this;
        }

        public a(Response3 response3) {
            Intrinsics2.m13090f(response3, "response");
            this.f30005c = -1;
            this.f30003a = response3.f29990g;
            this.f30004b = response3.f29991h;
            this.f30005c = response3.f29993j;
            this.f30006d = response3.f29992i;
            this.f30007e = response3.f29994k;
            this.f30008f = response3.f29995l.m13651h();
            this.f30009g = response3.f29996m;
            this.f30010h = response3.f29997n;
            this.f30011i = response3.f29998o;
            this.f30012j = response3.f29999p;
            this.f30013k = response3.f30000q;
            this.f30014l = response3.f30001r;
            this.f30015m = response3.f30002s;
        }
    }
}
