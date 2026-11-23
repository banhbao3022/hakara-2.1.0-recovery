package p509g1.p510j0.p519l;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p483s.Collections2;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Protocol;
import p509g1.p510j0.p519l.p520i.AndroidCertificateChainCleaner;
import p509g1.p510j0.p519l.p520i.AndroidSocketAdapter2;
import p509g1.p510j0.p519l.p520i.BouncyCastleSocketAdapter;
import p509g1.p510j0.p519l.p520i.CloseGuard;
import p509g1.p510j0.p519l.p520i.ConscryptSocketAdapter;
import p509g1.p510j0.p519l.p520i.DeferredSocketAdapter;
import p509g1.p510j0.p519l.p520i.SocketAdapter;
import p509g1.p510j0.p519l.p520i.StandardAndroidSocketAdapter;
import p509g1.p510j0.p522n.CertificateChainCleaner;
import p509g1.p510j0.p522n.TrustRootIndex;

/* JADX INFO: renamed from: g1.j0.l.b, reason: use source file name */
/* JADX INFO: compiled from: AndroidPlatform.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidPlatform extends Platform {

    /* JADX INFO: renamed from: d */
    public static final boolean f30518d;

    /* JADX INFO: renamed from: e */
    public static final a f30519e = new a(null);

    /* JADX INFO: renamed from: f */
    public final List<SocketAdapter> f30520f;

    /* JADX INFO: renamed from: g */
    public final CloseGuard f30521g;

    /* JADX INFO: renamed from: g1.j0.l.b$a */
    /* JADX INFO: compiled from: AndroidPlatform.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: g1.j0.l.b$b */
    /* JADX INFO: compiled from: AndroidPlatform.kt */
    public static final class b implements TrustRootIndex {

        /* JADX INFO: renamed from: a */
        public final X509TrustManager f30522a;

        /* JADX INFO: renamed from: b */
        public final Method f30523b;

        public b(X509TrustManager x509TrustManager, Method method) {
            Intrinsics2.m13090f(x509TrustManager, "trustManager");
            Intrinsics2.m13090f(method, "findByIssuerAndSignatureMethod");
            this.f30522a = x509TrustManager;
            this.f30523b = method;
        }

        @Override // p509g1.p510j0.p522n.TrustRootIndex
        /* JADX INFO: renamed from: a */
        public X509Certificate mo13598a(X509Certificate x509Certificate) {
            Intrinsics2.m13090f(x509Certificate, "cert");
            try {
                Object objInvoke = this.f30523b.invoke(this.f30522a, x509Certificate);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new TypeCastException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics2.m13085a(this.f30522a, bVar.f30522a) && Intrinsics2.m13085a(this.f30523b, bVar.f30523b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f30522a;
            int iHashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f30523b;
            return iHashCode + (method != null ? method.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("CustomTrustRootIndex(trustManager=");
            sbM1556G.append(this.f30522a);
            sbM1556G.append(", findByIssuerAndSignatureMethod=");
            sbM1556G.append(this.f30523b);
            sbM1556G.append(")");
            return sbM1556G.toString();
        }
    }

    static {
        boolean z = false;
        if (Platform.f30547c.m13608c() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f30518d = z;
    }

    public AndroidPlatform() throws NoSuchMethodException {
        StandardAndroidSocketAdapter standardAndroidSocketAdapter;
        Method method;
        Method method2;
        SocketAdapter[] socketAdapterArr = new SocketAdapter[4];
        Objects.requireNonNull(StandardAndroidSocketAdapter.f30574h);
        Intrinsics2.m13090f("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class<?> cls3 = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Intrinsics2.m13086b(cls3, "paramsClass");
            standardAndroidSocketAdapter = new StandardAndroidSocketAdapter(cls, cls2, cls3);
        } catch (Exception e) {
            Objects.requireNonNull(Platform.f30547c);
            Platform.f30545a.m13605i("unable to load android socket classes", 5, e);
            standardAndroidSocketAdapter = null;
        }
        socketAdapterArr[0] = standardAndroidSocketAdapter;
        Objects.requireNonNull(AndroidSocketAdapter2.f30558b);
        socketAdapterArr[1] = new DeferredSocketAdapter(AndroidSocketAdapter2.f30557a);
        Objects.requireNonNull(ConscryptSocketAdapter.f30571b);
        socketAdapterArr[2] = new DeferredSocketAdapter(ConscryptSocketAdapter.f30570a);
        Objects.requireNonNull(BouncyCastleSocketAdapter.f30565b);
        socketAdapterArr[3] = new DeferredSocketAdapter(BouncyCastleSocketAdapter.f30564a);
        List listM13039d = Collections2.m13039d(socketAdapterArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listM13039d) {
            if (((SocketAdapter) obj).mo13610b()) {
                arrayList.add(obj);
            }
        }
        this.f30520f = arrayList;
        Objects.requireNonNull(CloseGuard.f30566a);
        try {
            Class<?> cls4 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls4.getMethod("get", new Class[0]);
            method2 = cls4.getMethod("open", String.class);
            method = cls4.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f30521g = new CloseGuard(method3, method2, method);
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: b */
    public CertificateChainCleaner mo13590b(X509TrustManager x509TrustManager) {
        Intrinsics2.m13090f(x509TrustManager, "trustManager");
        AndroidCertificateChainCleaner androidCertificateChainCleanerM13615a = AndroidCertificateChainCleaner.f30549b.m13615a(x509TrustManager);
        return androidCertificateChainCleanerM13615a != null ? androidCertificateChainCleanerM13615a : super.mo13590b(x509TrustManager);
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: c */
    public TrustRootIndex mo13594c(X509TrustManager x509TrustManager) {
        Intrinsics2.m13090f(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            Intrinsics2.m13086b(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo13594c(x509TrustManager);
        }
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: d */
    public void mo13591d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        Object next;
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        Intrinsics2.m13090f(list, "protocols");
        Iterator<T> it = this.f30520f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).mo13609a(sSLSocket));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            socketAdapter.mo13612d(sSLSocket, str, list);
        }
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: e */
    public void mo13595e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        Intrinsics2.m13090f(socket, "socket");
        Intrinsics2.m13090f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: f */
    public String mo13592f(SSLSocket sSLSocket) {
        Object next;
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        Iterator<T> it = this.f30520f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).mo13609a(sSLSocket));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            return socketAdapter.mo13611c(sSLSocket);
        }
        return null;
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: g */
    public Object mo13596g(String str) {
        Intrinsics2.m13090f(str, "closer");
        CloseGuard closeGuard = this.f30521g;
        Objects.requireNonNull(closeGuard);
        Intrinsics2.m13090f(str, "closer");
        Method method = closeGuard.f30567b;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, new Object[0]);
            Method method2 = closeGuard.f30568c;
            if (method2 != null) {
                method2.invoke(objInvoke, str);
                return objInvoke;
            }
            Intrinsics2.m13095k();
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: h */
    public boolean mo13593h(String str) {
        Intrinsics2.m13090f(str, "hostname");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i < 23) {
            return true;
        }
        NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
        Intrinsics2.m13086b(networkSecurityPolicy, "NetworkSecurityPolicy.getInstance()");
        return networkSecurityPolicy.isCleartextTrafficPermitted();
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: k */
    public void mo13597k(String str, Object obj) {
        Intrinsics2.m13090f(str, "message");
        CloseGuard closeGuard = this.f30521g;
        Objects.requireNonNull(closeGuard);
        boolean z = false;
        if (obj != null) {
            try {
                Method method = closeGuard.f30569d;
                if (method == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                method.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        Platform.m13604j(this, str, 5, null, 4, null);
    }
}
