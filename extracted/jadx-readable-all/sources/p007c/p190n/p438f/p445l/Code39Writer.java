package p007c.p190n.p438f.p445l;

import java.util.Map;
import p007c.p190n.p438f.BarcodeFormat;
import p007c.p190n.p438f.EncodeHintType;
import p007c.p190n.p438f.WriterException;
import p007c.p190n.p438f.p441j.BitMatrix;

/* JADX INFO: renamed from: c.n.f.l.f, reason: use source file name */
/* JADX INFO: compiled from: Code39Writer.java */
/* JADX INFO: loaded from: classes.dex */
public final class Code39Writer extends OneDimensionalCodeWriter {
    /* JADX INFO: renamed from: e */
    public static void m12388e(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    @Override // p007c.p190n.p438f.p445l.OneDimensionalCodeWriter, p007c.p190n.p438f.Writer
    /* JADX INFO: renamed from: a */
    public BitMatrix mo12331a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.mo12331a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0105  */
    @Override // p007c.p190n.p438f.p445l.OneDimensionalCodeWriter
    /* JADX INFO: renamed from: c */
    public boolean[] mo12386c(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        for (int i = 0; i < length; i++) {
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                int length2 = str.length();
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < length2; i2++) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt == 0) {
                        sb.append("%U");
                    } else if (cCharAt == ' ') {
                        sb.append(cCharAt);
                    } else if (cCharAt == '@') {
                        sb.append("%V");
                    } else if (cCharAt == '`') {
                        sb.append("%W");
                    } else if (cCharAt == '-' || cCharAt == '.') {
                        sb.append(cCharAt);
                    } else if (cCharAt <= 26) {
                        sb.append('$');
                        sb.append((char) ((cCharAt - 1) + 65));
                    } else if (cCharAt < ' ') {
                        sb.append('%');
                        sb.append((char) ((cCharAt - 27) + 65));
                    } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                        sb.append('/');
                        sb.append((char) ((cCharAt - '!') + 65));
                    } else if (cCharAt <= '9') {
                        sb.append((char) ((cCharAt - '0') + 48));
                    } else if (cCharAt <= '?') {
                        sb.append('%');
                        sb.append((char) ((cCharAt - ';') + 70));
                    } else if (cCharAt <= 'Z') {
                        sb.append((char) ((cCharAt - 'A') + 65));
                    } else if (cCharAt <= '_') {
                        sb.append('%');
                        sb.append((char) ((cCharAt - '[') + 75));
                    } else if (cCharAt <= 'z') {
                        sb.append('+');
                        sb.append((char) ((cCharAt - 'a') + 65));
                    } else {
                        if (cCharAt > 127) {
                            throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i2) + "'");
                        }
                        sb.append('%');
                        sb.append((char) ((cCharAt - '{') + 80));
                    }
                }
                str = sb.toString();
                length = str.length();
                if (length <= 80) {
                    break;
                }
                throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
            }
        }
        int[] iArr = new int[9];
        int i3 = length + 25;
        for (int i4 = 0; i4 < length; i4++) {
            m12388e(Code39Reader.f27732a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i4))], iArr);
            for (int i5 = 0; i5 < 9; i5++) {
                i3 += iArr[i5];
            }
        }
        boolean[] zArr = new boolean[i3];
        m12388e(148, iArr);
        int iM12392b = OneDimensionalCodeWriter.m12392b(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iM12392b2 = OneDimensionalCodeWriter.m12392b(zArr, iM12392b, iArr2, false) + iM12392b;
        for (int i6 = 0; i6 < length; i6++) {
            m12388e(Code39Reader.f27732a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i6))], iArr);
            int iM12392b3 = OneDimensionalCodeWriter.m12392b(zArr, iM12392b2, iArr, true) + iM12392b2;
            iM12392b2 = OneDimensionalCodeWriter.m12392b(zArr, iM12392b3, iArr2, false) + iM12392b3;
        }
        m12388e(148, iArr);
        OneDimensionalCodeWriter.m12392b(zArr, iM12392b2, iArr, true);
        return zArr;
    }
}
