package p007c.p190n.p438f.p445l;

import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p438f.BarcodeFormat;
import p007c.p190n.p438f.EncodeHintType;
import p007c.p190n.p438f.WriterException;
import p007c.p190n.p438f.p441j.BitMatrix;

/* JADX INFO: renamed from: c.n.f.l.h, reason: use source file name */
/* JADX INFO: compiled from: Code93Writer.java */
/* JADX INFO: loaded from: classes.dex */
public class Code93Writer extends OneDimensionalCodeWriter {
    /* JADX INFO: renamed from: e */
    public static int m12389e(boolean[] zArr, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
        return 9;
    }

    /* JADX INFO: renamed from: f */
    public static int m12390f(String str, int i) {
        int iIndexOf = 0;
        int i2 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i2;
            i2++;
            if (i2 > i) {
                i2 = 1;
            }
        }
        return iIndexOf % 47;
    }

    /* JADX INFO: renamed from: g */
    public static void m12391g(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    @Override // p007c.p190n.p438f.p445l.OneDimensionalCodeWriter, p007c.p190n.p438f.Writer
    /* JADX INFO: renamed from: a */
    public BitMatrix mo12331a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.mo12331a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // p007c.p190n.p438f.p445l.OneDimensionalCodeWriter
    /* JADX INFO: renamed from: c */
    public boolean[] mo12386c(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int[] iArr = new int[9];
        int length2 = ((str.length() + 2 + 2) * 9) + 1;
        m12391g(Code93Reader.f27733a[47], iArr);
        boolean[] zArr = new boolean[length2];
        m12389e(zArr, 0, iArr);
        int i = 9;
        for (int i2 = 0; i2 < length; i2++) {
            m12391g(Code93Reader.f27733a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i2))], iArr);
            m12389e(zArr, i, iArr);
            i += 9;
        }
        int iM12390f = m12390f(str, 20);
        int[] iArr2 = Code93Reader.f27733a;
        m12391g(iArr2[iM12390f], iArr);
        m12389e(zArr, i, iArr);
        int i3 = i + 9;
        StringBuilder sbM1556G = outline.m1556G(str);
        sbM1556G.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iM12390f));
        m12391g(iArr2[m12390f(sbM1556G.toString(), 15)], iArr);
        m12389e(zArr, i3, iArr);
        int i4 = i3 + 9;
        m12391g(iArr2[47], iArr);
        m12389e(zArr, i4, iArr);
        zArr[i4 + 9] = true;
        return zArr;
    }
}
