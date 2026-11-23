package p007c.p190n.p194b.p209b.p221s1.p231n0;

import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.TimestampAdjuster;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.a0, reason: use source file name */
/* JADX INFO: compiled from: PsDurationReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class PsDurationReader {

    /* JADX INFO: renamed from: c */
    public boolean f8095c;

    /* JADX INFO: renamed from: d */
    public boolean f8096d;

    /* JADX INFO: renamed from: e */
    public boolean f8097e;

    /* JADX INFO: renamed from: a */
    public final TimestampAdjuster f8093a = new TimestampAdjuster(0);

    /* JADX INFO: renamed from: f */
    public long f8098f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f8099g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f8100h = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f8094b = new ParsableByteArray();

    /* JADX INFO: renamed from: c */
    public static long m3861c(ParsableByteArray parsableByteArray) {
        int i = parsableByteArray.f6393b;
        if (parsableByteArray.m3196a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, 0, 9);
        parsableByteArray.f6393b += 9;
        parsableByteArray.m3194D(i);
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final int m3862a(ExtractorInput extractorInput) {
        this.f8094b.m3191A(Util6.f6312f);
        this.f8095c = true;
        extractorInput.mo3736k();
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m3863b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
