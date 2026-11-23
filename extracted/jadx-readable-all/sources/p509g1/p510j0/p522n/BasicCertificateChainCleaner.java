package p509g1.p510j0.p522n;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p477d1.TypeCastException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.j0.n.a, reason: use source file name */
/* JADX INFO: compiled from: BasicCertificateChainCleaner.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BasicCertificateChainCleaner extends CertificateChainCleaner {

    /* JADX INFO: renamed from: b */
    public final TrustRootIndex f30576b;

    /* JADX INFO: renamed from: g1.j0.n.a$a */
    /* JADX INFO: compiled from: BasicCertificateChainCleaner.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public BasicCertificateChainCleaner(TrustRootIndex trustRootIndex) {
        Intrinsics2.m13090f(trustRootIndex, "trustRootIndex");
        this.f30576b = trustRootIndex;
    }

    @Override // p509g1.p510j0.p522n.CertificateChainCleaner
    /* JADX INFO: renamed from: a */
    public List<Certificate> mo13614a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        Intrinsics2.m13090f(list, "chain");
        Intrinsics2.m13090f(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        Intrinsics2.m13086b(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            X509Certificate x509Certificate2 = (X509Certificate) obj;
            X509Certificate x509CertificateMo13598a = this.f30576b.mo13598a(x509Certificate2);
            if (x509CertificateMo13598a != null) {
                if (arrayList.size() > 1 || (!Intrinsics2.m13085a(x509Certificate2, x509CertificateMo13598a))) {
                    arrayList.add(x509CertificateMo13598a);
                }
                if (m13619b(x509CertificateMo13598a, x509CertificateMo13598a)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                Intrinsics2.m13086b(it, "queue.iterator()");
                do {
                    if (!it.hasNext()) {
                        if (z) {
                            return arrayList;
                        }
                        throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate2);
                    }
                    Object next = it.next();
                    if (next == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    x509Certificate = (X509Certificate) next;
                } while (!m13619b(x509Certificate2, x509Certificate));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13619b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!Intrinsics2.m13085a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BasicCertificateChainCleaner) && Intrinsics2.m13085a(((BasicCertificateChainCleaner) obj).f30576b, this.f30576b);
    }

    public int hashCode() {
        return this.f30576b.hashCode();
    }
}
