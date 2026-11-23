package p007c.p190n.p438f.p445l;

/* JADX INFO: renamed from: c.n.f.l.b, reason: use source file name */
/* JADX INFO: compiled from: CodaBarWriter.java */
/* JADX INFO: loaded from: classes.dex */
public final class CodaBarWriter extends OneDimensionalCodeWriter {

    /* JADX INFO: renamed from: a */
    public static final char[] f27727a;

    /* JADX INFO: renamed from: b */
    public static final char[] f27728b = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: c */
    public static final char[] f27729c = {'/', ':', '+', '.'};

    /* JADX INFO: renamed from: d */
    public static final char f27730d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f27727a = cArr;
        f27730d = cArr[0];
    }

    @Override // p007c.p190n.p438f.p445l.OneDimensionalCodeWriter
    /* JADX INFO: renamed from: c */
    public boolean[] mo12386c(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c2 = f27730d;
            sb.append(c2);
            sb.append(str);
            sb.append(c2);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f27727a;
            boolean zM12385a = CodaBarReader.m12385a(cArr, upperCase);
            boolean zM12385a2 = CodaBarReader.m12385a(cArr, upperCase2);
            char[] cArr2 = f27728b;
            boolean zM12385a3 = CodaBarReader.m12385a(cArr2, upperCase);
            boolean zM12385a4 = CodaBarReader.m12385a(cArr2, upperCase2);
            if (zM12385a) {
                if (!zM12385a2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zM12385a3) {
                if (zM12385a2 || zM12385a4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                StringBuilder sb2 = new StringBuilder();
                char c3 = f27730d;
                sb2.append(c3);
                sb2.append(str);
                sb2.append(c3);
                str = sb2.toString();
            } else if (!zM12385a4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!CodaBarReader.m12385a(f27729c, str.charAt(i3))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i2];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = CodaBarReader.f27725a;
                if (i6 >= cArr3.length) {
                    i = 0;
                    break;
                }
                if (upperCase3 == cArr3[i6]) {
                    i = CodaBarReader.f27726b[i6];
                    break;
                }
                i6++;
            }
            int i7 = 0;
            boolean z = true;
            while (true) {
                int i8 = 0;
                while (i7 < 7) {
                    zArr[i4] = z;
                    i4++;
                    if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                        z = !z;
                        i7++;
                    } else {
                        i8++;
                    }
                }
                break;
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
