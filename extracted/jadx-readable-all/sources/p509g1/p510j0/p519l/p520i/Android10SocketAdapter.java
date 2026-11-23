package p509g1.p510j0.p519l.p520i;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p477d1.TypeCastException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Protocol;
import p509g1.p510j0.p519l.Platform;

/* JADX INFO: renamed from: g1.j0.l.i.a, reason: use source file name */
/* JADX INFO: compiled from: Android10SocketAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public final class Android10SocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: a */
    public static final a f30548a = new a(null);

    /* JADX INFO: renamed from: g1.j0.l.i.a$a */
    /* JADX INFO: compiled from: Android10SocketAdapter.kt */
    public static final class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m13613a() {
            return Platform.f30547c.m13608c() && Build.VERSION.SDK_INT >= 29;
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: a */
    public boolean mo13609a(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: b */
    public boolean mo13610b() {
        return f30548a.m13613a();
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: c */
    public String mo13611c(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || Intrinsics2.m13085a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: d */
    public void mo13612d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) throws IOException {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        Intrinsics2.m13090f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            Intrinsics2.m13086b(sSLParameters, "sslParameters");
            Object[] array = ((ArrayList) Platform.f30547c.m13606a(list)).toArray(new String[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
