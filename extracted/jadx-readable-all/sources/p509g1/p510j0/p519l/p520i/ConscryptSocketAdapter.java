package p509g1.p510j0.p519l.p520i;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p477d1.TypeCastException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Protocol;
import p509g1.p510j0.p519l.ConscryptPlatform;
import p509g1.p510j0.p519l.Platform;

/* JADX INFO: renamed from: g1.j0.l.i.i, reason: use source file name */
/* JADX INFO: compiled from: ConscryptSocketAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ConscryptSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: b */
    public static final b f30571b = new b(null);

    /* JADX INFO: renamed from: a */
    public static final DeferredSocketAdapter.a f30570a = new a();

    /* JADX INFO: renamed from: g1.j0.l.i.i$a */
    /* JADX INFO: compiled from: ConscryptSocketAdapter.kt */
    public static final class a implements DeferredSocketAdapter.a {
        @Override // p509g1.p510j0.p519l.p520i.DeferredSocketAdapter.a
        /* JADX INFO: renamed from: a */
        public boolean mo13616a(SSLSocket sSLSocket) {
            Intrinsics2.m13090f(sSLSocket, "sslSocket");
            Objects.requireNonNull(ConscryptPlatform.f30528e);
            return ConscryptPlatform.f30527d && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // p509g1.p510j0.p519l.p520i.DeferredSocketAdapter.a
        /* JADX INFO: renamed from: b */
        public SocketAdapter mo13617b(SSLSocket sSLSocket) {
            Intrinsics2.m13090f(sSLSocket, "sslSocket");
            return new ConscryptSocketAdapter();
        }
    }

    /* JADX INFO: renamed from: g1.j0.l.i.i$b */
    /* JADX INFO: compiled from: ConscryptSocketAdapter.kt */
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
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: b */
    public boolean mo13610b() {
        Objects.requireNonNull(ConscryptPlatform.f30528e);
        return ConscryptPlatform.f30527d;
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: c */
    public String mo13611c(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        if (mo13609a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: d */
    public void mo13612d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        Intrinsics2.m13090f(list, "protocols");
        if (mo13609a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = ((ArrayList) Platform.f30547c.m13606a(list)).toArray(new String[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
