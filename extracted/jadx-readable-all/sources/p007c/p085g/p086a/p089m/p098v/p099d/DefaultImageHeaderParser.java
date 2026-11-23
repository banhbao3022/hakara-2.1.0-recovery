package p007c.p085g.p086a.p089m.p098v.p099d;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.facebook.stetho.common.Utf8Charset;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;

/* JADX INFO: renamed from: c.g.a.m.v.d.l, reason: use source file name */
/* JADX INFO: compiled from: DefaultImageHeaderParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* JADX INFO: renamed from: a */
    public static final byte[] f3547a = "Exif\u0000\u0000".getBytes(Charset.forName(Utf8Charset.NAME));

    /* JADX INFO: renamed from: b */
    public static final int[] f3548b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: c.g.a.m.v.d.l$a */
    /* JADX INFO: compiled from: DefaultImageHeaderParser.java */
    public static final class a implements c {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f3549a;

        public a(ByteBuffer byteBuffer) {
            this.f3549a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DefaultImageHeaderParser.c
        /* JADX INFO: renamed from: a */
        public int mo1889a() throws c.a {
            return (mo1891c() << 8) | mo1891c();
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DefaultImageHeaderParser.c
        /* JADX INFO: renamed from: b */
        public int mo1890b(byte[] bArr, int i) {
            int iMin = Math.min(i, this.f3549a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f3549a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DefaultImageHeaderParser.c
        /* JADX INFO: renamed from: c */
        public short mo1891c() throws c.a {
            if (this.f3549a.remaining() >= 1) {
                return (short) (this.f3549a.get() & 255);
            }
            throw new c.a();
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DefaultImageHeaderParser.c
        public long skip(long j2) {
            int iMin = (int) Math.min(this.f3549a.remaining(), j2);
            ByteBuffer byteBuffer = this.f3549a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.v.d.l$b */
    /* JADX INFO: compiled from: DefaultImageHeaderParser.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f3550a;

        public b(byte[] bArr, int i) {
            this.f3550a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* JADX INFO: renamed from: a */
        public short m1892a(int i) {
            if (this.f3550a.remaining() - i >= 2) {
                return this.f3550a.getShort(i);
            }
            return (short) -1;
        }

        /* JADX INFO: renamed from: b */
        public int m1893b(int i) {
            if (this.f3550a.remaining() - i >= 4) {
                return this.f3550a.getInt(i);
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.v.d.l$c */
    /* JADX INFO: compiled from: DefaultImageHeaderParser.java */
    public interface c {

        /* JADX INFO: renamed from: c.g.a.m.v.d.l$c$a */
        /* JADX INFO: compiled from: DefaultImageHeaderParser.java */
        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* JADX INFO: renamed from: a */
        int mo1889a() throws IOException;

        /* JADX INFO: renamed from: b */
        int mo1890b(byte[] bArr, int i) throws IOException;

        /* JADX INFO: renamed from: c */
        short mo1891c() throws IOException;

        long skip(long j2) throws IOException;
    }

    /* JADX INFO: renamed from: c.g.a.m.v.d.l$d */
    /* JADX INFO: compiled from: DefaultImageHeaderParser.java */
    public static final class d implements c {

        /* JADX INFO: renamed from: a */
        public final InputStream f3551a;

        public d(InputStream inputStream) {
            this.f3551a = inputStream;
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DefaultImageHeaderParser.c
        /* JADX INFO: renamed from: a */
        public int mo1889a() throws IOException {
            return (mo1891c() << 8) | mo1891c();
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DefaultImageHeaderParser.c
        /* JADX INFO: renamed from: b */
        public int mo1890b(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f3551a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new c.a();
            }
            return i2;
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DefaultImageHeaderParser.c
        /* JADX INFO: renamed from: c */
        public short mo1891c() throws IOException {
            int i = this.f3551a.read();
            if (i != -1) {
                return (short) i;
            }
            throw new c.a();
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DefaultImageHeaderParser.c
        public long skip(long j2) throws IOException {
            if (j2 < 0) {
                return 0L;
            }
            long j3 = j2;
            while (j3 > 0) {
                long jSkip = this.f3551a.skip(j3);
                if (jSkip <= 0) {
                    if (this.f3551a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j3 -= jSkip;
            }
            return j2 - j3;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo1883a(ByteBuffer byteBuffer) throws IOException {
        Objects.requireNonNull(byteBuffer, "Argument must not be null");
        return m1886d(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: b */
    public ImageHeaderParser.ImageType mo1884b(InputStream inputStream) throws IOException {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        return m1886d(new d(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: c */
    public int mo1885c(InputStream inputStream, ArrayPool arrayPool) throws IOException {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        d dVar = new d(inputStream);
        Objects.requireNonNull(arrayPool, "Argument must not be null");
        try {
            int iMo1889a = dVar.mo1889a();
            if (!((iMo1889a & 65496) == 65496 || iMo1889a == 19789 || iMo1889a == 18761)) {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo1889a);
                return -1;
            }
            int iM1887e = m1887e(dVar);
            if (iM1887e == -1) {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                return -1;
            }
            byte[] bArr = (byte[]) arrayPool.mo1745e(iM1887e, byte[].class);
            try {
                return m1888f(dVar, bArr, iM1887e);
            } finally {
                arrayPool.mo1744d(bArr);
            }
        } catch (c.a unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public final ImageHeaderParser.ImageType m1886d(c cVar) throws IOException {
        try {
            int iMo1889a = cVar.mo1889a();
            if (iMo1889a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iMo1891c = (iMo1889a << 8) | cVar.mo1891c();
            if (iMo1891c == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iMo1891c2 = (iMo1891c << 8) | cVar.mo1891c();
            if (iMo1891c2 == -1991225785) {
                cVar.skip(21L);
                try {
                    return cVar.mo1891c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iMo1891c2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            cVar.skip(4L);
            if (((cVar.mo1889a() << 16) | cVar.mo1889a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iMo1889a2 = (cVar.mo1889a() << 16) | cVar.mo1889a();
            if ((iMo1889a2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i = iMo1889a2 & 255;
            if (i == 88) {
                cVar.skip(4L);
                return (cVar.mo1891c() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            cVar.skip(4L);
            return (cVar.mo1891c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m1887e(c cVar) throws IOException {
        short sMo1891c;
        int iMo1889a;
        long j2;
        long jSkip;
        do {
            short sMo1891c2 = cVar.mo1891c();
            if (sMo1891c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sMo1891c2));
                }
                return -1;
            }
            sMo1891c = cVar.mo1891c();
            if (sMo1891c == 218) {
                return -1;
            }
            if (sMo1891c == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iMo1889a = cVar.mo1889a() - 2;
            if (sMo1891c == 225) {
                return iMo1889a;
            }
            j2 = iMo1889a;
            jSkip = cVar.skip(j2);
        } while (jSkip == j2);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sbM1559J = outline.m1559J("Unable to skip enough data, type: ", sMo1891c, ", wanted to skip: ", iMo1889a, ", but actually skipped: ");
            sbM1559J.append(jSkip);
            Log.d("DfltImageHeaderParser", sbM1559J.toString());
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final int m1888f(c cVar, byte[] bArr, int i) throws IOException {
        ByteOrder byteOrder;
        int iMo1890b = cVar.mo1890b(bArr, i);
        if (iMo1890b != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iMo1890b);
            }
            return -1;
        }
        boolean z = bArr != null && i > f3547a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f3547a;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
        }
        if (!z) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        b bVar = new b(bArr, i);
        short sM1892a = bVar.m1892a(6);
        if (sM1892a != 18761) {
            if (sM1892a != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sM1892a));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.f3550a.order(byteOrder);
        int iM1893b = bVar.m1893b(10) + 6;
        short sM1892a2 = bVar.m1892a(iM1893b);
        for (int i3 = 0; i3 < sM1892a2; i3++) {
            int i4 = (i3 * 12) + iM1893b + 2;
            short sM1892a3 = bVar.m1892a(i4);
            if (sM1892a3 == 274) {
                short sM1892a4 = bVar.m1892a(i4 + 2);
                if (sM1892a4 >= 1 && sM1892a4 <= 12) {
                    int iM1893b2 = bVar.m1893b(i4 + 4);
                    if (iM1893b2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sbM1559J = outline.m1559J("Got tagIndex=", i3, " tagType=", sM1892a3, " formatCode=");
                            sbM1559J.append((int) sM1892a4);
                            sbM1559J.append(" componentCount=");
                            sbM1559J.append(iM1893b2);
                            Log.d("DfltImageHeaderParser", sbM1559J.toString());
                        }
                        int i5 = iM1893b2 + f3548b[sM1892a4];
                        if (i5 <= 4) {
                            int i6 = i4 + 8;
                            if (i6 >= 0 && i6 <= bVar.f3550a.remaining()) {
                                if (i5 >= 0 && i5 + i6 <= bVar.f3550a.remaining()) {
                                    return bVar.m1892a(i6);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) sM1892a3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i6 + " tagType=" + ((int) sM1892a3));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sM1892a4));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) sM1892a4));
                }
            }
        }
        return -1;
    }
}
