package p509g1.p510j0.p522n;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.j0.n.b, reason: use source file name */
/* JADX INFO: compiled from: BasicTrustRootIndex.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BasicTrustRootIndex implements TrustRootIndex {

    /* JADX INFO: renamed from: a */
    public final Map<X500Principal, Set<X509Certificate>> f30577a;

    public BasicTrustRootIndex(X509Certificate... x509CertificateArr) {
        Intrinsics2.m13090f(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Intrinsics2.m13086b(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f30577a = linkedHashMap;
    }

    @Override // p509g1.p510j0.p522n.TrustRootIndex
    /* JADX INFO: renamed from: a */
    public X509Certificate mo13598a(X509Certificate x509Certificate) {
        boolean z;
        Intrinsics2.m13090f(x509Certificate, "cert");
        Set<X509Certificate> set = this.f30577a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                x509Certificate.verify(((X509Certificate) obj2).getPublicKey());
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                obj = obj2;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof BasicTrustRootIndex) && Intrinsics2.m13085a(((BasicTrustRootIndex) obj).f30577a, this.f30577a));
    }

    public int hashCode() {
        return this.f30577a.hashCode();
    }
}
