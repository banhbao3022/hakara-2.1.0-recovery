package p007c.p190n.p194b.p209b.p213c2;

import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.CodecSpecificDataUtil;
import p007c.p190n.p194b.p209b.p212b2.NalUnitUtil;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableNalUnitBitArray;

/* JADX INFO: renamed from: c.n.b.b.c2.o, reason: use source file name */
/* JADX INFO: compiled from: HevcConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class HevcConfig {

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f6468a;

    /* JADX INFO: renamed from: b */
    public final int f6469b;

    /* JADX INFO: renamed from: c */
    public final String f6470c;

    public HevcConfig(List<byte[]> list, int i, String str) {
        this.f6468a = list;
        this.f6469b = i;
        this.f6470c = str;
    }

    /* JADX INFO: renamed from: a */
    public static HevcConfig m3268a(ParsableByteArray parsableByteArray) throws ParserException {
        try {
            parsableByteArray.m3195E(21);
            int iM3214s = parsableByteArray.m3214s() & 3;
            int iM3214s2 = parsableByteArray.m3214s();
            int i = parsableByteArray.f6393b;
            int i2 = 0;
            for (int i3 = 0; i3 < iM3214s2; i3++) {
                parsableByteArray.m3195E(1);
                int iM3219x = parsableByteArray.m3219x();
                for (int i4 = 0; i4 < iM3219x; i4++) {
                    int iM3219x2 = parsableByteArray.m3219x();
                    i2 += iM3219x2 + 4;
                    parsableByteArray.m3195E(iM3219x2);
                }
            }
            parsableByteArray.m3194D(i);
            byte[] bArr = new byte[i2];
            String strM3090b = null;
            int i5 = 0;
            for (int i6 = 0; i6 < iM3214s2; i6++) {
                int iM3214s3 = parsableByteArray.m3214s() & 127;
                int iM3219x3 = parsableByteArray.m3219x();
                for (int i7 = 0; i7 < iM3219x3; i7++) {
                    int iM3219x4 = parsableByteArray.m3219x();
                    byte[] bArr2 = NalUnitUtil.f6368a;
                    System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                    int length = i5 + bArr2.length;
                    System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, length, iM3219x4);
                    if (iM3214s3 == 33 && i7 == 0) {
                        strM3090b = CodecSpecificDataUtil.m3090b(new ParsableNalUnitBitArray(bArr, length, length + iM3219x4));
                    }
                    i5 = length + iM3219x4;
                    parsableByteArray.m3195E(iM3219x4);
                }
            }
            return new HevcConfig(i2 == 0 ? null : Collections.singletonList(bArr), iM3214s + 1, strM3090b);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing HEVC config", e);
        }
    }
}
