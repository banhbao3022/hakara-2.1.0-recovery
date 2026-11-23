package p007c.p190n.p194b.p209b.p221s1.p231n0;

import java.util.Collections;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p215n1.AacUtil;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.u, reason: use source file name */
/* JADX INFO: compiled from: LatmReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class LatmReader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a */
    public final String f8398a;

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f8399b;

    /* JADX INFO: renamed from: c */
    public final ParsableBitArray f8400c;

    /* JADX INFO: renamed from: d */
    public TrackOutput2 f8401d;

    /* JADX INFO: renamed from: e */
    public String f8402e;

    /* JADX INFO: renamed from: f */
    public Format f8403f;

    /* JADX INFO: renamed from: g */
    public int f8404g;

    /* JADX INFO: renamed from: h */
    public int f8405h;

    /* JADX INFO: renamed from: i */
    public int f8406i;

    /* JADX INFO: renamed from: j */
    public int f8407j;

    /* JADX INFO: renamed from: k */
    public long f8408k;

    /* JADX INFO: renamed from: l */
    public boolean f8409l;

    /* JADX INFO: renamed from: m */
    public int f8410m;

    /* JADX INFO: renamed from: n */
    public int f8411n;

    /* JADX INFO: renamed from: o */
    public int f8412o;

    /* JADX INFO: renamed from: p */
    public boolean f8413p;

    /* JADX INFO: renamed from: q */
    public long f8414q;

    /* JADX INFO: renamed from: r */
    public int f8415r;

    /* JADX INFO: renamed from: s */
    public long f8416s;

    /* JADX INFO: renamed from: t */
    public int f8417t;

    /* JADX INFO: renamed from: u */
    public String f8418u;

    public LatmReader(String str) {
        this.f8398a = str;
        ParsableByteArray parsableByteArray = new ParsableByteArray(1024);
        this.f8399b = parsableByteArray;
        this.f8400c = new ParsableBitArray(parsableByteArray.f6392a);
    }

    /* JADX INFO: renamed from: a */
    public static long m3898a(ParsableBitArray parsableBitArray) {
        return parsableBitArray.m3183g((parsableBitArray.m3183g(2) + 1) * 8);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: b */
    public void mo3870b(ParsableByteArray parsableByteArray) throws ParserException {
        int i;
        boolean zM3182f;
        C2096e.m4572h(this.f8401d);
        while (parsableByteArray.m3196a() > 0) {
            int i2 = this.f8404g;
            if (i2 != 0) {
                if (i2 == 1) {
                    int iM3214s = parsableByteArray.m3214s();
                    if ((iM3214s & 224) == 224) {
                        this.f8407j = iM3214s;
                        this.f8404g = 2;
                    } else if (iM3214s != 86) {
                        this.f8404g = 0;
                    }
                } else if (i2 == 2) {
                    int iM3214s2 = ((this.f8407j & (-225)) << 8) | parsableByteArray.m3214s();
                    this.f8406i = iM3214s2;
                    ParsableByteArray parsableByteArray2 = this.f8399b;
                    byte[] bArr = parsableByteArray2.f6392a;
                    if (iM3214s2 > bArr.length) {
                        if (bArr.length < iM3214s2) {
                            bArr = new byte[iM3214s2];
                        }
                        parsableByteArray2.m3192B(bArr, iM3214s2);
                        ParsableBitArray parsableBitArray = this.f8400c;
                        byte[] bArr2 = this.f8399b.f6392a;
                        Objects.requireNonNull(parsableBitArray);
                        int length = bArr2.length;
                        parsableBitArray.f6388a = bArr2;
                        parsableBitArray.f6389b = 0;
                        parsableBitArray.f6390c = 0;
                        parsableBitArray.f6391d = length;
                    }
                    this.f8405h = 0;
                    this.f8404g = 3;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(parsableByteArray.m3196a(), this.f8406i - this.f8405h);
                    parsableByteArray.m3200e(this.f8400c.f6388a, this.f8405h, iMin);
                    int i3 = this.f8405h + iMin;
                    this.f8405h = i3;
                    if (i3 == this.f8406i) {
                        this.f8400c.m3187k(0);
                        ParsableBitArray parsableBitArray2 = this.f8400c;
                        if (parsableBitArray2.m3182f()) {
                            if (this.f8409l) {
                            }
                            this.f8404g = 0;
                        } else {
                            this.f8409l = true;
                            int iM3183g = parsableBitArray2.m3183g(1);
                            int iM3183g2 = iM3183g == 1 ? parsableBitArray2.m3183g(1) : 0;
                            this.f8410m = iM3183g2;
                            if (iM3183g2 != 0) {
                                throw new ParserException();
                            }
                            if (iM3183g == 1) {
                                m3898a(parsableBitArray2);
                            }
                            if (!parsableBitArray2.m3182f()) {
                                throw new ParserException();
                            }
                            this.f8411n = parsableBitArray2.m3183g(6);
                            int iM3183g3 = parsableBitArray2.m3183g(4);
                            int iM3183g4 = parsableBitArray2.m3183g(3);
                            if (iM3183g3 != 0 || iM3183g4 != 0) {
                                throw new ParserException();
                            }
                            if (iM3183g == 0) {
                                int iM3181e = parsableBitArray2.m3181e();
                                int iM3899g = m3899g(parsableBitArray2);
                                parsableBitArray2.m3187k(iM3181e);
                                byte[] bArr3 = new byte[(iM3899g + 7) / 8];
                                parsableBitArray2.m3184h(bArr3, 0, iM3899g);
                                Format.b bVar = new Format.b();
                                bVar.f6948a = this.f8402e;
                                bVar.f6958k = "audio/mp4a-latm";
                                bVar.f6955h = this.f8418u;
                                bVar.f6971x = this.f8417t;
                                bVar.f6972y = this.f8415r;
                                bVar.f6960m = Collections.singletonList(bArr3);
                                bVar.f6950c = this.f8398a;
                                Format formatM3519a = bVar.m3519a();
                                if (!formatM3519a.equals(this.f8403f)) {
                                    this.f8403f = formatM3519a;
                                    this.f8416s = 1024000000 / ((long) formatM3519a.f6916E);
                                    this.f8401d.mo3760e(formatM3519a);
                                }
                            } else {
                                parsableBitArray2.m3189m(((int) m3898a(parsableBitArray2)) - m3899g(parsableBitArray2));
                            }
                            int iM3183g5 = parsableBitArray2.m3183g(3);
                            this.f8412o = iM3183g5;
                            if (iM3183g5 == 0) {
                                parsableBitArray2.m3189m(8);
                            } else if (iM3183g5 == 1) {
                                parsableBitArray2.m3189m(9);
                            } else if (iM3183g5 == 3 || iM3183g5 == 4 || iM3183g5 == 5) {
                                parsableBitArray2.m3189m(6);
                            } else {
                                if (iM3183g5 != 6 && iM3183g5 != 7) {
                                    throw new IllegalStateException();
                                }
                                parsableBitArray2.m3189m(1);
                            }
                            boolean zM3182f2 = parsableBitArray2.m3182f();
                            this.f8413p = zM3182f2;
                            this.f8414q = 0L;
                            if (zM3182f2) {
                                if (iM3183g == 1) {
                                    this.f8414q = m3898a(parsableBitArray2);
                                } else {
                                    do {
                                        zM3182f = parsableBitArray2.m3182f();
                                        this.f8414q = (this.f8414q << 8) + ((long) parsableBitArray2.m3183g(8));
                                    } while (zM3182f);
                                }
                            }
                            if (parsableBitArray2.m3182f()) {
                                parsableBitArray2.m3189m(8);
                            }
                        }
                        if (this.f8410m != 0) {
                            throw new ParserException();
                        }
                        if (this.f8411n != 0) {
                            throw new ParserException();
                        }
                        if (this.f8412o != 0) {
                            throw new ParserException();
                        }
                        int i4 = 0;
                        while (true) {
                            int iM3183g6 = parsableBitArray2.m3183g(8);
                            i = i4 + iM3183g6;
                            if (iM3183g6 != 255) {
                                break;
                            } else {
                                i4 = i;
                            }
                        }
                        int iM3181e2 = parsableBitArray2.m3181e();
                        if ((iM3181e2 & 7) == 0) {
                            this.f8399b.m3194D(iM3181e2 >> 3);
                        } else {
                            parsableBitArray2.m3184h(this.f8399b.f6392a, 0, i * 8);
                            this.f8399b.m3194D(0);
                        }
                        this.f8401d.mo3758c(this.f8399b, i);
                        this.f8401d.mo3759d(this.f8408k, 1, i, 0, null);
                        this.f8408k += this.f8416s;
                        if (this.f8413p) {
                            parsableBitArray2.m3189m((int) this.f8414q);
                        }
                        this.f8404g = 0;
                    } else {
                        continue;
                    }
                }
            } else if (parsableByteArray.m3214s() == 86) {
                this.f8404g = 1;
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: c */
    public void mo3871c() {
        this.f8404g = 0;
        this.f8409l = false;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: d */
    public void mo3872d() {
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: e */
    public void mo3873e(ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        dVar.m3878a();
        this.f8401d = extractorOutput.mo3774o(dVar.m3880c(), 1);
        this.f8402e = dVar.m3879b();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: f */
    public void mo3874f(long j2, int i) {
        this.f8408k = j2;
    }

    /* JADX INFO: renamed from: g */
    public final int m3899g(ParsableBitArray parsableBitArray) throws ParserException {
        int iM3178b = parsableBitArray.m3178b();
        AacUtil.b bVarM3553d = AacUtil.m3553d(parsableBitArray, true);
        this.f8418u = bVarM3553d.f7085c;
        this.f8415r = bVarM3553d.f7083a;
        this.f8417t = bVarM3553d.f7084b;
        return iM3178b - parsableBitArray.m3178b();
    }
}
