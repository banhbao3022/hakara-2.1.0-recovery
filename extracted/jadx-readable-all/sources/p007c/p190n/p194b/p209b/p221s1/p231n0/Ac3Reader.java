package p007c.p190n.p194b.p209b.p221s1.p231n0;

import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p215n1.Ac3Util;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.g, reason: use source file name */
/* JADX INFO: compiled from: Ac3Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class Ac3Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a */
    public final ParsableBitArray f8139a;

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f8140b;

    /* JADX INFO: renamed from: c */
    public final String f8141c;

    /* JADX INFO: renamed from: d */
    public String f8142d;

    /* JADX INFO: renamed from: e */
    public TrackOutput2 f8143e;

    /* JADX INFO: renamed from: f */
    public int f8144f;

    /* JADX INFO: renamed from: g */
    public int f8145g;

    /* JADX INFO: renamed from: h */
    public boolean f8146h;

    /* JADX INFO: renamed from: i */
    public long f8147i;

    /* JADX INFO: renamed from: j */
    public Format f8148j;

    /* JADX INFO: renamed from: k */
    public int f8149k;

    /* JADX INFO: renamed from: l */
    public long f8150l;

    public Ac3Reader() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:124:0x0209  */
    /* JADX WARN: Code duplicated, block: B:126:0x0211  */
    /* JADX WARN: Code duplicated, block: B:133:0x0225 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x0227  */
    /* JADX WARN: Code duplicated, block: B:135:0x022b  */
    /* JADX WARN: Code duplicated, block: B:137:0x022e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0234  */
    /* JADX WARN: Code duplicated, block: B:253:0x0237 A[SYNTHETIC] */
    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: b */
    public void mo3870b(ParsableByteArray parsableByteArray) {
        int i;
        int i2;
        int i3;
        String str;
        int iM3183g;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        C2096e.m4572h(this.f8143e);
        while (parsableByteArray.m3196a() > 0) {
            int i13 = this.f8144f;
            if (i13 == 0) {
                while (true) {
                    if (parsableByteArray.m3196a() <= 0) {
                        z = false;
                        break;
                    }
                    if (this.f8146h) {
                        int iM3214s = parsableByteArray.m3214s();
                        if (iM3214s == 119) {
                            this.f8146h = false;
                            z = true;
                            break;
                        }
                        this.f8146h = iM3214s == 11;
                    } else {
                        this.f8146h = parsableByteArray.m3214s() == 11;
                    }
                }
                if (z) {
                    this.f8144f = 1;
                    byte[] bArr = this.f8140b.f6392a;
                    bArr[0] = 11;
                    bArr[1] = 119;
                    this.f8145g = 2;
                }
            } else if (i13 == 1) {
                byte[] bArr2 = this.f8140b.f6392a;
                int iMin = Math.min(parsableByteArray.m3196a(), 128 - this.f8145g);
                System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr2, this.f8145g, iMin);
                parsableByteArray.f6393b += iMin;
                int i14 = this.f8145g + iMin;
                this.f8145g = i14;
                if (i14 == 128) {
                    this.f8139a.m3187k(0);
                    ParsableBitArray parsableBitArray = this.f8139a;
                    int iM3181e = parsableBitArray.m3181e();
                    parsableBitArray.m3189m(40);
                    boolean z2 = parsableBitArray.m3183g(5) > 10;
                    parsableBitArray.m3187k(iM3181e);
                    int i15 = -1;
                    if (z2) {
                        parsableBitArray.m3189m(16);
                        int iM3183g2 = parsableBitArray.m3183g(2);
                        if (iM3183g2 == 0) {
                            i15 = 0;
                        } else if (iM3183g2 == 1) {
                            i15 = 1;
                        } else if (iM3183g2 == 2) {
                            i15 = 2;
                        }
                        parsableBitArray.m3189m(3);
                        iM3183g = (parsableBitArray.m3183g(11) + 1) * 2;
                        int iM3183g3 = parsableBitArray.m3183g(2);
                        if (iM3183g3 == 3) {
                            i6 = Ac3Util.f7088c[parsableBitArray.m3183g(2)];
                            i5 = 6;
                            i4 = 3;
                        } else {
                            int iM3183g4 = parsableBitArray.m3183g(2);
                            i4 = iM3183g4;
                            i5 = Ac3Util.f7086a[iM3183g4];
                            i6 = Ac3Util.f7087b[iM3183g3];
                        }
                        i3 = i5 * 256;
                        int iM3183g5 = parsableBitArray.m3183g(3);
                        boolean zM3182f = parsableBitArray.m3182f();
                        i2 = Ac3Util.f7089d[iM3183g5] + (zM3182f ? 1 : 0);
                        parsableBitArray.m3189m(10);
                        if (parsableBitArray.m3182f()) {
                            parsableBitArray.m3189m(8);
                        }
                        if (iM3183g5 == 0) {
                            parsableBitArray.m3189m(5);
                            if (parsableBitArray.m3182f()) {
                                parsableBitArray.m3189m(8);
                            }
                        }
                        if (i15 == 1 && parsableBitArray.m3182f()) {
                            parsableBitArray.m3189m(16);
                        }
                        if (parsableBitArray.m3182f()) {
                            if (iM3183g5 > 2) {
                                parsableBitArray.m3189m(2);
                            }
                            if ((iM3183g5 & 1) == 0 || iM3183g5 <= 2) {
                                i9 = 6;
                            } else {
                                i9 = 6;
                                parsableBitArray.m3189m(6);
                            }
                            if ((iM3183g5 & 4) != 0) {
                                parsableBitArray.m3189m(i9);
                            }
                            if (zM3182f && parsableBitArray.m3182f()) {
                                parsableBitArray.m3189m(5);
                            }
                            if (i15 == 0) {
                                if (parsableBitArray.m3182f()) {
                                    i10 = 6;
                                    parsableBitArray.m3189m(6);
                                } else {
                                    i10 = 6;
                                }
                                if (iM3183g5 == 0 && parsableBitArray.m3182f()) {
                                    parsableBitArray.m3189m(i10);
                                }
                                if (parsableBitArray.m3182f()) {
                                    parsableBitArray.m3189m(i10);
                                }
                                int iM3183g6 = parsableBitArray.m3183g(2);
                                if (iM3183g6 == 1) {
                                    parsableBitArray.m3189m(5);
                                } else if (iM3183g6 == 2) {
                                    parsableBitArray.m3189m(12);
                                } else {
                                    if (iM3183g6 == 3) {
                                        int iM3183g7 = parsableBitArray.m3183g(5);
                                        if (parsableBitArray.m3182f()) {
                                            parsableBitArray.m3189m(5);
                                            if (parsableBitArray.m3182f()) {
                                                parsableBitArray.m3189m(4);
                                            }
                                            if (parsableBitArray.m3182f()) {
                                                parsableBitArray.m3189m(4);
                                            }
                                            if (parsableBitArray.m3182f()) {
                                                parsableBitArray.m3189m(4);
                                            }
                                            if (parsableBitArray.m3182f()) {
                                                parsableBitArray.m3189m(4);
                                            }
                                            if (parsableBitArray.m3182f()) {
                                                parsableBitArray.m3189m(4);
                                            }
                                            if (parsableBitArray.m3182f()) {
                                                parsableBitArray.m3189m(4);
                                            }
                                            if (parsableBitArray.m3182f()) {
                                                parsableBitArray.m3189m(4);
                                            }
                                            if (parsableBitArray.m3182f()) {
                                                if (parsableBitArray.m3182f()) {
                                                    parsableBitArray.m3189m(4);
                                                }
                                                if (parsableBitArray.m3182f()) {
                                                    parsableBitArray.m3189m(4);
                                                }
                                            }
                                        }
                                        if (parsableBitArray.m3182f()) {
                                            parsableBitArray.m3189m(5);
                                            if (parsableBitArray.m3182f()) {
                                                parsableBitArray.m3189m(7);
                                                if (parsableBitArray.m3182f()) {
                                                    parsableBitArray.m3189m(8);
                                                }
                                            }
                                        }
                                        i11 = 2;
                                        parsableBitArray.m3189m((iM3183g7 + 2) * 8);
                                        parsableBitArray.m3179c();
                                    }
                                    if (iM3183g5 < i11) {
                                        if (parsableBitArray.m3182f()) {
                                            parsableBitArray.m3189m(14);
                                        }
                                        if (iM3183g5 == 0 && parsableBitArray.m3182f()) {
                                            parsableBitArray.m3189m(14);
                                        }
                                    }
                                    if (parsableBitArray.m3182f()) {
                                        if (i4 == 0) {
                                            parsableBitArray.m3189m(5);
                                        } else {
                                            for (i12 = 0; i12 < i5; i12++) {
                                                if (parsableBitArray.m3182f()) {
                                                    parsableBitArray.m3189m(5);
                                                }
                                            }
                                        }
                                    }
                                }
                                i11 = 2;
                                if (iM3183g5 < i11) {
                                    if (parsableBitArray.m3182f()) {
                                        parsableBitArray.m3189m(14);
                                    }
                                    if (iM3183g5 == 0) {
                                        parsableBitArray.m3189m(14);
                                    }
                                }
                                if (parsableBitArray.m3182f()) {
                                    if (i4 == 0) {
                                        parsableBitArray.m3189m(5);
                                    } else {
                                        while (i12 < i5) {
                                            if (parsableBitArray.m3182f()) {
                                                parsableBitArray.m3189m(5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (parsableBitArray.m3182f()) {
                            parsableBitArray.m3189m(5);
                            if (iM3183g5 == 2) {
                                parsableBitArray.m3189m(4);
                            }
                            if (iM3183g5 >= 6) {
                                parsableBitArray.m3189m(2);
                            }
                            if (parsableBitArray.m3182f()) {
                                i8 = 8;
                                parsableBitArray.m3189m(8);
                            } else {
                                i8 = 8;
                            }
                            if (iM3183g5 == 0 && parsableBitArray.m3182f()) {
                                parsableBitArray.m3189m(i8);
                            }
                            if (iM3183g3 < 3) {
                                parsableBitArray.m3188l();
                            }
                        }
                        if (i15 == 0 && i4 != 3) {
                            parsableBitArray.m3188l();
                        }
                        if (i15 == 2 && (i4 == 3 || parsableBitArray.m3182f())) {
                            i7 = 6;
                            parsableBitArray.m3189m(6);
                        } else {
                            i7 = 6;
                        }
                        str = (parsableBitArray.m3182f() && parsableBitArray.m3183g(i7) == 1 && parsableBitArray.m3183g(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                        i15 = i6;
                    } else {
                        parsableBitArray.m3189m(32);
                        int iM3183g8 = parsableBitArray.m3183g(2);
                        String str2 = iM3183g8 == 3 ? null : "audio/ac3";
                        int iM3555a = Ac3Util.m3555a(iM3183g8, parsableBitArray.m3183g(6));
                        parsableBitArray.m3189m(8);
                        int iM3183g9 = parsableBitArray.m3183g(3);
                        if ((iM3183g9 & 1) == 0 || iM3183g9 == 1) {
                            i = 2;
                        } else {
                            i = 2;
                            parsableBitArray.m3189m(2);
                        }
                        if ((iM3183g9 & 4) != 0) {
                            parsableBitArray.m3189m(i);
                        }
                        if (iM3183g9 == i) {
                            parsableBitArray.m3189m(i);
                        }
                        int[] iArr = Ac3Util.f7087b;
                        i15 = iM3183g8 < iArr.length ? iArr[iM3183g8] : -1;
                        i2 = Ac3Util.f7089d[iM3183g9] + (parsableBitArray.m3182f() ? 1 : 0);
                        i3 = 1536;
                        str = str2;
                        iM3183g = iM3555a;
                    }
                    int i16 = i2;
                    Format format = this.f8148j;
                    if (format == null || i16 != format.f6915D || i15 != format.f6916E || !Util6.m3113a(str, format.f6934q)) {
                        Format.b bVar = new Format.b();
                        bVar.f6948a = this.f8142d;
                        bVar.f6958k = str;
                        bVar.f6971x = i16;
                        bVar.f6972y = i15;
                        bVar.f6950c = this.f8141c;
                        Format formatM3519a = bVar.m3519a();
                        this.f8148j = formatM3519a;
                        this.f8143e.mo3760e(formatM3519a);
                    }
                    this.f8149k = iM3183g;
                    this.f8147i = (((long) i3) * 1000000) / ((long) this.f8148j.f6916E);
                    this.f8140b.m3194D(0);
                    this.f8143e.mo3758c(this.f8140b, 128);
                    this.f8144f = 2;
                }
            } else if (i13 == 2) {
                int iMin2 = Math.min(parsableByteArray.m3196a(), this.f8149k - this.f8145g);
                this.f8143e.mo3758c(parsableByteArray, iMin2);
                int i17 = this.f8145g + iMin2;
                this.f8145g = i17;
                int i18 = this.f8149k;
                if (i17 == i18) {
                    this.f8143e.mo3759d(this.f8150l, 1, i18, 0, null);
                    this.f8150l += this.f8147i;
                    this.f8144f = 0;
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: c */
    public void mo3871c() {
        this.f8144f = 0;
        this.f8145g = 0;
        this.f8146h = false;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: d */
    public void mo3872d() {
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: e */
    public void mo3873e(ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        dVar.m3878a();
        this.f8142d = dVar.m3879b();
        this.f8143e = extractorOutput.mo3774o(dVar.m3880c(), 1);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: f */
    public void mo3874f(long j2, int i) {
        this.f8150l = j2;
    }

    public Ac3Reader(String str) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[128]);
        this.f8139a = parsableBitArray;
        this.f8140b = new ParsableByteArray(parsableBitArray.f6388a);
        this.f8144f = 0;
        this.f8141c = str;
    }
}
