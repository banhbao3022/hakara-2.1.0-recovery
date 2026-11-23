package p007c.p190n.p438f.p439i.p440b;

import p007c.p190n.p438f.p441j.BitArray;
import p007c.p190n.p438f.p441j.BitMatrix;
import p007c.p190n.p438f.p441j.p442d.GenericGF;
import p007c.p190n.p438f.p441j.p442d.ReedSolomonEncoder;

/* JADX INFO: renamed from: c.n.f.i.b.c, reason: use source file name */
/* JADX INFO: compiled from: Encoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class Encoder3 {

    /* JADX INFO: renamed from: a */
    public static final int[] f27626a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* JADX INFO: renamed from: a */
    public static void m12333a(BitMatrix bitMatrix, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    bitMatrix.m12349b(i5, i4);
                    bitMatrix.m12349b(i5, i6);
                    bitMatrix.m12349b(i4, i5);
                    bitMatrix.m12349b(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        bitMatrix.m12349b(i7, i7);
        int i8 = i7 + 1;
        bitMatrix.m12349b(i8, i7);
        bitMatrix.m12349b(i7, i8);
        int i9 = i + i2;
        bitMatrix.m12349b(i9, i7);
        bitMatrix.m12349b(i9, i8);
        bitMatrix.m12349b(i9, i9 - 1);
    }

    /* JADX INFO: renamed from: b */
    public static BitArray m12334b(BitArray bitArray, int i, int i2) {
        GenericGF genericGF;
        int i3 = bitArray.f27642g / i2;
        if (i2 == 4) {
            genericGF = GenericGF.f27682d;
        } else if (i2 == 6) {
            genericGF = GenericGF.f27681c;
        } else if (i2 == 8) {
            genericGF = GenericGF.f27684f;
        } else if (i2 == 10) {
            genericGF = GenericGF.f27680b;
        } else {
            if (i2 != 12) {
                throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
            }
            genericGF = GenericGF.f27679a;
        }
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(genericGF);
        int i4 = i / i2;
        int[] iArr = new int[i4];
        int i5 = bitArray.f27642g / i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= bitArray.m12346g((i6 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        reedSolomonEncoder.m12357a(iArr, i4 - i3);
        BitArray bitArray2 = new BitArray();
        bitArray2.m12344d(0, i % i2);
        for (int i9 = 0; i9 < i4; i9++) {
            bitArray2.m12344d(iArr[i9], i2);
        }
        return bitArray2;
    }

    /* JADX INFO: renamed from: c */
    public static BitArray m12335c(BitArray bitArray, int i) {
        BitArray bitArray2 = new BitArray();
        int i2 = bitArray.f27642g;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || bitArray.m12346g(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                bitArray2.m12344d(i8, i);
            } else {
                if (i8 == 0) {
                    bitArray2.m12344d(i5 | 1, i);
                } else {
                    bitArray2.m12344d(i5, i);
                }
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return bitArray2;
    }
}
