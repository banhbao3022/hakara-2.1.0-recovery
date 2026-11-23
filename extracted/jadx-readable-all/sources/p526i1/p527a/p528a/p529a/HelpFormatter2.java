package p526i1.p527a.p528a.p529a;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: i1.a.a.a.f, reason: use source file name */
/* JADX INFO: compiled from: HelpFormatter.java */
/* JADX INFO: loaded from: classes2.dex */
public class HelpFormatter2 {

    /* JADX INFO: renamed from: a */
    public int f30770a = 74;

    /* JADX INFO: renamed from: b */
    public int f30771b = 1;

    /* JADX INFO: renamed from: c */
    public int f30772c = 3;

    /* JADX INFO: renamed from: d */
    public String f30773d = System.getProperty("line.separator");

    /* JADX INFO: renamed from: e */
    public String f30774e = "-";

    /* JADX INFO: renamed from: f */
    public String f30775f = "--";

    /* JADX INFO: renamed from: g */
    public Comparator f30776g = new a(null);

    /* JADX INFO: renamed from: i1.a.a.a.f$a */
    /* JADX INFO: compiled from: HelpFormatter.java */
    public static class a implements Comparator {
        public a(HelpFormatter helpFormatter) {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Option2) obj).m13802b().compareToIgnoreCase(((Option2) obj2).m13802b());
        }
    }

    /* JADX INFO: renamed from: a */
    public String m13797a(int i) {
        StringBuffer stringBuffer = new StringBuffer(i);
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public int m13798b(String str, int i, int i2) {
        char cCharAt;
        char cCharAt2;
        int iIndexOf = str.indexOf(10, i2);
        if ((iIndexOf != -1 && iIndexOf <= i) || ((iIndexOf = str.indexOf(9, i2)) != -1 && iIndexOf <= i)) {
            return iIndexOf + 1;
        }
        int i3 = i + i2;
        if (i3 >= str.length()) {
            return -1;
        }
        int i4 = i3;
        while (i4 >= i2 && (cCharAt2 = str.charAt(i4)) != ' ' && cCharAt2 != '\n' && cCharAt2 != '\r') {
            i4--;
        }
        if (i4 > i2) {
            return i4;
        }
        while (i3 <= str.length() && (cCharAt = str.charAt(i3)) != ' ' && cCharAt != '\n' && cCharAt != '\r') {
            i3++;
        }
        if (i3 == str.length()) {
            return -1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: c */
    public void m13799c(PrintWriter printWriter, int i, Options3 options3, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer();
        String strM13797a = m13797a(i2);
        String strM13797a2 = m13797a(i3);
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(options3);
        ArrayList<Option2> arrayList2 = new ArrayList(options3.f30786f.values());
        Collections.sort(arrayList2, this.f30776g);
        int length = 0;
        for (Option2 option2 : arrayList2) {
            StringBuffer stringBuffer2 = new StringBuffer(8);
            if (option2.f30778f == null) {
                stringBuffer2.append(strM13797a);
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("   ");
                stringBuffer3.append(this.f30775f);
                stringBuffer2.append(stringBuffer3.toString());
                stringBuffer2.append(option2.f30779g);
            } else {
                stringBuffer2.append(strM13797a);
                stringBuffer2.append(this.f30774e);
                stringBuffer2.append(option2.f30778f);
                if (option2.f30779g != null) {
                    stringBuffer2.append(',');
                    stringBuffer2.append(this.f30775f);
                    stringBuffer2.append(option2.f30779g);
                }
            }
            if (option2.m13804e()) {
                String str = option2.f30780h;
                if (str != null && str.length() > 0) {
                    stringBuffer2.append(" <");
                    stringBuffer2.append(option2.f30780h);
                    stringBuffer2.append(">");
                } else {
                    stringBuffer2.append(' ');
                }
            }
            arrayList.add(stringBuffer2);
            if (stringBuffer2.length() > length) {
                length = stringBuffer2.length();
            }
        }
        Iterator it = arrayList2.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Option2 option3 = (Option2) it.next();
            int i5 = i4 + 1;
            StringBuffer stringBuffer4 = new StringBuffer(arrayList.get(i4).toString());
            if (stringBuffer4.length() < length) {
                stringBuffer4.append(m13797a(length - stringBuffer4.length()));
            }
            stringBuffer4.append(strM13797a2);
            int i6 = length + i3;
            String str2 = option3.f30781i;
            if (str2 != null) {
                stringBuffer4.append(str2);
            }
            String string = stringBuffer4.toString();
            int iM13798b = m13798b(string, i, 0);
            if (iM13798b == -1) {
                stringBuffer.append(m13800d(string));
            } else {
                stringBuffer.append(m13800d(string.substring(0, iM13798b)));
                stringBuffer.append(this.f30773d);
                if (i6 >= i) {
                    i6 = 1;
                }
                String strM13797a3 = m13797a(i6);
                while (true) {
                    StringBuffer stringBuffer5 = new StringBuffer();
                    stringBuffer5.append(strM13797a3);
                    stringBuffer5.append(string.substring(iM13798b).trim());
                    string = stringBuffer5.toString();
                    iM13798b = m13798b(string, i, 0);
                    if (iM13798b == -1) {
                        break;
                    }
                    if (string.length() > i && iM13798b == i6 - 1) {
                        iM13798b = i;
                    }
                    stringBuffer.append(m13800d(string.substring(0, iM13798b)));
                    stringBuffer.append(this.f30773d);
                }
                stringBuffer.append(string);
            }
            if (it.hasNext()) {
                stringBuffer.append(this.f30773d);
            }
            i4 = i5;
        }
        printWriter.println(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: d */
    public String m13800d(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        while (length > 0 && Character.isWhitespace(str.charAt(length - 1))) {
            length--;
        }
        return str.substring(0, length);
    }
}
