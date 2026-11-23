package p007c.p190n.p438f.p445l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p007c.p190n.p438f.BarcodeFormat;
import p007c.p190n.p438f.EncodeHintType;
import p007c.p190n.p438f.WriterException;
import p007c.p190n.p438f.p441j.BitMatrix;

/* JADX INFO: renamed from: c.n.f.l.d, reason: use source file name */
/* JADX INFO: compiled from: Code128Writer.java */
/* JADX INFO: loaded from: classes.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {
    /* JADX INFO: renamed from: e */
    public static int m12387e(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 1;
        if (i >= length) {
            return 1;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == 241) {
            return 4;
        }
        if (cCharAt >= '0' && cCharAt <= '9') {
            int i3 = i + 1;
            i2 = 2;
            if (i3 >= length) {
                return 2;
            }
            char cCharAt2 = charSequence.charAt(i3);
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                return 3;
            }
        }
        return i2;
    }

    @Override // p007c.p190n.p438f.p445l.OneDimensionalCodeWriter, p007c.p190n.p438f.Writer
    /* JADX INFO: renamed from: a */
    public BitMatrix mo12331a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.mo12331a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    @Override // p007c.p190n.p438f.p445l.OneDimensionalCodeWriter
    /* JADX INFO: renamed from: c */
    public boolean[] mo12386c(String str) {
        int i;
        int iCharAt;
        int iM12387e;
        char cCharAt;
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt2 = str.charAt(i2);
            switch (cCharAt2) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (cCharAt2 > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt2)));
                    }
                    break;
                    break;
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int i7 = 103;
            if (i3 >= length) {
                int[][] iArr = Code128Reader.f27731a;
                arrayList.add(iArr[i4 % 103]);
                arrayList.add(iArr[106]);
                int i8 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i9 : iArr2) {
                        i8 += i9;
                    }
                }
                boolean[] zArr = new boolean[i8];
                Iterator it = arrayList.iterator();
                int iM12392b = 0;
                while (it.hasNext()) {
                    iM12392b += OneDimensionalCodeWriter.m12392b(zArr, iM12392b, (int[]) it.next(), true);
                }
                return zArr;
            }
            int iM12387e2 = m12387e(str, i3);
            int i10 = 101;
            if (iM12387e2 == 2) {
                i = 100;
            } else if (iM12387e2 != 1) {
                if (i5 != 99) {
                    if (i5 == 100) {
                        if (iM12387e2 != 4 && (iM12387e = m12387e(str, i3 + 2)) != 1 && iM12387e != 2) {
                            if (iM12387e != 4) {
                                int i11 = i3 + 4;
                                while (true) {
                                    int iM12387e3 = m12387e(str, i11);
                                    if (iM12387e3 == 3) {
                                        i11 += 2;
                                    } else if (iM12387e3 == 2) {
                                    }
                                }
                            } else if (m12387e(str, i3 + 3) == 3) {
                            }
                        }
                        i = 100;
                    } else {
                        if (iM12387e2 == 4) {
                            iM12387e2 = m12387e(str, i3 + 1);
                        }
                        if (iM12387e2 != 3) {
                            i = 100;
                        }
                    }
                }
                i = 99;
            } else if (i3 >= str.length() || ((cCharAt = str.charAt(i3)) >= ' ' && (i5 != 101 || cCharAt >= '`'))) {
                i = 100;
            } else {
                i = 101;
            }
            if (i == i5) {
                switch (str.charAt(i3)) {
                    case 241:
                        i10 = 102;
                        break;
                    case 242:
                        i10 = 97;
                        break;
                    case 243:
                        i10 = 96;
                        break;
                    case 244:
                        if (i5 != 101) {
                            i10 = 100;
                        }
                        break;
                    default:
                        if (i5 == 100) {
                            iCharAt = str.charAt(i3) - ' ';
                        } else if (i5 != 101) {
                            iCharAt = Integer.parseInt(str.substring(i3, i3 + 2));
                            i3++;
                        } else {
                            iCharAt = str.charAt(i3) - ' ';
                            if (iCharAt < 0) {
                                iCharAt += 96;
                            }
                        }
                        i10 = iCharAt;
                        break;
                }
                i3++;
            } else {
                if (i5 != 0) {
                    i7 = i;
                } else if (i == 100) {
                    i7 = 104;
                } else if (i != 101) {
                    i7 = 105;
                }
                i10 = i7;
                i5 = i;
            }
            arrayList.add(Code128Reader.f27731a[i10]);
            i4 += i10 * i6;
            if (i3 != 0) {
                i6++;
            }
        }
    }
}
