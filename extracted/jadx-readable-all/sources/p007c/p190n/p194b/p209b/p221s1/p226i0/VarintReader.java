package p007c.p190n.p194b.p209b.p221s1.p226i0;

import java.io.IOException;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;

/* JADX INFO: renamed from: c.n.b.b.s1.i0.g, reason: use source file name */
/* JADX INFO: compiled from: VarintReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class VarintReader {

    /* JADX INFO: renamed from: a */
    public static final long[] f7805a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: b */
    public final byte[] f7806b = new byte[8];

    /* JADX INFO: renamed from: c */
    public int f7807c;

    /* JADX INFO: renamed from: d */
    public int f7808d;

    /* JADX INFO: renamed from: a */
    public static long m3793a(byte[] bArr, int i, boolean z) {
        long j2 = ((long) bArr[0]) & 255;
        if (z) {
            j2 &= ~f7805a[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j2 = (j2 << 8) | (((long) bArr[i2]) & 255);
        }
        return j2;
    }

    /* JADX INFO: renamed from: b */
    public static int m3794b(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f7805a;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public long m3795c(ExtractorInput extractorInput, boolean z, boolean z2, int i) throws IOException {
        if (this.f7807c == 0) {
            if (!extractorInput.mo3730b(this.f7806b, 0, 1, z)) {
                return -1L;
            }
            int iM3794b = m3794b(this.f7806b[0] & 255);
            this.f7808d = iM3794b;
            if (iM3794b == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f7807c = 1;
        }
        int i2 = this.f7808d;
        if (i2 > i) {
            this.f7807c = 0;
            return -2L;
        }
        if (i2 != 1) {
            extractorInput.readFully(this.f7806b, 1, i2 - 1);
        }
        this.f7807c = 0;
        return m3793a(this.f7806b, this.f7808d, z2);
    }
}
