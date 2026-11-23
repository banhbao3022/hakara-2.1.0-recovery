package p007c.p190n.p194b.p209b.p221s1.p230m0;

import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.m0.a, reason: use source file name */
/* JADX INFO: compiled from: RawCcExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class RawCcExtractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public final Format f8083a;

    /* JADX INFO: renamed from: c */
    public TrackOutput2 f8085c;

    /* JADX INFO: renamed from: e */
    public int f8087e;

    /* JADX INFO: renamed from: f */
    public long f8088f;

    /* JADX INFO: renamed from: g */
    public int f8089g;

    /* JADX INFO: renamed from: h */
    public int f8090h;

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f8084b = new ParsableByteArray(9);

    /* JADX INFO: renamed from: d */
    public int f8086d = 0;

    public RawCcExtractor(Format format) {
        this.f8083a = format;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: c */
    public boolean mo3749c(ExtractorInput extractorInput) throws IOException {
        this.f8084b.m3221z(8);
        extractorInput.mo3739o(this.f8084b.f6392a, 0, 8);
        return this.f8084b.m3201f() == 1380139777;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        C2096e.m4572h(this.f8085c);
        while (true) {
            int i = this.f8086d;
            boolean z = false;
            boolean z2 = true;
            if (i == 0) {
                this.f8084b.m3221z(8);
                if (extractorInput.mo3730b(this.f8084b.f6392a, 0, 8, true)) {
                    if (this.f8084b.m3201f() != 1380139777) {
                        throw new IOException("Input not RawCC");
                    }
                    this.f8087e = this.f8084b.m3214s();
                    z = true;
                }
                if (!z) {
                    return -1;
                }
                this.f8086d = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    while (this.f8089g > 0) {
                        this.f8084b.m3221z(3);
                        extractorInput.readFully(this.f8084b.f6392a, 0, 3);
                        this.f8085c.mo3758c(this.f8084b, 3);
                        this.f8090h += 3;
                        this.f8089g--;
                    }
                    int i2 = this.f8090h;
                    if (i2 > 0) {
                        this.f8085c.mo3759d(this.f8088f, 1, i2, 0, null);
                    }
                    this.f8086d = 1;
                    return 0;
                }
                int i3 = this.f8087e;
                if (i3 == 0) {
                    this.f8084b.m3221z(5);
                    if (extractorInput.mo3730b(this.f8084b.f6392a, 0, 5, true)) {
                        this.f8088f = (this.f8084b.m3215t() * 1000) / 45;
                        this.f8089g = this.f8084b.m3214s();
                        this.f8090h = 0;
                    } else {
                        z2 = false;
                    }
                } else {
                    if (i3 != 1) {
                        StringBuilder sbM1556G = outline.m1556G("Unsupported version number: ");
                        sbM1556G.append(this.f8087e);
                        throw new ParserException(sbM1556G.toString());
                    }
                    this.f8084b.m3221z(9);
                    if (extractorInput.mo3730b(this.f8084b.f6392a, 0, 9, true)) {
                        this.f8088f = this.f8084b.m3208m();
                        this.f8089g = this.f8084b.m3214s();
                        this.f8090h = 0;
                    } else {
                        z2 = false;
                    }
                }
                if (!z2) {
                    this.f8086d = 0;
                    return -1;
                }
                this.f8086d = 2;
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public void mo3751f(ExtractorOutput extractorOutput) {
        extractorOutput.mo3772a(new SeekMap.b(-9223372036854775807L));
        TrackOutput2 trackOutput2Mo3774o = extractorOutput.mo3774o(0, 3);
        this.f8085c = trackOutput2Mo3774o;
        trackOutput2Mo3774o.mo3760e(this.f8083a);
        extractorOutput.mo3773j();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        this.f8086d = 0;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public void release() {
    }
}
