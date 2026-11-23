package p007c.p190n.p438f.p445l;

import java.util.Map;
import p007c.p190n.p438f.BarcodeFormat;
import p007c.p190n.p438f.EncodeHintType;
import p007c.p190n.p438f.Writer;
import p007c.p190n.p438f.WriterException;
import p007c.p190n.p438f.p441j.BitMatrix;

/* JADX INFO: renamed from: c.n.f.l.n, reason: use source file name */
/* JADX INFO: compiled from: OneDimensionalCodeWriter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class OneDimensionalCodeWriter implements Writer {
    /* JADX INFO: renamed from: b */
    public static int m12392b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    @Override // p007c.p190n.p438f.Writer
    /* JADX INFO: renamed from: a */
    public BitMatrix mo12331a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        int iMo12393d = mo12393d();
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType)) {
                iMo12393d = Integer.parseInt(map.get(encodeHintType).toString());
            }
        }
        boolean[] zArrMo12386c = mo12386c(str);
        int length = zArrMo12386c.length;
        int i3 = iMo12393d + length;
        int iMax = Math.max(i, i3);
        int iMax2 = Math.max(1, i2);
        int i4 = iMax / i3;
        int i5 = (iMax - (length * i4)) / 2;
        BitMatrix bitMatrix = new BitMatrix(iMax, iMax2);
        int i6 = 0;
        while (i6 < length) {
            if (zArrMo12386c[i6]) {
                bitMatrix.m12350d(i5, 0, i4, iMax2);
            }
            i6++;
            i5 += i4;
        }
        return bitMatrix;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean[] mo12386c(String str);

    /* JADX INFO: renamed from: d */
    public int mo12393d() {
        return 10;
    }
}
