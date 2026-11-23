package p007c.p190n.p438f.p445l;

import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p438f.BarcodeFormat;
import p007c.p190n.p438f.EncodeHintType;
import p007c.p190n.p438f.FormatException;
import p007c.p190n.p438f.WriterException;
import p007c.p190n.p438f.p441j.BitMatrix;

/* JADX INFO: renamed from: c.n.f.l.s, reason: use source file name */
/* JADX INFO: compiled from: UPCEWriter.java */
/* JADX INFO: loaded from: classes.dex */
public final class UPCEWriter extends UPCEANWriter {
    @Override // p007c.p190n.p438f.p445l.OneDimensionalCodeWriter, p007c.p190n.p438f.Writer
    /* JADX INFO: renamed from: a */
    public BitMatrix mo12331a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_E) {
            return super.mo12331a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // p007c.p190n.p438f.p445l.OneDimensionalCodeWriter
    /* JADX INFO: renamed from: c */
    public boolean[] mo12386c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = outline.m1590l(str, UPCEANReader.m12395b(UPCEReader.m12396c(str)));
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!UPCEANReader.m12394a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int iDigit = Character.digit(str.charAt(0), 10);
        if (iDigit != 0 && iDigit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i = UPCEReader.f27744f[iDigit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int iM12392b = OneDimensionalCodeWriter.m12392b(zArr, 0, UPCEANReader.f27739a, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit2 = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit2 += 10;
            }
            iM12392b += OneDimensionalCodeWriter.m12392b(zArr, iM12392b, UPCEANReader.f27743e[iDigit2], false);
        }
        OneDimensionalCodeWriter.m12392b(zArr, iM12392b, UPCEANReader.f27741c, false);
        return zArr;
    }
}
