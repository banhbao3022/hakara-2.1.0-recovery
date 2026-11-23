package p509g1;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p478a0.Progressions;
import p477d1.p478a0._Ranges;
import p477d1.p481d0.Regex2;
import p477d1.p481d0.Strings5;
import p477d1.p481d0.StringsJVM;
import p477d1.p483s.Iterables2;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p524h1.Buffer3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: g1.w, reason: use source file name */
/* JADX INFO: compiled from: HttpUrl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HttpUrl {

    /* JADX INFO: renamed from: c */
    public final boolean f30643c;

    /* JADX INFO: renamed from: d */
    public final String f30644d;

    /* JADX INFO: renamed from: e */
    public final String f30645e;

    /* JADX INFO: renamed from: f */
    public final String f30646f;

    /* JADX INFO: renamed from: g */
    public final String f30647g;

    /* JADX INFO: renamed from: h */
    public final int f30648h;

    /* JADX INFO: renamed from: i */
    public final List<String> f30649i;

    /* JADX INFO: renamed from: j */
    public final List<String> f30650j;

    /* JADX INFO: renamed from: k */
    public final String f30651k;

    /* JADX INFO: renamed from: l */
    public final String f30652l;

    /* JADX INFO: renamed from: b */
    public static final b f30642b = new b(null);

    /* JADX INFO: renamed from: a */
    public static final char[] f30641a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: g1.w$a */
    /* JADX INFO: compiled from: HttpUrl.kt */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C8548a f30653a = new C8548a(null);

        /* JADX INFO: renamed from: b */
        public String f30654b;

        /* JADX INFO: renamed from: e */
        public String f30657e;

        /* JADX INFO: renamed from: g */
        public final List<String> f30659g;

        /* JADX INFO: renamed from: h */
        public List<String> f30660h;

        /* JADX INFO: renamed from: i */
        public String f30661i;

        /* JADX INFO: renamed from: c */
        public String f30655c = "";

        /* JADX INFO: renamed from: d */
        public String f30656d = "";

        /* JADX INFO: renamed from: f */
        public int f30658f = -1;

        /* JADX INFO: renamed from: g1.w$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: HttpUrl.kt */
        public static final class C8548a {
            public C8548a() {
            }

            public C8548a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f30659g = arrayList;
            arrayList.add("");
        }

        /* JADX INFO: renamed from: a */
        public final a m13673a(String str, String str2) {
            Intrinsics2.m13090f(str, "encodedName");
            if (this.f30660h == null) {
                this.f30660h = new ArrayList();
            }
            List<String> list = this.f30660h;
            if (list == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            b bVar = HttpUrl.f30642b;
            list.add(b.m13678a(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211));
            List<String> list2 = this.f30660h;
            if (list2 != null) {
                list2.add(str2 != null ? b.m13678a(bVar, str2, 0, 0, " \"'<>#&=", true, false, true, false, null, 211) : null);
                return this;
            }
            Intrinsics2.m13095k();
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public final HttpUrl m13674b() {
            ArrayList arrayList;
            String str = this.f30654b;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = HttpUrl.f30642b;
            String strM13679e = b.m13679e(bVar, this.f30655c, 0, 0, false, 7);
            String strM13679e2 = b.m13679e(bVar, this.f30656d, 0, 0, false, 7);
            String str2 = this.f30657e;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iM13675c = m13675c();
            List<String> list = this.f30659g;
            ArrayList arrayList2 = new ArrayList(Iterables2.m13042g(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.m13679e(HttpUrl.f30642b, (String) it.next(), 0, 0, false, 7));
            }
            List<String> list2 = this.f30660h;
            if (list2 != null) {
                arrayList = new ArrayList(Iterables2.m13042g(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 != null ? b.m13679e(HttpUrl.f30642b, str3, 0, 0, true, 3) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.f30661i;
            return new HttpUrl(str, strM13679e, strM13679e2, str2, iM13675c, arrayList2, arrayList, str4 != null ? b.m13679e(HttpUrl.f30642b, str4, 0, 0, false, 7) : null, toString());
        }

        /* JADX INFO: renamed from: c */
        public final int m13675c() {
            int i = this.f30658f;
            if (i != -1) {
                return i;
            }
            b bVar = HttpUrl.f30642b;
            String str = this.f30654b;
            if (str != null) {
                return bVar.m13680b(str);
            }
            Intrinsics2.m13095k();
            throw null;
        }

        /* JADX INFO: renamed from: d */
        public final a m13676d(String str) {
            List<String> listM13683f;
            if (str != null) {
                b bVar = HttpUrl.f30642b;
                listM13683f = bVar.m13683f(b.m13678a(bVar, str, 0, 0, " \"'<>#", true, false, true, false, null, 211));
            } else {
                listM13683f = null;
            }
            this.f30660h = listM13683f;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0076  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
        /* JADX INFO: renamed from: e */
        public final a m13677e(HttpUrl httpUrl, String str) {
            int i;
            char c2;
            char c3;
            int iM13367g;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            boolean z;
            a aVar;
            a aVar2;
            int i9;
            int i10;
            String str2;
            ?? r3;
            String str3;
            int i11;
            a aVar3;
            String str4;
            char cCharAt;
            Intrinsics2.m13090f(str, "input");
            byte[] bArr = Util9.f30070a;
            int iM13374n = Util9.m13374n(str, 0, str.length());
            int iM13375o = Util9.m13375o(str, iM13374n, str.length());
            Objects.requireNonNull(f30653a);
            char c4 = ':';
            char c5 = 65535;
            if (iM13375o - iM13374n >= 2) {
                char cCharAt2 = str.charAt(iM13374n);
                char c6 = 'A';
                char c7 = 'a';
                if ((cCharAt2 >= 'a' && cCharAt2 <= 'z') || (cCharAt2 >= 'A' && cCharAt2 <= 'Z')) {
                    i = iM13374n;
                    while (true) {
                        i++;
                        if (i < iM13375o) {
                            char cCharAt3 = str.charAt(i);
                            if ((c7 > cCharAt3 || 'z' < cCharAt3) && ((c6 > cCharAt3 || 'Z' < cCharAt3) && (('0' > cCharAt3 || '9' < cCharAt3) && cCharAt3 != '+' && cCharAt3 != '-' && cCharAt3 != '.'))) {
                                if (cCharAt3 == ':') {
                                    break;
                                }
                                break;
                            }
                            c6 = 'A';
                            c7 = 'a';
                        }
                        i = -1;
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
            if (i != -1) {
                if (StringsJVM.m12994k(str, "https:", iM13374n, true)) {
                    this.f30654b = "https";
                    iM13374n += 6;
                } else {
                    if (!StringsJVM.m12994k(str, "http:", iM13374n, true)) {
                        StringBuilder sbM1556G = outline.m1556G("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = str.substring(0, i);
                        Intrinsics2.m13086b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sbM1556G.append(strSubstring);
                        sbM1556G.append("'");
                        throw new IllegalArgumentException(sbM1556G.toString());
                    }
                    this.f30654b = "http";
                    iM13374n += 5;
                }
            } else {
                if (httpUrl == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f30654b = httpUrl.f30644d;
            }
            Objects.requireNonNull(f30653a);
            int i12 = 0;
            int i13 = iM13374n;
            while (true) {
                c2 = '\\';
                c3 = '/';
                if (i13 >= iM13375o || !((cCharAt = str.charAt(i13)) == '\\' || cCharAt == '/')) {
                    break;
                }
                i12++;
                i13++;
            }
            char c8 = '?';
            if (i12 >= 2 || httpUrl == null || (true ^ Intrinsics2.m13085a(httpUrl.f30644d, this.f30654b))) {
                int i14 = iM13374n + i12;
                char c9 = '#';
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    iM13367g = Util9.m13367g(str, "@/\\?#", i14, iM13375o);
                    char cCharAt4 = iM13367g != iM13375o ? str.charAt(iM13367g) : (char) 65535;
                    if (cCharAt4 == c5 || cCharAt4 == c9 || cCharAt4 == c3 || cCharAt4 == c2 || cCharAt4 == c8) {
                        break;
                    }
                    if (cCharAt4 != '@') {
                        iM13375o = iM13375o;
                    } else {
                        if (z2) {
                            boolean z4 = z2;
                            i8 = iM13367g;
                            this.f30656d += "%40" + b.m13678a(HttpUrl.f30642b, str, i14, i8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                            z = z4;
                        } else {
                            int iM13366f = Util9.m13366f(str, c4, i14, iM13367g);
                            b bVar = HttpUrl.f30642b;
                            boolean z5 = z2;
                            i8 = iM13367g;
                            String strM13678a = b.m13678a(bVar, str, i14, iM13366f, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                            if (z3) {
                                strM13678a = outline.m1552C(new StringBuilder(), this.f30655c, "%40", strM13678a);
                            }
                            this.f30655c = strM13678a;
                            if (iM13366f != i8) {
                                this.f30656d = b.m13678a(bVar, str, iM13366f + 1, i8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                                z = true;
                            } else {
                                z = z5;
                            }
                            z3 = true;
                        }
                        i14 = i8 + 1;
                        z2 = z;
                    }
                    c9 = '#';
                    c8 = '?';
                    c3 = '/';
                    c2 = '\\';
                    c5 = 65535;
                    c4 = ':';
                    iM13375o = iM13375o;
                }
                i2 = iM13375o;
                Objects.requireNonNull(f30653a);
                int i15 = i14;
                while (true) {
                    if (i15 < iM13367g) {
                        char cCharAt5 = str.charAt(i15);
                        if (cCharAt5 == ':') {
                            i3 = i15;
                            break;
                        }
                        if (cCharAt5 == '[') {
                            do {
                                i15++;
                                if (i15 >= iM13367g) {
                                    break;
                                }
                            } while (str.charAt(i15) != ']');
                        }
                        i15++;
                    } else {
                        i3 = iM13367g;
                        break;
                    }
                }
                int i16 = i3 + 1;
                char c10 = '\"';
                if (i16 < iM13367g) {
                    b bVar2 = HttpUrl.f30642b;
                    this.f30657e = SkuDao.a.m14084e0(b.m13679e(bVar2, str, i14, i3, false, 4));
                    Objects.requireNonNull(f30653a);
                    i4 = i14;
                    try {
                        i7 = Integer.parseInt(b.m13678a(bVar2, str, i16, iM13367g, "", false, false, false, false, null, 248));
                        if (1 <= i7 && 65535 >= i7) {
                            i6 = 1;
                        } else {
                            i6 = 1;
                            i7 = -1;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    this.f30658f = i7;
                    if (!(i7 != -1)) {
                        StringBuilder sbM1556G2 = outline.m1556G("Invalid URL port: \"");
                        String strSubstring2 = str.substring(i16, iM13367g);
                        Intrinsics2.m13086b(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sbM1556G2.append(strSubstring2);
                        sbM1556G2.append('\"');
                        throw new IllegalArgumentException(sbM1556G2.toString().toString());
                    }
                    c10 = '\"';
                    i5 = i6;
                } else {
                    i4 = i14;
                    b bVar3 = HttpUrl.f30642b;
                    this.f30657e = SkuDao.a.m14084e0(b.m13679e(bVar3, str, i4, i3, false, 4));
                    String str5 = this.f30654b;
                    if (str5 == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    this.f30658f = bVar3.m13680b(str5);
                    i5 = 1;
                }
                if (!(this.f30657e != null)) {
                    StringBuilder sbM1556G3 = outline.m1556G("Invalid URL host: \"");
                    String strSubstring3 = str.substring(i4, i3);
                    Intrinsics2.m13086b(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sbM1556G3.append(strSubstring3);
                    sbM1556G3.append(c10);
                    throw new IllegalArgumentException(sbM1556G3.toString().toString());
                }
                iM13374n = iM13367g;
            } else {
                this.f30655c = httpUrl.m13668e();
                this.f30656d = httpUrl.m13664a();
                this.f30657e = httpUrl.f30647g;
                this.f30658f = httpUrl.f30648h;
                this.f30659g.clear();
                this.f30659g.addAll(httpUrl.m13666c());
                if (iM13374n == iM13375o || str.charAt(iM13374n) == '#') {
                    m13676d(httpUrl.m13667d());
                }
                i5 = 1;
                i2 = iM13375o;
            }
            int i17 = i2;
            int iM13367g2 = Util9.m13367g(str, "?#", iM13374n, i17);
            if (iM13374n == iM13367g2) {
                aVar3 = this;
                str4 = str;
            } else {
                char cCharAt6 = str.charAt(iM13374n);
                if (cCharAt6 == '/' || cCharAt6 == '\\') {
                    this.f30659g.clear();
                    this.f30659g.add("");
                    aVar = this;
                    aVar2 = aVar;
                    i9 = iM13367g2;
                    int i18 = iM13374n;
                    i10 = i9;
                    str2 = str;
                    r3 = i5;
                    str3 = str2;
                    i11 = i18 + (r3 == true ? 1 : 0);
                } else {
                    List<String> list = this.f30659g;
                    list.set(list.size() - i5, "");
                    aVar = this;
                    aVar2 = aVar;
                    i9 = iM13367g2;
                    i11 = iM13374n;
                    i10 = i9;
                    str2 = str;
                    r3 = i5;
                    str3 = str2;
                }
                while (i11 < i10) {
                    int iM13367g3 = Util9.m13367g(str3, "/\\", i11, i10);
                    boolean z6 = iM13367g3 < i10;
                    String strM13678a2 = b.m13678a(HttpUrl.f30642b, str3, i11, iM13367g3, " \"<>^`{}|/\\?#", true, false, false, false, null, 240);
                    if (!(Intrinsics2.m13085a(strM13678a2, ".") || StringsJVM.m12989f(strM13678a2, "%2e", r3))) {
                        if (Intrinsics2.m13085a(strM13678a2, "..") || StringsJVM.m12989f(strM13678a2, "%2e.", r3) || StringsJVM.m12989f(strM13678a2, ".%2e", r3) || StringsJVM.m12989f(strM13678a2, "%2e%2e", r3)) {
                            List<String> list2 = aVar2.f30659g;
                            if (!(list2.remove(list2.size() - r3).length() == 0) || ((aVar2.f30659g.isEmpty() ? 1 : 0) ^ r3) == 0) {
                                aVar2.f30659g.add(r6);
                            } else {
                                List<String> list3 = aVar2.f30659g;
                                list3.set(list3.size() - r3, "");
                            }
                        } else {
                            List<String> list4 = aVar2.f30659g;
                            if (list4.get(list4.size() - r3).length() == 0) {
                                List<String> list5 = aVar2.f30659g;
                                list5.set(list5.size() - r3, strM13678a2);
                            } else {
                                aVar2.f30659g.add(strM13678a2);
                            }
                            if (z6) {
                                aVar2.f30659g.add(r6);
                            }
                        }
                    }
                    i11 = iM13367g3;
                    if (z6) {
                        i11 += r3;
                    }
                }
                iM13367g2 = i9;
                aVar3 = aVar;
                str4 = str2;
            }
            if (iM13367g2 < i17 && str.charAt(iM13367g2) == '?') {
                int iM13366f2 = Util9.m13366f(str, '#', iM13367g2, i17);
                b bVar4 = HttpUrl.f30642b;
                aVar3.f30660h = bVar4.m13683f(b.m13678a(bVar4, str4, iM13367g2 + 1, iM13366f2, " \"'<>#", true, false, true, false, null, 208));
                iM13367g2 = iM13366f2;
            }
            if (iM13367g2 < i17 && str.charAt(iM13367g2) == '#') {
                aVar3.f30661i = b.m13678a(HttpUrl.f30642b, str4, iM13367g2 + 1, i17, "", true, false, false, true, null, 176);
            }
            return aVar3;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0035  */
        /* JADX WARN: Code duplicated, block: B:20:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x0046  */
        /* JADX WARN: Code duplicated, block: B:46:0x009b  */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f30654b;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.f30655c.length() > 0) {
                sb.append(this.f30655c);
                if (this.f30656d.length() > 0) {
                    sb.append(':');
                    sb.append(this.f30656d);
                }
                sb.append('@');
            } else if (this.f30656d.length() > 0) {
                sb.append(this.f30655c);
                if (this.f30656d.length() > 0) {
                    sb.append(':');
                    sb.append(this.f30656d);
                }
                sb.append('@');
            }
            String str2 = this.f30657e;
            if (str2 != null) {
                if (str2 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                if (Strings5.m13005o(str2, ':', false, 2)) {
                    sb.append('[');
                    sb.append(this.f30657e);
                    sb.append(']');
                } else {
                    sb.append(this.f30657e);
                }
            }
            if (this.f30658f != -1 || this.f30654b != null) {
                int iM13675c = m13675c();
                String str3 = this.f30654b;
                if (str3 != null) {
                    b bVar = HttpUrl.f30642b;
                    if (str3 == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    if (iM13675c != bVar.m13680b(str3)) {
                        sb.append(':');
                        sb.append(iM13675c);
                    }
                } else {
                    sb.append(':');
                    sb.append(iM13675c);
                }
            }
            b bVar2 = HttpUrl.f30642b;
            List<String> list = this.f30659g;
            Objects.requireNonNull(bVar2);
            Intrinsics2.m13090f(list, "$this$toPathString");
            Intrinsics2.m13090f(sb, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
            if (this.f30660h != null) {
                sb.append('?');
                b bVar3 = HttpUrl.f30642b;
                List<String> list2 = this.f30660h;
                if (list2 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                bVar3.m13684g(list2, sb);
            }
            if (this.f30661i != null) {
                sb.append('#');
                sb.append(this.f30661i);
            }
            String string = sb.toString();
            Intrinsics2.m13086b(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    /* JADX INFO: renamed from: g1.w$b */
    /* JADX INFO: compiled from: HttpUrl.kt */
    public static final class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public static String m13678a(b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3) {
            int i4 = (i3 & 1) != 0 ? 0 : i;
            int length = (i3 & 2) != 0 ? str.length() : i2;
            boolean z5 = (i3 & 8) != 0 ? false : z;
            boolean z6 = (i3 & 16) != 0 ? false : z2;
            boolean z7 = (i3 & 32) != 0 ? false : z3;
            boolean z8 = (i3 & 64) != 0 ? false : z4;
            int i5 = 128;
            Charset charset2 = (i3 & 128) != 0 ? null : charset;
            Objects.requireNonNull(bVar);
            Intrinsics2.m13090f(str, "$this$canonicalize");
            Intrinsics2.m13090f(str2, "encodeSet");
            int iCharCount = i4;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                int i6 = 32;
                int i7 = 2;
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= i5 && !z8) || Strings5.m13005o(str2, (char) iCodePointAt, false, 2) || ((iCodePointAt == 37 && (!z5 || (z6 && !bVar.m13682d(str, iCharCount, length)))) || (iCodePointAt == 43 && z7)))) {
                    Buffer3 buffer3 = new Buffer3();
                    buffer3.m13730Q0(str, i4, iCharCount);
                    Buffer3 buffer4 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 == 43 && z7) {
                                buffer3.m13729P0(z5 ? "+" : "%2B");
                            } else {
                                if (iCodePointAt2 >= i6 && iCodePointAt2 != 127 && (iCodePointAt2 < 128 || z8)) {
                                    if (!Strings5.m13005o(str2, (char) iCodePointAt2, false, i7) && (iCodePointAt2 != 37 || (z5 && (!z6 || bVar.m13682d(str, iCharCount, length))))) {
                                        buffer3.m13732R0(iCodePointAt2);
                                    }
                                }
                                if (buffer4 == null) {
                                    buffer4 = new Buffer3();
                                }
                                if (charset2 == null || Intrinsics2.m13085a(charset2, StandardCharsets.UTF_8)) {
                                    buffer4.m13732R0(iCodePointAt2);
                                } else {
                                    buffer4.m13727O0(str, iCharCount, Character.charCount(iCodePointAt2) + iCharCount, charset2);
                                }
                                while (!buffer4.mo13759y()) {
                                    int i8 = buffer4.readByte() & 255;
                                    buffer3.m13721J0(37);
                                    char[] cArr = HttpUrl.f30641a;
                                    buffer3.m13721J0(cArr[(i8 >> 4) & 15]);
                                    buffer3.m13721J0(cArr[i8 & 15]);
                                }
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i7 = 2;
                        i6 = 32;
                    }
                    return buffer3.m13755u0();
                }
                iCharCount += Character.charCount(iCodePointAt);
                i5 = 128;
            }
            String strSubstring = str.substring(i4, length);
            Intrinsics2.m13086b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        /* JADX INFO: renamed from: e */
        public static String m13679e(b bVar, String str, int i, int i2, boolean z, int i3) {
            int i4;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            Objects.requireNonNull(bVar);
            Intrinsics2.m13090f(str, "$this$percentDecode");
            int iCharCount = i;
            while (iCharCount < i2) {
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    Buffer3 buffer3 = new Buffer3();
                    buffer3.m13730Q0(str, i, iCharCount);
                    while (iCharCount < i2) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                            int iM13377q = Util9.m13377q(str.charAt(iCharCount + 1));
                            int iM13377q2 = Util9.m13377q(str.charAt(i4));
                            if (iM13377q == -1 || iM13377q2 == -1) {
                                buffer3.m13732R0(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            } else {
                                buffer3.m13721J0((iM13377q << 4) + iM13377q2);
                                iCharCount = Character.charCount(iCodePointAt) + i4;
                            }
                        } else if (iCodePointAt == 43 && z) {
                            buffer3.m13721J0(32);
                            iCharCount++;
                        } else {
                            buffer3.m13732R0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return buffer3.m13755u0();
                }
                iCharCount++;
            }
            String strSubstring = str.substring(i, i2);
            Intrinsics2.m13086b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        /* JADX INFO: renamed from: b */
        public final int m13680b(String str) {
            Intrinsics2.m13090f(str, "scheme");
            int iHashCode = str.hashCode();
            if (iHashCode != 3213448) {
                if (iHashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        /* JADX INFO: renamed from: c */
        public final HttpUrl m13681c(String str) {
            Intrinsics2.m13090f(str, "$this$toHttpUrl");
            a aVar = new a();
            aVar.m13677e(null, str);
            return aVar.m13674b();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m13682d(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && Util9.m13377q(str.charAt(i + 1)) != -1 && Util9.m13377q(str.charAt(i3)) != -1;
        }

        /* JADX INFO: renamed from: f */
        public final List<String> m13683f(String str) {
            Intrinsics2.m13090f(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iM13011u = Strings5.m13011u(str, '&', i, false, 4);
                if (iM13011u == -1) {
                    iM13011u = str.length();
                }
                int iM13011u2 = Strings5.m13011u(str, '=', i, false, 4);
                if (iM13011u2 == -1 || iM13011u2 > iM13011u) {
                    String strSubstring = str.substring(i, iM13011u);
                    Intrinsics2.m13086b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iM13011u2);
                    Intrinsics2.m13086b(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iM13011u2 + 1, iM13011u);
                    Intrinsics2.m13086b(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i = iM13011u + 1;
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: g */
        public final void m13684g(List<String> list, StringBuilder sb) {
            Intrinsics2.m13090f(list, "$this$toQueryString");
            Intrinsics2.m13090f(sb, "out");
            Progressions progressionsM12969d = _Ranges.m12969d(_Ranges.m12970e(0, list.size()), 2);
            int i = progressionsM12969d.f29431g;
            int i2 = progressionsM12969d.f29432h;
            int i3 = progressionsM12969d.f29433i;
            if (i3 >= 0) {
                if (i > i2) {
                    return;
                }
            } else if (i < i2) {
                return;
            }
            while (true) {
                String str = list.get(i);
                String str2 = list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i == i2) {
                    return;
                } else {
                    i += i3;
                }
            }
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        Intrinsics2.m13090f(str, "scheme");
        Intrinsics2.m13090f(str2, "username");
        Intrinsics2.m13090f(str3, "password");
        Intrinsics2.m13090f(str4, "host");
        Intrinsics2.m13090f(list, "pathSegments");
        Intrinsics2.m13090f(str6, "url");
        this.f30644d = str;
        this.f30645e = str2;
        this.f30646f = str3;
        this.f30647g = str4;
        this.f30648h = i;
        this.f30649i = list;
        this.f30650j = list2;
        this.f30651k = str5;
        this.f30652l = str6;
        this.f30643c = Intrinsics2.m13085a(str, "https");
    }

    /* JADX INFO: renamed from: a */
    public final String m13664a() {
        if (this.f30646f.length() == 0) {
            return "";
        }
        int iM13011u = Strings5.m13011u(this.f30652l, ':', this.f30644d.length() + 3, false, 4) + 1;
        int iM13011u2 = Strings5.m13011u(this.f30652l, '@', 0, false, 6);
        String str = this.f30652l;
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iM13011u, iM13011u2);
        Intrinsics2.m13086b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: b */
    public final String m13665b() {
        int iM13011u = Strings5.m13011u(this.f30652l, '/', this.f30644d.length() + 3, false, 4);
        String str = this.f30652l;
        int iM13367g = Util9.m13367g(str, "?#", iM13011u, str.length());
        String str2 = this.f30652l;
        if (str2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iM13011u, iM13367g);
        Intrinsics2.m13086b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m13666c() {
        int iM13011u = Strings5.m13011u(this.f30652l, '/', this.f30644d.length() + 3, false, 4);
        String str = this.f30652l;
        int iM13367g = Util9.m13367g(str, "?#", iM13011u, str.length());
        ArrayList arrayList = new ArrayList();
        while (iM13011u < iM13367g) {
            int i = iM13011u + 1;
            int iM13366f = Util9.m13366f(this.f30652l, '/', i, iM13367g);
            String str2 = this.f30652l;
            if (str2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = str2.substring(i, iM13366f);
            Intrinsics2.m13086b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iM13011u = iM13366f;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final String m13667d() {
        if (this.f30650j == null) {
            return null;
        }
        int iM13011u = Strings5.m13011u(this.f30652l, '?', 0, false, 6) + 1;
        String str = this.f30652l;
        int iM13366f = Util9.m13366f(str, '#', iM13011u, str.length());
        String str2 = this.f30652l;
        if (str2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iM13011u, iM13366f);
        Intrinsics2.m13086b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: e */
    public final String m13668e() {
        if (this.f30645e.length() == 0) {
            return "";
        }
        int length = this.f30644d.length() + 3;
        String str = this.f30652l;
        int iM13367g = Util9.m13367g(str, ":@", length, str.length());
        String str2 = this.f30652l;
        if (str2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(length, iM13367g);
        Intrinsics2.m13086b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && Intrinsics2.m13085a(((HttpUrl) obj).f30652l, this.f30652l);
    }

    /* JADX INFO: renamed from: f */
    public final a m13669f() {
        String strSubstring;
        a aVar = new a();
        aVar.f30654b = this.f30644d;
        String strM13668e = m13668e();
        Intrinsics2.m13090f(strM13668e, "<set-?>");
        aVar.f30655c = strM13668e;
        String strM13664a = m13664a();
        Intrinsics2.m13090f(strM13664a, "<set-?>");
        aVar.f30656d = strM13664a;
        aVar.f30657e = this.f30647g;
        aVar.f30658f = this.f30648h != f30642b.m13680b(this.f30644d) ? this.f30648h : -1;
        aVar.f30659g.clear();
        aVar.f30659g.addAll(m13666c());
        aVar.m13676d(m13667d());
        if (this.f30651k == null) {
            strSubstring = null;
        } else {
            int iM13011u = Strings5.m13011u(this.f30652l, '#', 0, false, 6) + 1;
            String str = this.f30652l;
            if (str == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            strSubstring = str.substring(iM13011u);
            Intrinsics2.m13086b(strSubstring, "(this as java.lang.String).substring(startIndex)");
        }
        aVar.f30661i = strSubstring;
        return aVar;
    }

    /* JADX INFO: renamed from: g */
    public final a m13670g(String str) {
        Intrinsics2.m13090f(str, "link");
        try {
            a aVar = new a();
            aVar.m13677e(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final String m13671h() {
        a aVarM13670g = m13670g("/...");
        if (aVarM13670g == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        Objects.requireNonNull(aVarM13670g);
        Intrinsics2.m13090f("", "username");
        b bVar = f30642b;
        aVarM13670g.f30655c = b.m13678a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        Intrinsics2.m13090f("", "password");
        aVarM13670g.f30656d = b.m13678a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        return aVarM13670g.m13674b().f30652l;
    }

    public int hashCode() {
        return this.f30652l.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final URI m13672i() {
        a aVarM13669f = m13669f();
        String str = aVarM13669f.f30657e;
        aVarM13669f.f30657e = str != null ? new Regex2("[\"<>^`{|}]").m12983b(str, "") : null;
        int size = aVarM13669f.f30659g.size();
        for (int i = 0; i < size; i++) {
            List<String> list = aVarM13669f.f30659g;
            list.set(i, b.m13678a(f30642b, list.get(i), 0, 0, "[]", true, true, false, false, null, 227));
        }
        List<String> list2 = aVarM13669f.f30660h;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = list2.get(i2);
                list2.set(i2, str2 != null ? b.m13678a(f30642b, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195) : null);
            }
        }
        String str3 = aVarM13669f.f30661i;
        aVarM13669f.f30661i = str3 != null ? b.m13678a(f30642b, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163) : null;
        String string = aVarM13669f.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex2("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m12983b(string, ""));
                Intrinsics2.m13086b(uriCreate, "URI.create(stripped)");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public String toString() {
        return this.f30652l;
    }
}
