package p007c.p190n.p194b.p209b.p221s1.p231n0;

import com.facebook.stetho.websocket.CloseCodes;
import java.util.Arrays;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p215n1.DtsUtil;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.m, reason: use source file name */
/* JADX INFO: compiled from: DtsReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class DtsReader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: b */
    public final String f8252b;

    /* JADX INFO: renamed from: c */
    public String f8253c;

    /* JADX INFO: renamed from: d */
    public TrackOutput2 f8254d;

    /* JADX INFO: renamed from: f */
    public int f8256f;

    /* JADX INFO: renamed from: g */
    public int f8257g;

    /* JADX INFO: renamed from: h */
    public long f8258h;

    /* JADX INFO: renamed from: i */
    public Format f8259i;

    /* JADX INFO: renamed from: j */
    public int f8260j;

    /* JADX INFO: renamed from: k */
    public long f8261k;

    /* JADX INFO: renamed from: a */
    public final ParsableByteArray f8251a = new ParsableByteArray(new byte[18]);

    /* JADX INFO: renamed from: e */
    public int f8255e = 0;

    public DtsReader(String str) {
        this.f8252b = str;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0217  */
    /* JADX WARN: Code duplicated, block: B:71:0x0225  */
    /* JADX WARN: Code duplicated, block: B:73:0x0228  */
    /* JADX WARN: Code duplicated, block: B:75:0x022c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0236  */
    /* JADX WARN: Code duplicated, block: B:77:0x0240  */
    /* JADX WARN: Code duplicated, block: B:79:0x024d  */
    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: b */
    public void mo3870b(ParsableByteArray parsableByteArray) {
        int i;
        int i2;
        byte b;
        boolean z;
        int i3;
        byte b2;
        int i4;
        byte b3;
        int i5;
        byte b4;
        int i6;
        byte b5;
        ParsableBitArray parsableBitArray;
        int i7;
        int i8;
        boolean z2;
        C2096e.m4572h(this.f8254d);
        while (parsableByteArray.m3196a() > 0) {
            int i9 = this.f8255e;
            int i10 = 8;
            int i11 = 2;
            if (i9 == 0) {
                while (true) {
                    if (parsableByteArray.m3196a() <= 0) {
                        z2 = false;
                        break;
                    }
                    int i12 = this.f8257g << 8;
                    this.f8257g = i12;
                    int iM3214s = i12 | parsableByteArray.m3214s();
                    this.f8257g = iM3214s;
                    if (iM3214s == 2147385345 || iM3214s == -25230976 || iM3214s == 536864768 || iM3214s == -14745368) {
                        byte[] bArr = this.f8251a.f6392a;
                        bArr[0] = (byte) ((iM3214s >> 24) & 255);
                        bArr[1] = (byte) ((iM3214s >> 16) & 255);
                        bArr[2] = (byte) ((iM3214s >> 8) & 255);
                        bArr[3] = (byte) (iM3214s & 255);
                        this.f8256f = 4;
                        this.f8257g = 0;
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    this.f8255e = 1;
                }
            } else if (i9 == 1) {
                byte[] bArr2 = this.f8251a.f6392a;
                int iMin = Math.min(parsableByteArray.m3196a(), 18 - this.f8256f);
                System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr2, this.f8256f, iMin);
                parsableByteArray.f6393b += iMin;
                int i13 = this.f8256f + iMin;
                this.f8256f = i13;
                if (i13 == 18) {
                    byte[] bArr3 = this.f8251a.f6392a;
                    if (this.f8259i == null) {
                        String str = this.f8253c;
                        String str2 = this.f8252b;
                        if (bArr3[0] == 127) {
                            parsableBitArray = new ParsableBitArray(bArr3);
                        } else {
                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
                            if (bArrCopyOf[0] == -2 || bArrCopyOf[0] == -1) {
                                for (int i14 = 0; i14 < bArrCopyOf.length - 1; i14 += 2) {
                                    byte b6 = bArrCopyOf[i14];
                                    int i15 = i14 + 1;
                                    bArrCopyOf[i14] = bArrCopyOf[i15];
                                    bArrCopyOf[i15] = b6;
                                }
                            }
                            ParsableBitArray parsableBitArray2 = new ParsableBitArray(bArrCopyOf);
                            if (bArrCopyOf[0] == 31) {
                                ParsableBitArray parsableBitArray3 = new ParsableBitArray(bArrCopyOf);
                                while (parsableBitArray3.m3178b() >= 16) {
                                    parsableBitArray3.m3189m(i11);
                                    int iM3183g = parsableBitArray3.m3183g(14) & 16383;
                                    int iMin2 = Math.min(8 - parsableBitArray2.f6390c, 14);
                                    int i16 = parsableBitArray2.f6390c;
                                    int i17 = (8 - i16) - iMin2;
                                    byte[] bArr4 = parsableBitArray2.f6388a;
                                    int i18 = parsableBitArray2.f6389b;
                                    bArr4[i18] = (byte) (((65280 >> i16) | ((1 << i17) - 1)) & bArr4[i18]);
                                    int i19 = 14 - iMin2;
                                    bArr4[i18] = (byte) (((iM3183g >>> i19) << i17) | bArr4[i18]);
                                    int i20 = i18 + 1;
                                    while (i19 > i10) {
                                        i19 -= 8;
                                        parsableBitArray2.f6388a[i20] = (byte) (iM3183g >>> i19);
                                        i20++;
                                        i10 = 8;
                                    }
                                    int i21 = 8 - i19;
                                    byte[] bArr5 = parsableBitArray2.f6388a;
                                    bArr5[i20] = (byte) (bArr5[i20] & ((1 << i21) - 1));
                                    bArr5[i20] = (byte) (((((1 << i19) - 1) & iM3183g) << i21) | bArr5[i20]);
                                    parsableBitArray2.m3189m(14);
                                    parsableBitArray2.m3177a();
                                    i10 = 8;
                                    i11 = 2;
                                }
                            }
                            int length = bArrCopyOf.length;
                            parsableBitArray2.f6388a = bArrCopyOf;
                            parsableBitArray2.f6389b = 0;
                            parsableBitArray2.f6390c = 0;
                            parsableBitArray2.f6391d = length;
                            parsableBitArray = parsableBitArray2;
                        }
                        parsableBitArray.m3189m(60);
                        int i22 = DtsUtil.f7254a[parsableBitArray.m3183g(6)];
                        int i23 = DtsUtil.f7255b[parsableBitArray.m3183g(4)];
                        int iM3183g2 = parsableBitArray.m3183g(5);
                        int[] iArr = DtsUtil.f7256c;
                        if (iM3183g2 >= iArr.length) {
                            i8 = -1;
                            i7 = 2;
                        } else {
                            int i24 = iArr[iM3183g2] * CloseCodes.NORMAL_CLOSURE;
                            i7 = 2;
                            i8 = i24 / 2;
                        }
                        parsableBitArray.m3189m(10);
                        int i25 = i22 + (parsableBitArray.m3183g(i7) > 0 ? 1 : 0);
                        Format.b bVar = new Format.b();
                        bVar.f6948a = str;
                        bVar.f6958k = "audio/vnd.dts";
                        bVar.f6953f = i8;
                        bVar.f6971x = i25;
                        bVar.f6972y = i23;
                        bVar.f6961n = null;
                        bVar.f6950c = str2;
                        Format formatM3519a = bVar.m3519a();
                        this.f8259i = formatM3519a;
                        this.f8254d.mo3760e(formatM3519a);
                    }
                    byte b7 = bArr3[0];
                    if (b7 != -2) {
                        if (b7 == -1) {
                            i6 = ((3 & bArr3[7]) << 12) | ((bArr3[6] & 255) << 4);
                            b5 = bArr3[9];
                        } else if (b7 != 31) {
                            i = 4;
                            i2 = ((3 & bArr3[5]) << 12) | ((bArr3[6] & 255) << 4);
                            b = bArr3[7];
                        } else {
                            i6 = ((3 & bArr3[6]) << 12) | ((bArr3[7] & 255) << 4);
                            b5 = bArr3[8];
                        }
                        i3 = (i6 | ((b5 & 60) >> 2)) + 1;
                        z = true;
                        if (z) {
                            i3 = (i3 * 16) / 14;
                        }
                        this.f8260j = i3;
                        b2 = bArr3[0];
                        if (b2 != -2) {
                            if (b2 != -1) {
                                int i26 = (bArr3[4] & 7) << 4;
                                b4 = bArr3[7];
                                i4 = i26;
                            } else if (b2 != 31) {
                                i4 = (bArr3[4] & 1) << 6;
                                b3 = bArr3[5];
                            } else {
                                i4 = (7 & bArr3[5]) << 4;
                                b4 = bArr3[6];
                            }
                            i5 = b4 & 60;
                            this.f8258h = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * 1000000) / ((long) this.f8259i.f6916E));
                            this.f8251a.m3194D(0);
                            this.f8254d.mo3758c(this.f8251a, 18);
                            this.f8255e = 2;
                        } else {
                            i4 = (bArr3[5] & 1) << 6;
                            b3 = bArr3[4];
                        }
                        i5 = b3 & 252;
                        this.f8258h = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * 1000000) / ((long) this.f8259i.f6916E));
                        this.f8251a.m3194D(0);
                        this.f8254d.mo3758c(this.f8251a, 18);
                        this.f8255e = 2;
                    } else {
                        i = 4;
                        i2 = ((bArr3[4] & 3) << 12) | ((bArr3[7] & 255) << 4);
                        b = bArr3[6];
                    }
                    i3 = (i2 | ((b & 240) >> i)) + 1;
                    z = false;
                    if (z) {
                        i3 = (i3 * 16) / 14;
                    }
                    this.f8260j = i3;
                    b2 = bArr3[0];
                    if (b2 != -2) {
                        if (b2 != -1) {
                            int i27 = (bArr3[4] & 7) << 4;
                            b4 = bArr3[7];
                            i4 = i27;
                        } else if (b2 != 31) {
                            i4 = (bArr3[4] & 1) << 6;
                            b3 = bArr3[5];
                        } else {
                            i4 = (7 & bArr3[5]) << 4;
                            b4 = bArr3[6];
                        }
                        i5 = b4 & 60;
                        this.f8258h = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * 1000000) / ((long) this.f8259i.f6916E));
                        this.f8251a.m3194D(0);
                        this.f8254d.mo3758c(this.f8251a, 18);
                        this.f8255e = 2;
                    } else {
                        i4 = (bArr3[5] & 1) << 6;
                        b3 = bArr3[4];
                    }
                    i5 = b3 & 252;
                    this.f8258h = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * 1000000) / ((long) this.f8259i.f6916E));
                    this.f8251a.m3194D(0);
                    this.f8254d.mo3758c(this.f8251a, 18);
                    this.f8255e = 2;
                }
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException();
                }
                int iMin3 = Math.min(parsableByteArray.m3196a(), this.f8260j - this.f8256f);
                this.f8254d.mo3758c(parsableByteArray, iMin3);
                int i28 = this.f8256f + iMin3;
                this.f8256f = i28;
                int i29 = this.f8260j;
                if (i28 == i29) {
                    this.f8254d.mo3759d(this.f8261k, 1, i29, 0, null);
                    this.f8261k += this.f8258h;
                    this.f8255e = 0;
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: c */
    public void mo3871c() {
        this.f8255e = 0;
        this.f8256f = 0;
        this.f8257g = 0;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: d */
    public void mo3872d() {
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: e */
    public void mo3873e(ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        dVar.m3878a();
        this.f8253c = dVar.m3879b();
        this.f8254d = extractorOutput.mo3774o(dVar.m3880c(), 1);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: f */
    public void mo3874f(long j2, int i) {
        this.f8261k = j2;
    }
}
