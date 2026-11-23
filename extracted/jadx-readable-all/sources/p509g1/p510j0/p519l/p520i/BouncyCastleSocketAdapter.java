package p509g1.p510j0.p519l.p520i;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p477d1.TypeCastException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Protocol;
import p509g1.p510j0.p519l.BouncyCastlePlatform;
import p509g1.p510j0.p519l.Platform;

/* JADX INFO: renamed from: g1.j0.l.i.g, reason: use source file name */
/* JADX INFO: compiled from: BouncyCastleSocketAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BouncyCastleSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: b */
    public static final b f30565b = new b(null);

    /* JADX INFO: renamed from: a */
    public static final DeferredSocketAdapter.a f30564a = new a();

    /* JADX INFO: renamed from: g1.j0.l.i.g$a */
    /* JADX INFO: compiled from: BouncyCastleSocketAdapter.kt */
    public static final class a implements DeferredSocketAdapter.a {
        @Override // p509g1.p510j0.p519l.p520i.DeferredSocketAdapter.a
        /* JADX INFO: renamed from: a */
        public boolean mo13616a(SSLSocket sSLSocket) {
            Intrinsics2.m13090f(sSLSocket, "sslSocket");
            Objects.requireNonNull(BouncyCastlePlatform.f30525e);
            return BouncyCastlePlatform.f30524d && (sSLSocket instanceof BCSSLSocket);
        }

        @Override // p509g1.p510j0.p519l.p520i.DeferredSocketAdapter.a
        /* JADX INFO: renamed from: b */
        public SocketAdapter mo13617b(SSLSocket sSLSocket) {
            Intrinsics2.m13090f(sSLSocket, "sslSocket");
            return new BouncyCastleSocketAdapter();
        }
    }

    /* JADX INFO: renamed from: g1.j0.l.i.g$b */
    /* JADX INFO: compiled from: BouncyCastleSocketAdapter.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: a */
    public boolean mo13609a(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: b */
    public boolean mo13610b() {
        Objects.requireNonNull(BouncyCastlePlatform.f30525e);
        return BouncyCastlePlatform.f30524d;
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: c */
    public String mo13611c(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || Intrinsics2.m13085a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: d */
    public void mo13612d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        Intrinsics2.m13090f(list, "protocols");
        if (mo13609a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Intrinsics2.m13086b(parameters, "sslParameters");
            Object[] array = ((ArrayList) Platform.f30547c.m13606a(list)).toArray(new String[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
