package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: c.n.b.d.j.a.oq */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3371oq extends SSLSocketFactory {

    /* JADX INFO: renamed from: a */
    public final SSLSocketFactory f17720a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3408pq f17721b;

    public C3371oq(C3408pq c3408pq) {
        this.f17721b = c3408pq;
    }

    /* JADX INFO: renamed from: a */
    public final Socket m8052a(Socket socket) throws SocketException {
        int i = this.f17721b.f18069q;
        if (i > 0) {
            socket.setReceiveBufferSize(i);
        }
        this.f17721b.f18070r.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f17720a.createSocket(str, i);
        m8052a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f17720a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f17720a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.f17720a.createSocket(str, i, inetAddress, i2);
        m8052a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.f17720a.createSocket(inetAddress, i);
        m8052a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.f17720a.createSocket(inetAddress, i, inetAddress2, i2);
        m8052a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.f17720a.createSocket(socket, str, i, z);
        m8052a(socketCreateSocket);
        return socketCreateSocket;
    }
}
