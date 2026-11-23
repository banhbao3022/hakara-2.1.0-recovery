package p007c.p190n.p194b.p209b.p221s1.p228k0;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p213c2.AvcConfig;
import p007c.p190n.p194b.p209b.p213c2.DolbyVisionConfig;
import p007c.p190n.p194b.p209b.p213c2.HevcConfig;
import p007c.p190n.p194b.p209b.p215n1.AacUtil;
import p007c.p190n.p194b.p209b.p215n1.Ac3Util;
import p007c.p190n.p194b.p209b.p218q1.DrmInitData;
import p007c.p190n.p194b.p209b.p221s1.GaplessInfoHolder;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p379a.Function;
import p007c.p190n.p378c.p380b.ImmutableList2;

/* JADX INFO: renamed from: c.n.b.b.s1.k0.e, reason: use source file name */
/* JADX INFO: compiled from: AtomParsers.java */
/* JADX INFO: loaded from: classes.dex */
public final class AtomParsers {

    /* JADX INFO: renamed from: a */
    public static final byte[] f7858a = Util6.m3093B("OpusHead");

    /* JADX INFO: renamed from: c.n.b.b.s1.k0.e$a */
    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f7859a;

        /* JADX INFO: renamed from: b */
        public int f7860b;

        /* JADX INFO: renamed from: c */
        public int f7861c;

        /* JADX INFO: renamed from: d */
        public long f7862d;

        /* JADX INFO: renamed from: e */
        public final boolean f7863e;

        /* JADX INFO: renamed from: f */
        public final ParsableByteArray f7864f;

        /* JADX INFO: renamed from: g */
        public final ParsableByteArray f7865g;

        /* JADX INFO: renamed from: h */
        public int f7866h;

        /* JADX INFO: renamed from: i */
        public int f7867i;

        public a(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) {
            this.f7865g = parsableByteArray;
            this.f7864f = parsableByteArray2;
            this.f7863e = z;
            parsableByteArray2.m3194D(12);
            this.f7859a = parsableByteArray2.m3217v();
            parsableByteArray.m3194D(12);
            this.f7867i = parsableByteArray.m3217v();
            C2096e.m4571g(parsableByteArray.m3201f() == 1, "first_chunk must be 1");
            this.f7860b = -1;
        }

