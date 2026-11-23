package p509g1;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p481d0.Strings5;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p515h.dates;
import p555j.p556a.p557a.p606h.p609c.p611b.C6913b;

/* JADX INFO: renamed from: g1.n, reason: use source file name */
/* JADX INFO: compiled from: Cookie.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Cookie {

    /* JADX INFO: renamed from: f */
    public final String f30606f;

    /* JADX INFO: renamed from: g */
    public final String f30607g;

    /* JADX INFO: renamed from: h */
    public final long f30608h;

    /* JADX INFO: renamed from: i */
    public final String f30609i;

    /* JADX INFO: renamed from: j */
    public final String f30610j;

    /* JADX INFO: renamed from: k */
    public final boolean f30611k;

    /* JADX INFO: renamed from: l */
    public final boolean f30612l;

    /* JADX INFO: renamed from: m */
    public final boolean f30613m;

    /* JADX INFO: renamed from: n */
    public final boolean f30614n;

    /* JADX INFO: renamed from: e */
    public static final a f30605e = new a(null);

    /* JADX INFO: renamed from: a */
    public static final Pattern f30601a = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: b */
    public static final Pattern f30602b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: c */
    public static final Pattern f30603c = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: d */
    public static final Pattern f30604d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: g1.n$a */
    /* JADX INFO: compiled from: Cookie.kt */
    public static final class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final int m13634a(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && '9' >= cCharAt) || (('a' <= cCharAt && 'z' >= cCharAt) || (('A' <= cCharAt && 'Z' >= cCharAt) || cCharAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x00af  */
        /* JADX INFO: renamed from: b */
        public final long m13635b(String str, int i, int i2) {
            int iM13634a = m13634a(str, i, i2, false);
            Matcher matcher = Cookie.f30604d.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int iM13012v = -1;
            int i6 = -1;
            int i7 = -1;
            while (iM13634a < i2) {
                int iM13634a2 = m13634a(str, iM13634a + 1, i2, true);
                matcher.region(iM13634a, iM13634a2);
                if (i4 == -1 && matcher.usePattern(Cookie.f30604d).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics2.m13086b(strGroup, "matcher.group(1)");
                    i4 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics2.m13086b(strGroup2, "matcher.group(2)");
                    i6 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics2.m13086b(strGroup3, "matcher.group(3)");
                    i7 = Integer.parseInt(strGroup3);
                } else if (i5 == -1 && matcher.usePattern(Cookie.f30603c).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics2.m13086b(strGroup4, "matcher.group(1)");
                    i5 = Integer.parseInt(strGroup4);
                } else if (iM13012v == -1) {
                    Pattern pattern = Cookie.f30602b;
                    if (matcher.usePattern(pattern).matches()) {
                        String strGroup5 = matcher.group(1);
                        Intrinsics2.m13086b(strGroup5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        Intrinsics2.m13086b(locale, "Locale.US");
                        String lowerCase = strGroup5.toLowerCase(locale);
                        Intrinsics2.m13086b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String strPattern = pattern.pattern();
                        Intrinsics2.m13086b(strPattern, "MONTH_PATTERN.pattern()");
                        iM13012v = Strings5.m13012v(strPattern, lowerCase, 0, false, 6) / 4;
                    } else if (i3 != -1 && matcher.usePattern(Cookie.f30601a).matches()) {
                        String strGroup6 = matcher.group(1);
                        Intrinsics2.m13086b(strGroup6, "matcher.group(1)");
                        i3 = Integer.parseInt(strGroup6);
                    }
                } else if (i3 != -1) {
                }
                iM13634a = m13634a(str, iM13634a2 + 1, i2, false);
            }
            if (70 <= i3 && 99 >= i3) {
                i3 += 1900;
            }
            if (i3 >= 0 && 69 >= i3) {
                i3 += 2000;
            }
            if (!(i3 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iM13012v != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i5 && 31 >= i5)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i4 >= 0 && 23 >= i4)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i6 >= 0 && 59 >= i6)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i7 >= 0 && 59 >= i7)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util9.f30074e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, iM13012v - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i6);
            gregorianCalendar.set(13, i7);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Cookie(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this.f30606f = str;
        this.f30607g = str2;
        this.f30608h = j2;
        this.f30609i = str3;
        this.f30610j = str4;
        this.f30611k = z;
        this.f30612l = z2;
        this.f30613m = z3;
        this.f30614n = z4;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (Intrinsics2.m13085a(cookie.f30606f, this.f30606f) && Intrinsics2.m13085a(cookie.f30607g, this.f30607g) && cookie.f30608h == this.f30608h && Intrinsics2.m13085a(cookie.f30609i, this.f30609i) && Intrinsics2.m13085a(cookie.f30610j, this.f30610j) && cookie.f30611k == this.f30611k && cookie.f30612l == this.f30612l && cookie.f30613m == this.f30613m && cookie.f30614n == this.f30614n) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return C6443o.m13636a(this.f30614n) + ((C6443o.m13636a(this.f30613m) + ((C6443o.m13636a(this.f30612l) + ((C6443o.m13636a(this.f30611k) + outline.m1569T(this.f30610j, outline.m1569T(this.f30609i, (C6913b.m14115a(this.f30608h) + outline.m1569T(this.f30607g, outline.m1569T(this.f30606f, 527, 31), 31)) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30606f);
        sb.append('=');
        sb.append(this.f30607g);
        if (this.f30613m) {
            if (this.f30608h == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                Date date = new Date(this.f30608h);
                dates.a aVar = dates.f30282a;
                Intrinsics2.m13090f(date, "$this$toHttpDateString");
                String str = dates.f30282a.get().format(date);
                Intrinsics2.m13086b(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.f30614n) {
            sb.append("; domain=");
            sb.append(this.f30609i);
        }
        sb.append("; path=");
        sb.append(this.f30610j);
        if (this.f30611k) {
            sb.append("; secure");
        }
        if (this.f30612l) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        Intrinsics2.m13086b(string, "toString()");
        return string;
    }
}
