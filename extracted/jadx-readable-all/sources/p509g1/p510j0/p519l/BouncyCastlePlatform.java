package p509g1.p510j0.p519l;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Protocol;

/* JADX INFO: renamed from: g1.j0.l.c, reason: use source file name */
/* JADX INFO: compiled from: BouncyCastlePlatform.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BouncyCastlePlatform extends Platform {

    /* JADX INFO: renamed from: d */
    public static final boolean f30524d;

    /* JADX INFO: renamed from: e */
    public static final a f30525e;

    /* JADX INFO: renamed from: f */
    public final Provider f30526f;

    /* JADX INFO: renamed from: g1.j0.l.c$a */
    /* JADX INFO: compiled from: BouncyCastlePlatform.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        a aVar = new a(null);
        f30525e = aVar;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f30524d = z;
    }

    public BouncyCastlePlatform() {
        this.f30526f = new BouncyCastleJsseProvider();
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: d */
    public void mo13591d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        Intrinsics2.m13090f(list, "protocols");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            Intrinsics2.m13090f(sSLSocket, "sslSocket");
            Intrinsics2.m13090f(list, "protocols");
            return;
        }
        BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
        BCSSLParameters parameters = bCSSLSocket.getParameters();
        List<String> listM13606a = Platform.f30547c.m13606a(list);
        Intrinsics2.m13086b(parameters, "sslParameters");
        Object[] array = ((ArrayList) listM13606a).toArray(new String[0]);
        if (array == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        parameters.setApplicationProtocols((String[]) array);
        bCSSLSocket.setParameters(parameters);
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: f */
    public String mo13592f(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        if (sSLSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol != null && !Intrinsics2.m13085a(applicationProtocol, "")) {
                return applicationProtocol;
            }
        } else {
            super.mo13592f(sSLSocket);
        }
        return null;
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: l */
    public SSLContext mo13599l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f30526f);
        Intrinsics2.m13086b(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: n */
    public X509TrustManager mo13600n() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        Intrinsics2.m13086b(trustManagerFactory, "factory");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new TypeCastException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sbM1556G = outline.m1556G("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics2.m13086b(string, "java.util.Arrays.toString(this)");
        sbM1556G.append(string);
        throw new IllegalStateException(sbM1556G.toString().toString());
    }

    public /* synthetic */ BouncyCastlePlatform(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
