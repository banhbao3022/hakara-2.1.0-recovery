package p007c.p190n.p194b.p209b.p221s1.p231n0;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.h, reason: use source file name */
/* JADX INFO: compiled from: Ac4Extractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class Ac4Extractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public final Ac4Reader f8160a = new Ac4Reader();

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f8161b = new ParsableByteArray(16384);

    /* JADX INFO: renamed from: c */
    public boolean f8162c;

    static {
        C1772b c1772b = new ExtractorsFactory2() { // from class: c.n.b.b.s1.n0.b
            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: a */
            public final Extractor[] mo3745a() {
                return new Extractor[]{new Ac4Extractor()};
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
        int i;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        int i2 = 0;
        while (true) {
            extractorInput.mo3739o(parsableByteArray.f6392a, 0, 10);
            parsableByteArray.m3194D(0);
            if (parsableByteArray.m3216u() != 4801587) {
                break;
            }
            parsableByteArray.m3195E(3);
            int iM3213r = parsableByteArray.m3213r();
            i2 += iM3213r + 10;
            extractorInput.mo3733f(iM3213r);
        }
        extractorInput.mo3736k();
        extractorInput.mo3733f(i2);
        int i3 = i2;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                extractorInput.mo3739o(parsableByteArray.f6392a, 0, 7);
                parsableByteArray.m3194D(0);
                int iM3219x = parsableByteArray.m3219x();
                if (iM3219x == 44096 || iM3219x == 44097) {
                    i4++;
                    if (i4 >= 4) {
                        return true;
                    }
                    byte[] bArr = parsableByteArray.f6392a;
                    if (bArr.length < 7) {
                        i = -1;
                    } else {
                        int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                        if (i6 == 65535) {
                            i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                        } else {
                            i5 = 4;
                        }
                        if (iM3219x == 44097) {
                            i5 += 2;
                        }
                        i = i6 + i5;
                    }
                    if (i == -1) {
                        return false;
                    }
                    extractorInput.mo3733f(i - 7);
                }
            }
            extractorInput.mo3736k();
            i3++;
            if (i3 - i2 >= 8192) {
                return false;
            }
            extractorInput.mo3733f(i3);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i = extractorInput.read(this.f8161b.f6392a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        this.f8161b.m3194D(0);
        this.f8161b.m3193C(i);
        if (!this.f8162c) {
            this.f8160a.f8201m = 0L;
            this.f8162c = true;
        }
        this.f8160a.mo3870b(this.f8161b);
        return 0;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public void mo3751f(ExtractorOutput extractorOutput) {
        this.f8160a.mo3873e(extractorOutput, new TsPayloadReader.d(0, 1));
        extractorOutput.mo3773j();
        extractorOutput.mo3772a(new SeekMap.b(-9223372036854775807L));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        this.f8162c = false;
        this.f8160a.mo3871c();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public void release() {
    }
}
