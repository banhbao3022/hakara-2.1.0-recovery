package p509g1;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p483s.MutableCollections;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util7;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p514g.RealCall;
import p509g1.p510j0.p514g.RouteDatabase;
import p509g1.p510j0.p519l.Platform;
import p509g1.p510j0.p521m.NullProxySelector;
import p509g1.p510j0.p522n.CertificateChainCleaner;
import p509g1.p510j0.p522n.OkHostnameVerifier;

/* JADX INFO: renamed from: g1.a0, reason: use source file name */
/* JADX INFO: compiled from: OkHttpClient.kt */
/* JADX INFO: loaded from: classes2.dex */
public class OkHttpClient implements Cloneable, Call.a {

    /* JADX INFO: renamed from: A */
    public final List<ConnectionSpec> f29849A;

    /* JADX INFO: renamed from: B */
    public final List<Protocol> f29850B;

    /* JADX INFO: renamed from: C */
    public final HostnameVerifier f29851C;

    /* JADX INFO: renamed from: D */
    public final CertificatePinner f29852D;

    /* JADX INFO: renamed from: E */
    public final CertificateChainCleaner f29853E;

    /* JADX INFO: renamed from: F */
    public final int f29854F;

    /* JADX INFO: renamed from: G */
    public final int f29855G;

    /* JADX INFO: renamed from: H */
    public final int f29856H;

    /* JADX INFO: renamed from: I */
    public final int f29857I;

    /* JADX INFO: renamed from: J */
    public final int f29858J;

    /* JADX INFO: renamed from: K */
    public final long f29859K;

    /* JADX INFO: renamed from: L */
    public final RouteDatabase f29860L;

    /* JADX INFO: renamed from: i */
    public final Dispatcher4 f29861i;

    /* JADX INFO: renamed from: j */
    public final ConnectionPool f29862j;

    /* JADX INFO: renamed from: k */
    public final List<Interceptor> f29863k;

    /* JADX INFO: renamed from: l */
    public final List<Interceptor> f29864l;

    /* JADX INFO: renamed from: m */
    public final EventListener.c f29865m;

    /* JADX INFO: renamed from: n */
    public final boolean f29866n;

    /* JADX INFO: renamed from: o */
    public final Authenticator f29867o;

    /* JADX INFO: renamed from: p */
    public final boolean f29868p;

    /* JADX INFO: renamed from: q */
    public final boolean f29869q;

    /* JADX INFO: renamed from: r */
    public final CookieJar f29870r;

    /* JADX INFO: renamed from: s */
    public final Cache2 f29871s;

    /* JADX INFO: renamed from: t */
    public final Dns f29872t;

    /* JADX INFO: renamed from: u */
    public final Proxy f29873u;

    /* JADX INFO: renamed from: v */
    public final ProxySelector f29874v;

    /* JADX INFO: renamed from: w */
    public final Authenticator f29875w;

    /* JADX INFO: renamed from: x */
    public final SocketFactory f29876x;

    /* JADX INFO: renamed from: y */
    public final SSLSocketFactory f29877y;

    /* JADX INFO: renamed from: z */
    public final X509TrustManager f29878z;

    /* JADX INFO: renamed from: h */
    public static final b f29848h = new b(null);

