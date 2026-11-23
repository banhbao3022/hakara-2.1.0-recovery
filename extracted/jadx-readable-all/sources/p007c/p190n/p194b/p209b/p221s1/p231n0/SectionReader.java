package p007c.p190n.p194b.p209b.p221s1.p231n0;

import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.TimestampAdjuster;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.d0, reason: use source file name */
/* JADX INFO: compiled from: SectionReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class SectionReader implements TsPayloadReader {

    /* JADX INFO: renamed from: a */
    public final SectionPayloadReader f8123a;

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f8124b = new ParsableByteArray(32);

    /* JADX INFO: renamed from: c */
    public int f8125c;

    /* JADX INFO: renamed from: d */
    public int f8126d;

    /* JADX INFO: renamed from: e */
    public boolean f8127e;

    /* JADX INFO: renamed from: f */
    public boolean f8128f;

    public SectionReader(SectionPayloadReader sectionPayloadReader) {
        this.f8123a = sectionPayloadReader;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.TsPayloadReader
    /* JADX INFO: renamed from: a */
    public void mo3866a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        this.f8123a.mo3864a(timestampAdjuster, extractorOutput, dVar);
        this.f8128f = true;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.TsPayloadReader
    /* JADX INFO: renamed from: b */
    public void mo3867b(ParsableByteArray parsableByteArray, int i) {
        boolean z = (i & 1) != 0;
        int iM3214s = z ? parsableByteArray.f6393b + parsableByteArray.m3214s() : -1;
        if (this.f8128f) {
            if (!z) {
                return;
            }
            this.f8128f = false;
            parsableByteArray.m3194D(iM3214s);
            this.f8126d = 0;
        }
        while (parsableByteArray.m3196a() > 0) {
            int i2 = this.f8126d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iM3214s2 = parsableByteArray.m3214s();
                    parsableByteArray.m3194D(parsableByteArray.f6393b - 1);
                    if (iM3214s2 == 255) {
                        this.f8128f = true;
                        return;
                    }
                }
                int iMin = Math.min(parsableByteArray.m3196a(), 3 - this.f8126d);
                parsableByteArray.m3200e(this.f8124b.f6392a, this.f8126d, iMin);
                int i3 = this.f8126d + iMin;
                this.f8126d = i3;
                if (i3 == 3) {
                    this.f8124b.m3194D(0);
                    this.f8124b.m3193C(3);
                    this.f8124b.m3195E(1);
                    int iM3214s3 = this.f8124b.m3214s();
                    int iM3214s4 = this.f8124b.m3214s();
                    this.f8127e = (iM3214s3 & 128) != 0;
                    int i4 = (((iM3214s3 & 15) << 8) | iM3214s4) + 3;
                    this.f8125c = i4;
                    byte[] bArr = this.f8124b.f6392a;
                    if (bArr.length < i4) {
                        this.f8124b.m3197b(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(parsableByteArray.m3196a(), this.f8125c - this.f8126d);
                parsableByteArray.m3200e(this.f8124b.f6392a, this.f8126d, iMin2);
                int i5 = this.f8126d + iMin2;
                this.f8126d = i5;
                int i6 = this.f8125c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.f8127e) {
                        byte[] bArr2 = this.f8124b.f6392a;
                        int i7 = Util6.f6307a;
                        int i8 = -1;
                        for (int i9 = 0; i9 < i6; i9++) {
                            i8 = Util6.f6320n[((i8 >>> 24) ^ (bArr2[i9] & 255)) & 255] ^ (i8 << 8);
                        }
                        if (i8 != 0) {
                            this.f8128f = true;
                            return;
                        }
                        this.f8124b.m3193C(this.f8125c - 4);
                    } else {
                        this.f8124b.m3193C(i6);
                    }
                    this.f8124b.m3194D(0);
                    this.f8123a.mo3865b(this.f8124b);
                    this.f8126d = 0;
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.TsPayloadReader
    /* JADX INFO: renamed from: c */
    public void mo3868c() {
        this.f8128f = true;
    }
}
