package p477d1.p481d0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import p477d1.p478a0.ProgressionIterators;
import p477d1.p478a0.Ranges;
import p477d1.p483s.Iterators5;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.d0.q, reason: use source file name */
/* JADX INFO: compiled from: StringsJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public class StringsJVM extends StringNumberConversions {
    /* JADX INFO: renamed from: d */
    public static final String m12987d(String str, Locale locale) {
        Intrinsics2.m13089e(str, "$this$capitalize");
        Intrinsics2.m13089e(locale, "locale");
        if (!(str.length() > 0)) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            Intrinsics2.m13088d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String upperCase = strSubstring.toUpperCase(locale);
            Intrinsics2.m13088d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            sb.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        Intrinsics2.m13088d(strSubstring2, "(this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring2);
        String string = sb.toString();
        Intrinsics2.m13088d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m12988e(String str, String str2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics2.m13089e(str, "$this$endsWith");
        Intrinsics2.m13089e(str2, "suffix");
        return !z ? str.endsWith(str2) : m12991h(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m12989f(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        return !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m12990g(CharSequence charSequence) {
        boolean z;
        Intrinsics2.m13089e(charSequence, "$this$isBlank");
        if (charSequence.length() == 0) {
            return true;
        }
        Intrinsics2.m13089e(charSequence, "$this$indices");
        Iterable ranges = new Ranges(0, charSequence.length() - 1);
        if ((ranges instanceof Collection) && ((Collection) ranges).isEmpty()) {
            z = true;
        } else {
            Iterator<Integer> it = ranges.iterator();
            while (((ProgressionIterators) it).f29435g) {
                if (!CharJVM.m12979b(charSequence.charAt(((Iterators5) it).mo12965a()))) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m12991h(String str, int i, String str2, int i2, int i3, boolean z) {
        Intrinsics2.m13089e(str, "$this$regionMatches");
        Intrinsics2.m13089e(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* JADX INFO: renamed from: j */
    public static String m12993j(String str, String str2, String str3, boolean z, int i) {
        int i2 = 0;
        if ((i & 4) != 0) {
            z = false;
        }
        Intrinsics2.m13089e(str, "$this$replace");
        Intrinsics2.m13089e(str2, "oldValue");
        Intrinsics2.m13089e(str3, "newValue");
        int iM13008r = Strings5.m13008r(str, str2, 0, z);
        if (iM13008r < 0) {
            return str;
        }
        int length = str2.length();
        int i3 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i2, iM13008r);
            sb.append(str3);
            i2 = iM13008r + length;
            if (iM13008r >= str.length()) {
                break;
            }
            iM13008r = Strings5.m13008r(str, str2, iM13008r + i3, z);
        } while (iM13008r > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        Intrinsics2.m13088d(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m12994k(String str, String str2, int i, boolean z) {
        Intrinsics2.m13089e(str, "$this$startsWith");
        Intrinsics2.m13089e(str2, "prefix");
        return !z ? str.startsWith(str2, i) : m12991h(str, i, str2, 0, str2.length(), z);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m12995l(String str, String str2, boolean z) {
        Intrinsics2.m13089e(str, "$this$startsWith");
        Intrinsics2.m13089e(str2, "prefix");
        return !z ? str.startsWith(str2) : m12991h(str, 0, str2, 0, str2.length(), z);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ boolean m12996m(String str, String str2, int i, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m12994k(str, str2, i, z);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m12997n(String str, String str2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m12995l(str, str2, z);
    }
}
