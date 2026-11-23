package p007c.p190n.p194b.p209b.p221s1.p229l0;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.VorbisBitArray;
import p007c.p190n.p194b.p209b.p221s1.VorbisUtil;
import p007c.p190n.p194b.p209b.p221s1.VorbisUtil2;
import p007c.p190n.p194b.p209b.p221s1.VorbisUtil3;
import p007c.p190n.p194b.p209b.p221s1.VorbisUtil4;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.l0.j, reason: use source file name */
/* JADX INFO: compiled from: VorbisReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class VorbisReader extends StreamReader {

    /* JADX INFO: renamed from: n */
    public a f8073n;

    /* JADX INFO: renamed from: o */
    public int f8074o;

    /* JADX INFO: renamed from: p */
    public boolean f8075p;

    /* JADX INFO: renamed from: q */
    public VorbisUtil4 f8076q;

    /* JADX INFO: renamed from: r */
    public VorbisUtil2 f8077r;

    /* JADX INFO: renamed from: c.n.b.b.s1.l0.j$a */
    /* JADX INFO: compiled from: VorbisReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final VorbisUtil4 f8078a;

        /* JADX INFO: renamed from: b */
        public final byte[] f8079b;

        /* JADX INFO: renamed from: c */
        public final VorbisUtil3[] f8080c;

        /* JADX INFO: renamed from: d */
        public final int f8081d;

        public a(VorbisUtil4 vorbisUtil4, VorbisUtil2 vorbisUtil2, byte[] bArr, VorbisUtil3[] vorbisUtil3Arr, int i) {
            this.f8078a = vorbisUtil4;
            this.f8079b = bArr;
            this.f8080c = vorbisUtil3Arr;
            this.f8081d = i;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.StreamReader
    /* JADX INFO: renamed from: b */
    public void mo3857b(long j2) {
        this.f8064g = j2;
        this.f8075p = j2 != 0;
        VorbisUtil4 vorbisUtil4 = this.f8076q;
        this.f8074o = vorbisUtil4 != null ? vorbisUtil4.f7567e : 0;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.StreamReader
    /* JADX INFO: renamed from: c */
    public long mo3847c(ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.f6392a;
        if ((bArr[0] & 1) == 1) {
            return -1L;
        }
        byte b = bArr[0];
        a aVar = this.f8073n;
        C2096e.m4572h(aVar);
        a aVar2 = aVar;
        int i = !aVar2.f8080c[(b >> 1) & (255 >>> (8 - aVar2.f8081d))].f7556a ? aVar2.f8078a.f7567e : aVar2.f8078a.f7568f;
        long j2 = this.f8075p ? (this.f8074o + i) / 4 : 0;
        byte[] bArr2 = parsableByteArray.f6392a;
        int length = bArr2.length;
        int i2 = parsableByteArray.f6394c + 4;
        if (length < i2) {
            parsableByteArray.m3191A(Arrays.copyOf(bArr2, i2));
        } else {
            parsableByteArray.m3193C(i2);
        }
        byte[] bArr3 = parsableByteArray.f6392a;
        int i3 = parsableByteArray.f6394c;
        bArr3[i3 - 4] = (byte) (j2 & 255);
        bArr3[i3 - 3] = (byte) ((j2 >>> 8) & 255);
        bArr3[i3 - 2] = (byte) ((j2 >>> 16) & 255);
        bArr3[i3 - 1] = (byte) ((j2 >>> 24) & 255);
        this.f8075p = true;
        this.f8074o = i;
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x03dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:172:0x03de  */
    @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.StreamReader
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: d */
    public boolean mo3848d(ParsableByteArray parsableByteArray, long j2, StreamReader.b bVar) throws IOException {
        a aVar;
        if (this.f8073n != null) {
            Objects.requireNonNull(bVar.f8071a);
            return false;
        }
        VorbisUtil4 vorbisUtil4 = this.f8076q;
        if (vorbisUtil4 != null) {
            VorbisUtil2 vorbisUtil2 = this.f8077r;
            if (vorbisUtil2 == null) {
                this.f8077r = C1095a.m2376C(parsableByteArray, true, true);
            } else {
                int i = parsableByteArray.f6394c;
                byte[] bArr = new byte[i];
                System.arraycopy(parsableByteArray.f6392a, 0, bArr, 0, i);
                int i2 = vorbisUtil4.f7563a;
                int i3 = 5;
                C1095a.m2384K(5, parsableByteArray, false);
                int iM3214s = parsableByteArray.m3214s() + 1;
                VorbisBitArray vorbisBitArray = new VorbisBitArray(parsableByteArray.f6392a);
                vorbisBitArray.m3930c(parsableByteArray.f6393b * 8);
                int i4 = 0;
                while (true) {
                    int i5 = 16;
                    if (i4 >= iM3214s) {
                        VorbisUtil4 vorbisUtil5 = vorbisUtil4;
                        VorbisUtil2 vorbisUtil3 = vorbisUtil2;
                        byte[] bArr2 = bArr;
                        int i6 = 6;
                        int iM3929b = vorbisBitArray.m3929b(6) + 1;
                        for (int i7 = 0; i7 < iM3929b; i7++) {
                            if (vorbisBitArray.m3929b(16) != 0) {
                                throw new ParserException("placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i8 = 1;
                        int iM3929b2 = vorbisBitArray.m3929b(6) + 1;
                        int i9 = 0;
                        while (true) {
                            int i10 = 3;
                            if (i9 >= iM3929b2) {
                                int i11 = 1;
                                int iM3929b3 = vorbisBitArray.m3929b(i6) + 1;
                                int i12 = 0;
                                while (i12 < iM3929b3) {
                                    if (vorbisBitArray.m3929b(16) > 2) {
                                        throw new ParserException("residueType greater than 2 is not decodable");
                                    }
                                    vorbisBitArray.m3930c(24);
                                    vorbisBitArray.m3930c(24);
                                    vorbisBitArray.m3930c(24);
                                    int iM3929b4 = vorbisBitArray.m3929b(i6) + i11;
                                    int i13 = 8;
                                    vorbisBitArray.m3930c(8);
                                    int[] iArr = new int[iM3929b4];
                                    for (int i14 = 0; i14 < iM3929b4; i14++) {
                                        iArr[i14] = ((vorbisBitArray.m3928a() ? vorbisBitArray.m3929b(5) : 0) * 8) + vorbisBitArray.m3929b(3);
                                    }
                                    int i15 = 0;
                                    while (i15 < iM3929b4) {
                                        int i16 = 0;
                                        while (i16 < i13) {
                                            if ((iArr[i15] & (1 << i16)) != 0) {
                                                vorbisBitArray.m3930c(i13);
                                            }
                                            i16++;
                                            i13 = 8;
                                        }
                                        i15++;
                                        i13 = 8;
                                    }
                                    i12++;
                                    i6 = 6;
                                    i11 = 1;
                                }
                                int iM3929b5 = vorbisBitArray.m3929b(i6) + 1;
                                for (int i17 = 0; i17 < iM3929b5; i17++) {
                                    int iM3929b6 = vorbisBitArray.m3929b(16);
                                    if (iM3929b6 != 0) {
                                        Log.e("VorbisUtil", "mapping type other than 0 not supported: " + iM3929b6);
                                    } else {
                                        int iM3929b7 = vorbisBitArray.m3928a() ? vorbisBitArray.m3929b(4) + 1 : 1;
                                        if (vorbisBitArray.m3928a()) {
                                            int iM3929b8 = vorbisBitArray.m3929b(8) + 1;
                                            for (int i18 = 0; i18 < iM3929b8; i18++) {
                                                int i19 = i2 - 1;
                                                vorbisBitArray.m3930c(C1095a.m2403s(i19));
                                                vorbisBitArray.m3930c(C1095a.m2403s(i19));
                                            }
                                        }
                                        if (vorbisBitArray.m3929b(2) != 0) {
                                            throw new ParserException("to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iM3929b7 > 1) {
                                            for (int i20 = 0; i20 < i2; i20++) {
                                                vorbisBitArray.m3930c(4);
                                            }
                                        }
                                        for (int i21 = 0; i21 < iM3929b7; i21++) {
                                            vorbisBitArray.m3930c(8);
                                            vorbisBitArray.m3930c(8);
                                            vorbisBitArray.m3930c(8);
                                        }
                                    }
                                }
                                int iM3929b9 = vorbisBitArray.m3929b(6) + 1;
                                VorbisUtil3[] vorbisUtil3Arr = new VorbisUtil3[iM3929b9];
                                for (int i22 = 0; i22 < iM3929b9; i22++) {
                                    vorbisUtil3Arr[i22] = new VorbisUtil3(vorbisBitArray.m3928a(), vorbisBitArray.m3929b(16), vorbisBitArray.m3929b(16), vorbisBitArray.m3929b(8));
                                }
                                if (!vorbisBitArray.m3928a()) {
                                    throw new ParserException("framing bit after modes not set as expected");
                                }
                                aVar = new a(vorbisUtil5, vorbisUtil3, bArr2, vorbisUtil3Arr, C1095a.m2403s(iM3929b9 - 1));
                                break;
                            }
                            int iM3929b10 = vorbisBitArray.m3929b(i5);
                            if (iM3929b10 == 0) {
                                int i23 = 8;
                                vorbisBitArray.m3930c(8);
                                vorbisBitArray.m3930c(16);
                                vorbisBitArray.m3930c(16);
                                vorbisBitArray.m3930c(6);
                                vorbisBitArray.m3930c(8);
                                int iM3929b11 = vorbisBitArray.m3929b(4) + 1;
                                int i24 = 0;
                                while (i24 < iM3929b11) {
                                    vorbisBitArray.m3930c(i23);
                                    i24++;
                                    i23 = 8;
                                }
                            } else {
                                if (iM3929b10 != i8) {
                                    throw new ParserException(outline.m1590l("floor type greater than 1 not decodable: ", iM3929b10));
                                }
                                int iM3929b12 = vorbisBitArray.m3929b(5);
                                int[] iArr2 = new int[iM3929b12];
                                int i25 = -1;
                                for (int i26 = 0; i26 < iM3929b12; i26++) {
                                    iArr2[i26] = vorbisBitArray.m3929b(4);
                                    if (iArr2[i26] > i25) {
                                        i25 = iArr2[i26];
                                    }
                                }
                                int i27 = i25 + 1;
                                int[] iArr3 = new int[i27];
                                int i28 = 0;
                                while (i28 < i27) {
                                    iArr3[i28] = vorbisBitArray.m3929b(i10) + 1;
                                    int iM3929b13 = vorbisBitArray.m3929b(2);
                                    int i29 = 8;
                                    if (iM3929b13 > 0) {
                                        vorbisBitArray.m3930c(8);
                                    }
                                    int i30 = 0;
                                    for (int i31 = 1; i30 < (i31 << iM3929b13); i31 = 1) {
                                        vorbisBitArray.m3930c(i29);
                                        i30++;
                                        i29 = 8;
                                    }
                                    i28++;
                                    i10 = 3;
                                }
                                vorbisBitArray.m3930c(2);
                                int iM3929b14 = vorbisBitArray.m3929b(4);
                                int i32 = 0;
                                int i33 = 0;
                                for (int i34 = 0; i34 < iM3929b12; i34++) {
                                    i32 += iArr3[iArr2[i34]];
                                    while (i33 < i32) {
                                        vorbisBitArray.m3930c(iM3929b14);
                                        i33++;
                                    }
                                }
                            }
                            i9++;
                            i6 = 6;
                            i8 = 1;
                            i5 = 16;
                        }
                    } else {
                        if (vorbisBitArray.m3929b(24) != 5653314) {
                            StringBuilder sbM1556G = outline.m1556G("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sbM1556G.append((vorbisBitArray.f8533c * 8) + vorbisBitArray.f8534d);
                            throw new ParserException(sbM1556G.toString());
                        }
                        int iM3929b15 = vorbisBitArray.m3929b(16);
                        int iM3929b16 = vorbisBitArray.m3929b(24);
                        long[] jArr = new long[iM3929b16];
                        boolean zM3928a = vorbisBitArray.m3928a();
                        if (zM3928a) {
                            int iM3929b17 = vorbisBitArray.m3929b(5) + 1;
                            int i35 = 0;
                            while (i35 < iM3929b16) {
                                int iM3929b18 = vorbisBitArray.m3929b(C1095a.m2403s(iM3929b16 - i35));
                                int i36 = 0;
                                while (i36 < iM3929b18 && i35 < iM3929b16) {
                                    jArr[i35] = iM3929b17;
                                    i35++;
                                    i36++;
                                    bArr = bArr;
                                    iM3214s = iM3214s;
                                }
                                iM3929b17++;
                                bArr = bArr;
                                iM3214s = iM3214s;
                            }
                        } else {
                            boolean zM3928a2 = vorbisBitArray.m3928a();
                            int i37 = 0;
                            while (i37 < iM3929b16) {
                                if (!zM3928a2) {
                                    jArr[i37] = vorbisBitArray.m3929b(i3) + 1;
                                } else if (vorbisBitArray.m3928a()) {
                                    jArr[i37] = vorbisBitArray.m3929b(i3) + 1;
                                } else {
                                    jArr[i37] = 0;
                                }
                                i37++;
                                i3 = 5;
                                zM3928a2 = zM3928a2;
                            }
                        }
                        byte[] bArr3 = bArr;
                        int i38 = iM3214s;
                        int iM3929b19 = vorbisBitArray.m3929b(4);
                        if (iM3929b19 > 2) {
                            throw new ParserException(outline.m1590l("lookup type greater than 2 not decodable: ", iM3929b19));
                        }
                        if (iM3929b19 == 1 || iM3929b19 == 2) {
                            vorbisBitArray.m3930c(32);
                            vorbisBitArray.m3930c(32);
                            int iM3929b20 = vorbisBitArray.m3929b(4) + 1;
                            vorbisBitArray.m3930c(1);
                            vorbisBitArray.m3930c((int) (((long) iM3929b20) * (iM3929b19 == 1 ? iM3929b15 != 0 ? (long) Math.floor(Math.pow(iM3929b16, 1.0d / ((double) iM3929b15))) : 0L : ((long) iM3929b15) * ((long) iM3929b16))));
                        } else {
                            vorbisUtil4 = vorbisUtil4;
                            vorbisUtil2 = vorbisUtil2;
                        }
                        new VorbisUtil(iM3929b15, iM3929b16, jArr, iM3929b19, zM3928a);
                        i4++;
                        i3 = 5;
                        bArr = bArr3;
                        vorbisUtil4 = vorbisUtil4;
                        iM3214s = i38;
                        vorbisUtil2 = vorbisUtil2;
                    }
                }
            }
            this.f8073n = aVar;
            if (aVar == null) {
                return true;
            }
            VorbisUtil4 vorbisUtil6 = aVar.f8078a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(vorbisUtil6.f7569g);
            arrayList.add(aVar.f8079b);
            Format.b bVar2 = new Format.b();
            bVar2.f6958k = "audio/vorbis";
            bVar2.f6953f = vorbisUtil6.f7566d;
            bVar2.f6954g = vorbisUtil6.f7565c;
            bVar2.f6971x = vorbisUtil6.f7563a;
            bVar2.f6972y = vorbisUtil6.f7564b;
            bVar2.f6960m = arrayList;
            bVar.f8071a = bVar2.m3519a();
            return true;
        }
        C1095a.m2384K(1, parsableByteArray, false);
        int iM3206k = parsableByteArray.m3206k();
        int iM3214s2 = parsableByteArray.m3214s();
        int iM3206k2 = parsableByteArray.m3206k();
        int iM3203h = parsableByteArray.m3203h();
        int i39 = iM3203h <= 0 ? -1 : iM3203h;
        int iM3203h2 = parsableByteArray.m3203h();
        int i40 = iM3203h2 <= 0 ? -1 : iM3203h2;
        int iM3203h3 = parsableByteArray.m3203h();
        int i41 = iM3203h3 <= 0 ? -1 : iM3203h3;
        int iM3214s3 = parsableByteArray.m3214s();
        this.f8076q = new VorbisUtil4(iM3206k, iM3214s2, iM3206k2, i39, i40, i41, (int) Math.pow(2.0d, iM3214s3 & 15), (int) Math.pow(2.0d, (iM3214s3 & 240) >> 4), (1 & parsableByteArray.m3214s()) > 0, Arrays.copyOf(parsableByteArray.f6392a, parsableByteArray.f6394c));
        aVar = null;
        this.f8073n = aVar;
        if (aVar == null) {
            return true;
        }
        VorbisUtil4 vorbisUtil7 = aVar.f8078a;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(vorbisUtil7.f7569g);
        arrayList2.add(aVar.f8079b);
        Format.b bVar3 = new Format.b();
        bVar3.f6958k = "audio/vorbis";
        bVar3.f6953f = vorbisUtil7.f7566d;
        bVar3.f6954g = vorbisUtil7.f7565c;
        bVar3.f6971x = vorbisUtil7.f7563a;
        bVar3.f6972y = vorbisUtil7.f7564b;
        bVar3.f6960m = arrayList2;
        bVar.f8071a = bVar3.m3519a();
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.StreamReader
    /* JADX INFO: renamed from: e */
    public void mo3849e(boolean z) {
        super.mo3849e(z);
        if (z) {
            this.f8073n = null;
            this.f8076q = null;
            this.f8077r = null;
        }
        this.f8074o = 0;
        this.f8075p = false;
    }
}
