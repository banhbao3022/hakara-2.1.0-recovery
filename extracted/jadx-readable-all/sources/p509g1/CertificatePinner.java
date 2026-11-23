package p509g1;

import java.net.UnknownHostException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p481d0.Strings5;
import p477d1.p481d0.StringsJVM;
import p477d1.p483s.Collections4;
import p477d1.p483s._Collections;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.TypeIntrinsics;
import p477d1.p493x.p495c.p496v.KMarkers;
import p509g1.p510j0.p522n.CertificateChainCleaner;
import p524h1.ByteString3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: g1.g, reason: use source file name */
/* JADX INFO: compiled from: CertificatePinner.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CertificatePinner {

    /* JADX INFO: renamed from: c */
    public final Set<c> f30018c;

    /* JADX INFO: renamed from: d */
    public final CertificateChainCleaner f30019d;

    /* JADX INFO: renamed from: b */
    public static final b f30017b = new b(null);

    /* JADX INFO: renamed from: a */
    public static final CertificatePinner f30016a = new CertificatePinner(_Collections.m13051p(new a().f30020a), null, 2, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: g1.g$a */
    /* JADX INFO: compiled from: CertificatePinner.kt */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<c> f30020a = new ArrayList();
    }

    /* JADX INFO: renamed from: g1.g$b */
    /* JADX INFO: compiled from: CertificatePinner.kt */
    public static final class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public final String m13348a(Certificate certificate) {
            Intrinsics2.m13090f(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            StringBuilder sbM1556G = outline.m1556G("sha256/");
            sbM1556G.append(m13349b((X509Certificate) certificate).mo13763f());
            return sbM1556G.toString();
        }

        /* JADX INFO: renamed from: b */
        public final ByteString3 m13349b(X509Certificate x509Certificate) {
            Intrinsics2.m13090f(x509Certificate, "$this$sha256Hash");
            ByteString3.a aVar = ByteString3.f30712g;
            PublicKey publicKey = x509Certificate.getPublicKey();
            Intrinsics2.m13086b(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            Intrinsics2.m13086b(encoded, "publicKey.encoded");
            return ByteString3.a.m13774d(aVar, encoded, 0, 0, 3).mo13764h("SHA-256");
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: g1.g$c */
    /* JADX INFO: compiled from: CertificatePinner.kt */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final String f30021a;

        /* JADX INFO: renamed from: b */
        public final String f30022b;

        /* JADX INFO: renamed from: c */
        public final ByteString3 f30023c;

        public c(String str, String str2) throws UnknownHostException {
            Intrinsics2.m13090f(str, "pattern");
            Intrinsics2.m13090f(str2, "pin");
            boolean z = true;
            if ((!StringsJVM.m12997n(str, "*.", false, 2) || Strings5.m13012v(str, "*", 1, false, 4) != -1) && ((!StringsJVM.m12997n(str, "**.", false, 2) || Strings5.m13012v(str, "*", 2, false, 4) != -1) && Strings5.m13012v(str, "*", 0, false, 6) != -1)) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(outline.m1599u("Unexpected pattern: ", str).toString());
            }
            String strM14084e0 = SkuDao.a.m14084e0(str);
            if (strM14084e0 == null) {
                throw new IllegalArgumentException(outline.m1599u("Invalid pattern: ", str));
            }
            this.f30021a = strM14084e0;
            if (StringsJVM.m12997n(str2, "sha1/", false, 2)) {
                this.f30022b = "sha1";
                ByteString3.a aVar = ByteString3.f30712g;
                String strSubstring = str2.substring(5);
                Intrinsics2.m13086b(strSubstring, "(this as java.lang.String).substring(startIndex)");
                ByteString3 byteString3M13775a = aVar.m13775a(strSubstring);
                if (byteString3M13775a == null) {
                    throw new IllegalArgumentException(outline.m1599u("Invalid pin hash: ", str2));
                }
                this.f30023c = byteString3M13775a;
                return;
            }
            if (!StringsJVM.m12997n(str2, "sha256/", false, 2)) {
                throw new IllegalArgumentException(outline.m1599u("pins must start with 'sha256/' or 'sha1/': ", str2));
            }
            this.f30022b = "sha256";
            ByteString3.a aVar2 = ByteString3.f30712g;
            String strSubstring2 = str2.substring(7);
            Intrinsics2.m13086b(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            ByteString3 byteString3M13775a2 = aVar2.m13775a(strSubstring2);
            if (byteString3M13775a2 == null) {
                throw new IllegalArgumentException(outline.m1599u("Invalid pin hash: ", str2));
            }
            this.f30023c = byteString3M13775a2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return ((Intrinsics2.m13085a(this.f30021a, cVar.f30021a) ^ true) || (Intrinsics2.m13085a(this.f30022b, cVar.f30022b) ^ true) || (Intrinsics2.m13085a(this.f30023c, cVar.f30023c) ^ true)) ? false : true;
        }

        public int hashCode() {
            return this.f30023c.hashCode() + outline.m1569T(this.f30022b, this.f30021a.hashCode() * 31, 31);
        }

        public String toString() {
            return this.f30022b + '/' + this.f30023c.mo13763f();
        }
    }

    public CertificatePinner(Set<c> set, CertificateChainCleaner certificateChainCleaner) {
        Intrinsics2.m13090f(set, "pins");
        this.f30018c = set;
        this.f30019d = certificateChainCleaner;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6  */
    /* JADX INFO: renamed from: a */
    public final void m13346a(String str, InterfaceC6153a<? extends List<? extends X509Certificate>> interfaceC6153a) {
        boolean zM13085a;
        Intrinsics2.m13090f(str, "hostname");
        Intrinsics2.m13090f(interfaceC6153a, "cleanedPeerCertificatesFn");
        Intrinsics2.m13090f(str, "hostname");
        Set<c> set = this.f30018c;
        Collections4 collections4 = Collections4.f29519f;
        List<c> arrayList = collections4;
        for (Object obj : set) {
            c cVar = (c) obj;
            Objects.requireNonNull(cVar);
            Intrinsics2.m13090f(str, "hostname");
            if (StringsJVM.m12997n(cVar.f30021a, "**.", false, 2)) {
                int length = cVar.f30021a.length() - 3;
                int length2 = str.length() - length;
                if (StringsJVM.m12991h(str, str.length() - length, cVar.f30021a, 3, length, (16 & 16) != 0 ? false : false) && (length2 == 0 || str.charAt(length2 - 1) == '.')) {
                    zM13085a = true;
                } else {
                    zM13085a = false;
                }
            } else if (StringsJVM.m12997n(cVar.f30021a, "*.", false, 2)) {
                int length3 = cVar.f30021a.length() - 1;
                int length4 = str.length() - length3;
                if (StringsJVM.m12991h(str, str.length() - length3, cVar.f30021a, 1, length3, (16 & 16) != 0 ? false : false) && Strings5.m13014x(str, '.', length4 - 1, false, 4) == -1) {
                    zM13085a = true;
                } else {
                    zM13085a = false;
                }
            } else {
                zM13085a = Intrinsics2.m13085a(str, cVar.f30021a);
            }
            if (zM13085a) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                if (arrayList instanceof KMarkers) {
                    TypeIntrinsics.m13101c(arrayList, "kotlin.collections.MutableList");
                    throw null;
                }
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listMo2c = interfaceC6153a.mo2c();
        for (X509Certificate x509Certificate : listMo2c) {
            ByteString3 byteString3M13349b = null;
            ByteString3 byteString3Mo13764h = null;
            for (c cVar2 : arrayList) {
                String str2 = cVar2.f30022b;
                int iHashCode = str2.hashCode();
                if (iHashCode != -903629273) {
                    if (iHashCode != 3528965 || !str2.equals("sha1")) {
                        StringBuilder sbM1556G = outline.m1556G("unsupported hashAlgorithm: ");
                        sbM1556G.append(cVar2.f30022b);
                        throw new AssertionError(sbM1556G.toString());
                    }
                    if (byteString3Mo13764h == null) {
                        Objects.requireNonNull(f30017b);
                        Intrinsics2.m13090f(x509Certificate, "$this$sha1Hash");
                        ByteString3.a aVar = ByteString3.f30712g;
                        PublicKey publicKey = x509Certificate.getPublicKey();
                        Intrinsics2.m13086b(publicKey, "publicKey");
                        byte[] encoded = publicKey.getEncoded();
                        Intrinsics2.m13086b(encoded, "publicKey.encoded");
                        byteString3Mo13764h = ByteString3.a.m13774d(aVar, encoded, 0, 0, 3).mo13764h("SHA-1");
                    }
                    if (Intrinsics2.m13085a(cVar2.f30023c, byteString3Mo13764h)) {
                        return;
                    }
                } else {
                    if (!str2.equals("sha256")) {
                        StringBuilder sbM1556G2 = outline.m1556G("unsupported hashAlgorithm: ");
                        sbM1556G2.append(cVar2.f30022b);
                        throw new AssertionError(sbM1556G2.toString());
                    }
                    if (byteString3M13349b == null) {
                        byteString3M13349b = f30017b.m13349b(x509Certificate);
                    }
                    if (Intrinsics2.m13085a(cVar2.f30023c, byteString3M13349b)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sbM1561L = outline.m1561L("Certificate pinning failure!", "\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listMo2c) {
            sbM1561L.append("\n    ");
            sbM1561L.append(f30017b.m13348a(x509Certificate2));
            sbM1561L.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            Intrinsics2.m13086b(subjectDN, "element.subjectDN");
            sbM1561L.append(subjectDN.getName());
        }
        sbM1561L.append("\n  Pinned certificates for ");
        sbM1561L.append(str);
        sbM1561L.append(":");
        for (c cVar3 : arrayList) {
            sbM1561L.append("\n    ");
            sbM1561L.append(cVar3);
        }
        String string = sbM1561L.toString();
        Intrinsics2.m13086b(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    /* JADX INFO: renamed from: b */
    public final CertificatePinner m13347b(CertificateChainCleaner certificateChainCleaner) {
        Intrinsics2.m13090f(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics2.m13085a(this.f30019d, certificateChainCleaner) ? this : new CertificatePinner(this.f30018c, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (Intrinsics2.m13085a(certificatePinner.f30018c, this.f30018c) && Intrinsics2.m13085a(certificatePinner.f30019d, this.f30019d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f30018c.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.f30019d;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }
}
