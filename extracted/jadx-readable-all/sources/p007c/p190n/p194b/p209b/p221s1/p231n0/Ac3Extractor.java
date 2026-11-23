package p007c.p190n.p194b.p209b.p221s1.p231n0;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p215n1.Ac3Util;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.f, reason: use source file name */
/* JADX INFO: compiled from: Ac3Extractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class Ac3Extractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public final Ac3Reader f8132a = new Ac3Reader();

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f8133b = new ParsableByteArray(2786);

    /* JADX INFO: renamed from: c */
    public boolean f8134c;

    static {
        C1770a c1770a = new ExtractorsFactory2() { // from class: c.n.b.b.s1.n0.a
            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: a */
            public final Extractor[] mo3745a() {
                return new Extractor[]{new Ac3Extractor()};
            }

            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: b */
            public /* synthetic */ Extractor[] mo3746b(Uri uri, Map map) {
                return ExtractorsFactory.m3807a(this, uri, map);
            }
        };
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: c */
    public boolean mo3749c(ExtractorInput extractorInput) throws IOException {
        int iM3555a;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        int i = 0;
        while (true) {
            extractorInput.mo3739o(parsableByteArray.f6392a, 0, 10);
            parsableByteArray.m3194D(0);
            if (parsableByteArray.m3216u() != 4801587) {
                break;
            }
            parsableByteArray.m3195E(3);
            int iM3213r = parsableByteArray.m3213r();
            i += iM3213r + 10;
            extractorInput.mo3733f(iM3213r);
        }
        extractorInput.mo3736k();
        extractorInput.mo3733f(i);
        int i2 = i;
        while (true) {
            int i3 = 0;
            while (true) {
                extractorInput.mo3739o(parsableByteArray.f6392a, 0, 6);
                parsableByteArray.m3194D(0);
                if (parsableByteArray.m3219x() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = parsableByteArray.f6392a;
                if (bArr.length < 6) {
                    iM3555a = -1;
                } else {
                    iM3555a = ((bArr[5] & 248) >> 3) > 10 ? ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2 : Ac3Util.m3555a((bArr[4] & 192) >> 6, bArr[4] & 63);
                }
                if (iM3555a == -1) {
                    return false;
                }
                extractorInput.mo3733f(iM3555a - 6);
            }
            extractorInput.mo3736k();
            i2++;
            if (i2 - i >= 8192) {
                return false;
            }
            extractorInput.mo3733f(i2);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i = extractorInput.read(this.f8133b.f6392a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        this.f8133b.m3194D(0);
        this.f8133b.m3193C(i);
        if (!this.f8134c) {
            this.f8132a.f8150l = 0L;
            this.f8134c = true;
        }
        this.f8132a.mo3870b(this.f8133b);
        return 0;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public void mo3751f(ExtractorOutput extractorOutput) {
        this.f8132a.mo3873e(extractorOutput, new TsPayloadReader.d(0, 1));
        extractorOutput.mo3773j();
        extractorOutput.mo3772a(new SeekMap.b(-9223372036854775807L));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        this.f8134c = false;
        this.f8132a.mo3871c();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public void release() {
    }
}
