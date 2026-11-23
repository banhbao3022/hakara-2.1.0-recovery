package p509g1.p510j0.p519l;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Protocol;

/* JADX INFO: renamed from: g1.j0.l.d, reason: use source file name */
/* JADX INFO: compiled from: ConscryptPlatform.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ConscryptPlatform extends Platform {

    /* JADX INFO: renamed from: d */
    public static final boolean f30527d;

    /* JADX INFO: renamed from: e */
    public static final a f30528e;

    /* JADX INFO: renamed from: f */
    public final Provider f30529f;

    /* JADX INFO: renamed from: g1.j0.l.d$a */
    /* JADX INFO: compiled from: ConscryptPlatform.kt */
    public static final class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m13602a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != i) {
                return version.major() > i;
            }
            if (version.minor() != i2) {
                return version.minor() > i2;
            }
            return version.patch() >= i3;
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: g1.j0.l.d$b */
    /* JADX INFO: compiled from: ConscryptPlatform.kt */
    public static final class b implements ConscryptHostnameVerifier {

        /* JADX INFO: renamed from: a */
        public static final b f30530a = new b();
    }

    static {
        a aVar = new a(null);
        f30528e = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && aVar.m13602a(2, 1, 0)) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f30527d = z;
    }

    public ConscryptPlatform() {
        Provider providerBuild = Conscrypt.newProviderBuilder().provideTrustManager(true).build();
        Intrinsics2.m13086b(providerBuild, "Conscrypt.newProviderBui…rustManager(true).build()");
        this.f30529f = providerBuild;
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: d */
    public void mo13591d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        Intrinsics2.m13090f(list, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            Intrinsics2.m13090f(sSLSocket, "sslSocket");
            Intrinsics2.m13090f(list, "protocols");
            return;
        }
        Conscrypt.setUseSessionTickets(sSLSocket, true);
        Object[] array = ((ArrayList) Platform.f30547c.m13606a(list)).toArray(new String[0]);
        if (array == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: f */
    public String mo13592f(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        super.mo13592f(sSLSocket);
        return null;
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: l */
    public SSLContext mo13599l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f30529f);
        Intrinsics2.m13086b(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: m */
    public SSLSocketFactory mo13601m(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        Intrinsics2.m13090f(x509TrustManager, "trustManager");
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f30529f);
        Intrinsics2.m13086b(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        Conscrypt.setUseEngineSocket(socketFactory, true);
        Intrinsics2.m13086b(socketFactory, "newSSLContext().apply {\n…ineSocket(it, true)\n    }");
        return socketFactory;
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: n */
    public X509TrustManager mo13600n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        Intrinsics2.m13086b(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            StringBuilder sbM1556G = outline.m1556G("Unexpected default trust managers: ");
            String string = Arrays.toString(trustManagers);
            Intrinsics2.m13086b(string, "java.util.Arrays.toString(this)");
            sbM1556G.append(string);
            throw new IllegalStateException(sbM1556G.toString().toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager == null) {
            throw new TypeCastException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Conscrypt.setHostnameVerifier(x509TrustManager, b.f30530a);
        return x509TrustManager;
    }

    public /* synthetic */ ConscryptPlatform(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