        /* JADX INFO: renamed from: a */
        public boolean m3816a() {
            int i = this.f7860b + 1;
            this.f7860b = i;
            if (i == this.f7859a) {
                return false;
            }
            this.f7862d = this.f7863e ? this.f7864f.m3218w() : this.f7864f.m3215t();
            if (this.f7860b == this.f7866h) {
                this.f7861c = this.f7865g.m3217v();
                this.f7865g.m3195E(4);
                int i2 = this.f7867i - 1;
                this.f7867i = i2;
                this.f7866h = i2 > 0 ? this.f7865g.m3217v() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.k0.e$b */
    /* JADX INFO: compiled from: AtomParsers.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        int mo3817a();

        /* JADX INFO: renamed from: b */
        int mo3818b();

        /* JADX INFO: renamed from: c */
        int mo3819c();
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.k0.e$c */
    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final TrackEncryptionBox[] f7868a;

        /* JADX INFO: renamed from: b */
        public Format f7869b;

        /* JADX INFO: renamed from: c */
        public int f7870c;

        /* JADX INFO: renamed from: d */
        public int f7871d = 0;

        public c(int i) {
            this.f7868a = new TrackEncryptionBox[i];
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.k0.e$d */
    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class d implements b {

        /* JADX INFO: renamed from: a */
        public final int f7872a;

        /* JADX INFO: renamed from: b */
        public final int f7873b;

        /* JADX INFO: renamed from: c */
        public final ParsableByteArray f7874c;

        public d(Atom.b bVar, Format format) {
            ParsableByteArray parsableByteArray = bVar.f7857b;
            this.f7874c = parsableByteArray;
            parsableByteArray.m3194D(12);
            int iM3217v = parsableByteArray.m3217v();
            if ("audio/raw".equals(format.f6934q)) {
                int iM3137y = Util6.m3137y(format.f6917F, format.f6915D);
                if (iM3217v == 0 || iM3217v % iM3137y != 0) {
                    Log.w("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iM3137y + ", stsz sample size: " + iM3217v);
                    iM3217v = iM3137y;
                }
            }
            this.f7872a = iM3217v == 0 ? -1 : iM3217v;
            this.f7873b = parsableByteArray.m3217v();
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p228k0.AtomParsers.b
        /* JADX INFO: renamed from: a */
        public int mo3817a() {
            return this.f7872a;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p228k0.AtomParsers.b
        /* JADX INFO: renamed from: b */
        public int mo3818b() {
            return this.f7873b;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p228k0.AtomParsers.b
        /* JADX INFO: renamed from: c */
        public int mo3819c() {
            int i = this.f7872a;
            return i == -1 ? this.f7874c.m3217v() : i;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.k0.e$e */
    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class e implements b {

        /* JADX INFO: renamed from: a */
        public final ParsableByteArray f7875a;

        /* JADX INFO: renamed from: b */
        public final int f7876b;

        /* JADX INFO: renamed from: c */
        public final int f7877c;

        /* JADX INFO: renamed from: d */
        public int f7878d;

        /* JADX INFO: renamed from: e */
        public int f7879e;

        public e(Atom.b bVar) {
            ParsableByteArray parsableByteArray = bVar.f7857b;
            this.f7875a = parsableByteArray;
            parsableByteArray.m3194D(12);
            this.f7877c = parsableByteArray.m3217v() & 255;
            this.f7876b = parsableByteArray.m3217v();
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p228k0.AtomParsers.b
        /* JADX INFO: renamed from: a */
        public int mo3817a() {
            return -1;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p228k0.AtomParsers.b
        /* JADX INFO: renamed from: b */
        public int mo3818b() {
            return this.f7876b;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p228k0.AtomParsers.b
        /* JADX INFO: renamed from: c */
        public int mo3819c() {
            int i = this.f7877c;
            if (i == 8) {
                return this.f7875a.m3214s();
            }
            if (i == 16) {
                return this.f7875a.m3219x();
            }
            int i2 = this.f7878d;
            this.f7878d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f7879e & 15;
            }
            int iM3214s = this.f7875a.m3214s();
            this.f7879e = iM3214s;
            return (iM3214s & 240) >> 4;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.k0.e$f */
    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class f {

        /* JADX INFO: renamed from: a */
        public final int f7880a;

        /* JADX INFO: renamed from: b */
        public final long f7881b;

        /* JADX INFO: renamed from: c */
        public final int f7882c;

        public f(int i, long j2, int i2) {
            this.f7880a = i;
            this.f7881b = j2;
            this.f7882c = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Pair<String, byte[]> m3811a(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.m3194D(i + 8 + 4);
        parsableByteArray.m3195E(1);
        m3812b(parsableByteArray);
        parsableByteArray.m3195E(2);
        int iM3214s = parsableByteArray.m3214s();
        if ((iM3214s & 128) != 0) {
            parsableByteArray.m3195E(2);
        }
        if ((iM3214s & 64) != 0) {
            parsableByteArray.m3195E(parsableByteArray.m3219x());
        }
        if ((iM3214s & 32) != 0) {
            parsableByteArray.m3195E(2);
        }
        parsableByteArray.m3195E(1);
        m3812b(parsableByteArray);
        String strM3164f = MimeTypes.m3164f(parsableByteArray.m3214s());
        if ("audio/mpeg".equals(strM3164f) || "audio/vnd.dts".equals(strM3164f) || "audio/vnd.dts.hd".equals(strM3164f)) {
            return Pair.create(strM3164f, null);
        }
        parsableByteArray.m3195E(12);
        parsableByteArray.m3195E(1);
        int iM3812b = m3812b(parsableByteArray);
        byte[] bArr = new byte[iM3812b];
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, 0, iM3812b);
        parsableByteArray.f6393b += iM3812b;
        return Pair.create(strM3164f, bArr);
    }

    /* JADX INFO: renamed from: b */
    public static int m3812b(ParsableByteArray parsableByteArray) {
        int iM3214s = parsableByteArray.m3214s();
        int i = iM3214s & 127;
        while ((iM3214s & 128) == 128) {
            iM3214s = parsableByteArray.m3214s();
            i = (i << 7) | (iM3214s & 127);
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static Pair<Integer, TrackEncryptionBox> m3813c(ParsableByteArray parsableByteArray, int i, int i2) {
        TrackEncryptionBox trackEncryptionBox;
        Pair<Integer, TrackEncryptionBox> pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = parsableByteArray.f6393b;
        while (i5 - i < i2) {
            parsableByteArray.m3194D(i5);
            int iM3201f = parsableByteArray.m3201f();
            C2096e.m4571g(iM3201f > 0, "childAtomSize should be positive");
            if (parsableByteArray.m3201f() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = -1;
                int i8 = 0;
                String strM3211p = null;
                Integer numValueOf = null;
                while (i6 - i5 < iM3201f) {
                    parsableByteArray.m3194D(i6);
                    int iM3201f2 = parsableByteArray.m3201f();
                    int iM3201f3 = parsableByteArray.m3201f();
                    if (iM3201f3 == 1718775137) {
                        numValueOf = Integer.valueOf(parsableByteArray.m3201f());
                    } else if (iM3201f3 == 1935894637) {
                        parsableByteArray.m3195E(4);
                        strM3211p = parsableByteArray.m3211p(4);
                    } else if (iM3201f3 == 1935894633) {
                        i7 = i6;
                        i8 = iM3201f2;
                    }
                    i6 += iM3201f2;
                }
                if ("cenc".equals(strM3211p) || "cbc1".equals(strM3211p) || "cens".equals(strM3211p) || "cbcs".equals(strM3211p)) {
                    C2096e.m4573i(numValueOf, "frma atom is mandatory");
                    C2096e.m4571g(i7 != -1, "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            trackEncryptionBox = null;
                            break;
                        }
                        parsableByteArray.m3194D(i9);
                        int iM3201f4 = parsableByteArray.m3201f();
                        if (parsableByteArray.m3201f() == 1952804451) {
                            int iM3201f5 = (parsableByteArray.m3201f() >> 24) & 255;
                            parsableByteArray.m3195E(1);
                            if (iM3201f5 == 0) {
                                parsableByteArray.m3195E(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iM3214s = parsableByteArray.m3214s();
                                int i10 = (iM3214s & 240) >> 4;
                                i3 = iM3214s & 15;
                                i4 = i10;
                            }
                            boolean z = parsableByteArray.m3214s() == 1;
                            int iM3214s2 = parsableByteArray.m3214s();
                            byte[] bArr2 = new byte[16];
                            System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr2, 0, 16);
                            parsableByteArray.f6393b += 16;
                            if (z && iM3214s2 == 0) {
                                int iM3214s3 = parsableByteArray.m3214s();
                                byte[] bArr3 = new byte[iM3214s3];
                                System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr3, 0, iM3214s3);
                                parsableByteArray.f6393b += iM3214s3;
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            trackEncryptionBox = new TrackEncryptionBox(z, strM3211p, iM3214s2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i9 += iM3201f4;
                    }
                    C2096e.m4573i(trackEncryptionBox, "tenc atom is mandatory");
                    pairCreate = Pair.create(numValueOf, trackEncryptionBox);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iM3201f;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0283 A[DONT_INVERT, LOOP:12: B:101:0x0283->B:105:0x028d, LOOP_START, PHI: r16
  0x0283: PHI (r16v6 int) = (r16v2 int), (r16v7 int) binds: [B:100:0x0281, B:105:0x028d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x0285  */
    /* JADX WARN: Code duplicated, block: B:105:0x028d A[LOOP:12: B:101:0x0283->B:105:0x028d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0293 A[EDGE_INSN: B:106:0x0293->B:107:0x0294 BREAK  A[LOOP:12: B:101:0x0283->B:105:0x028d]] */
    /* JADX WARN: Code duplicated, block: B:116:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:120:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:125:0x0309  */
    /* JADX WARN: Code duplicated, block: B:127:0x0318  */
    /* JADX WARN: Code duplicated, block: B:154:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:167:0x0418  */
    /* JADX WARN: Code duplicated, block: B:168:0x041a  */
    /* JADX WARN: Code duplicated, block: B:172:0x042f  */
    /* JADX WARN: Code duplicated, block: B:174:0x043a  */
    /* JADX WARN: Code duplicated, block: B:182:0x047c  */
    /* JADX WARN: Code duplicated, block: B:183:0x047e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0487  */
    /* JADX WARN: Code duplicated, block: B:190:0x049f  */
    /* JADX WARN: Code duplicated, block: B:193:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:194:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:196:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:197:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:199:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:200:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:202:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:203:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:209:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:210:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:213:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:229:0x0492 A[EDGE_INSN: B:229:0x0492->B:187:0x0492 BREAK  A[LOOP:5: B:170:0x042a->B:186:0x048b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x01e1 A[EDGE_INSN: B:244:0x01e1->B:72:0x01e1 BREAK  A[LOOP:10: B:68:0x01c6->B:71:0x01ce], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102 A[LOOP:0: B:51:0x00fc->B:53:0x0102, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0115 A[LOOP:1: B:55:0x0113->B:56:0x0115, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x012f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0143 A[LOOP:3: B:60:0x0141->B:61:0x0143, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0194  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ce A[LOOP:10: B:68:0x01c6->B:71:0x01ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0201 A[ADDED_TO_REGION, LOOP:11: B:76:0x0201->B:78:0x0205, LOOP_START, PHI: r16 r26 r27
  0x0201: PHI (r16v9 int) = (r16v2 int), (r16v10 int) binds: [B:75:0x01ff, B:78:0x0205] A[DONT_GENERATE, DONT_INLINE]
  0x0201: PHI (r26v4 int) = (r26v1 int), (r26v5 int) binds: [B:75:0x01ff, B:78:0x0205] A[DONT_GENERATE, DONT_INLINE]
  0x0201: PHI (r27v3 int) = (r27v1 int), (r27v5 int) binds: [B:75:0x01ff, B:78:0x0205] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0220  */
    /* JADX WARN: Code duplicated, block: B:85:0x022c  */
    /* JADX WARN: Code duplicated, block: B:86:0x022e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0235  */
    /* JADX WARN: Code duplicated, block: B:91:0x023c  */
    /* JADX WARN: Code duplicated, block: B:96:0x025b  */
    /* JADX INFO: renamed from: d */
    public static TrackSampleTable m3814d(Track track, Atom.a aVar, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        b eVar;
        boolean z;
        int iM3217v;
        int iM3217v2;
        int iM3217v3;
        int iMo3817a;
        boolean z2;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        int i;
        long j2;
        long j3;
        int i2;
        int i3;
        int i4;
        int iM3201f;
        int iM3217v4;
        int iM3201f2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        Track track2;
        String str;
        long[] jArr;
        int i10;
        int[] iArr;
        int i11;
        long j4;
        int[] iArr2;
        long[] jArr2;
        boolean zM3816a;
        int i12;
        int i13;
        int i14;
        int iM3217v5;
        int i15;
        int iM3217v6;
        int i16;
        long jM3104M;
        long[] jArr3;
        int i17;
        long[] jArr4;
        boolean z4;
        int[] iArr3;
        int[] iArr4;
        long[] jArr5;
        int i18;
        int i19;
        int i20;
        boolean z5;
        long[] jArr6;
        int[] iArr5;
        int i21;
        int i22;
        boolean z6;
        long[] jArr7;
        int[] iArr6;
        int i23;
        int[] iArr7;
        long[] jArr8;
        int i24;
        long j5;
        int i25;
        long j6;
        int i26;
        int i27;
        int[] iArr8;
        long j7;
        int i28;
        boolean z7;
        int i29;
        long[] jArr9;
        int[] iArr9;
        long j8;
        int i30;
        int i31;
        int iM3119g;
        long[] jArr10;
        int[] iArr10;
        long[] jArr11;
        int[] iArr11;
        int i32;
        int i33;
        int i34;
        int i35;
        long j9;
        int iMax;
        int i36;
        int i37;
        Atom.b bVarM3810c = aVar.m3810c(1937011578);
        if (bVarM3810c != null) {
            eVar = new d(bVarM3810c, track.f7983f);
        } else {
            Atom.b bVarM3810c2 = aVar.m3810c(1937013298);
            if (bVarM3810c2 == null) {
                throw new ParserException("Track has no sample table size information");
            }
            eVar = new e(bVarM3810c2);
        }
        int iMo3818b = eVar.mo3818b();
        if (iMo3818b == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        Atom.b bVarM3810c3 = aVar.m3810c(1937007471);
        if (bVarM3810c3 == null) {
            bVarM3810c3 = aVar.m3810c(1668232756);
            Objects.requireNonNull(bVarM3810c3);
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray = bVarM3810c3.f7857b;
        Atom.b bVarM3810c4 = aVar.m3810c(1937011555);
        Objects.requireNonNull(bVarM3810c4);
        ParsableByteArray parsableByteArray2 = bVarM3810c4.f7857b;
        Atom.b bVarM3810c5 = aVar.m3810c(1937011827);
        Objects.requireNonNull(bVarM3810c5);
        ParsableByteArray parsableByteArray3 = bVarM3810c5.f7857b;
        Atom.b bVarM3810c6 = aVar.m3810c(1937011571);
        ParsableByteArray parsableByteArray4 = bVarM3810c6 != null ? bVarM3810c6.f7857b : null;
        Atom.b bVarM3810c7 = aVar.m3810c(1668576371);
        ParsableByteArray parsableByteArray5 = bVarM3810c7 != null ? bVarM3810c7.f7857b : null;
        a aVar2 = new a(parsableByteArray2, parsableByteArray, z);
        parsableByteArray3.m3194D(12);
        int iM3217v7 = parsableByteArray3.m3217v() - 1;
        int iM3217v8 = parsableByteArray3.m3217v();
        int iM3217v9 = parsableByteArray3.m3217v();
        if (parsableByteArray5 != null) {
            parsableByteArray5.m3194D(12);
            iM3217v = parsableByteArray5.m3217v();
        } else {
            iM3217v = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.m3194D(12);
            iM3217v2 = parsableByteArray4.m3217v();
            if (iM3217v2 > 0) {
                iM3217v3 = parsableByteArray4.m3217v() - 1;
            } else {
                parsableByteArray4 = null;
            }
            iMo3817a = eVar.mo3817a();
            String str2 = track.f7983f.f6934q;
            if (iMo3817a == -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iM3217v7 == 0 && iM3217v == 0 && iM3217v2 == 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i29 = aVar2.f7859a;
                jArr9 = new long[i29];
                iArr9 = new int[i29];
                while (aVar2.m3816a()) {
                    int i38 = aVar2.f7860b;
                    jArr9[i38] = aVar2.f7862d;
                    iArr9[i38] = aVar2.f7861c;
                }
                j8 = iM3217v9;
                i30 = 8192 / iMo3817a;
                iM3119g = 0;
                for (i31 = 0; i31 < i29; i31++) {
                    iM3119g += Util6.m3119g(iArr9[i31], i30);
                }
                jArr10 = new long[iM3119g];
                iArr10 = new int[iM3119g];
                jArr11 = new long[iM3119g];
                iArr11 = new int[iM3119g];
                i32 = 0;
                i33 = 0;
                i34 = 0;
                i35 = 0;
                while (i32 < i29) {
                    int i39 = iArr9[i32];
                    j9 = jArr9[i32];
                    int i40 = i35;
                    int i41 = i29;
                    iMax = i34;
                    i36 = i40;
                    long[] jArr12 = jArr9;
                    i37 = i39;
                    while (i37 > 0) {
                        int iMin = Math.min(i30, i37);
                        jArr10[i36] = j9;
                        iArr10[i36] = iMo3817a * iMin;
                        iMax = Math.max(iMax, iArr10[i36]);
                        jArr11[i36] = ((long) i33) * j8;
                        iArr11[i36] = 1;
                        j9 += (long) iArr10[i36];
                        i33 += iMin;
                        i37 -= iMin;
                        i36++;
                        i30 = i30;
                        jArr10 = jArr10;
                        iArr9 = iArr9;
                    }
                    i32++;
                    jArr9 = jArr12;
                    iArr9 = iArr9;
                    int i42 = i36;
                    i34 = iMax;
                    i29 = i41;
                    i35 = i42;
                }
                long j10 = j8 * ((long) i33);
                track2 = track;
                i11 = iMo3818b;
                jArr = jArr10;
                iArr2 = iArr11;
                iArr = iArr10;
                jArr2 = jArr11;
                i10 = i34;
                j4 = j10;
            } else {
                jArrCopyOf = new long[iMo3818b];
                iArrCopyOf = new int[iMo3818b];
                jArrCopyOf2 = new long[iMo3818b];
                int i43 = iM3217v2;
                iArrCopyOf2 = new int[iMo3818b];
                i = 0;
                j2 = 0;
                j3 = 0;
                i2 = iM3217v3;
                i3 = 0;
                i4 = 0;
                iM3201f = 0;
                iM3217v4 = 0;
                iM3201f2 = iM3217v9;
                int i44 = iM3217v;
                i5 = iM3217v8;
                i6 = iM3217v7;
                i7 = i43;
                i8 = i44;
                while (i3 < iMo3818b) {
                    zM3816a = true;
                    while (i == 0) {
                        zM3816a = aVar2.m3816a();
                        if (zM3816a) {
                            break;
                        }
                        j2 = aVar2.f7862d;
                        iMo3818b = iMo3818b;
                        i = aVar2.f7861c;
                        i2 = i2;
                    }
                    i12 = i2;
                    i13 = iMo3818b;
                    if (!zM3816a) {
                        Log.w("AtomParsers", "Unexpected end of chunk data");
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i3);
                        iMo3818b = i3;
                        break;
                    }
                    if (parsableByteArray5 != null) {
                        while (iM3217v4 == 0 && i8 > 0) {
                            iM3217v4 = parsableByteArray5.m3217v();
                            iM3201f = parsableByteArray5.m3201f();
                            i8--;
                        }
                        iM3217v4--;
                    }
                    int i45 = iM3201f;
                    jArrCopyOf[i3] = j2;
                    iArrCopyOf[i3] = eVar.mo3819c();
                    if (iArrCopyOf[i3] > i4) {
                        i4 = iArrCopyOf[i3];
                    }
                    b bVar = eVar;
                    jArrCopyOf2[i3] = j3 + ((long) i45);
                    if (parsableByteArray4 == null) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    iArrCopyOf2[i3] = i14;
                    iM3217v5 = i12;
                    if (i3 == iM3217v5) {
                        iArrCopyOf2[i3] = 1;
                        i7--;
                        if (i7 > 0) {
                            Objects.requireNonNull(parsableByteArray4);
                            iM3217v5 = parsableByteArray4.m3217v() - 1;
                        }
                    }
                    int i46 = iM3217v5;
                    j3 += (long) iM3201f2;
                    i15 = i5 - 1;
                    if (i15 == 0 || i6 <= 0) {
                        iM3217v6 = i15;
                        i16 = i6;
                    } else {
                        iM3217v6 = parsableByteArray3.m3217v();
                        i16 = i6 - 1;
                        iM3201f2 = parsableByteArray3.m3201f();
                    }
                    int i47 = iM3217v6;
                    j2 += (long) iArrCopyOf[i3];
                    i--;
                    i3++;
                    iM3201f = i45;
                    i2 = i46;
                    eVar = bVar;
                    iMo3818b = i13;
                    int i48 = i16;
                    i5 = i47;
                    i6 = i48;
                }
                int i49 = i;
                long j11 = j3 + ((long) iM3201f);
                if (parsableByteArray5 != null) {
                    z3 = true;
                    break;
                }
                while (true) {
                    if (i8 > 0) {
                        z3 = true;
                        break;
                    }
                    if (parsableByteArray5.m3217v() != 0) {
                        z3 = false;
                        break;
                    }
                    parsableByteArray5.m3201f();
                    i8--;
                }
                if (i7 != 0 && i5 == 0 && i49 == 0 && i6 == 0) {
                    i9 = iM3217v4;
                    if (i9 == 0 && z3) {
                        track2 = track;
                    }
                    jArr = jArrCopyOf;
                    i10 = i4;
                    iArr = iArrCopyOf;
                    i11 = iMo3818b;
                    j4 = j11;
                    long[] jArr13 = jArrCopyOf2;
                    iArr2 = iArrCopyOf2;
                    jArr2 = jArr13;
                } else {
                    i9 = iM3217v4;
                }
                StringBuilder sbM1556G = outline.m1556G("Inconsistent stbl box for track ");
                track2 = track;
                sbM1556G.append(track2.f7978a);
                sbM1556G.append(": remainingSynchronizationSamples ");
                sbM1556G.append(i7);
                sbM1556G.append(", remainingSamplesAtTimestampDelta ");
                sbM1556G.append(i5);
                sbM1556G.append(", remainingSamplesInChunk ");
                sbM1556G.append(i49);
                sbM1556G.append(", remainingTimestampDeltaChanges ");
                sbM1556G.append(i6);
                sbM1556G.append(", remainingSamplesAtTimestampOffset ");
                sbM1556G.append(i9);
                if (z3) {
                    str = "";
                } else {
                    str = ", ctts invalid";
                }
                outline.m1571V(sbM1556G, str, "AtomParsers");
                jArr = jArrCopyOf;
                i10 = i4;
                iArr = iArrCopyOf;
                i11 = iMo3818b;
                j4 = j11;
                long[] jArr14 = jArrCopyOf2;
                iArr2 = iArrCopyOf2;
                jArr2 = jArr14;
            }
            jM3104M = Util6.m3104M(j4, 1000000L, track2.f7980c);
            jArr3 = track2.f7985h;
            if (jArr3 == null) {
                Util6.m3105N(jArr2, 1000000L, track2.f7980c);
                return new TrackSampleTable(track, jArr, iArr, i10, jArr2, iArr2, jM3104M);
            }
            if (jArr3.length == 1 || track2.f7979b != 1 || jArr2.length < 2) {
                i17 = i11;
            } else {
                long[] jArr15 = track2.f7986i;
                Objects.requireNonNull(jArr15);
                long j12 = jArr15[0];
                int i50 = i11;
                long jM3104M2 = Util6.m3104M(track2.f7985h[0], track2.f7980c, track2.f7981d) + j12;
                int length = jArr2.length - 1;
                i17 = i50;
                if (jArr2[0] <= j12 && j12 < jArr2[Util6.m3121i(4, 0, length)] && jArr2[Util6.m3121i(jArr2.length - 4, 0, length)] < jM3104M2 && jM3104M2 <= j4) {
                    long j13 = j4 - jM3104M2;
                    long jM3104M3 = Util6.m3104M(j12 - jArr2[0], track2.f7983f.f6916E, track2.f7980c);
                    long jM3104M4 = Util6.m3104M(j13, track2.f7983f.f6916E, track2.f7980c);
                    if ((jM3104M3 != 0 || jM3104M4 != 0) && jM3104M3 <= 2147483647L && jM3104M4 <= 2147483647L) {
                        gaplessInfoHolder.f8512b = (int) jM3104M3;
                        gaplessInfoHolder.f8513c = (int) jM3104M4;
                        Util6.m3105N(jArr2, 1000000L, track2.f7980c);
                        return new TrackSampleTable(track, jArr, iArr, i10, jArr2, iArr2, Util6.m3104M(track2.f7985h[0], 1000000L, track2.f7981d));
                    }
                }
            }
            jArr4 = track2.f7985h;
            if (jArr4.length != 1 && jArr4[0] == 0) {
                long[] jArr16 = track2.f7986i;
                Objects.requireNonNull(jArr16);
                long j14 = jArr16[0];
                for (int i51 = 0; i51 < jArr2.length; i51++) {
                    jArr2[i51] = Util6.m3104M(jArr2[i51] - j14, 1000000L, track2.f7980c);
                }
                return new TrackSampleTable(track, jArr, iArr, i10, jArr2, iArr2, Util6.m3104M(j4 - j14, 1000000L, track2.f7980c));
            }
            if (track2.f7979b == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            iArr3 = new int[jArr4.length];
            iArr4 = new int[jArr4.length];
            jArr5 = track2.f7986i;
            Objects.requireNonNull(jArr5);
            i18 = 0;
            i19 = 0;
            i20 = 0;
            z5 = false;
            while (true) {
                jArr6 = track2.f7985h;
                if (i18 < jArr6.length) {
                    break;
                }
                int[] iArr12 = iArr;
                int i52 = i10;
                j7 = jArr5[i18];
                if (j7 != -1) {
                    i28 = i20;
                    boolean z8 = z5;
                    long jM3104M5 = Util6.m3104M(jArr6[i18], track2.f7980c, track2.f7981d);
                    iArr3[i18] = Util6.m3118f(jArr2, j7, true, true);
                    iArr4[i18] = Util6.m3114b(jArr2, j7 + jM3104M5, z4, false);
                    while (iArr3[i18] < iArr4[i18] && (iArr2[iArr3[i18]] & 1) == 0) {
                        iArr3[i18] = iArr3[i18] + 1;
                    }
                    int i53 = (iArr4[i18] - iArr3[i18]) + i19;
                    if (i28 != iArr3[i18]) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z5 = z7 | z8;
                    i20 = iArr4[i18];
                    i19 = i53;
                }
                i18++;
                iArr = iArr12;
                i10 = i52;
            }
            iArr5 = iArr;
            i21 = i10;
            i22 = 0;
            z6 = z5 | (i19 != i17);
            if (z6) {
                jArr7 = new long[i19];
            } else {
                jArr7 = jArr;
            }
            if (z6) {
                iArr6 = new int[i19];
            } else {
                iArr6 = iArr5;
            }
            if (z6) {
                i23 = 0;
            } else {
                i23 = i21;
            }
            if (z6) {
                iArr7 = new int[i19];
            } else {
                iArr7 = iArr2;
            }
            jArr8 = new long[i19];
            i24 = 0;
            j5 = 0;
            i25 = i23;
            while (i22 < track2.f7985h.length) {
                j6 = track2.f7986i[i22];
                i26 = iArr3[i22];
                int[] iArr13 = iArr3;
                i27 = iArr4[i22];
                if (z6) {
                    int i54 = i27 - i26;
                    System.arraycopy(jArr, i26, jArr7, i24, i54);
                    iArr8 = iArr5;
                    System.arraycopy(iArr8, i26, iArr6, i24, i54);
                    System.arraycopy(iArr2, i26, iArr7, i24, i54);
                } else {
                    iArr8 = iArr5;
                }
                int i55 = i25;
                while (i26 < i27) {
                    int i56 = i22;
                    int[] iArr14 = iArr8;
                    long[] jArr17 = jArr2;
                    int i57 = i27;
                    long j15 = j5;
                    jArr8[i24] = Util6.m3104M(j5, 1000000L, track2.f7981d) + Util6.m3104M(Math.max(0L, jArr2[i26] - j6), 1000000L, track2.f7980c);
                    if (!z6 && iArr6[i24] > i55) {
                        i55 = iArr14[i26];
                    }
                    i24++;
                    i26++;
                    iArr8 = iArr14;
                    j5 = j15;
                    jArr2 = jArr17;
                    i27 = i57;
                    i22 = i56;
                }
                int i58 = i22;
                iArr5 = iArr8;
                j5 += track2.f7985h[i58];
                i22 = i58 + 1;
                i25 = i55;
                jArr2 = jArr2;
                iArr3 = iArr13;
                iArr4 = iArr4;
                jArr = jArr;
            }
            return new TrackSampleTable(track, jArr7, iArr6, i25, jArr8, iArr7, Util6.m3104M(j5, 1000000L, track2.f7981d));
        }
        iM3217v2 = 0;
        iM3217v3 = -1;
        iMo3817a = eVar.mo3817a();
        String str3 = track.f7983f.f6934q;
        if (iMo3817a == -1) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (z2) {
            i29 = aVar2.f7859a;
            jArr9 = new long[i29];
            iArr9 = new int[i29];
            while (aVar2.m3816a()) {
                int i310 = aVar2.f7860b;
                jArr9[i310] = aVar2.f7862d;
                iArr9[i310] = aVar2.f7861c;
            }
            j8 = iM3217v9;
            i30 = 8192 / iMo3817a;
            iM3119g = 0;
            while (i31 < i29) {
                iM3119g += Util6.m3119g(iArr9[i31], i30);
            }
            jArr10 = new long[iM3119g];
            iArr10 = new int[iM3119g];
            jArr11 = new long[iM3119g];
            iArr11 = new int[iM3119g];
            i32 = 0;
            i33 = 0;
            i34 = 0;
            i35 = 0;
            while (i32 < i29) {
                int i311 = iArr9[i32];
                j9 = jArr9[i32];
                int i410 = i35;
                int i411 = i29;
                iMax = i34;
                i36 = i410;
                long[] jArr18 = jArr9;
                i37 = i311;
                while (i37 > 0) {
                    int iMin2 = Math.min(i30, i37);
                    jArr10[i36] = j9;
                    iArr10[i36] = iMo3817a * iMin2;
                    iMax = Math.max(iMax, iArr10[i36]);
                    jArr11[i36] = ((long) i33) * j8;
                    iArr11[i36] = 1;
                    j9 += (long) iArr10[i36];
                    i33 += iMin2;
                    i37 -= iMin2;
                    i36++;
                    i30 = i30;
                    jArr10 = jArr10;
                    iArr9 = iArr9;
                }
                i32++;
                jArr9 = jArr18;
                iArr9 = iArr9;
                int i412 = i36;
                i34 = iMax;
                i29 = i411;
                i35 = i412;
            }
            long j16 = j8 * ((long) i33);
            track2 = track;
            i11 = iMo3818b;
            jArr = jArr10;
            iArr2 = iArr11;
            iArr = iArr10;
            jArr2 = jArr11;
            i10 = i34;
            j4 = j16;
        } else {
            jArrCopyOf = new long[iMo3818b];
            iArrCopyOf = new int[iMo3818b];
            jArrCopyOf2 = new long[iMo3818b];
            int i413 = iM3217v2;
            iArrCopyOf2 = new int[iMo3818b];
            i = 0;
            j2 = 0;
            j3 = 0;
            i2 = iM3217v3;
            i3 = 0;
            i4 = 0;
            iM3201f = 0;
            iM3217v4 = 0;
            iM3201f2 = iM3217v9;
            int i414 = iM3217v;
            i5 = iM3217v8;
            i6 = iM3217v7;
            i7 = i413;
            i8 = i414;
            while (i3 < iMo3818b) {
                zM3816a = true;
                while (i == 0) {
                    zM3816a = aVar2.m3816a();
                    if (zM3816a) {
                        break;
                        break;
                    }
                    j2 = aVar2.f7862d;
                    iMo3818b = iMo3818b;
                    i = aVar2.f7861c;
                    i2 = i2;
                }
                i12 = i2;
                i13 = iMo3818b;
                if (!zM3816a) {
                    Log.w("AtomParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i3);
                    iMo3818b = i3;
                    break;
                }
                if (parsableByteArray5 != null) {
                    while (iM3217v4 == 0) {
                        iM3217v4 = parsableByteArray5.m3217v();
                        iM3201f = parsableByteArray5.m3201f();
                        i8--;
                    }
                    iM3217v4--;
                }
                int i415 = iM3201f;
                jArrCopyOf[i3] = j2;
                iArrCopyOf[i3] = eVar.mo3819c();
                if (iArrCopyOf[i3] > i4) {
                    i4 = iArrCopyOf[i3];
                }
                b bVar2 = eVar;
                jArrCopyOf2[i3] = j3 + ((long) i415);
                if (parsableByteArray4 == null) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                iArrCopyOf2[i3] = i14;
                iM3217v5 = i12;
                if (i3 == iM3217v5) {
                    iArrCopyOf2[i3] = 1;
                    i7--;
                    if (i7 > 0) {
                        Objects.requireNonNull(parsableByteArray4);
                        iM3217v5 = parsableByteArray4.m3217v() - 1;
                    }
                }
                int i416 = iM3217v5;
                j3 += (long) iM3201f2;
                i15 = i5 - 1;
                if (i15 == 0) {
                    iM3217v6 = i15;
                    i16 = i6;
                } else {
                    iM3217v6 = i15;
                    i16 = i6;
                }
                int i417 = iM3217v6;
                j2 += (long) iArrCopyOf[i3];
                i--;
                i3++;
                iM3201f = i415;
                i2 = i416;
                eVar = bVar2;
                iMo3818b = i13;
                int i418 = i16;
                i5 = i417;
                i6 = i418;
            }
            int i419 = i;
            long j17 = j3 + ((long) iM3201f);
            if (parsableByteArray5 != null) {
                z3 = true;
                break;
            }
            while (true) {
                if (i8 > 0) {
                    z3 = true;
                    break;
                }
                if (parsableByteArray5.m3217v() != 0) {
                    z3 = false;
                    break;
                }
                parsableByteArray5.m3201f();
                i8--;
            }
            if (i7 != 0) {
                i9 = iM3217v4;
                StringBuilder sbM1556G2 = outline.m1556G("Inconsistent stbl box for track ");
                track2 = track;
                sbM1556G2.append(track2.f7978a);
                sbM1556G2.append(": remainingSynchronizationSamples ");
                sbM1556G2.append(i7);
                sbM1556G2.append(", remainingSamplesAtTimestampDelta ");
                sbM1556G2.append(i5);
                sbM1556G2.append(", remainingSamplesInChunk ");
                sbM1556G2.append(i419);
                sbM1556G2.append(", remainingTimestampDeltaChanges ");
                sbM1556G2.append(i6);
                sbM1556G2.append(", remainingSamplesAtTimestampOffset ");
                sbM1556G2.append(i9);
                if (z3) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                outline.m1571V(sbM1556G2, str, "AtomParsers");
            } else {
                i9 = iM3217v4;
                StringBuilder sbM1556G3 = outline.m1556G("Inconsistent stbl box for track ");
                track2 = track;
                sbM1556G3.append(track2.f7978a);
                sbM1556G3.append(": remainingSynchronizationSamples ");
                sbM1556G3.append(i7);
                sbM1556G3.append(", remainingSamplesAtTimestampDelta ");
                sbM1556G3.append(i5);
                sbM1556G3.append(", remainingSamplesInChunk ");
                sbM1556G3.append(i419);
                sbM1556G3.append(", remainingTimestampDeltaChanges ");
                sbM1556G3.append(i6);
                sbM1556G3.append(", remainingSamplesAtTimestampOffset ");
                sbM1556G3.append(i9);
                if (z3) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                outline.m1571V(sbM1556G3, str, "AtomParsers");
            }
            jArr = jArrCopyOf;
            i10 = i4;
            iArr = iArrCopyOf;
            i11 = iMo3818b;
            j4 = j17;
            long[] jArr19 = jArrCopyOf2;
            iArr2 = iArrCopyOf2;
            jArr2 = jArr19;
        }
        jM3104M = Util6.m3104M(j4, 1000000L, track2.f7980c);
        jArr3 = track2.f7985h;
        if (jArr3 == null) {
            Util6.m3105N(jArr2, 1000000L, track2.f7980c);
            return new TrackSampleTable(track, jArr, iArr, i10, jArr2, iArr2, jM3104M);
        }
        if (jArr3.length == 1) {
            i17 = i11;
        } else {
            i17 = i11;
        }
        jArr4 = track2.f7985h;
        if (jArr4.length != 1) {
        }
        if (track2.f7979b == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        iArr3 = new int[jArr4.length];
        iArr4 = new int[jArr4.length];
        jArr5 = track2.f7986i;
        Objects.requireNonNull(jArr5);
        i18 = 0;
        i19 = 0;
        i20 = 0;
        z5 = false;
        while (true) {
            jArr6 = track2.f7985h;
            if (i18 < jArr6.length) {
                break;
                break;
            }
            int[] iArr15 = iArr;
            int i59 = i10;
            j7 = jArr5[i18];
            if (j7 != -1) {
                i28 = i20;
                boolean z9 = z5;
                long jM3104M6 = Util6.m3104M(jArr6[i18], track2.f7980c, track2.f7981d);
                iArr3[i18] = Util6.m3118f(jArr2, j7, true, true);
                iArr4[i18] = Util6.m3114b(jArr2, j7 + jM3104M6, z4, false);
                while (iArr3[i18] < iArr4[i18]) {
                    iArr3[i18] = iArr3[i18] + 1;
                }
                int i510 = (iArr4[i18] - iArr3[i18]) + i19;
                if (i28 != iArr3[i18]) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z5 = z7 | z9;
                i20 = iArr4[i18];
                i19 = i510;
            }
            i18++;
            iArr = iArr15;
            i10 = i59;
        }
        iArr5 = iArr;
        i21 = i10;
        i22 = 0;
        z6 = z5 | (i19 != i17);
        if (z6) {
            jArr7 = new long[i19];
        } else {
            jArr7 = jArr;
        }
        if (z6) {
            iArr6 = new int[i19];
        } else {
            iArr6 = iArr5;
        }
        if (z6) {
            i23 = 0;
        } else {
            i23 = i21;
        }
        if (z6) {
            iArr7 = new int[i19];
        } else {
            iArr7 = iArr2;
        }
        jArr8 = new long[i19];
        i24 = 0;
        j5 = 0;
        i25 = i23;
        while (i22 < track2.f7985h.length) {
            j6 = track2.f7986i[i22];
            i26 = iArr3[i22];
            int[] iArr16 = iArr3;
            i27 = iArr4[i22];
            if (z6) {
                int i511 = i27 - i26;
                System.arraycopy(jArr, i26, jArr7, i24, i511);
                iArr8 = iArr5;
                System.arraycopy(iArr8, i26, iArr6, i24, i511);
                System.arraycopy(iArr2, i26, iArr7, i24, i511);
            } else {
                iArr8 = iArr5;
            }
            int i512 = i25;
            while (i26 < i27) {
                int i513 = i22;
                int[] iArr17 = iArr8;
                long[] jArr110 = jArr2;
                int i514 = i27;
                long j18 = j5;
                jArr8[i24] = Util6.m3104M(j5, 1000000L, track2.f7981d) + Util6.m3104M(Math.max(0L, jArr2[i26] - j6), 1000000L, track2.f7980c);
                if (!z6) {
                }
                i24++;
                i26++;
                iArr8 = iArr17;
                j5 = j18;
                jArr2 = jArr110;
                i27 = i514;
                i22 = i513;
            }
            int i515 = i22;
            iArr5 = iArr8;
            j5 += track2.f7985h[i515];
            i22 = i515 + 1;
            i25 = i512;
            jArr2 = jArr2;
            iArr3 = iArr16;
            iArr4 = iArr4;
            jArr = jArr;
        }
        return new TrackSampleTable(track, jArr7, iArr6, i25, jArr8, iArr7, Util6.m3104M(j5, 1000000L, track2.f7981d));
    }

    /* JADX WARN: Code duplicated, block: B:303:0x0531  */
    /* JADX WARN: Code duplicated, block: B:305:0x053a  */
    /* JADX WARN: Code duplicated, block: B:306:0x0540  */
    /* JADX WARN: Code duplicated, block: B:309:0x0553  */
    /* JADX WARN: Code duplicated, block: B:315:0x056a  */
    /* JADX WARN: Code duplicated, block: B:317:0x058f  */
    /* JADX WARN: Code duplicated, block: B:319:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:321:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:323:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:334:0x060d  */
    /* JADX WARN: Code duplicated, block: B:336:0x062a  */
    /* JADX WARN: Code duplicated, block: B:338:0x0631  */
    /* JADX WARN: Code duplicated, block: B:340:0x0648  */
    /* JADX WARN: Code duplicated, block: B:341:0x064c  */
    /* JADX WARN: Code duplicated, block: B:343:0x0669  */
    /* JADX WARN: Code duplicated, block: B:345:0x066e  */
    /* JADX WARN: Code duplicated, block: B:346:0x0684  */
    /* JADX WARN: Code duplicated, block: B:348:0x0689  */
    /* JADX WARN: Code duplicated, block: B:349:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:351:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:352:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:354:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:357:0x0735  */
    /* JADX WARN: Code duplicated, block: B:359:0x0740  */
    /* JADX WARN: Code duplicated, block: B:360:0x0744  */
    /* JADX WARN: Code duplicated, block: B:363:0x074a  */
    /* JADX WARN: Code duplicated, block: B:365:0x0753  */
    /* JADX WARN: Code duplicated, block: B:366:0x0755  */
    /* JADX WARN: Code duplicated, block: B:370:0x0766 A[LOOP:4: B:361:0x0746->B:370:0x0766, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:373:0x0770  */
    /* JADX WARN: Code duplicated, block: B:375:0x077e  */
    /* JADX WARN: Code duplicated, block: B:377:0x0786  */
    /* JADX WARN: Code duplicated, block: B:378:0x0791  */
    /* JADX WARN: Code duplicated, block: B:380:0x0798  */
    /* JADX WARN: Code duplicated, block: B:382:0x079c  */
    /* JADX WARN: Code duplicated, block: B:389:0x07de  */
    /* JADX WARN: Code duplicated, block: B:391:0x080f  */
    /* JADX WARN: Code duplicated, block: B:393:0x0819  */
    /* JADX WARN: Code duplicated, block: B:395:0x0825  */
    /* JADX WARN: Code duplicated, block: B:396:0x0827  */
    /* JADX WARN: Code duplicated, block: B:398:0x083a  */
    /* JADX WARN: Code duplicated, block: B:400:0x0841  */
    /* JADX WARN: Code duplicated, block: B:403:0x084d  */
    /* JADX WARN: Code duplicated, block: B:404:0x0850  */
    /* JADX WARN: Code duplicated, block: B:408:0x086a  */
    /* JADX WARN: Code duplicated, block: B:410:0x0879  */
    /* JADX WARN: Code duplicated, block: B:414:0x0882  */
    /* JADX WARN: Code duplicated, block: B:415:0x0884  */
    /* JADX WARN: Code duplicated, block: B:418:0x0893 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:419:0x0895  */
    /* JADX WARN: Code duplicated, block: B:420:0x0897  */
    /* JADX WARN: Code duplicated, block: B:423:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:425:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:427:0x08b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:428:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:429:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:431:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:433:0x08db  */
    /* JADX WARN: Code duplicated, block: B:502:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:504:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:510:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:511:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:515:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:517:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:519:0x0a54  */
    /* JADX WARN: Code duplicated, block: B:520:0x0a56  */
    /* JADX WARN: Code duplicated, block: B:522:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:524:0x0a73  */
    /* JADX WARN: Code duplicated, block: B:525:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:528:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:529:0x0a85  */
    /* JADX WARN: Code duplicated, block: B:532:0x0aa7 A[LOOP:7: B:521:0x0a6e->B:532:0x0aa7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:537:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:538:0x0ac5  */
    /* JADX WARN: Code duplicated, block: B:544:0x0ad3  */
    /* JADX WARN: Code duplicated, block: B:547:0x0b08  */
    /* JADX WARN: Code duplicated, block: B:548:0x0b0d  */
    /* JADX WARN: Code duplicated, block: B:553:0x0aae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x0764 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:0x076a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x09e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0128  */
    /* JADX WARN: Code duplicated, block: B:72:0x0137  */
    /* JADX WARN: Code duplicated, block: B:73:0x013c  */
    /* JADX WARN: Code duplicated, block: B:76:0x014f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0152  */
    /* JADX WARN: Code duplicated, block: B:81:0x0165  */
    /* JADX WARN: Code duplicated, block: B:84:0x019f  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:89:0x01af  */
    /* JADX WARN: Code duplicated, block: B:92:0x020b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0215  */
    /* JADX WARN: Code duplicated, block: B:95:0x021d  */
    /* JADX INFO: renamed from: e */
    public static List<TrackSampleTable> m3815e(Atom.a aVar, GaplessInfoHolder gaplessInfoHolder, long j2, DrmInitData drmInitData, boolean z, boolean z2, Function<Track, Track> function) throws ParserException {
        int i;
        boolean z3;
        long jM3215t;
        int iM3201f;
        int i2;
        f fVar;
        long j3;
        ParsableByteArray parsableByteArray;
        int i3;
        long jM3215t2;
        long jM3104M;
        int iM3201f2;
        int i4;
        int i5;
        Pair pairCreate;
        ParsableByteArray parsableByteArray2;
        int i6;
        int i7;
        String str;
        int iM3201f3;
        c cVar;
        int i8;
        ArrayList arrayList;
        int i9;
        Atom.a aVar2;
        f fVar2;
        int i10;
        long j4;
        Pair pair;
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        Track track;
        Atom.a aVarM3809b;
        Atom.b bVarM3810c;
        ParsableByteArray parsableByteArray3;
        int iM3201f4;
        int iM3217v;
        long[] jArr4;
        long[] jArr5;
        int i11;
        Pair pairCreate2;
        long jM3215t3;
        long jM3201f;
        byte[] bArr;
        int i12;
        int i13;
        int i14;
        int iM3201f5;
        boolean z4;
        int iM3201f6;
        Atom.a aVar3;
        Pair pair2;
        int i15;
        int i16;
        int i17;
        Object obj;
        int iM3219x;
        int iM3219x2;
        int i18;
        int i19;
        int i20;
        DrmInitData drmInitDataM3687a;
        String str2;
        float fM3217v;
        int i21;
        boolean z5;
        List<byte[]> list;
        String str3;
        DrmInitData drmInitData2;
        String str4;
        byte[] bArr2;
        byte[] bArr3;
        int i22;
        int i23;
        int i24;
        int iM3201f7;
        boolean z6;
        int iM3201f8;
        int i25;
        DolbyVisionConfig dolbyVisionConfigM3258a;
        int i26;
        List<byte[]> listM11637B;
        byte[] bArrCopyOfRange;
        boolean z7;
        boolean z8;
        AvcConfig avcConfigM3257b;
        Pair<Integer, TrackEncryptionBox> pairM3813c;
        int iM3219x3;
        int iRound;
        int iM3217v2;
        DrmInitData drmInitDataM3687a2;
        String str5;
        int i27;
        String str6;
        List<byte[]> listM11637B2;
        int i28;
        String str7;
        int iIntValue;
        int i29;
        int iIntValue2;
        int i30;
        String str8;
        int i31;
        int i32;
        int iM3201f9;
        boolean z9;
        int iM3201f10;
        int i33;
        String str9;
        int i34;
        int i35;
        int iM3201f11;
        boolean z10;
        String str10;
        byte[] bArr4;
        String str11;
        String str12;
        List<byte[]> listM11637B3;
        int i36;
        int iM3214s;
        int i37;
        String str13;
        int iM3214s2;
        int i38;
        ImmutableList2 immutableList2M11637B;
        long j5;
        Track trackApply;
        ArrayList arrayList2 = new ArrayList();
        int i39 = 0;
        while (i39 < aVar.f7856d.size()) {
            Atom.a aVar4 = aVar.f7856d.get(i39);
            if (aVar4.f7853a != 1953653099) {
                i9 = i39;
            } else {
                Atom.b bVarM3810c2 = aVar.m3810c(1836476516);
                Objects.requireNonNull(bVarM3810c2);
                Atom.a aVarM3809b2 = aVar4.m3809b(1835297121);
                Objects.requireNonNull(aVarM3809b2);
                Atom.b bVarM3810c3 = aVarM3809b2.m3810c(1751411826);
                Objects.requireNonNull(bVarM3810c3);
                ParsableByteArray parsableByteArray4 = bVarM3810c3.f7857b;
                parsableByteArray4.m3194D(16);
                int iM3201f12 = parsableByteArray4.m3201f();
                if (iM3201f12 == 1936684398) {
                    i = 1;
                } else if (iM3201f12 == 1986618469) {
                    i = 2;
                } else if (iM3201f12 == 1952807028 || iM3201f12 == 1935832172 || iM3201f12 == 1937072756 || iM3201f12 == 1668047728) {
                    i = 3;
                } else {
                    i = iM3201f12 == 1835365473 ? 5 : -1;
                }
                if (i == -1) {
                    arrayList = arrayList2;
                    i9 = i39;
                } else {
                    Atom.b bVarM3810c4 = aVar4.m3810c(1953196132);
                    Objects.requireNonNull(bVarM3810c4);
                    ParsableByteArray parsableByteArray5 = bVarM3810c4.f7857b;
                    parsableByteArray5.m3194D(8);
                    int iM3201f13 = (parsableByteArray5.m3201f() >> 24) & 255;
                    parsableByteArray5.m3195E(iM3201f13 == 0 ? 8 : 16);
                    int iM3201f14 = parsableByteArray5.m3201f();
                    parsableByteArray5.m3195E(4);
                    int i40 = parsableByteArray5.f6393b;
                    int i41 = iM3201f13 == 0 ? 4 : 8;
                    int i42 = 0;
                    while (true) {
                        if (i42 >= i41) {
                            z3 = true;
                            break;
                        }
                        if (parsableByteArray5.f6392a[i40 + i42] != -1) {
                            z3 = false;
                            break;
                        }
                        i42++;
                    }
                    if (z3) {
                        parsableByteArray5.m3195E(i41);
                    } else {
                        jM3215t = iM3201f13 == 0 ? parsableByteArray5.m3215t() : parsableByteArray5.m3218w();
                        if (jM3215t == 0) {
                        }
                        parsableByteArray5.m3195E(16);
                        iM3201f = parsableByteArray5.m3201f();
                        int iM3201f15 = parsableByteArray5.m3201f();
                        parsableByteArray5.m3195E(4);
                        int iM3201f16 = parsableByteArray5.m3201f();
                        int iM3201f17 = parsableByteArray5.m3201f();
                        if (iM3201f != 0 && iM3201f15 == 65536 && iM3201f16 == -65536 && iM3201f17 == 0) {
                            i2 = 90;
                        } else if (iM3201f != 0 && iM3201f15 == -65536 && iM3201f16 == 65536 && iM3201f17 == 0) {
                            i2 = 270;
                        } else if (iM3201f != -65536 && iM3201f15 == 0 && iM3201f16 == 0 && iM3201f17 == -65536) {
                            i2 = 180;
                        } else {
                            i2 = 0;
                        }
                        fVar = new f(iM3201f14, jM3215t, i2);
                        if (j2 == -9223372036854775807L) {
                            j3 = fVar.f7881b;
                        } else {
                            j3 = j2;
                        }
                        parsableByteArray = bVarM3810c2.f7857b;
                        parsableByteArray.m3194D(8);
                        if (((parsableByteArray.m3201f() >> 24) & 255) == 0) {
                            i3 = 8;
                        } else {
                            i3 = 16;
                        }
                        parsableByteArray.m3195E(i3);
                        jM3215t2 = parsableByteArray.m3215t();
                        jM3104M = j3 != -9223372036854775807L ? Util6.m3104M(j3, 1000000L, jM3215t2) : -9223372036854775807L;
                        Atom.a aVarM3809b3 = aVarM3809b2.m3809b(1835626086);
                        Objects.requireNonNull(aVarM3809b3);
                        Atom.a aVarM3809b4 = aVarM3809b3.m3809b(1937007212);
                        Objects.requireNonNull(aVarM3809b4);
                        Atom.b bVarM3810c5 = aVarM3809b2.m3810c(1835296868);
                        Objects.requireNonNull(bVarM3810c5);
                        ParsableByteArray parsableByteArray6 = bVarM3810c5.f7857b;
                        parsableByteArray6.m3194D(8);
                        iM3201f2 = (parsableByteArray6.m3201f() >> 24) & 255;
                        if (iM3201f2 == 0) {
                            i4 = 8;
                        } else {
                            i4 = 16;
                        }
                        parsableByteArray6.m3195E(i4);
                        long jM3215t4 = parsableByteArray6.m3215t();
                        if (iM3201f2 == 0) {
                            i5 = 4;
                        } else {
                            i5 = 8;
                        }
                        parsableByteArray6.m3195E(i5);
                        int iM3219x4 = parsableByteArray6.m3219x();
                        StringBuilder sbM1556G = outline.m1556G("");
                        sbM1556G.append((char) (((iM3219x4 >> 10) & 31) + 96));
                        sbM1556G.append((char) (((iM3219x4 >> 5) & 31) + 96));
                        sbM1556G.append((char) ((iM3219x4 & 31) + 96));
                        pairCreate = Pair.create(Long.valueOf(jM3215t4), sbM1556G.toString());
                        Atom.b bVarM3810c6 = aVarM3809b4.m3810c(1937011556);
                        Objects.requireNonNull(bVarM3810c6);
                        parsableByteArray2 = bVarM3810c6.f7857b;
                        i6 = fVar.f7880a;
                        i7 = fVar.f7882c;
                        str = (String) pairCreate.second;
                        parsableByteArray2.m3194D(12);
                        iM3201f3 = parsableByteArray2.m3201f();
                        cVar = new c(iM3201f3);
                        i8 = 0;
                        while (i8 < iM3201f3) {
                            i14 = parsableByteArray2.f6393b;
                            int i43 = iM3201f3;
                            iM3201f5 = parsableByteArray2.m3201f();
                            if (iM3201f5 > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            String str14 = "childAtomSize should be positive";
                            C2096e.m4571g(z4, "childAtomSize should be positive");
                            iM3201f6 = parsableByteArray2.m3201f();
                            long j6 = jM3215t2;
                            if (iM3201f6 != 1635148593 || iM3201f6 == 1635148595 || iM3201f6 == 1701733238 || iM3201f6 == 1831958048 || iM3201f6 == 1836070006 || iM3201f6 == 1752589105 || iM3201f6 == 1751479857 || iM3201f6 == 1932670515 || iM3201f6 == 1987063864 || iM3201f6 == 1987063865 || iM3201f6 == 1635135537 || iM3201f6 == 1685479798 || iM3201f6 == 1685479729 || iM3201f6 == 1685481573 || iM3201f6 == 1685481521) {
                                aVar3 = aVar4;
                                pair2 = pairCreate;
                                fVar = fVar;
                                i15 = i7;
                                i16 = i;
                                i17 = i8;
                                obj = "childAtomSize should be positive";
                                parsableByteArray2.m3194D(i14 + 8 + 8);
                                parsableByteArray2.m3195E(16);
                                iM3219x = parsableByteArray2.m3219x();
                                iM3219x2 = parsableByteArray2.m3219x();
                                parsableByteArray2.m3195E(50);
                                i18 = parsableByteArray2.f6393b;
                                if (iM3201f6 == 1701733238) {
                                    i19 = i14;
                                    i20 = iM3201f5;
                                    pairM3813c = m3813c(parsableByteArray2, i19, i20);
                                    if (pairM3813c != null) {
                                        iM3201f6 = ((Integer) pairM3813c.first).intValue();
                                        if (drmInitData == null) {
                                            drmInitDataM3687a = null;
                                        } else {
                                            drmInitDataM3687a = drmInitData.m3687a(((TrackEncryptionBox) pairM3813c.second).f7990b);
                                        }
                                        cVar.f7868a[i17] = (TrackEncryptionBox) pairM3813c.second;
                                    } else {
                                        drmInitDataM3687a = drmInitData;
                                    }
                                    parsableByteArray2.m3194D(i18);
                                } else {
                                    i19 = i14;
                                    i20 = iM3201f5;
                                    drmInitDataM3687a = drmInitData;
                                }
                                if (iM3201f6 == 1831958048) {
                                    str2 = "video/mpeg";
                                } else {
                                    str2 = null;
                                }
                                fM3217v = 1.0f;
                                i21 = -1;
                                z5 = false;
                                list = null;
                                str3 = null;
                                drmInitData2 = drmInitDataM3687a;
                                str4 = str;
                                bArr2 = null;
                                while (true) {
                                    if (i18 - i19 >= i20) {
                                        bArr3 = bArr2;
                                        i22 = i21;
                                        break;
                                    }
                                    parsableByteArray2.m3194D(i18);
                                    i24 = parsableByteArray2.f6393b;
                                    i22 = i21;
                                    iM3201f7 = parsableByteArray2.m3201f();
                                    bArr3 = bArr2;
                                    if (iM3201f7 != 0 && parsableByteArray2.f6393b - i19 == i20) {
                                        break;
                                    }
                                    if (iM3201f7 > 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    C2096e.m4571g(z6, obj);
                                    iM3201f8 = parsableByteArray2.m3201f();
                                    Object obj2 = obj;
                                    if (iM3201f8 == 1635148611) {
                                        if (str2 == null) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        C2096e.m4570f(z8);
                                        parsableByteArray2.m3194D(i24 + 8);
                                        avcConfigM3257b = AvcConfig.m3257b(parsableByteArray2);
                                        listM11637B = avcConfigM3257b.f6434a;
                                        cVar.f7870c = avcConfigM3257b.f6435b;
                                        if (!z5) {
                                            fM3217v = avcConfigM3257b.f6438e;
                                        }
                                        str3 = avcConfigM3257b.f6439f;
                                        str2 = "video/avc";
                                    } else if (iM3201f8 == 1752589123) {
                                        if (str2 == null) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        C2096e.m4570f(z7);
                                        parsableByteArray2.m3194D(i24 + 8);
                                        HevcConfig hevcConfigM3268a = HevcConfig.m3268a(parsableByteArray2);
                                        listM11637B = hevcConfigM3268a.f6468a;
                                        cVar.f7870c = hevcConfigM3268a.f6469b;
                                        str3 = hevcConfigM3268a.f6470c;
                                        str2 = "video/hevc";
                                    } else {
                                        if (iM3201f8 != 1685480259 || iM3201f8 == 1685485123) {
                                            i25 = iM3201f6;
                                            dolbyVisionConfigM3258a = DolbyVisionConfig.m3258a(parsableByteArray2);
                                            if (dolbyVisionConfigM3258a != null) {
                                                str3 = dolbyVisionConfigM3258a.f6445a;
                                                str2 = "video/dolby-vision";
                                            }
                                        } else {
                                            if (iM3201f8 == 1987076931) {
                                                C2096e.m4570f(str2 == null);
                                                str2 = iM3201f6 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            } else if (iM3201f8 == 1635135811) {
                                                C2096e.m4570f(str2 == null);
                                                str2 = "video/av01";
                                            } else {
                                                if (iM3201f8 == 1681012275) {
                                                    C2096e.m4570f(str2 == null);
                                                    str2 = "video/3gpp";
                                                } else if (iM3201f8 == 1702061171) {
                                                    C2096e.m4570f(str2 == null);
                                                    Pair<String, byte[]> pairM3811a = m3811a(parsableByteArray2, i24);
                                                    String str15 = (String) pairM3811a.first;
                                                    byte[] bArr5 = (byte[]) pairM3811a.second;
                                                    listM11637B = bArr5 != null ? ImmutableList2.m11637B(bArr5) : list;
                                                    str2 = str15;
                                                } else if (iM3201f8 == 1885434736) {
                                                    parsableByteArray2.m3194D(i24 + 8);
                                                    i25 = iM3201f6;
                                                    fM3217v = parsableByteArray2.m3217v() / parsableByteArray2.m3217v();
                                                    i26 = i22;
                                                    bArr2 = bArr3;
                                                    z5 = true;
                                                } else {
                                                    if (iM3201f8 == 1937126244) {
                                                        int i44 = i24 + 8;
                                                        while (true) {
                                                            if (i44 - i24 >= iM3201f7) {
                                                                i25 = iM3201f6;
                                                                bArrCopyOfRange = null;
                                                                break;
                                                            }
                                                            parsableByteArray2.m3194D(i44);
                                                            int iM3201f18 = parsableByteArray2.m3201f();
                                                            i25 = iM3201f6;
                                                            int i45 = i24;
                                                            if (parsableByteArray2.m3201f() == 1886547818) {
                                                                bArrCopyOfRange = Arrays.copyOfRange(parsableByteArray2.f6392a, i44, iM3201f18 + i44);
                                                                break;
                                                            }
                                                            i44 += iM3201f18;
                                                            iM3201f6 = i25;
                                                            i24 = i45;
                                                        }
                                                        bArr2 = bArrCopyOfRange;
                                                        listM11637B = list;
                                                    } else {
                                                        i25 = iM3201f6;
                                                        if (iM3201f8 == 1936995172) {
                                                            int iM3214s3 = parsableByteArray2.m3214s();
                                                            parsableByteArray2.m3195E(3);
                                                            if (iM3214s3 == 0) {
                                                                int iM3214s4 = parsableByteArray2.m3214s();
                                                                if (iM3214s4 == 0) {
                                                                    i26 = 0;
                                                                } else if (iM3214s4 == 1) {
                                                                    i26 = 1;
                                                                } else if (iM3214s4 == 2) {
                                                                    i26 = 2;
                                                                } else if (iM3214s4 == 3) {
                                                                    i26 = 3;
                                                                }
                                                                bArr2 = bArr3;
                                                            }
                                                        }
                                                        listM11637B = list;
                                                        bArr2 = bArr3;
                                                    }
                                                    list = listM11637B;
                                                    i26 = i22;
                                                }
                                                i18 += iM3201f7;
                                                i21 = i26;
                                                obj = obj2;
                                                iM3201f6 = i25;
                                            }
                                            listM11637B = list;
                                        }
                                        i26 = i22;
                                        bArr2 = bArr3;
                                        i18 += iM3201f7;
                                        i21 = i26;
                                        obj = obj2;
                                        iM3201f6 = i25;
                                    }
                                    i25 = iM3201f6;
                                    bArr2 = bArr3;
                                    list = listM11637B;
                                    i26 = i22;
                                    i18 += iM3201f7;
                                    i21 = i26;
                                    obj = obj2;
                                    iM3201f6 = i25;
                                }
                                if (str2 == null) {
                                    i23 = i15;
                                } else {
                                    Format.b bVarM1582d = outline.m1582d(i6);
                                    bVarM1582d.f6958k = str2;
                                    bVarM1582d.f6955h = str3;
                                    bVarM1582d.f6963p = iM3219x;
                                    bVarM1582d.f6964q = iM3219x2;
                                    bVarM1582d.f6967t = fM3217v;
                                    i23 = i15;
                                    bVarM1582d.f6966s = i23;
                                    bVarM1582d.f6968u = bArr3;
                                    bVarM1582d.f6969v = i22;
                                    bVarM1582d.f6960m = list;
                                    bVarM1582d.f6961n = drmInitData2;
                                    cVar.f7869b = bVarM1582d.m3519a();
                                }
                            } else {
                                i16 = i;
                                if (iM3201f6 == 1836069985 || iM3201f6 == 1701733217 || iM3201f6 == 1633889587 || iM3201f6 == 1700998451 || iM3201f6 == 1633889588 || iM3201f6 == 1685353315 || iM3201f6 == 1685353317 || iM3201f6 == 1685353320 || iM3201f6 == 1685353324 || iM3201f6 == 1935764850 || iM3201f6 == 1935767394 || iM3201f6 == 1819304813 || iM3201f6 == 1936684916 || iM3201f6 == 1953984371 || iM3201f6 == 778924082 || iM3201f6 == 778924083 || iM3201f6 == 1634492771 || iM3201f6 == 1634492791 || iM3201f6 == 1970037111 || iM3201f6 == 1332770163 || iM3201f6 == 1716281667) {
                                    pair2 = pairCreate;
                                    aVar3 = aVar4;
                                    parsableByteArray2.m3194D(i14 + 8 + 8);
                                    if (z2) {
                                        iM3219x3 = parsableByteArray2.m3219x();
                                        parsableByteArray2.m3195E(6);
                                    } else {
                                        parsableByteArray2.m3195E(8);
                                        iM3219x3 = 0;
                                    }
                                    if (iM3219x3 == 0 || iM3219x3 == 1) {
                                        int iM3219x5 = parsableByteArray2.m3219x();
                                        parsableByteArray2.m3195E(6);
                                        byte[] bArr6 = parsableByteArray2.f6392a;
                                        int i46 = parsableByteArray2.f6393b;
                                        int i47 = i46 + 1;
                                        parsableByteArray2.f6393b = i47;
                                        int i48 = (bArr6[i46] & 255) << 8;
                                        int i49 = i47 + 1;
                                        parsableByteArray2.f6393b = i49;
                                        iRound = i48 | (bArr6[i47] & 255);
                                        parsableByteArray2.f6393b = i49 + 2;
                                        if (iM3219x3 == 1) {
                                            parsableByteArray2.m3195E(16);
                                        }
                                        iM3217v2 = iM3219x5;
                                    } else if (iM3219x3 == 2) {
                                        parsableByteArray2.m3195E(16);
                                        iRound = (int) Math.round(Double.longBitsToDouble(parsableByteArray2.m3208m()));
                                        iM3217v2 = parsableByteArray2.m3217v();
                                        parsableByteArray2.m3195E(20);
                                    }
                                    int i50 = parsableByteArray2.f6393b;
                                    if (iM3201f6 == 1701733217) {
                                        Pair<Integer, TrackEncryptionBox> pairM3813c2 = m3813c(parsableByteArray2, i14, iM3201f5);
                                        if (pairM3813c2 != null) {
                                            int iIntValue3 = ((Integer) pairM3813c2.first).intValue();
                                            drmInitDataM3687a2 = drmInitData == null ? null : drmInitData.m3687a(((TrackEncryptionBox) pairM3813c2.second).f7990b);
                                            cVar.f7868a[i8] = (TrackEncryptionBox) pairM3813c2.second;
                                            iM3201f6 = iIntValue3;
                                        } else {
                                            drmInitDataM3687a2 = drmInitData;
                                        }
                                        parsableByteArray2.m3194D(i50);
                                    } else {
                                        drmInitDataM3687a2 = drmInitData;
                                    }
                                    int i51 = iM3217v2;
                                    String str16 = "audio/ac3";
                                    int i52 = iRound;
                                    String str17 = "audio/raw";
                                    if (iM3201f6 == 1633889587) {
                                        str17 = "audio/ac3";
                                    } else if (iM3201f6 == 1700998451) {
                                        str17 = "audio/eac3";
                                    } else if (iM3201f6 == 1633889588) {
                                        str17 = "audio/ac4";
                                    } else {
                                        if (iM3201f6 == 1685353315) {
                                            str5 = "audio/vnd.dts";
                                        } else if (iM3201f6 == 1685353320 || iM3201f6 == 1685353324) {
                                            str5 = "audio/vnd.dts.hd";
                                        } else if (iM3201f6 == 1685353317) {
                                            str5 = "audio/vnd.dts.hd;profile=lbr";
                                        } else if (iM3201f6 == 1935764850) {
                                            str5 = "audio/3gpp";
                                        } else if (iM3201f6 == 1935767394) {
                                            str5 = "audio/amr-wb";
                                        } else {
                                            if (iM3201f6 == 1819304813 || iM3201f6 == 1936684916) {
                                                i27 = 2;
                                            } else if (iM3201f6 == 1953984371) {
                                                i27 = 268435456;
                                            } else if (iM3201f6 == 778924082 || iM3201f6 == 778924083) {
                                                str5 = "audio/mpeg";
                                            } else if (iM3201f6 == 1634492771) {
                                                str5 = "audio/alac";
                                            } else if (iM3201f6 == 1634492791) {
                                                str5 = "audio/g711-alaw";
                                            } else if (iM3201f6 == 1970037111) {
                                                str5 = "audio/g711-mlaw";
                                            } else if (iM3201f6 == 1332770163) {
                                                str5 = "audio/opus";
                                            } else {
                                                str5 = iM3201f6 == 1716281667 ? "audio/flac" : null;
                                            }
                                            str6 = str17;
                                            listM11637B2 = null;
                                            i28 = i27;
                                            str7 = null;
                                            iIntValue = i51;
                                            i29 = i7;
                                            iIntValue2 = i52;
                                            i17 = i8;
                                            i30 = i50;
                                            while (i30 - i14 < iM3201f5) {
                                                parsableByteArray2.m3194D(i30);
                                                iM3201f9 = parsableByteArray2.m3201f();
                                                if (iM3201f9 > 0) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                C2096e.m4571g(z9, str14);
                                                iM3201f10 = parsableByteArray2.m3201f();
                                                int i53 = i14;
                                                if (iM3201f10 != 1702061171) {
                                                    if (z2 || iM3201f10 != 2002876005) {
                                                        if (iM3201f10 == 1684103987) {
                                                            parsableByteArray2.m3194D(i30 + 8);
                                                            String string = Integer.toString(i6);
                                                            int i54 = Ac3Util.f7087b[(parsableByteArray2.m3214s() & 192) >> 6];
                                                            iM3214s2 = parsableByteArray2.m3214s();
                                                            i38 = Ac3Util.f7089d[(iM3214s2 & 56) >> 3];
                                                            if ((iM3214s2 & 4) != 0) {
                                                                i38++;
                                                            }
                                                            str12 = str7;
                                                            int i55 = i38;
                                                            str11 = str14;
                                                            Format.b bVar = new Format.b();
                                                            bVar.f6948a = string;
                                                            bVar.f6958k = str16;
                                                            bVar.f6971x = i55;
                                                            bVar.f6972y = i54;
                                                            bVar.f6961n = drmInitDataM3687a2;
                                                            bVar.f6950c = str;
                                                            cVar.f7869b = bVar.m3519a();
                                                            str16 = str16;
                                                        } else {
                                                            str11 = str14;
                                                            str12 = str7;
                                                            if (iM3201f10 == 1684366131) {
                                                                parsableByteArray2.m3194D(i30 + 8);
                                                                String string2 = Integer.toString(i6);
                                                                parsableByteArray2.m3195E(2);
                                                                int i56 = Ac3Util.f7087b[(parsableByteArray2.m3214s() & 192) >> 6];
                                                                iM3214s = parsableByteArray2.m3214s();
                                                                i37 = Ac3Util.f7089d[(iM3214s & 14) >> 1];
                                                                if ((iM3214s & 1) != 0) {
                                                                    i37++;
                                                                }
                                                                if (((parsableByteArray2.m3214s() & 30) >> 1) > 0 && (parsableByteArray2.m3214s() & 2) != 0) {
                                                                    i37 += 2;
                                                                }
                                                                if (parsableByteArray2.m3196a() > 0 || (parsableByteArray2.m3214s() & 1) == 0) {
                                                                    str13 = "audio/eac3";
                                                                } else {
                                                                    str13 = "audio/eac3-joc";
                                                                }
                                                                Format.b bVar2 = new Format.b();
                                                                bVar2.f6948a = string2;
                                                                bVar2.f6958k = str13;
                                                                bVar2.f6971x = i37;
                                                                bVar2.f6972y = i56;
                                                                bVar2.f6961n = drmInitDataM3687a2;
                                                                bVar2.f6950c = str;
                                                                cVar.f7869b = bVar2.m3519a();
                                                            } else {
                                                                str16 = str16;
                                                                if (iM3201f10 == 1684103988) {
                                                                    parsableByteArray2.m3194D(i30 + 8);
                                                                    String string3 = Integer.toString(i6);
                                                                    parsableByteArray2.m3195E(1);
                                                                    if (((parsableByteArray2.m3214s() & 32) >> 5) == 1) {
                                                                        i36 = 48000;
                                                                    } else {
                                                                        i36 = 44100;
                                                                    }
                                                                    Format.b bVar3 = new Format.b();
                                                                    bVar3.f6948a = string3;
                                                                    bVar3.f6958k = "audio/ac4";
                                                                    bVar3.f6971x = 2;
                                                                    bVar3.f6972y = i36;
                                                                    bVar3.f6961n = drmInitDataM3687a2;
                                                                    bVar3.f6950c = str;
                                                                    cVar.f7869b = bVar3.m3519a();
                                                                } else if (iM3201f10 == 1684305011) {
                                                                    Format.b bVarM1582d2 = outline.m1582d(i6);
                                                                    bVarM1582d2.f6958k = str6;
                                                                    bVarM1582d2.f6971x = iIntValue;
                                                                    bVarM1582d2.f6972y = iIntValue2;
                                                                    bVarM1582d2.f6961n = drmInitDataM3687a2;
                                                                    bVarM1582d2.f6950c = str;
                                                                    cVar.f7869b = bVarM1582d2.m3519a();
                                                                } else if (iM3201f10 == 1682927731) {
                                                                    int i57 = iM3201f9 - 8;
                                                                    byte[] bArr7 = f7858a;
                                                                    byte[] bArrCopyOf = Arrays.copyOf(bArr7, bArr7.length + i57);
                                                                    parsableByteArray2.m3194D(i30 + 8);
                                                                    parsableByteArray2.m3200e(bArrCopyOf, bArr7.length, i57);
                                                                    listM11637B2 = C1095a.m2389e(bArrCopyOf);
                                                                } else if (iM3201f10 == 1684425825) {
                                                                    int i58 = iM3201f9 - 12;
                                                                    byte[] bArr8 = new byte[i58 + 4];
                                                                    bArr8[0] = 102;
                                                                    bArr8[1] = 76;
                                                                    bArr8[2] = 97;
                                                                    bArr8[3] = 67;
                                                                    parsableByteArray2.m3194D(i30 + 12);
                                                                    System.arraycopy(parsableByteArray2.f6392a, parsableByteArray2.f6393b, bArr8, 4, i58);
                                                                    parsableByteArray2.f6393b += i58;
                                                                    listM11637B2 = ImmutableList2.m11637B(bArr8);
                                                                } else {
                                                                    if (iM3201f10 == 1634492771) {
                                                                        int i59 = iM3201f9 - 12;
                                                                        byte[] bArr9 = new byte[i59];
                                                                        parsableByteArray2.m3194D(i30 + 12);
                                                                        System.arraycopy(parsableByteArray2.f6392a, parsableByteArray2.f6393b, bArr9, 0, i59);
                                                                        parsableByteArray2.f6393b += i59;
                                                                        ParsableByteArray parsableByteArray7 = new ParsableByteArray(bArr9);
                                                                        parsableByteArray7.m3194D(9);
                                                                        int iM3214s5 = parsableByteArray7.m3214s();
                                                                        parsableByteArray7.m3194D(20);
                                                                        Pair pairCreate3 = Pair.create(Integer.valueOf(parsableByteArray7.m3217v()), Integer.valueOf(iM3214s5));
                                                                        iIntValue2 = ((Integer) pairCreate3.first).intValue();
                                                                        iIntValue = ((Integer) pairCreate3.second).intValue();
                                                                        listM11637B3 = ImmutableList2.m11637B(bArr9);
                                                                    }
                                                                    listM11637B2 = listM11637B3;
                                                                    str7 = str12;
                                                                    str9 = str11;
                                                                }
                                                            }
                                                        }
                                                        listM11637B3 = listM11637B2;
                                                        listM11637B2 = listM11637B3;
                                                        str7 = str12;
                                                        str9 = str11;
                                                    } else {
                                                        i33 = 1702061171;
                                                    }
                                                    i30 += iM3201f9;
                                                    str14 = str9;
                                                    i14 = i53;
                                                    iM3201f5 = iM3201f5;
                                                    str16 = str16;
                                                } else {
                                                    i33 = 1702061171;
                                                }
                                                if (iM3201f10 == i33) {
                                                    i34 = i30;
                                                    str9 = str14;
                                                } else {
                                                    i34 = parsableByteArray2.f6393b;
                                                    while (true) {
                                                        if (i34 - i30 < iM3201f9) {
                                                            str9 = str14;
                                                            i35 = -1;
                                                            i34 = -1;
                                                            break;
                                                        }
                                                        parsableByteArray2.m3194D(i34);
                                                        iM3201f11 = parsableByteArray2.m3201f();
                                                        if (iM3201f11 > 0) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        str9 = str14;
                                                        C2096e.m4571g(z10, str9);
                                                        if (parsableByteArray2.m3201f() == 1702061171) {
                                                            i34 += iM3201f11;
                                                            str14 = str9;
                                                        }
                                                    }
                                                    if (i34 != i35) {
                                                        Pair<String, byte[]> pairM3811a2 = m3811a(parsableByteArray2, i34);
                                                        str10 = (String) pairM3811a2.first;
                                                        bArr4 = (byte[]) pairM3811a2.second;
                                                        if (bArr4 != null) {
                                                            if ("audio/mp4a-latm".equals(str10)) {
                                                                AacUtil.b bVarM3554e = AacUtil.m3554e(bArr4);
                                                                iIntValue2 = bVarM3554e.f7083a;
                                                                iIntValue = bVarM3554e.f7084b;
                                                                str7 = bVarM3554e.f7085c;
                                                            } else {
                                                                str7 = str7;
                                                            }
                                                            listM11637B2 = ImmutableList2.m11637B(bArr4);
                                                        } else {
                                                            str7 = str7;
                                                        }
                                                        str6 = str10;
                                                    } else {
                                                        str7 = str7;
                                                    }
                                                    i30 += iM3201f9;
                                                    str14 = str9;
                                                    i14 = i53;
                                                    iM3201f5 = iM3201f5;
                                                    str16 = str16;
                                                }
                                                i35 = -1;
                                                if (i34 != i35) {
                                                    Pair<String, byte[]> pairM3811a3 = m3811a(parsableByteArray2, i34);
                                                    str10 = (String) pairM3811a3.first;
                                                    bArr4 = (byte[]) pairM3811a3.second;
                                                    if (bArr4 != null) {
                                                        if ("audio/mp4a-latm".equals(str10)) {
                                                            AacUtil.b bVarM3554e2 = AacUtil.m3554e(bArr4);
                                                            iIntValue2 = bVarM3554e2.f7083a;
                                                            iIntValue = bVarM3554e2.f7084b;
                                                            str7 = bVarM3554e2.f7085c;
                                                        } else {
                                                            str7 = str7;
                                                        }
                                                        listM11637B2 = ImmutableList2.m11637B(bArr4);
                                                    } else {
                                                        str7 = str7;
                                                    }
                                                    str6 = str10;
                                                } else {
                                                    str7 = str7;
                                                }
                                                i30 += iM3201f9;
                                                str14 = str9;
                                                i14 = i53;
                                                iM3201f5 = iM3201f5;
                                                str16 = str16;
                                            }
                                            str8 = str7;
                                            i31 = iM3201f5;
                                            i32 = i14;
                                            if (cVar.f7869b == null && str6 != null) {
                                                Format.b bVarM1582d3 = outline.m1582d(i6);
                                                bVarM1582d3.f6958k = str6;
                                                bVarM1582d3.f6955h = str8;
                                                bVarM1582d3.f6971x = iIntValue;
                                                bVarM1582d3.f6972y = iIntValue2;
                                                bVarM1582d3.f6973z = i28;
                                                bVarM1582d3.f6960m = listM11637B2;
                                                bVarM1582d3.f6961n = drmInitDataM3687a2;
                                                bVarM1582d3.f6950c = str;
                                                cVar.f7869b = bVarM1582d3.m3519a();
                                            }
                                            str4 = str;
                                            i23 = i29;
                                            i19 = i32;
                                            i20 = i31;
                                        }
                                        str17 = str5;
                                    }
                                    i27 = -1;
                                    str6 = str17;
                                    listM11637B2 = null;
                                    i28 = i27;
                                    str7 = null;
                                    iIntValue = i51;
                                    i29 = i7;
                                    iIntValue2 = i52;
                                    i17 = i8;
                                    i30 = i50;
                                    while (i30 - i14 < iM3201f5) {
                                        parsableByteArray2.m3194D(i30);
                                        iM3201f9 = parsableByteArray2.m3201f();
                                        if (iM3201f9 > 0) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        C2096e.m4571g(z9, str14);
                                        iM3201f10 = parsableByteArray2.m3201f();
                                        int i510 = i14;
                                        if (iM3201f10 != 1702061171) {
                                            if (z2) {
                                            }
                                            if (iM3201f10 == 1684103987) {
                                                parsableByteArray2.m3194D(i30 + 8);
                                                String string4 = Integer.toString(i6);
                                                int i511 = Ac3Util.f7087b[(parsableByteArray2.m3214s() & 192) >> 6];
                                                iM3214s2 = parsableByteArray2.m3214s();
                                                i38 = Ac3Util.f7089d[(iM3214s2 & 56) >> 3];
                                                if ((iM3214s2 & 4) != 0) {
                                                    i38++;
                                                }
                                                str12 = str7;
                                                int i512 = i38;
                                                str11 = str14;
                                                Format.b bVar4 = new Format.b();
                                                bVar4.f6948a = string4;
                                                bVar4.f6958k = str16;
                                                bVar4.f6971x = i512;
                                                bVar4.f6972y = i511;
                                                bVar4.f6961n = drmInitDataM3687a2;
                                                bVar4.f6950c = str;
                                                cVar.f7869b = bVar4.m3519a();
                                                str16 = str16;
                                            } else {
                                                str11 = str14;
                                                str12 = str7;
                                                if (iM3201f10 == 1684366131) {
                                                    parsableByteArray2.m3194D(i30 + 8);
                                                    String string5 = Integer.toString(i6);
                                                    parsableByteArray2.m3195E(2);
                                                    int i513 = Ac3Util.f7087b[(parsableByteArray2.m3214s() & 192) >> 6];
                                                    iM3214s = parsableByteArray2.m3214s();
                                                    i37 = Ac3Util.f7089d[(iM3214s & 14) >> 1];
                                                    if ((iM3214s & 1) != 0) {
                                                        i37++;
                                                    }
                                                    if (((parsableByteArray2.m3214s() & 30) >> 1) > 0) {
                                                        i37 += 2;
                                                    }
                                                    if (parsableByteArray2.m3196a() > 0) {
                                                        str13 = "audio/eac3";
                                                    } else {
                                                        str13 = "audio/eac3";
                                                    }
                                                    Format.b bVar5 = new Format.b();
                                                    bVar5.f6948a = string5;
                                                    bVar5.f6958k = str13;
                                                    bVar5.f6971x = i37;
                                                    bVar5.f6972y = i513;
                                                    bVar5.f6961n = drmInitDataM3687a2;
                                                    bVar5.f6950c = str;
                                                    cVar.f7869b = bVar5.m3519a();
                                                } else {
                                                    str16 = str16;
                                                    if (iM3201f10 == 1684103988) {
                                                        parsableByteArray2.m3194D(i30 + 8);
                                                        String string6 = Integer.toString(i6);
                                                        parsableByteArray2.m3195E(1);
                                                        if (((parsableByteArray2.m3214s() & 32) >> 5) == 1) {
                                                            i36 = 48000;
                                                        } else {
                                                            i36 = 44100;
                                                        }
                                                        Format.b bVar6 = new Format.b();
                                                        bVar6.f6948a = string6;
                                                        bVar6.f6958k = "audio/ac4";
                                                        bVar6.f6971x = 2;
                                                        bVar6.f6972y = i36;
                                                        bVar6.f6961n = drmInitDataM3687a2;
                                                        bVar6.f6950c = str;
                                                        cVar.f7869b = bVar6.m3519a();
                                                    } else if (iM3201f10 == 1684305011) {
                                                        Format.b bVarM1582d4 = outline.m1582d(i6);
                                                        bVarM1582d4.f6958k = str6;
                                                        bVarM1582d4.f6971x = iIntValue;
                                                        bVarM1582d4.f6972y = iIntValue2;
                                                        bVarM1582d4.f6961n = drmInitDataM3687a2;
                                                        bVarM1582d4.f6950c = str;
                                                        cVar.f7869b = bVarM1582d4.m3519a();
                                                    } else if (iM3201f10 == 1682927731) {
                                                        int i514 = iM3201f9 - 8;
                                                        byte[] bArr10 = f7858a;
                                                        byte[] bArrCopyOf2 = Arrays.copyOf(bArr10, bArr10.length + i514);
                                                        parsableByteArray2.m3194D(i30 + 8);
                                                        parsableByteArray2.m3200e(bArrCopyOf2, bArr10.length, i514);
                                                        listM11637B2 = C1095a.m2389e(bArrCopyOf2);
                                                    } else if (iM3201f10 == 1684425825) {
                                                        int i515 = iM3201f9 - 12;
                                                        byte[] bArr11 = new byte[i515 + 4];
                                                        bArr11[0] = 102;
                                                        bArr11[1] = 76;
                                                        bArr11[2] = 97;
                                                        bArr11[3] = 67;
                                                        parsableByteArray2.m3194D(i30 + 12);
                                                        System.arraycopy(parsableByteArray2.f6392a, parsableByteArray2.f6393b, bArr11, 4, i515);
                                                        parsableByteArray2.f6393b += i515;
                                                        listM11637B2 = ImmutableList2.m11637B(bArr11);
                                                    } else {
                                                        if (iM3201f10 == 1634492771) {
                                                            int i516 = iM3201f9 - 12;
                                                            byte[] bArr12 = new byte[i516];
                                                            parsableByteArray2.m3194D(i30 + 12);
                                                            System.arraycopy(parsableByteArray2.f6392a, parsableByteArray2.f6393b, bArr12, 0, i516);
                                                            parsableByteArray2.f6393b += i516;
                                                            ParsableByteArray parsableByteArray8 = new ParsableByteArray(bArr12);
                                                            parsableByteArray8.m3194D(9);
                                                            int iM3214s6 = parsableByteArray8.m3214s();
                                                            parsableByteArray8.m3194D(20);
                                                            Pair pairCreate4 = Pair.create(Integer.valueOf(parsableByteArray8.m3217v()), Integer.valueOf(iM3214s6));
                                                            iIntValue2 = ((Integer) pairCreate4.first).intValue();
                                                            iIntValue = ((Integer) pairCreate4.second).intValue();
                                                            listM11637B3 = ImmutableList2.m11637B(bArr12);
                                                        }
                                                        listM11637B2 = listM11637B3;
                                                        str7 = str12;
                                                        str9 = str11;
                                                        i30 += iM3201f9;
                                                        str14 = str9;
                                                        i14 = i510;
                                                        iM3201f5 = iM3201f5;
                                                        str16 = str16;
                                                    }
                                                }
                                            }
                                            listM11637B3 = listM11637B2;
                                            listM11637B2 = listM11637B3;
                                            str7 = str12;
                                            str9 = str11;
                                            i30 += iM3201f9;
                                            str14 = str9;
                                            i14 = i510;
                                            iM3201f5 = iM3201f5;
                                            str16 = str16;
                                        } else {
                                            i33 = 1702061171;
                                        }
                                        if (iM3201f10 == i33) {
                                            i34 = i30;
                                            str9 = str14;
                                        } else {
                                            i34 = parsableByteArray2.f6393b;
                                            while (true) {
                                                if (i34 - i30 < iM3201f9) {
                                                    str9 = str14;
                                                    i35 = -1;
                                                    i34 = -1;
                                                    break;
                                                }
                                                parsableByteArray2.m3194D(i34);
                                                iM3201f11 = parsableByteArray2.m3201f();
                                                if (iM3201f11 > 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                str9 = str14;
                                                C2096e.m4571g(z10, str9);
                                                if (parsableByteArray2.m3201f() == 1702061171) {
                                                    i34 += iM3201f11;
                                                    str14 = str9;
                                                }
                                            }
                                            if (i34 != i35) {
                                                Pair<String, byte[]> pairM3811a4 = m3811a(parsableByteArray2, i34);
                                                str10 = (String) pairM3811a4.first;
                                                bArr4 = (byte[]) pairM3811a4.second;
                                                if (bArr4 != null) {
                                                    if ("audio/mp4a-latm".equals(str10)) {
                                                        AacUtil.b bVarM3554e3 = AacUtil.m3554e(bArr4);
                                                        iIntValue2 = bVarM3554e3.f7083a;
                                                        iIntValue = bVarM3554e3.f7084b;
                                                        str7 = bVarM3554e3.f7085c;
                                                    } else {
                                                        str7 = str7;
                                                    }
                                                    listM11637B2 = ImmutableList2.m11637B(bArr4);
                                                } else {
                                                    str7 = str7;
                                                }
                                                str6 = str10;
                                            } else {
                                                str7 = str7;
                                            }
                                            i30 += iM3201f9;
                                            str14 = str9;
                                            i14 = i510;
                                            iM3201f5 = iM3201f5;
                                            str16 = str16;
                                        }
                                        i35 = -1;
                                        if (i34 != i35) {
                                            Pair<String, byte[]> pairM3811a5 = m3811a(parsableByteArray2, i34);
                                            str10 = (String) pairM3811a5.first;
                                            bArr4 = (byte[]) pairM3811a5.second;
                                            if (bArr4 != null) {
                                                if ("audio/mp4a-latm".equals(str10)) {
                                                    AacUtil.b bVarM3554e4 = AacUtil.m3554e(bArr4);
                                                    iIntValue2 = bVarM3554e4.f7083a;
                                                    iIntValue = bVarM3554e4.f7084b;
                                                    str7 = bVarM3554e4.f7085c;
                                                } else {
                                                    str7 = str7;
                                                }
                                                listM11637B2 = ImmutableList2.m11637B(bArr4);
                                            } else {
                                                str7 = str7;
                                            }
                                            str6 = str10;
                                        } else {
                                            str7 = str7;
                                        }
                                        i30 += iM3201f9;
                                        str14 = str9;
                                        i14 = i510;
                                        iM3201f5 = iM3201f5;
                                        str16 = str16;
                                    }
                                    str8 = str7;
                                    i31 = iM3201f5;
                                    i32 = i14;
                                    if (cVar.f7869b == null) {
                                        Format.b bVarM1582d5 = outline.m1582d(i6);
                                        bVarM1582d5.f6958k = str6;
                                        bVarM1582d5.f6955h = str8;
                                        bVarM1582d5.f6971x = iIntValue;
                                        bVarM1582d5.f6972y = iIntValue2;
                                        bVarM1582d5.f6973z = i28;
                                        bVarM1582d5.f6960m = listM11637B2;
                                        bVarM1582d5.f6961n = drmInitDataM3687a2;
                                        bVarM1582d5.f6950c = str;
                                        cVar.f7869b = bVarM1582d5.m3519a();
                                    }
                                    str4 = str;
                                    i23 = i29;
                                    i19 = i32;
                                    i20 = i31;
                                } else {
                                    if (iM3201f6 == 1414810956 || iM3201f6 == 1954034535 || iM3201f6 == 2004251764 || iM3201f6 == 1937010800 || iM3201f6 == 1664495672) {
                                        parsableByteArray2.m3194D(i14 + 8 + 8);
                                        String str18 = "application/ttml+xml";
                                        if (iM3201f6 == 1414810956) {
                                            pair2 = pairCreate;
                                        } else {
                                            if (iM3201f6 == 1954034535) {
                                                int i60 = (iM3201f5 - 8) - 8;
                                                byte[] bArr13 = new byte[i60];
                                                pair2 = pairCreate;
                                                System.arraycopy(parsableByteArray2.f6392a, parsableByteArray2.f6393b, bArr13, 0, i60);
                                                parsableByteArray2.f6393b += i60;
                                                immutableList2M11637B = ImmutableList2.m11637B(bArr13);
                                                str18 = "application/x-quicktime-tx3g";
                                                j5 = Long.MAX_VALUE;
                                            } else {
                                                pair2 = pairCreate;
                                                if (iM3201f6 == 2004251764) {
                                                    str18 = "application/x-mp4-vtt";
                                                } else if (iM3201f6 == 1937010800) {
                                                    immutableList2M11637B = null;
                                                    j5 = 0;
                                                } else {
                                                    if (iM3201f6 != 1664495672) {
                                                        throw new IllegalStateException();
                                                    }
                                                    cVar.f7871d = 1;
                                                    str18 = "application/x-mp4-cea-608";
                                                }
                                            }
                                            aVar3 = aVar4;
                                            Format.b bVarM1582d6 = outline.m1582d(i6);
                                            bVarM1582d6.f6958k = str18;
                                            bVarM1582d6.f6950c = str;
                                            bVarM1582d6.f6962o = j5;
                                            bVarM1582d6.f6960m = immutableList2M11637B;
                                            cVar.f7869b = bVarM1582d6.m3519a();
                                        }
                                        immutableList2M11637B = null;
                                        j5 = Long.MAX_VALUE;
                                        aVar3 = aVar4;
                                        Format.b bVarM1582d7 = outline.m1582d(i6);
                                        bVarM1582d7.f6958k = str18;
                                        bVarM1582d7.f6950c = str;
                                        bVarM1582d7.f6962o = j5;
                                        bVarM1582d7.f6960m = immutableList2M11637B;
                                        cVar.f7869b = bVarM1582d7.m3519a();
                                    } else {
                                        if (iM3201f6 == 1835365492) {
                                            parsableByteArray2.m3194D(i14 + 8 + 8);
                                            if (iM3201f6 == 1835365492) {
                                                parsableByteArray2.m3209n();
                                                String strM3209n = parsableByteArray2.m3209n();
                                                if (strM3209n != null) {
                                                    Format.b bVarM1582d8 = outline.m1582d(i6);
                                                    bVarM1582d8.f6958k = strM3209n;
                                                    cVar.f7869b = bVarM1582d8.m3519a();
                                                }
                                            }
                                        } else if (iM3201f6 == 1667329389) {
                                            Format.b bVarM1582d9 = outline.m1582d(i6);
                                            bVarM1582d9.f6958k = "application/x-camera-motion";
                                            cVar.f7869b = bVarM1582d9.m3519a();
                                        }
                                        aVar3 = aVar4;
                                        pair2 = pairCreate;
                                    }
                                    fVar = fVar;
                                    i29 = i7;
                                    i31 = iM3201f5;
                                    i17 = i8;
                                    i32 = i14;
                                    str4 = str;
                                    i23 = i29;
                                    i19 = i32;
                                    i20 = i31;
                                }
                                aVar3 = aVar3;
                                fVar = fVar;
                                i29 = i7;
                                i31 = iM3201f5;
                                i17 = i8;
                                i32 = i14;
                                str4 = str;
                                i23 = i29;
                                i19 = i32;
                                i20 = i31;
                            }
                            parsableByteArray2.m3194D(i19 + i20);
                            i8 = i17 + 1;
                            i7 = i23;
                            pairCreate = pair2;
                            iM3201f3 = i43;
                            jM3215t2 = j6;
                            i = i16;
                            str = str4;
                            fVar = fVar;
                            i39 = i39;
                            arrayList2 = arrayList2;
                            aVar4 = aVar3;
                            drmInitData = drmInitData;
                        }
                        arrayList = arrayList2;
                        i9 = i39;
                        aVar2 = aVar4;
                        fVar2 = fVar;
                        i10 = i;
                        j4 = jM3215t2;
                        pair = pairCreate;
                        if (z) {
                            aVar4 = aVar2;
                        } else {
                            aVar4 = aVar2;
                            aVarM3809b = aVar4.m3809b(1701082227);
                            if (aVarM3809b == null) {
                                bVarM3810c = aVarM3809b.m3810c(1701606260);
                                if (bVarM3810c == null) {
                                    pairCreate2 = null;
                                } else {
                                    parsableByteArray3 = bVarM3810c.f7857b;
                                    parsableByteArray3.m3194D(8);
                                    iM3201f4 = (parsableByteArray3.m3201f() >> 24) & 255;
                                    iM3217v = parsableByteArray3.m3217v();
                                    jArr4 = new long[iM3217v];
                                    jArr5 = new long[iM3217v];
                                    for (i11 = 0; i11 < iM3217v; i11++) {
                                        if (iM3201f4 == 1) {
                                            jM3215t3 = parsableByteArray3.m3218w();
                                        } else {
                                            jM3215t3 = parsableByteArray3.m3215t();
                                        }
                                        jArr4[i11] = jM3215t3;
                                        if (iM3201f4 == 1) {
                                            jM3201f = parsableByteArray3.m3208m();
                                        } else {
                                            jM3201f = parsableByteArray3.m3201f();
                                        }
                                        jArr5[i11] = jM3201f;
                                        bArr = parsableByteArray3.f6392a;
                                        int i61 = parsableByteArray3.f6393b;
                                        i12 = i61 + 1;
                                        parsableByteArray3.f6393b = i12;
                                        i13 = (bArr[i61] & 255) << 8;
                                        parsableByteArray3.f6393b = i12 + 1;
                                        if (((short) ((bArr[i12] & 255) | i13)) == 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        parsableByteArray3.m3195E(2);
                                    }
                                    pairCreate2 = Pair.create(jArr4, jArr5);
                                }
                                if (pairCreate2 != null) {
                                    jArr2 = (long[]) pairCreate2.first;
                                    jArr = (long[]) pairCreate2.second;
                                }
                            }
                            jArr3 = jArr2;
                            if (cVar.f7869b == null) {
                                track = new Track(fVar2.f7880a, i10, ((Long) pair.first).longValue(), j4, jM3104M, cVar.f7869b, cVar.f7871d, cVar.f7868a, cVar.f7870c, jArr3, jArr);
                            }
                            trackApply = function.apply(track);
                            if (trackApply == null) {
                                arrayList2 = arrayList;
                            } else {
                                Atom.a aVarM3809b5 = aVar4.m3809b(1835297121);
                                Objects.requireNonNull(aVarM3809b5);
                                Atom.a aVarM3809b6 = aVarM3809b5.m3809b(1835626086);
                                Objects.requireNonNull(aVarM3809b6);
                                Atom.a aVarM3809b7 = aVarM3809b6.m3809b(1937007212);
                                Objects.requireNonNull(aVarM3809b7);
                                TrackSampleTable trackSampleTableM3814d = m3814d(trackApply, aVarM3809b7, gaplessInfoHolder);
                                arrayList2 = arrayList;
                                arrayList2.add(trackSampleTableM3814d);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        jArr3 = jArr2;
                        if (cVar.f7869b == null) {
                            track = new Track(fVar2.f7880a, i10, ((Long) pair.first).longValue(), j4, jM3104M, cVar.f7869b, cVar.f7871d, cVar.f7868a, cVar.f7870c, jArr3, jArr);
                        }
                        trackApply = function.apply(track);
                        if (trackApply == null) {
                            arrayList2 = arrayList;
                        } else {
                            Atom.a aVarM3809b8 = aVar4.m3809b(1835297121);
                            Objects.requireNonNull(aVarM3809b8);
                            Atom.a aVarM3809b9 = aVarM3809b8.m3809b(1835626086);
                            Objects.requireNonNull(aVarM3809b9);
                            Atom.a aVarM3809b10 = aVarM3809b9.m3809b(1937007212);
                            Objects.requireNonNull(aVarM3809b10);
                            TrackSampleTable trackSampleTableM3814d2 = m3814d(trackApply, aVarM3809b10, gaplessInfoHolder);
                            arrayList2 = arrayList;
                            arrayList2.add(trackSampleTableM3814d2);
                        }
                    }
                    jM3215t = -9223372036854775807L;
                    parsableByteArray5.m3195E(16);
                    iM3201f = parsableByteArray5.m3201f();
                    int iM3201f19 = parsableByteArray5.m3201f();
                    parsableByteArray5.m3195E(4);
                    int iM3201f110 = parsableByteArray5.m3201f();
                    int iM3201f111 = parsableByteArray5.m3201f();
                    if (iM3201f != 0) {
                        if (iM3201f != 0) {
                            if (iM3201f != -65536) {
                                i2 = 0;
                            } else {
                                i2 = 0;
                            }
                        } else if (iM3201f != -65536) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                        }
                    } else if (iM3201f != 0) {
                        if (iM3201f != -65536) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                        }
                    } else if (iM3201f != -65536) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                    }
                    fVar = new f(iM3201f14, jM3215t, i2);
                    if (j2 == -9223372036854775807L) {
                        j3 = fVar.f7881b;
                    } else {
                        j3 = j2;
                    }
                    parsableByteArray = bVarM3810c2.f7857b;
                    parsableByteArray.m3194D(8);
                    if (((parsableByteArray.m3201f() >> 24) & 255) == 0) {
                        i3 = 8;
                    } else {
                        i3 = 16;
                    }
                    parsableByteArray.m3195E(i3);
                    jM3215t2 = parsableByteArray.m3215t();
                    jM3104M = j3 != -9223372036854775807L ? Util6.m3104M(j3, 1000000L, jM3215t2) : -9223372036854775807L;
                    Atom.a aVarM3809b11 = aVarM3809b2.m3809b(1835626086);
                    Objects.requireNonNull(aVarM3809b11);
                    Atom.a aVarM3809b12 = aVarM3809b11.m3809b(1937007212);
                    Objects.requireNonNull(aVarM3809b12);
                    Atom.b bVarM3810c7 = aVarM3809b2.m3810c(1835296868);
                    Objects.requireNonNull(bVarM3810c7);
                    ParsableByteArray parsableByteArray9 = bVarM3810c7.f7857b;
                    parsableByteArray9.m3194D(8);
                    iM3201f2 = (parsableByteArray9.m3201f() >> 24) & 255;
                    if (iM3201f2 == 0) {
                        i4 = 8;
                    } else {
                        i4 = 16;
                    }
                    parsableByteArray9.m3195E(i4);
                    long jM3215t5 = parsableByteArray9.m3215t();
                    if (iM3201f2 == 0) {
                        i5 = 4;
                    } else {
                        i5 = 8;
                    }
                    parsableByteArray9.m3195E(i5);
                    int iM3219x6 = parsableByteArray9.m3219x();
                    StringBuilder sbM1556G2 = outline.m1556G("");
                    sbM1556G2.append((char) (((iM3219x6 >> 10) & 31) + 96));
                    sbM1556G2.append((char) (((iM3219x6 >> 5) & 31) + 96));
                    sbM1556G2.append((char) ((iM3219x6 & 31) + 96));
                    pairCreate = Pair.create(Long.valueOf(jM3215t5), sbM1556G2.toString());
                    Atom.b bVarM3810c8 = aVarM3809b12.m3810c(1937011556);
                    Objects.requireNonNull(bVarM3810c8);
                    parsableByteArray2 = bVarM3810c8.f7857b;
                    i6 = fVar.f7880a;
                    i7 = fVar.f7882c;
                    str = (String) pairCreate.second;
                    parsableByteArray2.m3194D(12);
                    iM3201f3 = parsableByteArray2.m3201f();
                    cVar = new c(iM3201f3);
                    i8 = 0;
                    while (i8 < iM3201f3) {
                        i14 = parsableByteArray2.f6393b;
                        int i410 = iM3201f3;
                        iM3201f5 = parsableByteArray2.m3201f();
                        if (iM3201f5 > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        String str19 = "childAtomSize should be positive";
                        C2096e.m4571g(z4, "childAtomSize should be positive");
                        iM3201f6 = parsableByteArray2.m3201f();
                        long j7 = jM3215t2;
                        if (iM3201f6 != 1635148593) {
                            aVar3 = aVar4;
                            pair2 = pairCreate;
                            fVar = fVar;
                            i15 = i7;
                            i16 = i;
                            i17 = i8;
                            obj = "childAtomSize should be positive";
                            parsableByteArray2.m3194D(i14 + 8 + 8);
                            parsableByteArray2.m3195E(16);
                            iM3219x = parsableByteArray2.m3219x();
                            iM3219x2 = parsableByteArray2.m3219x();
                            parsableByteArray2.m3195E(50);
                            i18 = parsableByteArray2.f6393b;
                            if (iM3201f6 == 1701733238) {
                                i19 = i14;
                                i20 = iM3201f5;
                                pairM3813c = m3813c(parsableByteArray2, i19, i20);
                                if (pairM3813c != null) {
                                    iM3201f6 = ((Integer) pairM3813c.first).intValue();
                                    if (drmInitData == null) {
                                        drmInitDataM3687a = null;
                                    } else {
                                        drmInitDataM3687a = drmInitData.m3687a(((TrackEncryptionBox) pairM3813c.second).f7990b);
                                    }
                                    cVar.f7868a[i17] = (TrackEncryptionBox) pairM3813c.second;
                                } else {
                                    drmInitDataM3687a = drmInitData;
                                }
                                parsableByteArray2.m3194D(i18);
                            } else {
                                i19 = i14;
                                i20 = iM3201f5;
                                drmInitDataM3687a = drmInitData;
                            }
                            if (iM3201f6 == 1831958048) {
                                str2 = "video/mpeg";
                            } else {
                                str2 = null;
                            }
                            fM3217v = 1.0f;
                            i21 = -1;
                            z5 = false;
                            list = null;
                            str3 = null;
                            drmInitData2 = drmInitDataM3687a;
                            str4 = str;
                            bArr2 = null;
                            while (true) {
                                if (i18 - i19 >= i20) {
                                    bArr3 = bArr2;
                                    i22 = i21;
                                    break;
                                }
                                parsableByteArray2.m3194D(i18);
                                i24 = parsableByteArray2.f6393b;
                                i22 = i21;
                                iM3201f7 = parsableByteArray2.m3201f();
                                bArr3 = bArr2;
                                if (iM3201f7 != 0) {
                                }
                                if (iM3201f7 > 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                C2096e.m4571g(z6, obj);
                                iM3201f8 = parsableByteArray2.m3201f();
                                Object obj3 = obj;
                                if (iM3201f8 == 1635148611) {
                                    if (str2 == null) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    C2096e.m4570f(z8);
                                    parsableByteArray2.m3194D(i24 + 8);
                                    avcConfigM3257b = AvcConfig.m3257b(parsableByteArray2);
                                    listM11637B = avcConfigM3257b.f6434a;
                                    cVar.f7870c = avcConfigM3257b.f6435b;
                                    if (!z5) {
                                        fM3217v = avcConfigM3257b.f6438e;
                                    }
                                    str3 = avcConfigM3257b.f6439f;
                                    str2 = "video/avc";
                                } else if (iM3201f8 == 1752589123) {
                                    if (str2 == null) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    C2096e.m4570f(z7);
                                    parsableByteArray2.m3194D(i24 + 8);
                                    HevcConfig hevcConfigM3268a2 = HevcConfig.m3268a(parsableByteArray2);
                                    listM11637B = hevcConfigM3268a2.f6468a;
                                    cVar.f7870c = hevcConfigM3268a2.f6469b;
                                    str3 = hevcConfigM3268a2.f6470c;
                                    str2 = "video/hevc";
                                } else {
                                    if (iM3201f8 != 1685480259) {
                                        i25 = iM3201f6;
                                        dolbyVisionConfigM3258a = DolbyVisionConfig.m3258a(parsableByteArray2);
                                        if (dolbyVisionConfigM3258a != null) {
                                            str3 = dolbyVisionConfigM3258a.f6445a;
                                            str2 = "video/dolby-vision";
                                        }
                                        i26 = i22;
                                        bArr2 = bArr3;
                                    } else {
                                        i25 = iM3201f6;
                                        dolbyVisionConfigM3258a = DolbyVisionConfig.m3258a(parsableByteArray2);
                                        if (dolbyVisionConfigM3258a != null) {
                                            str3 = dolbyVisionConfigM3258a.f6445a;
                                            str2 = "video/dolby-vision";
                                        }
                                        i26 = i22;
                                        bArr2 = bArr3;
                                    }
                                    i18 += iM3201f7;
                                    i21 = i26;
                                    obj = obj3;
                                    iM3201f6 = i25;
                                }
                                i25 = iM3201f6;
                                bArr2 = bArr3;
                                list = listM11637B;
                                i26 = i22;
                                i18 += iM3201f7;
                                i21 = i26;
                                obj = obj3;
                                iM3201f6 = i25;
                            }
                            if (str2 == null) {
                                i23 = i15;
                            } else {
                                Format.b bVarM1582d10 = outline.m1582d(i6);
                                bVarM1582d10.f6958k = str2;
                                bVarM1582d10.f6955h = str3;
                                bVarM1582d10.f6963p = iM3219x;
                                bVarM1582d10.f6964q = iM3219x2;
                                bVarM1582d10.f6967t = fM3217v;
                                i23 = i15;
                                bVarM1582d10.f6966s = i23;
                                bVarM1582d10.f6968u = bArr3;
                                bVarM1582d10.f6969v = i22;
                                bVarM1582d10.f6960m = list;
                                bVarM1582d10.f6961n = drmInitData2;
                                cVar.f7869b = bVarM1582d10.m3519a();
                            }
                        } else {
                            aVar3 = aVar4;
                            pair2 = pairCreate;
                            fVar = fVar;
                            i15 = i7;
                            i16 = i;
                            i17 = i8;
                            obj = "childAtomSize should be positive";
                            parsableByteArray2.m3194D(i14 + 8 + 8);
                            parsableByteArray2.m3195E(16);
                            iM3219x = parsableByteArray2.m3219x();
                            iM3219x2 = parsableByteArray2.m3219x();
                            parsableByteArray2.m3195E(50);
                            i18 = parsableByteArray2.f6393b;
                            if (iM3201f6 == 1701733238) {
                                i19 = i14;
                                i20 = iM3201f5;
                                pairM3813c = m3813c(parsableByteArray2, i19, i20);
                                if (pairM3813c != null) {
                                    iM3201f6 = ((Integer) pairM3813c.first).intValue();
                                    if (drmInitData == null) {
                                        drmInitDataM3687a = null;
                                    } else {
                                        drmInitDataM3687a = drmInitData.m3687a(((TrackEncryptionBox) pairM3813c.second).f7990b);
                                    }
                                    cVar.f7868a[i17] = (TrackEncryptionBox) pairM3813c.second;
                                } else {
                                    drmInitDataM3687a = drmInitData;
                                }
                                parsableByteArray2.m3194D(i18);
                            } else {
                                i19 = i14;
                                i20 = iM3201f5;
                                drmInitDataM3687a = drmInitData;
                            }
                            if (iM3201f6 == 1831958048) {
                                str2 = "video/mpeg";
                            } else {
                                str2 = null;
                            }
                            fM3217v = 1.0f;
                            i21 = -1;
                            z5 = false;
                            list = null;
                            str3 = null;
                            drmInitData2 = drmInitDataM3687a;
                            str4 = str;
                            bArr2 = null;
                            while (true) {
                                if (i18 - i19 >= i20) {
                                    bArr3 = bArr2;
                                    i22 = i21;
                                    break;
                                }
                                parsableByteArray2.m3194D(i18);
                                i24 = parsableByteArray2.f6393b;
                                i22 = i21;
                                iM3201f7 = parsableByteArray2.m3201f();
                                bArr3 = bArr2;
                                if (iM3201f7 != 0) {
                                }
                                if (iM3201f7 > 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                C2096e.m4571g(z6, obj);
                                iM3201f8 = parsableByteArray2.m3201f();
                                Object obj4 = obj;
                                if (iM3201f8 == 1635148611) {
                                    if (str2 == null) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    C2096e.m4570f(z8);
                                    parsableByteArray2.m3194D(i24 + 8);
                                    avcConfigM3257b = AvcConfig.m3257b(parsableByteArray2);
                                    listM11637B = avcConfigM3257b.f6434a;
                                    cVar.f7870c = avcConfigM3257b.f6435b;
                                    if (!z5) {
                                        fM3217v = avcConfigM3257b.f6438e;
                                    }
                                    str3 = avcConfigM3257b.f6439f;
                                    str2 = "video/avc";
                                } else if (iM3201f8 == 1752589123) {
                                    if (str2 == null) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    C2096e.m4570f(z7);
                                    parsableByteArray2.m3194D(i24 + 8);
                                    HevcConfig hevcConfigM3268a3 = HevcConfig.m3268a(parsableByteArray2);
                                    listM11637B = hevcConfigM3268a3.f6468a;
                                    cVar.f7870c = hevcConfigM3268a3.f6469b;
                                    str3 = hevcConfigM3268a3.f6470c;
                                    str2 = "video/hevc";
                                } else {
                                    if (iM3201f8 != 1685480259) {
                                        i25 = iM3201f6;
                                        dolbyVisionConfigM3258a = DolbyVisionConfig.m3258a(parsableByteArray2);
                                        if (dolbyVisionConfigM3258a != null) {
                                            str3 = dolbyVisionConfigM3258a.f6445a;
                                            str2 = "video/dolby-vision";
                                        }
                                        i26 = i22;
                                        bArr2 = bArr3;
                                    } else {
                                        i25 = iM3201f6;
                                        dolbyVisionConfigM3258a = DolbyVisionConfig.m3258a(parsableByteArray2);
                                        if (dolbyVisionConfigM3258a != null) {
                                            str3 = dolbyVisionConfigM3258a.f6445a;
                                            str2 = "video/dolby-vision";
                                        }
                                        i26 = i22;
                                        bArr2 = bArr3;
                                    }
                                    i18 += iM3201f7;
                                    i21 = i26;
                                    obj = obj4;
                                    iM3201f6 = i25;
                                }
                                i25 = iM3201f6;
                                bArr2 = bArr3;
                                list = listM11637B;
                                i26 = i22;
                                i18 += iM3201f7;
                                i21 = i26;
                                obj = obj4;
                                iM3201f6 = i25;
                            }
                            if (str2 == null) {
                                i23 = i15;
                            } else {
                                Format.b bVarM1582d11 = outline.m1582d(i6);
                                bVarM1582d11.f6958k = str2;
                                bVarM1582d11.f6955h = str3;
                                bVarM1582d11.f6963p = iM3219x;
                                bVarM1582d11.f6964q = iM3219x2;
                                bVarM1582d11.f6967t = fM3217v;
                                i23 = i15;
                                bVarM1582d11.f6966s = i23;
                                bVarM1582d11.f6968u = bArr3;
                                bVarM1582d11.f6969v = i22;
                                bVarM1582d11.f6960m = list;
                                bVarM1582d11.f6961n = drmInitData2;
                                cVar.f7869b = bVarM1582d11.m3519a();
                            }
                        }
                        parsableByteArray2.m3194D(i19 + i20);
                        i8 = i17 + 1;
                        i7 = i23;
                        pairCreate = pair2;
                        iM3201f3 = i410;
                        jM3215t2 = j7;
                        i = i16;
                        str = str4;
                        fVar = fVar;
                        i39 = i39;
                        arrayList2 = arrayList2;
                        aVar4 = aVar3;
                        drmInitData = drmInitData;
                    }
                    arrayList = arrayList2;
                    i9 = i39;
                    aVar2 = aVar4;
                    fVar2 = fVar;
                    i10 = i;
                    j4 = jM3215t2;
                    pair = pairCreate;
                    if (z) {
                        aVar4 = aVar2;
                        aVarM3809b = aVar4.m3809b(1701082227);
                        if (aVarM3809b == null) {
                            bVarM3810c = aVarM3809b.m3810c(1701606260);
                            if (bVarM3810c == null) {
                                pairCreate2 = null;
                            } else {
                                parsableByteArray3 = bVarM3810c.f7857b;
                                parsableByteArray3.m3194D(8);
                                iM3201f4 = (parsableByteArray3.m3201f() >> 24) & 255;
                                iM3217v = parsableByteArray3.m3217v();
                                jArr4 = new long[iM3217v];
                                jArr5 = new long[iM3217v];
                                while (i11 < iM3217v) {
                                    if (iM3201f4 == 1) {
                                        jM3215t3 = parsableByteArray3.m3218w();
                                    } else {
                                        jM3215t3 = parsableByteArray3.m3215t();
                                    }
                                    jArr4[i11] = jM3215t3;
                                    if (iM3201f4 == 1) {
                                        jM3201f = parsableByteArray3.m3208m();
                                    } else {
                                        jM3201f = parsableByteArray3.m3201f();
                                    }
                                    jArr5[i11] = jM3201f;
                                    bArr = parsableByteArray3.f6392a;
                                    int i62 = parsableByteArray3.f6393b;
                                    i12 = i62 + 1;
                                    parsableByteArray3.f6393b = i12;
                                    i13 = (bArr[i62] & 255) << 8;
                                    parsableByteArray3.f6393b = i12 + 1;
                                    if (((short) ((bArr[i12] & 255) | i13)) == 1) {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                    parsableByteArray3.m3195E(2);
                                }
                                pairCreate2 = Pair.create(jArr4, jArr5);
                            }
                            if (pairCreate2 != null) {
                                jArr2 = (long[]) pairCreate2.first;
                                jArr = (long[]) pairCreate2.second;
                            }
                        }
                        jArr3 = jArr2;
                        if (cVar.f7869b == null) {
                            track = new Track(fVar2.f7880a, i10, ((Long) pair.first).longValue(), j4, jM3104M, cVar.f7869b, cVar.f7871d, cVar.f7868a, cVar.f7870c, jArr3, jArr);
                        }
                        trackApply = function.apply(track);
                        if (trackApply == null) {
                            arrayList2 = arrayList;
                        } else {
                            Atom.a aVarM3809b13 = aVar4.m3809b(1835297121);
                            Objects.requireNonNull(aVarM3809b13);
                            Atom.a aVarM3809b14 = aVarM3809b13.m3809b(1835626086);
                            Objects.requireNonNull(aVarM3809b14);
                            Atom.a aVarM3809b15 = aVarM3809b14.m3809b(1937007212);
                            Objects.requireNonNull(aVarM3809b15);
                            TrackSampleTable trackSampleTableM3814d3 = m3814d(trackApply, aVarM3809b15, gaplessInfoHolder);
                            arrayList2 = arrayList;
                            arrayList2.add(trackSampleTableM3814d3);
                        }
                    } else {
                        aVar4 = aVar2;
                    }
                    jArr = null;
                    jArr2 = null;
                    jArr3 = jArr2;
                    if (cVar.f7869b == null) {
                        track = new Track(fVar2.f7880a, i10, ((Long) pair.first).longValue(), j4, jM3104M, cVar.f7869b, cVar.f7871d, cVar.f7868a, cVar.f7870c, jArr3, jArr);
                    }
                    trackApply = function.apply(track);
                    if (trackApply == null) {
                        arrayList2 = arrayList;
                    } else {
                        Atom.a aVarM3809b16 = aVar4.m3809b(1835297121);
                        Objects.requireNonNull(aVarM3809b16);
                        Atom.a aVarM3809b17 = aVarM3809b16.m3809b(1835626086);
                        Objects.requireNonNull(aVarM3809b17);
                        Atom.a aVarM3809b18 = aVarM3809b17.m3809b(1937007212);
                        Objects.requireNonNull(aVarM3809b18);
                        TrackSampleTable trackSampleTableM3814d4 = m3814d(trackApply, aVarM3809b18, gaplessInfoHolder);
                        arrayList2 = arrayList;
                        arrayList2.add(trackSampleTableM3814d4);
                    }
                }
                track = null;
                trackApply = function.apply(track);
                if (trackApply == null) {
                    arrayList2 = arrayList;
                } else {
                    Atom.a aVarM3809b19 = aVar4.m3809b(1835297121);
                    Objects.requireNonNull(aVarM3809b19);
                    Atom.a aVarM3809b110 = aVarM3809b19.m3809b(1835626086);
                    Objects.requireNonNull(aVarM3809b110);
                    Atom.a aVarM3809b111 = aVarM3809b110.m3809b(1937007212);
                    Objects.requireNonNull(aVarM3809b111);
                    TrackSampleTable trackSampleTableM3814d5 = m3814d(trackApply, aVarM3809b111, gaplessInfoHolder);
                    arrayList2 = arrayList;
                    arrayList2.add(trackSampleTableM3814d5);
                }
            }
            i39 = i9 + 1;
        }
        return arrayList2;
    }
}
