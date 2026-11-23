package p007c.p190n.p438f.p445l;

import java.util.ArrayList;
import p007c.p190n.p438f.FormatException;
import p007c.p190n.p438f.ReaderException;

/* JADX INFO: renamed from: c.n.f.l.p, reason: use source file name */
/* JADX INFO: compiled from: UPCEANReader.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class UPCEANReader extends OneDReader {

    /* JADX INFO: renamed from: a */
    public static final int[] f27739a = {1, 1, 1};

    /* JADX INFO: renamed from: b */
    public static final int[] f27740b = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: c */
    public static final int[] f27741c = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: d */
    public static final int[][] f27742d;

    /* JADX INFO: renamed from: e */
    public static final int[][] f27743e;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f27742d = iArr;
        int[][] iArr2 = new int[20][];
        f27743e = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f27742d[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f27743e[i] = iArr4;
        }
    }

    public UPCEANReader() {
        new ArrayList();
        new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12394a(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return m12395b(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    /* JADX INFO: renamed from: b */
    public static int m12395b(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int iCharAt = charSequence.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                if (ReaderException.f27621f) {
                    throw new FormatException();
                }
                throw FormatException.f27620h;
            }
            i += iCharAt;
        }
        int i3 = i * 3;
        while (true) {
            length -= 2;
            if (length < 0) {
                return (1000 - i3) % 10;
            }
            int iCharAt2 = charSequence.charAt(length) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                if (ReaderException.f27621f) {
                    throw new FormatException();
                }
                throw FormatException.f27620h;
            }
            i3 += iCharAt2;
        }
    }
}
