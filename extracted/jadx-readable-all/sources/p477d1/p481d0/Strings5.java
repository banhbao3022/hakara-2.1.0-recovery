package p477d1.p481d0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p477d1.p478a0.Progressions;
import p477d1.p478a0.Ranges;
import p477d1.p478a0._Ranges;
import p477d1.p480c0.Iterables;
import p477d1.p480c0.Sequence;
import p477d1.p483s.CollectionsJVM;
import p477d1.p483s.Iterables2;
import p477d1.p483s._Arrays;
import p477d1.p483s._ArraysJvm;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.d0.u, reason: use source file name */
/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes.dex */
public class Strings5 extends StringsJVM {
    /* JADX INFO: renamed from: A */
    public static final boolean m12998A(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        Intrinsics2.m13089e(charSequence, "$this$regionMatchesImpl");
        Intrinsics2.m13089e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!Char.m12980c(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public static final String m12999B(String str, CharSequence charSequence) {
        Intrinsics2.m13089e(str, "$this$removePrefix");
        Intrinsics2.m13089e(charSequence, "prefix");
        Intrinsics2.m13089e(str, "$this$startsWith");
        Intrinsics2.m13089e(charSequence, "prefix");
        if (!StringsJVM.m12997n(str, (String) charSequence, false, 2)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        Intrinsics2.m13088d(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: C */
    public static final List<String> m13000C(CharSequence charSequence, String str, boolean z, int i) {
        int length = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
        }
        int iM13008r = m13008r(charSequence, str, 0, z);
        if (iM13008r == -1 || i == 1) {
            return CollectionsJVM.m13036a(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i2 = 10;
        if (z2 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iM13008r).toString());
            length = str.length() + iM13008r;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iM13008r = m13008r(charSequence, str, length, z);
        } while (iM13008r != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public static List m13001D(CharSequence charSequence, char[] cArr, boolean z, int i, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        Intrinsics2.m13089e(charSequence, "$this$split");
        Intrinsics2.m13089e(cArr, "delimiters");
        if (cArr.length == 1) {
            return m13000C(charSequence, String.valueOf(cArr[0]), z, i);
        }
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
        }
        Strings strings = new Strings(charSequence, 0, i, new Strings2(cArr, z));
        Intrinsics2.m13089e(strings, "$this$asIterable");
        Iterables iterables = new Iterables(strings);
        ArrayList arrayList = new ArrayList(Iterables2.m13042g(iterables, 10));
        Iterator it = iterables.iterator();
        while (it.hasNext()) {
            arrayList.add(m13002E(charSequence, (Ranges) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public static final String m13002E(CharSequence charSequence, Ranges ranges) {
        Intrinsics2.m13089e(charSequence, "$this$substring");
        Intrinsics2.m13089e(ranges, "range");
        return charSequence.subSequence(Integer.valueOf(ranges.f29431g).intValue(), Integer.valueOf(ranges.f29432h).intValue() + 1).toString();
    }

    /* JADX INFO: renamed from: F */
    public static final String m13003F(String str, char c2, String str2) {
        Intrinsics2.m13089e(str, "$this$substringAfterLast");
        Intrinsics2.m13089e(str2, "missingDelimiterValue");
        int iM13014x = m13014x(str, c2, 0, false, 6);
        if (iM13014x == -1) {
            return str2;
        }
        String strSubstring = str.substring(iM13014x + 1, str.length());
        Intrinsics2.m13088d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: G */
    public static final CharSequence m13004G(CharSequence charSequence) {
        Intrinsics2.m13089e(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM12979b = CharJVM.m12979b(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zM12979b) {
                    break;
                }
                length--;
            } else if (zM12979b) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m13005o(CharSequence charSequence, char c2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics2.m13089e(charSequence, "$this$contains");
        return m13011u(charSequence, c2, 0, z, 2) >= 0;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m13006p(CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics2.m13089e(charSequence, "$this$contains");
        Intrinsics2.m13089e(charSequence2, "other");
        return m13012v(charSequence, (String) charSequence2, 0, z, 2) >= 0;
    }

    /* JADX INFO: renamed from: q */
    public static final int m13007q(CharSequence charSequence) {
        Intrinsics2.m13089e(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: r */
    public static final int m13008r(CharSequence charSequence, String str, int i, boolean z) {
        Intrinsics2.m13089e(charSequence, "$this$indexOf");
        Intrinsics2.m13089e(str, "string");
        return (z || !(charSequence instanceof String)) ? m13010t(charSequence, str, i, charSequence.length(), z, false, 16) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: s */
    public static final int m13009s(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        Progressions progressionsM12968c;
        if (z2) {
            int iM13007q = m13007q(charSequence);
            if (i > iM13007q) {
                i = iM13007q;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            progressionsM12968c = _Ranges.m12968c(i, i2);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            progressionsM12968c = new Ranges(i, i2);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i3 = progressionsM12968c.f29431g;
            int i4 = progressionsM12968c.f29432h;
            int i5 = progressionsM12968c.f29433i;
            if (i5 >= 0) {
                if (i3 > i4) {
                    return -1;
                }
            } else if (i3 < i4) {
                return -1;
            }
            while (!StringsJVM.m12991h((String) charSequence2, 0, (String) charSequence, i3, charSequence2.length(), z)) {
                if (i3 == i4) {
                    return -1;
                }
                i3 += i5;
            }
            return i3;
        }
        int i6 = progressionsM12968c.f29431g;
        int i7 = progressionsM12968c.f29432h;
        int i8 = progressionsM12968c.f29433i;
        if (i8 >= 0) {
            if (i6 > i7) {
                return -1;
            }
        } else if (i6 < i7) {
            return -1;
        }
        while (!m12998A(charSequence2, 0, charSequence, i6, charSequence2.length(), z)) {
            if (i6 == i7) {
                return -1;
            }
            i6 += i8;
        }
        return i6;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m13010t(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3) {
        return m13009s(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* JADX INFO: renamed from: u */
    public static int m13011u(CharSequence charSequence, char c2, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        Intrinsics2.m13089e(charSequence, "$this$indexOf");
        return (z || !(charSequence instanceof String)) ? m13013w(charSequence, new char[]{c2}, i, z) : ((String) charSequence).indexOf(c2, i);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m13012v(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m13008r(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: w */
    public static final int m13013w(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        Intrinsics2.m13089e(charSequence, "$this$indexOfAny");
        Intrinsics2.m13089e(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(_Arrays.m13034h(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int iM13007q = m13007q(charSequence);
        if (i > iM13007q) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    break;
                }
                if (Char.m12980c(cArr[i2], cCharAt, z)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                return i;
            }
            if (i == iM13007q) {
                return -1;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static int m13014x(CharSequence charSequence, char c2, int i, boolean z, int i2) {
        boolean z2;
        if ((i2 & 2) != 0) {
            i = m13007q(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        Intrinsics2.m13089e(charSequence, "$this$lastIndexOf");
        if (!z) {
            return ((String) charSequence).lastIndexOf(c2, i);
        }
        char[] cArr = {c2};
        Intrinsics2.m13089e(charSequence, "$this$lastIndexOfAny");
        Intrinsics2.m13089e(cArr, "chars");
        if (!z) {
            return ((String) charSequence).lastIndexOf(_Arrays.m13034h(cArr), i);
        }
        int iM13007q = m13007q(charSequence);
        if (i > iM13007q) {
            i = iM13007q;
        }
        while (i >= 0) {
            char cCharAt = charSequence.charAt(i);
            int i3 = 0;
            while (true) {
                if (i3 >= 1) {
                    z2 = false;
                    break;
                }
                if (Char.m12980c(cArr[i3], cCharAt, z)) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (z2) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public static int m13015y(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = m13007q(charSequence);
        }
        int i3 = i;
        boolean z2 = (i2 & 4) != 0 ? false : z;
        Intrinsics2.m13089e(charSequence, "$this$lastIndexOf");
        Intrinsics2.m13089e(str, "string");
        return (z2 || !(charSequence instanceof String)) ? m13009s(charSequence, str, i3, 0, z2, true) : ((String) charSequence).lastIndexOf(str, i3);
    }

    /* JADX INFO: renamed from: z */
    public static Sequence m13016z(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        if (i2 >= 0) {
            return new Strings(charSequence, i, i2, new Strings3(_ArraysJvm.m13027a(strArr), z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }
}
