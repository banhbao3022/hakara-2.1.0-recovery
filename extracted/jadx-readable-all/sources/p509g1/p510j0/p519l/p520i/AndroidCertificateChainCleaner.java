package p509g1.p510j0.p519l.p520i;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p477d1.TypeCastException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.p522n.CertificateChainCleaner;

/* JADX INFO: renamed from: g1.j0.l.i.b, reason: use source file name */
/* JADX INFO: compiled from: AndroidCertificateChainCleaner.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidCertificateChainCleaner extends CertificateChainCleaner {

    /* JADX INFO: renamed from: b */
    public static final a f30549b = new a(null);

    /* JADX INFO: renamed from: c */
    public final X509TrustManager f30550c;

    /* JADX INFO: renamed from: d */
    public final X509TrustManagerExtensions f30551d;

    /* JADX INFO: renamed from: g1.j0.l.i.b$a */
    /* JADX INFO: compiled from: AndroidCertificateChainCleaner.kt */
    public static final class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final AndroidCertificateChainCleaner m13615a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            Intrinsics2.m13090f(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new AndroidCertificateChainCleaner(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public AndroidCertificateChainCleaner(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics2.m13090f(x509TrustManager, "trustManager");
        Intrinsics2.m13090f(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f30550c = x509TrustManager;
        this.f30551d = x509TrustManagerExtensions;
    }

    @Override // p509g1.p510j0.p522n.CertificateChainCleaner
    /* JADX INFO: renamed from: a */
    public List<Certificate> mo13614a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        Intrinsics2.m13090f(list, "chain");
        Intrinsics2.m13090f(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        try {
            List<X509Certificate> listCheckServerTrusted = this.f30551d.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            Intrinsics2.m13086b(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof AndroidCertificateChainCleaner) && ((AndroidCertificateChainCleaner) obj).f30550c == this.f30550c;
    }

    public int hashCode() {
        return System.identityHashCode(this.f30550c);
    }
}
