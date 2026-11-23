package p007c.p190n.p194b.p209b.p210a2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* JADX INFO: renamed from: c.n.b.b.a2.i0, reason: use source file name */
/* JADX INFO: compiled from: UdpDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class UdpDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e */
    public final int f6014e;

    /* JADX INFO: renamed from: f */
    public final byte[] f6015f;

    /* JADX INFO: renamed from: g */
    public final DatagramPacket f6016g;

    /* JADX INFO: renamed from: h */
    public Uri f6017h;

    /* JADX INFO: renamed from: i */
    public DatagramSocket f6018i;

    /* JADX INFO: renamed from: j */
    public MulticastSocket f6019j;

    /* JADX INFO: renamed from: k */
    public InetAddress f6020k;

    /* JADX INFO: renamed from: l */
    public InetSocketAddress f6021l;

    /* JADX INFO: renamed from: m */
    public boolean f6022m;

    /* JADX INFO: renamed from: n */
    public int f6023n;

    /* JADX INFO: renamed from: c.n.b.b.a2.i0$a */
    /* JADX INFO: compiled from: UdpDataSource.java */
    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    public void close() {
        this.f6017h = null;
        MulticastSocket multicastSocket = this.f6019j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f6020k);
            } catch (IOException unused) {
            }
            this.f6019j = null;
        }
        DatagramSocket datagramSocket = this.f6018i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f6018i = null;
        }
        this.f6020k = null;
        this.f6021l = null;
        this.f6023n = 0;
        if (this.f6022m) {
            this.f6022m = false;
            m2923r();
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: h */
    public long mo2913h(DataSpec dataSpec) throws a {
        Uri uri = dataSpec.f6137a;
        this.f6017h = uri;
        String host = uri.getHost();
        int port = this.f6017h.getPort();
        m2924s(dataSpec);
        try {
            this.f6020k = InetAddress.getByName(host);
            this.f6021l = new InetSocketAddress(this.f6020k, port);
            if (this.f6020k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f6021l);
                this.f6019j = multicastSocket;
                multicastSocket.joinGroup(this.f6020k);
                this.f6018i = this.f6019j;
            } else {
                this.f6018i = new DatagramSocket(this.f6021l);
            }
            try {
                this.f6018i.setSoTimeout(this.f6014e);
                this.f6022m = true;
                m2925t(dataSpec);
                return -1L;
            } catch (SocketException e) {
                throw new a(e);
            }
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: n */
    public Uri mo2914n() {
        return this.f6017h;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        if (this.f6023n == 0) {
            try {
                this.f6018i.receive(this.f6016g);
                int length = this.f6016g.getLength();
                this.f6023n = length;
                m2922q(length);
            } catch (IOException e) {
                throw new a(e);
            }
        }
        int length2 = this.f6016g.getLength();
        int i3 = this.f6023n;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f6015f, length2 - i3, bArr, i, iMin);
        this.f6023n -= iMin;
        return iMin;
    }

    public UdpDataSource(int i) {
        this(i, 8000);
    }

    public UdpDataSource(int i, int i2) {
        super(true);
        this.f6014e = i2;
        byte[] bArr = new byte[i];
        this.f6015f = bArr;
        this.f6016g = new DatagramPacket(bArr, 0, i);
    }
}
