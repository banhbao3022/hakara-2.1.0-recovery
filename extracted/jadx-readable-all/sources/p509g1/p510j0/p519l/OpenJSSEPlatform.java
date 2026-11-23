package p509g1.p510j0.p519l;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Protocol;

/* JADX INFO: renamed from: g1.j0.l.g, reason: use source file name */
/* JADX INFO: compiled from: OpenJSSEPlatform.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class OpenJSSEPlatform extends Platform {

    /* JADX INFO: renamed from: d */
    public static final boolean f30542d;

    /* JADX INFO: renamed from: e */
    public static final a f30543e;

    /* JADX INFO: renamed from: f */
    public final Provider f30544f;

    /* JADX INFO: renamed from: g1.j0.l.g$a */
    /* JADX INFO: compiled from: OpenJSSEPlatform.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        a aVar = new a(null);
        f30543e = aVar;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f30542d = z;
    }

    public OpenJSSEPlatform() {
        this.f30544f = new OpenJSSE();
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: d */
    public void mo13591d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        Intrinsics2.m13090f(list, "protocols");
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            Intrinsics2.m13090f(sSLSocket, "sslSocket");
            Intrinsics2.m13090f(list, "protocols");
            return;
        }
        org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
        SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
        if (sSLParameters instanceof SSLParameters) {
            SSLParameters sSLParameters2 = sSLParameters;
            Object[] array = ((ArrayList) Platform.f30547c.m13606a(list)).toArray(new String[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sSLParameters2.setApplicationProtocols((String[]) array);
            sSLSocket2.setSSLParameters(sSLParameters);
        }
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: f */
    public String mo13592f(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
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
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f30544f);
        Intrinsics2.m13086b(sSLContext, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: n */
    public X509TrustManager mo13600n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f30544f);
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

    public /* synthetic */ OpenJSSEPlatform(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
