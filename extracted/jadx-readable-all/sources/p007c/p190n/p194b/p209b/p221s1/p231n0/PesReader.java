package p007c.p190n.p194b.p209b.p221s1.p231n0;

import android.util.Log;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.TimestampAdjuster;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.y, reason: use source file name */
/* JADX INFO: compiled from: PesReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class PesReader implements TsPayloadReader {

    /* JADX INFO: renamed from: a */
    public final ElementaryStreamReader f8439a;

    /* JADX INFO: renamed from: b */
    public final ParsableBitArray f8440b = new ParsableBitArray(new byte[10]);

    /* JADX INFO: renamed from: c */
    public int f8441c = 0;

    /* JADX INFO: renamed from: d */
    public int f8442d;

    /* JADX INFO: renamed from: e */
    public TimestampAdjuster f8443e;

    /* JADX INFO: renamed from: f */
    public boolean f8444f;

    /* JADX INFO: renamed from: g */
    public boolean f8445g;

    /* JADX INFO: renamed from: h */
    public boolean f8446h;

    /* JADX INFO: renamed from: i */
    public int f8447i;

    /* JADX INFO: renamed from: j */
    public int f8448j;

    /* JADX INFO: renamed from: k */
    public boolean f8449k;

    /* JADX INFO: renamed from: l */
    public long f8450l;

    public PesReader(ElementaryStreamReader elementaryStreamReader) {
        this.f8439a = elementaryStreamReader;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.TsPayloadReader
    /* JADX INFO: renamed from: a */
    public void mo3866a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        this.f8443e = timestampAdjuster;
        this.f8439a.mo3873e(extractorOutput, dVar);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.TsPayloadReader
    /* JADX INFO: renamed from: b */
    public final void mo3867b(ParsableByteArray parsableByteArray, int i) throws ParserException {
        boolean z;
        C2096e.m4572h(this.f8443e);
        int i2 = -1;
        int i3 = 3;
        if ((i & 1) != 0) {
            int i4 = this.f8441c;
            if (i4 != 0 && i4 != 1) {
                if (i4 == 2) {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i4 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f8448j != -1) {
                        StringBuilder sbM1556G = outline.m1556G("Unexpected start indicator: expected ");
                        sbM1556G.append(this.f8448j);
                        sbM1556G.append(" more bytes");
                        Log.w("PesReader", sbM1556G.toString());
                    }
                    this.f8439a.mo3872d();
                }
            }
            m3905e(1);
        }
        while (parsableByteArray.m3196a() > 0) {
            int i5 = this.f8441c;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        if (m3904d(parsableByteArray, this.f8440b.f6388a, Math.min(10, this.f8447i)) && m3904d(parsableByteArray, null, this.f8447i)) {
                            this.f8440b.m3187k(0);
                            this.f8450l = -9223372036854775807L;
                            if (this.f8444f) {
                                this.f8440b.m3189m(4);
                                long jM3183g = ((long) this.f8440b.m3183g(i3)) << 30;
                                this.f8440b.m3189m(1);
                                long jM3183g2 = jM3183g | ((long) (this.f8440b.m3183g(15) << 15));
                                this.f8440b.m3189m(1);
                                long jM3183g3 = jM3183g2 | ((long) this.f8440b.m3183g(15));
                                this.f8440b.m3189m(1);
                                if (!this.f8446h && this.f8445g) {
                                    this.f8440b.m3189m(4);
                                    long jM3183g4 = ((long) this.f8440b.m3183g(i3)) << 30;
                                    this.f8440b.m3189m(1);
                                    long jM3183g5 = jM3183g4 | ((long) (this.f8440b.m3183g(15) << 15));
                                    this.f8440b.m3189m(1);
                                    long jM3183g6 = jM3183g5 | ((long) this.f8440b.m3183g(15));
                                    this.f8440b.m3189m(1);
                                    this.f8443e.m3085b(jM3183g6);
                                    this.f8446h = true;
                                }
                                this.f8450l = this.f8443e.m3085b(jM3183g3);
                            }
                            i |= this.f8449k ? 4 : 0;
                            this.f8439a.mo3874f(this.f8450l, i);
                            m3905e(3);
                        }
                    } else {
                        if (i5 != i3) {
                            throw new IllegalStateException();
                        }
                        int iM3196a = parsableByteArray.m3196a();
                        int i6 = this.f8448j;
                        int i7 = i6 != i2 ? iM3196a - i6 : 0;
                        if (i7 > 0) {
                            iM3196a -= i7;
                            parsableByteArray.m3193C(parsableByteArray.f6393b + iM3196a);
                        }
                        this.f8439a.mo3870b(parsableByteArray);
                        int i8 = this.f8448j;
                        if (i8 != i2) {
                            int i9 = i8 - iM3196a;
                            this.f8448j = i9;
                            if (i9 == 0) {
                                this.f8439a.mo3872d();
                                m3905e(1);
                            }
                        }
                    }
                } else if (m3904d(parsableByteArray, this.f8440b.f6388a, 9)) {
                    this.f8440b.m3187k(0);
                    int iM3183g = this.f8440b.m3183g(24);
                    if (iM3183g != 1) {
                        outline.m1565P("Unexpected start code prefix: ", iM3183g, "PesReader");
                        this.f8448j = -1;
                        z = false;
                    } else {
                        this.f8440b.m3189m(8);
                        int iM3183g2 = this.f8440b.m3183g(16);
                        this.f8440b.m3189m(5);
                        this.f8449k = this.f8440b.m3182f();
                        this.f8440b.m3189m(2);
                        this.f8444f = this.f8440b.m3182f();
                        this.f8445g = this.f8440b.m3182f();
                        this.f8440b.m3189m(6);
                        int iM3183g3 = this.f8440b.m3183g(8);
                        this.f8447i = iM3183g3;
                        if (iM3183g2 == 0) {
                            this.f8448j = -1;
                        } else {
                            int i10 = ((iM3183g2 + 6) - 9) - iM3183g3;
                            this.f8448j = i10;
                            if (i10 < 0) {
                                StringBuilder sbM1556G2 = outline.m1556G("Found negative packet payload size: ");
                                sbM1556G2.append(this.f8448j);
                                Log.w("PesReader", sbM1556G2.toString());
                                this.f8448j = -1;
                            }
                        }
                        z = true;
                    }
                    m3905e(z ? 2 : 0);
                }
            } else {
                parsableByteArray.m3195E(parsableByteArray.m3196a());
            }
            i2 = -1;
            i3 = 3;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.TsPayloadReader
    /* JADX INFO: renamed from: c */
    public final void mo3868c() {
        this.f8441c = 0;
        this.f8442d = 0;
        this.f8446h = false;
        this.f8439a.mo3871c();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3904d(ParsableByteArray parsableByteArray, byte[] bArr, int i) {
        int iMin = Math.min(parsableByteArray.m3196a(), i - this.f8442d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            parsableByteArray.m3195E(iMin);
        } else {
            System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, this.f8442d, iMin);
            parsableByteArray.f6393b += iMin;
        }
        int i2 = this.f8442d + iMin;
        this.f8442d = i2;
        return i2 == i;
    }

    /* JADX INFO: renamed from: e */
    public final void m3905e(int i) {
        this.f8441c = i;
        this.f8442d = 0;
    }
}
