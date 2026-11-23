package p509g1;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p478a0.Progressions;
import p477d1.p478a0.Ranges;
import p477d1.p478a0._Ranges;
import p477d1.p481d0.StringsJVM;
import p477d1.p483s._Arrays;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.y, reason: use source file name */
/* JADX INFO: compiled from: MediaType.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MediaType2 {

    /* JADX INFO: renamed from: d */
    public final String f30665d;

    /* JADX INFO: renamed from: e */
    public final String f30666e;

    /* JADX INFO: renamed from: f */
    public final String[] f30667f;

    /* JADX INFO: renamed from: c */
    public static final a f30664c = new a(null);

    /* JADX INFO: renamed from: a */
    public static final Pattern f30662a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: b */
    public static final Pattern f30663b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: g1.y$a */
    /* JADX INFO: compiled from: MediaType.kt */
    public static final class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final MediaType2 m13687a(String str) {
            Intrinsics2.m13090f(str, "$this$toMediaType");
            Matcher matcher = MediaType2.f30662a.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            Intrinsics2.m13086b(strGroup, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            Intrinsics2.m13086b(locale, "Locale.US");
            String lowerCase = strGroup.toLowerCase(locale);
            Intrinsics2.m13086b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            Intrinsics2.m13086b(strGroup2, "typeSubtype.group(2)");
            Intrinsics2.m13086b(locale, "Locale.US");
            String lowerCase2 = strGroup2.toLowerCase(locale);
            Intrinsics2.m13086b(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType2.f30663b.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sbM1556G = outline.m1556G("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    Intrinsics2.m13086b(strSubstring, "(this as java.lang.String).substring(startIndex)");
                    sbM1556G.append(strSubstring);
                    sbM1556G.append("\" for: \"");
                    sbM1556G.append(str);
                    sbM1556G.append('\"');
                    throw new IllegalArgumentException(sbM1556G.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (StringsJVM.m12997n(strGroup4, "'", false, 2) && StringsJVM.m12988e(strGroup4, "'", false, 2) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        Intrinsics2.m13086b(strGroup4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new MediaType2(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        /* JADX INFO: renamed from: b */
        public final MediaType2 m13688b(String str) {
            Intrinsics2.m13090f(str, "$this$toMediaTypeOrNull");
            try {
                return m13687a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public MediaType2(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f30665d = str;
        this.f30666e = str2;
        this.f30667f = strArr;
    }

    /* JADX INFO: renamed from: b */
    public static final MediaType2 m13685b(String str) {
        return f30664c.m13687a(str);
    }

    /* JADX INFO: renamed from: a */
    public final Charset m13686a(Charset charset) {
        String str;
        Intrinsics2.m13090f("charset", "name");
        String[] strArr = this.f30667f;
        Intrinsics2.m13089e(strArr, "$this$indices");
        Progressions progressionsM12969d = _Ranges.m12969d(new Ranges(0, _Arrays.m13032f(strArr)), 2);
        int i = progressionsM12969d.f29431g;
        int i2 = progressionsM12969d.f29432h;
        int i3 = progressionsM12969d.f29433i;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (true) {
                if (!StringsJVM.m12989f(this.f30667f[i], "charset", true)) {
                    if (i == i2) {
                        str = null;
                        break;
                    }
                    i += i3;
                } else {
                    str = this.f30667f[i + 1];
                    break;
                }
            }
        } else {
            str = null;
            break;
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType2) && Intrinsics2.m13085a(((MediaType2) obj).f30665d, this.f30665d);
    }

    public int hashCode() {
        return this.f30665d.hashCode();
    }

    public String toString() {
        return this.f30665d;
    }
}
