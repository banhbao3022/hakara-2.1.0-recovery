package p007c.p190n.p194b.p209b.p221s1.p232o0;

import java.io.IOException;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;

/* JADX INFO: renamed from: c.n.b.b.s1.o0.d, reason: use source file name */
/* JADX INFO: compiled from: WavHeaderReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class WavHeaderReader {

    /* JADX INFO: renamed from: a */
    public final int f8489a;

    /* JADX INFO: renamed from: b */
    public final long f8490b;

    public WavHeaderReader(int i, long j2) {
        this.f8489a = i;
        this.f8490b = j2;
    }

    /* JADX INFO: renamed from: a */
    public static WavHeaderReader m3913a(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException {
        extractorInput.mo3739o(parsableByteArray.f6392a, 0, 8);
        parsableByteArray.m3194D(0);
        return new WavHeaderReader(parsableByteArray.m3201f(), parsableByteArray.m3205j());
    }
}
