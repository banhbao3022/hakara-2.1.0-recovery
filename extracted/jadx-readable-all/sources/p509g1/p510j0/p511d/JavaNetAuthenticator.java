package p509g1.p510j0.p511d;

import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p481d0.StringsJVM;
import p477d1.p483s.Collections4;
import p477d1.p483s._Collections;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Address;
import p509g1.Authenticator;
import p509g1.Challenge;
import p509g1.Dns;
import p509g1.Headers2;
import p509g1.HttpUrl;
import p509g1.Request3;
import p509g1.Response3;
import p509g1.Route;
import p509g1.p510j0.p515h.HttpHeaders2;
import p509g1.p510j0.p519l.Platform;
import p524h1.Buffer3;
import p524h1.ByteString3;

/* JADX INFO: renamed from: g1.j0.d.b, reason: use source file name */
/* JADX INFO: compiled from: JavaNetAuthenticator.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JavaNetAuthenticator implements Authenticator {

    /* JADX INFO: renamed from: b */
    public final Dns f30078b;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaNetAuthenticator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public JavaNetAuthenticator(Dns dns) {
        Intrinsics2.m13090f(dns, "defaultDns");
        this.f30078b = dns;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x011d  */
    /* JADX WARN: Code duplicated, block: B:63:0x014c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x01a6 A[SYNTHETIC] */
    @Override // p509g1.Authenticator
    /* JADX INFO: renamed from: a */
    public Request3 mo13301a(Route route, Response3 response3) throws IOException {
        String str;
        List<Challenge> list;
        Request3 request3;
        HttpUrl httpUrl;
        boolean z;
        Proxy proxy;
        Dns dns;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        String str2;
        String str3;
        Charset charsetForName;
        SocketAddress socketAddressAddress;
        Address address;
        Intrinsics2.m13090f(response3, "response");
        Headers2 headers2 = response3.f29995l;
        int i = response3.f29993j;
        boolean z2 = true;
        if (i != 401) {
            if (i != 407) {
                list = Collections4.f29519f;
            } else {
                str = "Proxy-Authenticate";
            }
            request3 = response3.f29990g;
            httpUrl = request3.f29951b;
            z = response3.f29993j == 407;
            if (route != null || (proxy = route.f30035b) == null) {
                proxy = Proxy.NO_PROXY;
            }
            for (Challenge challenge : list) {
                if (StringsJVM.m12989f("Basic", challenge.f30038b, z2)) {
                    if (route != null || (address = route.f30034a) == null || (dns = address.f29838d) == null) {
                        dns = this.f30078b;
                    }
                    if (z) {
                        socketAddressAddress = proxy.address();
                        if (socketAddressAddress != null) {
                            throw new TypeCastException("null cannot be cast to non-null type java.net.InetSocketAddress");
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        String hostName = inetSocketAddress.getHostName();
                        Intrinsics2.m13086b(proxy, "proxy");
                        try {
                            passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName, m13387b(proxy, httpUrl, dns), inetSocketAddress.getPort(), httpUrl.f30644d, challenge.f30037a.get("realm"), challenge.f30038b, new URL(httpUrl.f30652l), java.net.Authenticator.RequestorType.PROXY);
                        } catch (MalformedURLException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        String str4 = httpUrl.f30647g;
                        Intrinsics2.m13086b(proxy, "proxy");
                        try {
                            passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(str4, m13387b(proxy, httpUrl, dns), httpUrl.f30648h, httpUrl.f30644d, challenge.f30037a.get("realm"), challenge.f30038b, new URL(httpUrl.f30652l), java.net.Authenticator.RequestorType.SERVER);
                        } catch (MalformedURLException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                    if (passwordAuthenticationRequestPasswordAuthentication != null) {
                        if (z) {
                            str2 = "Proxy-Authorization";
                        } else {
                            str2 = "Authorization";
                        }
                        String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                        Intrinsics2.m13086b(userName, "auth.userName");
                        char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                        Intrinsics2.m13086b(password, "auth.password");
                        String str5 = new String(password);
                        str3 = challenge.f30037a.get("charset");
                        if (str3 != null) {
                            try {
                                charsetForName = Charset.forName(str3);
                                Intrinsics2.m13086b(charsetForName, "Charset.forName(charset)");
                            } catch (Exception unused) {
                                charsetForName = StandardCharsets.ISO_8859_1;
                                Intrinsics2.m13086b(charsetForName, "ISO_8859_1");
                            }
                        } else {
                            charsetForName = StandardCharsets.ISO_8859_1;
                            Intrinsics2.m13086b(charsetForName, "ISO_8859_1");
                        }
                        Intrinsics2.m13090f(userName, "username");
                        Intrinsics2.m13090f(str5, "password");
                        Intrinsics2.m13090f(charsetForName, "charset");
                        String str6 = userName + ':' + str5;
                        Objects.requireNonNull(ByteString3.f30712g);
                        Intrinsics2.m13090f(str6, "$this$encode");
                        Intrinsics2.m13090f(charsetForName, "charset");
                        byte[] bytes = str6.getBytes(charsetForName);
                        Intrinsics2.m13086b(bytes, "(this as java.lang.String).getBytes(charset)");
                        String strM1599u = outline.m1599u("Basic ", new ByteString3(bytes).mo13763f());
                        Request3.a aVar = new Request3.a(request3);
                        aVar.m13316d(str2, strM1599u);
                        return aVar.m13314b();
                    }
                }
                z2 = true;
            }
            return null;
        }
        str = "WWW-Authenticate";
        String str7 = str;
        ByteString3 byteString3 = HttpHeaders2.f30285a;
        Intrinsics2.m13090f(headers2, "$this$parseChallenges");
        Intrinsics2.m13090f(str7, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (StringsJVM.m12989f(str7, headers2.m13650f(i2), true)) {
                Buffer3 buffer3 = new Buffer3();
                buffer3.m13729P0(headers2.m13653m(i2));
                try {
                    HttpHeaders2.m13486b(buffer3, arrayList);
                } catch (EOFException e3) {
                    Objects.requireNonNull(Platform.f30547c);
                    Platform.f30545a.m13605i("Unable to parse challenge", 5, e3);
                }
            }
        }
        list = arrayList;
        request3 = response3.f29990g;
        httpUrl = request3.f29951b;
        if (response3.f29993j == 407) {
        }
        if (route != null) {
            proxy = Proxy.NO_PROXY;
        } else {
            proxy = Proxy.NO_PROXY;
        }
        while (r0.hasNext()) {
            if (StringsJVM.m12989f("Basic", challenge.f30038b, z2)) {
                if (route != null) {
                    dns = this.f30078b;
                } else {
                    dns = this.f30078b;
                }
                if (z) {
                    socketAddressAddress = proxy.address();
                    if (socketAddressAddress != null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress2 = (InetSocketAddress) socketAddressAddress;
                    String hostName2 = inetSocketAddress2.getHostName();
                    Intrinsics2.m13086b(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName2, m13387b(proxy, httpUrl, dns), inetSocketAddress2.getPort(), httpUrl.f30644d, challenge.f30037a.get("realm"), challenge.f30038b, new URL(httpUrl.f30652l), java.net.Authenticator.RequestorType.PROXY);
                } else {
                    String str8 = httpUrl.f30647g;
                    Intrinsics2.m13086b(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(str8, m13387b(proxy, httpUrl, dns), httpUrl.f30648h, httpUrl.f30644d, challenge.f30037a.get("realm"), challenge.f30038b, new URL(httpUrl.f30652l), java.net.Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    if (z) {
                        str2 = "Proxy-Authorization";
                    } else {
                        str2 = "Authorization";
                    }
                    String userName2 = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    Intrinsics2.m13086b(userName2, "auth.userName");
                    char[] password2 = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    Intrinsics2.m13086b(password2, "auth.password");
                    String str9 = new String(password2);
                    str3 = challenge.f30037a.get("charset");
                    if (str3 != null) {
                        charsetForName = Charset.forName(str3);
                        Intrinsics2.m13086b(charsetForName, "Charset.forName(charset)");
                    } else {
                        charsetForName = StandardCharsets.ISO_8859_1;
                        Intrinsics2.m13086b(charsetForName, "ISO_8859_1");
                    }
                    Intrinsics2.m13090f(userName2, "username");
                    Intrinsics2.m13090f(str9, "password");
                    Intrinsics2.m13090f(charsetForName, "charset");
                    String str10 = userName2 + ':' + str9;
                    Objects.requireNonNull(ByteString3.f30712g);
                    Intrinsics2.m13090f(str10, "$this$encode");
                    Intrinsics2.m13090f(charsetForName, "charset");
                    byte[] bytes2 = str10.getBytes(charsetForName);
                    Intrinsics2.m13086b(bytes2, "(this as java.lang.String).getBytes(charset)");
                    String strM1599u2 = outline.m1599u("Basic ", new ByteString3(bytes2).mo13763f());
                    Request3.a aVar2 = new Request3.a(request3);
                    aVar2.m13316d(str2, strM1599u2);
                    return aVar2.m13314b();
                }
            }
            z2 = true;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final InetAddress m13387b(Proxy proxy, HttpUrl httpUrl, Dns dns) throws IOException {
        Proxy.Type type = proxy.type();
        if (type != null && C6352a.f30077a[type.ordinal()] == 1) {
            return (InetAddress) _Collections.m13044i(dns.mo13642a(httpUrl.f30647g));
        }
        SocketAddress socketAddressAddress = proxy.address();
        if (socketAddressAddress == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics2.m13086b(address, "(address() as InetSocketAddress).address");
        return address;
    }

    public /* synthetic */ JavaNetAuthenticator(Dns dns, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dns.f30622a : dns);
    }
}
