package p509g1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p483s._Collections;
import p477d1.p484t.Comparisons2;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;

/* JADX INFO: renamed from: g1.m, reason: use source file name */
/* JADX INFO: compiled from: ConnectionSpec.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionSpec {

    /* JADX INFO: renamed from: a */
    public static final CipherSuite[] f30589a;

    /* JADX INFO: renamed from: b */
    public static final CipherSuite[] f30590b;

    /* JADX INFO: renamed from: c */
    public static final ConnectionSpec f30591c;

    /* JADX INFO: renamed from: d */
    public static final ConnectionSpec f30592d;

    /* JADX INFO: renamed from: e */
    public final boolean f30593e;

    /* JADX INFO: renamed from: f */
    public final boolean f30594f;

    /* JADX INFO: renamed from: g */
    public final String[] f30595g;

    /* JADX INFO: renamed from: h */
    public final String[] f30596h;

    /* JADX INFO: renamed from: g1.m$a */
    /* JADX INFO: compiled from: ConnectionSpec.kt */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public boolean f30597a;

        /* JADX INFO: renamed from: b */
        public String[] f30598b;

        /* JADX INFO: renamed from: c */
        public String[] f30599c;

        /* JADX INFO: renamed from: d */
        public boolean f30600d;

        public a(boolean z) {
            this.f30597a = z;
        }

        /* JADX INFO: renamed from: a */
        public final ConnectionSpec m13628a() {
            return new ConnectionSpec(this.f30597a, this.f30600d, this.f30598b, this.f30599c);
        }

        /* JADX INFO: renamed from: b */
        public final a m13629b(String... strArr) throws CloneNotSupportedException {
            Intrinsics2.m13090f(strArr, "cipherSuites");
            if (!this.f30597a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            Object objClone = strArr.clone();
            if (objClone == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.f30598b = (String[]) objClone;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m13630c(CipherSuite... cipherSuiteArr) throws CloneNotSupportedException {
            Intrinsics2.m13090f(cipherSuiteArr, "cipherSuites");
            if (!this.f30597a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuiteArr.length);
            for (CipherSuite cipherSuite : cipherSuiteArr) {
                arrayList.add(cipherSuite.f30066t);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            m13629b((String[]) Arrays.copyOf(strArr, strArr.length));
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final a m13631d(boolean z) {
            if (!this.f30597a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f30600d = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final a m13632e(String... strArr) throws CloneNotSupportedException {
            Intrinsics2.m13090f(strArr, "tlsVersions");
            if (!this.f30597a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            Object objClone = strArr.clone();
            if (objClone == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.f30599c = (String[]) objClone;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public final a m13633f(TlsVersion... tlsVersionArr) throws CloneNotSupportedException {
            Intrinsics2.m13090f(tlsVersionArr, "tlsVersions");
            if (!this.f30597a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.f30046m);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            m13632e((String[]) Arrays.copyOf(strArr, strArr.length));
            return this;
        }

        public a(ConnectionSpec connectionSpec) {
            Intrinsics2.m13090f(connectionSpec, "connectionSpec");
            this.f30597a = connectionSpec.f30593e;
            this.f30598b = connectionSpec.f30595g;
            this.f30599c = connectionSpec.f30596h;
            this.f30600d = connectionSpec.f30594f;
        }
    }

    /* JADX INFO: renamed from: g1.m$b */
    /* JADX INFO: compiled from: ConnectionSpec.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new b(null);
        CipherSuite cipherSuite = CipherSuite.f30062p;
        CipherSuite cipherSuite2 = CipherSuite.f30063q;
        CipherSuite cipherSuite3 = CipherSuite.f30064r;
        CipherSuite cipherSuite4 = CipherSuite.f30056j;
        CipherSuite cipherSuite5 = CipherSuite.f30058l;
        CipherSuite cipherSuite6 = CipherSuite.f30057k;
        CipherSuite cipherSuite7 = CipherSuite.f30059m;
        CipherSuite cipherSuite8 = CipherSuite.f30061o;
        CipherSuite cipherSuite9 = CipherSuite.f30060n;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        f30589a = cipherSuiteArr;
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.f30054h, CipherSuite.f30055i, CipherSuite.f30052f, CipherSuite.f30053g, CipherSuite.f30050d, CipherSuite.f30051e, CipherSuite.f30049c};
        f30590b = cipherSuiteArr2;
        a aVar = new a(true);
        aVar.m13630c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        aVar.m13633f(tlsVersion, tlsVersion2);
        aVar.m13631d(true);
        aVar.m13628a();
        a aVar2 = new a(true);
        aVar2.m13630c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length));
        aVar2.m13633f(tlsVersion, tlsVersion2);
        aVar2.m13631d(true);
        f30591c = aVar2.m13628a();
        a aVar3 = new a(true);
        aVar3.m13630c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length));
        aVar3.m13633f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        aVar3.m13631d(true);
        aVar3.m13628a();
        f30592d = new a(false).m13628a();
    }

    public ConnectionSpec(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f30593e = z;
        this.f30594f = z2;
        this.f30595g = strArr;
        this.f30596h = strArr2;
    }

    /* JADX INFO: renamed from: a */
    public final List<CipherSuite> m13625a() {
        String[] strArr = this.f30595g;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.f30065s.m13357b(str));
        }
        return _Collections.m13049n(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13626b(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "socket");
        if (!this.f30593e) {
            return false;
        }
        String[] strArr = this.f30596h;
        if (strArr != null && !Util9.m13370j(strArr, sSLSocket.getEnabledProtocols(), Comparisons2.f29522f)) {
            return false;
        }
        String[] strArr2 = this.f30595g;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        Objects.requireNonNull(CipherSuite.f30065s);
        return Util9.m13370j(strArr2, enabledCipherSuites, CipherSuite.f30047a);
    }

    /* JADX INFO: renamed from: c */
    public final List<TlsVersion> m13627c() {
        String[] strArr = this.f30596h;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.f30045l.m13355a(str));
        }
        return _Collections.m13049n(arrayList);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f30593e;
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        if (z != connectionSpec.f30593e) {
            return false;
        }
        return !z || (Arrays.equals(this.f30595g, connectionSpec.f30595g) && Arrays.equals(this.f30596h, connectionSpec.f30596h) && this.f30594f == connectionSpec.f30594f);
    }

    public int hashCode() {
        if (!this.f30593e) {
            return 17;
        }
        String[] strArr = this.f30595g;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f30596h;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f30594f ? 1 : 0);
    }

    public String toString() {
        if (!this.f30593e) {
            return "ConnectionSpec()";
        }
        StringBuilder sbM1561L = outline.m1561L("ConnectionSpec(", "cipherSuites=");
        sbM1561L.append(Objects.toString(m13625a(), "[all enabled]"));
        sbM1561L.append(", ");
        sbM1561L.append("tlsVersions=");
        sbM1561L.append(Objects.toString(m13627c(), "[all enabled]"));
        sbM1561L.append(", ");
        sbM1561L.append("supportsTlsExtensions=");
        sbM1561L.append(this.f30594f);
        sbM1561L.append(')');
        return sbM1561L.toString();
    }
}
