package p509g1.p510j0.p519l.p520i;

import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.j0.l.i.e, reason: use source file name */
/* JADX INFO: compiled from: AndroidSocketAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidSocketAdapter implements DeferredSocketAdapter.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f30556a;

    public AndroidSocketAdapter(String str) {
        this.f30556a = str;
    }

    @Override // p509g1.p510j0.p519l.p520i.DeferredSocketAdapter.a
    /* JADX INFO: renamed from: a */
    public boolean mo13616a(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        Intrinsics2.m13086b(name, "sslSocket.javaClass.name");
        return StringsJVM.m12997n(name, this.f30556a + '.', false, 2);
    }

    @Override // p509g1.p510j0.p519l.p520i.DeferredSocketAdapter.a
    /* JADX INFO: renamed from: b */
    public SocketAdapter mo13617b(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        AndroidSocketAdapter2.a aVar = AndroidSocketAdapter2.f30558b;
        Class<?> cls = sSLSocket.getClass();
        Objects.requireNonNull(aVar);
        Class<?> superclass = cls;
        while (superclass != null && (!Intrinsics2.m13085a(superclass.getSimpleName(), "OpenSSLSocketImpl"))) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        if (superclass != null) {
            return new AndroidSocketAdapter2(superclass);
        }
        Intrinsics2.m13095k();
        throw null;
    }
}
