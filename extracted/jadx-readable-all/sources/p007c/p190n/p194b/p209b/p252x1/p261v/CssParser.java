package p007c.p190n.p194b.p209b.p252x1.p261v;

import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;

/* JADX INFO: renamed from: c.n.b.b.x1.v.c, reason: use source file name */
/* JADX INFO: compiled from: CssParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class CssParser {

    /* JADX INFO: renamed from: a */
    public static final Pattern f10124a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f10125b = new ParsableByteArray();

    /* JADX INFO: renamed from: c */
    public final StringBuilder f10126c = new StringBuilder();

    /* JADX INFO: renamed from: a */
    public static String m4477a(ParsableByteArray parsableByteArray, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = parsableByteArray.f6393b;
        int i2 = parsableByteArray.f6394c;
        while (i < i2 && !z) {
            char c2 = (char) parsableByteArray.f6392a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        parsableByteArray.m3195E(i - parsableByteArray.f6393b);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m4478b(ParsableByteArray parsableByteArray, StringBuilder sb) {
        m4479c(parsableByteArray);
        if (parsableByteArray.m3196a() == 0) {
            return null;
        }
        String strM4477a = m4477a(parsableByteArray, sb);
        if (!"".equals(strM4477a)) {
            return strM4477a;
        }
        StringBuilder sbM1556G = outline.m1556G("");
        sbM1556G.append((char) parsableByteArray.m3214s());
        return sbM1556G.toString();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX INFO: renamed from: c */
    public static void m4479c(ParsableByteArray parsableByteArray) {
        boolean z;
        boolean z2;
        while (true) {
            for (boolean z3 = true; parsableByteArray.m3196a() > 0 && z3; z3 = false) {
                char c2 = (char) parsableByteArray.f6392a[parsableByteArray.f6393b];
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    parsableByteArray.m3195E(1);
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    int i = parsableByteArray.f6393b;
                    int i2 = parsableByteArray.f6394c;
                    byte[] bArr = parsableByteArray.f6392a;
                    if (i + 2 <= i2) {
                        int i3 = i + 1;
                        if (bArr[i] == 47) {
                            int i4 = i3 + 1;
                            if (bArr[i3] == 42) {
                                while (true) {
                                    int i5 = i4 + 1;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                        i2 = i5 + 1;
                                        i4 = i2;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                parsableByteArray.m3195E(i2 - parsableByteArray.f6393b);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                    }
                }
            }
            return;
        }
    }
}
