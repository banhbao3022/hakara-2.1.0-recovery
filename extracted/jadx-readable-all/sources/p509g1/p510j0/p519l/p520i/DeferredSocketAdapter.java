package p509g1.p510j0.p519l.p520i;

import java.util.List;
import javax.net.ssl.SSLSocket;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Protocol;

/* JADX INFO: renamed from: g1.j0.l.i.j, reason: use source file name */
/* JADX INFO: compiled from: DeferredSocketAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DeferredSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: a */
    public SocketAdapter f30572a;

    /* JADX INFO: renamed from: b */
    public final a f30573b;

    /* JADX INFO: renamed from: g1.j0.l.i.j$a */
    /* JADX INFO: compiled from: DeferredSocketAdapter.kt */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo13616a(SSLSocket sSLSocket);

        /* JADX INFO: renamed from: b */
        SocketAdapter mo13617b(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(a aVar) {
        Intrinsics2.m13090f(aVar, "socketAdapterFactory");
        this.f30573b = aVar;
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: a */
    public boolean mo13609a(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        return this.f30573b.mo13616a(sSLSocket);
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: b */
    public boolean mo13610b() {
        return true;
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: c */
    public String mo13611c(SSLSocket sSLSocket) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        SocketAdapter socketAdapterM13618e = m13618e(sSLSocket);
        if (socketAdapterM13618e != null) {
            return socketAdapterM13618e.mo13611c(sSLSocket);
        }
        return null;
    }

    @Override // p509g1.p510j0.p519l.p520i.SocketAdapter
    /* JADX INFO: renamed from: d */
    public void mo13612d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        Intrinsics2.m13090f(sSLSocket, "sslSocket");
        Intrinsics2.m13090f(list, "protocols");
        SocketAdapter socketAdapterM13618e = m13618e(sSLSocket);
        if (socketAdapterM13618e != null) {
            socketAdapterM13618e.mo13612d(sSLSocket, str, list);
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized SocketAdapter m13618e(SSLSocket sSLSocket) {
        if (this.f30572a == null && this.f30573b.mo13616a(sSLSocket)) {
            this.f30572a = this.f30573b.mo13617b(sSLSocket);
        }
        return this.f30572a;
    }
}
