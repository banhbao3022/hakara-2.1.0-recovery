package p007c.p190n.p194b.p209b.p234u1.p239m;

import android.util.Log;
import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.MetadataInputBuffer;
import p007c.p190n.p194b.p209b.p234u1.SimpleMetadataDecoder;

/* JADX INFO: renamed from: c.n.b.b.u1.m.h, reason: use source file name */
/* JADX INFO: compiled from: Id3Decoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f8734a = 0;

    /* JADX INFO: renamed from: b */
    public final a f8735b;

    /* JADX INFO: renamed from: c.n.b.b.u1.m.h$a */
    /* JADX INFO: compiled from: Id3Decoder.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo3796a(int i, int i2, int i3, int i4, int i5);
    }

    /* JADX INFO: renamed from: c.n.b.b.u1.m.h$b */
    /* JADX INFO: compiled from: Id3Decoder.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f8736a;

        /* JADX INFO: renamed from: b */
        public final boolean f8737b;

        /* JADX INFO: renamed from: c */
        public final int f8738c;

        public b(int i, boolean z, int i2) {
            this.f8736a = i;
            this.f8737b = z;
            this.f8738c = i2;
        }
    }

    public Id3Decoder() {
        this(null);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m4023c(byte[] bArr, int i, int i2) {
        return i2 <= i ? Util6.f6312f : Arrays.copyOfRange(bArr, i, i2);
    }

    /* JADX INFO: renamed from: e */
    public static ApicFrame m4024e(ParsableByteArray parsableByteArray, int i, int i2) throws UnsupportedEncodingException {
        int i3;
        String strM1599u;
        int iM3214s = parsableByteArray.m3214s();
        String strM4039t = m4039t(iM3214s);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, 0, i4);
        parsableByteArray.f6393b += i4;
        if (i2 == 2) {
            StringBuilder sbM1556G = outline.m1556G("image/");
            sbM1556G.append(Util6.m3111T(new String(bArr, 0, 3, "ISO-8859-1")));
            strM1599u = sbM1556G.toString();
            if ("image/jpg".equals(strM1599u)) {
                strM1599u = "image/jpeg";
            }
            i3 = 2;
        } else {
            int iM4042w = m4042w(bArr, 0);
            String strM3111T = Util6.m3111T(new String(bArr, 0, iM4042w, "ISO-8859-1"));
            if (strM3111T.indexOf(47) == -1) {
                i3 = iM4042w;
                strM1599u = outline.m1599u("image/", strM3111T);
            } else {
                i3 = iM4042w;
                strM1599u = strM3111T;
            }
        }
        int i5 = bArr[i3 + 1] & 255;
        int i6 = i3 + 2;
        int iM4041v = m4041v(bArr, i6, iM3214s);
        return new ApicFrame(strM1599u, new String(bArr, i6, iM4041v - i6, strM4039t), i5, m4023c(bArr, m4038s(iM3214s) + iM4041v, i4));
    }

    /* JADX INFO: renamed from: f */
    public static BinaryFrame m4025f(ParsableByteArray parsableByteArray, int i, String str) {
        byte[] bArr = new byte[i];
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, 0, i);
        parsableByteArray.f6393b += i;
        return new BinaryFrame(str, bArr);
    }

    /* JADX INFO: renamed from: g */
    public static ChapterFrame m4026g(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, a aVar) throws UnsupportedEncodingException {
        int i4 = parsableByteArray.f6393b;
        int iM4042w = m4042w(parsableByteArray.f6392a, i4);
        String str = new String(parsableByteArray.f6392a, i4, iM4042w - i4, "ISO-8859-1");
        parsableByteArray.m3194D(iM4042w + 1);
        int iM3201f = parsableByteArray.m3201f();
        int iM3201f2 = parsableByteArray.m3201f();
        long jM3215t = parsableByteArray.m3215t();
        long j2 = jM3215t == 4294967295L ? -1L : jM3215t;
        long jM3215t2 = parsableByteArray.m3215t();
        long j3 = jM3215t2 == 4294967295L ? -1L : jM3215t2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (parsableByteArray.f6393b < i5) {
            Id3Frame id3FrameM4029j = m4029j(i2, parsableByteArray, z, i3, aVar);
            if (id3FrameM4029j != null) {
                arrayList.add(id3FrameM4029j);
            }
        }
        return new ChapterFrame(str, iM3201f, iM3201f2, j2, j3, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* JADX INFO: renamed from: h */
    public static ChapterTocFrame m4027h(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, a aVar) throws UnsupportedEncodingException {
        int i4 = parsableByteArray.f6393b;
        int iM4042w = m4042w(parsableByteArray.f6392a, i4);
        String str = new String(parsableByteArray.f6392a, i4, iM4042w - i4, "ISO-8859-1");
        parsableByteArray.m3194D(iM4042w + 1);
        int iM3214s = parsableByteArray.m3214s();
        boolean z2 = (iM3214s & 2) != 0;
        boolean z3 = (iM3214s & 1) != 0;
        int iM3214s2 = parsableByteArray.m3214s();
        String[] strArr = new String[iM3214s2];
        for (int i5 = 0; i5 < iM3214s2; i5++) {
            int i6 = parsableByteArray.f6393b;
            int iM4042w2 = m4042w(parsableByteArray.f6392a, i6);
            strArr[i5] = new String(parsableByteArray.f6392a, i6, iM4042w2 - i6, "ISO-8859-1");
            parsableByteArray.m3194D(iM4042w2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (parsableByteArray.f6393b < i7) {
            Id3Frame id3FrameM4029j = m4029j(i2, parsableByteArray, z, i3, aVar);
            if (id3FrameM4029j != null) {
                arrayList.add(id3FrameM4029j);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* JADX INFO: renamed from: i */
    public static CommentFrame m4028i(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int iM3214s = parsableByteArray.m3214s();
        String strM4039t = m4039t(iM3214s);
        byte[] bArr = new byte[3];
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, 0, 3);
        parsableByteArray.f6393b += 3;
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr2, 0, i2);
        parsableByteArray.f6393b += i2;
        int iM4041v = m4041v(bArr2, 0, iM3214s);
        String str2 = new String(bArr2, 0, iM4041v, strM4039t);
        int iM4038s = m4038s(iM3214s) + iM4041v;
        return new CommentFrame(str, str2, m4033n(bArr2, iM4038s, m4041v(bArr2, iM4038s, iM3214s), strM4039t));
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0190  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x01bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x01d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e2 A[Catch: all -> 0x0126, UnsupportedEncodingException -> 0x0210, Merged into TryCatch #0 {all -> 0x0126, UnsupportedEncodingException -> 0x0210, blocks: (B:91:0x0114, B:159:0x01ec, B:162:0x0210, B:93:0x011c, B:102:0x0135, B:104:0x013d, B:112:0x0157, B:121:0x016f, B:132:0x018a, B:139:0x019c, B:145:0x01ab, B:150:0x01c3, B:156:0x01dd, B:157:0x01e2), top: B:169:0x010a }] */
    /* JADX INFO: renamed from: j */
    public static Id3Frame m4029j(int i, ParsableByteArray parsableByteArray, boolean z, int i2, a aVar) {
        int iM3217v;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Id3Frame id3FrameM4025f;
        int iM3214s = parsableByteArray.m3214s();
        int iM3214s2 = parsableByteArray.m3214s();
        int iM3214s3 = parsableByteArray.m3214s();
        int iM3214s4 = i >= 3 ? parsableByteArray.m3214s() : 0;
        if (i == 4) {
            iM3217v = parsableByteArray.m3217v();
            if (!z) {
                iM3217v = (((iM3217v >> 24) & 255) << 21) | (iM3217v & 255) | (((iM3217v >> 8) & 255) << 7) | (((iM3217v >> 16) & 255) << 14);
            }
        } else {
            iM3217v = i == 3 ? parsableByteArray.m3217v() : parsableByteArray.m3216u();
        }
        int iM4043x = iM3217v;
        int iM3219x = i >= 3 ? parsableByteArray.m3219x() : 0;
        if (iM3214s == 0 && iM3214s2 == 0 && iM3214s3 == 0 && iM3214s4 == 0 && iM4043x == 0 && iM3219x == 0) {
            parsableByteArray.m3194D(parsableByteArray.f6394c);
            return null;
        }
        int i4 = parsableByteArray.f6393b + iM4043x;
        if (i4 > parsableByteArray.f6394c) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            parsableByteArray.m3194D(parsableByteArray.f6394c);
            return null;
        }
        if (aVar != null) {
            i3 = i4;
            if (!aVar.mo3796a(i, iM3214s, iM3214s2, iM3214s3, iM3214s4)) {
                parsableByteArray.m3194D(i3);
                return null;
            }
        } else {
            i3 = i4;
        }
        if (i == 3) {
            int i5 = iM3219x;
            z3 = (i5 & 128) != 0;
            z4 = (i5 & 64) != 0;
            z2 = (i5 & 32) != 0;
            z6 = z3;
            z5 = false;
        } else {
            int i6 = iM3219x;
            if (i == 4) {
                boolean z7 = (i6 & 64) != 0;
                boolean z8 = (i6 & 8) != 0;
                boolean z9 = (i6 & 4) != 0;
                z5 = (i6 & 2) != 0;
                boolean z10 = (i6 & 1) != 0;
                z2 = z7;
                z3 = z10;
                z6 = z8;
                z4 = z9;
            } else {
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
                z6 = false;
            }
        }
        if (z6 || z4) {
            Log.w((String) r4, "Skipping unsupported compressed or encrypted frame");
            parsableByteArray.m3194D(i3);
            return null;
        }
        if (z2) {
            iM4043x--;
            parsableByteArray.m3195E(1);
        }
        if (z3) {
            iM4043x -= 4;
            parsableByteArray.m3195E(4);
        }
        if (z5) {
            iM4043x = m4043x(parsableByteArray, iM4043x);
        }
        try {
            if (iM3214s == 84 && iM3214s2 == 88 && iM3214s3 == 88 && (i == 2 || iM3214s4 == 88)) {
                id3FrameM4025f = m4035p(parsableByteArray, iM4043x);
            } else if (iM3214s == 84) {
                id3FrameM4025f = m4034o(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
            } else if (iM3214s == 87 && iM3214s2 == 88 && iM3214s3 == 88 && (i == 2 || iM3214s4 == 88)) {
                id3FrameM4025f = m4037r(parsableByteArray, iM4043x);
            } else if (iM3214s == 87) {
                id3FrameM4025f = m4036q(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
            } else if (iM3214s == 80 && iM3214s2 == 82 && iM3214s3 == 73 && iM3214s4 == 86) {
                id3FrameM4025f = m4032m(parsableByteArray, iM4043x);
            } else if (iM3214s == 71 && iM3214s2 == 69 && iM3214s3 == 79 && (iM3214s4 == 66 || i == 2)) {
                id3FrameM4025f = m4030k(parsableByteArray, iM4043x);
            } else if (i == 2) {
                if (iM3214s == 80 && iM3214s2 == 73 && iM3214s3 == 67) {
                    id3FrameM4025f = m4024e(parsableByteArray, iM4043x, i);
                } else if (iM3214s != 67 && iM3214s2 == 79 && iM3214s3 == 77 && (iM3214s4 == 77 || i == 2)) {
                    id3FrameM4025f = m4028i(parsableByteArray, iM4043x);
                } else if (iM3214s != 67 && iM3214s2 == 72 && iM3214s3 == 65 && iM3214s4 == 80) {
                    id3FrameM4025f = m4026g(parsableByteArray, iM4043x, i, z, i2, aVar);
                } else if (iM3214s != 67 && iM3214s2 == 84 && iM3214s3 == 79 && iM3214s4 == 67) {
                    id3FrameM4025f = m4027h(parsableByteArray, iM4043x, i, z, i2, aVar);
                } else if (iM3214s != 77 && iM3214s2 == 76 && iM3214s3 == 76 && iM3214s4 == 84) {
                    id3FrameM4025f = m4031l(parsableByteArray, iM4043x);
                } else {
                    id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
                }
            } else if (iM3214s == 65 && iM3214s2 == 80 && iM3214s3 == 73 && iM3214s4 == 67) {
                id3FrameM4025f = m4024e(parsableByteArray, iM4043x, i);
            } else if (iM3214s != 67) {
                if (iM3214s != 67) {
                    if (iM3214s != 67) {
                        if (iM3214s != 77) {
                            id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
                        } else {
                            id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
                        }
                    } else if (iM3214s != 77) {
                        id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
                    } else {
                        id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
                    }
                } else if (iM3214s != 67) {
                    if (iM3214s != 77) {
                        id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
                    } else {
                        id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
                    }
                } else if (iM3214s != 77) {
                    id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
                } else {
                    id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
                }
            } else if (iM3214s != 67) {
                if (iM3214s != 67) {
                    if (iM3214s != 77) {
                        id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
                    } else {
                        id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
                    }
                } else if (iM3214s != 77) {
                    id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
                } else {
                    id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
                }
            } else if (iM3214s != 67) {
                if (iM3214s != 77) {
                    id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
                } else {
                    id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
                }
            } else if (iM3214s != 77) {
                id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
            } else {
                id3FrameM4025f = m4025f(parsableByteArray, iM4043x, m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4));
            }
            if (id3FrameM4025f == null) {
                Log.w("Id3Decoder", "Failed to decode frame: id=" + m4040u(i, iM3214s, iM3214s2, iM3214s3, iM3214s4) + ", frameSize=" + iM4043x);
            }
            parsableByteArray.m3194D(i3);
            return id3FrameM4025f;
        } catch (UnsupportedEncodingException unused) {
            Log.w((String) r4, "Unsupported character encoding");
            return null;
        } finally {
            parsableByteArray.m3194D(i3);
        }
    }

    /* JADX INFO: renamed from: k */
    public static GeobFrame m4030k(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        int iM3214s = parsableByteArray.m3214s();
        String strM4039t = m4039t(iM3214s);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, 0, i2);
        parsableByteArray.f6393b += i2;
        int iM4042w = m4042w(bArr, 0);
        String str = new String(bArr, 0, iM4042w, "ISO-8859-1");
        int i3 = iM4042w + 1;
        int iM4041v = m4041v(bArr, i3, iM3214s);
        String strM4033n = m4033n(bArr, i3, iM4041v, strM4039t);
        int iM4038s = m4038s(iM3214s) + iM4041v;
        int iM4041v2 = m4041v(bArr, iM4038s, iM3214s);
        return new GeobFrame(str, strM4033n, m4033n(bArr, iM4038s, iM4041v2, strM4039t), m4023c(bArr, m4038s(iM3214s) + iM4041v2, i2));
    }

    /* JADX INFO: renamed from: l */
    public static MlltFrame m4031l(ParsableByteArray parsableByteArray, int i) {
        int iM3219x = parsableByteArray.m3219x();
        int iM3216u = parsableByteArray.m3216u();
        int iM3216u2 = parsableByteArray.m3216u();
        int iM3214s = parsableByteArray.m3214s();
        int iM3214s2 = parsableByteArray.m3214s();
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.m3186j(parsableByteArray.f6392a, parsableByteArray.f6394c);
        parsableBitArray.m3187k(parsableByteArray.f6393b * 8);
        int i2 = ((i - 10) * 8) / (iM3214s + iM3214s2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM3183g = parsableBitArray.m3183g(iM3214s);
            int iM3183g2 = parsableBitArray.m3183g(iM3214s2);
            iArr[i3] = iM3183g;
            iArr2[i3] = iM3183g2;
        }
        return new MlltFrame(iM3219x, iM3216u, iM3216u2, iArr, iArr2);
    }

    /* JADX INFO: renamed from: m */
    public static PrivFrame m4032m(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, 0, i);
        parsableByteArray.f6393b += i;
        int iM4042w = m4042w(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iM4042w, "ISO-8859-1"), m4023c(bArr, iM4042w + 1, i));
    }

    /* JADX INFO: renamed from: n */
    public static String m4033n(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /* JADX INFO: renamed from: o */
    public static TextInformationFrame m4034o(ParsableByteArray parsableByteArray, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iM3214s = parsableByteArray.m3214s();
        String strM4039t = m4039t(iM3214s);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, 0, i2);
        parsableByteArray.f6393b += i2;
        return new TextInformationFrame(str, null, new String(bArr, 0, m4041v(bArr, 0, iM3214s), strM4039t));
    }

    /* JADX INFO: renamed from: p */
    public static TextInformationFrame m4035p(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iM3214s = parsableByteArray.m3214s();
        String strM4039t = m4039t(iM3214s);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, 0, i2);
        parsableByteArray.f6393b += i2;
        int iM4041v = m4041v(bArr, 0, iM3214s);
        String str = new String(bArr, 0, iM4041v, strM4039t);
        int iM4038s = m4038s(iM3214s) + iM4041v;
        return new TextInformationFrame("TXXX", str, m4033n(bArr, iM4038s, m4041v(bArr, iM4038s, iM3214s), strM4039t));
    }

    /* JADX INFO: renamed from: q */
    public static UrlLinkFrame m4036q(ParsableByteArray parsableByteArray, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, 0, i);
        parsableByteArray.f6393b += i;
        return new UrlLinkFrame(str, null, new String(bArr, 0, m4042w(bArr, 0), "ISO-8859-1"));
    }

    /* JADX INFO: renamed from: r */
    public static UrlLinkFrame m4037r(ParsableByteArray parsableByteArray, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iM3214s = parsableByteArray.m3214s();
        String strM4039t = m4039t(iM3214s);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, 0, i2);
        parsableByteArray.f6393b += i2;
        int iM4041v = m4041v(bArr, 0, iM3214s);
        String str = new String(bArr, 0, iM4041v, strM4039t);
        int iM4038s = m4038s(iM3214s) + iM4041v;
        return new UrlLinkFrame("WXXX", str, m4033n(bArr, iM4038s, m4042w(bArr, iM4038s), "ISO-8859-1"));
    }

    /* JADX INFO: renamed from: s */
    public static int m4038s(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* JADX INFO: renamed from: t */
    public static String m4039t(int i) {
        if (i == 1) {
            return "UTF-16";
        }
        if (i != 2) {
            return i != 3 ? "ISO-8859-1" : Utf8Charset.NAME;
        }
        return "UTF-16BE";
    }

    /* JADX INFO: renamed from: u */
    public static String m4040u(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX INFO: renamed from: v */
    public static int m4041v(byte[] bArr, int i, int i2) {
        int iM4042w = m4042w(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iM4042w;
        }
        while (iM4042w < bArr.length - 1) {
            if (iM4042w % 2 == 0 && bArr[iM4042w + 1] == 0) {
                return iM4042w;
            }
            iM4042w = m4042w(bArr, iM4042w + 1);
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: w */
    public static int m4042w(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: x */
    public static int m4043x(ParsableByteArray parsableByteArray, int i) {
        byte[] bArr = parsableByteArray.f6392a;
        int i2 = parsableByteArray.f6393b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m4044y(ParsableByteArray parsableByteArray, int i, int i2, boolean z) {
        int iM3216u;
        long jM3216u;
        int iM3219x;
        int i3;
        int i4 = parsableByteArray.f6393b;
        while (true) {
            try {
                boolean z2 = true;
                if (parsableByteArray.m3196a() < i2) {
                    parsableByteArray.m3194D(i4);
                    return true;
                }
                if (i >= 3) {
                    iM3216u = parsableByteArray.m3201f();
                    jM3216u = parsableByteArray.m3215t();
                    iM3219x = parsableByteArray.m3219x();
                } else {
                    iM3216u = parsableByteArray.m3216u();
                    jM3216u = parsableByteArray.m3216u();
                    iM3219x = 0;
                }
                if (iM3216u == 0 && jM3216u == 0 && iM3219x == 0) {
                    parsableByteArray.m3194D(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jM3216u) != 0) {
                        parsableByteArray.m3194D(i4);
                        return false;
                    }
                    jM3216u = (((jM3216u >> 24) & 255) << 21) | (jM3216u & 255) | (((jM3216u >> 8) & 255) << 7) | (((jM3216u >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iM3219x & 64) != 0 ? 1 : 0;
                    if ((iM3219x & 1) == 0) {
                        z2 = false;
                    }
                } else {
                    if (i == 3) {
                        i3 = (iM3219x & 32) != 0 ? 1 : 0;
                        if ((iM3219x & 128) == 0) {
                        }
                    } else {
                        i3 = 0;
                    }
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jM3216u < i3) {
                    parsableByteArray.m3194D(i4);
                    return false;
                }
                if (parsableByteArray.m3196a() < jM3216u) {
                    parsableByteArray.m3194D(i4);
                    return false;
                }
                parsableByteArray.m3195E((int) jM3216u);
            } catch (Throwable th) {
                parsableByteArray.m3194D(i4);
                throw th;
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.SimpleMetadataDecoder
    /* JADX INFO: renamed from: b */
    public Metadata mo4018b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return m4045d(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:69:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f3 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public Metadata m4045d(byte[] bArr, int i) {
        boolean z;
        b bVar;
        int i2;
        int iM4043x;
        Id3Frame id3FrameM4029j;
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i);
        boolean z2 = false;
        if (parsableByteArray.m3196a() < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iM3216u = parsableByteArray.m3216u();
            if (iM3216u == 4801587) {
                int iM3214s = parsableByteArray.m3214s();
                parsableByteArray.m3195E(1);
                int iM3214s2 = parsableByteArray.m3214s();
                int iM3213r = parsableByteArray.m3213r();
                if (iM3214s == 2) {
                    if ((iM3214s2 & 64) != 0) {
                        Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    } else {
                        if (iM3214s < 4 || (iM3214s2 & 128) == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        bVar = new b(iM3214s, z, iM3213r);
                    }
                } else {
                    if (iM3214s == 3) {
                        if ((iM3214s2 & 64) != 0) {
                            int iM3201f = parsableByteArray.m3201f();
                            parsableByteArray.m3195E(iM3201f);
                            iM3213r -= iM3201f + 4;
                        }
                    } else if (iM3214s == 4) {
                        if ((iM3214s2 & 64) != 0) {
                            int iM3213r2 = parsableByteArray.m3213r();
                            parsableByteArray.m3195E(iM3213r2 - 4);
                            iM3213r -= iM3213r2;
                        }
                        if ((iM3214s2 & 16) != 0) {
                            iM3213r -= 10;
                        }
                    } else {
                        outline.m1565P("Skipped ID3 tag with unsupported majorVersion=", iM3214s, "Id3Decoder");
                    }
                    if (iM3214s < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    bVar = new b(iM3214s, z, iM3213r);
                }
                if (bVar == null) {
                    return null;
                }
                int i3 = parsableByteArray.f6393b;
                i2 = bVar.f8736a == 2 ? 6 : 10;
                iM4043x = bVar.f8738c;
                if (bVar.f8737b) {
                    iM4043x = m4043x(parsableByteArray, iM4043x);
                }
                parsableByteArray.m3193C(i3 + iM4043x);
                if (!m4044y(parsableByteArray, bVar.f8736a, i2, false)) {
                    if (bVar.f8736a == 4 || !m4044y(parsableByteArray, 4, i2, true)) {
                        StringBuilder sbM1556G = outline.m1556G("Failed to validate ID3 tag with majorVersion=");
                        sbM1556G.append(bVar.f8736a);
                        Log.w("Id3Decoder", sbM1556G.toString());
                        return null;
                    }
                    z2 = true;
                }
                while (parsableByteArray.m3196a() >= i2) {
                    id3FrameM4029j = m4029j(bVar.f8736a, parsableByteArray, z2, i2, this.f8735b);
                    if (id3FrameM4029j != null) {
                        arrayList.add(id3FrameM4029j);
                    }
                }
                return new Metadata(arrayList);
            }
            StringBuilder sbM1556G2 = outline.m1556G("Unexpected first three bytes of ID3 tag header: 0x");
            sbM1556G2.append(String.format("%06X", Integer.valueOf(iM3216u)));
            Log.w("Id3Decoder", sbM1556G2.toString());
        }
        bVar = null;
        if (bVar == null) {
            return null;
        }
        int i4 = parsableByteArray.f6393b;
        if (bVar.f8736a == 2) {
        }
        iM4043x = bVar.f8738c;
        if (bVar.f8737b) {
            iM4043x = m4043x(parsableByteArray, iM4043x);
        }
        parsableByteArray.m3193C(i4 + iM4043x);
        if (!m4044y(parsableByteArray, bVar.f8736a, i2, false)) {
            if (bVar.f8736a == 4) {
            }
            StringBuilder sbM1556G3 = outline.m1556G("Failed to validate ID3 tag with majorVersion=");
            sbM1556G3.append(bVar.f8736a);
            Log.w("Id3Decoder", sbM1556G3.toString());
            return null;
        }
        while (parsableByteArray.m3196a() >= i2) {
            id3FrameM4029j = m4029j(bVar.f8736a, parsableByteArray, z2, i2, this.f8735b);
            if (id3FrameM4029j != null) {
                arrayList.add(id3FrameM4029j);
            }
        }
        return new Metadata(arrayList);
    }

    public Id3Decoder(a aVar) {
        this.f8735b = aVar;
    }
}
