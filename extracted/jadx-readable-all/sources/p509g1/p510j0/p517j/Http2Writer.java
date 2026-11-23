package p509g1.p510j0.p517j;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p524h1.Buffer3;
import p524h1.BufferedSink;

/* JADX INFO: renamed from: g1.j0.j.p, reason: use source file name */
/* JADX INFO: compiled from: Http2Writer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Http2Writer implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final Logger f30496f;

    /* JADX INFO: renamed from: g */
    public final Buffer3 f30497g;

    /* JADX INFO: renamed from: h */
    public int f30498h;

    /* JADX INFO: renamed from: i */
    public boolean f30499i;

    /* JADX INFO: renamed from: j */
    public final Hpack.b f30500j;

    /* JADX INFO: renamed from: k */
    public final BufferedSink f30501k;

    /* JADX INFO: renamed from: l */
    public final boolean f30502l;

    /* JADX INFO: renamed from: g1.j0.j.p$a */
    /* JADX INFO: compiled from: Http2Writer.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        f30496f = Logger.getLogger(Http2.class.getName());
    }

    public Http2Writer(BufferedSink bufferedSink, boolean z) {
        Intrinsics2.m13090f(bufferedSink, "sink");
        this.f30501k = bufferedSink;
        this.f30502l = z;
        Buffer3 buffer3 = new Buffer3();
        this.f30497g = buffer3;
        this.f30498h = 16384;
        this.f30500j = new Hpack.b(0, false, buffer3, 3, null);
    }

    /* JADX INFO: renamed from: B */
    public final synchronized void m13565B(boolean z, int i, int i2) throws IOException {
        if (this.f30499i) {
            throw new IOException("closed");
        }
        m13571f(0, 8, 6, z ? 1 : 0);
        this.f30501k.mo13753s(i);
        this.f30501k.mo13753s(i2);
        this.f30501k.flush();
    }

    /* JADX INFO: renamed from: D */
    public final synchronized void m13566D(int i, ErrorCode2 errorCode2) throws IOException {
        Intrinsics2.m13090f(errorCode2, "errorCode");
        if (this.f30499i) {
            throw new IOException("closed");
        }
        if (!(errorCode2.f30337n != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        m13571f(i, 4, 3, 0);
        this.f30501k.mo13753s(errorCode2.f30337n);
        this.f30501k.flush();
    }

    /* JADX INFO: renamed from: H */
    public final synchronized void m13567H(int i, long j2) throws IOException {
        if (this.f30499i) {
            throw new IOException("closed");
        }
        if (!(j2 != 0 && j2 <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        m13571f(i, 4, 8, 0);
        this.f30501k.mo13753s((int) j2);
        this.f30501k.flush();
    }

    /* JADX INFO: renamed from: O */
    public final void m13568O(int i, long j2) throws IOException {
        while (j2 > 0) {
            long jMin = Math.min(this.f30498h, j2);
            j2 -= jMin;
            m13571f(i, (int) jMin, 9, j2 == 0 ? 4 : 0);
            this.f30501k.mo13415U(this.f30497g, jMin);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m13569a(Settings2 settings2) throws IOException {
        Intrinsics2.m13090f(settings2, "peerSettings");
        if (this.f30499i) {
            throw new IOException("closed");
        }
        int i = this.f30498h;
        int i2 = settings2.f30511a;
        if ((i2 & 32) != 0) {
            i = settings2.f30512b[5];
        }
        this.f30498h = i;
        int i3 = i2 & 2;
        if ((i3 != 0 ? settings2.f30512b[1] : -1) != -1) {
            Hpack.b bVar = this.f30500j;
            int i4 = i3 != 0 ? settings2.f30512b[1] : -1;
            bVar.f30365h = i4;
            int iMin = Math.min(i4, 16384);
            int i5 = bVar.f30360c;
            if (i5 != iMin) {
                if (iMin < i5) {
                    bVar.f30358a = Math.min(bVar.f30358a, iMin);
                }
                bVar.f30359b = true;
                bVar.f30360c = iMin;
                int i6 = bVar.f30364g;
                if (iMin < i6) {
                    if (iMin == 0) {
                        bVar.m13515a();
                    } else {
                        bVar.m13516b(i6 - iMin);
                    }
                }
            }
        }
        m13571f(0, 0, 4, 1);
        this.f30501k.flush();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m13570c(boolean z, int i, Buffer3 buffer3, int i2) throws IOException {
        if (this.f30499i) {
            throw new IOException("closed");
        }
        m13571f(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            BufferedSink bufferedSink = this.f30501k;
            if (buffer3 == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            bufferedSink.mo13415U(buffer3, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f30499i = true;
        this.f30501k.close();
    }

    /* JADX INFO: renamed from: f */
    public final void m13571f(int i, int i2, int i3, int i4) throws IOException {
        Logger logger = f30496f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.f30372e.m13522b(false, i, i2, i3, i4));
        }
        if (!(i2 <= this.f30498h)) {
            StringBuilder sbM1556G = outline.m1556G("FRAME_SIZE_ERROR length > ");
            sbM1556G.append(this.f30498h);
            sbM1556G.append(": ");
            sbM1556G.append(i2);
            throw new IllegalArgumentException(sbM1556G.toString().toString());
        }
        if (!((((int) 2147483648L) & i) == 0)) {
            throw new IllegalArgumentException(outline.m1590l("reserved bit set: ", i).toString());
        }
        BufferedSink bufferedSink = this.f30501k;
        byte[] bArr = Util9.f30070a;
        Intrinsics2.m13090f(bufferedSink, "$this$writeMedium");
        bufferedSink.mo13761z((i2 >>> 16) & 255);
        bufferedSink.mo13761z((i2 >>> 8) & 255);
        bufferedSink.mo13761z(i2 & 255);
        this.f30501k.mo13761z(i3 & 255);
        this.f30501k.mo13761z(i4 & 255);
        this.f30501k.mo13753s(i & Integer.MAX_VALUE);
    }

    public final synchronized void flush() throws IOException {
        if (this.f30499i) {
            throw new IOException("closed");
        }
        this.f30501k.flush();
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m13572h(int i, ErrorCode2 errorCode2, byte[] bArr) throws IOException {
        Intrinsics2.m13090f(errorCode2, "errorCode");
        Intrinsics2.m13090f(bArr, "debugData");
        if (this.f30499i) {
            throw new IOException("closed");
        }
        if (!(errorCode2.f30337n != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        m13571f(0, bArr.length + 8, 7, 0);
        this.f30501k.mo13753s(i);
        this.f30501k.mo13753s(errorCode2.f30337n);
        if (!(bArr.length == 0)) {
            this.f30501k.mo13747l0(bArr);
        }
        this.f30501k.flush();
    }

    /* JADX INFO: renamed from: u */
    public final synchronized void m13573u(boolean z, int i, List<Header> list) throws IOException {
        Intrinsics2.m13090f(list, "headerBlock");
        if (this.f30499i) {
            throw new IOException("closed");
        }
        this.f30500j.m13519e(list);
        long j2 = this.f30497g.f30708g;
        long jMin = Math.min(this.f30498h, j2);
        int i2 = j2 == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        m13571f(i, (int) jMin, 1, i2);
        this.f30501k.mo13415U(this.f30497g, jMin);
        if (j2 > jMin) {
            m13568O(i, j2 - jMin);
        }
    }
}
