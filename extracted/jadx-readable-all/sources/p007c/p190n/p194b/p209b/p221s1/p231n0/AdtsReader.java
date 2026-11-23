package p007c.p190n.p194b.p209b.p221s1.p231n0;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p215n1.AacUtil;
import p007c.p190n.p194b.p209b.p221s1.DummyTrackOutput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.k, reason: use source file name */
/* JADX INFO: compiled from: AdtsReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class AdtsReader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a */
    public static final byte[] f8227a = {73, 68, 51};

    /* JADX INFO: renamed from: b */
    public final boolean f8228b;

    /* JADX INFO: renamed from: c */
    public final ParsableBitArray f8229c;

    /* JADX INFO: renamed from: d */
    public final ParsableByteArray f8230d;

    /* JADX INFO: renamed from: e */
    public final String f8231e;

    /* JADX INFO: renamed from: f */
    public String f8232f;

    /* JADX INFO: renamed from: g */
    public TrackOutput2 f8233g;

    /* JADX INFO: renamed from: h */
    public TrackOutput2 f8234h;

    /* JADX INFO: renamed from: i */
    public int f8235i;

    /* JADX INFO: renamed from: j */
    public int f8236j;

    /* JADX INFO: renamed from: k */
    public int f8237k;

    /* JADX INFO: renamed from: l */
    public boolean f8238l;

    /* JADX INFO: renamed from: m */
    public boolean f8239m;

    /* JADX INFO: renamed from: n */
    public int f8240n;

    /* JADX INFO: renamed from: o */
    public int f8241o;

    /* JADX INFO: renamed from: p */
    public int f8242p;

    /* JADX INFO: renamed from: q */
    public boolean f8243q;

    /* JADX INFO: renamed from: r */
    public long f8244r;

    /* JADX INFO: renamed from: s */
    public int f8245s;

    /* JADX INFO: renamed from: t */
    public long f8246t;

    /* JADX INFO: renamed from: u */
    public TrackOutput2 f8247u;

    /* JADX INFO: renamed from: v */
    public long f8248v;

    public AdtsReader(boolean z) {
        this(z, null);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m3884g(int i) {
        return (i & 65526) == 65520;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3885a(ParsableByteArray parsableByteArray, byte[] bArr, int i) {
        int iMin = Math.min(parsableByteArray.m3196a(), i - this.f8236j);
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, this.f8236j, iMin);
        parsableByteArray.f6393b += iMin;
        int i2 = this.f8236j + iMin;
        this.f8236j = i2;
        return i2 == i;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x024e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0273  */
    /* JADX WARN: Code duplicated, block: B:119:0x027b  */
    /* JADX WARN: Code duplicated, block: B:121:0x027f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0283  */
    /* JADX WARN: Code duplicated, block: B:125:0x0287  */
    /* JADX WARN: Code duplicated, block: B:127:0x028b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0293  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:155:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:78:0x0209  */
    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: b */
    public void mo3870b(ParsableByteArray parsableByteArray) throws ParserException {
        int i;
        int i2;
        boolean z;
        int iM3183g;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Objects.requireNonNull(this.f8233g);
        int i8 = Util6.f6307a;
        while (parsableByteArray.m3196a() > 0) {
            int i9 = this.f8235i;
            int i10 = 7;
            int i11 = 2;
            if (i9 == 0) {
                byte[] bArr = parsableByteArray.f6392a;
                int i12 = parsableByteArray.f6393b;
                int i13 = parsableByteArray.f6394c;
                while (true) {
                    if (i12 < i13) {
                        int i14 = i12 + 1;
                        int i15 = bArr[i12] & 255;
                        if (this.f8237k == 512 && m3884g((((byte) i15) & 255) | 65280)) {
                            if (!this.f8239m) {
                                int i16 = i14 - 2;
                                parsableByteArray.m3194D(i16 + 1);
                                if (m3887i(parsableByteArray, this.f8229c.f6388a, 1)) {
                                    this.f8229c.m3187k(4);
                                    int iM3183g2 = this.f8229c.m3183g(1);
                                    int i17 = this.f8240n;
                                    if (i17 != -1 && iM3183g2 != i17) {
                                        z = false;
                                    } else if (this.f8241o == -1) {
                                        if (m3887i(parsableByteArray, this.f8229c.f6388a, 4)) {
                                            this.f8229c.m3187k(14);
                                            iM3183g = this.f8229c.m3183g(13);
                                            if (iM3183g >= i10) {
                                                byte[] bArr2 = parsableByteArray.f6392a;
                                                i3 = parsableByteArray.f6394c;
                                                i4 = i16 + iM3183g;
                                                if (i4 < i3 && (bArr2[i4] != -1 ? !(bArr2[i4] == 73 && ((i5 = i4 + 1) == i3 || (bArr2[i5] == 68 && ((i6 = i4 + 2) == i3 || bArr2[i6] == 51)))) : !((i7 = i4 + 1) == i3 || (m3884g((bArr2[i7] & 255) | 65280) && ((bArr2[i7] & 8) >> 3) == iM3183g2)))) {
                                                }
                                            }
                                            z = false;
                                        }
                                        z = true;
                                    } else if (m3887i(parsableByteArray, this.f8229c.f6388a, 1)) {
                                        this.f8229c.m3187k(i11);
                                        if (this.f8229c.m3183g(4) != this.f8241o) {
                                            z = false;
                                        } else {
                                            parsableByteArray.m3194D(i16 + 2);
                                            if (m3887i(parsableByteArray, this.f8229c.f6388a, 4)) {
                                                this.f8229c.m3187k(14);
                                                iM3183g = this.f8229c.m3183g(13);
                                                if (iM3183g >= i10) {
                                                    byte[] bArr3 = parsableByteArray.f6392a;
                                                    i3 = parsableByteArray.f6394c;
                                                    i4 = i16 + iM3183g;
                                                    if (i4 < i3) {
                                                    }
                                                }
                                                z = false;
                                            }
                                            z = true;
                                        }
                                    } else {
                                        z = true;
                                    }
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    i = this.f8237k;
                                    i2 = i15 | i;
                                    if (i2 != 329) {
                                        this.f8237k = 768;
                                    } else if (i2 != 511) {
                                        this.f8237k = 512;
                                    } else if (i2 != 836) {
                                        this.f8237k = 1024;
                                    } else if (i2 != 1075) {
                                        if (i != 256) {
                                            this.f8237k = 256;
                                            i12 = i14 - 1;
                                        }
                                        i10 = 7;
                                        i11 = 2;
                                    } else {
                                        this.f8235i = 2;
                                        this.f8236j = f8227a.length;
                                        this.f8245s = 0;
                                        this.f8230d.m3194D(0);
                                        parsableByteArray.m3194D(i14);
                                    }
                                    i12 = i14;
                                    i10 = 7;
                                    i11 = 2;
                                }
                            }
                            this.f8242p = (i15 & 8) >> 3;
                            this.f8238l = (i15 & 1) == 0;
                            if (this.f8239m) {
                                this.f8235i = 3;
                                this.f8236j = 0;
                            } else {
                                this.f8235i = 1;
                                this.f8236j = 0;
                            }
                            parsableByteArray.m3194D(i14);
                        } else {
                            i = this.f8237k;
                            i2 = i15 | i;
                            if (i2 != 329) {
                                this.f8237k = 768;
                            } else if (i2 != 511) {
                                this.f8237k = 512;
                            } else if (i2 != 836) {
                                this.f8237k = 1024;
                            } else if (i2 != 1075) {
                                if (i != 256) {
                                    this.f8237k = 256;
                                    i12 = i14 - 1;
                                }
                                i10 = 7;
                                i11 = 2;
                            } else {
                                this.f8235i = 2;
                                this.f8236j = f8227a.length;
                                this.f8245s = 0;
                                this.f8230d.m3194D(0);
                                parsableByteArray.m3194D(i14);
                            }
                            i12 = i14;
                            i10 = 7;
                            i11 = 2;
                        }
                    } else {
                        parsableByteArray.m3194D(i12);
                    }
                }
            } else if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 == 3) {
                        if (m3885a(parsableByteArray, this.f8229c.f6388a, this.f8238l ? 7 : 5)) {
                            this.f8229c.m3187k(0);
                            if (this.f8243q) {
                                this.f8229c.m3189m(10);
                            } else {
                                int iM3183g3 = this.f8229c.m3183g(2) + 1;
                                if (iM3183g3 != 2) {
                                    Log.w("AdtsReader", "Detected audio object type: " + iM3183g3 + ", but assuming AAC LC.");
                                    iM3183g3 = 2;
                                }
                                this.f8229c.m3189m(5);
                                byte[] bArrM3550a = AacUtil.m3550a(iM3183g3, this.f8241o, this.f8229c.m3183g(3));
                                AacUtil.b bVarM3554e = AacUtil.m3554e(bArrM3550a);
                                Format.b bVar = new Format.b();
                                bVar.f6948a = this.f8232f;
                                bVar.f6958k = "audio/mp4a-latm";
                                bVar.f6955h = bVarM3554e.f7085c;
                                bVar.f6971x = bVarM3554e.f7084b;
                                bVar.f6972y = bVarM3554e.f7083a;
                                bVar.f6960m = Collections.singletonList(bArrM3550a);
                                bVar.f6950c = this.f8231e;
                                Format formatM3519a = bVar.m3519a();
                                this.f8244r = 1024000000 / ((long) formatM3519a.f6916E);
                                this.f8233g.mo3760e(formatM3519a);
                                this.f8243q = true;
                            }
                            this.f8229c.m3189m(4);
                            int iM3183g4 = (this.f8229c.m3183g(13) - 2) - 5;
                            if (this.f8238l) {
                                iM3183g4 -= 2;
                            }
                            TrackOutput2 trackOutput2 = this.f8233g;
                            long j2 = this.f8244r;
                            this.f8235i = 4;
                            this.f8236j = 0;
                            this.f8247u = trackOutput2;
                            this.f8248v = j2;
                            this.f8245s = iM3183g4;
                        }
                    } else {
                        if (i9 != 4) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(parsableByteArray.m3196a(), this.f8245s - this.f8236j);
                        this.f8247u.mo3758c(parsableByteArray, iMin);
                        int i18 = this.f8236j + iMin;
                        this.f8236j = i18;
                        int i19 = this.f8245s;
                        if (i18 == i19) {
                            this.f8247u.mo3759d(this.f8246t, 1, i19, 0, null);
                            this.f8246t += this.f8248v;
                            m3886h();
                        }
                    }
                } else if (m3885a(parsableByteArray, this.f8230d.f6392a, 10)) {
                    this.f8234h.mo3758c(this.f8230d, 10);
                    this.f8230d.m3194D(6);
                    TrackOutput2 trackOutput3 = this.f8234h;
                    int iM3213r = this.f8230d.m3213r() + 10;
                    this.f8235i = 4;
                    this.f8236j = 10;
                    this.f8247u = trackOutput3;
                    this.f8248v = 0L;
                    this.f8245s = iM3213r;
                }
            } else if (parsableByteArray.m3196a() != 0) {
                ParsableBitArray parsableBitArray = this.f8229c;
                parsableBitArray.f6388a[0] = parsableByteArray.f6392a[parsableByteArray.f6393b];
                parsableBitArray.m3187k(2);
                int iM3183g5 = this.f8229c.m3183g(4);
                int i20 = this.f8241o;
                if (i20 == -1 || iM3183g5 == i20) {
                    if (!this.f8239m) {
                        this.f8239m = true;
                        this.f8240n = this.f8242p;
                        this.f8241o = iM3183g5;
                    }
                    this.f8235i = 3;
                    this.f8236j = 0;
                } else {
                    this.f8239m = false;
                    m3886h();
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: c */
    public void mo3871c() {
        this.f8239m = false;
        m3886h();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: d */
    public void mo3872d() {
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: e */
    public void mo3873e(ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        dVar.m3878a();
        this.f8232f = dVar.m3879b();
        TrackOutput2 trackOutput2Mo3774o = extractorOutput.mo3774o(dVar.m3880c(), 1);
        this.f8233g = trackOutput2Mo3774o;
        this.f8247u = trackOutput2Mo3774o;
        if (!this.f8228b) {
            this.f8234h = new DummyTrackOutput();
            return;
        }
        dVar.m3878a();
        TrackOutput2 trackOutput2Mo3774o2 = extractorOutput.mo3774o(dVar.m3880c(), 5);
        this.f8234h = trackOutput2Mo3774o2;
        Format.b bVar = new Format.b();
        bVar.f6948a = dVar.m3879b();
        bVar.f6958k = "application/id3";
        trackOutput2Mo3774o2.mo3760e(bVar.m3519a());
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: f */
    public void mo3874f(long j2, int i) {
        this.f8246t = j2;
    }

    /* JADX INFO: renamed from: h */
    public final void m3886h() {
        this.f8235i = 0;
        this.f8236j = 0;
        this.f8237k = 256;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3887i(ParsableByteArray parsableByteArray, byte[] bArr, int i) {
        if (parsableByteArray.m3196a() < i) {
            return false;
        }
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, 0, i);
        parsableByteArray.f6393b += i;
        return true;
    }

    public AdtsReader(boolean z, String str) {
        this.f8229c = new ParsableBitArray(new byte[7]);
        this.f8230d = new ParsableByteArray(Arrays.copyOf(f8227a, 10));
        m3886h();
        this.f8240n = -1;
        this.f8241o = -1;
        this.f8244r = -9223372036854775807L;
        this.f8228b = z;
        this.f8231e = str;
    }
}
