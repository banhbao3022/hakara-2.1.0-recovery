package p007c.p190n.p438f.p445l;

import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p438f.BarcodeFormat;
import p007c.p190n.p438f.EncodeHintType;
import p007c.p190n.p438f.FormatException;
import p007c.p190n.p438f.WriterException;
import p007c.p190n.p438f.p441j.BitMatrix;

/* JADX INFO: renamed from: c.n.f.l.k, reason: use source file name */
/* JADX INFO: compiled from: EAN8Writer.java */
/* JADX INFO: loaded from: classes.dex */
public final class EAN8Writer extends UPCEANWriter {
    @Override // p007c.p190n.p438f.p445l.OneDimensionalCodeWriter, p007c.p190n.p438f.Writer
    /* JADX INFO: renamed from: a */
    public BitMatrix mo12331a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.mo12331a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // p007c.p190n.p438f.p445l.OneDimensionalCodeWriter
    /* JADX INFO: renamed from: c */
    public boolean[] mo12386c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = outline.m1590l(str, UPCEANReader.m12395b(str));
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
        boolean[] zArr = new boolean[67];
        int iM12392b = OneDimensionalCodeWriter.m12392b(zArr, 0, UPCEANReader.f27739a, true) + 0;
        for (int i = 0; i <= 3; i++) {
            iM12392b += OneDimensionalCodeWriter.m12392b(zArr, iM12392b, UPCEANReader.f27742d[Character.digit(str.charAt(i), 10)], false);
        }
        int iM12392b2 = OneDimensionalCodeWriter.m12392b(zArr, iM12392b, UPCEANReader.f27740b, false) + iM12392b;
        for (int i2 = 4; i2 <= 7; i2++) {
            iM12392b2 += OneDimensionalCodeWriter.m12392b(zArr, iM12392b2, UPCEANReader.f27742d[Character.digit(str.charAt(i2), 10)], true);
        }
        OneDimensionalCodeWriter.m12392b(zArr, iM12392b2, UPCEANReader.f27739a, true);
        return zArr;
    }
}
