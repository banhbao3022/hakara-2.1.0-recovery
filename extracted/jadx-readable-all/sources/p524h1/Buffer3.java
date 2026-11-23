package p524h1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p481d0.Charsets2;
import p477d1.p483s._ArraysJvm;
import p477d1.p493x.p495c.Intrinsics2;
import p524h1.p525b0.Buffer2;
import p524h1.p525b0.ByteString2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: h1.f, reason: use source file name */
/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Buffer3 implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: f */
    public Segment f30707f;

    /* JADX INFO: renamed from: g */
    public long f30708g;

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: B0 */
    public long mo13709B0() throws EOFException {
        int i;
        if (this.f30708g == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j2 = 0;
        do {
            Segment segment = this.f30707f;
            if (segment == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            byte[] bArr = segment.f30742a;
            int i3 = segment.f30743b;
            int i4 = segment.f30744c;
            while (i3 < i4) {
                byte b = bArr[i3];
                byte b2 = (byte) 48;
                if (b < b2 || b > ((byte) 57)) {
                    byte b3 = (byte) 97;
                    if ((b < b3 || b > ((byte) 102)) && (b < (b3 = (byte) 65) || b > ((byte) 70))) {
                        if (i2 != 0) {
                            z = true;
                            break;
                        }
                        StringBuilder sbM1556G = outline.m1556G("Expected leading [0-9a-fA-F] character but was 0x");
                        sbM1556G.append(SkuDao.a.m14086f0(b));
                        throw new NumberFormatException(sbM1556G.toString());
                    }
                    i = (b - b3) + 10;
                } else {
                    i = b - b2;
                }
                if (((-1152921504606846976L) & j2) != 0) {
                    Buffer3 buffer3 = new Buffer3();
                    buffer3.mo13735W(j2);
                    buffer3.m13721J0(b);
                    StringBuilder sbM1556G2 = outline.m1556G("Number too large: ");
                    sbM1556G2.append(buffer3.m13755u0());
                    throw new NumberFormatException(sbM1556G2.toString());
                }
                j2 = (j2 << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f30707f = segment.m13786a();
                SegmentPool.m13790a(segment);
            } else {
                segment.f30743b = i3;
            }
            if (z) {
                break;
            }
        } while (this.f30707f != null);
        this.f30708g -= (long) i2;
        return j2;
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: C0 */
    public InputStream mo13710C0() {
        return new a();
    }

    /* JADX INFO: renamed from: D0 */
    public final ByteString3 m13711D0(int i) {
        if (i == 0) {
            return ByteString3.f30711f;
        }
        SkuDao.a.m14085f(this.f30708g, 0L, i);
        Segment segment = this.f30707f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (segment == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            int i5 = segment.f30744c;
            int i6 = segment.f30743b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            segment = segment.f30747f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        Segment segment2 = this.f30707f;
        int i7 = 0;
        while (i2 < i) {
            if (segment2 == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            bArr[i7] = segment2.f30742a;
            i2 += segment2.f30744c - segment2.f30743b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = segment2.f30743b;
            segment2.f30745d = true;
            i7++;
            segment2 = segment2.f30747f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: E */
    public long mo13712E(ByteString3 byteString3) {
        Intrinsics2.m13090f(byteString3, "targetBytes");
        return m13744g0(byteString3, 0L);
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: E0 */
    public int mo13713E0(Options2 options2) throws EOFException {
        Intrinsics2.m13090f(options2, "options");
        int iM13707b = Buffer2.m13707b(this, options2, false);
        if (iM13707b == -1) {
            return -1;
        }
        skip(options2.f30731h[iM13707b].mo13765j());
        return iM13707b;
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: F */
    public BufferedSink mo13714F() {
        return this;
    }

    /* JADX INFO: renamed from: F0 */
    public final Segment m13715F0(int i) {
        if (!(i >= 1 && i <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment = this.f30707f;
        if (segment == null) {
            Segment segmentM13791b = SegmentPool.m13791b();
            this.f30707f = segmentM13791b;
            segmentM13791b.f30748g = segmentM13791b;
            segmentM13791b.f30747f = segmentM13791b;
            return segmentM13791b;
        }
        if (segment == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        Segment segment2 = segment.f30748g;
        if (segment2 == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        if (segment2.f30744c + i <= 8192 && segment2.f30746e) {
            return segment2;
        }
        Segment segmentM13791b2 = SegmentPool.m13791b();
        segment2.m13787b(segmentM13791b2);
        return segmentM13791b2;
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: G */
    public long mo13716G() throws EOFException {
        long j2 = 0;
        if (this.f30708g == 0) {
            throw new EOFException();
        }
        long j3 = -7;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        do {
            Segment segment = this.f30707f;
            if (segment == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            byte[] bArr = segment.f30742a;
            int i2 = segment.f30743b;
            int i3 = segment.f30744c;
            while (i2 < i3) {
                byte b = bArr[i2];
                byte b2 = (byte) 48;
                if (b >= b2 && b <= ((byte) 57)) {
                    int i4 = b2 - b;
                    if (j2 < -922337203685477580L || (j2 == -922337203685477580L && i4 < j3)) {
                        Buffer3 buffer3 = new Buffer3();
                        buffer3.mo13760y0(j2);
                        buffer3.m13721J0(b);
                        if (!z) {
                            buffer3.readByte();
                        }
                        StringBuilder sbM1556G = outline.m1556G("Number too large: ");
                        sbM1556G.append(buffer3.m13755u0());
                        throw new NumberFormatException(sbM1556G.toString());
                    }
                    j2 = (j2 * 10) + ((long) i4);
                } else {
                    if (b != ((byte) 45) || i != 0) {
                        if (i != 0) {
                            z2 = true;
                            break;
                        }
                        StringBuilder sbM1556G2 = outline.m1556G("Expected leading [0-9] or '-' character but was 0x");
                        sbM1556G2.append(SkuDao.a.m14086f0(b));
                        throw new NumberFormatException(sbM1556G2.toString());
                    }
                    j3--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.f30707f = segment.m13786a();
                SegmentPool.m13790a(segment);
            } else {
                segment.f30743b = i2;
            }
            if (z2) {
                break;
            }
        } while (this.f30707f != null);
        this.f30708g -= (long) i;
        return z ? j2 : -j2;
    }

    /* JADX INFO: renamed from: G0 */
    public Buffer3 m13717G0(ByteString3 byteString3) {
        Intrinsics2.m13090f(byteString3, "byteString");
        byteString3.mo13773x(this, 0, byteString3.mo13765j());
        return this;
    }

    /* JADX INFO: renamed from: H0 */
    public Buffer3 m13718H0(byte[] bArr) {
        Intrinsics2.m13090f(bArr, "source");
        m13720I0(bArr, 0, bArr.length);
        return this;
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: I */
    public String mo13719I(long j2) throws EOFException {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(outline.m1594p("limit < 0: ", j2).toString());
        }
        long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
        byte b = (byte) 10;
        long jM13742f0 = m13742f0(b, 0L, j3);
        if (jM13742f0 != -1) {
            return Buffer2.m13706a(this, jM13742f0);
        }
        if (j3 < this.f30708g && m13740b0(j3 - 1) == ((byte) 13) && m13740b0(j3) == b) {
            return Buffer2.m13706a(this, j3);
        }
        Buffer3 buffer3 = new Buffer3();
        m13731R(buffer3, 0L, Math.min(32, this.f30708g));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f30708g, j2) + " content=" + buffer3.mo13736Y().mo13766l() + (char) 8230);
    }

    /* JADX INFO: renamed from: I0 */
    public Buffer3 m13720I0(byte[] bArr, int i, int i2) {
        Intrinsics2.m13090f(bArr, "source");
        long j2 = i2;
        SkuDao.a.m14085f(bArr.length, i, j2);
        int i3 = i2 + i;
        while (i < i3) {
            Segment segmentM13715F0 = m13715F0(1);
            int iMin = Math.min(i3 - i, 8192 - segmentM13715F0.f30744c);
            int i4 = i + iMin;
            _ArraysJvm.m13028b(bArr, segmentM13715F0.f30742a, segmentM13715F0.f30744c, i, i4);
            segmentM13715F0.f30744c += iMin;
            i = i4;
        }
        this.f30708g += j2;
        return this;
    }

    /* JADX INFO: renamed from: J0 */
    public Buffer3 m13721J0(int i) {
        Segment segmentM13715F0 = m13715F0(1);
        byte[] bArr = segmentM13715F0.f30742a;
        int i2 = segmentM13715F0.f30744c;
        segmentM13715F0.f30744c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f30708g++;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x009a  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00be  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00df  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5 A[LOOP:0: B:69:0x00f1->B:71:0x00f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0105  */
    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public Buffer3 mo13760y0(long j2) {
        byte[] bArr;
        int i;
        if (j2 == 0) {
            m13721J0(48);
        } else {
            boolean z = false;
            int i2 = 1;
            if (j2 < 0) {
                j2 = -j2;
                if (j2 < 0) {
                    m13729P0("-9223372036854775808");
                } else {
                    z = true;
                    if (j2 < 100000000) {
                        if (j2 < 10000) {
                            if (j2 < 100) {
                                if (j2 >= 10) {
                                    i2 = 2;
                                }
                            } else if (j2 < 1000) {
                                i2 = 3;
                            } else {
                                i2 = 4;
                            }
                        } else if (j2 < 1000000) {
                            if (j2 < 100000) {
                                i2 = 5;
                            } else {
                                i2 = 6;
                            }
                        } else if (j2 < 10000000) {
                            i2 = 7;
                        } else {
                            i2 = 8;
                        }
                    } else if (j2 < 1000000000000L) {
                        if (j2 < 10000000000L) {
                            if (j2 < 1000000000) {
                                i2 = 9;
                            } else {
                                i2 = 10;
                            }
                        } else if (j2 < 100000000000L) {
                            i2 = 11;
                        } else {
                            i2 = 12;
                        }
                    } else if (j2 < 1000000000000000L) {
                        if (j2 < 10000000000000L) {
                            i2 = 13;
                        } else if (j2 < 100000000000000L) {
                            i2 = 14;
                        } else {
                            i2 = 15;
                        }
                    } else if (j2 < 100000000000000000L) {
                        if (j2 < 10000000000000000L) {
                            i2 = 16;
                        } else {
                            i2 = 17;
                        }
                    } else if (j2 < 1000000000000000000L) {
                        i2 = 18;
                    } else {
                        i2 = 19;
                    }
                    if (z) {
                        i2++;
                    }
                    Segment segmentM13715F0 = m13715F0(i2);
                    bArr = segmentM13715F0.f30742a;
                    i = segmentM13715F0.f30744c + i2;
                    while (j2 != 0) {
                        long j3 = 10;
                        i--;
                        bArr[i] = Buffer2.f30701a[(int) (j2 % j3)];
                        j2 /= j3;
                    }
                    if (z) {
                        bArr[i - 1] = (byte) 45;
                    }
                    segmentM13715F0.f30744c += i2;
                    this.f30708g += (long) i2;
                }
            } else {
                if (j2 < 100000000) {
                    if (j2 < 10000) {
                        if (j2 < 100) {
                            if (j2 >= 10) {
                                i2 = 2;
                            }
                        } else if (j2 < 1000) {
                            i2 = 3;
                        } else {
                            i2 = 4;
                        }
                    } else if (j2 < 1000000) {
                        if (j2 < 100000) {
                            i2 = 5;
                        } else {
                            i2 = 6;
                        }
                    } else if (j2 < 10000000) {
                        i2 = 7;
                    } else {
                        i2 = 8;
                    }
                } else if (j2 < 1000000000000L) {
                    if (j2 < 10000000000L) {
                        if (j2 < 1000000000) {
                            i2 = 9;
                        } else {
                            i2 = 10;
                        }
                    } else if (j2 < 100000000000L) {
                        i2 = 11;
                    } else {
                        i2 = 12;
                    }
                } else if (j2 < 1000000000000000L) {
                    if (j2 < 10000000000000L) {
                        i2 = 13;
                    } else if (j2 < 100000000000000L) {
                        i2 = 14;
                    } else {
                        i2 = 15;
                    }
                } else if (j2 < 100000000000000000L) {
                    if (j2 < 10000000000000000L) {
                        i2 = 16;
                    } else {
                        i2 = 17;
                    }
                } else if (j2 < 1000000000000000000L) {
                    i2 = 18;
                } else {
                    i2 = 19;
                }
                if (z) {
                    i2++;
                }
                Segment segmentM13715F1 = m13715F0(i2);
                bArr = segmentM13715F1.f30742a;
                i = segmentM13715F1.f30744c + i2;
                while (j2 != 0) {
                    long j4 = 10;
                    i--;
                    bArr[i] = Buffer2.f30701a[(int) (j2 % j4)];
                    j2 /= j4;
                }
                if (z) {
                    bArr[i - 1] = (byte) 45;
                }
                segmentM13715F1.f30744c += i2;
                this.f30708g += (long) i2;
            }
        }
        return this;
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public Buffer3 mo13735W(long j2) {
        if (j2 == 0) {
            m13721J0(48);
        } else {
            long j3 = (j2 >>> 1) | j2;
            long j4 = j3 | (j3 >>> 2);
            long j5 = j4 | (j4 >>> 4);
            long j6 = j5 | (j5 >>> 8);
            long j7 = j6 | (j6 >>> 16);
            long j8 = j7 | (j7 >>> 32);
            long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
            long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
            long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
            long j12 = j11 + (j11 >>> 8);
            long j13 = j12 + (j12 >>> 16);
            int i = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            Segment segmentM13715F0 = m13715F0(i);
            byte[] bArr = segmentM13715F0.f30742a;
            int i2 = segmentM13715F0.f30744c;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                bArr[i3] = Buffer2.f30701a[(int) (15 & j2)];
                j2 >>>= 4;
            }
            segmentM13715F0.f30744c += i;
            this.f30708g += (long) i;
        }
        return this;
    }

    /* JADX INFO: renamed from: M0 */
    public Buffer3 m13724M0(int i) {
        Segment segmentM13715F0 = m13715F0(4);
        byte[] bArr = segmentM13715F0.f30742a;
        int i2 = segmentM13715F0.f30744c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        segmentM13715F0.f30744c = i5 + 1;
        this.f30708g += 4;
        return this;
    }

    /* JADX INFO: renamed from: N0 */
    public Buffer3 m13725N0(int i) {
        Segment segmentM13715F0 = m13715F0(2);
        byte[] bArr = segmentM13715F0.f30742a;
        int i2 = segmentM13715F0.f30744c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        segmentM13715F0.f30744c = i3 + 1;
        this.f30708g += 2;
        return this;
    }

    /* JADX INFO: renamed from: O */
    public final long m13726O() {
        long j2 = this.f30708g;
        if (j2 == 0) {
            return 0L;
        }
        Segment segment = this.f30707f;
        if (segment == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        Segment segment2 = segment.f30748g;
        if (segment2 == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        int i = segment2.f30744c;
        if (i < 8192 && segment2.f30746e) {
            j2 -= (long) (i - segment2.f30743b);
        }
        return j2;
    }

    /* JADX INFO: renamed from: O0 */
    public Buffer3 m13727O0(String str, int i, int i2, Charset charset) {
        Intrinsics2.m13090f(str, "string");
        Intrinsics2.m13090f(charset, "charset");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(outline.m1590l("beginIndex < 0: ", i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (!(i2 <= str.length())) {
            StringBuilder sbM1557H = outline.m1557H("endIndex > string.length: ", i2, " > ");
            sbM1557H.append(str.length());
            throw new IllegalArgumentException(sbM1557H.toString().toString());
        }
        if (Intrinsics2.m13085a(charset, Charsets2.f29452a)) {
            m13730Q0(str, i, i2);
            return this;
        }
        String strSubstring = str.substring(i, i2);
        Intrinsics2.m13086b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics2.m13086b(bytes, "(this as java.lang.String).getBytes(charset)");
        m13720I0(bytes, 0, bytes.length);
        return this;
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: P */
    public /* bridge */ /* synthetic */ BufferedSink mo13728P(String str) {
        m13729P0(str);
        return this;
    }

    /* JADX INFO: renamed from: P0 */
    public Buffer3 m13729P0(String str) {
        Intrinsics2.m13090f(str, "string");
        m13730Q0(str, 0, str.length());
        return this;
    }

    /* JADX INFO: renamed from: Q0 */
    public Buffer3 m13730Q0(String str, int i, int i2) {
        char cCharAt;
        Intrinsics2.m13090f(str, "string");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(outline.m1590l("beginIndex < 0: ", i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (!(i2 <= str.length())) {
            StringBuilder sbM1557H = outline.m1557H("endIndex > string.length: ", i2, " > ");
            sbM1557H.append(str.length());
            throw new IllegalArgumentException(sbM1557H.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                Segment segmentM13715F0 = m13715F0(1);
                byte[] bArr = segmentM13715F0.f30742a;
                int i3 = segmentM13715F0.f30744c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = segmentM13715F0.f30744c;
                int i6 = (i3 + i) - i5;
                segmentM13715F0.f30744c = i5 + i6;
                this.f30708g += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentM13715F1 = m13715F0(2);
                    byte[] bArr2 = segmentM13715F1.f30742a;
                    int i7 = segmentM13715F1.f30744c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentM13715F1.f30744c = i7 + 2;
                    this.f30708g += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentM13715F2 = m13715F0(3);
                    byte[] bArr3 = segmentM13715F2.f30742a;
                    int i8 = segmentM13715F2.f30744c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentM13715F2.f30744c = i8 + 3;
                    this.f30708g += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || 57343 < cCharAt3) {
                        m13721J0(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentM13715F3 = m13715F0(4);
                        byte[] bArr4 = segmentM13715F3.f30742a;
                        int i11 = segmentM13715F3.f30744c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        segmentM13715F3.f30744c = i11 + 4;
                        this.f30708g += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: R */
    public final Buffer3 m13731R(Buffer3 buffer3, long j2, long j3) {
        Intrinsics2.m13090f(buffer3, "out");
        SkuDao.a.m14085f(this.f30708g, j2, j3);
        if (j3 != 0) {
            buffer3.f30708g += j3;
            Segment segment = this.f30707f;
            while (segment != null) {
                int i = segment.f30744c;
                int i2 = segment.f30743b;
                if (j2 >= i - i2) {
                    j2 -= (long) (i - i2);
                    segment = segment.f30747f;
                } else {
                    while (j3 > 0) {
                        if (segment == null) {
                            Intrinsics2.m13095k();
                            throw null;
                        }
                        Segment segmentM13788c = segment.m13788c();
                        int i3 = segmentM13788c.f30743b + ((int) j2);
                        segmentM13788c.f30743b = i3;
                        segmentM13788c.f30744c = Math.min(i3 + ((int) j3), segmentM13788c.f30744c);
                        Segment segment2 = buffer3.f30707f;
                        if (segment2 == null) {
                            segmentM13788c.f30748g = segmentM13788c;
                            segmentM13788c.f30747f = segmentM13788c;
                            buffer3.f30707f = segmentM13788c;
                        } else {
                            if (segment2 == null) {
                                Intrinsics2.m13095k();
                                throw null;
                            }
                            Segment segment3 = segment2.f30748g;
                            if (segment3 == null) {
                                Intrinsics2.m13095k();
                                throw null;
                            }
                            segment3.m13787b(segmentM13788c);
                        }
                        j3 -= (long) (segmentM13788c.f30744c - segmentM13788c.f30743b);
                        segment = segment.f30747f;
                        j2 = 0;
                    }
                }
            }
            Intrinsics2.m13095k();
            throw null;
        }
        return this;
    }

    /* JADX INFO: renamed from: R0 */
    public Buffer3 m13732R0(int i) {
        String str;
        if (i < 128) {
            m13721J0(i);
        } else if (i < 2048) {
            Segment segmentM13715F0 = m13715F0(2);
            byte[] bArr = segmentM13715F0.f30742a;
            int i2 = segmentM13715F0.f30744c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            segmentM13715F0.f30744c = i2 + 2;
            this.f30708g += 2;
        } else if (55296 <= i && 57343 >= i) {
            m13721J0(63);
        } else if (i < 65536) {
            Segment segmentM13715F1 = m13715F0(3);
            byte[] bArr2 = segmentM13715F1.f30742a;
            int i3 = segmentM13715F1.f30744c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            segmentM13715F1.f30744c = i3 + 3;
            this.f30708g += 3;
        } else {
            if (i > 1114111) {
                StringBuilder sbM1556G = outline.m1556G("Unexpected code point: 0x");
                if (i != 0) {
                    char[] cArr = ByteString2.f30702a;
                    int i4 = 0;
                    char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
                    while (i4 < 8 && cArr2[i4] == '0') {
                        i4++;
                    }
                    str = new String(cArr2, i4, 8 - i4);
                } else {
                    str = "0";
                }
                sbM1556G.append(str);
                throw new IllegalArgumentException(sbM1556G.toString());
            }
            Segment segmentM13715F2 = m13715F0(4);
            byte[] bArr3 = segmentM13715F2.f30742a;
            int i5 = segmentM13715F2.f30744c;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i5 + 3] = (byte) ((i & 63) | 128);
            segmentM13715F2.f30744c = i5 + 4;
            this.f30708g += 4;
        }
        return this;
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: S */
    public String mo13733S(Charset charset) {
        Intrinsics2.m13090f(charset, "charset");
        return m13754t0(this.f30708g, charset);
    }

    @Override // p524h1.Sink
    /* JADX INFO: renamed from: U */
    public void mo13415U(Buffer3 buffer3, long j2) {
        Segment segment;
        Segment segmentM13791b;
        Intrinsics2.m13090f(buffer3, "source");
        if (!(buffer3 != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        SkuDao.a.m14085f(buffer3.f30708g, 0L, j2);
        long j3 = j2;
        while (j3 > 0) {
            Segment segment2 = buffer3.f30707f;
            if (segment2 == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            int i = segment2.f30744c;
            if (segment2 == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            if (j3 < i - segment2.f30743b) {
                Segment segment3 = this.f30707f;
                if (segment3 == null) {
                    segment = null;
                } else {
                    if (segment3 == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    segment = segment3.f30748g;
                }
                if (segment != null && segment.f30746e) {
                    if ((((long) segment.f30744c) + j3) - ((long) (segment.f30745d ? 0 : segment.f30743b)) <= 8192) {
                        if (segment2 == null) {
                            Intrinsics2.m13095k();
                            throw null;
                        }
                        segment2.m13789d(segment, (int) j3);
                        buffer3.f30708g -= j3;
                        this.f30708g += j3;
                        return;
                    }
                }
                if (segment2 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                int i2 = (int) j3;
                Objects.requireNonNull(segment2);
                if (!(i2 > 0 && i2 <= segment2.f30744c - segment2.f30743b)) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i2 >= 1024) {
                    segmentM13791b = segment2.m13788c();
                } else {
                    segmentM13791b = SegmentPool.m13791b();
                    byte[] bArr = segment2.f30742a;
                    byte[] bArr2 = segmentM13791b.f30742a;
                    int i3 = segment2.f30743b;
                    _ArraysJvm.m13029c(bArr, bArr2, 0, i3, i3 + i2, 2);
                }
                segmentM13791b.f30744c = segmentM13791b.f30743b + i2;
                segment2.f30743b += i2;
                Segment segment4 = segment2.f30748g;
                if (segment4 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                segment4.m13787b(segmentM13791b);
                buffer3.f30707f = segmentM13791b;
            }
            Segment segment5 = buffer3.f30707f;
            if (segment5 == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            long j4 = segment5.f30744c - segment5.f30743b;
            buffer3.f30707f = segment5.m13786a();
            Segment segment6 = this.f30707f;
            if (segment6 == null) {
                this.f30707f = segment5;
                segment5.f30748g = segment5;
                segment5.f30747f = segment5;
            } else {
                if (segment6 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                Segment segment7 = segment6.f30748g;
                if (segment7 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                segment7.m13787b(segment5);
                Segment segment8 = segment5.f30748g;
                if (!(segment8 != segment5)) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                if (segment8 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                if (segment8.f30746e) {
                    int i4 = segment5.f30744c - segment5.f30743b;
                    if (i4 <= (8192 - segment8.f30744c) + (segment8.f30745d ? 0 : segment8.f30743b)) {
                        segment5.m13789d(segment8, i4);
                        segment5.m13786a();
                        SegmentPool.m13790a(segment5);
                    }
                }
            }
            buffer3.f30708g -= j4;
            this.f30708g += j4;
            j3 -= j4;
        }
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: V */
    public long mo13734V(Source source) throws IOException {
        Intrinsics2.m13090f(source, "source");
        long j2 = 0;
        while (true) {
            long jMo13392p0 = source.mo13392p0(this, 8192);
            if (jMo13392p0 == -1) {
                return j2;
            }
            j2 += jMo13392p0;
        }
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: Y */
    public ByteString3 mo13736Y() {
        return mo13748m(this.f30708g);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Buffer3 clone() {
        Buffer3 buffer3 = new Buffer3();
        if (this.f30708g != 0) {
            Segment segment = this.f30707f;
            if (segment == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            Segment segmentM13788c = segment.m13788c();
            buffer3.f30707f = segmentM13788c;
            segmentM13788c.f30748g = segmentM13788c;
            segmentM13788c.f30747f = segmentM13788c;
            for (Segment segment2 = segment.f30747f; segment2 != segment; segment2 = segment2.f30747f) {
                Segment segment3 = segmentM13788c.f30748g;
                if (segment3 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                if (segment2 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                segment3.m13787b(segment2.m13788c());
            }
            buffer3.f30708g = this.f30708g;
        }
        return buffer3;
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: a0 */
    public boolean mo13738a0(long j2) {
        return this.f30708g >= j2;
    }

    @Override // p524h1.BufferedSource, p524h1.BufferedSink
    /* JADX INFO: renamed from: b */
    public Buffer3 mo13739b() {
        return this;
    }

    /* JADX INFO: renamed from: b0 */
    public final byte m13740b0(long j2) {
        SkuDao.a.m14085f(this.f30708g, j2, 1L);
        Segment segment = this.f30707f;
        if (segment == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        long j3 = this.f30708g;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                segment = segment.f30748g;
                if (segment == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                j3 -= (long) (segment.f30744c - segment.f30743b);
            }
            return segment.f30742a[(int) ((((long) segment.f30743b) + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int i = segment.f30744c;
            int i2 = segment.f30743b;
            long j5 = ((long) (i - i2)) + j4;
            if (j5 > j2) {
                return segment.f30742a[(int) ((((long) i2) + j2) - j4)];
            }
            segment = segment.f30747f;
            if (segment == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            j4 = j5;
        }
    }

    @Override // p524h1.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p524h1.Source
    /* JADX INFO: renamed from: d */
    public Timeout2 mo13391d() {
        return Timeout2.f30690a;
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: e0 */
    public String mo13741e0() throws EOFException {
        return mo13719I(Long.MAX_VALUE);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Buffer3) {
                long j2 = this.f30708g;
                Buffer3 buffer3 = (Buffer3) obj;
                if (j2 == buffer3.f30708g) {
                    if (j2 != 0) {
                        Segment segment = this.f30707f;
                        if (segment == null) {
                            Intrinsics2.m13095k();
                            throw null;
                        }
                        Segment segment2 = buffer3.f30707f;
                        if (segment2 == null) {
                            Intrinsics2.m13095k();
                            throw null;
                        }
                        int i = segment.f30743b;
                        int i2 = segment2.f30743b;
                        long j3 = 0;
                        while (j3 < this.f30708g) {
                            long jMin = Math.min(segment.f30744c - i, segment2.f30744c - i2);
                            long j4 = 0;
                            while (j4 < jMin) {
                                int i3 = i + 1;
                                int i4 = i2 + 1;
                                if (segment.f30742a[i] == segment2.f30742a[i2]) {
                                    j4++;
                                    i = i3;
                                    i2 = i4;
                                }
                            }
                            if (i == segment.f30744c) {
                                Segment segment3 = segment.f30747f;
                                if (segment3 == null) {
                                    Intrinsics2.m13095k();
                                    throw null;
                                }
                                i = segment3.f30743b;
                                segment = segment3;
                            }
                            if (i2 == segment2.f30744c) {
                                segment2 = segment2.f30747f;
                                if (segment2 == null) {
                                    Intrinsics2.m13095k();
                                    throw null;
                                }
                                i2 = segment2.f30743b;
                            }
                            j3 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f0 */
    public long m13742f0(byte b, long j2, long j3) {
        Segment segment;
        long j4 = 0;
        if (!(0 <= j2 && j3 >= j2)) {
            StringBuilder sbM1556G = outline.m1556G("size=");
            sbM1556G.append(this.f30708g);
            outline.m1570U(sbM1556G, " fromIndex=", j2, " toIndex=");
            sbM1556G.append(j3);
            throw new IllegalArgumentException(sbM1556G.toString().toString());
        }
        long j5 = this.f30708g;
        if (j3 > j5) {
            j3 = j5;
        }
        if (j2 != j3 && (segment = this.f30707f) != null) {
            if (j5 - j2 < j2) {
                while (j5 > j2) {
                    segment = segment.f30748g;
                    if (segment == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    j5 -= (long) (segment.f30744c - segment.f30743b);
                }
                while (j5 < j3) {
                    byte[] bArr = segment.f30742a;
                    int iMin = (int) Math.min(segment.f30744c, (((long) segment.f30743b) + j3) - j5);
                    for (int i = (int) ((((long) segment.f30743b) + j2) - j5); i < iMin; i++) {
                        if (bArr[i] == b) {
                            return ((long) (i - segment.f30743b)) + j5;
                        }
                    }
                    j5 += (long) (segment.f30744c - segment.f30743b);
                    segment = segment.f30747f;
                    if (segment == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    j2 = j5;
                }
            } else {
                while (true) {
                    long j6 = ((long) (segment.f30744c - segment.f30743b)) + j4;
                    if (j6 > j2) {
                        while (j4 < j3) {
                            byte[] bArr2 = segment.f30742a;
                            int iMin2 = (int) Math.min(segment.f30744c, (((long) segment.f30743b) + j3) - j4);
                            for (int i2 = (int) ((((long) segment.f30743b) + j2) - j4); i2 < iMin2; i2++) {
                                if (bArr2[i2] == b) {
                                    return ((long) (i2 - segment.f30743b)) + j4;
                                }
                            }
                            j4 += (long) (segment.f30744c - segment.f30743b);
                            segment = segment.f30747f;
                            if (segment == null) {
                                Intrinsics2.m13095k();
                                throw null;
                            }
                            j2 = j4;
                        }
                    } else {
                        segment = segment.f30747f;
                        if (segment == null) {
                            Intrinsics2.m13095k();
                            throw null;
                        }
                        j4 = j6;
                    }
                }
            }
        }
        return -1L;
    }

    @Override // p524h1.BufferedSink, p524h1.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ BufferedSink mo13743g(byte[] bArr, int i, int i2) {
        m13720I0(bArr, i, i2);
        return this;
    }

    /* JADX INFO: renamed from: g0 */
    public long m13744g0(ByteString3 byteString3, long j2) {
        int i;
        int i2;
        int i3;
        int i4;
        long j3 = j2;
        Intrinsics2.m13090f(byteString3, "targetBytes");
        long j4 = 0;
        if (!(j3 >= 0)) {
            throw new IllegalArgumentException(outline.m1594p("fromIndex < 0: ", j3).toString());
        }
        Segment segment = this.f30707f;
        if (segment == null) {
            return -1L;
        }
        long j5 = this.f30708g;
        if (j5 - j3 < j3) {
            while (j5 > j3) {
                segment = segment.f30748g;
                if (segment == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                j5 -= (long) (segment.f30744c - segment.f30743b);
            }
            if (byteString3.mo13765j() == 2) {
                byte bMo13768q = byteString3.mo13768q(0);
                byte bMo13768q2 = byteString3.mo13768q(1);
                while (j5 < this.f30708g) {
                    byte[] bArr = segment.f30742a;
                    i3 = (int) ((((long) segment.f30743b) + j3) - j5);
                    int i5 = segment.f30744c;
                    while (i3 < i5) {
                        byte b = bArr[i3];
                        if (b == bMo13768q || b == bMo13768q2) {
                            i4 = segment.f30743b;
                        } else {
                            i3++;
                        }
                    }
                    j5 += (long) (segment.f30744c - segment.f30743b);
                    segment = segment.f30747f;
                    if (segment == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    j3 = j5;
                }
                return -1L;
            }
            byte[] bArrMo13767m = byteString3.mo13767m();
            while (j5 < this.f30708g) {
                byte[] bArr2 = segment.f30742a;
                i3 = (int) ((((long) segment.f30743b) + j3) - j5);
                int i6 = segment.f30744c;
                while (i3 < i6) {
                    byte b2 = bArr2[i3];
                    for (byte b3 : bArrMo13767m) {
                        if (b2 == b3) {
                            i4 = segment.f30743b;
                        }
                    }
                    i3++;
                }
                j5 += (long) (segment.f30744c - segment.f30743b);
                segment = segment.f30747f;
                if (segment == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                j3 = j5;
            }
            return -1L;
            return ((long) (i3 - i4)) + j5;
        }
        while (true) {
            long j6 = ((long) (segment.f30744c - segment.f30743b)) + j4;
            if (j6 > j3) {
                if (byteString3.mo13765j() == 2) {
                    byte bMo13768q3 = byteString3.mo13768q(0);
                    byte bMo13768q4 = byteString3.mo13768q(1);
                    while (j4 < this.f30708g) {
                        byte[] bArr3 = segment.f30742a;
                        i = (int) ((((long) segment.f30743b) + j3) - j4);
                        int i7 = segment.f30744c;
                        while (i < i7) {
                            byte b4 = bArr3[i];
                            if (b4 == bMo13768q3 || b4 == bMo13768q4) {
                                i2 = segment.f30743b;
                            } else {
                                i++;
                            }
                        }
                        j4 += (long) (segment.f30744c - segment.f30743b);
                        segment = segment.f30747f;
                        if (segment == null) {
                            Intrinsics2.m13095k();
                            throw null;
                        }
                        j3 = j4;
                    }
                    return -1L;
                }
                byte[] bArrMo13767m2 = byteString3.mo13767m();
                while (j4 < this.f30708g) {
                    byte[] bArr4 = segment.f30742a;
                    i = (int) ((((long) segment.f30743b) + j3) - j4);
                    int i8 = segment.f30744c;
                    while (i < i8) {
                        byte b5 = bArr4[i];
                        for (byte b6 : bArrMo13767m2) {
                            if (b5 == b6) {
                                i2 = segment.f30743b;
                            }
                        }
                        i++;
                    }
                    j4 += (long) (segment.f30744c - segment.f30743b);
                    segment = segment.f30747f;
                    if (segment == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    j3 = j4;
                }
                return -1L;
                return ((long) (i - i2)) + j4;
            }
            segment = segment.f30747f;
            if (segment == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            j4 = j6;
        }
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: h0 */
    public byte[] mo13745h0(long j2) throws EOFException {
        int i = 0;
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(outline.m1594p("byteCount: ", j2).toString());
        }
        if (this.f30708g < j2) {
            throw new EOFException();
        }
        int i2 = (int) j2;
        byte[] bArr = new byte[i2];
        Intrinsics2.m13090f(bArr, "sink");
        while (i < i2) {
            int i3 = read(bArr, i, i2 - i);
            if (i3 == -1) {
                throw new EOFException();
            }
            i += i3;
        }
        return bArr;
    }

    public int hashCode() {
        Segment segment = this.f30707f;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.f30744c;
            for (int i3 = segment.f30743b; i3 < i2; i3++) {
                i = (i * 31) + segment.f30742a[i3];
            }
            segment = segment.f30747f;
            if (segment == null) {
                Intrinsics2.m13095k();
                throw null;
            }
        } while (segment != this.f30707f);
        return i;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: l */
    public Buffer3 mo13746l() {
        return this;
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: l0 */
    public /* bridge */ /* synthetic */ BufferedSink mo13747l0(byte[] bArr) {
        m13718H0(bArr);
        return this;
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: m */
    public ByteString3 mo13748m(long j2) throws EOFException {
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(outline.m1594p("byteCount: ", j2).toString());
        }
        if (this.f30708g < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new ByteString3(mo13745h0(j2));
        }
        ByteString3 byteString3M13711D0 = m13711D0((int) j2);
        skip(j2);
        return byteString3M13711D0;
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: m0 */
    public /* bridge */ /* synthetic */ BufferedSink mo13749m0(ByteString3 byteString3) {
        m13717G0(byteString3);
        return this;
    }

    /* JADX INFO: renamed from: n0 */
    public short m13750n0() throws EOFException {
        int i = readShort() & 65535;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: p */
    public /* bridge */ /* synthetic */ BufferedSink mo13751p(int i) {
        m13725N0(i);
        return this;
    }

    @Override // p524h1.Source
    /* JADX INFO: renamed from: p0 */
    public long mo13392p0(Buffer3 buffer3, long j2) {
        Intrinsics2.m13090f(buffer3, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(outline.m1594p("byteCount < 0: ", j2).toString());
        }
        long j3 = this.f30708g;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        buffer3.mo13415U(this, j2);
        return j2;
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: r0 */
    public long mo13752r0(Sink sink) throws IOException {
        Intrinsics2.m13090f(sink, "sink");
        long j2 = this.f30708g;
        if (j2 > 0) {
            ((Buffer3) sink).mo13415U(this, j2);
        }
        return j2;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        Intrinsics2.m13090f(byteBuffer, "sink");
        Segment segment = this.f30707f;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), segment.f30744c - segment.f30743b);
        byteBuffer.put(segment.f30742a, segment.f30743b, iMin);
        int i = segment.f30743b + iMin;
        segment.f30743b = i;
        this.f30708g -= (long) iMin;
        if (i == segment.f30744c) {
            this.f30707f = segment.m13786a();
            SegmentPool.m13790a(segment);
        }
        return iMin;
    }

    @Override // p524h1.BufferedSource
    public byte readByte() throws EOFException {
        long j2 = this.f30708g;
        if (j2 == 0) {
            throw new EOFException();
        }
        Segment segment = this.f30707f;
        if (segment == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        int i = segment.f30743b;
        int i2 = segment.f30744c;
        int i3 = i + 1;
        byte b = segment.f30742a[i];
        this.f30708g = j2 - 1;
        if (i3 == i2) {
            this.f30707f = segment.m13786a();
            SegmentPool.m13790a(segment);
        } else {
            segment.f30743b = i3;
        }
        return b;
    }

    @Override // p524h1.BufferedSource
    public int readInt() throws EOFException {
        long j2 = this.f30708g;
        if (j2 < 4) {
            throw new EOFException();
        }
        Segment segment = this.f30707f;
        if (segment == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        int i = segment.f30743b;
        int i2 = segment.f30744c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = segment.f30742a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.f30708g = j2 - 4;
        if (i8 == i2) {
            this.f30707f = segment.m13786a();
            SegmentPool.m13790a(segment);
        } else {
            segment.f30743b = i8;
        }
        return i9;
    }

    @Override // p524h1.BufferedSource
    public short readShort() throws EOFException {
        long j2 = this.f30708g;
        if (j2 < 2) {
            throw new EOFException();
        }
        Segment segment = this.f30707f;
        if (segment == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        int i = segment.f30743b;
        int i2 = segment.f30744c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = segment.f30742a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.f30708g = j2 - 2;
        if (i4 == i2) {
            this.f30707f = segment.m13786a();
            SegmentPool.m13790a(segment);
        } else {
            segment.f30743b = i4;
        }
        return (short) i5;
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ BufferedSink mo13753s(int i) {
        m13724M0(i);
        return this;
    }

    @Override // p524h1.BufferedSource
    public void skip(long j2) throws EOFException {
        while (j2 > 0) {
            Segment segment = this.f30707f;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j2, segment.f30744c - segment.f30743b);
            long j3 = iMin;
            this.f30708g -= j3;
            j2 -= j3;
            int i = segment.f30743b + iMin;
            segment.f30743b = i;
            if (i == segment.f30744c) {
                this.f30707f = segment.m13786a();
                SegmentPool.m13790a(segment);
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public String m13754t0(long j2, Charset charset) throws EOFException {
        Intrinsics2.m13090f(charset, "charset");
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(outline.m1594p("byteCount: ", j2).toString());
        }
        if (this.f30708g < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        Segment segment = this.f30707f;
        if (segment == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        int i = segment.f30743b;
        if (((long) i) + j2 > segment.f30744c) {
            return new String(mo13745h0(j2), charset);
        }
        int i2 = (int) j2;
        String str = new String(segment.f30742a, i, i2, charset);
        int i3 = segment.f30743b + i2;
        segment.f30743b = i3;
        this.f30708g -= j2;
        if (i3 == segment.f30744c) {
            this.f30707f = segment.m13786a();
            SegmentPool.m13790a(segment);
        }
        return str;
    }

    public String toString() {
        long j2 = this.f30708g;
        if (j2 <= ((long) Integer.MAX_VALUE)) {
            return m13711D0((int) j2).toString();
        }
        StringBuilder sbM1556G = outline.m1556G("size > Int.MAX_VALUE: ");
        sbM1556G.append(this.f30708g);
        throw new IllegalStateException(sbM1556G.toString().toString());
    }

    /* JADX INFO: renamed from: u0 */
    public String m13755u0() {
        return m13754t0(this.f30708g, Charsets2.f29452a);
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: w */
    public byte[] mo13756w() {
        return mo13745h0(this.f30708g);
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: w0 */
    public void mo13757w0(long j2) throws EOFException {
        if (this.f30708g < j2) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        Intrinsics2.m13090f(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            Segment segmentM13715F0 = m13715F0(1);
            int iMin = Math.min(i, 8192 - segmentM13715F0.f30744c);
            byteBuffer.get(segmentM13715F0.f30742a, segmentM13715F0.f30744c, iMin);
            i -= iMin;
            segmentM13715F0.f30744c += iMin;
        }
        this.f30708g += (long) iRemaining;
        return iRemaining;
    }

    /* JADX INFO: renamed from: x0 */
    public String m13758x0(long j2) throws EOFException {
        return m13754t0(j2, Charsets2.f29452a);
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: y */
    public boolean mo13759y() {
        return this.f30708g == 0;
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: z */
    public /* bridge */ /* synthetic */ BufferedSink mo13761z(int i) {
        m13721J0(i);
        return this;
    }

    /* JADX INFO: renamed from: z0 */
    public int m13762z0() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.f30708g == 0) {
            throw new EOFException();
        }
        byte bM13740b0 = m13740b0(0L);
        if ((bM13740b0 & 128) == 0) {
            i = bM13740b0 & 127;
            i2 = 1;
            i3 = 0;
        } else if ((bM13740b0 & 224) == 192) {
            i = bM13740b0 & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bM13740b0 & 240) == 224) {
            i = bM13740b0 & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bM13740b0 & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bM13740b0 & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j2 = i2;
        if (this.f30708g < j2) {
            StringBuilder sbM1557H = outline.m1557H("size < ", i2, ": ");
            sbM1557H.append(this.f30708g);
            sbM1557H.append(" (to read code point prefixed 0x");
            sbM1557H.append(SkuDao.a.m14086f0(bM13740b0));
            sbM1557H.append(')');
            throw new EOFException(sbM1557H.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j3 = i4;
            byte bM13740b1 = m13740b0(j3);
            if ((bM13740b1 & 192) != 128) {
                skip(j3);
                return 65533;
            }
            i = (i << 6) | (bM13740b1 & 63);
        }
        skip(j2);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 <= i && 57343 >= i) || i < i3) {
            return 65533;
        }
        return i;
    }

    /* JADX INFO: renamed from: h1.f$a */
    /* JADX INFO: compiled from: Buffer.kt */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(Buffer3.this.f30708g, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            Buffer3 buffer3 = Buffer3.this;
            if (buffer3.f30708g > 0) {
                return buffer3.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return Buffer3.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            Intrinsics2.m13090f(bArr, "sink");
            return Buffer3.this.read(bArr, i, i2);
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        Intrinsics2.m13090f(bArr, "sink");
        SkuDao.a.m14085f(bArr.length, i, i2);
        Segment segment = this.f30707f;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i2, segment.f30744c - segment.f30743b);
        byte[] bArr2 = segment.f30742a;
        int i3 = segment.f30743b;
        _ArraysJvm.m13028b(bArr2, bArr, i, i3, i3 + iMin);
        int i4 = segment.f30743b + iMin;
        segment.f30743b = i4;
        this.f30708g -= (long) iMin;
        if (i4 != segment.f30744c) {
            return iMin;
        }
        this.f30707f = segment.m13786a();
        SegmentPool.m13790a(segment);
        return iMin;
    }
}
