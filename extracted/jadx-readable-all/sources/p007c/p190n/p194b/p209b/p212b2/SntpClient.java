package p007c.p190n.p194b.p209b.p212b2;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p210a2.Loader;

/* JADX INFO: renamed from: c.n.b.b.b2.b0, reason: use source file name */
/* JADX INFO: compiled from: SntpClient.java */
/* JADX INFO: loaded from: classes.dex */
public final class SntpClient {

    /* JADX INFO: renamed from: a */
    public static final Object f6278a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Object f6279b = new Object();

    /* JADX INFO: renamed from: c */
    public static boolean f6280c;

    /* JADX INFO: renamed from: d */
    public static long f6281d;

    /* JADX INFO: renamed from: c.n.b.b.b2.b0$b */
    /* JADX INFO: compiled from: SntpClient.java */
    public interface b {
    }

    /* JADX INFO: renamed from: c.n.b.b.b2.b0$c */
    /* JADX INFO: compiled from: SntpClient.java */
    public static final class c implements Loader.b<Loader.e> {

        /* JADX INFO: renamed from: f */
        public final b f6282f;

        public c(b bVar) {
            this.f6282f = bVar;
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
        /* JADX INFO: renamed from: k */
        public void mo2903k(Loader.e eVar, long j2, long j3, boolean z) {
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
        /* JADX INFO: renamed from: l */
        public void mo2904l(Loader.e eVar, long j2, long j3) {
            boolean z;
            if (this.f6282f != null) {
                synchronized (SntpClient.f6279b) {
                    z = SntpClient.f6280c;
                }
                if (z) {
                    ((DashMediaSource.C5872a) this.f6282f).m12627a();
                    return;
                }
                b bVar = this.f6282f;
                DashMediaSource.this.m12619A(new IOException(new ConcurrentModificationException()));
            }
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
        /* JADX INFO: renamed from: t */
        public Loader.c mo2905t(Loader.e eVar, long j2, long j3, IOException iOException, int i) {
            b bVar = this.f6282f;
            if (bVar != null) {
                DashMediaSource.this.m12619A(iOException);
            }
            return Loader.f5958b;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.b2.b0$d */
    /* JADX INFO: compiled from: SntpClient.java */
    public static final class d implements Loader.e {
        public d(a aVar) {
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.Loader.e
        /* JADX INFO: renamed from: a */
        public void mo2909a() throws IOException {
            Object obj = SntpClient.f6278a;
            synchronized (SntpClient.f6278a) {
                Object obj2 = SntpClient.f6279b;
                synchronized (obj2) {
                    try {
                        if (SntpClient.f6280c) {
                            return;
                        }
                        long jM3059a = SntpClient.m3059a();
                        synchronized (obj2) {
                            SntpClient.f6281d = jM3059a;
                            SntpClient.f6280c = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.Loader.e
        /* JADX INFO: renamed from: b */
        public void mo2910b() {
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m3059a() throws IOException {
        DatagramSocket datagramSocket;
        synchronized (f6279b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                datagramSocket = datagramSocket2;
            } else {
                long j2 = jCurrentTimeMillis / 1000;
                Long.signum(j2);
                long j3 = jCurrentTimeMillis - (j2 * 1000);
                long j4 = j2 + 2208988800L;
                bArr[40] = (byte) (j4 >> 24);
                datagramSocket = datagramSocket2;
                try {
                    bArr[41] = (byte) (j4 >> 16);
                    bArr[42] = (byte) (j4 >> 8);
                    bArr[43] = (byte) (j4 >> 0);
                    long j5 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j5 >> 24);
                    bArr[45] = (byte) (j5 >> 16);
                    bArr[46] = (byte) (j5 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th) {
                    th = th;
                    datagramSocket2 = datagramSocket;
                    Throwable th2 = th;
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            datagramSocket2.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
            }
            datagramSocket2 = datagramSocket;
            datagramSocket2.send(datagramPacket);
            datagramSocket2.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j6 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
            byte b2 = (byte) ((bArr[0] >> 6) & 3);
            byte b3 = (byte) (bArr[0] & 7);
            int i = bArr[1] & 255;
            long jM3062d = m3062d(bArr, 24);
            long jM3062d2 = m3062d(bArr, 32);
            long jM3062d3 = m3062d(bArr, 40);
            m3060b(b2, b3, i, jM3062d3);
            long j7 = (j6 + (((jM3062d3 - j6) + (jM3062d2 - jM3062d)) / 2)) - jElapsedRealtime2;
            datagramSocket2.close();
            return j7;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3060b(byte b2, byte b3, int i, long j2) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            throw new IOException(outline.m1590l("SNTP: Untrusted mode: ", b3));
        }
        if (i == 0 || i > 15) {
            throw new IOException(outline.m1590l("SNTP: Untrusted stratum: ", i));
        }
        if (j2 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m3061c(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    /* JADX INFO: renamed from: d */
    public static long m3062d(byte[] bArr, int i) {
        long jM3061c = m3061c(bArr, i);
        long jM3061c2 = m3061c(bArr, i + 4);
        if (jM3061c == 0 && jM3061c2 == 0) {
            return 0L;
        }
        return ((jM3061c2 * 1000) / 4294967296L) + ((jM3061c - 2208988800L) * 1000);
    }
}
