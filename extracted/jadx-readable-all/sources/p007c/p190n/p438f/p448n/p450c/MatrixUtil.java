package p007c.p190n.p438f.p448n.p450c;

import java.util.Arrays;
import p007c.p190n.p438f.WriterException;
import p007c.p190n.p438f.p441j.BitArray;
import p007c.p190n.p438f.p448n.p449b.ErrorCorrectionLevel;
import p007c.p190n.p438f.p448n.p449b.Version;

/* JADX INFO: renamed from: c.n.f.n.c.d, reason: use source file name */
/* JADX INFO: compiled from: MatrixUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class MatrixUtil {

    /* JADX INFO: renamed from: a */
    public static final int[][] f27803a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b */
    public static final int[][] f27804b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c */
    public static final int[][] f27805c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: d */
    public static final int[][] f27806d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARN: Code duplicated, block: B:105:0x0239  */
    /* JADX WARN: Code duplicated, block: B:106:0x023c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0240  */
    /* JADX INFO: renamed from: a */
    public static void m12421a(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, int i, ByteMatrix byteMatrix) throws WriterException {
        boolean zM12346g;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        for (byte[] bArr : byteMatrix.f27799a) {
            Arrays.fill(bArr, (byte) -1);
        }
        int length = f27803a[0].length;
        m12424d(0, 0, byteMatrix);
        m12424d(byteMatrix.f27800b - length, 0, byteMatrix);
        m12424d(0, byteMatrix.f27800b - length, byteMatrix);
        m12423c(0, 7, byteMatrix);
        m12423c(byteMatrix.f27800b - 8, 7, byteMatrix);
        m12423c(0, byteMatrix.f27800b - 8, byteMatrix);
        m12425e(7, 0, byteMatrix);
        m12425e((byteMatrix.f27801c - 7) - 1, 0, byteMatrix);
        m12425e(7, byteMatrix.f27801c - 7, byteMatrix);
        if (byteMatrix.m12415a(8, byteMatrix.f27801c - 8) == 0) {
            throw new WriterException();
        }
        byteMatrix.m12416b(8, byteMatrix.f27801c - 8, 1);
        int i6 = version.f27790b;
        int i7 = 5;
        if (i6 >= 2) {
            int[] iArr = f27805c[i6 - 1];
            int length2 = iArr.length;
            int i8 = 0;
            while (i8 < length2) {
                int i9 = iArr[i8];
                if (i9 >= 0) {
                    int length3 = iArr.length;
                    int i10 = 0;
                    while (i10 < length3) {
                        int i11 = iArr[i10];
                        if (i11 >= 0 && m12427g(byteMatrix.m12415a(i11, i9))) {
                            int i12 = i11 - 2;
                            int i13 = i9 - 2;
                            int i14 = 0;
                            while (i14 < i7) {
                                int[] iArr2 = f27804b[i14];
                                int i15 = 0;
                                while (i15 < i7) {
                                    byteMatrix.m12416b(i12 + i15, i13 + i14, iArr2[i15]);
                                    i15++;
                                    i7 = 5;
                                }
                                i14++;
                                i7 = 5;
                            }
                        }
                        i10++;
                        i7 = 5;
                    }
                }
                i8++;
                i7 = 5;
            }
        }
        int i16 = 8;
        while (i16 < byteMatrix.f27800b - 8) {
            int i17 = i16 + 1;
            int i18 = i17 % 2;
            if (m12427g(byteMatrix.m12415a(i16, 6))) {
                byteMatrix.m12416b(i16, 6, i18);
            }
            if (m12427g(byteMatrix.m12415a(6, i16))) {
                byteMatrix.m12416b(6, i16, i18);
            }
            i16 = i17;
        }
        BitArray bitArray2 = new BitArray();
        if (!(i >= 0 && i < 8)) {
            throw new WriterException("Invalid mask pattern");
        }
        int i19 = (errorCorrectionLevel.f27775k << 3) | i;
        bitArray2.m12344d(i19, 5);
        bitArray2.m12344d(m12422b(i19, 1335), 10);
        BitArray bitArray3 = new BitArray();
        bitArray3.m12344d(21522, 15);
        if (bitArray2.f27642g != bitArray3.f27642g) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i20 = 0;
        while (true) {
            int[] iArr3 = bitArray2.f27641f;
            if (i20 >= iArr3.length) {
                break;
            }
            iArr3[i20] = iArr3[i20] ^ bitArray3.f27641f[i20];
            i20++;
        }
        if (bitArray2.f27642g != 15) {
            throw new WriterException("should not happen but we got: " + bitArray2.f27642g);
        }
        int i21 = 0;
        while (true) {
            int i22 = bitArray2.f27642g;
            if (i21 >= i22) {
                break;
            }
            boolean zM12346g2 = bitArray2.m12346g((i22 - 1) - i21);
            int[] iArr4 = f27806d[i21];
            byteMatrix.m12417c(iArr4[0], iArr4[1], zM12346g2);
            if (i21 < 8) {
                byteMatrix.m12417c((byteMatrix.f27800b - i21) - 1, 8, zM12346g2);
            } else {
                byteMatrix.m12417c(8, (i21 - 8) + (byteMatrix.f27801c - 7), zM12346g2);
            }
            i21++;
        }
        if (version.f27790b >= 7) {
            BitArray bitArray4 = new BitArray();
            bitArray4.m12344d(version.f27790b, 6);
            bitArray4.m12344d(m12422b(version.f27790b, 7973), 12);
            if (bitArray4.f27642g != 18) {
                throw new WriterException("should not happen but we got: " + bitArray4.f27642g);
            }
            int i23 = 17;
            for (int i24 = 0; i24 < 6; i24++) {
                for (int i25 = 0; i25 < 3; i25++) {
                    boolean zM12346g3 = bitArray4.m12346g(i23);
                    i23--;
                    byteMatrix.m12417c(i24, (byteMatrix.f27801c - 11) + i25, zM12346g3);
                    byteMatrix.m12417c((byteMatrix.f27801c - 11) + i25, i24, zM12346g3);
                }
            }
        }
        int i26 = byteMatrix.f27800b - 1;
        int i27 = byteMatrix.f27801c - 1;
        int i28 = 0;
        int i29 = -1;
        while (i26 > 0) {
            if (i26 == 6) {
                i26--;
            }
            while (i27 >= 0 && i27 < byteMatrix.f27801c) {
                for (int i30 = 0; i30 < 2; i30++) {
                    int i31 = i26 - i30;
                    if (m12427g(byteMatrix.m12415a(i31, i27))) {
                        if (i28 < bitArray.f27642g) {
                            zM12346g = bitArray.m12346g(i28);
                            i28++;
                        } else {
                            zM12346g = false;
                        }
                        if (i != -1) {
                            switch (i) {
                                case 0:
                                    i2 = i27 + i31;
                                    i3 = i2 & 1;
                                    if (i3 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zM12346g = !zM12346g;
                                    }
                                    break;
                                case 1:
                                    i2 = i27;
                                    i3 = i2 & 1;
                                    if (i3 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zM12346g = !zM12346g;
                                    }
                                    break;
                                case 2:
                                    i3 = i31 % 3;
                                    if (i3 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zM12346g = !zM12346g;
                                    }
                                    break;
                                case 3:
                                    i3 = (i27 + i31) % 3;
                                    if (i3 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zM12346g = !zM12346g;
                                    }
                                    break;
                                case 4:
                                    i2 = (i31 / 3) + (i27 / 2);
                                    i3 = i2 & 1;
                                    if (i3 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zM12346g = !zM12346g;
                                    }
                                    break;
                                case 5:
                                    int i32 = i27 * i31;
                                    i3 = (i32 % 3) + (i32 & 1);
                                    if (i3 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zM12346g = !zM12346g;
                                    }
                                    break;
                                case 6:
                                    int i33 = i27 * i31;
                                    i4 = i33 & 1;
                                    i5 = i33 % 3;
                                    i2 = i5 + i4;
                                    i3 = i2 & 1;
                                    if (i3 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zM12346g = !zM12346g;
                                    }
                                    break;
                                case 7:
                                    i5 = (i27 * i31) % 3;
                                    i4 = (i27 + i31) & 1;
                                    i2 = i5 + i4;
                                    i3 = i2 & 1;
                                    if (i3 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zM12346g = !zM12346g;
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i)));
                            }
                        }
                        byteMatrix.m12417c(i31, i27, zM12346g);
                    }
                }
                i27 += i29;
            }
            i29 = -i29;
            i27 += i29;
            i26 -= 2;
        }
        if (i28 == bitArray.f27642g) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i28 + '/' + bitArray.f27642g);
    }

    /* JADX INFO: renamed from: b */
    public static int m12422b(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iM12426f = m12426f(i2);
        int iM12426f2 = i << (iM12426f - 1);
        while (m12426f(iM12426f2) >= iM12426f) {
            iM12426f2 ^= i2 << (m12426f(iM12426f2) - iM12426f);
        }
        return iM12426f2;
    }

    /* JADX INFO: renamed from: c */
    public static void m12423c(int i, int i2, ByteMatrix byteMatrix) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!m12427g(byteMatrix.m12415a(i4, i2))) {
                throw new WriterException();
            }
            byteMatrix.m12416b(i4, i2, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m12424d(int i, int i2, ByteMatrix byteMatrix) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f27803a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                byteMatrix.m12416b(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m12425e(int i, int i2, ByteMatrix byteMatrix) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!m12427g(byteMatrix.f27799a[i4][i])) {
                throw new WriterException();
            }
            byteMatrix.f27799a[i4][i] = (byte) 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m12426f(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m12427g(int i) {
        return i == -1;
    }
}
