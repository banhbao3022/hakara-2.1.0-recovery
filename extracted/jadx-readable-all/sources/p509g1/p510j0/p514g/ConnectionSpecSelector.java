package p509g1.p510j0.p514g;

import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p483s._Arrays;
import p477d1.p484t.Comparisons2;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.CipherSuite;
import p509g1.ConnectionSpec;
import p509g1.p510j0.Util9;

/* JADX INFO: renamed from: g1.j0.g.b, reason: use source file name */
/* JADX INFO: compiled from: ConnectionSpecSelector.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionSpecSelector {

    /* JADX INFO: renamed from: a */
    public int f30182a;

    /* JADX INFO: renamed from: b */
    public boolean f30183b;

    /* JADX INFO: renamed from: c */
    public boolean f30184c;

    /* JADX INFO: renamed from: d */
    public final List<ConnectionSpec> f30185d;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
        Intrinsics2.m13090f(list, "connectionSpecs");
        this.f30185d = list;
    }

    /* JADX INFO: renamed from: a */
    public final ConnectionSpec m13431a(SSLSocket sSLSocket) throws IOException, CloneNotSupportedException {
        ConnectionSpec connectionSpec;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        int i = this.f30182a;
        int size = this.f30185d.size();
        while (true) {
            if (i >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = this.f30185d.get(i);
            if (connectionSpec.m13626b(sSLSocket)) {
                this.f30182a = i + 1;
                break;
            }
            i++;
        }
        if (connectionSpec == null) {
            StringBuilder sbM1556G = outline.m1556G("Unable to find acceptable protocols. isFallback=");
            sbM1556G.append(this.f30184c);
            sbM1556G.append(',');
            sbM1556G.append(" modes=");
            sbM1556G.append(this.f30185d);
            sbM1556G.append(',');
            sbM1556G.append(" supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            if (enabledProtocols2 == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            String string = Arrays.toString(enabledProtocols2);
            Intrinsics2.m13086b(string, "java.util.Arrays.toString(this)");
            sbM1556G.append(string);
            throw new UnknownServiceException(sbM1556G.toString());
        }
        int i2 = this.f30182a;
        int size2 = this.f30185d.size();
        while (true) {
            if (i2 >= size2) {
                z = false;
                break;
            }
            if (this.f30185d.get(i2).m13626b(sSLSocket)) {
                z = true;
                break;
            }
            i2++;
        }
        this.f30183b = z;
        boolean z2 = this.f30184c;
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        if (connectionSpec.f30595g != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            Intrinsics2.m13086b(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            String[] strArr = connectionSpec.f30595g;
            Objects.requireNonNull(CipherSuite.f30065s);
            enabledCipherSuites = Util9.m13376p(enabledCipherSuites2, strArr, CipherSuite.f30047a);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (connectionSpec.f30596h != null) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            Intrinsics2.m13086b(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = Util9.m13376p(enabledProtocols3, connectionSpec.f30596h, Comparisons2.f29522f);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics2.m13086b(supportedCipherSuites, "supportedCipherSuites");
        Objects.requireNonNull(CipherSuite.f30065s);
        Comparator<String> comparator = CipherSuite.f30047a;
        byte[] bArr = Util9.f30070a;
        Intrinsics2.m13090f(supportedCipherSuites, "$this$indexOf");
        Intrinsics2.m13090f("TLS_FALLBACK_SCSV", "value");
        Intrinsics2.m13090f(comparator, "comparator");
        int length = supportedCipherSuites.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (comparator.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i3++;
        }
        if (z2 && i3 != -1) {
            Intrinsics2.m13086b(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i3];
            Intrinsics2.m13086b(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Intrinsics2.m13090f(enabledCipherSuites, "$this$concat");
            Intrinsics2.m13090f(str, "value");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            Intrinsics2.m13086b(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[_Arrays.m13032f(enabledCipherSuites)] = str;
        }
        ConnectionSpec.a aVar = new ConnectionSpec.a(connectionSpec);
        Intrinsics2.m13086b(enabledCipherSuites, "cipherSuitesIntersection");
        aVar.m13629b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        Intrinsics2.m13086b(enabledProtocols, "tlsVersionsIntersection");
        aVar.m13632e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        ConnectionSpec connectionSpecM13628a = aVar.m13628a();
        if (connectionSpecM13628a.m13627c() != null) {
            sSLSocket.setEnabledProtocols(connectionSpecM13628a.f30596h);
        }
        if (connectionSpecM13628a.m13625a() != null) {
            sSLSocket.setEnabledCipherSuites(connectionSpecM13628a.f30595g);
        }
        return connectionSpec;
    }
}
