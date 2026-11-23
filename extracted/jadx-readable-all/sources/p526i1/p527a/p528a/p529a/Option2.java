package p526i1.p527a.p528a.p529a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: i1.a.a.a.i, reason: use source file name */
/* JADX INFO: compiled from: Option.java */
/* JADX INFO: loaded from: classes2.dex */
public class Option2 implements Cloneable, Serializable {

    /* JADX INFO: renamed from: f */
    public String f30778f;

    /* JADX INFO: renamed from: g */
    public String f30779g;

    /* JADX INFO: renamed from: h */
    public String f30780h;

    /* JADX INFO: renamed from: i */
    public String f30781i;

    /* JADX INFO: renamed from: j */
    public int f30782j;

    /* JADX INFO: renamed from: k */
    public List f30783k;

    public Option2(String str, String str2) throws IllegalArgumentException {
        this(str, null, false, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m13801a(String str) {
        if (this.f30782j > 0 && this.f30783k.size() > this.f30782j - 1) {
            throw new RuntimeException("Cannot add value, list full.");
        }
        this.f30783k.add(str);
    }

    /* JADX INFO: renamed from: b */
    public String m13802b() {
        String str = this.f30778f;
        return str == null ? this.f30779g : str;
    }

    public Object clone() {
        try {
            Option2 option2 = (Option2) super.clone();
            option2.f30783k = new ArrayList(this.f30783k);
            return option2;
        } catch (CloneNotSupportedException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("A CloneNotSupportedException was thrown: ");
            stringBuffer.append(e.getMessage());
            throw new RuntimeException(stringBuffer.toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public String[] m13803d() {
        if (this.f30783k.isEmpty()) {
            return null;
        }
        List list = this.f30783k;
        return (String[]) list.toArray(new String[list.size()]);
    }

    /* JADX INFO: renamed from: e */
    public boolean m13804e() {
        int i = this.f30782j;
        return i > 0 || i == -2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Option2.class != obj.getClass()) {
            return false;
        }
        Option2 option2 = (Option2) obj;
        String str = this.f30778f;
        if (str == null ? option2.f30778f != null : !str.equals(option2.f30778f)) {
            return false;
        }
        String str2 = this.f30779g;
        String str3 = option2.f30779g;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public int hashCode() {
        String str = this.f30778f;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f30779g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ option: ");
        stringBuffer.append(this.f30778f);
        if (this.f30779g != null) {
            stringBuffer.append(" ");
            stringBuffer.append(this.f30779g);
        }
        stringBuffer.append(" ");
        int i = this.f30782j;
        boolean z = true;
        if (i <= 1 && i != -2) {
            z = false;
        }
        if (z) {
            stringBuffer.append("[ARG...]");
        } else if (m13804e()) {
            stringBuffer.append(" [ARG]");
        }
        stringBuffer.append(" :: ");
        stringBuffer.append(this.f30781i);
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }

    public Option2(String str, boolean z, String str2) throws IllegalArgumentException {
        this(str, null, z, str2);
    }

    public Option2(String str, String str2, boolean z, String str3) throws IllegalArgumentException {
        this.f30780h = "arg";
        this.f30782j = -1;
        this.f30783k = new ArrayList();
        if (str != null) {
            if (str.length() == 1) {
                char cCharAt = str.charAt(0);
                if (((Character.isJavaIdentifierPart(cCharAt) || cCharAt == ' ' || cCharAt == '?' || cCharAt == '@') ? 1 : 0) == 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("illegal option value '");
                    stringBuffer.append(cCharAt);
                    stringBuffer.append("'");
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
            } else {
                char[] charArray = str.toCharArray();
                for (int i = 0; i < charArray.length; i++) {
                    if (!Character.isJavaIdentifierPart(charArray[i])) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("opt contains illegal character value '");
                        stringBuffer2.append(charArray[i]);
                        stringBuffer2.append("'");
                        throw new IllegalArgumentException(stringBuffer2.toString());
                    }
                }
            }
        }
        this.f30778f = str;
        this.f30779g = str2;
        if (z) {
            this.f30782j = 1;
        }
        this.f30781i = str3;
    }
}
