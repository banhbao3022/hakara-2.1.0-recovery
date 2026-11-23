package p509g1;

import java.net.Proxy;
import java.net.ProxySelector;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: g1.a, reason: use source file name */
/* JADX INFO: compiled from: Address.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Address {

    /* JADX INFO: renamed from: a */
    public final HttpUrl f29835a;

    /* JADX INFO: renamed from: b */
    public final List<Protocol> f29836b;

    /* JADX INFO: renamed from: c */
    public final List<ConnectionSpec> f29837c;

    /* JADX INFO: renamed from: d */
    public final Dns f29838d;

    /* JADX INFO: renamed from: e */
    public final SocketFactory f29839e;

    /* JADX INFO: renamed from: f */
    public final SSLSocketFactory f29840f;

    /* JADX INFO: renamed from: g */
    public final HostnameVerifier f29841g;

    /* JADX INFO: renamed from: h */
    public final CertificatePinner f29842h;

    /* JADX INFO: renamed from: i */
    public final Authenticator f29843i;

    /* JADX INFO: renamed from: j */
    public final Proxy f29844j;

    /* JADX INFO: renamed from: k */
    public final ProxySelector f29845k;

    public Address(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List<? extends Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) throws UnknownHostException {
        Intrinsics2.m13090f(str, "uriHost");
        Intrinsics2.m13090f(dns, "dns");
        Intrinsics2.m13090f(socketFactory, "socketFactory");
        Intrinsics2.m13090f(authenticator, "proxyAuthenticator");
        Intrinsics2.m13090f(list, "protocols");
        Intrinsics2.m13090f(list2, "connectionSpecs");
        Intrinsics2.m13090f(proxySelector, "proxySelector");
        this.f29838d = dns;
        this.f29839e = socketFactory;
        this.f29840f = sSLSocketFactory;
        this.f29841g = hostnameVerifier;
        this.f29842h = certificatePinner;
        this.f29843i = authenticator;
        this.f29844j = proxy;
        this.f29845k = proxySelector;
        HttpUrl.a aVar = new HttpUrl.a();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        Intrinsics2.m13090f(str2, "scheme");
        if (StringsJVM.m12989f(str2, "http", true)) {
            aVar.f30654b = "http";
        } else {
            if (!StringsJVM.m12989f(str2, "https", true)) {
                throw new IllegalArgumentException(outline.m1599u("unexpected scheme: ", str2));
            }
            aVar.f30654b = "https";
        }
        Intrinsics2.m13090f(str, "host");
        String strM14084e0 = SkuDao.a.m14084e0(HttpUrl.b.m13679e(HttpUrl.f30642b, str, 0, 0, false, 7));
        if (strM14084e0 == null) {
            throw new IllegalArgumentException(outline.m1599u("unexpected host: ", str));
        }
        aVar.f30657e = strM14084e0;
        if (!(1 <= i && 65535 >= i)) {
            throw new IllegalArgumentException(outline.m1590l("unexpected port: ", i).toString());
        }
        aVar.f30658f = i;
        this.f29835a = aVar.m13674b();
        this.f29836b = Util9.m13384x(list);
        this.f29837c = Util9.m13384x(list2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13299a(Address address) {
        Intrinsics2.m13090f(address, "that");
        return Intrinsics2.m13085a(this.f29838d, address.f29838d) && Intrinsics2.m13085a(this.f29843i, address.f29843i) && Intrinsics2.m13085a(this.f29836b, address.f29836b) && Intrinsics2.m13085a(this.f29837c, address.f29837c) && Intrinsics2.m13085a(this.f29845k, address.f29845k) && Intrinsics2.m13085a(this.f29844j, address.f29844j) && Intrinsics2.m13085a(this.f29840f, address.f29840f) && Intrinsics2.m13085a(this.f29841g, address.f29841g) && Intrinsics2.m13085a(this.f29842h, address.f29842h) && this.f29835a.f30648h == address.f29835a.f30648h;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (Intrinsics2.m13085a(this.f29835a, address.f29835a) && m13299a(address)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f29842h) + ((Objects.hashCode(this.f29841g) + ((Objects.hashCode(this.f29840f) + ((Objects.hashCode(this.f29844j) + ((this.f29845k.hashCode() + ((this.f29837c.hashCode() + ((this.f29836b.hashCode() + ((this.f29843i.hashCode() + ((this.f29838d.hashCode() + ((this.f29835a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sbM1556G;
        Object obj;
        StringBuilder sbM1556G2 = outline.m1556G("Address{");
        sbM1556G2.append(this.f29835a.f30647g);
        sbM1556G2.append(':');
        sbM1556G2.append(this.f29835a.f30648h);
        sbM1556G2.append(", ");
        if (this.f29844j != null) {
            sbM1556G = outline.m1556G("proxy=");
            obj = this.f29844j;
        } else {
            sbM1556G = outline.m1556G("proxySelector=");
            obj = this.f29845k;
        }
        sbM1556G.append(obj);
        sbM1556G2.append(sbM1556G.toString());
        sbM1556G2.append("}");
        return sbM1556G2.toString();
    }
}
