package p509g1;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Lazy3;
import p477d1.LazyJVM;
import p477d1.p483s.Collections4;
import p477d1.p483s.Iterables2;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p509g1.p510j0.Util9;

/* JADX INFO: renamed from: g1.u, reason: use source file name */
/* JADX INFO: compiled from: Handshake.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Handshake {

    /* JADX INFO: renamed from: a */
    public static final a f30630a = new a(null);

    /* JADX INFO: renamed from: b */
    public final Lazy3 f30631b;

    /* JADX INFO: renamed from: c */
    public final TlsVersion f30632c;

    /* JADX INFO: renamed from: d */
    public final CipherSuite f30633d;

    /* JADX INFO: renamed from: e */
    public final List<Certificate> f30634e;

    /* JADX INFO: renamed from: g1.u$a */
    /* JADX INFO: compiled from: Handshake.kt */
    public static final class a {

        /* JADX INFO: renamed from: g1.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Handshake.kt */
        public static final class C8547a extends Lambda implements InterfaceC6153a<List<? extends Certificate>> {

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ List f30635g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8547a(List list) {
                super(0);
                this.f30635g = list;
            }

            @Override // p477d1.p493x.p494b.InterfaceC6153a
            /* JADX INFO: renamed from: c */
            public List<? extends Certificate> mo2c() {
                return this.f30635g;
            }
        }

        /* JADX INFO: renamed from: g1.u$a$b */
        /* JADX INFO: compiled from: Handshake.kt */
        public static final class b extends Lambda implements InterfaceC6153a<List<? extends Certificate>> {

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ List f30636g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(0);
                this.f30636g = list;
            }

            @Override // p477d1.p493x.p494b.InterfaceC6153a
            /* JADX INFO: renamed from: c */
            public List<? extends Certificate> mo2c() {
                return this.f30636g;
            }
        }

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final Handshake m13647a(SSLSession sSLSession) throws IOException {
            List listM13372l;
            Intrinsics2.m13090f(sSLSession, "$this$handshake");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            int iHashCode = cipherSuite.hashCode();
            if (iHashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : iHashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(outline.m1599u("cipherSuite == ", cipherSuite));
            }
            CipherSuite cipherSuiteM13357b = CipherSuite.f30065s.m13357b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (Intrinsics2.m13085a("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionM13355a = TlsVersion.f30045l.m13355a(protocol);
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                listM13372l = peerCertificates != null ? Util9.m13372l((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length)) : Collections4.f29519f;
            } catch (SSLPeerUnverifiedException unused) {
                listM13372l = Collections4.f29519f;
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new Handshake(tlsVersionM13355a, cipherSuiteM13357b, localCertificates != null ? Util9.m13372l((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length)) : Collections4.f29519f, new b(listM13372l));
        }

        /* JADX INFO: renamed from: b */
        public final Handshake m13648b(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
            Intrinsics2.m13090f(tlsVersion, "tlsVersion");
            Intrinsics2.m13090f(cipherSuite, "cipherSuite");
            Intrinsics2.m13090f(list, "peerCertificates");
            Intrinsics2.m13090f(list2, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util9.m13384x(list2), new C8547a(Util9.m13384x(list)));
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: g1.u$b */
    /* JADX INFO: compiled from: Handshake.kt */
    public static final class b extends Lambda implements InterfaceC6153a<List<? extends Certificate>> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC6153a f30637g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f30637g = interfaceC6153a;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public List<? extends Certificate> mo2c() {
            try {
                return (List) this.f30637g.mo2c();
            } catch (SSLPeerUnverifiedException unused) {
                return Collections4.f29519f;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, InterfaceC6153a<? extends List<? extends Certificate>> interfaceC6153a) {
        Intrinsics2.m13090f(tlsVersion, "tlsVersion");
        Intrinsics2.m13090f(cipherSuite, "cipherSuite");
        Intrinsics2.m13090f(list, "localCertificates");
        Intrinsics2.m13090f(interfaceC6153a, "peerCertificatesFn");
        this.f30632c = tlsVersion;
        this.f30633d = cipherSuite;
        this.f30634e = list;
        this.f30631b = LazyJVM.m13021b(new b(interfaceC6153a));
    }

    /* JADX INFO: renamed from: a */
    public final String m13645a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics2.m13086b(type, "type");
        return type;
    }

    /* JADX INFO: renamed from: b */
    public final List<Certificate> m13646b() {
        return (List) this.f30631b.getValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.f30632c == this.f30632c && Intrinsics2.m13085a(handshake.f30633d, this.f30633d) && Intrinsics2.m13085a(handshake.m13646b(), m13646b()) && Intrinsics2.m13085a(handshake.f30634e, this.f30634e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f30634e.hashCode() + ((m13646b().hashCode() + ((this.f30633d.hashCode() + ((this.f30632c.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        List<Certificate> listM13646b = m13646b();
        ArrayList arrayList = new ArrayList(Iterables2.m13042g(listM13646b, 10));
        Iterator<T> it = listM13646b.iterator();
        while (it.hasNext()) {
            arrayList.add(m13645a((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sbM1561L = outline.m1561L("Handshake{", "tlsVersion=");
        sbM1561L.append(this.f30632c);
        sbM1561L.append(' ');
        sbM1561L.append("cipherSuite=");
        sbM1561L.append(this.f30633d);
        sbM1561L.append(' ');
        sbM1561L.append("peerCertificates=");
        sbM1561L.append(string);
        sbM1561L.append(' ');
        sbM1561L.append("localCertificates=");
        List<Certificate> list = this.f30634e;
        ArrayList arrayList2 = new ArrayList(Iterables2.m13042g(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m13645a((Certificate) it2.next()));
        }
        sbM1561L.append(arrayList2);
        sbM1561L.append('}');
        return sbM1561L.toString();
    }
}
