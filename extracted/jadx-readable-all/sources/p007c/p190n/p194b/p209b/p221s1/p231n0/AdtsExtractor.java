package p007c.p190n.p194b.p209b.p221s1.p231n0;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.ConstantBitrateSeekMap;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.j, reason: use source file name */
/* JADX INFO: compiled from: AdtsExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class AdtsExtractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public final int f8213a;

    /* JADX INFO: renamed from: b */
    public final AdtsReader f8214b;

    /* JADX INFO: renamed from: c */
    public final ParsableByteArray f8215c;

    /* JADX INFO: renamed from: d */
    public final ParsableByteArray f8216d;

    /* JADX INFO: renamed from: e */
    public final ParsableBitArray f8217e;

    /* JADX INFO: renamed from: f */
    public ExtractorOutput f8218f;

    /* JADX INFO: renamed from: g */
    public long f8219g;

    /* JADX INFO: renamed from: h */
    public long f8220h;

    /* JADX INFO: renamed from: i */
    public int f8221i;

    /* JADX INFO: renamed from: j */
    public boolean f8222j;

    /* JADX INFO: renamed from: k */
    public boolean f8223k;

    /* JADX INFO: renamed from: l */
    public boolean f8224l;

    static {
        C1774c c1774c = new ExtractorsFactory2() { // from class: c.n.b.b.s1.n0.c
            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: a */
            public final Extractor[] mo3745a() {
                return new Extractor[]{new AdtsExtractor()};
            }

            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: b */
            public /* synthetic */ Extractor[] mo3746b(Uri uri, Map map) {
                return ExtractorsFactory.m3807a(this, uri, map);
            }
        };
    }

    public AdtsExtractor() {
        this(0);
    }

    /* JADX INFO: renamed from: a */
    public final int m3881a(ExtractorInput extractorInput) throws IOException {
        int i = 0;
        while (true) {
            extractorInput.mo3739o(this.f8216d.f6392a, 0, 10);
            this.f8216d.m3194D(0);
            if (this.f8216d.m3216u() != 4801587) {
                break;
            }
            this.f8216d.m3195E(3);
            int iM3213r = this.f8216d.m3213r();
            i += iM3213r + 10;
            extractorInput.mo3733f(iM3213r);
        }
        extractorInput.mo3736k();
        extractorInput.mo3733f(i);
        if (this.f8220h == -1) {
            this.f8220h = i;
        }
        return i;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: c */
    public boolean mo3749c(ExtractorInput extractorInput) throws IOException {
        int iM3881a = m3881a(extractorInput);
        int i = iM3881a;
        while (true) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                extractorInput.mo3739o(this.f8216d.f6392a, 0, 2);
                this.f8216d.m3194D(0);
                if (!AdtsReader.m3884g(this.f8216d.m3219x())) {
                    break;
                }
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                extractorInput.mo3739o(this.f8216d.f6392a, 0, 4);
                this.f8217e.m3187k(14);
                int iM3183g = this.f8217e.m3183g(13);
                if (iM3183g <= 6) {
                    return false;
                }
                extractorInput.mo3733f(iM3183g - 6);
                i3 += iM3183g;
            }
            extractorInput.mo3736k();
            i++;
            if (i - iM3881a >= 8192) {
                return false;
            }
            extractorInput.mo3733f(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        C2096e.m4572h(this.f8218f);
        long jMo3729a = extractorInput.mo3729a();
        boolean z = ((this.f8213a & 1) == 0 || jMo3729a == -1) ? false : true;
        if (z && !this.f8222j) {
            this.f8221i = -1;
            extractorInput.mo3736k();
            long j2 = 0;
            if (extractorInput.mo3740p() == 0) {
                m3881a(extractorInput);
            }
            int i = 0;
            while (extractorInput.mo3731d(this.f8216d.f6392a, 0, 2, true)) {
                try {
                    this.f8216d.m3194D(0);
                    if (!AdtsReader.m3884g(this.f8216d.m3219x())) {
                        i = 0;
                        break;
                    }
                    if (!extractorInput.mo3731d(this.f8216d.f6392a, 0, 4, true)) {
                        break;
                    }
                    this.f8217e.m3187k(14);
                    int iM3183g = this.f8217e.m3183g(13);
                    if (iM3183g <= 6) {
                        this.f8222j = true;
                        throw new ParserException("Malformed ADTS stream");
                    }
                    j2 += (long) iM3183g;
                    i++;
                    if (i == 1000 || !extractorInput.mo3738m(iM3183g - 6, true)) {
                        break;
                        break;
                    }
                } catch (EOFException unused) {
                }
            }
            extractorInput.mo3736k();
            if (i > 0) {
                this.f8221i = (int) (j2 / ((long) i));
            } else {
                this.f8221i = -1;
            }
            this.f8222j = true;
        }
        int i2 = extractorInput.read(this.f8215c.f6392a, 0, 2048);
        boolean z2 = i2 == -1;
        if (!this.f8224l) {
            boolean z3 = z && this.f8221i > 0;
            if (!z3 || this.f8214b.f8244r != -9223372036854775807L || z2) {
                if (z3) {
                    long j3 = this.f8214b.f8244r;
                    if (j3 != -9223372036854775807L) {
                        ExtractorOutput extractorOutput = this.f8218f;
                        int i3 = this.f8221i;
                        extractorOutput.mo3772a(new ConstantBitrateSeekMap(jMo3729a, this.f8220h, (int) ((((long) (i3 * 8)) * 1000000) / j3), i3));
                    } else {
                        this.f8218f.mo3772a(new SeekMap.b(-9223372036854775807L));
                    }
                } else {
                    this.f8218f.mo3772a(new SeekMap.b(-9223372036854775807L));
                }
                this.f8224l = true;
            }
        }
        if (z2) {
            return -1;
        }
        this.f8215c.m3194D(0);
        this.f8215c.m3193C(i2);
        if (!this.f8223k) {
            this.f8214b.f8246t = this.f8219g;
            this.f8223k = true;
        }
        this.f8214b.mo3870b(this.f8215c);
        return 0;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public void mo3751f(ExtractorOutput extractorOutput) {
        this.f8218f = extractorOutput;
        this.f8214b.mo3873e(extractorOutput, new TsPayloadReader.d(0, 1));
        extractorOutput.mo3773j();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        this.f8223k = false;
        this.f8214b.mo3871c();
        this.f8219g = j3;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public void release() {
    }

    public AdtsExtractor(int i) {
        this.f8213a = i;
        this.f8214b = new AdtsReader(true);
        this.f8215c = new ParsableByteArray(2048);
        this.f8221i = -1;
        this.f8220h = -1L;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        this.f8216d = parsableByteArray;
        this.f8217e = new ParsableBitArray(parsableByteArray.f6392a);
    }
}