    /* JADX INFO: renamed from: f */
    public static final List<Protocol> f29846f = Util9.m13372l(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: g */
    public static final List<ConnectionSpec> f29847g = Util9.m13372l(ConnectionSpec.f30591c, ConnectionSpec.f30592d);

    /* JADX INFO: renamed from: g1.a0$b */
    /* JADX INFO: compiled from: OkHttpClient.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public OkHttpClient(a aVar) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        boolean z;
        boolean z2;
        Intrinsics2.m13090f(aVar, "builder");
        this.f29861i = aVar.f29883a;
        this.f29862j = aVar.f29884b;
        this.f29863k = Util9.m13384x(aVar.f29885c);
        this.f29864l = Util9.m13384x(aVar.f29886d);
        this.f29865m = aVar.f29887e;
        this.f29866n = aVar.f29888f;
        this.f29867o = aVar.f29889g;
        this.f29868p = aVar.f29890h;
        this.f29869q = aVar.f29891i;
        this.f29870r = aVar.f29892j;
        this.f29871s = aVar.f29893k;
        this.f29872t = aVar.f29894l;
        Proxy proxy = aVar.f29895m;
        this.f29873u = proxy;
        if (proxy != null) {
            proxySelector = NullProxySelector.f30575a;
        } else {
            proxySelector = aVar.f29896n;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = NullProxySelector.f30575a;
            }
        }
        this.f29874v = proxySelector;
        this.f29875w = aVar.f29897o;
        this.f29876x = aVar.f29898p;
        List<ConnectionSpec> list = aVar.f29901s;
        this.f29849A = list;
        this.f29850B = aVar.f29902t;
        this.f29851C = aVar.f29903u;
        this.f29854F = aVar.f29906x;
        this.f29855G = aVar.f29907y;
        this.f29856H = aVar.f29908z;
        this.f29857I = aVar.f29879A;
        this.f29858J = aVar.f29880B;
        this.f29859K = aVar.f29881C;
        RouteDatabase routeDatabase = aVar.f29882D;
        this.f29860L = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (((ConnectionSpec) it.next()).f30593e) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        if (z) {
            this.f29877y = null;
            this.f29853E = null;
            this.f29878z = null;
            this.f29852D = CertificatePinner.f30016a;
        } else {
            SSLSocketFactory sSLSocketFactory = aVar.f29899q;
            if (sSLSocketFactory != null) {
                this.f29877y = sSLSocketFactory;
                CertificateChainCleaner certificateChainCleaner = aVar.f29905w;
                if (certificateChainCleaner == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                this.f29853E = certificateChainCleaner;
                X509TrustManager x509TrustManager = aVar.f29900r;
                if (x509TrustManager == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                this.f29878z = x509TrustManager;
                this.f29852D = aVar.f29904v.m13347b(certificateChainCleaner);
            } else {
                Objects.requireNonNull(Platform.f30547c);
                X509TrustManager x509TrustManagerMo13600n = Platform.f30545a.mo13600n();
                this.f29878z = x509TrustManagerMo13600n;
                Platform platform = Platform.f30545a;
                if (x509TrustManagerMo13600n == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                this.f29877y = platform.mo13601m(x509TrustManagerMo13600n);
                Objects.requireNonNull(CertificateChainCleaner.f30578a);
                Intrinsics2.m13090f(x509TrustManagerMo13600n, "trustManager");
                CertificateChainCleaner certificateChainCleanerMo13590b = Platform.f30545a.mo13590b(x509TrustManagerMo13600n);
                this.f29853E = certificateChainCleanerMo13590b;
                CertificatePinner certificatePinner = aVar.f29904v;
                if (certificateChainCleanerMo13590b == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                this.f29852D = certificatePinner.m13347b(certificateChainCleanerMo13590b);
            }
        }
        List<Interceptor> list2 = this.f29863k;
        if (list2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!list2.contains(null))) {
            StringBuilder sbM1556G = outline.m1556G("Null interceptor: ");
            sbM1556G.append(this.f29863k);
            throw new IllegalStateException(sbM1556G.toString().toString());
        }
        List<Interceptor> list3 = this.f29864l;
        if (list3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!list3.contains(null))) {
            StringBuilder sbM1556G2 = outline.m1556G("Null network interceptor: ");
            sbM1556G2.append(this.f29864l);
            throw new IllegalStateException(sbM1556G2.toString().toString());
        }
        List<ConnectionSpec> list4 = this.f29849A;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator<T> it2 = list4.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = true;
                    break;
                } else if (((ConnectionSpec) it2.next()).f30593e) {
                    z2 = false;
                    break;
                }
            }
        } else {
            z2 = true;
            break;
        }
        if (!z2) {
            if (this.f29877y == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.f29853E == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.f29878z == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.f29877y == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f29853E == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f29878z == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!Intrinsics2.m13085a(this.f29852D, CertificatePinner.f30016a)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // p509g1.Call.a
    /* JADX INFO: renamed from: a */
    public Call mo13300a(Request3 request3) {
        Intrinsics2.m13090f(request3, "request");
        return new RealCall(this, request3, false);
    }

    public Object clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: g1.a0$a */
    /* JADX INFO: compiled from: OkHttpClient.kt */
    public static final class a {

        /* JADX INFO: renamed from: A */
        public int f29879A;

        /* JADX INFO: renamed from: B */
        public int f29880B;

        /* JADX INFO: renamed from: C */
        public long f29881C;

        /* JADX INFO: renamed from: D */
        public RouteDatabase f29882D;

        /* JADX INFO: renamed from: a */
        public Dispatcher4 f29883a;

        /* JADX INFO: renamed from: b */
        public ConnectionPool f29884b;

        /* JADX INFO: renamed from: c */
        public final List<Interceptor> f29885c;

        /* JADX INFO: renamed from: d */
        public final List<Interceptor> f29886d;

        /* JADX INFO: renamed from: e */
        public EventListener.c f29887e;

        /* JADX INFO: renamed from: f */
        public boolean f29888f;

        /* JADX INFO: renamed from: g */
        public Authenticator f29889g;

        /* JADX INFO: renamed from: h */
        public boolean f29890h;

        /* JADX INFO: renamed from: i */
        public boolean f29891i;

        /* JADX INFO: renamed from: j */
        public CookieJar f29892j;

        /* JADX INFO: renamed from: k */
        public Cache2 f29893k;

        /* JADX INFO: renamed from: l */
        public Dns f29894l;

        /* JADX INFO: renamed from: m */
        public Proxy f29895m;

        /* JADX INFO: renamed from: n */
        public ProxySelector f29896n;

        /* JADX INFO: renamed from: o */
        public Authenticator f29897o;

        /* JADX INFO: renamed from: p */
        public SocketFactory f29898p;

        /* JADX INFO: renamed from: q */
        public SSLSocketFactory f29899q;

        /* JADX INFO: renamed from: r */
        public X509TrustManager f29900r;

        /* JADX INFO: renamed from: s */
        public List<ConnectionSpec> f29901s;

        /* JADX INFO: renamed from: t */
        public List<? extends Protocol> f29902t;

        /* JADX INFO: renamed from: u */
        public HostnameVerifier f29903u;

        /* JADX INFO: renamed from: v */
        public CertificatePinner f29904v;

        /* JADX INFO: renamed from: w */
        public CertificateChainCleaner f29905w;

        /* JADX INFO: renamed from: x */
        public int f29906x;

        /* JADX INFO: renamed from: y */
        public int f29907y;

        /* JADX INFO: renamed from: z */
        public int f29908z;

        public a() {
            this.f29883a = new Dispatcher4();
            this.f29884b = new ConnectionPool();
            this.f29885c = new ArrayList();
            this.f29886d = new ArrayList();
            EventListener eventListener = EventListener.f30623a;
            byte[] bArr = Util9.f30070a;
            Intrinsics2.m13090f(eventListener, "$this$asFactory");
            this.f29887e = new Util7(eventListener);
            this.f29888f = true;
            Authenticator authenticator = Authenticator.f29909a;
            this.f29889g = authenticator;
            this.f29890h = true;
            this.f29891i = true;
            this.f29892j = CookieJar.f30615a;
            this.f29894l = Dns.f30622a;
            this.f29897o = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics2.m13086b(socketFactory, "SocketFactory.getDefault()");
            this.f29898p = socketFactory;
            b bVar = OkHttpClient.f29848h;
            Objects.requireNonNull(bVar);
            this.f29901s = OkHttpClient.f29847g;
            Objects.requireNonNull(bVar);
            this.f29902t = OkHttpClient.f29846f;
            this.f29903u = OkHostnameVerifier.f30579a;
            this.f29904v = CertificatePinner.f30016a;
            this.f29907y = 10000;
            this.f29908z = 10000;
            this.f29879A = 10000;
            this.f29881C = 1024L;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(OkHttpClient okHttpClient) {
            this();
            Intrinsics2.m13090f(okHttpClient, "okHttpClient");
            this.f29883a = okHttpClient.f29861i;
            this.f29884b = okHttpClient.f29862j;
            MutableCollections.m13043h(this.f29885c, okHttpClient.f29863k);
            MutableCollections.m13043h(this.f29886d, okHttpClient.f29864l);
            this.f29887e = okHttpClient.f29865m;
            this.f29888f = okHttpClient.f29866n;
            this.f29889g = okHttpClient.f29867o;
            this.f29890h = okHttpClient.f29868p;
            this.f29891i = okHttpClient.f29869q;
            this.f29892j = okHttpClient.f29870r;
            this.f29893k = okHttpClient.f29871s;
            this.f29894l = okHttpClient.f29872t;
            this.f29895m = okHttpClient.f29873u;
            this.f29896n = okHttpClient.f29874v;
            this.f29897o = okHttpClient.f29875w;
            this.f29898p = okHttpClient.f29876x;
            this.f29899q = okHttpClient.f29877y;
            this.f29900r = okHttpClient.f29878z;
            this.f29901s = okHttpClient.f29849A;
            this.f29902t = okHttpClient.f29850B;
            this.f29903u = okHttpClient.f29851C;
            this.f29904v = okHttpClient.f29852D;
            this.f29905w = okHttpClient.f29853E;
            this.f29906x = okHttpClient.f29854F;
            this.f29907y = okHttpClient.f29855G;
            this.f29908z = okHttpClient.f29856H;
            this.f29879A = okHttpClient.f29857I;
            this.f29880B = okHttpClient.f29858J;
            this.f29881C = okHttpClient.f29859K;
            this.f29882D = okHttpClient.f29860L;
        }
    }

    public OkHttpClient() {
        this(new a());
    }
}
