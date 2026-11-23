package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.SparseArray;
import com.facebook.stetho.dumpapp.Framer;
import com.facebook.stetho.websocket.CloseCodes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rj2 implements cj2 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f18856a = {Framer.STDOUT_FRAME_PREFIX, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: b */
    public static final byte[] f18857b = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* JADX INFO: renamed from: c */
    public static final UUID f18858c = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: A */
    public long f18859A;

    /* JADX INFO: renamed from: B */
    public long f18860B;

    /* JADX INFO: renamed from: C */
    public long f18861C;

    /* JADX INFO: renamed from: D */
    public yn2 f18862D;

    /* JADX INFO: renamed from: E */
    public yn2 f18863E;

    /* JADX INFO: renamed from: F */
    public boolean f18864F;

    /* JADX INFO: renamed from: G */
    public int f18865G;

    /* JADX INFO: renamed from: H */
    public long f18866H;

    /* JADX INFO: renamed from: I */
    public long f18867I;

    /* JADX INFO: renamed from: J */
    public int f18868J;

    /* JADX INFO: renamed from: K */
    public int f18869K;

    /* JADX INFO: renamed from: L */
    public int[] f18870L;

    /* JADX INFO: renamed from: M */
    public int f18871M;

    /* JADX INFO: renamed from: N */
    public int f18872N;

    /* JADX INFO: renamed from: O */
    public int f18873O;

    /* JADX INFO: renamed from: P */
    public int f18874P;

    /* JADX INFO: renamed from: Q */
    public boolean f18875Q;

    /* JADX INFO: renamed from: R */
    public boolean f18876R;

    /* JADX INFO: renamed from: S */
    public boolean f18877S;

    /* JADX INFO: renamed from: T */
    public boolean f18878T;

    /* JADX INFO: renamed from: U */
    public byte f18879U;

    /* JADX INFO: renamed from: V */
    public int f18880V;

    /* JADX INFO: renamed from: W */
    public int f18881W;

    /* JADX INFO: renamed from: X */
    public int f18882X;

    /* JADX INFO: renamed from: Y */
    public boolean f18883Y;

    /* JADX INFO: renamed from: Z */
    public boolean f18884Z;

    /* JADX INFO: renamed from: a0 */
    public dj2 f18885a0;

    /* JADX INFO: renamed from: b0 */
    public final nj2 f18886b0;

    /* JADX INFO: renamed from: d */
    public final tj2 f18887d;

    /* JADX INFO: renamed from: e */
    public final SparseArray<qj2> f18888e;

    /* JADX INFO: renamed from: f */
    public final boolean f18889f;

    /* JADX INFO: renamed from: g */
    public final do2 f18890g;

    /* JADX INFO: renamed from: h */
    public final do2 f18891h;

    /* JADX INFO: renamed from: i */
    public final do2 f18892i;

    /* JADX INFO: renamed from: j */
    public final do2 f18893j;

    /* JADX INFO: renamed from: k */
    public final do2 f18894k;

    /* JADX INFO: renamed from: l */
    public final do2 f18895l;

    /* JADX INFO: renamed from: m */
    public final do2 f18896m;

    /* JADX INFO: renamed from: n */
    public final do2 f18897n;

    /* JADX INFO: renamed from: o */
    public final do2 f18898o;

    /* JADX INFO: renamed from: p */
    public ByteBuffer f18899p;

    /* JADX INFO: renamed from: q */
    public long f18900q;

    /* JADX INFO: renamed from: r */
    public long f18901r;

    /* JADX INFO: renamed from: s */
    public long f18902s;

    /* JADX INFO: renamed from: t */
    public long f18903t;

    /* JADX INFO: renamed from: u */
    public long f18904u;

    /* JADX INFO: renamed from: v */
    public qj2 f18905v;

    /* JADX INFO: renamed from: w */
    public boolean f18906w;

    /* JADX INFO: renamed from: x */
    public int f18907x;

    /* JADX INFO: renamed from: y */
    public long f18908y;

    /* JADX INFO: renamed from: z */
    public boolean f18909z;

    public rj2() {
        this(0);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m8281i(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* JADX INFO: renamed from: m */
    public static int[] m8282m(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* JADX INFO: renamed from: a */
    public final void m8283a(int i, long j2) throws fh2 {
        if (i == 20529) {
            if (j2 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j2);
            sb.append(" not supported");
            throw new fh2(sb.toString());
        }
        if (i == 20530) {
            if (j2 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j2);
            sb2.append(" not supported");
            throw new fh2(sb2.toString());
        }
        switch (i) {
            case 131:
                this.f18905v.f18338c = (int) j2;
                return;
            case 136:
                this.f18905v.f18331L = j2 == 1;
                return;
            case 155:
                this.f18867I = m8289l(j2);
                return;
            case 159:
                this.f18905v.f18326G = (int) j2;
                return;
            case 176:
                this.f18905v.f18345j = (int) j2;
                return;
            case 179:
                this.f18862D.m8809a(m8289l(j2));
                return;
            case 186:
                this.f18905v.f18346k = (int) j2;
                return;
            case 215:
                this.f18905v.f18337b = (int) j2;
                return;
            case 231:
                this.f18861C = m8289l(j2);
                return;
            case 241:
                if (this.f18864F) {
                    return;
                }
                this.f18863E.m8809a(j2);
                this.f18864F = true;
                return;
            case 251:
                this.f18884Z = true;
                return;
            case 16980:
                if (j2 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("ContentCompAlgo ");
                sb3.append(j2);
                sb3.append(" not supported");
                throw new fh2(sb3.toString());
            case 17029:
                if (j2 < 1 || j2 > 2) {
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j2);
                    sb4.append(" not supported");
                    throw new fh2(sb4.toString());
                }
                return;
            case 17143:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("EBMLReadVersion ");
                sb5.append(j2);
                sb5.append(" not supported");
                throw new fh2(sb5.toString());
            case 18401:
                if (j2 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(49);
                sb6.append("ContentEncAlgo ");
                sb6.append(j2);
                sb6.append(" not supported");
                throw new fh2(sb6.toString());
            case 18408:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(56);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j2);
                sb7.append(" not supported");
                throw new fh2(sb7.toString());
            case 21420:
                this.f18908y = j2 + this.f18901r;
                return;
            case 21432:
                int i2 = (int) j2;
                if (i2 == 0) {
                    this.f18905v.f18351p = 0;
                    return;
                }
                if (i2 == 1) {
                    this.f18905v.f18351p = 2;
                    return;
                } else if (i2 == 3) {
                    this.f18905v.f18351p = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.f18905v.f18351p = 3;
                    return;
                }
            case 21680:
                this.f18905v.f18347l = (int) j2;
                return;
            case 21682:
                this.f18905v.f18349n = (int) j2;
                return;
            case 21690:
                this.f18905v.f18348m = (int) j2;
                return;
            case 21930:
                this.f18905v.f18332M = j2 == 1;
                return;
            case 22186:
                this.f18905v.f18329J = j2;
                return;
            case 22203:
                this.f18905v.f18330K = j2;
                return;
            case 25188:
                this.f18905v.f18327H = (int) j2;
                return;
            case 2352003:
                this.f18905v.f18339d = (int) j2;
                return;
            case 2807729:
                this.f18902s = j2;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i3 = (int) j2;
                        if (i3 == 1) {
                            this.f18905v.f18355t = 2;
                            return;
                        } else {
                            if (i3 != 2) {
                                return;
                            }
                            this.f18905v.f18355t = 1;
                            return;
                        }
                    case 21946:
                        int i4 = (int) j2;
                        if (i4 != 1) {
                            if (i4 == 16) {
                                this.f18905v.f18354s = 6;
                                return;
                            } else if (i4 == 18) {
                                this.f18905v.f18354s = 7;
                                return;
                            } else if (i4 != 6 && i4 != 7) {
                                return;
                            }
                        }
                        this.f18905v.f18354s = 3;
                        return;
                    case 21947:
                        qj2 qj2Var = this.f18905v;
                        qj2Var.f18352q = true;
                        int i5 = (int) j2;
                        if (i5 == 1) {
                            qj2Var.f18353r = 1;
                            return;
                        }
                        if (i5 == 9) {
                            qj2Var.f18353r = 6;
                            return;
                        } else {
                            if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                qj2Var.f18353r = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        this.f18905v.f18356u = (int) j2;
                        return;
                    case 21949:
                        this.f18905v.f18357v = (int) j2;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cj2
    /* JADX INFO: renamed from: b */
    public final int mo6193b(bj2 bj2Var, gj2 gj2Var) throws InterruptedException, IOException {
        this.f18883Y = false;
        while (!this.f18883Y) {
            if (!this.f18886b0.m7866a(bj2Var)) {
                return -1;
            }
            long j2 = bj2Var.f12710d;
            if (this.f18909z) {
                this.f18860B = j2;
                gj2Var.f14598a = this.f18859A;
                this.f18909z = false;
                return 1;
            }
            if (this.f18906w) {
                long j3 = this.f18860B;
                if (j3 != -1) {
                    gj2Var.f14598a = j3;
                    this.f18860B = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cj2
    /* JADX INFO: renamed from: c */
    public final boolean mo6194c(bj2 bj2Var) throws InterruptedException, IOException {
        sj2 sj2Var = new sj2();
        long j2 = bj2Var.f12709c;
        long j3 = 1024;
        if (j2 != -1 && j2 <= 1024) {
            j3 = j2;
        }
        int i = (int) j3;
        bj2Var.m6023c(sj2Var.f19593a.f13340a, 0, 4);
        sj2Var.f19594b = 4;
        for (long jM6394k = sj2Var.f19593a.m6394k(); jM6394k != 440786851; jM6394k = ((jM6394k << 8) & (-256)) | ((long) (sj2Var.f19593a.f13340a[0] & 255))) {
            int i2 = sj2Var.f19594b + 1;
            sj2Var.f19594b = i2;
            if (i2 == i) {
                return false;
            }
            bj2Var.m6023c(sj2Var.f19593a.f13340a, 0, 1);
        }
        long jM8354a = sj2Var.m8354a(bj2Var);
        long j4 = sj2Var.f19594b;
        if (jM8354a == Long.MIN_VALUE) {
            return false;
        }
        if (j2 != -1 && j4 + jM8354a >= j2) {
            return false;
        }
        while (true) {
            long j5 = sj2Var.f19594b;
            long j6 = j4 + jM8354a;
            if (j5 >= j6) {
                return j5 == j6;
            }
            if (sj2Var.m8354a(bj2Var) == Long.MIN_VALUE) {
                return false;
            }
            long jM8354a2 = sj2Var.m8354a(bj2Var);
            if (jM8354a2 < 0) {
                return false;
            }
            if (jM8354a2 != 0) {
                bj2Var.m6024d((int) jM8354a2, false);
                sj2Var.f19594b = (int) (((long) sj2Var.f19594b) + jM8354a2);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cj2
    /* JADX INFO: renamed from: d */
    public final void mo6195d(dj2 dj2Var) {
        this.f18885a0 = dj2Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m8284e(int i, double d) {
        if (i == 181) {
            this.f18905v.f18328I = (int) d;
            return;
        }
        if (i == 17545) {
            this.f18903t = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                this.f18905v.f18358w = (float) d;
                break;
            case 21970:
                this.f18905v.f18359x = (float) d;
                break;
            case 21971:
                this.f18905v.f18360y = (float) d;
                break;
            case 21972:
                this.f18905v.f18361z = (float) d;
                break;
            case 21973:
                this.f18905v.f18320A = (float) d;
                break;
            case 21974:
                this.f18905v.f18321B = (float) d;
                break;
            case 21975:
                this.f18905v.f18322C = (float) d;
                break;
            case 21976:
                this.f18905v.f18323D = (float) d;
                break;
            case 21977:
                this.f18905v.f18324E = (float) d;
                break;
            case 21978:
                this.f18905v.f18325F = (float) d;
                break;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cj2
    /* JADX INFO: renamed from: f */
    public final void mo6196f(long j2, long j3) {
        this.f18861C = -9223372036854775807L;
        this.f18865G = 0;
        nj2 nj2Var = this.f18886b0;
        nj2Var.f17131d = 0;
        nj2Var.f17129b.clear();
        tj2 tj2Var = nj2Var.f17130c;
        tj2Var.f19857c = 0;
        tj2Var.f19858d = 0;
        tj2 tj2Var2 = this.f18887d;
        tj2Var2.f19857c = 0;
        tj2Var2.f19858d = 0;
        m8288k();
    }

    /* JADX INFO: renamed from: g */
    public final void m8285g(int i, String str) throws fh2 {
        if (i == 134) {
            this.f18905v.f18336a = str;
            return;
        }
        if (i != 17026) {
            if (i != 2274716) {
                return;
            }
            this.f18905v.f18333N = str;
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw new fh2(outline.m1552C(new StringBuilder(str.length() + 22), "DocType ", str, " not supported"));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8286h(int i, int i2, bj2 bj2Var) throws InterruptedException, IOException {
        long j2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 1;
        if (i != 161 && i != 163) {
            if (i == 16981) {
                byte[] bArr = new byte[i2];
                this.f18905v.f18341f = bArr;
                bj2Var.m6021a(bArr, 0, i2, false);
                return;
            }
            if (i == 18402) {
                byte[] bArr2 = new byte[i2];
                bj2Var.m6021a(bArr2, 0, i2, false);
                this.f18905v.f18342g = new kj2(1, bArr2);
                return;
            }
            if (i == 21419) {
                Arrays.fill(this.f18894k.f13340a, (byte) 0);
                bj2Var.m6021a(this.f18894k.f13340a, 4 - i2, i2, false);
                this.f18894k.m6389f(0);
                this.f18907x = (int) this.f18894k.m6394k();
                return;
            }
            if (i == 25506) {
                byte[] bArr3 = new byte[i2];
                this.f18905v.f18343h = bArr3;
                bj2Var.m6021a(bArr3, 0, i2, false);
                return;
            } else {
                if (i != 30322) {
                    throw new fh2(outline.m1585g(26, "Unexpected id: ", i));
                }
                byte[] bArr4 = new byte[i2];
                this.f18905v.f18350o = bArr4;
                bj2Var.m6021a(bArr4, 0, i2, false);
                return;
            }
        }
        if (this.f18865G == 0) {
            this.f18871M = (int) this.f18887d.m8419c(bj2Var, false, true, 8);
            this.f18872N = this.f18887d.f19858d;
            this.f18867I = -9223372036854775807L;
            this.f18865G = 1;
            do2 do2Var = this.f18892i;
            do2Var.f13341b = 0;
            do2Var.f13342c = 0;
        }
        qj2 qj2Var = this.f18888e.get(this.f18871M);
        if (qj2Var == null) {
            bj2Var.m6022b(i2 - this.f18872N, false);
            this.f18865G = 0;
            return;
        }
        if (this.f18865G == 1) {
            m8290n(bj2Var, 3);
            int i9 = (this.f18892i.f13340a[2] & 6) >> 1;
            byte b = 255;
            if (i9 == 0) {
                this.f18869K = 1;
                int[] iArrM8282m = m8282m(this.f18870L, 1);
                this.f18870L = iArrM8282m;
                iArrM8282m[0] = (i2 - this.f18872N) - 3;
            } else {
                if (i != 163) {
                    throw new fh2("Lacing only supported in SimpleBlocks.");
                }
                int i10 = 4;
                m8290n(bj2Var, 4);
                int i11 = (this.f18892i.f13340a[3] & 255) + 1;
                this.f18869K = i11;
                int[] iArrM8282m2 = m8282m(this.f18870L, i11);
                this.f18870L = iArrM8282m2;
                if (i9 == 2) {
                    int i12 = this.f18872N;
                    int i13 = this.f18869K;
                    Arrays.fill(iArrM8282m2, 0, i13, ((i2 - i12) - 4) / i13);
                } else if (i9 == 1) {
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        i3 = this.f18869K - 1;
                        if (i14 >= i3) {
                            break;
                        }
                        this.f18870L[i14] = 0;
                        do {
                            i10++;
                            m8290n(bj2Var, i10);
                            i4 = this.f18892i.f13340a[i10 - 1] & 255;
                            int[] iArr = this.f18870L;
                            i5 = iArr[i14] + i4;
                            iArr[i14] = i5;
                        } while (i4 == 255);
                        i15 += i5;
                        i14++;
                    }
                    this.f18870L[i3] = ((i2 - this.f18872N) - i10) - i15;
                } else {
                    if (i9 != 3) {
                        throw new fh2("Unexpected lacing value: 2");
                    }
                    int i16 = 0;
                    int i17 = 0;
                    while (true) {
                        int i18 = this.f18869K - 1;
                        if (i16 >= i18) {
                            this.f18870L[i18] = ((i2 - this.f18872N) - i10) - i17;
                            break;
                        }
                        this.f18870L[i16] = i7;
                        i10++;
                        m8290n(bj2Var, i10);
                        int i19 = i10 - 1;
                        if (this.f18892i.f13340a[i19] == 0) {
                            throw new fh2("No valid varint length mask found");
                        }
                        int i20 = 0;
                        while (true) {
                            if (i20 >= 8) {
                                j2 = 0;
                                break;
                            }
                            int i21 = i8 << (7 - i20);
                            if ((this.f18892i.f13340a[i19] & i21) != 0) {
                                i10 += i20;
                                m8290n(bj2Var, i10);
                                j2 = this.f18892i.f13340a[i19] & b & (~i21);
                                for (int i22 = i19 + 1; i22 < i10; i22++) {
                                    j2 = (j2 << 8) | ((long) (b & this.f18892i.f13340a[i22]));
                                    b = 255;
                                }
                                if (i16 <= 0) {
                                    break;
                                }
                                j2 -= (1 << ((i20 * 7) + 6)) - 1;
                                break;
                            }
                            i20++;
                            i8 = 1;
                            b = 255;
                        }
                        if (j2 < -2147483648L || j2 > 2147483647L) {
                            throw new fh2("EBML lacing sample size out of range.");
                        }
                        int i23 = (int) j2;
                        int[] iArr2 = this.f18870L;
                        if (i16 != 0) {
                            i23 += iArr2[i16 - 1];
                        }
                        iArr2[i16] = i23;
                        i17 += i23;
                        i16++;
                        i7 = 0;
                        i8 = 1;
                        b = 255;
                    }
                }
            }
            byte[] bArr5 = this.f18892i.f13340a;
            this.f18866H = m8289l((bArr5[1] & 255) | (bArr5[0] << 8)) + this.f18861C;
            byte b2 = this.f18892i.f13340a[2];
            int i24 = b2 & 8;
            if (qj2Var.f18338c == 2) {
                i6 = 1;
            } else {
                if (i == 163) {
                    if ((b2 & 128) == 128) {
                        i = 163;
                        i6 = 1;
                    } else {
                        i = 163;
                    }
                }
                i6 = 0;
            }
            this.f18873O = i6 | (i24 == 8 ? Integer.MIN_VALUE : 0);
            this.f18865G = 2;
            this.f18868J = 0;
        }
        if (i != 163) {
            m8291o(bj2Var, qj2Var, this.f18870L[0]);
            return;
        }
        while (true) {
            int i25 = this.f18868J;
            if (i25 >= this.f18869K) {
                this.f18865G = 0;
                return;
            } else {
                m8291o(bj2Var, qj2Var, this.f18870L[i25]);
                m8287j(qj2Var, this.f18866H + ((long) ((this.f18868J * qj2Var.f18339d) / CloseCodes.NORMAL_CLOSURE)));
                this.f18868J++;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8287j(qj2 qj2Var, long j2) {
        byte[] bytes;
        if ("S_TEXT/UTF8".equals(qj2Var.f18336a)) {
            byte[] bArr = this.f18896m.f13340a;
            long j3 = this.f18867I;
            if (j3 == -9223372036854775807L) {
                bytes = f18857b;
            } else {
                int i = (int) (j3 / 3600000000L);
                long j4 = j3 - (((long) i) * 3600000000L);
                int i2 = (int) (j4 / 60000000);
                long j5 = j4 - ((long) (60000000 * i2));
                int i3 = (int) (j5 / 1000000);
                String str = String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j5 - ((long) (i3 * 1000000))) / 1000)));
                int i4 = jo2.f15673a;
                bytes = str.getBytes(Charset.defaultCharset());
            }
            System.arraycopy(bytes, 0, bArr, 19, 12);
            lj2 lj2Var = qj2Var.f18334O;
            do2 do2Var = this.f18896m;
            ((km2) lj2Var).m7516b(do2Var, do2Var.f13342c);
            this.f18882X += this.f18896m.f13342c;
        }
        ((km2) qj2Var.f18334O).m7517c(j2, this.f18873O, this.f18882X, 0, qj2Var.f18342g);
        this.f18883Y = true;
        m8288k();
    }

    /* JADX INFO: renamed from: k */
    public final void m8288k() {
        this.f18874P = 0;
        this.f18882X = 0;
        this.f18881W = 0;
        this.f18875Q = false;
        this.f18876R = false;
        this.f18878T = false;
        this.f18880V = 0;
        this.f18879U = (byte) 0;
        this.f18877S = false;
        do2 do2Var = this.f18895l;
        do2Var.f13341b = 0;
        do2Var.f13342c = 0;
    }

    /* JADX INFO: renamed from: l */
    public final long m8289l(long j2) throws fh2 {
        long j3 = this.f18902s;
        if (j3 != -9223372036854775807L) {
            return jo2.m7373e(j2, j3, 1000L);
        }
        throw new fh2("Can't scale timecode prior to timecodeScale being set.");
    }

    /* JADX INFO: renamed from: n */
    public final void m8290n(bj2 bj2Var, int i) throws InterruptedException, IOException {
        do2 do2Var = this.f18892i;
        if (do2Var.f13342c >= i) {
            return;
        }
        if (do2Var.m6388e() < i) {
            do2 do2Var2 = this.f18892i;
            byte[] bArr = do2Var2.f13340a;
            int length = bArr.length;
            do2Var2.m6385b(Arrays.copyOf(bArr, Math.max(length + length, i)), this.f18892i.f13342c);
        }
        do2 do2Var3 = this.f18892i;
        byte[] bArr2 = do2Var3.f13340a;
        int i2 = do2Var3.f13342c;
        bj2Var.m6021a(bArr2, i2, i - i2, false);
        this.f18892i.m6387d(i);
    }

    /* JADX INFO: renamed from: o */
    public final void m8291o(bj2 bj2Var, qj2 qj2Var, int i) throws InterruptedException, IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(qj2Var.f18336a)) {
            byte[] bArr = f18856a;
            int i3 = i + 32;
            if (this.f18896m.m6388e() < i3) {
                this.f18896m.f13340a = Arrays.copyOf(bArr, i3 + i);
            }
            bj2Var.m6021a(this.f18896m.f13340a, 32, i, false);
            this.f18896m.m6389f(0);
            this.f18896m.m6387d(i3);
            return;
        }
        lj2 lj2Var = qj2Var.f18334O;
        if (!this.f18875Q) {
            if (qj2Var.f18340e) {
                this.f18873O &= -1073741825;
                if (!this.f18876R) {
                    bj2Var.m6021a(this.f18892i.f13340a, 0, 1, false);
                    this.f18874P++;
                    byte b = this.f18892i.f13340a[0];
                    if ((b & 128) == 128) {
                        throw new fh2("Extension bit is set in signal byte");
                    }
                    this.f18879U = b;
                    this.f18876R = true;
                }
                byte b2 = this.f18879U;
                if ((b2 & 1) == 1) {
                    int i4 = b2 & 2;
                    this.f18873O |= 1073741824;
                    if (!this.f18877S) {
                        bj2Var.m6021a(this.f18897n.f13340a, 0, 8, false);
                        this.f18874P += 8;
                        this.f18877S = true;
                        do2 do2Var = this.f18892i;
                        do2Var.f13340a[0] = (byte) ((i4 != 2 ? 0 : 128) | 8);
                        do2Var.m6389f(0);
                        km2 km2Var = (km2) lj2Var;
                        km2Var.m7516b(this.f18892i, 1);
                        this.f18882X++;
                        this.f18897n.m6389f(0);
                        km2Var.m7516b(this.f18897n, 8);
                        this.f18882X += 8;
                    }
                    if (i4 == 2) {
                        if (!this.f18878T) {
                            bj2Var.m6021a(this.f18892i.f13340a, 0, 1, false);
                            this.f18874P++;
                            this.f18892i.m6389f(0);
                            this.f18880V = this.f18892i.m6392i();
                            this.f18878T = true;
                        }
                        int i5 = this.f18880V * 4;
                        this.f18892i.m6384a(i5);
                        bj2Var.m6021a(this.f18892i.f13340a, 0, i5, false);
                        this.f18874P += i5;
                        int i6 = (this.f18880V >> 1) + 1;
                        int i7 = (i6 * 6) + 2;
                        ByteBuffer byteBuffer = this.f18899p;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.f18899p = ByteBuffer.allocate(i7);
                        }
                        this.f18899p.position(0);
                        this.f18899p.putShort((short) i6);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.f18880V;
                            if (i8 >= i2) {
                                break;
                            }
                            int iM6397n = this.f18892i.m6397n();
                            if (i8 % 2 == 0) {
                                this.f18899p.putShort((short) (iM6397n - i9));
                            } else {
                                this.f18899p.putInt(iM6397n - i9);
                            }
                            i8++;
                            i9 = iM6397n;
                        }
                        int i10 = (i - this.f18874P) - i9;
                        if ((i2 & 1) == 1) {
                            this.f18899p.putInt(i10);
                        } else {
                            this.f18899p.putShort((short) i10);
                            this.f18899p.putInt(0);
                        }
                        this.f18898o.m6385b(this.f18899p.array(), i7);
                        ((km2) lj2Var).m7516b(this.f18898o, i7);
                        this.f18882X += i7;
                    }
                }
            } else {
                byte[] bArr2 = qj2Var.f18341f;
                if (bArr2 != null) {
                    do2 do2Var2 = this.f18895l;
                    int length = bArr2.length;
                    do2Var2.f13340a = bArr2;
                    do2Var2.f13342c = length;
                    do2Var2.f13341b = 0;
                }
            }
            this.f18875Q = true;
        }
        int i11 = i + this.f18895l.f13342c;
        if (!"V_MPEG4/ISO/AVC".equals(qj2Var.f18336a) && !"V_MPEGH/ISO/HEVC".equals(qj2Var.f18336a)) {
            while (true) {
                int i12 = this.f18874P;
                if (i12 >= i11) {
                    break;
                } else {
                    m8292p(bj2Var, lj2Var, i11 - i12);
                }
            }
        } else {
            byte[] bArr3 = this.f18891h.f13340a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i13 = qj2Var.f18335P;
            int i14 = 4 - i13;
            while (this.f18874P < i11) {
                int i15 = this.f18881W;
                if (i15 == 0) {
                    int iMin = Math.min(i13, this.f18895l.m6386c());
                    bj2Var.m6021a(bArr3, i14 + iMin, i13 - iMin, false);
                    if (iMin > 0) {
                        do2 do2Var3 = this.f18895l;
                        System.arraycopy(do2Var3.f13340a, do2Var3.f13341b, bArr3, i14, iMin);
                        do2Var3.f13341b += iMin;
                    }
                    this.f18874P += i13;
                    this.f18891h.m6389f(0);
                    this.f18881W = this.f18891h.m6397n();
                    this.f18890g.m6389f(0);
                    ((km2) lj2Var).m7516b(this.f18890g, 4);
                    this.f18882X += 4;
                } else {
                    this.f18881W = i15 - m8292p(bj2Var, lj2Var, i15);
                }
            }
        }
        if ("A_VORBIS".equals(qj2Var.f18336a)) {
            this.f18893j.m6389f(0);
            ((km2) lj2Var).m7516b(this.f18893j, 4);
            this.f18882X += 4;
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m8292p(bj2 bj2Var, lj2 lj2Var, int i) throws InterruptedException, IOException {
        int iM7518d;
        int iM6386c = this.f18895l.m6386c();
        if (iM6386c > 0) {
            iM7518d = Math.min(i, iM6386c);
            ((km2) lj2Var).m7516b(this.f18895l, iM7518d);
        } else {
            iM7518d = ((km2) lj2Var).m7518d(bj2Var, i, false);
        }
        this.f18874P += iM7518d;
        this.f18882X += iM7518d;
        return iM7518d;
    }

    public rj2(int i) {
        nj2 nj2Var = new nj2();
        this.f18901r = -1L;
        this.f18902s = -9223372036854775807L;
        this.f18903t = -9223372036854775807L;
        this.f18904u = -9223372036854775807L;
        this.f18859A = -1L;
        this.f18860B = -1L;
        this.f18861C = -9223372036854775807L;
        this.f18886b0 = nj2Var;
        nj2Var.f17134g = new pj2(this);
        this.f18889f = true;
        this.f18887d = new tj2();
        this.f18888e = new SparseArray<>();
        this.f18892i = new do2(4);
        this.f18893j = new do2(ByteBuffer.allocate(4).putInt(-1).array());
        this.f18894k = new do2(4);
        this.f18890g = new do2(bo2.f12762a);
        this.f18891h = new do2(4);
        this.f18895l = new do2();
        this.f18896m = new do2();
        this.f18897n = new do2(8);
        this.f18898o = new do2();
    }
}
