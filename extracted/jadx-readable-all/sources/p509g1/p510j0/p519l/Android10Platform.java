package p509g1.p510j0.p519l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p477d1.p483s.Collections2;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Protocol;
import p509g1.p510j0.p519l.p520i.Android10SocketAdapter;
import p509g1.p510j0.p519l.p520i.AndroidCertificateChainCleaner;
import p509g1.p510j0.p519l.p520i.AndroidSocketAdapter2;
import p509g1.p510j0.p519l.p520i.BouncyCastleSocketAdapter;
import p509g1.p510j0.p519l.p520i.ConscryptSocketAdapter;
import p509g1.p510j0.p519l.p520i.DeferredSocketAdapter;
import p509g1.p510j0.p519l.p520i.SocketAdapter;
import p509g1.p510j0.p522n.CertificateChainCleaner;

/* JADX INFO: renamed from: g1.j0.l.a, reason: use source file name */
/* JADX INFO: compiled from: Android10Platform.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Android10Platform extends Platform {

    /* JADX INFO: renamed from: d */
    public static final boolean f30515d;

    /* JADX INFO: renamed from: e */
    public static final a f30516e = new a(null);

    /* JADX INFO: renamed from: f */
    public final List<SocketAdapter> f30517f;

    /* JADX INFO: renamed from: g1.j0.l.a$a */
    /* JADX INFO: compiled from: Android10Platform.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        f30515d = Platform.f30547c.m13608c() && Build.VERSION.SDK_INT >= 29;
    }

    public Android10Platform() {
        SocketAdapter[] socketAdapterArr = new SocketAdapter[4];
        socketAdapterArr[0] = Android10SocketAdapter.f30548a.m13613a() ? new Android10SocketAdapter() : null;
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
        this.f30517f = arrayList;
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: b */
    public CertificateChainCleaner mo13590b(X509TrustManager x509TrustManager) {
        Intrinsics2.m13090f(x509TrustManager, "trustManager");
        AndroidCertificateChainCleaner androidCertificateChainCleanerM13615a = AndroidCertificateChainCleaner.f30549b.m13615a(x509TrustManager);
        return androidCertificateChainCleanerM13615a != null ? androidCertificateChainCleanerM13615a : super.mo13590b(x509TrustManager);
    }

    @Override // p509g1.p510j0.p519l.Platform
    /* JADX INFO: renamed from: d */
    public void mo13591d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        Object next;
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        Intrinsics2.m13090f(list, "protocols");
        Iterator<T> it = this.f30517f.iterator();
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
    /* JADX INFO: renamed from: f */
    public String mo13592f(SSLSocket sSLSocket) {
        Object next;
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        Iterator<T> it = this.f30517f.iterator();
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
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: h */
    public boolean mo13593h(String str) {
        Intrinsics2.m13090f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
